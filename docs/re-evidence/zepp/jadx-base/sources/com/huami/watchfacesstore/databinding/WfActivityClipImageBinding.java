package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.view.CommonTitleBar;
import com.huami.watchfacesstore.view.clip.ClipImageLayout;

/* JADX INFO: loaded from: classes17.dex */
public final class WfActivityClipImageBinding implements ViewBinding {

    @NonNull
    public final ClipImageLayout CropImageView;

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CommonTitleBar commonTitleBar;

    @NonNull
    public final LinearLayout llBottom;

    @NonNull
    public final TextView tvCropCancel;

    @NonNull
    public final TextView tvCropConfirm;

    private WfActivityClipImageBinding(@NonNull ConstraintLayout rootView, @NonNull ClipImageLayout CropImageView, @NonNull CommonTitleBar commonTitleBar, @NonNull LinearLayout llBottom, @NonNull TextView tvCropCancel, @NonNull TextView tvCropConfirm) {
        this.a = rootView;
        this.CropImageView = CropImageView;
        this.commonTitleBar = commonTitleBar;
        this.llBottom = llBottom;
        this.tvCropCancel = tvCropCancel;
        this.tvCropConfirm = tvCropConfirm;
    }

    @NonNull
    public static WfActivityClipImageBinding bind(@NonNull View rootView) {
        int i = R.id.CropImageView;
        ClipImageLayout clipImageLayout = (ClipImageLayout) ViewBindings.findChildViewById(rootView, i);
        if (clipImageLayout != null) {
            i = R.id.common_title_bar;
            CommonTitleBar commonTitleBar = (CommonTitleBar) ViewBindings.findChildViewById(rootView, i);
            if (commonTitleBar != null) {
                i = R.id.ll_bottom;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = R.id.tv_crop_cancel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = R.id.tv_crop_confirm;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new WfActivityClipImageBinding((ConstraintLayout) rootView, clipImageLayout, commonTitleBar, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfActivityClipImageBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfActivityClipImageBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_activity_clip_image, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
