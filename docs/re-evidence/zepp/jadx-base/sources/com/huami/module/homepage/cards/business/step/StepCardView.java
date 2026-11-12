package com.huami.module.homepage.cards.business.step;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.business.step.StepCardView;
import com.huami.module.homepage.cards.cardui.ProgressRingView;
import com.huami.module.homepage.cards.helper.ChartRenderHelper;
import com.huami.module.homepage.cards.helper.CurveChartPoint;
import com.huami.module.homepage.cards.helper.CurveGraphParam;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.cards.helper.XLabel;
import com.huami.module.homepage.databinding.HomepageItemCardStepBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\n\u001a\u00020\u0004J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006%"}, d2 = {"Lcom/huami/module/homepage/cards/business/step/StepCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "show", "", "c", "", "distance", "Landroid/text/SpannableStringBuilder;", "b", "initView", "", "time", "step", "calorie", "updateCurrentTimeAndData", "goalSteps", "currentSteps", "updateStepRing", "Lcom/huami/module/homepage/cards/business/step/StepUiData;", "data", "todayStep", "updateChartView", "(Lcom/huami/module/homepage/cards/business/step/StepUiData;Ljava/lang/Integer;)V", "Lcom/huami/module/homepage/databinding/HomepageItemCardStepBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardStepBinding;", "binding", LogUtil.I, "lineColor", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class StepCardView extends ConstraintLayout {

    @Deprecated
    public static final int STEP_COUNT_LIMIT = 1000;

    @Deprecated
    public static final int STEP_TEXT_SIZE_BIG = 30;

    @Deprecated
    public static final int STEP_TEXT_SIZE_NORMAL = 24;

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private HomepageItemCardStepBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int lineColor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"com/huami/module/homepage/cards/business/step/StepCardView$a", "", "", "STEP_COUNT_LIMIT", LogUtil.I, "STEP_TEXT_SIZE_BIG", "STEP_TEXT_SIZE_NORMAL", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, String str, String str2) {
            super(0);
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "distance:" + this.a + ", value:" + this.b + ", unit:" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ConstraintLayout a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ConstraintLayout constraintLayout) {
            super(0);
            this.a = constraintLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_STEP_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(this.a.getContext(), RouterHelper.STEP_PATH, new Pair[]{TuplesKt.to("userId", HMPersonInfo.getInstance().getUserInfo().getUserid())}, null, 8, null);
        }
    }

    @JvmOverloads
    public StepCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public StepCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StepCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final SpannableStringBuilder b(int distance) {
        String value = UnitManager.getInstance().formatValue(distance);
        String unitStr = UnitManager.getInstance().getUnitStr();
        HMLog.info("StepBindingLogic", new b(distance, value, unitStr));
        return HMSpannable.append$default(HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), getContext().getString(R.string.step_text_amount_of_distance), null, null, false, null, null, null, 126, null).addSpaceBlank(), value, null, 20, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addSpaceBlank(), unitStr, null, null, false, null, null, null, 126, null).build();
    }

    private final void c(boolean show) {
        if (!show) {
            if (this.binding.detail.getVisibility() == 0) {
                this.binding.stepBar.getExpandButton().performClick();
            }
        }
        this.binding.stepBar.getExpandButton().setVisibility(show ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(StepCardView stepCardView, StepUiData stepUiData, Float f) {
        ChartRenderHelper chartRenderHelper = ChartRenderHelper.INSTANCE;
        FrameLayout frameLayout = stepCardView.binding.chartContainer;
        List<Point> stepsInLast7Days = stepUiData.getStepsInLast7Days();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stepsInLast7Days, 10));
        for (Point point : stepsInLast7Days) {
            arrayList.add(new CurveChartPoint(point.getIndex(), point.getValue()));
        }
        int i = stepCardView.lineColor;
        int iAddAlpha = NumberExtKt.addAlpha(i, 0.5d);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(stepCardView.lineColor), Integer.valueOf(ViewExtKt.loadColor(stepCardView, R.color.s32))});
        List listListOf2 = f == null ? null : e.listOf(Float.valueOf(f.floatValue()));
        if (listListOf2 == null) {
            listListOf2 = CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> latest7DaysDateXLabels = ChartRenderHelper.INSTANCE.getLatest7DaysDateXLabels(stepCardView.getContext());
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(latest7DaysDateXLabels, 10));
        int i2 = 0;
        for (Object obj : latest7DaysDateXLabels) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList2.add(new XLabel(i2, (String) obj));
            i2 = i3;
        }
        chartRenderHelper.renderCurveChart(frameLayout, new CurveGraphParam(arrayList, i, iAddAlpha, 0, 0, listListOf, false, null, null, null, listListOf2, arrayList2, 7, Integer.valueOf(NumberExtKt.getDp(56)), null, Float.valueOf(0.0f), 17296, null));
    }

    public final void initView() {
        ConstraintLayout root = this.binding.getRoot();
        ExteranelKt.setOnClickWithPolicyListener(root, new c(root));
        if (HomeUtils.isChineseLanguage()) {
            return;
        }
        TextView textView = this.binding.stepDistanceTitle;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = NumberExtKt.getDp(55);
        textView.setLayoutParams(layoutParams2);
        TextView textView2 = this.binding.stepConsumeTitle;
        ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = NumberExtKt.getDp(15);
        textView2.setLayoutParams(layoutParams4);
    }

    public final void updateChartView(@NotNull final StepUiData data, @Nullable Integer todayStep) {
        List<Point> stepsInLast7Days = data.getStepsInLast7Days();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = stepsInLast7Days.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Point) next).getValue() > 0) {
                arrayList.add(next);
            }
        }
        final Float fValueOf = null;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((Point) it3.next()).getValue()));
            }
            fValueOf = Float.valueOf((float) CollectionsKt___CollectionsKt.averageOfInt(arrayList2));
        }
        boolean z = (todayStep != null && todayStep.intValue() > 0) || (TimeExtKt.isToday(data.getStepOfToday().getTime()) && data.getStepOfToday().getStep() > 0);
        c(z);
        if (z) {
            this.binding.chartContainer.post(new Runnable() { // from class: cg7
                @Override // java.lang.Runnable
                public final void run() {
                    StepCardView.d(this.a, data, fValueOf);
                }
            });
            TextView textView = this.binding.stepAvgStepLast7days;
            Context context = getContext();
            int i = R.string.homepage_step_seven_average;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(fValueOf == null ? 0 : kotlin.math.c.roundToInt(fValueOf.floatValue()));
            textView.setText(context.getString(i, objArr));
        }
    }

    public final void updateCurrentTimeAndData(long time, int step, int distance, int calorie) {
        HomepageItemCardStepBinding homepageItemCardStepBinding = this.binding;
        homepageItemCardStepBinding.stepBar.setFirstTime(time);
        homepageItemCardStepBinding.stepValue.setText(HMSpannable.append$default(new HMSpannable(), I18nKt.i18n(step), null, Integer.valueOf(step < 1000 ? 30 : 24), false, null, null, null, 122, null).build());
        homepageItemCardStepBinding.stepDistanceTitle.setText(b(distance));
        homepageItemCardStepBinding.stepConsumeTitle.setText(HMSpannable.append$default(HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), getContext().getString(R.string.step_text_amount_of_cal), null, null, false, null, null, null, 126, null).addSpaceBlank(), I18nKt.i18n(calorie), null, 20, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addSpaceBlank(), getContext().getString(R.string.homepage_item_card_unit_kcal), null, null, false, null, null, null, 126, null).build());
    }

    public final void updateStepRing(int goalSteps, int currentSteps) {
        int iIntValue = 8000;
        if (currentSteps > 0) {
            Integer numValueOf = Integer.valueOf(goalSteps);
            if (!(numValueOf.intValue() > 0)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        ProgressRingView maxValue = this.binding.ring.setMaxValue(iIntValue);
        Integer numValueOf2 = Integer.valueOf(currentSteps);
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        maxValue.setValue(num != null ? num.intValue() : 1);
    }

    @JvmOverloads
    public StepCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = HomepageItemCardStepBinding.inflate(LayoutInflater.from(context), this, true);
        this.lineColor = ViewExtKt.loadColor(this, R.color.s30);
    }
}
