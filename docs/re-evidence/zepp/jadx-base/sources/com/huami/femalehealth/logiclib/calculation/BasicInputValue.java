package com.huami.femalehealth.logiclib.calculation;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016B/\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b3\u00104B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b3\u00105J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\rHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0013\u00102\u001a\u00020/8F@\u0006¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", DataCacher.j, "", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "", "component4", "lastMenstruationTimeMill", "menstruationDurationDay", "menstruationCycleDay", "enablePredict", "copy", "", "toString", "hashCode", "", "other", "equals", "a", "J", "getLastMenstruationTimeMill", "()J", "setLastMenstruationTimeMill", "(J)V", "b", LogUtil.I, "getMenstruationDurationDay", "()I", "setMenstruationDurationDay", "(I)V", "c", "getMenstruationCycleDay", "setMenstruationCycleDay", GoogleApiAvailabilityLight.a, "Z", "getEnablePredict", "()Z", "setEnablePredict", "(Z)V", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "getLastMenstruationTime", "()Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "lastMenstruationTime", "<init>", "(JIIZ)V", "(Landroid/os/Parcel;)V", "CREATOR", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BasicInputValue implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final BasicInputValue e = new BasicInputValue(0, 0, 0, false, 15, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long lastMenstruationTimeMill;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int menstruationDurationDay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int menstruationCycleDay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean enablePredict;

    /* JADX INFO: renamed from: com.huami.femalehealth.logiclib.calculation.BasicInputValue$CREATOR, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;", MessengerShareContentUtility.PREVIEW_DEFAULT, "Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;", "getDEFAULT$logiclib_release", "()Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements Parcelable.Creator<BasicInputValue> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BasicInputValue getDEFAULT$logiclib_release() {
            return BasicInputValue.e;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BasicInputValue createFromParcel(@NotNull Parcel parcel) {
            return new BasicInputValue(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BasicInputValue[] newArray(int size) {
            return new BasicInputValue[size];
        }
    }

    public BasicInputValue() {
        this(0L, 0, 0, false, 15, null);
    }

    public BasicInputValue(long j, int i, int i2, boolean z) {
        this.lastMenstruationTimeMill = j;
        this.menstruationDurationDay = i;
        this.menstruationCycleDay = i2;
        this.enablePredict = z;
    }

    public static /* synthetic */ BasicInputValue copy$default(BasicInputValue basicInputValue, long j, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = basicInputValue.lastMenstruationTimeMill;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = basicInputValue.menstruationDurationDay;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = basicInputValue.menstruationCycleDay;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            z = basicInputValue.enablePredict;
        }
        return basicInputValue.copy(j2, i4, i5, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLastMenstruationTimeMill() {
        return this.lastMenstruationTimeMill;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMenstruationDurationDay() {
        return this.menstruationDurationDay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMenstruationCycleDay() {
        return this.menstruationCycleDay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnablePredict() {
        return this.enablePredict;
    }

    @NotNull
    public final BasicInputValue copy(long lastMenstruationTimeMill, int menstruationDurationDay, int menstruationCycleDay, boolean enablePredict) {
        return new BasicInputValue(lastMenstruationTimeMill, menstruationDurationDay, menstruationCycleDay, enablePredict);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicInputValue)) {
            return false;
        }
        BasicInputValue basicInputValue = (BasicInputValue) other;
        return this.lastMenstruationTimeMill == basicInputValue.lastMenstruationTimeMill && this.menstruationDurationDay == basicInputValue.menstruationDurationDay && this.menstruationCycleDay == basicInputValue.menstruationCycleDay && this.enablePredict == basicInputValue.enablePredict;
    }

    public final boolean getEnablePredict() {
        return this.enablePredict;
    }

    @NotNull
    public final DateTriple getLastMenstruationTime() {
        return DateHelper.INSTANCE.nowDate(this.lastMenstruationTimeMill);
    }

    public final long getLastMenstruationTimeMill() {
        return this.lastMenstruationTimeMill;
    }

    public final int getMenstruationCycleDay() {
        return this.menstruationCycleDay;
    }

    public final int getMenstruationDurationDay() {
        return this.menstruationDurationDay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iA = ((((b.a(this.lastMenstruationTimeMill) * 31) + this.menstruationDurationDay) * 31) + this.menstruationCycleDay) * 31;
        boolean z = this.enablePredict;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final void setEnablePredict(boolean z) {
        this.enablePredict = z;
    }

    public final void setLastMenstruationTimeMill(long j) {
        this.lastMenstruationTimeMill = j;
    }

    public final void setMenstruationCycleDay(int i) {
        this.menstruationCycleDay = i;
    }

    public final void setMenstruationDurationDay(int i) {
        this.menstruationDurationDay = i;
    }

    @NotNull
    public String toString() {
        return "BasicInputValue(lastMenstruationTimeMill=" + this.lastMenstruationTimeMill + ", menstruationDurationDay=" + this.menstruationDurationDay + ", menstruationCycleDay=" + this.menstruationCycleDay + ", enablePredict=" + this.enablePredict + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeLong(this.lastMenstruationTimeMill);
        parcel.writeInt(this.menstruationDurationDay);
        parcel.writeInt(this.menstruationCycleDay);
        parcel.writeByte(this.enablePredict ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ BasicInputValue(long j, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? System.currentTimeMillis() : j, (i3 & 2) != 0 ? 5 : i, (i3 & 4) != 0 ? 28 : i2, (i3 & 8) != 0 ? false : z);
    }

    public BasicInputValue(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readByte() != 0);
    }
}
