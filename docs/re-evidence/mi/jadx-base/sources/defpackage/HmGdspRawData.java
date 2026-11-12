package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tg, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Ltg;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "rawData", "[B", PluginDeviceInfo.FMODEL, "()[B", "dataType", "Ljava/util/Calendar;", StepsInfo.KEY_CALORIES, "headerExpansionData", "<init>", "(ILjava/util/Calendar;[B[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class HmGdspRawData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int dataType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final Calendar cal;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final byte[] rawData;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final byte[] headerExpansionData;

    public HmGdspRawData(int i, @NotNull Calendar cal, @NotNull byte[] rawData, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(cal, "cal");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        this.dataType = i;
        this.cal = cal;
        this.rawData = rawData;
        this.headerExpansionData = bArr;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getRawData() {
        return this.rawData;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmGdspRawData)) {
            return false;
        }
        HmGdspRawData hmGdspRawData = (HmGdspRawData) other;
        return this.dataType == hmGdspRawData.dataType && Intrinsics.areEqual(this.cal, hmGdspRawData.cal) && Intrinsics.areEqual(this.rawData, hmGdspRawData.rawData) && Intrinsics.areEqual(this.headerExpansionData, hmGdspRawData.headerExpansionData);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.dataType) * 31) + this.cal.hashCode()) * 31) + Arrays.hashCode(this.rawData)) * 31;
        byte[] bArr = this.headerExpansionData;
        return iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @NotNull
    public String toString() {
        return "HmGdspRawData(dataType=" + this.dataType + ", cal=" + this.cal + ", rawData=" + Arrays.toString(this.rawData) + ", headerExpansionData=" + Arrays.toString(this.headerExpansionData) + ')';
    }
}
