package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.xiaomi.hm.health.bodyfat.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentMeasureBodyBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    private FragmentMeasureBodyBinding(@NonNull RelativeLayout relativeLayout) {
        this.a = relativeLayout;
    }

    @NonNull
    public static FragmentMeasureBodyBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new FragmentMeasureBodyBinding((RelativeLayout) view);
    }

    @NonNull
    public static FragmentMeasureBodyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMeasureBodyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_measure_body, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
