package com.huami.module.homepage.cards.business.pai;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.business.pai.PaiCardView;
import com.huami.module.homepage.cards.helper.ChartRenderHelper;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardPaiBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u00106\u001a\u000205\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00109\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tJ\u0014\u0010\u0015\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013J\u0017\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\fJ\u0014\u0010!\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001fR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010'R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010'R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010'¨\u0006<"}, d2 = {"Lcom/huami/module/homepage/cards/business/pai/PaiCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "l", "", "value", hl.k, "lastPai", "currentPai", "", "i", "stringRes", "", "f", "initView", "totalPai", "setTotalPai", "isEnable", "updatePaiSwitch", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPaiSwitchClickListener", "", "time", "setPaiUpdateTime", "(Ljava/lang/Long;)V", "todayPai", "todayDesc", "nextGoalPai", "nextGoalDesc", "updatePai", "", "paiList", "setSevenDaysPaiData", "Lcom/huami/module/homepage/databinding/HomepageItemCardPaiBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardPaiBinding;", "binding", "b", LogUtil.I, "c", "Lkotlin/jvm/functions/Function0;", "paiSwitchClickListener", GoogleApiAvailabilityLight.a, "Z", "paiSwitchState", "e", "yellow", "blue", "g", "green", "h", "currentColor", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PaiCardView extends ConstraintLayout {

    @Deprecated
    public static final int MAX_PAI_LIMIT = 100;

    @Deprecated
    public static final int MAX_PAI_LIMIT_HALF = 50;

    @Deprecated
    public static final float PAI_VALUE_GOAL = 100.0f;

    @Deprecated
    public static final float PAI_VALUE_MAX = 120.0f;

    @Deprecated
    public static final float PAI_VALUE_MIN = 16.0f;

    @NotNull
    private static final a i = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardPaiBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int lastPai;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> paiSwitchClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean paiSwitchState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int yellow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int blue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int green;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int currentColor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"com/huami/module/homepage/cards/business/pai/PaiCardView$a", "", "", "MAX_PAI_LIMIT", LogUtil.I, "MAX_PAI_LIMIT_HALF", "", "PAI_VALUE_GOAL", "F", "PAI_VALUE_MAX", "PAI_VALUE_MIN", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
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
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_PAI_C, TuplesKt.to("status", Integer.valueOf(PaiCardView.this.paiSwitchState ? 1 : 0)));
            RouterHelperKt.executeRoute$default(PaiCardView.this.getContext(), RouterHelper.PAI_PATH, new Pair[0], null, 8, null);
        }
    }

    @JvmOverloads
    public PaiCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PaiCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PaiCardView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    private final String f(int stringRes) {
        return getContext().getString(stringRes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(PaiCardView paiCardView, LottieComposition lottieComposition) {
        paiCardView.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(PaiCardView paiCardView, View view) {
        Function0<Unit> function0 = paiCardView.paiSwitchClickListener;
        if (function0 == null) {
            return;
        }
        function0.getA();
    }

    private final boolean i(int lastPai, int currentPai) {
        if (lastPai < 50) {
            if (currentPai >= 50) {
                return true;
            }
        } else if (lastPai < 100) {
            if (currentPai < 50 || currentPai >= 100) {
                return true;
            }
        } else if (currentPai < 100) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(List list, PaiCardView paiCardView) {
        int size = list.size();
        List<String> latest7DaysDateXLabels = ChartRenderHelper.INSTANCE.getLatest7DaysDateXLabels(paiCardView.getContext());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(latest7DaysDateXLabels, 10));
        int i2 = 0;
        for (Object obj : latest7DaysDateXLabels) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            Float fValueOf = size > i2 ? Float.valueOf(((Number) list.get(i2)).longValue()) : null;
            float f = 0.0f;
            if (fValueOf != null) {
                Float f2 = (fValueOf.floatValue() > 0.0f ? 1 : (fValueOf.floatValue() == 0.0f ? 0 : -1)) > 0 ? fValueOf : null;
                if (f2 != null) {
                    float fFloatValue = f2.floatValue();
                    f = fFloatValue < 16.0f ? 16.0f : fFloatValue > 100.0f ? 120.0f : fFloatValue;
                }
            }
            arrayList.add(new StraightGraphParam(i2, f, str, f < 50.0f ? ViewExtKt.loadColor(paiCardView, R.color.s31) : f < 100.0f ? paiCardView.blue : paiCardView.green));
            i2 = i3;
        }
        paiCardView.binding.paiContainer.setParams(arrayList);
    }

    private final void k(int value) {
        int i2;
        if (i(this.lastPai, value)) {
            if (value < 50) {
                i2 = this.yellow;
            } else {
                i2 = value < 100 ? this.blue : this.green;
            }
            this.currentColor = i2;
            LottieAnimationView lottieAnimationView = this.binding.paiAnimation;
            lottieAnimationView.cancelAnimation();
            l();
            lottieAnimationView.playAnimation();
            this.lastPai = value;
        }
    }

    @SuppressLint({"RestrictedApi"})
    private final void l() {
        LottieAnimationView lottieAnimationView = this.binding.paiAnimation;
        for (KeyPath keyPath : lottieAnimationView.resolveKeyPath(new KeyPath("**"))) {
            if (keyPath.matches("渐变填充 1", 2)) {
                lottieAnimationView.addValueCallback(keyPath, LottieProperty.GRADIENT_COLOR, (SimpleLottieValueCallback<Integer[]>) new SimpleLottieValueCallback() { // from class: lr5
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                        return PaiCardView.m(this.a, lottieFrameInfo);
                    }
                });
            } else if (keyPath.matches("填充 1", 2)) {
                lottieAnimationView.addValueCallback(keyPath, LottieProperty.COLOR, (SimpleLottieValueCallback<Integer>) new SimpleLottieValueCallback() { // from class: mr5
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                        return PaiCardView.n(this.a, lottieFrameInfo);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer[] m(PaiCardView paiCardView, LottieFrameInfo lottieFrameInfo) {
        return new Integer[]{Integer.valueOf(paiCardView.currentColor), Integer.valueOf(paiCardView.currentColor)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer n(PaiCardView paiCardView, LottieFrameInfo lottieFrameInfo) {
        return Integer.valueOf(paiCardView.currentColor);
    }

    public final void initView() {
        LottieAnimationView lottieAnimationView = this.binding.paiAnimation;
        lottieAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: kr5
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                PaiCardView.g(this.a, lottieComposition);
            }
        });
        lottieAnimationView.playAnimation();
        this.binding.openHrDetectButton.setOnClickListener(new View.OnClickListener() { // from class: jr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaiCardView.h(this.a, view);
            }
        });
        this.binding.paiBar.setTitleText(HomeUtils.isChineseLanguage() ? f(R.string.homepage_item_card_pai_title) : f(R.string.homepage_item_card_pai));
        PaiStraightGraphView marginEnd = this.binding.paiContainer.setMaxValue(120.0f).setGoalLineValue(100.0f).setMarginStart(NumberExtKt.getDp(20.0f)).setMarginEnd(NumberExtKt.getDp(20.0f));
        List<String> latest7DaysDateXLabels = ChartRenderHelper.INSTANCE.getLatest7DaysDateXLabels(getContext());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(latest7DaysDateXLabels, 10));
        int i2 = 0;
        for (Object obj : latest7DaysDateXLabels) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new StraightGraphParam(i2, 0.0f, (String) obj, ViewExtKt.loadColor(this, R.color.s31)));
            i2 = i3;
        }
        marginEnd.setParams(arrayList);
        ExteranelKt.setOnClickWithPolicyListener(this, new b());
    }

    public final void setPaiSwitchClickListener(@NotNull Function0<Unit> listener) {
        this.paiSwitchClickListener = listener;
    }

    public final void setPaiUpdateTime(@Nullable Long time) {
        this.binding.paiBar.setFirstTime(time == null ? 0L : time.longValue());
    }

    public final void setSevenDaysPaiData(@NotNull final List<Long> paiList) {
        this.binding.paiContainer.post(new Runnable() { // from class: nr5
            @Override // java.lang.Runnable
            public final void run() {
                PaiCardView.j(paiList, this);
            }
        });
    }

    public final void setTotalPai(int totalPai) {
        this.binding.paiExtView.updateLineProgress(totalPai);
        this.binding.allPai.setText(HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), I18nKt.i18n(totalPai), null, 30, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addNewline(), f(R.string.homepage_item_card_pai), null, null, false, null, null, null, 126, null).build());
        k(totalPai);
    }

    public final void updatePai(int todayPai, @NotNull String todayDesc, int nextGoalPai, @NotNull String nextGoalDesc) {
        PaiExtView paiExtView = this.binding.paiExtView;
        if (nextGoalPai >= 100) {
            nextGoalPai = 100;
        }
        paiExtView.updatePai(todayPai, todayDesc, nextGoalDesc, nextGoalPai);
    }

    public final void updatePaiSwitch(boolean isEnable) {
        this.paiSwitchState = isEnable;
        HomepageItemCardPaiBinding homepageItemCardPaiBinding = this.binding;
        homepageItemCardPaiBinding.paiSevenNone.setVisibility(isEnable ? 8 : 0);
        homepageItemCardPaiBinding.openHrDetectButton.setVisibility(isEnable ? 8 : 0);
    }

    @JvmOverloads
    public PaiCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.binding = HomepageItemCardPaiBinding.inflate(LayoutInflater.from(context), this, true);
        this.yellow = ViewExtKt.loadColor(this, R.color.s33);
        this.blue = ViewExtKt.loadColor(this, R.color.s15);
        this.green = ViewExtKt.loadColor(this, R.color.s20);
        this.currentColor = this.yellow;
    }
}
