package com.xiaomi.fitness.baseui.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import defpackage.av6;
import defpackage.mvi;
import defpackage.n1j;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002:;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\rJ#\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u0018J+\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010\u001aJ5\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u001eJ5\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u001eJ7\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u001eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\b\u0010 \u001a\u0004\u0018\u00010\"2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010#J\u001a\u0010\u0012\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\"2\b\u0010\u0013\u001a\u0004\u0018\u00010\rJ0\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\u0016\u0010%\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\u0016\u0010'\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)J\u0016\u0010'\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005JE\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010(\u001a\u00020)2\u0006\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100¢\u0006\u0002\u00101J8\u00102\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100J*\u00103\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010.\u001a\u00020\n2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100J\u000e\u00104\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0017J\u0010\u00105\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\rJ9\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010(\u001a\u00020)2\u0006\u0010.\u001a\u00020\n¢\u0006\u0002\u00106J\"\u00107\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\r2\n\b\u0002\u00108\u001a\u0004\u0018\u000109R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/baseui/utils/PermissionsUtil;", "", "<init>", "()V", AccountInteractActivity.KEY_REQUEST_CODE, "", "REQUEST_CODE_DEFAULT", "PERMISSION_SETTING_REQUEST_CODE", "REQUEST_CODE_PERMISSION_ADD_CALENDAR", "shouldRequestPermission", "", "permissions", "", "", "([Ljava/lang/String;)Z", "checkPermissions", "", "([Ljava/lang/String;)Ljava/util/List;", "checkPermission", "permission", "requestPermissions", "", "mContext", "Landroid/app/Activity;", "(Landroid/app/Activity;[Ljava/lang/String;)V", "code", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "requestPermissions2", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "requestPermission", "context", "requestId", "Landroid/content/Context;", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;", "locationPermissionAlwaysAllow", "isXiaoMiAlwaysAllow", "permissionsList", "onRequestPermissionsResult", "grantResults", "", "grantResult", "doOnSelectNoMoreReminder", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "closeUI", "cancelListener", "Lcom/xiaomi/fitness/baseui/utils/PermissionsUtil$PermissionAuthDialogCancelListener;", "(Landroidx/fragment/app/FragmentActivity;I[Ljava/lang/String;[IZLcom/xiaomi/fitness/baseui/utils/PermissionsUtil$PermissionAuthDialogCancelListener;)Z", "judgePermissionActivity", "showSettingDialog", "toPermissionSetting", "getPermissionName", "(Landroidx/fragment/app/FragmentActivity;I[Ljava/lang/String;[IZ)V", "showCameraPermissionDialog", "agreeListener", "Lcom/xiaomi/fitness/baseui/utils/PermissionsUtil$PermissionAuthDialogAgreeListener;", "PermissionAuthDialogCancelListener", "PermissionAuthDialogAgreeListener", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsUtil.kt\ncom/xiaomi/fitness/baseui/utils/PermissionsUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,352:1\n37#2:353\n36#2,3:354\n37#2:357\n36#2,3:358\n*S KotlinDebug\n*F\n+ 1 PermissionsUtil.kt\ncom/xiaomi/fitness/baseui/utils/PermissionsUtil\n*L\n74#1:353\n74#1:354,3\n106#1:357\n106#1:358,3\n*E\n"})
public final class PermissionsUtil {

    @NotNull
    public static final PermissionsUtil INSTANCE = new PermissionsUtil();
    public static final int PERMISSION_SETTING_REQUEST_CODE = 1001;
    public static final int REQUEST_CODE_DEFAULT = 1000;
    public static final int REQUEST_CODE_PERMISSION_ADD_CALENDAR = 1007;
    private static int requestCode;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/baseui/utils/PermissionsUtil$PermissionAuthDialogAgreeListener;", "", "onAuthDialogAgree", "", "permission", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PermissionAuthDialogAgreeListener {
        void onAuthDialogAgree(@NotNull String permission);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/baseui/utils/PermissionsUtil$PermissionAuthDialogCancelListener;", "", "onAuthDialogCancel", "", "permission", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PermissionAuthDialogCancelListener {
        void onAuthDialogCancel(@NotNull String permission);
    }

    private PermissionsUtil() {
    }

    private final boolean isXiaoMiAlwaysAllow(List<String> permissionsList) {
        if (!AppUtil.INSTANCE.isPlayChannel() && RomUtils.isXiaomi() && Build.VERSION.SDK_INT >= 29) {
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
                    string = mContext.getString(n1j.q);
                } else if (fragment != null) {
                    string = fragment.getString(n1j.q);
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

    private final void requestPermissions2(Activity mContext, Fragment fragment, String[] permissions, int code) {
        requestCode = code;
        List<String> listCheckPermissions = checkPermissions(permissions);
        if (listCheckPermissions.isEmpty()) {
            return;
        }
        requestPermission(mContext, fragment, (String[]) listCheckPermissions.toArray(new String[0]), requestCode);
    }

    @JvmStatic
    public static final boolean shouldRequestPermission(@NotNull String[] permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return !INSTANCE.checkPermissions(permissions).isEmpty();
    }

    public static /* synthetic */ void showCameraPermissionDialog$default(PermissionsUtil permissionsUtil, FragmentActivity fragmentActivity, String str, PermissionAuthDialogAgreeListener permissionAuthDialogAgreeListener, int i, Object obj) {
        if ((i & 4) != 0) {
            permissionAuthDialogAgreeListener = null;
        }
        permissionsUtil.showCameraPermissionDialog(fragmentActivity, str, permissionAuthDialogAgreeListener);
    }

    public static /* synthetic */ void showSettingDialog$default(PermissionsUtil permissionsUtil, FragmentActivity fragmentActivity, String str, boolean z, PermissionAuthDialogCancelListener permissionAuthDialogCancelListener, int i, Object obj) {
        if ((i & 8) != 0) {
            permissionAuthDialogCancelListener = null;
        }
        permissionsUtil.showSettingDialog(fragmentActivity, str, z, permissionAuthDialogCancelListener);
    }

    public final boolean checkPermission(@Nullable String permission) {
        Application app = AppUtil.getApp();
        Intrinsics.checkNotNull(permission);
        return ni4.a(app, permission) == 0;
    }

    @NotNull
    public final List<String> checkPermissions(@NotNull String[] permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (String str : permissions) {
            if (!checkPermission(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final boolean doOnSelectNoMoreReminder(@NotNull FragmentActivity activity, int requestCode2, @NotNull String[] permissions, @NotNull int[] grantResults, boolean closeUI, @Nullable PermissionAuthDialogCancelListener cancelListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        int length = grantResults.length;
        for (int i = 0; i < length; i++) {
            if (!judgePermissionActivity(activity, permissions[i], grantResults[i], requestCode2, closeUI, cancelListener)) {
                if (!closeUI) {
                    return true;
                }
                activity.finish();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r2.equals("android.permission.WRITE_EXTERNAL_STORAGE") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r2.equals("android.permission.CALL_PHONE") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r2.equals("android.permission.ACCESS_COARSE_LOCATION") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        if (r2.equals("android.permission.READ_EXTERNAL_STORAGE") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (r2.equals("android.permission.ANSWER_PHONE_CALLS") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        if (r2.equals("android.permission.ACCESS_FINE_LOCATION") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.n1j.w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.n1j.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.n1j.f27443r);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getPermissionName(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.baseui.utils.PermissionsUtil.getPermissionName(java.lang.String):java.lang.String");
    }

    public final boolean judgePermissionActivity(@NotNull FragmentActivity activity, @NotNull String permission, int grantResult, int requestCode2, boolean closeUI, @Nullable PermissionAuthDialogCancelListener cancelListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (onRequestPermissionsResult(requestCode2, grantResult) || a.z(activity, permission)) {
            return false;
        }
        showSettingDialog(activity, permission, closeUI, cancelListener);
        return true;
    }

    public final boolean onRequestPermissionsResult(int requestCode2, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        boolean z = true;
        if (requestCode == requestCode2) {
            for (int i : grantResults) {
                if (i != 0) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final void requestPermissions(@Nullable Activity mContext, @NotNull String[] permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNull(mContext);
        requestPermissions(mContext, null, permissions, 1000);
    }

    public final void showCameraPermissionDialog(@NotNull FragmentActivity activity, @NotNull final String permission, @Nullable final PermissionAuthDialogAgreeListener agreeListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permission, "permission");
        CommonDialog.c cVar = new CommonDialog.c("PermissionsUtil.showCameraPermissionDialog");
        View viewInflate = LayoutInflater.from(activity).inflate(mvi.f27257b, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        cVar.setDialogTitle(n1j.A);
        cVar.setCustomView(viewInflate);
        cVar.setPositiveText(n1j.common_allow);
        cVar.setNegativeText(n1j.common_reject);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.baseui.utils.PermissionsUtil.showCameraPermissionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                PermissionAuthDialogAgreeListener permissionAuthDialogAgreeListener;
                if (which == -1 && (permissionAuthDialogAgreeListener = agreeListener) != null) {
                    permissionAuthDialogAgreeListener.onAuthDialogAgree(permission);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    public final void showSettingDialog(@NotNull final FragmentActivity activity, @NotNull final String permission, final boolean closeUI, @Nullable final PermissionAuthDialogCancelListener cancelListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permission, "permission");
        String permissionName = getPermissionName(permission);
        if (permissionName == null) {
            return;
        }
        CommonDialog.c cVar = new CommonDialog.c("PermissionsUtil.showSettingDialog");
        cVar.setDialogTitle(n1j.p);
        cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(permissionName));
        cVar.setPositiveText(n1j.v);
        cVar.setNegativeText(n1j.common_cancel);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.baseui.utils.PermissionsUtil.showSettingDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -2) {
                    if (which == -1) {
                        PermissionsUtil.INSTANCE.toPermissionSetting(activity);
                    }
                } else if (closeUI) {
                    activity.finish();
                } else {
                    PermissionAuthDialogCancelListener permissionAuthDialogCancelListener = cancelListener;
                    if (permissionAuthDialogCancelListener != null) {
                        permissionAuthDialogCancelListener.onAuthDialogCancel(permission);
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    public final void toPermissionSetting(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivityForResult(intent, 1001);
    }

    public final void requestPermissions(@Nullable Activity mContext, @NotNull String[] permissions, int code) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNull(mContext);
        requestPermissions2(mContext, null, permissions, code);
    }

    private final void requestPermissions(Activity mContext, Fragment fragment, String[] permissions, int code) {
        List<String> listCheckPermissions;
        requestCode = code;
        if (fragment != null) {
            listCheckPermissions = checkPermissions(fragment.getContext(), permissions);
        } else {
            listCheckPermissions = mContext != null ? checkPermissions(mContext, permissions) : null;
        }
        if (listCheckPermissions == null || listCheckPermissions.isEmpty()) {
            return;
        }
        if (isXiaoMiAlwaysAllow(listCheckPermissions)) {
            listCheckPermissions = locationPermissionAlwaysAllow(mContext, fragment, listCheckPermissions);
        }
        if (listCheckPermissions.isEmpty()) {
            return;
        }
        requestPermission(mContext, fragment, (String[]) listCheckPermissions.toArray(new String[0]), requestCode);
    }

    public final boolean onRequestPermissionsResult(int requestCode2, int grantResult) {
        return requestCode != requestCode2 || grantResult == 0;
    }

    public final boolean checkPermission(@Nullable Context context, @Nullable String permission) {
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNull(permission);
        return ni4.a(context, permission) == 0;
    }

    public final void doOnSelectNoMoreReminder(@NotNull FragmentActivity activity, int requestCode2, @NotNull String[] permissions, @NotNull int[] grantResults, boolean closeUI) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        int length = grantResults.length;
        for (int i = 0; i < length; i++) {
            if (!judgePermissionActivity(activity, permissions[i], grantResults[i], requestCode2, closeUI, null) && closeUI) {
                activity.finish();
            }
        }
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
}
