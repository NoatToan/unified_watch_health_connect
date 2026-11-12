package com.huami.stress.domain.model;

import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/stress/domain/model/CardStressData;", "", "", "component1", "Lcom/huami/stress/domain/model/SingleStress;", "component2", "Lcom/huami/stress/domain/model/AllDayStress;", "component3", "isEmpty", ParamKey.singleStress, "allDayStress", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "Lcom/huami/stress/domain/model/SingleStress;", "getSingleStress", "()Lcom/huami/stress/domain/model/SingleStress;", "c", "Lcom/huami/stress/domain/model/AllDayStress;", "getAllDayStress", "()Lcom/huami/stress/domain/model/AllDayStress;", "<init>", "(ZLcom/huami/stress/domain/model/SingleStress;Lcom/huami/stress/domain/model/AllDayStress;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardStressData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isEmpty;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final SingleStress singleStress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final AllDayStress allDayStress;

    public CardStressData(boolean z, @Nullable SingleStress singleStress, @Nullable AllDayStress allDayStress) {
        this.isEmpty = z;
        this.singleStress = singleStress;
        this.allDayStress = allDayStress;
    }

    public static /* synthetic */ CardStressData copy$default(CardStressData cardStressData, boolean z, SingleStress singleStress, AllDayStress allDayStress, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cardStressData.isEmpty;
        }
        if ((i & 2) != 0) {
            singleStress = cardStressData.singleStress;
        }
        if ((i & 4) != 0) {
            allDayStress = cardStressData.allDayStress;
        }
        return cardStressData.copy(z, singleStress, allDayStress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SingleStress getSingleStress() {
        return this.singleStress;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AllDayStress getAllDayStress() {
        return this.allDayStress;
    }

    @NotNull
    public final CardStressData copy(boolean isEmpty, @Nullable SingleStress singleStress, @Nullable AllDayStress allDayStress) {
        return new CardStressData(isEmpty, singleStress, allDayStress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardStressData)) {
            return false;
        }
        CardStressData cardStressData = (CardStressData) other;
        return this.isEmpty == cardStressData.isEmpty && Intrinsics.areEqual(this.singleStress, cardStressData.singleStress) && Intrinsics.areEqual(this.allDayStress, cardStressData.allDayStress);
    }

    @Nullable
    public final AllDayStress getAllDayStress() {
        return this.allDayStress;
    }

    @Nullable
    public final SingleStress getSingleStress() {
        return this.singleStress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isEmpty;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        SingleStress singleStress = this.singleStress;
        int iHashCode = (i + (singleStress == null ? 0 : singleStress.hashCode())) * 31;
        AllDayStress allDayStress = this.allDayStress;
        return iHashCode + (allDayStress != null ? allDayStress.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    @NotNull
    public String toString() {
        return "CardStressData(isEmpty=" + this.isEmpty + ", singleStress=" + this.singleStress + ", allDayStress=" + this.allDayStress + ')';
    }

    public /* synthetic */ CardStressData(boolean z, SingleStress singleStress, AllDayStress allDayStress, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : singleStress, (i & 4) != 0 ? null : allDayStress);
    }
}
