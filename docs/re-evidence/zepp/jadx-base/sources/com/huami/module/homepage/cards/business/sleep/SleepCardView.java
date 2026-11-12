package com.huami.module.homepage.cards.business.sleep;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.util.HMColor;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.business.sleep.SleepCardView;
import com.huami.module.homepage.cards.helper.ChartRenderHelper;
import com.huami.module.homepage.cards.helper.CurveChartPoint;
import com.huami.module.homepage.cards.helper.CurveGraphParam;
import com.huami.module.homepage.cards.helper.DaySleepChartHelper;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.cards.helper.XLabel;
import com.huami.module.homepage.databinding.HomepageItemCardSleepBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.ContextExtKt;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.sleep.service.ChartPoint;
import com.huami.sleep.service.SleepChanges;
import com.huami.sleep.service.SleepData;
import com.huami.sleep.service.SleepDurationInLast7Days;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.e;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010<\u001a\u00020;\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u0010?\u001a\u00020\u000e¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002J\f\u0010\u0013\u001a\u00020\u000b*\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0006\u0010\u0015\u001a\u00020\u0004J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010%\u001a\u00020\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"J\u0018\u0010)\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0002R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00103\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00107R\u001a\u0010:\u001a\u00020\u000b*\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00109¨\u0006B"}, d2 = {"Lcom/huami/module/homepage/cards/business/sleep/SleepCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isSmileFace", "", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", ViewHierarchyConstants.VIEW_KEY, "isUpArrow", "g", "(Landroid/widget/TextView;Ljava/lang/Boolean;)V", "", "hour", "minute", "", "sizeDp", "Landroid/text/SpannableStringBuilder;", "i", "", hl.k, "e", "initView", "Lcom/huami/sleep/service/SleepData;", "sleepData", "Lcom/huami/sleep/service/SleepChanges;", "sleepChanges", "updateCurrentSleepDataView", "sleepDuration", "sleepChange", "updateNapSleepDataView", "(ILjava/lang/Boolean;)V", "Lcom/huami/chart/data/ChartDataList;", "sleepChartDataList", "heartRateChartDataList", "Ljava/util/Date;", "startSleepTime", "endSleepTime", "updateCurrentSleepChartView", "Lcom/huami/sleep/service/SleepDurationInLast7Days;", "data", "hasRealValue", "updateCurrentSevenDayView", "Lcom/huami/module/homepage/databinding/HomepageItemCardSleepBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardSleepBinding;", "viewBinding", "Lcom/huami/module/homepage/cards/helper/DaySleepChartHelper;", "b", "Lkotlin/Lazy;", "getChartHelper", "()Lcom/huami/module/homepage/cards/helper/DaySleepChartHelper;", "chartHelper", "c", "J", "sleepLatestTime", "Z", "currentFaceAnimationState", "(I)Ljava/lang/String;", "minuteText", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SleepCardView extends ConstraintLayout {

    @Deprecated
    public static final int SLEEP_SCORE_SMILE = 80;

    @NotNull
    private static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardSleepBinding viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long sleepLatestTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean currentFaceAnimationState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/business/sleep/SleepCardView$a", "", "", "SLEEP_SCORE_SMILE", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/module/homepage/cards/helper/DaySleepChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<DaySleepChartHelper> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DaySleepChartHelper getA() {
            return new DaySleepChartHelper(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_SLEEP_C, new Pair[0]);
            Context context = SleepCardView.this.getContext();
            SleepCardView sleepCardView = SleepCardView.this;
            RouterHelperKt.executeRoute$default(context, RouterHelper.SLEEP_PATH, new Pair[]{TuplesKt.to("user_id", HMPersonInfo.getInstance().getUserInfo().getUserid()), TuplesKt.to("key", sleepCardView.k(sleepCardView.sleepLatestTime)), TuplesKt.to(SleepHomeActivity.SOURCE_FROM, 0)}, null, 8, null);
        }
    }

    @JvmOverloads
    public SleepCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SleepCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final String c(int i) {
        int i2 = i % 60;
        if (i2 >= 10) {
            return I18nKt.i18n(i2);
        }
        return I18nKt.i18n(0) + I18nKt.i18n(i2);
    }

    private final void d(boolean isSmileFace) {
        LottieAnimationView lottieAnimationView = this.viewBinding.sleepSmile;
        if (!lottieAnimationView.isAnimating() || isSmileFace != this.currentFaceAnimationState) {
            lottieAnimationView.setAnimation(isSmileFace ? "homepage_smile_face.json" : "homepage_cry_face.json");
            lottieAnimationView.playAnimation();
        }
        this.currentFaceAnimationState = isSmileFace;
    }

    private final void e() {
        int iLoadColor = ViewExtKt.loadColor(this, R.color.s16);
        int iLoadColor2 = ViewExtKt.loadColor(this, R.color.s25);
        int iLoadColor3 = ViewExtKt.loadColor(this, R.color.s34);
        int iLoadColor4 = ViewExtKt.loadColor(this, R.color.s20);
        int i = 15;
        Integer numValueOf = Integer.valueOf(SportDeviceUtils.SOURCE_ZURICH_W);
        Integer numValueOf2 = Integer.valueOf(FTPCodes.PENDING_FURTHER_INFORMATION);
        Triple[] tripleArr = {new Triple(0, 100, Integer.valueOf(iLoadColor)), new Triple(100, 200, Integer.valueOf(iLoadColor2)), new Triple(200, 300, Integer.valueOf(iLoadColor)), new Triple(300, numValueOf, Integer.valueOf(iLoadColor2)), new Triple(numValueOf, 340, Integer.valueOf(iLoadColor)), new Triple(340, numValueOf2, Integer.valueOf(iLoadColor2)), new Triple(numValueOf2, 375, Integer.valueOf(iLoadColor)), new Triple(375, 400, Integer.valueOf(iLoadColor2)), new Triple(400, 415, Integer.valueOf(iLoadColor)), new Triple(415, 465, Integer.valueOf(iLoadColor2)), new Triple(465, 480, Integer.valueOf(iLoadColor)), new Triple(480, 490, Integer.valueOf(iLoadColor3)), new Triple(490, 500, Integer.valueOf(iLoadColor)), new Triple(500, 515, Integer.valueOf(iLoadColor4)), new Triple(515, 565, Integer.valueOf(iLoadColor))};
        SparseArray sparseArray = new SparseArray();
        ArrayList arrayList = new ArrayList(15);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            float f = 135.0f;
            if (i2 >= i) {
                break;
            }
            final Triple triple = tripleArr[i2];
            int i4 = i3 + 1;
            BaseIndex baseIndex = new BaseIndex(((Number) triple.getFirst()).intValue(), ((Number) triple.getSecond()).intValue());
            if (i3 % 2 == 0) {
                f = 76.0f;
            }
            ChartData chartData = new ChartData(baseIndex, f);
            chartData.addExtends(new IDataExtendListener() { // from class: oz6
                @Override // com.huami.chart.listener.IDataExtendListener
                public final Object get(BaseIndex baseIndex2) {
                    return SleepCardView.f(triple, baseIndex2);
                }
            });
            Unit unit = Unit.INSTANCE;
            sparseArray.put(i3, chartData);
            arrayList.add(unit);
            i2++;
            i3 = i4;
            i = 15;
        }
        Unit unit2 = Unit.INSTANCE;
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(565);
        chartDataList.setMinValue(0.0f);
        chartDataList.setMaxValue(135.0f);
        getChartHelper().refreshChart(this.viewBinding.sleepChartContainer, chartDataList);
        Random random = new Random();
        IntRange intRange = new IntRange(0, 50);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            arrayList2.add(Integer.valueOf(random.nextInt(60) + 50));
        }
        SparseArray sparseArray2 = new SparseArray();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        int i5 = 0;
        for (Object obj : arrayList2) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            sparseArray2.put(i5, new ChartData(i5, ((Number) obj).intValue()));
            arrayList3.add(Unit.INSTANCE);
            i5 = i6;
        }
        Unit unit3 = Unit.INSTANCE;
        ChartDataList chartDataList2 = new ChartDataList(sparseArray2);
        chartDataList2.setStart(0);
        chartDataList2.setEnd(arrayList2.size());
        chartDataList2.setMinValue(0.0f);
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList2);
        chartDataList2.setMaxValue(num != null ? num.intValue() : 0.0f);
        getChartHelper().refreshOverlayChart(this.viewBinding.hrChartLayout, chartDataList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Triple triple, BaseIndex baseIndex) {
        return new HMColor(((Number) triple.getThird()).intValue());
    }

    private final void g(TextView view, Boolean isUpArrow) {
        Drawable drawableLoadDrawable$default;
        if (isUpArrow == null) {
            drawableLoadDrawable$default = null;
        } else {
            drawableLoadDrawable$default = isUpArrow.booleanValue() ? ContextExtKt.loadDrawable$default(getContext(), R.drawable.ic_rise_20, R.color.s20, null, 4, null) : ContextExtKt.loadDrawable$default(getContext(), R.drawable.ic_drop_20, R.color.s51, null, 4, null);
        }
        if (drawableLoadDrawable$default == null) {
            drawableLoadDrawable$default = null;
        } else {
            drawableLoadDrawable$default.setBounds(0, 0, NumberExtKt.getDp(12), NumberExtKt.getDp(12));
            Unit unit = Unit.INSTANCE;
        }
        view.setCompoundDrawables(null, null, drawableLoadDrawable$default, null);
    }

    private final DaySleepChartHelper getChartHelper() {
        return (DaySleepChartHelper) this.chartHelper.getValue();
    }

    public static /* synthetic */ void h(SleepCardView sleepCardView, TextView textView, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        sleepCardView.g(textView, bool);
    }

    private final SpannableStringBuilder i(String hour, String minute, int sizeDp) {
        if (hour != null && Intrinsics.areEqual(hour, "0")) {
            return HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), minute == null ? "--" : minute, Integer.valueOf(ViewExtKt.loadColor(this, R.color.s1)), Integer.valueOf(sizeDp), false, null, HomeUtils.getMaisonTypeface(), null, 88, null), ViewExtKt.getString(this, HomeUtils.isChineseLanguage() ? R.string.hm_common_minute : R.string.hm_common_minute_long), null, null, false, null, null, null, 126, null).build();
        }
        HMSpannable hMSpannable = new HMSpannable();
        String str = hour == null ? "--" : hour;
        int i = R.color.s1;
        return HMSpannable.append$default(HMSpannable.append$default(HMSpannable.append$default(HMSpannable.append$default(hMSpannable, str, Integer.valueOf(ViewExtKt.loadColor(this, i)), Integer.valueOf(sizeDp), false, null, HomeUtils.getMaisonTypeface(), null, 88, null), ViewExtKt.getString(this, HomeUtils.isChineseLanguage() ? R.string.hm_common_hour : R.string.hm_common_hour_long), null, null, false, null, null, null, 126, null), minute == null ? "--" : minute, Integer.valueOf(ViewExtKt.loadColor(this, i)), Integer.valueOf(sizeDp), false, null, HomeUtils.getMaisonTypeface(), null, 88, null), ViewExtKt.getString(this, HomeUtils.isChineseLanguage() ? R.string.hm_common_minute : R.string.hm_common_minute_long), null, null, false, null, null, null, 126, null).build();
    }

    public static /* synthetic */ SpannableStringBuilder j(SleepCardView sleepCardView, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 20;
        }
        return sleepCardView.i(str, str2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(long j) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(FrameLayout frameLayout, SleepDurationInLast7Days sleepDurationInLast7Days, int i) {
        ChartRenderHelper chartRenderHelper = ChartRenderHelper.INSTANCE;
        List<ChartPoint> chartData = sleepDurationInLast7Days.getChartData();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chartData, 10));
        for (ChartPoint chartPoint : chartData) {
            arrayList.add(new CurveChartPoint(chartPoint.getIndex(), chartPoint.getValue()));
        }
        int iAddAlpha = NumberExtKt.addAlpha(i, 0.5d);
        int i2 = 0;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(i), Integer.valueOf(ViewExtKt.loadColor(frameLayout, R.color.s27))});
        int dp = NumberExtKt.getDp(56);
        List<ChartPoint> chartData2 = sleepDurationInLast7Days.getChartData();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chartData2, 10));
        Iterator<T> it2 = chartData2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((ChartPoint) it2.next()).getValue()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((Number) obj).floatValue() > 0.0f) {
                arrayList3.add(obj);
            }
        }
        List listListOf2 = e.listOf(Float.valueOf((float) CollectionsKt___CollectionsKt.averageOfFloat(arrayList3)));
        List<String> latest7DaysDateXLabels = ChartRenderHelper.INSTANCE.getLatest7DaysDateXLabels(frameLayout.getContext());
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(latest7DaysDateXLabels, 10));
        for (Object obj2 : latest7DaysDateXLabels) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList4.add(new XLabel(i2, (String) obj2));
            i2 = i3;
        }
        chartRenderHelper.renderCurveChart(frameLayout, new CurveGraphParam(arrayList, i, iAddAlpha, 0, 0, listListOf, false, null, null, null, listListOf2, arrayList4, 7, Integer.valueOf(dp), null, Float.valueOf(0.0f), 17296, null));
    }

    public static /* synthetic */ void updateCurrentSleepChartView$default(SleepCardView sleepCardView, ChartDataList chartDataList, ChartDataList chartDataList2, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            chartDataList = null;
        }
        if ((i & 2) != 0) {
            chartDataList2 = null;
        }
        if ((i & 4) != 0) {
            date = null;
        }
        if ((i & 8) != 0) {
            date2 = null;
        }
        sleepCardView.updateCurrentSleepChartView(chartDataList, chartDataList2, date, date2);
    }

    public final void initView() {
        HomepageItemCardSleepBinding homepageItemCardSleepBinding = this.viewBinding;
        homepageItemCardSleepBinding.sleepScore.setText("--");
        homepageItemCardSleepBinding.sleepDuration.setText(j(this, null, null, 0, 7, null));
        homepageItemCardSleepBinding.deepSleepDuration.setText(j(this, null, null, 0, 7, null));
        homepageItemCardSleepBinding.avgSleepTitle.setText(getContext().getString(R.string.homepage_item_card_sleep_duration_hold_with_last_7_days));
        homepageItemCardSleepBinding.sleepStartTime.setText("--");
        homepageItemCardSleepBinding.sleepEndTime.setText("--");
        ExteranelKt.setOnClickWithPolicyListener(this, new c());
        e();
    }

    public final void updateCurrentSevenDayView(@Nullable final SleepDurationInLast7Days data, boolean hasRealValue) {
        if (data == null || !hasRealValue) {
            if (this.viewBinding.detail.getVisibility() == 0) {
                this.viewBinding.sleepBar.getExpandButton().performClick();
            }
            this.viewBinding.sleepBar.getExpandButton().setVisibility(8);
        } else {
            this.viewBinding.avgSleepTitle.setText(getContext().getString(R.string.homepage_sleep_seven_average, j(this, I18nKt.i18n(data.getAverageSleepDuration() / 60), c(data.getAverageSleepDuration()), 0, 4, null)));
            final FrameLayout frameLayout = this.viewBinding.avgSleepChartContainer;
            final int iLoadColor = ViewExtKt.loadColor(frameLayout, R.color.s25);
            frameLayout.post(new Runnable() { // from class: pz6
                @Override // java.lang.Runnable
                public final void run() {
                    SleepCardView.l(frameLayout, data, iLoadColor);
                }
            });
            this.viewBinding.sleepBar.getExpandButton().setVisibility(0);
        }
    }

    public final void updateCurrentSleepChartView(@Nullable ChartDataList sleepChartDataList, @Nullable ChartDataList heartRateChartDataList, @Nullable Date startSleepTime, @Nullable Date endSleepTime) {
        String time;
        String time2;
        Long lValueOf = endSleepTime == null ? null : Long.valueOf(endSleepTime.getTime());
        this.sleepLatestTime = lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
        if (sleepChartDataList != null) {
            getChartHelper().refreshChart(this.viewBinding.sleepChartContainer, sleepChartDataList);
        }
        if (heartRateChartDataList != null) {
            getChartHelper().refreshOverlayChart(this.viewBinding.hrChartLayout, heartRateChartDataList);
        }
        TextView textView = this.viewBinding.sleepStartTime;
        String str = "--";
        if (startSleepTime == null || (time = TimeUtils.formatTime(getContext(), startSleepTime, true)) == null) {
            time = "--";
        }
        textView.setText(time);
        TextView textView2 = this.viewBinding.sleepEndTime;
        if (endSleepTime != null && (time2 = TimeUtils.formatTime(getContext(), endSleepTime, true)) != null) {
            str = time2;
        }
        textView2.setText(str);
        this.viewBinding.sleepBar.setFirstTime(endSleepTime == null ? 0L : endSleepTime.getTime());
        this.viewBinding.noSleepData.setVisibility(endSleepTime == null ? 0 : 8);
    }

    public final void updateCurrentSleepDataView(@Nullable SleepData sleepData, @Nullable SleepChanges sleepChanges) {
        String strI18n;
        HomepageItemCardSleepBinding homepageItemCardSleepBinding = this.viewBinding;
        homepageItemCardSleepBinding.homepageNormalSleepGroup.setVisibility(0);
        ViewExtKt.setVisible(homepageItemCardSleepBinding.napSleepTime, false);
        ViewExtKt.setVisible(homepageItemCardSleepBinding.napSleepState, false);
        d(sleepData != null && sleepData.getSleepScore() >= 80);
        TextView textView = homepageItemCardSleepBinding.sleepScore;
        String str = "--";
        if (sleepData != null && (strI18n = I18nKt.i18n(sleepData.getSleepScore())) != null) {
            str = strI18n;
        }
        textView.setText(str);
        homepageItemCardSleepBinding.sleepDuration.setText(j(this, sleepData == null ? null : I18nKt.i18n(sleepData.getSleepDuration() / 60), sleepData == null ? null : c(sleepData.getSleepDuration()), 0, 4, null));
        homepageItemCardSleepBinding.deepSleepDuration.setText(j(this, sleepData == null ? null : I18nKt.i18n(sleepData.getDeepSleepDuration() / 60), sleepData == null ? null : c(sleepData.getDeepSleepDuration()), 0, 4, null));
        g(homepageItemCardSleepBinding.sleepScoreTitle, sleepChanges == null ? null : Boolean.valueOf(sleepChanges.isSleepScoreRose()));
        g(homepageItemCardSleepBinding.sleepDurationTitle, sleepChanges == null ? null : Boolean.valueOf(sleepChanges.isSleepDurationRose()));
        g(homepageItemCardSleepBinding.deepSleepDurationTitle, sleepChanges != null ? Boolean.valueOf(sleepChanges.isDeepSleepDurationRose()) : null);
        homepageItemCardSleepBinding.noSleepData.setVisibility(sleepData != null ? 8 : 0);
    }

    public final void updateNapSleepDataView(int sleepDuration, @Nullable Boolean sleepChange) {
        HomepageItemCardSleepBinding homepageItemCardSleepBinding = this.viewBinding;
        homepageItemCardSleepBinding.homepageNormalSleepGroup.setVisibility(4);
        ViewExtKt.setVisible(homepageItemCardSleepBinding.napSleepTime, true);
        ViewExtKt.setVisible(homepageItemCardSleepBinding.napSleepState, true);
        homepageItemCardSleepBinding.napSleepTime.setText(j(this, I18nKt.i18n(sleepDuration / 60), c(sleepDuration), 0, 4, null));
        g(homepageItemCardSleepBinding.napSleepState, sleepChange);
    }

    @JvmOverloads
    public SleepCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.viewBinding = HomepageItemCardSleepBinding.inflate(LayoutInflater.from(context), this, true);
        this.chartHelper = LazyKt__LazyJVMKt.lazy(new b(context));
        this.sleepLatestTime = System.currentTimeMillis();
    }
}
