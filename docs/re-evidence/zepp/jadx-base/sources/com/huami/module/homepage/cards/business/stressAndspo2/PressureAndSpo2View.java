package com.huami.module.homepage.cards.business.stressAndspo2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.CornerDirection;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardSpo2PressureBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.module.utils.VectorDrawablePathColorHelper;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.Language;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\n\u001a\u00020\u0004J1\u0010\u0010\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eR\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006!"}, d2 = {"Lcom/huami/module/homepage/cards/business/stressAndspo2/PressureAndSpo2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "", "setStressDrawable", "", "show", "a", "b", "initView", "stressValue", "", "stressText", "", "stressUpdateTime", "setStressParam", "(Ljava/lang/Integer;Ljava/lang/String;JI)V", "spo2Value", "spo2Text", "spo2UpdateTime", "setSpO2Param", "Lcom/huami/module/homepage/databinding/HomepageItemCardSpo2PressureBinding;", "Lcom/huami/module/homepage/databinding/HomepageItemCardSpo2PressureBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PressureAndSpo2View extends ConstraintLayout {

    @NotNull
    private static final String b = "homepage_spo2_animation.json";

    @NotNull
    private static final String c = "homepage_spo2_animation_night.json";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private HomepageItemCardSpo2PressureBinding binding;

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
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_STRESS_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(PressureAndSpo2View.this.getContext(), "detail/DataDetailBaseNewActivity", new Pair[]{new Pair("data_type", "all_day_stress")}, null, 8, null);
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
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_SPO2_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(PressureAndSpo2View.this.getContext(), RouterHelper.SPO2_PATH, new Pair[0], null, 8, null);
        }
    }

    @JvmOverloads
    public PressureAndSpo2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PressureAndSpo2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PressureAndSpo2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a(boolean show) {
        BackgroundTextView.setBackgroundCornerDirection$default(this.binding.pressureMask, show ? CornerDirection.LEFT : CornerDirection.NONE, 0, 0.0d, 6, null);
    }

    private final void b(boolean show) {
        BackgroundTextView.setBackgroundCornerDirection$default(this.binding.spo2Mask, show ? CornerDirection.RIGHT : CornerDirection.NONE, 0, 0.0d, 6, null);
    }

    private final void setStressDrawable(@ColorInt int color) {
        this.binding.pressureScaleIv.setImageDrawable(VectorDrawablePathColorHelper.setPartPathColor$default(VectorDrawablePathColorHelper.setPartPathColor$default(new VectorDrawablePathColorHelper(getContext(), R.drawable.ic_card_stress), "stress_angle", color, false, 4, null).setPartPathColor("stress_angle", color, true), "stress_line", color, false, 4, null).create());
    }

    public static /* synthetic */ void setStressParam$default(PressureAndSpo2View pressureAndSpo2View, Integer num, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = R.color.s15;
        }
        pressureAndSpo2View.setStressParam(num, str, j, i);
    }

    public final void initView() {
        HomepageItemCardSpo2PressureBinding homepageItemCardSpo2PressureBinding = this.binding;
        ExteranelKt.setOnClickWithPolicyListener(homepageItemCardSpo2PressureBinding.pressureMask, new a());
        ExteranelKt.setOnClickWithPolicyListener(homepageItemCardSpo2PressureBinding.spo2Mask, new b());
        homepageItemCardSpo2PressureBinding.spo2Lottie.setAnimation(RainbowUtils.isDarkMode(getContext()) ? c : b);
        if (HomeUtils.isChineseLanguage()) {
            return;
        }
        ConstraintLayout root = this.binding.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        layoutParams.height += NumberExtKt.getDp(10);
        Unit unit = Unit.INSTANCE;
        root.setLayoutParams(layoutParams);
    }

    public final void setSpO2Param(@Nullable String spo2Value, @NotNull String spo2Text, long spo2UpdateTime) {
        HomepageItemCardSpo2PressureBinding homepageItemCardSpo2PressureBinding = this.binding;
        if (spo2Value == null || spo2Value.length() == 0) {
            homepageItemCardSpo2PressureBinding.noSpo2Tip.setVisibility(0);
            b(true);
            homepageItemCardSpo2PressureBinding.spo2Value.setVisibility(8);
            homepageItemCardSpo2PressureBinding.spo2Desc.setVisibility(8);
            CardTitleBarView.setSecondTime$default(homepageItemCardSpo2PressureBinding.titleBar, 0L, 1, null);
            homepageItemCardSpo2PressureBinding.spo2Lottie.cancelAnimation();
            return;
        }
        homepageItemCardSpo2PressureBinding.noSpo2Tip.setVisibility(8);
        b(false);
        homepageItemCardSpo2PressureBinding.spo2Value.setVisibility(0);
        homepageItemCardSpo2PressureBinding.spo2Desc.setVisibility(0);
        RoundLottieAnimationView roundLottieAnimationView = homepageItemCardSpo2PressureBinding.spo2Lottie;
        if (!roundLottieAnimationView.isAnimating()) {
            roundLottieAnimationView.playAnimation();
        }
        TextView textView = homepageItemCardSpo2PressureBinding.spo2Value;
        HMSpannable hMSpannable = new HMSpannable();
        if (Language.isTurkish()) {
            HMSpannable.append$default(HMSpannable.append$default(hMSpannable, "%", null, 14, false, null, null, null, 122, null), spo2Value, null, null, false, null, null, null, 126, null);
        } else {
            HMSpannable.append$default(HMSpannable.append$default(hMSpannable, spo2Value, null, null, false, null, null, null, 126, null), "%", null, 14, false, null, null, null, 122, null);
        }
        Unit unit = Unit.INSTANCE;
        textView.setText(hMSpannable.build());
        homepageItemCardSpo2PressureBinding.spo2Desc.setText(spo2Text);
        homepageItemCardSpo2PressureBinding.titleBar.setSecondTime(spo2UpdateTime);
    }

    public final void setStressParam(@Nullable Integer stressValue, @NotNull String stressText, long stressUpdateTime, @ColorRes int color) {
        HomepageItemCardSpo2PressureBinding homepageItemCardSpo2PressureBinding = this.binding;
        if (stressValue == null || stressValue.intValue() == 0) {
            homepageItemCardSpo2PressureBinding.noPressureTip.setVisibility(0);
            a(true);
            homepageItemCardSpo2PressureBinding.pressureValue.setVisibility(8);
            homepageItemCardSpo2PressureBinding.pressureDesc.setVisibility(8);
            CardTitleBarView.setFirstTime$default(homepageItemCardSpo2PressureBinding.titleBar, 0L, 1, null);
            return;
        }
        homepageItemCardSpo2PressureBinding.noPressureTip.setVisibility(8);
        a(false);
        homepageItemCardSpo2PressureBinding.pressureValue.setVisibility(0);
        homepageItemCardSpo2PressureBinding.pressureDesc.setVisibility(0);
        homepageItemCardSpo2PressureBinding.pressureValue.setText(I18nKt.i18n(stressValue.intValue()));
        homepageItemCardSpo2PressureBinding.pressureDesc.setText(stressText);
        homepageItemCardSpo2PressureBinding.titleBar.setFirstTime(stressUpdateTime);
        setStressDrawable(ViewExtKt.loadColor(this, color));
    }

    @JvmOverloads
    public PressureAndSpo2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = HomepageItemCardSpo2PressureBinding.inflate(LayoutInflater.from(context), this, true);
    }
}
