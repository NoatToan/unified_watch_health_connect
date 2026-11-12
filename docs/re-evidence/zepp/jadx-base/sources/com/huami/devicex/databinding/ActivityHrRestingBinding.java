package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHrRestingBinding implements ViewBinding {

    @NonNull
    private final ViewPager a;

    @NonNull
    public final ViewPager viewPager;

    private ActivityHrRestingBinding(@NonNull ViewPager viewPager, @NonNull ViewPager viewPager2) {
        this.a = viewPager;
        this.viewPager = viewPager2;
    }

    @NonNull
    public static ActivityHrRestingBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        ViewPager viewPager = (ViewPager) view;
        return new ActivityHrRestingBinding(viewPager, viewPager);
    }

    @NonNull
    public static ActivityHrRestingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHrRestingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_hr_resting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ViewPager getRoot() {
        return this.a;
    }
}
