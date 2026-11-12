package u2;

import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import s5.w0;
import v2.g1;
import v2.h1;
import v2.o;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lu2/d;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Lu2/e;", "initialValue", "Lv2/o;", "initialChanges", "originalValue", "Lv2/g1;", "offsetMappingCalculator", "<init>", "(Lu2/e;Lv2/o;Lu2/e;Lv2/g1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f167830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f167831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f167832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f167833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f167834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q3.c<s5.c.d<s5.c.a>> f167835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p<j, w0> f167836g;

    public d(e eVar, o oVar, e eVar2, g1 g1Var) {
        this.f167830a = g1Var;
        this.f167831b = new h1(eVar);
        q3.c<s5.c.d<s5.c.a>> cVar = null;
        this.f167832c = oVar != null ? new o(oVar) : null;
        long j8 = eVar.f167840d;
        List<s5.c.d<s5.c.a>> list = eVar.f167837a;
        this.f167833d = j8;
        this.f167834e = eVar.f167841e;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            s5.c.d[] dVarArr = new s5.c.d[size];
            for (int i14 = 0; i14 < size; i14++) {
                dVarArr[i14] = list.get(i14);
            }
            cVar = new q3.c<>(dVarArr, size);
        }
        this.f167835f = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    public static e g(d dVar, long j8, w0 w0Var, int i14) {
        List<s5.c.d<s5.c.a>> list;
        if ((i14 & 1) != 0) {
            j8 = dVar.f167833d;
        }
        long j14 = j8;
        if ((i14 & 2) != 0) {
            w0Var = dVar.f167834e;
        }
        w0 w0Var2 = w0Var;
        q3.c<s5.c.d<s5.c.a>> cVar = dVar.f167835f;
        if (cVar != null) {
            List<s5.c.d<s5.c.a>> listF = cVar.f();
            if (((q3.c.a) listF).isEmpty()) {
                list = null;
            } else {
                list = listF;
            }
        } else {
            list = null;
        }
        return new e(dVar.f167831b.toString(), j14, w0Var2, null, list, null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o a() {
        o oVar = this.f167832c;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(null, 1, 0 == true ? 1 : 0);
        this.f167832c = oVar2;
        return oVar2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            h1 h1Var = this.f167831b;
            b(h1Var.length(), h1Var.length(), charSequence.length());
            h1Var.a(h1Var.length(), h1Var.length(), charSequence.length(), charSequence);
        }
        return this;
    }

    public final void b(int i14, int i15, int i16) {
        int i17;
        o oVarA = a();
        if (i14 != i15 || i16 != 0) {
            int iMin = Math.min(i14, i15);
            int iMax = Math.max(i14, i15);
            int i18 = i16 - (iMax - iMin);
            int i19 = 0;
            o.a aVar = null;
            boolean z14 = false;
            while (true) {
                q3.c<o.a> cVar = oVarA.f175101a;
                if (i19 >= cVar.f142358c) {
                    break;
                }
                o.a aVar2 = cVar.f142356a[i19];
                int i24 = aVar2.f175103a;
                if ((iMin > i24 || i24 > iMax) && ((iMin > (i17 = aVar2.f175104b) || i17 > iMax) && ((iMin > i17 || i24 > iMin) && (iMax > i17 || i24 > iMax)))) {
                    if (i24 > iMax && !z14) {
                        oVarA.a(aVar, iMin, iMax, i18);
                        z14 = true;
                    }
                    if (z14) {
                        aVar2.f175103a += i18;
                        aVar2.f175104b += i18;
                    }
                    oVarA.f175102b.b(aVar2);
                } else if (aVar == null) {
                    aVar = aVar2;
                } else {
                    aVar.f175104b = aVar2.f175104b;
                    aVar.f175106d = aVar2.f175106d;
                }
                i19++;
            }
            if (!z14) {
                oVarA.a(aVar, iMin, iMax, i18);
            }
            q3.c<o.a> cVar2 = oVarA.f175101a;
            oVarA.f175101a = oVarA.f175102b;
            oVarA.f175102b = cVar2;
            cVar2.g();
        }
        g1 g1Var = this.f167830a;
        if (g1Var != null) {
            g1Var.c(i14, i15, i16);
        }
        this.f167833d = og2.k.m(i14, i15, i16, this.f167833d);
    }

    public final void c(int i14, int i15, CharSequence charSequence) {
        int length = charSequence.length();
        if (i14 > i15) {
            b2.e.a("Expected start=" + i14 + " <= end=" + i15);
        }
        if (length < 0) {
            b2.e.a("Expected textStart=0 <= textEnd=" + length);
        }
        b(i14, i15, length);
        this.f167831b.a(i14, i15, length, charSequence);
        e(null);
        this.f167836g = null;
    }

    public final void d(int i14, int i15, List<s5.c.d<s5.c.a>> list) {
        h1 h1Var = this.f167831b;
        if (i14 < 0 || i14 > h1Var.length()) {
            l2.j(h1Var.length(), b71.i.i(i14, "start (", ") offset is outside of text region "));
            return;
        }
        if (i15 < 0 || i15 > h1Var.length()) {
            l2.j(h1Var.length(), b71.i.i(i15, "end (", ") offset is outside of text region "));
            return;
        }
        if (i14 >= i15) {
            vb.h.s(tn.k.e(i14, i15, "Do not set reversed or empty range: ", " > "));
            return;
        }
        e(w0.a(og.a.l(i14, i15)));
        q3.c<s5.c.d<s5.c.a>> cVar = this.f167835f;
        if (cVar != null) {
            cVar.g();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.f167835f == null) {
            this.f167835f = new q3.c<>(new s5.c.d[16], 0);
        }
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            s5.c.d<s5.c.a> dVar = list.get(i16);
            q3.c<s5.c.d<s5.c.a>> cVar2 = this.f167835f;
            if (cVar2 != null) {
                cVar2.b(s5.c.d.a(dVar, null, dVar.f157150b + i14, dVar.f157151c + i14, 9));
            }
        }
    }

    public final void e(w0 w0Var) {
        if (w0Var != null && !w0.e(w0Var.f157317a)) {
            this.f167834e = w0Var;
            return;
        }
        this.f167834e = null;
        q3.c<s5.c.d<s5.c.a>> cVar = this.f167835f;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void f(long j8) {
        long jL = og.a.l(0, this.f167831b.length());
        if (!w0.b(jL, j8)) {
            b2.e.a("Expected " + ((Object) w0.j(j8)) + " to be in " + ((Object) w0.j(jL)));
        }
        this.f167833d = j8;
        this.f167836g = null;
    }

    public final String toString() {
        return this.f167831b.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c14) {
        h1 h1Var = this.f167831b;
        b(h1Var.length(), h1Var.length(), 1);
        int length = h1Var.length();
        int length2 = h1Var.length();
        String strValueOf = String.valueOf(c14);
        h1Var.a(length, length2, strValueOf.length(), strValueOf);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i14, int i15) {
        if (charSequence != null) {
            h1 h1Var = this.f167831b;
            b(h1Var.length(), h1Var.length(), i15 - i14);
            int length = h1Var.length();
            int length2 = h1Var.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i14, i15);
            h1Var.a(length, length2, charSequenceSubSequence.length(), charSequenceSubSequence);
        }
        return this;
    }

    public /* synthetic */ d(e eVar, o oVar, e eVar2, g1 g1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(eVar, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? eVar : eVar2, (i14 & 8) != 0 ? null : g1Var);
    }
}
