package p006l2;

import a2.j;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import b5.s0;
import b5.t0;
import c2.u;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.q;
import f5.z0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import k11.h;
import kh0.d;
import kotlin.h4;
import kotlin.k2;
import kotlin.o1;
import kotlin.q3;
import o4.t1;
import o4.w;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p008y1.b2;
import p008y1.r2;
import p008y1.t2;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import r1.q2;
import r2.i;
import r53.g2;
import r53.y1;
import s5.q0;
import s5.w0;
import s5.x0;
import u1.a2;
import u1.d2;
import u1.g0;
import u13.a;
import u2.f;
import u2.g;
import v2.h2;
import v2.k1;
import v2.m1;
import v2.r1;
import w2.o;
import w2.x;
import x5.l0;
import x5.r0;
import x5.v;
import z2.a0;
import z2.p;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Function0 f108744a = Function0.f108746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f108745b;

    /* JADX INFO: renamed from: l2.r$a, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "it", "<anonymous>", "(Le23/a;)V"}, k = 3, mv = {2, 0, 0})
    public static final class Function0 implements u2.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Function0 f108746a = new Function0();

        @Override // u2.f
        public final void a(z3.e eVar, m mVar, int i14) {
            o0 o0VarE = mVar.E(-2101003086);
            int i15 = (o0VarE.B(this) ? 32 : 16) | i14;
            if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
                x1 x1Var = n.f135158a;
                eVar.invoke(o0VarE, 6);
            } else {
                o0VarE.e();
            }
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new k41.e(this, eVar, i14, 26);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w2.n f108747a;

        public b(w2.n nVar) {
            this.f108747a = nVar;
        }

        @Override // z2.p
        public final long a() {
            return this.f108747a.o(true).f181327b;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w2.n f108748a;

        public c(w2.n nVar) {
            this.f108748a = nVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            w2.n nVar = this.f108748a;
            nVar.getClass();
            Object objE = c0.e(new o(nVar, h0Var, null), dVar);
            a aVar = a.COROUTINE_SUSPENDED;
            if (objE != aVar) {
                objE = Unit.INSTANCE;
            }
            return objE == aVar ? objE : Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w2.n f108749a;

        public d(w2.n nVar) {
            this.f108749a = nVar;
        }

        @Override // z2.p
        public final long a() {
            return this.f108749a.u(true, true).f181327b;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class e implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w2.n f108750a;

        public e(w2.n nVar) {
            this.f108750a = nVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            w2.n nVar = this.f108750a;
            nVar.getClass();
            Object objE = c0.e(new x(nVar, h0Var, true, null), dVar);
            a aVar = a.COROUTINE_SUSPENDED;
            if (objE != aVar) {
                objE = Unit.INSTANCE;
            }
            return objE == aVar ? objE : Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class f implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w2.n f108751a;

        public f(w2.n nVar) {
            this.f108751a = nVar;
        }

        @Override // z2.p
        public final long a() {
            return this.f108751a.u(false, true).f181327b;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class g implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w2.n f108752a;

        public g(w2.n nVar) {
            this.f108752a = nVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            w2.n nVar = this.f108752a;
            nVar.getClass();
            Object objE = c0.e(new x(nVar, h0Var, false, null), dVar);
            a aVar = a.COROUTINE_SUSPENDED;
            if (objE != aVar) {
                objE = Unit.INSTANCE;
            }
            return objE == aVar ? objE : Unit.INSTANCE;
        }
    }

    static {
        float f14 = 40;
        g6.f.a aVar = g6.f.f75994b;
        f108745b = dh.b.e(f14, f14);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0174  */
    /* JADX WARN: Code duplicated, block: B:103:0x0178  */
    /* JADX WARN: Code duplicated, block: B:104:0x017a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0182  */
    /* JADX WARN: Code duplicated, block: B:109:0x0185  */
    /* JADX WARN: Code duplicated, block: B:111:0x018b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0190  */
    /* JADX WARN: Code duplicated, block: B:115:0x0194  */
    /* JADX WARN: Code duplicated, block: B:116:0x019c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:128:0x020a  */
    /* JADX WARN: Code duplicated, block: B:131:0x021e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0221  */
    /* JADX WARN: Code duplicated, block: B:136:0x022a  */
    /* JADX WARN: Code duplicated, block: B:139:0x023f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0242  */
    /* JADX WARN: Code duplicated, block: B:142:0x0246  */
    /* JADX WARN: Code duplicated, block: B:144:0x024a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0258  */
    /* JADX WARN: Code duplicated, block: B:152:0x0264  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:77:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x0111  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, l lVar, h4.r rVar, boolean z14, boolean z15, x0 x0Var, a2 a2Var, z1 z1Var, boolean z16, int i14, int i15, r0 r0Var, l lVar2, j jVar, t1 t1Var, q qVar, m mVar, int i16, int i17) {
        boolean z17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z18;
        String str2;
        o0 o0Var;
        boolean z19;
        r0 r0Var2;
        l lVar3;
        int i38;
        int i39;
        boolean z24;
        p2 p2VarI0;
        int i44;
        m.a aVar;
        boolean z25;
        int i45;
        int i46;
        r0 r0Var3;
        Object objQ;
        int i47;
        boolean z26;
        r0 r0Var4;
        Object objQ2;
        m.a.C2565a c2565a;
        p1 p1Var;
        l0 l0VarA;
        boolean zB;
        Object objQ3;
        boolean z27;
        Object objQ4;
        p1 p1Var2;
        int i48;
        int i49;
        boolean zB2;
        Object objQ5;
        o0 o0VarE = mVar.E(2026950908);
        int i54 = i16 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        int i55 = i17 & 8;
        if (i55 != 0) {
            i18 = i54 | 3072;
            z17 = z14;
        } else {
            z17 = z14;
            i18 = i54 | (o0VarE.h(z17) ? 2048 : 1024);
        }
        int i56 = i17 & 16;
        if (i56 != 0) {
            i19 = i18 | 24576;
        } else {
            i19 = i18 | (o0VarE.h(z15) ? 16384 : 8192);
        }
        int i57 = i19 | (o0VarE.B(x0Var) ? 131072 : 65536) | (o0VarE.B(a2Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(z1Var) ? 8388608 : 4194304);
        if ((i16 & 100663296) == 0) {
            i57 |= o0VarE.h(z16) ? 67108864 : 33554432;
        }
        if ((i17 & 512) == 0) {
            i24 = i14;
            int i58 = o0VarE.k(i24) ? 536870912 : 268435456;
            i25 = i57 | i58;
            i26 = i17 & 1024;
            if (i26 != 0) {
                i29 = 196614;
                i27 = i15;
            } else {
                i27 = i15;
                if (o0VarE.k(i27)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i29 = 196608 | i28;
            }
            i30 = i17 & 2048;
            if (i30 != 0) {
                i35 = i29 | 48;
            } else {
                if (o0VarE.B(r0Var)) {
                    i34 = 32;
                } else {
                    i34 = 16;
                }
                i35 = i29 | i34;
            }
            int i59 = i35 | 384;
            if (o0VarE.B(jVar)) {
                i36 = 2048;
            } else {
                i36 = 1024;
            }
            i37 = i59 | i36 | (o0VarE.B(t1Var) ? 16384 : 8192);
            if ((i25 & 306783379) == 306783378 || (i37 & 74899) != 74898) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i25 & 1, z18)) {
                o0VarE.G0();
                i44 = i16 & 1;
                aVar = m.f135153a;
                if (i44 != 0 || o0VarE.o0()) {
                    if (i55 != 0) {
                        z17 = true;
                    }
                    if (i56 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if ((i17 & 512) != 0) {
                        if (z16) {
                            i45 = 1;
                        } else {
                            i45 = Integer.MAX_VALUE;
                        }
                        i46 = i25 & (-1879048193);
                    } else {
                        i45 = i24;
                        i46 = i25;
                    }
                    if (i26 != 0) {
                        i27 = 1;
                    }
                    if (i30 != 0) {
                        r0.f188941a.getClass();
                        r0Var3 = r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new kn1.m(20);
                        o0VarE.K(objQ);
                    }
                    z15 = z25;
                    lVar2 = (l) objQ;
                    i24 = i45;
                    i47 = i46;
                    i27 = i27;
                    z17 = z17;
                    z26 = false;
                    r0Var4 = r0Var3;
                } else {
                    o0VarE.e();
                    if ((i17 & 512) != 0) {
                        i47 = i25 & (-1879048193);
                        z26 = false;
                    } else {
                        i47 = i25;
                        z26 = false;
                    }
                    r0Var4 = r0Var;
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                objQ2 = o0VarE.q();
                aVar.getClass();
                c2565a = m.a.f135155b;
                if (objQ2 == c2565a) {
                    str2 = str;
                    objQ2 = p0.n(new l0(str2, 0L, (w0) null, 6, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ2);
                } else {
                    str2 = str;
                }
                p1Var = (p1) objQ2;
                l0VarA = l0.a((l0) p1Var.getF182175a(), str2, 0L, 6);
                zB = o0VarE.B(l0VarA);
                objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new h(21, l0VarA, p1Var);
                    o0VarE.K(objQ3);
                }
                p3.l0.i((e23.a) objQ3, o0VarE);
                if ((i47 & 14) == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objQ4 = o0VarE.q();
                if (z27 || objQ4 == c2565a) {
                    objQ4 = p0.n(str2);
                    o0VarE.K(objQ4);
                }
                p1Var2 = (p1) objQ4;
                x5.q qVarB = a2Var.b(z16);
                boolean z28 = !z16;
                if (z16) {
                    i48 = 1;
                } else {
                    i48 = i27;
                }
                if (z16) {
                    i49 = 1;
                } else {
                    i49 = i24;
                }
                zB2 = o0VarE.B(p1Var2) | ((i47 & 112) == 32);
                objQ5 = o0VarE.q();
                if (zB2 || objQ5 == c2565a) {
                    objQ5 = new o(lVar, p1Var, p1Var2, 0);
                    o0VarE.K(objQ5);
                }
                int i64 = i37 << 9;
                o0Var = o0VarE;
                h1.a(l0VarA, (l) objQ5, rVar, x0Var, r0Var4, lVar2, jVar, t1Var, z28, i49, i48, qVarB, z1Var, z17, z15, qVar, o0Var, (i47 & 896) | ((i47 >> 6) & 7168) | (i64 & 57344) | 196608 | (3670016 & i64) | (i64 & 29360128), ((i47 >> 15) & 896) | (i47 & 7168) | (i47 & 57344) | 196608);
                r0Var2 = r0Var4;
                lVar3 = lVar2;
                z24 = z17;
                z19 = z15;
                i38 = i24;
                i39 = i27;
            } else {
                str2 = str;
                o0Var = o0VarE;
                o0Var.e();
                z19 = z15;
                r0Var2 = r0Var;
                lVar3 = lVar2;
                i38 = i24;
                i39 = i27;
                z24 = z17;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p006l2.f(str2, lVar, rVar, z24, z19, x0Var, a2Var, z1Var, z16, i38, i39, r0Var2, lVar3, jVar, t1Var, qVar, i16, i17);
            }
        }
        i24 = i14;
        i25 = i57 | i58;
        i26 = i17 & 1024;
        if (i26 != 0) {
            i29 = 196614;
            i27 = i15;
        } else {
            i27 = i15;
            if (o0VarE.k(i27)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i29 = 196608 | i28;
        }
        i30 = i17 & 2048;
        if (i30 != 0) {
            i35 = i29 | 48;
        } else {
            if (o0VarE.B(r0Var)) {
                i34 = 32;
            } else {
                i34 = 16;
            }
            i35 = i29 | i34;
        }
        int i510 = i35 | 384;
        if (o0VarE.B(jVar)) {
            i36 = 2048;
        } else {
            i36 = 1024;
        }
        i37 = i510 | i36 | (o0VarE.B(t1Var) ? 16384 : 8192);
        if ((i25 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (o0VarE.n(i25 & 1, z18)) {
            o0VarE.G0();
            i44 = i16 & 1;
            aVar = m.f135153a;
            if (i44 != 0) {
                if (i55 != 0) {
                    z17 = true;
                }
                if (i56 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if ((i17 & 512) != 0) {
                    if (z16) {
                        i45 = 1;
                    } else {
                        i45 = Integer.MAX_VALUE;
                    }
                    i46 = i25 & (-1879048193);
                } else {
                    i45 = i24;
                    i46 = i25;
                }
                if (i26 != 0) {
                    i27 = 1;
                }
                if (i30 != 0) {
                    r0.f188941a.getClass();
                    r0Var3 = r0.a.f188943b;
                } else {
                    r0Var3 = r0Var;
                }
                objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new kn1.m(20);
                    o0VarE.K(objQ);
                }
                z15 = z25;
                lVar2 = (l) objQ;
                i24 = i45;
                i47 = i46;
                i27 = i27;
                z17 = z17;
                z26 = false;
                r0Var4 = r0Var3;
            } else {
                if (i55 != 0) {
                    z17 = true;
                }
                if (i56 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if ((i17 & 512) != 0) {
                    if (z16) {
                        i45 = 1;
                    } else {
                        i45 = Integer.MAX_VALUE;
                    }
                    i46 = i25 & (-1879048193);
                } else {
                    i45 = i24;
                    i46 = i25;
                }
                if (i26 != 0) {
                    i27 = 1;
                }
                if (i30 != 0) {
                    r0.f188941a.getClass();
                    r0Var3 = r0.a.f188943b;
                } else {
                    r0Var3 = r0Var;
                }
                objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new kn1.m(20);
                    o0VarE.K(objQ);
                }
                z15 = z25;
                lVar2 = (l) objQ;
                i24 = i45;
                i47 = i46;
                i27 = i27;
                z17 = z17;
                z26 = false;
                r0Var4 = r0Var3;
            }
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            objQ2 = o0VarE.q();
            aVar.getClass();
            c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                str2 = str;
                objQ2 = p0.n(new l0(str2, 0L, (w0) null, 6, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ2);
            } else {
                str2 = str;
            }
            p1Var = (p1) objQ2;
            l0VarA = l0.a((l0) p1Var.getF182175a(), str2, 0L, 6);
            zB = o0VarE.B(l0VarA);
            objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new h(21, l0VarA, p1Var);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new h(21, l0VarA, p1Var);
                o0VarE.K(objQ3);
            }
            p3.l0.i((e23.a) objQ3, o0VarE);
            if ((i47 & 14) == 4) {
                z27 = true;
            } else {
                z27 = false;
            }
            objQ4 = o0VarE.q();
            if (z27) {
                objQ4 = p0.n(str2);
                o0VarE.K(objQ4);
            } else {
                objQ4 = p0.n(str2);
                o0VarE.K(objQ4);
            }
            p1Var2 = (p1) objQ4;
            x5.q qVarB2 = a2Var.b(z16);
            boolean z29 = !z16;
            if (z16) {
                i48 = 1;
            } else {
                i48 = i27;
            }
            if (z16) {
                i49 = 1;
            } else {
                i49 = i24;
            }
            zB2 = o0VarE.B(p1Var2) | ((i47 & 112) == 32);
            objQ5 = o0VarE.q();
            if (zB2) {
                objQ5 = new o(lVar, p1Var, p1Var2, 0);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new o(lVar, p1Var, p1Var2, 0);
                o0VarE.K(objQ5);
            }
            int i65 = i37 << 9;
            o0Var = o0VarE;
            h1.a(l0VarA, (l) objQ5, rVar, x0Var, r0Var4, lVar2, jVar, t1Var, z29, i49, i48, qVarB2, z1Var, z17, z15, qVar, o0Var, (i47 & 896) | ((i47 >> 6) & 7168) | (i65 & 57344) | 196608 | (3670016 & i65) | (i65 & 29360128), ((i47 >> 15) & 896) | (i47 & 7168) | (i47 & 57344) | 196608);
            r0Var2 = r0Var4;
            lVar3 = lVar2;
            z24 = z17;
            z19 = z15;
            i38 = i24;
            i39 = i27;
        } else {
            str2 = str;
            o0Var = o0VarE;
            o0Var.e();
            z19 = z15;
            r0Var2 = r0Var;
            lVar3 = lVar2;
            i38 = i24;
            i39 = i27;
            z24 = z17;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p006l2.f(str2, lVar, rVar, z24, z19, x0Var, a2Var, z1Var, z16, i38, i39, r0Var2, lVar3, jVar, t1Var, qVar, i16, i17);
        }
    }

    public static final void b(u2.h hVar, h4.r rVar, boolean z14, x0 x0Var, a2 a2Var, u2.g gVar, j jVar, w wVar, u2.f fVar, d2 d2Var, m mVar, int i14, int i15) {
        int i16;
        x0 x0Var2;
        u2.g gVar2;
        j jVar2;
        u2.f fVar2;
        int i17;
        o0 o0Var;
        boolean z15;
        a2 a2Var2;
        d2 d2Var2;
        j jVar3;
        u2.f fVar3;
        int i18;
        d2 d2VarA;
        a2 a2Var3;
        u2.f fVar4;
        o0 o0VarE = mVar.E(469439921);
        int i19 = 2;
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(hVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i24 = i16 | 28032;
        if ((i14 & 196608) == 0) {
            x0Var2 = x0Var;
            i24 |= o0VarE.B(x0Var2) ? 131072 : 65536;
        } else {
            x0Var2 = x0Var;
        }
        int i25 = i24 | 14155776;
        if ((i14 & 100663296) == 0) {
            gVar2 = gVar;
            i25 |= o0VarE.B(gVar2) ? 67108864 : 33554432;
        } else {
            gVar2 = gVar;
        }
        int i26 = i25 | C.ENCODING_PCM_32BIT;
        int i27 = i15 & 1024;
        if (i27 != 0) {
            i19 = 6;
            jVar2 = jVar;
        } else {
            jVar2 = jVar;
            if (o0VarE.B(jVar2)) {
                i19 = 4;
            }
        }
        int i28 = i19 | (o0VarE.B(wVar) ? 32 : 16);
        int i29 = i28 | 384;
        int i30 = i15 & 8192;
        if (i30 != 0) {
            i17 = i28 | 3456;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            i17 = i29 | (o0VarE.B(fVar2) ? 2048 : 1024);
        }
        int i34 = i17 | 8192;
        boolean z16 = true;
        if (o0VarE.n(i26 & 1, ((306783379 & i26) == 306783378 && (i34 & 9363) == 9362) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                a2.f108340h.getClass();
                a2 a2Var4 = a2.f108341i;
                if (i27 != 0) {
                    jVar2 = null;
                }
                u2.f fVar5 = i30 == 0 ? fVar2 : null;
                i18 = i34 & (-57345);
                d2VarA = a2.a(o0VarE);
                a2Var3 = a2Var4;
                fVar4 = fVar5;
            } else {
                o0VarE.e();
                i18 = i34 & (-57345);
                z16 = z14;
                a2Var3 = a2Var;
                d2VarA = d2Var;
                fVar4 = fVar2;
            }
            j jVar4 = jVar2;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            o0Var = o0VarE;
            d(hVar, rVar, z16, x0Var2, a2Var3, gVar2, jVar4, wVar, fVar4, d2VarA, o0Var, i26 & 2147483646, (i18 & 14) | 384 | (i18 & 112) | 3072 | ((i18 << 3) & 57344));
            z15 = z16;
            a2Var2 = a2Var3;
            jVar3 = jVar4;
            fVar3 = fVar4;
            d2Var2 = d2VarA;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z15 = z14;
            a2Var2 = a2Var;
            d2Var2 = d2Var;
            jVar3 = jVar2;
            fVar3 = fVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p006l2.g(hVar, rVar, z15, x0Var, a2Var2, gVar, jVar3, wVar, fVar3, d2Var2, i14, i15, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x019b  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0205  */
    /* JADX WARN: Code duplicated, block: B:158:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x020c  */
    /* JADX WARN: Code duplicated, block: B:160:0x020f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0215  */
    /* JADX WARN: Code duplicated, block: B:164:0x021b  */
    /* JADX WARN: Code duplicated, block: B:165:0x021e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0222  */
    /* JADX WARN: Code duplicated, block: B:169:0x022c  */
    /* JADX WARN: Code duplicated, block: B:172:0x023c  */
    /* JADX WARN: Code duplicated, block: B:175:0x024a  */
    /* JADX WARN: Code duplicated, block: B:176:0x024c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0250  */
    /* JADX WARN: Code duplicated, block: B:180:0x0266  */
    /* JADX WARN: Code duplicated, block: B:183:0x0277  */
    /* JADX WARN: Code duplicated, block: B:184:0x027a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0280  */
    /* JADX WARN: Code duplicated, block: B:188:0x0283  */
    /* JADX WARN: Code duplicated, block: B:191:0x028a  */
    /* JADX WARN: Code duplicated, block: B:192:0x028d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0297  */
    /* JADX WARN: Code duplicated, block: B:198:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:200:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:202:0x0304  */
    /* JADX WARN: Code duplicated, block: B:205:0x0320  */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static final void c(final l0 l0Var, final l<? super l0, Unit> lVar, final h4.r rVar, boolean z14, boolean z15, final x0 x0Var, final a2 a2Var, z1 z1Var, final boolean z16, int i14, int i15, r0 r0Var, l<? super q0, Unit> lVar2, j jVar, final w wVar, q<? super e23.p<? super m, ? super Integer, Unit>, ? super m, ? super Integer, Unit> qVar, m mVar, final int i16, final int i17, final int i18) {
        int i19;
        boolean z17;
        int i24;
        boolean z18;
        int i25;
        int i26;
        z1 z1Var2;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        boolean z19;
        final int i48;
        final l<? super q0, Unit> lVar3;
        final j jVar2;
        final boolean z24;
        final z1 z1Var3;
        final boolean z25;
        o0 o0Var;
        final int i49;
        final r0 r0Var2;
        final q<? super e23.p<? super m, ? super Integer, Unit>, ? super m, ? super Integer, Unit> qVar2;
        p2 p2VarI0;
        int i54;
        m.a aVar;
        z1 z1Var4;
        int i55;
        int i56;
        int i57;
        r0 r0Var3;
        Object objQ;
        int i58;
        l<? super q0, Unit> lVar4;
        z1 z1Var5;
        int i59;
        int i64;
        boolean z26;
        boolean z27;
        Object objQ2;
        int i65;
        int i66;
        int i67;
        o0 o0VarE = mVar.E(-971111025);
        if ((i16 & 6) == 0) {
            i19 = (o0VarE.B(l0Var) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i19 |= o0VarE.B(rVar) ? 256 : 128;
        }
        int i68 = i18 & 8;
        if (i68 == 0) {
            if ((i16 & 3072) == 0) {
                z17 = z14;
                i19 |= o0VarE.h(z17) ? 2048 : 1024;
            }
            i24 = i18 & 16;
            if (i24 != 0) {
                if ((i16 & 24576) == 0) {
                    z18 = z15;
                    if (o0VarE.h(z18)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i19 |= i25;
                }
                if ((i16 & 196608) == 0) {
                    if (o0VarE.B(x0Var)) {
                        i67 = 131072;
                    } else {
                        i67 = 65536;
                    }
                    i19 |= i67;
                }
                if ((i16 & 1572864) == 0) {
                    if (o0VarE.B(a2Var)) {
                        i66 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i66 = 524288;
                    }
                    i19 |= i66;
                }
                i26 = i18 & 128;
                if (i26 != 0) {
                    i19 |= 12582912;
                    z1Var2 = z1Var;
                } else {
                    z1Var2 = z1Var;
                    if ((i16 & 12582912) == 0) {
                        if (o0VarE.B(z1Var2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i19 |= i27;
                    }
                }
                if ((i16 & 100663296) == 0) {
                    if (o0VarE.h(z16)) {
                        i65 = 67108864;
                    } else {
                        i65 = 33554432;
                    }
                    i19 |= i65;
                }
                if ((i16 & C.ENCODING_PCM_32BIT) != 0) {
                    i19 |= ((i18 & 512) == 0 || !o0VarE.k(i14)) ? 268435456 : 536870912;
                }
                i28 = i18 & 1024;
                if (i28 != 0) {
                    i30 = i17 | 6;
                } else {
                    if (o0VarE.k(i15)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i30 = i17 | i29;
                }
                i34 = i18 & 2048;
                if (i34 != 0) {
                    i36 = i30 | 48;
                } else {
                    if (o0VarE.B(r0Var)) {
                        i35 = 32;
                    } else {
                        i35 = 16;
                    }
                    i36 = i30 | i35;
                }
                i37 = i36;
                i38 = i19;
                i39 = i37 | 384;
                i44 = i18 & 8192;
                if (i44 != 0) {
                    if ((i17 & 3072) == 0) {
                        i45 = i39 | (o0VarE.B(jVar) ? 2048 : 1024);
                    } else {
                        i45 = i39;
                    }
                    i46 = i45 | (o0VarE.B(wVar) ? 16384 : 8192);
                    i47 = i18 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i17 & 196608) == 0) {
                        i46 |= o0VarE.r(qVar) ? 131072 : 65536;
                    }
                    if ((i38 & 306783379) == 306783378 || (i46 & 74899) != 74898) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (o0VarE.n(i38 & 1, z19)) {
                        o0VarE.G0();
                        i54 = i16 & 1;
                        aVar = m.f135153a;
                        if (i54 != 0 || o0VarE.o0()) {
                            if (i68 != 0) {
                                z17 = true;
                            }
                            if (i24 != 0) {
                                z18 = false;
                            }
                            if (i26 != 0) {
                                z1.f108930g.getClass();
                                z1Var4 = z1.f108931h;
                            } else {
                                z1Var4 = z1Var2;
                            }
                            if ((i18 & 512) != 0) {
                                if (z16) {
                                    i55 = 1;
                                } else {
                                    i55 = Integer.MAX_VALUE;
                                }
                                i56 = i38 & (-1879048193);
                            } else {
                                i55 = i14;
                                i56 = i38;
                            }
                            if (i28 != 0) {
                                i57 = 1;
                            } else {
                                i57 = i15;
                            }
                            if (i34 != 0) {
                                r0.f188941a.getClass();
                                r0Var3 = r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            z1 z1Var6 = z1Var4;
                            objQ = o0VarE.q();
                            aVar.getClass();
                            aVar = aVar;
                            if (objQ == m.a.f135155b) {
                                objQ = new kn1.m(19);
                                o0VarE.K(objQ);
                            }
                            l<? super q0, Unit> lVar5 = (l) objQ;
                            if (i44 != 0) {
                                jVar = null;
                            } else {
                                jVar = jVar;
                            }
                            if (i47 != 0) {
                                s0.f108756a.getClass();
                                qVar = s0.f108757b;
                            } else {
                                qVar = qVar;
                            }
                            i14 = i55;
                            i58 = i56;
                            i15 = i57;
                            lVar4 = lVar5;
                            z17 = z17;
                            z18 = z18;
                            r0Var = r0Var3;
                            z1Var5 = z1Var6;
                        } else {
                            o0VarE.e();
                            i58 = (i18 & 512) != 0 ? i38 & (-1879048193) : i38;
                            lVar4 = lVar2;
                            z1Var5 = z1Var2;
                        }
                        o0VarE.h0();
                        x1 x1Var = n.f135158a;
                        x5.q qVarB = a2Var.b(z16);
                        boolean z28 = !z16;
                        if (z16) {
                            i59 = 1;
                        } else {
                            i59 = i15;
                        }
                        if (z16) {
                            i64 = 1;
                        } else {
                            i64 = i14;
                        }
                        if ((i58 & 14) == 4) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | ((i58 & 112) == 32);
                        objQ2 = o0VarE.q();
                        if (z27) {
                            objQ2 = new jt1.d(22, l0Var, lVar);
                            o0VarE.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new jt1.d(22, l0Var, lVar);
                                o0VarE.K(objQ2);
                            }
                        }
                        int i69 = i46 << 9;
                        h1.a(l0Var, (l) objQ2, rVar, x0Var, r0Var, lVar4, jVar, wVar, z28, i64, i59, qVarB, z1Var5, z17, z18, qVar, o0VarE, ((i58 >> 6) & 7168) | (i58 & 910) | (i69 & 57344) | 196608 | (i69 & 3670016) | (i69 & 29360128), (i58 & 7168) | ((i58 >> 15) & 896) | (i58 & 57344) | (i46 & 458752));
                        z1Var3 = z1Var5;
                        o0Var = o0VarE;
                        i49 = i14;
                        i48 = i15;
                        r0Var2 = r0Var;
                        z24 = z17;
                        qVar2 = qVar;
                        lVar3 = lVar4;
                        z25 = z18;
                        jVar2 = jVar;
                    } else {
                        o0VarE.e();
                        i48 = i15;
                        lVar3 = lVar2;
                        jVar2 = jVar;
                        z24 = z17;
                        z1Var3 = z1Var2;
                        z25 = z18;
                        o0Var = o0VarE;
                        i49 = i14;
                        r0Var2 = r0Var;
                        qVar2 = qVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: l2.h
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p0.t(i16 | 1);
                                int iT2 = p0.t(i17);
                                r.c(l0Var, lVar, rVar, z24, z25, x0Var, a2Var, z1Var3, z16, i49, i48, r0Var2, lVar3, jVar2, wVar, qVar2, (m) obj, iT, iT2, i18);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i45 = i37 | 3456;
                i46 = i45 | (o0VarE.B(wVar) ? 16384 : 8192);
                i47 = i18 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i17 & 196608) == 0) {
                    i46 |= o0VarE.r(qVar) ? 131072 : 65536;
                }
                if ((i38 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (o0VarE.n(i38 & 1, z19)) {
                    o0VarE.G0();
                    i54 = i16 & 1;
                    aVar = m.f135153a;
                    if (i54 != 0) {
                        if (i68 != 0) {
                            z17 = true;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if (i26 != 0) {
                            z1.f108930g.getClass();
                            z1Var4 = z1.f108931h;
                        } else {
                            z1Var4 = z1Var2;
                        }
                        if ((i18 & 512) != 0) {
                            if (z16) {
                                i55 = 1;
                            } else {
                                i55 = Integer.MAX_VALUE;
                            }
                            i56 = i38 & (-1879048193);
                        } else {
                            i55 = i14;
                            i56 = i38;
                        }
                        if (i28 != 0) {
                            i57 = 1;
                        } else {
                            i57 = i15;
                        }
                        if (i34 != 0) {
                            r0.f188941a.getClass();
                            r0Var3 = r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        z1 z1Var7 = z1Var4;
                        objQ = o0VarE.q();
                        aVar.getClass();
                        aVar = aVar;
                        if (objQ == m.a.f135155b) {
                            objQ = new kn1.m(19);
                            o0VarE.K(objQ);
                        }
                        l<? super q0, Unit> lVar6 = (l) objQ;
                        if (i44 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if (i47 != 0) {
                            s0.f108756a.getClass();
                            qVar = s0.f108757b;
                        } else {
                            qVar = qVar;
                        }
                        i14 = i55;
                        i58 = i56;
                        i15 = i57;
                        lVar4 = lVar6;
                        z17 = z17;
                        z18 = z18;
                        r0Var = r0Var3;
                        z1Var5 = z1Var7;
                    } else {
                        if (i68 != 0) {
                            z17 = true;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if (i26 != 0) {
                            z1.f108930g.getClass();
                            z1Var4 = z1.f108931h;
                        } else {
                            z1Var4 = z1Var2;
                        }
                        if ((i18 & 512) != 0) {
                            if (z16) {
                                i55 = 1;
                            } else {
                                i55 = Integer.MAX_VALUE;
                            }
                            i56 = i38 & (-1879048193);
                        } else {
                            i55 = i14;
                            i56 = i38;
                        }
                        if (i28 != 0) {
                            i57 = 1;
                        } else {
                            i57 = i15;
                        }
                        if (i34 != 0) {
                            r0.f188941a.getClass();
                            r0Var3 = r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        z1 z1Var8 = z1Var4;
                        objQ = o0VarE.q();
                        aVar.getClass();
                        aVar = aVar;
                        if (objQ == m.a.f135155b) {
                            objQ = new kn1.m(19);
                            o0VarE.K(objQ);
                        }
                        l<? super q0, Unit> lVar7 = (l) objQ;
                        if (i44 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if (i47 != 0) {
                            s0.f108756a.getClass();
                            qVar = s0.f108757b;
                        } else {
                            qVar = qVar;
                        }
                        i14 = i55;
                        i58 = i56;
                        i15 = i57;
                        lVar4 = lVar7;
                        z17 = z17;
                        z18 = z18;
                        r0Var = r0Var3;
                        z1Var5 = z1Var8;
                    }
                    o0VarE.h0();
                    x1 x1Var2 = n.f135158a;
                    x5.q qVarB2 = a2Var.b(z16);
                    boolean z29 = !z16;
                    if (z16) {
                        i59 = 1;
                    } else {
                        i59 = i15;
                    }
                    if (z16) {
                        i64 = 1;
                    } else {
                        i64 = i14;
                    }
                    if ((i58 & 14) == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | ((i58 & 112) == 32);
                    objQ2 = o0VarE.q();
                    if (z27) {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new jt1.d(22, l0Var, lVar);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new jt1.d(22, l0Var, lVar);
                        o0VarE.K(objQ2);
                    }
                    int i610 = i46 << 9;
                    h1.a(l0Var, (l) objQ2, rVar, x0Var, r0Var, lVar4, jVar, wVar, z29, i64, i59, qVarB2, z1Var5, z17, z18, qVar, o0VarE, ((i58 >> 6) & 7168) | (i58 & 910) | (i610 & 57344) | 196608 | (i610 & 3670016) | (i610 & 29360128), (i58 & 7168) | ((i58 >> 15) & 896) | (i58 & 57344) | (i46 & 458752));
                    z1Var3 = z1Var5;
                    o0Var = o0VarE;
                    i49 = i14;
                    i48 = i15;
                    r0Var2 = r0Var;
                    z24 = z17;
                    qVar2 = qVar;
                    lVar3 = lVar4;
                    z25 = z18;
                    jVar2 = jVar;
                } else {
                    o0VarE.e();
                    i48 = i15;
                    lVar3 = lVar2;
                    jVar2 = jVar;
                    z24 = z17;
                    z1Var3 = z1Var2;
                    z25 = z18;
                    o0Var = o0VarE;
                    i49 = i14;
                    r0Var2 = r0Var;
                    qVar2 = qVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l2.h
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i16 | 1);
                            int iT2 = p0.t(i17);
                            r.c(l0Var, lVar, rVar, z24, z25, x0Var, a2Var, z1Var3, z16, i49, i48, r0Var2, lVar3, jVar2, wVar, qVar2, (m) obj, iT, iT2, i18);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i19 |= 24576;
            z18 = z15;
            if ((i16 & 196608) == 0) {
                if (o0VarE.B(x0Var)) {
                    i67 = 131072;
                } else {
                    i67 = 65536;
                }
                i19 |= i67;
            }
            if ((i16 & 1572864) == 0) {
                if (o0VarE.B(a2Var)) {
                    i66 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i66 = 524288;
                }
                i19 |= i66;
            }
            i26 = i18 & 128;
            if (i26 != 0) {
                i19 |= 12582912;
                z1Var2 = z1Var;
            } else {
                z1Var2 = z1Var;
                if ((i16 & 12582912) == 0) {
                    if (o0VarE.B(z1Var2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i19 |= i27;
                }
            }
            if ((i16 & 100663296) == 0) {
                if (o0VarE.h(z16)) {
                    i65 = 67108864;
                } else {
                    i65 = 33554432;
                }
                i19 |= i65;
            }
            if ((i16 & C.ENCODING_PCM_32BIT) != 0) {
                i19 |= ((i18 & 512) == 0 || !o0VarE.k(i14)) ? 268435456 : 536870912;
            }
            i28 = i18 & 1024;
            if (i28 != 0) {
                i30 = i17 | 6;
            } else {
                if (o0VarE.k(i15)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i30 = i17 | i29;
            }
            i34 = i18 & 2048;
            if (i34 != 0) {
                i36 = i30 | 48;
            } else {
                if (o0VarE.B(r0Var)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i36 = i30 | i35;
            }
            i37 = i36;
            i38 = i19;
            i39 = i37 | 384;
            i44 = i18 & 8192;
            if (i44 != 0) {
                if ((i17 & 3072) == 0) {
                    i45 = i39 | (o0VarE.B(jVar) ? 2048 : 1024);
                } else {
                    i45 = i39;
                }
                i46 = i45 | (o0VarE.B(wVar) ? 16384 : 8192);
                i47 = i18 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i17 & 196608) == 0) {
                    i46 |= o0VarE.r(qVar) ? 131072 : 65536;
                }
                if ((i38 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (o0VarE.n(i38 & 1, z19)) {
                    o0VarE.G0();
                    i54 = i16 & 1;
                    aVar = m.f135153a;
                    if (i54 != 0) {
                        if (i68 != 0) {
                            z17 = true;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if (i26 != 0) {
                            z1.f108930g.getClass();
                            z1Var4 = z1.f108931h;
                        } else {
                            z1Var4 = z1Var2;
                        }
                        if ((i18 & 512) != 0) {
                            if (z16) {
                                i55 = 1;
                            } else {
                                i55 = Integer.MAX_VALUE;
                            }
                            i56 = i38 & (-1879048193);
                        } else {
                            i55 = i14;
                            i56 = i38;
                        }
                        if (i28 != 0) {
                            i57 = 1;
                        } else {
                            i57 = i15;
                        }
                        if (i34 != 0) {
                            r0.f188941a.getClass();
                            r0Var3 = r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        z1 z1Var9 = z1Var4;
                        objQ = o0VarE.q();
                        aVar.getClass();
                        aVar = aVar;
                        if (objQ == m.a.f135155b) {
                            objQ = new kn1.m(19);
                            o0VarE.K(objQ);
                        }
                        l<? super q0, Unit> lVar8 = (l) objQ;
                        if (i44 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if (i47 != 0) {
                            s0.f108756a.getClass();
                            qVar = s0.f108757b;
                        } else {
                            qVar = qVar;
                        }
                        i14 = i55;
                        i58 = i56;
                        i15 = i57;
                        lVar4 = lVar8;
                        z17 = z17;
                        z18 = z18;
                        r0Var = r0Var3;
                        z1Var5 = z1Var9;
                    } else {
                        if (i68 != 0) {
                            z17 = true;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if (i26 != 0) {
                            z1.f108930g.getClass();
                            z1Var4 = z1.f108931h;
                        } else {
                            z1Var4 = z1Var2;
                        }
                        if ((i18 & 512) != 0) {
                            if (z16) {
                                i55 = 1;
                            } else {
                                i55 = Integer.MAX_VALUE;
                            }
                            i56 = i38 & (-1879048193);
                        } else {
                            i55 = i14;
                            i56 = i38;
                        }
                        if (i28 != 0) {
                            i57 = 1;
                        } else {
                            i57 = i15;
                        }
                        if (i34 != 0) {
                            r0.f188941a.getClass();
                            r0Var3 = r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        z1 z1Var10 = z1Var4;
                        objQ = o0VarE.q();
                        aVar.getClass();
                        aVar = aVar;
                        if (objQ == m.a.f135155b) {
                            objQ = new kn1.m(19);
                            o0VarE.K(objQ);
                        }
                        l<? super q0, Unit> lVar9 = (l) objQ;
                        if (i44 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if (i47 != 0) {
                            s0.f108756a.getClass();
                            qVar = s0.f108757b;
                        } else {
                            qVar = qVar;
                        }
                        i14 = i55;
                        i58 = i56;
                        i15 = i57;
                        lVar4 = lVar9;
                        z17 = z17;
                        z18 = z18;
                        r0Var = r0Var3;
                        z1Var5 = z1Var10;
                    }
                    o0VarE.h0();
                    x1 x1Var3 = n.f135158a;
                    x5.q qVarB3 = a2Var.b(z16);
                    boolean z210 = !z16;
                    if (z16) {
                        i59 = 1;
                    } else {
                        i59 = i15;
                    }
                    if (z16) {
                        i64 = 1;
                    } else {
                        i64 = i14;
                    }
                    if ((i58 & 14) == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | ((i58 & 112) == 32);
                    objQ2 = o0VarE.q();
                    if (z27) {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new jt1.d(22, l0Var, lVar);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new jt1.d(22, l0Var, lVar);
                        o0VarE.K(objQ2);
                    }
                    int i611 = i46 << 9;
                    h1.a(l0Var, (l) objQ2, rVar, x0Var, r0Var, lVar4, jVar, wVar, z210, i64, i59, qVarB3, z1Var5, z17, z18, qVar, o0VarE, ((i58 >> 6) & 7168) | (i58 & 910) | (i611 & 57344) | 196608 | (i611 & 3670016) | (i611 & 29360128), (i58 & 7168) | ((i58 >> 15) & 896) | (i58 & 57344) | (i46 & 458752));
                    z1Var3 = z1Var5;
                    o0Var = o0VarE;
                    i49 = i14;
                    i48 = i15;
                    r0Var2 = r0Var;
                    z24 = z17;
                    qVar2 = qVar;
                    lVar3 = lVar4;
                    z25 = z18;
                    jVar2 = jVar;
                } else {
                    o0VarE.e();
                    i48 = i15;
                    lVar3 = lVar2;
                    jVar2 = jVar;
                    z24 = z17;
                    z1Var3 = z1Var2;
                    z25 = z18;
                    o0Var = o0VarE;
                    i49 = i14;
                    r0Var2 = r0Var;
                    qVar2 = qVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l2.h
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i16 | 1);
                            int iT2 = p0.t(i17);
                            r.c(l0Var, lVar, rVar, z24, z25, x0Var, a2Var, z1Var3, z16, i49, i48, r0Var2, lVar3, jVar2, wVar, qVar2, (m) obj, iT, iT2, i18);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i45 = i37 | 3456;
            i46 = i45 | (o0VarE.B(wVar) ? 16384 : 8192);
            i47 = i18 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i17 & 196608) == 0) {
                i46 |= o0VarE.r(qVar) ? 131072 : 65536;
            }
            if ((i38 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (o0VarE.n(i38 & 1, z19)) {
                o0VarE.G0();
                i54 = i16 & 1;
                aVar = m.f135153a;
                if (i54 != 0) {
                    if (i68 != 0) {
                        z17 = true;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if (i26 != 0) {
                        z1.f108930g.getClass();
                        z1Var4 = z1.f108931h;
                    } else {
                        z1Var4 = z1Var2;
                    }
                    if ((i18 & 512) != 0) {
                        if (z16) {
                            i55 = 1;
                        } else {
                            i55 = Integer.MAX_VALUE;
                        }
                        i56 = i38 & (-1879048193);
                    } else {
                        i55 = i14;
                        i56 = i38;
                    }
                    if (i28 != 0) {
                        i57 = 1;
                    } else {
                        i57 = i15;
                    }
                    if (i34 != 0) {
                        r0.f188941a.getClass();
                        r0Var3 = r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    z1 z1Var11 = z1Var4;
                    objQ = o0VarE.q();
                    aVar.getClass();
                    aVar = aVar;
                    if (objQ == m.a.f135155b) {
                        objQ = new kn1.m(19);
                        o0VarE.K(objQ);
                    }
                    l<? super q0, Unit> lVar10 = (l) objQ;
                    if (i44 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if (i47 != 0) {
                        s0.f108756a.getClass();
                        qVar = s0.f108757b;
                    } else {
                        qVar = qVar;
                    }
                    i14 = i55;
                    i58 = i56;
                    i15 = i57;
                    lVar4 = lVar10;
                    z17 = z17;
                    z18 = z18;
                    r0Var = r0Var3;
                    z1Var5 = z1Var11;
                } else {
                    if (i68 != 0) {
                        z17 = true;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if (i26 != 0) {
                        z1.f108930g.getClass();
                        z1Var4 = z1.f108931h;
                    } else {
                        z1Var4 = z1Var2;
                    }
                    if ((i18 & 512) != 0) {
                        if (z16) {
                            i55 = 1;
                        } else {
                            i55 = Integer.MAX_VALUE;
                        }
                        i56 = i38 & (-1879048193);
                    } else {
                        i55 = i14;
                        i56 = i38;
                    }
                    if (i28 != 0) {
                        i57 = 1;
                    } else {
                        i57 = i15;
                    }
                    if (i34 != 0) {
                        r0.f188941a.getClass();
                        r0Var3 = r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    z1 z1Var12 = z1Var4;
                    objQ = o0VarE.q();
                    aVar.getClass();
                    aVar = aVar;
                    if (objQ == m.a.f135155b) {
                        objQ = new kn1.m(19);
                        o0VarE.K(objQ);
                    }
                    l<? super q0, Unit> lVar11 = (l) objQ;
                    if (i44 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if (i47 != 0) {
                        s0.f108756a.getClass();
                        qVar = s0.f108757b;
                    } else {
                        qVar = qVar;
                    }
                    i14 = i55;
                    i58 = i56;
                    i15 = i57;
                    lVar4 = lVar11;
                    z17 = z17;
                    z18 = z18;
                    r0Var = r0Var3;
                    z1Var5 = z1Var12;
                }
                o0VarE.h0();
                x1 x1Var4 = n.f135158a;
                x5.q qVarB4 = a2Var.b(z16);
                boolean z211 = !z16;
                if (z16) {
                    i59 = 1;
                } else {
                    i59 = i15;
                }
                if (z16) {
                    i64 = 1;
                } else {
                    i64 = i14;
                }
                if ((i58 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | ((i58 & 112) == 32);
                objQ2 = o0VarE.q();
                if (z27) {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new jt1.d(22, l0Var, lVar);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new jt1.d(22, l0Var, lVar);
                    o0VarE.K(objQ2);
                }
                int i612 = i46 << 9;
                h1.a(l0Var, (l) objQ2, rVar, x0Var, r0Var, lVar4, jVar, wVar, z211, i64, i59, qVarB4, z1Var5, z17, z18, qVar, o0VarE, ((i58 >> 6) & 7168) | (i58 & 910) | (i612 & 57344) | 196608 | (i612 & 3670016) | (i612 & 29360128), (i58 & 7168) | ((i58 >> 15) & 896) | (i58 & 57344) | (i46 & 458752));
                z1Var3 = z1Var5;
                o0Var = o0VarE;
                i49 = i14;
                i48 = i15;
                r0Var2 = r0Var;
                z24 = z17;
                qVar2 = qVar;
                lVar3 = lVar4;
                z25 = z18;
                jVar2 = jVar;
            } else {
                o0VarE.e();
                i48 = i15;
                lVar3 = lVar2;
                jVar2 = jVar;
                z24 = z17;
                z1Var3 = z1Var2;
                z25 = z18;
                o0Var = o0VarE;
                i49 = i14;
                r0Var2 = r0Var;
                qVar2 = qVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l2.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i16 | 1);
                        int iT2 = p0.t(i17);
                        r.c(l0Var, lVar, rVar, z24, z25, x0Var, a2Var, z1Var3, z16, i49, i48, r0Var2, lVar3, jVar2, wVar, qVar2, (m) obj, iT, iT2, i18);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i19 |= 3072;
        z17 = z14;
        i24 = i18 & 16;
        if (i24 != 0) {
            if ((i16 & 24576) == 0) {
                z18 = z15;
                if (o0VarE.h(z18)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i19 |= i25;
            }
            if ((i16 & 196608) == 0) {
                if (o0VarE.B(x0Var)) {
                    i67 = 131072;
                } else {
                    i67 = 65536;
                }
                i19 |= i67;
            }
            if ((i16 & 1572864) == 0) {
                if (o0VarE.B(a2Var)) {
                    i66 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i66 = 524288;
                }
                i19 |= i66;
            }
            i26 = i18 & 128;
            if (i26 != 0) {
                i19 |= 12582912;
                z1Var2 = z1Var;
            } else {
                z1Var2 = z1Var;
                if ((i16 & 12582912) == 0) {
                    if (o0VarE.B(z1Var2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i19 |= i27;
                }
            }
            if ((i16 & 100663296) == 0) {
                if (o0VarE.h(z16)) {
                    i65 = 67108864;
                } else {
                    i65 = 33554432;
                }
                i19 |= i65;
            }
            if ((i16 & C.ENCODING_PCM_32BIT) != 0) {
                i19 |= ((i18 & 512) == 0 || !o0VarE.k(i14)) ? 268435456 : 536870912;
            }
            i28 = i18 & 1024;
            if (i28 != 0) {
                i30 = i17 | 6;
            } else {
                if (o0VarE.k(i15)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i30 = i17 | i29;
            }
            i34 = i18 & 2048;
            if (i34 != 0) {
                i36 = i30 | 48;
            } else {
                if (o0VarE.B(r0Var)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i36 = i30 | i35;
            }
            i37 = i36;
            i38 = i19;
            i39 = i37 | 384;
            i44 = i18 & 8192;
            if (i44 != 0) {
                if ((i17 & 3072) == 0) {
                    i45 = i39 | (o0VarE.B(jVar) ? 2048 : 1024);
                } else {
                    i45 = i39;
                }
                i46 = i45 | (o0VarE.B(wVar) ? 16384 : 8192);
                i47 = i18 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i17 & 196608) == 0) {
                    i46 |= o0VarE.r(qVar) ? 131072 : 65536;
                }
                if ((i38 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (o0VarE.n(i38 & 1, z19)) {
                    o0VarE.G0();
                    i54 = i16 & 1;
                    aVar = m.f135153a;
                    if (i54 != 0) {
                        if (i68 != 0) {
                            z17 = true;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if (i26 != 0) {
                            z1.f108930g.getClass();
                            z1Var4 = z1.f108931h;
                        } else {
                            z1Var4 = z1Var2;
                        }
                        if ((i18 & 512) != 0) {
                            if (z16) {
                                i55 = 1;
                            } else {
                                i55 = Integer.MAX_VALUE;
                            }
                            i56 = i38 & (-1879048193);
                        } else {
                            i55 = i14;
                            i56 = i38;
                        }
                        if (i28 != 0) {
                            i57 = 1;
                        } else {
                            i57 = i15;
                        }
                        if (i34 != 0) {
                            r0.f188941a.getClass();
                            r0Var3 = r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        z1 z1Var13 = z1Var4;
                        objQ = o0VarE.q();
                        aVar.getClass();
                        aVar = aVar;
                        if (objQ == m.a.f135155b) {
                            objQ = new kn1.m(19);
                            o0VarE.K(objQ);
                        }
                        l<? super q0, Unit> lVar12 = (l) objQ;
                        if (i44 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if (i47 != 0) {
                            s0.f108756a.getClass();
                            qVar = s0.f108757b;
                        } else {
                            qVar = qVar;
                        }
                        i14 = i55;
                        i58 = i56;
                        i15 = i57;
                        lVar4 = lVar12;
                        z17 = z17;
                        z18 = z18;
                        r0Var = r0Var3;
                        z1Var5 = z1Var13;
                    } else {
                        if (i68 != 0) {
                            z17 = true;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if (i26 != 0) {
                            z1.f108930g.getClass();
                            z1Var4 = z1.f108931h;
                        } else {
                            z1Var4 = z1Var2;
                        }
                        if ((i18 & 512) != 0) {
                            if (z16) {
                                i55 = 1;
                            } else {
                                i55 = Integer.MAX_VALUE;
                            }
                            i56 = i38 & (-1879048193);
                        } else {
                            i55 = i14;
                            i56 = i38;
                        }
                        if (i28 != 0) {
                            i57 = 1;
                        } else {
                            i57 = i15;
                        }
                        if (i34 != 0) {
                            r0.f188941a.getClass();
                            r0Var3 = r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        z1 z1Var14 = z1Var4;
                        objQ = o0VarE.q();
                        aVar.getClass();
                        aVar = aVar;
                        if (objQ == m.a.f135155b) {
                            objQ = new kn1.m(19);
                            o0VarE.K(objQ);
                        }
                        l<? super q0, Unit> lVar13 = (l) objQ;
                        if (i44 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if (i47 != 0) {
                            s0.f108756a.getClass();
                            qVar = s0.f108757b;
                        } else {
                            qVar = qVar;
                        }
                        i14 = i55;
                        i58 = i56;
                        i15 = i57;
                        lVar4 = lVar13;
                        z17 = z17;
                        z18 = z18;
                        r0Var = r0Var3;
                        z1Var5 = z1Var14;
                    }
                    o0VarE.h0();
                    x1 x1Var5 = n.f135158a;
                    x5.q qVarB5 = a2Var.b(z16);
                    boolean z212 = !z16;
                    if (z16) {
                        i59 = 1;
                    } else {
                        i59 = i15;
                    }
                    if (z16) {
                        i64 = 1;
                    } else {
                        i64 = i14;
                    }
                    if ((i58 & 14) == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | ((i58 & 112) == 32);
                    objQ2 = o0VarE.q();
                    if (z27) {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new jt1.d(22, l0Var, lVar);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new jt1.d(22, l0Var, lVar);
                        o0VarE.K(objQ2);
                    }
                    int i613 = i46 << 9;
                    h1.a(l0Var, (l) objQ2, rVar, x0Var, r0Var, lVar4, jVar, wVar, z212, i64, i59, qVarB5, z1Var5, z17, z18, qVar, o0VarE, ((i58 >> 6) & 7168) | (i58 & 910) | (i613 & 57344) | 196608 | (i613 & 3670016) | (i613 & 29360128), (i58 & 7168) | ((i58 >> 15) & 896) | (i58 & 57344) | (i46 & 458752));
                    z1Var3 = z1Var5;
                    o0Var = o0VarE;
                    i49 = i14;
                    i48 = i15;
                    r0Var2 = r0Var;
                    z24 = z17;
                    qVar2 = qVar;
                    lVar3 = lVar4;
                    z25 = z18;
                    jVar2 = jVar;
                } else {
                    o0VarE.e();
                    i48 = i15;
                    lVar3 = lVar2;
                    jVar2 = jVar;
                    z24 = z17;
                    z1Var3 = z1Var2;
                    z25 = z18;
                    o0Var = o0VarE;
                    i49 = i14;
                    r0Var2 = r0Var;
                    qVar2 = qVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l2.h
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i16 | 1);
                            int iT2 = p0.t(i17);
                            r.c(l0Var, lVar, rVar, z24, z25, x0Var, a2Var, z1Var3, z16, i49, i48, r0Var2, lVar3, jVar2, wVar, qVar2, (m) obj, iT, iT2, i18);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i45 = i37 | 3456;
            i46 = i45 | (o0VarE.B(wVar) ? 16384 : 8192);
            i47 = i18 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i17 & 196608) == 0) {
                i46 |= o0VarE.r(qVar) ? 131072 : 65536;
            }
            if ((i38 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (o0VarE.n(i38 & 1, z19)) {
                o0VarE.G0();
                i54 = i16 & 1;
                aVar = m.f135153a;
                if (i54 != 0) {
                    if (i68 != 0) {
                        z17 = true;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if (i26 != 0) {
                        z1.f108930g.getClass();
                        z1Var4 = z1.f108931h;
                    } else {
                        z1Var4 = z1Var2;
                    }
                    if ((i18 & 512) != 0) {
                        if (z16) {
                            i55 = 1;
                        } else {
                            i55 = Integer.MAX_VALUE;
                        }
                        i56 = i38 & (-1879048193);
                    } else {
                        i55 = i14;
                        i56 = i38;
                    }
                    if (i28 != 0) {
                        i57 = 1;
                    } else {
                        i57 = i15;
                    }
                    if (i34 != 0) {
                        r0.f188941a.getClass();
                        r0Var3 = r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    z1 z1Var15 = z1Var4;
                    objQ = o0VarE.q();
                    aVar.getClass();
                    aVar = aVar;
                    if (objQ == m.a.f135155b) {
                        objQ = new kn1.m(19);
                        o0VarE.K(objQ);
                    }
                    l<? super q0, Unit> lVar14 = (l) objQ;
                    if (i44 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if (i47 != 0) {
                        s0.f108756a.getClass();
                        qVar = s0.f108757b;
                    } else {
                        qVar = qVar;
                    }
                    i14 = i55;
                    i58 = i56;
                    i15 = i57;
                    lVar4 = lVar14;
                    z17 = z17;
                    z18 = z18;
                    r0Var = r0Var3;
                    z1Var5 = z1Var15;
                } else {
                    if (i68 != 0) {
                        z17 = true;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if (i26 != 0) {
                        z1.f108930g.getClass();
                        z1Var4 = z1.f108931h;
                    } else {
                        z1Var4 = z1Var2;
                    }
                    if ((i18 & 512) != 0) {
                        if (z16) {
                            i55 = 1;
                        } else {
                            i55 = Integer.MAX_VALUE;
                        }
                        i56 = i38 & (-1879048193);
                    } else {
                        i55 = i14;
                        i56 = i38;
                    }
                    if (i28 != 0) {
                        i57 = 1;
                    } else {
                        i57 = i15;
                    }
                    if (i34 != 0) {
                        r0.f188941a.getClass();
                        r0Var3 = r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    z1 z1Var16 = z1Var4;
                    objQ = o0VarE.q();
                    aVar.getClass();
                    aVar = aVar;
                    if (objQ == m.a.f135155b) {
                        objQ = new kn1.m(19);
                        o0VarE.K(objQ);
                    }
                    l<? super q0, Unit> lVar15 = (l) objQ;
                    if (i44 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if (i47 != 0) {
                        s0.f108756a.getClass();
                        qVar = s0.f108757b;
                    } else {
                        qVar = qVar;
                    }
                    i14 = i55;
                    i58 = i56;
                    i15 = i57;
                    lVar4 = lVar15;
                    z17 = z17;
                    z18 = z18;
                    r0Var = r0Var3;
                    z1Var5 = z1Var16;
                }
                o0VarE.h0();
                x1 x1Var6 = n.f135158a;
                x5.q qVarB6 = a2Var.b(z16);
                boolean z213 = !z16;
                if (z16) {
                    i59 = 1;
                } else {
                    i59 = i15;
                }
                if (z16) {
                    i64 = 1;
                } else {
                    i64 = i14;
                }
                if ((i58 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | ((i58 & 112) == 32);
                objQ2 = o0VarE.q();
                if (z27) {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new jt1.d(22, l0Var, lVar);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new jt1.d(22, l0Var, lVar);
                    o0VarE.K(objQ2);
                }
                int i614 = i46 << 9;
                h1.a(l0Var, (l) objQ2, rVar, x0Var, r0Var, lVar4, jVar, wVar, z213, i64, i59, qVarB6, z1Var5, z17, z18, qVar, o0VarE, ((i58 >> 6) & 7168) | (i58 & 910) | (i614 & 57344) | 196608 | (i614 & 3670016) | (i614 & 29360128), (i58 & 7168) | ((i58 >> 15) & 896) | (i58 & 57344) | (i46 & 458752));
                z1Var3 = z1Var5;
                o0Var = o0VarE;
                i49 = i14;
                i48 = i15;
                r0Var2 = r0Var;
                z24 = z17;
                qVar2 = qVar;
                lVar3 = lVar4;
                z25 = z18;
                jVar2 = jVar;
            } else {
                o0VarE.e();
                i48 = i15;
                lVar3 = lVar2;
                jVar2 = jVar;
                z24 = z17;
                z1Var3 = z1Var2;
                z25 = z18;
                o0Var = o0VarE;
                i49 = i14;
                r0Var2 = r0Var;
                qVar2 = qVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l2.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i16 | 1);
                        int iT2 = p0.t(i17);
                        r.c(l0Var, lVar, rVar, z24, z25, x0Var, a2Var, z1Var3, z16, i49, i48, r0Var2, lVar3, jVar2, wVar, qVar2, (m) obj, iT, iT2, i18);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i19 |= 24576;
        z18 = z15;
        if ((i16 & 196608) == 0) {
            if (o0VarE.B(x0Var)) {
                i67 = 131072;
            } else {
                i67 = 65536;
            }
            i19 |= i67;
        }
        if ((i16 & 1572864) == 0) {
            if (o0VarE.B(a2Var)) {
                i66 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i66 = 524288;
            }
            i19 |= i66;
        }
        i26 = i18 & 128;
        if (i26 != 0) {
            i19 |= 12582912;
            z1Var2 = z1Var;
        } else {
            z1Var2 = z1Var;
            if ((i16 & 12582912) == 0) {
                if (o0VarE.B(z1Var2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i19 |= i27;
            }
        }
        if ((i16 & 100663296) == 0) {
            if (o0VarE.h(z16)) {
                i65 = 67108864;
            } else {
                i65 = 33554432;
            }
            i19 |= i65;
        }
        if ((i16 & C.ENCODING_PCM_32BIT) != 0) {
            i19 |= ((i18 & 512) == 0 || !o0VarE.k(i14)) ? 268435456 : 536870912;
        }
        i28 = i18 & 1024;
        if (i28 != 0) {
            i30 = i17 | 6;
        } else {
            if (o0VarE.k(i15)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i30 = i17 | i29;
        }
        i34 = i18 & 2048;
        if (i34 != 0) {
            i36 = i30 | 48;
        } else {
            if (o0VarE.B(r0Var)) {
                i35 = 32;
            } else {
                i35 = 16;
            }
            i36 = i30 | i35;
        }
        i37 = i36;
        i38 = i19;
        i39 = i37 | 384;
        i44 = i18 & 8192;
        if (i44 != 0) {
            if ((i17 & 3072) == 0) {
                i45 = i39 | (o0VarE.B(jVar) ? 2048 : 1024);
            } else {
                i45 = i39;
            }
            i46 = i45 | (o0VarE.B(wVar) ? 16384 : 8192);
            i47 = i18 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i17 & 196608) == 0) {
                i46 |= o0VarE.r(qVar) ? 131072 : 65536;
            }
            if ((i38 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (o0VarE.n(i38 & 1, z19)) {
                o0VarE.G0();
                i54 = i16 & 1;
                aVar = m.f135153a;
                if (i54 != 0) {
                    if (i68 != 0) {
                        z17 = true;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if (i26 != 0) {
                        z1.f108930g.getClass();
                        z1Var4 = z1.f108931h;
                    } else {
                        z1Var4 = z1Var2;
                    }
                    if ((i18 & 512) != 0) {
                        if (z16) {
                            i55 = 1;
                        } else {
                            i55 = Integer.MAX_VALUE;
                        }
                        i56 = i38 & (-1879048193);
                    } else {
                        i55 = i14;
                        i56 = i38;
                    }
                    if (i28 != 0) {
                        i57 = 1;
                    } else {
                        i57 = i15;
                    }
                    if (i34 != 0) {
                        r0.f188941a.getClass();
                        r0Var3 = r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    z1 z1Var17 = z1Var4;
                    objQ = o0VarE.q();
                    aVar.getClass();
                    aVar = aVar;
                    if (objQ == m.a.f135155b) {
                        objQ = new kn1.m(19);
                        o0VarE.K(objQ);
                    }
                    l<? super q0, Unit> lVar16 = (l) objQ;
                    if (i44 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if (i47 != 0) {
                        s0.f108756a.getClass();
                        qVar = s0.f108757b;
                    } else {
                        qVar = qVar;
                    }
                    i14 = i55;
                    i58 = i56;
                    i15 = i57;
                    lVar4 = lVar16;
                    z17 = z17;
                    z18 = z18;
                    r0Var = r0Var3;
                    z1Var5 = z1Var17;
                } else {
                    if (i68 != 0) {
                        z17 = true;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if (i26 != 0) {
                        z1.f108930g.getClass();
                        z1Var4 = z1.f108931h;
                    } else {
                        z1Var4 = z1Var2;
                    }
                    if ((i18 & 512) != 0) {
                        if (z16) {
                            i55 = 1;
                        } else {
                            i55 = Integer.MAX_VALUE;
                        }
                        i56 = i38 & (-1879048193);
                    } else {
                        i55 = i14;
                        i56 = i38;
                    }
                    if (i28 != 0) {
                        i57 = 1;
                    } else {
                        i57 = i15;
                    }
                    if (i34 != 0) {
                        r0.f188941a.getClass();
                        r0Var3 = r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    z1 z1Var18 = z1Var4;
                    objQ = o0VarE.q();
                    aVar.getClass();
                    aVar = aVar;
                    if (objQ == m.a.f135155b) {
                        objQ = new kn1.m(19);
                        o0VarE.K(objQ);
                    }
                    l<? super q0, Unit> lVar17 = (l) objQ;
                    if (i44 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if (i47 != 0) {
                        s0.f108756a.getClass();
                        qVar = s0.f108757b;
                    } else {
                        qVar = qVar;
                    }
                    i14 = i55;
                    i58 = i56;
                    i15 = i57;
                    lVar4 = lVar17;
                    z17 = z17;
                    z18 = z18;
                    r0Var = r0Var3;
                    z1Var5 = z1Var18;
                }
                o0VarE.h0();
                x1 x1Var7 = n.f135158a;
                x5.q qVarB7 = a2Var.b(z16);
                boolean z214 = !z16;
                if (z16) {
                    i59 = 1;
                } else {
                    i59 = i15;
                }
                if (z16) {
                    i64 = 1;
                } else {
                    i64 = i14;
                }
                if ((i58 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | ((i58 & 112) == 32);
                objQ2 = o0VarE.q();
                if (z27) {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new jt1.d(22, l0Var, lVar);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new jt1.d(22, l0Var, lVar);
                    o0VarE.K(objQ2);
                }
                int i615 = i46 << 9;
                h1.a(l0Var, (l) objQ2, rVar, x0Var, r0Var, lVar4, jVar, wVar, z214, i64, i59, qVarB7, z1Var5, z17, z18, qVar, o0VarE, ((i58 >> 6) & 7168) | (i58 & 910) | (i615 & 57344) | 196608 | (i615 & 3670016) | (i615 & 29360128), (i58 & 7168) | ((i58 >> 15) & 896) | (i58 & 57344) | (i46 & 458752));
                z1Var3 = z1Var5;
                o0Var = o0VarE;
                i49 = i14;
                i48 = i15;
                r0Var2 = r0Var;
                z24 = z17;
                qVar2 = qVar;
                lVar3 = lVar4;
                z25 = z18;
                jVar2 = jVar;
            } else {
                o0VarE.e();
                i48 = i15;
                lVar3 = lVar2;
                jVar2 = jVar;
                z24 = z17;
                z1Var3 = z1Var2;
                z25 = z18;
                o0Var = o0VarE;
                i49 = i14;
                r0Var2 = r0Var;
                qVar2 = qVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l2.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i16 | 1);
                        int iT2 = p0.t(i17);
                        r.c(l0Var, lVar, rVar, z24, z25, x0Var, a2Var, z1Var3, z16, i49, i48, r0Var2, lVar3, jVar2, wVar, qVar2, (m) obj, iT, iT2, i18);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i45 = i37 | 3456;
        i46 = i45 | (o0VarE.B(wVar) ? 16384 : 8192);
        i47 = i18 & 32768;
        if (i47 != 0) {
            i46 |= 196608;
        } else if ((i17 & 196608) == 0) {
            i46 |= o0VarE.r(qVar) ? 131072 : 65536;
        }
        if ((i38 & 306783379) == 306783378) {
            z19 = true;
        } else {
            z19 = true;
        }
        if (o0VarE.n(i38 & 1, z19)) {
            o0VarE.G0();
            i54 = i16 & 1;
            aVar = m.f135153a;
            if (i54 != 0) {
                if (i68 != 0) {
                    z17 = true;
                }
                if (i24 != 0) {
                    z18 = false;
                }
                if (i26 != 0) {
                    z1.f108930g.getClass();
                    z1Var4 = z1.f108931h;
                } else {
                    z1Var4 = z1Var2;
                }
                if ((i18 & 512) != 0) {
                    if (z16) {
                        i55 = 1;
                    } else {
                        i55 = Integer.MAX_VALUE;
                    }
                    i56 = i38 & (-1879048193);
                } else {
                    i55 = i14;
                    i56 = i38;
                }
                if (i28 != 0) {
                    i57 = 1;
                } else {
                    i57 = i15;
                }
                if (i34 != 0) {
                    r0.f188941a.getClass();
                    r0Var3 = r0.a.f188943b;
                } else {
                    r0Var3 = r0Var;
                }
                z1 z1Var19 = z1Var4;
                objQ = o0VarE.q();
                aVar.getClass();
                aVar = aVar;
                if (objQ == m.a.f135155b) {
                    objQ = new kn1.m(19);
                    o0VarE.K(objQ);
                }
                l<? super q0, Unit> lVar18 = (l) objQ;
                if (i44 != 0) {
                    jVar = null;
                } else {
                    jVar = jVar;
                }
                if (i47 != 0) {
                    s0.f108756a.getClass();
                    qVar = s0.f108757b;
                } else {
                    qVar = qVar;
                }
                i14 = i55;
                i58 = i56;
                i15 = i57;
                lVar4 = lVar18;
                z17 = z17;
                z18 = z18;
                r0Var = r0Var3;
                z1Var5 = z1Var19;
            } else {
                if (i68 != 0) {
                    z17 = true;
                }
                if (i24 != 0) {
                    z18 = false;
                }
                if (i26 != 0) {
                    z1.f108930g.getClass();
                    z1Var4 = z1.f108931h;
                } else {
                    z1Var4 = z1Var2;
                }
                if ((i18 & 512) != 0) {
                    if (z16) {
                        i55 = 1;
                    } else {
                        i55 = Integer.MAX_VALUE;
                    }
                    i56 = i38 & (-1879048193);
                } else {
                    i55 = i14;
                    i56 = i38;
                }
                if (i28 != 0) {
                    i57 = 1;
                } else {
                    i57 = i15;
                }
                if (i34 != 0) {
                    r0.f188941a.getClass();
                    r0Var3 = r0.a.f188943b;
                } else {
                    r0Var3 = r0Var;
                }
                z1 z1Var110 = z1Var4;
                objQ = o0VarE.q();
                aVar.getClass();
                aVar = aVar;
                if (objQ == m.a.f135155b) {
                    objQ = new kn1.m(19);
                    o0VarE.K(objQ);
                }
                l<? super q0, Unit> lVar19 = (l) objQ;
                if (i44 != 0) {
                    jVar = null;
                } else {
                    jVar = jVar;
                }
                if (i47 != 0) {
                    s0.f108756a.getClass();
                    qVar = s0.f108757b;
                } else {
                    qVar = qVar;
                }
                i14 = i55;
                i58 = i56;
                i15 = i57;
                lVar4 = lVar19;
                z17 = z17;
                z18 = z18;
                r0Var = r0Var3;
                z1Var5 = z1Var110;
            }
            o0VarE.h0();
            x1 x1Var8 = n.f135158a;
            x5.q qVarB8 = a2Var.b(z16);
            boolean z215 = !z16;
            if (z16) {
                i59 = 1;
            } else {
                i59 = i15;
            }
            if (z16) {
                i64 = 1;
            } else {
                i64 = i14;
            }
            if ((i58 & 14) == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z26 | ((i58 & 112) == 32);
            objQ2 = o0VarE.q();
            if (z27) {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new jt1.d(22, l0Var, lVar);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new jt1.d(22, l0Var, lVar);
                o0VarE.K(objQ2);
            }
            int i616 = i46 << 9;
            h1.a(l0Var, (l) objQ2, rVar, x0Var, r0Var, lVar4, jVar, wVar, z215, i64, i59, qVarB8, z1Var5, z17, z18, qVar, o0VarE, ((i58 >> 6) & 7168) | (i58 & 910) | (i616 & 57344) | 196608 | (i616 & 3670016) | (i616 & 29360128), (i58 & 7168) | ((i58 >> 15) & 896) | (i58 & 57344) | (i46 & 458752));
            z1Var3 = z1Var5;
            o0Var = o0VarE;
            i49 = i14;
            i48 = i15;
            r0Var2 = r0Var;
            z24 = z17;
            qVar2 = qVar;
            lVar3 = lVar4;
            z25 = z18;
            jVar2 = jVar;
        } else {
            o0VarE.e();
            i48 = i15;
            lVar3 = lVar2;
            jVar2 = jVar;
            z24 = z17;
            z1Var3 = z1Var2;
            z25 = z18;
            o0Var = o0VarE;
            i49 = i14;
            r0Var2 = r0Var;
            qVar2 = qVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l2.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i16 | 1);
                    int iT2 = p0.t(i17);
                    r.c(l0Var, lVar, rVar, z24, z25, x0Var, a2Var, z1Var3, z16, i49, i48, r0Var2, lVar3, jVar2, wVar, qVar2, (m) obj, iT, iT2, i18);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:240:0x0415  */
    /* JADX WARN: Code duplicated, block: B:260:0x049b  */
    /* JADX WARN: Code duplicated, block: B:263:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:265:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:266:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:268:0x0531  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(u2.h hVar, h4.r rVar, final boolean z14, final x0 x0Var, final a2 a2Var, final u2.g gVar, j jVar, final w wVar, final u2.f fVar, final d2 d2Var, m mVar, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        boolean z15;
        o0 o0Var;
        int i19;
        j jVar2;
        boolean zA;
        boolean z16;
        Object obj;
        Object obj2;
        z2.q qVarB;
        Object nVar;
        g6.c cVar;
        b0 b0Var;
        char c14;
        Throwable th3;
        u2.a aVar;
        final z2.q qVar;
        int i24;
        boolean z17;
        y1 y1Var;
        final r2.q qVar2;
        o0 o0Var2;
        boolean z18;
        boolean z19;
        Object obj3;
        boolean z24;
        final b2 b2Var;
        h4.r rVarA;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar2;
        Object objB;
        o0 o0VarE = mVar.E(965149429);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(hVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i25 = i16;
        if ((i14 & 384) == 0) {
            i17 = i25 | (o0VarE.h(z14) ? 256 : 128);
        } else {
            i17 = i25;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.h(false) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.B(null) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i17 |= o0VarE.B(x0Var) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i17 |= o0VarE.B(a2Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i17 |= o0VarE.B(null) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i17 |= o0VarE.B(gVar) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= o0VarE.r(null) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i18 = i15 | (o0VarE.B(jVar) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.B(wVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.B(null) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.B(null) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i18 |= (32768 & i15) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i18 |= o0VarE.B(d2Var) ? 131072 : 65536;
        }
        int i26 = i18 | 1572864;
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (599187 & i26) == 599186) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            g6.c cVar2 = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            g6.o oVar = (g6.o) o0VarE.A(kotlin.t1.f91496n);
            final boolean zG = s.g(gVar, u2.g.b.f167845a);
            m.a aVar3 = m.f135153a;
            if (jVar == null) {
                Object objH = q2.h(o0VarE, -2038132442, aVar3);
                if (objH == m.a.f135155b) {
                    objB = objH;
                    objB = kg.f.b(o0VarE);
                }
                objB = objH;
                jVar2 = (j) objB;
                i19 = 0;
                o0VarE.g0(false);
            } else {
                i19 = 0;
                o0VarE.C(-204294191);
                o0VarE.g0(false);
                jVar2 = jVar;
            }
            b2 b2Var2 = zG ? b2.Horizontal : b2.Vertical;
            boolean zBooleanValue = ((Boolean) xy2.b.k(jVar2, o0VarE, i19).getF182175a()).booleanValue();
            final boolean zBooleanValue2 = ((Boolean) zf.b.i(jVar2, o0VarE, i19).getF182175a()).booleanValue();
            if (zBooleanValue) {
                o0VarE.C(-204276540);
                zA = ((h4) o0VarE.A(kotlin.t1.f91503u)).a();
                o0VarE.g0(false);
            } else {
                boolean z25 = i19;
                o0VarE.C(-2037604207);
                o0VarE.g0(z25);
                zA = z25 ? 1 : 0;
            }
            Object objQ = o0VarE.q();
            aVar3.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                z16 = true;
                Object objB2 = g2.b(1, 0, q53.a.DROP_LATEST, 2);
                o0VarE.K(objB2);
                obj = objB2;
            } else {
                z16 = true;
                obj = objQ;
            }
            y1 y1Var2 = (y1) obj;
            boolean z26 = ((i17 & 14) == 4 ? z16 : false) | ((i26 & 896) == 256) | ((i26 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (z26 || objQ2 == c2565a) {
                k1 k1Var = k1.f175073a;
                if (!zG) {
                    k1Var = null;
                }
                Object h2Var = new h2(hVar, null, k1Var, null);
                o0VarE.K(h2Var);
                obj2 = h2Var;
            } else {
                obj2 = objQ2;
            }
            final h2 h2Var2 = (h2) obj2;
            boolean zB = o0VarE.B(h2Var2);
            Object objQ3 = o0VarE.q();
            Object obj4 = objQ3;
            if (zB || objQ3 == c2565a) {
                Object g2Var = new v2.g2();
                o0VarE.K(g2Var);
                obj4 = g2Var;
            }
            final v2.g2 g2Var2 = (v2.g2) obj4;
            a2Var.getClass();
            int i27 = a2Var.f108344c;
            Object objQ4 = o0VarE.q();
            Object obj5 = objQ4;
            if (objQ4 == c2565a) {
                Object objJ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objJ);
                obj5 = objJ;
            }
            b0 b0Var2 = (b0) obj5;
            if (g0.f167496c) {
                o0VarE.C(-2035832304);
                z5.c cVarA = x0Var.f157322a.localeList;
                if (cVarA == null) {
                    z5.c.f202441c.getClass();
                    cVarA = z5.d.f202445a.a();
                }
                qVarB = z2.x.b(a0.EditableText, cVarA, o0VarE, 6);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2035643855);
                o0VarE.g0(false);
                qVarB = null;
            }
            Object objQ5 = o0VarE.q();
            Object obj6 = objQ5;
            if (objQ5 == c2565a) {
                Object qVar3 = new r2.q();
                o0VarE.K(qVar3);
                obj6 = qVar3;
            }
            r2.q qVar4 = (r2.q) obj6;
            o1 o1Var = (o1) o0VarE.A(kotlin.t1.f91488f);
            boolean zB2 = o0VarE.B(h2Var2);
            z2.q qVar5 = qVarB;
            Object objQ6 = o0VarE.q();
            if (zB2 || objQ6 == c2565a) {
                cVar = cVar2;
                b0Var = b0Var2;
                c14 = 16384;
                th3 = null;
                aVar = null;
                o0 o0Var3 = o0VarE;
                nVar = new w2.n(h2Var2, g2Var2, cVar, z14, false, zA, false, qVar4, b0Var, qVar5, o1Var);
                qVar = qVar5;
                i24 = i27;
                z17 = false;
                y1Var = y1Var2;
                qVar2 = qVar4;
                o0Var3.K(nVar);
                o0Var2 = o0Var3;
            } else {
                qVar2 = qVar4;
                o0Var2 = o0VarE;
                b0Var = b0Var2;
                qVar = qVar5;
                c14 = 16384;
                th3 = null;
                aVar = null;
                y1Var = y1Var2;
                nVar = objQ6;
                i24 = i27;
                cVar = cVar2;
                z17 = false;
            }
            final w2.n nVar2 = (w2.n) nVar;
            w4.a aVar4 = (w4.a) o0Var2.A(kotlin.t1.f91494l);
            q3 q3Var = (q3) o0Var2.A(kotlin.t1.f91500r);
            boolean zB3 = o0Var2.B(b0Var) | o0Var2.B(q3Var);
            Object objQ7 = o0Var2.q();
            Object obj7 = objQ7;
            if (zB3 || objQ7 == c2565a) {
                Object qVar6 = new q(q3Var, b0Var);
                o0Var2.K(qVar6);
                obj7 = qVar6;
            }
            q qVar7 = (q) obj7;
            boolean zB4 = o0Var2.B(h2Var2) | ((57344 & i17) == c14) | o0Var2.r(nVar2) | o0Var2.r(aVar4) | o0Var2.r(r14) | o0Var2.B(qVar7) | o0Var2.B(cVar) | ((i17 & 896) == 256) | ((i17 & 7168) == 2048) | ((i26 & 3670016) == 1048576);
            Object objQ8 = o0Var2.q();
            if (zB4 || objQ8 == c2565a) {
                Object iVar = new i(h2Var2, nVar2, aVar4, o1Var, qVar7, cVar, z14);
                z18 = z14;
                o0Var2.K(iVar);
                objQ8 = iVar;
            } else {
                z18 = z14;
            }
            p3.l0.i((e23.a) objQ8, o0Var2);
            boolean zR = o0Var2.r(nVar2);
            Object objQ9 = o0Var2.q();
            if (zR || objQ9 == c2565a) {
                z19 = false;
                Object jVar3 = new j(nVar2, 0);
                o0Var2.K(jVar3);
                obj3 = jVar3;
            } else {
                z19 = false;
                obj3 = objQ9;
            }
            p3.l0.a(nVar2, (l) obj3, o0Var2);
            v.f188954b.getClass();
            if (i24 == v.f188961i ? true : z19) {
                z24 = z19;
            } else {
                if (i24 == v.f188962j ? true : z19) {
                    z24 = z19;
                } else {
                    z24 = true;
                }
            }
            boolean zH = o0Var2.h(z24) | o0Var2.r(y1Var);
            Object objQ10 = o0Var2.q();
            Object obj8 = objQ10;
            if (zH || objQ10 == c2565a) {
                Object oVar2 = new b50.o(z24, y1Var, 6);
                o0Var2.K(oVar2);
                obj8 = oVar2;
            }
            int i28 = i17;
            b0 b0Var3 = b0Var;
            h4.r rVarThen = t2.b.a(rVar, z18, z24, (e23.a) obj8).then(new r1(h2Var2, g2Var2, nVar2, aVar, z18, z17, a2Var, null, zG, jVar2, false, y1Var));
            boolean z27 = z14 && ((w2.n.a) nVar2.f181384t.getF182175a()) == w2.n.a.None;
            r2.f193614a.getClass();
            if (oVar == g6.o.Rtl) {
                b2Var = b2Var2;
                boolean z28 = b2Var == b2.Vertical;
                h4.r rVarB = t2.b(rVarThen, d2Var, b2Var, z27, z28, jVar2, SyslogConstants.LOG_LOCAL4);
                b5.w.f15928a.getClass();
                rVarA = t0.a(rVarB, b5.w.a.f15931c);
                if (g0.f167495b) {
                    rVarA = i.a(rVarA, new vq0.a(17, nVar2, b0Var3));
                }
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, true);
                iHashCode = Long.hashCode(o0Var2.U);
                i2VarA0 = o0Var2.a0();
                rVarC = k.c(rVarA, o0Var2);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0Var2.f135177b != null) {
                    p0.l();
                    throw th3;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar2);
                } else {
                    o0Var2.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0Var2);
                b4.c(h5.g.a.f81809f, i2VarA0, o0Var2);
                b4.a(o0Var2, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                b4.b(h5.g.a.f81814k, o0Var2);
                b4.c(h5.g.a.f81807d, rVarC, o0Var2);
                u uVar = u.f22885a;
                final boolean z29 = zA;
                z15 = z14;
                y.b(nVar2, z15, z3.f.c(-673241599, new e23.p() { // from class: l2.k
                    @Override // e23.p
                    public final Object invoke(Object obj9, Object obj10) {
                        m mVar2 = (m) obj9;
                        int iIntValue = ((Integer) obj10).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var2 = n.f135158a;
                            f fVar2 = fVar;
                            if (fVar2 == null) {
                                fVar2 = r.f108744a;
                            }
                            final g gVar2 = gVar;
                            final v2.g2 g2Var3 = g2Var2;
                            final x0 x0Var2 = x0Var;
                            final boolean z34 = z29;
                            final boolean z35 = zBooleanValue2;
                            final h2 h2Var3 = h2Var2;
                            final w2.n nVar3 = nVar2;
                            final w wVar2 = wVar;
                            final boolean z36 = z14;
                            final d2 d2Var2 = d2Var;
                            final b2 b2Var3 = b2Var;
                            final r2.q qVar8 = qVar2;
                            final z2.q qVar9 = qVar;
                            final boolean z37 = zG;
                            final a2 a2Var2 = a2Var;
                            fVar2.a(z3.f.c(1969169726, new e23.p() { // from class: l2.l
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.p
                                public final Object invoke(Object obj11, Object obj12) {
                                    int i29;
                                    int i30;
                                    m mVar3 = (m) obj11;
                                    int iIntValue2 = ((Integer) obj12).intValue();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        g gVar3 = gVar2;
                                        if (gVar3 instanceof g.a) {
                                            g.a aVar5 = (g.a) gVar3;
                                            i30 = aVar5.f167843a;
                                            i29 = aVar5.f167844b;
                                        } else {
                                            i29 = 1;
                                            i30 = 1;
                                        }
                                        r.a aVar6 = r.S;
                                        v2.g2 g2Var4 = g2Var3;
                                        r rVarJ = x2.j(aVar6, ((g6.f) g2Var4.f175001g.getF182175a()).f75997a, 0.0f, 2);
                                        k2.a aVar7 = k2.f91249a;
                                        x0 x0Var3 = x0Var2;
                                        r rVarC2 = l4.k.c(k.a(k.a(rVarJ, aVar7, new n1(i30, i29, x0Var3)), aVar7, new d(x0Var3, 17)));
                                        boolean z38 = z34;
                                        boolean z39 = z35;
                                        h2 h2Var4 = h2Var3;
                                        w2.n nVar4 = nVar3;
                                        w wVar3 = wVar2;
                                        boolean z44 = z36;
                                        r rVarThen2 = rVarC2.then(new m1(z38, z39, g2Var4, h2Var4, nVar4, wVar3, z44, d2Var2, b2Var3, qVar8, qVar9));
                                        h4.d.f81522a.getClass();
                                        z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, true);
                                        int iHashCode2 = Long.hashCode(mVar3.getU());
                                        i2 i2VarX = mVar3.x();
                                        r rVarC3 = k.c(rVarThen2, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar8 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar8);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, z0VarD2, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                        b4.a(mVar3, Integer.valueOf(iHashCode2), h5.g.a.f81813j);
                                        b4.b(h5.g.a.f81814k, mVar3);
                                        b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                                        u uVar2 = u.f22885a;
                                        c2.q.a(new v2.d2(g2Var4, h2Var4, x0Var3, z37, null, a2Var2), mVar3, 0);
                                        if (z44 && z38 && ((Boolean) nVar4.f181378n.getF182175a()).booleanValue()) {
                                            mVar3.C(-810654004);
                                            r.f(nVar4, mVar3, 0);
                                            mVar3.C(-810526873);
                                            r.e(nVar4, mVar3, 0);
                                            mVar3.f();
                                        } else {
                                            mVar3.C(-837871074);
                                        }
                                        mVar3.f();
                                        mVar3.y();
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, mVar2), mVar2, 6);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var2), o0Var2, ((i28 >> 3) & 112) | 384);
                o0Var2.g0(true);
                x1 x1Var2 = n.f135158a;
                o0Var = o0Var2;
            } else {
                b2Var = b2Var2;
            }
            h4.r rVarB2 = t2.b(rVarThen, d2Var, b2Var, z27, z28, jVar2, SyslogConstants.LOG_LOCAL4);
            b5.w.f15928a.getClass();
            rVarA = t0.a(rVarB2, b5.w.a.f15931c);
            if (g0.f167495b) {
                rVarA = i.a(rVarA, new vq0.a(17, nVar2, b0Var3));
            }
            h4.d.f81522a.getClass();
            z0VarD = c2.q.d(h4.d.a.f81524b, true);
            iHashCode = Long.hashCode(o0Var2.U);
            i2VarA0 = o0Var2.a0();
            rVarC = k.c(rVarA, o0Var2);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0Var2.f135177b != null) {
                p0.l();
                throw th3;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar2);
            } else {
                o0Var2.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0Var2);
            b4.c(h5.g.a.f81809f, i2VarA0, o0Var2);
            b4.a(o0Var2, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, o0Var2);
            b4.c(h5.g.a.f81807d, rVarC, o0Var2);
            u uVar2 = u.f22885a;
            final boolean z210 = zA;
            z15 = z14;
            y.b(nVar2, z15, z3.f.c(-673241599, new e23.p() { // from class: l2.k
                @Override // e23.p
                public final Object invoke(Object obj9, Object obj10) {
                    m mVar2 = (m) obj9;
                    int iIntValue = ((Integer) obj10).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var3 = n.f135158a;
                        f fVar2 = fVar;
                        if (fVar2 == null) {
                            fVar2 = r.f108744a;
                        }
                        final g gVar2 = gVar;
                        final v2.g2 g2Var3 = g2Var2;
                        final x0 x0Var2 = x0Var;
                        final boolean z34 = z210;
                        final boolean z35 = zBooleanValue2;
                        final h2 h2Var3 = h2Var2;
                        final w2.n nVar3 = nVar2;
                        final w wVar2 = wVar;
                        final boolean z36 = z14;
                        final d2 d2Var2 = d2Var;
                        final b2 b2Var3 = b2Var;
                        final r2.q qVar8 = qVar2;
                        final z2.q qVar9 = qVar;
                        final boolean z37 = zG;
                        final a2 a2Var2 = a2Var;
                        fVar2.a(z3.f.c(1969169726, new e23.p() { // from class: l2.l
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.p
                            public final Object invoke(Object obj11, Object obj12) {
                                int i29;
                                int i30;
                                m mVar3 = (m) obj11;
                                int iIntValue2 = ((Integer) obj12).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var4 = n.f135158a;
                                    g gVar3 = gVar2;
                                    if (gVar3 instanceof g.a) {
                                        g.a aVar5 = (g.a) gVar3;
                                        i30 = aVar5.f167843a;
                                        i29 = aVar5.f167844b;
                                    } else {
                                        i29 = 1;
                                        i30 = 1;
                                    }
                                    r.a aVar6 = r.S;
                                    v2.g2 g2Var4 = g2Var3;
                                    r rVarJ = x2.j(aVar6, ((g6.f) g2Var4.f175001g.getF182175a()).f75997a, 0.0f, 2);
                                    k2.a aVar7 = k2.f91249a;
                                    x0 x0Var3 = x0Var2;
                                    r rVarC2 = l4.k.c(k.a(k.a(rVarJ, aVar7, new n1(i30, i29, x0Var3)), aVar7, new d(x0Var3, 17)));
                                    boolean z38 = z34;
                                    boolean z39 = z35;
                                    h2 h2Var4 = h2Var3;
                                    w2.n nVar4 = nVar3;
                                    w wVar3 = wVar2;
                                    boolean z44 = z36;
                                    r rVarThen2 = rVarC2.then(new m1(z38, z39, g2Var4, h2Var4, nVar4, wVar3, z44, d2Var2, b2Var3, qVar8, qVar9));
                                    h4.d.f81522a.getClass();
                                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, true);
                                    int iHashCode2 = Long.hashCode(mVar3.getU());
                                    i2 i2VarX = mVar3.x();
                                    r rVarC3 = k.c(rVarThen2, mVar3);
                                    h5.g.V.getClass();
                                    e0.a aVar8 = h5.g.a.f81805b;
                                    if (mVar3.F() == null) {
                                        p0.l();
                                        throw null;
                                    }
                                    mVar3.z();
                                    if (mVar3.getT()) {
                                        mVar3.M(aVar8);
                                    } else {
                                        mVar3.c();
                                    }
                                    b4.c(h5.g.a.f81810g, z0VarD2, mVar3);
                                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                    b4.a(mVar3, Integer.valueOf(iHashCode2), h5.g.a.f81813j);
                                    b4.b(h5.g.a.f81814k, mVar3);
                                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                                    u uVar3 = u.f22885a;
                                    c2.q.a(new v2.d2(g2Var4, h2Var4, x0Var3, z37, null, a2Var2), mVar3, 0);
                                    if (z44 && z38 && ((Boolean) nVar4.f181378n.getF182175a()).booleanValue()) {
                                        mVar3.C(-810654004);
                                        r.f(nVar4, mVar3, 0);
                                        mVar3.C(-810526873);
                                        r.e(nVar4, mVar3, 0);
                                        mVar3.f();
                                    } else {
                                        mVar3.C(-837871074);
                                    }
                                    mVar3.f();
                                    mVar3.y();
                                } else {
                                    mVar3.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, 6);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var2), o0Var2, ((i28 >> 3) & 112) | 384);
            o0Var2.g0(true);
            x1 x1Var3 = n.f135158a;
            o0Var = o0Var2;
        } else {
            z15 = z14;
            o0 o0Var4 = o0VarE;
            o0Var4.e();
            o0Var = o0Var4;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p006l2.g(hVar, rVar, z15, x0Var, a2Var, gVar, jVar, wVar, fVar, d2Var, i14, i15, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    public static final void e(w2.n nVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1991581797);
        int i15 = 2;
        int i16 = (o0VarE.r(nVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zB = o0VarE.B(nVar);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zB) {
                objQ = p0.f(new m(nVar, i15));
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.f(new m(nVar, i15));
                    o0VarE.K(objQ);
                }
            }
            if (((w2.f) ((x3) objQ).getF182175a()).f181326a) {
                o0VarE.C(535433166);
                boolean zR = o0VarE.r(nVar);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new b(nVar);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new b(nVar);
                        o0VarE.K(objQ2);
                    }
                }
                p pVar = (p) objQ2;
                h4.r.a aVar2 = h4.r.S;
                boolean zR2 = o0VarE.r(nVar);
                Object objQ3 = o0VarE.q();
                if (zR2) {
                    objQ3 = new c(nVar);
                    o0VarE.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new c(nVar);
                        o0VarE.K(objQ3);
                    }
                }
                p006l2.b.a(pVar, s0.b(aVar2, nVar, (PointerInputEventHandler) objQ3), f108745b, o0VarE, 384, 0);
            } else {
                o0VarE.C(507182525);
            }
            o0VarE.g0(false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(nVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0138  */
    public static final void f(w2.n nVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(2025287684);
        int i16 = (o0VarE.r(nVar) ? 4 : 2) | i14;
        int i17 = 0;
        int i18 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zB = o0VarE.B(nVar);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zB) {
                objQ = p0.f(new m(nVar, i17));
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.f(new m(nVar, i17));
                    o0VarE.K(objQ);
                }
            }
            x3 x3Var = (x3) objQ;
            if (((w2.f) x3Var.getF182175a()).f181326a) {
                o0VarE.C(-354703320);
                boolean zR = o0VarE.r(nVar);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new d(nVar);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new d(nVar);
                        o0VarE.K(objQ2);
                    }
                }
                p pVar = (p) objQ2;
                d6.g gVar = ((w2.f) x3Var.getF182175a()).f181329d;
                boolean z14 = ((w2.f) x3Var.getF182175a()).f181330e;
                h4.r.a aVar2 = h4.r.S;
                boolean zR2 = o0VarE.r(nVar);
                Object objQ3 = o0VarE.q();
                if (zR2) {
                    objQ3 = new e(nVar);
                    o0VarE.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new e(nVar);
                        o0VarE.K(objQ3);
                    }
                }
                i15 = -383839042;
                z2.c.b(pVar, true, gVar, z14, f108745b, ((w2.f) x3Var.getF182175a()).f181328c, s0.b(aVar2, nVar, (PointerInputEventHandler) objQ3), o0VarE, 24624, 0);
            } else {
                i15 = -383839042;
                o0VarE.C(-383839042);
            }
            o0VarE.g0(false);
            boolean zB2 = o0VarE.B(nVar);
            Object objQ4 = o0VarE.q();
            if (zB2) {
                objQ4 = p0.f(new m(nVar, i18));
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = p0.f(new m(nVar, i18));
                    o0VarE.K(objQ4);
                }
            }
            x3 x3Var2 = (x3) objQ4;
            if (((w2.f) x3Var2.getF182175a()).f181326a) {
                o0VarE.C(-353657845);
                boolean zR3 = o0VarE.r(nVar);
                Object objQ5 = o0VarE.q();
                if (zR3) {
                    objQ5 = new f(nVar);
                    o0VarE.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new f(nVar);
                        o0VarE.K(objQ5);
                    }
                }
                p pVar2 = (p) objQ5;
                d6.g gVar2 = ((w2.f) x3Var2.getF182175a()).f181329d;
                boolean z15 = ((w2.f) x3Var2.getF182175a()).f181330e;
                h4.r.a aVar3 = h4.r.S;
                boolean zR4 = o0VarE.r(nVar);
                Object objQ6 = o0VarE.q();
                if (zR4) {
                    objQ6 = new g(nVar);
                    o0VarE.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == m.a.f135155b) {
                        objQ6 = new g(nVar);
                        o0VarE.K(objQ6);
                    }
                }
                z2.c.b(pVar2, false, gVar2, z15, f108745b, ((w2.f) x3Var2.getF182175a()).f181328c, s0.b(aVar3, nVar, (PointerInputEventHandler) objQ6), o0VarE, 24624, 0);
            } else {
                o0VarE.C(i15);
            }
            o0VarE.g0(false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(nVar, i14, 0);
        }
    }
}
