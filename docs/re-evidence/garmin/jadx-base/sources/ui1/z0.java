package ui1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0012\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019¨\u0006*"}, d2 = {"Lui1/z0;", "", "Lui1/k0;", "garminPartNumber", "", "foreignSystemSku", "foreignSystemId", "foreignSystemSource", "dateActivated", "dateCancelled", "endDate", "serviceEndingDate", "", "Lui1/a;", "devices", "freeTrialEndDate", "<init>", "(Lui1/k0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "a", "Lui1/k0;", "c", "()Lui1/k0;", "b", "Ljava/lang/String;", "getForeignSystemSku", "()Ljava/lang/String;", "getForeignSystemId", "d", "getForeignSystemSource", JWKParameterNames.RSA_EXPONENT, "getDateActivated", "f", "getDateCancelled", "g", "getEndDate", "h", "getServiceEndingDate", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "j", "getFreeTrialEndDate", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("GarminPartNumber")
    private final k0 garminPartNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ForeignSystemSku")
    private final String foreignSystemSku;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ForeignSystemId")
    private final String foreignSystemId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ForeignSystemSource")
    private final String foreignSystemSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("DateActivated")
    private final String dateActivated;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("DateCancelled")
    private final String dateCancelled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EndDate")
    private final String endDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ServiceEndingDate")
    private final String serviceEndingDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Devices")
    private final List<a> devices;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FreeTrialEndDate")
    private final String freeTrialEndDate;

    public z0(k0 k0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : k0Var, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? p13.j0.f134944a : list, (i14 & 512) != 0 ? null : str8);
    }

    public final List<a> a() {
        return this.devices;
    }

    public final DateTime b() {
        String str = this.endDate;
        if (str != null) {
            return c22.j0.K(str, "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSZ");
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k0 getGarminPartNumber() {
        return this.garminPartNumber;
    }

    public final boolean d() {
        DateTime dateTimeNow = DateTime.now();
        String str = this.dateActivated;
        DateTime dateTimeK = str != null ? c22.j0.K(str, "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSZ") : null;
        if (dateTimeK != null && dateTimeK.compareTo((ReadableInstant) dateTimeNow) > 0) {
            return false;
        }
        DateTime dateTimeB = b();
        if (dateTimeB != null && dateTimeNow.compareTo((ReadableInstant) dateTimeB) > 0) {
            return false;
        }
        String str2 = this.dateCancelled;
        DateTime dateTimeK2 = str2 != null ? c22.j0.K(str2, "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSZ") : null;
        return dateTimeK2 == null || b() != null || dateTimeNow.compareTo((ReadableInstant) dateTimeK2) <= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.garminPartNumber == z0Var.garminPartNumber && p005kotlin.jvm.internal.s.g(this.foreignSystemSku, z0Var.foreignSystemSku) && p005kotlin.jvm.internal.s.g(this.foreignSystemId, z0Var.foreignSystemId) && p005kotlin.jvm.internal.s.g(this.foreignSystemSource, z0Var.foreignSystemSource) && p005kotlin.jvm.internal.s.g(this.dateActivated, z0Var.dateActivated) && p005kotlin.jvm.internal.s.g(this.dateCancelled, z0Var.dateCancelled) && p005kotlin.jvm.internal.s.g(this.endDate, z0Var.endDate) && p005kotlin.jvm.internal.s.g(this.serviceEndingDate, z0Var.serviceEndingDate) && p005kotlin.jvm.internal.s.g(this.devices, z0Var.devices) && p005kotlin.jvm.internal.s.g(this.freeTrialEndDate, z0Var.freeTrialEndDate);
    }

    public final int hashCode() {
        k0 k0Var = this.garminPartNumber;
        int iHashCode = (k0Var == null ? 0 : k0Var.hashCode()) * 31;
        String str = this.foreignSystemSku;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.foreignSystemId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.foreignSystemSource;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateActivated;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dateCancelled;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endDate;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.serviceEndingDate;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<a> list = this.devices;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.freeTrialEndDate;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        k0 k0Var = this.garminPartNumber;
        String str = this.foreignSystemSku;
        String str2 = this.foreignSystemId;
        String str3 = this.foreignSystemSource;
        String str4 = this.dateActivated;
        String str5 = this.dateCancelled;
        String str6 = this.endDate;
        String str7 = this.serviceEndingDate;
        List<a> list = this.devices;
        String str8 = this.freeTrialEndDate;
        StringBuilder sb3 = new StringBuilder("SubscriptionsResponseItem(garminPartNumber=");
        sb3.append(k0Var);
        sb3.append(", foreignSystemSku=");
        sb3.append(str);
        sb3.append(", foreignSystemId=");
        sn.a.t(sb3, str2, ", foreignSystemSource=", str3, ", dateActivated=");
        sn.a.t(sb3, str4, ", dateCancelled=", str5, ", endDate=");
        sn.a.t(sb3, str6, ", serviceEndingDate=", str7, ", devices=");
        sb3.append(list);
        sb3.append(", freeTrialEndDate=");
        sb3.append(str8);
        sb3.append(")");
        return sb3.toString();
    }

    public z0(k0 k0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<a> list, String str8) {
        this.garminPartNumber = k0Var;
        this.foreignSystemSku = str;
        this.foreignSystemId = str2;
        this.foreignSystemSource = str3;
        this.dateActivated = str4;
        this.dateCancelled = str5;
        this.endDate = str6;
        this.serviceEndingDate = str7;
        this.devices = list;
        this.freeTrialEndDate = str8;
    }

    public z0() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
