package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityBloodPressureBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FragmentContainerView containerContent;

    @NonNull
    public final FragmentContainerView containerTab;

    @NonNull
    public final TitlebarBloodPressureBinding containerTitlebar;

    @NonNull
    public final AppCompatTextView tvJpHint;

    private ActivityBloodPressureBinding(@NonNull LinearLayout linearLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2, @NonNull TitlebarBloodPressureBinding titlebarBloodPressureBinding, @NonNull AppCompatTextView appCompatTextView) {
        this.a = linearLayout;
        this.containerContent = fragmentContainerView;
        this.containerTab = fragmentContainerView2;
        this.containerTitlebar = titlebarBloodPressureBinding;
        this.tvJpHint = appCompatTextView;
    }

    @NonNull
    public static ActivityBloodPressureBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.container_content;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = R.id.container_tab;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.container_titlebar))) != null) {
                TitlebarBloodPressureBinding titlebarBloodPressureBindingBind = TitlebarBloodPressureBinding.bind(viewFindChildViewById);
                i = R.id.tv_jp_hint;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    return new ActivityBloodPressureBinding((LinearLayout) view, fragmentContainerView, fragmentContainerView2, titlebarBloodPressureBindingBind, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBloodPressureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBloodPressureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_blood_pressure, viewGroup, false);
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
