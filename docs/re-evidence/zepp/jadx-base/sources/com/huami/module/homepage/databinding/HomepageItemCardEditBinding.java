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
public final class HomepageItemCardEditBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    private HomepageItemCardEditBinding(@NonNull FrameLayout rootView) {
        this.a = rootView;
    }

    @NonNull
    public static HomepageItemCardEditBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new HomepageItemCardEditBinding((FrameLayout) rootView);
    }

    @NonNull
    public static HomepageItemCardEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_edit, parent, false);
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
