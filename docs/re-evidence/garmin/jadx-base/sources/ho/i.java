package ho;

import am.h1;
import am.l1;
import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import et1.b2;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import o4.m1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:104:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0197  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    public static final void a(String str, String str2, final x0 x0Var, long j8, final boolean z14, final boolean z15, final z3.e eVar, final e23.l lVar, p3.m mVar, final int i14, final int i15) {
        String str3;
        int i16;
        String str4;
        long jD;
        boolean z16;
        boolean z17;
        z3.e eVar2;
        boolean z18;
        o0 o0Var;
        final String str5;
        final String str6;
        final long j14;
        p2 p2VarI0;
        boolean z19;
        boolean z24;
        Object objQ;
        x0 x0Var2;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        o0 o0VarE = mVar.E(1501763037);
        int i27 = i15 & 1;
        if (i27 != 0) {
            i16 = i14 | 6;
            str3 = str;
        } else if ((i14 & 6) == 0) {
            str3 = str;
            i16 = (o0VarE.B(str3) ? 4 : 2) | i14;
        } else {
            str3 = str;
            i16 = i14;
        }
        int i28 = i15 & 2;
        if (i28 == 0) {
            if ((i14 & 48) == 0) {
                str4 = str2;
                i16 |= o0VarE.B(str4) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.k(x0Var.ordinal())) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i16 |= i26;
            }
            if ((i14 & 3072) == 0) {
                jD = j8;
                if ((i15 & 8) == 0 || !o0VarE.l(jD)) {
                    i25 = 1024;
                } else {
                    i25 = 2048;
                }
                i16 |= i25;
            } else {
                jD = j8;
            }
            if ((i14 & 24576) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            } else {
                z16 = z14;
            }
            if ((196608 & i14) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            } else {
                z17 = z15;
            }
            if ((1572864 & i14) == 0) {
                eVar2 = eVar;
                if (o0VarE.r(eVar2)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            } else {
                eVar2 = eVar;
            }
            if ((12582912 & i14) == 0) {
                if (o0VarE.r(lVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i16 |= i17;
            }
            if ((4793491 & i16) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i16 & 1, z18)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i27 != 0) {
                        str3 = null;
                    }
                    if (i28 != 0) {
                        str4 = null;
                    }
                    if ((i15 & 8) != 0) {
                        jD = hb.a.d(d92.b.f58623a, o0VarE);
                        i16 &= -7169;
                    }
                } else {
                    o0VarE.e();
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                    }
                }
                String str7 = str4;
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                l72.p2 p2Var = l72.p2.f111205a;
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                if ((29360128 & i16) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z19 | ((i16 & 896) == 256);
                objQ = o0VarE.q();
                if (z24) {
                    x0Var2 = x0Var;
                    objQ = new h1(lVar, x0Var2, 1);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        x0Var2 = x0Var;
                        objQ = new h1(lVar, x0Var2, 1);
                        o0VarE.K(objQ);
                    } else {
                        x0Var2 = x0Var;
                    }
                }
                long j15 = jD;
                o0Var = o0VarE;
                p2Var.f(u1.w.d(rVarF, false, null, null, (e23.a) objQ, 15), z3.f.c(-2013481595, new e(x0Var2, z16, j15, eVar2, str3, context, str7), o0VarE), null, false, z17, null, null, o0Var, ((i16 >> 3) & 57344) | 48, 108);
                str5 = str3;
                str6 = str7;
                j14 = j15;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str5 = str3;
                str6 = str4;
                j14 = jD;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: ho.f
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i.a(str5, str6, x0Var, j14, z14, z15, eVar, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 48;
        str4 = str2;
        if ((i14 & 384) == 0) {
            if (o0VarE.k(x0Var.ordinal())) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i16 |= i26;
        }
        if ((i14 & 3072) == 0) {
            jD = j8;
            if ((i15 & 8) == 0) {
                i25 = 1024;
            } else {
                i25 = 1024;
            }
            i16 |= i25;
        } else {
            jD = j8;
        }
        if ((i14 & 24576) == 0) {
            z16 = z14;
            if (o0VarE.h(z16)) {
                i24 = 16384;
            } else {
                i24 = 8192;
            }
            i16 |= i24;
        } else {
            z16 = z14;
        }
        if ((196608 & i14) == 0) {
            z17 = z15;
            if (o0VarE.h(z17)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i16 |= i19;
        } else {
            z17 = z15;
        }
        if ((1572864 & i14) == 0) {
            eVar2 = eVar;
            if (o0VarE.r(eVar2)) {
                i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i18 = 524288;
            }
            i16 |= i18;
        } else {
            eVar2 = eVar;
        }
        if ((12582912 & i14) == 0) {
            if (o0VarE.r(lVar)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i16 |= i17;
        }
        if ((4793491 & i16) != 4793490) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i16 & 1, z18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i27 != 0) {
                    str3 = null;
                }
                if (i28 != 0) {
                    str4 = null;
                }
                if ((i15 & 8) != 0) {
                    jD = hb.a.d(d92.b.f58623a, o0VarE);
                    i16 &= -7169;
                }
            } else {
                if (i27 != 0) {
                    str3 = null;
                }
                if (i28 != 0) {
                    str4 = null;
                }
                if ((i15 & 8) != 0) {
                    jD = hb.a.d(d92.b.f58623a, o0VarE);
                    i16 &= -7169;
                }
            }
            String str8 = str4;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            l72.p2 p2Var2 = l72.p2.f111205a;
            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
            if ((29360128 & i16) == 8388608) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z19 | ((i16 & 896) == 256);
            objQ = o0VarE.q();
            if (z24) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    x0Var2 = x0Var;
                    objQ = new h1(lVar, x0Var2, 1);
                    o0VarE.K(objQ);
                } else {
                    x0Var2 = x0Var;
                }
            } else {
                x0Var2 = x0Var;
                objQ = new h1(lVar, x0Var2, 1);
                o0VarE.K(objQ);
            }
            long j16 = jD;
            o0Var = o0VarE;
            p2Var2.f(u1.w.d(rVarF2, false, null, null, (e23.a) objQ, 15), z3.f.c(-2013481595, new e(x0Var2, z16, j16, eVar2, str3, context2, str8), o0VarE), null, false, z17, null, null, o0Var, ((i16 >> 3) & 57344) | 48, 108);
            str5 = str3;
            str6 = str8;
            j14 = j16;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str5 = str3;
            str6 = str4;
            j14 = jD;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: ho.f
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i.a(str5, str6, x0Var, j14, z14, z15, eVar, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02ea  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, i53.c<? extends b> cVar, j jVar, boolean z14, e23.l<? super b, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        p3.m.a aVar2;
        String strK0;
        byte b14;
        o0 o0VarE = mVar.E(-415932297);
        int i15 = (i14 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(jVar) ? 256 : 128;
        }
        boolean z15 = z14;
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarE = u1.n.e(rVar, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(-118012267);
            Iterator<a> it = jVar.f84636a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                aVar2 = p3.m.f135153a;
                if (!zHasNext) {
                    break;
                }
                a next = it.next();
                Object objQ = o0VarE.q();
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(1172941037);
                    b14 = 0;
                    o0VarE.g0(false);
                    strK0 = null;
                } else {
                    o0VarE.C(1172994884);
                    ArrayList arrayList = new ArrayList();
                    for (b bVar2 : cVar) {
                        if (bVar2.getF84582b() == next.f84566a) {
                            arrayList.add(bVar2);
                        }
                    }
                    boolean zR = o0VarE.r(context);
                    Object objQ2 = o0VarE.q();
                    if (zR || objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a51.m(context, 15);
                        o0VarE.K(objQ2);
                    }
                    strK0 = h0.k0(arrayList, ", ", null, null, (e23.l) objQ2, 30);
                    b14 = 0;
                    o0VarE.g0(false);
                }
                x0 x0Var = next.f84566a;
                z3.e eVarC = z3.f.c(160108867, new l1(p1Var, 10, b14), o0VarE);
                Object objQ3 = o0VarE.q();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new b2(p1Var, 24);
                    o0VarE.K(objQ3);
                }
                int i16 = (i15 << 3) & 57344;
                Context context2 = context;
                o0 o0Var2 = o0VarE;
                a(null, strK0, x0Var, 0L, z15, false, eVarC, (e23.l) objQ3, o0Var2, i16 | 14352384, 9);
                o0 o0Var3 = o0Var2;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0Var3.C(1173925349);
                    Iterator<b> it3 = next.f84567b.iterator();
                    while (it3.hasNext()) {
                        b next2 = it3.next();
                        String strC = next2.c((Context) o0Var3.A(AndroidCompositionLocals_androidKt.f6042b));
                        x0 f84581a = next2.getF84581a();
                        o4.d0.f128823b.getClass();
                        long j8 = o4.d0.f128831j;
                        boolean zContains = cVar.contains(next2);
                        z3.e eVarC2 = z3.f.c(-781379926, new g80.e(20, cVar, next2), o0Var3);
                        Iterator<b> it4 = it3;
                        boolean zB = ((i15 & 57344) == 16384) | o0Var3.B(next2);
                        Object objQ4 = o0Var3.q();
                        if (zB || objQ4 == p3.m.a.f135155b) {
                            objQ4 = new g2.m1(21, lVar, next2);
                            o0Var3.K(objQ4);
                        }
                        o0 o0Var4 = o0Var3;
                        a(strC, null, f84581a, j8, z14, zContains, eVarC2, (e23.l) objQ4, o0Var4, i16 | 1575936, 2);
                        o0Var3 = o0Var4;
                        it3 = it4;
                    }
                    o0Var3.g0(false);
                } else {
                    o0Var3.C(1174990137);
                    o0Var3.g0(false);
                }
                z15 = z14;
                o0VarE = o0Var3;
                context = context2;
            }
            o0 o0Var5 = o0VarE;
            o0Var5.g0(false);
            String strB = g22.n.b(gl1.y.Q(o0Var5, jVar.f84637b ? R.string.lbl_show_less : R.string.device_settings_show_all));
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0Var2 = j92.f.f97931h;
            long jE = hb.a.e(o0Var5);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            boolean z16 = (i15 & 458752) == 131072;
            Object objQ5 = o0Var5.q();
            if (z16) {
                objQ5 = new gt1.s(aVar, 11);
                o0Var5.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new gt1.s(aVar, 11);
                    o0Var5.K(objQ5);
                }
            }
            h4.r rVarD = u1.w.d(rVarF, false, null, null, (e23.a) objQ5, 15);
            d92.b.f58625c.getClass();
            mh.c(strB, c2.l.y(rVarD, j92.b.f97899b.f97920e), jE, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0Var5, 0, 0, 131064);
            o0Var = o0Var5;
            o0Var.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(rVar, cVar, jVar, z14, lVar, aVar, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(h4.r rVar, c cVar, i53.c cVar2, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        c cVar3;
        int i16;
        rVar.getClass();
        cVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-32745338);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(cVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                cVar3 = (c) u1VarResolveViewModel;
                i16 = i15 & (-113);
            } else {
                o0VarE.e();
                i16 = i15 & (-113);
                cVar3 = cVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            j jVar = (j) s9.c.c(cVar3.f84595d, o0VarE).getF182175a();
            boolean z15 = (57344 & i16) == 16384;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                objQ = new g(lVar);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g(lVar);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar2 = (e23.l) ((k23.g) objQ);
            boolean zR = o0VarE.r(cVar3);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new h(cVar3);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new h(cVar3);
                    o0VarE.K(objQ2);
                }
            }
            b(rVar, cVar2, jVar, z14, lVar2, (e23.a) ((k23.g) objQ2), o0VarE, (i16 & 14) | ((i16 >> 3) & 112) | (i16 & 7168));
        } else {
            o0VarE.e();
            cVar3 = cVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(rVar, cVar3, cVar2, z14, lVar, i14);
        }
    }
}
