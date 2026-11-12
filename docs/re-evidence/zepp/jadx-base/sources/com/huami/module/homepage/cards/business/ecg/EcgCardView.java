package com.huami.module.homepage.cards.business.ecg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.business.ecg.EcgCardView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardEcgBinding;
import com.huami.module.homepage.databinding.HomepageItemCardEcgI18nBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.ContextExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0018\u0010!\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0014¨\u0006)"}, d2 = {"Lcom/huami/module/homepage/cards/business/ecg/EcgCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "state", "", "c", GoogleApiAvailabilityLight.a, "", EcgData.TIMESTAMP_SERVER_UPDATED, "hrv", "status", "", "setEcgData", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lcom/huami/module/homepage/cards/cardui/CardTitleBarView;", "a", "Lcom/huami/module/homepage/cards/cardui/CardTitleBarView;", "titleBar", "Landroid/view/View;", "b", "Landroid/view/View;", "emptyView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "hrvValueView", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "curveView", "e", "stateView", "f", "stateTipView", "g", "ecgIconView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class EcgCardView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private CardTitleBarView titleBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private View emptyView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private TextView hrvValueView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private AppCompatImageView curveView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private TextView stateView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private TextView stateTipView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private View ecgIconView;

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
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_ECG_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(this.a, RouterHelper.ECG_PATH, new Pair[0], null, 8, null);
        }
    }

    @JvmOverloads
    public EcgCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public EcgCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EcgCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(EcgCardView ecgCardView, Context context) {
        ecgCardView.curveView.setImageResource(RainbowUtils.isDarkMode(context) ? R.drawable.item_card_ecg_bg_night : R.drawable.item_card_ecg_bg);
    }

    private final String c(int state) {
        if (state == 0) {
            return getContext().getString(R.string.homepage_item_card_ecg_data_short);
        }
        if (state == 1) {
            return getContext().getString(R.string.homepage_item_card_abnormal_ecg);
        }
        if (state != 3) {
            return state != 7 ? getContext().getString(R.string.homepage_item_card_exception_not_found) : getContext().getString(R.string.homepage_item_card_poor_signal_quality);
        }
        return getContext().getString(R.string.homepage_item_card_unnable_to_judge);
    }

    private final String d(int state) {
        return (state == 0 || state == 7) ? getContext().getString(R.string.homepage_item_card_adjust_method_retry) : getContext().getString(R.string.homepage_item_card_feel_bad_to_consult_doctor);
    }

    public final void setEcgData(@Nullable Long updateTime, @Nullable Integer hrv, @Nullable Integer status) {
        if (updateTime != null && hrv != null && status != null) {
            this.emptyView.setVisibility(8);
            this.curveView.setBackgroundResource(R.drawable.homepage_ecg_bg);
            this.titleBar.setFirstTime(updateTime.longValue());
            this.hrvValueView.setText((hrv.intValue() == 0 && status.intValue() == 0) ? m.replace$default(ContextExtKt.getQuantityString(getContext(), R.plurals.homepage_item_card_average_hrv, hrv.intValue()), "0", "--", false, 4, (Object) null) : ContextExtKt.getQuantityString(getContext(), R.plurals.homepage_item_card_average_hrv, hrv.intValue()));
            this.stateView.setText(c(status.intValue()));
            this.stateTipView.setText(d(status.intValue()));
            View view = this.ecgIconView;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
            return;
        }
        this.emptyView.setVisibility(0);
        this.curveView.setBackgroundColor(0);
        this.curveView.clearAnimation();
        CardTitleBarView.setFirstTime$default(this.titleBar, 0L, 1, null);
        this.hrvValueView.setText("");
        this.stateView.setText("");
        this.stateTipView.setText("");
        View view2 = this.ecgIconView;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(4);
    }

    @JvmOverloads
    public EcgCardView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (HomeUtils.isChineseLanguage()) {
            HomepageItemCardEcgBinding homepageItemCardEcgBindingInflate = HomepageItemCardEcgBinding.inflate(LayoutInflater.from(context), this, true);
            this.emptyView = homepageItemCardEcgBindingInflate.noHrv;
            this.titleBar = homepageItemCardEcgBindingInflate.ecgBar;
            this.hrvValueView = homepageItemCardEcgBindingInflate.hrv;
            this.curveView = homepageItemCardEcgBindingInflate.ecgAnimation;
            this.stateView = homepageItemCardEcgBindingInflate.ecgState;
            this.stateTipView = homepageItemCardEcgBindingInflate.tip;
            this.ecgIconView = homepageItemCardEcgBindingInflate.ecgIcon;
        } else {
            HomepageItemCardEcgI18nBinding homepageItemCardEcgI18nBindingInflate = HomepageItemCardEcgI18nBinding.inflate(LayoutInflater.from(context), this, true);
            this.emptyView = homepageItemCardEcgI18nBindingInflate.noHrv;
            this.titleBar = homepageItemCardEcgI18nBindingInflate.ecgBar;
            this.hrvValueView = homepageItemCardEcgI18nBindingInflate.hrv;
            this.curveView = homepageItemCardEcgI18nBindingInflate.ecgAnimation;
            this.stateView = homepageItemCardEcgI18nBindingInflate.ecgState;
            this.stateTipView = homepageItemCardEcgI18nBindingInflate.tip;
        }
        post(new Runnable() { // from class: cg1
            @Override // java.lang.Runnable
            public final void run() {
                EcgCardView.b(this.a, context);
            }
        });
        ExteranelKt.setOnClickWithPolicyListener(this, new a(context));
    }
}
