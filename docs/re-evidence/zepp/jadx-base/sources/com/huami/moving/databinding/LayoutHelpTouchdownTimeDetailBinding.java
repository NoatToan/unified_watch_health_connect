package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.moving.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class LayoutHelpTouchdownTimeDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    private LayoutHelpTouchdownTimeDetailBinding(@NonNull LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    @NonNull
    public static LayoutHelpTouchdownTimeDetailBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new LayoutHelpTouchdownTimeDetailBinding((LinearLayout) view);
    }

    @NonNull
    public static LayoutHelpTouchdownTimeDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutHelpTouchdownTimeDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_help_touchdown_time_detail, viewGroup, false);
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
