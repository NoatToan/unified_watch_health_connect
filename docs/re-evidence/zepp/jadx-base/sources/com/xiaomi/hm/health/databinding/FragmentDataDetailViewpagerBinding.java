package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.training.ui.widget.WrapContentHeightViewPager;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentDataDetailViewpagerBinding implements ViewBinding {

    @NonNull
    private final WrapContentHeightViewPager a;

    @NonNull
    public final WrapContentHeightViewPager viewpager;

    private FragmentDataDetailViewpagerBinding(@NonNull WrapContentHeightViewPager rootView, @NonNull WrapContentHeightViewPager viewpager) {
        this.a = rootView;
        this.viewpager = viewpager;
    }

    @NonNull
    public static FragmentDataDetailViewpagerBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) rootView;
        return new FragmentDataDetailViewpagerBinding(wrapContentHeightViewPager, wrapContentHeightViewPager);
    }

    @NonNull
    public static FragmentDataDetailViewpagerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentDataDetailViewpagerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_data_detail_viewpager, parent, false);
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
