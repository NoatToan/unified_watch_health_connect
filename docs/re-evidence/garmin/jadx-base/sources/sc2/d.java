package sc2;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@o13.e
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsc2/d;", "", "", "httpResponseCode", "Lsc2/o;", "oAuth2ITData", "Lsc2/i;", "mfaTokenData", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "jsonString", "<init>", "(ILsc2/o;Lsc2/i;Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f158491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f158492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f158493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f158494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f158495e;

    public /* synthetic */ d(int i14, o oVar, i iVar, String str, String str2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, oVar, iVar, str, (i15 & 16) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f158491a == dVar.f158491a && s.g(this.f158492b, dVar.f158492b) && s.g(this.f158493c, dVar.f158493c) && s.g(this.f158494d, dVar.f158494d) && s.g(this.f158495e, dVar.f158495e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f158491a) * 31;
        o oVar = this.f158492b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        i iVar = this.f158493c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f158494d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f158495e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ITAuth2Response(httpResponseCode=" + this.f158491a + ", oAuth2ITData=" + this.f158492b + ", mfaTokenData=" + this.f158493c + ", error=" + this.f158494d + ")";
    }

    public d(int i14, o oVar, i iVar, String str, String str2) {
        this.f158491a = i14;
        this.f158492b = oVar;
        this.f158493c = iVar;
        this.f158494d = str;
        this.f158495e = str2;
    }
}
