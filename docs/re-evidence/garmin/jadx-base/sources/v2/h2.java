package v2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\f\rB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lv2/h2;", "", "Lu2/h;", "textFieldState", "Lu2/a;", "inputTransformation", "Lv2/p;", "codepointTransformation", "Lu2/c;", "outputTransformation", "<init>", "(Lu2/h;Lu2/a;Lv2/p;Lu2/c;)V", "b", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f175038e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2.h f175039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f175040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.d0 f175041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f175042d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv2/h2$b;", "", "Lu2/e;", "text", "Lv2/g1;", "offsetMapping", "<init>", "(Lu2/e;Lv2/g1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u2.e f175044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g1 f175045b;

        public b(u2.e eVar, g1 g1Var) {
            this.f175044a = eVar;
            this.f175045b = g1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f175044a, bVar.f175044a) && p005kotlin.jvm.internal.s.g(this.f175045b, bVar.f175045b);
        }

        public final int hashCode() {
            return this.f175045b.hashCode() + (this.f175044a.hashCode() * 31);
        }

        public final String toString() {
            return "TransformedText(text=" + ((Object) this.f175044a) + ", offsetMapping=" + this.f175045b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public h2(u2.h hVar, u2.a aVar, p pVar, u2.c cVar) {
        this.f175039a = hVar;
        this.f175040b = pVar;
        this.f175041c = pVar != null ? p3.p0.f(new ug2.h(19, this, pVar)) : null;
        this.f175042d = p3.p0.n(new j1(k2.Start));
    }

    public static void h(h2 h2Var, CharSequence charSequence, x2.c cVar, boolean z14, int i14) {
        boolean z15 = (i14 & 2) == 0;
        if ((i14 & 4) != 0) {
            cVar = x2.c.MergeIfPossible;
        }
        if ((i14 & 8) != 0) {
            z14 = true;
        }
        u2.h hVar = h2Var.f175039a;
        hVar.f167847b.a().b();
        u2.d dVar = hVar.f167847b;
        if (z15) {
            dVar.e(null);
        }
        long j8 = dVar.f167833d;
        dVar.c(s5.w0.h(j8), s5.w0.g(j8), charSequence);
        int length = charSequence.length() + s5.w0.h(j8);
        og2.k.E(dVar, length, length);
        h2Var.l(dVar);
        u2.h.a(hVar, z14, cVar);
    }

    public static void i(h2 h2Var, String str, long j8, boolean z14, int i14) {
        x2.c cVar = x2.c.MergeIfPossible;
        if ((i14 & 8) != 0) {
            z14 = true;
        }
        u2.h hVar = h2Var.f175039a;
        hVar.f167847b.a().b();
        u2.d dVar = hVar.f167847b;
        long jE = h2Var.e(j8);
        dVar.c(s5.w0.h(jE), s5.w0.g(jE), str);
        int length = str.length() + s5.w0.h(jE);
        og2.k.E(dVar, length, length);
        h2Var.l(dVar);
        u2.h.a(hVar, z14, cVar);
    }

    public final void a() {
        x2.c cVar = x2.c.MergeIfPossible;
        u2.h hVar = this.f175039a;
        hVar.f167847b.a().b();
        u2.d dVar = hVar.f167847b;
        int iG = s5.w0.g(dVar.f167833d);
        og2.k.E(dVar, iG, iG);
        u2.h.a(hVar, true, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final u13.a b(g gVar, v13.c cVar) {
        i2 i2Var;
        if (cVar instanceof i2) {
            i2Var = (i2) cVar;
            int i14 = i2Var.f175060c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i2Var.f175060c = i14 - Integer.MIN_VALUE;
            } else {
                i2Var = new i2(this, cVar);
            }
        } else {
            i2Var = new i2(this, cVar);
        }
        Object obj = i2Var.f175058a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i2Var.f175060c;
        if (i15 == 0) {
            o13.r.b(obj);
            i2Var.f175060c = 1;
            o53.k kVar = new o53.k(u13.f.b(i2Var), 1);
            kVar.q();
            this.f175039a.f167851f.b(gVar);
            kVar.r(new j2(this, gVar));
            if (kVar.p() == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    public final void c() {
        x2.c cVar = x2.c.NeverMerge;
        u2.h hVar = this.f175039a;
        hVar.f167847b.a().b();
        u2.d dVar = hVar.f167847b;
        dVar.c(s5.w0.h(dVar.f167833d), s5.w0.g(dVar.f167833d), "");
        int iH = s5.w0.h(dVar.f167833d);
        og2.k.E(dVar, iH, iH);
        l(dVar);
        u2.h.a(hVar, true, cVar);
    }

    public final u2.e d() {
        b bVar;
        u2.e eVar;
        p3.d0 d0Var = this.f175041c;
        return (d0Var == null || (bVar = (b) d0Var.getF182175a()) == null || (eVar = bVar.f175044a) == null) ? this.f175039a.b() : eVar;
    }

    public final long e(long j8) {
        b bVar;
        p3.d0 d0Var = this.f175041c;
        g1 g1Var = (d0Var == null || (bVar = (b) d0Var.getF182175a()) == null) ? null : bVar.f175045b;
        if (g1Var == null) {
            return j8;
        }
        f175038e.getClass();
        s5.w0.a aVar = s5.w0.f157315b;
        long jA = g1Var.a((int) (j8 >> 32), false);
        long jA2 = s5.w0.e(j8) ? jA : g1Var.a((int) (4294967295L & j8), false);
        int iMin = Math.min(s5.w0.h(jA), s5.w0.h(jA2));
        int iMax = Math.max(s5.w0.g(jA), s5.w0.g(jA2));
        return s5.w0.i(j8) ? og.a.l(iMax, iMin) : og.a.l(iMin, iMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return p005kotlin.jvm.internal.s.g(this.f175039a, h2Var.f175039a) && p005kotlin.jvm.internal.s.g(this.f175040b, h2Var.f175040b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f(long j8) {
        b bVar;
        p3.d0 d0Var = this.f175041c;
        g1 g1Var = (d0Var == null || (bVar = (b) d0Var.getF182175a()) == null) ? null : bVar.f175045b;
        if (g1Var == null) {
            return j8;
        }
        j1 j1Var = (j1) this.f175042d.getF182175a();
        f175038e.getClass();
        return a.a(j8, g1Var, j1Var);
    }

    public final void g(CharSequence charSequence) {
        x2.c cVar = x2.c.MergeIfPossible;
        u2.h hVar = this.f175039a;
        hVar.f167847b.a().b();
        u2.d dVar = hVar.f167847b;
        dVar.c(0, dVar.f167831b.length(), "");
        dVar.append(charSequence.toString());
        l(dVar);
        u2.h.a(hVar, true, cVar);
    }

    public final int hashCode() {
        int iHashCode = this.f175039a.hashCode() * 31;
        p pVar = this.f175040b;
        return (iHashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
    }

    public final void j(long j8) {
        k(e(j8));
    }

    public final void k(long j8) {
        x2.c cVar = x2.c.MergeIfPossible;
        u2.h hVar = this.f175039a;
        hVar.f167847b.a().b();
        u2.d dVar = hVar.f167847b;
        s5.w0.a aVar = s5.w0.f157315b;
        og2.k.E(dVar, (int) (j8 >> 32), (int) (j8 & 4294967295L));
        u2.h.a(hVar, true, cVar);
    }

    public final void l(u2.d dVar) {
        if (dVar.a().f175101a.f142358c <= 0 || !s5.w0.e(dVar.f167833d)) {
            return;
        }
        this.f175042d.setValue(new j1(k2.Start));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TransformedTextFieldState(textFieldState=");
        u2.h hVar = this.f175039a;
        sb3.append(hVar);
        sb3.append(", outputTransformation=null, outputTransformedText=null, codepointTransformation=");
        sb3.append(this.f175040b);
        sb3.append(", codepointTransformedText=");
        sb3.append(this.f175041c);
        sb3.append(", outputText=\"");
        sb3.append((Object) hVar.b());
        sb3.append("\", visualText=\"");
        sb3.append((Object) d());
        sb3.append("\")");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/h2$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: v2.h2$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3260a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f175043a;

            static {
                int[] iArr = new int[k2.values().length];
                try {
                    iArr[k2.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k2.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f175043a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static long a(long j8, g1 g1Var, j1 j1Var) {
            long jL;
            s5.w0.a aVar = s5.w0.f157315b;
            long jA = g1Var.a((int) (j8 >> 32), true);
            long jA2 = s5.w0.e(j8) ? jA : g1Var.a((int) (j8 & 4294967295L), true);
            k2 k2Var = null;
            k2 k2Var2 = j1Var != null ? j1Var.f175066a : null;
            if (s5.w0.e(j8)) {
                k2Var = k2Var2;
            } else if (j1Var != null) {
                k2Var = j1Var.f175067b;
            }
            if (k2Var2 != null && !s5.w0.e(jA)) {
                int i14 = C3260a.f175043a[k2Var2.ordinal()];
                if (i14 == 1) {
                    int i15 = (int) (jA >> 32);
                    jA = og.a.l(i15, i15);
                } else {
                    if (i14 != 2) {
                        lc.u0.r();
                        return 0L;
                    }
                    int i16 = (int) (jA & 4294967295L);
                    jA = og.a.l(i16, i16);
                }
            }
            if (k2Var != null && !s5.w0.e(jA2)) {
                int i17 = C3260a.f175043a[k2Var.ordinal()];
                if (i17 == 1) {
                    int i18 = (int) (jA2 >> 32);
                    jL = og.a.l(i18, i18);
                } else {
                    if (i17 != 2) {
                        lc.u0.r();
                        return 0L;
                    }
                    int i19 = (int) (jA2 & 4294967295L);
                    jL = og.a.l(i19, i19);
                }
                jA2 = jL;
            }
            int iMin = Math.min(s5.w0.h(jA), s5.w0.h(jA2));
            int iMax = Math.max(s5.w0.g(jA), s5.w0.g(jA2));
            return s5.w0.i(j8) ? og.a.l(iMax, iMin) : og.a.l(iMin, iMax);
        }

        private a() {
        }
    }

    public /* synthetic */ h2(u2.h hVar, u2.a aVar, p pVar, u2.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(hVar, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : pVar, (i14 & 8) != 0 ? null : cVar);
    }
}
