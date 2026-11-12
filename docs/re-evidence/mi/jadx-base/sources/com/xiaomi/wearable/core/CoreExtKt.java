package com.xiaomi.wearable.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.IBinder;
import android.util.ArrayMap;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.client.Logger;
import com.xiaomi.wearable.core.client.ServiceStateListener;
import com.xiaomi.wearable.core.server.PermissionChecker;
import com.xiaomi.wearable.utils.SharedPreferencesUtil;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0002\u001a\u001f\u0010\f\u001a\u00020\u000b*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\"\"\u0010\u001a\u001a\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0002\"\u0004\b\u001d\u0010\u001e\"\u001b\u0010\"\u001a\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0002\"\u001b\u0010%\u001a\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u0002\"\u001b\u0010(\u001a\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0002\"\u001d\u0010-\u001a\u0004\u0018\u00010)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,\"\u001b\u00100\u001a\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\u0002\"$\u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u000f\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u00104\"\"\u00105\u001a\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001b\u001a\u0004\b6\u0010\u0002\"\u0004\b7\u0010\u001e\"\"\u00109\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\"\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\"\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\"$\u0010N\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010\u0002\"\u0004\bO\u0010\u001e\"\u0011\u0010R\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"", "requirePermission", "()Z", "useLyra", "isFixedDeadlock", "", "targetPackageName", "()Ljava/lang/String;", "isPlayChannel", "Landroid/util/ArrayMap;", "Lcom/xiaomi/wearable/core/e;", "", "removeRemote", "(Landroid/util/ArrayMap;)V", "TAG", "Ljava/lang/String;", "", "CAPABILITY_SUPPORT_LYRA", "I", "", "LYRA_VERSION", "J", "getLYRA_VERSION", "()J", "setLYRA_VERSION", "(J)V", "lyraConnection", "Z", "getLyraConnection", "setLyraConnection", "(Z)V", "supportLyra$delegate", "Lkotlin/Lazy;", "getSupportLyra", "supportLyra", "inLyra$delegate", "getInLyra", "inLyra", "hasLyraPermission$delegate", "getHasLyraPermission", "hasLyraPermission", "Landroid/content/pm/ResolveInfo;", "resolveInfo$delegate", "getResolveInfo", "()Landroid/content/pm/ResolveInfo;", "resolveInfo", "hasLyra$delegate", "getHasLyra", "hasLyra", "channel", "getChannel", "setChannel", "(Ljava/lang/String;)V", "clearLyra", "getClearLyra", "setClearLyra", "Lcom/xiaomi/wearable/core/client/ServiceStateListener;", "serviceStateListener", "Lcom/xiaomi/wearable/core/client/ServiceStateListener;", "getServiceStateListener", "()Lcom/xiaomi/wearable/core/client/ServiceStateListener;", "setServiceStateListener", "(Lcom/xiaomi/wearable/core/client/ServiceStateListener;)V", "Lcom/xiaomi/wearable/core/client/Logger;", "logger", "Lcom/xiaomi/wearable/core/client/Logger;", "getLogger", "()Lcom/xiaomi/wearable/core/client/Logger;", "setLogger", "(Lcom/xiaomi/wearable/core/client/Logger;)V", "Lcom/xiaomi/wearable/core/IReporter;", "reporter", "Lcom/xiaomi/wearable/core/IReporter;", "getReporter", "()Lcom/xiaomi/wearable/core/IReporter;", "setReporter", "(Lcom/xiaomi/wearable/core/IReporter;)V", "value", "isLyraEnabled", "setLyraEnabled", "getLyraVersion", "()I", "lyraVersion", "miwear-core_release"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCoreExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreExt.kt\ncom/xiaomi/wearable/core/CoreExtKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,159:1\n216#2,2:160\n*S KotlinDebug\n*F\n+ 1 CoreExt.kt\ncom/xiaomi/wearable/core/CoreExtKt\n*L\n145#1:160,2\n*E\n"})
public final class CoreExtKt {
    public static final int CAPABILITY_SUPPORT_LYRA = 2048;
    private static long LYRA_VERSION = 0;

    @NotNull
    private static final String TAG = "CoreExt";

    @Nullable
    private static String channel;
    private static boolean clearLyra;
    public static Logger logger;
    private static volatile boolean lyraConnection;
    public static IReporter reporter;
    public static ServiceStateListener serviceStateListener;

    @NotNull
    private static final Lazy supportLyra$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kl4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(CoreExtKt.supportLyra_delegate$lambda$0());
        }
    });

    @NotNull
    private static final Lazy inLyra$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ml4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(CoreExtKt.inLyra_delegate$lambda$1());
        }
    });

    @NotNull
    private static final Lazy hasLyraPermission$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ol4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(CoreExtKt.hasLyraPermission_delegate$lambda$3());
        }
    });

    @NotNull
    private static final Lazy resolveInfo$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pl4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CoreExtKt.resolveInfo_delegate$lambda$4();
        }
    });

    @NotNull
    private static final Lazy hasLyra$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ql4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(CoreExtKt.hasLyra_delegate$lambda$5());
        }
    });

    @Nullable
    public static final String getChannel() {
        return channel;
    }

    public static final boolean getClearLyra() {
        return clearLyra;
    }

    public static final boolean getHasLyra() {
        return ((Boolean) hasLyra$delegate.getValue()).booleanValue();
    }

    public static final boolean getHasLyraPermission() {
        return ((Boolean) hasLyraPermission$delegate.getValue()).booleanValue();
    }

    public static final boolean getInLyra() {
        return ((Boolean) inLyra$delegate.getValue()).booleanValue();
    }

    public static final long getLYRA_VERSION() {
        return LYRA_VERSION;
    }

    @NotNull
    public static final Logger getLogger() {
        Logger logger2 = logger;
        if (logger2 != null) {
            return logger2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logger");
        return null;
    }

    public static final boolean getLyraConnection() {
        return lyraConnection;
    }

    public static final int getLyraVersion() {
        try {
            return com.xiaomi.wearable.CoreExtKt.getContext().getPackageManager().getPackageInfo(com.xiaomi.wearable.CoreExtKt.lyraPackageName, 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    @NotNull
    public static final IReporter getReporter() {
        IReporter iReporter = reporter;
        if (iReporter != null) {
            return iReporter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporter");
        return null;
    }

    @Nullable
    public static final ResolveInfo getResolveInfo() {
        return (ResolveInfo) resolveInfo$delegate.getValue();
    }

    @NotNull
    public static final ServiceStateListener getServiceStateListener() {
        ServiceStateListener serviceStateListener2 = serviceStateListener;
        if (serviceStateListener2 != null) {
            return serviceStateListener2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serviceStateListener");
        return null;
    }

    public static final boolean getSupportLyra() {
        return ((Boolean) supportLyra$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasLyraPermission_delegate$lambda$3() {
        if (Intrinsics.areEqual(com.xiaomi.wearable.CoreExtKt.getCallingPackage(), "com.xiaomi.wearable") && requirePermission()) {
            return PermissionChecker.INSTANCE.checkPermission("com.xiaomi.mi_connect_service.permission.MI_WEAR_CORE");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasLyra_delegate$lambda$5() {
        return com.xiaomi.wearable.CoreExtKt.isAppInstalled(com.xiaomi.wearable.CoreExtKt.lyraPackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean inLyra_delegate$lambda$1() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        String processName = Application.getProcessName();
        Intrinsics.checkNotNull(processName);
        return StringsKt__StringsJVMKt.startsWith$default(processName, com.xiaomi.wearable.CoreExtKt.lyraPackageName, false, 2, null);
    }

    public static final boolean isFixedDeadlock() {
        boolean z = LYRA_VERSION >= 4001122;
        getLogger().i(TAG, "isFixedDeadlock() returned: " + z);
        return z;
    }

    public static final boolean isLyraEnabled() {
        boolean z = SharedPreferencesUtil.INSTANCE.getBoolean("version_v3_" + getLyraVersion(), true);
        getLogger().i(TAG, "lyraVersion " + getLyraVersion() + ", isLyraEnabled " + z);
        return z;
    }

    public static final boolean isPlayChannel() {
        return Intrinsics.areEqual(channel, "com.xiaomi.wearable");
    }

    public static final void removeRemote(@NotNull ArrayMap<String, e> arrayMap) {
        e value;
        IBinder iBinderAsBinder;
        IBinder iBinderAsBinder2;
        Intrinsics.checkNotNullParameter(arrayMap, "<this>");
        getLogger().i(TAG, "removeRemote() called");
        for (Map.Entry<String, e> entry : arrayMap.entrySet()) {
            Logger logger2 = getLogger();
            String key = entry.getKey();
            e value2 = entry.getValue();
            e value3 = entry.getValue();
            logger2.i(TAG, "removeRemote() called key " + ((Object) key) + ", value " + value2 + ", is binder alive " + ((value3 == null || (iBinderAsBinder2 = value3.asBinder()) == null) ? null : Boolean.valueOf(iBinderAsBinder2.isBinderAlive())));
            if (entry.getKey() != null && entry.getValue() != null && (value = entry.getValue()) != null && (iBinderAsBinder = value.asBinder()) != null && !iBinderAsBinder.isBinderAlive()) {
                Logger logger3 = getLogger();
                String key2 = entry.getKey();
                logger3.i(TAG, "removeRemote() " + ((Object) key2) + ", " + entry.getValue());
                arrayMap.remove(entry.getKey());
            }
        }
    }

    public static final boolean requirePermission() {
        ResolveInfo resolveInfo = getResolveInfo();
        if (resolveInfo == null) {
            return false;
        }
        String str = resolveInfo.serviceInfo.permission;
        getLogger().i(TAG, "requirePermission() called " + str);
        return !(str == null || str.length() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolveInfo resolveInfo_delegate$lambda$4() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(com.xiaomi.wearable.CoreExtKt.lyraPackageName, "com.xiaomi.wearable.core.MiWearCoreService"));
        ResolveInfo resolveInfoResolveService = com.xiaomi.wearable.CoreExtKt.getContext().getPackageManager().resolveService(intent, 0);
        long longVersionCode = 0;
        if (resolveInfoResolveService != null && Build.VERSION.SDK_INT >= 28) {
            longVersionCode = com.xiaomi.wearable.CoreExtKt.getContext().getPackageManager().getPackageInfo(com.xiaomi.wearable.CoreExtKt.lyraPackageName, 0).getLongVersionCode();
        }
        LYRA_VERSION = longVersionCode;
        getLogger().i(TAG, "resolveInfo() called " + resolveInfoResolveService + ", " + LYRA_VERSION);
        return resolveInfoResolveService;
    }

    public static final void setChannel(@Nullable String str) {
        channel = str;
    }

    public static final void setClearLyra(boolean z) {
        clearLyra = z;
    }

    public static final void setLYRA_VERSION(long j) {
        LYRA_VERSION = j;
    }

    public static final void setLogger(@NotNull Logger logger2) {
        Intrinsics.checkNotNullParameter(logger2, "<set-?>");
        logger = logger2;
    }

    public static final void setLyraConnection(boolean z) {
        lyraConnection = z;
    }

    public static final void setLyraEnabled(boolean z) {
        SharedPreferencesUtil.INSTANCE.setBoolean("version_v2_" + getLyraVersion(), z);
    }

    public static final void setReporter(@NotNull IReporter iReporter) {
        Intrinsics.checkNotNullParameter(iReporter, "<set-?>");
        reporter = iReporter;
    }

    public static final void setServiceStateListener(@NotNull ServiceStateListener serviceStateListener2) {
        Intrinsics.checkNotNullParameter(serviceStateListener2, "<set-?>");
        serviceStateListener = serviceStateListener2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean supportLyra_delegate$lambda$0() {
        boolean z = false;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            z = getResolveInfo() != null;
            getLogger().i(TAG, "supportLyra() called " + (System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Exception e) {
            getLogger().e("", "has feature error", e);
            e.printStackTrace();
        }
        return z;
    }

    @NotNull
    public static final String targetPackageName() {
        return getResolveInfo() != null ? com.xiaomi.wearable.CoreExtKt.lyraPackageName : "com.xiaomi.lyra";
    }

    public static final boolean useLyra() {
        boolean supportLyra = getSupportLyra();
        boolean zIsLyraEnabled = isLyraEnabled();
        boolean hasLyraPermission = getHasLyraPermission();
        getLogger().i(TAG, "useLyra() called supportLyra:" + supportLyra + ", enable:" + zIsLyraEnabled + ", permission:" + hasLyraPermission);
        return supportLyra && zIsLyraEnabled && hasLyraPermission;
    }
}
