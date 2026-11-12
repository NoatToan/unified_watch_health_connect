package com.huami.account.userinfo.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.manager.SelectImagePermissionManager;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.utils.easypermission.EasyPermissions;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class SelectImageFragment extends BaseDialogFragment implements EasyPermissions.PermissionCallbacks {
    public static final String ARG_WITH_LEGAL_CHECK = "withLegalCheck";
    public static final int REQUEST_CODE_FROM_DIAL = 1023;
    public static final int REQUEST_CODE_FROM_FEEDBACK = 1024;
    public static final int REQUEST_CODE_FROM_WATCH_SKIN = 1025;
    private static final String f = "KEY_REQUEST_CODE";
    private static final int g = -1;
    private SelectImagePermissionManager e;

    public enum From {
        FROM_AVATAR,
        FROM_DIAL
    }

    public interface IAction {
        void onClickCamera();

        void onClickGallery();
    }

    private int h() {
        if (getArguments() == null) {
            return -1;
        }
        return getArguments().getInt(f, -1);
    }

    private boolean i() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("withLegalCheck");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        this.e.checkCameraPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        this.e.checkStoragePermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit n(Integer num) {
        if (num.intValue() == 112) {
            o();
        } else if (num.intValue() == 113) {
            p();
        }
        dismiss();
        return null;
    }

    public static SelectImageFragment newInstance(int i) {
        SelectImageFragment selectImageFragment = new SelectImageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(f, i);
        selectImageFragment.setArguments(bundle);
        return selectImageFragment;
    }

    public static SelectImageFragment newInstanceWithLegalCheck() {
        Bundle bundle = new Bundle();
        SelectImageFragment selectImageFragment = new SelectImageFragment();
        bundle.putBoolean("withLegalCheck", true);
        selectImageFragment.setArguments(bundle);
        return selectImageFragment;
    }

    private void o() {
        CropImageActivity.startPageCropImageActivity(getActivity(), 19, From.FROM_AVATAR, i());
    }

    private void p() {
        CropImageActivity.startPageCropImageActivity(getActivity(), 18, From.FROM_AVATAR, i());
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @SuppressLint({"InflateParams"})
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.user_info_fragment_select_image, (ViewGroup) null);
        viewInflate.findViewById(R.id.select_image_camera_area).setOnClickListener(new View.OnClickListener() { // from class: am6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
        int i = R.id.select_image_local_area;
        TextView textView = (TextView) viewInflate.findViewById(i);
        if (1024 == getTargetRequestCode()) {
            textView.setText(R.string.user_info_feedback_upload_gallary);
        }
        viewInflate.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: fm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
        viewInflate.findViewById(R.id.select_image_cancel).setOnClickListener(new View.OnClickListener() { // from class: em6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l(view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: gm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    @SuppressLint({"WrongConstant"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
        SelectImagePermissionManager selectImagePermissionManager = new SelectImagePermissionManager(this);
        this.e = selectImagePermissionManager;
        selectImagePermissionManager.setSdkLowMCallback(new Function1() { // from class: hm6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.n((Integer) obj);
            }
        });
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsDenied(int i, @NonNull List<String> list) {
        this.e.onPermissionsDenied(i, list);
        dismiss();
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int i, @NonNull List<String> list) {
        this.e.onPermissionsGranted(i, list);
        if (i == 112) {
            o();
        } else if (i == 113) {
            p();
        }
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.e.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
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
