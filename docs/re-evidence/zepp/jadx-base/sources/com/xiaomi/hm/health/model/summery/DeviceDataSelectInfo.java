package com.xiaomi.hm.health.model.summery;

import com.alipay.sdk.m.u.i;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.dataprocess.SportDay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000f\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001d\u001a\u0004\b\u0011\u0010\u001f\"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/model/summery/DeviceDataSelectInfo;", "", "other", "", "compareTo", "", "", "equals", "", "toString", "component1", "component2", "component3", "component4", "day", "source", "hasSleep", "isSelect", "copy", "hashCode", "a", "Ljava/lang/String;", "getDay", "()Ljava/lang/String;", "b", LogUtil.I, "getSource", "()I", "c", "Z", "getHasSleep", "()Z", GoogleApiAvailabilityLight.a, "setSelect", "(Z)V", "<init>", "(Ljava/lang/String;IZZ)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceDataSelectInfo implements Comparable<DeviceDataSelectInfo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String day;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean hasSleep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isSelect;

    public DeviceDataSelectInfo(@NotNull String str, int i, boolean z, boolean z2) {
        this.day = str;
        this.source = i;
        this.hasSleep = z;
        this.isSelect = z2;
    }

    public static /* synthetic */ DeviceDataSelectInfo copy$default(DeviceDataSelectInfo deviceDataSelectInfo, String str, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deviceDataSelectInfo.day;
        }
        if ((i2 & 2) != 0) {
            i = deviceDataSelectInfo.source;
        }
        if ((i2 & 4) != 0) {
            z = deviceDataSelectInfo.hasSleep;
        }
        if ((i2 & 8) != 0) {
            z2 = deviceDataSelectInfo.isSelect;
        }
        return deviceDataSelectInfo.copy(str, i, z, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasSleep() {
        return this.hasSleep;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final DeviceDataSelectInfo copy(@NotNull String day, int source, boolean hasSleep, boolean isSelect) {
        return new DeviceDataSelectInfo(day, source, hasSleep, isSelect);
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof DeviceDataSelectInfo ? Intrinsics.areEqual(((DeviceDataSelectInfo) other).day, this.day) : super.equals(other);
    }

    @NotNull
    public final String getDay() {
        return this.day;
    }

    public final boolean getHasSleep() {
        return this.hasSleep;
    }

    public final int getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.day.hashCode() * 31) + this.source) * 31;
        boolean z = this.hasSleep;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isSelect;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    @NotNull
    public String toString() {
        return "{day:" + this.day + ", source:" + this.source + ", hasSleep:" + this.hasSleep + ", isSelect:" + this.isSelect + i.d;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DeviceDataSelectInfo other) {
        return SportDay.fromString(this.day).after(SportDay.fromString(other.day)) ? -1 : 1;
    }
}
