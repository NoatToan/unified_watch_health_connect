package l72;

import android.annotation.SuppressLint;
import i3.d8;
import i3.fb;
import i3.gb;
import i3.i7;
import i3.p7;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ll72/f0;", "", "<init>", "()V", "a", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f110999a = new f0();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll72/f0$a;", "", "<init>", "()V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f111000a = new a();

        private a() {
        }

        public static c2.l2 n() {
            p3.x1 x1Var = p3.n.f135158a;
            float f14 = 16;
            g6.f.a aVar = g6.f.f75994b;
            float f15 = 8;
            return c2.l.d(f14, f15, f14, f15);
        }

        public final void a(int i14, e23.a aVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str, p3.m mVar, u4.d dVar, boolean z14) {
            int i15;
            p3.o0 o0VarL = vb.h.l(-820955623, aVar, str, mVar);
            if ((i14 & 6) == 0) {
                i15 = (o0VarL.B(dVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= o0VarL.B(str) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i15 |= o0VarL.B(rVar) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                i15 |= o0VarL.h(z14) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                i15 |= o0VarL.r(aVar) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                i15 |= o0VarL.B(this) ? 131072 : 65536;
            }
            byte b14 = 0;
            int i16 = 1;
            if (o0VarL.n(i15 & 1, (74899 & i15) != 74898)) {
                p3.x1 x1Var = p3.n.f135158a;
                b(z3.f.c(1116957474, new z(dVar, z14, i16, b14), o0VarL), str, rVar, z14, aVar, o0VarL, (i15 & 112) | 6 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (i15 & 458752));
            } else {
                o0VarL.e();
            }
            p3.p2 p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.b(this, dVar, str, rVar, z14, aVar, i14, 17);
            }
        }

        public final void b(e23.p pVar, String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, boolean z14, e23.a aVar, p3.m mVar, int i14) {
            e23.p pVar2;
            int i15;
            boolean z15;
            p3.o0 o0VarL = vb.h.l(1146592108, aVar, str, mVar);
            if ((i14 & 6) == 0) {
                pVar2 = pVar;
                i15 = (o0VarL.r(pVar2) ? 4 : 2) | i14;
            } else {
                pVar2 = pVar;
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= o0VarL.B(str) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i15 |= o0VarL.B(rVar) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i15 |= o0VarL.h(z15) ? 2048 : 1024;
            } else {
                z15 = z14;
            }
            if ((i14 & 24576) == 0) {
                i15 |= o0VarL.r(aVar) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                i15 |= o0VarL.B(this) ? 131072 : 65536;
            }
            if (o0VarL.n(i15 & 1, (74899 & i15) != 74898)) {
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jC = d92.b.a(o0VarL).d().a().c();
                long j8 = d92.b.a(o0VarL).k().f63527d;
                i3.c1 c1Var = i3.c1.f87691a;
                long jC2 = o4.d0.c(0.5f, jC, 14);
                long jC3 = o4.d0.c(0.5f, j8, 14);
                c1Var.getClass();
                i3.b1 b1VarA = i3.c1.a(jC, j8, jC2, jC3, o0VarL, 0);
                c2.l2 l2VarN = n();
                d92.b.f58624b.getClass();
                i0.c(pVar2, str, rVar, z15, b1VarA, l2VarN, aVar, 0L, j92.f.f97933j, o0VarL, (i15 & 8190) | ((i15 << 6) & 3670016), 128);
            } else {
                o0VarL.e();
            }
            p3.p2 p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c0(this, pVar, str, rVar, z14, aVar, i14, 0);
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0050  */
        /* JADX WARN: Code duplicated, block: B:32:0x0055  */
        /* JADX WARN: Code duplicated, block: B:34:0x0059  */
        /* JADX WARN: Code duplicated, block: B:36:0x0061  */
        /* JADX WARN: Code duplicated, block: B:37:0x0064  */
        /* JADX WARN: Code duplicated, block: B:41:0x006b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0071  */
        /* JADX WARN: Code duplicated, block: B:44:0x0074  */
        /* JADX WARN: Code duplicated, block: B:48:0x007e  */
        /* JADX WARN: Code duplicated, block: B:50:0x0084  */
        /* JADX WARN: Code duplicated, block: B:51:0x0087  */
        /* JADX WARN: Code duplicated, block: B:55:0x0095  */
        /* JADX WARN: Code duplicated, block: B:56:0x0097  */
        /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:66:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:69:0x00de  */
        /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
        public final void c(int i14, int i15, e23.a aVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str, p3.m mVar, u4.d dVar, boolean z14) {
            int i16;
            h4.r rVar2;
            int i17;
            boolean z15;
            int i18;
            byte b14;
            boolean z16;
            h4.r rVar3;
            p3.p2 p2VarI0;
            h4.r rVar4;
            int i19;
            int i24;
            p3.o0 o0VarL = vb.h.l(27718809, aVar, str, mVar);
            if ((i14 & 6) == 0) {
                i16 = (o0VarL.B(dVar) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            if ((i14 & 48) == 0) {
                i16 |= o0VarL.B(str) ? 32 : 16;
            }
            int i25 = i15 & 4;
            if (i25 == 0) {
                if ((i14 & 384) == 0) {
                    rVar2 = rVar;
                    i16 |= o0VarL.B(rVar2) ? 256 : 128;
                }
                i17 = i15 & 8;
                if (i17 != 0) {
                    if ((i14 & 3072) == 0) {
                        z15 = z14;
                        if (o0VarL.h(z15)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i16 |= i18;
                    }
                    if ((i14 & 24576) == 0) {
                        if (o0VarL.r(aVar)) {
                            i24 = 16384;
                        } else {
                            i24 = 8192;
                        }
                        i16 |= i24;
                    }
                    if ((196608 & i14) == 0) {
                        if (o0VarL.B(this)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i16 |= i19;
                    }
                    b14 = 0;
                    if ((74899 & i16) != 74898) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarL.n(i16 & 1, z16)) {
                        if (i25 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        boolean z17 = i17 == 0 ? z15 : true;
                        p3.x1 x1Var = p3.n.f135158a;
                        h4.r rVar5 = rVar4;
                        e(z3.f.c(-1995162718, new z(dVar, z17, 3, b14), o0VarL), str, rVar5, z17, aVar, o0VarL, (i16 & 112) | 6 | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752));
                        rVar3 = rVar5;
                        z15 = z17;
                    } else {
                        o0VarL.e();
                        rVar3 = rVar2;
                    }
                    p2VarI0 = o0VarL.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e0(this, dVar, str, rVar3, z15, aVar, i14, i15, 2);
                    }
                }
                i16 |= 3072;
                z15 = z14;
                if ((i14 & 24576) == 0) {
                    if (o0VarL.r(aVar)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                if ((196608 & i14) == 0) {
                    if (o0VarL.B(this)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
                b14 = 0;
                if ((74899 & i16) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarL.n(i16 & 1, z16)) {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 == 0) {
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVar6 = rVar4;
                    e(z3.f.c(-1995162718, new z(dVar, z17, 3, b14), o0VarL), str, rVar6, z17, aVar, o0VarL, (i16 & 112) | 6 | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752));
                    rVar3 = rVar6;
                    z15 = z17;
                } else {
                    o0VarL.e();
                    rVar3 = rVar2;
                }
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e0(this, dVar, str, rVar3, z15, aVar, i14, i15, 2);
                }
            }
            i16 |= 384;
            rVar2 = rVar;
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarL.h(z15)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarL.r(aVar)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                if ((196608 & i14) == 0) {
                    if (o0VarL.B(this)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
                b14 = 0;
                if ((74899 & i16) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarL.n(i16 & 1, z16)) {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 == 0) {
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r rVar7 = rVar4;
                    e(z3.f.c(-1995162718, new z(dVar, z17, 3, b14), o0VarL), str, rVar7, z17, aVar, o0VarL, (i16 & 112) | 6 | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752));
                    rVar3 = rVar7;
                    z15 = z17;
                } else {
                    o0VarL.e();
                    rVar3 = rVar2;
                }
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e0(this, dVar, str, rVar3, z15, aVar, i14, i15, 2);
                }
            }
            i16 |= 3072;
            z15 = z14;
            if ((i14 & 24576) == 0) {
                if (o0VarL.r(aVar)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            if ((196608 & i14) == 0) {
                if (o0VarL.B(this)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            b14 = 0;
            if ((74899 & i16) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 == 0) {
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                h4.r rVar8 = rVar4;
                e(z3.f.c(-1995162718, new z(dVar, z17, 3, b14), o0VarL), str, rVar8, z17, aVar, o0VarL, (i16 & 112) | 6 | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752));
                rVar3 = rVar8;
                z15 = z17;
            } else {
                o0VarL.e();
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e0(this, dVar, str, rVar3, z15, aVar, i14, i15, 2);
            }
        }

        public final void d(e23.p pVar, h4.r rVar, boolean z14, e23.a aVar, p3.m mVar, int i14) {
            int i15;
            Object obj;
            pVar.getClass();
            aVar.getClass();
            p3.o0 o0VarE = mVar.E(1024807773);
            if ((i14 & 6) == 0) {
                i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= o0VarE.B(rVar) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i15 |= o0VarE.h(z14) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                i15 |= o0VarE.r(aVar) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                obj = this;
                i15 |= o0VarE.B(obj) ? 16384 : 8192;
            } else {
                obj = this;
            }
            if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jE = d92.b.a(o0VarE).e().e();
                long j8 = d92.b.a(o0VarE).k().f63527d;
                i3.c1 c1Var = i3.c1.f87691a;
                long jC = o4.d0.c(0.5f, jE, 14);
                long jC2 = o4.d0.c(0.5f, j8, 14);
                c1Var.getClass();
                i3.b1 b1VarA = i3.c1.a(jE, j8, jC, jC2, o0VarE, 0);
                c2.l2 l2VarN = n();
                d92.b.f58624b.getClass();
                int i16 = i15 << 3;
                i0.c(pVar, null, rVar, z14, b1VarA, l2VarN, aVar, d92.b.a(o0VarE).k().c(), j92.f.f97933j, o0VarE, (i15 & 14) | 48 | (i16 & 896) | (i16 & 7168) | ((i15 << 9) & 3670016), 0);
                o0VarE = o0VarE;
            } else {
                o0VarE.e();
            }
            p3.p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ad0.l(obj, pVar, rVar, z14, aVar, i14, 14);
            }
        }

        public final void e(e23.p pVar, String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, boolean z14, e23.a aVar, p3.m mVar, int i14) {
            e23.p pVar2;
            int i15;
            boolean z15;
            p3.o0 o0VarL = vb.h.l(-24716820, aVar, str, mVar);
            if ((i14 & 6) == 0) {
                pVar2 = pVar;
                i15 = (o0VarL.r(pVar2) ? 4 : 2) | i14;
            } else {
                pVar2 = pVar;
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= o0VarL.B(str) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i15 |= o0VarL.B(rVar) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i15 |= o0VarL.h(z15) ? 2048 : 1024;
            } else {
                z15 = z14;
            }
            if ((i14 & 24576) == 0) {
                i15 |= o0VarL.r(aVar) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                i15 |= o0VarL.B(this) ? 131072 : 65536;
            }
            if (o0VarL.n(i15 & 1, (74899 & i15) != 74898)) {
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jE = d92.b.a(o0VarL).e().e();
                long j8 = d92.b.a(o0VarL).k().f63527d;
                i3.c1 c1Var = i3.c1.f87691a;
                long jC = o4.d0.c(0.5f, jE, 14);
                long jC2 = o4.d0.c(0.5f, j8, 14);
                c1Var.getClass();
                i3.b1 b1VarA = i3.c1.a(jE, j8, jC, jC2, o0VarL, 0);
                c2.l2 l2VarN = n();
                d92.b.f58624b.getClass();
                i0.c(pVar2, str, rVar, z15, b1VarA, l2VarN, aVar, d92.b.a(o0VarL).k().c(), j92.f.f97933j, o0VarL, ((i15 << 6) & 3670016) | (i15 & 8190), 0);
            } else {
                o0VarL.e();
            }
            p3.p2 p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c0(this, pVar, str, rVar, z14, aVar, i14, 1);
            }
        }

        public final void f(String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
            int i16;
            h4.r rVar2;
            boolean z15;
            p3.o0 o0VarL = vb.h.l(-875128565, aVar, str, mVar);
            if ((i14 & 6) == 0) {
                i16 = (o0VarL.B(str) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            int i17 = i15 & 2;
            if (i17 != 0) {
                i16 |= 48;
            } else if ((i14 & 48) == 0) {
                i16 |= o0VarL.B(rVar) ? 32 : 16;
            }
            int i18 = i15 & 4;
            if (i18 != 0) {
                i16 |= 384;
            } else if ((i14 & 384) == 0) {
                i16 |= o0VarL.h(z14) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                i16 |= o0VarL.r(aVar) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                i16 |= o0VarL.B(this) ? 16384 : 8192;
            }
            if (o0VarL.n(i16 & 1, (i16 & 9363) != 9362)) {
                if (i17 != 0) {
                    rVar = h4.r.S;
                }
                z15 = i18 != 0 ? true : z14;
                p3.x1 x1Var = p3.n.f135158a;
                int i19 = i16 << 3;
                rVar2 = rVar;
                e(null, str, rVar2, z15, aVar, o0VarL, (i19 & 112) | 6 | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (i19 & 458752));
            } else {
                o0VarL.e();
                rVar2 = rVar;
                z15 = z14;
            }
            p3.p2 p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b0(this, str, rVar2, z15, aVar, i14, i15, 0);
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0042  */
        /* JADX WARN: Code duplicated, block: B:25:0x0047  */
        /* JADX WARN: Code duplicated, block: B:27:0x004b  */
        /* JADX WARN: Code duplicated, block: B:29:0x0053  */
        /* JADX WARN: Code duplicated, block: B:30:0x0056  */
        /* JADX WARN: Code duplicated, block: B:34:0x005d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0065  */
        /* JADX WARN: Code duplicated, block: B:37:0x0068  */
        /* JADX WARN: Code duplicated, block: B:39:0x006c  */
        /* JADX WARN: Code duplicated, block: B:42:0x0072  */
        /* JADX WARN: Code duplicated, block: B:44:0x007a  */
        /* JADX WARN: Code duplicated, block: B:45:0x007d  */
        /* JADX WARN: Code duplicated, block: B:47:0x0081  */
        /* JADX WARN: Code duplicated, block: B:50:0x008a  */
        /* JADX WARN: Code duplicated, block: B:51:0x008c  */
        /* JADX WARN: Code duplicated, block: B:54:0x0095 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:55:0x0097  */
        /* JADX WARN: Code duplicated, block: B:56:0x009a  */
        /* JADX WARN: Code duplicated, block: B:58:0x009d  */
        /* JADX WARN: Code duplicated, block: B:60:0x0107  */
        /* JADX WARN: Code duplicated, block: B:63:0x0111  */
        /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
        public final void g(int i14, int i15, e23.a aVar, e23.p pVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, p3.m mVar, boolean z14) {
            int i16;
            h4.r rVar2;
            int i17;
            boolean z15;
            int i18;
            boolean z16;
            boolean z17;
            p3.p2 p2VarI0;
            h4.r rVar3;
            int i19;
            int i24;
            pVar.getClass();
            aVar.getClass();
            p3.o0 o0VarE = mVar.E(-1220768049);
            if ((i14 & 6) == 0) {
                i16 = (o0VarE.r(pVar) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            int i25 = i15 & 2;
            if (i25 == 0) {
                if ((i14 & 48) == 0) {
                    rVar2 = rVar;
                    i16 |= o0VarE.B(rVar2) ? 32 : 16;
                }
                i17 = i15 & 4;
                if (i17 != 0) {
                    if ((i14 & 384) == 0) {
                        z15 = z14;
                        if (o0VarE.h(z15)) {
                            i18 = 256;
                        } else {
                            i18 = 128;
                        }
                        i16 |= i18;
                    }
                    if ((i14 & 3072) != 0) {
                        if (o0VarE.r(aVar)) {
                            i24 = 2048;
                        } else {
                            i24 = 1024;
                        }
                        i16 |= i24;
                    }
                    if ((i14 & 24576) != 0) {
                        if (o0VarE.B(this)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i16 |= i19;
                    }
                    if ((i16 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i16 & 1, z16)) {
                        if (i25 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        d92.b.f58623a.getClass();
                        long jB = d92.b.a(o0VarE).d().a().b();
                        long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                        i3.c1 c1Var = i3.c1.f87691a;
                        long jC = o4.d0.c(0.5f, jB, 14);
                        long jC2 = o4.d0.c(0.5f, jD, 14);
                        c1Var.getClass();
                        i3.b1 b1VarA = i3.c1.a(jB, jD, jC, jC2, o0VarE, 0);
                        c2.l2 l2VarN = n();
                        long jD2 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                        d92.b.f58624b.getClass();
                        int i26 = i16 << 3;
                        h4.r rVar4 = rVar3;
                        boolean z18 = z15;
                        i0.c(pVar, null, rVar4, z18, b1VarA, l2VarN, aVar, jD2, j92.f.f97933j, o0VarE, (i16 & 14) | 48 | (i26 & 896) | (i26 & 7168) | ((i16 << 9) & 3670016), 0);
                        o0VarE = o0VarE;
                        rVar2 = rVar4;
                        z17 = z18;
                    } else {
                        o0VarE.e();
                        z17 = z15;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new a82.a(this, pVar, rVar2, z17, aVar, i14, i15, 9);
                    }
                }
                i16 |= 384;
                z15 = z14;
                if ((i14 & 3072) != 0) {
                    if (o0VarE.r(aVar)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                if ((i14 & 24576) != 0) {
                    if (o0VarE.B(this)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i16 |= i19;
                }
                if ((i16 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i25 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jB2 = d92.b.a(o0VarE).d().a().b();
                    long jD3 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    i3.c1 c1Var2 = i3.c1.f87691a;
                    long jC3 = o4.d0.c(0.5f, jB2, 14);
                    long jC4 = o4.d0.c(0.5f, jD3, 14);
                    c1Var2.getClass();
                    i3.b1 b1VarA2 = i3.c1.a(jB2, jD3, jC3, jC4, o0VarE, 0);
                    c2.l2 l2VarN2 = n();
                    long jD4 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    d92.b.f58624b.getClass();
                    int i27 = i16 << 3;
                    h4.r rVar5 = rVar3;
                    boolean z19 = z15;
                    i0.c(pVar, null, rVar5, z19, b1VarA2, l2VarN2, aVar, jD4, j92.f.f97933j, o0VarE, (i16 & 14) | 48 | (i27 & 896) | (i27 & 7168) | ((i16 << 9) & 3670016), 0);
                    o0VarE = o0VarE;
                    rVar2 = rVar5;
                    z17 = z19;
                } else {
                    o0VarE.e();
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a82.a(this, pVar, rVar2, z17, aVar, i14, i15, 9);
                }
            }
            i16 |= 48;
            rVar2 = rVar;
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) != 0) {
                    if (o0VarE.r(aVar)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                if ((i14 & 24576) != 0) {
                    if (o0VarE.B(this)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i16 |= i19;
                }
                if ((i16 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i25 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jB3 = d92.b.a(o0VarE).d().a().b();
                    long jD5 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    i3.c1 c1Var3 = i3.c1.f87691a;
                    long jC5 = o4.d0.c(0.5f, jB3, 14);
                    long jC6 = o4.d0.c(0.5f, jD5, 14);
                    c1Var3.getClass();
                    i3.b1 b1VarA3 = i3.c1.a(jB3, jD5, jC5, jC6, o0VarE, 0);
                    c2.l2 l2VarN3 = n();
                    long jD6 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    d92.b.f58624b.getClass();
                    int i28 = i16 << 3;
                    h4.r rVar6 = rVar3;
                    boolean z110 = z15;
                    i0.c(pVar, null, rVar6, z110, b1VarA3, l2VarN3, aVar, jD6, j92.f.f97933j, o0VarE, (i16 & 14) | 48 | (i28 & 896) | (i28 & 7168) | ((i16 << 9) & 3670016), 0);
                    o0VarE = o0VarE;
                    rVar2 = rVar6;
                    z17 = z110;
                } else {
                    o0VarE.e();
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a82.a(this, pVar, rVar2, z17, aVar, i14, i15, 9);
                }
            }
            i16 |= 384;
            z15 = z14;
            if ((i14 & 3072) != 0) {
                if (o0VarE.r(aVar)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i16 |= i24;
            }
            if ((i14 & 24576) != 0) {
                if (o0VarE.B(this)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i25 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jB4 = d92.b.a(o0VarE).d().a().b();
                long jD7 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                i3.c1 c1Var4 = i3.c1.f87691a;
                long jC7 = o4.d0.c(0.5f, jB4, 14);
                long jC8 = o4.d0.c(0.5f, jD7, 14);
                c1Var4.getClass();
                i3.b1 b1VarA4 = i3.c1.a(jB4, jD7, jC7, jC8, o0VarE, 0);
                c2.l2 l2VarN4 = n();
                long jD8 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                d92.b.f58624b.getClass();
                int i29 = i16 << 3;
                h4.r rVar7 = rVar3;
                boolean z111 = z15;
                i0.c(pVar, null, rVar7, z111, b1VarA4, l2VarN4, aVar, jD8, j92.f.f97933j, o0VarE, (i16 & 14) | 48 | (i29 & 896) | (i29 & 7168) | ((i16 << 9) & 3670016), 0);
                o0VarE = o0VarE;
                rVar2 = rVar7;
                z17 = z111;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(this, pVar, rVar2, z17, aVar, i14, i15, 9);
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0051  */
        /* JADX WARN: Code duplicated, block: B:32:0x0056  */
        /* JADX WARN: Code duplicated, block: B:34:0x005a  */
        /* JADX WARN: Code duplicated, block: B:36:0x0062  */
        /* JADX WARN: Code duplicated, block: B:37:0x0065  */
        /* JADX WARN: Code duplicated, block: B:41:0x006c  */
        /* JADX WARN: Code duplicated, block: B:43:0x0072  */
        /* JADX WARN: Code duplicated, block: B:44:0x0075  */
        /* JADX WARN: Code duplicated, block: B:48:0x007d  */
        /* JADX WARN: Code duplicated, block: B:50:0x0085  */
        /* JADX WARN: Code duplicated, block: B:51:0x0088  */
        /* JADX WARN: Code duplicated, block: B:53:0x008c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0099  */
        /* JADX WARN: Code duplicated, block: B:57:0x009b  */
        /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:67:0x00da  */
        /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
        public final void h(int i14, int i15, e23.a aVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str, p3.m mVar, u4.d dVar, boolean z14) {
            int i16;
            h4.r rVar2;
            int i17;
            boolean z15;
            int i18;
            a aVar2;
            byte b14;
            boolean z16;
            boolean z17;
            p3.p2 p2VarI0;
            h4.r rVar3;
            a aVar3;
            int i19;
            int i24;
            p3.o0 o0VarL = vb.h.l(-321813785, aVar, str, mVar);
            int i25 = 2;
            if ((i14 & 6) == 0) {
                i16 = (o0VarL.B(dVar) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            if ((i14 & 48) == 0) {
                i16 |= o0VarL.B(str) ? 32 : 16;
            }
            int i26 = i15 & 4;
            if (i26 == 0) {
                if ((i14 & 384) == 0) {
                    rVar2 = rVar;
                    i16 |= o0VarL.B(rVar2) ? 256 : 128;
                }
                i17 = i15 & 8;
                if (i17 != 0) {
                    if ((i14 & 3072) == 0) {
                        z15 = z14;
                        if (o0VarL.h(z15)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i16 |= i18;
                    }
                    if ((i14 & 24576) == 0) {
                        if (o0VarL.r(aVar)) {
                            i24 = 16384;
                        } else {
                            i24 = 8192;
                        }
                        i16 |= i24;
                    }
                    if ((196608 & i14) == 0) {
                        aVar3 = this;
                        if (o0VarL.B(aVar3)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i16 |= i19;
                        aVar2 = aVar3;
                    } else {
                        aVar2 = this;
                    }
                    b14 = 0;
                    if ((74899 & i16) != 74898) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarL.n(i16 & 1, z16)) {
                        if (i26 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        boolean z18 = i17 == 0 ? z15 : true;
                        p3.x1 x1Var = p3.n.f135158a;
                        boolean z19 = z18;
                        aVar2.i(z3.f.c(-718375426, new z(dVar, z18, i25, b14), o0VarL), str, rVar3, z19, aVar, o0VarL, (i16 & 458752) | (i16 & 112) | 6 | (i16 & 896) | (i16 & 7168) | (57344 & i16), 0);
                        rVar2 = rVar3;
                        z17 = z19;
                    } else {
                        o0VarL.e();
                        z17 = z15;
                    }
                    p2VarI0 = o0VarL.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e0(this, dVar, str, rVar2, z17, aVar, i14, i15, 1);
                    }
                }
                i16 |= 3072;
                z15 = z14;
                if ((i14 & 24576) == 0) {
                    if (o0VarL.r(aVar)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                if ((196608 & i14) == 0) {
                    aVar3 = this;
                    if (o0VarL.B(aVar3)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                    aVar2 = aVar3;
                } else {
                    aVar2 = this;
                }
                b14 = 0;
                if ((74899 & i16) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarL.n(i16 & 1, z16)) {
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 == 0) {
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    boolean z110 = z18;
                    aVar2.i(z3.f.c(-718375426, new z(dVar, z18, i25, b14), o0VarL), str, rVar3, z110, aVar, o0VarL, (i16 & 458752) | (i16 & 112) | 6 | (i16 & 896) | (i16 & 7168) | (57344 & i16), 0);
                    rVar2 = rVar3;
                    z17 = z110;
                } else {
                    o0VarL.e();
                    z17 = z15;
                }
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e0(this, dVar, str, rVar2, z17, aVar, i14, i15, 1);
                }
            }
            i16 |= 384;
            rVar2 = rVar;
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarL.h(z15)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarL.r(aVar)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                if ((196608 & i14) == 0) {
                    aVar3 = this;
                    if (o0VarL.B(aVar3)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                    aVar2 = aVar3;
                } else {
                    aVar2 = this;
                }
                b14 = 0;
                if ((74899 & i16) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarL.n(i16 & 1, z16)) {
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 == 0) {
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    boolean z111 = z18;
                    aVar2.i(z3.f.c(-718375426, new z(dVar, z18, i25, b14), o0VarL), str, rVar3, z111, aVar, o0VarL, (i16 & 458752) | (i16 & 112) | 6 | (i16 & 896) | (i16 & 7168) | (57344 & i16), 0);
                    rVar2 = rVar3;
                    z17 = z111;
                } else {
                    o0VarL.e();
                    z17 = z15;
                }
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e0(this, dVar, str, rVar2, z17, aVar, i14, i15, 1);
                }
            }
            i16 |= 3072;
            z15 = z14;
            if ((i14 & 24576) == 0) {
                if (o0VarL.r(aVar)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            if ((196608 & i14) == 0) {
                aVar3 = this;
                if (o0VarL.B(aVar3)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
                aVar2 = aVar3;
            } else {
                aVar2 = this;
            }
            b14 = 0;
            if ((74899 & i16) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 == 0) {
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                boolean z112 = z18;
                aVar2.i(z3.f.c(-718375426, new z(dVar, z18, i25, b14), o0VarL), str, rVar3, z112, aVar, o0VarL, (i16 & 458752) | (i16 & 112) | 6 | (i16 & 896) | (i16 & 7168) | (57344 & i16), 0);
                rVar2 = rVar3;
                z17 = z112;
            } else {
                o0VarL.e();
                z17 = z15;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e0(this, dVar, str, rVar2, z17, aVar, i14, i15, 1);
            }
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0064  */
        /* JADX WARN: Code duplicated, block: B:39:0x006a  */
        /* JADX WARN: Code duplicated, block: B:40:0x006d  */
        /* JADX WARN: Code duplicated, block: B:44:0x0075  */
        /* JADX WARN: Code duplicated, block: B:46:0x007d  */
        /* JADX WARN: Code duplicated, block: B:47:0x0080  */
        /* JADX WARN: Code duplicated, block: B:49:0x0084  */
        /* JADX WARN: Code duplicated, block: B:52:0x0090  */
        /* JADX WARN: Code duplicated, block: B:53:0x0092  */
        /* JADX WARN: Code duplicated, block: B:56:0x009b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:57:0x009d  */
        /* JADX WARN: Code duplicated, block: B:58:0x009f  */
        /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
        public final void i(e23.p<? super p3.m, ? super Integer, Unit> pVar, String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
            e23.p<? super p3.m, ? super Integer, Unit> pVar2;
            int i16;
            boolean z15;
            boolean z16;
            p3.p2 p2VarI0;
            boolean z17;
            int i17;
            int i18;
            p3.o0 o0VarL = vb.h.l(1109211706, aVar, str, mVar);
            if ((i14 & 6) == 0) {
                pVar2 = pVar;
                i16 = (o0VarL.r(pVar2) ? 4 : 2) | i14;
            } else {
                pVar2 = pVar;
                i16 = i14;
            }
            if ((i14 & 48) == 0) {
                i16 |= o0VarL.B(str) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i16 |= o0VarL.B(rVar) ? 256 : 128;
            }
            int i19 = i15 & 8;
            if (i19 == 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    i16 |= o0VarL.h(z15) ? 2048 : 1024;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarL.r(aVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                if ((196608 & i14) != 0) {
                    if (o0VarL.B(this)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i16 |= i17;
                }
                if ((74899 & i16) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarL.n(i16 & 1, z16)) {
                    if (i19 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jB = d92.b.a(o0VarL).d().a().b();
                    long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
                    i3.c1 c1Var = i3.c1.f87691a;
                    long jC = o4.d0.c(0.5f, jB, 14);
                    long jC2 = o4.d0.c(0.5f, jD, 14);
                    c1Var.getClass();
                    i3.b1 b1VarA = i3.c1.a(jB, jD, jC, jC2, o0VarL, 0);
                    c2.l2 l2VarN = n();
                    long jD2 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
                    d92.b.f58624b.getClass();
                    i0.c(pVar2, str, rVar, z17, b1VarA, l2VarN, aVar, jD2, j92.f.f97933j, o0VarL, (i16 & 8190) | ((i16 << 6) & 3670016), 0);
                    z15 = z17;
                } else {
                    o0VarL.e();
                }
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d62.o(this, pVar, str, rVar, z15, aVar, i14, i15);
                }
            }
            i16 |= 3072;
            z15 = z14;
            if ((i14 & 24576) == 0) {
                if (o0VarL.r(aVar)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            if ((196608 & i14) != 0) {
                if (o0VarL.B(this)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i16 |= i17;
            }
            if ((74899 & i16) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i19 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jB2 = d92.b.a(o0VarL).d().a().b();
                long jD3 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
                i3.c1 c1Var2 = i3.c1.f87691a;
                long jC3 = o4.d0.c(0.5f, jB2, 14);
                long jC4 = o4.d0.c(0.5f, jD3, 14);
                c1Var2.getClass();
                i3.b1 b1VarA2 = i3.c1.a(jB2, jD3, jC3, jC4, o0VarL, 0);
                c2.l2 l2VarN2 = n();
                long jD4 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
                d92.b.f58624b.getClass();
                i0.c(pVar2, str, rVar, z17, b1VarA2, l2VarN2, aVar, jD4, j92.f.f97933j, o0VarL, (i16 & 8190) | ((i16 << 6) & 3670016), 0);
                z15 = z17;
            } else {
                o0VarL.e();
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(this, pVar, str, rVar, z15, aVar, i14, i15);
            }
        }

        public final void j(String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
            int i16;
            h4.r rVar2;
            boolean z15;
            p3.o0 o0VarL = vb.h.l(-1642484647, aVar, str, mVar);
            if ((i14 & 6) == 0) {
                i16 = (o0VarL.B(str) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            int i17 = i15 & 2;
            if (i17 != 0) {
                i16 |= 48;
            } else if ((i14 & 48) == 0) {
                i16 |= o0VarL.B(rVar) ? 32 : 16;
            }
            int i18 = i15 & 4;
            if (i18 != 0) {
                i16 |= 384;
            } else if ((i14 & 384) == 0) {
                i16 |= o0VarL.h(z14) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                i16 |= o0VarL.r(aVar) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                i16 |= o0VarL.B(this) ? 16384 : 8192;
            }
            if (o0VarL.n(i16 & 1, (i16 & 9363) != 9362)) {
                if (i17 != 0) {
                    rVar = h4.r.S;
                }
                z15 = i18 != 0 ? true : z14;
                p3.x1 x1Var = p3.n.f135158a;
                int i19 = i16 << 3;
                rVar2 = rVar;
                i(null, str, rVar2, z15, aVar, o0VarL, (i19 & 112) | 6 | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (i19 & 458752), 0);
            } else {
                o0VarL.e();
                rVar2 = rVar;
                z15 = z14;
            }
            p3.p2 p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b0(this, str, rVar2, z15, aVar, i14, i15, 1);
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0050  */
        /* JADX WARN: Code duplicated, block: B:32:0x0055  */
        /* JADX WARN: Code duplicated, block: B:34:0x0059  */
        /* JADX WARN: Code duplicated, block: B:36:0x0061  */
        /* JADX WARN: Code duplicated, block: B:37:0x0064  */
        /* JADX WARN: Code duplicated, block: B:41:0x006b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0071  */
        /* JADX WARN: Code duplicated, block: B:44:0x0074  */
        /* JADX WARN: Code duplicated, block: B:48:0x007d  */
        /* JADX WARN: Code duplicated, block: B:50:0x0085  */
        /* JADX WARN: Code duplicated, block: B:51:0x0088  */
        /* JADX WARN: Code duplicated, block: B:53:0x008c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0098  */
        /* JADX WARN: Code duplicated, block: B:57:0x009a  */
        /* JADX WARN: Code duplicated, block: B:60:0x00a3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:66:0x00af  */
        /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:71:0x010a  */
        /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
        public final void k(int i14, int i15, e23.a aVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str, p3.m mVar, u4.d dVar, boolean z14) {
            int i16;
            h4.r rVar2;
            int i17;
            int i18;
            boolean z15;
            p3.o0 o0Var;
            boolean z16;
            p3.p2 p2VarI0;
            h4.r rVar3;
            boolean z17;
            int i19;
            int i24;
            p3.o0 o0VarL = vb.h.l(1394610861, aVar, str, mVar);
            if ((i14 & 6) == 0) {
                i16 = (o0VarL.B(dVar) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            if ((i14 & 48) == 0) {
                i16 |= o0VarL.B(str) ? 32 : 16;
            }
            int i25 = i15 & 4;
            if (i25 == 0) {
                if ((i14 & 384) == 0) {
                    rVar2 = rVar;
                    i16 |= o0VarL.B(rVar2) ? 256 : 128;
                }
                i17 = i15 & 8;
                if (i17 != 0) {
                    if ((i14 & 3072) == 0) {
                        if (o0VarL.h(z14)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i16 |= i18;
                    }
                    if ((i14 & 24576) == 0) {
                        if (o0VarL.r(aVar)) {
                            i24 = 16384;
                        } else {
                            i24 = 8192;
                        }
                        i16 |= i24;
                    }
                    if ((i14 & 196608) != 0) {
                        if (o0VarL.B(this)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i16 |= i19;
                    }
                    if ((74899 & i16) != 74898) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (o0VarL.n(i16 & 1, z15)) {
                        if (i25 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        d92.b.f58623a.getClass();
                        long jA = d92.b.a(o0VarL).f().a();
                        d92.b.f58624b.getClass();
                        int i26 = i16 >> 3;
                        o0Var = o0VarL;
                        i0.d(str, rVar3, z17, j92.f.f97933j, hb.a.e(o0VarL), z3.f.c(1965251493, new d0(dVar, jA, z17), o0VarL), n(), aVar, o0Var, 196608 | (i26 & 14) | (i26 & 112) | (i26 & 896) | ((i16 << 9) & 29360128), 0);
                        rVar2 = rVar3;
                        z16 = z17;
                    } else {
                        o0Var = o0VarL;
                        o0Var.e();
                        z16 = z14;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e0(this, dVar, str, rVar2, z16, aVar, i14, i15, 0);
                    }
                }
                i16 |= 3072;
                if ((i14 & 24576) == 0) {
                    if (o0VarL.r(aVar)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                if ((i14 & 196608) != 0) {
                    if (o0VarL.B(this)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
                if ((74899 & i16) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarL.n(i16 & 1, z15)) {
                    if (i25 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jA2 = d92.b.a(o0VarL).f().a();
                    d92.b.f58624b.getClass();
                    int i27 = i16 >> 3;
                    o0Var = o0VarL;
                    i0.d(str, rVar3, z17, j92.f.f97933j, hb.a.e(o0VarL), z3.f.c(1965251493, new d0(dVar, jA2, z17), o0VarL), n(), aVar, o0Var, 196608 | (i27 & 14) | (i27 & 112) | (i27 & 896) | ((i16 << 9) & 29360128), 0);
                    rVar2 = rVar3;
                    z16 = z17;
                } else {
                    o0Var = o0VarL;
                    o0Var.e();
                    z16 = z14;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e0(this, dVar, str, rVar2, z16, aVar, i14, i15, 0);
                }
            }
            i16 |= 384;
            rVar2 = rVar;
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    if (o0VarL.h(z14)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarL.r(aVar)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                if ((i14 & 196608) != 0) {
                    if (o0VarL.B(this)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
                if ((74899 & i16) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarL.n(i16 & 1, z15)) {
                    if (i25 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jA3 = d92.b.a(o0VarL).f().a();
                    d92.b.f58624b.getClass();
                    int i28 = i16 >> 3;
                    o0Var = o0VarL;
                    i0.d(str, rVar3, z17, j92.f.f97933j, hb.a.e(o0VarL), z3.f.c(1965251493, new d0(dVar, jA3, z17), o0VarL), n(), aVar, o0Var, 196608 | (i28 & 14) | (i28 & 112) | (i28 & 896) | ((i16 << 9) & 29360128), 0);
                    rVar2 = rVar3;
                    z16 = z17;
                } else {
                    o0Var = o0VarL;
                    o0Var.e();
                    z16 = z14;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e0(this, dVar, str, rVar2, z16, aVar, i14, i15, 0);
                }
            }
            i16 |= 3072;
            if ((i14 & 24576) == 0) {
                if (o0VarL.r(aVar)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            if ((i14 & 196608) != 0) {
                if (o0VarL.B(this)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            if ((74899 & i16) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarL.n(i16 & 1, z15)) {
                if (i25 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jA4 = d92.b.a(o0VarL).f().a();
                d92.b.f58624b.getClass();
                int i29 = i16 >> 3;
                o0Var = o0VarL;
                i0.d(str, rVar3, z17, j92.f.f97933j, hb.a.e(o0VarL), z3.f.c(1965251493, new d0(dVar, jA4, z17), o0VarL), n(), aVar, o0Var, 196608 | (i29 & 14) | (i29 & 112) | (i29 & 896) | ((i16 << 9) & 29360128), 0);
                rVar2 = rVar3;
                z16 = z17;
            } else {
                o0Var = o0VarL;
                o0Var.e();
                z16 = z14;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e0(this, dVar, str, rVar2, z16, aVar, i14, i15, 0);
            }
        }

        public final void l(e23.p pVar, String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, boolean z14, e23.a aVar, p3.m mVar, int i14) {
            int i15;
            h4.r rVar2;
            boolean z15;
            p3.o0 o0VarL = vb.h.l(1633330176, aVar, str, mVar);
            if ((i14 & 6) == 0) {
                i15 = (o0VarL.r(pVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= o0VarL.B(str) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i15 |= o0VarL.B(rVar2) ? 256 : 128;
            } else {
                rVar2 = rVar;
            }
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i15 |= o0VarL.h(z15) ? 2048 : 1024;
            } else {
                z15 = z14;
            }
            if ((i14 & 24576) == 0) {
                i15 |= o0VarL.r(aVar) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                i15 |= o0VarL.B(this) ? 131072 : 65536;
            }
            if (o0VarL.n(i15 & 1, (74899 & i15) != 74898)) {
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                i0.d(str, rVar2, z15, j92.f.f97933j, hb.a.e(o0VarL), pVar, n(), aVar, o0VarL, ((i15 >> 3) & 1022) | (458752 & (i15 << 15)) | ((i15 << 9) & 29360128), 0);
            } else {
                o0VarL.e();
            }
            p3.p2 p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c0(this, pVar, str, rVar, z14, aVar, i14, 2);
            }
        }

        public final void m(String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
            h4.r rVar2;
            boolean z15;
            p3.o0 o0VarL = vb.h.l(-602065633, aVar, str, mVar);
            int i16 = i14 | (o0VarL.B(str) ? 4 : 2);
            int i17 = i15 & 2;
            if (i17 != 0) {
                i16 |= 48;
            } else if ((i14 & 48) == 0) {
                i16 |= o0VarL.B(rVar) ? 32 : 16;
            }
            int i18 = i16 | 384 | (o0VarL.r(aVar) ? 2048 : 1024) | (o0VarL.B(this) ? 16384 : 8192);
            if (o0VarL.n(i18 & 1, (i18 & 9363) != 9362)) {
                rVar2 = i17 != 0 ? h4.r.S : rVar;
                p3.x1 x1Var = p3.n.f135158a;
                int i19 = i18 << 3;
                z15 = true;
                l(null, str, rVar2, true, aVar, o0VarL, (i19 & 112) | 6 | (i19 & 896) | 3072 | (57344 & i19) | (i19 & 458752));
            } else {
                o0VarL.e();
                rVar2 = rVar;
                z15 = z14;
            }
            p3.p2 p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b0(this, str, rVar2, z15, aVar, i14, i15, 2);
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111001a;

        static {
            int[] iArr = new int[c2.values().length];
            try {
                iArr[c2.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f111001a = iArr;
        }
    }

    private f0() {
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public final void a(e23.p pVar, String str, h4.r rVar, boolean z14, e23.a aVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p pVar2;
        String str2;
        boolean z15;
        boolean z16;
        p3.o0 o0Var;
        String str3;
        p3.p2 p2VarI0;
        int i17;
        int i18;
        pVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1905254802);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            pVar2 = pVar;
            i16 |= o0VarE.r(pVar2) ? 32 : 16;
        } else {
            pVar2 = pVar;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                str2 = str;
                i16 |= o0VarE.B(str2) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            } else {
                z15 = z14;
            }
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i16 |= i17;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i19 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jC = d92.b.a(o0VarE).d().a().c();
                long j8 = d92.b.a(o0VarE).k().f63527d;
                i3.c1 c1Var = i3.c1.f87691a;
                long jC2 = o4.d0.c(0.5f, jC, 14);
                long jC3 = o4.d0.c(0.5f, j8, 14);
                c1Var.getClass();
                int i24 = i16 << 6;
                i0.c(pVar2, str3, rVar, z15, i3.c1.a(jC, j8, jC2, jC3, o0VarE, 0), null, aVar, 0L, null, o0VarE, ((i16 >> 3) & 126) | (i24 & 896) | (i16 & 7168) | (3670016 & i24), 416);
                o0Var = o0VarE;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str3 = str2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new y(this, rVar, pVar, str3, z14, aVar, i14, i15, 0);
            }
        }
        i16 |= 384;
        str2 = str;
        if ((i14 & 3072) == 0) {
            z15 = z14;
            if (o0VarE.h(z15)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i16 |= i18;
        } else {
            z15 = z14;
        }
        if ((i14 & 24576) != 0) {
            if (o0VarE.r(aVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i16 |= i17;
        }
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i19 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jC4 = d92.b.a(o0VarE).d().a().c();
            long j14 = d92.b.a(o0VarE).k().f63527d;
            i3.c1 c1Var2 = i3.c1.f87691a;
            long jC5 = o4.d0.c(0.5f, jC4, 14);
            long jC6 = o4.d0.c(0.5f, j14, 14);
            c1Var2.getClass();
            int i25 = i16 << 6;
            i0.c(pVar2, str3, rVar, z15, i3.c1.a(jC4, j14, jC5, jC6, o0VarE, 0), null, aVar, 0L, null, o0VarE, ((i16 >> 3) & 126) | (i25 & 896) | (i16 & 7168) | (3670016 & i25), 416);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(this, rVar, pVar, str3, z14, aVar, i14, i15, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public final void b(String str, h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        boolean z15;
        boolean z16;
        p3.p2 p2VarI0;
        boolean z17;
        int i17;
        p3.o0 o0VarL = vb.h.l(293328035, aVar, str, mVar);
        if ((i14 & 6) == 0) {
            i16 = (o0VarL.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            rVar2 = rVar;
            i16 |= o0VarL.B(rVar2) ? 32 : 16;
        } else {
            rVar2 = rVar;
        }
        int i18 = i15 & 4;
        if (i18 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarL.h(z15) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarL.r(aVar)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i16 |= i17;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i18 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jC = d92.b.a(o0VarL).d().a().c();
                long j8 = d92.b.a(o0VarL).k().f63527d;
                i3.c1 c1Var = i3.c1.f87691a;
                long jC2 = o4.d0.c(0.5f, jC, 14);
                long jC3 = o4.d0.c(0.5f, j8, 14);
                c1Var.getClass();
                i0.c(null, str, rVar2, z17, i3.c1.a(jC, j8, jC2, jC3, o0VarL, 0), null, aVar, 0L, null, o0VarL, ((i16 << 3) & 8176) | ((i16 << 9) & 3670016), 417);
                z15 = z17;
            } else {
                o0VarL.e();
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new x(this, str, rVar, z15, aVar, i14, i15, 1);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i14 & 3072) == 0) {
            if (o0VarL.r(aVar)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i16 |= i17;
        }
        if ((i16 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarL.n(i16 & 1, z16)) {
            if (i18 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jC4 = d92.b.a(o0VarL).d().a().c();
            long j14 = d92.b.a(o0VarL).k().f63527d;
            i3.c1 c1Var2 = i3.c1.f87691a;
            long jC5 = o4.d0.c(0.5f, jC4, 14);
            long jC6 = o4.d0.c(0.5f, j14, 14);
            c1Var2.getClass();
            i0.c(null, str, rVar2, z17, i3.c1.a(jC4, j14, jC5, jC6, o0VarL, 0), null, aVar, 0L, null, o0VarL, ((i16 << 3) & 8176) | ((i16 << 9) & 3670016), 417);
            z15 = z17;
        } else {
            o0VarL.e();
        }
        p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(this, str, rVar, z15, aVar, i14, i15, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0158  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:120:0x0194  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    public final void c(h4.r rVar, u4.d dVar, c2 c2Var, b2 b2Var, boolean z14, String str, a2.j jVar, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        u4.d dVar2;
        int i17;
        String str2;
        int i18;
        int i19;
        e23.a<Unit> aVar2;
        boolean z15;
        boolean z16;
        a2.j jVar2;
        h4.r rVar3;
        String str3;
        c2 c2Var2;
        p3.p2 p2VarI0;
        final h4.r rVar4;
        final c2 c2Var3;
        final boolean z17;
        final String str4;
        Object objQ;
        float f14;
        int i24;
        float f15;
        int i25;
        int i26;
        dVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1040360695);
        int i27 = i15 & 1;
        if (i27 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            dVar2 = dVar;
            i16 |= o0VarE.B(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        int i28 = i15 & 4;
        if (i28 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(c2Var == null ? -1 : c2Var.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.k(b2Var != null ? b2Var.ordinal() : -1) ? 2048 : 1024;
        }
        int i29 = i15 & 16;
        if (i29 == 0) {
            if ((i14 & 24576) == 0) {
                i16 |= o0VarE.h(z14) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    str2 = str;
                    if (o0VarE.B(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                i19 = i16 | 1572864;
                if ((12582912 & i14) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i19 |= i26;
                } else {
                    aVar2 = aVar;
                }
                if ((i19 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarE.n(i19 & 1, z15)) {
                    if (i27 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i28 != 0) {
                        c2Var3 = c2.SECONDARY;
                    } else {
                        c2Var3 = c2Var;
                    }
                    if (i29 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i17 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    final a2.j jVar3 = (a2.j) objQ;
                    p3.x1 x1Var = p3.n.f135158a;
                    if (z17) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.5f;
                    }
                    final float f16 = f14;
                    d92.b.f58623a.getClass();
                    final long j8 = d92.b.a(o0VarE).k().f63528e;
                    final float fA = b2Var.a();
                    i24 = b2.a.f110919a[b2Var.ordinal()];
                    if (i24 != 1 || i24 == 2) {
                        f15 = 16;
                        g6.f.a aVar3 = g6.f.f75994b;
                    } else if (i24 == 3) {
                        f15 = 20;
                        g6.f.a aVar4 = g6.f.f75994b;
                    } else if (i24 != 4) {
                        lc.u0.r();
                        return;
                    } else {
                        f15 = 24;
                        g6.f.a aVar5 = g6.f.f75994b;
                    }
                    final float f17 = f15;
                    if (b2Var == b2.LARGE) {
                        i25 = 60;
                    } else {
                        i25 = 48;
                    }
                    final u4.d dVar3 = dVar2;
                    final e23.a<Unit> aVar6 = aVar2;
                    p3.v.a(p7.f89282d.c(g6.f.a(i25)), z3.f.c(-139163209, new e23.p() { // from class: l72.a0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            long jA;
                            long jB;
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            f0 f0Var = f0.f110999a;
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var2 = p3.n.f135158a;
                                h4.r rVarA = l4.k.a(rVar4, f16);
                                p5.l.f136032b.getClass();
                                float f18 = fA;
                                g6.f.a aVar7 = g6.f.f75994b;
                                gb gbVarA = fb.a(f18 / 2, 4, 0L, false);
                                p5.l lVarA = p5.l.a(0);
                                a2.j jVar4 = jVar3;
                                boolean z18 = z17;
                                h4.r rVarB = u1.w.b(rVarA, jVar4, gbVarA, z18, null, lVarA, aVar6, 8);
                                f5.p pVar = p7.f89279a;
                                h4.r rVarThen = rVarB.then(d8.f87832a);
                                h4.d.f81522a.getClass();
                                h4.g gVar = h4.d.a.f81524b;
                                f5.z0 z0VarD = c2.q.d(gVar, false);
                                int iHashCode = Long.hashCode(mVar2.getU());
                                p3.i2 i2VarX = mVar2.x();
                                h4.r rVarC = h4.k.c(rVarThen, mVar2);
                                h5.g.V.getClass();
                                h5.e0.a aVar8 = h5.g.a.f81805b;
                                if (mVar2.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar8);
                                } else {
                                    mVar2.c();
                                }
                                h5.g.a.e eVar = h5.g.a.f81810g;
                                b4.c(eVar, z0VarD, mVar2);
                                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                                b4.c(c1623g, i2VarX, mVar2);
                                h5.g.a.b bVar = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                                }
                                h5.g.a.f fVar = h5.g.a.f81807d;
                                b4.c(fVar, rVarC, mVar2);
                                c2.u uVar = c2.u.f22885a;
                                h4.r.a aVar9 = h4.r.S;
                                h4.r rVarQ = c2.x2.q(aVar9, f18);
                                h4.g gVar2 = h4.d.a.f81528f;
                                h4.r rVarC2 = uVar.c(rVarQ, gVar2);
                                c2 c2Var4 = c2.ELEVATED;
                                c2 c2Var5 = c2Var3;
                                h4.r rVarA2 = v2.a(rVarC2, c2Var5 == c2Var4, new b82.p1(j8, f18, 1), mVar2, 0);
                                c2Var5.getClass();
                                int i30 = c2.a.f110948a[c2Var5.ordinal()];
                                if (i30 == 1) {
                                    mVar2.C(836194881);
                                    d92.b.f58623a.getClass();
                                    jA = d92.b.a(mVar2).d().a().a();
                                    mVar2.f();
                                } else if (i30 == 2) {
                                    mVar2.C(836196675);
                                    d92.b.f58623a.getClass();
                                    jA = d92.b.a(mVar2).d().a().b();
                                    mVar2.f();
                                } else if (i30 == 3) {
                                    mVar2.C(836199946);
                                    d92.b.f58623a.getClass();
                                    jA = o4.d0.c(d92.b.d(mVar2) ? 0.8f : 0.7f, ((o4.d0) d92.b.a(mVar2).d().a().f76496r.getF182175a()).f128833a, 14);
                                    mVar2.f();
                                } else {
                                    if (i30 != 4) {
                                        throw n23.j.m(mVar2, 836193282);
                                    }
                                    mVar2.C(836203006);
                                    d92.b.f58623a.getClass();
                                    jA = d92.b.a(mVar2).c().c();
                                    mVar2.f();
                                }
                                h4.r rVarD = u1.n.d(rVarA2, new o4.t1(jA, null), k2.i.f102406a, 4);
                                f5.z0 z0VarD2 = c2.q.d(gVar, false);
                                int iHashCode2 = Long.hashCode(mVar2.getU());
                                p3.i2 i2VarX2 = mVar2.x();
                                h4.r rVarC3 = h4.k.c(rVarD, mVar2);
                                if (mVar2.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar8);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(eVar, z0VarD2, mVar2);
                                b4.c(c1623g, i2VarX2, mVar2);
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                    v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                                }
                                b4.c(fVar, rVarC3, mVar2);
                                if (f0.b.f111001a[c2Var5.ordinal()] == 1) {
                                    mVar2.C(1424956268);
                                    d92.b.f58623a.getClass();
                                    jB = d92.b.a(mVar2).f().c();
                                    mVar2.f();
                                } else {
                                    mVar2.C(1424958122);
                                    d92.b.f58623a.getClass();
                                    jB = d92.b.a(mVar2).f().b();
                                    mVar2.f();
                                }
                                if (!z18) {
                                    o4.d0.c(0.5f, jB, 14);
                                }
                                i7.b(dVar3, str4, uVar.c(c2.x2.q(aVar9, f17), gVar2), jB, mVar2, 0, 0);
                                mVar2.y();
                                mVar2.y();
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 56);
                    rVar3 = rVar4;
                    jVar2 = jVar3;
                    z16 = z17;
                    c2Var2 = c2Var3;
                    str3 = str4;
                } else {
                    o0VarE.e();
                    z16 = z14;
                    jVar2 = jVar;
                    rVar3 = rVar2;
                    str3 = str2;
                    c2Var2 = c2Var;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(this, rVar3, dVar, c2Var2, b2Var, z16, str3, jVar2, aVar, i14, i15);
                }
            }
            i16 |= 196608;
            str2 = str;
            i19 = i16 | 1572864;
            if ((12582912 & i14) == 0) {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i19 |= i26;
            } else {
                aVar2 = aVar;
            }
            if ((i19 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                if (i27 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i28 != 0) {
                    c2Var3 = c2.SECONDARY;
                } else {
                    c2Var3 = c2Var;
                }
                if (i29 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i17 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                final a2.j jVar4 = (a2.j) objQ;
                p3.x1 x1Var2 = p3.n.f135158a;
                if (z17) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.5f;
                }
                final float f18 = f14;
                d92.b.f58623a.getClass();
                final long j14 = d92.b.a(o0VarE).k().f63528e;
                final float fA2 = b2Var.a();
                i24 = b2.a.f110919a[b2Var.ordinal()];
                if (i24 != 1) {
                    f15 = 16;
                    g6.f.a aVar7 = g6.f.f75994b;
                } else {
                    f15 = 16;
                    g6.f.a aVar8 = g6.f.f75994b;
                }
                final float f19 = f15;
                if (b2Var == b2.LARGE) {
                    i25 = 60;
                } else {
                    i25 = 48;
                }
                final u4.d dVar4 = dVar2;
                final e23.a aVar9 = aVar2;
                p3.v.a(p7.f89282d.c(g6.f.a(i25)), z3.f.c(-139163209, new e23.p() { // from class: l72.a0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        long jA;
                        long jB;
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        f0 f0Var = f0.f110999a;
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            h4.r rVarA = l4.k.a(rVar4, f18);
                            p5.l.f136032b.getClass();
                            float f110 = fA2;
                            g6.f.a aVar10 = g6.f.f75994b;
                            gb gbVarA = fb.a(f110 / 2, 4, 0L, false);
                            p5.l lVarA = p5.l.a(0);
                            a2.j jVar5 = jVar4;
                            boolean z18 = z17;
                            h4.r rVarB = u1.w.b(rVarA, jVar5, gbVarA, z18, null, lVarA, aVar9, 8);
                            f5.p pVar = p7.f89279a;
                            h4.r rVarThen = rVarB.then(d8.f87832a);
                            h4.d.f81522a.getClass();
                            h4.g gVar = h4.d.a.f81524b;
                            f5.z0 z0VarD = c2.q.d(gVar, false);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            p3.i2 i2VarX = mVar2.x();
                            h4.r rVarC = h4.k.c(rVarThen, mVar2);
                            h5.g.V.getClass();
                            h5.e0.a aVar11 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar11);
                            } else {
                                mVar2.c();
                            }
                            h5.g.a.e eVar = h5.g.a.f81810g;
                            b4.c(eVar, z0VarD, mVar2);
                            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                            b4.c(c1623g, i2VarX, mVar2);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar);
                            }
                            h5.g.a.f fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC, mVar2);
                            c2.u uVar = c2.u.f22885a;
                            h4.r.a aVar12 = h4.r.S;
                            h4.r rVarQ = c2.x2.q(aVar12, f110);
                            h4.g gVar2 = h4.d.a.f81528f;
                            h4.r rVarC2 = uVar.c(rVarQ, gVar2);
                            c2 c2Var4 = c2.ELEVATED;
                            c2 c2Var5 = c2Var3;
                            h4.r rVarA2 = v2.a(rVarC2, c2Var5 == c2Var4, new b82.p1(j14, f110, 1), mVar2, 0);
                            c2Var5.getClass();
                            int i30 = c2.a.f110948a[c2Var5.ordinal()];
                            if (i30 == 1) {
                                mVar2.C(836194881);
                                d92.b.f58623a.getClass();
                                jA = d92.b.a(mVar2).d().a().a();
                                mVar2.f();
                            } else if (i30 == 2) {
                                mVar2.C(836196675);
                                d92.b.f58623a.getClass();
                                jA = d92.b.a(mVar2).d().a().b();
                                mVar2.f();
                            } else if (i30 == 3) {
                                mVar2.C(836199946);
                                d92.b.f58623a.getClass();
                                jA = o4.d0.c(d92.b.d(mVar2) ? 0.8f : 0.7f, ((o4.d0) d92.b.a(mVar2).d().a().f76496r.getF182175a()).f128833a, 14);
                                mVar2.f();
                            } else {
                                if (i30 != 4) {
                                    throw n23.j.m(mVar2, 836193282);
                                }
                                mVar2.C(836203006);
                                d92.b.f58623a.getClass();
                                jA = d92.b.a(mVar2).c().c();
                                mVar2.f();
                            }
                            h4.r rVarD = u1.n.d(rVarA2, new o4.t1(jA, null), k2.i.f102406a, 4);
                            f5.z0 z0VarD2 = c2.q.d(gVar, false);
                            int iHashCode2 = Long.hashCode(mVar2.getU());
                            p3.i2 i2VarX2 = mVar2.x();
                            h4.r rVarC3 = h4.k.c(rVarD, mVar2);
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar11);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar, z0VarD2, mVar2);
                            b4.c(c1623g, i2VarX2, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                            }
                            b4.c(fVar, rVarC3, mVar2);
                            if (f0.b.f111001a[c2Var5.ordinal()] == 1) {
                                mVar2.C(1424956268);
                                d92.b.f58623a.getClass();
                                jB = d92.b.a(mVar2).f().c();
                                mVar2.f();
                            } else {
                                mVar2.C(1424958122);
                                d92.b.f58623a.getClass();
                                jB = d92.b.a(mVar2).f().b();
                                mVar2.f();
                            }
                            if (!z18) {
                                o4.d0.c(0.5f, jB, 14);
                            }
                            i7.b(dVar4, str4, uVar.c(c2.x2.q(aVar12, f19), gVar2), jB, mVar2, 0, 0);
                            mVar2.y();
                            mVar2.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 56);
                rVar3 = rVar4;
                jVar2 = jVar4;
                z16 = z17;
                c2Var2 = c2Var3;
                str3 = str4;
            } else {
                o0VarE.e();
                z16 = z14;
                jVar2 = jVar;
                rVar3 = rVar2;
                str3 = str2;
                c2Var2 = c2Var;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e2.b(this, rVar3, dVar, c2Var2, b2Var, z16, str3, jVar2, aVar, i14, i15);
            }
        }
        i16 |= 24576;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                str2 = str;
                if (o0VarE.B(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            i19 = i16 | 1572864;
            if ((12582912 & i14) == 0) {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i19 |= i26;
            } else {
                aVar2 = aVar;
            }
            if ((i19 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                if (i27 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i28 != 0) {
                    c2Var3 = c2.SECONDARY;
                } else {
                    c2Var3 = c2Var;
                }
                if (i29 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i17 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                final a2.j jVar5 = (a2.j) objQ;
                p3.x1 x1Var3 = p3.n.f135158a;
                if (z17) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.5f;
                }
                final float f110 = f14;
                d92.b.f58623a.getClass();
                final long j15 = d92.b.a(o0VarE).k().f63528e;
                final float fA3 = b2Var.a();
                i24 = b2.a.f110919a[b2Var.ordinal()];
                if (i24 != 1) {
                    f15 = 16;
                    g6.f.a aVar10 = g6.f.f75994b;
                } else {
                    f15 = 16;
                    g6.f.a aVar11 = g6.f.f75994b;
                }
                final float f111 = f15;
                if (b2Var == b2.LARGE) {
                    i25 = 60;
                } else {
                    i25 = 48;
                }
                final u4.d dVar5 = dVar2;
                final e23.a aVar12 = aVar2;
                p3.v.a(p7.f89282d.c(g6.f.a(i25)), z3.f.c(-139163209, new e23.p() { // from class: l72.a0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        long jA;
                        long jB;
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        f0 f0Var = f0.f110999a;
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var4 = p3.n.f135158a;
                            h4.r rVarA = l4.k.a(rVar4, f110);
                            p5.l.f136032b.getClass();
                            float f112 = fA3;
                            g6.f.a aVar13 = g6.f.f75994b;
                            gb gbVarA = fb.a(f112 / 2, 4, 0L, false);
                            p5.l lVarA = p5.l.a(0);
                            a2.j jVar6 = jVar5;
                            boolean z18 = z17;
                            h4.r rVarB = u1.w.b(rVarA, jVar6, gbVarA, z18, null, lVarA, aVar12, 8);
                            f5.p pVar = p7.f89279a;
                            h4.r rVarThen = rVarB.then(d8.f87832a);
                            h4.d.f81522a.getClass();
                            h4.g gVar = h4.d.a.f81524b;
                            f5.z0 z0VarD = c2.q.d(gVar, false);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            p3.i2 i2VarX = mVar2.x();
                            h4.r rVarC = h4.k.c(rVarThen, mVar2);
                            h5.g.V.getClass();
                            h5.e0.a aVar14 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar14);
                            } else {
                                mVar2.c();
                            }
                            h5.g.a.e eVar = h5.g.a.f81810g;
                            b4.c(eVar, z0VarD, mVar2);
                            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                            b4.c(c1623g, i2VarX, mVar2);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar);
                            }
                            h5.g.a.f fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC, mVar2);
                            c2.u uVar = c2.u.f22885a;
                            h4.r.a aVar15 = h4.r.S;
                            h4.r rVarQ = c2.x2.q(aVar15, f112);
                            h4.g gVar2 = h4.d.a.f81528f;
                            h4.r rVarC2 = uVar.c(rVarQ, gVar2);
                            c2 c2Var4 = c2.ELEVATED;
                            c2 c2Var5 = c2Var3;
                            h4.r rVarA2 = v2.a(rVarC2, c2Var5 == c2Var4, new b82.p1(j15, f112, 1), mVar2, 0);
                            c2Var5.getClass();
                            int i30 = c2.a.f110948a[c2Var5.ordinal()];
                            if (i30 == 1) {
                                mVar2.C(836194881);
                                d92.b.f58623a.getClass();
                                jA = d92.b.a(mVar2).d().a().a();
                                mVar2.f();
                            } else if (i30 == 2) {
                                mVar2.C(836196675);
                                d92.b.f58623a.getClass();
                                jA = d92.b.a(mVar2).d().a().b();
                                mVar2.f();
                            } else if (i30 == 3) {
                                mVar2.C(836199946);
                                d92.b.f58623a.getClass();
                                jA = o4.d0.c(d92.b.d(mVar2) ? 0.8f : 0.7f, ((o4.d0) d92.b.a(mVar2).d().a().f76496r.getF182175a()).f128833a, 14);
                                mVar2.f();
                            } else {
                                if (i30 != 4) {
                                    throw n23.j.m(mVar2, 836193282);
                                }
                                mVar2.C(836203006);
                                d92.b.f58623a.getClass();
                                jA = d92.b.a(mVar2).c().c();
                                mVar2.f();
                            }
                            h4.r rVarD = u1.n.d(rVarA2, new o4.t1(jA, null), k2.i.f102406a, 4);
                            f5.z0 z0VarD2 = c2.q.d(gVar, false);
                            int iHashCode2 = Long.hashCode(mVar2.getU());
                            p3.i2 i2VarX2 = mVar2.x();
                            h4.r rVarC3 = h4.k.c(rVarD, mVar2);
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar14);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar, z0VarD2, mVar2);
                            b4.c(c1623g, i2VarX2, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                            }
                            b4.c(fVar, rVarC3, mVar2);
                            if (f0.b.f111001a[c2Var5.ordinal()] == 1) {
                                mVar2.C(1424956268);
                                d92.b.f58623a.getClass();
                                jB = d92.b.a(mVar2).f().c();
                                mVar2.f();
                            } else {
                                mVar2.C(1424958122);
                                d92.b.f58623a.getClass();
                                jB = d92.b.a(mVar2).f().b();
                                mVar2.f();
                            }
                            if (!z18) {
                                o4.d0.c(0.5f, jB, 14);
                            }
                            i7.b(dVar5, str4, uVar.c(c2.x2.q(aVar15, f111), gVar2), jB, mVar2, 0, 0);
                            mVar2.y();
                            mVar2.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 56);
                rVar3 = rVar4;
                jVar2 = jVar5;
                z16 = z17;
                c2Var2 = c2Var3;
                str3 = str4;
            } else {
                o0VarE.e();
                z16 = z14;
                jVar2 = jVar;
                rVar3 = rVar2;
                str3 = str2;
                c2Var2 = c2Var;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e2.b(this, rVar3, dVar, c2Var2, b2Var, z16, str3, jVar2, aVar, i14, i15);
            }
        }
        i16 |= 196608;
        str2 = str;
        i19 = i16 | 1572864;
        if ((12582912 & i14) == 0) {
            aVar2 = aVar;
            if (o0VarE.r(aVar2)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i19 |= i26;
        } else {
            aVar2 = aVar;
        }
        if ((i19 & 4793491) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i19 & 1, z15)) {
            if (i27 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i28 != 0) {
                c2Var3 = c2.SECONDARY;
            } else {
                c2Var3 = c2Var;
            }
            if (i29 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            if (i17 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            final a2.j jVar6 = (a2.j) objQ;
            p3.x1 x1Var4 = p3.n.f135158a;
            if (z17) {
                f14 = 1.0f;
            } else {
                f14 = 0.5f;
            }
            final float f112 = f14;
            d92.b.f58623a.getClass();
            final long j16 = d92.b.a(o0VarE).k().f63528e;
            final float fA4 = b2Var.a();
            i24 = b2.a.f110919a[b2Var.ordinal()];
            if (i24 != 1) {
                f15 = 16;
                g6.f.a aVar13 = g6.f.f75994b;
            } else {
                f15 = 16;
                g6.f.a aVar14 = g6.f.f75994b;
            }
            final float f113 = f15;
            if (b2Var == b2.LARGE) {
                i25 = 60;
            } else {
                i25 = 48;
            }
            final u4.d dVar6 = dVar2;
            final e23.a aVar15 = aVar2;
            p3.v.a(p7.f89282d.c(g6.f.a(i25)), z3.f.c(-139163209, new e23.p() { // from class: l72.a0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    long jA;
                    long jB;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    f0 f0Var = f0.f110999a;
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var5 = p3.n.f135158a;
                        h4.r rVarA = l4.k.a(rVar4, f112);
                        p5.l.f136032b.getClass();
                        float f114 = fA4;
                        g6.f.a aVar16 = g6.f.f75994b;
                        gb gbVarA = fb.a(f114 / 2, 4, 0L, false);
                        p5.l lVarA = p5.l.a(0);
                        a2.j jVar7 = jVar6;
                        boolean z18 = z17;
                        h4.r rVarB = u1.w.b(rVarA, jVar7, gbVarA, z18, null, lVarA, aVar15, 8);
                        f5.p pVar = p7.f89279a;
                        h4.r rVarThen = rVarB.then(d8.f87832a);
                        h4.d.f81522a.getClass();
                        h4.g gVar = h4.d.a.f81524b;
                        f5.z0 z0VarD = c2.q.d(gVar, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        p3.i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarThen, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar17 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar17);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar = h5.g.a.f81810g;
                        b4.c(eVar, z0VarD, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, mVar2);
                        c2.u uVar = c2.u.f22885a;
                        h4.r.a aVar18 = h4.r.S;
                        h4.r rVarQ = c2.x2.q(aVar18, f114);
                        h4.g gVar2 = h4.d.a.f81528f;
                        h4.r rVarC2 = uVar.c(rVarQ, gVar2);
                        c2 c2Var4 = c2.ELEVATED;
                        c2 c2Var5 = c2Var3;
                        h4.r rVarA2 = v2.a(rVarC2, c2Var5 == c2Var4, new b82.p1(j16, f114, 1), mVar2, 0);
                        c2Var5.getClass();
                        int i30 = c2.a.f110948a[c2Var5.ordinal()];
                        if (i30 == 1) {
                            mVar2.C(836194881);
                            d92.b.f58623a.getClass();
                            jA = d92.b.a(mVar2).d().a().a();
                            mVar2.f();
                        } else if (i30 == 2) {
                            mVar2.C(836196675);
                            d92.b.f58623a.getClass();
                            jA = d92.b.a(mVar2).d().a().b();
                            mVar2.f();
                        } else if (i30 == 3) {
                            mVar2.C(836199946);
                            d92.b.f58623a.getClass();
                            jA = o4.d0.c(d92.b.d(mVar2) ? 0.8f : 0.7f, ((o4.d0) d92.b.a(mVar2).d().a().f76496r.getF182175a()).f128833a, 14);
                            mVar2.f();
                        } else {
                            if (i30 != 4) {
                                throw n23.j.m(mVar2, 836193282);
                            }
                            mVar2.C(836203006);
                            d92.b.f58623a.getClass();
                            jA = d92.b.a(mVar2).c().c();
                            mVar2.f();
                        }
                        h4.r rVarD = u1.n.d(rVarA2, new o4.t1(jA, null), k2.i.f102406a, 4);
                        f5.z0 z0VarD2 = c2.q.d(gVar, false);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        p3.i2 i2VarX2 = mVar2.x();
                        h4.r rVarC3 = h4.k.c(rVarD, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar17);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, z0VarD2, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC3, mVar2);
                        if (f0.b.f111001a[c2Var5.ordinal()] == 1) {
                            mVar2.C(1424956268);
                            d92.b.f58623a.getClass();
                            jB = d92.b.a(mVar2).f().c();
                            mVar2.f();
                        } else {
                            mVar2.C(1424958122);
                            d92.b.f58623a.getClass();
                            jB = d92.b.a(mVar2).f().b();
                            mVar2.f();
                        }
                        if (!z18) {
                            o4.d0.c(0.5f, jB, 14);
                        }
                        i7.b(dVar6, str4, uVar.c(c2.x2.q(aVar18, f113), gVar2), jB, mVar2, 0, 0);
                        mVar2.y();
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 56);
            rVar3 = rVar4;
            jVar2 = jVar6;
            z16 = z17;
            c2Var2 = c2Var3;
            str3 = str4;
        } else {
            o0VarE.e();
            z16 = z14;
            jVar2 = jVar;
            rVar3 = rVar2;
            str3 = str2;
            c2Var2 = c2Var;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e2.b(this, rVar3, dVar, c2Var2, b2Var, z16, str3, jVar2, aVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public final void d(int i14, int i15, e23.a aVar, h4.r rVar, String str, p3.m mVar, u4.d dVar, boolean z14) {
        u4.d dVar2;
        int i16;
        h4.r rVar2;
        int i17;
        boolean z15;
        int i18;
        byte b14;
        boolean z16;
        p3.o0 o0Var;
        h4.r rVar3;
        boolean z17;
        p3.p2 p2VarI0;
        u4.d dVar3;
        h4.r rVar4;
        boolean z18;
        boolean z19;
        int i19;
        p3.o0 o0VarL = vb.h.l(1761099569, aVar, str, mVar);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            dVar2 = dVar;
        } else if ((i14 & 6) == 0) {
            dVar2 = dVar;
            i16 = (o0VarL.B(dVar2) ? 4 : 2) | i14;
        } else {
            dVar2 = dVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarL.B(str) ? 32 : 16;
        }
        int i25 = i15 & 4;
        if (i25 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarL.B(rVar2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarL.h(z15)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarL.r(aVar)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i16 |= i19;
                }
                b14 = 0;
                if ((i16 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarL.n(i16 & 1, z16)) {
                    if (i24 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jA = d92.b.a(o0VarL).d().a().a();
                    long j8 = d92.b.a(o0VarL).k().f63527d;
                    if (dVar3 != null) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    e23.p pVarO = gg.b.o(z19, z3.f.c(332458470, new z(dVar3, z18, b14, b14), o0VarL), o0VarL);
                    i3.c1 c1Var = i3.c1.f87691a;
                    long jC = o4.d0.c(0.5f, jA, 14);
                    long jC2 = o4.d0.c(0.5f, j8, 14);
                    c1Var.getClass();
                    o0Var = o0VarL;
                    i0.c(pVarO, str, rVar4, z18, i3.c1.a(jA, j8, jC, jC2, o0Var, 0), null, aVar, d92.b.a(o0Var).k().c(), null, o0Var, (i16 & 8176) | (3670016 & (i16 << 6)), 288);
                    dVar2 = dVar3;
                    rVar3 = rVar4;
                    z17 = z18;
                } else {
                    o0Var = o0VarL;
                    o0Var.e();
                    rVar3 = rVar2;
                    z17 = z15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d62.o((Object) this, dVar2, str, rVar3, z17, aVar, i14, i15, 11);
                }
            }
            i16 |= 3072;
            z15 = z14;
            if ((i14 & 24576) == 0) {
                if (o0VarL.r(aVar)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            b14 = 0;
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    dVar3 = null;
                } else {
                    dVar3 = dVar2;
                }
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jA2 = d92.b.a(o0VarL).d().a().a();
                long j14 = d92.b.a(o0VarL).k().f63527d;
                if (dVar3 != null) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                e23.p pVarO2 = gg.b.o(z19, z3.f.c(332458470, new z(dVar3, z18, b14, b14), o0VarL), o0VarL);
                i3.c1 c1Var2 = i3.c1.f87691a;
                long jC3 = o4.d0.c(0.5f, jA2, 14);
                long jC4 = o4.d0.c(0.5f, j14, 14);
                c1Var2.getClass();
                o0Var = o0VarL;
                i0.c(pVarO2, str, rVar4, z18, i3.c1.a(jA2, j14, jC3, jC4, o0Var, 0), null, aVar, d92.b.a(o0Var).k().c(), null, o0Var, (i16 & 8176) | (3670016 & (i16 << 6)), 288);
                dVar2 = dVar3;
                rVar3 = rVar4;
                z17 = z18;
            } else {
                o0Var = o0VarL;
                o0Var.e();
                rVar3 = rVar2;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o((Object) this, dVar2, str, rVar3, z17, aVar, i14, i15, 11);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                if (o0VarL.h(z15)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarL.r(aVar)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            b14 = 0;
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    dVar3 = null;
                } else {
                    dVar3 = dVar2;
                }
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jA3 = d92.b.a(o0VarL).d().a().a();
                long j15 = d92.b.a(o0VarL).k().f63527d;
                if (dVar3 != null) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                e23.p pVarO3 = gg.b.o(z19, z3.f.c(332458470, new z(dVar3, z18, b14, b14), o0VarL), o0VarL);
                i3.c1 c1Var3 = i3.c1.f87691a;
                long jC5 = o4.d0.c(0.5f, jA3, 14);
                long jC6 = o4.d0.c(0.5f, j15, 14);
                c1Var3.getClass();
                o0Var = o0VarL;
                i0.c(pVarO3, str, rVar4, z18, i3.c1.a(jA3, j15, jC5, jC6, o0Var, 0), null, aVar, d92.b.a(o0Var).k().c(), null, o0Var, (i16 & 8176) | (3670016 & (i16 << 6)), 288);
                dVar2 = dVar3;
                rVar3 = rVar4;
                z17 = z18;
            } else {
                o0Var = o0VarL;
                o0Var.e();
                rVar3 = rVar2;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o((Object) this, dVar2, str, rVar3, z17, aVar, i14, i15, 11);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i14 & 24576) == 0) {
            if (o0VarL.r(aVar)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i16 |= i19;
        }
        b14 = 0;
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarL.n(i16 & 1, z16)) {
            if (i24 != 0) {
                dVar3 = null;
            } else {
                dVar3 = dVar2;
            }
            if (i25 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i17 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jA4 = d92.b.a(o0VarL).d().a().a();
            long j16 = d92.b.a(o0VarL).k().f63527d;
            if (dVar3 != null) {
                z19 = true;
            } else {
                z19 = false;
            }
            e23.p pVarO4 = gg.b.o(z19, z3.f.c(332458470, new z(dVar3, z18, b14, b14), o0VarL), o0VarL);
            i3.c1 c1Var4 = i3.c1.f87691a;
            long jC7 = o4.d0.c(0.5f, jA4, 14);
            long jC8 = o4.d0.c(0.5f, j16, 14);
            c1Var4.getClass();
            o0Var = o0VarL;
            i0.c(pVarO4, str, rVar4, z18, i3.c1.a(jA4, j16, jC7, jC8, o0Var, 0), null, aVar, d92.b.a(o0Var).k().c(), null, o0Var, (i16 & 8176) | (3670016 & (i16 << 6)), 288);
            dVar2 = dVar3;
            rVar3 = rVar4;
            z17 = z18;
        } else {
            o0Var = o0VarL;
            o0Var.e();
            rVar3 = rVar2;
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o((Object) this, dVar2, str, rVar3, z17, aVar, i14, i15, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public final void e(e23.p<? super p3.m, ? super Integer, Unit> pVar, String str, h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str2;
        h4.r rVar2;
        boolean z15;
        boolean z16;
        p3.o0 o0Var;
        boolean z17;
        p3.p2 p2VarI0;
        int i17;
        pVar.getClass();
        str.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-554851900);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            str2 = str;
            i16 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i14 & 384) == 0) {
            rVar2 = rVar;
            i16 |= o0VarE.B(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        int i18 = i15 & 8;
        if (i18 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i16 |= i17;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i18 != 0) {
                    z15 = true;
                }
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jA = d92.b.a(o0VarE).d().a().a();
                long j8 = d92.b.a(o0VarE).k().f63527d;
                i3.c1 c1Var = i3.c1.f87691a;
                long jC = o4.d0.c(0.5f, jA, 14);
                long jC2 = o4.d0.c(0.5f, j8, 14);
                c1Var.getClass();
                boolean z18 = z15;
                i0.c(pVar, str2, rVar2, z18, i3.c1.a(jA, j8, jC, jC2, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, (i16 & 8190) | ((i16 << 6) & 3670016), 288);
                o0Var = o0VarE;
                z17 = z18;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new y(this, pVar, str, rVar, z17, aVar, i14, i15);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i14 & 24576) != 0) {
            if (o0VarE.r(aVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i16 |= i17;
        }
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i18 != 0) {
                z15 = true;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jA2 = d92.b.a(o0VarE).d().a().a();
            long j14 = d92.b.a(o0VarE).k().f63527d;
            i3.c1 c1Var2 = i3.c1.f87691a;
            long jC3 = o4.d0.c(0.5f, jA2, 14);
            long jC4 = o4.d0.c(0.5f, j14, 14);
            c1Var2.getClass();
            boolean z19 = z15;
            i0.c(pVar, str2, rVar2, z19, i3.c1.a(jA2, j14, jC3, jC4, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, (i16 & 8190) | ((i16 << 6) & 3670016), 288);
            o0Var = o0VarE;
            z17 = z19;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(this, pVar, str, rVar, z17, aVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118  */
    /* JADX WARN: Code duplicated, block: B:69:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public final void f(h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, String str, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        int i17;
        String str2;
        int i18;
        int i19;
        boolean z15;
        int i24;
        boolean z16;
        p3.o0 o0Var;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        String str3;
        boolean z17;
        p3.p2 p2VarI0;
        boolean z18;
        int i25;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-640238354);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i26 = i15 & 2;
        if (i26 == 0) {
            if ((i14 & 48) == 0) {
                pVar2 = pVar;
                i16 |= o0VarE.r(pVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    str2 = str;
                    if (o0VarE.B(str2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 8;
                if (i19 != 0) {
                    if ((i14 & 3072) == 0) {
                        z15 = z14;
                        if (o0VarE.h(z15)) {
                            i24 = 2048;
                        } else {
                            i24 = 1024;
                        }
                        i16 |= i24;
                    }
                    if ((i14 & 24576) != 0) {
                        if (o0VarE.r(aVar)) {
                            i25 = 16384;
                        } else {
                            i25 = 8192;
                        }
                        i16 |= i25;
                    }
                    if ((i16 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i16 & 1, z16)) {
                        if (i26 != 0) {
                            pVar2 = null;
                        }
                        if (i17 != 0) {
                            str2 = null;
                        }
                        if (i19 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        d92.b.f58623a.getClass();
                        long jA = d92.b.a(o0VarE).d().a().a();
                        long j8 = d92.b.a(o0VarE).k().f63527d;
                        i3.c1 c1Var = i3.c1.f87691a;
                        long jC = o4.d0.c(0.5f, jA, 14);
                        long jC2 = o4.d0.c(0.5f, j8, 14);
                        c1Var.getClass();
                        int i27 = i16 << 6;
                        boolean z19 = z18;
                        e23.p<? super p3.m, ? super Integer, Unit> pVar4 = pVar2;
                        String str4 = str2;
                        i0.c(pVar4, str4, rVar, z19, i3.c1.a(jA, j8, jC, jC2, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, ((i16 >> 3) & 126) | (i27 & 896) | (i16 & 7168) | (3670016 & i27), 288);
                        o0Var = o0VarE;
                        pVar3 = pVar4;
                        str3 = str4;
                        z17 = z19;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        pVar3 = pVar2;
                        str3 = str2;
                        z17 = z15;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new y(this, rVar, pVar3, str3, z17, aVar, i14, i15, 4);
                    }
                }
                i16 |= 3072;
                z15 = z14;
                if ((i14 & 24576) != 0) {
                    if (o0VarE.r(aVar)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i16 |= i25;
                }
                if ((i16 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i26 != 0) {
                        pVar2 = null;
                    }
                    if (i17 != 0) {
                        str2 = null;
                    }
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jA2 = d92.b.a(o0VarE).d().a().a();
                    long j14 = d92.b.a(o0VarE).k().f63527d;
                    i3.c1 c1Var2 = i3.c1.f87691a;
                    long jC3 = o4.d0.c(0.5f, jA2, 14);
                    long jC4 = o4.d0.c(0.5f, j14, 14);
                    c1Var2.getClass();
                    int i28 = i16 << 6;
                    boolean z110 = z18;
                    e23.p<? super p3.m, ? super Integer, Unit> pVar5 = pVar2;
                    String str5 = str2;
                    i0.c(pVar5, str5, rVar, z110, i3.c1.a(jA2, j14, jC3, jC4, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, ((i16 >> 3) & 126) | (i28 & 896) | (i16 & 7168) | (3670016 & i28), 288);
                    o0Var = o0VarE;
                    pVar3 = pVar5;
                    str3 = str5;
                    z17 = z110;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    pVar3 = pVar2;
                    str3 = str2;
                    z17 = z15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new y(this, rVar, pVar3, str3, z17, aVar, i14, i15, 4);
                }
            }
            i16 |= 384;
            str2 = str;
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                if ((i14 & 24576) != 0) {
                    if (o0VarE.r(aVar)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i16 |= i25;
                }
                if ((i16 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i26 != 0) {
                        pVar2 = null;
                    }
                    if (i17 != 0) {
                        str2 = null;
                    }
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jA3 = d92.b.a(o0VarE).d().a().a();
                    long j15 = d92.b.a(o0VarE).k().f63527d;
                    i3.c1 c1Var3 = i3.c1.f87691a;
                    long jC5 = o4.d0.c(0.5f, jA3, 14);
                    long jC6 = o4.d0.c(0.5f, j15, 14);
                    c1Var3.getClass();
                    int i29 = i16 << 6;
                    boolean z111 = z18;
                    e23.p<? super p3.m, ? super Integer, Unit> pVar6 = pVar2;
                    String str6 = str2;
                    i0.c(pVar6, str6, rVar, z111, i3.c1.a(jA3, j15, jC5, jC6, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, ((i16 >> 3) & 126) | (i29 & 896) | (i16 & 7168) | (3670016 & i29), 288);
                    o0Var = o0VarE;
                    pVar3 = pVar6;
                    str3 = str6;
                    z17 = z111;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    pVar3 = pVar2;
                    str3 = str2;
                    z17 = z15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new y(this, rVar, pVar3, str3, z17, aVar, i14, i15, 4);
                }
            }
            i16 |= 3072;
            z15 = z14;
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i16 |= i25;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i26 != 0) {
                    pVar2 = null;
                }
                if (i17 != 0) {
                    str2 = null;
                }
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jA4 = d92.b.a(o0VarE).d().a().a();
                long j16 = d92.b.a(o0VarE).k().f63527d;
                i3.c1 c1Var4 = i3.c1.f87691a;
                long jC7 = o4.d0.c(0.5f, jA4, 14);
                long jC8 = o4.d0.c(0.5f, j16, 14);
                c1Var4.getClass();
                int i210 = i16 << 6;
                boolean z112 = z18;
                e23.p<? super p3.m, ? super Integer, Unit> pVar7 = pVar2;
                String str7 = str2;
                i0.c(pVar7, str7, rVar, z112, i3.c1.a(jA4, j16, jC7, jC8, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, ((i16 >> 3) & 126) | (i210 & 896) | (i16 & 7168) | (3670016 & i210), 288);
                o0Var = o0VarE;
                pVar3 = pVar7;
                str3 = str7;
                z17 = z112;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar3 = pVar2;
                str3 = str2;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new y(this, rVar, pVar3, str3, z17, aVar, i14, i15, 4);
            }
        }
        i16 |= 48;
        pVar2 = pVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                str2 = str;
                if (o0VarE.B(str2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                if ((i14 & 24576) != 0) {
                    if (o0VarE.r(aVar)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i16 |= i25;
                }
                if ((i16 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i26 != 0) {
                        pVar2 = null;
                    }
                    if (i17 != 0) {
                        str2 = null;
                    }
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jA5 = d92.b.a(o0VarE).d().a().a();
                    long j17 = d92.b.a(o0VarE).k().f63527d;
                    i3.c1 c1Var5 = i3.c1.f87691a;
                    long jC9 = o4.d0.c(0.5f, jA5, 14);
                    long jC10 = o4.d0.c(0.5f, j17, 14);
                    c1Var5.getClass();
                    int i211 = i16 << 6;
                    boolean z113 = z18;
                    e23.p<? super p3.m, ? super Integer, Unit> pVar8 = pVar2;
                    String str8 = str2;
                    i0.c(pVar8, str8, rVar, z113, i3.c1.a(jA5, j17, jC9, jC10, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, ((i16 >> 3) & 126) | (i211 & 896) | (i16 & 7168) | (3670016 & i211), 288);
                    o0Var = o0VarE;
                    pVar3 = pVar8;
                    str3 = str8;
                    z17 = z113;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    pVar3 = pVar2;
                    str3 = str2;
                    z17 = z15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new y(this, rVar, pVar3, str3, z17, aVar, i14, i15, 4);
                }
            }
            i16 |= 3072;
            z15 = z14;
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i16 |= i25;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i26 != 0) {
                    pVar2 = null;
                }
                if (i17 != 0) {
                    str2 = null;
                }
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jA6 = d92.b.a(o0VarE).d().a().a();
                long j18 = d92.b.a(o0VarE).k().f63527d;
                i3.c1 c1Var6 = i3.c1.f87691a;
                long jC11 = o4.d0.c(0.5f, jA6, 14);
                long jC12 = o4.d0.c(0.5f, j18, 14);
                c1Var6.getClass();
                int i212 = i16 << 6;
                boolean z114 = z18;
                e23.p<? super p3.m, ? super Integer, Unit> pVar9 = pVar2;
                String str9 = str2;
                i0.c(pVar9, str9, rVar, z114, i3.c1.a(jA6, j18, jC11, jC12, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, ((i16 >> 3) & 126) | (i212 & 896) | (i16 & 7168) | (3670016 & i212), 288);
                o0Var = o0VarE;
                pVar3 = pVar9;
                str3 = str9;
                z17 = z114;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar3 = pVar2;
                str3 = str2;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new y(this, rVar, pVar3, str3, z17, aVar, i14, i15, 4);
            }
        }
        i16 |= 384;
        str2 = str;
        i19 = i15 & 8;
        if (i19 != 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i16 |= i24;
            }
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i16 |= i25;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i26 != 0) {
                    pVar2 = null;
                }
                if (i17 != 0) {
                    str2 = null;
                }
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jA7 = d92.b.a(o0VarE).d().a().a();
                long j19 = d92.b.a(o0VarE).k().f63527d;
                i3.c1 c1Var7 = i3.c1.f87691a;
                long jC13 = o4.d0.c(0.5f, jA7, 14);
                long jC14 = o4.d0.c(0.5f, j19, 14);
                c1Var7.getClass();
                int i213 = i16 << 6;
                boolean z115 = z18;
                e23.p<? super p3.m, ? super Integer, Unit> pVar10 = pVar2;
                String str10 = str2;
                i0.c(pVar10, str10, rVar, z115, i3.c1.a(jA7, j19, jC13, jC14, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, ((i16 >> 3) & 126) | (i213 & 896) | (i16 & 7168) | (3670016 & i213), 288);
                o0Var = o0VarE;
                pVar3 = pVar10;
                str3 = str10;
                z17 = z115;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar3 = pVar2;
                str3 = str2;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new y(this, rVar, pVar3, str3, z17, aVar, i14, i15, 4);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i14 & 24576) != 0) {
            if (o0VarE.r(aVar)) {
                i25 = 16384;
            } else {
                i25 = 8192;
            }
            i16 |= i25;
        }
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i26 != 0) {
                pVar2 = null;
            }
            if (i17 != 0) {
                str2 = null;
            }
            if (i19 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jA8 = d92.b.a(o0VarE).d().a().a();
            long j110 = d92.b.a(o0VarE).k().f63527d;
            i3.c1 c1Var8 = i3.c1.f87691a;
            long jC15 = o4.d0.c(0.5f, jA8, 14);
            long jC16 = o4.d0.c(0.5f, j110, 14);
            c1Var8.getClass();
            int i214 = i16 << 6;
            boolean z116 = z18;
            e23.p<? super p3.m, ? super Integer, Unit> pVar11 = pVar2;
            String str11 = str2;
            i0.c(pVar11, str11, rVar, z116, i3.c1.a(jA8, j110, jC15, jC16, o0VarE, 0), null, aVar, d92.b.a(o0VarE).k().c(), null, o0VarE, ((i16 >> 3) & 126) | (i214 & 896) | (i16 & 7168) | (3670016 & i214), 288);
            o0Var = o0VarE;
            pVar3 = pVar11;
            str3 = str11;
            z17 = z116;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            pVar3 = pVar2;
            str3 = str2;
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(this, rVar, pVar3, str3, z17, aVar, i14, i15, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void g(int i14, int i15, long j8, h4.r rVar, p3.m mVar) {
        h4.r rVar2;
        int i16;
        long jC;
        int i17;
        boolean z14;
        long j14;
        h4.r rVar3;
        p3.p2 p2VarI0;
        h4.r rVar4;
        p3.o0 o0VarE = mVar.E(1297280263);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        }
        if ((i15 & 2) == 0) {
            jC = j8;
            int i19 = o0VarE.l(jC) ? 32 : 16;
            i17 = i16 | i19;
            if ((i17 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i18 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i15 & 2) != 0) {
                        d92.b.f58623a.getClass();
                        jC = d92.b.a(o0VarE).f().c();
                        i17 &= -113;
                    }
                    rVar2 = rVar4;
                } else {
                    o0VarE.e();
                    if ((i15 & 2) != 0) {
                        i17 &= -113;
                    }
                }
                int i24 = i17;
                long j15 = jC;
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                g6.f.a aVar = g6.f.f75994b;
                i0.b(rVar2, j15, 20, o0VarE, (i24 & 14) | 384 | (i24 & 112));
                j14 = j15;
            } else {
                o0VarE.e();
                j14 = jC;
            }
            rVar3 = rVar2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d70.m(this, rVar3, j14, i14, i15);
            }
        }
        jC = j8;
        i17 = i16 | i19;
        if ((i17 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i18 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i15 & 2) != 0) {
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).f().c();
                    i17 &= -113;
                }
                rVar2 = rVar4;
            } else {
                if (i18 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i15 & 2) != 0) {
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).f().c();
                    i17 &= -113;
                }
                rVar2 = rVar4;
            }
            int i25 = i17;
            long j16 = jC;
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            g6.f.a aVar2 = g6.f.f75994b;
            i0.b(rVar2, j16, 20, o0VarE, (i25 & 14) | 384 | (i25 & 112));
            j14 = j16;
        } else {
            o0VarE.e();
            j14 = jC;
        }
        rVar3 = rVar2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.m(this, rVar3, j14, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public final void h(e23.p pVar, String str, h4.r rVar, boolean z14, e23.a aVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        e23.p pVar2;
        String str2;
        int i17;
        boolean z15;
        int i18;
        boolean z16;
        p3.o0 o0Var;
        String str3;
        boolean z17;
        p3.p2 p2VarI0;
        h4.r rVar3;
        String str4;
        int i19;
        pVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-496656964);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            pVar2 = pVar;
            i16 |= o0VarE.r(pVar2) ? 32 : 16;
        } else {
            pVar2 = pVar;
        }
        int i25 = i15 & 4;
        if (i25 == 0) {
            if ((i14 & 384) == 0) {
                str2 = str;
                i16 |= o0VarE.B(str2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) != 0) {
                    if (o0VarE.r(aVar)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i16 |= i19;
                }
                if ((i16 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i24 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i25 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jB = d92.b.a(o0VarE).d().a().b();
                    long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    i3.c1 c1Var = i3.c1.f87691a;
                    long jC = o4.d0.c(0.5f, jB, 14);
                    long jC2 = o4.d0.c(0.5f, jD, 14);
                    c1Var.getClass();
                    int i26 = i16 << 6;
                    h4.r rVar4 = rVar3;
                    String str5 = str4;
                    i0.c(pVar2, str5, rVar4, z17, i3.c1.a(jB, jD, jC, jC2, o0VarE, 0), null, aVar, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, o0VarE, ((i16 >> 3) & 126) | (i26 & 896) | (i16 & 7168) | (3670016 & i26), 288);
                    o0Var = o0VarE;
                    str3 = str5;
                    rVar2 = rVar4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str3 = str2;
                    z17 = z15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new y(this, rVar2, pVar, str3, z17, aVar, i14, i15, 1);
                }
            }
            i16 |= 3072;
            z15 = z14;
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i17 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jB2 = d92.b.a(o0VarE).d().a().b();
                long jD2 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                i3.c1 c1Var2 = i3.c1.f87691a;
                long jC3 = o4.d0.c(0.5f, jB2, 14);
                long jC4 = o4.d0.c(0.5f, jD2, 14);
                c1Var2.getClass();
                int i27 = i16 << 6;
                h4.r rVar5 = rVar3;
                String str6 = str4;
                i0.c(pVar2, str6, rVar5, z17, i3.c1.a(jB2, jD2, jC3, jC4, o0VarE, 0), null, aVar, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, o0VarE, ((i16 >> 3) & 126) | (i27 & 896) | (i16 & 7168) | (3670016 & i27), 288);
                o0Var = o0VarE;
                str3 = str6;
                rVar2 = rVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str3 = str2;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new y(this, rVar2, pVar, str3, z17, aVar, i14, i15, 1);
            }
        }
        i16 |= 384;
        str2 = str;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i17 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jB3 = d92.b.a(o0VarE).d().a().b();
                long jD3 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                i3.c1 c1Var3 = i3.c1.f87691a;
                long jC5 = o4.d0.c(0.5f, jB3, 14);
                long jC6 = o4.d0.c(0.5f, jD3, 14);
                c1Var3.getClass();
                int i28 = i16 << 6;
                h4.r rVar6 = rVar3;
                String str7 = str4;
                i0.c(pVar2, str7, rVar6, z17, i3.c1.a(jB3, jD3, jC5, jC6, o0VarE, 0), null, aVar, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, o0VarE, ((i16 >> 3) & 126) | (i28 & 896) | (i16 & 7168) | (3670016 & i28), 288);
                o0Var = o0VarE;
                str3 = str7;
                rVar2 = rVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str3 = str2;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new y(this, rVar2, pVar, str3, z17, aVar, i14, i15, 1);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i14 & 24576) != 0) {
            if (o0VarE.r(aVar)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i16 |= i19;
        }
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i24 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i25 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i17 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jB4 = d92.b.a(o0VarE).d().a().b();
            long jD4 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            i3.c1 c1Var4 = i3.c1.f87691a;
            long jC7 = o4.d0.c(0.5f, jB4, 14);
            long jC8 = o4.d0.c(0.5f, jD4, 14);
            c1Var4.getClass();
            int i29 = i16 << 6;
            h4.r rVar7 = rVar3;
            String str8 = str4;
            i0.c(pVar2, str8, rVar7, z17, i3.c1.a(jB4, jD4, jC7, jC8, o0VarE, 0), null, aVar, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, o0VarE, ((i16 >> 3) & 126) | (i29 & 896) | (i16 & 7168) | (3670016 & i29), 288);
            o0Var = o0VarE;
            str3 = str8;
            rVar2 = rVar7;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(this, rVar2, pVar, str3, z17, aVar, i14, i15, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void i(String str, h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z15;
        int i18;
        boolean z16;
        boolean z17;
        p3.p2 p2VarI0;
        h4.r rVar3;
        boolean z18;
        int i19;
        p3.o0 o0VarL = vb.h.l(-844921103, aVar, str, mVar);
        if ((i14 & 6) == 0) {
            i16 = (o0VarL.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarL.B(rVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    z15 = z14;
                    if (o0VarL.h(z15)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if (o0VarL.r(aVar)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i16 |= i19;
                }
                if ((i16 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarL.n(i16 & 1, z16)) {
                    if (i24 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jB = d92.b.a(o0VarL).d().a().b();
                    long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
                    i3.c1 c1Var = i3.c1.f87691a;
                    long jC = o4.d0.c(0.5f, jB, 14);
                    long jC2 = o4.d0.c(0.5f, jD, 14);
                    c1Var.getClass();
                    i0.c(null, str, rVar3, z18, i3.c1.a(jB, jD, jC, jC2, o0VarL, 0), null, aVar, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL), null, o0VarL, ((i16 << 3) & 8176) | ((i16 << 9) & 3670016), 289);
                    z17 = z18;
                    rVar2 = rVar3;
                } else {
                    o0VarL.e();
                    z17 = z15;
                }
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new x(this, str, rVar2, z17, aVar, i14, i15, 0);
                }
            }
            i16 |= 384;
            z15 = z14;
            if ((i14 & 3072) == 0) {
                if (o0VarL.r(aVar)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jB2 = d92.b.a(o0VarL).d().a().b();
                long jD2 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
                i3.c1 c1Var2 = i3.c1.f87691a;
                long jC3 = o4.d0.c(0.5f, jB2, 14);
                long jC4 = o4.d0.c(0.5f, jD2, 14);
                c1Var2.getClass();
                i0.c(null, str, rVar3, z18, i3.c1.a(jB2, jD2, jC3, jC4, o0VarL, 0), null, aVar, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL), null, o0VarL, ((i16 << 3) & 8176) | ((i16 << 9) & 3670016), 289);
                z17 = z18;
                rVar2 = rVar3;
            } else {
                o0VarL.e();
                z17 = z15;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new x(this, str, rVar2, z17, aVar, i14, i15, 0);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                if (o0VarL.h(z15)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarL.r(aVar)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jB3 = d92.b.a(o0VarL).d().a().b();
                long jD3 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
                i3.c1 c1Var3 = i3.c1.f87691a;
                long jC5 = o4.d0.c(0.5f, jB3, 14);
                long jC6 = o4.d0.c(0.5f, jD3, 14);
                c1Var3.getClass();
                i0.c(null, str, rVar3, z18, i3.c1.a(jB3, jD3, jC5, jC6, o0VarL, 0), null, aVar, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL), null, o0VarL, ((i16 << 3) & 8176) | ((i16 << 9) & 3670016), 289);
                z17 = z18;
                rVar2 = rVar3;
            } else {
                o0VarL.e();
                z17 = z15;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new x(this, str, rVar2, z17, aVar, i14, i15, 0);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i14 & 3072) == 0) {
            if (o0VarL.r(aVar)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i16 |= i19;
        }
        if ((i16 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarL.n(i16 & 1, z16)) {
            if (i24 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i17 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jB4 = d92.b.a(o0VarL).d().a().b();
            long jD4 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
            i3.c1 c1Var4 = i3.c1.f87691a;
            long jC7 = o4.d0.c(0.5f, jB4, 14);
            long jC8 = o4.d0.c(0.5f, jD4, 14);
            c1Var4.getClass();
            i0.c(null, str, rVar3, z18, i3.c1.a(jB4, jD4, jC7, jC8, o0VarL, 0), null, aVar, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL), null, o0VarL, ((i16 << 3) & 8176) | ((i16 << 9) & 3670016), 289);
            z17 = z18;
            rVar2 = rVar3;
        } else {
            o0VarL.e();
            z17 = z15;
        }
        p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(this, str, rVar2, z17, aVar, i14, i15, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void j(e23.p pVar, String str, h4.r rVar, boolean z14, e23.a aVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str2;
        boolean z15;
        p3.o0 o0Var;
        String str3;
        p3.p2 p2VarI0;
        String str4;
        int i17;
        int i18;
        pVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1951073790);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                str2 = str;
                i16 |= o0VarE.B(str2) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.h(z14)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(aVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i16 |= i17;
            }
            if ((i16 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                if (i19 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                o0Var = o0VarE;
                i0.d(str4, rVar, z14, null, d92.b.a(o0VarE).k().a(), pVar, null, aVar, o0Var, ((i16 >> 6) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | ((i16 << 12) & 458752) | ((i16 << 9) & 29360128), 72);
                str3 = str4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str3 = str2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new y(this, rVar, pVar, str3, z14, aVar, i14, i15, 3);
            }
        }
        i16 |= 384;
        str2 = str;
        if ((i14 & 3072) == 0) {
            if (o0VarE.h(z14)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i16 |= i18;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(aVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i16 |= i17;
        }
        if ((i16 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            if (i19 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            o0Var = o0VarE;
            i0.d(str4, rVar, z14, null, d92.b.a(o0VarE).k().a(), pVar, null, aVar, o0Var, ((i16 >> 6) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | ((i16 << 12) & 458752) | ((i16 << 9) & 29360128), 72);
            str3 = str4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(this, rVar, pVar, str3, z14, aVar, i14, i15, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public final void k(String str, h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        h4.r rVar2;
        p3.p2 p2VarI0;
        boolean z18;
        int i17;
        p3.o0 o0VarL = vb.h.l(-1555348937, aVar, str, mVar);
        if ((i14 & 6) == 0) {
            i16 = (o0VarL.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarL.B(rVar) ? 32 : 16;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarL.h(z15) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarL.r(aVar)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i16 |= i17;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i18 != 0) {
                    rVar = h4.r.S;
                }
                h4.r rVar3 = rVar;
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                i0.d(str, rVar3, z18, null, d92.b.a(o0VarL).k().a(), null, null, aVar, o0VarL, (i16 & 1022) | ((i16 << 12) & 29360128), 104);
                rVar2 = rVar3;
                z17 = z18;
            } else {
                o0VarL.e();
                z17 = z15;
                rVar2 = rVar;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new x(this, str, rVar2, z17, aVar, i14, i15, 2);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i14 & 3072) == 0) {
            if (o0VarL.r(aVar)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i16 |= i17;
        }
        if ((i16 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarL.n(i16 & 1, z16)) {
            if (i18 != 0) {
                rVar = h4.r.S;
            }
            h4.r rVar4 = rVar;
            if (i19 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            i0.d(str, rVar4, z18, null, d92.b.a(o0VarL).k().a(), null, null, aVar, o0VarL, (i16 & 1022) | ((i16 << 12) & 29360128), 104);
            rVar2 = rVar4;
            z17 = z18;
        } else {
            o0VarL.e();
            z17 = z15;
            rVar2 = rVar;
        }
        p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(this, str, rVar2, z17, aVar, i14, i15, 2);
        }
    }

    public final void l(h4.r rVar, long j8, p3.m mVar, int i14) {
        h4.r rVar2;
        long j14;
        long jC;
        p3.o0 o0VarE = mVar.E(-1730497897);
        int i15 = i14 | 22;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar = h4.r.S;
                d92.b.f58623a.getClass();
                jC = d92.b.a(o0VarE).f().c();
            } else {
                o0VarE.e();
                jC = j8;
            }
            h4.r rVar3 = rVar;
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            i0.b(rVar3, jC, 16, o0VarE, 390);
            rVar2 = rVar3;
            j14 = jC;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            j14 = j8;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.l0(this, rVar2, j14, i14, 9);
        }
    }
}
