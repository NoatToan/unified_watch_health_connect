package com.xiaomi.wearable.core;

import android.content.Intent;
import com.xiaomi.wearable.core.HealthAppKeeperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\b\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0016\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"TAG", "", "ACTION_BLUETOOTH_NOTIFY_APP_DEVICE_FOUND", "last", "", "startHealthApp", "", "startHealthService", "powerKeepBroadcast", "func", "Lkotlin/Function0;", "miwear-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HealthAppKeeperKt {

    @NotNull
    private static final String ACTION_BLUETOOTH_NOTIFY_APP_DEVICE_FOUND = "android.miuibluetooth.action.notifyappdevicefound";

    @NotNull
    private static final String TAG = "HealthAppKeeper";
    private static long last;

    private static final void powerKeepBroadcast(final Function0<Unit> function0) {
        CoreExtKt.getLogger().i(TAG, "powerKeepBroadcast() called ");
        if (CoreExtKt.getChannel() != null) {
            Intent intent = new Intent(ACTION_BLUETOOTH_NOTIFY_APP_DEVICE_FOUND);
            intent.setPackage("com.miui.powerkeeper");
            intent.putExtra("thirdty_apps_start", CoreExtKt.getChannel());
            intent.putExtra("event", 9);
            com.xiaomi.wearable.CoreExtKt.getContext().sendBroadcast(intent, "miui.permission.USE_INTERNAL_GENERAL_API");
            com.xiaomi.wearable.CoreExtKt.getHandler().postDelayed(new Runnable() { // from class: fob
                @Override // java.lang.Runnable
                public final void run() {
                    HealthAppKeeperKt.powerKeepBroadcast$lambda$3$lambda$2$lambda$1(function0);
                }
            }, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void powerKeepBroadcast$lambda$3$lambda$2$lambda$1(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static final void startHealthApp() {
        CoreExtKt.getLogger().i(TAG, "startHealthApp() called");
        if (System.currentTimeMillis() - last <= 3000) {
            CoreExtKt.getLogger().i(TAG, "startHealthApp() starting");
        } else {
            last = System.currentTimeMillis();
            powerKeepBroadcast(new Function0() { // from class: eob
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HealthAppKeeperKt.startHealthApp$lambda$0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startHealthApp$lambda$0() {
        startHealthService();
        return Unit.INSTANCE;
    }

    private static final void startHealthService() {
        CoreExtKt.getLogger().i(TAG, "startHealthService() called");
        try {
            Intent intent = new Intent(CoreExtKt.getChannel() + ".KeepAliveService.START");
            intent.setPackage(CoreExtKt.getChannel());
            com.xiaomi.wearable.CoreExtKt.getContext().startService(intent);
        } catch (Exception e) {
            CoreExtKt.getLogger().i(TAG, "startHealthApp() called, e: " + e);
            e.printStackTrace();
        }
    }
}
