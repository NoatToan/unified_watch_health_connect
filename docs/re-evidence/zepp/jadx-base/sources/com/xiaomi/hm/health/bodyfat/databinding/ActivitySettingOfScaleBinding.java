package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.xiaomi.hm.health.bodyfat.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySettingOfScaleBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout fragmentContainer;

    private ActivitySettingOfScaleBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.fragmentContainer = frameLayout2;
    }

    @NonNull
    public static ActivitySettingOfScaleBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        FrameLayout frameLayout = (FrameLayout) view;
        return new ActivitySettingOfScaleBinding(frameLayout, frameLayout);
    }

    @NonNull
    public static ActivitySettingOfScaleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySettingOfScaleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_setting_of_scale, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
