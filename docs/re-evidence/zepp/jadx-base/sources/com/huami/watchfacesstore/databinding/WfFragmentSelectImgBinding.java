package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfFragmentSelectImgBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final View dlgEmptyAreaBtn;

    @NonNull
    public final TextView selectImageCameraArea;

    @NonNull
    public final TextView selectImageCancel;

    @NonNull
    public final TextView selectImageLocalArea;

    private WfFragmentSelectImgBinding(@NonNull LinearLayout rootView, @NonNull View dlgEmptyAreaBtn, @NonNull TextView selectImageCameraArea, @NonNull TextView selectImageCancel, @NonNull TextView selectImageLocalArea) {
        this.a = rootView;
        this.dlgEmptyAreaBtn = dlgEmptyAreaBtn;
        this.selectImageCameraArea = selectImageCameraArea;
        this.selectImageCancel = selectImageCancel;
        this.selectImageLocalArea = selectImageLocalArea;
    }

    @NonNull
    public static WfFragmentSelectImgBinding bind(@NonNull View rootView) {
        int i = R.id.dlg_empty_area_btn;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            i = R.id.select_image_camera_area;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.select_image_cancel;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.select_image_local_area;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        return new WfFragmentSelectImgBinding((LinearLayout) rootView, viewFindChildViewById, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfFragmentSelectImgBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfFragmentSelectImgBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_fragment_select_img, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
