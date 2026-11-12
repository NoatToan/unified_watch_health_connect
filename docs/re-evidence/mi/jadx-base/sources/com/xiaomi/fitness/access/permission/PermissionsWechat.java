package com.xiaomi.fitness.access.permission;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.a;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.access.export.listener.OnDialogItemClickListener;
import com.xiaomi.fitness.access.export.listener.PermissionAuthDialogCancelListener;
import com.xiaomi.fitness.access.preference.AccessPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.av6;
import defpackage.mzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010J<\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ*\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/access/permission/PermissionsWechat;", "", "<init>", "()V", "doOnSelectNoMoreReminder", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", AccountInteractActivity.KEY_REQUEST_CODE, "", "permissions", "", "", "grantResults", "", "closeUI", "(Landroidx/fragment/app/FragmentActivity;I[Ljava/lang/String;[IZ)Z", "judgePermissionActivity", "permission", "grantResult", "cancelListener", "Lcom/xiaomi/fitness/access/export/listener/PermissionAuthDialogCancelListener;", "showPrivacyStorageDialog", "", "permissionDes", "clickListener", "Lcom/xiaomi/fitness/access/export/listener/OnDialogItemClickListener;", "showSettingDialog", "toPermissionSetting", "context", "Landroid/app/Activity;", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionsWechat {

    @NotNull
    public static final PermissionsWechat INSTANCE = new PermissionsWechat();

    private PermissionsWechat() {
    }

    public final boolean doOnSelectNoMoreReminder(@NotNull FragmentActivity activity, int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults, boolean closeUI) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        int length = grantResults.length;
        for (int i = 0; i < length; i++) {
            if (!judgePermissionActivity(activity, permissions[i], grantResults[i], requestCode, closeUI, null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean judgePermissionActivity(@Nullable FragmentActivity activity, @Nullable String permission, int grantResult, int requestCode, boolean closeUI, @Nullable PermissionAuthDialogCancelListener cancelListener) {
        if (PermissionsUtil.INSTANCE.onRequestPermissionsResult(requestCode, grantResult)) {
            return false;
        }
        Intrinsics.checkNotNull(activity);
        Intrinsics.checkNotNull(permission);
        if (a.z(activity, permission)) {
            return false;
        }
        showSettingDialog(activity, permission, closeUI, cancelListener);
        return true;
    }

    public final void showPrivacyStorageDialog(@NotNull FragmentActivity activity, int permissionDes, @NotNull final OnDialogItemClickListener clickListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(permissionDes).setDialogDescription(mzi.K).setNegativeText(mzi.common_reject).setPositiveText(mzi.common_allow).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.access.permission.PermissionsWechat.showPrivacyStorageDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    dialog.dismiss();
                    clickListener.onNegativeClick();
                } else {
                    if (which != -1) {
                        return;
                    }
                    AccessPreference.INSTANCE.setPREF_PRIVACY_STORAGE_TAG(true);
                    clickListener.onPositiveClick();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    public final void showSettingDialog(@NotNull final FragmentActivity activity, @Nullable final String permission, final boolean closeUI, @Nullable final PermissionAuthDialogCancelListener cancelListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(mzi.B0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(permission)).setNegativeText(mzi.f27380b).setPositiveText(mzi.C0).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.access.permission.PermissionsWechat.showSettingDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    PermissionsWechat.INSTANCE.toPermissionSetting(activity);
                    return;
                }
                if (which != -1) {
                    return;
                }
                if (closeUI) {
                    activity.finish();
                    return;
                }
                PermissionAuthDialogCancelListener permissionAuthDialogCancelListener = cancelListener;
                if (permissionAuthDialogCancelListener != null) {
                    permissionAuthDialogCancelListener.onAuthDialogCancel(permission);
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    public final void toPermissionSetting(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivityForResult(intent, 1001);
    }
}
