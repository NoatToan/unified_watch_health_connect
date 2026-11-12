package com.huami.account.userinfo.manager;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.huami.account.userinfo.R;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003J\u001a\u0010\u000e\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\fJ/\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0016J\u001e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0016J\u0012\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007J\u0012\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/account/userinfo/manager/SelectImagePermissionManager;", "Lcom/huami/utils/easypermission/EasyPermissions$PermissionCallbacks;", "", "isCamera", "Lcom/huami/account/userinfo/manager/SelectImagePage;", DTransferConstants.PAGE, "", "a", "", "resId", "", "b", "Lkotlin/Function1;", "sdkLowMCallback", "setSdkLowMCallback", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "perms", "onPermissionsGranted", "onPermissionsDenied", "selectImagePage", "checkCameraPermission", "checkStoragePermission", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/jvm/functions/Function1;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class SelectImagePermissionManager implements EasyPermissions.PermissionCallbacks {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Integer, Unit> sdkLowMCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectImagePage.values().length];
            iArr[SelectImagePage.BASE.ordinal()] = 1;
            iArr[SelectImagePage.WATCH_FACE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SelectImagePermissionManager(@NotNull Fragment fragment) {
        this.fragment = fragment;
    }

    private final String a(boolean isCamera, SelectImagePage page) {
        int i = WhenMappings.$EnumSwitchMapping$0[page.ordinal()];
        if (i == 1) {
            return isCamera ? "key_image_select_camera" : "key_image_select_photo";
        }
        if (i == 2) {
            return isCamera ? "key_image_select_camera_watch_face" : "key_image_select_photo_watch_face";
        }
        throw new NoWhenBranchMatchedException();
    }

    @SuppressLint({"RestrictedApi"})
    private final void b(int resId) {
        new PermissionDialogFragmentCompat.Builder().setMessage(this.fragment.getString(resId)).create().show(this.fragment.getParentFragmentManager(), "");
    }

    public static /* synthetic */ void checkCameraPermission$default(SelectImagePermissionManager selectImagePermissionManager, SelectImagePage selectImagePage, int i, Object obj) {
        if ((i & 1) != 0) {
            selectImagePage = SelectImagePage.BASE;
        }
        selectImagePermissionManager.checkCameraPermission(selectImagePage);
    }

    public static /* synthetic */ void checkStoragePermission$default(SelectImagePermissionManager selectImagePermissionManager, SelectImagePage selectImagePage, int i, Object obj) {
        if ((i & 1) != 0) {
            selectImagePage = SelectImagePage.BASE;
        }
        selectImagePermissionManager.checkStoragePermission(selectImagePage);
    }

    @JvmOverloads
    public final void checkCameraPermission() {
        checkCameraPermission$default(this, null, 1, null);
    }

    @JvmOverloads
    public final void checkCameraPermission(@NotNull SelectImagePage selectImagePage) {
        if (Build.VERSION.SDK_INT >= 23) {
            Fragment fragment = this.fragment;
            EasyPermissions.requestPermissions(fragment, fragment.getString(R.string.user_info_permission_rationale_msg_camera_select_image), 112, a(true, selectImagePage), "android.permission.CAMERA");
        } else {
            Function1<? super Integer, Unit> function1 = this.sdkLowMCallback;
            if (function1 == null) {
                return;
            }
            function1.invoke(112);
        }
    }

    @JvmOverloads
    public final void checkStoragePermission() {
        checkStoragePermission$default(this, null, 1, null);
    }

    @JvmOverloads
    public final void checkStoragePermission(@NotNull SelectImagePage selectImagePage) {
        if (Build.VERSION.SDK_INT >= 23) {
            Fragment fragment = this.fragment;
            EasyPermissions.requestPermissions(fragment, fragment.getString(R.string.user_info_permission_rationale_storage_select_image), 113, a(false, selectImagePage), "android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            Function1<? super Integer, Unit> function1 = this.sdkLowMCallback;
            if (function1 == null) {
                return;
            }
            function1.invoke(113);
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsDenied(int requestCode, @NotNull List<String> perms) {
        if (requestCode == 112) {
            b(R.string.user_info_permission_denied_msg_camera_select_camera);
        } else {
            if (requestCode != 113) {
                return;
            }
            b(R.string.user_info_permission_denied_msg_storage_select_image);
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int requestCode, @NotNull List<String> perms) {
    }

    @Override // androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this.fragment);
    }

    public final void setSdkLowMCallback(@NotNull Function1<? super Integer, Unit> sdkLowMCallback) {
        this.sdkLowMCallback = sdkLowMCallback;
    }
}
