package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.VerticalScrollView;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivityNapSleepDetailBinding implements ViewBinding {

    @NonNull
    private final VerticalScrollView a;

    @NonNull
    public final FrameLayout container;

    private ActivityNapSleepDetailBinding(@NonNull VerticalScrollView rootView, @NonNull FrameLayout container) {
        this.a = rootView;
        this.container = container;
    }

    @NonNull
    public static ActivityNapSleepDetailBinding bind(@NonNull View rootView) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            return new ActivityNapSleepDetailBinding((VerticalScrollView) rootView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityNapSleepDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityNapSleepDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_nap_sleep_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public VerticalScrollView getRoot() {
        return this.a;
    }
}
