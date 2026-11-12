package x5;

import p005kotlin.Metadata;
import s5.w0;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Lx5/m;", "", "Ls5/c;", "text", "Ls5/w0;", "selection", "<init>", "(Ls5/c;JLkotlin/jvm/internal/j;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/j;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f188881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f188882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f188883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f188884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f188885e;

    static {
        new a(null);
    }

    private m(s5.c cVar, long j8) {
        String str = cVar.f157138b;
        this.f188881a = new d0(str);
        this.f188882b = w0.h(j8);
        this.f188883c = w0.g(j8);
        this.f188884d = -1;
        this.f188885e = -1;
        int iH = w0.h(j8);
        int iG = w0.g(j8);
        if (iH < 0 || iH > str.length()) {
            l2.j(str.length(), b71.i.i(iH, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iG < 0 || iG > str.length()) {
            l2.j(str.length(), b71.i.i(iG, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iH <= iG) {
            return;
        }
        vb.h.s(tn.k.e(iH, iG, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i14, int i15) {
        long jL = og.a.l(i14, i15);
        this.f188881a.b(i14, i15, "");
        long jB = w02.b0.B(og.a.l(this.f188882b, this.f188883c), jL);
        j(w0.h(jB));
        i(w0.g(jB));
        if (e()) {
            long jB2 = w02.b0.B(og.a.l(this.f188884d, this.f188885e), jL);
            if (w0.e(jB2)) {
                this.f188884d = -1;
                this.f188885e = -1;
            } else {
                this.f188884d = w0.h(jB2);
                this.f188885e = w0.g(jB2);
            }
        }
    }

    public final char b(int i14) {
        d0 d0Var = this.f188881a;
        o oVar = d0Var.f188831b;
        if (oVar != null && i14 >= d0Var.f188832c) {
            int iA = oVar.f188913a - oVar.a();
            int i15 = d0Var.f188832c;
            if (i14 >= iA + i15) {
                return d0Var.f188830a.charAt(i14 - ((iA - d0Var.f188833d) + i15));
            }
            int i16 = i14 - i15;
            int i17 = oVar.f188915c;
            char[] cArr = oVar.f188914b;
            return i16 < i17 ? cArr[i16] : cArr[(i16 - i17) + oVar.f188916d];
        }
        return d0Var.f188830a.charAt(i14);
    }

    public final w0 c() {
        if (e()) {
            return w0.a(og.a.l(this.f188884d, this.f188885e));
        }
        return null;
    }

    public final int d() {
        int i14 = this.f188882b;
        int i15 = this.f188883c;
        if (i14 == i15) {
            return i15;
        }
        return -1;
    }

    public final boolean e() {
        return this.f188884d != -1;
    }

    public final void f(int i14, int i15, String str) {
        d0 d0Var = this.f188881a;
        if (i14 < 0 || i14 > d0Var.a()) {
            l2.j(d0Var.a(), b71.i.i(i14, "start (", ") offset is outside of text region "));
            return;
        }
        if (i15 < 0 || i15 > d0Var.a()) {
            l2.j(d0Var.a(), b71.i.i(i15, "end (", ") offset is outside of text region "));
        } else {
            if (i14 > i15) {
                vb.h.s(tn.k.e(i14, i15, "Do not set reversed range: ", " > "));
                return;
            }
            d0Var.b(i14, i15, str);
            j(str.length() + i14);
            i(str.length() + i14);
            this.f188884d = -1;
            this.f188885e = -1;
        }
    }

    public final void g(int i14, int i15) {
        d0 d0Var = this.f188881a;
        if (i14 < 0 || i14 > d0Var.a()) {
            l2.j(d0Var.a(), b71.i.i(i14, "start (", ") offset is outside of text region "));
        } else if (i15 < 0 || i15 > d0Var.a()) {
            l2.j(d0Var.a(), b71.i.i(i15, "end (", ") offset is outside of text region "));
        } else if (i14 >= i15) {
            vb.h.s(tn.k.e(i14, i15, "Do not set reversed or empty range: ", " > "));
        } else {
            this.f188884d = i14;
            this.f188885e = i15;
        }
    }

    public final void h(int i14, int i15) {
        d0 d0Var = this.f188881a;
        if (i14 < 0 || i14 > d0Var.a()) {
            l2.j(d0Var.a(), b71.i.i(i14, "start (", ") offset is outside of text region "));
        } else if (i15 < 0 || i15 > d0Var.a()) {
            l2.j(d0Var.a(), b71.i.i(i15, "end (", ") offset is outside of text region "));
        } else if (i14 > i15) {
            vb.h.s(tn.k.e(i14, i15, "Do not set reversed range: ", " > "));
        } else {
            j(i14);
            i(i15);
        }
    }

    public final void i(int i14) {
        if (!(i14 >= 0)) {
            y5.a.a("Cannot set selectionEnd to a negative value: " + i14);
        }
        this.f188883c = i14;
    }

    public final void j(int i14) {
        if (!(i14 >= 0)) {
            y5.a.a("Cannot set selectionStart to a negative value: " + i14);
        }
        this.f188882b = i14;
    }

    public final String toString() {
        return this.f188881a.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx5/m$a;", "", "<init>", "()V", "", "NOWHERE", "I", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ m(s5.c cVar, long j8, p005kotlin.jvm.internal.j jVar) {
        this(cVar, j8);
    }

    public /* synthetic */ m(String str, long j8, p005kotlin.jvm.internal.j jVar) {
        this(str, j8);
    }

    private m(String str, long j8) {
        this(new s5.c(str, null, 2, null), j8, (p005kotlin.jvm.internal.j) null);
    }
}
