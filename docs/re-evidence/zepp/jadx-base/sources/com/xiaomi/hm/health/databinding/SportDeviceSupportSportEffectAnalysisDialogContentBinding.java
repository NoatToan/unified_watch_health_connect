package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SportDeviceSupportSportEffectAnalysisDialogContentBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView sportAnalysisDialogClose;

    private SportDeviceSupportSportEffectAnalysisDialogContentBinding(@NonNull LinearLayout rootView, @NonNull ImageView sportAnalysisDialogClose) {
        this.a = rootView;
        this.sportAnalysisDialogClose = sportAnalysisDialogClose;
    }

    @NonNull
    public static SportDeviceSupportSportEffectAnalysisDialogContentBinding bind(@NonNull View rootView) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sport_analysis_dialog_close);
        if (imageView != null) {
            return new SportDeviceSupportSportEffectAnalysisDialogContentBinding((LinearLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.sport_analysis_dialog_close)));
    }

    @NonNull
    public static SportDeviceSupportSportEffectAnalysisDialogContentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SportDeviceSupportSportEffectAnalysisDialogContentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sport_device_support_sport_effect_analysis_dialog_content, parent, false);
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
