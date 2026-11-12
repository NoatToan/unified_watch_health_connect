package com.xiaomi.fitness.sync.export.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/Pressures;", "", "pressures", "", "Lcom/xiaomi/fitness/sync/export/model/PressureItems;", "<init>", "(Ljava/util/List;)V", "getPressures", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Pressures {

    @NotNull
    private final List<PressureItems> pressures;

    public Pressures(@NotNull List<PressureItems> pressures) {
        Intrinsics.checkNotNullParameter(pressures, "pressures");
        this.pressures = pressures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pressures copy$default(Pressures pressures, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pressures.pressures;
        }
        return pressures.copy(list);
    }

    @NotNull
    public final List<PressureItems> component1() {
        return this.pressures;
    }

    @NotNull
    public final Pressures copy(@NotNull List<PressureItems> pressures) {
        Intrinsics.checkNotNullParameter(pressures, "pressures");
        return new Pressures(pressures);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Pressures) && Intrinsics.areEqual(this.pressures, ((Pressures) other).pressures);
    }

    @NotNull
    public final List<PressureItems> getPressures() {
        return this.pressures;
    }

    public int hashCode() {
        return this.pressures.hashCode();
    }

    @NotNull
    public String toString() {
        return "Pressures(pressures=" + this.pressures + ")";
    }
}
