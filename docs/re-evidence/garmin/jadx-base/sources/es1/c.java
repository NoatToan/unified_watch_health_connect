package es1;

import ds.e0;
import e23.p;
import g6.f;
import h4.r;
import i3.ve;
import k2.i;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void a(r rVar, final String str, long j8, long j14, m mVar, final int i14, final int i15) {
        r rVar2;
        int i16;
        final long j15;
        int i17;
        boolean z14;
        final r rVar3;
        final long j16;
        p2 p2VarI0;
        r rVar4;
        d92.b bVar;
        long jD;
        int i18;
        long jG;
        long j17;
        int i19;
        str.getClass();
        o0 o0VarE = mVar.E(-204911326);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        int i25 = i16 | (o0VarE.B(str) ? 32 : 16) | 128;
        if ((i15 & 8) == 0) {
            j15 = j14;
            int i26 = o0VarE.l(j15) ? 2048 : 1024;
            i17 = i25 | i26;
            if ((i17 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i24 != 0) {
                        rVar4 = r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    bVar = d92.b.f58623a;
                    jD = e0.d(bVar, o0VarE);
                    i18 = i17 & (-897);
                    if ((i15 & 8) != 0) {
                        bVar.getClass();
                        rVar2 = rVar4;
                        i19 = i17 & (-8065);
                        jG = d92.b.a(o0VarE).e().g();
                        j17 = jD;
                    } else {
                        jG = j15;
                        j17 = jD;
                        rVar2 = rVar4;
                        i19 = i18;
                    }
                } else {
                    o0VarE.e();
                    i19 = i17 & (-897);
                    if ((i15 & 8) != 0) {
                        i19 = i17 & (-8065);
                    }
                    jG = j15;
                    j17 = j8;
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                f.a aVar = f.f75994b;
                j15 = jG;
                ve.a(rVar2, i.a(4), j15, 0L, 0.0f, 0.0f, null, z3.f.c(-867351107, new a(j17, str), o0VarE), o0VarE, (i19 & 14) | 12582912 | ((i19 >> 3) & 896), 120);
                rVar3 = rVar2;
                j16 = j17;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                j16 = j8;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(str, j16, j15, i14, i15) { // from class: es1.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f65211b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ long f65212c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f65213d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f65214e;

                    {
                        this.f65214e = i15;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(1);
                        c.a(this.f65210a, this.f65211b, this.f65212c, this.f65213d, (m) obj, iT, this.f65214e);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        j15 = j14;
        i17 = i25 | i26;
        if ((i17 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i24 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                bVar = d92.b.f58623a;
                jD = e0.d(bVar, o0VarE);
                i18 = i17 & (-897);
                if ((i15 & 8) != 0) {
                    bVar.getClass();
                    rVar2 = rVar4;
                    i19 = i17 & (-8065);
                    jG = d92.b.a(o0VarE).e().g();
                    j17 = jD;
                } else {
                    jG = j15;
                    j17 = jD;
                    rVar2 = rVar4;
                    i19 = i18;
                }
            } else {
                if (i24 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                bVar = d92.b.f58623a;
                jD = e0.d(bVar, o0VarE);
                i18 = i17 & (-897);
                if ((i15 & 8) != 0) {
                    bVar.getClass();
                    rVar2 = rVar4;
                    i19 = i17 & (-8065);
                    jG = d92.b.a(o0VarE).e().g();
                    j17 = jD;
                } else {
                    jG = j15;
                    j17 = jD;
                    rVar2 = rVar4;
                    i19 = i18;
                }
            }
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            f.a aVar2 = f.f75994b;
            j15 = jG;
            ve.a(rVar2, i.a(4), j15, 0L, 0.0f, 0.0f, null, z3.f.c(-867351107, new a(j17, str), o0VarE), o0VarE, (i19 & 14) | 12582912 | ((i19 >> 3) & 896), 120);
            rVar3 = rVar2;
            j16 = j17;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            j16 = j8;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(str, j16, j15, i14, i15) { // from class: es1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f65211b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f65212c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f65213d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f65214e;

                {
                    this.f65214e = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    c.a(this.f65210a, this.f65211b, this.f65212c, this.f65213d, (m) obj, iT, this.f65214e);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
