package com.mi.command.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0005J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/mi/command/data/UserProfile;", "Landroid/os/Parcelable;", "did", "", "height", "", "sex", MedicalIdSPContract.PREF_BIRTHDAY, "weight", "", "<init>", "(Ljava/lang/String;IIIF)V", "getDid", "()Ljava/lang/String;", "getHeight", "()I", "getSex", "getBirth", "getWeight", "()F", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserProfile> CREATOR = new Creator();
    private final int birth;

    @NotNull
    private final String did;
    private final int height;
    private final int sex;
    private final float weight;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfile createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserProfile(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfile[] newArray(int i) {
            return new UserProfile[i];
        }
    }

    public UserProfile(@NotNull String did, int i, int i2, int i3, float f) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.did = did;
        this.height = i;
        this.sex = i2;
        this.birth = i3;
        this.weight = f;
    }

    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, String str, int i, int i2, int i3, float f, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = userProfile.did;
        }
        if ((i4 & 2) != 0) {
            i = userProfile.height;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = userProfile.sex;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = userProfile.birth;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            f = userProfile.weight;
        }
        return userProfile.copy(str, i5, i6, i7, f);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSex() {
        return this.sex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBirth() {
        return this.birth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @NotNull
    public final UserProfile copy(@NotNull String did, int height, int sex, int birth, float weight) {
        Intrinsics.checkNotNullParameter(did, "did");
        return new UserProfile(did, height, sex, birth, weight);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) other;
        return Intrinsics.areEqual(this.did, userProfile.did) && this.height == userProfile.height && this.sex == userProfile.sex && this.birth == userProfile.birth && Float.compare(this.weight, userProfile.weight) == 0;
    }

    public final int getBirth() {
        return this.birth;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getSex() {
        return this.sex;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.did.hashCode() * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.sex)) * 31) + Integer.hashCode(this.birth)) * 31) + Float.hashCode(this.weight);
    }

    @NotNull
    public String toString() {
        return "UserProfile(did=" + this.did + ", height=" + this.height + ", sex=" + this.sex + ", birth=" + this.birth + ", weight=" + this.weight + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.did);
        dest.writeInt(this.height);
        dest.writeInt(this.sex);
        dest.writeInt(this.birth);
        dest.writeFloat(this.weight);
    }
}
