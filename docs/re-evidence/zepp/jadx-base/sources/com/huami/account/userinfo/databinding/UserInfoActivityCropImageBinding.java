package com.huami.account.userinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.ui.baseui.ClipImageLayout;
import com.huami.lib.view.dim.DimPanelBottomBar;

/* JADX INFO: loaded from: classes4.dex */
public final class UserInfoActivityCropImageBinding implements ViewBinding {

    @NonNull
    public final ClipImageLayout CropImageView;

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final DimPanelBottomBar bottomBar;

    private UserInfoActivityCropImageBinding(@NonNull RelativeLayout relativeLayout, @NonNull ClipImageLayout clipImageLayout, @NonNull DimPanelBottomBar dimPanelBottomBar) {
        this.a = relativeLayout;
        this.CropImageView = clipImageLayout;
        this.bottomBar = dimPanelBottomBar;
    }

    @NonNull
    public static UserInfoActivityCropImageBinding bind(@NonNull View view) {
        int i = R.id.CropImageView;
        ClipImageLayout clipImageLayout = (ClipImageLayout) ViewBindings.findChildViewById(view, i);
        if (clipImageLayout != null) {
            i = R.id.bottom_bar;
            DimPanelBottomBar dimPanelBottomBar = (DimPanelBottomBar) ViewBindings.findChildViewById(view, i);
            if (dimPanelBottomBar != null) {
                return new UserInfoActivityCropImageBinding((RelativeLayout) view, clipImageLayout, dimPanelBottomBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static UserInfoActivityCropImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static UserInfoActivityCropImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_info_activity_crop_image, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
