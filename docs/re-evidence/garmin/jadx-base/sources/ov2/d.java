package ov2;

import am.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lov2/d;", "", "Ltv2/c;", "formattedValue", "editTextValue", "", "maximumCodePointLength", "", "keyBoardType", "", "minimum", "maximum", "precision", "<init>", "(Ltv2/c;Ltv2/c;ILjava/lang/String;DDI)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv2.c f134264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f134265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f134266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f134267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f134268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f134269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f134270g;

    public d(tv2.c cVar, tv2.c cVar2, int i14, String str, double d14, double d15, int i15) {
        this.f134264a = cVar;
        this.f134265b = cVar2;
        this.f134266c = i14;
        this.f134267d = str;
        this.f134268e = d14;
        this.f134269f = d15;
        this.f134270g = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f134264a, dVar.f134264a) && s.g(this.f134265b, dVar.f134265b) && this.f134266c == dVar.f134266c && s.g(this.f134267d, dVar.f134267d) && Double.compare(this.f134268e, dVar.f134268e) == 0 && Double.compare(this.f134269f, dVar.f134269f) == 0 && this.f134270g == dVar.f134270g;
    }

    public final int hashCode() {
        tv2.c cVar = this.f134264a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        tv2.c cVar2 = this.f134265b;
        int iD = q2.d(this.f134266c, (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31);
        String str = this.f134267d;
        return Integer.hashCode(this.f134270g) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iD + (str != null ? str.hashCode() : 0)) * 31, 31, this.f134268e), 31, this.f134269f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EditTextOptions(formattedValue=");
        sb3.append(this.f134264a);
        sb3.append(", editTextValue=");
        sb3.append(this.f134265b);
        sb3.append(", maximumCodePointLength=");
        g.t(this.f134266c, ", keyBoardType=", this.f134267d, ", minimum=", sb3);
        sb3.append(this.f134268e);
        j.x(sb3, ", maximum=", this.f134269f, ", precision=");
        return j.q(sb3, this.f134270g, ")");
    }
}
