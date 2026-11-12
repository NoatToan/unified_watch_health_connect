package com.xiaomi.fitness.nfc.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J/\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "", "aid", "", "cardType", "", "time", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "getCardType", "()I", "setCardType", "(I)V", "getTime", "()Ljava/util/List;", "setTime", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardSwitcherBean {

    @Nullable
    private String aid;
    private int cardType;

    @NotNull
    private List<Integer> time;

    public CardSwitcherBean(@Nullable String str, int i, @NotNull List<Integer> time) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.aid = str;
        this.cardType = i;
        this.time = time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardSwitcherBean copy$default(CardSwitcherBean cardSwitcherBean, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cardSwitcherBean.aid;
        }
        if ((i2 & 2) != 0) {
            i = cardSwitcherBean.cardType;
        }
        if ((i2 & 4) != 0) {
            list = cardSwitcherBean.time;
        }
        return cardSwitcherBean.copy(str, i, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.time;
    }

    @NotNull
    public final CardSwitcherBean copy(@Nullable String aid, int cardType, @NotNull List<Integer> time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return new CardSwitcherBean(aid, cardType, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardSwitcherBean)) {
            return false;
        }
        CardSwitcherBean cardSwitcherBean = (CardSwitcherBean) other;
        return Intrinsics.areEqual(this.aid, cardSwitcherBean.aid) && this.cardType == cardSwitcherBean.cardType && Intrinsics.areEqual(this.time, cardSwitcherBean.time);
    }

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    public final List<Integer> getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.aid;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.cardType)) * 31) + this.time.hashCode();
    }

    public final void setAid(@Nullable String str) {
        this.aid = str;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setTime(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.time = list;
    }

    @NotNull
    public String toString() {
        return "CardSwitcherBean(aid=" + this.aid + ", cardType=" + this.cardType + ", time=" + this.time + ")";
    }

    public /* synthetic */ CardSwitcherBean(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? -1 : i, list);
    }
}
