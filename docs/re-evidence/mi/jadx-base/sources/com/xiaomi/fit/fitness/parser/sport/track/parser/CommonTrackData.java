package com.xiaomi.fit.fitness.parser.sport.track.parser;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\tHÆ\u0003JB\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001fHÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "Landroid/os/Parcelable;", "latitude", "", "longitude", BizTypeConstants.ELEVATION, "time", "", "flagSegment", "", "<init>", "(DDDLjava/lang/Long;Z)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getLatitude", "()D", "getLongitude", "getElevation", "getTime", "()Ljava/lang/Long;", "setTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFlagSegment", "()Z", "setFlagSegment", "(Z)V", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "component5", "copy", "(DDDLjava/lang/Long;Z)Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "equals", "other", "", "hashCode", "toString", "", "CREATOR", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonTrackData implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final double elevation;
    private boolean flagSegment;
    private final double latitude;
    private final double longitude;

    @Nullable
    private Long time;

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CommonTrackData> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CommonTrackData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommonTrackData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CommonTrackData[] newArray(int size) {
            return new CommonTrackData[size];
        }
    }

    public CommonTrackData(double d, double d2, double d3, @Nullable Long l, boolean z) {
        this.latitude = d;
        this.longitude = d2;
        this.elevation = d3;
        this.time = l;
        this.flagSegment = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getElevation() {
        return this.elevation;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getFlagSegment() {
        return this.flagSegment;
    }

    @NotNull
    public final CommonTrackData copy(double latitude, double longitude, double elevation, @Nullable Long time, boolean flagSegment) {
        return new CommonTrackData(latitude, longitude, elevation, time, flagSegment);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonTrackData)) {
            return false;
        }
        CommonTrackData commonTrackData = (CommonTrackData) other;
        return Double.compare(this.latitude, commonTrackData.latitude) == 0 && Double.compare(this.longitude, commonTrackData.longitude) == 0 && Double.compare(this.elevation, commonTrackData.elevation) == 0 && Intrinsics.areEqual(this.time, commonTrackData.time) && this.flagSegment == commonTrackData.flagSegment;
    }

    public final double getElevation() {
        return this.elevation;
    }

    public final boolean getFlagSegment() {
        return this.flagSegment;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.elevation)) * 31;
        Long l = this.time;
        return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.flagSegment);
    }

    public final void setFlagSegment(boolean z) {
        this.flagSegment = z;
    }

    public final void setTime(@Nullable Long l) {
        this.time = l;
    }

    @NotNull
    public String toString() {
        return "CommonTrackData(latitude=" + this.latitude + ", longitude=" + this.longitude + ", elevation=" + this.elevation + ", time=" + this.time + ", flagSegment=" + this.flagSegment + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.elevation);
        parcel.writeValue(this.time);
        parcel.writeByte(this.flagSegment ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ CommonTrackData(double d, double d2, double d3, Long l, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0L : l, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CommonTrackData(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        double d = parcel.readDouble();
        double d2 = parcel.readDouble();
        double d3 = parcel.readDouble();
        Object value = parcel.readValue(Long.TYPE.getClassLoader());
        this(d, d2, d3, value instanceof Long ? (Long) value : null, parcel.readByte() != 0);
    }
}
