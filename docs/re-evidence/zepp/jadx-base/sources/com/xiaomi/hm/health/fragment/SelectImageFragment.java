package com.xiaomi.hm.health.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.devicex.R;
import com.huami.lib.v2.RequestPermissionCallback;
import com.huami.lib.v2.SelectImagePermissionManager;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.utils.permissionx.PermissionResult;
import com.xiaomi.hm.health.activity.CropImageActivity;
import com.xiaomi.hm.health.device.watchskinnew.ui.DiyDialBgActivity;
import com.xiaomi.hm.health.device.watchskinstore.ui.WatchSkinDetailActivity;

/* JADX INFO: loaded from: classes21.dex */
public class SelectImageFragment extends BaseDialogFragment {
    public static final String ARG_WITH_LEGAL_CHECK = "withLegalCheck";
    public static final int REQUEST_CODE_FROM_DIAL = 1023;
    public static final int REQUEST_CODE_FROM_FEEDBACK = 1024;
    public static final int REQUEST_CODE_FROM_WATCH_SKIN = 1025;
    private static final String e = "KEY_REQUEST_CODE";
    private static final int f = -1;

    public enum From {
        FROM_AVATAR,
        FROM_DIAL
    }

    public interface IAction {
        void onClickCamera();

        void onClickGallery();
    }

    public class a extends RequestPermissionCallback {
        public a() {
        }

        @Override // com.huami.lib.v2.RequestPermissionCallback
        public void onPermissionResult(@NonNull String str, @NonNull PermissionResult permissionResult) {
            if (permissionResult instanceof PermissionResult.Granted) {
                SelectImageFragment.this.o();
            }
            SelectImageFragment.this.dismiss();
        }
    }

    public class b extends RequestPermissionCallback {
        public b() {
        }

        @Override // com.huami.lib.v2.RequestPermissionCallback
        public void onPermissionResult(@NonNull String str, @NonNull PermissionResult permissionResult) {
            if (permissionResult instanceof PermissionResult.Granted) {
                SelectImageFragment.this.p();
            }
            SelectImageFragment.this.dismiss();
        }
    }

    private int i() {
        if (getArguments() == null) {
            return -1;
        }
        return getArguments().getInt(e, -1);
    }

    private boolean j() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("withLegalCheck");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        SelectImagePermissionManager.checkCameraPermission(requireActivity(), new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        SelectImagePermissionManager.checkStoragePermission(requireActivity(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        dismiss();
    }

    public static SelectImageFragment newInstance(int i) {
        SelectImageFragment selectImageFragment = new SelectImageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(e, i);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (1024 == getTargetRequestCode() && getTargetFragment() != null) {
            ((IAction) getTargetFragment()).onClickCamera();
            return;
        }
        if (1023 == i() && !isDetached() && getActivity() != null) {
            ((DiyDialBgActivity) getActivity()).takePhoto();
        } else if (1025 != i() || isDetached() || getActivity() == null) {
            CropImageActivity.startPageCropImageActivity(getActivity(), 19, From.FROM_AVATAR, j());
        } else {
            ((WatchSkinDetailActivity) getActivity()).takePhoto();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (1024 == getTargetRequestCode() && getTargetFragment() != null) {
            ((IAction) getTargetFragment()).onClickGallery();
            return;
        }
        if (1023 == i() && !isDetached() && getActivity() != null) {
            ((DiyDialBgActivity) getActivity()).openGallery();
        } else if (1025 != i() || isDetached() || getActivity() == null) {
            CropImageActivity.startPageCropImageActivity(getActivity(), 18, From.FROM_AVATAR, j());
        } else {
            ((WatchSkinDetailActivity) getActivity()).openGallery();
        }
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
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_select_image, (ViewGroup) null);
        viewInflate.findViewById(R.id.select_image_camera_area).setOnClickListener(new View.OnClickListener() { // from class: bm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
        int i = R.id.select_image_local_area;
        TextView textView = (TextView) viewInflate.findViewById(i);
        if (1024 == getTargetRequestCode()) {
            textView.setText(R.string.feedback_upload_gallary);
        }
        viewInflate.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: mm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l(view);
            }
        });
        viewInflate.findViewById(R.id.select_image_cancel).setOnClickListener(new View.OnClickListener() { // from class: cm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: dm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n(view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
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
