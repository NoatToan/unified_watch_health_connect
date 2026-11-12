package com.xiaomi.fitness.sport_xms.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/PhoneData;", "Landroid/os/Parcelable;", "dur", "", "hr", StepsInfo.KEY_CALORIES, "<init>", "(III)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getDur", "()I", "setDur", "(I)V", "getHr", "setHr", "getCal", "setCal", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "sport-xms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PhoneData implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int cal;
    private int dur;
    private int hr;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_xms.data.PhoneData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/PhoneData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/sport_xms/data/PhoneData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/sport_xms/data/PhoneData;", "sport-xms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<PhoneData> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PhoneData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhoneData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PhoneData[] newArray(int size) {
            return new PhoneData[size];
        }
    }

    public PhoneData(int i, int i2, int i3) {
        this.dur = i;
        this.hr = i2;
        this.cal = i3;
    }

    public static /* synthetic */ PhoneData copy$default(PhoneData phoneData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = phoneData.dur;
        }
        if ((i4 & 2) != 0) {
            i2 = phoneData.hr;
        }
        if ((i4 & 4) != 0) {
            i3 = phoneData.cal;
        }
        return phoneData.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDur() {
        return this.dur;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHr() {
        return this.hr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCal() {
        return this.cal;
    }

    @NotNull
    public final PhoneData copy(int dur, int hr, int cal) {
        return new PhoneData(dur, hr, cal);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneData)) {
            return false;
        }
        PhoneData phoneData = (PhoneData) other;
        return this.dur == phoneData.dur && this.hr == phoneData.hr && this.cal == phoneData.cal;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getDur() {
        return this.dur;
    }

    public final int getHr() {
        return this.hr;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.dur) * 31) + Integer.hashCode(this.hr)) * 31) + Integer.hashCode(this.cal);
    }

    public final void setCal(int i) {
        this.cal = i;
    }

    public final void setDur(int i) {
        this.dur = i;
    }

    public final void setHr(int i) {
        this.hr = i;
    }

    @NotNull
    public String toString() {
        return "PhoneData(dur=" + this.dur + ", hr=" + this.hr + ", cal=" + this.cal + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.dur);
        parcel.writeInt(this.hr);
        parcel.writeInt(this.cal);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneData(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
