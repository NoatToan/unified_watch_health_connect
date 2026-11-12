package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.Node;
import com.huawei.devicesdk.connect.physical.PhysicalLayerBase;
import com.huawei.devicesdk.connect.physical.smartwatch.SmartWatchFileCallback;
import com.huawei.devicesdk.connect.physical.smartwatch.SmartWatchHostPhysicalService;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import health.compact.a.LogUtil;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class clk extends PhysicalLayerBase implements SmartWatchFileCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GoogleApiClient f1728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExtendHandler f1729b;
    private DeviceInfo e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f1730c = new a(this);
    private String g = "";
    private Node d = null;

    protected clk() {
        a();
    }

    private void a() {
        this.f1729b = HandlerCenter.b(this.f1730c, "InoperableSmartWatchPhysicalService");
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void connectDevice(DeviceInfo deviceInfo) {
        LogUtil.b("InoperableSmartWatchPhysicalService", "connectDevice.");
        if (deviceInfo == null) {
            LogUtil.d("InoperableSmartWatchPhysicalService", "btDevice is null.");
            c(3, cpi.c(7, 303));
            return;
        }
        this.e = deviceInfo;
        SmartWatchHostPhysicalService.b(BaseApplication.b());
        clo.a().a(deviceInfo);
        clo.a().d(this.mStatusChangeCallback);
        clo.a().b(this.mMessageReceiveCallback);
        this.g = clo.a().c();
        c(1, 100000);
        GoogleApiClient googleApiClientD = clo.a().d();
        this.f1728a = googleApiClientD;
        if (googleApiClientD == null) {
            LogUtil.b("InoperableSmartWatchPhysicalService", "blockingConnect mGoogleApiClient is null");
            return;
        }
        if (googleApiClientD.isConnected()) {
            b();
            return;
        }
        if (this.f1728a.isConnecting()) {
            LogUtil.b("InoperableSmartWatchPhysicalService", "GoogleApiClient isConnecting");
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.wearable.app.cn", "com.google.android.gms.wearable.service.WearableService"));
        try {
            BaseApplication.b().startService(intent);
        } catch (IllegalStateException e) {
            LogUtil.d("InoperableSmartWatchPhysicalService", "connectDevice IllegalStateException", ExceptionUtils.c(e));
        }
        LogUtil.b("InoperableSmartWatchPhysicalService", "started gms service");
        this.f1728a.connect();
        LogUtil.d("InoperableSmartWatchPhysicalService", "GMS connect fail, GoogleApiClient try connect");
    }

    private void b() {
        LogUtil.b("InoperableSmartWatchPhysicalService", "Enter connectedSuccess");
        ExtendHandler extendHandler = this.f1729b;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Collection<Node> collectionE = clo.a().e();
        if (collectionE == null || collectionE.size() == 0) {
            LogUtil.b("InoperableSmartWatchPhysicalService", " StateThread no watch in iterator");
            d();
            return;
        }
        LogUtil.b("InoperableSmartWatchPhysicalService", "StateThread watch names.size() is ", Integer.valueOf(collectionE.size()));
        for (Node node : collectionE) {
            if (node != null) {
                this.g = node.getId();
                a(node);
                c(2, 100000);
                return;
            }
        }
        d();
    }

    private void d() {
        LogUtil.b("InoperableSmartWatchPhysicalService", "reconnect device, NodeId = ", this.g);
        if (this.e != null && !TextUtils.isEmpty(this.g)) {
            ymp.d().d(this.g);
        } else {
            c(3, cpi.c(7, 303));
        }
    }

    private void a(Node node) {
        synchronized (this) {
            this.d = node;
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void disconnectDevice() {
        LogUtil.b("InoperableSmartWatchPhysicalService", "start to disconnect.");
        destroy();
        c();
    }

    private void c() {
        c(0, 100000);
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public boolean sendData(cmd cmdVar, String str) {
        LogUtil.b("InoperableSmartWatchPhysicalService", "sendBTDeviceData");
        if (cmdVar == null) {
            LogUtil.d("InoperableSmartWatchPhysicalService", "sendData error. bluetooth frame data is null");
            return false;
        }
        List<cmb> listA = cmdVar.a();
        if (coq.d(listA)) {
            LogUtil.d("InoperableSmartWatchPhysicalService", "the packages getted is empty", cpl.a(this.mDeviceInfo));
            return true;
        }
        for (cmb cmbVar : listA) {
            if (cmbVar == null) {
                LogUtil.d("InoperableSmartWatchPhysicalService", "onePackage is null");
                return false;
            }
            clo.a().d(this.g, cmbVar.a());
        }
        return true;
    }

    private void c(int i, int i2) {
        if (this.d != null) {
            this.mDeviceInfo.setDeviceName(this.d.getDisplayName());
        }
        if (this.mStatusChangeCallback == null || this.e == null) {
            return;
        }
        LogUtil.b("InoperableSmartWatchPhysicalService", "report connect state : ", Integer.valueOf(i));
        this.mStatusChangeCallback.onConnectStatusChanged(this.e, i, i2);
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void destroy() {
        ExtendHandler extendHandler = this.f1729b;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.f1729b = null;
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.smartwatch.SmartWatchFileCallback
    public void sendBtFilePath(String str) {
        LogUtil.b("InoperableSmartWatchPhysicalService", "sendBTFilePath");
        clo.a().e(this.g, str);
    }

    @Override // com.huawei.devicesdk.connect.physical.smartwatch.SmartWatchFileCallback
    public void setFileCallback(BtDeviceResponseCallback btDeviceResponseCallback) {
        LogUtil.b("InoperableSmartWatchPhysicalService", "setFileCallback");
        clo.a().b(btDeviceResponseCallback);
    }

    @Override // com.huawei.devicesdk.connect.physical.smartwatch.SmartWatchFileCallback
    public void setSmartWatchAssetCallback(BtDeviceResponseCallback btDeviceResponseCallback) {
        LogUtil.b("InoperableSmartWatchPhysicalService", "setAwAssetCallback");
        clo.a().c(btDeviceResponseCallback);
    }

    @Override // com.huawei.devicesdk.connect.physical.smartwatch.SmartWatchFileCallback
    public void setPathExtendNum(int i) {
        LogUtil.b("InoperableSmartWatchPhysicalService", "Enter setPathExtendNum ");
        clo.a().c(i);
    }

    static class a implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<clk> f1731b;

        a(clk clkVar) {
            this.f1731b = new WeakReference<>(clkVar);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            WeakReference<clk> weakReference;
            if (message == null || (weakReference = this.f1731b) == null) {
                return false;
            }
            clk clkVar = weakReference.get();
            if (clkVar == null) {
                LogUtil.e("InoperableSmartWatchPhysicalService", "handleMessage inoperableSmartWatchPhysicalService is null");
                return false;
            }
            if (message.what != 1) {
                clkVar.e();
                return true;
            }
            clkVar.e();
            return true;
        }
    }
}
