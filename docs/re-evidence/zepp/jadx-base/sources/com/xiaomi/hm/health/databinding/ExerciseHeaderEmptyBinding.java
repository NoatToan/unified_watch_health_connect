package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class ExerciseHeaderEmptyBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout llEmpty;

    private ExerciseHeaderEmptyBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llEmpty) {
        this.a = rootView;
        this.llEmpty = llEmpty;
    }

    @NonNull
    public static ExerciseHeaderEmptyBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new ExerciseHeaderEmptyBinding(linearLayout, linearLayout);
    }

    @NonNull
    public static ExerciseHeaderEmptyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ExerciseHeaderEmptyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.exercise_header_empty, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
