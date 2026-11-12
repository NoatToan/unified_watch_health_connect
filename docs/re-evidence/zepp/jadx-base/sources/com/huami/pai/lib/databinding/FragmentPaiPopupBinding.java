package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.pai.lib.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentPaiPopupBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    private FragmentPaiPopupBinding(@NonNull FrameLayout rootView) {
        this.a = rootView;
    }

    @NonNull
    public static FragmentPaiPopupBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new FragmentPaiPopupBinding((FrameLayout) rootView);
    }

    @NonNull
    public static FragmentPaiPopupBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPaiPopupBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_pai_popup, parent, false);
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
