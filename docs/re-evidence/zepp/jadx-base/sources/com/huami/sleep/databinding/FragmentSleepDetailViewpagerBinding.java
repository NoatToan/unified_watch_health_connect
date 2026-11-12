package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.sleep.R;
import com.huami.sleep.view.WrapContentHeightViewPager;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSleepDetailViewpagerBinding implements ViewBinding {

    @NonNull
    private final WrapContentHeightViewPager a;

    @NonNull
    public final WrapContentHeightViewPager viewpager;

    private FragmentSleepDetailViewpagerBinding(@NonNull WrapContentHeightViewPager rootView, @NonNull WrapContentHeightViewPager viewpager) {
        this.a = rootView;
        this.viewpager = viewpager;
    }

    @NonNull
    public static FragmentSleepDetailViewpagerBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) rootView;
        return new FragmentSleepDetailViewpagerBinding(wrapContentHeightViewPager, wrapContentHeightViewPager);
    }

    @NonNull
    public static FragmentSleepDetailViewpagerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSleepDetailViewpagerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_detail_viewpager, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public WrapContentHeightViewPager getRoot() {
        return this.a;
    }
}
