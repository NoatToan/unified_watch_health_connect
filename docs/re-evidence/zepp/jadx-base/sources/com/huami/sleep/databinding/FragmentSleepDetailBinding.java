package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.WrapContentHeightViewPager;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSleepDetailBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final WrapContentHeightViewPager viewpager;

    private FragmentSleepDetailBinding(@NonNull RelativeLayout rootView, @NonNull WrapContentHeightViewPager viewpager) {
        this.a = rootView;
        this.viewpager = viewpager;
    }

    @NonNull
    public static FragmentSleepDetailBinding bind(@NonNull View rootView) {
        int i = R.id.viewpager;
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) ViewBindings.findChildViewById(rootView, i);
        if (wrapContentHeightViewPager != null) {
            return new FragmentSleepDetailBinding((RelativeLayout) rootView, wrapContentHeightViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSleepDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSleepDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
