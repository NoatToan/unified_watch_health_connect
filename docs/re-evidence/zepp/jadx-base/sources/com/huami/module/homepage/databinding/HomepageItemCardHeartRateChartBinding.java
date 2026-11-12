package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardHeartRateChartBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView avgHr;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final BackgroundTextView chartMask;

    @NonNull
    public final Button openHrDetectButton;

    @NonNull
    public final Space space;

    private HomepageItemCardHeartRateChartBinding(@NonNull ConstraintLayout rootView, @NonNull TextView avgHr, @NonNull FrameLayout chartContainer, @NonNull BackgroundTextView chartMask, @NonNull Button openHrDetectButton, @NonNull Space space) {
        this.a = rootView;
        this.avgHr = avgHr;
        this.chartContainer = chartContainer;
        this.chartMask = chartMask;
        this.openHrDetectButton = openHrDetectButton;
        this.space = space;
    }

    @NonNull
    public static HomepageItemCardHeartRateChartBinding bind(@NonNull View rootView) {
        int i = R.id.avg_hr;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.chart_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
            if (frameLayout != null) {
                i = R.id.chartMask;
                BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                if (backgroundTextView != null) {
                    i = R.id.open_hr_detect_button;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                    if (button != null) {
                        i = R.id.space;
                        Space space = (Space) ViewBindings.findChildViewById(rootView, i);
                        if (space != null) {
                            return new HomepageItemCardHeartRateChartBinding((ConstraintLayout) rootView, textView, frameLayout, backgroundTextView, button, space);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardHeartRateChartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardHeartRateChartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_heart_rate_chart, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
