package jv2;

import am.j;
import ds.e0;
import p005kotlin.Metadata;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljv2/d;", "", "", "integerValue", "Ltv2/c;", "formattedValue", "pickerTitle", "measurementUnit", "minimum", "maximum", "granularity", "<init>", "(ILtv2/c;Ltv2/c;Ltv2/c;III)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f101198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv2.c f101199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tv2.c f101200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f101202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f101203g;

    public d(int i14, tv2.c cVar, tv2.c cVar2, tv2.c cVar3, int i15, int i16, int i17) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f101197a = i14;
        this.f101198b = cVar;
        this.f101199c = cVar2;
        this.f101200d = cVar3;
        this.f101201e = i15;
        this.f101202f = i16;
        this.f101203g = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f101197a == dVar.f101197a && this.f101198b.equals(dVar.f101198b) && this.f101199c.equals(dVar.f101199c) && this.f101200d.equals(dVar.f101200d) && this.f101201e == dVar.f101201e && this.f101202f == dVar.f101202f && this.f101203g == dVar.f101203g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101203g) + q2.d(this.f101202f, q2.d(this.f101201e, g.l(this.f101200d, g.l(this.f101199c, g.l(this.f101198b, Integer.hashCode(this.f101197a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntegerPickerOptions(integerValue=");
        sb3.append(this.f101197a);
        sb3.append(", formattedValue=");
        sb3.append(this.f101198b);
        sb3.append(", pickerTitle=");
        sb3.append(this.f101199c);
        sb3.append(", measurementUnit=");
        sb3.append(this.f101200d);
        sb3.append(", minimum=");
        e0.m(this.f101201e, this.f101202f, ", maximum=", ", granularity=", sb3);
        return j.q(sb3, this.f101203g, ")");
    }
}
