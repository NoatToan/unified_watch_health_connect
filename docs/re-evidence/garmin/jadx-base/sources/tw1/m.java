package tw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.Weeks;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r1.q2;
import ww1.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b^\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\r\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\r\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010\b\u0012\b\u0010/\u001a\u0004\u0018\u00010\b\u0012\b\u00100\u001a\u0004\u0018\u00010\b\u0012\b\u00101\u001a\u0004\u0018\u00010\r\u0012\b\u00102\u001a\u0004\u0018\u00010\r\u0012\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u0016\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010KR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bP\u0010SR\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010N\u001a\u0004\b@\u0010SR\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bH\u0010SR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010N\u001a\u0004\bV\u0010SR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010IR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010IR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010IR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010IR\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010c\u001a\u0004\bd\u0010eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010\u001f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010N\u001a\u0004\bk\u0010SR\u001c\u0010 \u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010I\u001a\u0004\bm\u0010KR\u001c\u0010!\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010I\u001a\u0004\bo\u0010KR\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001c\u0010$\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001c\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010I\u001a\u0004\by\u0010KR\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010z\u001a\u0004\b{\u0010|R\u001c\u0010(\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010u\u001a\u0004\b~\u0010wR\u001c\u0010)\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010I\u001a\u0004\b\u007f\u0010KR\u001d\u0010*\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b>\u0010I\u001a\u0005\b\u0080\u0001\u0010KR\u001e\u0010+\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010I\u001a\u0005\b\u0082\u0001\u0010KR\"\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\\\u001a\u0004\bW\u0010^R\u001d\u0010.\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0004\bN\u0010I\u001a\u0005\b\u0083\u0001\u0010KR\u001e\u0010/\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010I\u001a\u0005\b\u0085\u0001\u0010KR\u001e\u00100\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010I\u001a\u0005\b\u0087\u0001\u0010KR\u001e\u00101\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010u\u001a\u0005\b\u0089\u0001\u0010wR\u001e\u00102\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010u\u001a\u0005\b\u008b\u0001\u0010wR$\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\\\u001a\u0005\b\u008d\u0001\u0010^R\u001f\u00106\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\bj\u0010\u0090\u0001R#\u00107\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0091\u0001\u0010\\\u001a\u0004\bT\u0010^R \u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0096\u0001"}, d2 = {"Ltw1/m;", "Landroid/os/Parcelable;", "", "trainingPlanId", "Ltw1/n;", "trainingPlanType", "Lww1/d0;", "trainingPlanSubType", "", "trainingPlanCategory", "Ltw1/p;", "trainingStatus", "trainingPlanName", "", "durationInWeeks", "baseWeeks", "buildWeeks", "peakWeeks", "_startDate", "_raceDate", "_pausedDate", "_resumedDate", "", "Ltw1/r;", "taskList", "Ltw1/f;", "recoveryWeeks", "Ltw1/l;", "trainingLevel", "Ltw1/t;", "trainingVersion", "avgWeeklyWorkouts", "description", "adaptivePlanPhase", "Ltw1/b;", "formatLocale", "ownerId", "ownerDisplayName", "Lcom/garmin/android/apps/connectmobile/courses/model/j;", "privacyRule", "parentPlanId", "createDate", "publishDate", "expireDate", "Ltw1/a;", "planPhases", "nameI18nKey", "descriptionI18nKey", "planKey", "seriesIndex", "daysInLastWeek", "Ltw1/h;", "supplementalSports", "Lhv1/i;", "swimAbility", "originalPreferredSwimDays", "", "subscriptionRequired", "<init>", "(JLtw1/n;Lww1/d0;Ljava/lang/String;Ltw1/p;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ltw1/f;Ltw1/l;Ltw1/t;ILjava/lang/String;Ljava/lang/String;Ltw1/b;Ljava/lang/Integer;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/j;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lhv1/i;Ljava/util/List;Ljava/lang/Boolean;)V", "a", "J", "D", "()J", "b", "Ltw1/n;", "H", "()Ltw1/n;", "c", "Lww1/d0;", "G", "()Lww1/d0;", "d", "Ljava/lang/String;", "C", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "Ltw1/p;", "I", "()Ltw1/p;", "f", "F", "g", "()I", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "m", JWKParameterNames.RSA_MODULUS, "o", "Ljava/util/List;", "u", "()Ljava/util/List;", "p", "Ltw1/f;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ltw1/f;", "Ltw1/l;", "A", "()Ltw1/l;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Ltw1/t;", "M", "()Ltw1/t;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getAvgWeeklyWorkouts", "v", "getDescription", "w", "getAdaptivePlanPhase", "x", "Ltw1/b;", "getFormatLocale", "()Ltw1/b;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "Ljava/lang/Integer;", "getOwnerId", "()Ljava/lang/Integer;", "z", "getOwnerDisplayName", "Lcom/garmin/android/apps/connectmobile/courses/model/j;", "getPrivacyRule", "()Lcom/garmin/android/apps/connectmobile/courses/model/j;", "B", "getParentPlanId", "getCreateDate", "getPublishDate", "E", "getExpireDate", "getNameI18nKey", "P", "getDescriptionI18nKey", "T", "getPlanKey", "X", "getSeriesIndex", "Y", "getDaysInLastWeek", "Z", "s", "k0", "Lhv1/i;", "()Lhv1/i;", "H0", "I0", "Ljava/lang/Boolean;", "getSubscriptionRequired", "()Ljava/lang/Boolean;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("privacyRule")
    private final com.garmin.android.apps.connectmobile.courses.model.j privacyRule;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("parentPlanId")
    private final Integer parentPlanId;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("createDate")
    private final String createDate;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("publishDate")
    private final String publishDate;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("expireDate")
    private final String expireDate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("planPhases")
    private final List<tw1.a> planPhases;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("originalPreferredSwimDays")
    private final List<String> originalPreferredSwimDays;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("nameI18nKey")
    private final String nameI18nKey;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("subscriptionRequired")
    private final Boolean subscriptionRequired;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("descriptionI18nKey")
    private final String descriptionI18nKey;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("planKey")
    private final String planKey;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("seriesIndex")
    private final Integer seriesIndex;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("daysInLastWeek")
    private final Integer daysInLastWeek;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("supplementalSports")
    private final List<h> supplementalSports;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanId")
    private final long trainingPlanId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingType")
    private final n trainingPlanType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingSubType")
    private final d0 trainingPlanSubType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanCategory")
    private final String trainingPlanCategory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingStatus")
    private final p trainingStatus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String trainingPlanName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationInWeeks")
    private final int durationInWeeks;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("baseWeeks")
    private final int baseWeeks;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("buildWeeks")
    private final int buildWeeks;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("peakWeeks")
    private final int peakWeeks;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String _startDate;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("swimAbility")
    private final hv1.i swimAbility;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String _raceDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pausedDate")
    private final String _pausedDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resumedDate")
    private final String _resumedDate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("taskList")
    private final List<r> taskList;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weekTypes")
    private final f recoveryWeeks;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingLevel")
    private final l trainingLevel;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingVersion")
    private final t trainingVersion;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgWeeklyWorkouts")
    private final int avgWeeklyWorkouts;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adaptivePlanPhase")
    private final String adaptivePlanPhase;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("formatLocale")
    private final b formatLocale;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerId")
    private final Integer ownerId;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerDisplayName")
    private final String ownerDisplayName;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            parcel.getClass();
            long j8 = parcel.readLong();
            n nVarCreateFromParcel = parcel.readInt() == 0 ? null : n.CREATOR.createFromParcel(parcel);
            d0 d0Var = (d0) parcel.readParcelable(m.class.getClassLoader());
            String string = parcel.readString();
            p pVarCreateFromParcel = parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            d0 d0Var2 = d0Var;
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i18 = parcel.readInt();
                arrayList = new ArrayList(i18);
                int iA = 0;
                while (iA != i18) {
                    iA = kg.f.a(r.CREATOR, parcel, arrayList, iA, 1);
                    i18 = i18;
                    d0Var2 = d0Var2;
                }
            }
            d0 d0Var3 = d0Var2;
            f fVarCreateFromParcel = parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel);
            l lVarCreateFromParcel = parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel);
            t tVarCreateFromParcel = parcel.readInt() == 0 ? null : t.CREATOR.createFromParcel(parcel);
            ArrayList arrayList4 = arrayList;
            int i19 = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            b bVarCreateFromParcel = parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            com.garmin.android.apps.connectmobile.courses.model.j jVar = (com.garmin.android.apps.connectmobile.courses.model.j) parcel.readParcelable(m.class.getClassLoader());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num = numValueOf;
            d0 d0Var4 = d0Var3;
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i24 = parcel.readInt();
                arrayList2 = new ArrayList(i24);
                int iA2 = 0;
                while (iA2 != i24) {
                    iA2 = kg.f.a(tw1.a.CREATOR, parcel, arrayList2, iA2, 1);
                    i24 = i24;
                    d0Var4 = d0Var4;
                }
            }
            d0 d0Var5 = d0Var4;
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            ArrayList arrayList5 = arrayList2;
            String string15 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i25 = parcel.readInt();
                arrayList3 = new ArrayList(i25);
                for (int i26 = 0; i26 != i25; i26++) {
                    arrayList3.add(h.valueOf(parcel.readString()));
                }
            }
            return new m(j8, nVarCreateFromParcel, d0Var5, string, pVarCreateFromParcel, string2, i14, i15, i16, i17, string3, string4, string5, string6, arrayList4, fVarCreateFromParcel, lVarCreateFromParcel, tVarCreateFromParcel, i19, string7, string8, bVarCreateFromParcel, num, string9, jVar, numValueOf2, string10, string11, string12, arrayList5, string13, string14, string15, numValueOf3, numValueOf4, arrayList3, parcel.readInt() == 0 ? null : hv1.i.valueOf(parcel.readString()), parcel.createStringArrayList(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(long j8, n nVar, d0 d0Var, String str, p pVar, String str2, int i14, int i15, int i16, int i17, String str3, String str4, String str5, String str6, List<r> list, f fVar, l lVar, t tVar, int i18, String str7, String str8, b bVar, Integer num, String str9, com.garmin.android.apps.connectmobile.courses.model.j jVar, Integer num2, String str10, String str11, String str12, List<tw1.a> list2, String str13, String str14, String str15, Integer num3, Integer num4, List<? extends h> list3, hv1.i iVar, List<String> list4, Boolean bool) {
        this.trainingPlanId = j8;
        this.trainingPlanType = nVar;
        this.trainingPlanSubType = d0Var;
        this.trainingPlanCategory = str;
        this.trainingStatus = pVar;
        this.trainingPlanName = str2;
        this.durationInWeeks = i14;
        this.baseWeeks = i15;
        this.buildWeeks = i16;
        this.peakWeeks = i17;
        this._startDate = str3;
        this._raceDate = str4;
        this._pausedDate = str5;
        this._resumedDate = str6;
        this.taskList = list;
        this.recoveryWeeks = fVar;
        this.trainingLevel = lVar;
        this.trainingVersion = tVar;
        this.avgWeeklyWorkouts = i18;
        this.description = str7;
        this.adaptivePlanPhase = str8;
        this.formatLocale = bVar;
        this.ownerId = num;
        this.ownerDisplayName = str9;
        this.privacyRule = jVar;
        this.parentPlanId = num2;
        this.createDate = str10;
        this.publishDate = str11;
        this.expireDate = str12;
        this.planPhases = list2;
        this.nameI18nKey = str13;
        this.descriptionI18nKey = str14;
        this.planKey = str15;
        this.seriesIndex = num3;
        this.daysInLastWeek = num4;
        this.supplementalSports = list3;
        this.swimAbility = iVar;
        this.originalPreferredSwimDays = list4;
        this.subscriptionRequired = bool;
    }

    public static int z(m mVar) {
        int i14 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
        if (mVar.getStartDate() == null || mVar.o() == null) {
            return 0;
        }
        fy1.a.C1500a c1500a = fy1.a.f73883a;
        DateTime startDate = mVar.getStartDate();
        startDate.getClass();
        DateTime dateTimeO = mVar.o();
        dateTimeO.getClass();
        c1500a.getClass();
        return fy1.a.C1500a.a(i14, startDate, dateTimeO);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final l getTrainingLevel() {
        return this.trainingLevel;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getTrainingPlanCategory() {
        return this.trainingPlanCategory;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getTrainingPlanName() {
        return this.trainingPlanName;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final d0 getTrainingPlanSubType() {
        return this.trainingPlanSubType;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final n getTrainingPlanType() {
        return this.trainingPlanType;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final p getTrainingStatus() {
        return this.trainingStatus;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final t getTrainingVersion() {
        return this.trainingVersion;
    }

    public final boolean Z() {
        p pVar = this.trainingStatus;
        return p005kotlin.jvm.internal.s.g(pVar != null ? pVar.getStatusKey() : null, "Scheduled");
    }

    public final boolean a0() {
        return (Z() || k0()) && h0();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBaseWeeks() {
        return this.baseWeeks;
    }

    public final boolean c0() {
        n nVar = this.trainingPlanType;
        return (nVar != null ? nVar.b() : null) == vt1.o.f180176g && p005kotlin.jvm.internal.s.g(this.trainingPlanCategory, vt1.m.FBT_ADAPTIVE.f180162a);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBuildWeeks() {
        return this.buildWeeks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e0() {
        p pVar = this.trainingStatus;
        return p005kotlin.jvm.internal.s.g(pVar != null ? pVar.getStatusKey() : null, "Completed");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.trainingPlanId == mVar.trainingPlanId && p005kotlin.jvm.internal.s.g(this.trainingPlanType, mVar.trainingPlanType) && p005kotlin.jvm.internal.s.g(this.trainingPlanSubType, mVar.trainingPlanSubType) && p005kotlin.jvm.internal.s.g(this.trainingPlanCategory, mVar.trainingPlanCategory) && p005kotlin.jvm.internal.s.g(this.trainingStatus, mVar.trainingStatus) && p005kotlin.jvm.internal.s.g(this.trainingPlanName, mVar.trainingPlanName) && this.durationInWeeks == mVar.durationInWeeks && this.baseWeeks == mVar.baseWeeks && this.buildWeeks == mVar.buildWeeks && this.peakWeeks == mVar.peakWeeks && p005kotlin.jvm.internal.s.g(this._startDate, mVar._startDate) && p005kotlin.jvm.internal.s.g(this._raceDate, mVar._raceDate) && p005kotlin.jvm.internal.s.g(this._pausedDate, mVar._pausedDate) && p005kotlin.jvm.internal.s.g(this._resumedDate, mVar._resumedDate) && p005kotlin.jvm.internal.s.g(this.taskList, mVar.taskList) && p005kotlin.jvm.internal.s.g(this.recoveryWeeks, mVar.recoveryWeeks) && p005kotlin.jvm.internal.s.g(this.trainingLevel, mVar.trainingLevel) && p005kotlin.jvm.internal.s.g(this.trainingVersion, mVar.trainingVersion) && this.avgWeeklyWorkouts == mVar.avgWeeklyWorkouts && p005kotlin.jvm.internal.s.g(this.description, mVar.description) && p005kotlin.jvm.internal.s.g(this.adaptivePlanPhase, mVar.adaptivePlanPhase) && p005kotlin.jvm.internal.s.g(this.formatLocale, mVar.formatLocale) && p005kotlin.jvm.internal.s.g(this.ownerId, mVar.ownerId) && p005kotlin.jvm.internal.s.g(this.ownerDisplayName, mVar.ownerDisplayName) && p005kotlin.jvm.internal.s.g(this.privacyRule, mVar.privacyRule) && p005kotlin.jvm.internal.s.g(this.parentPlanId, mVar.parentPlanId) && p005kotlin.jvm.internal.s.g(this.createDate, mVar.createDate) && p005kotlin.jvm.internal.s.g(this.publishDate, mVar.publishDate) && p005kotlin.jvm.internal.s.g(this.expireDate, mVar.expireDate) && p005kotlin.jvm.internal.s.g(this.planPhases, mVar.planPhases) && p005kotlin.jvm.internal.s.g(this.nameI18nKey, mVar.nameI18nKey) && p005kotlin.jvm.internal.s.g(this.descriptionI18nKey, mVar.descriptionI18nKey) && p005kotlin.jvm.internal.s.g(this.planKey, mVar.planKey) && p005kotlin.jvm.internal.s.g(this.seriesIndex, mVar.seriesIndex) && p005kotlin.jvm.internal.s.g(this.daysInLastWeek, mVar.daysInLastWeek) && p005kotlin.jvm.internal.s.g(this.supplementalSports, mVar.supplementalSports) && this.swimAbility == mVar.swimAbility && p005kotlin.jvm.internal.s.g(this.originalPreferredSwimDays, mVar.originalPreferredSwimDays) && p005kotlin.jvm.internal.s.g(this.subscriptionRequired, mVar.subscriptionRequired);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDurationInWeeks() {
        return this.durationInWeeks;
    }

    public final boolean f0() {
        d0 d0Var = this.trainingPlanSubType;
        return u.q(d0Var != null ? d0Var.getSubTypeKey() : null, ww1.l.FITNESS_OPEN_LOOP.f187825a, true);
    }

    public final tw1.a g() {
        List<tw1.a> list = this.planPhases;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (p005kotlin.jvm.internal.s.g(((tw1.a) obj2).getCurrentPhase(), Boolean.TRUE)) {
                obj = obj2;
                break;
            }
        }
        return (tw1.a) obj;
    }

    public final boolean g0() {
        d0 d0Var;
        d0 d0Var2;
        String subTypeKey;
        String subTypeKey2;
        String subTypeKey3;
        d0 d0Var3 = this.trainingPlanSubType;
        return !(d0Var3 == null || (subTypeKey3 = d0Var3.getSubTypeKey()) == null || !subTypeKey3.equalsIgnoreCase(ww1.l.RUNNING_OPEN_LOOP.f187825a)) || !((d0Var = this.trainingPlanSubType) == null || (subTypeKey2 = d0Var.getSubTypeKey()) == null || !subTypeKey2.equalsIgnoreCase(ww1.l.CYCLING_OPEN_LOOP.f187825a)) || (!((d0Var2 = this.trainingPlanSubType) == null || (subTypeKey = d0Var2.getSubTypeKey()) == null || !subTypeKey.equalsIgnoreCase(ww1.l.TRIATHLON_OPEN_LOOP.f187825a)) || f0() || j0());
    }

    public final DateTime getStartDate() {
        String str = this._startDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
    }

    public final List<String> h() {
        return this.originalPreferredSwimDays;
    }

    public final boolean h0() {
        return p005kotlin.jvm.internal.s.g(this.trainingPlanCategory, vt1.m.FBT_ADAPTIVE.f180162a);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.trainingPlanId) * 31;
        n nVar = this.trainingPlanType;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        d0 d0Var = this.trainingPlanSubType;
        int iHashCode3 = (iHashCode2 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        String str = this.trainingPlanCategory;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        p pVar = this.trainingStatus;
        int iHashCode5 = (iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str2 = this.trainingPlanName;
        int iD = q2.d(this.peakWeeks, q2.d(this.buildWeeks, q2.d(this.baseWeeks, q2.d(this.durationInWeeks, (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31);
        String str3 = this._startDate;
        int iHashCode6 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this._raceDate;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this._pausedDate;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this._resumedDate;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<r> list = this.taskList;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        f fVar = this.recoveryWeeks;
        int iHashCode11 = (iHashCode10 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        l lVar = this.trainingLevel;
        int iHashCode12 = (iHashCode11 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        t tVar = this.trainingVersion;
        int iD2 = q2.d(this.avgWeeklyWorkouts, (iHashCode12 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
        String str7 = this.description;
        int iHashCode13 = (iD2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.adaptivePlanPhase;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        b bVar = this.formatLocale;
        int iHashCode15 = (iHashCode14 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num = this.ownerId;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.ownerDisplayName;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.courses.model.j jVar = this.privacyRule;
        int iHashCode18 = (iHashCode17 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Integer num2 = this.parentPlanId;
        int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str10 = this.createDate;
        int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.publishDate;
        int iHashCode21 = (iHashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.expireDate;
        int iHashCode22 = (iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<tw1.a> list2 = this.planPhases;
        int iHashCode23 = (iHashCode22 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str13 = this.nameI18nKey;
        int iHashCode24 = (iHashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.descriptionI18nKey;
        int iHashCode25 = (iHashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.planKey;
        int iHashCode26 = (iHashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num3 = this.seriesIndex;
        int iHashCode27 = (iHashCode26 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.daysInLastWeek;
        int iHashCode28 = (iHashCode27 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<h> list3 = this.supplementalSports;
        int iHashCode29 = (iHashCode28 + (list3 == null ? 0 : list3.hashCode())) * 31;
        hv1.i iVar = this.swimAbility;
        int iHashCode30 = (iHashCode29 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        List<String> list4 = this.originalPreferredSwimDays;
        int iHashCode31 = (iHashCode30 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool = this.subscriptionRequired;
        return iHashCode31 + (bool != null ? bool.hashCode() : 0);
    }

    public final DateTime i() {
        return g22.k.q(this._pausedDate, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    public final boolean i0() {
        List<h> list;
        return (!h0() || (list = this.supplementalSports) == null || list.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getPeakWeeks() {
        return this.peakWeeks;
    }

    public final boolean j0() {
        d0 d0Var = this.trainingPlanSubType;
        return u.q(d0Var != null ? d0Var.getSubTypeKey() : null, ww1.l.FROG_OPEN_LOOP.f187825a, true);
    }

    public final List<tw1.a> k() {
        return this.planPhases;
    }

    public final boolean k0() {
        p pVar = this.trainingStatus;
        return p005kotlin.jvm.internal.s.g(pVar != null ? pVar.getStatusKey() : null, "Paused");
    }

    public final int m() {
        int i14 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
        DateTime dateTimeO = o();
        DateTime dateTimeWithTimeAtStartOfDay = (dateTimeO == null || !dateTimeO.isBeforeNow()) ? DateTime.now().withTimeAtStartOfDay() : o();
        DateTime dateTimeB = dateTimeWithTimeAtStartOfDay != null ? g22.k.b(i14, dateTimeWithTimeAtStartOfDay) : null;
        DateTime startDate = getStartDate();
        return Weeks.weeksBetween(startDate != null ? g22.k.o(i14, startDate) : null, dateTimeB).getWeeks() + 1;
    }

    public final boolean n0() {
        n nVar = this.trainingPlanType;
        if ((nVar != null ? nVar.b() : null) == vt1.o.f180176g) {
            return (this.baseWeeks > 0 || this.buildWeeks > 0 || this.peakWeeks > 0) && p005kotlin.jvm.internal.s.g(this.trainingPlanCategory, vt1.m.ITP.f180162a);
        }
        return false;
    }

    public final DateTime o() {
        String str = this._raceDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
    }

    public final boolean o0() {
        return p005kotlin.jvm.internal.s.g(this.trainingPlanCategory, vt1.m.STATIC.f180162a);
    }

    public final boolean p0() {
        return p005kotlin.jvm.internal.s.g(this.trainingPlanCategory, vt1.m.STRENGTH.f180162a);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final f getRecoveryWeeks() {
        return this.recoveryWeeks;
    }

    public final boolean q0() {
        return p005kotlin.jvm.internal.s.g(this.subscriptionRequired, Boolean.TRUE);
    }

    public final DateTime r() {
        return g22.k.q(this._resumedDate, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    public final List<h> s() {
        return this.supplementalSports;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final hv1.i getSwimAbility() {
        return this.swimAbility;
    }

    public final String toString() {
        long j8 = this.trainingPlanId;
        n nVar = this.trainingPlanType;
        d0 d0Var = this.trainingPlanSubType;
        String str = this.trainingPlanCategory;
        p pVar = this.trainingStatus;
        String str2 = this.trainingPlanName;
        int i14 = this.durationInWeeks;
        int i15 = this.baseWeeks;
        int i16 = this.buildWeeks;
        int i17 = this.peakWeeks;
        String str3 = this._startDate;
        String str4 = this._raceDate;
        String str5 = this._pausedDate;
        String str6 = this._resumedDate;
        List<r> list = this.taskList;
        f fVar = this.recoveryWeeks;
        l lVar = this.trainingLevel;
        t tVar = this.trainingVersion;
        int i18 = this.avgWeeklyWorkouts;
        String str7 = this.description;
        String str8 = this.adaptivePlanPhase;
        b bVar = this.formatLocale;
        Integer num = this.ownerId;
        String str9 = this.ownerDisplayName;
        com.garmin.android.apps.connectmobile.courses.model.j jVar = this.privacyRule;
        Integer num2 = this.parentPlanId;
        String str10 = this.createDate;
        String str11 = this.publishDate;
        String str12 = this.expireDate;
        List<tw1.a> list2 = this.planPhases;
        String str13 = this.nameI18nKey;
        String str14 = this.descriptionI18nKey;
        String str15 = this.planKey;
        Integer num3 = this.seriesIndex;
        Integer num4 = this.daysInLastWeek;
        List<h> list3 = this.supplementalSports;
        hv1.i iVar = this.swimAbility;
        List<String> list4 = this.originalPreferredSwimDays;
        Boolean bool = this.subscriptionRequired;
        StringBuilder sb3 = new StringBuilder("TrainingPlanDTO(trainingPlanId=");
        sb3.append(j8);
        sb3.append(", trainingPlanType=");
        sb3.append(nVar);
        sb3.append(", trainingPlanSubType=");
        sb3.append(d0Var);
        sb3.append(", trainingPlanCategory=");
        sb3.append(str);
        sb3.append(", trainingStatus=");
        sb3.append(pVar);
        sb3.append(", trainingPlanName=");
        sb3.append(str2);
        androidx.core.view.j.m(i14, i15, ", durationInWeeks=", ", baseWeeks=", sb3);
        androidx.core.view.j.m(i16, i17, ", buildWeeks=", ", peakWeeks=", sb3);
        sn.a.t(sb3, ", _startDate=", str3, ", _raceDate=", str4);
        sn.a.t(sb3, ", _pausedDate=", str5, ", _resumedDate=", str6);
        sb3.append(", taskList=");
        sb3.append(list);
        sb3.append(", recoveryWeeks=");
        sb3.append(fVar);
        sb3.append(", trainingLevel=");
        sb3.append(lVar);
        sb3.append(", trainingVersion=");
        sb3.append(tVar);
        sb3.append(", avgWeeklyWorkouts=");
        sb3.append(i18);
        sb3.append(", description=");
        sb3.append(str7);
        sb3.append(", adaptivePlanPhase=");
        sb3.append(str8);
        sb3.append(", formatLocale=");
        sb3.append(bVar);
        sb3.append(", ownerId=");
        sb3.append(num);
        sb3.append(", ownerDisplayName=");
        sb3.append(str9);
        sb3.append(", privacyRule=");
        sb3.append(jVar);
        sb3.append(", parentPlanId=");
        sb3.append(num2);
        sn.a.t(sb3, ", createDate=", str10, ", publishDate=", str11);
        sb3.append(", expireDate=");
        sb3.append(str12);
        sb3.append(", planPhases=");
        sb3.append(list2);
        sn.a.t(sb3, ", nameI18nKey=", str13, ", descriptionI18nKey=", str14);
        sb3.append(", planKey=");
        sb3.append(str15);
        sb3.append(", seriesIndex=");
        sb3.append(num3);
        sb3.append(", daysInLastWeek=");
        sb3.append(num4);
        sb3.append(", supplementalSports=");
        sb3.append(list3);
        sb3.append(", swimAbility=");
        sb3.append(iVar);
        sb3.append(", originalPreferredSwimDays=");
        sb3.append(list4);
        sb3.append(", subscriptionRequired=");
        sb3.append(bool);
        sb3.append(")");
        return sb3.toString();
    }

    public final List<r> u() {
        return this.taskList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.trainingPlanId);
        n nVar = this.trainingPlanType;
        if (nVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nVar.writeToParcel(parcel, i14);
        }
        parcel.writeParcelable(this.trainingPlanSubType, i14);
        parcel.writeString(this.trainingPlanCategory);
        p pVar = this.trainingStatus;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.trainingPlanName);
        parcel.writeInt(this.durationInWeeks);
        parcel.writeInt(this.baseWeeks);
        parcel.writeInt(this.buildWeeks);
        parcel.writeInt(this.peakWeeks);
        parcel.writeString(this._startDate);
        parcel.writeString(this._raceDate);
        parcel.writeString(this._pausedDate);
        parcel.writeString(this._resumedDate);
        List<r> list = this.taskList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((r) itO.next()).writeToParcel(parcel, i14);
            }
        }
        f fVar = this.recoveryWeeks;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        l lVar = this.trainingLevel;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lVar.writeToParcel(parcel, i14);
        }
        t tVar = this.trainingVersion;
        if (tVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.avgWeeklyWorkouts);
        parcel.writeString(this.description);
        parcel.writeString(this.adaptivePlanPhase);
        b bVar = this.formatLocale;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        Integer num = this.ownerId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.ownerDisplayName);
        parcel.writeParcelable(this.privacyRule, i14);
        Integer num2 = this.parentPlanId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.createDate);
        parcel.writeString(this.publishDate);
        parcel.writeString(this.expireDate);
        List<tw1.a> list2 = this.planPhases;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((tw1.a) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.nameI18nKey);
        parcel.writeString(this.descriptionI18nKey);
        parcel.writeString(this.planKey);
        Integer num3 = this.seriesIndex;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.daysInLastWeek;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        List<h> list3 = this.supplementalSports;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                parcel.writeString(((h) itO3.next()).name());
            }
        }
        hv1.i iVar = this.swimAbility;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iVar.name());
        }
        parcel.writeStringList(this.originalPreferredSwimDays);
        Boolean bool = this.subscriptionRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }

    public final ArrayList y() {
        List<r> list = this.taskList;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            j jVarD = ((r) it.next()).getTaskWorkout();
            if (jVarD != null) {
                arrayList.add(jVarD);
            }
        }
        return arrayList;
    }
}
