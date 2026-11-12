package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.xiaomi.wearable.ChannelInfo;
import com.xiaomi.wearable.connection.Connection;
import com.xiaomi.wearable.connection.ConnectionFactoryKt;
import com.xiaomi.wearable.connection.SppConnection;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.spp.SystemClient;
import com.xiaomi.wearable.transport.queue.ITaskQueue;
import com.xiaomi.wearable.transport.queue.SppTaskQueueV1;
import com.xiaomi.wearable.transport.queue.SppTaskQueueV2;
import com.xiaomi.wearable.wear.api.CipherApiCall;

/* JADX INFO: loaded from: classes2.dex */
public class x6o extends CipherApiCall<SppConnection> implements h7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public izc f38761a;

    public class a implements g7o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zd4 f38762a;

        public a(zd4 zd4Var) {
            this.f38762a = zd4Var;
        }

        @Override // defpackage.g7o
        public void onConnectFailure(int i, String str) {
            this.f38762a.onConnectFailure(i, str);
        }

        @Override // defpackage.g7o
        public void onConnectSuccess() {
            CoreExtKt.logger.i("SppApiCall", "onConnectSuccess() called isConnected() = " + x6o.this.isConnected());
            if (!x6o.this.isConnected()) {
                x6o.this.onConnected();
            }
            this.f38762a.onConnectSuccess();
        }
    }

    public x6o(DeviceInfo deviceInfo) {
        super(deviceInfo);
        this.mDeviceInfo = deviceInfo;
        this.mConnection = ConnectionFactoryKt.createSppConnection(deviceInfo, this);
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void connect() {
        ((SppConnection) this.mConnection).connect(true, true, 1);
    }

    public synchronized izc d() {
        try {
            if (this.f38761a == null) {
                this.f38761a = new SystemClient(this.mDeviceInfo.getAddress(), this.mDeviceInfo.getCreateBondWithoutDialog());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38761a;
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall, com.xiaomi.wearable.wear.api.IWearApiCall
    public void destroy() {
        super.destroy();
        d().destroy();
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void disconnect() {
        ((SppConnection) this.mConnection).disconnect(false);
    }

    public final /* synthetic */ void e() {
        s33.g(getAddress());
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public ChannelInfo getChannelInfo() {
        return super.getChannelInfo();
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public Connection getConnection() {
        return this.mConnection;
    }

    @Override // com.xiaomi.wearable.wear.api.CipherApiCall
    public long getLastConnectTime() {
        return d().getLastConnectTime();
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public int getVersion() {
        return this.f38761a.getVersion();
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void internalConnect(boolean z, zd4 zd4Var) {
        CoreExtKt.logger.i("SppApiCall", "internalConnect() called");
        if (!isConnected()) {
            d().connect(z, new a(zd4Var));
        } else {
            CoreExtKt.logger.i("SppApiCall", "internalConnect() called already connect success");
            zd4Var.onConnectSuccess();
        }
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public ITaskQueue newTaskQueue() {
        String versionName = d().getVersionName();
        CoreExtKt.logger.i("SppApiCall", "onConnected: version = " + versionName);
        return (versionName.startsWith("2") || versionName.startsWith("3")) ? new SppTaskQueueV2(this) : new SppTaskQueueV1(this);
    }

    @Override // defpackage.h7o
    public void onConnectStatusChanged(boolean z) {
        CoreExtKt.logger.i("SppApiCall", "onConnectStatusChanged: isConnected = " + z);
        if (z || !isConnected()) {
            return;
        }
        onDisconnected();
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void onConnected() {
        super.onConnected();
        d().registerStatusChangeListener(this);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void onDisconnected() {
        super.onDisconnected();
        d().removeStatusChangeListener(this);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void onUnauthConnectFailure(int i, String str, com.xiaomi.wearable.core.a aVar) {
        CoreExtKt.logger.i("SppApiCall", "onUnauthConnectFailure() called with: callback = [" + aVar + "]");
        try {
            aVar.onConnectFailed(i, str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void onUnauthConnected(com.xiaomi.wearable.core.a aVar) {
        CoreExtKt.logger.i("SppApiCall", "onUnauthConnected() called with: callback = [" + aVar + "]");
        try {
            aVar.onConnected(d().getVersion());
        } catch (RemoteException e) {
            CoreExtKt.logger.e("SppApiCall", "onUnauthConnected: ", e);
        }
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void removeBond() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: w6o
            @Override // java.lang.Runnable
            public final void run() {
                this.f37669a.e();
            }
        }, 1500L);
    }
}
