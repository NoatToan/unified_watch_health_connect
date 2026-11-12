package com.xiaomi.wearable.connection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/xiaomi/wearable/connection/RealConnection$sceneRunnable$1", "Ljava/lang/Runnable;", "scene", "", "getScene", "()I", "setScene", "(I)V", "run", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RealConnection$sceneRunnable$1 implements Runnable {
    private int scene;
    final /* synthetic */ RealConnection this$0;

    public RealConnection$sceneRunnable$1(RealConnection realConnection) {
        this.this$0 = realConnection;
    }

    public final int getScene() {
        return this.scene;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.this$0.isConnect() || !this.this$0.isReconnectEnable()) {
            return;
        }
        RealConnection realConnection = this.this$0;
        if (realConnection.needRetryConnect(realConnection.lastConnectFailureCode)) {
            this.this$0.connect(false, false, this.scene);
        }
    }

    public final void setScene(int i) {
        this.scene = i;
    }
}
