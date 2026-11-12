package com.huami.module.homepage.cards.business.spo2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodoxygen.service.other.Spo2;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardSpo2Binding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/huami/module/homepage/cards/business/spo2/SpO2CardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "spo2Value", "spo2Text", "", "spo2UpdateTime", "", "setSpO2Param", "", "value", "a", "Lcom/huami/bloodoxygen/service/other/Spo2;", "spo2", "setSpO2View", "Lcom/huami/module/homepage/databinding/HomepageItemCardSpo2Binding;", "Lcom/huami/module/homepage/databinding/HomepageItemCardSpo2Binding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SpO2CardView extends ConstraintLayout {

    @Deprecated
    public static final int HIGH = 80;

    @Deprecated
    public static final int HIGH_END = 100;

    @Deprecated
    public static final int NORMAL_SPO2 = 90;

    @NotNull
    private static final b b = new b(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardSpo2Binding binding;

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
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_SPO2_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(this.a, RouterHelper.SPO2_PATH, new Pair[0], null, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"com/huami/module/homepage/cards/business/spo2/SpO2CardView$b", "", "", "HIGH", LogUtil.I, "HIGH_END", "NORMAL_SPO2", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public SpO2CardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SpO2CardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SpO2CardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final String a(int value) {
        if (80 <= value && value < 90) {
            return ViewExtKt.getString(this, R.string.homepage_item_card_spo2_level_exception);
        }
        return 90 <= value && value <= 100 ? ViewExtKt.getString(this, R.string.homepage_item_card_spo2_level_normal) : "";
    }

    private final void setSpO2Param(String spo2Value, String spo2Text, long spo2UpdateTime) {
        HomepageItemCardSpo2Binding homepageItemCardSpo2Binding = this.binding;
        if (spo2Value == null || spo2Value.length() == 0) {
            ViewExtKt.setVisible(homepageItemCardSpo2Binding.spo2Mask, true);
            homepageItemCardSpo2Binding.spo2Value.setVisibility(8);
            homepageItemCardSpo2Binding.spo2Desc.setVisibility(8);
            CardTitleBarView.setFirstTime$default(homepageItemCardSpo2Binding.spo2Bar, 0L, 1, null);
            homepageItemCardSpo2Binding.spo2Lottie.cancelAnimation();
            return;
        }
        ViewExtKt.setVisible(homepageItemCardSpo2Binding.spo2Mask, false);
        homepageItemCardSpo2Binding.spo2Value.setVisibility(0);
        homepageItemCardSpo2Binding.spo2Desc.setVisibility(0);
        LottieAnimationView lottieAnimationView = homepageItemCardSpo2Binding.spo2Lottie;
        if (!lottieAnimationView.isAnimating()) {
            lottieAnimationView.playAnimation();
        }
        TextView textView = homepageItemCardSpo2Binding.spo2Value;
        HMSpannable hMSpannable = new HMSpannable();
        if (Language.isTurkish()) {
            HMSpannable.append$default(HMSpannable.append$default(hMSpannable, "%", null, 14, false, null, null, null, 122, null), spo2Value, null, null, false, null, null, null, 126, null);
        } else {
            HMSpannable.append$default(HMSpannable.append$default(hMSpannable, spo2Value, null, null, false, null, null, null, 126, null), "%", null, 14, false, null, null, null, 122, null);
        }
        Unit unit = Unit.INSTANCE;
        textView.setText(hMSpannable.build());
        homepageItemCardSpo2Binding.spo2Desc.setText(spo2Text);
        homepageItemCardSpo2Binding.spo2Bar.setFirstTime(spo2UpdateTime);
    }

    public final void setSpO2View(@Nullable Spo2 spo2) {
        if (spo2 != null) {
            setSpO2Param(I18nKt.i18n(spo2.getSpo2()), a(spo2.getSpo2()), spo2.getTimestamp());
        } else {
            setSpO2Param(null, "", 0L);
        }
    }

    @JvmOverloads
    public SpO2CardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = HomepageItemCardSpo2Binding.inflate(LayoutInflater.from(context), this, true);
        ExteranelKt.setOnClickWithPolicyListener(this, new a(context));
    }
}
