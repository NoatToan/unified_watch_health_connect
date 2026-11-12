package defpackage;

import android.content.Context;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lvh extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile lvh f40889a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private eet f40890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40891c;
    private SendCallback e;

    private lvh(Context context) {
        super(context);
        this.f40891c = 0;
        this.f40890b = new eet();
        this.e = new SendCallback() { // from class: lvh.1
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.d("DEVMGR_HighLandWearEngineManager", "sendCommand errCode:", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.d("HighLandWearEngineManager", "onSendProgress");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("HighLandWearEngineManager", "mSendCallback onFileTransferReport transferWay: ", str);
            }
        };
        ddr.e().initHiAiEngine();
    }

    public static lvh d() {
        lvh lvhVar;
        synchronized (d) {
            LogUtil.a("HighLandWearEngineManager", "getInstance()");
            if (f40889a == null) {
                f40889a = new lvh(BaseApplication.getContext());
            }
            lvhVar = f40889a;
        }
        return lvhVar;
    }

    public void a(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("DEVMGR_HighLandWearEngineManager", "startIntelligentManager device is disconnected.");
            return;
        }
        this.f40891c = i;
        ReleaseLogUtil.d("DEVMGR_HighLandWearEngineManager", "startIntelligentManager status :", Integer.valueOf(i));
        c(this.f40891c);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        ReleaseLogUtil.d("DEVMGR_HighLandWearEngineManager", "onReceiveDeviceCommand errorCode:", Integer.valueOf(i));
        if (xiuVar != null) {
            byte[] bArrB = xiuVar.b();
            if (bArrB == null || bArrB.length <= 1) {
                ReleaseLogUtil.e("DEVMGR_HighLandWearEngineManager", "onReceiveDeviceCommand data illegal");
                return;
            } else {
                e(bArrB);
                return;
            }
        }
        ReleaseLogUtil.e("DEVMGR_HighLandWearEngineManager", "onReceiveDeviceCommand Message is null");
    }

    public void e(byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            ReleaseLogUtil.e("DEVMGR_HighLandWearEngineManager", "receiveMessageData data illegal");
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("HighLandWearEngineManager", "receiveMessageData info is ", strE);
        e(strE);
    }

    private void e(String str) {
        try {
            List<eew> listE = this.f40890b.b(str).e();
            if (listE != null && !listE.isEmpty()) {
                int iJ = 0;
                for (eew eewVar : listE) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB == 0) {
                        iJ = CommonUtil.j(eeq.d(strB));
                    } else {
                        LogUtil.j("HighLandWearEngineManager", "handleSecondLevelMessageTlv type is ", Integer.valueOf(iB));
                    }
                }
                ReleaseLogUtil.d("DEVMGR_HighLandWearEngineManager", "errorCode is:", Integer.valueOf(iJ));
                return;
            }
            ReleaseLogUtil.e("DEVMGR_HighLandWearEngineManager", "handleBtProxyMessage tlv error");
        } catch (eeu unused) {
            ReleaseLogUtil.a("DEVMGR_HighLandWearEngineManager", "handleBtProxyMessage error");
        }
    }

    private static byte[] e(int i) {
        String str = eeq.c(8L) + eeq.d(0) + eeq.d(1) + eeq.d(i);
        LogUtil.a("HighLandWearEngineManager", "highLandStatusHexTlv is:", str);
        return eeq.c(str);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.HIGH_LAND_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "hw.watch.highlandCare.p2p";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.j("HighLandWearEngineManager", "onDeviceConnectionChange:", connectState);
    }

    private void c(int i) {
        xiu.c cVar = new xiu.c();
        try {
            cVar.a(e(i));
        } catch (yin unused) {
            ReleaseLogUtil.a("DEVMGR_HighLandWearEngineManager", "sendMessage WearEngineException");
        }
        sendComand(cVar.c(), this.e);
    }
}
