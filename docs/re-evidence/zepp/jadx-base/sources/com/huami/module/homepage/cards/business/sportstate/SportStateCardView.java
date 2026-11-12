package com.huami.module.homepage.cards.business.sportstate;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.firstbeat.service.SportState;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.cardui.PiecewiseArcView;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardSportStateBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018¨\u0006/"}, d2 = {"Lcom/huami/module/homepage/cards/business/sportstate/SportStateCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "value", "unit", "Landroid/text/SpannableStringBuilder;", GoogleApiAvailabilityLight.a, "(Ljava/lang/Integer;I)Landroid/text/SpannableStringBuilder;", "", "values", "b", "c", "position", "e", "a", "", "initView", "Lcom/huami/firstbeat/service/SportState;", "sportState", "setVo2maxState", "setEpoc", "Lcom/huami/module/homepage/databinding/HomepageItemCardSportStateBinding;", "Lcom/huami/module/homepage/databinding/HomepageItemCardSportStateBinding;", "binding", LogUtil.I, "gray", "red", "orange", "yellow", "f", "green", "g", "lightBlue", "h", "blue", "i", "darkBlue", z.j, "purple", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", hl.k, "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SportStateCardView extends ConstraintLayout {

    @Deprecated
    public static final int EPOC_STATE_COUNT = 3;

    @Deprecated
    public static final int MAX_VO2_STATE_COUNT = 7;

    @NotNull
    private static final a k = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardSportStateBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int gray;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int red;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int orange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int yellow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int green;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int lightBlue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int blue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int darkBlue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int purple;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/huami/module/homepage/cards/business/sportstate/SportStateCardView$a", "", "", "EPOC_STATE_COUNT", LogUtil.I, "MAX_VO2_STATE_COUNT", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_VO2MAX_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(SportStateCardView.this.getContext(), RouterHelper.SPORT_STATE_VO2_MAX_PATH, new Pair[0], null, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_EPOC_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(SportStateCardView.this.getContext(), RouterHelper.SPORT_STATE_EPOC_PATH, new Pair[0], null, 8, null);
        }
    }

    @JvmOverloads
    public SportStateCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SportStateCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SportStateCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int a(int position) {
        if (position != 0) {
            return position != 1 ? this.red : this.green;
        }
        return this.blue;
    }

    private final int b(int value, List<Integer> values) {
        int size = values.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            if (value > values.get(i2).intValue()) {
                i = i2 + 1;
            } else if (value >= values.get(i2).intValue() || (size = i2 - 1) < 0 || value > values.get(size).intValue()) {
                return i2;
            }
        }
        return 0;
    }

    private final int c(int value, List<Integer> values) {
        int size = 0;
        int i = 0;
        for (Object obj : values) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (value > ((Number) obj).intValue()) {
                size = i >= values.size() + (-1) ? values.size() - 1 : i2;
            }
            i = i2;
        }
        return size;
    }

    private final SpannableStringBuilder d(Integer value, @StringRes int unit) {
        String strI18n;
        HMSpannable hMSpannable = new HMSpannable();
        String str = "--";
        if (value != null) {
            if (!(value.intValue() > 0)) {
                value = null;
            }
            if (value != null && (strI18n = I18nKt.i18n(value.intValue())) != null) {
                str = strI18n;
            }
        }
        return HMSpannable.append$default(HMSpannable.append$default(hMSpannable, str, null, 30, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addNewline(), getContext().getString(unit), null, null, false, null, null, null, 126, null).build();
    }

    private final int e(int position) {
        if (position == 0) {
            return this.red;
        }
        if (position == 1) {
            return this.orange;
        }
        if (position == 2) {
            return this.yellow;
        }
        if (position == 3) {
            return this.green;
        }
        if (position != 4) {
            return position != 5 ? this.purple : this.darkBlue;
        }
        return this.lightBlue;
    }

    public final void initView() {
        PiecewiseArcView piecewiseArcView = this.binding.maxVo2Arc;
        IntRange intRangeUntil = e.until(0, 7);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            arrayList.add(Integer.valueOf(this.gray));
        }
        piecewiseArcView.setPiecewiseColor(arrayList).setValue(0.0f).showIndicator(false).invalidate();
        PiecewiseArcView piecewiseArcView2 = this.binding.epocArc;
        IntRange intRangeUntil2 = e.until(0, 3);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil2, 10));
        Iterator<Integer> it3 = intRangeUntil2.iterator();
        while (it3.hasNext()) {
            ((IntIterator) it3).nextInt();
            arrayList2.add(Integer.valueOf(this.gray));
        }
        piecewiseArcView2.setPiecewiseColor(arrayList2).setValue(0.0f).showIndicator(false).invalidate();
        ExteranelKt.setOnClickWithPolicyListener(this.binding.maxVo2Arc, new b());
        ExteranelKt.setOnClickWithPolicyListener(this.binding.epocArc, new c());
        setVo2maxState(null);
        setEpoc(null);
    }

    public final void setEpoc(@Nullable SportState sportState) {
        if (sportState != null && sportState.getValue() > 0) {
            int value = sportState.getValue();
            Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) sportState.getChartRange());
            int iMin = Math.min(value, num == null ? sportState.getValue() : num.intValue());
            List<Integer> chartRange = sportState.getChartRange();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = chartRange.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((Number) next).intValue() != 0) {
                    arrayList.add(next);
                }
            }
            int iB = b(iMin, arrayList);
            int iA = a(iB);
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < 3; i++) {
                if (i == iB) {
                    arrayList2.add(Integer.valueOf(iA));
                } else {
                    arrayList2.add(Integer.valueOf(this.gray));
                }
            }
            Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) sportState.getChartRange());
            float fIntValue = num2 == null ? 1.0f : num2.intValue();
            Float fValueOf = Float.valueOf(sportState.getValue());
            if (!(fValueOf.floatValue() <= fIntValue)) {
                fValueOf = null;
            }
            PiecewiseArcView piecewiseColor = this.binding.epocArc.setMaxValue(fIntValue).setValue(fValueOf == null ? fIntValue : fValueOf.floatValue()).setIndicatorColor(iA).setPiecewiseColor(arrayList2);
            List<Integer> chartRange2 = sportState.getChartRange();
            ArrayList arrayList3 = new ArrayList();
            int i2 = 0;
            for (Object obj : chartRange2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ((Number) obj).intValue();
                if (i2 > 0) {
                    arrayList3.add(obj);
                }
                i2 = i3;
            }
            piecewiseColor.setAngleRange(arrayList3).showIndicator(true).refresh();
        }
        this.binding.epocValue.setText(d(sportState != null ? Integer.valueOf(sportState.getValue()) : null, R.string.homepage_item_card_epoc_unit));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVo2maxState(@Nullable SportState sportState) {
        List chartRange;
        if (sportState != null && sportState.getValue() > 0) {
            if (sportState.getChartRange().size() == 8) {
                List<Integer> chartRange2 = sportState.getChartRange();
                chartRange = new ArrayList();
                int i = 0;
                for (Object obj : chartRange2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    ((Number) obj).intValue();
                    if (i > 0) {
                        chartRange.add(obj);
                    }
                    i = i2;
                }
            } else {
                chartRange = sportState.getChartRange();
            }
            int iC = c(sportState.getValue(), chartRange);
            int iE = e(iC);
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < 7; i3++) {
                if (i3 == iC) {
                    arrayList.add(Integer.valueOf(iE));
                } else {
                    arrayList.add(Integer.valueOf(this.gray));
                }
            }
            Integer num = (Integer) CollectionsKt.minOrNull((Iterable) sportState.getChartRange());
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) chartRange);
            float value = 1.0f;
            float fIntValue = num2 == null ? 1.0f : num2.intValue() - iIntValue;
            Integer num3 = (Integer) CollectionsKt.minOrNull((Iterable) chartRange);
            float fIntValue2 = num3 == null ? 0.5f : num3.intValue() - iIntValue;
            if (sportState.getValue() - iIntValue > fIntValue) {
                value = fIntValue;
            } else if (sportState.getValue() - iIntValue >= fIntValue2) {
                value = sportState.getValue() - iIntValue;
            }
            PiecewiseArcView indicatorColor = this.binding.maxVo2Arc.setMaxValue(fIntValue).setValue(value).setPiecewiseColor(arrayList).setIndicatorColor(iE);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chartRange, 10));
            Iterator it2 = chartRange.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Number) it2.next()).intValue() - iIntValue));
            }
            indicatorColor.setAngleRange(arrayList2).showIndicator(true).refresh();
        }
        this.binding.maxVo2Value.setText(d(sportState == null ? null : Integer.valueOf(sportState.getValue()), R.string.homepage_item_card_max_vo2_unit));
    }

    @JvmOverloads
    public SportStateCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = HomepageItemCardSportStateBinding.inflate(LayoutInflater.from(context), this, true);
        this.gray = ViewExtKt.loadColor(this, R.color.s4);
        this.red = ViewExtKt.loadColor(this, R.color.s51);
        this.orange = ViewExtKt.loadColor(this, R.color.s30);
        this.yellow = ViewExtKt.loadColor(this, R.color.s33);
        this.green = ViewExtKt.loadColor(this, R.color.s20);
        this.lightBlue = ViewExtKt.loadColor(this, R.color.s16);
        this.blue = ViewExtKt.loadColor(this, R.color.s15);
        this.darkBlue = ViewExtKt.loadColor(this, R.color.s14);
        this.purple = ViewExtKt.loadColor(this, R.color.s25);
    }
}
