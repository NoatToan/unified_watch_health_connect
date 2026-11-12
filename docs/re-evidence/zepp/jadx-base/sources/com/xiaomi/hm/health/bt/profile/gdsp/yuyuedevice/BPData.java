package com.xiaomi.hm.health.bt.profile.gdsp.yuyuedevice;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b(\u0010)J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JG\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0010\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/yuyuedevice/BPData;", "", "Ljava/util/Calendar;", "component1", "", "component2", "component3", "component4", "component5", "", "component6", "time", Constants.DATA_KEY_HR, "diastolicBp", "systolicBp", "arterialBp", "isUnitkPa", "copy", "", "toString", "hashCode", "other", "equals", "a", "Ljava/util/Calendar;", "getTime", "()Ljava/util/Calendar;", "b", LogUtil.I, "getHr", "()I", "c", "getDiastolicBp", GoogleApiAvailabilityLight.a, "getSystolicBp", "e", "getArterialBp", "f", "Z", "()Z", "<init>", "(Ljava/util/Calendar;IIIIZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BPData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Calendar time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int hr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int diastolicBp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int systolicBp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int arterialBp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean isUnitkPa;

    public BPData() {
        this(null, 0, 0, 0, 0, false, 63, null);
    }

    public BPData(@Nullable Calendar calendar, int i, int i2, int i3, int i4, boolean z) {
        this.time = calendar;
        this.hr = i;
        this.diastolicBp = i2;
        this.systolicBp = i3;
        this.arterialBp = i4;
        this.isUnitkPa = z;
    }

    public static /* synthetic */ BPData copy$default(BPData bPData, Calendar calendar, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            calendar = bPData.time;
        }
        if ((i5 & 2) != 0) {
            i = bPData.hr;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = bPData.diastolicBp;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = bPData.systolicBp;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = bPData.arterialBp;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            z = bPData.isUnitkPa;
        }
        return bPData.copy(calendar, i6, i7, i8, i9, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Calendar getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHr() {
        return this.hr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDiastolicBp() {
        return this.diastolicBp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSystolicBp() {
        return this.systolicBp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getArterialBp() {
        return this.arterialBp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsUnitkPa() {
        return this.isUnitkPa;
    }

    @NotNull
    public final BPData copy(@Nullable Calendar time, int hr, int diastolicBp, int systolicBp, int arterialBp, boolean isUnitkPa) {
        return new BPData(time, hr, diastolicBp, systolicBp, arterialBp, isUnitkPa);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BPData)) {
            return false;
        }
        BPData bPData = (BPData) other;
        return Intrinsics.areEqual(this.time, bPData.time) && this.hr == bPData.hr && this.diastolicBp == bPData.diastolicBp && this.systolicBp == bPData.systolicBp && this.arterialBp == bPData.arterialBp && this.isUnitkPa == bPData.isUnitkPa;
    }

    public final int getArterialBp() {
        return this.arterialBp;
    }

    public final int getDiastolicBp() {
        return this.diastolicBp;
    }

    public final int getHr() {
        return this.hr;
    }

    public final int getSystolicBp() {
        return this.systolicBp;
    }

    @Nullable
    public final Calendar getTime() {
        return this.time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        Calendar calendar = this.time;
        int iHashCode = (((((((((calendar == null ? 0 : calendar.hashCode()) * 31) + this.hr) * 31) + this.diastolicBp) * 31) + this.systolicBp) * 31) + this.arterialBp) * 31;
        boolean z = this.isUnitkPa;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isUnitkPa() {
        return this.isUnitkPa;
    }

    @NotNull
    public String toString() {
        return "BPData(time=" + this.time + ", hr=" + this.hr + ", diastolicBp=" + this.diastolicBp + ", systolicBp=" + this.systolicBp + ", arterialBp=" + this.arterialBp + ", isUnitkPa=" + this.isUnitkPa + ')';
    }

    public /* synthetic */ BPData(Calendar calendar, int i, int i2, int i3, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : calendar, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4, (i5 & 32) == 0 ? z : false);
    }
}
