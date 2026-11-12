package com.xiaomi.fitness.nfc.bean.yoyo;

import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0014HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoBean;", "", "faceNo", "", TSMAuthContants.PARAM_LOGICAL_NO, CardInfo.KEY_TRANSFER_CARD_STATUS, "cardLayout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFaceNo", "()Ljava/lang/String;", "setFaceNo", "(Ljava/lang/String;)V", "getLogicalNo", "setLogicalNo", "getCardStatus", "setCardStatus", "getCardLayout", "setCardLayout", "balance", "", "getBalance", "()I", "setBalance", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardInfoBean {
    private int balance;

    @NotNull
    private String cardLayout;

    @NotNull
    private String cardStatus;

    @NotNull
    private String faceNo;

    @NotNull
    private String logicalNo;

    public CardInfoBean(@NotNull String faceNo, @NotNull String logicalNo, @NotNull String cardStatus, @NotNull String cardLayout) {
        Intrinsics.checkNotNullParameter(faceNo, "faceNo");
        Intrinsics.checkNotNullParameter(logicalNo, "logicalNo");
        Intrinsics.checkNotNullParameter(cardStatus, "cardStatus");
        Intrinsics.checkNotNullParameter(cardLayout, "cardLayout");
        this.faceNo = faceNo;
        this.logicalNo = logicalNo;
        this.cardStatus = cardStatus;
        this.cardLayout = cardLayout;
    }

    public static /* synthetic */ CardInfoBean copy$default(CardInfoBean cardInfoBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardInfoBean.faceNo;
        }
        if ((i & 2) != 0) {
            str2 = cardInfoBean.logicalNo;
        }
        if ((i & 4) != 0) {
            str3 = cardInfoBean.cardStatus;
        }
        if ((i & 8) != 0) {
            str4 = cardInfoBean.cardLayout;
        }
        return cardInfoBean.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFaceNo() {
        return this.faceNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogicalNo() {
        return this.logicalNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardStatus() {
        return this.cardStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardLayout() {
        return this.cardLayout;
    }

    @NotNull
    public final CardInfoBean copy(@NotNull String faceNo, @NotNull String logicalNo, @NotNull String cardStatus, @NotNull String cardLayout) {
        Intrinsics.checkNotNullParameter(faceNo, "faceNo");
        Intrinsics.checkNotNullParameter(logicalNo, "logicalNo");
        Intrinsics.checkNotNullParameter(cardStatus, "cardStatus");
        Intrinsics.checkNotNullParameter(cardLayout, "cardLayout");
        return new CardInfoBean(faceNo, logicalNo, cardStatus, cardLayout);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfoBean)) {
            return false;
        }
        CardInfoBean cardInfoBean = (CardInfoBean) other;
        return Intrinsics.areEqual(this.faceNo, cardInfoBean.faceNo) && Intrinsics.areEqual(this.logicalNo, cardInfoBean.logicalNo) && Intrinsics.areEqual(this.cardStatus, cardInfoBean.cardStatus) && Intrinsics.areEqual(this.cardLayout, cardInfoBean.cardLayout);
    }

    public final int getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getCardLayout() {
        return this.cardLayout;
    }

    @NotNull
    public final String getCardStatus() {
        return this.cardStatus;
    }

    @NotNull
    public final String getFaceNo() {
        return this.faceNo;
    }

    @NotNull
    public final String getLogicalNo() {
        return this.logicalNo;
    }

    public int hashCode() {
        return (((((this.faceNo.hashCode() * 31) + this.logicalNo.hashCode()) * 31) + this.cardStatus.hashCode()) * 31) + this.cardLayout.hashCode();
    }

    public final void setBalance(int i) {
        this.balance = i;
    }

    public final void setCardLayout(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardLayout = str;
    }

    public final void setCardStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardStatus = str;
    }

    public final void setFaceNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.faceNo = str;
    }

    public final void setLogicalNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logicalNo = str;
    }

    @NotNull
    public String toString() {
        return "CardInfoBean(faceNo=" + this.faceNo + ", logicalNo=" + this.logicalNo + ", cardStatus=" + this.cardStatus + ", cardLayout=" + this.cardLayout + ")";
    }
}
