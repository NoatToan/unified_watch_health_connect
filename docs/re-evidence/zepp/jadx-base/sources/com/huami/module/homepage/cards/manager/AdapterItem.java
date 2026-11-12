package com.huami.module.homepage.cards.manager;

import android.view.View;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&R\u0016\u0010\u0007\u001a\u00020\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0016\u0010\u0011\u001a\u00020\u000e8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/huami/module/homepage/cards/manager/AdapterItem;", "", "", "bindData", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "rootView", "getExpandableView", "expandableView", "getFoldButton", "foldButton", "getRotateView", "rotateView", "Lcom/huami/module/homepage/cards/manager/CardType;", "getCardType", "()Lcom/huami/module/homepage/cards/manager/CardType;", Constant.KEY_CARD_TYPE, "homePage_release"}, k = 1, mv = {1, 5, 1})
public interface AdapterItem {
    void bindData();

    @NotNull
    CardType getCardType();

    @Nullable
    View getExpandableView();

    @Nullable
    View getFoldButton();

    @NotNull
    View getRootView();

    @Nullable
    View getRotateView();
}
