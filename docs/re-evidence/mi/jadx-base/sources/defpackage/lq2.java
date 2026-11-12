package defpackage;

import android.os.RemoteException;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import com.xiaomi.wearable.ChannelInfo;
import com.xiaomi.wearable.connection.BleConnection;
import com.xiaomi.wearable.connection.ConnectionFactoryKt;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.transport.queue.BleTaskQueueV1;
import com.xiaomi.wearable.transport.queue.BleTaskQueueV2;
import com.xiaomi.wearable.transport.queue.IBleOperation;
import com.xiaomi.wearable.transport.queue.ITaskQueue;
import com.xiaomi.wearable.wear.BleManagerFactoryKt;
import com.xiaomi.wearable.wear.api.CipherApiCall;
import com.xiaomi.wearable.wear.api.ProxyDataManager;
import com.xiaomi.wearable.wear.utils.DeviceExtKt;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class lq2 extends CipherApiCall<BleConnection> implements b23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jpc f25311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25312b;
    public final DeviceInfo c;
    public boolean d;

    public class a implements ht2<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o43 f25313a;

        public a(o43 o43Var) {
            this.f25313a = o43Var;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r1) {
            this.f25313a.onBondSuccess();
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            this.f25313a.onBondFailure(i);
        }
    }

    public class b implements ht2<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zd4 f25315a;

        public b(zd4 zd4Var) {
            this.f25315a = zd4Var;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(String str) {
            CoreExtKt.logger.e("WearApiCall", "onResponse() called with: deviceName = [" + str + "]", new Exception());
            if (!lq2.this.isConnected()) {
                lq2.this.onConnected();
            }
            this.f25315a.onConnectSuccess();
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            CoreExtKt.logger.i("WearApiCall", "onFailed() called with: status = [" + i + "]");
            lq2.this.i(this.f25315a, i);
            this.f25315a.onConnectFailure(i, "connect failure");
        }
    }

    public class c implements o43 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.xiaomi.wearable.core.a f25317a;

        public c(com.xiaomi.wearable.core.a aVar) {
            this.f25317a = aVar;
        }

        @Override // defpackage.o43
        public void onBondFailure(int i) {
            try {
                this.f25317a.onConnectFailed(i, "bond failure");
            } catch (RemoteException unused) {
            }
        }

        @Override // defpackage.o43
        public void onBondSuccess() {
            lq2.this.g(this.f25317a);
        }
    }

    public class d implements ht2<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.xiaomi.wearable.core.a f25319a;

        public d(com.xiaomi.wearable.core.a aVar) {
            this.f25319a = aVar;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r2) {
            try {
                this.f25319a.onConnected(lq2.this.getVersion());
            } catch (RemoteException unused) {
            }
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            try {
                this.f25319a.onConnectFailed(i, "enable notification fail");
            } catch (RemoteException e) {
                CoreExtKt.logger.e("WearApiCall", "enableNotifications onFailed: ", e);
            }
        }
    }

    public lq2(DeviceInfo deviceInfo) {
        super(deviceInfo);
        boolean zIsSupportLargeMtu = DeviceExtKt.isSupportLargeMtu(deviceInfo.getModel());
        this.f25312b = zIsSupportLargeMtu;
        this.c = deviceInfo;
        this.mConnection = ConnectionFactoryKt.createBleConnection(this, deviceInfo);
        CoreExtKt.logger.i("WearApiCall", "isSupportLargeMtu=" + zIsSupportLargeMtu + ", deviceInfo " + deviceInfo);
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void connect() {
        ((BleConnection) this.mConnection).connect(true, true, 1);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall, com.xiaomi.wearable.wear.api.IWearApiCall
    public int connectionType() {
        return h() instanceof e7r ? 1 : 2;
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall, com.xiaomi.wearable.wear.api.IWearApiCall
    public void destroy() {
        super.destroy();
        getCryptoCounter().e();
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void disconnect() {
        ((BleConnection) this.mConnection).disconnect(false);
    }

    public void e(o43 o43Var) {
        if (j()) {
            o43Var.onBondSuccess();
        } else {
            h().j(new a(o43Var));
        }
    }

    public void f(ht2<Void> ht2Var) {
        CoreExtKt.logger.i("WearApiCall", "enableNotifications() called with: response = [" + ht2Var + "], queue = [" + this.mQueue + "]");
        ((IBleOperation) this.mQueue).enableNotifications(ht2Var);
    }

    public final void g(com.xiaomi.wearable.core.a aVar) {
        f(new d(aVar));
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public ChannelInfo getChannelInfo() {
        String str;
        lem proxyData = ProxyDataManager.INSTANCE.getProxyData();
        if (proxyData == null || (str = proxyData.e) == null) {
            return null;
        }
        return new ChannelInfo(UUID.fromString(str));
    }

    @Override // com.xiaomi.wearable.wear.api.CipherApiCall
    public long getLastConnectTime() {
        if (h() == null || !(h() instanceof x82)) {
            return 0L;
        }
        return ((x82) h()).J1();
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public int getVersion() {
        return h().getVersion();
    }

    public synchronized jpc h() {
        try {
            if (this.f25311a == null) {
                CoreExtKt.logger.e("WearApiCall", "getBleManager() called", new Exception());
                DeviceInfo deviceInfo = this.c;
                this.f25311a = BleManagerFactoryKt.createBleManager(deviceInfo, this.f25312b, deviceInfo.getProxyConnectionFirst());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25311a;
    }

    public final boolean i(zd4 zd4Var, int i) {
        if (i != -10) {
            return false;
        }
        this.f25311a.destroy();
        this.f25311a = BleManagerFactoryKt.createBleManager(this.c, this.f25312b, false);
        return true;
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void internalConnect(boolean z, zd4 zd4Var) {
        CoreExtKt.logger.i("WearApiCall", "internalConnect() called with: callback = [" + zd4Var + "]");
        if ((h() instanceof l22) && isConnected()) {
            zd4Var.onConnectSuccess();
        } else {
            h().c(getAddress(), new b(zd4Var));
        }
    }

    public boolean j() {
        return h().e();
    }

    public void k() {
        CoreExtKt.logger.i("WearApiCall", "resetBleManager() called");
        if (h() != null) {
            h().close();
        }
        DeviceInfo deviceInfo = this.c;
        this.f25311a = BleManagerFactoryKt.createBleManager(deviceInfo, this.f25312b, deviceInfo.getProxyConnectionFirst() && this.c.isLocalBindMode());
    }

    public void l() {
        if (h() == null || !(h() instanceof x82)) {
            return;
        }
        long jJ1 = ((x82) h()).J1();
        CoreExtKt.logger.i("WearApiCall", "updateLastConnectTime: " + jJ1);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public ITaskQueue newTaskQueue() {
        String versionName = this.f25311a.getVersionName();
        CoreExtKt.logger.i("WearApiCall", "newTaskQueue: version = " + versionName);
        if (!versionName.startsWith("0")) {
            return new BleTaskQueueV2(this);
        }
        BleTaskQueueV1 bleTaskQueueV1 = new BleTaskQueueV1(this);
        bleTaskQueueV1.setPrivateUUID(this.c.getPrivateUUID());
        return bleTaskQueueV1;
    }

    @Override // defpackage.b23
    public void onConnectStateChanged(String str, int i) {
        if (i == 0 && isConnected()) {
            onDisconnected();
        }
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void onConnected() {
        super.onConnected();
        BluetoothManager.get().addConnectStatusListener(getAddress(), this);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void onDisconnected() {
        super.onDisconnected();
        sq1.a();
        BluetoothManager.get().removeConnectStatusListener(getAddress(), this);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void onUnauthConnectFailure(int i, String str, com.xiaomi.wearable.core.a aVar) {
        CoreExtKt.logger.i("WearApiCall", "onUnauthConnectFailure() called with: callback = [" + aVar + "]");
        try {
            aVar.onConnectFailed(i, str);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void onUnauthConnected(com.xiaomi.wearable.core.a aVar) {
        if (this.c.getRequestBond() || getVersion() == 0) {
            e(new c(aVar));
        } else {
            g(aVar);
        }
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void removeBond() {
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall, com.xiaomi.wearable.wear.api.IWearApiCall
    public void setCurrent(boolean z) {
        super.setCurrent(z);
        if (z) {
            h();
        }
    }
}
