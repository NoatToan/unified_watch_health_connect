package com.xiaomi.fitness.nfc.bean.yoyo;

import com.miui.tsmclientsdk.MiTsmConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoResponse;", "", MiTsmConstants.KEY_ORDER_NO, "", "cardInfo", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoBean;", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoBean;)V", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "getCardInfo", "()Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoBean;", "setCardInfo", "(Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoBean;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardInfoResponse {

    @NotNull
    private CardInfoBean cardInfo;

    @NotNull
    private String orderNo;

    public CardInfoResponse(@NotNull String orderNo, @NotNull CardInfoBean cardInfo) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
        this.orderNo = orderNo;
        this.cardInfo = cardInfo;
    }

    public static /* synthetic */ CardInfoResponse copy$default(CardInfoResponse cardInfoResponse, String str, CardInfoBean cardInfoBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardInfoResponse.orderNo;
        }
        if ((i & 2) != 0) {
            cardInfoBean = cardInfoResponse.cardInfo;
        }
        return cardInfoResponse.copy(str, cardInfoBean);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CardInfoBean getCardInfo() {
        return this.cardInfo;
    }

    @NotNull
    public final CardInfoResponse copy(@NotNull String orderNo, @NotNull CardInfoBean cardInfo) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
        return new CardInfoResponse(orderNo, cardInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfoResponse)) {
            return false;
        }
        CardInfoResponse cardInfoResponse = (CardInfoResponse) other;
        return Intrinsics.areEqual(this.orderNo, cardInfoResponse.orderNo) && Intrinsics.areEqual(this.cardInfo, cardInfoResponse.cardInfo);
    }

    @NotNull
    public final CardInfoBean getCardInfo() {
        return this.cardInfo;
    }

    @NotNull
    public final String getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        return (this.orderNo.hashCode() * 31) + this.cardInfo.hashCode();
    }

    public final void setCardInfo(@NotNull CardInfoBean cardInfoBean) {
        Intrinsics.checkNotNullParameter(cardInfoBean, "<set-?>");
        this.cardInfo = cardInfoBean;
    }

    public final void setOrderNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderNo = str;
    }

    @NotNull
    public String toString() {
        return "CardInfoResponse(orderNo=" + this.orderNo + ", cardInfo=" + this.cardInfo + ")";
    }
}
