package com.huami.watchfacesstore.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.lib.SelectImagePermissionManager;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ui.SelectImageFragment;
import com.huami.watchfacesstore.ui.base.BaseDialogFragment;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0015J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0014R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/watchfacesstore/ui/SelectImageFragment;", "Lcom/huami/watchfacesstore/ui/base/BaseDialogFragment;", "Lcom/huami/utils/easypermission/EasyPermissions$PermissionCallbacks;", "", "requestCode", "", "", "permissions", "", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "perms", "onPermissionsGranted", "onPermissionsDenied", "Landroid/view/View;", "initView", "onStart", "", "hasPadding", "hasBackground", "Lcom/huami/lib/SelectImagePermissionManager;", "e", "Lkotlin/Lazy;", SOAP.XMLNS, "()Lcom/huami/lib/SelectImagePermissionManager;", "permissionManager", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SelectImageFragment extends BaseDialogFragment implements EasyPermissions.PermissionCallbacks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int REQUEST_CODE_FROM_DIAL = 1023;

    @NotNull
    private static final String f = "KEY_REQUEST_CODE";

    @NotNull
    private static final String g = "SelectImageFragment";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy permissionManager = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/watchfacesstore/ui/SelectImageFragment$Companion;", "", "", "requestCode", "Lcom/huami/watchfacesstore/ui/SelectImageFragment;", "newInstance", "", SelectImageFragment.f, "Ljava/lang/String;", "REQUEST_CODE_FROM_DIAL", LogUtil.I, "TAG", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectImageFragment newInstance(int requestCode) {
            SelectImageFragment selectImageFragment = new SelectImageFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(SelectImageFragment.f, requestCode);
            selectImageFragment.setArguments(bundle);
            return selectImageFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/SelectImagePermissionManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SelectImagePermissionManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelectImagePermissionManager invoke() {
            return new SelectImagePermissionManager(SelectImageFragment.this);
        }
    }

    private final SelectImagePermissionManager s() {
        return (SelectImagePermissionManager) this.permissionManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SelectImageFragment selectImageFragment, View view) {
        SelectImagePermissionManager.checkCameraPermission$default(selectImageFragment.s(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SelectImageFragment selectImageFragment, View view) {
        SelectImagePermissionManager.checkStoragePermission$default(selectImageFragment.s(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SelectImageFragment selectImageFragment, View view) {
        selectImageFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SelectImageFragment selectImageFragment, View view) {
        selectImageFragment.dismiss();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment
    @SuppressLint({"InflateParams"})
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.wf_fragment_select_img, (ViewGroup) null);
        viewInflate.findViewById(R.id.select_image_camera_area).setOnClickListener(new View.OnClickListener() { // from class: im6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectImageFragment.t(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.select_image_local_area).setOnClickListener(new View.OnClickListener() { // from class: jm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectImageFragment.u(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.select_image_cancel).setOnClickListener(new View.OnClickListener() { // from class: lm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectImageFragment.v(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: km6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectImageFragment.w(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsDenied(int requestCode, @NotNull List<String> perms) {
        s().onPermissionsDenied(requestCode, perms);
        dismiss();
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int requestCode, @NotNull List<String> perms) {
        s().onPermissionsGranted(requestCode, perms);
        if (requestCode == 112) {
            FragmentActivity activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity");
            ((WatchFaceDetailActivity) activity).takePhoto();
        } else if (requestCode == 113) {
            FragmentActivity activity2 = getActivity();
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity");
            ((WatchFaceDetailActivity) activity2).openGallery();
        }
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        s().onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
        }
    }
}
