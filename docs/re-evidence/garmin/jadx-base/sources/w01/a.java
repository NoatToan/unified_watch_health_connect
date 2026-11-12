package w01;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw01/a;", "", "", "totalValue", "intervalValue", "", "intervalInSeconds", "", "Lq22/b;", "units", "selUnit", "<init>", "(DDILjava/util/List;Lq22/b;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f181004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f181005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f181006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q22.b> f181007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q22.b f181008e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(double d14, double d15, int i14, List<? extends q22.b> list, q22.b bVar) {
        list.getClass();
        bVar.getClass();
        this.f181004a = d14;
        this.f181005b = d15;
        this.f181006c = i14;
        this.f181007d = list;
        this.f181008e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f181004a, aVar.f181004a) == 0 && Double.compare(this.f181005b, aVar.f181005b) == 0 && this.f181006c == aVar.f181006c && this.f181007d.equals(aVar.f181007d) && this.f181008e == aVar.f181008e;
    }

    public final int hashCode() {
        return this.f181008e.hashCode() + u0.b(q2.d(this.f181006c, org.apache.commons.lang3.e.b(Double.hashCode(this.f181004a) * 31, 31, this.f181005b), 31), 31, this.f181007d);
    }

    public final String toString() {
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("HydrationRecommendation(totalValue=", this.f181004a, ", intervalValue=");
        sbA.append(this.f181005b);
        sbA.append(", intervalInSeconds=");
        sbA.append(this.f181006c);
        sbA.append(", units=");
        sbA.append(this.f181007d);
        sbA.append(", selUnit=");
        sbA.append(this.f181008e);
        sbA.append(")");
        return sbA.toString();
    }
}
