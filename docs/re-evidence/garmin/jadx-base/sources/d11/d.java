package d11;

import b11.v;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld11/d;", "", "", TtmlNode.ATTR_ID, "", "name", "Li53/c;", "Lb11/v;", "foods", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Li53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f57057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<v> f57059c;

    public d(Long l14, String str, i53.c cVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? l.b() : cVar);
    }

    public static d a(d dVar, Long l14, String str, i53.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            l14 = dVar.f57057a;
        }
        if ((i14 & 2) != 0) {
            str = dVar.f57058b;
        }
        if ((i14 & 4) != 0) {
            cVar = dVar.f57059c;
        }
        dVar.getClass();
        cVar.getClass();
        return new d(l14, str, cVar);
    }

    public final b11.f b() {
        Double dValueOf = Double.valueOf(0.0d);
        b11.f fVar = new b11.f(0, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf);
        for (v vVar : this.f57059c) {
            fVar = fVar.d(vVar.E().f(vVar.getF14235b()));
        }
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f57057a, dVar.f57057a) && s.g(this.f57058b, dVar.f57058b) && s.g(this.f57059c, dVar.f57059c);
    }

    public final int hashCode() {
        Long l14 = this.f57057a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f57058b;
        return this.f57059c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return l2.e(b71.i.j("CustomMealData(id=", ", name=", this.f57058b, this.f57057a, ", foods="), this.f57059c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Long l14, String str, i53.c<? extends v> cVar) {
        cVar.getClass();
        this.f57057a = l14;
        this.f57058b = str;
        this.f57059c = cVar;
    }

    public d() {
        this(null, null, null, 7, null);
    }
}
