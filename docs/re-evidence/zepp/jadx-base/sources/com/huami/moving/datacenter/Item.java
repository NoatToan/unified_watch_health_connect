package com.huami.moving.datacenter;

import com.google.android.gms.fitness.data.WorkoutExercises;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.huami.moving.datacenter.SportDataRenderImpl$TennisSwingCalculator$calc$Item, reason: from toString */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"com/huami/moving/datacenter/SportDataRenderImpl$TennisSwingCalculator$calc$Item", "", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "component1", "Lcom/huami/moving/datacenter/SportDataRenderImpl$b;", "component2", WorkoutExercises.SWING, "data", "copy", "(Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;Lcom/huami/moving/datacenter/SportDataRenderImpl$b;)Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwingCalculator$calc$Item;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "getSwing", "()Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "b", "Lcom/huami/moving/datacenter/SportDataRenderImpl$b;", "getData", "()Lcom/huami/moving/datacenter/SportDataRenderImpl$b;", "<init>", "(Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;Lcom/huami/moving/datacenter/SportDataRenderImpl$b;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Item {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SportDataRenderImpl.TennisSwing swing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final SportDataRenderImpl.TennisSwingData data;

    public Item(@NotNull SportDataRenderImpl.TennisSwing tennisSwing, @NotNull SportDataRenderImpl.TennisSwingData bVar) {
        this.swing = tennisSwing;
        this.data = bVar;
    }

    public static /* synthetic */ Item copy$default(Item item, SportDataRenderImpl.TennisSwing tennisSwing, SportDataRenderImpl.TennisSwingData bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tennisSwing = item.swing;
        }
        if ((i & 2) != 0) {
            bVar = item.data;
        }
        return item.copy(tennisSwing, bVar);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SportDataRenderImpl.TennisSwing getSwing() {
        return this.swing;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SportDataRenderImpl.TennisSwingData getData() {
        return this.data;
    }

    @NotNull
    public final Item copy(@NotNull SportDataRenderImpl.TennisSwing swing, @NotNull SportDataRenderImpl.TennisSwingData data) {
        return new Item(swing, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return Intrinsics.areEqual(this.swing, item.swing) && Intrinsics.areEqual(this.data, item.data);
    }

    @NotNull
    public final SportDataRenderImpl.TennisSwingData getData() {
        return this.data;
    }

    @NotNull
    public final SportDataRenderImpl.TennisSwing getSwing() {
        return this.swing;
    }

    public int hashCode() {
        return (this.swing.hashCode() * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "Item(swing=" + this.swing + ", data=" + this.data + ")";
    }
}
