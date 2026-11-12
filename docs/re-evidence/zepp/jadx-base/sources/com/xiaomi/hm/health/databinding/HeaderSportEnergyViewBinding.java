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
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderSportEnergyViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View divider;

    @NonNull
    public final FrameLayout flChartXyContainer;

    @NonNull
    public final TextView mainActivityTitle;

    @NonNull
    public final ConstraintLayout sportEnergyContainer;

    @NonNull
    public final TextView sportEnergyDataUnit;

    @NonNull
    public final TextView sportEnergyDesc;

    @NonNull
    public final TypefaceTextView sportEnergyMainData;

    @NonNull
    public final TextView sportEnergyTitle;

    private HeaderSportEnergyViewBinding(@NonNull ConstraintLayout rootView, @NonNull View divider, @NonNull FrameLayout flChartXyContainer, @NonNull TextView mainActivityTitle, @NonNull ConstraintLayout sportEnergyContainer, @NonNull TextView sportEnergyDataUnit, @NonNull TextView sportEnergyDesc, @NonNull TypefaceTextView sportEnergyMainData, @NonNull TextView sportEnergyTitle) {
        this.a = rootView;
        this.divider = divider;
        this.flChartXyContainer = flChartXyContainer;
        this.mainActivityTitle = mainActivityTitle;
        this.sportEnergyContainer = sportEnergyContainer;
        this.sportEnergyDataUnit = sportEnergyDataUnit;
        this.sportEnergyDesc = sportEnergyDesc;
        this.sportEnergyMainData = sportEnergyMainData;
        this.sportEnergyTitle = sportEnergyTitle;
    }

    @NonNull
    public static HeaderSportEnergyViewBinding bind(@NonNull View rootView) {
        int i = R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
        if (viewFindChildViewById != null) {
            i = R.id.fl_chart_xy_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_chart_xy_container);
            if (frameLayout != null) {
                i = R.id.main_activity_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.main_activity_title);
                if (textView != null) {
                    i = R.id.sport_energy_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.sport_energy_container);
                    if (constraintLayout != null) {
                        i = R.id.sport_energy_data_unit;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_energy_data_unit);
                        if (textView2 != null) {
                            i = R.id.sport_energy_desc;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_energy_desc);
                            if (textView3 != null) {
                                i = R.id.sport_energy_main_data;
                                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sport_energy_main_data);
                                if (typefaceTextView != null) {
                                    i = R.id.sport_energy_title;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_energy_title);
                                    if (textView4 != null) {
                                        return new HeaderSportEnergyViewBinding((ConstraintLayout) rootView, viewFindChildViewById, frameLayout, textView, constraintLayout, textView2, textView3, typefaceTextView, textView4);
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
    public static HeaderSportEnergyViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeaderSportEnergyViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.header_sport_energy_view, parent, false);
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
