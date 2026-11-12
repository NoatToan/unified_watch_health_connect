package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutHealthDataDetailBaseFragmentBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TypefaceTextView addData;

    @NonNull
    public final ConstraintLayout avgArea;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final ConstraintLayout bloodPressureArea;

    @NonNull
    public final FlexboxLayout bpSign;

    @NonNull
    public final View bpSignDivider;

    @NonNull
    public final TypefaceTextView bpTime;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final TypefaceTextView chartValue;

    @NonNull
    public final TypefaceTextView dbpTitle;

    @NonNull
    public final TypefaceTextView dbpUnit;

    @NonNull
    public final TypefaceTextView dbpValue;

    @NonNull
    public final FrameLayout extraContainer;

    @NonNull
    public final LinearLayout head;

    @NonNull
    public final TypefaceTextView historyData;

    @NonNull
    public final FrameLayout introContainer;

    @NonNull
    public final TypefaceTextView jpHintText;

    @NonNull
    public final TypefaceTextView sbpTitle;

    @NonNull
    public final TypefaceTextView sbpUnit;

    @NonNull
    public final TypefaceTextView sbpValue;

    @NonNull
    public final TypefaceTextView time;

    @NonNull
    public final TypefaceTextView unit;

    private LayoutHealthDataDetailBaseFragmentBinding(@NonNull ConstraintLayout rootView, @NonNull TypefaceTextView addData, @NonNull ConstraintLayout avgArea, @NonNull Barrier barrier, @NonNull ConstraintLayout bloodPressureArea, @NonNull FlexboxLayout bpSign, @NonNull View bpSignDivider, @NonNull TypefaceTextView bpTime, @NonNull FrameLayout chartContainer, @NonNull TypefaceTextView chartValue, @NonNull TypefaceTextView dbpTitle, @NonNull TypefaceTextView dbpUnit, @NonNull TypefaceTextView dbpValue, @NonNull FrameLayout extraContainer, @NonNull LinearLayout head, @NonNull TypefaceTextView historyData, @NonNull FrameLayout introContainer, @NonNull TypefaceTextView jpHintText, @NonNull TypefaceTextView sbpTitle, @NonNull TypefaceTextView sbpUnit, @NonNull TypefaceTextView sbpValue, @NonNull TypefaceTextView time, @NonNull TypefaceTextView unit) {
        this.a = rootView;
        this.addData = addData;
        this.avgArea = avgArea;
        this.barrier = barrier;
        this.bloodPressureArea = bloodPressureArea;
        this.bpSign = bpSign;
        this.bpSignDivider = bpSignDivider;
        this.bpTime = bpTime;
        this.chartContainer = chartContainer;
        this.chartValue = chartValue;
        this.dbpTitle = dbpTitle;
        this.dbpUnit = dbpUnit;
        this.dbpValue = dbpValue;
        this.extraContainer = extraContainer;
        this.head = head;
        this.historyData = historyData;
        this.introContainer = introContainer;
        this.jpHintText = jpHintText;
        this.sbpTitle = sbpTitle;
        this.sbpUnit = sbpUnit;
        this.sbpValue = sbpValue;
        this.time = time;
        this.unit = unit;
    }

    @NonNull
    public static LayoutHealthDataDetailBaseFragmentBinding bind(@NonNull View rootView) {
        int i = R.id.add_data;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.add_data);
        if (typefaceTextView != null) {
            i = R.id.avg_area;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.avg_area);
            if (constraintLayout != null) {
                i = R.id.barrier;
                Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, R.id.barrier);
                if (barrier != null) {
                    i = R.id.blood_pressure_area;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.blood_pressure_area);
                    if (constraintLayout2 != null) {
                        i = R.id.bp_sign;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.bp_sign);
                        if (flexboxLayout != null) {
                            i = R.id.bp_sign_divider;
                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bp_sign_divider);
                            if (viewFindChildViewById != null) {
                                i = R.id.bp_time;
                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.bp_time);
                                if (typefaceTextView2 != null) {
                                    i = R.id.chart_container;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.chart_container);
                                    if (frameLayout != null) {
                                        i = R.id.chart_value;
                                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.chart_value);
                                        if (typefaceTextView3 != null) {
                                            i = R.id.dbp_title;
                                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.dbp_title);
                                            if (typefaceTextView4 != null) {
                                                i = R.id.dbp_unit;
                                                TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.dbp_unit);
                                                if (typefaceTextView5 != null) {
                                                    i = R.id.dbp_value;
                                                    TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.dbp_value);
                                                    if (typefaceTextView6 != null) {
                                                        i = R.id.extra_container;
                                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.extra_container);
                                                        if (frameLayout2 != null) {
                                                            i = R.id.head;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.head);
                                                            if (linearLayout != null) {
                                                                i = R.id.history_data;
                                                                TypefaceTextView typefaceTextView7 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.history_data);
                                                                if (typefaceTextView7 != null) {
                                                                    i = R.id.intro_container;
                                                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.intro_container);
                                                                    if (frameLayout3 != null) {
                                                                        i = R.id.jp_hint_text;
                                                                        TypefaceTextView typefaceTextView8 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.jp_hint_text);
                                                                        if (typefaceTextView8 != null) {
                                                                            i = R.id.sbp_title;
                                                                            TypefaceTextView typefaceTextView9 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sbp_title);
                                                                            if (typefaceTextView9 != null) {
                                                                                i = R.id.sbp_unit;
                                                                                TypefaceTextView typefaceTextView10 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sbp_unit);
                                                                                if (typefaceTextView10 != null) {
                                                                                    i = R.id.sbp_value;
                                                                                    TypefaceTextView typefaceTextView11 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sbp_value);
                                                                                    if (typefaceTextView11 != null) {
                                                                                        i = R.id.time;
                                                                                        TypefaceTextView typefaceTextView12 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                                                        if (typefaceTextView12 != null) {
                                                                                            i = R.id.unit;
                                                                                            TypefaceTextView typefaceTextView13 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.unit);
                                                                                            if (typefaceTextView13 != null) {
                                                                                                return new LayoutHealthDataDetailBaseFragmentBinding((ConstraintLayout) rootView, typefaceTextView, constraintLayout, barrier, constraintLayout2, flexboxLayout, viewFindChildViewById, typefaceTextView2, frameLayout, typefaceTextView3, typefaceTextView4, typefaceTextView5, typefaceTextView6, frameLayout2, linearLayout, typefaceTextView7, frameLayout3, typefaceTextView8, typefaceTextView9, typefaceTextView10, typefaceTextView11, typefaceTextView12, typefaceTextView13);
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
    public static LayoutHealthDataDetailBaseFragmentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutHealthDataDetailBaseFragmentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_health_data_detail_base_fragment, parent, false);
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
