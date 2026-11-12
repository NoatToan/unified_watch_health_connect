package com.xiaomi.fitness.auto.start;

import android.content.Context;
import com.xiaomi.fitness.auto.start.AutoStarterImpl;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import defpackage.zr1;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J;\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0015\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u001a\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/auto/start/AutoStarterImpl;", "Lcom/xiaomi/fitness/auto/start/AutoStarter;", "<init>", "()V", "PERMISSION_AUTO_START", "", "TAG", "canAutoStart", "", "context", "Landroid/content/Context;", "setAutoStart", "", "enableByUser", "key", "result", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/PermissionBuilder;", "Lkotlin/ExtensionFunctionType;", "getAutoStartByWho", "", "isAppNeedAutoStart", "openAutoStartOnce", "getAllKeys", "", "()[Ljava/lang/String;", "setEnable", "enable", "getEnable", "defVal", "auto-start_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutoStarterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoStarterImpl.kt\ncom/xiaomi/fitness/auto/start/AutoStarterImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,130:1\n13402#2,2:131\n13402#2,2:133\n13402#2,2:135\n*S KotlinDebug\n*F\n+ 1 AutoStarterImpl.kt\ncom/xiaomi/fitness/auto/start/AutoStarterImpl\n*L\n56#1:131,2\n83#1:133,2\n93#1:135,2\n*E\n"})
public final class AutoStarterImpl implements AutoStarter {

    @NotNull
    public static final AutoStarterImpl INSTANCE = new AutoStarterImpl();

    @NotNull
    private static final String PERMISSION_AUTO_START = "auto_start";

    @NotNull
    private static final String TAG = "AutoStarter";

    private AutoStarterImpl() {
    }

    private final String[] getAllKeys() {
        return AutoStartPreference.INSTANCE.getAllKeys();
    }

    private final boolean getEnable(String key, boolean defVal) {
        return ((Boolean) AutoStartPreference.INSTANCE.getValue(key, Boolean.valueOf(defVal))).booleanValue();
    }

    public static /* synthetic */ boolean getEnable$default(AutoStarterImpl autoStarterImpl, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return autoStarterImpl.getEnable(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openAutoStartOnce$lambda$6(PermissionBuilder setAutoStart) {
        Intrinsics.checkNotNullParameter(setAutoStart, "$this$setAutoStart");
        setAutoStart.granted(new Function1() { // from class: bs1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AutoStarterImpl.openAutoStartOnce$lambda$6$lambda$4((String) obj);
            }
        });
        setAutoStart.denied(new Function1() { // from class: cs1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AutoStarterImpl.openAutoStartOnce$lambda$6$lambda$5((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openAutoStartOnce$lambda$6$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AutoStartPreference.INSTANCE.setOPEN_ONCE(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openAutoStartOnce$lambda$6$lambda$5(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AutoStartPreference.INSTANCE.setOPEN_ONCE(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAutoStart$lambda$1(PermissionBuilder permissionBuilder, int i) {
        Function1<String, Unit> denied;
        Function1<String, Unit> granted;
        Logger.i("switchAutoStart code=" + i, new Object[0]);
        if (i == 1) {
            if (permissionBuilder == null || (granted = permissionBuilder.getGranted()) == null) {
                return;
            }
            granted.invoke2(PERMISSION_AUTO_START);
            return;
        }
        if (permissionBuilder == null || (denied = permissionBuilder.getDenied()) == null) {
            return;
        }
        denied.invoke2(PERMISSION_AUTO_START);
    }

    private final void setEnable(String key, boolean enable) {
        AutoStartPreference.INSTANCE.putValue(key, Boolean.valueOf(enable));
    }

    @Override // com.xiaomi.fitness.auto.start.AutoStarter
    public boolean canAutoStart(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iA = zr1.a(context);
        Logger.i(TAG, "checkAutoStart result = " + iA);
        return iA == 0;
    }

    @Override // com.xiaomi.fitness.auto.start.AutoStarter
    @NotNull
    public List<String> getAutoStartByWho() {
        LinkedList linkedList = new LinkedList();
        String[] allKeys = getAllKeys();
        if (allKeys != null) {
            for (String str : allKeys) {
                if (getEnable$default(INSTANCE, str, false, 2, null)) {
                    linkedList.add(str);
                }
            }
        }
        return linkedList;
    }

    @Override // com.xiaomi.fitness.auto.start.AutoStarter
    public boolean isAppNeedAutoStart() {
        String[] allKeys = getAllKeys();
        if (allKeys != null) {
            for (String str : allKeys) {
                if (getEnable$default(INSTANCE, str, false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.auto.start.AutoStarter
    public void openAutoStartOnce(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!RomUtils.INSTANCE.isMIUIRom(context) || AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        Logger.i(TAG, "canAutoStart = " + canAutoStart(context));
        if (AutoStartPreference.INSTANCE.getOPEN_ONCE()) {
            return;
        }
        setAutoStart(context, true, "app", new Function1() { // from class: ds1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AutoStarterImpl.openAutoStartOnce$lambda$6((PermissionBuilder) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.auto.start.AutoStarter
    public void setAutoStart(@NotNull Context context, boolean enableByUser, @NotNull String key, @Nullable Function1<? super PermissionBuilder, Unit> result) {
        final PermissionBuilder permissionBuilder;
        Function1<String, Unit> granted;
        Function1<String, Unit> denied;
        Function1<String, Unit> granted2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        setEnable(key, enableByUser);
        if (result != null) {
            permissionBuilder = new PermissionBuilder();
            result.invoke2(permissionBuilder);
        } else {
            permissionBuilder = null;
        }
        if (!enableByUser) {
            String[] allKeys = getAllKeys();
            if (allKeys != null) {
                for (String str : allKeys) {
                    if (getEnable$default(INSTANCE, str, false, 2, null)) {
                        Logger.i(TAG, "can't close because of " + str + " need auto start");
                        if (permissionBuilder == null || (denied = permissionBuilder.getDenied()) == null) {
                            return;
                        }
                        denied.invoke2(PERMISSION_AUTO_START);
                        return;
                    }
                }
            }
            if (!canAutoStart(context)) {
                Logger.i(TAG, "Have closed auto start");
                if (permissionBuilder == null || (granted = permissionBuilder.getGranted()) == null) {
                    return;
                }
                granted.invoke2(PERMISSION_AUTO_START);
                return;
            }
        } else if (canAutoStart(context)) {
            Logger.i(TAG, "Have opened auto start");
            if (permissionBuilder == null || (granted2 = permissionBuilder.getGranted()) == null) {
                return;
            }
            granted2.invoke2(PERMISSION_AUTO_START);
            return;
        }
        zr1.b(enableByUser, context, new zr1.b() { // from class: as1
            @Override // zr1.b
            public final void a(int i) {
                AutoStarterImpl.setAutoStart$lambda$1(permissionBuilder, i);
            }
        });
    }
}
