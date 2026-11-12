package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001d¨\u0006("}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingAidBattery;", "", "", "toString", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "warehouse", "warehouseCharging", "left", "leftCharging", "right", "rightCharging", "copy", "hashCode", "other", "equals", "a", LogUtil.I, "getWarehouse", "()I", "b", "Z", "getWarehouseCharging", "()Z", "c", "getLeft", GoogleApiAvailabilityLight.a, "getLeftCharging", "e", "getRight", "f", "getRightCharging", "<init>", "(IZIZIZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HearingAidBattery {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int warehouse;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean warehouseCharging;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int left;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean leftCharging;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int right;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean rightCharging;

    public HearingAidBattery(int i, boolean z, int i2, boolean z2, int i3, boolean z3) {
        this.warehouse = i;
        this.warehouseCharging = z;
        this.left = i2;
        this.leftCharging = z2;
        this.right = i3;
        this.rightCharging = z3;
    }

    public static /* synthetic */ HearingAidBattery copy$default(HearingAidBattery hearingAidBattery, int i, boolean z, int i2, boolean z2, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = hearingAidBattery.warehouse;
        }
        if ((i4 & 2) != 0) {
            z = hearingAidBattery.warehouseCharging;
        }
        boolean z4 = z;
        if ((i4 & 4) != 0) {
            i2 = hearingAidBattery.left;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            z2 = hearingAidBattery.leftCharging;
        }
        boolean z5 = z2;
        if ((i4 & 16) != 0) {
            i3 = hearingAidBattery.right;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            z3 = hearingAidBattery.rightCharging;
        }
        return hearingAidBattery.copy(i, z4, i5, z5, i6, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWarehouse() {
        return this.warehouse;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getWarehouseCharging() {
        return this.warehouseCharging;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getLeftCharging() {
        return this.leftCharging;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRightCharging() {
        return this.rightCharging;
    }

    @NotNull
    public final HearingAidBattery copy(int warehouse, boolean warehouseCharging, int left, boolean leftCharging, int right, boolean rightCharging) {
        return new HearingAidBattery(warehouse, warehouseCharging, left, leftCharging, right, rightCharging);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingAidBattery)) {
            return false;
        }
        HearingAidBattery hearingAidBattery = (HearingAidBattery) other;
        return this.warehouse == hearingAidBattery.warehouse && this.warehouseCharging == hearingAidBattery.warehouseCharging && this.left == hearingAidBattery.left && this.leftCharging == hearingAidBattery.leftCharging && this.right == hearingAidBattery.right && this.rightCharging == hearingAidBattery.rightCharging;
    }

    public final int getLeft() {
        return this.left;
    }

    public final boolean getLeftCharging() {
        return this.leftCharging;
    }

    public final int getRight() {
        return this.right;
    }

    public final boolean getRightCharging() {
        return this.rightCharging;
    }

    public final int getWarehouse() {
        return this.warehouse;
    }

    public final boolean getWarehouseCharging() {
        return this.warehouseCharging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = this.warehouse * 31;
        boolean z = this.warehouseCharging;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (((i + r1) * 31) + this.left) * 31;
        boolean z2 = this.leftCharging;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i3 = (((i2 + r2) * 31) + this.right) * 31;
        boolean z3 = this.rightCharging;
        return i3 + (z3 ? 1 : z3);
    }

    @NotNull
    public String toString() {
        return "HearingAidBattery{warehouse=" + this.warehouse + ", warehouseCharging=" + this.warehouseCharging + ", left=" + this.left + ", leftCharging=" + this.leftCharging + ", right=" + this.right + ", rightCharging=" + this.rightCharging + ", }";
    }
}
