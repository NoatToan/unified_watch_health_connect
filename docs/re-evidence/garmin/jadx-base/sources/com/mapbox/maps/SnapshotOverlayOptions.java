package com.mapbox.maps;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mapbox/maps/SnapshotOverlayOptions;", "", "showLogo", "", "showAttributes", "(ZZ)V", "getShowAttributes", "()Z", "getShowLogo", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SnapshotOverlayOptions {
    private final boolean showAttributes;
    private final boolean showLogo;

    public /* synthetic */ SnapshotOverlayOptions(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15);
    }

    public static /* synthetic */ SnapshotOverlayOptions copy$default(SnapshotOverlayOptions snapshotOverlayOptions, boolean z14, boolean z15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = snapshotOverlayOptions.showLogo;
        }
        if ((i14 & 2) != 0) {
            z15 = snapshotOverlayOptions.showAttributes;
        }
        return snapshotOverlayOptions.copy(z14, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowLogo() {
        return this.showLogo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowAttributes() {
        return this.showAttributes;
    }

    public final SnapshotOverlayOptions copy(boolean showLogo, boolean showAttributes) {
        return new SnapshotOverlayOptions(showLogo, showAttributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnapshotOverlayOptions)) {
            return false;
        }
        SnapshotOverlayOptions snapshotOverlayOptions = (SnapshotOverlayOptions) other;
        return this.showLogo == snapshotOverlayOptions.showLogo && this.showAttributes == snapshotOverlayOptions.showAttributes;
    }

    public final boolean getShowAttributes() {
        return this.showAttributes;
    }

    public final boolean getShowLogo() {
        return this.showLogo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z14 = this.showLogo;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = r14 * 31;
        boolean z15 = this.showAttributes;
        return i14 + (z15 ? 1 : z15);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("SnapshotOverlayOptions(showLogo=");
        sb3.append(this.showLogo);
        sb3.append(", showAttributes=");
        return am.j.t(sb3, this.showAttributes, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public SnapshotOverlayOptions(boolean z14) {
        this(z14, false, 2, null);
    }

    public SnapshotOverlayOptions(boolean z14, boolean z15) {
        this.showLogo = z14;
        this.showAttributes = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SnapshotOverlayOptions() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
