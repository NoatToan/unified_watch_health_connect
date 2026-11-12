package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.module.homepage.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageFragmentCardBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout cardFragment;

    private HomepageFragmentCardBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout cardFragment) {
        this.a = rootView;
        this.cardFragment = cardFragment;
    }

    @NonNull
    public static HomepageFragmentCardBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        FrameLayout frameLayout = (FrameLayout) rootView;
        return new HomepageFragmentCardBinding(frameLayout, frameLayout);
    }

    @NonNull
    public static HomepageFragmentCardBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageFragmentCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_fragment_card, parent, false);
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
