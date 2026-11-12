package gf0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u000f\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000f\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013¨\u0006,"}, d2 = {"Lgf0/e;", "", "", "clientVersion", "dateOfBirth", "locale", "patientName", "dateFormatKey", "timeFormatKey", "gender", "productName", "currentDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getClientVersion", "()Ljava/lang/String;", "setClientVersion", "(Ljava/lang/String;)V", "b", "getDateOfBirth", "setDateOfBirth", "c", "getLocale", "setLocale", "d", "getPatientName", "setPatientName", JWKParameterNames.RSA_EXPONENT, "getDateFormatKey", "setDateFormatKey", "f", "getTimeFormatKey", "setTimeFormatKey", "g", "getGender", "setGender", "h", "getProductName", "setProductName", IntegerTokenConverter.CONVERTER_KEY, "getCurrentDate", "setCurrentDate", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clientVersion")
    private String clientVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dateOfBirth")
    private String dateOfBirth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private String locale;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("patientName")
    private String patientName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dateFormatKey")
    private String dateFormatKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeFormatKey")
    private String timeFormatKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gender")
    private String gender;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productName")
    private String productName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentDate")
    private String currentDate;

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? "mmddyyyy" : str5, (i14 & 32) != 0 ? "time_twelve_hr" : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? null : str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.clientVersion, eVar.clientVersion) && s.g(this.dateOfBirth, eVar.dateOfBirth) && s.g(this.locale, eVar.locale) && s.g(this.patientName, eVar.patientName) && s.g(this.dateFormatKey, eVar.dateFormatKey) && s.g(this.timeFormatKey, eVar.timeFormatKey) && s.g(this.gender, eVar.gender) && s.g(this.productName, eVar.productName) && s.g(this.currentDate, eVar.currentDate);
    }

    public final int hashCode() {
        String str = this.clientVersion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dateOfBirth;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.locale;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.patientName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dateFormatKey;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.timeFormatKey;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.gender;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.currentDate;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.clientVersion;
        String str2 = this.dateOfBirth;
        String str3 = this.locale;
        String str4 = this.patientName;
        String str5 = this.dateFormatKey;
        String str6 = this.timeFormatKey;
        String str7 = this.gender;
        String str8 = this.productName;
        String str9 = this.currentDate;
        StringBuilder sbI = p6.b.i("EcgReportRequestDto(clientVersion=", str, ", dateOfBirth=", str2, ", locale=");
        sn.a.t(sbI, str3, ", patientName=", str4, ", dateFormatKey=");
        sn.a.t(sbI, str5, ", timeFormatKey=", str6, ", gender=");
        sn.a.t(sbI, str7, ", productName=", str8, ", currentDate=");
        return am.j.o(str9, ")", sbI);
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.clientVersion = str;
        this.dateOfBirth = str2;
        this.locale = str3;
        this.patientName = str4;
        this.dateFormatKey = str5;
        this.timeFormatKey = str6;
        this.gender = str7;
        this.productName = str8;
        this.currentDate = str9;
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
