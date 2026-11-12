package com.huami.step.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hmchartui.utils.Constant;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.ktx.I18nKt;
import com.huami.step.R;
import com.huami.step.koin.IUnitManager;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.koin.RealTimeStepLiveData;
import com.huami.step.model.StepInfo;
import com.huami.step.ui.StepFragmentChartInfo;
import com.huami.step.utils.ExtensionUtilsKt;
import com.huami.step.utils.StepTimeUtils;
import com.huami.step.utils.VerticalImageSpan;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.timeutil.TimeUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/step/ui/StepFragmentChartInfo;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.a, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/step/model/StepInfo;", "stepInfo", "", "isTouchValue", "updateView", "a", "Lcom/huami/step/model/StepInfo;", "realTimeSteps", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepFragmentChartInfo extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private StepInfo realTimeSteps;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/step/ui/StepFragmentChartInfo$Companion;", "", "", "timeType", "", "time", "Lcom/huami/step/ui/StepFragmentChartInfo;", "newInstance", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StepFragmentChartInfo newInstance(int timeType, long time) {
            StepFragmentChartInfo stepFragmentChartInfo = new StepFragmentChartInfo();
            Bundle bundle = new Bundle();
            bundle.putLong(Constant.KEY_TIME, time);
            bundle.putInt(Constant.KEY_TIME_TYPE, timeType);
            Unit unit = Unit.INSTANCE;
            stepFragmentChartInfo.setArguments(bundle);
            return stepFragmentChartInfo;
        }
    }

    public StepFragmentChartInfo() {
        super(R.layout.step_fragment_chart_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(StepFragmentChartInfo stepFragmentChartInfo, StepInfo stepInfo) {
        stepFragmentChartInfo.realTimeSteps = stepInfo;
    }

    private final void d() {
        SpannableString spannableString = new SpannableString(getString(R.string.step_text_amount_of_cal) + " ");
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.step_icon_tips);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableString.setSpan(new VerticalImageSpan(drawable), spannableString.length() + (-1), spannableString.length(), 18);
        View view = getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.label_amount_cal))).setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(StepFragmentChartInfo stepFragmentChartInfo, boolean z, StepInfo stepInfo, View view) {
        int iMax;
        String calFat;
        Context contextRequireContext = stepFragmentChartInfo.requireContext();
        int i = R.string.step_3_fr_cal_sub;
        Object[] objArr = new Object[1];
        IUnitManager unitManager = KoinExtKt.getUnitManager();
        if (unitManager == null) {
            calFat = null;
        } else {
            if (z) {
                iMax = stepInfo.getCal();
            } else {
                int cal = stepInfo.getCal();
                StepInfo stepInfo2 = stepFragmentChartInfo.realTimeSteps;
                iMax = Math.max(cal, stepInfo2 == null ? 0 : stepInfo2.getCal());
            }
            calFat = unitManager.formatCalFat(iMax);
        }
        objArr[0] = calFat;
        CustomToast.makeText(contextRequireContext, stepFragmentChartInfo.getString(i, objArr), 0).show();
        ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_CALORIE_C"));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RealTimeStepLiveData realTimeStep;
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && arguments.getInt(Constant.KEY_TIME_TYPE) == 16) {
            z = true;
        }
        if (z) {
            Bundle arguments2 = getArguments();
            if (TimeUtils.isToday(arguments2 == null ? 0L : arguments2.getLong(Constant.KEY_TIME)) && (realTimeStep = KoinExtKt.getRealTimeStep()) != null) {
                realTimeStep.observe(getViewLifecycleOwner(), new Observer() { // from class: og7
                    @Override // androidx.p008lifecycle.Observer
                    public final void onChanged(Object obj) {
                        StepFragmentChartInfo.c(this.a, (StepInfo) obj);
                    }
                });
            }
        }
        d();
    }

    public final void updateView(@Nullable final StepInfo stepInfo, final boolean isTouchValue) {
        int iMax;
        String distance;
        if (stepInfo == null) {
            return;
        }
        if (stepInfo.getSteps() == 0) {
            View view = getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.text_distance);
            int i = R.string.step_text_empty_data;
            ((TypefaceTextView) viewFindViewById).setText(getString(i));
            View view2 = getView();
            ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.text_cal))).setText(getString(i));
            View view3 = getView();
            ((TypefaceTextView) (view3 != null ? view3.findViewById(R.id.text_duration) : null)).setText(getString(i));
            return;
        }
        View view4 = getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.text_distance));
        IUnitManager unitManager = KoinExtKt.getUnitManager();
        if (unitManager == null) {
            distance = null;
        } else {
            if (isTouchValue) {
                iMax = stepInfo.getDistance();
            } else {
                int distance2 = stepInfo.getDistance();
                StepInfo stepInfo2 = this.realTimeSteps;
                iMax = Math.max(distance2, stepInfo2 == null ? 0 : stepInfo2.getDistance());
            }
            distance = unitManager.formatDistance(iMax);
        }
        typefaceTextView.setText(distance);
        View view5 = getView();
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) (view5 == null ? null : view5.findViewById(R.id.text_cal));
        int cal = stepInfo.getCal();
        if (!isTouchValue) {
            StepInfo stepInfo3 = this.realTimeSteps;
            cal = Math.max(cal, stepInfo3 != null ? stepInfo3.getCal() : 0);
        }
        typefaceTextView2.setText(I18nKt.i18n(cal));
        View view6 = getView();
        ((TypefaceTextView) (view6 == null ? null : view6.findViewById(R.id.text_duration))).setText(StepTimeUtils.INSTANCE.formatTimeHM(stepInfo.getWalkTime() + stepInfo.getRunTime()));
        View view7 = getView();
        ((LinearLayout) (view7 != null ? view7.findViewById(R.id.layout_total_cal) : null)).setOnClickListener(new View.OnClickListener() { // from class: ng7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                StepFragmentChartInfo.e(this.a, isTouchValue, stepInfo, view8);
            }
        });
    }
}
