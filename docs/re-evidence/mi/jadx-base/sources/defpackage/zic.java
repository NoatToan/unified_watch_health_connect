package defpackage;

import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.ProbeParam;
import com.miui.tsmclient.entity.SectorKey;
import com.miui.tsmclient.sesdk.MifareClassicTag;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.bean.NfcResponse;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.profile.nfc.ApduRequest;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardCtl;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import com.xiaomi.hm.health.bt.profile.nfc.PasswordInteractionResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class zic extends s10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HuamiApiCaller f41312b;

    public zic(WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.f41312b = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkCRSStatus$7(ssg.b bVar) {
        PasswordInteractionResponse passwordInteractionResponsePasswordInteraction = this.f41312b.passwordInteraction();
        if (passwordInteractionResponsePasswordInteraction == null) {
            vqg.d("checkCRSStatus passwordInteraction response is null isConnected:" + this.f33148a.getIsDeviceConnected());
            bVar.onResult(-1);
            return;
        }
        vqg.d("checkCRSStatus passwordInteraction isPasswordHaveSetUpSe:" + passwordInteractionResponsePasswordInteraction.isPasswordHaveSetUpSe() + " isPasswordHaveSetUpFlash:" + passwordInteractionResponsePasswordInteraction.isPasswordHaveSetUpFlash() + "  isPasswordIsSetUp:" + passwordInteractionResponsePasswordInteraction.isPasswordIsSetUp() + " isPasswordHaveNotSetUpSe:" + passwordInteractionResponsePasswordInteraction.isPasswordHaveNotSetUpSe() + " component1:" + passwordInteractionResponsePasswordInteraction.getType());
        bVar.onResult(Boolean.valueOf((passwordInteractionResponsePasswordInteraction.getType() & 16) != 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.xiaomi.fitness.device.manager.DeviceModel] */
    public /* synthetic */ void lambda$pinStatus$6(ssg.b bVar) {
        PasswordInteractionResponse passwordInteractionResponsePasswordInteraction = this.f41312b.passwordInteraction();
        if (passwordInteractionResponsePasswordInteraction == null) {
            vqg.d("passwordInteraction response is null isConnected:" + this.f33148a.getIsDeviceConnected());
            bVar.onResult(-1);
            return;
        }
        vqg.d("passwordInteraction isPasswordHaveSetUpSe:" + passwordInteractionResponsePasswordInteraction.isPasswordHaveSetUpSe() + " isPasswordHaveSetUpFlash:" + passwordInteractionResponsePasswordInteraction.isPasswordHaveSetUpFlash() + "  isPasswordIsSetUp:" + passwordInteractionResponsePasswordInteraction.isPasswordIsSetUp() + " isPasswordHaveNotSetUpSe:" + passwordInteractionResponsePasswordInteraction.isPasswordHaveNotSetUpSe() + " component1:" + passwordInteractionResponsePasswordInteraction.getType());
        int type = passwordInteractionResponsePasswordInteraction.getType() & 15;
        if (type == 0) {
            boolean lockStatus = DeviceModelExtKt.isL66((DeviceModel<? extends DeviceInfo<? extends Device>>) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) ? this.f41312b.getLockStatus() : !this.f41312b.readWristAndPinState();
            vqg.d("pinStatus readWristAndPinState isLock:" + lockStatus);
            bVar.onResult(Integer.valueOf(lockStatus ? 4 : 1));
            return;
        }
        if (type == 1) {
            bVar.onResult(2);
            return;
        }
        if (type == 3) {
            bVar.onResult(3);
            return;
        }
        if (type == 4) {
            bVar.onResult(6);
        } else if (type != 5) {
            bVar.onResult(-1);
        } else {
            bVar.onResult(7);
        }
    }

    public int E(int i) {
        if (i == 1) {
            return 1024;
        }
        if (i != 24) {
            if (i == 40) {
                return 1024;
            }
            if (i != 56) {
                if (i == 136) {
                    return 1024;
                }
                if (i != 152 && i != 184) {
                    if (i == 8) {
                        return 1024;
                    }
                    if (i == 9) {
                        return 320;
                    }
                    if (i == 16) {
                        return 2048;
                    }
                    if (i != 17) {
                        return 1024;
                    }
                }
            }
        }
        return 4096;
    }

    public final /* synthetic */ void F(int i, String str, int i2, int i3, y64.o oVar) {
        int timeSwitchCardSync = this.f41312b.setTimeSwitchCardSync(new HMCardSwitchTime(L(i), str, 2L, i2, i3));
        if (timeSwitchCardSync == 66 || timeSwitchCardSync == 53) {
            oVar.onResult(2);
        } else if (timeSwitchCardSync == 0) {
            oVar.onResult(0);
        } else {
            oVar.onResult(10);
        }
    }

    public final /* synthetic */ void G(int i, String str, int i2, int i3) {
        this.f41312b.deleteSwitchCardTimeSync(new HMCardSwitchTime(L(i), str, 2L, i2, i3));
    }

    public final /* synthetic */ void H(wrg wrgVar) {
        if (wrgVar.d == null) {
            return;
        }
        vqg.d("Sender send    sendAddCard");
        byte[] bArrHexStringToBytes = Coder.hexStringToBytes(wrgVar.d);
        vqg.d("Sender receive sendAddCard = " + this.f41312b.setAidInfo(new HMAidInfo(1, L(wrgVar.c), bArrHexStringToBytes.length, bArrHexStringToBytes)));
        int i = wrgVar.c;
        if (i == 0 || i == 2 || i == 4 || i == 5) {
            d(wrgVar);
        }
        try {
            j(wrgVar.d, wrgVar.c);
        } catch (Exception e) {
            vqg.c("setDefaultCard error", e);
        }
    }

    public final /* synthetic */ void I(wrg[] wrgVarArr) {
        String strI;
        wrg wrgVar = null;
        try {
            strI = i();
        } catch (Exception e) {
            vqg.c("getDefaultCard error", e);
            strI = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (wrg wrgVar2 : wrgVarArr) {
            if (wrgVar2.d.equalsIgnoreCase(strI)) {
                wrgVar = wrgVar2;
            }
            HMNFCCardIdent hMNFCCardIdent = new HMNFCCardIdent();
            if (wrgVar2.d.contains(",")) {
                hMNFCCardIdent.setAid(wrgVar2.d.split(",")[0]);
            } else {
                hMNFCCardIdent.setAid(wrgVar2.d);
            }
            hMNFCCardIdent.setAidLen(Coder.hexStringToBytes(wrgVar2.d).length);
            int i = wrgVar2.c;
            if (i == 0) {
                hMNFCCardIdent.setType(HMNFCCardType.DOOR);
                arrayList2.add(hMNFCCardIdent);
                d(wrgVar2);
            } else if (i == 1) {
                hMNFCCardIdent.setType(HMNFCCardType.BUS);
                arrayList.add(hMNFCCardIdent);
            } else if (i == 2) {
                hMNFCCardIdent.setType(HMNFCCardType.UNIONPAY);
                arrayList3.add(hMNFCCardIdent);
                d(wrgVar2);
            } else if (i == 4) {
                hMNFCCardIdent.setType(HMNFCCardType.MASTERCARD);
                arrayList4.add(hMNFCCardIdent);
                d(wrgVar2);
            } else if (i == 5) {
                hMNFCCardIdent.setType(HMNFCCardType.VISA);
                arrayList5.add(hMNFCCardIdent);
                d(wrgVar2);
            }
        }
        if (wrgVar == null && wrgVarArr.length > 0) {
            wrgVar = wrgVarArr[0];
        }
        vqg.d("Sender receive sendCardList bus success = " + this.f41312b.updateNfcCardList(arrayList, HMNFCCardType.BUS));
        vqg.d("Sender receive sendCardList door success = " + this.f41312b.updateNfcCardList(arrayList2, HMNFCCardType.DOOR));
        vqg.d("Sender receive sendCardList unionpay success = " + this.f41312b.updateNfcCardList(arrayList3, HMNFCCardType.UNIONPAY));
        vqg.d("Sender receive sendCardList master success = " + this.f41312b.updateNfcCardList(arrayList4, HMNFCCardType.MASTERCARD));
        vqg.d("Sender receive sendCardList visa success = " + this.f41312b.updateNfcCardList(arrayList5, HMNFCCardType.VISA));
        if (wrgVar != null) {
            try {
                if (this.f41312b.isMiliMainLand()) {
                    j(wrgVar.d, wrgVar.c);
                }
            } catch (Exception e2) {
                vqg.c("setDefaultCard error", e2);
            }
        }
    }

    public final /* synthetic */ void K(wrg wrgVar) {
        vqg.d("Sender send    sendUpdateCard");
        byte[] bArrHexStringToBytes = Coder.hexStringToBytes(wrgVar.d);
        vqg.d("Sender receive sendUpdateCard = " + this.f41312b.setAccessInfo(new HMAccessInfo(wrgVar.e, bArrHexStringToBytes.length, bArrHexStringToBytes)));
    }

    public final int L(int i) {
        if (i == 0) {
            return 2;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 4;
            if (i != 2) {
                if (i != 4) {
                    return i != 5 ? -1 : 8;
                }
                return 3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void J(String str, int i) {
        vqg.d("Sender send    sendDelCardSync");
        byte[] bArrHexStringToBytes = Coder.hexStringToBytes(str);
        vqg.d("Sender receive sendDelCardSync = " + this.f41312b.setAidInfo(new HMAidInfo(2, L(i), bArrHexStringToBytes.length, bArrHexStringToBytes)));
    }

    @Override // defpackage.byc
    public int a(String str) throws Exception {
        return 0;
    }

    @Override // defpackage.byc
    public void b(final String str, final int i, final int i2, final int i3, final y64.o oVar) {
        tyo.f(new Runnable() { // from class: yic
            @Override // java.lang.Runnable
            public final void run() {
                this.f40208a.F(i, str, i2, i3, oVar);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.byc
    public NfcResponse c(int i, byte[] bArr) throws Exception {
        NfcResponse nfcResponse = new NfcResponse();
        switch (i) {
            case 192:
                if (this.f41312b.openApduChannel().isSuccess()) {
                    nfcResponse.mStatus = SportReportBaseParser.ReportType.avgFreq;
                } else {
                    nfcResponse.mStatus = 233;
                }
                return nfcResponse;
            case SportReportBaseParser.ReportType.divingOTU /* 193 */:
                HMNFCStatus hMNFCStatusCloseApduChannel = this.f41312b.closeApduChannel();
                if (hMNFCStatusCloseApduChannel == null || !hMNFCStatusCloseApduChannel.isSuccess()) {
                    nfcResponse.mStatus = 233;
                } else {
                    nfcResponse.mStatus = SportReportBaseParser.ReportType.avgFreq;
                }
                return nfcResponse;
            case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                ApduResponse apduResponseSendApduData = this.f41312b.sendApduData(new ApduRequest(bArr));
                if (apduResponseSendApduData == null) {
                    nfcResponse.mStatus = 2;
                    nfcResponse.mData = null;
                } else {
                    nfcResponse.mStatus = 1;
                    nfcResponse.mData = apduResponseSendApduData.getData();
                }
                return nfcResponse;
            default:
                return nfcResponse;
        }
    }

    @Override // defpackage.s10, defpackage.byc
    public void checkCRSStatus(final ssg.b bVar) {
        tyo.f(new Runnable() { // from class: wic
            @Override // java.lang.Runnable
            public final void run() {
                this.f38002a.lambda$checkCRSStatus$7(bVar);
            }
        });
    }

    @Override // defpackage.s10, defpackage.byc
    public void closeTai(ssg.b<Boolean> bVar) {
    }

    @Override // defpackage.byc
    public void d(final wrg wrgVar) {
        tyo.f(new Runnable() { // from class: xic
            @Override // java.lang.Runnable
            public final void run() {
                this.f39154a.K(wrgVar);
            }
        });
    }

    @Override // defpackage.byc
    public void e(boolean z, final wrg[] wrgVarArr) {
        vqg.d("Sender send    sendCardList isFull = " + z + ", size = " + wrgVarArr.length);
        if (z) {
            tyo.f(new Runnable() { // from class: uic
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35788a.I(wrgVarArr);
                }
            });
        }
    }

    @Override // defpackage.byc
    public void f(final String str, final int i) {
        tyo.f(new Runnable() { // from class: vic
            @Override // java.lang.Runnable
            public final void run() {
                this.f36922a.J(str, i);
            }
        });
    }

    @Override // defpackage.byc
    public NfcResponse g(byte[] bArr) throws Exception {
        NfcResponse nfcResponse = new NfcResponse();
        ApduResponse apduResponseNfcLoadService = this.f41312b.nfcLoadService(bArr);
        if (apduResponseNfcLoadService == null) {
            nfcResponse.mStatus = 2;
            nfcResponse.mData = null;
            vqg.d("Sender receive data = FAILURE");
        } else {
            nfcResponse.mStatus = 1;
            nfcResponse.mData = apduResponseNfcLoadService.getData();
            vqg.d("Sender receive data = " + Coder.bytesToHexString(apduResponseNfcLoadService.getData()));
        }
        return nfcResponse;
    }

    @Override // defpackage.byc
    public void h(final String str, final int i, final int i2, final int i3) {
        tyo.f(new Runnable() { // from class: sic
            @Override // java.lang.Runnable
            public final void run() {
                this.f33663a.G(i, str, i2, i3);
            }
        });
    }

    @Override // defpackage.byc
    public String i() throws Exception {
        vqg.d("Sender send    getDefaultCard");
        HMNFCCardConfig hMNFCCardConfig = new HMNFCCardConfig();
        hMNFCCardConfig.setOperation(HMNFCCardCtl.READ);
        HMNFCCardStatus hMNFCCardStatusUpdateNfcCardConfig = this.f41312b.updateNfcCardConfig(hMNFCCardConfig);
        String upperCase = (hMNFCCardStatusUpdateNfcCardConfig == null || hMNFCCardStatusUpdateNfcCardConfig.getCardIdent() == null) ? "" : hMNFCCardStatusUpdateNfcCardConfig.getCardIdent().getAid().toUpperCase();
        vqg.d("Sender receive getDefaultCard aid = " + upperCase);
        return upperCase;
    }

    @Override // defpackage.byc
    public boolean j(String str, int i) throws Exception {
        vqg.d("Sender send    setDefaultCard");
        byte[] bArrHexStringToBytes = Coder.hexStringToBytes(str);
        HMNFCCardConfig hMNFCCardConfig = new HMNFCCardConfig();
        HMNFCCardIdent hMNFCCardIdent = new HMNFCCardIdent();
        hMNFCCardIdent.setAid(str);
        hMNFCCardIdent.setAidLen(bArrHexStringToBytes.length);
        if (i == 0) {
            hMNFCCardIdent.setType(HMNFCCardType.DOOR);
        } else if (i == 1) {
            hMNFCCardIdent.setType(HMNFCCardType.BUS);
        } else if (i == 2) {
            hMNFCCardIdent.setType(HMNFCCardType.UNIONPAY);
        } else if (i == 4) {
            hMNFCCardIdent.setType(HMNFCCardType.MASTERCARD);
        } else if (i == 5) {
            hMNFCCardIdent.setType(HMNFCCardType.VISA);
        }
        hMNFCCardConfig.setCardIdent(hMNFCCardIdent);
        hMNFCCardConfig.setOperation(HMNFCCardCtl.ACTIVATE);
        return this.f41312b.updateNfcCardConfig(hMNFCCardConfig).getStatus() == 0;
    }

    @Override // defpackage.byc
    public boolean k() {
        boolean zIsSupportCardTimeSwitchSync = this.f41312b.isSupportCardTimeSwitchSync();
        vqg.d("isSupportCardSwitch=" + zIsSupportCardTimeSwitchSync);
        return zIsSupportCardTimeSwitchSync;
    }

    @Override // defpackage.byc
    public CardSwitcherBean l(String str, int i) throws Exception {
        List<HMCardSwitchTime> listQuerySwitchCardTimeSync = this.f41312b.querySwitchCardTimeSync(str, L(i));
        ArrayList arrayList = new ArrayList();
        CardSwitcherBean cardSwitcherBean = new CardSwitcherBean(str, i, arrayList);
        for (HMCardSwitchTime hMCardSwitchTime : listQuerySwitchCardTimeSync) {
            arrayList.add(Integer.valueOf((hMCardSwitchTime.getHour() * 60) + hMCardSwitchTime.getMinute()));
        }
        Collections.sort(arrayList);
        return cardSwitcherBean;
    }

    @Override // defpackage.byc
    public MifareClassicTag m(List<SectorKey> list) throws Exception {
        return null;
    }

    @Override // defpackage.byc
    public int n(int i, int i2, String str, String str2) {
        return 0;
    }

    @Override // defpackage.byc
    public void o(final wrg wrgVar) {
        tyo.f(new Runnable() { // from class: tic
            @Override // java.lang.Runnable
            public final void run() {
                this.f34736a.H(wrgVar);
            }
        });
    }

    @Override // defpackage.s10, defpackage.byc
    public void openTai(ssg.b<Boolean> bVar) {
    }

    @Override // defpackage.byc
    public void p(String str, int i) {
    }

    @Override // defpackage.s10, defpackage.byc
    public void pinStatus(final ssg.b bVar) {
        tyo.f(new Runnable() { // from class: ric
            @Override // java.lang.Runnable
            public final void run() {
                this.f32567a.lambda$pinStatus$6(bVar);
            }
        });
    }

    @Override // defpackage.byc
    public hsg q(ProbeParam probeParam) throws Exception {
        return null;
    }

    @Override // defpackage.byc
    public MifareTag r(int i) throws Exception {
        vqg.d("Sender send    readMifareTag");
        for (int i2 = 0; i2 < 5; i2++) {
            HMNFCCardInfo nfcCardInfoSync = this.f41312b.getNfcCardInfoSync();
            if (nfcCardInfoSync == null) {
                throw new NfcException(AppUtil.getApp().getString(o0j.M5));
            }
            if (nfcCardInfoSync.getResult() == 0) {
                MifareTag mifareTag = new MifareTag();
                mifareTag.setAtqa(nfcCardInfoSync.getAtqa());
                mifareTag.setSak(nfcCardInfoSync.getSak());
                mifareTag.setUid(nfcCardInfoSync.getUid());
                mifareTag.setSize(E(Integer.parseInt(nfcCardInfoSync.getSak())));
                mifareTag.setBlockContent(nfcCardInfoSync.getBlockData());
                vqg.d("Sender receive readMifareTag tag = " + mifareTag.toString());
                return mifareTag;
            }
            vqg.d("Sender receive readMifareTag result = " + nfcCardInfoSync.getResult());
            int result = nfcCardInfoSync.getResult();
            if (result == 8) {
                throw new NfcException(AppUtil.getApp().getString(o0j.Q5));
            }
            if (result == 9) {
                throw new NfcException(AppUtil.getApp().getString(o0j.N5));
            }
        }
        throw new NfcException(AppUtil.getApp().getString(o0j.M5));
    }
}
