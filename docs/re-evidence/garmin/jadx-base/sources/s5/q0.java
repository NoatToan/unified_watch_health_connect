package s5;

import ch.qos.logback.core.CoreConstants;
import i3.e5;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls5/q0;", "", "Ls5/p0;", "layoutInput", "Ls5/o;", "multiParagraph", "Lg6/m;", "size", "<init>", "(Ls5/p0;Ls5/o;JLkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f157280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f157281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f157282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f157283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f157284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f157285f;

    private q0(p0 p0Var, o oVar, long j8) {
        this.f157280a = p0Var;
        this.f157281b = oVar;
        this.f157282c = j8;
        ArrayList arrayList = oVar.f157259h;
        float fL = 0.0f;
        this.f157283d = arrayList.isEmpty() ? 0.0f : ((s) arrayList.get(0)).f157290a.g();
        ArrayList arrayList2 = oVar.f157259h;
        if (!arrayList2.isEmpty()) {
            s sVar = (s) p13.h0.m0(arrayList2);
            fL = sVar.f157290a.l() + sVar.f157295f;
        }
        this.f157284e = fL;
        this.f157285f = oVar.f157258g;
    }

    public final d6.g a(int i14) {
        o oVar = this.f157281b;
        oVar.n(i14);
        int length = oVar.f157252a.f157275a.f157138b.length();
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(i14 == length ? p13.x.j(arrayList) : oe2.f.p(i14, arrayList));
        return sVar.f157290a.x(sVar.d(i14));
    }

    public final n4.d b(int i14) {
        o oVar = this.f157281b;
        oVar.m(i14);
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(oe2.f.p(i14, arrayList));
        return sVar.a(sVar.f157290a.a(sVar.d(i14)));
    }

    public final n4.d c(int i14) {
        o oVar = this.f157281b;
        oVar.n(i14);
        int length = oVar.f157252a.f157275a.f157138b.length();
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(i14 == length ? p13.x.j(arrayList) : oe2.f.p(i14, arrayList));
        return sVar.a(sVar.f157290a.j(sVar.d(i14)));
    }

    public final boolean d() {
        o oVar = this.f157281b;
        return oVar.f157254c || ((float) ((int) (this.f157282c & 4294967295L))) < oVar.f157256e;
    }

    public final boolean e() {
        return ((float) ((int) (this.f157282c >> 32))) < this.f157281b.f157255d || d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return p005kotlin.jvm.internal.s.g(this.f157280a, q0Var.f157280a) && p005kotlin.jvm.internal.s.g(this.f157281b, q0Var.f157281b) && g6.m.c(this.f157282c, q0Var.f157282c) && this.f157283d == q0Var.f157283d && this.f157284e == q0Var.f157284e && p005kotlin.jvm.internal.s.g(this.f157285f, q0Var.f157285f);
    }

    public final float f(int i14, boolean z14) {
        o oVar = this.f157281b;
        oVar.n(i14);
        int length = oVar.f157252a.f157275a.f157138b.length();
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(i14 == length ? p13.x.j(arrayList) : oe2.f.p(i14, arrayList));
        return sVar.f157290a.w(sVar.d(i14), z14);
    }

    public final float g(int i14) {
        o oVar = this.f157281b;
        oVar.o(i14);
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(oe2.f.q(i14, arrayList));
        return sVar.f157290a.c(i14 - sVar.f157293d);
    }

    public final float h(int i14) {
        o oVar = this.f157281b;
        oVar.o(i14);
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(oe2.f.q(i14, arrayList));
        return sVar.f157290a.d(i14 - sVar.f157293d);
    }

    public final int hashCode() {
        int iHashCode = (this.f157281b.hashCode() + (this.f157280a.hashCode() * 31)) * 31;
        g6.m.a aVar = g6.m.f76012b;
        return this.f157285f.hashCode() + q6.f.d(this.f157284e, q6.f.d(this.f157283d, q6.f.e(iHashCode, 31, this.f157282c), 31), 31);
    }

    public final int i(int i14) {
        o oVar = this.f157281b;
        oVar.o(i14);
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(oe2.f.q(i14, arrayList));
        return sVar.f157290a.h(i14 - sVar.f157293d) + sVar.f157291b;
    }

    public final d6.g j(int i14) {
        o oVar = this.f157281b;
        oVar.n(i14);
        int length = oVar.f157252a.f157275a.f157138b.length();
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(i14 == length ? p13.x.j(arrayList) : oe2.f.p(i14, arrayList));
        return sVar.f157290a.e(sVar.d(i14));
    }

    public final o4.j k(int i14, int i15) {
        o oVar = this.f157281b;
        q qVar = oVar.f157252a;
        if (i14 < 0 || i14 > i15 || i15 > qVar.f157275a.f157138b.length()) {
            StringBuilder sbJ = e5.j(i14, i15, "Start(", ") or End(", ") is out of range [0..");
            sbJ.append(qVar.f157275a.f157138b.length());
            sbJ.append("), or start > end!");
            y5.a.a(sbJ.toString());
        }
        if (i14 == i15) {
            return o4.m.a();
        }
        o4.j jVarA = o4.m.a();
        oe2.f.s(oVar.f157259h, og.a.l(i14, i15), new r21.e(jVarA, i14, i15, 2));
        return jVarA;
    }

    public final long l(int i14) {
        o oVar = this.f157281b;
        oVar.n(i14);
        int length = oVar.f157252a.f157275a.f157138b.length();
        ArrayList arrayList = oVar.f157259h;
        s sVar = (s) arrayList.get(i14 == length ? p13.x.j(arrayList) : oe2.f.p(i14, arrayList));
        return sVar.b(sVar.f157290a.n(sVar.d(i14)), false);
    }

    public final boolean m(int i14) {
        o oVar = this.f157281b;
        oVar.o(i14);
        ArrayList arrayList = oVar.f157259h;
        return ((s) arrayList.get(oe2.f.q(i14, arrayList))).f157290a.u(i14);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f157280a + ", multiParagraph=" + this.f157281b + ", size=" + ((Object) g6.m.d(this.f157282c)) + ", firstBaseline=" + this.f157283d + ", lastBaseline=" + this.f157284e + ", placeholderRects=" + this.f157285f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ q0(p0 p0Var, o oVar, long j8, p005kotlin.jvm.internal.j jVar) {
        this(p0Var, oVar, j8);
    }
}
