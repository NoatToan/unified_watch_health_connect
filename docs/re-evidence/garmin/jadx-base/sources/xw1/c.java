package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import i3.e5;
import j20.x;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bV\b\u0087\b\u0018\u00002\u00020\u0001B«\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u00100\"\u0004\b8\u00102R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010.\u001a\u0004\bT\u00100\"\u0004\bU\u00102R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010(\u001a\u0004\bW\u0010*\"\u0004\bX\u0010,R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010=\u001a\u0004\bV\u0010?\"\u0004\bZ\u0010AR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010=\u001a\u0004\bM\u0010?\"\u0004\b=\u0010AR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010=\u001a\u0004\b[\u0010?\"\u0004\b]\u0010AR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010=\u001a\u0004\bS\u0010?\"\u0004\b^\u0010AR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010(\u001a\u0004\bB\u0010*\"\u0004\b`\u0010,R$\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010N\u001a\u0004\b6\u0010P\"\u0004\ba\u0010RR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010(\u001a\u0004\b<\u0010*\"\u0004\bb\u0010,R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010=\u001a\u0004\bc\u0010?\"\u0004\bd\u0010AR\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010=\u001a\u0004\bf\u0010?\"\u0004\bg\u0010AR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010.\u001a\u0004\bo\u00100\"\u0004\bp\u00102R$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010.\u001a\u0004\bq\u00100\"\u0004\br\u00102R$\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010.\u001a\u0004\bs\u00100\"\u0004\bt\u00102R$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010y¨\u0006z"}, d2 = {"Lxw1/c;", "Landroid/os/Parcelable;", "", "longRunDay", "", "planType", "prePlanWeeklyMileage", "prePlanTrainingPace", "selectedGoal", "selectedPaceGoalTime", "Lxw1/k;", "selectedRace", "", "selectedWorkoutDays", "", "selectedWorkoutPlanId", "selectedWorkoutsPerWeek", "language", "minWeeksPerPlan", "maxWeeksPerPlan", "minWorkoutsPerWeek", "maxWorkoutsPerWeek", "localizedGoal", "coachId", "coachName", "onChangeMaxWeeks", "onChangeMinWeeks", "Lorg/joda/time/DateTime;", "registrationDate", "minWeeklyDistance", "maxWeeklyDistance", "prePlanTrainingPaceInSecsPerUnit", "Lxw1/n;", "tiEventDTO", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILxw1/k;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;IILorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lxw1/n;)V", "Lxw1/d;", "trainingPlan", "(Lxw1/d;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "H", "(Ljava/lang/String;)V", "b", "Ljava/lang/Integer;", "o", "()Ljava/lang/Integer;", "setPlanType", "(Ljava/lang/Integer;)V", "c", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "setPrePlanWeeklyMileage", "d", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setPrePlanTrainingPace", JWKParameterNames.RSA_EXPONENT, "s", "setSelectedGoal", "f", "I", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "()I", "c0", "(I)V", "g", "Lxw1/k;", "u", "()Lxw1/k;", "e0", "(Lxw1/k;)V", "Ljava/util/List;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()Ljava/util/List;", "setSelectedWorkoutDays", "(Ljava/util/List;)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "z", "()Ljava/lang/Long;", "setSelectedWorkoutPlanId", "(Ljava/lang/Long;)V", "j", "A", "g0", JWKParameterNames.OCT_KEY_VALUE, "getLanguage", "G", "l", "Z", "m", JWKParameterNames.RSA_MODULUS, "a0", "M", "p", "setLocalizedGoal", "setCoachId", "setCoachName", "getOnChangeMaxWeeks", "setOnChangeMaxWeeks", "v", "getOnChangeMinWeeks", "setOnChangeMinWeeks", "w", "Lorg/joda/time/DateTime;", "getRegistrationDate", "()Lorg/joda/time/DateTime;", "setRegistrationDate", "(Lorg/joda/time/DateTime;)V", "x", "getMinWeeklyDistance", "setMinWeeklyDistance", "getMaxWeeklyDistance", "setMaxWeeklyDistance", "getPrePlanTrainingPaceInSecsPerUnit", "setPrePlanTrainingPaceInSecsPerUnit", "Lxw1/n;", "C", "()Lxw1/n;", "h0", "(Lxw1/n;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private n tiEventDTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longRunDay")
    private String longRunDay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("planTypeId")
    private Integer planType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prePlanWeeklyMileage")
    private Integer prePlanWeeklyMileage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prePlanTrainingPace")
    private Integer prePlanTrainingPace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectedGoal")
    private String selectedGoal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectedPaceGoalTime")
    private int selectedPaceGoalTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectedRace")
    private k selectedRace;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectedWorkoutDays")
    private List<String> selectedWorkoutDays;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectedWorkoutPlanId")
    private Long selectedWorkoutPlanId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectedWorkoutsPerWeek")
    private Integer selectedWorkoutsPerWeek;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String language;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int minWeeksPerPlan;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int maxWeeksPerPlan;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int minWorkoutsPerWeek;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int maxWorkoutsPerWeek;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String localizedGoal;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private Long coachId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String coachName;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int onChangeMaxWeeks;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int onChangeMinWeeks;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private DateTime registrationDate;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private Integer minWeeklyDistance;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private Integer maxWeeklyDistance;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private Integer prePlanTrainingPaceInSecsPerUnit;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer num;
            parcel.getClass();
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num2 = numValueOf;
            Integer num3 = numValueOf2;
            String string2 = parcel.readString();
            Integer num4 = numValueOf3;
            int i14 = parcel.readInt();
            k kVarCreateFromParcel = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long l14 = lValueOf2;
            String string3 = parcel.readString();
            Integer num5 = numValueOf4;
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                num = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                num = null;
            }
            Integer num6 = num;
            return new c(string, num2, num3, num4, string2, i14, kVarCreateFromParcel, arrayListCreateStringArrayList, l14, num5, string3, i15, i16, i17, i18, string4, lValueOf, parcel.readString(), parcel.readInt(), parcel.readInt(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? num6 : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? num6 : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? num6 : Integer.valueOf(parcel.readInt()), (n) (parcel.readInt() == 0 ? num6 : n.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, Integer num, Integer num2, Integer num3, String str2, int i14, k kVar, List list, Long l14, Integer num4, String str3, int i15, int i16, int i17, int i18, String str4, Long l15, String str5, int i19, int i24, DateTime dateTime, Integer num5, Integer num6, Integer num7, n nVar, int i25, p005kotlin.jvm.internal.j jVar) {
        this((i25 & 1) != 0 ? null : str, (i25 & 2) != 0 ? null : num, (i25 & 4) != 0 ? null : num2, (i25 & 8) != 0 ? null : num3, (i25 & 16) != 0 ? null : str2, (i25 & 32) != 0 ? 0 : i14, (i25 & 64) != 0 ? null : kVar, (i25 & 128) != 0 ? null : list, (i25 & 256) != 0 ? null : l14, (i25 & 512) != 0 ? null : num4, (i25 & 1024) != 0 ? null : str3, (i25 & 2048) != 0 ? 0 : i15, (i25 & 4096) != 0 ? 0 : i16, (i25 & 8192) != 0 ? 0 : i17, (i25 & 16384) != 0 ? 0 : i18, (i25 & 32768) != 0 ? null : str4, (i25 & 65536) != 0 ? null : l15, (i25 & 131072) != 0 ? null : str5, (i25 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? 0 : i19, (i25 & 524288) != 0 ? 0 : i24, (i25 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : dateTime, (i25 & 2097152) != 0 ? null : num5, (i25 & 4194304) != 0 ? null : num6, (i25 & 8388608) != 0 ? null : num7, (i25 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : nVar);
    }

    public static c b(c cVar, k kVar, ArrayList arrayList, Long l14, int i14, int i15, int i16, int i17, Long l15, String str, int i18, int i19, n nVar, int i24) {
        String str2 = cVar.longRunDay;
        Integer num = cVar.planType;
        Integer num2 = cVar.prePlanWeeklyMileage;
        Integer num3 = cVar.prePlanTrainingPace;
        String str3 = cVar.selectedGoal;
        int i25 = cVar.selectedPaceGoalTime;
        k kVar2 = (i24 & 64) != 0 ? cVar.selectedRace : kVar;
        List<String> list = (i24 & 128) != 0 ? cVar.selectedWorkoutDays : arrayList;
        Long l16 = (i24 & 256) != 0 ? cVar.selectedWorkoutPlanId : l14;
        Integer num4 = cVar.selectedWorkoutsPerWeek;
        k kVar3 = kVar2;
        List<String> list2 = list;
        Long l17 = l16;
        String str4 = cVar.language;
        int i26 = (i24 & 2048) != 0 ? cVar.minWeeksPerPlan : i14;
        int i27 = (i24 & 4096) != 0 ? cVar.maxWeeksPerPlan : i15;
        int i28 = (i24 & 8192) != 0 ? cVar.minWorkoutsPerWeek : i16;
        int i29 = (i24 & 16384) != 0 ? cVar.maxWorkoutsPerWeek : i17;
        String str5 = cVar.localizedGoal;
        Long l18 = (i24 & 65536) != 0 ? cVar.coachId : l15;
        String str6 = (i24 & 131072) != 0 ? cVar.coachName : str;
        int i30 = (i24 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? cVar.onChangeMaxWeeks : i18;
        int i34 = (i24 & 524288) != 0 ? cVar.onChangeMinWeeks : i19;
        DateTime dateTime = cVar.registrationDate;
        Integer num5 = cVar.minWeeklyDistance;
        Integer num6 = cVar.maxWeeklyDistance;
        Integer num7 = cVar.prePlanTrainingPaceInSecsPerUnit;
        n nVar2 = (i24 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? cVar.tiEventDTO : nVar;
        cVar.getClass();
        return new c(str2, num, num2, num3, str3, i25, kVar3, list2, l17, num4, str4, i26, i27, i28, i29, str5, l18, str6, i30, i34, dateTime, num5, num6, num7, nVar2);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Integer getSelectedWorkoutsPerWeek() {
        return this.selectedWorkoutsPerWeek;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final n getTiEventDTO() {
        return this.tiEventDTO;
    }

    public final boolean D() {
        int i14 = this.minWorkoutsPerWeek;
        int i15 = this.maxWorkoutsPerWeek;
        return (i14 != i15 || i14 == 0 || i15 == 0) ? false : true;
    }

    public final boolean F() {
        return s.g(this.selectedGoal, "PACE");
    }

    public final void G(String str) {
        this.language = str;
    }

    public final void H(String str) {
        this.longRunDay = str;
    }

    public final void I(int i14) {
        this.maxWeeksPerPlan = i14;
    }

    public final void M(int i14) {
        this.maxWorkoutsPerWeek = i14;
    }

    public final void Z(int i14) {
        this.minWeeksPerPlan = i14;
    }

    public final void a0(int i14) {
        this.minWorkoutsPerWeek = i14;
    }

    public final void c0(int i14) {
        this.selectedPaceGoalTime = i14;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getCoachId() {
        return this.coachId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e0(k kVar) {
        this.selectedRace = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.longRunDay, cVar.longRunDay) && s.g(this.planType, cVar.planType) && s.g(this.prePlanWeeklyMileage, cVar.prePlanWeeklyMileage) && s.g(this.prePlanTrainingPace, cVar.prePlanTrainingPace) && s.g(this.selectedGoal, cVar.selectedGoal) && this.selectedPaceGoalTime == cVar.selectedPaceGoalTime && s.g(this.selectedRace, cVar.selectedRace) && s.g(this.selectedWorkoutDays, cVar.selectedWorkoutDays) && s.g(this.selectedWorkoutPlanId, cVar.selectedWorkoutPlanId) && s.g(this.selectedWorkoutsPerWeek, cVar.selectedWorkoutsPerWeek) && s.g(this.language, cVar.language) && this.minWeeksPerPlan == cVar.minWeeksPerPlan && this.maxWeeksPerPlan == cVar.maxWeeksPerPlan && this.minWorkoutsPerWeek == cVar.minWorkoutsPerWeek && this.maxWorkoutsPerWeek == cVar.maxWorkoutsPerWeek && s.g(this.localizedGoal, cVar.localizedGoal) && s.g(this.coachId, cVar.coachId) && s.g(this.coachName, cVar.coachName) && this.onChangeMaxWeeks == cVar.onChangeMaxWeeks && this.onChangeMinWeeks == cVar.onChangeMinWeeks && s.g(this.registrationDate, cVar.registrationDate) && s.g(this.minWeeklyDistance, cVar.minWeeklyDistance) && s.g(this.maxWeeklyDistance, cVar.maxWeeklyDistance) && s.g(this.prePlanTrainingPaceInSecsPerUnit, cVar.prePlanTrainingPaceInSecsPerUnit) && s.g(this.tiEventDTO, cVar.tiEventDTO);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCoachName() {
        return this.coachName;
    }

    public final void f0(m mVar) {
        if (mVar != null) {
            this.selectedGoal = mVar.getGoal();
            this.localizedGoal = mVar.getLocalizedGoal();
        } else {
            this.selectedGoal = null;
            this.localizedGoal = null;
        }
        if (F()) {
            return;
        }
        this.selectedPaceGoalTime = 0;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLocalizedGoal() {
        return this.localizedGoal;
    }

    public final void g0(Integer num) {
        this.selectedWorkoutsPerWeek = num;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLongRunDay() {
        return this.longRunDay;
    }

    public final void h0(n nVar) {
        this.tiEventDTO = nVar;
    }

    public final int hashCode() {
        String str = this.longRunDay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.planType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.prePlanWeeklyMileage;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.prePlanTrainingPace;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.selectedGoal;
        int iD = q2.d(this.selectedPaceGoalTime, (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        k kVar = this.selectedRace;
        int iHashCode5 = (iD + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<String> list = this.selectedWorkoutDays;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Long l14 = this.selectedWorkoutPlanId;
        int iHashCode7 = (iHashCode6 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num4 = this.selectedWorkoutsPerWeek;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.language;
        int iD2 = q2.d(this.maxWorkoutsPerWeek, q2.d(this.minWorkoutsPerWeek, q2.d(this.maxWeeksPerPlan, q2.d(this.minWeeksPerPlan, (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31);
        String str4 = this.localizedGoal;
        int iHashCode9 = (iD2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.coachId;
        int iHashCode10 = (iHashCode9 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str5 = this.coachName;
        int iD3 = q2.d(this.onChangeMinWeeks, q2.d(this.onChangeMaxWeeks, (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31);
        DateTime dateTime = this.registrationDate;
        int iHashCode11 = (iD3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num5 = this.minWeeklyDistance;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.maxWeeklyDistance;
        int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.prePlanTrainingPaceInSecsPerUnit;
        int iHashCode14 = (iHashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
        n nVar = this.tiEventDTO;
        return iHashCode14 + (nVar != null ? nVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMaxWeeksPerPlan() {
        return this.maxWeeksPerPlan;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMaxWorkoutsPerWeek() {
        return this.maxWorkoutsPerWeek;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMinWeeksPerPlan() {
        return this.minWeeksPerPlan;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getMinWorkoutsPerWeek() {
        return this.minWorkoutsPerWeek;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getPlanType() {
        return this.planType;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getPrePlanTrainingPace() {
        return this.prePlanTrainingPace;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getPrePlanWeeklyMileage() {
        return this.prePlanWeeklyMileage;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSelectedGoal() {
        return this.selectedGoal;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getSelectedPaceGoalTime() {
        return this.selectedPaceGoalTime;
    }

    public final String toString() {
        String str = this.longRunDay;
        Integer num = this.planType;
        Integer num2 = this.prePlanWeeklyMileage;
        Integer num3 = this.prePlanTrainingPace;
        String str2 = this.selectedGoal;
        int i14 = this.selectedPaceGoalTime;
        k kVar = this.selectedRace;
        List<String> list = this.selectedWorkoutDays;
        Long l14 = this.selectedWorkoutPlanId;
        Integer num4 = this.selectedWorkoutsPerWeek;
        String str3 = this.language;
        int i15 = this.minWeeksPerPlan;
        int i16 = this.maxWeeksPerPlan;
        int i17 = this.minWorkoutsPerWeek;
        int i18 = this.maxWorkoutsPerWeek;
        String str4 = this.localizedGoal;
        Long l15 = this.coachId;
        String str5 = this.coachName;
        int i19 = this.onChangeMaxWeeks;
        int i24 = this.onChangeMinWeeks;
        DateTime dateTime = this.registrationDate;
        Integer num5 = this.minWeeklyDistance;
        Integer num6 = this.maxWeeklyDistance;
        Integer num7 = this.prePlanTrainingPaceInSecsPerUnit;
        n nVar = this.tiEventDTO;
        StringBuilder sbN = u0.n("AdaptiveTrainingPlanDTO(longRunDay=", num, str, ", planType=", ", prePlanWeeklyMileage=");
        x.m(sbN, num2, ", prePlanTrainingPace=", num3, ", selectedGoal=");
        q6.f.q(i14, str2, ", selectedPaceGoalTime=", ", selectedRace=", sbN);
        sbN.append(kVar);
        sbN.append(", selectedWorkoutDays=");
        sbN.append(list);
        sbN.append(", selectedWorkoutPlanId=");
        sbN.append(l14);
        sbN.append(", selectedWorkoutsPerWeek=");
        sbN.append(num4);
        sbN.append(", language=");
        q6.f.q(i15, str3, ", minWeeksPerPlan=", ", maxWeeksPerPlan=", sbN);
        e0.m(i16, i17, ", minWorkoutsPerWeek=", ", maxWorkoutsPerWeek=", sbN);
        wr.g.t(i18, ", localizedGoal=", str4, ", coachId=", sbN);
        b71.i.q(l15, ", coachName=", str5, ", onChangeMaxWeeks=", sbN);
        e0.m(i19, i24, ", onChangeMinWeeks=", ", registrationDate=", sbN);
        sbN.append(dateTime);
        sbN.append(", minWeeklyDistance=");
        sbN.append(num5);
        sbN.append(", maxWeeklyDistance=");
        x.m(sbN, num6, ", prePlanTrainingPaceInSecsPerUnit=", num7, ", tiEventDTO=");
        sbN.append(nVar);
        sbN.append(")");
        return sbN.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final k getSelectedRace() {
        return this.selectedRace;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.longRunDay);
        Integer num = this.planType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.prePlanWeeklyMileage;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.prePlanTrainingPace;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeString(this.selectedGoal);
        parcel.writeInt(this.selectedPaceGoalTime);
        k kVar = this.selectedRace;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
        parcel.writeStringList(this.selectedWorkoutDays);
        Long l14 = this.selectedWorkoutPlanId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Integer num4 = this.selectedWorkoutsPerWeek;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        parcel.writeString(this.language);
        parcel.writeInt(this.minWeeksPerPlan);
        parcel.writeInt(this.maxWeeksPerPlan);
        parcel.writeInt(this.minWorkoutsPerWeek);
        parcel.writeInt(this.maxWorkoutsPerWeek);
        parcel.writeString(this.localizedGoal);
        Long l15 = this.coachId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.coachName);
        parcel.writeInt(this.onChangeMaxWeeks);
        parcel.writeInt(this.onChangeMinWeeks);
        parcel.writeSerializable(this.registrationDate);
        Integer num5 = this.minWeeklyDistance;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Integer num6 = this.maxWeeklyDistance;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        Integer num7 = this.prePlanTrainingPaceInSecsPerUnit;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num7);
        }
        n nVar = this.tiEventDTO;
        if (nVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nVar.writeToParcel(parcel, i14);
        }
    }

    public final List<String> y() {
        return this.selectedWorkoutDays;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Long getSelectedWorkoutPlanId() {
        return this.selectedWorkoutPlanId;
    }

    public c(String str, Integer num, Integer num2, Integer num3, String str2, int i14, k kVar, List<String> list, Long l14, Integer num4, String str3, int i15, int i16, int i17, int i18, String str4, Long l15, String str5, int i19, int i24, DateTime dateTime, Integer num5, Integer num6, Integer num7, n nVar) {
        this.longRunDay = str;
        this.planType = num;
        this.prePlanWeeklyMileage = num2;
        this.prePlanTrainingPace = num3;
        this.selectedGoal = str2;
        this.selectedPaceGoalTime = i14;
        this.selectedRace = kVar;
        this.selectedWorkoutDays = list;
        this.selectedWorkoutPlanId = l14;
        this.selectedWorkoutsPerWeek = num4;
        this.language = str3;
        this.minWeeksPerPlan = i15;
        this.maxWeeksPerPlan = i16;
        this.minWorkoutsPerWeek = i17;
        this.maxWorkoutsPerWeek = i18;
        this.localizedGoal = str4;
        this.coachId = l15;
        this.coachName = str5;
        this.onChangeMaxWeeks = i19;
        this.onChangeMinWeeks = i24;
        this.registrationDate = dateTime;
        this.minWeeklyDistance = num5;
        this.maxWeeklyDistance = num6;
        this.prePlanTrainingPaceInSecsPerUnit = num7;
        this.tiEventDTO = nVar;
    }

    public c() {
        this(null, null, null, null, null, 0, null, null, null, null, null, 0, 0, 0, 0, null, null, null, 0, 0, null, null, null, null, null, 33554431, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar) {
        Integer numM;
        this(null, 0 == true ? 1 : 0, null, null, null, 0, null, null, null, null, null, 0, 0, 0, 0, null, null, null, 0, 0, null, null, null, null, null, 33554431, null);
        dVar.getClass();
        this.longRunDay = dVar.getLongRunDay();
        this.planType = Integer.valueOf(dVar.getWorkoutPlanTypeId());
        this.prePlanWeeklyMileage = dVar.getPrePlanWeeklyMileage();
        this.prePlanTrainingPace = dVar.getPrePlanTrainingPace();
        m mVarF = dVar.getAthletePlanGoal();
        this.selectedGoal = mVarF != null ? mVarF.getGoal() : null;
        int iIntValue = 0;
        if (F() && (numM = dVar.getGoalTimeSeconds()) != null) {
            iIntValue = numM.intValue();
        }
        this.selectedPaceGoalTime = iIntValue;
        if (dVar.getAthleteRace() != null) {
            k.a aVar = k.f192409f;
            ww1.h hVarH = dVar.getAthleteRace();
            aVar.getClass();
            hVarH.getClass();
            k kVar = new k(null, null, null, null, null, 31, null);
            kVar.o(hVarH.getRaceDay());
            kVar.t(hVarH.getRaceName());
            kVar.s(hVarH.getRaceUrl());
            kVar.q(hVarH.getRaceEventId());
            kVar.r(hVarH.getRaceEventUuid());
            this.selectedRace = kVar;
        }
        this.selectedWorkoutDays = dVar.C();
        this.selectedWorkoutPlanId = Long.valueOf(dVar.getWorkoutPlanId());
        this.selectedWorkoutsPerWeek = dVar.getWorkoutsPerWeek();
        this.registrationDate = dVar.s();
        e eVarI = dVar.getCoach();
        this.coachName = eVarI != null ? e5.g(eVarI.f192366c, StringUtils.SPACE, eVarI.f192367d) : null;
        e eVarI2 = dVar.getCoach();
        this.coachId = eVarI2 != null ? eVarI2.getCoachId() : null;
        m mVarF2 = dVar.getAthletePlanGoal();
        this.localizedGoal = mVarF2 != null ? mVarF2.getLocalizedGoal() : null;
    }
}
