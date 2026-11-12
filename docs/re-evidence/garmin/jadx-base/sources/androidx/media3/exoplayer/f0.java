package androidx.media3.exoplayer;

import android.util.Pair;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa.n[] f8940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g0 f8945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean[] f8947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u0[] f8948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wa.l f8949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f8950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f0 f8951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sa.r f8952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public wa.m f8953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8954q;

    public interface a {
    }

    public f0(u0[] u0VarArr, long j8, wa.l lVar, xa.b bVar, o0 o0Var, g0 g0Var, wa.m mVar, long j14) {
        this.f8948k = u0VarArr;
        this.f8954q = j8;
        this.f8949l = lVar;
        this.f8950m = o0Var;
        androidx.media3.exoplayer.source.j.b bVar2 = g0Var.f8967a;
        this.f8939b = bVar2.f9519a;
        this.f8945h = g0Var;
        this.f8941d = j14;
        this.f8952o = sa.r.f158151d;
        this.f8953p = mVar;
        this.f8940c = new sa.n[u0VarArr.length];
        this.f8947j = new boolean[u0VarArr.length];
        long j15 = g0Var.f8968b;
        long j16 = g0Var.f8970d;
        o0Var.getClass();
        Object obj = bVar2.f9519a;
        int i14 = androidx.media3.exoplayer.a.f8662e;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        androidx.media3.exoplayer.source.j.b bVarA = bVar2.a(pair.second);
        o0.c cVar = (o0.c) o0Var.f9296d.get(obj2);
        cVar.getClass();
        o0Var.f9299g.add(cVar);
        o0.b bVar3 = o0Var.f9298f.get(cVar);
        if (bVar3 != null) {
            bVar3.f9307a.e(bVar3.f9308b);
        }
        cVar.f9312c.add(bVarA);
        androidx.media3.exoplayer.source.i iVarC = cVar.f9310a.c(bVarA, bVar, j15);
        o0Var.f9295c.put(iVarC, cVar);
        o0Var.c();
        this.f8938a = j16 != C.TIME_UNSET ? new androidx.media3.exoplayer.source.b(iVarC, true, 0L, j16) : iVarC;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    public final long a(wa.m mVar, long j8, boolean z14, boolean[] zArr) {
        u0[] u0VarArr;
        sa.n[] nVarArr;
        int i14 = 0;
        while (true) {
            boolean z15 = true;
            if (i14 >= mVar.f183755a) {
                break;
            }
            if (z14 || !mVar.a(this.f8953p, i14)) {
                z15 = false;
            }
            this.f8947j[i14] = z15;
            i14++;
        }
        int i15 = 0;
        while (true) {
            u0VarArr = this.f8948k;
            int length = u0VarArr.length;
            nVarArr = this.f8940c;
            if (i15 >= length) {
                break;
            }
            if (((f) u0VarArr[i15]).f8922b == -2) {
                nVarArr[i15] = null;
            }
            i15++;
        }
        b();
        this.f8953p = mVar;
        c();
        long jD = this.f8938a.d(mVar.f183757c, this.f8947j, this.f8940c, zArr, j8);
        for (int i16 = 0; i16 < u0VarArr.length; i16++) {
            if (((f) u0VarArr[i16]).f8922b == -2 && this.f8953p.b(i16)) {
                nVarArr[i16] = new sa.g();
            }
        }
        this.f8944g = false;
        for (int i17 = 0; i17 < nVarArr.length; i17++) {
            if (nVarArr[i17] != null) {
                fa.a.d(mVar.b(i17));
                if (((f) u0VarArr[i17]).f8922b != -2) {
                    this.f8944g = true;
                }
            } else {
                fa.a.d(mVar.f183757c[i17] == null);
            }
        }
        return jD;
    }

    public final void b() {
        if (this.f8951n != null) {
            return;
        }
        int i14 = 0;
        while (true) {
            wa.m mVar = this.f8953p;
            if (i14 >= mVar.f183755a) {
                return;
            }
            boolean zB = mVar.b(i14);
            wa.g gVar = this.f8953p.f183757c[i14];
            if (zB && gVar != null) {
                gVar.disable();
            }
            i14++;
        }
    }

    public final void c() {
        if (this.f8951n != null) {
            return;
        }
        int i14 = 0;
        while (true) {
            wa.m mVar = this.f8953p;
            if (i14 >= mVar.f183755a) {
                return;
            }
            boolean zB = mVar.b(i14);
            wa.g gVar = this.f8953p.f183757c[i14];
            if (zB && gVar != null) {
                gVar.enable();
            }
            i14++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.media3.exoplayer.source.s, java.lang.Object] */
    public final long d() {
        if (!this.f8943f) {
            return this.f8945h.f8968b;
        }
        long bufferedPositionUs = this.f8944g ? this.f8938a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f8945h.f8971e : bufferedPositionUs;
    }

    public final long e() {
        return this.f8945h.f8968b + this.f8954q;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    public final void f(float f14, androidx.media3.common.d0 d0Var, boolean z14) {
        this.f8943f = true;
        this.f8952o = this.f8938a.getTrackGroups();
        wa.m mVarJ = j(f14, d0Var, z14);
        g0 g0Var = this.f8945h;
        long jMax = g0Var.f8968b;
        long j8 = g0Var.f8971e;
        if (j8 != C.TIME_UNSET && jMax >= j8) {
            jMax = Math.max(0L, j8 - 1);
        }
        long jA = a(mVarJ, jMax, false, new boolean[this.f8948k.length]);
        long j14 = this.f8954q;
        g0 g0Var2 = this.f8945h;
        this.f8954q = (g0Var2.f8968b - jA) + j14;
        this.f8945h = g0Var2.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.source.s, java.lang.Object] */
    public final boolean g() {
        if (this.f8943f) {
            return !this.f8944g || this.f8938a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f8943f) {
            return g() || d() - this.f8945h.f8968b >= this.f8941d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        b();
        ?? r14 = this.f8938a;
        try {
            boolean z14 = r14 instanceof androidx.media3.exoplayer.source.b;
            o0 o0Var = this.f8950m;
            if (z14) {
                o0Var.f(((androidx.media3.exoplayer.source.b) r14).f9425a);
            } else {
                o0Var.f(r14);
            }
        } catch (RuntimeException e4) {
            fa.k.d("Period release failed.", e4);
        }
    }

    public final wa.m j(float f14, androidx.media3.common.d0 d0Var, boolean z14) {
        wa.g[] gVarArr;
        sa.r rVar = this.f8952o;
        androidx.media3.exoplayer.source.j.b bVar = this.f8945h.f8967a;
        wa.l lVar = this.f8949l;
        u0[] u0VarArr = this.f8948k;
        wa.m mVarE = lVar.e(u0VarArr, rVar, bVar, d0Var);
        int i14 = 0;
        while (true) {
            int i15 = mVarE.f183755a;
            gVarArr = mVarE.f183757c;
            if (i14 >= i15) {
                break;
            }
            boolean z15 = true;
            if (mVarE.b(i14)) {
                if (gVarArr[i14] == null && ((f) u0VarArr[i14]).f8922b != -2) {
                    z15 = false;
                }
                fa.a.d(z15);
            } else {
                fa.a.d(gVarArr[i14] == null);
            }
            i14++;
        }
        for (wa.g gVar : gVarArr) {
            if (gVar != null) {
                gVar.onPlaybackSpeed(f14);
                gVar.onPlayWhenReadyChanged(z14);
            }
        }
        return mVarE;
    }

    public final void k() {
        Object obj = this.f8938a;
        if (obj instanceof androidx.media3.exoplayer.source.b) {
            long j8 = this.f8945h.f8970d;
            if (j8 == C.TIME_UNSET) {
                j8 = Long.MIN_VALUE;
            }
            androidx.media3.exoplayer.source.b bVar = (androidx.media3.exoplayer.source.b) obj;
            bVar.f9429e = 0L;
            bVar.f9430f = j8;
        }
    }
}
