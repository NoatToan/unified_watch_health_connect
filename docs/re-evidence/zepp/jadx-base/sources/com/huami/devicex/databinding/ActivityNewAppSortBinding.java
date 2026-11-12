package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityNewAppSortBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout newAppSortContainer;

    private ActivityNewAppSortBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.newAppSortContainer = frameLayout2;
    }

    @NonNull
    public static ActivityNewAppSortBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        FrameLayout frameLayout = (FrameLayout) view;
        return new ActivityNewAppSortBinding(frameLayout, frameLayout);
    }

    @NonNull
    public static ActivityNewAppSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityNewAppSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_new_app_sort, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
