package i3;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2.l2 f90061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90062b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f90063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f90064b;

        public a(String str, String str2) {
            this.f90063a = str;
            this.f90064b = str2;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x003f  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                String str = this.f90063a;
                boolean zB = mVar2.B(str);
                String str2 = this.f90064b;
                boolean zB2 = zB | mVar2.B(str2);
                Object objQ = mVar2.q();
                if (zB2) {
                    objQ = new cn1.j(this.f90063a, str2, 2);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cn1.j(this.f90063a, str2, 2);
                        mVar2.K(objQ);
                    }
                }
                mh.c(str, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262140);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f90065a;

        public b(String str) {
            this.f90065a = str;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.f(6);
                    mVar2.K(objQ);
                }
                mh.c(this.f90065a, p5.v.b(aVar, (e23.l) objQ), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262140);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        float f14 = 24;
        g6.f.a aVar = g6.f.f75994b;
        f90061a = c2.l.e(f14, 10, f14, 0.0f, 8);
        f90062b = 16;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    public static final void a(Long l14, e23.l<? super Long, Unit> lVar, l3.e0 e0Var, j23.l lVar2, l3 l3Var, bc bcVar, b3 b3Var, m4.b0 b0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-432341251);
        int i15 = i14 | (o0VarE.B(l14) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(e0Var) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.B(l3Var) ? 16384 : 8192) | (o0VarE.B(bcVar) ? 131072 : 65536) | (o0VarE.B(b3Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(b0Var) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarE.B(e0Var.f109226a);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = e0Var.c(e0Var.f109226a);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = e0Var.c(e0Var.f109226a);
                    o0VarE.K(objQ);
                }
            }
            l3.k0 k0Var = (l3.k0) objQ;
            int i16 = l3.n1.f109367b;
            String strH = l3.k.h(o0VarE, R.string.m3c_date_input_invalid_for_pattern);
            String strH2 = l3.k.h(o0VarE, R.string.m3c_date_input_invalid_year_range);
            String strH3 = l3.k.h(o0VarE, R.string.m3c_date_input_invalid_not_allowed);
            boolean zB2 = o0VarE.B(k0Var) | ((i15 & 57344) == 16384);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                a3 a3Var = new a3(lVar2, bcVar, k0Var, l3Var, strH, strH2, strH3, "");
                o0VarE.K(a3Var);
                objQ2 = a3Var;
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    a3 a3Var2 = new a3(lVar2, bcVar, k0Var, l3Var, strH, strH2, strH3, "");
                    o0VarE.K(a3Var2);
                    objQ2 = a3Var2;
                }
            }
            a3 a3Var3 = (a3) objQ2;
            String upperCase = k0Var.f109296a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strH4 = l3.k.h(o0VarE, R.string.m3c_date_input_label);
            h4.r rVarX = c2.l.x(c2.x2.f(h4.r.S, 1.0f), f90061a);
            o7.f89153b.getClass();
            a3Var3.f87421i = l14;
            int i17 = i15 << 3;
            b(rVarX, l14, lVar, e0Var, z3.f.c(-752164549, new a(strH4, upperCase), o0VarE), z3.f.c(-1179434278, new b(upperCase), o0VarE), 0, a3Var3, k0Var, e0Var.f109226a, b3Var, b0Var, o0VarE, (i17 & 112) | 1794054 | (i17 & 896) | (i17 & 7168), (i15 >> 18) & 126);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dd1.d(l14, (e23.l) lVar, e0Var, lVar2, l3Var, bcVar, b3Var, b0Var, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, Long l14, final e23.l lVar, l3.e0 e0Var, z3.e eVar, z3.e eVar2, final int i14, final a3 a3Var, l3.k0 k0Var, Locale locale, b3 b3Var, m4.b0 b0Var, p3.m mVar, int i15, int i16) {
        int i17;
        int i18;
        Long l15;
        p3.o0 o0Var;
        p3.p1 p1Var;
        Object obj;
        Object[] objArr;
        final l3.k0 k0Var2;
        p3.p1 p1Var2;
        boolean z14;
        Object z2Var;
        final l3.e0 e0Var2 = e0Var;
        final Locale locale2 = locale;
        p3.o0 o0VarE = mVar.E(1456309913);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(l14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.r(e0Var2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i17 |= o0VarE.r(eVar2) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= o0VarE.k(i14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= o0VarE.B(a3Var) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= o0VarE.B(k0Var) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= o0VarE.r(locale2) ? 536870912 : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (o0VarE.B(b3Var) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= o0VarE.B(b0Var) ? 32 : 16;
        }
        int i19 = i18;
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (i19 & 19) == 18) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object[] objArr2 = new Object[0];
            x5.l0.f188876d.getClass();
            d4.l lVar2 = x5.l0.f188877e;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i01.j(13);
                o0VarE.K(objQ);
            }
            p3.p1 p1VarF = d4.a.f(objArr2, lVar2, (e23.a) objQ, o0VarE, 384);
            Object[] objArr3 = {(x5.l0) p1VarF.getF182175a()};
            boolean z15 = i17 & 29360128;
            boolean z16 = i17 & 234881024;
            boolean z17 = i17 & 3670016;
            boolean zB = o0VarE.B(p1VarF) | (z15 == 8388608) | o0VarE.r(e0Var2) | (z16 == 67108864) | o0VarE.r(locale2) | (z17 == 1048576);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new t2(a3Var, e0Var2, k0Var, locale2, i14, p1VarF);
                p1Var = p1VarF;
                o0VarE.K(objQ2);
            } else {
                p1Var = p1VarF;
            }
            final p3.p1 p1Var3 = (p3.p1) d4.a.e(objArr3, (e23.a) objQ2, o0VarE, 0);
            boolean zJ = d53.w.J((CharSequence) p1Var3.getF182175a());
            float f14 = f90062b;
            if (!zJ) {
                c2.l2 l2VarF = wg.f(wg.f90137a);
                float f15 = l2VarF.f22739d + l2VarF.f22737b;
                g6.f.a aVar = g6.f.f75994b;
                f14 -= f15;
            }
            float f16 = f14;
            x5.l0 l0Var = (x5.l0) p1Var.getF182175a();
            boolean zB2 = (z16 == 67108864) | o0VarE.B(p1Var) | o0VarE.B(p1Var3) | ((i17 & 896) == 256) | o0VarE.r(e0Var2) | o0VarE.r(locale2) | (z15 == 8388608) | (z17 == 1048576);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                objArr = 67108864;
                k0Var2 = k0Var;
                final p3.p1 p1Var4 = p1Var;
                obj = new e23.l() { // from class: i3.u2
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        x5.l0 l0Var2 = (x5.l0) obj2;
                        String str = l0Var2.f188878a.f157138b;
                        int length = str.length();
                        String str2 = k0Var2.f109298c;
                        if (length <= str2.length()) {
                            for (int i24 = 0; i24 < str.length(); i24++) {
                                if (Character.isDigit(str.charAt(i24))) {
                                }
                            }
                            p1Var4.setValue(l0Var2);
                            String string = d53.w.i0(str).toString();
                            int length2 = string.length();
                            p3.p1 p1Var5 = p1Var3;
                            e23.l lVar3 = lVar;
                            Long lValueOf = null;
                            if (length2 != 0 && string.length() >= str2.length()) {
                                l3.e0 e0Var3 = e0Var2;
                                Locale locale3 = locale2;
                                l3.d0 d0VarJ = e0Var3.j(string, str2, locale3);
                                p1Var5.setValue(a3Var.a(d0VarJ, i14, locale3));
                                if (((CharSequence) p1Var5.getF182175a()).length() == 0 && d0VarJ != null) {
                                    lValueOf = Long.valueOf(d0VarJ.f109211d);
                                }
                                lVar3.invoke(lValueOf);
                            } else {
                                p1Var5.setValue("");
                                lVar3.invoke(null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                p1Var2 = p1Var3;
                e0Var2 = e0Var2;
                locale2 = locale2;
                p1Var = p1Var4;
                o0VarE.K(obj);
            } else {
                k0Var2 = k0Var;
                objArr = 67108864;
                obj = objQ3;
                p1Var2 = p1Var3;
            }
            e23.l lVar3 = (e23.l) obj;
            Object[] objArr4 = objArr;
            h4.r rVarC = c2.l.C(rVar, 0.0f, 0.0f, 0.0f, f16, 7);
            boolean zB3 = o0VarE.B(p1Var2);
            Object objQ4 = o0VarE.q();
            if (zB3 || objQ4 == c2565a) {
                z14 = false;
                objQ4 = new v2(p1Var2, 0 == true ? 1 : 0);
                o0VarE.K(objQ4);
            } else {
                z14 = false;
            }
            h4.r rVarThen = p5.v.c((e23.l) objQ4, rVarC, z14).then(b0Var != null ? m4.e.a(h4.r.S, b0Var) : h4.r.S);
            z3.e eVarC = z3.f.c(-357881838, new x2(p1Var2), o0VarE);
            boolean z18 = !d53.w.J((CharSequence) p1Var2.getF182175a());
            f5 f5Var = new f5(k0Var2);
            Boolean bool = Boolean.FALSE;
            x5.v.f188954b.getClass();
            int i24 = x5.v.f188957e;
            x5.p.f188918b.getClass();
            na.b(l0Var, lVar3, rVarThen, false, null, eVar, eVar2, eVarC, z18, f5Var, new p006l2.a2(0, bool, i24, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 113, (p005kotlin.jvm.internal.j) null), null, true, 0, 0, null, b3Var.f87561y, o0VarE, (i17 << 6) & 33030144, 12779904, 0, 4001592);
            o0Var = o0VarE;
            Unit unit = Unit.INSTANCE;
            Object[] objArr5 = (i19 & 112) == 32;
            Object objQ5 = o0Var.q();
            if (objArr5 != false || objQ5 == c2565a) {
                objQ5 = new y2(b0Var, null);
                o0Var.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, unit, o0Var);
            boolean zR = ((i17 & 112) == 32) | o0Var.r(e0Var2) | (z16 == objArr4) | o0Var.r(locale2) | o0Var.B(p1Var);
            Object objQ6 = o0Var.q();
            if (zR || objQ6 == c2565a) {
                l15 = l14;
                z2Var = new z2(l15, e0Var2, k0Var2, locale, p1Var, null);
                o0Var.K(z2Var);
            } else {
                z2Var = objQ6;
                l15 = l14;
            }
            p3.l0.e((e23.p) z2Var, l15, o0Var);
        } else {
            l15 = l14;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.i(rVar, l15, lVar, e0Var, eVar, eVar2, i14, a3Var, k0Var, locale, b3Var, b0Var, i15, i16);
        }
    }
}
