package gv2;

import am.j;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgv2/d;", "", "", "floatValue", "Ltv2/c;", "formattedValue", "pickerTitle", "measurementUnit", "minimum", "maximum", "", "precision", "granularity", "<init>", "(DLtv2/c;Ltv2/c;Ltv2/c;DDID)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f79454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f79455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv2.c f79456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tv2.c f79457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f79458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f79459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f79460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f79461h;

    public d(double d14, tv2.c cVar, tv2.c cVar2, tv2.c cVar3, double d15, double d16, int i14, double d17) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f79454a = d14;
        this.f79455b = cVar;
        this.f79456c = cVar2;
        this.f79457d = cVar3;
        this.f79458e = d15;
        this.f79459f = d16;
        this.f79460g = i14;
        this.f79461h = d17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Double.compare(this.f79454a, dVar.f79454a) == 0 && this.f79455b.equals(dVar.f79455b) && this.f79456c.equals(dVar.f79456c) && this.f79457d.equals(dVar.f79457d) && Double.compare(this.f79458e, dVar.f79458e) == 0 && Double.compare(this.f79459f, dVar.f79459f) == 0 && this.f79460g == dVar.f79460g && Double.compare(this.f79461h, dVar.f79461h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f79461h) + q2.d(this.f79460g, org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(wr.g.l(this.f79457d, wr.g.l(this.f79456c, wr.g.l(this.f79455b, Double.hashCode(this.f79454a) * 31, 31), 31), 31), 31, this.f79458e), 31, this.f79459f), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FloatPickerOptions(floatValue=");
        sb3.append(this.f79454a);
        sb3.append(", formattedValue=");
        sb3.append(this.f79455b);
        sb3.append(", pickerTitle=");
        sb3.append(this.f79456c);
        sb3.append(", measurementUnit=");
        sb3.append(this.f79457d);
        j.x(sb3, ", minimum=", this.f79458e, ", maximum=");
        sb3.append(this.f79459f);
        sb3.append(", precision=");
        sb3.append(this.f79460g);
        return j.r(sb3, ", granularity=", this.f79461h, ")");
    }
}
