package com.huami.module.homepage.cards.manager;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.healthlabel.service.HealthLabelCardView;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.tools.analytics.DbUtils;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u001b\u001a\u00020\u00168\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/huami/module/homepage/cards/manager/HealthLabelItem;", "Lcom/huami/module/homepage/cards/manager/AdapterItem;", "", "bindData", "Lcom/huami/lib/healthlabel/service/HealthLabelCardView;", "a", "Lcom/huami/lib/healthlabel/service/HealthLabelCardView;", "getRootView", "()Lcom/huami/lib/healthlabel/service/HealthLabelCardView;", "rootView", "Landroid/view/View;", "b", "Landroid/view/View;", "getExpandableView", "()Landroid/view/View;", "expandableView", "c", "getFoldButton", "foldButton", GoogleApiAvailabilityLight.a, "getRotateView", "rotateView", "Lcom/huami/module/homepage/cards/manager/CardType;", "e", "Lcom/huami/module/homepage/cards/manager/CardType;", "getCardType", "()Lcom/huami/module/homepage/cards/manager/CardType;", Constant.KEY_CARD_TYPE, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "labelView", "<init>", "(Landroid/content/Context;Lcom/huami/lib/healthlabel/service/HealthLabelCardView;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelItem implements AdapterItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthLabelCardView rootView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final View expandableView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final View foldButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final View rotateView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CardType cardType = CardType.HEALTH_LABEL;

    public HealthLabelItem(@NotNull final Context context, @NotNull final HealthLabelCardView healthLabelCardView) {
        this.rootView = healthLabelCardView;
        this.expandableView = healthLabelCardView.targetView();
        this.foldButton = new View(context) { // from class: com.huami.module.homepage.cards.manager.HealthLabelItem$foldButton$1
            public final /* synthetic */ Context b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ View.OnClickListener a;
                public final /* synthetic */ HealthLabelItem$foldButton$1 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(View.OnClickListener onClickListener, HealthLabelItem$foldButton$1 healthLabelItem$foldButton$1) {
                    super(0);
                    this.a = onClickListener;
                    this.b = healthLabelItem$foldButton$1;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_TAGS_C, new Pair[0]);
                    View.OnClickListener onClickListener = this.a;
                    if (onClickListener == null) {
                        return;
                    }
                    onClickListener.onClick(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                this.b = context;
            }

            @Override // android.view.View
            public void setOnClickListener(@Nullable View.OnClickListener l) {
                this.a.expandListener(new a(l, this));
            }
        };
        this.rotateView = healthLabelCardView.arrowView();
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    public void bindData() {
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @NotNull
    public CardType getCardType() {
        return this.cardType;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @NotNull
    public View getExpandableView() {
        return this.expandableView;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @NotNull
    public View getFoldButton() {
        return this.foldButton;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @NotNull
    public View getRotateView() {
        return this.rotateView;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @NotNull
    public HealthLabelCardView getRootView() {
        return this.rootView;
    }
}
