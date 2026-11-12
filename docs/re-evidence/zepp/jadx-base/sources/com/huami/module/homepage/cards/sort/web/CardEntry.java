package com.huami.module.homepage.cards.sort.web;

import com.huami.module.homepage.cards.manager.CardType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/module/homepage/cards/sort/web/CardEntry;", "", "Lcom/huami/module/homepage/cards/manager/CardType;", "component1", "", "component2", "type", "show", "copy", "", "toString", "", "hashCode", "other", "equals", "Lcom/huami/module/homepage/cards/manager/CardType;", "getType", "()Lcom/huami/module/homepage/cards/manager/CardType;", "Z", "getShow", "()Z", "<init>", "(Lcom/huami/module/homepage/cards/manager/CardType;Z)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardEntry {
    private final boolean show;

    @NotNull
    private final CardType type;

    public CardEntry(@NotNull CardType cardType, boolean z) {
        this.type = cardType;
        this.show = z;
    }

    public static /* synthetic */ CardEntry copy$default(CardEntry cardEntry, CardType cardType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cardType = cardEntry.type;
        }
        if ((i & 2) != 0) {
            z = cardEntry.show;
        }
        return cardEntry.copy(cardType, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CardType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    public final CardEntry copy(@NotNull CardType type, boolean show) {
        return new CardEntry(type, show);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardEntry)) {
            return false;
        }
        CardEntry cardEntry = (CardEntry) other;
        return this.type == cardEntry.type && this.show == cardEntry.show;
    }

    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    public final CardType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z = this.show;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "CardEntry(type=" + this.type + ", show=" + this.show + ")";
    }
}
