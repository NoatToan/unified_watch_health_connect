package com.huami.module.homepage.cards.manager;

import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/huami/module/homepage/cards/manager/GeneralItem;", "Lcom/huami/module/homepage/cards/manager/AdapterItem;", "", "bindData", "Landroid/view/View;", "a", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "rootView", "b", "getExpandableView", "expandableView", "c", "getFoldButton", "foldButton", GoogleApiAvailabilityLight.a, "getRotateView", "rotateView", "Lcom/huami/module/homepage/cards/manager/CardType;", "e", "Lcom/huami/module/homepage/cards/manager/CardType;", "getCardType", "()Lcom/huami/module/homepage/cards/manager/CardType;", Constant.KEY_CARD_TYPE, "type", "cardView", "<init>", "(Lcom/huami/module/homepage/cards/manager/CardType;Landroid/view/View;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class GeneralItem implements AdapterItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View rootView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final View expandableView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final View foldButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final View rotateView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CardType cardType;

    public GeneralItem(@NotNull CardType cardType, @NotNull View view) {
        this.rootView = view;
        this.expandableView = view.findViewById(R.id.detail);
        int i = R.id.fold_button;
        this.foldButton = view.findViewById(i);
        this.rotateView = view.findViewById(i);
        this.cardType = cardType;
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
    @Nullable
    public View getExpandableView() {
        return this.expandableView;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @Nullable
    public View getFoldButton() {
        return this.foldButton;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @NotNull
    public View getRootView() {
        return this.rootView;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @Nullable
    public View getRotateView() {
        return this.rotateView;
    }
}
