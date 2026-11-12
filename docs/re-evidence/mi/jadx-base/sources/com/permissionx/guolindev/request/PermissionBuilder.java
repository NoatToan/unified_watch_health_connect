package com.permissionx.guolindev.request;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.permissionx.guolindev.dialog.DefaultDialog;
import com.permissionx.guolindev.dialog.RationaleDialogFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.ank;
import defpackage.bt3;
import defpackage.enk;
import defpackage.fnk;
import defpackage.h1a;
import defpackage.jj8;
import defpackage.kj8;
import defpackage.qok;
import defpackage.tok;
import defpackage.xok;
import defpackage.ybj;
import defpackage.zok;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 j2\u00020\u0001:\u0001jB7\u0012\b\u0010g\u001a\u0004\u0018\u00010:\u0012\b\u0010B\u001a\u0004\u0018\u00010A\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00030*\u0012\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030*¢\u0006\u0004\bh\u0010iJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJI\u0010\"\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\u0010 \u001a\u0004\u0018\u00010\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\"\u0010#J%\u0010\"\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J%\u0010\"\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b\"\u0010)J)\u0010+\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010*2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b0\u0010.J\u0017\u00101\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b1\u0010.J\r\u00102\u001a\u00020\u001d¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u001d¢\u0006\u0004\b4\u00103J\r\u00105\u001a\u00020\u001d¢\u0006\u0004\b5\u00103J\r\u00106\u001a\u00020\u001d¢\u0006\u0004\b6\u00103J\u000f\u00109\u001a\u00020\u0005H\u0000¢\u0006\u0004\b7\u00108R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010DR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0016\u0010\u0011\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u0016\u0010L\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030M8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010IR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030M8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010IR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00030M8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010IR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030M8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bQ\u0010IR\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030M8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010IR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00030M8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010IR\u0018\u0010T\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006k"}, d2 = {"Lcom/permissionx/guolindev/request/PermissionBuilder;", "", "", "", "permissions", "", "forwardToSettings", "(Ljava/util/List;)V", "Ljj8;", "callback", "onExplainRequestReason", "(Ljj8;)Lcom/permissionx/guolindev/request/PermissionBuilder;", "Lkj8;", "(Lkj8;)Lcom/permissionx/guolindev/request/PermissionBuilder;", "Lh1a;", "onForwardToSettings", "(Lh1a;)Lcom/permissionx/guolindev/request/PermissionBuilder;", "explainReasonBeforeRequest", "()Lcom/permissionx/guolindev/request/PermissionBuilder;", "", "lightColor", "darkColor", "setDialogTintColor", "(II)Lcom/permissionx/guolindev/request/PermissionBuilder;", "Lenk;", "request", "(Lenk;)V", "Lbt3;", "chainTask", "", "showReasonOrGoSettings", "message", "positiveText", "negativeText", "showHandlePermissionDialog", "(Lbt3;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lybj;", "dialog", "(Lbt3;ZLybj;)V", "Lcom/permissionx/guolindev/dialog/RationaleDialogFragment;", "dialogFragment", "(Lbt3;ZLcom/permissionx/guolindev/dialog/RationaleDialogFragment;)V", "", "requestNow", "(Ljava/util/Set;Lbt3;)V", "requestAccessBackgroundLocationNow", "(Lbt3;)V", "requestSystemAlertWindowPermissionNow", "requestWriteSettingsPermissionNow", "requestManageExternalStoragePermissionNow", "shouldRequestBackgroundLocationPermission", "()Z", "shouldRequestSystemAlertWindowPermission", "shouldRequestWriteSettingsPermission", "shouldRequestManageExternalStoragePermission", "removeInvisibleFragment$permissionx_release", "()V", "removeInvisibleFragment", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "I", "Landroid/app/Dialog;", "currentDialog", "Landroid/app/Dialog;", "normalPermissions", "Ljava/util/Set;", "specialPermissions", "Z", "showDialogCalled", "", "permissionsWontRequest", "grantedPermissions", "deniedPermissions", "permanentDeniedPermissions", "tempPermanentDeniedPermissions", "forwardPermissions", "requestCallback", "Lenk;", "explainReasonCallback", "Ljj8;", "explainReasonCallbackWithBeforeParam", "Lkj8;", "forwardToSettingsCallback", "Lh1a;", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/permissionx/guolindev/request/InvisibleFragment;", "getInvisibleFragment", "()Lcom/permissionx/guolindev/request/InvisibleFragment;", "invisibleFragment", "getTargetSdkVersion", "()I", "targetSdkVersion", "fragmentActivity", "<init>", "(Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/Fragment;Ljava/util/Set;Ljava/util/Set;)V", "Companion", "permissionx_release"}, k = 1, mv = {1, 4, 2})
public final class PermissionBuilder {
    private static final String FRAGMENT_TAG = "InvisibleFragment";
    public FragmentActivity activity;

    @JvmField
    @Nullable
    public Dialog currentDialog;
    private int darkColor;

    @JvmField
    @NotNull
    public Set<String> deniedPermissions;

    @JvmField
    public boolean explainReasonBeforeRequest;

    @JvmField
    @Nullable
    public jj8 explainReasonCallback;

    @JvmField
    @Nullable
    public kj8 explainReasonCallbackWithBeforeParam;

    @JvmField
    @NotNull
    public Set<String> forwardPermissions;

    @JvmField
    @Nullable
    public h1a forwardToSettingsCallback;
    private Fragment fragment;

    @JvmField
    @NotNull
    public Set<String> grantedPermissions;
    private int lightColor;

    @JvmField
    @NotNull
    public Set<String> normalPermissions;

    @JvmField
    @NotNull
    public Set<String> permanentDeniedPermissions;

    @JvmField
    @NotNull
    public Set<String> permissionsWontRequest;

    @JvmField
    @Nullable
    public enk requestCallback;

    @JvmField
    public boolean showDialogCalled;

    @JvmField
    @NotNull
    public Set<String> specialPermissions;

    @JvmField
    @NotNull
    public Set<String> tempPermanentDeniedPermissions;

    public PermissionBuilder(@Nullable FragmentActivity fragmentActivity, @Nullable Fragment fragment, @NotNull Set<String> normalPermissions, @NotNull Set<String> specialPermissions) {
        Intrinsics.checkNotNullParameter(normalPermissions, "normalPermissions");
        Intrinsics.checkNotNullParameter(specialPermissions, "specialPermissions");
        this.lightColor = -1;
        this.darkColor = -1;
        this.permissionsWontRequest = new LinkedHashSet();
        this.grantedPermissions = new LinkedHashSet();
        this.deniedPermissions = new LinkedHashSet();
        this.permanentDeniedPermissions = new LinkedHashSet();
        this.tempPermanentDeniedPermissions = new LinkedHashSet();
        this.forwardPermissions = new LinkedHashSet();
        if (fragmentActivity != null) {
            this.activity = fragmentActivity;
        }
        if (fragmentActivity == null && fragment != null) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
            this.activity = fragmentActivityRequireActivity;
        }
        this.fragment = fragment;
        this.normalPermissions = normalPermissions;
        this.specialPermissions = specialPermissions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardToSettings(List<String> permissions) {
        this.forwardPermissions.clear();
        this.forwardPermissions.addAll(permissions);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
        }
        intent.setData(Uri.fromParts("package", fragmentActivity.getPackageName(), null));
        getInvisibleFragment().startActivityForResult(intent, 1);
    }

    private final FragmentManager getFragmentManager() {
        FragmentManager childFragmentManager;
        Fragment fragment = this.fragment;
        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
            return childFragmentManager;
        }
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        return supportFragmentManager;
    }

    private final InvisibleFragment getInvisibleFragment() {
        Fragment fragmentL0 = getFragmentManager().l0(FRAGMENT_TAG);
        System.out.println((Object) ("existedFragment is " + fragmentL0));
        if (fragmentL0 != null) {
            return (InvisibleFragment) fragmentL0;
        }
        InvisibleFragment invisibleFragment = new InvisibleFragment();
        getFragmentManager().o().f(invisibleFragment, FRAGMENT_TAG).o();
        return invisibleFragment;
    }

    @NotNull
    public final PermissionBuilder explainReasonBeforeRequest() {
        this.explainReasonBeforeRequest = true;
        return this;
    }

    @NotNull
    public final FragmentActivity getActivity() {
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
        }
        return fragmentActivity;
    }

    public final int getTargetSdkVersion() {
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
        }
        return fragmentActivity.getApplicationInfo().targetSdkVersion;
    }

    @NotNull
    public final PermissionBuilder onExplainRequestReason(@Nullable jj8 callback) {
        return this;
    }

    @NotNull
    public final PermissionBuilder onForwardToSettings(@Nullable h1a callback) {
        return this;
    }

    public final void removeInvisibleFragment$permissionx_release() {
        Fragment fragmentL0 = getFragmentManager().l0(FRAGMENT_TAG);
        if (fragmentL0 != null) {
            getFragmentManager().o().v(fragmentL0).m();
        }
    }

    public final void request(@Nullable enk callback) {
        this.requestCallback = callback;
        fnk fnkVar = new fnk();
        fnkVar.a(new tok(this));
        fnkVar.a(new ank(this));
        fnkVar.a(new xok(this));
        fnkVar.a(new zok(this));
        fnkVar.a(new qok(this));
        fnkVar.b();
    }

    public final void requestAccessBackgroundLocationNow(@Nullable bt3 chainTask) {
        getInvisibleFragment().y(this, chainTask);
    }

    public final void requestManageExternalStoragePermissionNow(@Nullable bt3 chainTask) {
        getInvisibleFragment().z(this, chainTask);
    }

    public final void requestNow(@Nullable Set<String> permissions, @Nullable bt3 chainTask) {
        getInvisibleFragment().A(this, permissions, chainTask);
    }

    public final void requestSystemAlertWindowPermissionNow(@Nullable bt3 chainTask) {
        getInvisibleFragment().B(this, chainTask);
    }

    public final void requestWriteSettingsPermissionNow(@Nullable bt3 chainTask) {
        getInvisibleFragment().C(this, chainTask);
    }

    public final void setActivity(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.activity = fragmentActivity;
    }

    @NotNull
    public final PermissionBuilder setDialogTintColor(int lightColor, int darkColor) {
        this.lightColor = lightColor;
        this.darkColor = darkColor;
        return this;
    }

    public final boolean shouldRequestBackgroundLocationPermission() {
        return this.specialPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public final boolean shouldRequestManageExternalStoragePermission() {
        return this.specialPermissions.contains("android.permission.MANAGE_EXTERNAL_STORAGE");
    }

    public final boolean shouldRequestSystemAlertWindowPermission() {
        return this.specialPermissions.contains("android.permission.SYSTEM_ALERT_WINDOW");
    }

    public final boolean shouldRequestWriteSettingsPermission() {
        return this.specialPermissions.contains("android.permission.WRITE_SETTINGS");
    }

    public final void showHandlePermissionDialog(@NotNull final bt3 chainTask, final boolean showReasonOrGoSettings, @NotNull final ybj dialog) {
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.showDialogCalled = true;
        final List<String> permissionsToRequest = dialog.getPermissionsToRequest();
        Intrinsics.checkNotNullExpressionValue(permissionsToRequest, "dialog.permissionsToRequest");
        if (permissionsToRequest.isEmpty()) {
            chainTask.finish();
            return;
        }
        this.currentDialog = dialog;
        dialog.show();
        if ((dialog instanceof DefaultDialog) && ((DefaultDialog) dialog).isPermissionLayoutEmpty$permissionx_release()) {
            dialog.dismiss();
            chainTask.finish();
        }
        View positiveButton = dialog.getPositiveButton();
        Intrinsics.checkNotNullExpressionValue(positiveButton, "dialog.positiveButton");
        View negativeButton = dialog.getNegativeButton();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        positiveButton.setClickable(true);
        positiveButton.setOnClickListener(new View.OnClickListener() { // from class: com.permissionx.guolindev.request.PermissionBuilder.showHandlePermissionDialog.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
                if (showReasonOrGoSettings) {
                    chainTask.requestAgain(permissionsToRequest);
                } else {
                    PermissionBuilder.this.forwardToSettings(permissionsToRequest);
                }
            }
        });
        if (negativeButton != null) {
            negativeButton.setClickable(true);
            negativeButton.setOnClickListener(new View.OnClickListener() { // from class: com.permissionx.guolindev.request.PermissionBuilder.showHandlePermissionDialog.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dialog.dismiss();
                    chainTask.finish();
                }
            });
        }
        Dialog dialog2 = this.currentDialog;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.permissionx.guolindev.request.PermissionBuilder.showHandlePermissionDialog.3
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    PermissionBuilder.this.currentDialog = null;
                }
            });
        }
    }

    @NotNull
    public final PermissionBuilder onExplainRequestReason(@Nullable kj8 callback) {
        return this;
    }

    public final void showHandlePermissionDialog(@NotNull final bt3 chainTask, final boolean showReasonOrGoSettings, @NotNull final RationaleDialogFragment dialogFragment) {
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
        this.showDialogCalled = true;
        final List<String> listT = dialogFragment.t();
        Intrinsics.checkNotNullExpressionValue(listT, "dialogFragment.permissionsToRequest");
        if (listT.isEmpty()) {
            chainTask.finish();
            return;
        }
        dialogFragment.showNow(getFragmentManager(), "PermissionXRationaleDialogFragment");
        View viewU = dialogFragment.u();
        Intrinsics.checkNotNullExpressionValue(viewU, "dialogFragment.positiveButton");
        View viewS = dialogFragment.s();
        dialogFragment.setCancelable(false);
        viewU.setClickable(true);
        viewU.setOnClickListener(new View.OnClickListener() { // from class: com.permissionx.guolindev.request.PermissionBuilder.showHandlePermissionDialog.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                if (showReasonOrGoSettings) {
                    chainTask.requestAgain(listT);
                } else {
                    PermissionBuilder.this.forwardToSettings(listT);
                }
            }
        });
        if (viewS != null) {
            viewS.setClickable(true);
            viewS.setOnClickListener(new View.OnClickListener() { // from class: com.permissionx.guolindev.request.PermissionBuilder.showHandlePermissionDialog.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dialogFragment.dismiss();
                    chainTask.finish();
                }
            });
        }
    }

    public final void showHandlePermissionDialog(@NotNull bt3 chainTask, boolean showReasonOrGoSettings, @NotNull List<String> permissions, @Nullable String message, @Nullable String positiveText, @Nullable String negativeText) {
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
        }
        Intrinsics.checkNotNull(message);
        Intrinsics.checkNotNull(positiveText);
        showHandlePermissionDialog(chainTask, showReasonOrGoSettings, new DefaultDialog(fragmentActivity, permissions, message, positiveText, negativeText, this.lightColor, this.darkColor));
    }
}
