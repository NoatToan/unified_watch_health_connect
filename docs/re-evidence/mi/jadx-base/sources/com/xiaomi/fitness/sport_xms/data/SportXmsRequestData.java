package com.xiaomi.fitness.sport_xms.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/SportXmsRequestData;", "Landroid/os/Parcelable;", SportConstants.KEY_TIMESTAMP, "", "timeZone", DailyRecordKey.sportType, "sportState", "courseId", "<init>", "(IIIII)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTimeStamp", "()I", "getTimeZone", "getSportType", "getSportState", "getCourseId", "writeToParcel", "", "flags", "describeContents", "CREATOR", "sport-xms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportXmsRequestData implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int courseId;
    private final int sportState;
    private final int sportType;
    private final int timeStamp;
    private final int timeZone;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_xms.data.SportXmsRequestData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/SportXmsRequestData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/sport_xms/data/SportXmsRequestData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/sport_xms/data/SportXmsRequestData;", "sport-xms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SportXmsRequestData> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SportXmsRequestData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportXmsRequestData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SportXmsRequestData[] newArray(int size) {
            return new SportXmsRequestData[size];
        }
    }

    public SportXmsRequestData(int i, int i2, int i3, int i4, int i5) {
        this.timeStamp = i;
        this.timeZone = i2;
        this.sportType = i3;
        this.sportState = i4;
        this.courseId = i5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getSportState() {
        return this.sportState;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getTimeStamp() {
        return this.timeStamp;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.timeStamp);
        parcel.writeInt(this.timeZone);
        parcel.writeInt(this.sportType);
        parcel.writeInt(this.sportState);
        parcel.writeInt(this.courseId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportXmsRequestData(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
