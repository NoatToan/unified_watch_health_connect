package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.sportfitness.view.ExerciseXAxisView;

/* JADX INFO: loaded from: classes20.dex */
public final class ChartXYBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View bottomLine;

    @NonNull
    public final TextView bottomValue;

    @NonNull
    public final View firstLine;

    @NonNull
    public final TextView firstValue;

    @NonNull
    public final View midLine;

    @NonNull
    public final TextView midValue;

    @NonNull
    public final View secLine;

    @NonNull
    public final TextView secValue;

    @NonNull
    public final FrameLayout sportEnergyChartArea;

    @NonNull
    public final TextView sportEnergyNoData;

    @NonNull
    public final ExerciseXAxisView sportEnergyXAxis;

    @NonNull
    public final View triLine;

    @NonNull
    public final TextView triValue;

    private ChartXYBinding(@NonNull ConstraintLayout rootView, @NonNull View bottomLine, @NonNull TextView bottomValue, @NonNull View firstLine, @NonNull TextView firstValue, @NonNull View midLine, @NonNull TextView midValue, @NonNull View secLine, @NonNull TextView secValue, @NonNull FrameLayout sportEnergyChartArea, @NonNull TextView sportEnergyNoData, @NonNull ExerciseXAxisView sportEnergyXAxis, @NonNull View triLine, @NonNull TextView triValue) {
        this.a = rootView;
        this.bottomLine = bottomLine;
        this.bottomValue = bottomValue;
        this.firstLine = firstLine;
        this.firstValue = firstValue;
        this.midLine = midLine;
        this.midValue = midValue;
        this.secLine = secLine;
        this.secValue = secValue;
        this.sportEnergyChartArea = sportEnergyChartArea;
        this.sportEnergyNoData = sportEnergyNoData;
        this.sportEnergyXAxis = sportEnergyXAxis;
        this.triLine = triLine;
        this.triValue = triValue;
    }

    @NonNull
    public static ChartXYBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_line);
        if (viewFindChildViewById != null) {
            i = R.id.bottom_value;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bottom_value);
            if (textView != null) {
                i = R.id.first_line;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.first_line);
                if (viewFindChildViewById2 != null) {
                    i = R.id.first_value;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.first_value);
                    if (textView2 != null) {
                        i = R.id.mid_line;
                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.mid_line);
                        if (viewFindChildViewById3 != null) {
                            i = R.id.mid_value;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.mid_value);
                            if (textView3 != null) {
                                i = R.id.sec_line;
                                View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.sec_line);
                                if (viewFindChildViewById4 != null) {
                                    i = R.id.sec_value;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sec_value);
                                    if (textView4 != null) {
                                        i = R.id.sport_energy_chart_area;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.sport_energy_chart_area);
                                        if (frameLayout != null) {
                                            i = R.id.sport_energy_no_data;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_energy_no_data);
                                            if (textView5 != null) {
                                                i = R.id.sport_energy_x_axis;
                                                ExerciseXAxisView exerciseXAxisView = (ExerciseXAxisView) ViewBindings.findChildViewById(rootView, R.id.sport_energy_x_axis);
                                                if (exerciseXAxisView != null) {
                                                    i = R.id.tri_line;
                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.tri_line);
                                                    if (viewFindChildViewById5 != null) {
                                                        i = R.id.tri_value;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tri_value);
                                                        if (textView6 != null) {
                                                            return new ChartXYBinding((ConstraintLayout) rootView, viewFindChildViewById, textView, viewFindChildViewById2, textView2, viewFindChildViewById3, textView3, viewFindChildViewById4, textView4, frameLayout, textView5, exerciseXAxisView, viewFindChildViewById5, textView6);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ChartXYBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ChartXYBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.chart_x_y, parent, false);
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
