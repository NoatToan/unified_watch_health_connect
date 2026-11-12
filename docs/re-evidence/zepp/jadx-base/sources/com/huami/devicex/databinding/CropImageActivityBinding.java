package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.view.dim.DimPanelBottomBar;
import com.xiaomi.hm.health.baseui.clip.ClipImageLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class CropImageActivityBinding implements ViewBinding {

    @NonNull
    public final ClipImageLayout CropImageView;

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final DimPanelBottomBar bottomBar;

    private CropImageActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull ClipImageLayout clipImageLayout, @NonNull DimPanelBottomBar dimPanelBottomBar) {
        this.a = relativeLayout;
        this.CropImageView = clipImageLayout;
        this.bottomBar = dimPanelBottomBar;
    }

    @NonNull
    public static CropImageActivityBinding bind(@NonNull View view) {
        int i = R.id.CropImageView;
        ClipImageLayout clipImageLayout = (ClipImageLayout) ViewBindings.findChildViewById(view, i);
        if (clipImageLayout != null) {
            i = R.id.bottom_bar;
            DimPanelBottomBar dimPanelBottomBar = (DimPanelBottomBar) ViewBindings.findChildViewById(view, i);
            if (dimPanelBottomBar != null) {
                return new CropImageActivityBinding((RelativeLayout) view, clipImageLayout, dimPanelBottomBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CropImageActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CropImageActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.crop_image_activity, viewGroup, false);
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
