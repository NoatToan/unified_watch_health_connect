package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityBoltClearDataBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    private ActivityBoltClearDataBinding(@NonNull LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    @NonNull
    public static ActivityBoltClearDataBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ActivityBoltClearDataBinding((LinearLayout) view);
    }

    @NonNull
    public static ActivityBoltClearDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBoltClearDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bolt_clear_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
