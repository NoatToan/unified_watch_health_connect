package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingAidPositionParam;", "", "", "toString", "", "component1", "component2", "earAidPosition", "warehousePosition", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getEarAidPosition", "()I", "b", "getWarehousePosition", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HearingAidPositionParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int earAidPosition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int warehousePosition;

    public HearingAidPositionParam(int i, int i2) {
        this.earAidPosition = i;
        this.warehousePosition = i2;
    }

    public static /* synthetic */ HearingAidPositionParam copy$default(HearingAidPositionParam hearingAidPositionParam, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hearingAidPositionParam.earAidPosition;
        }
        if ((i3 & 2) != 0) {
            i2 = hearingAidPositionParam.warehousePosition;
        }
        return hearingAidPositionParam.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEarAidPosition() {
        return this.earAidPosition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWarehousePosition() {
        return this.warehousePosition;
    }

    @NotNull
    public final HearingAidPositionParam copy(int earAidPosition, int warehousePosition) {
        return new HearingAidPositionParam(earAidPosition, warehousePosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingAidPositionParam)) {
            return false;
        }
        HearingAidPositionParam hearingAidPositionParam = (HearingAidPositionParam) other;
        return this.earAidPosition == hearingAidPositionParam.earAidPosition && this.warehousePosition == hearingAidPositionParam.warehousePosition;
    }

    public final int getEarAidPosition() {
        return this.earAidPosition;
    }

    public final int getWarehousePosition() {
        return this.warehousePosition;
    }

    public int hashCode() {
        return (this.earAidPosition * 31) + this.warehousePosition;
    }

    @NotNull
    public String toString() {
        return "HearingAidPositionParam{earAidPosition=" + this.earAidPosition + ", warehousePosition=" + this.warehousePosition + ", }";
    }

    public /* synthetic */ HearingAidPositionParam(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? -1 : i2);
    }
}
