package com.huami.sleep.sleephome.vo;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/sleep/sleephome/vo/RightSelectShowInfo;", "", "", "component1", "component2", "component3", "showDataSource", "showEdit", "showShare", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getShowDataSource", "()Z", "b", "getShowEdit", "c", "getShowShare", "<init>", "(ZZZ)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RightSelectShowInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean showDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean showEdit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean showShare;

    public RightSelectShowInfo(boolean z, boolean z2, boolean z3) {
        this.showDataSource = z;
        this.showEdit = z2;
        this.showShare = z3;
    }

    public static /* synthetic */ RightSelectShowInfo copy$default(RightSelectShowInfo rightSelectShowInfo, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rightSelectShowInfo.showDataSource;
        }
        if ((i & 2) != 0) {
            z2 = rightSelectShowInfo.showEdit;
        }
        if ((i & 4) != 0) {
            z3 = rightSelectShowInfo.showShare;
        }
        return rightSelectShowInfo.copy(z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowDataSource() {
        return this.showDataSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowEdit() {
        return this.showEdit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowShare() {
        return this.showShare;
    }

    @NotNull
    public final RightSelectShowInfo copy(boolean showDataSource, boolean showEdit, boolean showShare) {
        return new RightSelectShowInfo(showDataSource, showEdit, showShare);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RightSelectShowInfo)) {
            return false;
        }
        RightSelectShowInfo rightSelectShowInfo = (RightSelectShowInfo) other;
        return this.showDataSource == rightSelectShowInfo.showDataSource && this.showEdit == rightSelectShowInfo.showEdit && this.showShare == rightSelectShowInfo.showShare;
    }

    public final boolean getShowDataSource() {
        return this.showDataSource;
    }

    public final boolean getShowEdit() {
        return this.showEdit;
    }

    public final boolean getShowShare() {
        return this.showShare;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z = this.showDataSource;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.showEdit;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.showShare;
        return i2 + (z3 ? 1 : z3);
    }

    @NotNull
    public String toString() {
        return "RightSelectShowInfo(showDataSource=" + this.showDataSource + ", showEdit=" + this.showEdit + ", showShare=" + this.showShare + ")";
    }
}
