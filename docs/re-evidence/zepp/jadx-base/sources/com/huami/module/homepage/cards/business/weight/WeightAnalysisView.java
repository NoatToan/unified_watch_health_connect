package com.huami.module.homepage.cards.business.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.annotation.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardWeightAnalysisBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00103\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u001c\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H\u0002J\u001c\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010 R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010 R\u001c\u0010.\u001a\u00020\u0002*\u0004\u0018\u00010\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010-¨\u00066"}, d2 = {"Lcom/huami/module/homepage/cards/business/weight/WeightAnalysisView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "allStages", "currentStage", "b", "e", "size", "target", "targetColor", "", "f", ParamKey.bodyScore, "a", "(Ljava/lang/Integer;)Ljava/util/List;", "", GoogleApiAvailabilityLight.a, "(Ljava/lang/Integer;)F", "", "initView", "Lcom/huami/module/homepage/cards/business/weight/WeightEntry;", "entry", "updateWeightView", "Lcom/huami/module/homepage/cards/business/weight/BodyScoreEntry;", "bodyData", "updateBodyScoreView", "Lcom/huami/module/homepage/cards/business/weight/BmiEntry;", "bmiEntry", "updateBmiView", "Lcom/huami/module/homepage/databinding/HomepageItemCardWeightAnalysisBinding;", "Lcom/huami/module/homepage/databinding/HomepageItemCardWeightAnalysisBinding;", "binding", LogUtil.I, "green", "c", "lightGray", "gray", "red", "blue", "g", "yellow", "h", "orange", "i", "purple", "(Ljava/lang/Integer;)I", "bodyColor", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class WeightAnalysisView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardWeightAnalysisBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int green;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int lightGray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int gray;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int red;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int blue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int yellow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int orange;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int purple;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_WEIGHT_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(WeightAnalysisView.this.getContext(), RouterHelper.WEIGHT_PATH, new Pair[0], null, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HomepageItemCardWeightAnalysisBinding a;
        public final /* synthetic */ WeightAnalysisView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HomepageItemCardWeightAnalysisBinding homepageItemCardWeightAnalysisBinding, WeightAnalysisView weightAnalysisView) {
            super(0);
            this.a = homepageItemCardWeightAnalysisBinding;
            this.b = weightAnalysisView;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (Intrinsics.areEqual(this.a.weightBar.getSecondTitleText(), this.b.getContext().getString(R.string.homepage_item_card_bmi))) {
                StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_BMI_C, new Pair[0]);
                RouterHelperKt.executeRoute$default(this.b.getContext(), "detail/DataDetailBaseNewActivity", new Pair[]{TuplesKt.to("data_type", "bmi")}, null, 8, null);
            } else {
                StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_BODYSCORE_C, new Pair[0]);
                RouterHelperKt.executeRoute$default(this.b.getContext(), RouterHelper.BODY_SCORE_PATH, new Pair[0], null, 8, null);
            }
        }
    }

    @JvmOverloads
    public WeightAnalysisView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public WeightAnalysisView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WeightAnalysisView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final List<Integer> a(Integer bodyScore) {
        if (bodyScore == null) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.lightGray), Integer.valueOf(this.lightGray), Integer.valueOf(this.lightGray)});
        }
        if (bodyScore.intValue() <= 60) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.lightGray), Integer.valueOf(this.lightGray), Integer.valueOf(this.red)});
        }
        return bodyScore.intValue() <= 85 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.lightGray), Integer.valueOf(this.yellow), Integer.valueOf(this.lightGray)}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.green), Integer.valueOf(this.lightGray), Integer.valueOf(this.lightGray)});
    }

    private final int b(@Size(max = 5, min = 3) int allStages, @Size(max = 5, min = 1) int currentStage) {
        if (allStages == 3) {
            if (currentStage != 1) {
                return currentStage != 2 ? this.red : this.green;
            }
            return this.blue;
        }
        if (allStages == 4) {
            if (currentStage == 1) {
                return this.blue;
            }
            if (currentStage != 2) {
                return currentStage != 3 ? this.red : this.yellow;
            }
            return this.green;
        }
        if (allStages != 5) {
            return this.gray;
        }
        if (currentStage == 1) {
            return this.purple;
        }
        if (currentStage == 2) {
            return this.blue;
        }
        if (currentStage != 3) {
            return currentStage != 4 ? this.red : this.yellow;
        }
        return this.green;
    }

    private final int c(Integer num) {
        if (num == null) {
            return this.lightGray;
        }
        if (num.intValue() <= 60) {
            return this.red;
        }
        return num.intValue() <= 85 ? this.yellow : this.green;
    }

    private final float d(Integer bodyScore) {
        if (bodyScore != null && bodyScore.intValue() > 60) {
            return bodyScore.intValue() <= 85 ? 3.0f : 1.0f;
        }
        return 5.0f;
    }

    private final int e(@Size(max = 5, min = 3) int allStages, @Size(max = 5, min = 1) int currentStage) {
        if (allStages == 3) {
            if (currentStage != 1) {
                return currentStage != 2 ? this.red : this.yellow;
            }
            return this.green;
        }
        if (allStages == 4) {
            if (currentStage == 1) {
                return this.blue;
            }
            if (currentStage != 2) {
                return currentStage != 3 ? this.red : this.yellow;
            }
            return this.green;
        }
        if (allStages != 5) {
            return this.gray;
        }
        if (currentStage == 1) {
            return this.blue;
        }
        if (currentStage == 2) {
            return this.green;
        }
        if (currentStage != 3) {
            return currentStage != 4 ? this.red : this.orange;
        }
        return this.yellow;
    }

    private final List<Integer> f(int size, int target, int targetColor) {
        if (size == 0) {
            size = 4;
        }
        IntRange intRangeUntil = e.until(0, size);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((IntIterator) it2).nextInt() == target ? targetColor : this.lightGray));
        }
        return arrayList;
    }

    public final void initView() {
        HomepageItemCardWeightAnalysisBinding homepageItemCardWeightAnalysisBinding = this.binding;
        if (HomeUtils.isChineseLanguage()) {
            homepageItemCardWeightAnalysisBinding.weightArc.setOpenAngle(90.0f);
            homepageItemCardWeightAnalysisBinding.bodyArc.setOpenAngle(90.0f);
        } else {
            homepageItemCardWeightAnalysisBinding.weightArc.setOpenAngle(180.0f);
            homepageItemCardWeightAnalysisBinding.bodyArc.setOpenAngle(180.0f);
        }
        homepageItemCardWeightAnalysisBinding.weightArc.setMaxValue(8.0f).setValue(3.0f).setPiecewiseColor(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.lightGray), Integer.valueOf(this.green), Integer.valueOf(this.lightGray), Integer.valueOf(this.lightGray)})).invalidate();
        homepageItemCardWeightAnalysisBinding.bodyArc.setMaxValue(6.0f).setValue(5.0f).setPiecewiseColor(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.lightGray), Integer.valueOf(this.lightGray), Integer.valueOf(this.green)})).invalidate();
        ExteranelKt.setOnClickWithPolicyListener(homepageItemCardWeightAnalysisBinding.weightArc, new a());
        ExteranelKt.setOnClickWithPolicyListener(homepageItemCardWeightAnalysisBinding.bodyArc, new b(homepageItemCardWeightAnalysisBinding, this));
        updateWeightView(new WeightEntry(0L, null, null, null, null, 31, null));
        updateBodyScoreView(new BodyScoreEntry(null, null, 0L, 7, null));
    }

    public final void updateBmiView(@NotNull BmiEntry bmiEntry) {
        HomepageItemCardWeightAnalysisBinding homepageItemCardWeightAnalysisBinding = this.binding;
        homepageItemCardWeightAnalysisBinding.weightBar.setSecondTitleText(getContext().getString(R.string.homepage_item_card_bmi));
        homepageItemCardWeightAnalysisBinding.bodyAnimation.cancelAnimation();
        homepageItemCardWeightAnalysisBinding.bodyAnimation.setVisibility(8);
        PiecewiseArcEntry piecewiseArcEntry = bmiEntry.getPiecewiseArcEntry();
        int iB = b(piecewiseArcEntry.getStage().getFirst().intValue(), piecewiseArcEntry.getStage().getSecond().intValue());
        PiecewiseArcEntry piecewiseArcEntry2 = bmiEntry.getPiecewiseArcEntry();
        homepageItemCardWeightAnalysisBinding.bodyArc.setMaxValue(piecewiseArcEntry2.getMaxValue()).setPiecewiseColor(f(piecewiseArcEntry2.getStage().getFirst().intValue(), piecewiseArcEntry2.getStage().getSecond().intValue() - 1, piecewiseArcEntry2.getShowIndicator() ? iB : this.lightGray)).setValue(piecewiseArcEntry2.getValue()).showIndicator(piecewiseArcEntry2.getShowIndicator()).refresh();
        homepageItemCardWeightAnalysisBinding.weightBar.setSecondTime(bmiEntry.getUpdateTime());
        homepageItemCardWeightAnalysisBinding.bodyContent.setVisibility(8);
        homepageItemCardWeightAnalysisBinding.bmiContent.setVisibility(0);
        TextView textView = homepageItemCardWeightAnalysisBinding.bmiContent;
        HMSpannable hMSpannableAddNewline = HMSpannable.append$default(new HMSpannable(), bmiEntry.getBmi(), null, 30, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addNewline();
        String bmiStateText = bmiEntry.getBmiStateText();
        if (!bmiEntry.getPiecewiseArcEntry().getShowIndicator()) {
            iB = this.gray;
        }
        textView.setText(HMSpannable.append$default(hMSpannableAddNewline, bmiStateText, Integer.valueOf(iB), null, false, null, null, null, 124, null).build());
    }

    public final void updateBodyScoreView(@NotNull BodyScoreEntry bodyData) {
        String strI18n;
        HomepageItemCardWeightAnalysisBinding homepageItemCardWeightAnalysisBinding = this.binding;
        homepageItemCardWeightAnalysisBinding.weightBar.setSecondTitleText(getContext().getString((HomeUtils.isMifitApp() && HomeUtils.isChineseLanguage()) ? R.string.homepage_item_card_body_indices_mifit : R.string.homepage_item_card_body_indices));
        homepageItemCardWeightAnalysisBinding.bodyArc.setMaxValue(6.0f).setValue(d(bodyData.getScore())).setPiecewiseColor(a(bodyData.getScore())).showIndicator(bodyData.getScore() != null).refresh();
        LottieAnimationView lottieAnimationView = homepageItemCardWeightAnalysisBinding.bodyAnimation;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.cancelAnimation();
        if (bodyData.getScore() == null || bodyData.getScore().intValue() > 85) {
            lottieAnimationView.setAnimation("homepage_smile_face.json");
        } else {
            lottieAnimationView.setAnimation("homepage_cry_face.json");
        }
        lottieAnimationView.playAnimation();
        homepageItemCardWeightAnalysisBinding.bmiContent.setVisibility(8);
        homepageItemCardWeightAnalysisBinding.bodyContent.setVisibility(0);
        TextView textView = homepageItemCardWeightAnalysisBinding.bodyContent;
        HMSpannable hMSpannable = new HMSpannable();
        Integer score = bodyData.getScore();
        if (score == null || (strI18n = I18nKt.i18n(score.intValue())) == null) {
            strI18n = "--";
        }
        textView.setText(HMSpannable.append$default(HMSpannable.append$default(hMSpannable, strI18n, null, 30, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addNewline(), bodyData.getStatus(), Integer.valueOf(c(bodyData.getScore())), null, false, null, null, null, 124, null).build());
        homepageItemCardWeightAnalysisBinding.weightBar.setSecondTime(bodyData.getUpdateTime());
    }

    public final void updateWeightView(@NotNull WeightEntry entry) {
        HomepageItemCardWeightAnalysisBinding homepageItemCardWeightAnalysisBinding = this.binding;
        PiecewiseArcEntry piecewiseArcEntry = entry.getPiecewiseArcEntry();
        int iE = e(piecewiseArcEntry.getStage().getFirst().intValue(), piecewiseArcEntry.getStage().getSecond().intValue());
        PiecewiseArcEntry piecewiseArcEntry2 = entry.getPiecewiseArcEntry();
        homepageItemCardWeightAnalysisBinding.weightArc.setPiecewiseColor(f(piecewiseArcEntry2.getStage().getFirst().intValue(), piecewiseArcEntry2.getStage().getSecond().intValue() - 1, piecewiseArcEntry2.getShowIndicator() ? iE : this.lightGray)).setMaxValue(piecewiseArcEntry2.getMaxValue()).setValue(piecewiseArcEntry2.getValue()).showIndicator(piecewiseArcEntry2.getShowIndicator()).refresh();
        TextView textView = homepageItemCardWeightAnalysisBinding.weightContent;
        HMSpannable hMSpannableAddNewline = HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), entry.getWeight(), null, 24, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addNewline(), entry.getWeightUnit(), null, null, false, Integer.valueOf(NumberExtKt.getDp(4)), null, null, 110, null).addNewline();
        String weightStateText = entry.getWeightStateText();
        if (!entry.getPiecewiseArcEntry().getShowIndicator()) {
            iE = this.gray;
        }
        textView.setText(HMSpannable.append$default(hMSpannableAddNewline, weightStateText, Integer.valueOf(iE), null, false, Integer.valueOf(NumberExtKt.getDp(5)), null, null, 108, null).build());
        homepageItemCardWeightAnalysisBinding.weightBar.setFirstTime(entry.getUpdateTime());
    }

    @JvmOverloads
    public WeightAnalysisView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = HomepageItemCardWeightAnalysisBinding.inflate(LayoutInflater.from(context), this, true);
        this.green = ViewExtKt.loadColor(this, R.color.s20);
        this.lightGray = ViewExtKt.loadColor(this, R.color.s4);
        this.gray = ViewExtKt.loadColor(this, R.color.s3);
        this.red = ViewExtKt.loadColor(this, R.color.s51);
        this.blue = ViewExtKt.loadColor(this, R.color.s15);
        this.yellow = ViewExtKt.loadColor(this, R.color.s33);
        this.orange = ViewExtKt.loadColor(this, R.color.s31);
        this.purple = ViewExtKt.loadColor(this, R.color.s25);
    }
}
