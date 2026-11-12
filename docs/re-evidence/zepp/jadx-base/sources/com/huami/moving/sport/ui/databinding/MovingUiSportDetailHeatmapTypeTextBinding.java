package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.moving.sport.ui.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiSportDetailHeatmapTypeTextBinding implements ViewBinding {

    @NonNull
    private final RadioButton a;

    private MovingUiSportDetailHeatmapTypeTextBinding(@NonNull RadioButton radioButton) {
        this.a = radioButton;
    }

    @NonNull
    public static MovingUiSportDetailHeatmapTypeTextBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new MovingUiSportDetailHeatmapTypeTextBinding((RadioButton) view);
    }

    @NonNull
    public static MovingUiSportDetailHeatmapTypeTextBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiSportDetailHeatmapTypeTextBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_sport_detail_heatmap_type_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RadioButton getRoot() {
        return this.a;
    }
}
