package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.DragIntervalView;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepOverlayMenu;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepStageInfoView;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepTagChart;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepTagEditCard;
import com.huami.sleep.view.UnitTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSleepStageLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View belowChartLine;

    @NonNull
    public final View belowTipLine;

    @NonNull
    public final FrameLayout chartLayout;

    @NonNull
    public final DragIntervalView dragSelectV;

    @NonNull
    public final FrameLayout hrChartLayout;

    @NonNull
    public final View line;

    @NonNull
    public final TextView makeTagTv;

    @NonNull
    public final SleepOverlayMenu overLayMenu;

    @NonNull
    public final LinearLayout selectInfoLL;

    @NonNull
    public final TextView sleepDurTV;

    @NonNull
    public final SleepStageInfoView sleepDurationView;

    @NonNull
    public final UnitTextView sleepTotalTimeTv;

    @NonNull
    public final TextView sleepTv;

    @NonNull
    public final SleepTagEditCard slpTagCard;

    @NonNull
    public final Space space;

    @NonNull
    public final TextView startTime;

    @NonNull
    public final TextView stopTime;

    @NonNull
    public final SleepTagChart tagResultLayout;

    @NonNull
    public final RelativeLayout timeLayout;

    private FragmentSleepStageLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View belowChartLine, @NonNull View belowTipLine, @NonNull FrameLayout chartLayout, @NonNull DragIntervalView dragSelectV, @NonNull FrameLayout hrChartLayout, @NonNull View line, @NonNull TextView makeTagTv, @NonNull SleepOverlayMenu overLayMenu, @NonNull LinearLayout selectInfoLL, @NonNull TextView sleepDurTV, @NonNull SleepStageInfoView sleepDurationView, @NonNull UnitTextView sleepTotalTimeTv, @NonNull TextView sleepTv, @NonNull SleepTagEditCard slpTagCard, @NonNull Space space, @NonNull TextView startTime, @NonNull TextView stopTime, @NonNull SleepTagChart tagResultLayout, @NonNull RelativeLayout timeLayout) {
        this.a = rootView;
        this.belowChartLine = belowChartLine;
        this.belowTipLine = belowTipLine;
        this.chartLayout = chartLayout;
        this.dragSelectV = dragSelectV;
        this.hrChartLayout = hrChartLayout;
        this.line = line;
        this.makeTagTv = makeTagTv;
        this.overLayMenu = overLayMenu;
        this.selectInfoLL = selectInfoLL;
        this.sleepDurTV = sleepDurTV;
        this.sleepDurationView = sleepDurationView;
        this.sleepTotalTimeTv = sleepTotalTimeTv;
        this.sleepTv = sleepTv;
        this.slpTagCard = slpTagCard;
        this.space = space;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.tagResultLayout = tagResultLayout;
        this.timeLayout = timeLayout;
    }

    @NonNull
    public static FragmentSleepStageLayoutBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.belowChartLine;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.belowTipLine))) != null) {
            i = R.id.chartLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
            if (frameLayout != null) {
                i = R.id.dragSelectV;
                DragIntervalView dragIntervalView = (DragIntervalView) ViewBindings.findChildViewById(rootView, i);
                if (dragIntervalView != null) {
                    i = R.id.hrChartLayout;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                    if (frameLayout2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.line))) != null) {
                        i = R.id.makeTagTv;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = R.id.overLayMenu;
                            SleepOverlayMenu sleepOverlayMenu = (SleepOverlayMenu) ViewBindings.findChildViewById(rootView, i);
                            if (sleepOverlayMenu != null) {
                                i = R.id.selectInfoLL;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                if (linearLayout != null) {
                                    i = R.id.sleepDurTV;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView2 != null) {
                                        i = R.id.sleepDurationView;
                                        SleepStageInfoView sleepStageInfoView = (SleepStageInfoView) ViewBindings.findChildViewById(rootView, i);
                                        if (sleepStageInfoView != null) {
                                            i = R.id.sleepTotalTimeTv;
                                            UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                                            if (unitTextView != null) {
                                                i = R.id.sleepTv;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                if (textView3 != null) {
                                                    i = R.id.slpTagCard;
                                                    SleepTagEditCard sleepTagEditCard = (SleepTagEditCard) ViewBindings.findChildViewById(rootView, i);
                                                    if (sleepTagEditCard != null) {
                                                        i = R.id.space;
                                                        Space space = (Space) ViewBindings.findChildViewById(rootView, i);
                                                        if (space != null) {
                                                            i = R.id.startTime;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                            if (textView4 != null) {
                                                                i = R.id.stopTime;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                if (textView5 != null) {
                                                                    i = R.id.tagResultLayout;
                                                                    SleepTagChart sleepTagChart = (SleepTagChart) ViewBindings.findChildViewById(rootView, i);
                                                                    if (sleepTagChart != null) {
                                                                        i = R.id.timeLayout;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                                                                        if (relativeLayout != null) {
                                                                            return new FragmentSleepStageLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById3, viewFindChildViewById, frameLayout, dragIntervalView, frameLayout2, viewFindChildViewById2, textView, sleepOverlayMenu, linearLayout, textView2, sleepStageInfoView, unitTextView, textView3, sleepTagEditCard, space, textView4, textView5, sleepTagChart, relativeLayout);
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
    public static FragmentSleepStageLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSleepStageLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_stage_layout, parent, false);
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
