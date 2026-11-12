package com.huami.module.homepage.cards.business.calorie;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.cardui.ProgressRingView;
import com.huami.module.homepage.cards.helper.ChartRenderHelper;
import com.huami.module.homepage.cards.helper.CurveChartPoint;
import com.huami.module.homepage.cards.helper.CurveGraphParam;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.cards.helper.XLabel;
import com.huami.module.homepage.databinding.HomepageItemCardCalorieBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.dataflow.model.health.process.Const;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.e;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0002\u000b+B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J%\u0010\u001d\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006,"}, d2 = {"Lcom/huami/module/homepage/cards/business/calorie/CalorieCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "show", "", "c", "Lcom/huami/module/homepage/cards/business/calorie/CalorieCardView$State;", "state", "Lkotlin/Pair;", "", "", "b", "Landroid/text/SpannableStringBuilder;", "a", "", "timeMills", "setUpdateTime", "", "value", "setCalorieValue", "averageCalorie", "setSevenDayTips", "maxValue", "setRingProgress", "setCalorieState", "avgCalorie", "", "Lcom/huami/module/homepage/cards/helper/CurveChartPoint;", "points", "setCalorieChartView", "(Ljava/lang/Float;Ljava/util/List;)V", "Lcom/huami/module/homepage/databinding/HomepageItemCardCalorieBinding;", "Lcom/huami/module/homepage/databinding/HomepageItemCardCalorieBinding;", "binding", LogUtil.I, "blankColor", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", TrainingAnalytics.ParamKey.STATE, "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class CalorieCardView extends ConstraintLayout {

    @Deprecated
    public static final double CALORIE_LINE_COLOR_ALPHA = 0.5d;

    @Deprecated
    public static final int DEFAULT_CALORIE_GAOL = 500;

    @NotNull
    private static final b c = new b(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardCalorieBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int blankColor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/module/homepage/cards/business/calorie/CalorieCardView$State;", "", "<init>", "(Ljava/lang/String;I)V", "INSUFFICIENT", "STANDARD", "MORE", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public enum State {
        INSUFFICIENT,
        STANDARD,
        MORE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.INSUFFICIENT.ordinal()] = 1;
            iArr[State.STANDARD.ordinal()] = 2;
            iArr[State.MORE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_CALORIE_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(this.a, RouterHelper.CALORIES_PATH, new Pair[0], null, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/module/homepage/cards/business/calorie/CalorieCardView$b", "", "", "CALORIE_LINE_COLOR_ALPHA", LogUtil.D, "", "DEFAULT_CALORIE_GAOL", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public CalorieCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CalorieCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CalorieCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final SpannableStringBuilder a(State state) {
        String string;
        HMSpannable hMSpannableAddSpaceBlank = HMSpannable.append$default(new HMSpannable(), getContext().getString(R.string.homepage_item_card_activity_consume), null, null, false, null, null, null, 126, null).addSpaceBlank();
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i != 1) {
            string = i != 2 ? getContext().getString(R.string.homepage_item_card_more) : getContext().getString(R.string.homepage_item_card_standard);
        } else {
            string = getContext().getString(R.string.homepage_item_card_insufficient);
        }
        return HMSpannable.append$default(hMSpannableAddSpaceBlank, string, null, Integer.valueOf(HomeUtils.isChineseLanguage() ? 18 : 14), false, null, null, null, 122, null).build();
    }

    private final Pair<int[], Float> b(State state) {
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            int i2 = this.blankColor;
            return TuplesKt.to(new int[]{ViewExtKt.loadColor(this, R.color.s15), i2, i2}, Float.valueOf(1.0f));
        }
        if (i == 2) {
            return TuplesKt.to(new int[]{this.blankColor, ViewExtKt.loadColor(this, R.color.s20), this.blankColor}, Float.valueOf(3.0f));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = this.blankColor;
        return TuplesKt.to(new int[]{i3, i3, ViewExtKt.loadColor(this, R.color.s51)}, Float.valueOf(5.0f));
    }

    private final void c(boolean show) {
        if (!show) {
            if (this.binding.detail.getVisibility() == 0) {
                this.binding.calorieBar.getExpandButton().performClick();
            }
        }
        this.binding.calorieBar.getExpandButton().setVisibility(show ? 0 : 8);
    }

    public static /* synthetic */ CalorieCardView setCalorieValue$default(CalorieCardView calorieCardView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return calorieCardView.setCalorieValue(i);
    }

    public static /* synthetic */ CalorieCardView setUpdateTime$default(CalorieCardView calorieCardView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return calorieCardView.setUpdateTime(j);
    }

    public final void setCalorieChartView(@Nullable Float avgCalorie, @NotNull List<CurveChartPoint> points) {
        CurveChartPoint curveChartPoint;
        List<CurveChartPoint> list = points.isEmpty() ^ true ? points : null;
        boolean z = ((list != null && (curveChartPoint = (CurveChartPoint) CollectionsKt.last((List) list)) != null) ? curveChartPoint.getValue() : 0.0f) > 0.0f;
        c(z);
        if (z) {
            List<String> latest7DaysDateXLabels = ChartRenderHelper.INSTANCE.getLatest7DaysDateXLabels(getContext());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(latest7DaysDateXLabels, 10));
            int i = 0;
            for (Object obj : latest7DaysDateXLabels) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new XLabel(i, (String) obj));
                i = i2;
            }
            int iLoadColor = ViewExtKt.loadColor(this, R.color.s51);
            ChartRenderHelper.INSTANCE.renderCurveChart(this.binding.chartContainer, new CurveGraphParam(points, iLoadColor, NumberExtKt.addAlpha(iLoadColor, 0.5d), 0, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iLoadColor), Integer.valueOf(ViewExtKt.loadColor(this, R.color.s53))}), false, null, null, null, e.listOf(avgCalorie), arrayList, 7, Integer.valueOf(NumberExtKt.getDp(56)), null, Float.valueOf(0.0f), Const.TOTAL_SIZE, null));
        }
    }

    @NotNull
    public final CalorieCardView setCalorieState(@NotNull State state) {
        HomepageItemCardCalorieBinding homepageItemCardCalorieBinding = this.binding;
        homepageItemCardCalorieBinding.activityConsume.setText(a(state));
        Pair<int[], Float> pairB = b(state);
        int[] iArrComponent1 = pairB.component1();
        homepageItemCardCalorieBinding.progressBar.setPiecewiseColor(Arrays.copyOf(iArrComponent1, iArrComponent1.length)).setValue(pairB.component2().floatValue()).refresh();
        return this;
    }

    @NotNull
    public final CalorieCardView setCalorieValue(int value) {
        this.binding.calorieValue.setText(I18nKt.i18n(value));
        return this;
    }

    @NotNull
    public final CalorieCardView setRingProgress(int maxValue, int value) {
        ProgressRingView progressRingView = this.binding.ring;
        if (value <= 0) {
            maxValue = 8000;
        } else if (HomeUtils.isMifitApp()) {
            maxValue = 500;
        }
        ProgressRingView maxValue2 = progressRingView.setMaxValue(maxValue);
        if (value <= 0) {
            value = 1;
        }
        maxValue2.setValue(value);
        return this;
    }

    @NotNull
    public final CalorieCardView setSevenDayTips(int averageCalorie) {
        this.binding.stepAvgStepLast7days.setText(getContext().getString(R.string.homepage_calorie_seven_average, Integer.valueOf(averageCalorie)));
        return this;
    }

    @NotNull
    public final CalorieCardView setUpdateTime(long timeMills) {
        this.binding.calorieBar.setFirstTime(timeMills);
        return this;
    }

    @JvmOverloads
    public CalorieCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HomepageItemCardCalorieBinding homepageItemCardCalorieBindingInflate = HomepageItemCardCalorieBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = homepageItemCardCalorieBindingInflate;
        int iLoadColor = ViewExtKt.loadColor(this, R.color.s4);
        this.blankColor = iLoadColor;
        homepageItemCardCalorieBindingInflate.progressBar.setMaxValue(6).setPiecewiseColor(iLoadColor, iLoadColor, iLoadColor).invalidate();
        homepageItemCardCalorieBindingInflate.ring.setProgressColor(ViewExtKt.loadColor(this, R.color.s51));
        ExteranelKt.setOnClickWithPolicyListener(homepageItemCardCalorieBindingInflate.getRoot(), new a(context));
    }
}
