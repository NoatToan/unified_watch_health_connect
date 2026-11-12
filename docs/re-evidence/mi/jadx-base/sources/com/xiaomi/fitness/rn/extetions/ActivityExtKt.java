package com.xiaomi.fitness.rn.extetions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.rn.extetions.ActivityExtKt;
import defpackage.av6;
import defpackage.u0j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u001aX\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\u0010\r\u001aX\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\u0010\u000f\u001a.\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¨\u0006\u0014"}, d2 = {"showPermissionDialog", "", "Landroidx/fragment/app/FragmentActivity;", "permissionDesc", "", "", "finishCallback", "Lkotlin/Function0;", "permissions", "extension", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/MultiplePermissionsBuilder;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "showPermissionTipDialogIfNeed", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "permissionFromSetting", "permission", "desc", "", "sdk_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivityExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.extetions.ActivityExtKt$showPermissionTipDialogIfNeed$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/rn/extetions/ActivityExtKt$showPermissionTipDialogIfNeed$2", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends av6 {
        final /* synthetic */ Function1<MultiplePermissionsBuilder, Unit> $extension;
        final /* synthetic */ Function0<Unit> $finishCallback;
        final /* synthetic */ String[] $permissionDesc;
        final /* synthetic */ String[] $permissions;
        final /* synthetic */ FragmentActivity $this_showPermissionTipDialogIfNeed;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FragmentActivity fragmentActivity, String[] strArr, String[] strArr2, Function0<Unit> function0, Function1<? super MultiplePermissionsBuilder, Unit> function1) {
            this.$this_showPermissionTipDialogIfNeed = fragmentActivity;
            this.$permissions = strArr;
            this.$permissionDesc = strArr2;
            this.$finishCallback = function0;
            this.$extension = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(Function1 extension, MultiplePermissionsBuilder permissions) {
            Intrinsics.checkNotNullParameter(extension, "$extension");
            Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
            extension.invoke2(permissions);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (dialog != null) {
                dialog.dismiss();
            }
            if (which != -1) {
                this.$finishCallback.invoke();
                return;
            }
            FragmentActivity fragmentActivity = this.$this_showPermissionTipDialogIfNeed;
            String[] strArr = this.$permissions;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            String[] strArr3 = this.$permissionDesc;
            final Function1<MultiplePermissionsBuilder, Unit> function1 = this.$extension;
            PermissionExtKt.permissions(fragmentActivity, strArr2, strArr3, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: il0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ActivityExtKt.AnonymousClass2.onDialogClick$lambda$0(function1, (MultiplePermissionsBuilder) obj);
                }
            });
        }
    }

    public static final void permissionFromSetting(@NotNull final FragmentActivity fragmentActivity, @NotNull String permission, int i, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (PermissionExtKt.isPermissionDeniedForever(fragmentActivity, permission)) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            CommonDialog commonDialogCreate = new CommonDialog.c("setting_permission").setDialogTitle(u0j.c).setDialogDescription(i).setPositiveText(u0j.d).setNegativeText(u0j.f35252b).create();
            commonDialogCreate.setCancelable(false);
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.rn.extetions.ActivityExtKt.permissionFromSetting.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    if (which == -1) {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", fragmentActivity.getPackageName(), null));
                        fragmentActivity.startActivityForResult(intent, 10);
                    } else {
                        Function0<Unit> function1 = function0;
                        if (function1 != null) {
                            function1.invoke();
                        }
                    }
                }
            });
            commonDialogCreate.showIfNeed(fragmentActivity.getSupportFragmentManager());
        }
    }

    public static /* synthetic */ void permissionFromSetting$default(FragmentActivity fragmentActivity, String str, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        permissionFromSetting(fragmentActivity, str, i, function0);
    }

    public static final void showPermissionDialog(@NotNull FragmentActivity fragmentActivity, @NotNull String[] permissionDesc, @NotNull Function0<Unit> finishCallback, @NotNull String[] permissions, @NotNull final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(permissionDesc, "permissionDesc");
        Intrinsics.checkNotNullParameter(finishCallback, "finishCallback");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(extension, "extension");
        showPermissionTipDialogIfNeed(fragmentActivity, permissionDesc, (String[]) Arrays.copyOf(permissions, permissions.length), finishCallback, new Function1() { // from class: gl0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActivityExtKt.showPermissionDialog$lambda$0(extension, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermissionDialog$lambda$0(Function1 extension, MultiplePermissionsBuilder showPermissionTipDialogIfNeed) {
        Intrinsics.checkNotNullParameter(extension, "$extension");
        Intrinsics.checkNotNullParameter(showPermissionTipDialogIfNeed, "$this$showPermissionTipDialogIfNeed");
        extension.invoke2(showPermissionTipDialogIfNeed);
        return Unit.INSTANCE;
    }

    public static final void showPermissionTipDialogIfNeed(@NotNull FragmentActivity fragmentActivity, @NotNull String[] permissionDesc, @NotNull String[] permissions, @NotNull Function0<Unit> finishCallback, @NotNull final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(permissionDesc, "permissionDesc");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(finishCallback, "finishCallback");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            PermissionExtKt.permissions$default(fragmentActivity, (String[]) Arrays.copyOf(permissions, permissions.length), (String[]) null, new Function1() { // from class: hl0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ActivityExtKt.showPermissionTipDialogIfNeed$lambda$1(extension, (MultiplePermissionsBuilder) obj);
                }
            }, 2, (Object) null);
            return;
        }
        String str = permissionDesc[0];
        String string = fragmentActivity.getString(u0j.i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(str + "\n\r\n\r" + string);
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 17);
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(u0j.f).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableString)).setPositiveText(u0j.f35251a).setNegativeText(u0j.e).create();
        commonDialogCreate.setCancelable(false);
        commonDialogCreate.addDialogCallback(new AnonymousClass2(fragmentActivity, permissions, permissionDesc, finishCallback, extension));
        commonDialogCreate.showIfNeed(fragmentActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermissionTipDialogIfNeed$lambda$1(Function1 extension, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(extension, "$extension");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        extension.invoke2(permissions);
        return Unit.INSTANCE;
    }
}
