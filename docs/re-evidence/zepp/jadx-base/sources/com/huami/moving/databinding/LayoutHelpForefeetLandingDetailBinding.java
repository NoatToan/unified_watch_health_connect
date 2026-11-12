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
public final class LayoutHelpForefeetLandingDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    private LayoutHelpForefeetLandingDetailBinding(@NonNull LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    @NonNull
    public static LayoutHelpForefeetLandingDetailBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new LayoutHelpForefeetLandingDetailBinding((LinearLayout) view);
    }

    @NonNull
    public static LayoutHelpForefeetLandingDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutHelpForefeetLandingDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_help_forefeet_landing_detail, viewGroup, false);
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
