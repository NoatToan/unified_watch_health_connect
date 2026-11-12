package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class LayoutSleepStatisticsChartIntroBinding implements ViewBinding {

    @NonNull
    private final View a;

    @Nullable
    public final Guideline gCenterY;

    @Nullable
    public final TextView introAwake;

    @Nullable
    public final TextView introDeep;

    @Nullable
    public final TextView introLight;

    @Nullable
    public final TextView introNap;

    @Nullable
    public final TextView introRem;

    @Nullable
    public final TextView introRemPlaceholder;

    private LayoutSleepStatisticsChartIntroBinding(@NonNull View rootView, @Nullable Guideline gCenterY, @Nullable TextView introAwake, @Nullable TextView introDeep, @Nullable TextView introLight, @Nullable TextView introNap, @Nullable TextView introRem, @Nullable TextView introRemPlaceholder) {
        this.a = rootView;
        this.gCenterY = gCenterY;
        this.introAwake = introAwake;
        this.introDeep = introDeep;
        this.introLight = introLight;
        this.introNap = introNap;
        this.introRem = introRem;
        this.introRemPlaceholder = introRemPlaceholder;
    }

    @NonNull
    public static LayoutSleepStatisticsChartIntroBinding bind(@NonNull View rootView) {
        return new LayoutSleepStatisticsChartIntroBinding(rootView, (Guideline) ViewBindings.findChildViewById(rootView, R.id.g_center_y), (TextView) ViewBindings.findChildViewById(rootView, R.id.intro_awake), (TextView) ViewBindings.findChildViewById(rootView, R.id.intro_deep), (TextView) ViewBindings.findChildViewById(rootView, R.id.intro_light), (TextView) ViewBindings.findChildViewById(rootView, R.id.intro_nap), (TextView) ViewBindings.findChildViewById(rootView, R.id.intro_rem), (TextView) ViewBindings.findChildViewById(rootView, R.id.intro_rem_placeholder));
    }

    @NonNull
    public static LayoutSleepStatisticsChartIntroBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }

    @NonNull
    public static LayoutSleepStatisticsChartIntroBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_sleep_statistics_chart_intro, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
