package com.xiaomi.wearable.connection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.wearable.connection.PowerKeeperReceiver;
import com.xiaomi.wearable.core.CoreExtKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0012J\b\u0010\u001c\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/wearable/connection/PowerKeeperReceiver;", "", "<init>", "()V", "TAG", "", "ACTION_SLEEP_CHANGED", "STATE_ENTER_SLEEP", "", "STATE_EXIT_SLEEP", "sleepReceiver", "Lcom/xiaomi/wearable/connection/PowerKeeperReceiver$SleepReceiver;", "getSleepReceiver", "()Lcom/xiaomi/wearable/connection/PowerKeeperReceiver$SleepReceiver;", "sleepReceiver$delegate", "Lkotlin/Lazy;", "list", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/wearable/connection/PowerKeeperReceiver$OnPhoneSleepListener;", "sleepMode", "", LoginPreferenceConfig.TYPE_REGISTER, "", "registerListener", "refreshSleepMode", "getSleepModeState", "addPhoneSleepState", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getPhoneIdleMode", "OnPhoneSleepListener", "SleepReceiver", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PowerKeeperReceiver {

    @NotNull
    private static final String ACTION_SLEEP_CHANGED = "com.miui.powerkeeper_sleep_changed";
    public static final int STATE_ENTER_SLEEP = 1;
    public static final int STATE_EXIT_SLEEP = 2;

    @NotNull
    private static final String TAG = "PowerKeeperReceiver";
    private static volatile boolean sleepMode;

    @NotNull
    public static final PowerKeeperReceiver INSTANCE = new PowerKeeperReceiver();

    /* JADX INFO: renamed from: sleepReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy sleepReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e5i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PowerKeeperReceiver.sleepReceiver_delegate$lambda$0();
        }
    });

    @NotNull
    private static final CopyOnWriteArrayList<OnPhoneSleepListener> list = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/wearable/connection/PowerKeeperReceiver$OnPhoneSleepListener;", "", "onSleepState", "", "state", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnPhoneSleepListener {
        void onSleepState(int state);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/connection/PowerKeeperReceiver$SleepReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPowerKeeperReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PowerKeeperReceiver.kt\ncom/xiaomi/wearable/connection/PowerKeeperReceiver$SleepReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1863#2,2:108\n*S KotlinDebug\n*F\n+ 1 PowerKeeperReceiver.kt\ncom/xiaomi/wearable/connection/PowerKeeperReceiver$SleepReceiver\n*L\n101#1:108,2\n*E\n"})
    public static final class SleepReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual(intent.getAction(), "android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
                CoreExtKt.getLogger().i(PowerKeeperReceiver.TAG, "SleepReceiver called with: context = " + context + ", intent = " + intent);
                boolean phoneIdleMode = PowerKeeperReceiver.INSTANCE.getPhoneIdleMode();
                Iterator it = PowerKeeperReceiver.list.iterator();
                while (it.hasNext()) {
                    ((OnPhoneSleepListener) it.next()).onSleepState(phoneIdleMode ? 1 : 2);
                }
            }
        }
    }

    private PowerKeeperReceiver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getPhoneIdleMode() {
        boolean z = false;
        try {
            PowerManager powerManager = (PowerManager) com.xiaomi.wearable.CoreExtKt.getContext().getSystemService("power");
            if (powerManager == null) {
                return false;
            }
            boolean zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
            CoreExtKt.getLogger().i(TAG, "getPhoneIdleMode() called " + zIsDeviceIdleMode);
            z = zIsDeviceIdleMode;
        } catch (Exception e) {
            CoreExtKt.getLogger().i(TAG, "getPhoneIdleMode() called exception " + e.getMessage());
        }
        sleepMode = z;
        return z;
    }

    private final SleepReceiver getSleepReceiver() {
        return (SleepReceiver) sleepReceiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshSleepMode$lambda$1() {
        sleepMode = INSTANCE.getPhoneIdleMode();
    }

    private final void registerListener() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                com.xiaomi.wearable.CoreExtKt.getContext().registerReceiver(getSleepReceiver(), intentFilter, 2);
            } else {
                com.xiaomi.wearable.CoreExtKt.getContext().registerReceiver(getSleepReceiver(), intentFilter);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepReceiver sleepReceiver_delegate$lambda$0() {
        return new SleepReceiver();
    }

    public final void addPhoneSleepState(@NotNull OnPhoneSleepListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArrayList<OnPhoneSleepListener> copyOnWriteArrayList = list;
        if (copyOnWriteArrayList.contains(listener)) {
            return;
        }
        copyOnWriteArrayList.add(listener);
    }

    public final boolean getSleepModeState() {
        return sleepMode;
    }

    public final void refreshSleepMode() {
        if (Intrinsics.areEqual(com.xiaomi.wearable.CoreExtKt.getContext().getPackageName(), "com.xiaomi.wearable")) {
            return;
        }
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: f5i
            @Override // java.lang.Runnable
            public final void run() {
                PowerKeeperReceiver.refreshSleepMode$lambda$1();
            }
        });
    }

    public final void register() {
        if (Intrinsics.areEqual(com.xiaomi.wearable.CoreExtKt.getContext().getPackageName(), "com.xiaomi.wearable")) {
            return;
        }
        registerListener();
        refreshSleepMode();
    }
}
