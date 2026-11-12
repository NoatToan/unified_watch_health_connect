package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseActivityBloodPressureBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout baseContainerContent;

    @NonNull
    public final TitlebarBloodPressureBinding containerTitlebar;

    private BaseActivityBloodPressureBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull TitlebarBloodPressureBinding titlebarBloodPressureBinding) {
        this.a = linearLayout;
        this.baseContainerContent = frameLayout;
        this.containerTitlebar = titlebarBloodPressureBinding;
    }

    @NonNull
    public static BaseActivityBloodPressureBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.base_container_content;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.container_titlebar))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new BaseActivityBloodPressureBinding((LinearLayout) view, frameLayout, TitlebarBloodPressureBinding.bind(viewFindChildViewById));
    }

    @NonNull
    public static BaseActivityBloodPressureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BaseActivityBloodPressureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.base_activity_blood_pressure, viewGroup, false);
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
