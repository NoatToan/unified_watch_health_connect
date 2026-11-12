package defpackage;

import java.net.InetSocketAddress;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.network.Exchange;

/* JADX INFO: loaded from: classes20.dex */
public final class zwt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f54697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoAP.Code f54698c;
    private final String d;

    public zwt(String str, Object obj, CoAP.Code code) {
        if (str == null) {
            throw new NullPointerException("URI must not be null");
        }
        if (obj == null) {
            throw new NullPointerException("peer's identity must not be null");
        }
        this.f54698c = code;
        this.d = str;
        this.f54697b = obj;
        int iHashCode = (str.hashCode() * 31) + obj.hashCode();
        this.f54696a = code != null ? (iHashCode * 31) + code.hashCode() : iHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zwt zwtVar = (zwt) obj;
        if (!this.f54697b.equals(zwtVar.f54697b) || !this.d.equals(zwtVar.d)) {
            return false;
        }
        CoAP.Code code = this.f54698c;
        CoAP.Code code2 = zwtVar.f54698c;
        return code == code2 || code.equals(code2);
    }

    public int hashCode() {
        return this.f54696a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KeyUri[");
        sb.append(this.f54698c);
        sb.append(", ");
        sb.append(this.d);
        Object objB = this.f54697b;
        if (objB instanceof InetSocketAddress) {
            objB = zzp.b((InetSocketAddress) objB);
        }
        sb.append(", ");
        sb.append(objB);
        sb.append("]");
        return sb.toString();
    }

    private static String c(zvg zvgVar) {
        if (zvgVar == null) {
            throw new NullPointerException("request must not be null");
        }
        return zvgVar.b() + ":" + zvgVar.getOptions().ad();
    }

    public static zwt d(Exchange exchange) {
        if (exchange == null) {
            throw new NullPointerException("exchange must not be null");
        }
        zvg zvgVarP = exchange.p();
        return new zwt(c(zvgVarP), exchange.q(), zvgVarP.a());
    }
}
