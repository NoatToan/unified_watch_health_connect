package ui1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0007\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\b\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010 \u001a\u0004\b\u001f\u0010\"R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010 \u001a\u0004\b;\u0010\"R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\u001b\u0010>R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010$\u001a\u0004\b\u0016\u0010%R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010 \u001a\u0004\bA\u0010\"R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010$\u001a\u0004\bC\u0010%¨\u0006D"}, d2 = {"Lui1/b1;", "", "", "planId", "", "shortPlanName", "", "isSuspended", "isUserWithSimplifiedPlan", "billingDayOfMonth", "monthlyMessageCountLimit", "monthlyMediaCountLimit", "monthlyTrackPointCountLimit", "trackingIntervalSecondsFree", "monthlyPresetCountLimit", "riskOrByte", "enterpriseOrConsumer", "packageInstanceId", "unitId", "imei", "Lui1/e0;", "planChange", "isFreeTrial", "freeTrialExpiration", "overagesAreFree", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lui1/e0;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Integer;", "getPlanId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getShortPlanName", "()Ljava/lang/String;", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "d", JWKParameterNames.RSA_EXPONENT, "getBillingDayOfMonth", "f", "getMonthlyMessageCountLimit", "g", "getMonthlyMediaCountLimit", "h", "getMonthlyTrackPointCountLimit", IntegerTokenConverter.CONVERTER_KEY, "getTrackingIntervalSecondsFree", "j", "getMonthlyPresetCountLimit", JWKParameterNames.OCT_KEY_VALUE, "getRiskOrByte", "l", "getEnterpriseOrConsumer", "m", "getPackageInstanceId", JWKParameterNames.RSA_MODULUS, "o", "getImei", "p", "Lui1/e0;", "()Lui1/e0;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getFreeTrialExpiration", "s", "getOveragesAreFree", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PlanId")
    private final Integer planId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ShortPlanName")
    private final String shortPlanName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("IsSuspended")
    private final Boolean isSuspended;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("IsUserWithSimplifiedPlan")
    private final Boolean isUserWithSimplifiedPlan;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BillingDayOfMonth")
    private final Integer billingDayOfMonth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MonthlyMessageCountLimit")
    private final Integer monthlyMessageCountLimit;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MonthlyMediaCountLimit")
    private final Integer monthlyMediaCountLimit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MonthlyTrackPointCountLimit")
    private final Integer monthlyTrackPointCountLimit;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TrackingIntervalSecondsFree")
    private final Integer trackingIntervalSecondsFree;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MonthlyPresetCountLimit")
    private final Integer monthlyPresetCountLimit;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("RiskOrByte")
    private final Integer riskOrByte;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EnterpriseOrConsumer")
    private final Integer enterpriseOrConsumer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PackageInstanceId")
    private final String packageInstanceId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UnitId")
    private final String unitId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("IMEI")
    private final String imei;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PlanChange")
    private final e0 planChange;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("IsFreeTrial")
    private final Boolean isFreeTrial;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FreeTrialExpiration")
    private final String freeTrialExpiration;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @SerializedName("OveragesAreFree")
    private final Boolean overagesAreFree;

    public /* synthetic */ b1(Integer num, String str, Boolean bool, Boolean bool2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str2, String str3, String str4, e0 e0Var, Boolean bool3, String str5, Boolean bool4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : bool, (i14 & 8) != 0 ? null : bool2, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : num3, (i14 & 64) != 0 ? null : num4, (i14 & 128) != 0 ? null : num5, (i14 & 256) != 0 ? null : num6, (i14 & 512) != 0 ? null : num7, (i14 & 1024) != 0 ? null : num8, (i14 & 2048) != 0 ? null : num9, (i14 & 4096) != 0 ? null : str2, (i14 & 8192) != 0 ? null : str3, (i14 & 16384) != 0 ? null : str4, (i14 & 32768) != 0 ? null : e0Var, (i14 & 65536) != 0 ? null : bool3, (i14 & 131072) != 0 ? null : str5, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : bool4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e0 getPlanChange() {
        return this.planChange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUnitId() {
        return this.unitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return p005kotlin.jvm.internal.s.g(this.planId, b1Var.planId) && p005kotlin.jvm.internal.s.g(this.shortPlanName, b1Var.shortPlanName) && p005kotlin.jvm.internal.s.g(this.isSuspended, b1Var.isSuspended) && p005kotlin.jvm.internal.s.g(this.isUserWithSimplifiedPlan, b1Var.isUserWithSimplifiedPlan) && p005kotlin.jvm.internal.s.g(this.billingDayOfMonth, b1Var.billingDayOfMonth) && p005kotlin.jvm.internal.s.g(this.monthlyMessageCountLimit, b1Var.monthlyMessageCountLimit) && p005kotlin.jvm.internal.s.g(this.monthlyMediaCountLimit, b1Var.monthlyMediaCountLimit) && p005kotlin.jvm.internal.s.g(this.monthlyTrackPointCountLimit, b1Var.monthlyTrackPointCountLimit) && p005kotlin.jvm.internal.s.g(this.trackingIntervalSecondsFree, b1Var.trackingIntervalSecondsFree) && p005kotlin.jvm.internal.s.g(this.monthlyPresetCountLimit, b1Var.monthlyPresetCountLimit) && p005kotlin.jvm.internal.s.g(this.riskOrByte, b1Var.riskOrByte) && p005kotlin.jvm.internal.s.g(this.enterpriseOrConsumer, b1Var.enterpriseOrConsumer) && p005kotlin.jvm.internal.s.g(this.packageInstanceId, b1Var.packageInstanceId) && p005kotlin.jvm.internal.s.g(this.unitId, b1Var.unitId) && p005kotlin.jvm.internal.s.g(this.imei, b1Var.imei) && p005kotlin.jvm.internal.s.g(this.planChange, b1Var.planChange) && p005kotlin.jvm.internal.s.g(this.isFreeTrial, b1Var.isFreeTrial) && p005kotlin.jvm.internal.s.g(this.freeTrialExpiration, b1Var.freeTrialExpiration) && p005kotlin.jvm.internal.s.g(this.overagesAreFree, b1Var.overagesAreFree);
    }

    public final int hashCode() {
        Integer num = this.planId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.shortPlanName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSuspended;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUserWithSimplifiedPlan;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.billingDayOfMonth;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.monthlyMessageCountLimit;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.monthlyMediaCountLimit;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.monthlyTrackPointCountLimit;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.trackingIntervalSecondsFree;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.monthlyPresetCountLimit;
        int iHashCode10 = (iHashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.riskOrByte;
        int iHashCode11 = (iHashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.enterpriseOrConsumer;
        int iHashCode12 = (iHashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str2 = this.packageInstanceId;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unitId;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imei;
        int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        e0 e0Var = this.planChange;
        int iHashCode16 = (iHashCode15 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        Boolean bool3 = this.isFreeTrial;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.freeTrialExpiration;
        int iHashCode18 = (iHashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool4 = this.overagesAreFree;
        return iHashCode18 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.planId;
        String str = this.shortPlanName;
        Boolean bool = this.isSuspended;
        Boolean bool2 = this.isUserWithSimplifiedPlan;
        Integer num2 = this.billingDayOfMonth;
        Integer num3 = this.monthlyMessageCountLimit;
        Integer num4 = this.monthlyMediaCountLimit;
        Integer num5 = this.monthlyTrackPointCountLimit;
        Integer num6 = this.trackingIntervalSecondsFree;
        Integer num7 = this.monthlyPresetCountLimit;
        Integer num8 = this.riskOrByte;
        Integer num9 = this.enterpriseOrConsumer;
        String str2 = this.packageInstanceId;
        String str3 = this.unitId;
        String str4 = this.imei;
        e0 e0Var = this.planChange;
        Boolean bool3 = this.isFreeTrial;
        String str5 = this.freeTrialExpiration;
        Boolean bool4 = this.overagesAreFree;
        StringBuilder sbF = l2.f("UserSubscriptionInfo(planId=", num, ", shortPlanName=", str, ", isSuspended=");
        b71.i.o(bool, bool2, ", isUserWithSimplifiedPlan=", ", billingDayOfMonth=", sbF);
        j20.x.m(sbF, num2, ", monthlyMessageCountLimit=", num3, ", monthlyMediaCountLimit=");
        j20.x.m(sbF, num4, ", monthlyTrackPointCountLimit=", num5, ", trackingIntervalSecondsFree=");
        j20.x.m(sbF, num6, ", monthlyPresetCountLimit=", num7, ", riskOrByte=");
        j20.x.m(sbF, num8, ", enterpriseOrConsumer=", num9, ", packageInstanceId=");
        sn.a.t(sbF, str2, ", unitId=", str3, ", imei=");
        sbF.append(str4);
        sbF.append(", planChange=");
        sbF.append(e0Var);
        sbF.append(", isFreeTrial=");
        b71.i.s(sbF, bool3, ", freeTrialExpiration=", str5, ", overagesAreFree=");
        return p6.b.f(sbF, bool4, ")");
    }

    public b1(Integer num, String str, Boolean bool, Boolean bool2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str2, String str3, String str4, e0 e0Var, Boolean bool3, String str5, Boolean bool4) {
        this.planId = num;
        this.shortPlanName = str;
        this.isSuspended = bool;
        this.isUserWithSimplifiedPlan = bool2;
        this.billingDayOfMonth = num2;
        this.monthlyMessageCountLimit = num3;
        this.monthlyMediaCountLimit = num4;
        this.monthlyTrackPointCountLimit = num5;
        this.trackingIntervalSecondsFree = num6;
        this.monthlyPresetCountLimit = num7;
        this.riskOrByte = num8;
        this.enterpriseOrConsumer = num9;
        this.packageInstanceId = str2;
        this.unitId = str3;
        this.imei = str4;
        this.planChange = e0Var;
        this.isFreeTrial = bool3;
        this.freeTrialExpiration = str5;
        this.overagesAreFree = bool4;
    }

    public b1() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }
}
