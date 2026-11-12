package com.xiaomi.fit.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/fitness/SportDBKey;", "Landroid/os/Parcelable;", "sid", "", "time", "", DailyRecordKey.sportType, "", "key", "category", "zoneOffsetInSec", "<init>", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;I)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getSid", "()Ljava/lang/String;", "getTime", "()J", "getSportType", "()I", "getKey", "getCategory", "getZoneOffsetInSec", "toString", "describeContents", "writeToParcel", "", "dest", "flags", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "CREATOR", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportDBKey implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String category;

    @NotNull
    private final String key;

    @NotNull
    private final String sid;
    private final int sportType;
    private final long time;
    private final int zoneOffsetInSec;

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.SportDBKey$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/SportDBKey$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fit/fitness/SportDBKey;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fit/fitness/SportDBKey;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SportDBKey> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SportDBKey createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportDBKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SportDBKey[] newArray(int size) {
            return new SportDBKey[size];
        }
    }

    public SportDBKey(@NotNull String sid, long j, int i, @NotNull String key, @NotNull String category, int i2) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(category, "category");
        this.sid = sid;
        this.time = j;
        this.sportType = i;
        this.key = key;
        this.category = category;
        this.zoneOffsetInSec = i2;
    }

    public static /* synthetic */ SportDBKey copy$default(SportDBKey sportDBKey, String str, long j, int i, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sportDBKey.sid;
        }
        if ((i3 & 2) != 0) {
            j = sportDBKey.time;
        }
        long j2 = j;
        if ((i3 & 4) != 0) {
            i = sportDBKey.sportType;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str2 = sportDBKey.key;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            str3 = sportDBKey.category;
        }
        String str5 = str3;
        if ((i3 & 32) != 0) {
            i2 = sportDBKey.zoneOffsetInSec;
        }
        return sportDBKey.copy(str, j2, i4, str4, str5, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    @NotNull
    public final SportDBKey copy(@NotNull String sid, long time, int sportType, @NotNull String key, @NotNull String category, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(category, "category");
        return new SportDBKey(sid, time, sportType, key, category, zoneOffsetInSec);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportDBKey)) {
            return false;
        }
        SportDBKey sportDBKey = (SportDBKey) other;
        return Intrinsics.areEqual(this.sid, sportDBKey.sid) && this.time == sportDBKey.time && this.sportType == sportDBKey.sportType && Intrinsics.areEqual(this.key, sportDBKey.key) && Intrinsics.areEqual(this.category, sportDBKey.category) && this.zoneOffsetInSec == sportDBKey.zoneOffsetInSec;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public int hashCode() {
        return (((((((((this.sid.hashCode() * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.sportType)) * 31) + this.key.hashCode()) * 31) + this.category.hashCode()) * 31) + Integer.hashCode(this.zoneOffsetInSec);
    }

    @NotNull
    public String toString() {
        return "sid=" + this.sid + ", time=" + this.time + ", sportType=" + this.sportType + ", key=" + this.key + ", category=" + this.category + ", zoneOffsetInSec=" + this.zoneOffsetInSec;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sid);
        dest.writeLong(this.time);
        dest.writeInt(this.sportType);
        dest.writeString(this.key);
        dest.writeString(this.category);
        dest.writeInt(this.zoneOffsetInSec);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SportDBKey(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        long j = parcel.readLong();
        int i = parcel.readInt();
        String string2 = parcel.readString();
        Intrinsics.checkNotNull(string2);
        String string3 = parcel.readString();
        Intrinsics.checkNotNull(string3);
        this(string, j, i, string2, string3, parcel.readInt());
    }
}
