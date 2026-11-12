package com.xiaomi.fitness.nfc.entity;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/nfc/entity/MasterRegions;", "", "regions", "", "", "<init>", "(Ljava/util/Map;)V", "getRegions", "()Ljava/util/Map;", "setRegions", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MasterRegions {

    @NotNull
    private Map<String, String> regions;

    /* JADX WARN: Multi-variable type inference failed */
    public MasterRegions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MasterRegions copy$default(MasterRegions masterRegions, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = masterRegions.regions;
        }
        return masterRegions.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.regions;
    }

    @NotNull
    public final MasterRegions copy(@NotNull Map<String, String> regions) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        return new MasterRegions(regions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MasterRegions) && Intrinsics.areEqual(this.regions, ((MasterRegions) other).regions);
    }

    @NotNull
    public final Map<String, String> getRegions() {
        return this.regions;
    }

    public int hashCode() {
        return this.regions.hashCode();
    }

    public final void setRegions(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.regions = map;
    }

    @NotNull
    public String toString() {
        return "MasterRegions(regions=" + this.regions + ")";
    }

    public MasterRegions(@NotNull Map<String, String> regions) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        this.regions = regions;
    }

    public /* synthetic */ MasterRegions(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HashMap() : map);
    }
}
