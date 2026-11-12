package com.xiaomi.fitness.feedback.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import androidx.core.app.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.feedback.preference.FeedbackPreference;
import defpackage.a0j;
import defpackage.av6;
import defpackage.ni4;
import defpackage.owk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002*+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000J#\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eJ!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u0019J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u001cJ7\u0010\u0015\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u001fJ7\u0010 \u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u001fJ\u0016\u0010\"\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002J0\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002J \u0010%\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/feedback/util/PermissionsUtil;", "", "<init>", "()V", "REQUEST_CODE_DEFAULT", "", AccountInteractActivity.KEY_REQUEST_CODE, "get", "shouldRequestPermission", "", "context", "Landroid/content/Context;", "permissions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "checkPermissions", "", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;", "checkPermission", "permission", "requestPermissions", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;)V", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "(Landroid/app/Activity;[Ljava/lang/String;)V", "mContext", "code", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "requestPermission", "requestId", "isXiaoMiAlwaysAllow", "permissionsList", "locationPermissionAlwaysAllow", "showPrivacyStorageDialog", "Landroidx/fragment/app/FragmentActivity;", "permissionDes", "clickListener", "Lcom/xiaomi/fitness/feedback/util/PermissionsUtil$OnDialogItemClickListener;", "PermissionsHolder", "OnDialogItemClickListener", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsUtil.kt\ncom/xiaomi/fitness/feedback/util/PermissionsUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,196:1\n37#2:197\n36#2,3:198\n*S KotlinDebug\n*F\n+ 1 PermissionsUtil.kt\ncom/xiaomi/fitness/feedback/util/PermissionsUtil\n*L\n100#1:197\n100#1:198,3\n*E\n"})
public final class PermissionsUtil {

    @NotNull
    public static final PermissionsUtil INSTANCE = new PermissionsUtil();
    public static final int REQUEST_CODE_DEFAULT = 1000;
    private static int requestCode;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/feedback/util/PermissionsUtil$OnDialogItemClickListener;", "", "onPositiveClick", "", "onNegativeClick", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDialogItemClickListener {
        void onNegativeClick();

        void onPositiveClick();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/feedback/util/PermissionsUtil$PermissionsHolder;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/feedback/util/PermissionsUtil;", "getInstance", "()Lcom/xiaomi/fitness/feedback/util/PermissionsUtil;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PermissionsHolder {

        @NotNull
        public static final PermissionsHolder INSTANCE = new PermissionsHolder();

        @NotNull
        private static final PermissionsUtil instance = PermissionsUtil.INSTANCE;

        private PermissionsHolder() {
        }

        @NotNull
        public final PermissionsUtil getInstance() {
            return instance;
        }
    }

    private PermissionsUtil() {
    }

    private final boolean isXiaoMiAlwaysAllow(List<String> permissionsList) {
        if (!AppUtil.INSTANCE.isPlayChannel() && owk.b() && Build.VERSION.SDK_INT >= 29) {
            return permissionsList.contains("android.permission.ACCESS_FINE_LOCATION");
        }
        return false;
    }

    private final List<String> locationPermissionAlwaysAllow(Activity mContext, Fragment fragment, List<String> permissions) {
        ArrayList arrayList = new ArrayList();
        for (String str : permissions) {
            arrayList.add(str);
            String string = "";
            if (Intrinsics.areEqual("android.permission.ACCESS_FINE_LOCATION", str)) {
                if (mContext != null) {
                    string = mContext.getString(a0j.U);
                } else if (fragment != null) {
                    string = fragment.getString(a0j.U);
                }
                arrayList.add(string);
                arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                arrayList.add(string);
            } else {
                arrayList.add("");
            }
        }
        return arrayList;
    }

    private final void requestPermission(Activity context, Fragment fragment, String[] permission, int requestId) {
        requestCode = requestId;
        if (fragment != null) {
            fragment.requestPermissions(permission, requestId);
        } else {
            if (context == null) {
                throw new IllegalArgumentException("activity or fragment is can't all be null");
            }
            a.v(context, permission, requestId);
        }
    }

    public final boolean checkPermission(@Nullable Context context, @Nullable String permission) {
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNull(permission);
        return ni4.a(context, permission) == 0;
    }

    @NotNull
    public final List<String> checkPermissions(@Nullable Context context, @NotNull String[] permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (String str : permissions) {
            if (!checkPermission(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Nullable
    public final PermissionsUtil get() {
        return PermissionsHolder.INSTANCE.getInstance();
    }

    public final void requestPermissions(@NotNull Fragment fragment, @NotNull String[] permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        requestPermissions(null, fragment, permissions, 1000);
    }

    public final boolean shouldRequestPermission(@Nullable Context context, @NotNull String[] permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return checkPermissions(context, permissions).size() > 0;
    }

    public final void showPrivacyStorageDialog(@NotNull FragmentActivity activity, int permissionDes, @NotNull final OnDialogItemClickListener clickListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(a0j.D).setDialogDescription(a0j.B).setNegativeText(a0j.common_reject).setPositiveText(a0j.common_allow).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.feedback.util.PermissionsUtil.showPrivacyStorageDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    dialog.dismiss();
                } else {
                    if (which != -1) {
                        return;
                    }
                    FeedbackPreference.INSTANCE.setPREF_PRIVACY_STORAGE_TAG(true);
                    clickListener.onPositiveClick();
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    public final void requestPermissions(@NotNull Activity activity, @NotNull String[] permissions) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        requestPermissions(activity, null, permissions, 1000);
    }

    private final void requestPermissions(Activity mContext, Fragment fragment, String[] permissions, int code) {
        List<String> listCheckPermissions;
        requestCode = code;
        if (mContext != null) {
            listCheckPermissions = checkPermissions(mContext, permissions);
        } else {
            listCheckPermissions = fragment != null ? checkPermissions(fragment.getContext(), permissions) : null;
        }
        if (listCheckPermissions != null) {
            PermissionsUtil permissionsUtil = INSTANCE;
            if (permissionsUtil.isXiaoMiAlwaysAllow(listCheckPermissions)) {
                listCheckPermissions = permissionsUtil.locationPermissionAlwaysAllow(mContext, fragment, listCheckPermissions);
            }
            if (listCheckPermissions.isEmpty()) {
                return;
            }
            permissionsUtil.requestPermission(mContext, fragment, (String[]) listCheckPermissions.toArray(new String[0]), requestCode);
        }
    }
}
