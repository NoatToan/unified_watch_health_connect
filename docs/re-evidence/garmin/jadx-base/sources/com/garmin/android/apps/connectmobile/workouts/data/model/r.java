package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u001f\u0010\u0017R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010+\u001a\u0004\b%\u0010,\"\u0004\b1\u0010.R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b2\u0010,¨\u00063"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/r;", "Landroid/os/Parcelable;", "", "workoutName", "", "duration", "difficulty", "filePath", "heroImage", "sportTypeKey", "workoutSourceId", "", "muscleGroups", "primaryMuscles", "goals", "sportTypes", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "setWorkoutName", "(Ljava/lang/String;)V", "b", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "c", "setDifficulty", "getFilePath", "setFilePath", JWKParameterNames.RSA_EXPONENT, "g", "setHeroImage", "f", "j", "setSportTypeKey", "o", "setWorkoutSourceId", "h", "Ljava/util/List;", "()Ljava/util/List;", "setMuscleGroups", "(Ljava/util/List;)V", IntegerTokenConverter.CONVERTER_KEY, "setPrimaryMuscles", "setGoals", JWKParameterNames.OCT_KEY_VALUE, "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutName")
    private String workoutName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private Long duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("difficulty")
    private String difficulty;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("filePath")
    private String filePath;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heroImage")
    private String heroImage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportTypeKey")
    private String sportTypeKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutSourceId")
    private String workoutSourceId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyParts")
    private List<String> muscleGroups;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryMuscles")
    private List<String> primaryMuscles;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goals")
    private List<String> goals;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportTypes")
    private final List<String> sportTypes;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new r(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public /* synthetic */ r(String str, Long l14, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : list, (i14 & 256) != 0 ? null : list2, (i14 & 512) != 0 ? null : list3, (i14 & 1024) != 0 ? null : list4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDifficulty() {
        return this.difficulty;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.workoutName, rVar.workoutName) && p005kotlin.jvm.internal.s.g(this.duration, rVar.duration) && p005kotlin.jvm.internal.s.g(this.difficulty, rVar.difficulty) && p005kotlin.jvm.internal.s.g(this.filePath, rVar.filePath) && p005kotlin.jvm.internal.s.g(this.heroImage, rVar.heroImage) && p005kotlin.jvm.internal.s.g(this.sportTypeKey, rVar.sportTypeKey) && p005kotlin.jvm.internal.s.g(this.workoutSourceId, rVar.workoutSourceId) && p005kotlin.jvm.internal.s.g(this.muscleGroups, rVar.muscleGroups) && p005kotlin.jvm.internal.s.g(this.primaryMuscles, rVar.primaryMuscles) && p005kotlin.jvm.internal.s.g(this.goals, rVar.goals) && p005kotlin.jvm.internal.s.g(this.sportTypes, rVar.sportTypes);
    }

    public final List<String> f() {
        return this.goals;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHeroImage() {
        return this.heroImage;
    }

    public final List<String> h() {
        return this.muscleGroups;
    }

    public final int hashCode() {
        String str = this.workoutName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.duration;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.difficulty;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.filePath;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.heroImage;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sportTypeKey;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.workoutSourceId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.muscleGroups;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.primaryMuscles;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.goals;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.sportTypes;
        return iHashCode10 + (list4 != null ? list4.hashCode() : 0);
    }

    public final List<String> i() {
        return this.primaryMuscles;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSportTypeKey() {
        return this.sportTypeKey;
    }

    public final List<String> k() {
        return this.sportTypes;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getWorkoutName() {
        return this.workoutName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getWorkoutSourceId() {
        return this.workoutSourceId;
    }

    public final String toString() {
        String str = this.workoutName;
        Long l14 = this.duration;
        String str2 = this.difficulty;
        String str3 = this.filePath;
        String str4 = this.heroImage;
        String str5 = this.sportTypeKey;
        String str6 = this.workoutSourceId;
        List<String> list = this.muscleGroups;
        List<String> list2 = this.primaryMuscles;
        List<String> list3 = this.goals;
        List<String> list4 = this.sportTypes;
        StringBuilder sb3 = new StringBuilder("MSNWorkoutsDTO(workoutName=");
        sb3.append(str);
        sb3.append(", duration=");
        sb3.append(l14);
        sb3.append(", difficulty=");
        sn.a.t(sb3, str2, ", filePath=", str3, ", heroImage=");
        sn.a.t(sb3, str4, ", sportTypeKey=", str5, ", workoutSourceId=");
        v.e0.o(str6, ", muscleGroups=", ", primaryMuscles=", sb3, list);
        n23.j.z(sb3, list2, ", goals=", list3, ", sportTypes=");
        return u62.z.c(sb3, list4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.workoutName);
        Long l14 = this.duration;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.difficulty);
        parcel.writeString(this.filePath);
        parcel.writeString(this.heroImage);
        parcel.writeString(this.sportTypeKey);
        parcel.writeString(this.workoutSourceId);
        parcel.writeStringList(this.muscleGroups);
        parcel.writeStringList(this.primaryMuscles);
        parcel.writeStringList(this.goals);
        parcel.writeStringList(this.sportTypes);
    }

    public r(String str, Long l14, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.workoutName = str;
        this.duration = l14;
        this.difficulty = str2;
        this.filePath = str3;
        this.heroImage = str4;
        this.sportTypeKey = str5;
        this.workoutSourceId = str6;
        this.muscleGroups = list;
        this.primaryMuscles = list2;
        this.goals = list3;
        this.sportTypes = list4;
    }

    public r() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
