package iv2;

import ds.e0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liv2/d;", "", "", "integerValue", "Ltv2/c;", "formattedValue", "measurementUnit", "minimum", "maximum", "default", "title", "informationMessage", "errorMessage", "<init>", "(ILtv2/c;Ltv2/c;IIILtv2/c;Ltv2/c;Ltv2/c;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f95224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv2.c f95225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f95227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f95228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tv2.c f95229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tv2.c f95230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tv2.c f95231i;

    public d(int i14, tv2.c cVar, tv2.c cVar2, int i15, int i16, int i17, tv2.c cVar3, tv2.c cVar4, tv2.c cVar5) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        cVar5.getClass();
        this.f95223a = i14;
        this.f95224b = cVar;
        this.f95225c = cVar2;
        this.f95226d = i15;
        this.f95227e = i16;
        this.f95228f = i17;
        this.f95229g = cVar3;
        this.f95230h = cVar4;
        this.f95231i = cVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f95223a == dVar.f95223a && this.f95224b.equals(dVar.f95224b) && this.f95225c.equals(dVar.f95225c) && this.f95226d == dVar.f95226d && this.f95227e == dVar.f95227e && this.f95228f == dVar.f95228f && this.f95229g.equals(dVar.f95229g) && this.f95230h.equals(dVar.f95230h) && this.f95231i.equals(dVar.f95231i);
    }

    public final int hashCode() {
        return this.f95231i.hashCode() + wr.g.l(this.f95230h, wr.g.l(this.f95229g, q2.d(this.f95228f, q2.d(this.f95227e, q2.d(this.f95226d, wr.g.l(this.f95225c, wr.g.l(this.f95224b, Integer.hashCode(this.f95223a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntegerInputOptions(integerValue=");
        sb3.append(this.f95223a);
        sb3.append(", formattedValue=");
        sb3.append(this.f95224b);
        sb3.append(", measurementUnit=");
        sb3.append(this.f95225c);
        sb3.append(", minimum=");
        sb3.append(this.f95226d);
        sb3.append(", maximum=");
        e0.m(this.f95227e, this.f95228f, ", default=", ", title=", sb3);
        sb3.append(this.f95229g);
        sb3.append(", informationMessage=");
        sb3.append(this.f95230h);
        sb3.append(", errorMessage=");
        sb3.append(this.f95231i);
        sb3.append(")");
        return sb3.toString();
    }
}
