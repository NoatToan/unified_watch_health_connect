package com.xiaomi.wearable.core.client;

import com.xiaomi.wearable.connection.IDeviceStateListener;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.client.DeviceStateAdapter;
import com.xiaomi.wearable.core.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0006¨\u0006$"}, d2 = {"Lcom/xiaomi/wearable/core/client/DeviceStateAdapter;", "Lcom/xiaomi/wearable/core/d$a;", "", "did", "", "onConnectStart", "(Ljava/lang/String;)V", "onConnectSuccess", "", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onDisconnect", "onDeviceLost", "onDeviceFound", "onServiceDisconnected", "()V", "", "Lcom/xiaomi/wearable/connection/IDeviceStateListener;", "stateListeners", "Ljava/util/List;", "", "connected", "Z", "getConnected", "()Z", "setConnected", "(Z)V", "Ljava/lang/String;", "getDid", "()Ljava/lang/String;", "setDid", "<init>", "(Ljava/util/List;)V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceStateAdapter.kt\ncom/xiaomi/wearable/core/client/DeviceStateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1863#2,2:91\n1863#2,2:93\n1863#2,2:95\n1863#2,2:97\n1863#2,2:99\n1863#2,2:101\n*S KotlinDebug\n*F\n+ 1 DeviceStateAdapter.kt\ncom/xiaomi/wearable/core/client/DeviceStateAdapter\n*L\n16#1:91,2\n25#1:93,2\n37#1:95,2\n50#1:97,2\n61#1:99,2\n75#1:101,2\n*E\n"})
public final class DeviceStateAdapter extends d.a {

    @NotNull
    private static final String TAG = "DeviceStateAdapter";
    private boolean connected;

    @NotNull
    private String did;

    @NotNull
    private final List<IDeviceStateListener> stateListeners;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceStateAdapter(@NotNull List<? extends IDeviceStateListener> stateListeners) {
        Intrinsics.checkNotNullParameter(stateListeners, "stateListeners");
        this.stateListeners = stateListeners;
        this.did = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConnectFailure$lambda$5(DeviceStateAdapter this$0, String did, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        for (IDeviceStateListener iDeviceStateListener : this$0.stateListeners) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            iDeviceStateListener.onConnectFailure(did, i, i2);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis2 > 1000) {
                CoreExtKt.getLogger().i(TAG, "onConnectFailure() cost = " + jCurrentTimeMillis2 + " , " + iDeviceStateListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConnectStart$lambda$1(DeviceStateAdapter this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Iterator<T> it = this$0.stateListeners.iterator();
        while (it.hasNext()) {
            ((IDeviceStateListener) it.next()).onConnectStart(did);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConnectSuccess$lambda$3(DeviceStateAdapter this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Iterator<T> it = this$0.stateListeners.iterator();
        while (it.hasNext()) {
            ((IDeviceStateListener) it.next()).onConnectSuccess(did);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeviceFound$lambda$11(DeviceStateAdapter this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Iterator<T> it = this$0.stateListeners.iterator();
        while (it.hasNext()) {
            ((IDeviceStateListener) it.next()).onDeviceFound(did);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeviceLost$lambda$9(DeviceStateAdapter this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Iterator<T> it = this$0.stateListeners.iterator();
        while (it.hasNext()) {
            ((IDeviceStateListener) it.next()).onDeviceLost(did);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDisconnect$lambda$7(DeviceStateAdapter this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Iterator<T> it = this$0.stateListeners.iterator();
        while (it.hasNext()) {
            ((IDeviceStateListener) it.next()).onDisconnect(did);
        }
    }

    public final boolean getConnected() {
        return this.connected;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Override // com.xiaomi.wearable.core.d
    public void onConnectFailure(@NotNull final String did, final int errorCode, final int retryTimes) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "onConnectFailure() called with: did = " + did + ", errorCode = " + errorCode + ", retryTimes = " + retryTimes);
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: sp6
            @Override // java.lang.Runnable
            public final void run() {
                DeviceStateAdapter.onConnectFailure$lambda$5(this.f33851a, did, errorCode, retryTimes);
            }
        });
    }

    @Override // com.xiaomi.wearable.core.d
    public void onConnectStart(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "onConnectStart() called with: did = " + did);
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: vp6
            @Override // java.lang.Runnable
            public final void run() {
                DeviceStateAdapter.onConnectStart$lambda$1(this.f37099a, did);
            }
        });
    }

    @Override // com.xiaomi.wearable.core.d
    public void onConnectSuccess(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "onConnectSuccess() called with: did = " + did);
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: up6
            @Override // java.lang.Runnable
            public final void run() {
                DeviceStateAdapter.onConnectSuccess$lambda$3(this.f35992a, did);
            }
        });
    }

    @Override // com.xiaomi.wearable.core.d
    public void onDeviceFound(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "onDeviceFound() called with: did = " + did + ", listenerSize = " + this.stateListeners.size());
        this.did = did;
        this.connected = true;
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: rp6
            @Override // java.lang.Runnable
            public final void run() {
                DeviceStateAdapter.onDeviceFound$lambda$11(this.f32766a, did);
            }
        });
    }

    @Override // com.xiaomi.wearable.core.d
    public void onDeviceLost(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "onDeviceLost() called with: did = " + did);
        this.did = "";
        this.connected = false;
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: qp6
            @Override // java.lang.Runnable
            public final void run() {
                DeviceStateAdapter.onDeviceLost$lambda$9(this.f31710a, did);
            }
        });
    }

    @Override // com.xiaomi.wearable.core.d
    public void onDisconnect(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: tp6
            @Override // java.lang.Runnable
            public final void run() {
                DeviceStateAdapter.onDisconnect$lambda$7(this.f34908a, did);
            }
        });
    }

    public final void onServiceDisconnected() {
        if (this.connected) {
            onDisconnect(this.did);
        }
    }

    public final void setConnected(boolean z) {
        this.connected = z;
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }
}
