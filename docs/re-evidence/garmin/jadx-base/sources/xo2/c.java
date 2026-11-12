package xo2;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.text.ParsePosition;
import java.util.List;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fBi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lxo2/c;", "", "", "targetDeviceId", "packageId", "", "Lxo2/a;", "apduCommand", "validUntil", "category", "FitpayApduPackageOperation", "FitpayApduPackageCategory", "offlineSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getTargetDeviceId", "()Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "getValidUntil", JWKParameterNames.RSA_EXPONENT, "getCategory", "f", "getFitpayApduPackageOperation", "g", "getFitpayApduPackageCategory", "h", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f191765i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("targetDeviceId")
    private final String targetDeviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("packageId")
    private final String packageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("commandApdus")
    private final List<xo2.a> apduCommand;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("validUntil")
    private final String validUntil;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    private final String category;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("operation")
    private final String FitpayApduPackageOperation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("packageType")
    private final String FitpayApduPackageCategory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offlineSessionId")
    private final String offlineSessionId;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f191765i = gt2.b.f79005a.h("ApduCommitsDto");
    }

    public /* synthetic */ c(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, list, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7);
    }

    public final List<xo2.a> a() {
        return this.apduCommand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOfflineSessionId() {
        return this.offlineSessionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    public final boolean d() {
        String str = this.validUntil;
        Logger logger = f191765i;
        if (str == null || str.length() == 0) {
            logger.error("isExpired: validUntil is null or empty");
            return true;
        }
        try {
            return ISO8601Utils.parse(this.validUntil, new ParsePosition(0)).getTime() < System.currentTimeMillis();
        } catch (Exception e4) {
            logger.error("isExpired: ", (Throwable) e4);
            return true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.targetDeviceId, cVar.targetDeviceId) && s.g(this.packageId, cVar.packageId) && s.g(this.apduCommand, cVar.apduCommand) && s.g(this.validUntil, cVar.validUntil) && s.g(this.category, cVar.category) && s.g(this.FitpayApduPackageOperation, cVar.FitpayApduPackageOperation) && s.g(this.FitpayApduPackageCategory, cVar.FitpayApduPackageCategory) && s.g(this.offlineSessionId, cVar.offlineSessionId);
    }

    public final int hashCode() {
        String str = this.targetDeviceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packageId;
        int iB = u0.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.apduCommand);
        String str3 = this.validUntil;
        int iHashCode2 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.category;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.FitpayApduPackageOperation;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.FitpayApduPackageCategory;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offlineSessionId;
        return iHashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.targetDeviceId;
        String str2 = this.packageId;
        List<xo2.a> list = this.apduCommand;
        String str3 = this.validUntil;
        String str4 = this.category;
        String str5 = this.FitpayApduPackageOperation;
        String str6 = this.FitpayApduPackageCategory;
        String str7 = this.offlineSessionId;
        StringBuilder sbI = p6.b.i("ApduCommitsDto(targetDeviceId=", str, ", packageId=", str2, ", apduCommand=");
        o2.c.n(", validUntil=", str3, ", category=", sbI, list);
        sn.a.t(sbI, str4, ", FitpayApduPackageOperation=", str5, ", FitpayApduPackageCategory=");
        return e5.h(sbI, str6, ", offlineSessionId=", str7, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxo2/c$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public c(String str, String str2, List<xo2.a> list, String str3, String str4, String str5, String str6, String str7) {
        list.getClass();
        this.targetDeviceId = str;
        this.packageId = str2;
        this.apduCommand = list;
        this.validUntil = str3;
        this.category = str4;
        this.FitpayApduPackageOperation = str5;
        this.FitpayApduPackageCategory = str6;
        this.offlineSessionId = str7;
    }
}
