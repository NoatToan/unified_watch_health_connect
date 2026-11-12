package com.garmin.android.apps.connectmobile.workouts.data.model;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aBË\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\b0\u00101R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b*\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b4\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b\"\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00106¨\u00068"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/d;", "", "", "scheduleDateString", "", "workoutId", "scheduledWorkoutId", "workoutUuid", "createdDate", "workoutName", "", "estimatedDurationInSecs", "", "estimatedDistanceInMeters", "workoutType", "trainingPlanId", "atpPlanId", "fbtAdaptivePlanId", "trainingPlanName", "associatedActivityId", "associatedActivityDateTimeString", "", "isRace", "protected", "<init>", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "J", "m", "()J", "c", "Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "d", "o", JWKParameterNames.RSA_EXPONENT, "getCreatedDate", "f", JWKParameterNames.RSA_MODULUS, "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/lang/Double;", "getEstimatedDistanceInMeters", "()Ljava/lang/Double;", "j", JWKParameterNames.OCT_KEY_VALUE, "l", "p", "Ljava/lang/Boolean;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scheduleDate")
    private final String scheduleDateString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutId")
    private final long workoutId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scheduledWorkoutId")
    private final Long scheduledWorkoutId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutUuid")
    private final String workoutUuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDate")
    private final String createdDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutName")
    private final String workoutName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedDurationInSecs")
    private final Integer estimatedDurationInSecs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedDistanceInMeters")
    private final Double estimatedDistanceInMeters;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutType")
    private final String workoutType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("itpPlanId")
    private final Long trainingPlanId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("atpPlanId")
    private final Long atpPlanId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fbtAdaptivePlanId")
    private final Long fbtAdaptivePlanId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tpPlanName")
    private final String trainingPlanName;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("associatedActivityId")
    private final Long associatedActivityId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("associatedActivityDateTime")
    private final String associatedActivityDateTimeString;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("race")
    private final Boolean isRace;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("protected")
    private final Boolean protected;

    static {
        new a(null);
    }

    public /* synthetic */ d(String str, long j8, Long l14, String str2, String str3, String str4, Integer num, Double d14, String str5, Long l15, Long l16, Long l17, String str6, Long l18, String str7, Boolean bool, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : d14, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : l15, (i14 & 1024) != 0 ? null : l16, (i14 & 2048) != 0 ? null : l17, (i14 & 4096) != 0 ? null : str6, (i14 & 8192) != 0 ? null : l18, (i14 & 16384) != 0 ? null : str7, (32768 & i14) != 0 ? null : bool, (i14 & 65536) != 0 ? null : bool2);
    }

    public static d a(d dVar, String str) {
        long j8 = dVar.workoutId;
        Long l14 = dVar.scheduledWorkoutId;
        String str2 = dVar.workoutUuid;
        String str3 = dVar.createdDate;
        String str4 = dVar.workoutName;
        Integer num = dVar.estimatedDurationInSecs;
        Double d14 = dVar.estimatedDistanceInMeters;
        String str5 = dVar.workoutType;
        Long l15 = dVar.trainingPlanId;
        Long l16 = dVar.atpPlanId;
        Long l17 = dVar.fbtAdaptivePlanId;
        String str6 = dVar.trainingPlanName;
        Long l18 = dVar.associatedActivityId;
        String str7 = dVar.associatedActivityDateTimeString;
        Boolean bool = dVar.isRace;
        Boolean bool2 = dVar.protected;
        str.getClass();
        return new d(str, j8, l14, str2, str3, str4, num, d14, str5, l15, l16, l17, str6, l18, str7, bool, bool2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAssociatedActivityDateTimeString() {
        return this.associatedActivityDateTimeString;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getAssociatedActivityId() {
        return this.associatedActivityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getAtpPlanId() {
        return this.atpPlanId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getEstimatedDurationInSecs() {
        return this.estimatedDurationInSecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.scheduleDateString, dVar.scheduleDateString) && this.workoutId == dVar.workoutId && p005kotlin.jvm.internal.s.g(this.scheduledWorkoutId, dVar.scheduledWorkoutId) && p005kotlin.jvm.internal.s.g(this.workoutUuid, dVar.workoutUuid) && p005kotlin.jvm.internal.s.g(this.createdDate, dVar.createdDate) && p005kotlin.jvm.internal.s.g(this.workoutName, dVar.workoutName) && p005kotlin.jvm.internal.s.g(this.estimatedDurationInSecs, dVar.estimatedDurationInSecs) && p005kotlin.jvm.internal.s.g(this.estimatedDistanceInMeters, dVar.estimatedDistanceInMeters) && p005kotlin.jvm.internal.s.g(this.workoutType, dVar.workoutType) && p005kotlin.jvm.internal.s.g(this.trainingPlanId, dVar.trainingPlanId) && p005kotlin.jvm.internal.s.g(this.atpPlanId, dVar.atpPlanId) && p005kotlin.jvm.internal.s.g(this.fbtAdaptivePlanId, dVar.fbtAdaptivePlanId) && p005kotlin.jvm.internal.s.g(this.trainingPlanName, dVar.trainingPlanName) && p005kotlin.jvm.internal.s.g(this.associatedActivityId, dVar.associatedActivityId) && p005kotlin.jvm.internal.s.g(this.associatedActivityDateTimeString, dVar.associatedActivityDateTimeString) && p005kotlin.jvm.internal.s.g(this.isRace, dVar.isRace) && p005kotlin.jvm.internal.s.g(this.protected, dVar.protected);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getFbtAdaptivePlanId() {
        return this.fbtAdaptivePlanId;
    }

    public final DateTime g() {
        try {
            int length = this.scheduleDateString.length();
            String str = this.scheduleDateString;
            return length == 10 ? g22.k.p(str, "yyyy-MM-dd", null) : g22.k.p(str, "yyyy-MM-dd'T'HH:mm:ss.S", null);
        } catch (IllegalArgumentException e4) {
            String strN = fb1.c.n("Error parsing schedule date: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "DashboardWorkout", strN);
            return null;
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getScheduleDateString() {
        return this.scheduleDateString;
    }

    public final int hashCode() {
        int iE = q6.f.e(this.scheduleDateString.hashCode() * 31, 31, this.workoutId);
        Long l14 = this.scheduledWorkoutId;
        int iHashCode = (iE + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.workoutUuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.workoutName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.estimatedDurationInSecs;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.estimatedDistanceInMeters;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.workoutType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.trainingPlanId;
        int iHashCode8 = (iHashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.atpPlanId;
        int iHashCode9 = (iHashCode8 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.fbtAdaptivePlanId;
        int iHashCode10 = (iHashCode9 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str5 = this.trainingPlanName;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l18 = this.associatedActivityId;
        int iHashCode12 = (iHashCode11 + (l18 == null ? 0 : l18.hashCode())) * 31;
        String str6 = this.associatedActivityDateTimeString;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isRace;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.protected;
        return iHashCode14 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getScheduledWorkoutId() {
        return this.scheduledWorkoutId;
    }

    public final m52.k j() {
        String str = this.workoutType;
        if (str != null) {
            m52.k.f116753m.getClass();
            m52.k kVarC = m52.k.a.c(str);
            if (kVarC != null) {
                return kVarC;
            }
        }
        return m52.k.f116754n;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTrainingPlanName() {
        return this.trainingPlanName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getWorkoutId() {
        return this.workoutId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getWorkoutName() {
        return this.workoutName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getWorkoutUuid() {
        return this.workoutUuid;
    }

    public final boolean p() {
        Boolean bool = this.protected;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean q() {
        Boolean bool = this.isRace;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean r() {
        return this.workoutType == null && this.workoutName == null;
    }

    public final boolean s() {
        DateTime dateTimeG = g();
        return dateTimeG != null && g22.k.c(dateTimeG) && this.associatedActivityId == null;
    }

    public final String toString() {
        String str = this.scheduleDateString;
        long j8 = this.workoutId;
        Long l14 = this.scheduledWorkoutId;
        String str2 = this.workoutUuid;
        String str3 = this.createdDate;
        String str4 = this.workoutName;
        Integer num = this.estimatedDurationInSecs;
        Double d14 = this.estimatedDistanceInMeters;
        String str5 = this.workoutType;
        Long l15 = this.trainingPlanId;
        Long l16 = this.atpPlanId;
        Long l17 = this.fbtAdaptivePlanId;
        String str6 = this.trainingPlanName;
        Long l18 = this.associatedActivityId;
        String str7 = this.associatedActivityDateTimeString;
        Boolean bool = this.isRace;
        Boolean bool2 = this.protected;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "DashboardWorkout(scheduleDateString=", str, ", workoutId=");
        sbJ.append(", scheduledWorkoutId=");
        sbJ.append(l14);
        sbJ.append(", workoutUuid=");
        sbJ.append(str2);
        sn.a.t(sbJ, ", createdDate=", str3, ", workoutName=", str4);
        sbJ.append(", estimatedDurationInSecs=");
        sbJ.append(num);
        sbJ.append(", estimatedDistanceInMeters=");
        sbJ.append(d14);
        sbJ.append(", workoutType=");
        sbJ.append(str5);
        sbJ.append(", trainingPlanId=");
        sbJ.append(l15);
        sbJ.append(", atpPlanId=");
        sbJ.append(l16);
        sbJ.append(", fbtAdaptivePlanId=");
        sbJ.append(l17);
        sbJ.append(", trainingPlanName=");
        sbJ.append(str6);
        sbJ.append(", associatedActivityId=");
        sbJ.append(l18);
        sbJ.append(", associatedActivityDateTimeString=");
        sbJ.append(str7);
        sbJ.append(", isRace=");
        sbJ.append(bool);
        sbJ.append(", protected=");
        sbJ.append(bool2);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DATE_FORMAT", "FBT_DATE_FORMAT", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(String str, long j8, Long l14, String str2, String str3, String str4, Integer num, Double d14, String str5, Long l15, Long l16, Long l17, String str6, Long l18, String str7, Boolean bool, Boolean bool2) {
        str.getClass();
        this.scheduleDateString = str;
        this.workoutId = j8;
        this.scheduledWorkoutId = l14;
        this.workoutUuid = str2;
        this.createdDate = str3;
        this.workoutName = str4;
        this.estimatedDurationInSecs = num;
        this.estimatedDistanceInMeters = d14;
        this.workoutType = str5;
        this.trainingPlanId = l15;
        this.atpPlanId = l16;
        this.fbtAdaptivePlanId = l17;
        this.trainingPlanName = str6;
        this.associatedActivityId = l18;
        this.associatedActivityDateTimeString = str7;
        this.isRace = bool;
        this.protected = bool2;
    }
}
