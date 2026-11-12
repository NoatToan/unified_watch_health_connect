package com.huami.bloodoxygen.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.view.BloodOxygenTitleBar;

/* JADX INFO: loaded from: classes5.dex */
public final class BoUiActivityDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout contentContainer;

    @NonNull
    public final BloodOxygenTitleBar titleBar;

    @NonNull
    public final BoUiTabSelectorBinding uiTabSelector;

    private BoUiActivityDetailBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull BloodOxygenTitleBar bloodOxygenTitleBar, @NonNull BoUiTabSelectorBinding boUiTabSelectorBinding) {
        this.a = linearLayout;
        this.contentContainer = frameLayout;
        this.titleBar = bloodOxygenTitleBar;
        this.uiTabSelector = boUiTabSelectorBinding;
    }

    @NonNull
    public static BoUiActivityDetailBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.content_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.title_bar;
            BloodOxygenTitleBar bloodOxygenTitleBar = (BloodOxygenTitleBar) ViewBindings.findChildViewById(view, i);
            if (bloodOxygenTitleBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.ui_tab_selector))) != null) {
                return new BoUiActivityDetailBinding((LinearLayout) view, frameLayout, bloodOxygenTitleBar, BoUiTabSelectorBinding.bind(viewFindChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BoUiActivityDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiActivityDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_activity_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
