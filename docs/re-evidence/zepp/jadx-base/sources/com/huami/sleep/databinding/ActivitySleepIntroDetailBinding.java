package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.sleep.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivitySleepIntroDetailBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout fragmentContainer;

    private ActivitySleepIntroDetailBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout fragmentContainer) {
        this.a = rootView;
        this.fragmentContainer = fragmentContainer;
    }

    @NonNull
    public static ActivitySleepIntroDetailBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        FrameLayout frameLayout = (FrameLayout) rootView;
        return new ActivitySleepIntroDetailBinding(frameLayout, frameLayout);
    }

    @NonNull
    public static ActivitySleepIntroDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySleepIntroDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sleep_intro_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
