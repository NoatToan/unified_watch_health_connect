package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitManager;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapP2pMessage;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.health.p2p.receiver.OfflineMapReceiver;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class rdo extends EngineLogicBaseManager {
    private static final Object d = new Object();
    private static volatile rdo e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SendCallback f47186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOfflineMapSendCallback f47187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47188c;

    private rdo() {
        super(BaseApplication.b());
        this.f47187b = new IOfflineMapSendCallback() { // from class: rdo.2
            @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
            public void onSendResult(int i) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "mOfflineMapDefaultSendCallback sendCommand errCode:", Integer.valueOf(i));
            }

            @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
            public void onSendProgress(long j) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "mOfflineMapDefaultSendCallback sendCommand process:", Long.valueOf(j));
            }

            @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "mOfflineMapDefaultSendCallback onFileTransferReport transferWay: ", str);
            }
        };
        this.f47186a = new SendCallback() { // from class: rdo.5
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "mDefaultSendCallback sendCommand errCode:", Integer.valueOf(i));
                rdo.this.f47187b.onSendResult(i);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "mDefaultSendCallback sendCommand process:", Long.valueOf(j));
                rdo.this.f47187b.onSendProgress(j);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "mDefaultSendCallback onFileTransferReport transferWay: ", str);
                rdo.this.f47187b.onFileTransferReport(str);
            }
        };
    }

    public static rdo b() {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new rdo();
                }
            }
        }
        return e;
    }

    public void a(Context context, String str) {
        this.f47188c = str;
        OfflineMapInitManager.setLogHealth(new rdf());
        OfflineMapWearEngineManager.getInstance().setWearEngine4OfflineMap(context, str, new rdh());
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        ReleaseLogUtil.c("DEVMGR_OfflineMapEngineManager", "onReceiveDeviceCommand errorCode ", Integer.valueOf(i));
        if (xiuVar != null) {
            if (xiuVar.c() == 2) {
                ReleaseLogUtil.d("DEVMGR_OfflineMapEngineManager", "onReceiveDeviceCommand type is file, pls check.");
                return;
            }
            byte[] bArrB = xiuVar.b();
            LogUtil.a("DEVMGR_OfflineMapEngineManager", "dataInfo is null ", Boolean.valueOf(bArrB == null));
            OfflineMapP2pMessage.Builder builder = new OfflineMapP2pMessage.Builder();
            builder.setPayload(bArrB);
            OfflineMapReceiver.getInstance().onDataReceived(i, builder.build());
            return;
        }
        LogUtil.e("DEVMGR_OfflineMapEngineManager", "onReceiveDeviceCommand Message is null");
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.OFFLINE_MAP_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return OfflineMapWearEngineManager.WEAR_PACKAGE_NAME;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        int i;
        if (connectState == ConnectState.CONNECTED) {
            i = 2;
        } else if (connectState == ConnectState.DISCONNECTED) {
            i = 3;
        } else {
            i = connectState == ConnectState.CONNECTING ? 1 : -1;
        }
        ReleaseLogUtil.c("DEVMGR_OfflineMapEngineManager", " statusCode ", Integer.valueOf(i));
        if (Objects.equals(this.f47188c, deviceInfo.getDeviceUdid())) {
            OfflineMapReceiver.getInstance().onConnectStatusChanged(BaseApplication.f(), deviceInfo.getDeviceUdid(), i);
        }
    }

    public void d(OfflineMapP2pMessage offlineMapP2pMessage) {
        LogUtil.a("DEVMGR_OfflineMapEngineManager", "sendMsgToDevice enter ");
        xiu.c cVar = new xiu.c();
        cVar.a(offlineMapP2pMessage.getData());
        c(cVar.c(), this.f47186a);
    }

    public void c(xiu xiuVar, SendCallback sendCallback) {
        sendComand(xiuVar, sendCallback);
    }

    public void e(OfflineMapP2pMessage offlineMapP2pMessage, IOfflineMapSendCallback iOfflineMapSendCallback, int i) {
        if (offlineMapP2pMessage == null || iOfflineMapSendCallback == null) {
            ReleaseLogUtil.b("DEVMGR_OfflineMapEngineManager", "msg is null or callback is null.");
            return;
        }
        xiu.c cVar = new xiu.c();
        byte[] data = offlineMapP2pMessage.getData();
        File file = offlineMapP2pMessage.getFile();
        ReleaseLogUtil.c("DEVMGR_OfflineMapEngineManager", "sendMsgToDevice3 enter msgId ", Integer.valueOf(i), " sendData ", Boolean.valueOf(data != null), " sendFile ", Boolean.valueOf(file != null));
        if (data != null) {
            cVar.a(data);
        } else if (file != null) {
            cVar.a(file);
        }
        sendComand(cVar.c(), b(iOfflineMapSendCallback, i));
    }

    private SendCallback b(final IOfflineMapSendCallback iOfflineMapSendCallback, final int i) {
        if (iOfflineMapSendCallback == null) {
            return this.f47186a;
        }
        return new SendCallback() { // from class: rdo.4
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i2) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "sendMsgToDevice onSendResult ", Integer.valueOf(i2), " msgId ", Integer.valueOf(i));
                iOfflineMapSendCallback.onSendResult(i2);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "sendMsgToDevice onSendProgress ", Long.valueOf(j), " msgId ", Integer.valueOf(i));
                iOfflineMapSendCallback.onSendProgress(j);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "sendMsgToDevice onFileTransferReport ", str, " msgId ", Integer.valueOf(i));
                iOfflineMapSendCallback.onFileTransferReport(str);
            }
        };
    }

    public void d(String str, IOfflineMapSendCallback iOfflineMapSendCallback, int i) {
        ReleaseLogUtil.c("DEVMGR_OfflineMapEngineManager", "sendCancelCommand enter ", Integer.valueOf(i));
        xgz xgzVar = new xgz();
        if (str == null) {
            ReleaseLogUtil.b("DEVMGR_OfflineMapEngineManager", "invalid cancel param!");
            return;
        }
        String[] strArrSplit = str.split("/");
        xgzVar.e(str);
        xgzVar.c(strArrSplit[strArrSplit.length - 1]);
        xgzVar.i(getWearPkgName());
        xgzVar.a(getManagerModule());
        xgzVar.h(getWearFingerprint());
        cancelCommand(xit.e(WearEngineModule.OFFLINE_MAP_MODULE.getValue()), xgzVar, b(iOfflineMapSendCallback, i));
    }

    public void a() {
        if (!c()) {
            ReleaseLogUtil.b("DEVMGR_OfflineMapEngineManager", "sendDevicePullSuccessMsg, device is not connected!");
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(36);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(6);
        byteBufferAllocate.putInt(111);
        byteBufferAllocate.flip();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBufferAllocate.capacity());
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.flip();
        xiu.c cVar = new xiu.c();
        cVar.a(byteBufferAllocate2.array());
        ReleaseLogUtil.c("DEVMGR_OfflineMapEngineManager", "sendDevicePullSuccessMsg ");
        sendComand(cVar.c(), new SendCallback() { // from class: rdo.1
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "sendDevicePullSuccessMsg onSendResult ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "sendDevicePullSuccessMsg onSendProgress ", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("DEVMGR_OfflineMapEngineManager", "sendDevicePullSuccessMsg onFileTransferReport ", str);
            }
        });
    }

    public void c(final IOfflineMapPingCallback iOfflineMapPingCallback, String str) {
        pingComand(new PingCallback() { // from class: rdn
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public final void onPingResult(int i) {
                rdo.d(iOfflineMapPingCallback, i);
            }
        }, getWearPkgName());
    }

    static /* synthetic */ void d(IOfflineMapPingCallback iOfflineMapPingCallback, int i) {
        LogUtil.a("DEVMGR_OfflineMapEngineManager", "sendPingToDevices onPingResult ", Integer.valueOf(i));
        iOfflineMapPingCallback.onPingResult(i);
    }

    public boolean c() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "DEVMGR_OfflineMapEngineManager");
        return deviceInfo != null && deviceInfo.getDeviceConnectState() == 2;
    }

    public String d() {
        String str;
        String contentCenterDomain = H5proUtil.getContentCenterDomain(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        int i = AnonymousClass3.d[EnvironmentHelper.getInstance().getBuildType().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            str = "/cch5/mapopen/";
        } else if (i == 5) {
            str = "/sandbox/cch5/mapopen/";
        } else {
            return "";
        }
        return contentCenterDomain + str;
    }

    /* JADX INFO: renamed from: rdo$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[EnvironmentHelper.BuildType.values().length];
            d = iArr;
            try {
                iArr[EnvironmentHelper.BuildType.RELEASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[EnvironmentHelper.BuildType.TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[EnvironmentHelper.BuildType.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[EnvironmentHelper.BuildType.BETA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[EnvironmentHelper.BuildType.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
