package com.huami.module.homepage.cards.sort.web;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/huami/module/homepage/cards/sort/web/CardExpandEntry;", "", "", "component1", "", "component2", "type", "expand", "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Z", "getExpand", "()Z", "<init>", "(Ljava/lang/String;Z)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardExpandEntry {
    private final boolean expand;

    @NotNull
    private final String type;

    public CardExpandEntry(@NotNull String str, boolean z) {
        this.type = str;
        this.expand = z;
    }

    public static /* synthetic */ CardExpandEntry copy$default(CardExpandEntry cardExpandEntry, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardExpandEntry.type;
        }
        if ((i & 2) != 0) {
            z = cardExpandEntry.expand;
        }
        return cardExpandEntry.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getExpand() {
        return this.expand;
    }

    @NotNull
    public final CardExpandEntry copy(@NotNull String type, boolean expand) {
        return new CardExpandEntry(type, expand);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardExpandEntry)) {
            return false;
        }
        CardExpandEntry cardExpandEntry = (CardExpandEntry) other;
        return Intrinsics.areEqual(this.type, cardExpandEntry.type) && this.expand == cardExpandEntry.expand;
    }

    public final boolean getExpand() {
        return this.expand;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z = this.expand;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "CardExpandEntry(type=" + this.type + ", expand=" + this.expand + ")";
    }
}
