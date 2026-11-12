package com.xiaomi.hm.health.bt.profile.usernew;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/usernew/BloodPressure;", "", "", "toString", "", "component1", "component2", "diastolic", "systolic", "copy", "", "hashCode", "other", "", "equals", "a", ExifInterface.LATITUDE_SOUTH, "getDiastolic", "()S", "b", "getSystolic", "<init>", "(SS)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressure {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final short diastolic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final short systolic;

    public BloodPressure(short s, short s2) {
        this.diastolic = s;
        this.systolic = s2;
    }

    public static /* synthetic */ BloodPressure copy$default(BloodPressure bloodPressure, short s, short s2, int i, Object obj) {
        if ((i & 1) != 0) {
            s = bloodPressure.diastolic;
        }
        if ((i & 2) != 0) {
            s2 = bloodPressure.systolic;
        }
        return bloodPressure.copy(s, s2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getDiastolic() {
        return this.diastolic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getSystolic() {
        return this.systolic;
    }

    @NotNull
    public final BloodPressure copy(short diastolic, short systolic) {
        return new BloodPressure(diastolic, systolic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressure)) {
            return false;
        }
        BloodPressure bloodPressure = (BloodPressure) other;
        return this.diastolic == bloodPressure.diastolic && this.systolic == bloodPressure.systolic;
    }

    public final short getDiastolic() {
        return this.diastolic;
    }

    public final short getSystolic() {
        return this.systolic;
    }

    public int hashCode() {
        return (this.diastolic * 31) + this.systolic;
    }

    @NotNull
    public String toString() {
        return "BloodPressure[舒张压：" + ((int) this.diastolic) + ", 收缩压：" + ((int) this.systolic) + JsonLexerKt.END_LIST;
    }
}
