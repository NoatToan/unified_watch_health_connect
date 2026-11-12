package com.xiaomi.hm.health.bt.model;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003JY\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001d¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/bt/model/CincoEntrance;", "", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "showXiaoai", "xiaoaiAvailable", "showNfc", "nfcAvailable", "showBank", "bankAvailable", "showBusDoor", "busDoorAvailable", "copy", "", "hashCode", "other", "equals", "a", "Z", "getShowXiaoai", "()Z", "b", "getXiaoaiAvailable", "c", "getShowNfc", GoogleApiAvailabilityLight.a, "getNfcAvailable", "e", "getShowBank", "f", "getBankAvailable", "g", "getShowBusDoor", "h", "getBusDoorAvailable", "<init>", "(ZZZZZZZZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CincoEntrance {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean showXiaoai;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean xiaoaiAvailable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean showNfc;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean nfcAvailable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean showBank;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean bankAvailable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean showBusDoor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final boolean busDoorAvailable;

    public CincoEntrance(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.showXiaoai = z;
        this.xiaoaiAvailable = z2;
        this.showNfc = z3;
        this.nfcAvailable = z4;
        this.showBank = z5;
        this.bankAvailable = z6;
        this.showBusDoor = z7;
        this.busDoorAvailable = z8;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowXiaoai() {
        return this.showXiaoai;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getXiaoaiAvailable() {
        return this.xiaoaiAvailable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowNfc() {
        return this.showNfc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNfcAvailable() {
        return this.nfcAvailable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowBank() {
        return this.showBank;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getBankAvailable() {
        return this.bankAvailable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowBusDoor() {
        return this.showBusDoor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getBusDoorAvailable() {
        return this.busDoorAvailable;
    }

    @NotNull
    public final CincoEntrance copy(boolean showXiaoai, boolean xiaoaiAvailable, boolean showNfc, boolean nfcAvailable, boolean showBank, boolean bankAvailable, boolean showBusDoor, boolean busDoorAvailable) {
        return new CincoEntrance(showXiaoai, xiaoaiAvailable, showNfc, nfcAvailable, showBank, bankAvailable, showBusDoor, busDoorAvailable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CincoEntrance)) {
            return false;
        }
        CincoEntrance cincoEntrance = (CincoEntrance) other;
        return this.showXiaoai == cincoEntrance.showXiaoai && this.xiaoaiAvailable == cincoEntrance.xiaoaiAvailable && this.showNfc == cincoEntrance.showNfc && this.nfcAvailable == cincoEntrance.nfcAvailable && this.showBank == cincoEntrance.showBank && this.bankAvailable == cincoEntrance.bankAvailable && this.showBusDoor == cincoEntrance.showBusDoor && this.busDoorAvailable == cincoEntrance.busDoorAvailable;
    }

    public final boolean getBankAvailable() {
        return this.bankAvailable;
    }

    public final boolean getBusDoorAvailable() {
        return this.busDoorAvailable;
    }

    public final boolean getNfcAvailable() {
        return this.nfcAvailable;
    }

    public final boolean getShowBank() {
        return this.showBank;
    }

    public final boolean getShowBusDoor() {
        return this.showBusDoor;
    }

    public final boolean getShowNfc() {
        return this.showNfc;
    }

    public final boolean getShowXiaoai() {
        return this.showXiaoai;
    }

    public final boolean getXiaoaiAvailable() {
        return this.xiaoaiAvailable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z = this.showXiaoai;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.xiaoaiAvailable;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.showNfc;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.nfcAvailable;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.showBank;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i5 = (i4 + r5) * 31;
        boolean z6 = this.bankAvailable;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i6 = (i5 + r6) * 31;
        boolean z7 = this.showBusDoor;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int i7 = (i6 + r7) * 31;
        boolean z8 = this.busDoorAvailable;
        return i7 + (z8 ? 1 : z8);
    }

    @NotNull
    public String toString() {
        return "showXiaoai=" + this.showXiaoai + ", xiaoaiAvailable=" + this.xiaoaiAvailable + ", showNfc=" + this.showNfc + ", nfcAvailable=" + this.nfcAvailable + ", showBank=" + this.showBank + ", bankAvailable=" + this.bankAvailable + ", showBusDoor=" + this.showBusDoor + ", busDoorAvailable=" + this.busDoorAvailable;
    }
}
