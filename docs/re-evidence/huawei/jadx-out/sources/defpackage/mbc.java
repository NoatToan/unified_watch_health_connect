package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.gson.Gson;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.callback.HwOtaResponseCallback;
import com.huawei.hwdevice.outofprocess.datatype.DataOtaParametersV2;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IOTAResultAIDLCallback;
import com.huawei.hwservicesmgr.ISilenceOTAAIDLCallback;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mbc extends HwBaseManager implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41316a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41317b = new Object();
    private static mbc d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwOtaResponseCallback f41318c;
    private Context e;
    private IBaseResponseCallback f;
    private String g;
    private IBaseResponseCallback h;
    private IBaseResponseCallback i;
    private boolean j;
    private IOTAResultAIDLCallback k;
    private int l;
    private String m;
    private IBaseResponseCallback n;
    private HwOtaResponseCallback o;
    private int q;
    private IBaseResponseCallback r;
    private ISilenceOTAAIDLCallback s;

    public void e(boolean z) {
        this.j = z;
    }

    public static boolean e(String str) {
        DeviceInfo deviceInfoB = mgg.b(str, "HwOtaV2Mgr");
        if (deviceInfoB == null) {
            LogUtil.j("HwOtaV2Mgr", "isSupportChangeLog deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoB, 52);
    }

    public static boolean c(String str) {
        DeviceInfo deviceInfoB = mgg.b(str, "HwOtaV2Mgr");
        if (deviceInfoB == null) {
            LogUtil.j("HwOtaV2Mgr", "getIsSupportPackageTypeRequest deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoB, 204);
    }

    private mbc(Context context) {
        super(context);
        this.k = null;
        this.s = null;
        this.l = -1;
        this.j = false;
        this.o = new HwOtaResponseCallback() { // from class: mbc.4
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwotamanager.callback.HwOtaResponseCallback
            public void onResponse(int i, DeviceInfo deviceInfo, Object obj) {
                byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
                if (deviceInfo == null || bArr == null || bArr.length < 2) {
                    LogUtil.j("HwOtaV2Mgr", "onResponse(), error data, return");
                    return;
                }
                LogUtil.a("HwOtaV2Mgr", "Enter mOtaV2ResponseCallback onResponse(),data ", eeq.e(bArr));
                byte b2 = bArr[1];
                LogUtil.a("HwOtaV2Mgr", "mOtaV2ResponseCallback command id ", Integer.valueOf(b2));
                try {
                    if (b2 == 1) {
                        mbc.this.e(mbi.j(bArr), deviceInfo);
                        return;
                    }
                    if (b2 == 2) {
                        mbc.this.e(mbi.c(bArr), deviceInfo);
                        return;
                    }
                    if (b2 == 11) {
                        LogUtil.a("HwOtaV2Mgr", "onResponse errorCode ", Integer.valueOf(i), ", and objectData ", eeq.e(bArr));
                        mbc.this.h.a(0, obj);
                    } else if (b2 == 12) {
                        mbc.this.c(bArr);
                    } else if (b2 == 127) {
                        mbc.this.e(mbi.e(bArr));
                    } else {
                        LogUtil.j("HwOtaV2Mgr", "command is null");
                    }
                } catch (Exception unused) {
                    LogUtil.e("HwOtaV2Mgr", "Exception e");
                }
            }
        };
        this.e = context;
        lvb lvbVarE = lvb.e();
        e(3);
        lvbVarE.d(100009, this);
        lvbVarE.d(9, this);
    }

    public static mbc b() {
        mbc mbcVar;
        synchronized (f41316a) {
            if (d == null) {
                d = new mbc(BaseApplication.getContext());
            }
            mbcVar = d;
        }
        return mbcVar;
    }

    private void e(int i) {
        this.l = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void a(HwOtaResponseCallback hwOtaResponseCallback) {
        synchronized (f41317b) {
            if (this.f41318c == null) {
                this.f41318c = hwOtaResponseCallback;
            }
        }
    }

    public void a() {
        synchronized (f41317b) {
            this.f41318c = null;
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 9;
    }

    public void a(final String str, String str2, final int i, String str3, IOTAResultAIDLCallback iOTAResultAIDLCallback) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || iOTAResultAIDLCallback == null) {
            LogUtil.j("HwOtaV2Mgr", "OTA V2 transferOtaFile ,parameter is error!");
            if (iOTAResultAIDLCallback != null) {
                try {
                    iOTAResultAIDLCallback.onUpgradeFailed(109001, "OTA V2 transferOtaFile ,parameter is error!");
                    return;
                } catch (RemoteException unused) {
                    LogUtil.e("HwOtaV2Mgr", "OTA V2 transferOtaFile ,parameter is error");
                    return;
                }
            }
            return;
        }
        this.g = str3;
        this.m = str2;
        this.k = iOTAResultAIDLCallback;
        this.q = i;
        if (!CommonUtil.af(this.e) && niz.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mbc.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!mjh.g(str) || !mjh.h(str)) {
                        mjh.i(str);
                    }
                    DeviceInfo deviceInfoJ = mjh.j(str);
                    SharedPreferenceManager.d(mbc.this.e, System.currentTimeMillis(), "ota_datatime");
                    mjl.e(mbc.this.e, i);
                    if (deviceInfoJ != null && deviceInfoJ.getSoftVersion() != null) {
                        mjl.d(mbc.this.e, deviceInfoJ.getSoftVersion());
                    }
                    mjl.a(mbc.this.e, mbc.this.m);
                }
            });
        }
        d();
        c(str, str2, i, str3, this.k);
        a(this.o);
    }

    public void a(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwOtaV2Mgr", "checkDeviceReadyForUpdate enter");
        a(this.o);
        this.h = iBaseResponseCallback;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(11);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        deviceCommand.setmIdentify(str);
        lvb.e().c(deviceCommand);
    }

    private void d() {
        LogUtil.a("HwOtaV2Mgr", "otaSwitchAnalytics enter");
        final DeviceInfo deviceInfoD = mgg.d("HwOtaV2Mgr");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add("wlan_auto_update");
        arrayList.add("auto_update_status");
        arrayList.add("auto_open_wlan_status");
        mhs.a().getSwitchSetting(arrayList, new IBaseResponseCallback() { // from class: mbc.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                String strC;
                LogUtil.a("HwOtaV2Mgr", "otaSwitchAnalytics list errCode is:", Integer.valueOf(i));
                if (i == 0 && (obj instanceof List)) {
                    List list = (List) obj;
                    LogUtil.a("HwOtaV2Mgr", "getSwitchSetting userPreferenceList is:", list.toString());
                    strC = mbc.this.c(deviceInfoD, (List<HiUserPreference>) list);
                } else {
                    strC = "";
                }
                mio.c(deviceInfoD, "090000", "1", String.valueOf(i), strC);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    public String c(DeviceInfo deviceInfo, List<HiUserPreference> list) {
        byte b2;
        String str;
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < list.size(); i++) {
            HiUserPreference hiUserPreference = list.get(i);
            if (hiUserPreference != null) {
                String key = hiUserPreference.getKey();
                key.hashCode();
                int iHashCode = key.hashCode();
                if (iHashCode != 105734552) {
                    if (iHashCode != 312087338) {
                        if (iHashCode == 1760488028 && key.equals("wlan_auto_update")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (key.equals("auto_open_wlan_status")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (key.equals("auto_update_status")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    str = "0x02";
                } else if (b2 == 1) {
                    str = "0x03";
                } else if (b2 == 2) {
                    str = "0x01";
                } else {
                    LogUtil.j("HwOtaV2Mgr", "getOtaSwitchEventInfo hiUserPreference getKey is error");
                    str = "";
                }
                try {
                    String strE = mbi.e(deviceInfo, hiUserPreference.getValue());
                    if (strE.equals("true") || strE.equals("false")) {
                        strE = strE.equals("true") ? "1" : "2";
                    }
                    if (!TextUtils.isEmpty(strE)) {
                        jSONObject.put(str, strE);
                    }
                } catch (JSONException unused) {
                    LogUtil.e("HwOtaV2Mgr", "getOtaSwitchInfo JSONException");
                }
            }
        }
        LogUtil.a("HwOtaV2Mgr", "userPreferenceList.info = ", jSONObject.toString());
        return jSONObject.toString();
    }

    private void c(String str, String str2, int i, String str3, IOTAResultAIDLCallback iOTAResultAIDLCallback) {
        int iE;
        LogUtil.a("HwOtaV2Mgr", "Enter getIsUpdate() updateMode ", Integer.valueOf(i));
        try {
            try {
                if (!TextUtils.isEmpty(str3)) {
                    if (str3.equals("is_package_already_exists")) {
                        iE = 512;
                    } else if (!new File(str3).exists()) {
                        LogUtil.j("HwOtaV2Mgr", "file is not exist");
                        iOTAResultAIDLCallback.onUpgradeFailed(104003, "升级文件不存在 ");
                        return;
                    } else {
                        LogUtil.a("HwOtaV2Mgr", "Enter getIsUpdate()");
                        iE = (int) mbi.e(str, str3);
                    }
                    int i2 = iE;
                    LogUtil.a("HwOtaV2Mgr", "getIsUpdate(),componentSize ", Integer.valueOf(i2));
                    String[] strArrSplit = str3.split(File.separatorChar == '\\' ? "\\" : File.separator);
                    if (strArrSplit != null && strArrSplit.length != 0) {
                        String str4 = strArrSplit[strArrSplit.length - 1];
                        LogUtil.a("HwOtaV2Mgr", "sendOTAFileData tmpFilePath ", str4);
                        boolean zStartsWith = str4.toUpperCase(Locale.getDefault()).startsWith("AW70");
                        this.s = null;
                        c(str, str2, i2, i, zStartsWith);
                        return;
                    }
                    LogUtil.j("HwOtaV2Mgr", "getIsUpdate tempArray is invalid");
                    return;
                }
                LogUtil.j("HwOtaV2Mgr", "transferOtaFile V2, filePath is null");
                iOTAResultAIDLCallback.onUpgradeFailed(104003, "升级文件不存在 ");
            } catch (Exception unused) {
                LogUtil.e("HwOtaV2Mgr", "getIsUpdate TLVException e");
            }
        } catch (Exception unused2) {
        }
    }

    private void c(String str, String str2, int i, int i2, boolean z) {
        String str3;
        mik.b("HwOtaV2Mgr", 9, 1);
        String strA = eeq.a(str2);
        String str4 = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
        short s = (short) i;
        String str5 = eeq.d(2) + eeq.d(2) + eeq.e((int) s);
        String str6 = eeq.d(3) + eeq.d(1) + eeq.d(i2);
        String str7 = eeq.d(5) + eeq.d(1) + eeq.d(5);
        DeviceInfo deviceInfoB = mgg.b(str, "HwOtaV2Mgr");
        if (deviceInfoB == null) {
            str3 = "";
        } else if (deviceInfoB.getProductType() == 11 || deviceInfoB.getProductType() == 12) {
            str3 = str4 + str5 + str6;
        } else {
            str3 = str4 + str5 + str6 + str7;
        }
        if (z) {
            str3 = str4 + str5 + str6;
        }
        LogUtil.a("HwOtaV2Mgr", "5.9.1 queryOtaAllow : ", str3);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(str3));
        deviceCommand.setDataLen(eeq.c(str3).length);
        deviceCommand.setmIdentify(str);
        if (i == 256) {
            deviceCommand.setNeedAck(false);
        } else {
            deviceCommand.setNeedAck(true);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("0x01", str2);
                jSONObject.put("0x02", (int) s);
                jSONObject.put("0x03", i2);
            } catch (JSONException unused) {
                LogUtil.e("HwOtaV2Mgr", "queryOtaAllow JSONException");
            }
            mio.c(deviceInfoB, "050901", "1", "", jSONObject.toString());
        }
        lvb.e().c(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(mbb mbbVar, DeviceInfo deviceInfo) {
        try {
            if (mbbVar == null) {
                LogUtil.j("HwOtaV2Mgr", "dataOtaQueryAllow is null");
                return;
            }
            if (this.s != null) {
                int iC = mbbVar.c();
                LogUtil.a("HwOtaV2Mgr", "Response: errorCode ", Integer.valueOf(iC));
                if (iC == 100000 || iC == 109025) {
                    this.s.onResponse(100000, "success");
                } else {
                    this.s.onResponse(iC, "设备不允许升级");
                }
                this.s = null;
                return;
            }
            SharedPreferenceManager.d(BaseApplication.getContext(), System.currentTimeMillis(), "EXCE_OTA_APP_UPG_TRANS_START");
            final int iC2 = mbbVar.c();
            mio.c(deviceInfo, "050901", "0", String.valueOf(iC2), "");
            int iE = mbbVar.e();
            if (!CommonUtil.af(this.e)) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: mbc.5
                    @Override // java.lang.Runnable
                    public void run() {
                        mjl.b(mbc.this.e, String.valueOf(iC2));
                        SharedPreferenceManager.d(mbc.this.e, System.currentTimeMillis(), "EXCE_OTA_APP_UPG_TRANS_START");
                    }
                });
            }
            LogUtil.a("HwOtaV2Mgr", "Response: errorCode ", Integer.valueOf(iC2), ", batteryThreshold ", Integer.valueOf(iE));
            if (iC2 != 100000 && (!this.j || iC2 != 109025)) {
                if (iE == -1) {
                    this.k.onUpgradeFailed(iC2, "");
                    return;
                } else {
                    this.k.onUpgradeFailed(iC2, String.valueOf(iE));
                    return;
                }
            }
            c(deviceInfo);
        } catch (Exception unused) {
            LogUtil.e("HwOtaV2Mgr", "queryOtaAllowHandle Exception e");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int[] iArr) {
        IOTAResultAIDLCallback iOTAResultAIDLCallback;
        try {
            if (iArr.length == 0) {
                LogUtil.j("HwOtaV2Mgr", "dataInfos.length is 0");
                return;
            }
            int i = iArr[0];
            if (i == 100000 || (iOTAResultAIDLCallback = this.k) == null) {
                return;
            }
            iOTAResultAIDLCallback.onUpgradeFailed(i, lrr.b(i));
        } catch (Exception unused) {
            LogUtil.e("HwOtaV2Mgr", "errorCodeHandle Exception e");
        }
    }

    private void c(DeviceInfo deviceInfo) {
        mik.b("HwOtaV2Mgr", 9, 2);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(null);
        deviceCommand.setDataLen(0);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        deviceCommand.setNeedAck(true);
        mio.c(deviceInfo, "050902", "1", "", "");
        lvb.e().c(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DataOtaParametersV2 dataOtaParametersV2, DeviceInfo deviceInfo) {
        try {
            if (dataOtaParametersV2 == null) {
                LogUtil.j("HwOtaV2Mgr", "dataOtaParametersV2 is null");
                return;
            }
            a();
            lvb.e().e(deviceInfo, this.g + "@" + this.m, new Gson().toJson(dataOtaParametersV2), this.q, this.k);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("0x01", dataOtaParametersV2.getAppWaitTimeout());
                jSONObject.put("0x02", dataOtaParametersV2.getDeviceRestartTimeout());
            } catch (JSONException unused) {
                LogUtil.e("HwOtaV2Mgr", "getOtaParametersV2handle JSONException");
            }
            mio.c(deviceInfo, "050902", "0", "", jSONObject.toString());
        } catch (Exception unused2) {
            LogUtil.e("HwOtaV2Mgr", "getOtaParametersV2handle() TLV error");
        }
    }

    public void a(String str, String str2, ISilenceOTAAIDLCallback iSilenceOTAAIDLCallback) {
        this.s = iSilenceOTAAIDLCallback;
        c(str, str2, 256, 2, true);
        a(this.o);
    }

    public void a(String str, boolean z) {
        String str2;
        if (z) {
            str2 = eeq.d(1) + eeq.d(1) + eeq.d(1);
        } else {
            str2 = eeq.d(1) + eeq.d(1) + eeq.d(0);
        }
        byte[] bArrC = eeq.c(str2);
        DeviceInfo deviceInfoB = mgg.b(str, "HwOtaV2Mgr");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x01", z ? 1 : 0);
        } catch (JSONException unused) {
            LogUtil.e("HwOtaV2Mgr", "sendNightValue JSONException");
        }
        mio.c(deviceInfoB, "050912", "1", "", jSONObject.toString());
        mhs.a().sendSetSwitchSettingCmd(bArrC, str, 9, 12);
    }

    public void c(String str, int i) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(13);
        String str2 = eeq.d(1) + eeq.d(1) + eeq.d(i);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        deviceCommand.setmIdentify(str);
        DeviceInfo deviceInfoB = mgg.b(str, "HwOtaV2Mgr");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x01", i);
        } catch (JSONException unused) {
            LogUtil.e("HwOtaV2Mgr", "sendUpdateChange JSONException");
        }
        mio.c(deviceInfoB, "050913", "1", "", jSONObject.toString());
        LogUtil.a("HwOtaV2Mgr", "sendUpdateChange, deviceCommand :", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    public void d(mbe mbeVar) {
        e(mbeVar, "", (IBaseResponseCallback) null);
    }

    public void e(mbe mbeVar, String str, IBaseResponseCallback iBaseResponseCallback) {
        if (mbeVar == null) {
            LogUtil.j("HwOtaV2Mgr", "sendUpdateChange, updateMessageBean == null");
            return;
        }
        this.f = iBaseResponseCallback;
        mik.b("HwOtaV2Mgr", 9, 14);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(14);
        StringBuffer stringBuffer = new StringBuffer(16);
        if (mbeVar.c() == 1) {
            String strA = eeq.a(mbeVar.f());
            String str2 = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
            String strB = eeq.b(mbeVar.b());
            String str3 = eeq.d(2) + eeq.d(strB.length() / 2) + strB;
            stringBuffer.append(str2);
            stringBuffer.append(str3);
        }
        String strC = eeq.c(mbeVar.e());
        String str4 = eeq.d(3) + eeq.d(strC.length() / 2) + strC;
        String str5 = eeq.d(4) + eeq.d(1) + eeq.d(mbeVar.c());
        String str6 = eeq.d(5) + eeq.d(1) + eeq.d(mbeVar.a());
        String str7 = eeq.d(6) + eeq.d(1) + eeq.d(mbeVar.h());
        stringBuffer.append(str4);
        stringBuffer.append(str5);
        stringBuffer.append(str6);
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append(str7);
        }
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        deviceCommand.setmIdentify(mbeVar.d());
        DeviceInfo deviceInfoB = mgg.b(mbeVar.d(), "HwOtaV2Mgr");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x01", mbeVar.f());
            jSONObject.put("0x04", mbeVar.c());
            jSONObject.put("0x05", mbeVar.a());
            jSONObject.put("0x06", mbeVar.h());
        } catch (JSONException unused) {
            LogUtil.e("HwOtaV2Mgr", "sendUpdateMessage JSONException");
        }
        mio.c(deviceInfoB, "050914", "1", "", jSONObject.toString());
        LogUtil.a("HwOtaV2Mgr", "sendUpdateMessage, deviceCommand :", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwOtaV2Mgr", "handleNightUpdate ", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwOtaV2Mgr", "handleNightUpdate dataInfos is error");
            return;
        }
        int iV = 0;
        try {
            iV = CommonUtil.v(new eet().b(strE.substring(4)).e().get(0).e());
        } catch (eeu unused) {
            LogUtil.e("HwOtaV2Mgr", "handleNightUpdate error");
        }
        LogUtil.a("HwOtaV2Mgr", "handleNightUpdate :", Integer.valueOf(iV));
    }

    private void b(byte[] bArr) {
        if (bArr.length < 2) {
            LogUtil.j("HwOtaV2Mgr", "dealDeviceRequestCallback dataInfos is invalid");
            return;
        }
        LogUtil.d("HwOtaV2Mgr", "dealDeviceRequestCallback dataInfos: ", eeq.e(bArr));
        byte b2 = bArr[1];
        if (b2 == 19) {
            e(bArr);
            return;
        }
        if (b2 == 14) {
            d(bArr);
        } else if (b2 == 22) {
            a(bArr);
        } else {
            LogUtil.d("HwOtaV2Mgr", "dealDeviceRequestCallback default");
        }
    }

    public boolean d(String str) {
        try {
            int iC = maq.b().c(str);
            if (iC == 3) {
                a(str, 109021L);
                return false;
            }
            if (iC != 4 && iC != 6) {
                a(str, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
                return true;
            }
            a(str, 109022L);
            return false;
        } catch (IllegalStateException unused) {
            LogUtil.e("parserDeviceRequestCheck startService IllegalStateException", new Object[0]);
            return false;
        }
    }

    public boolean b(String str, int i) {
        DeviceInfo deviceInfoD = mgg.d("HwOtaV2Mgr");
        if (deviceInfoD == null) {
            LogUtil.j("HwOtaV2Mgr", "deviceRequestDownloadOta connectDeviceInfo is null");
            return false;
        }
        if (i == 0 || i == 1) {
            String str2 = i == 0 ? "false" : "true";
            mhs.a().setSwitchSetting("auto_update_status", str2, deviceInfoD.getDeviceUdid(), null);
            a(str, Boolean.parseBoolean(str2));
            return true;
        }
        if (i == 2) {
            b(str);
            return false;
        }
        if (i == 3) {
            mhs.a().setSwitchSetting("auto_update_status", "true", deviceInfoD.getDeviceUdid(), null);
        }
        return false;
    }

    private void d(byte[] bArr) {
        try {
            int iB = mbi.b(bArr);
            IBaseResponseCallback iBaseResponseCallback = this.f;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(iB, null);
            }
        } catch (eeu unused) {
            LogUtil.e("HwOtaV2Mgr", "deviceUpdateMessage TlvException");
        }
    }

    private void e(byte[] bArr) {
        try {
            int iD = mbi.d(bArr);
            IBaseResponseCallback iBaseResponseCallback = this.n;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, Integer.valueOf(iD));
            }
        } catch (eeu unused) {
            LogUtil.e("HwOtaV2Mgr", "deviceTransmitMode TlvException");
        }
    }

    private void a(byte[] bArr) {
        try {
            int iD = mbi.d(bArr);
            IBaseResponseCallback iBaseResponseCallback = this.r;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, Integer.valueOf(iD));
            }
        } catch (eeu unused) {
            LogUtil.e("HwOtaV2Mgr", "deviceTransmitMode TlvException");
        }
    }

    private void a(String str, long j) {
        mik.b("HwOtaV2Mgr", 9, 15);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(15);
        byte[] bArrE = new cqj().j(127, (int) j).e();
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setmIdentify(str);
        mio.c(mgg.b(str, "HwOtaV2Mgr"), "050915", "1", String.valueOf(j), "");
        LogUtil.a("HwOtaV2Mgr", "sendDeviceRequestCheckAnswer deviceCommand:", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    private void b(String str) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(16);
        String str2 = eeq.d(1) + eeq.d(1) + eeq.d(2);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        deviceCommand.setmIdentify(str);
        LogUtil.a("HwOtaV2Mgr", "answerDeviceRequestStatus deviceCommand:", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    public void a(String str, int i, int i2) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(16);
        StringBuffer stringBuffer = new StringBuffer(16);
        String str2 = eeq.d(2) + eeq.d(1) + eeq.d(i);
        String str3 = eeq.d(3) + eeq.d(1) + eeq.d(i2);
        stringBuffer.append(str2);
        stringBuffer.append(str3);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        deviceCommand.setmIdentify(str);
        DeviceInfo deviceInfoB = mgg.b(str, "HwOtaV2Mgr");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x02", i);
            jSONObject.put("0x03", i2);
        } catch (JSONException unused) {
            LogUtil.e("HwOtaV2Mgr", "answerDeviceRequestDownloadOta JSONException");
        }
        mio.c(deviceInfoB, "050916", "1", "", jSONObject.toString());
        LogUtil.a("HwOtaV2Mgr", "answerDeviceRequestDownloadOta deviceCommand:", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    public void e(String str, int i) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(17);
        String str2 = eeq.d(2) + eeq.d(1) + eeq.d(i);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        deviceCommand.setmIdentify(str);
        DeviceInfo deviceInfoB = mgg.b(str, "HwOtaV2Mgr");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x02", i);
        } catch (JSONException unused) {
            LogUtil.e("HwOtaV2Mgr", "answerUserIsAgreeDownload JSONException");
        }
        mio.c(deviceInfoB, "050917", "1", "", jSONObject.toString());
        LogUtil.a("HwOtaV2Mgr", "answerUserIsAgreeDownload deviceCommand:", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    public void c(String str, int i, int i2, int i3) {
        LogUtil.d("HwOtaV2Mgr", "sendOtaDownloadPercent percent:", Integer.valueOf(i), " downloadMode:", Integer.valueOf(i2), " downloadState:", Integer.valueOf(i3));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(18);
        StringBuffer stringBuffer = new StringBuffer(16);
        String str2 = eeq.d(1) + eeq.d(1) + eeq.d(i);
        String str3 = eeq.d(2) + eeq.d(1) + eeq.d(i3);
        String str4 = eeq.d(3) + eeq.d(1) + eeq.d(i2);
        stringBuffer.append(str2);
        stringBuffer.append(str3);
        stringBuffer.append(str4);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        deviceCommand.setmIdentify(str);
        if (i == 100 || i3 == 0 || i3 == 2 || i3 == 255) {
            DeviceInfo deviceInfoC = mgg.c(str, "HwOtaV2Mgr");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("0x01", i);
                jSONObject.put("0x02", i3);
                jSONObject.put("0x03", i2);
            } catch (JSONException unused) {
                LogUtil.e("HwOtaV2Mgr", "sendOtaDownloadPercent JSONException");
            }
            mio.c(deviceInfoC, "050918", "1", "", jSONObject.toString());
        }
        lvb.e().c(deviceCommand);
    }

    public void c(String str, IBaseResponseCallback iBaseResponseCallback) {
        this.r = iBaseResponseCallback;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(22);
        String str2 = eeq.d(1) + eeq.d(1);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        deviceCommand.setmIdentify(str);
        LogUtil.a("HwOtaV2Mgr", "queryDevicePackageType deviceCommand:", deviceCommand.toString());
        mio.c(mgg.b(str, "HwOtaV2Mgr"), "050922", "1", "", "");
        lvb.e().c(deviceCommand);
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        this.n = iBaseResponseCallback;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(19);
        String str2 = eeq.d(1) + eeq.d(1);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        deviceCommand.setmIdentify(str);
        LogUtil.a("HwOtaV2Mgr", "queryDeviceTransmitMode deviceCommand:", deviceCommand.toString());
        mio.c(mgg.b(str, "HwOtaV2Mgr"), "050919", "1", "", "");
        lvb.e().c(deviceCommand);
    }

    public void e() {
        LogUtil.a("HwOtaV2Mgr", "removeQueryDeviceTransmitCallback enter");
        this.n = null;
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwOtaV2Mgr", "deviceInfo is null or aw70");
        } else {
            nvd.a(this.e, deviceInfo.getDeviceIdentify(), "device_is_transmission", false);
        }
    }

    public void e(String str, mav mavVar) {
        LogUtil.a("HwOtaV2Mgr", "sendChangelogToDevice packageVersion:", mavVar.b(), " appResult:", Integer.valueOf(mavVar.a()));
        String strB = mavVar.b();
        if (StringUtils.g(strB)) {
            return;
        }
        int iA = mavVar.a();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(20);
        StringBuffer stringBuffer = new StringBuffer(16);
        String strA = eeq.a(strB);
        stringBuffer.append(eeq.d(1) + eeq.d(strA.length() / 2) + strA);
        stringBuffer.append(eeq.d(2) + eeq.d(1) + eeq.d(iA));
        DeviceInfo deviceInfoB = mgg.b(str, "HwOtaV2Mgr");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x01", strB);
            jSONObject.put("0x02", iA);
            jSONObject.put("0x05", mavVar.d());
        } catch (JSONException unused) {
            LogUtil.e("HwOtaV2Mgr", "sendChangelogToDevice JSONException");
        }
        mio.c(deviceInfoB, "050920", "1", "", jSONObject.toString());
        if (iA == 0) {
            deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
            deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
            LogUtil.a("HwOtaV2Mgr", "sendChangelogToDevice, deviceCommand :", deviceCommand.toString());
            lvb.e().c(deviceCommand);
            return;
        }
        if (iA == 1) {
            String strD = mavVar.d();
            String strI = mavVar.i();
            String strE = mavVar.e();
            LogUtil.a("HwOtaV2Mgr", "sendChangelogToDevice, versionChangeLog :", strE);
            String strA2 = eeq.a(strE);
            stringBuffer.append(eeq.d(3) + eeq.b(strA2.length() / 2) + strA2);
            String strA3 = eeq.a(strI);
            stringBuffer.append(eeq.d(4) + eeq.b(strA3.length() / 2) + strA3);
            String strA4 = eeq.a(strD);
            stringBuffer.append(eeq.d(5) + eeq.d(strA4.length() / 2) + strA4);
        }
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        deviceCommand.setmIdentify(str);
        LogUtil.a("HwOtaV2Mgr", "sendChangelogToDevice, deviceCommand :", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    private void e(int i, byte[] bArr) {
        LogUtil.j("HwOtaV2Mgr", "deviceChangeLogMessage errorCode=", Integer.valueOf(i));
        try {
            mav mavVarA = mbi.a(bArr);
            IBaseResponseCallback iBaseResponseCallback = this.i;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i, mavVarA);
            }
        } catch (eeu unused) {
            LogUtil.e("HwOtaV2Mgr", "deviceChangeLogCallback TlvException");
        }
    }

    private void a(int i, byte[] bArr) {
        LogUtil.j("HwOtaV2Mgr", "dealDeviceRequestCallback errorCode=", Integer.valueOf(i));
        if (bArr.length < 2) {
            LogUtil.j("HwOtaV2Mgr", "dealDeviceRequestCallback dataInfos is invalid");
            return;
        }
        LogUtil.a("HwOtaV2Mgr", "dealDeviceRequestCallback dataInfos: ", eeq.e(bArr));
        if (bArr[1] == 21) {
            e(i, bArr);
        }
    }

    public void a(String str, String str2, String str3, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwOtaV2Mgr", "queryChangelogFromDevice packageVersion:", str2, " versionCountry:", str3);
        this.i = iBaseResponseCallback;
        if (StringUtils.g(str2) || StringUtils.g(str3)) {
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(21);
        StringBuffer stringBuffer = new StringBuffer(16);
        String strA = eeq.a(str2);
        stringBuffer.append(eeq.d(1) + eeq.d(strA.length() / 2) + strA);
        String strA2 = eeq.a(str3);
        stringBuffer.append(eeq.d(2) + eeq.d(strA2.length() / 2) + strA2);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        deviceCommand.setmIdentify(str);
        DeviceInfo deviceInfoB = mgg.b(str, "HwOtaV2Mgr");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x01", str2);
            jSONObject.put("0x02", str3);
        } catch (JSONException unused) {
            LogUtil.e("HwOtaV2Mgr", "queryChangelogFromDevice JSONException");
        }
        mio.c(deviceInfoB, "050921", "1", "", jSONObject.toString());
        LogUtil.a("HwOtaV2Mgr", "sendUpdateMessage, deviceCommand :", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        HwOtaResponseCallback hwOtaResponseCallback = this.f41318c;
        if (hwOtaResponseCallback != null) {
            hwOtaResponseCallback.onResponse(i, deviceInfo, bArr);
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportDeviceRequestCheck()) {
            b(bArr);
        }
        if (e(deviceInfo.getDeviceIdentify())) {
            a(i, bArr);
        }
    }
}
