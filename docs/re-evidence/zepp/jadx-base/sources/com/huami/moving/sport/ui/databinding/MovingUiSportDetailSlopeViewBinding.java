package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huami.moving.sport.ui.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiSportDetailSlopeViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    private MovingUiSportDetailSlopeViewBinding(@NonNull ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    @NonNull
    public static MovingUiSportDetailSlopeViewBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new MovingUiSportDetailSlopeViewBinding((ConstraintLayout) view);
    }

    @NonNull
    public static MovingUiSportDetailSlopeViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiSportDetailSlopeViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_sport_detail_slope_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
