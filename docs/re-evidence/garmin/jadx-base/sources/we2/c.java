package we2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lwe2/c;", "", "", "serviceTicket", "serviceUrl", "title", "Lwe2/a;", "communication", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwe2/a;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "Lwe2/a;", "()Lwe2/a;", JWKParameterNames.RSA_EXPONENT, "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serviceTicket")
    private final String serviceTicket;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serviceUrl")
    private final String serviceUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("communication")
    private final a communication;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private final String url;

    public /* synthetic */ c(String str, String str2, String str3, a aVar, String str4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCommunication() {
        return this.communication;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getServiceTicket() {
        return this.serviceTicket;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getServiceUrl() {
        return this.serviceUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.serviceTicket, cVar.serviceTicket) && s.g(this.serviceUrl, cVar.serviceUrl) && s.g(this.title, cVar.title) && s.g(this.communication, cVar.communication) && s.g(this.url, cVar.url);
    }

    public final int hashCode() {
        String str = this.serviceTicket;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serviceUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.communication;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.url;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.serviceTicket;
        String str2 = this.serviceUrl;
        String str3 = this.url;
        String str4 = this.title;
        a aVar = this.communication;
        String string = aVar != null ? aVar.toString() : "communication=null";
        StringBuilder sbI = p6.b.i("Data(serviceTicket=", str, ", serviceUrl=", str2, ", url=");
        sn.a.t(sbI, str3, ", title=", str4, ", ");
        return am.j.o(string, ")", sbI);
    }

    public c(String str, String str2, String str3, a aVar, String str4) {
        this.serviceTicket = str;
        this.serviceUrl = str2;
        this.title = str3;
        this.communication = aVar;
        this.url = str4;
    }

    public c() {
        this(null, null, null, null, null, 31, null);
    }
}
