package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.heartrate.R;
import com.huami.heartrate.view.WrapContentHeightViewPager;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateFragmentDateContainerBinding implements ViewBinding {

    @NonNull
    private final WrapContentHeightViewPager a;

    @NonNull
    public final WrapContentHeightViewPager vpDateHeartRate;

    private HeartRateFragmentDateContainerBinding(@NonNull WrapContentHeightViewPager rootView, @NonNull WrapContentHeightViewPager vpDateHeartRate) {
        this.a = rootView;
        this.vpDateHeartRate = vpDateHeartRate;
    }

    @NonNull
    public static HeartRateFragmentDateContainerBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) rootView;
        return new HeartRateFragmentDateContainerBinding(wrapContentHeightViewPager, wrapContentHeightViewPager);
    }

    @NonNull
    public static HeartRateFragmentDateContainerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateFragmentDateContainerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_fragment_date_container, parent, false);
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
