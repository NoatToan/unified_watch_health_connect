package fo2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rBC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lfo2/k;", "", "", "path", "", "status", "summary", "description", "details", "Lfo2/g;", "errors", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfo2/g;)V", "a", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Integer;", "c", "getSummary", "d", "getDescription", JWKParameterNames.RSA_EXPONENT, "getDetails", "f", "Lfo2/g;", "getErrors", "()Lfo2/g;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f73012g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("path")
    private final String path;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final Integer status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summary")
    private final String summary;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("details")
    private final String details;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errors")
    private final g errors;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f73012g = gt2.b.f79005a.h("PAY#SB#GeneralError");
    }

    public k(String str, Integer num, String str2, String str3, String str4, g gVar) {
        this.path = str;
        this.status = num;
        this.summary = str2;
        this.description = str3;
        this.details = str4;
        this.errors = gVar;
    }

    public final String a(int i14) {
        g gVar = this.errors;
        Logger logger = f73012g;
        if (gVar == null) {
            logger.warn("No \"errors\" in " + this + ", treat it as no error code");
            return null;
        }
        List<z> listA = gVar.a();
        if (listA.size() > 1) {
            logger.warn("More than one value in \"PROVIDER\" in " + this + ", just pick the first");
        }
        z zVar = (z) p13.h0.d0(listA);
        if (zVar == null) {
            logger.warn("No values in \"PROVIDER\" in " + this + ", treat it as no error code");
            return null;
        }
        String flag = zVar.getFlag();
        if (flag == null || !d53.u.y(flag, "SB_", false)) {
            logger.warn("The flag of \"PROVIDER[0]\" is not of \"Snowball\", treat it as no error code");
            return null;
        }
        List<String> listA2 = zVar.a();
        if (listA2.size() > i14) {
            return listA2.get(i14);
        }
        logger.warn("Less than index value " + i14 + " in \"PROVIDER[0].fields\" in " + this + ", return null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.path, kVar.path) && p005kotlin.jvm.internal.s.g(this.status, kVar.status) && p005kotlin.jvm.internal.s.g(this.summary, kVar.summary) && p005kotlin.jvm.internal.s.g(this.description, kVar.description) && p005kotlin.jvm.internal.s.g(this.details, kVar.details) && p005kotlin.jvm.internal.s.g(this.errors, kVar.errors);
    }

    public final int hashCode() {
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.summary;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.details;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        g gVar = this.errors;
        return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.path;
        Integer num = this.status;
        String str2 = this.summary;
        String str3 = this.description;
        String str4 = this.details;
        g gVar = this.errors;
        StringBuilder sbN = u0.n("GeneralError(path=", num, str, ", status=", ", summary=");
        sn.a.t(sbN, str2, ", description=", str3, ", details=");
        sbN.append(str4);
        sbN.append(", errors=");
        sbN.append(gVar);
        sbN.append(")");
        return sbN.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfo2/k$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
