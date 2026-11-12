package com.huami.member_card.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0007\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/member_card/bean/CardBgBean;", "", "Lcom/huami/member_card/bean/MemberCardColorBg;", "component1", "", "component2", "bgColor", "isChecked", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/huami/member_card/bean/MemberCardColorBg;", "getBgColor", "()Lcom/huami/member_card/bean/MemberCardColorBg;", "b", "Z", "()Z", "setChecked", "(Z)V", "<init>", "(Lcom/huami/member_card/bean/MemberCardColorBg;Z)V", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardBgBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final MemberCardColorBg bgColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isChecked;

    public CardBgBean(@NotNull MemberCardColorBg memberCardColorBg, boolean z) {
        this.bgColor = memberCardColorBg;
        this.isChecked = z;
    }

    public static /* synthetic */ CardBgBean copy$default(CardBgBean cardBgBean, MemberCardColorBg memberCardColorBg, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            memberCardColorBg = cardBgBean.bgColor;
        }
        if ((i & 2) != 0) {
            z = cardBgBean.isChecked;
        }
        return cardBgBean.copy(memberCardColorBg, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MemberCardColorBg getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final CardBgBean copy(@NotNull MemberCardColorBg bgColor, boolean isChecked) {
        return new CardBgBean(bgColor, isChecked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardBgBean)) {
            return false;
        }
        CardBgBean cardBgBean = (CardBgBean) other;
        return this.bgColor == cardBgBean.bgColor && this.isChecked == cardBgBean.isChecked;
    }

    @NotNull
    public final MemberCardColorBg getBgColor() {
        return this.bgColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.bgColor.hashCode() * 31;
        boolean z = this.isChecked;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    @NotNull
    public String toString() {
        return "CardBgBean(bgColor=" + this.bgColor + ", isChecked=" + this.isChecked + ")";
    }

    public /* synthetic */ CardBgBean(MemberCardColorBg memberCardColorBg, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(memberCardColorBg, (i & 2) != 0 ? false : z);
    }
}
