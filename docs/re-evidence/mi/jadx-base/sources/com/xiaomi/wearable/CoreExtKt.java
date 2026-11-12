package com.xiaomi.wearable;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.provider.Settings;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.wearable.CoreExtKt;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007\u001a\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007\u001a\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u001a#\u0010\u001c\u001a\u00020\u0018*\u00020\u00012\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u001e\"\u00020\u0007¢\u0006\u0002\u0010\u001f\u001a\u0006\u0010 \u001a\u00020\u0018\u001a\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018\u001a$\u0010#\u001a\u00020\u00182\n\u0010$\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0018H\u0002\u001a\u0006\u0010(\u001a\u00020)\u001a\u0006\u0010*\u001a\u00020\u0018\u001a\u0006\u0010+\u001a\u00020\u0018\u001a\u000e\u0010.\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007\u001a\n\u0010/\u001a\u00020\u0018*\u00020\u0001\u001a4\u00100\u001a\u000201\"\b\b\u0000\u00102*\u000203*\b\u0012\u0004\u0012\u0002H2042\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u0002H2\u0012\u0004\u0012\u00020106H\u0086\bø\u0001\u0000\u001a<\u00107\u001a\u000201\"\b\b\u0000\u00102*\u000203*\b\u0012\u0004\u0012\u0002H2042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u0002H2\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020108H\u0086\bø\u0001\u0000\"\u001e\u0010\u0000\u001a\u00020\u00018\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0011\u0010,\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "packageChina", "", "packageGlobal", "lyraPackageName", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "thread", "Landroid/os/HandlerThread;", "getThread", "()Landroid/os/HandlerThread;", "thread$delegate", "workerHandler", "getWorkerHandler", "isHealthApp", "", "packageName", "isLyraApp", "getCallingPackage", "isPermissionGranted", "permissions", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "hasPermission", "checkIsMiui", "onlyDev", "getStaticBooleanField", "buildClass", "Ljava/lang/Class;", "fieldName", "defaultValue", "getBluetoothState", "", "isBluetoothEnabled", "isBluetoothRestrict", "isMainThread", "()Z", "isAppInstalled", "isBackground", "forEach", "", "T", "Landroid/os/IInterface;", "Landroid/os/RemoteCallbackList;", "action", "Lkotlin/Function1;", "forEachWithCookie", "Lkotlin/Function2;", "", "miwear-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CoreExtKt {

    @SuppressLint({"StaticFieldLeak"})
    public static Context context = null;

    @NotNull
    public static final String lyraPackageName = "com.xiaomi.mi_connect_service";

    @NotNull
    public static final String packageChina = "com.mi.health";

    @NotNull
    public static final String packageGlobal = "com.xiaomi.wearable";

    @NotNull
    private static final Lazy handler$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ll4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CoreExtKt.handler_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy thread$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nl4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CoreExtKt.thread_delegate$lambda$1();
        }
    });

    @NotNull
    private static final Handler workerHandler = new Handler(getThread().getLooper());

    public static final boolean checkIsMiui(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("miui.os.Build");
        } catch (Exception e) {
            e.printStackTrace();
            cls = null;
        }
        boolean staticBooleanField = false;
        if (cls != null) {
            staticBooleanField = getStaticBooleanField(cls, z ? "IS_DEVELOPMENT_VERSION" : "IS_STABLE_VERSION", false);
        }
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i("CoreExt", "checkIsMiui() called with: result = " + staticBooleanField);
        return staticBooleanField;
    }

    public static final <T extends IInterface> void forEach(@NotNull RemoteCallbackList<T> remoteCallbackList, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(remoteCallbackList, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                        Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                        action.invoke(broadcastItem);
                    }
                    InlineMarker.finallyStart(1);
                    remoteCallbackList.finishBroadcast();
                } catch (Exception unused) {
                    com.xiaomi.wearable.core.CoreExtKt.getLogger().e("forEach", "An exception occurred when finishBroadcast");
                }
            } catch (Exception e) {
                com.xiaomi.wearable.core.CoreExtKt.getLogger().e("forEach", "An exception occurred during RemoteCallbackList forEach", e);
                InlineMarker.finallyStart(1);
                remoteCallbackList.finishBroadcast();
            }
        } finally {
            InlineMarker.finallyStart(1);
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception unused2) {
                com.xiaomi.wearable.core.CoreExtKt.getLogger().e("forEach", "An exception occurred when finishBroadcast");
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <T extends IInterface> void forEachWithCookie(@NotNull RemoteCallbackList<T> remoteCallbackList, @NotNull Function2<? super T, Object, Unit> action) {
        Intrinsics.checkNotNullParameter(remoteCallbackList, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            try {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                    Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                    action.invoke(broadcastItem, remoteCallbackList.getBroadcastCookie(i));
                }
                InlineMarker.finallyStart(1);
                remoteCallbackList.finishBroadcast();
            } catch (Exception e) {
                com.xiaomi.wearable.core.CoreExtKt.getLogger().e("forEachWithCookie", "An exception occurred during RemoteCallbackList forEach", e);
                InlineMarker.finallyStart(1);
                remoteCallbackList.finishBroadcast();
            } finally {
                InlineMarker.finallyStart(1);
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception unused) {
                    com.xiaomi.wearable.core.CoreExtKt.getLogger().e("forEachWithCookie", "An exception occurred when finishBroadcast");
                }
                InlineMarker.finallyEnd(1);
            }
        } catch (Exception unused2) {
            com.xiaomi.wearable.core.CoreExtKt.getLogger().e("forEachWithCookie", "An exception occurred when finishBroadcast");
        }
    }

    public static final int getBluetoothState() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.getState();
        }
        return 10;
    }

    @Nullable
    public static final String getCallingPackage() {
        try {
            return getContext().getPackageManager().getNameForUid(Binder.getCallingUid());
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public static final Context getContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    @NotNull
    public static final Handler getHandler() {
        return (Handler) handler$delegate.getValue();
    }

    private static final boolean getStaticBooleanField(Class<?> cls, String str, boolean z) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.getBoolean(null);
        } catch (Exception unused) {
            return z;
        }
    }

    private static final HandlerThread getThread() {
        return (HandlerThread) thread$delegate.getValue();
    }

    @NotNull
    public static final Handler getWorkerHandler() {
        return workerHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    public static final boolean hasPermission() {
        return Build.VERSION.SDK_INT < 31 || isPermissionGranted(getContext(), "android.permission.BLUETOOTH_CONNECT");
    }

    public static final boolean isAppInstalled(@NotNull String packageName) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            packageInfo = getContext().getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static final boolean isBackground(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<this>");
        Object systemService = context2.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        while (true) {
            boolean z = true;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                if (Intrinsics.areEqual(runningAppProcessInfo.processName, context2.getPackageName())) {
                    int i = runningAppProcessInfo.importance;
                    if (i != 400 && (i == 100 || i == 200)) {
                        z = false;
                    }
                }
            }
            return z;
        }
    }

    public static final boolean isBluetoothEnabled() {
        return getBluetoothState() == 12 && !isBluetoothRestrict();
    }

    public static final boolean isBluetoothRestrict() {
        boolean z = false;
        try {
            if (Settings.Global.getInt(getContext().getContentResolver(), "bluetooth_restricte_state", 0) == 1) {
                z = true;
            }
        } catch (Exception unused) {
        }
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i("CoreExt", "isBluetoothRestrict() called " + z);
        return z;
    }

    public static final boolean isHealthApp(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return Intrinsics.areEqual(packageName, "com.mi.health") || Intrinsics.areEqual(packageName, "com.xiaomi.wearable");
    }

    public static final boolean isLyraApp(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return Intrinsics.areEqual(packageName, lyraPackageName);
    }

    public static final boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static final boolean isPermissionGranted(@NotNull Context context2, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(context2, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        for (String str : permissions) {
            if (context2.checkSelfPermission(str) != 0) {
                if (str == null) {
                    return true;
                }
                return false;
            }
        }
        str = null;
        if (str == null) {
            return true;
        }
        return false;
    }

    public static final void setContext(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        context = context2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandlerThread thread_delegate$lambda$1() {
        HandlerThread handlerThread = new HandlerThread("DeviceStateThread");
        handlerThread.start();
        return handlerThread;
    }
}
