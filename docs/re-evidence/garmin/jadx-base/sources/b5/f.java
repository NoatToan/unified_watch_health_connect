package b5;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb5/f;", "", "Lf5/c0;", "rootCoordinates", "<init>", "(Lf5/c0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5.c0 f15798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p1.q0<h4.r.c> f15803f = new p1.q0<>(0, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f15804g = new p();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1.m0<p1.q0<o>> f15805h = new p1.m0<>(10);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h4.r.c f15807b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h4.r.c cVar) {
            super(0);
            this.f15807b = cVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            f.this.d(this.f15807b);
            return Unit.INSTANCE;
        }
    }

    public f(f5.c0 c0Var) {
        this.f15798a = c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0109 A[LOOP:2: B:42:0x00ad->B:56:0x0109, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x010f A[EDGE_INSN: B:65:0x010f->B:57:0x010f BREAK  A[LOOP:2: B:42:0x00ad->B:56:0x0109], SYNTHETIC] */
    public final void a(long j8, List<? extends h4.r.c> list, boolean z14) {
        p1.m0<p1.q0<o>> m0Var;
        o oVar;
        int size = list.size();
        p pVar = this.f15804g;
        p pVar2 = pVar;
        boolean z15 = true;
        int i14 = 0;
        while (true) {
            m0Var = this.f15805h;
            if (i14 >= size) {
                break;
            }
            h4.r.c cVar = list.get(i14);
            if (cVar.getIsAttached()) {
                cVar.setDetachedListener$ui(new a(cVar));
                if (z15) {
                    q3.c<o> cVar2 = pVar2.f15865a;
                    o[] oVarArr = cVar2.f142356a;
                    int i15 = cVar2.f142358c;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            oVar = null;
                            break;
                        }
                        oVar = oVarArr[i16];
                        if (p005kotlin.jvm.internal.s.g(oVar.f15856c, cVar)) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    o oVar2 = oVar;
                    if (oVar2 != null) {
                        oVar2.f15862i = true;
                        oVar2.f15857d.a(j8);
                        if (z14) {
                            p1.q0<o> q0VarB = m0Var.b(j8);
                            if (q0VarB == null) {
                                q0VarB = new p1.q0<>(0, 1, null);
                                m0Var.h(j8, q0VarB);
                            }
                            q0VarB.g(oVar2);
                        }
                        pVar2 = oVar2;
                    } else {
                        z15 = false;
                    }
                }
                o oVar3 = new o(cVar);
                oVar3.f15857d.a(j8);
                if (z14) {
                    p1.q0<o> q0VarB2 = m0Var.b(j8);
                    if (q0VarB2 == null) {
                        q0VarB2 = new p1.q0<>(0, 1, null);
                        m0Var.h(j8, q0VarB2);
                    }
                    q0VarB2.g(oVar3);
                }
                pVar2.f15865a.b(oVar3);
                pVar2 = oVar3;
            }
            i14++;
        }
        int i17 = 0;
        if (z14) {
            long[] jArr = m0Var.f134841b;
            Object[] objArr = m0Var.f134842c;
            long[] jArr2 = m0Var.f134840a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i18 = 0;
                while (true) {
                    long j14 = jArr2[i18];
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8;
                        int i24 = 8 - ((~(i18 - length)) >>> 31);
                        int i25 = i17;
                        while (i25 < i24) {
                            if ((255 & j14) < 128) {
                                int i26 = (i18 << 3) + i25;
                                long j15 = jArr[i26];
                                p1.q0<o> q0Var = (p1.q0) objArr[i26];
                                q3.c<o> cVar3 = pVar.f15865a;
                                o[] oVarArr2 = cVar3.f142356a;
                                int i27 = cVar3.f142358c;
                                for (int i28 = 0; i28 < i27; i28++) {
                                    oVarArr2[i28].f(j15, q0Var);
                                }
                            }
                            j14 >>= i19;
                            i25++;
                            i19 = i19;
                        }
                        if (i24 != i19) {
                            break;
                        }
                        if (i18 != length) {
                            break;
                        }
                        i18++;
                        i17 = 0;
                    } else if (i18 != length) {
                        break;
                        break;
                    } else {
                        i18++;
                        i17 = 0;
                    }
                }
            }
        }
        m0Var.c();
    }

    public final boolean b(k kVar, boolean z14) {
        p1.z<a0> zVar = kVar.f15832a;
        f5.c0 c0Var = this.f15798a;
        p pVar = this.f15804g;
        boolean zA = pVar.a(zVar, c0Var, kVar, z14);
        q3.c<o> cVar = pVar.f15865a;
        if (!zA) {
            return false;
        }
        boolean z15 = true;
        this.f15799b = true;
        o[] oVarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        boolean z16 = false;
        for (int i15 = 0; i15 < i14; i15++) {
            z16 = oVarArr[i15].e(kVar, z14) || z16;
        }
        o[] oVarArr2 = cVar.f142356a;
        int i16 = cVar.f142358c;
        boolean z17 = false;
        for (int i17 = 0; i17 < i16; i17++) {
            z17 = oVarArr2[i17].d(kVar) || z17;
        }
        pVar.b(kVar);
        if (!z17 && !z16) {
            z15 = false;
        }
        this.f15799b = false;
        if (this.f15802e) {
            this.f15802e = false;
            p1.q0<h4.r.c> q0Var = this.f15803f;
            int i18 = q0Var.f134668b;
            for (int i19 = 0; i19 < i18; i19++) {
                d(q0Var.b(i19));
            }
            q0Var.j();
        }
        if (this.f15800c) {
            this.f15800c = false;
            c();
        }
        if (this.f15801d) {
            this.f15801d = false;
            pVar.f15865a.g();
        }
        return z15;
    }

    public final void c() {
        if (this.f15799b) {
            this.f15800c = true;
            return;
        }
        p pVar = this.f15804g;
        q3.c<o> cVar = pVar.f15865a;
        o[] oVarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            oVarArr[i15].c();
        }
        if (this.f15801d) {
            this.f15801d = true;
        } else {
            pVar.f15865a.g();
        }
    }

    public final void d(h4.r.c cVar) {
        if (this.f15799b) {
            this.f15802e = true;
            this.f15803f.g(cVar);
            return;
        }
        p pVar = this.f15804g;
        p1.q0<p> q0Var = pVar.f15866b;
        q0Var.j();
        q0Var.g(pVar);
        while (q0Var.e()) {
            p pVarL = q0Var.l(q0Var.f134668b - 1);
            int i14 = 0;
            while (true) {
                q3.c<o> cVar2 = pVarL.f15865a;
                if (i14 < cVar2.f142358c) {
                    o oVar = cVar2.f142356a[i14];
                    if (p005kotlin.jvm.internal.s.g(oVar.f15856c, cVar)) {
                        pVarL.f15865a.j(oVar);
                        oVar.c();
                    } else {
                        q0Var.g(oVar);
                        i14++;
                    }
                }
            }
        }
    }
}
