package com.service.mi.common.apdu;

import android.text.TextUtils;
import com.tsmclient.smartcard.terminal.external.IChannel;
import defpackage.al5;
import defpackage.fpe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class BaseApduManager {
    static final String RESULT_ERROR = "0002";
    static final String RESULT_FAILURE = "0001";
    static final String RESULT_SUCCESS = "0000";
    public static Object seLock = new Object();
    private String cplc;
    List<Capdu> mCapduList;
    private IChannel mChannel;
    Capdu mCurrentExecuteApduBean;
    int mCurrentExecuteIndex = 0;
    List<Rapdu> mRapduList;
    private String mTag;
    private String seid;

    public BaseApduManager(String str, IChannel iChannel) {
        this.mTag = str;
        this.mChannel = iChannel;
    }

    private void clearData() {
        this.mCurrentExecuteApduBean = null;
        this.mCurrentExecuteIndex = 0;
    }

    private ApduResp startProcessApduCommand(List<Capdu> list) {
        ApduResp apduResp;
        synchronized (seLock) {
            try {
                try {
                    open();
                    apduResp = executeApdus(list);
                } catch (Throwable th) {
                    close();
                    throw th;
                }
            } catch (IOException | InterruptedException e) {
                fpe.g("channel open fails: ", e.getMessage());
                apduResp = new ApduResp(RESULT_ERROR, "channel open fails");
            }
            close();
        }
        return apduResp;
    }

    public boolean activateApplet(String str, String str2) {
        return startProcessApduCommand(CommonApdus.getActivateCommonds(str)).isExecuteSuccess();
    }

    public void clearCplc() {
        fpe.g("BaseApduManager", "clearCplc:" + this.cplc + " seid:" + this.seid);
        this.cplc = null;
        this.seid = null;
    }

    public void close() {
        try {
            this.mChannel.close();
        } catch (IOException | InterruptedException e) {
            fpe.g("Close Exception:", e.getMessage());
        }
    }

    public void createRapduBean(String str, String str2, String str3) {
        this.mRapduList.add(new Rapdu(str, str2, str3));
    }

    public boolean deactivateApplet(String str, String str2) {
        return startProcessApduCommand(CommonApdus.getDeactivateCommonds(str)).isExecuteSuccess();
    }

    public ApduResp execute() {
        String strSubstring;
        try {
            if (this.mChannel == null) {
                return new ApduResp(RESULT_ERROR, "IChannel must not be null");
            }
            String str = "";
            while (this.mCurrentExecuteIndex < this.mCapduList.size()) {
                Capdu capdu = this.mCapduList.get(this.mCurrentExecuteIndex);
                this.mCurrentExecuteApduBean = capdu;
                String capdu2 = capdu.getCapdu();
                fpe.e(this.mTag, "start execute apdu: index " + this.mCurrentExecuteApduBean.getIndex() + "," + capdu2);
                byte[] bArrTransceive = this.mChannel.transceive(al5.c(capdu2));
                if (bArrTransceive != null && bArrTransceive.length != 0) {
                    String upperCase = al5.a(bArrTransceive).toUpperCase(Locale.getDefault());
                    fpe.e(this.mTag, "apdu response:" + upperCase);
                    if (upperCase.length() >= 4) {
                        String strSubstring2 = upperCase.substring(upperCase.length() - 4);
                        strSubstring = upperCase.substring(0, upperCase.length() - 4);
                        upperCase = strSubstring2;
                    } else {
                        strSubstring = "";
                    }
                    fpe.e(this.mTag, "apdu response sw:" + upperCase);
                    if (upperCase.startsWith("6C") && upperCase.length() == 4) {
                        this.mCapduList.get(this.mCurrentExecuteIndex).setCapdu(capdu2.substring(0, capdu2.length() - 2) + upperCase.substring(2, 4));
                    } else if (upperCase.startsWith("61") && upperCase.length() == 4) {
                        str = str + strSubstring;
                        String strSubstring3 = upperCase.substring(upperCase.length() - 2);
                        this.mCapduList.get(this.mCurrentExecuteIndex).setCapdu("00C00000" + strSubstring3);
                    } else {
                        if (!TextUtils.isEmpty(str)) {
                            strSubstring = str + strSubstring;
                            str = "";
                        }
                        createRapduBean(this.mCurrentExecuteApduBean.getIndex(), strSubstring, upperCase);
                        if (!isMatchSw(this.mCurrentExecuteApduBean.getExpSw(), upperCase)) {
                            return new ApduResp(RESULT_FAILURE, "状态字错误", this.mRapduList);
                        }
                        this.mCurrentExecuteIndex++;
                    }
                }
                createRapduBean(this.mCurrentExecuteApduBean.getIndex(), "", "");
                return new ApduResp(RESULT_FAILURE, "execute apdu:" + capdu2 + ", response is null", this.mRapduList);
            }
            return new ApduResp("0000", "指令执行成功", this.mRapduList);
        } catch (IOException | InterruptedException e) {
            fpe.g("execute command exception", e.getMessage());
            return new ApduResp(RESULT_ERROR, "client exception");
        }
    }

    public ApduResp executeApdu(Capdu capdu) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(capdu);
        return executeApdus(arrayList);
    }

    public ApduResp executeApdus(List<Capdu> list) {
        if (list == null || list.isEmpty()) {
            return new ApduResp(RESULT_ERROR, "capdu list must not null");
        }
        List<Capdu> list2 = this.mCapduList;
        if (list2 == null) {
            this.mCapduList = new ArrayList();
        } else {
            list2.clear();
        }
        this.mCapduList.addAll(list);
        List<Rapdu> list3 = this.mRapduList;
        if (list3 == null) {
            this.mRapduList = new ArrayList();
        } else {
            list3.clear();
        }
        ApduResp apduRespExecute = execute();
        clearData();
        return apduRespExecute;
    }

    public String getCommonSeid() {
        if (TextUtils.isEmpty(this.seid)) {
            getCplc();
            this.seid = ApduFormat.getCommonSeidFromCplc(this.cplc);
        }
        return this.seid;
    }

    public String getCplc() {
        if (TextUtils.isEmpty(this.cplc)) {
            ApduResp apduRespStartProcessApduCommand = startProcessApduCommand(CommonApdus.getCplcCommands());
            if (apduRespStartProcessApduCommand.isExecuteSuccess()) {
                this.cplc = apduRespStartProcessApduCommand.getLastRapdu().getRapdu();
            }
        }
        return ApduFormat.formatCplc(this.cplc);
    }

    public String getDeviceId() {
        return ApduFormat.getClientDeviceIdByCplc(getCplc());
    }

    public String getMiSeid() {
        if (TextUtils.isEmpty(this.seid)) {
            getCplc();
            this.seid = ApduFormat.getMiStandardSeIdFromCplc(this.cplc);
        }
        return this.seid;
    }

    public boolean isMatchSw(Object obj, String str) {
        if (obj == null) {
            return false;
        }
        String str2 = (String) obj;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return Pattern.compile(str2).matcher(str).find();
    }

    public void open() throws InterruptedException, IOException {
        this.mChannel.open();
    }
}
