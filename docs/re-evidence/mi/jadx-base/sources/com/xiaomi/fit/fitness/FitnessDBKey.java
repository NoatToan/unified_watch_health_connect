package com.xiaomi.fit.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/xiaomi/fit/fitness/FitnessDBKey;", "Landroid/os/Parcelable;", "sid", "", "persistKey", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getSid", "()Ljava/lang/String;", "getPersistKey", "getTime", "()J", "toString", "describeContents", "", "writeToParcel", "", "dest", "flags", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "CREATOR", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FitnessDBKey implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String persistKey;

    @NotNull
    private final String sid;
    private final long time;

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.FitnessDBKey$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/FitnessDBKey$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fit/fitness/FitnessDBKey;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fit/fitness/FitnessDBKey;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<FitnessDBKey> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FitnessDBKey createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FitnessDBKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FitnessDBKey[] newArray(int size) {
            return new FitnessDBKey[size];
        }
    }

    public FitnessDBKey(@NotNull String sid, @NotNull String persistKey, long j) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        this.sid = sid;
        this.persistKey = persistKey;
        this.time = j;
    }

    public static /* synthetic */ FitnessDBKey copy$default(FitnessDBKey fitnessDBKey, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fitnessDBKey.sid;
        }
        if ((i & 2) != 0) {
            str2 = fitnessDBKey.persistKey;
        }
        if ((i & 4) != 0) {
            j = fitnessDBKey.time;
        }
        return fitnessDBKey.copy(str, str2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPersistKey() {
        return this.persistKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final FitnessDBKey copy(@NotNull String sid, @NotNull String persistKey, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        return new FitnessDBKey(sid, persistKey, time);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessDBKey)) {
            return false;
        }
        FitnessDBKey fitnessDBKey = (FitnessDBKey) other;
        return Intrinsics.areEqual(this.sid, fitnessDBKey.sid) && Intrinsics.areEqual(this.persistKey, fitnessDBKey.persistKey) && this.time == fitnessDBKey.time;
    }

    @NotNull
    public final String getPersistKey() {
        return this.persistKey;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.sid.hashCode() * 31) + this.persistKey.hashCode()) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "sid=" + this.sid + ", time=" + this.time + ", persistKey=" + this.persistKey;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sid);
        dest.writeString(this.persistKey);
        dest.writeLong(this.time);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FitnessDBKey(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        String string2 = parcel.readString();
        Intrinsics.checkNotNull(string2);
        this(string, string2, parcel.readLong());
    }
}
