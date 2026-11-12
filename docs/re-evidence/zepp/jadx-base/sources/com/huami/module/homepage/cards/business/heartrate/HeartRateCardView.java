package com.huami.module.homepage.cards.business.heartrate;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.heartrate.model.AbnormalHeartBeatEntity;
import com.huami.heartrate.service.HeartRate;
import com.huami.heartrate.service.HeartRateInfo;
import com.huami.heartrate.service.HeartRateStatisticalInfo;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.GradientArcView;
import com.huami.module.homepage.cards.cardui.GradientLineView;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.databinding.HomepageItemCardHeartRateBinding;
import com.huami.module.homepage.databinding.HomepageItemCardHeartRateI18nBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.dataflow.Constant;
import com.loc.z;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 X2\u00020\u0001:\u0001\rB'\b\u0007\u0012\u0006\u0010R\u001a\u00020Q\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010S\u0012\b\b\u0002\u0010U\u001a\u00020\u0002¢\u0006\u0004\bV\u0010WJ3\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ3\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0002J\u0006\u0010\u000e\u001a\u00020\u0007J\u0014\u0010\u0011\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ$\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005J&\u0010\u001d\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u0007J;\u0010!\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001bR\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010)R\u0018\u0010A\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010)R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010<R\u0018\u0010J\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0019\u0010P\u001a\u00020K8\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006Y"}, d2 = {"Lcom/huami/module/homepage/cards/business/heartrate/HeartRateCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", Constant.KEY_HR_VALUE, "Lkotlin/Triple;", "", "state", "", "a", "(Ljava/lang/Integer;Lkotlin/Triple;)V", "b", "rate", "Landroid/text/SpannableStringBuilder;", "c", "initView", "Lkotlin/Function0;", "click", "heartRateSwitchClick", "resHr", "minHr", com.xiaomi.hm.health.Constant.PAI_KEY_MAX_HR, "setResMinMaxHeartRate", "Lcom/huami/heartrate/service/HeartRateInfo;", "heartRateInfo", "", "Lcom/huami/heartrate/model/AbnormalHeartBeatEntity;", "abnormalRange", "", "switchIsOpen", "setAverHeartRateAndChart", "setSwitchIsOpenWhenDataNull", "", EcgData.TIMESTAMP_SERVER_UPDATED, "setLatestHeartRate", "(Ljava/lang/Integer;Ljava/lang/Long;Lkotlin/Triple;)V", "isEnable", "updateHeartRateSwitch", "Lcom/huami/module/homepage/cards/cardui/CardTitleBarView;", "Lcom/huami/module/homepage/cards/cardui/CardTitleBarView;", "heartBar", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "restHrView", "minHrView", GoogleApiAvailabilityLight.a, "maxHrView", "Lcom/huami/module/homepage/cards/business/heartrate/HeartRateChartView;", "e", "Lcom/huami/module/homepage/cards/business/heartrate/HeartRateChartView;", "chartView", "Landroid/view/View;", "f", "Landroid/view/View;", "noHrDataView", "Lcom/huami/module/homepage/cards/cardui/GradientArcView;", "g", "Lcom/huami/module/homepage/cards/cardui/GradientArcView;", "heartRateArcView", "Lcom/airbnb/lottie/LottieAnimationView;", "h", "Lcom/airbnb/lottie/LottieAnimationView;", "heartRateAnimation", "i", "latestHeartRate", z.j, "heartRateStateView", "Lcom/huami/module/homepage/cards/cardui/GradientLineView;", hl.k, "Lcom/huami/module/homepage/cards/cardui/GradientLineView;", "heartRateLineView", "l", "redHeartView", "m", "Ljava/lang/Integer;", "hrValue", "Landroidx/viewbinding/ViewBinding;", GoogleApiAvailabilityLight.b, "Landroidx/viewbinding/ViewBinding;", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateCardView extends ConstraintLayout {

    @Deprecated
    public static final int HR_VIEW_MAX_VALUE = 200;

    @Deprecated
    public static final int ONE_DAY_MINUTES = 1440;

    @NotNull
    private static final c o = new c(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private CardTitleBarView heartBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TextView restHrView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TextView minHrView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextView maxHrView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private HeartRateChartView chartView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private View noHrDataView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private GradientArcView heartRateArcView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private LottieAnimationView heartRateAnimation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private TextView latestHeartRate;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private TextView heartRateStateView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private GradientLineView heartRateLineView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private LottieAnimationView redHeartView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Integer hrValue;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final ViewBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_HEARTRATE_C, TuplesKt.to("status", HeartRateCardView.this.chartView.heartButtonVisible() ? "0" : "1"));
            if (HomeUtils.isMifitApp()) {
                RouterHelperKt.executeRoute$default(this.b, ServiceManager.INSTANCE.getAssistService().fullHeartRateIsOpen(this.b) ? RouterHelper.MIFIT_ALL_DAY_HEART_RATE_PATH : RouterHelper.MIFIT_HEART_RATE_PATH, new Pair[0], null, 8, null);
            } else {
                RouterHelperKt.executeRoute$default(this.b, RouterHelper.HEART_RATE_PATH, new Pair[]{TuplesKt.to(XiaomiOAuthConstants.EXTRA_USER_ID, HMPersonInfo.getInstance().getUserInfo().getUserid()), TuplesKt.to("extra_user_register_time", Long.valueOf(HMPersonInfo.getInstance().getUserInfo().getCreatTime())), TuplesKt.to("extra_user_age", Integer.valueOf(HMPersonInfo.getInstance().getUserInfo().getAge()))}, null, 8, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "left", "top", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Float, Float, Unit> {
        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
            invoke(f.floatValue(), f2.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f, float f2) {
            LottieAnimationView lottieAnimationView = HeartRateCardView.this.heartRateAnimation;
            if (lottieAnimationView == null) {
                return;
            }
            HeartRateCardView heartRateCardView = HeartRateCardView.this;
            ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            Integer numValueOf = Integer.valueOf((int) f);
            if (!(numValueOf.intValue() != 0)) {
                numValueOf = null;
            }
            layoutParams2.setMarginStart(numValueOf == null ? NumberExtKt.getDp(53) : numValueOf.intValue());
            Integer numValueOf2 = Integer.valueOf((int) f2);
            Integer num = numValueOf2.intValue() != 0 ? numValueOf2 : null;
            layoutParams2.topMargin = num == null ? NumberExtKt.getDp(29) : num.intValue();
            Unit unit = Unit.INSTANCE;
            lottieAnimationView.setLayoutParams(layoutParams2);
            if (heartRateCardView.hrValue == null || heartRateCardView.hrValue.intValue() <= 0) {
                lottieAnimationView.cancelAnimation();
                lottieAnimationView.setVisibility(8);
            } else {
                if (lottieAnimationView.isAnimating()) {
                    return;
                }
                lottieAnimationView.setAnimation("homepage_heart_animation.json");
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.playAnimation();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/huami/module/homepage/cards/business/heartrate/HeartRateCardView$c", "", "", "HR_VIEW_MAX_VALUE", LogUtil.I, "ONE_DAY_MINUTES", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.getA();
        }
    }

    @JvmOverloads
    public HeartRateCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HeartRateCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ HeartRateCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a(Integer heartRate, Triple<String, Integer, Integer> state) {
        GradientArcView gradientArcView = this.heartRateArcView;
        if (gradientArcView == null) {
            return;
        }
        gradientArcView.setContent(state.getFirst());
        gradientArcView.setContentColor(state.getSecond().intValue());
        gradientArcView.setMaxValue(heartRate != null ? (int) (200 * (heartRate.intValue() / state.getThird().intValue())) : 200);
        gradientArcView.setValue(this.hrValue);
        if (heartRate != null) {
            gradientArcView.setGradientColor(ViewExtKt.loadColor(gradientArcView, R.color.s18), ViewExtKt.loadColor(gradientArcView, R.color.s15), ViewExtKt.loadColor(gradientArcView, R.color.s20), ViewExtKt.loadColor(gradientArcView, R.color.s33), ViewExtKt.loadColor(gradientArcView, R.color.s31), ViewExtKt.loadColor(gradientArcView, R.color.s51));
        } else {
            gradientArcView.setGradientColor(ViewExtKt.loadColor(gradientArcView, R.color.s4));
        }
        gradientArcView.setShowDot(heartRate != null);
        gradientArcView.refresh();
    }

    private final void b(Integer heartRate, Triple<String, Integer, Integer> state) {
        SpannableStringBuilder spannableStringBuilderBuild;
        String strI18n;
        String strI18n2;
        TextView textView = this.latestHeartRate;
        if (textView != null) {
            String str = "--";
            if (isRtl()) {
                spannableStringBuilderBuild = HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), getContext().getString(R.string.homepage_item_card_unit_bmp), null, null, false, null, null, null, 126, null), (heartRate == null || (strI18n2 = I18nKt.i18n(heartRate.intValue())) == null) ? "--" : strI18n2, null, 30, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).build();
            } else {
                HMSpannable hMSpannable = new HMSpannable();
                if (heartRate != null && (strI18n = I18nKt.i18n(heartRate.intValue())) != null) {
                    str = strI18n;
                }
                spannableStringBuilderBuild = HMSpannable.append$default(HMSpannable.append$default(hMSpannable, str, null, 30, false, null, HomeUtils.getMaisonTypeface(), null, 90, null), getContext().getString(R.string.homepage_item_card_unit_bmp), null, null, false, null, null, null, 126, null).build();
            }
            textView.setText(spannableStringBuilderBuild);
        }
        TextView textView2 = this.heartRateStateView;
        if (textView2 == null) {
            return;
        }
        textView2.setText(HMSpannable.append$default(new HMSpannable(), state.getFirst(), Integer.valueOf(ViewExtKt.loadColor(this, state.getSecond().intValue())), null, false, null, null, null, 124, null).build());
    }

    private final SpannableStringBuilder c(String rate) {
        int i;
        HMSpannable hMSpannableAddSpaceBlank = HMSpannable.append$default(new HMSpannable(), rate, null, 20, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addSpaceBlank();
        Resources resources = getContext().getResources();
        int i2 = R.plurals.homepage_item_card_unit_time_per_minute;
        try {
            i = Integer.parseInt(rate);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        return HMSpannable.append$default(hMSpannableAddSpaceBlank, resources.getQuantityString(i2, i), null, null, false, null, null, null, 126, null).build();
    }

    public static /* synthetic */ SpannableStringBuilder d(HeartRateCardView heartRateCardView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "--";
        }
        return heartRateCardView.c(str);
    }

    public static /* synthetic */ void setResMinMaxHeartRate$default(HeartRateCardView heartRateCardView, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "--";
        }
        if ((i & 2) != 0) {
            str2 = "--";
        }
        if ((i & 4) != 0) {
            str3 = "--";
        }
        heartRateCardView.setResMinMaxHeartRate(str, str2, str3);
    }

    @NotNull
    public final ViewBinding getBinding() {
        return this.binding;
    }

    public final void heartRateSwitchClick(@NotNull Function0<Unit> click) {
        this.chartView.setOnClick(new d(click));
    }

    public final void initView() {
        GradientLineView maxValue;
        GradientArcView maxValue2;
        GradientArcView showDot;
        GradientArcView gradientArcView = this.heartRateArcView;
        if (gradientArcView != null && (maxValue2 = gradientArcView.setMaxValue(200)) != null && (showDot = maxValue2.setShowDot(false)) != null) {
            showDot.refresh();
        }
        GradientLineView gradientLineView = this.heartRateLineView;
        if (gradientLineView != null && (maxValue = gradientLineView.setMaxValue(200)) != null) {
            maxValue.refresh();
        }
        this.chartView.setHeartRateChart(null, CollectionsKt__CollectionsKt.emptyList(), false);
    }

    public final void setAverHeartRateAndChart(@Nullable HeartRateInfo heartRateInfo, @NotNull List<AbnormalHeartBeatEntity> abnormalRange, boolean switchIsOpen) {
        HeartRateStatisticalInfo heartRateStatisticalInfo;
        HeartRateChartView heartRateChartView = this.chartView;
        Integer numValueOf = null;
        if (heartRateInfo != null && (heartRateStatisticalInfo = heartRateInfo.getHeartRateStatisticalInfo()) != null) {
            numValueOf = Integer.valueOf(heartRateStatisticalInfo.getAvgHeartRate());
        }
        heartRateChartView.setAverHeartRate(numValueOf);
        this.chartView.setHeartRateChart(heartRateInfo, abnormalRange, switchIsOpen);
    }

    public final void setLatestHeartRate(@Nullable Integer heartRate, @Nullable Long updateTime, @NotNull Triple<String, Integer, Integer> state) {
        this.hrValue = heartRate;
        this.heartBar.setFirstTime(updateTime == null ? 0L : updateTime.longValue());
        a(heartRate, state);
        GradientLineView gradientLineView = this.heartRateLineView;
        if (gradientLineView != null) {
            gradientLineView.setDotColorKeepGradient(false);
            gradientLineView.setDotColor(ViewExtKt.loadColor(gradientLineView, state.getSecond().intValue()));
            gradientLineView.setValue(state.getThird().intValue());
            gradientLineView.refresh();
        }
        LottieAnimationView lottieAnimationView = this.redHeartView;
        if (lottieAnimationView != null) {
            if (heartRate == null) {
                lottieAnimationView.cancelAnimation();
            } else if (lottieAnimationView.isAnimating()) {
                return;
            } else {
                lottieAnimationView.playAnimation();
            }
        }
        b(heartRate, state);
        this.noHrDataView.setVisibility(heartRate != null ? 8 : 0);
    }

    public final void setResMinMaxHeartRate(@NotNull String resHr, @NotNull String minHr, @NotNull String maxHr) {
        TextView textView = this.restHrView;
        if (textView != null) {
            textView.setText(c(resHr));
        }
        TextView textView2 = this.minHrView;
        if (textView2 != null) {
            textView2.setText(c(minHr));
        }
        TextView textView3 = this.maxHrView;
        if (textView3 == null) {
            return;
        }
        textView3.setText(c(maxHr));
    }

    public final void setSwitchIsOpenWhenDataNull() {
        HeartRateChartView heartRateChartView = this.chartView;
        long time = TimeExtKt.getEndingTime(Calendar.getInstance()).getTime();
        HeartRateStatisticalInfo heartRateStatisticalInfo = new HeartRateStatisticalInfo(0, 0, 0, 0, new HeartRate(0, TimeExtKt.getEndingTime(Calendar.getInstance()).getTime()));
        IntRange intRangeUntil = e.until(0, 1440);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            arrayList.add((byte) -1);
        }
        heartRateChartView.setHeartRateChart(new HeartRateInfo(time, heartRateStatisticalInfo, CollectionsKt___CollectionsKt.toByteArray(arrayList)), CollectionsKt__CollectionsKt.emptyList(), true);
    }

    public final void updateHeartRateSwitch(boolean isEnable) {
        this.chartView.hideHrSwitchButton(isEnable);
    }

    @JvmOverloads
    public HeartRateCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ViewBinding viewBinding;
        super(context, attributeSet, i);
        if (HomeUtils.isChineseLanguage()) {
            HomepageItemCardHeartRateBinding homepageItemCardHeartRateBindingInflate = HomepageItemCardHeartRateBinding.inflate(LayoutInflater.from(context), this, true);
            this.heartBar = homepageItemCardHeartRateBindingInflate.heartRateBar;
            this.restHrView = homepageItemCardHeartRateBindingInflate.restHr;
            this.minHrView = homepageItemCardHeartRateBindingInflate.minHr;
            this.maxHrView = homepageItemCardHeartRateBindingInflate.maxHr;
            this.chartView = homepageItemCardHeartRateBindingInflate.detail;
            this.heartRateArcView = homepageItemCardHeartRateBindingInflate.ring;
            this.heartRateAnimation = homepageItemCardHeartRateBindingInflate.redHeart;
            this.noHrDataView = homepageItemCardHeartRateBindingInflate.noHrData;
            Unit unit = Unit.INSTANCE;
            viewBinding = homepageItemCardHeartRateBindingInflate;
        } else {
            HomepageItemCardHeartRateI18nBinding homepageItemCardHeartRateI18nBindingInflate = HomepageItemCardHeartRateI18nBinding.inflate(LayoutInflater.from(context), this, true);
            this.heartBar = homepageItemCardHeartRateI18nBindingInflate.heartRateBar;
            this.chartView = homepageItemCardHeartRateI18nBindingInflate.detail;
            this.latestHeartRate = homepageItemCardHeartRateI18nBindingInflate.heartRate;
            this.heartRateStateView = homepageItemCardHeartRateI18nBindingInflate.heartRateState;
            this.heartRateLineView = homepageItemCardHeartRateI18nBindingInflate.heartRateLine;
            this.noHrDataView = homepageItemCardHeartRateI18nBindingInflate.noHrData;
            this.redHeartView = homepageItemCardHeartRateI18nBindingInflate.heart;
            Unit unit2 = Unit.INSTANCE;
            viewBinding = homepageItemCardHeartRateI18nBindingInflate;
        }
        this.binding = viewBinding;
        ExteranelKt.setOnClickWithPolicyListener(viewBinding.getRoot(), new a(context));
        GradientArcView gradientArcView = this.heartRateArcView;
        if (gradientArcView != null) {
            gradientArcView.setHeartAnimation(new b());
            gradientArcView.setGradientColor(ViewExtKt.loadColor(gradientArcView, R.color.s4));
        }
        GradientLineView gradientLineView = this.heartRateLineView;
        if (gradientLineView == null) {
            return;
        }
        gradientLineView.setGradientColor(ViewExtKt.loadColor(gradientLineView, R.color.s18), ViewExtKt.loadColor(gradientLineView, R.color.s15), ViewExtKt.loadColor(gradientLineView, R.color.s20), ViewExtKt.loadColor(gradientLineView, R.color.s33), ViewExtKt.loadColor(gradientLineView, R.color.s31), ViewExtKt.loadColor(gradientLineView, R.color.s51));
    }
}
