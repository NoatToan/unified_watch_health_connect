package com.xiaomi.wearable.yrn.components.amap;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/MarkerExtraProps;", "", "joined", "", "<init>", "(Z)V", "getJoined", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MarkerExtraProps {
    private final boolean joined;

    public MarkerExtraProps(boolean z) {
        this.joined = z;
    }

    public static /* synthetic */ MarkerExtraProps copy$default(MarkerExtraProps markerExtraProps, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = markerExtraProps.joined;
        }
        return markerExtraProps.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getJoined() {
        return this.joined;
    }

    @NotNull
    public final MarkerExtraProps copy(boolean joined) {
        return new MarkerExtraProps(joined);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarkerExtraProps) && this.joined == ((MarkerExtraProps) other).joined;
    }

    public final boolean getJoined() {
        return this.joined;
    }

    public int hashCode() {
        return Boolean.hashCode(this.joined);
    }

    @NotNull
    public String toString() {
        return "MarkerExtraProps(joined=" + this.joined + ")";
    }
}
