package com.huami.widget.share;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.huami.widget.toast.IconToast;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0017J\u0014\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0018\u001a\u00020\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/widget/share/SharePermissionManager;", "Lcom/huami/utils/easypermission/EasyPermissions$PermissionCallbacks;", "", "requestCode", "", "", "permissions", "", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "perms", "onPermissionsGranted", "onPermissionsDenied", "Lkotlin/Function0;", "grantedCallback", "requestWritePermission", "type", "Lcom/huami/widget/share/ShareContent;", "content", "", "checkNeedHideDialog", "hasPermission", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/Fragment;", "fragment", "b", "Lkotlin/jvm/functions/Function0;", "shareCallback", "<init>", "(Landroidx/fragment/app/Fragment;)V", "Companion", "share_release"}, k = 1, mv = {1, 5, 1})
public final class SharePermissionManager implements EasyPermissions.PermissionCallbacks {
    private static final int c = 1024;

    @NotNull
    private static final String d = "SharePermissionManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> shareCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "权限拒绝发生错误：" + this.a;
        }
    }

    public SharePermissionManager(@NotNull Fragment fragment) {
        this.fragment = fragment;
    }

    public final boolean checkNeedHideDialog(int type, @Nullable ShareContent content) {
        if (type == 13 && content != null) {
            String str = content.bitmapUrl;
            if (!(str == null || str.length() == 0)) {
                return hasPermission();
            }
        }
        return true;
    }

    public final boolean hasPermission() {
        Context context = this.fragment.getContext();
        if (context == null) {
            return false;
        }
        return EasyPermissions.hasPermissions(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    @SuppressLint({"RestrictedApi"})
    public void onPermissionsDenied(int requestCode, @NotNull List<String> perms) {
        if (EasyPermissions.permissionPermanentlyDenied(this.fragment, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            new PermissionDialogFragmentCompat.Builder().setMessage(this.fragment.getString(R.string.permission_denied_msg_home_basic)).create().show(this.fragment.requireFragmentManager(), "");
            return;
        }
        try {
            IconToast.showError(this.fragment.requireActivity().getApplicationContext(), R.string.no_sdcard_permission_title);
        } catch (Exception e) {
            HMLog.info(d, new a(e));
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int requestCode, @NotNull List<String> perms) {
        Function0<Unit> function0 = this.shareCallback;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this, this.fragment);
    }

    public final void requestWritePermission(@NotNull Function0<Unit> grantedCallback) {
        this.shareCallback = grantedCallback;
        if (!hasPermission()) {
            EasyPermissions.directRequestPermissions(this.fragment, 1024, "android.permission.WRITE_EXTERNAL_STORAGE");
            return;
        }
        Function0<Unit> function0 = this.shareCallback;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
