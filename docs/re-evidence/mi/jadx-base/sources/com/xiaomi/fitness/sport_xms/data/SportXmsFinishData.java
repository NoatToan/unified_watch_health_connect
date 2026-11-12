package com.xiaomi.fitness.sport_xms.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0013J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003Jc\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0004HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/SportXmsFinishData;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", DailyRecordKey.sportType, "", "maxPushStrength", "", "maxHit", "hitRate", "totalPunches", "perfect", "good", "miss", "courseId", "", "<init>", "(IFIFIIIIJ)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getSportType", "()I", "getMaxPushStrength", "()F", "getMaxHit", "getHitRate", "getTotalPunches", "getPerfect", "getGood", "getMiss", "getCourseId", "()J", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportXmsFinishData implements Parcelable, Serializable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long courseId;
    private final int good;
    private final float hitRate;
    private final int maxHit;
    private final float maxPushStrength;
    private final int miss;
    private final int perfect;
    private final int sportType;
    private final int totalPunches;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_xms.data.SportXmsFinishData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/SportXmsFinishData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/sport_xms/data/SportXmsFinishData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/sport_xms/data/SportXmsFinishData;", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SportXmsFinishData> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SportXmsFinishData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportXmsFinishData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SportXmsFinishData[] newArray(int size) {
            return new SportXmsFinishData[size];
        }
    }

    public SportXmsFinishData(int i, float f, int i2, float f2, int i3, int i4, int i5, int i6, long j) {
        this.sportType = i;
        this.maxPushStrength = f;
        this.maxHit = i2;
        this.hitRate = f2;
        this.totalPunches = i3;
        this.perfect = i4;
        this.good = i5;
        this.miss = i6;
        this.courseId = j;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMaxPushStrength() {
        return this.maxPushStrength;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxHit() {
        return this.maxHit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getHitRate() {
        return this.hitRate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalPunches() {
        return this.totalPunches;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPerfect() {
        return this.perfect;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getGood() {
        return this.good;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMiss() {
        return this.miss;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCourseId() {
        return this.courseId;
    }

    @NotNull
    public final SportXmsFinishData copy(int sportType, float maxPushStrength, int maxHit, float hitRate, int totalPunches, int perfect, int good, int miss, long courseId) {
        return new SportXmsFinishData(sportType, maxPushStrength, maxHit, hitRate, totalPunches, perfect, good, miss, courseId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportXmsFinishData)) {
            return false;
        }
        SportXmsFinishData sportXmsFinishData = (SportXmsFinishData) other;
        return this.sportType == sportXmsFinishData.sportType && Float.compare(this.maxPushStrength, sportXmsFinishData.maxPushStrength) == 0 && this.maxHit == sportXmsFinishData.maxHit && Float.compare(this.hitRate, sportXmsFinishData.hitRate) == 0 && this.totalPunches == sportXmsFinishData.totalPunches && this.perfect == sportXmsFinishData.perfect && this.good == sportXmsFinishData.good && this.miss == sportXmsFinishData.miss && this.courseId == sportXmsFinishData.courseId;
    }

    public final long getCourseId() {
        return this.courseId;
    }

    public final int getGood() {
        return this.good;
    }

    public final float getHitRate() {
        return this.hitRate;
    }

    public final int getMaxHit() {
        return this.maxHit;
    }

    public final float getMaxPushStrength() {
        return this.maxPushStrength;
    }

    public final int getMiss() {
        return this.miss;
    }

    public final int getPerfect() {
        return this.perfect;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getTotalPunches() {
        return this.totalPunches;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.sportType) * 31) + Float.hashCode(this.maxPushStrength)) * 31) + Integer.hashCode(this.maxHit)) * 31) + Float.hashCode(this.hitRate)) * 31) + Integer.hashCode(this.totalPunches)) * 31) + Integer.hashCode(this.perfect)) * 31) + Integer.hashCode(this.good)) * 31) + Integer.hashCode(this.miss)) * 31) + Long.hashCode(this.courseId);
    }

    @NotNull
    public String toString() {
        return "SportXmsFinishData(sportType=" + this.sportType + ", maxPushStrength=" + this.maxPushStrength + ", maxHit=" + this.maxHit + ", hitRate=" + this.hitRate + ", totalPunches=" + this.totalPunches + ", perfect=" + this.perfect + ", good=" + this.good + ", miss=" + this.miss + ", courseId=" + this.courseId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.sportType);
        parcel.writeFloat(this.maxPushStrength);
        parcel.writeInt(this.maxHit);
        parcel.writeFloat(this.hitRate);
        parcel.writeInt(this.totalPunches);
        parcel.writeInt(this.perfect);
        parcel.writeInt(this.good);
        parcel.writeInt(this.miss);
        parcel.writeLong(this.courseId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportXmsFinishData(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
