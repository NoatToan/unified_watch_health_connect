package tw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.workouts.data.model.w;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B×\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b+\u00106R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b3\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b<\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b=\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010$\u001a\u0004\b?\u0010&R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b@\u0010&R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010$\u001a\u0004\bB\u0010&R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\bC\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010$\u001a\u0004\bD\u0010&R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\b1\u0010.R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010$\u001a\u0004\bG\u0010&R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b7\u0010J¨\u0006K"}, d2 = {"Ltw1/j;", "Landroid/os/Parcelable;", "", "workoutId", "", "workoutUuid", "Ltw1/g;", "sportType", "", "restDay", "workoutName", "workoutDescription", "workoutScheduleId", "_scheduledDate", "associatedActivityId", "_associatedActivityDate", "", "estimatedDurationInSecs", "workoutCreatedDate", "workoutUpdatedDate", "workoutNameI18nKey", "workoutDescriptionI18nKey", "priorityType", "trainingEffectLabel", "workoutPhrase", "benchmarkWorkout", "adaptiveCoachingWorkoutStatus", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/w;", "runWalkDescription", "<init>", "(JLjava/lang/String;Ltw1/g;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/workouts/data/model/w;)V", "a", "J", "o", "()J", "b", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "c", "Ltw1/g;", JWKParameterNames.OCT_KEY_VALUE, "()Ltw1/g;", "d", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "f", "m", "g", "Ljava/lang/Long;", "s", "()Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "j", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "l", "getWorkoutCreatedDate", "getWorkoutUpdatedDate", JWKParameterNames.RSA_MODULUS, "getWorkoutNameI18nKey", "getWorkoutDescriptionI18nKey", "p", "getPriorityType", "getTrainingEffectLabel", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "getAdaptiveCoachingWorkoutStatus", "w", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/w;", "()Lcom/garmin/android/apps/connectmobile/workouts/data/model/w;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutId")
    private final long workoutId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutUuid")
    private final String workoutUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportType")
    private final g sportType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restDay")
    private final Boolean restDay;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutName")
    private final String workoutName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutDescription")
    private final String workoutDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutScheduleId")
    private final Long workoutScheduleId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scheduledDate")
    private final String _scheduledDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("associatedActivityId")
    private final Long associatedActivityId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("associatedActivityDateTime")
    private final String _associatedActivityDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedDurationInSecs")
    private final Integer estimatedDurationInSecs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutCreatedDate")
    private final String workoutCreatedDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutUpdatedDate")
    private final String workoutUpdatedDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutNameI18nKey")
    private final String workoutNameI18nKey;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutDescriptionI18nKey")
    private final String workoutDescriptionI18nKey;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("priorityType")
    private final String priorityType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingEffectLabel")
    private final String trainingEffectLabel;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutPhrase")
    private final String workoutPhrase;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmarkWorkout")
    private final Boolean benchmarkWorkout;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adaptiveCoachingWorkoutStatus")
    private final String adaptiveCoachingWorkoutStatus;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("runWalkDescription")
    private final w runWalkDescription;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Long l14;
            Boolean boolValueOf2;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            g gVarCreateFromParcel = parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
                l14 = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                l14 = null;
            }
            String string2 = parcel.readString();
            Boolean bool = boolValueOf;
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? l14 : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? l14 : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            Object objValueOf = parcel.readInt() == 0 ? l14 : Integer.valueOf(parcel.readInt());
            String string6 = parcel.readString();
            Long l15 = l14;
            Long l16 = lValueOf2;
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z14 = false;
            Long l17 = lValueOf;
            Integer num = objValueOf;
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = l15;
            } else {
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                boolValueOf2 = Boolean.valueOf(z14);
            }
            return new j(j8, string, gVarCreateFromParcel, bool, string2, string3, l17, string4, l16, string5, num, string6, string7, string8, string9, string10, string11, string12, boolValueOf2, parcel.readString(), (w) parcel.readParcelable(j.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    static {
        Parcelable.Creator<w> creator = w.CREATOR;
    }

    public j(long j8, String str, g gVar, Boolean bool, String str2, String str3, Long l14, String str4, Long l15, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool2, String str13, w wVar) {
        this.workoutId = j8;
        this.workoutUuid = str;
        this.sportType = gVar;
        this.restDay = bool;
        this.workoutName = str2;
        this.workoutDescription = str3;
        this.workoutScheduleId = l14;
        this._scheduledDate = str4;
        this.associatedActivityId = l15;
        this._associatedActivityDate = str5;
        this.estimatedDurationInSecs = num;
        this.workoutCreatedDate = str6;
        this.workoutUpdatedDate = str7;
        this.workoutNameI18nKey = str8;
        this.workoutDescriptionI18nKey = str9;
        this.priorityType = str10;
        this.trainingEffectLabel = str11;
        this.workoutPhrase = str12;
        this.benchmarkWorkout = bool2;
        this.adaptiveCoachingWorkoutStatus = str13;
        this.runWalkDescription = wVar;
    }

    public final boolean A() {
        DateTime dateTimeJ = j();
        return dateTimeJ != null && g22.k.c(dateTimeJ) && this.associatedActivityId == null;
    }

    public final DateTime b() {
        String str = this._associatedActivityDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getAssociatedActivityId() {
        return this.associatedActivityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.workoutId == jVar.workoutId && p005kotlin.jvm.internal.s.g(this.workoutUuid, jVar.workoutUuid) && p005kotlin.jvm.internal.s.g(this.sportType, jVar.sportType) && p005kotlin.jvm.internal.s.g(this.restDay, jVar.restDay) && p005kotlin.jvm.internal.s.g(this.workoutName, jVar.workoutName) && p005kotlin.jvm.internal.s.g(this.workoutDescription, jVar.workoutDescription) && p005kotlin.jvm.internal.s.g(this.workoutScheduleId, jVar.workoutScheduleId) && p005kotlin.jvm.internal.s.g(this._scheduledDate, jVar._scheduledDate) && p005kotlin.jvm.internal.s.g(this.associatedActivityId, jVar.associatedActivityId) && p005kotlin.jvm.internal.s.g(this._associatedActivityDate, jVar._associatedActivityDate) && p005kotlin.jvm.internal.s.g(this.estimatedDurationInSecs, jVar.estimatedDurationInSecs) && p005kotlin.jvm.internal.s.g(this.workoutCreatedDate, jVar.workoutCreatedDate) && p005kotlin.jvm.internal.s.g(this.workoutUpdatedDate, jVar.workoutUpdatedDate) && p005kotlin.jvm.internal.s.g(this.workoutNameI18nKey, jVar.workoutNameI18nKey) && p005kotlin.jvm.internal.s.g(this.workoutDescriptionI18nKey, jVar.workoutDescriptionI18nKey) && p005kotlin.jvm.internal.s.g(this.priorityType, jVar.priorityType) && p005kotlin.jvm.internal.s.g(this.trainingEffectLabel, jVar.trainingEffectLabel) && p005kotlin.jvm.internal.s.g(this.workoutPhrase, jVar.workoutPhrase) && p005kotlin.jvm.internal.s.g(this.benchmarkWorkout, jVar.benchmarkWorkout) && p005kotlin.jvm.internal.s.g(this.adaptiveCoachingWorkoutStatus, jVar.adaptiveCoachingWorkoutStatus) && p005kotlin.jvm.internal.s.g(this.runWalkDescription, jVar.runWalkDescription);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getBenchmarkWorkout() {
        return this.benchmarkWorkout;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getEstimatedDurationInSecs() {
        return this.estimatedDurationInSecs;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getRestDay() {
        return this.restDay;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.workoutId) * 31;
        String str = this.workoutUuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.sportType;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.restDay;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.workoutName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.workoutDescription;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.workoutScheduleId;
        int iHashCode7 = (iHashCode6 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str4 = this._scheduledDate;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.associatedActivityId;
        int iHashCode9 = (iHashCode8 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str5 = this._associatedActivityDate;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.estimatedDurationInSecs;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.workoutCreatedDate;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.workoutUpdatedDate;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.workoutNameI18nKey;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.workoutDescriptionI18nKey;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.priorityType;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.trainingEffectLabel;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.workoutPhrase;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool2 = this.benchmarkWorkout;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str13 = this.adaptiveCoachingWorkoutStatus;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        w wVar = this.runWalkDescription;
        return iHashCode20 + (wVar != null ? wVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final w getRunWalkDescription() {
        return this.runWalkDescription;
    }

    public final DateTime j() {
        String str = this._scheduledDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final g getSportType() {
        return this.sportType;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getWorkoutDescription() {
        return this.workoutDescription;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getWorkoutId() {
        return this.workoutId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getWorkoutName() {
        return this.workoutName;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getWorkoutPhrase() {
        return this.workoutPhrase;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Long getWorkoutScheduleId() {
        return this.workoutScheduleId;
    }

    public final m52.k t() {
        String strD;
        g gVar = this.sportType;
        if (gVar == null || (strD = gVar.getSportTypeKey()) == null) {
            return null;
        }
        m52.k.f116753m.getClass();
        return m52.k.a.c(strD);
    }

    public final String toString() {
        long j8 = this.workoutId;
        String str = this.workoutUuid;
        g gVar = this.sportType;
        Boolean bool = this.restDay;
        String str2 = this.workoutName;
        String str3 = this.workoutDescription;
        Long l14 = this.workoutScheduleId;
        String str4 = this._scheduledDate;
        Long l15 = this.associatedActivityId;
        String str5 = this._associatedActivityDate;
        Integer num = this.estimatedDurationInSecs;
        String str6 = this.workoutCreatedDate;
        String str7 = this.workoutUpdatedDate;
        String str8 = this.workoutNameI18nKey;
        String str9 = this.workoutDescriptionI18nKey;
        String str10 = this.priorityType;
        String str11 = this.trainingEffectLabel;
        String str12 = this.workoutPhrase;
        Boolean bool2 = this.benchmarkWorkout;
        String str13 = this.adaptiveCoachingWorkoutStatus;
        w wVar = this.runWalkDescription;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "TaskWorkoutDTO(workoutId=", ", workoutUuid=", str);
        sbK.append(", sportType=");
        sbK.append(gVar);
        sbK.append(", restDay=");
        sbK.append(bool);
        sn.a.t(sbK, ", workoutName=", str2, ", workoutDescription=", str3);
        sbK.append(", workoutScheduleId=");
        sbK.append(l14);
        sbK.append(", _scheduledDate=");
        sbK.append(str4);
        sbK.append(", associatedActivityId=");
        sbK.append(l15);
        sbK.append(", _associatedActivityDate=");
        sbK.append(str5);
        sbK.append(", estimatedDurationInSecs=");
        sbK.append(num);
        sbK.append(", workoutCreatedDate=");
        sbK.append(str6);
        sn.a.t(sbK, ", workoutUpdatedDate=", str7, ", workoutNameI18nKey=", str8);
        sn.a.t(sbK, ", workoutDescriptionI18nKey=", str9, ", priorityType=", str10);
        sn.a.t(sbK, ", trainingEffectLabel=", str11, ", workoutPhrase=", str12);
        sbK.append(", benchmarkWorkout=");
        sbK.append(bool2);
        sbK.append(", adaptiveCoachingWorkoutStatus=");
        sbK.append(str13);
        sbK.append(", runWalkDescription=");
        sbK.append(wVar);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getWorkoutUuid() {
        return this.workoutUuid;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.workoutId);
        parcel.writeString(this.workoutUuid);
        g gVar = this.sportType;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i14);
        }
        Boolean bool = this.restDay;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.workoutName);
        parcel.writeString(this.workoutDescription);
        Long l14 = this.workoutScheduleId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this._scheduledDate);
        Long l15 = this.associatedActivityId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this._associatedActivityDate);
        Integer num = this.estimatedDurationInSecs;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.workoutCreatedDate);
        parcel.writeString(this.workoutUpdatedDate);
        parcel.writeString(this.workoutNameI18nKey);
        parcel.writeString(this.workoutDescriptionI18nKey);
        parcel.writeString(this.priorityType);
        parcel.writeString(this.trainingEffectLabel);
        parcel.writeString(this.workoutPhrase);
        Boolean bool2 = this.benchmarkWorkout;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        parcel.writeString(this.adaptiveCoachingWorkoutStatus);
        parcel.writeParcelable(this.runWalkDescription, i14);
    }

    public final boolean y() {
        return p005kotlin.jvm.internal.s.g(this.benchmarkWorkout, Boolean.TRUE);
    }

    public final boolean z() {
        vt1.b.a aVar = vt1.b.f180079b;
        String str = this.adaptiveCoachingWorkoutStatus;
        aVar.getClass();
        return vt1.b.a.a(str);
    }
}
