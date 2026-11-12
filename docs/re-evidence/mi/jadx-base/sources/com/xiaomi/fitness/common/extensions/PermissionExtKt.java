package com.xiaomi.fitness.common.extensions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.permission.MiuiPermission;
import com.xiaomi.fitness.common.permission.PermissionCheck;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.SystemProperties;
import defpackage.enk;
import defpackage.ni4;
import defpackage.psh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ak\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\b\u0006\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u00072#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0082\b\u001ad\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u000e\b\u0006\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u001a\b\u0006\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0011\u0012\u0004\u0012\u00020\u00010\u0007H\u0082\b¢\u0006\u0002\u0010\u0012\u001a7\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0015\u001aN\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0015¢\u0006\u0002\u0010\u0017\u001ak\u0010\u0000\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\b\u0006\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u00072#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0082\b\u001ad\u0010\u000b\u001a\u00020\u0001*\u00020\u00182\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u000e\b\u0006\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u001a\b\u0006\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0011\u0012\u0004\u0012\u00020\u00010\u0007H\u0082\b¢\u0006\u0002\u0010\u0019\u001a7\u0010\u0003\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0015\u001aN\u0010\f\u001a\u00020\u0001*\u00020\u00182\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0015¢\u0006\u0002\u0010\u001a\u001a#\u0010\u001b\u001a\u00020\u001c*\u00020\u001d2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004¢\u0006\u0002\u0010\u001e\u001a#\u0010\u001f\u001a\u00020\u001c*\u00020\u00182\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004¢\u0006\u0002\u0010 \u001a)\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011*\u00020\u00182\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004¢\u0006\u0002\u0010\"\u001a#\u0010\u001f\u001a\u00020\u001c*\u00020#2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004¢\u0006\u0002\u0010$\u001a)\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011*\u00020#2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004¢\u0006\u0002\u0010%\u001a)\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011*\u00020\u001d2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004¢\u0006\u0002\u0010'\u001a\u0006\u0010(\u001a\u00020\u001c¨\u0006)"}, d2 = {"requestPermission", "", "Landroidx/fragment/app/FragmentActivity;", "permission", "", "description", "granted", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "denied", "requestMultiplePermissions", "permissions", "", "descriptions", "allGranted", "Lkotlin/Function0;", "", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "extension", "Lcom/xiaomi/fitness/common/extensions/PermissionBuilder;", "Lkotlin/ExtensionFunctionType;", "Lcom/xiaomi/fitness/common/extensions/MultiplePermissionsBuilder;", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "isPermissionGranted", "", "Landroid/content/Context;", "(Landroid/content/Context;[Ljava/lang/String;)Z", "isPermissionDeniedForever", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;)Z", "checkPermissionDeniedForever", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;)Ljava/util/List;", "Landroid/app/Activity;", "(Landroid/app/Activity;[Ljava/lang/String;)Z", "(Landroid/app/Activity;[Ljava/lang/String;)Ljava/util/List;", "checkPermissions", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;", "supportMiuiPermissionEnable", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionExt.kt\ncom/xiaomi/fitness/common/extensions/PermissionExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,348:1\n28#1,22:349\n56#1,21:371\n124#1,22:392\n152#1,21:414\n3829#2:435\n4344#2,2:436\n3829#2:438\n4344#2,2:439\n3829#2:441\n4344#2,2:442\n*S KotlinDebug\n*F\n+ 1 PermissionExt.kt\ncom/xiaomi/fitness/common/extensions/PermissionExtKt\n*L\n90#1:349,22\n110#1:371,21\n187#1:392,22\n208#1:414,21\n292#1:435\n292#1:436,2\n313#1:438\n313#1:439,2\n324#1:441\n324#1:442,2\n*E\n"})
public final class PermissionExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.extensions.PermissionExtKt$requestMultiplePermissions$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 implements enk {
        final /* synthetic */ Function0<Unit> $allGranted;
        final /* synthetic */ Function1<List<String>, Unit> $denied;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function0<Unit> function0, Function1<? super List<String>, Unit> function1) {
            this.$allGranted = function0;
            this.$denied = function1;
        }

        @Override // defpackage.enk
        public final void onResult(boolean z, List<String> grantedList, List<String> deniedList) {
            Intrinsics.checkNotNullParameter(grantedList, "grantedList");
            Intrinsics.checkNotNullParameter(deniedList, "deniedList");
            PermissionCheck.INSTANCE.permissionOnResult(grantedList, deniedList);
            if (z) {
                this.$allGranted.invoke();
            } else {
                this.$denied.invoke2(deniedList);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.extensions.PermissionExtKt$requestMultiplePermissions$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 implements enk {
        final /* synthetic */ Function0<Unit> $allGranted;
        final /* synthetic */ Function1<List<String>, Unit> $denied;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function0<Unit> function0, Function1<? super List<String>, Unit> function1) {
            this.$allGranted = function0;
            this.$denied = function1;
        }

        @Override // defpackage.enk
        public final void onResult(boolean z, List<String> grantedList, List<String> deniedList) {
            Intrinsics.checkNotNullParameter(grantedList, "grantedList");
            Intrinsics.checkNotNullParameter(deniedList, "deniedList");
            PermissionCheck.INSTANCE.permissionOnResult(grantedList, deniedList);
            if (z) {
                this.$allGranted.invoke();
            } else {
                this.$denied.invoke2(deniedList);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.extensions.PermissionExtKt$requestMultiplePermissions$7, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass7 implements enk {
        final /* synthetic */ Function0<Unit> $allGranted;
        final /* synthetic */ Function1<List<String>, Unit> $denied;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function0<Unit> function0, Function1<? super List<String>, Unit> function1) {
            this.$allGranted = function0;
            this.$denied = function1;
        }

        @Override // defpackage.enk
        public final void onResult(boolean z, List<String> grantedList, List<String> deniedList) {
            Intrinsics.checkNotNullParameter(grantedList, "grantedList");
            Intrinsics.checkNotNullParameter(deniedList, "deniedList");
            PermissionCheck.INSTANCE.permissionOnResult(grantedList, deniedList);
            if (z) {
                this.$allGranted.invoke();
            } else {
                this.$denied.invoke2(deniedList);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.extensions.PermissionExtKt$requestMultiplePermissions$8, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass8 implements enk {
        final /* synthetic */ Function0<Unit> $allGranted;
        final /* synthetic */ Function1<List<String>, Unit> $denied;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function0<Unit> function0, Function1<? super List<String>, Unit> function1) {
            this.$allGranted = function0;
            this.$denied = function1;
        }

        @Override // defpackage.enk
        public final void onResult(boolean z, List<String> grantedList, List<String> deniedList) {
            Intrinsics.checkNotNullParameter(grantedList, "grantedList");
            Intrinsics.checkNotNullParameter(deniedList, "deniedList");
            PermissionCheck.INSTANCE.permissionOnResult(grantedList, deniedList);
            if (z) {
                this.$allGranted.invoke();
            } else {
                this.$denied.invoke2(deniedList);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.extensions.PermissionExtKt$requestPermission$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C18413 implements enk {
        final /* synthetic */ Function1<String, Unit> $denied;
        final /* synthetic */ Function1<String, Unit> $granted;
        final /* synthetic */ String $permission;

        /* JADX WARN: Multi-variable type inference failed */
        public C18413(Function1<? super String, Unit> function1, String str, Function1<? super String, Unit> function2) {
            this.$granted = function1;
            this.$permission = str;
            this.$denied = function2;
        }

        @Override // defpackage.enk
        public final void onResult(boolean z, List<String> grantedList, List<String> deniedList) {
            Intrinsics.checkNotNullParameter(grantedList, "grantedList");
            Intrinsics.checkNotNullParameter(deniedList, "deniedList");
            PermissionCheck.INSTANCE.permissionOnResult(grantedList, deniedList);
            if (z) {
                this.$granted.invoke2(this.$permission);
            } else {
                this.$denied.invoke2(this.$permission);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.extensions.PermissionExtKt$requestPermission$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C18424 implements enk {
        final /* synthetic */ Function1<String, Unit> $denied;
        final /* synthetic */ Function1<String, Unit> $granted;
        final /* synthetic */ String $permission;

        /* JADX WARN: Multi-variable type inference failed */
        public C18424(Function1<? super String, Unit> function1, String str, Function1<? super String, Unit> function2) {
            this.$granted = function1;
            this.$permission = str;
            this.$denied = function2;
        }

        @Override // defpackage.enk
        public final void onResult(boolean z, List<String> grantedList, List<String> deniedList) {
            Intrinsics.checkNotNullParameter(grantedList, "grantedList");
            Intrinsics.checkNotNullParameter(deniedList, "deniedList");
            PermissionCheck.INSTANCE.permissionOnResult(grantedList, deniedList);
            if (z) {
                this.$granted.invoke2(this.$permission);
            } else {
                this.$denied.invoke2(this.$permission);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.extensions.PermissionExtKt$requestPermission$7, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C18457 implements enk {
        final /* synthetic */ Function1<String, Unit> $denied;
        final /* synthetic */ Function1<String, Unit> $granted;
        final /* synthetic */ String $permission;

        /* JADX WARN: Multi-variable type inference failed */
        public C18457(Function1<? super String, Unit> function1, String str, Function1<? super String, Unit> function2) {
            this.$granted = function1;
            this.$permission = str;
            this.$denied = function2;
        }

        @Override // defpackage.enk
        public final void onResult(boolean z, List<String> grantedList, List<String> deniedList) {
            Intrinsics.checkNotNullParameter(grantedList, "grantedList");
            Intrinsics.checkNotNullParameter(deniedList, "deniedList");
            PermissionCheck.INSTANCE.permissionOnResult(grantedList, deniedList);
            if (z) {
                this.$granted.invoke2(this.$permission);
            } else {
                this.$denied.invoke2(this.$permission);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.extensions.PermissionExtKt$requestPermission$8, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C18468 implements enk {
        final /* synthetic */ Function1<String, Unit> $denied;
        final /* synthetic */ Function1<String, Unit> $granted;
        final /* synthetic */ String $permission;

        /* JADX WARN: Multi-variable type inference failed */
        public C18468(Function1<? super String, Unit> function1, String str, Function1<? super String, Unit> function2) {
            this.$granted = function1;
            this.$permission = str;
            this.$denied = function2;
        }

        @Override // defpackage.enk
        public final void onResult(boolean z, List<String> grantedList, List<String> deniedList) {
            Intrinsics.checkNotNullParameter(grantedList, "grantedList");
            Intrinsics.checkNotNullParameter(deniedList, "deniedList");
            PermissionCheck.INSTANCE.permissionOnResult(grantedList, deniedList);
            if (z) {
                this.$granted.invoke2(this.$permission);
            } else {
                this.$denied.invoke2(this.$permission);
            }
        }
    }

    @NotNull
    public static final List<String> checkPermissionDeniedForever(@NotNull Fragment fragment, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (String str : permissions) {
            if (fragment.shouldShowRequestPermissionRationale(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<String> checkPermissions(@NotNull Context context, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (String str : permissions) {
            if (ni4.a(context, str) != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static final boolean isPermissionDeniedForever(@NotNull Fragment fragment, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        for (String str : permissions) {
            if (fragment.shouldShowRequestPermissionRationale(str)) {
                if (str != null) {
                    return true;
                }
                return false;
            }
        }
        str = null;
        if (str != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static final boolean isPermissionGranted(@NotNull Context context, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        for (String str : permissions) {
            if (ni4.a(context, str) != 0) {
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

    public static final void permission(@NotNull FragmentActivity fragmentActivity, @NotNull String permission, @Nullable String str, @NotNull Function1<? super PermissionBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(extension, "extension");
        PermissionBuilder permissionBuilder = new PermissionBuilder();
        extension.invoke2(permissionBuilder);
        Function1<String, Unit> granted = permissionBuilder.getGranted();
        Function1<String, Unit> denied = permissionBuilder.getDenied();
        if (!supportMiuiPermissionEnable() || str == null || str.length() <= 0) {
            psh.b(fragmentActivity).permissions(permission).request(new C18424(granted, permission, denied));
        } else {
            new MiuiPermission(fragmentActivity).permission(permission, str).request(new C18413(granted, permission, denied));
        }
    }

    public static /* synthetic */ void permission$default(FragmentActivity fragmentActivity, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        permission(fragmentActivity, str, str2, (Function1<? super PermissionBuilder, Unit>) function1);
    }

    public static final void permissions(@NotNull FragmentActivity fragmentActivity, @NotNull String[] permissions, @Nullable String[] strArr, @NotNull Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(extension, "extension");
        MultiplePermissionsBuilder multiplePermissionsBuilder = new MultiplePermissionsBuilder();
        extension.invoke2(multiplePermissionsBuilder);
        String[] strArr2 = (String[]) Arrays.copyOf(permissions, permissions.length);
        Function0<Unit> allGranted = multiplePermissionsBuilder.getAllGranted();
        Function1<List<String>, Unit> denied = multiplePermissionsBuilder.getDenied();
        if (supportMiuiPermissionEnable() && strArr != null && strArr2.length == strArr.length) {
            new MiuiPermission(fragmentActivity).permissions(ArraysKt___ArraysKt.toList(strArr2), ArraysKt___ArraysKt.toList(strArr)).request(new AnonymousClass3(allGranted, denied));
        } else {
            psh.b(fragmentActivity).permissions((String[]) Arrays.copyOf(strArr2, strArr2.length)).request(new AnonymousClass4(allGranted, denied));
        }
    }

    public static /* synthetic */ void permissions$default(FragmentActivity fragmentActivity, String[] strArr, String[] strArr2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr2 = null;
        }
        permissions(fragmentActivity, strArr, strArr2, (Function1<? super MultiplePermissionsBuilder, Unit>) function1);
    }

    private static final void requestMultiplePermissions(FragmentActivity fragmentActivity, String[] strArr, String[] strArr2, Function0<Unit> function0, Function1<? super List<String>, Unit> function1) {
        if (supportMiuiPermissionEnable() && strArr2 != null && strArr.length == strArr2.length) {
            new MiuiPermission(fragmentActivity).permissions(ArraysKt___ArraysKt.toList(strArr), ArraysKt___ArraysKt.toList(strArr2)).request(new AnonymousClass3(function0, function1));
        } else {
            psh.b(fragmentActivity).permissions((String[]) Arrays.copyOf(strArr, strArr.length)).request(new AnonymousClass4(function0, function1));
        }
    }

    public static /* synthetic */ void requestMultiplePermissions$default(FragmentActivity fragmentActivity, String[] strArr, String[] strArr2, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr2 = null;
        }
        if ((i & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: com.xiaomi.fitness.common.extensions.PermissionExtKt.requestMultiplePermissions.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function1 = new Function1<List<? extends String>, Unit>() { // from class: com.xiaomi.fitness.common.extensions.PermissionExtKt.requestMultiplePermissions.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<String> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(List<? extends String> list) {
                    invoke2((List<String>) list);
                    return Unit.INSTANCE;
                }
            };
        }
        if (supportMiuiPermissionEnable() && strArr2 != null && strArr.length == strArr2.length) {
            new MiuiPermission(fragmentActivity).permissions(ArraysKt___ArraysKt.toList(strArr), ArraysKt___ArraysKt.toList(strArr2)).request(new AnonymousClass3(function0, function1));
        } else {
            psh.b(fragmentActivity).permissions((String[]) Arrays.copyOf(strArr, strArr.length)).request(new AnonymousClass4(function0, function1));
        }
    }

    private static final void requestPermission(FragmentActivity fragmentActivity, String str, String str2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2) {
        if (!supportMiuiPermissionEnable() || str2 == null || str2.length() <= 0) {
            psh.b(fragmentActivity).permissions(str).request(new C18424(function1, str, function2));
        } else {
            new MiuiPermission(fragmentActivity).permission(str, str2).request(new C18413(function1, str, function2));
        }
    }

    public static /* synthetic */ void requestPermission$default(FragmentActivity fragmentActivity, String str, String str2, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1<String, Unit>() { // from class: com.xiaomi.fitness.common.extensions.PermissionExtKt.requestPermission.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(String str3) {
                    invoke2(str3);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function2 = new Function1<String, Unit>() { // from class: com.xiaomi.fitness.common.extensions.PermissionExtKt.requestPermission.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(String str3) {
                    invoke2(str3);
                    return Unit.INSTANCE;
                }
            };
        }
        if (!supportMiuiPermissionEnable() || str2 == null || str2.length() <= 0) {
            psh.b(fragmentActivity).permissions(str).request(new C18424(function1, str, function2));
        } else {
            new MiuiPermission(fragmentActivity).permission(str, str2).request(new C18413(function1, str, function2));
        }
    }

    public static final boolean supportMiuiPermissionEnable() {
        boolean zEquals = TextUtils.equals(ApplicationExtKt.getApplication().getPackageName(), "com.mi.health");
        boolean zIsXiaomi = RomUtils.isXiaomi();
        SystemProperties systemProperties = SystemProperties.INSTANCE;
        boolean zIsGlobalMiuiRom = systemProperties.isGlobalMiuiRom();
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i >= 29;
        int miuiRomVersion = systemProperties.getMiuiRomVersion();
        if (zEquals && zIsXiaomi && !zIsGlobalMiuiRom && z2 && miuiRomVersion >= 12) {
            z = true;
        }
        Logger.i("PermissionExt", "supportMiuiPermissionEnable:" + z + " , package name:" + ApplicationExtKt.getApplication().getPackageName() + " ,miRom:" + zIsXiaomi + " ,globalMiuiRom:" + zIsGlobalMiuiRom + " ,buildVersion:" + i + " ,miuiRomVersion:" + miuiRomVersion);
        return z;
    }

    public static /* synthetic */ void permission$default(Fragment fragment, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        permission(fragment, str, str2, (Function1<? super PermissionBuilder, Unit>) function1);
    }

    public static /* synthetic */ void permissions$default(Fragment fragment, String[] strArr, String[] strArr2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr2 = null;
        }
        permissions(fragment, strArr, strArr2, (Function1<? super MultiplePermissionsBuilder, Unit>) function1);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static final boolean isPermissionDeniedForever(@NotNull Activity activity, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        for (String str : permissions) {
            if (a.z(activity, str)) {
                if (str != null) {
                    return true;
                }
                return false;
            }
        }
        str = null;
        if (str != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final List<String> checkPermissionDeniedForever(@NotNull Activity activity, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (String str : permissions) {
            if (a.z(activity, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static final void requestMultiplePermissions(Fragment fragment, String[] strArr, String[] strArr2, Function0<Unit> function0, Function1<? super List<String>, Unit> function1) {
        if (supportMiuiPermissionEnable() && strArr2 != null && strArr.length == strArr2.length) {
            new MiuiPermission(fragment).permissions(ArraysKt___ArraysKt.toList(strArr), ArraysKt___ArraysKt.toList(strArr2)).request(new AnonymousClass7(function0, function1));
        } else {
            psh.a(fragment).permissions((String[]) Arrays.copyOf(strArr, strArr.length)).request(new AnonymousClass8(function0, function1));
        }
    }

    private static final void requestPermission(Fragment fragment, String str, String str2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2) {
        if (supportMiuiPermissionEnable() && str2 != null && str2.length() > 0) {
            new MiuiPermission(fragment).permission(str, str2).request(new C18457(function1, str, function2));
        } else {
            psh.a(fragment).permissions(str).request(new C18468(function1, str, function2));
        }
    }

    public static /* synthetic */ void requestMultiplePermissions$default(Fragment fragment, String[] strArr, String[] strArr2, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr2 = null;
        }
        if ((i & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: com.xiaomi.fitness.common.extensions.PermissionExtKt.requestMultiplePermissions.5
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function1 = new Function1<List<? extends String>, Unit>() { // from class: com.xiaomi.fitness.common.extensions.PermissionExtKt.requestMultiplePermissions.6
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<String> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(List<? extends String> list) {
                    invoke2((List<String>) list);
                    return Unit.INSTANCE;
                }
            };
        }
        if (supportMiuiPermissionEnable() && strArr2 != null && strArr.length == strArr2.length) {
            new MiuiPermission(fragment).permissions(ArraysKt___ArraysKt.toList(strArr), ArraysKt___ArraysKt.toList(strArr2)).request(new AnonymousClass7(function0, function1));
        } else {
            psh.a(fragment).permissions((String[]) Arrays.copyOf(strArr, strArr.length)).request(new AnonymousClass8(function0, function1));
        }
    }

    public static /* synthetic */ void requestPermission$default(Fragment fragment, String str, String str2, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1<String, Unit>() { // from class: com.xiaomi.fitness.common.extensions.PermissionExtKt.requestPermission.5
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(String str3) {
                    invoke2(str3);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function2 = new Function1<String, Unit>() { // from class: com.xiaomi.fitness.common.extensions.PermissionExtKt.requestPermission.6
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(String str3) {
                    invoke2(str3);
                    return Unit.INSTANCE;
                }
            };
        }
        if (supportMiuiPermissionEnable() && str2 != null && str2.length() > 0) {
            new MiuiPermission(fragment).permission(str, str2).request(new C18457(function1, str, function2));
        } else {
            psh.a(fragment).permissions(str).request(new C18468(function1, str, function2));
        }
    }

    public static final void permission(@NotNull Fragment fragment, @NotNull String permission, @Nullable String str, @NotNull Function1<? super PermissionBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(extension, "extension");
        PermissionBuilder permissionBuilder = new PermissionBuilder();
        extension.invoke2(permissionBuilder);
        Function1<String, Unit> granted = permissionBuilder.getGranted();
        Function1<String, Unit> denied = permissionBuilder.getDenied();
        if (supportMiuiPermissionEnable() && str != null && str.length() > 0) {
            new MiuiPermission(fragment).permission(permission, str).request(new C18457(granted, permission, denied));
        } else {
            psh.a(fragment).permissions(permission).request(new C18468(granted, permission, denied));
        }
    }

    public static final void permissions(@NotNull Fragment fragment, @NotNull String[] permissions, @Nullable String[] strArr, @NotNull Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(extension, "extension");
        MultiplePermissionsBuilder multiplePermissionsBuilder = new MultiplePermissionsBuilder();
        extension.invoke2(multiplePermissionsBuilder);
        String[] strArr2 = (String[]) Arrays.copyOf(permissions, permissions.length);
        Function0<Unit> allGranted = multiplePermissionsBuilder.getAllGranted();
        Function1<List<String>, Unit> denied = multiplePermissionsBuilder.getDenied();
        if (supportMiuiPermissionEnable() && strArr != null && strArr2.length == strArr.length) {
            new MiuiPermission(fragment).permissions(ArraysKt___ArraysKt.toList(strArr2), ArraysKt___ArraysKt.toList(strArr)).request(new AnonymousClass7(allGranted, denied));
        } else {
            psh.a(fragment).permissions((String[]) Arrays.copyOf(strArr2, strArr2.length)).request(new AnonymousClass8(allGranted, denied));
        }
    }
}
