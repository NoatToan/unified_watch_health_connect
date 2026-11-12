package com.xiaomi.wearable;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.ouc;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0004R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/wearable/NearbyService;", "", "", "hackBindService", "()V", "bindServiceSync", "", "mac", "createBondWithoutDialog", "(Ljava/lang/String;)V", "unbind", "Louc;", "nearbyApiService", "Louc;", "Lcom/xiaomi/wearable/NearbyService$OnBondCallback;", "mCallback", "Lcom/xiaomi/wearable/NearbyService$OnBondCallback;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/content/ServiceConnection;", "Ljava/util/concurrent/CountDownLatch;", "mCountDownLatch", "Ljava/util/concurrent/CountDownLatch;", "TAG", "Ljava/lang/String;", "<init>", "OnBondCallback", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class NearbyService {

    @NotNull
    private static final String TAG = "NearbyService";

    @Nullable
    private static OnBondCallback mCallback;

    @Nullable
    private static CountDownLatch mCountDownLatch;

    @Nullable
    private static ouc nearbyApiService;

    @NotNull
    public static final NearbyService INSTANCE = new NearbyService();

    @NotNull
    private static final ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.xiaomi.wearable.NearbyService$serviceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            com.xiaomi.wearable.core.CoreExtKt.getLogger().i("NearbyService", "onServiceConnected() called with: name = " + name + ", service = " + service);
            NearbyService nearbyService = NearbyService.INSTANCE;
            NearbyService.nearbyApiService = ouc.a.s2(service);
            if (NearbyService.mCountDownLatch != null) {
                CountDownLatch countDownLatch = NearbyService.mCountDownLatch;
                Intrinsics.checkNotNull(countDownLatch);
                countDownLatch.countDown();
                NearbyService.mCountDownLatch = null;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            com.xiaomi.wearable.core.CoreExtKt.getLogger().i("NearbyService", "onServiceDisconnected() called with: name = " + name);
            NearbyService.nearbyApiService = null;
        }
    };

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/wearable/NearbyService$OnBondCallback;", "", "onCallback", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnBondCallback {
        void onCallback();
    }

    private NearbyService() {
    }

    private final void bindServiceSync() throws InterruptedException {
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "bindServiceSync() called");
        Intent intent = new Intent();
        intent.setAction("miui.bluetooth.mible.MiuiNearbyApiService");
        intent.setPackage("com.xiaomi.bluetooth");
        if (CoreExtKt.getContext().bindService(intent, serviceConnection, 1)) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            mCountDownLatch = countDownLatch;
            Intrinsics.checkNotNull(countDownLatch);
            countDownLatch.await(1L, TimeUnit.SECONDS);
        }
    }

    private final void hackBindService() throws InterruptedException {
        if (nearbyApiService == null) {
            bindServiceSync();
        }
    }

    public final void createBondWithoutDialog(@NotNull String mac) throws InterruptedException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        hackBindService();
        ouc oucVar = nearbyApiService;
        if (oucVar != null) {
            com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "createBondWithoutDialog() called");
            try {
                oucVar.h0(mac, 1);
            } catch (Exception unused) {
                com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "createBondWithoutDialog() dead object");
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void unbind() {
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "unbind() called");
        CoreExtKt.getContext().unbindService(serviceConnection);
        nearbyApiService = null;
        mCallback = null;
    }
}
