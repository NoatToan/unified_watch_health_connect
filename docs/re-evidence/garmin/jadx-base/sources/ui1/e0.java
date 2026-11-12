package ui1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.common.net.HttpHeaders;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0014\u001a\u0004\b)\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b+\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b-\u0010\u0016¨\u0006."}, d2 = {"Lui1/e0;", "", "", "planId", "", "shortPlanName", "", "isSuspended", "date", "billingDayOfMonth", "monthlyMessageCountLimit", "monthlyMediaCountLimit", "monthlyTrackPointCountLimit", "trackingIntervalSecondsFree", "monthlyPresetCountLimit", "riskOrByte", "enterpriseOrConsumer", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "getPlanId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "d", JWKParameterNames.RSA_EXPONENT, "getBillingDayOfMonth", "f", "getMonthlyMessageCountLimit", "g", "getMonthlyMediaCountLimit", "h", "getMonthlyTrackPointCountLimit", IntegerTokenConverter.CONVERTER_KEY, "getTrackingIntervalSecondsFree", "j", "getMonthlyPresetCountLimit", JWKParameterNames.OCT_KEY_VALUE, "getRiskOrByte", "l", "getEnterpriseOrConsumer", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

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
    @SerializedName(HttpHeaders.DATE)
    private final String date;

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

    public /* synthetic */ e0(Integer num, String str, Boolean bool, String str2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : bool, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : num3, (i14 & 64) != 0 ? null : num4, (i14 & 128) != 0 ? null : num5, (i14 & 256) != 0 ? null : num6, (i14 & 512) != 0 ? null : num7, (i14 & 1024) != 0 ? null : num8, (i14 & 2048) != 0 ? null : num9);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getShortPlanName() {
        return this.shortPlanName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.planId, e0Var.planId) && p005kotlin.jvm.internal.s.g(this.shortPlanName, e0Var.shortPlanName) && p005kotlin.jvm.internal.s.g(this.isSuspended, e0Var.isSuspended) && p005kotlin.jvm.internal.s.g(this.date, e0Var.date) && p005kotlin.jvm.internal.s.g(this.billingDayOfMonth, e0Var.billingDayOfMonth) && p005kotlin.jvm.internal.s.g(this.monthlyMessageCountLimit, e0Var.monthlyMessageCountLimit) && p005kotlin.jvm.internal.s.g(this.monthlyMediaCountLimit, e0Var.monthlyMediaCountLimit) && p005kotlin.jvm.internal.s.g(this.monthlyTrackPointCountLimit, e0Var.monthlyTrackPointCountLimit) && p005kotlin.jvm.internal.s.g(this.trackingIntervalSecondsFree, e0Var.trackingIntervalSecondsFree) && p005kotlin.jvm.internal.s.g(this.monthlyPresetCountLimit, e0Var.monthlyPresetCountLimit) && p005kotlin.jvm.internal.s.g(this.riskOrByte, e0Var.riskOrByte) && p005kotlin.jvm.internal.s.g(this.enterpriseOrConsumer, e0Var.enterpriseOrConsumer);
    }

    public final int hashCode() {
        Integer num = this.planId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.shortPlanName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSuspended;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.date;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
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
        return iHashCode11 + (num9 != null ? num9.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.planId;
        String str = this.shortPlanName;
        Boolean bool = this.isSuspended;
        String str2 = this.date;
        Integer num2 = this.billingDayOfMonth;
        Integer num3 = this.monthlyMessageCountLimit;
        Integer num4 = this.monthlyMediaCountLimit;
        Integer num5 = this.monthlyTrackPointCountLimit;
        Integer num6 = this.trackingIntervalSecondsFree;
        Integer num7 = this.monthlyPresetCountLimit;
        Integer num8 = this.riskOrByte;
        Integer num9 = this.enterpriseOrConsumer;
        StringBuilder sbF = l2.f("PlanChangeDTO(planId=", num, ", shortPlanName=", str, ", isSuspended=");
        b71.i.s(sbF, bool, ", date=", str2, ", billingDayOfMonth=");
        j20.x.m(sbF, num2, ", monthlyMessageCountLimit=", num3, ", monthlyMediaCountLimit=");
        j20.x.m(sbF, num4, ", monthlyTrackPointCountLimit=", num5, ", trackingIntervalSecondsFree=");
        j20.x.m(sbF, num6, ", monthlyPresetCountLimit=", num7, ", riskOrByte=");
        return b71.i.h(sbF, num8, ", enterpriseOrConsumer=", num9, ")");
    }

    public e0(Integer num, String str, Boolean bool, String str2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
        this.planId = num;
        this.shortPlanName = str;
        this.isSuspended = bool;
        this.date = str2;
        this.billingDayOfMonth = num2;
        this.monthlyMessageCountLimit = num3;
        this.monthlyMediaCountLimit = num4;
        this.monthlyTrackPointCountLimit = num5;
        this.trackingIntervalSecondsFree = num6;
        this.monthlyPresetCountLimit = num7;
        this.riskOrByte = num8;
        this.enterpriseOrConsumer = num9;
    }

    public e0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
