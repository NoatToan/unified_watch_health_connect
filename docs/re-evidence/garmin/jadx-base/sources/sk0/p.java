package sk0;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n3;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ew1.z1;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o72.h3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.AddGearScreenKt$AddGearScreenImpl$7$1$1", f = "AddGearScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<jk0.x, Unit> f159794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1 f159795b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super jk0.x, Unit> lVar, q1 q1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f159794a = lVar;
            this.f159795b = q1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f159794a, this.f159795b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f159794a.invoke(((q1.e) this.f159795b).f159822a);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f159797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f159798c;

        static {
            int[] iArr = new int[gg1.o0.values().length];
            try {
                iArr[gg1.o0.STATUTE_US.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg1.o0.STATUTE_UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg1.o0.METRIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f159796a = iArr;
            int[] iArr2 = new int[c80.w.values().length];
            try {
                iArr2[c80.w.Distance.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c80.w.Duration.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[c80.w.Date.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[c80.w.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f159797b = iArr2;
            int[] iArr3 = new int[c80.u.values().length];
            try {
                iArr3[c80.u.f25597f.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[c80.u.f25599h.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[c80.u.f25600i.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[c80.u.f25598g.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[c80.u.f25604m.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[c80.u.f25608q.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[c80.u.f25605n.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[c80.u.f25603l.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[c80.u.f25601j.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[c80.u.f25602k.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[c80.u.f25606o.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[c80.u.f25607p.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[c80.u.f25609r.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[c80.u.f25610t.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            f159798c = iArr3;
        }
    }

    public static final void a(c80.u uVar, r rVar, bv.d dVar, e23.l lVar, e23.p pVar, e23.l lVar2, e23.q qVar, e23.q qVar2, e23.l lVar3, GearActivity.w wVar, p3.m mVar, int i14) {
        c80.w wVar2;
        uVar.getClass();
        rVar.getClass();
        dVar.getClass();
        lVar.getClass();
        pVar.getClass();
        lVar2.getClass();
        qVar.getClass();
        lVar3.getClass();
        p3.o0 o0VarE = mVar.E(1756878998);
        int i15 = i14 | (o0VarE.k(uVar.ordinal()) ? 4 : 2) | (o0VarE.r(rVar) ? 32 : 16) | (o0VarE.r(dVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(qVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(qVar2) ? 8388608 : 4194304) | (o0VarE.r(lVar3) ? 67108864 : 33554432) | (o0VarE.r(wVar) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                b63.o oVarD = g22.l.d(b63.o.INSTANCE);
                switch (b.f159798c[uVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        wVar2 = c80.w.Distance;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        wVar2 = c80.w.None;
                        break;
                    default:
                        lc.u0.r();
                        return;
                }
                objQ = new n0(uVar, null, null, null, oVarD, wVar2, h(uVar, dVar.g()), null, i(), j53.l.b(), false, null, j53.l.b());
                o0VarE.K(objQ);
            }
            n0 n0Var = (n0) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_gear_add);
            gg1.o0 o0VarG = dVar.g();
            boolean zR = o0VarE.r(rVar) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new o(rVar, context, 1);
                o0VarE.K(objQ2);
            }
            e23.p pVar2 = (e23.p) objQ2;
            int i16 = i15 << 9;
            b(strQ, n0Var, rVar, o0VarG, true, null, null, pVar, lVar2, qVar, qVar2, lVar3, lVar, pVar2, wVar, o0VarE, ((i15 << 3) & 896) | 24576 | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), ((i15 >> 3) & 896) | ((i15 >> 21) & 126) | ((i15 >> 15) & 57344), 96);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.j(uVar, rVar, dVar, lVar, pVar, lVar2, qVar, qVar2, lVar3, wVar, i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x01a7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final n0 n0Var, g1 g1Var, final gg1.o0 o0Var, final boolean z14, String str2, Set<String> set, final e23.p<? super List<? extends am.x0>, ? super qk0.c, Unit> pVar, final e23.l<? super e23.l<? super qk0.d, Unit>, Unit> lVar, final e23.q<? super c80.u, ? super String, ? super String, Unit> qVar, final e23.q<? super c80.u, ? super String, ? super String, Unit> qVar2, final e23.l<? super e23.l<? super pk0.f, Unit>, Unit> lVar2, e23.l<? super jk0.x, Unit> lVar3, e23.p<? super n0, ? super List<qk0.h>, Unit> pVar2, final e23.a<Unit> aVar, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        Set<String> set2;
        int i18;
        final g1 g1Var2;
        e23.l<? super jk0.x, Unit> lVar4;
        e23.p<? super n0, ? super List<qk0.h>, Unit> pVar3;
        p3.o0 o0Var2;
        String str3;
        final Set<String> set3;
        int i19;
        Set<String> set4;
        int i24;
        boolean z15;
        p3.o0 o0VarE = mVar.E(40714857);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.r(n0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= (i14 & 512) == 0 ? o0VarE.B(g1Var) : o0VarE.r(g1Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.k(o0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        int i25 = i16 & 32;
        if (i25 != 0) {
            i17 |= 196608;
        } else if ((i14 & 196608) == 0) {
            i17 |= o0VarE.B(str2) ? 131072 : 65536;
        }
        int i26 = i16 & 64;
        if (i26 != 0) {
            i17 |= 1572864;
            set2 = set;
        } else {
            set2 = set;
            if ((i14 & 1572864) == 0) {
                i17 |= o0VarE.r(set2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        if ((i14 & 12582912) == 0) {
            i17 |= o0VarE.r(pVar) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i17 |= o0VarE.r(lVar) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= o0VarE.r(qVar) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i18 = i15 | (o0VarE.r(qVar2) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.r(lVar2) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.r(lVar3) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.r(pVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i18 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        int i27 = i18;
        boolean z16 = true;
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (i27 & 9363) == 9362) ? false : true)) {
            str3 = i25 != 0 ? null : str2;
            if (i26 != 0) {
                int i28 = i17;
                set4 = p13.l0.f134950a;
                i19 = i28;
            } else {
                i19 = i17;
                set4 = set2;
            }
            x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarC = p3.p0.c(g1Var.getUiState(), o0VarE, 0);
            Object[] objArr = new Object[0];
            boolean zR = o0VarE.r(n0Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new sg0.w0(n0Var, 5);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sg0.w0(n0Var, 5);
                    o0VarE.K(objQ);
                }
            }
            p3.p1 p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new sd.o(20);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new sd.o(21);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48);
            boolean zB = o0VarE.B(p1Var) | o0VarE.B(p1Var2);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new am.c1(p1Var, p1Var2, 28);
                o0VarE.K(objQ4);
            }
            lVar.invoke((e23.l) objQ4);
            boolean zB2 = o0VarE.B(p1Var) | o0VarE.B(p1Var3);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new am.c1(p1Var, p1Var3, 29);
                o0VarE.K(objQ5);
            }
            lVar2.invoke((e23.l) objQ5);
            Object[] objArr4 = new Object[0];
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new sd.o(22);
                o0VarE.K(objQ6);
            }
            p3.p1 p1Var4 = (p3.p1) d4.a.e(objArr4, (e23.a) objQ6, o0VarE, 48);
            Object[] objArr5 = new Object[0];
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new sd.o(23);
                o0VarE.K(objQ7);
            }
            p3.p1 p1Var5 = (p3.p1) d4.a.e(objArr5, (e23.a) objQ7, o0VarE, 48);
            boolean z17 = ((q) p1VarC.getF182175a()).f159809a;
            c2.n0 n0Var2 = n3.f22788a;
            c2.n0 n0Var3 = new c2.n0(0, 0, 0, 0);
            dd1.d dVar = new dd1.d(str, aVar, p1Var, p1Var3, p1Var4, p1Var5, pVar2, p1Var2, 23);
            pVar3 = pVar2;
            z3.e eVarC = z3.f.c(1507250030, dVar, o0VarE);
            ci0.g gVar = new ci0.g(p1Var, g1Var, qVar2, qVar, p1Var3, o0Var, str3, set4, pVar, z14);
            g1Var2 = g1Var;
            z02.d.a(z17, eVarC, null, null, n0Var3, z3.f.c(-995254926, gVar, o0VarE), o0VarE, 196656, 12);
            o0Var2 = o0VarE;
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0Var2.C(1780590948);
                boolean zB3 = o0Var2.B(p1Var4);
                Object objQ8 = o0Var2.q();
                if (zB3 || objQ8 == c2565a) {
                    objQ8 = new sg0.l(p1Var4, 9);
                    o0Var2.K(objQ8);
                }
                uk0.h.f((e23.a) objQ8, o0Var2, 0);
                o0Var2.g0(false);
            } else {
                o0Var2.C(1780672633);
                o0Var2.g0(false);
            }
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0Var2.C(1780706020);
                boolean zB4 = o0Var2.B(p1Var5);
                Object objQ9 = o0Var2.q();
                if (zB4 || objQ9 == c2565a) {
                    objQ9 = new sg0.l(p1Var5, 8);
                    o0Var2.K(objQ9);
                }
                uk0.h.e((e23.a) objQ9, o0Var2, 0);
                o0Var2.g0(false);
            } else {
                o0Var2.C(1780787705);
                o0Var2.g0(false);
            }
            q1 q1Var = ((q) p1VarC.getF182175a()).f159810b;
            if (q1Var == null) {
                o0Var2.C(1780869730);
                o0Var2.g0(false);
                lVar4 = lVar3;
            } else {
                o0Var2.C(1780869731);
                if (q1Var instanceof q1.e) {
                    o0Var2.C(-1366257685);
                    boolean zR2 = ((i27 & 896) == 256) | o0Var2.r(q1Var);
                    Object objQ10 = o0Var2.q();
                    if (zR2 || objQ10 == c2565a) {
                        lVar4 = lVar3;
                        objQ10 = new a(lVar4, q1Var, null);
                        o0Var2.K(objQ10);
                    } else {
                        lVar4 = lVar3;
                    }
                    p3.l0.e((e23.p) objQ10, q1Var, o0Var2);
                    o0Var2.g0(false);
                } else {
                    lVar4 = lVar3;
                    if (q1Var.equals(q1.b.f159819a)) {
                        o0Var2.C(-1366072987);
                        boolean zB5 = ((i27 & 7168) == 2048) | o0Var2.B(p1Var) | o0Var2.B(p1Var2);
                        Object objQ11 = o0Var2.q();
                        if (zB5 || objQ11 == c2565a) {
                            objQ11 = new z1(pVar3, p1Var, p1Var2, 4);
                            o0Var2.K(objQ11);
                        }
                        e23.a aVar3 = (e23.a) objQ11;
                        int i29 = i19;
                        if ((i29 & 896) != 256 && ((i29 & 512) == 0 || !o0Var2.r(g1Var2))) {
                            z16 = false;
                        }
                        Object objQ12 = o0Var2.q();
                        if (z16 || objQ12 == c2565a) {
                            objQ12 = new sg0.w0(g1Var2, 4);
                            o0Var2.K(objQ12);
                        }
                        uk0.h.d(aVar3, (e23.a) objQ12, o0Var2, 0);
                        o0Var2.g0(false);
                    } else if (q1Var instanceof q1.a) {
                        o0Var2.C(-1365709140);
                        l72.c1 c1Var = l72.c1.f110940a;
                        String strQ = gl1.y.Q(o0Var2, R.string.unable_save_all_info);
                        String strQ2 = gl1.y.Q(o0Var2, R.string.gear_created_unable_to_add_past_activities);
                        String strQ3 = gl1.y.Q(o0Var2, R.string.lbl_try_again);
                        if ((i24 & 896) == 256 || ((i24 & 512) != 0 && o0Var2.r(g1Var2))) {
                            i24 = i19;
                            i24 = i19;
                            z15 = true;
                        } else {
                            i24 = i19;
                            i24 = i19;
                            z15 = false;
                        }
                        boolean zR3 = z15 | o0Var2.r(q1Var);
                        Object objQ13 = o0Var2.q();
                        if (zR3 || objQ13 == c2565a) {
                            objQ13 = new s70.j1(10, g1Var2, q1Var);
                            o0Var2.K(objQ13);
                        }
                        e23.a<Unit> aVar4 = (e23.a) objQ13;
                        String strQ4 = gl1.y.Q(o0Var2, R.string.lbl_ok);
                        boolean zR4 = ((i27 & 896) == 256) | o0Var2.r(q1Var);
                        Object objQ14 = o0Var2.q();
                        if (zR4 || objQ14 == c2565a) {
                            objQ14 = new s70.j1(11, lVar4, q1Var);
                            o0Var2.K(objQ14);
                        }
                        c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar4, strQ4, (e23.a) objQ14, o0Var2, 0, 0, 217);
                        o0Var2 = o0Var2;
                        o0Var2.g0(false);
                    } else if (q1Var instanceof q1.d) {
                        i24 = i19;
                        o0Var2.C(-1365027791);
                        g(z14, ((q1.d) q1Var).f159821a, lVar4, o0Var2, ((i24 >> 12) & 14) | (i27 & 896));
                        o0Var2.g0(false);
                    } else {
                        if (!(q1Var instanceof q1.c)) {
                            i24 = i19;
                            throw kg.f.h(o0Var2, -459715037, false);
                        }
                        i24 = i19;
                        o0Var2.C(-1364750031);
                        g(z14, ((q1.c) q1Var).f159820a, lVar4, o0Var2, ((i24 >> 12) & 14) | (i27 & 896));
                        o0Var2.g0(false);
                    }
                }
                Unit unit = Unit.INSTANCE;
                o0Var2.g0(false);
            }
            set3 = set4;
        } else {
            g1Var2 = g1Var;
            lVar4 = lVar3;
            pVar3 = pVar2;
            o0Var2 = o0VarE;
            o0Var2.e();
            str3 = str2;
            set3 = set2;
        }
        p2 p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            final e23.p<? super n0, ? super List<qk0.h>, Unit> pVar4 = pVar3;
            final e23.l<? super jk0.x, Unit> lVar5 = lVar4;
            final String str4 = str3;
            p2VarI0.f135219d = new e23.p() { // from class: sk0.j
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    p.b(str, n0Var, g1Var2, o0Var, z14, str4, set3, pVar, lVar, qVar, qVar2, lVar2, lVar5, pVar4, aVar, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(jk0.x xVar, r rVar, bv.d dVar, e23.l lVar, e23.p pVar, e23.l lVar2, e23.q qVar, e23.q qVar2, e23.l lVar3, GearActivity.w wVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        String str;
        i53.c cVarB;
        xVar.getClass();
        rVar.getClass();
        dVar.getClass();
        lVar.getClass();
        pVar.getClass();
        lVar2.getClass();
        qVar.getClass();
        lVar3.getClass();
        p3.o0 o0VarE = mVar.E(1516612823);
        int i15 = i14 | (o0VarE.r(xVar) ? 4 : 2) | (o0VarE.r(rVar) ? 32 : 16) | (o0VarE.r(dVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(qVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(qVar2) ? 8388608 : 4194304) | (o0VarE.r(lVar3) ? 67108864 : 33554432) | (o0VarE.r(wVar) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                c80.u uVar = xVar.f99351a;
                String str2 = xVar.f99359i;
                String str3 = xVar.f99360j;
                String str4 = xVar.f99358h;
                b63.o.Companion companion = b63.o.INSTANCE;
                b63.o oVarD = g22.l.d(companion);
                c80.w wVar2 = xVar.f99353c;
                Double d14 = xVar.f99364n;
                Long l14 = xVar.f99365o;
                b63.o oVarI = xVar.f99363m;
                if (oVarI == null) {
                    oVarI = null;
                } else if (oVarI.compareTo(g22.l.d(companion)) < 0) {
                    oVarI = i();
                }
                b63.o oVar = oVarI;
                String str5 = xVar.f99361k;
                List<jk0.g> list = xVar.f99354d;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        String str6 = str5;
                        am.x0 x0Var = (am.x0) ((jk0.g) it.next()).f99251d.getValue();
                        if (x0Var != null) {
                            arrayList.add(x0Var);
                        }
                        str5 = str6;
                    }
                    str = str5;
                    uk0.i.f171830a.getClass();
                    cVarB = i53.a.e(uk0.i.i(context, arrayList));
                    if (cVarB == null) {
                    }
                    objQ = new n0(uVar, str2, str3, str4, oVarD, wVar2, d14, l14, oVar, cVarB, false, str, j53.l.b());
                    o0VarE.K(objQ);
                } else {
                    str = str5;
                }
                cVarB = j53.l.b();
                objQ = new n0(uVar, str2, str3, str4, oVarD, wVar2, d14, l14, oVar, cVarB, false, str, j53.l.b());
                o0VarE.K(objQ);
            }
            n0 n0Var = (n0) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_gear_add);
            gg1.o0 o0VarG = dVar.g();
            boolean zR = o0VarE.r(rVar) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == p3.m.a.f135155b) {
                objQ2 = new o(rVar, context, 0);
                o0VarE.K(objQ2);
            }
            int i16 = i15 << 9;
            o0Var = o0VarE;
            b(strQ, n0Var, rVar, o0VarG, true, null, null, pVar, lVar2, qVar, qVar2, lVar3, lVar, (e23.p) objQ2, wVar, o0Var, ((i15 << 3) & 896) | 24576 | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), ((i15 >> 21) & 126) | ((i15 >> 3) & 896) | ((i15 >> 15) & 57344), 96);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.j(xVar, rVar, dVar, lVar, pVar, lVar2, qVar, qVar2, lVar3, wVar, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0175 A[LOOP:1: B:74:0x016f->B:76:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
    public static final void d(jk0.x xVar, q0 q0Var, bv.d dVar, e23.p pVar, e23.l lVar, e23.q qVar, e23.q qVar2, e23.l lVar2, e23.l lVar3, GearActivity.w wVar, p3.m mVar, int i14) {
        String str;
        i53.c cVarB;
        List<jk0.n> list;
        String str2;
        i53.c cVarB2;
        ArrayList arrayList;
        Iterator it;
        xVar.getClass();
        q0Var.getClass();
        dVar.getClass();
        pVar.getClass();
        lVar.getClass();
        qVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        p3.o0 o0VarE = mVar.E(-870143019);
        int i15 = i14 | (o0VarE.r(xVar) ? 4 : 2) | (o0VarE.r(q0Var) ? 32 : 16) | (o0VarE.r(dVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(qVar) ? 131072 : 65536) | (o0VarE.r(qVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar2) ? 8388608 : 4194304) | (o0VarE.r(lVar3) ? 67108864 : 33554432) | (o0VarE.r(wVar) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (i15 & 306783379) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                c80.u uVar = xVar.f99351a;
                String str3 = xVar.f99359i;
                String str4 = xVar.f99360j;
                String str5 = xVar.f99358h;
                b63.o oVar = xVar.f99352b;
                c80.w wVar2 = xVar.f99353c;
                Double d14 = xVar.f99364n;
                Long l14 = xVar.f99365o;
                b63.o oVar2 = xVar.f99363m;
                String str6 = xVar.f99361k;
                List<jk0.g> list2 = xVar.f99354d;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        String str7 = str5;
                        am.x0 x0Var = (am.x0) ((jk0.g) it3.next()).f99251d.getValue();
                        if (x0Var != null) {
                            arrayList2.add(x0Var);
                        }
                        str5 = str7;
                    }
                    str = str5;
                    uk0.i.f171830a.getClass();
                    cVarB = i53.a.e(uk0.i.i(context, arrayList2));
                    if (cVarB == null) {
                    }
                    i53.c cVar = cVarB;
                    list = xVar.f99371w;
                    if (list != null) {
                        str2 = str3;
                        arrayList = new ArrayList(p13.y.r(list, 10));
                        for (it = list.iterator(); it.hasNext(); it = it) {
                            jk0.n nVar = (jk0.n) it.next();
                            arrayList.add(new y22.x(Uri.parse(nVar.f99297c), nVar.f99295a, false, 4, (p005kotlin.jvm.internal.j) null));
                        }
                        cVarB2 = i53.a.e(arrayList);
                        if (cVarB2 == null) {
                        }
                        objQ = new n0(uVar, str2, str4, str, oVar, wVar2, d14, l14, oVar2, cVar, false, str6, cVarB2);
                        o0VarE.K(objQ);
                    } else {
                        str2 = str3;
                    }
                    cVarB2 = j53.l.b();
                    objQ = new n0(uVar, str2, str4, str, oVar, wVar2, d14, l14, oVar2, cVar, false, str6, cVarB2);
                    o0VarE.K(objQ);
                } else {
                    str = str5;
                }
                cVarB = j53.l.b();
                i53.c cVar2 = cVarB;
                list = xVar.f99371w;
                if (list != null) {
                    str2 = str3;
                    arrayList = new ArrayList(p13.y.r(list, 10));
                    while (it.hasNext()) {
                        jk0.n nVar2 = (jk0.n) it.next();
                        arrayList.add(new y22.x(Uri.parse(nVar2.f99297c), nVar2.f99295a, false, 4, (p005kotlin.jvm.internal.j) null));
                    }
                    cVarB2 = i53.a.e(arrayList);
                    if (cVarB2 == null) {
                    }
                    objQ = new n0(uVar, str2, str4, str, oVar, wVar2, d14, l14, oVar2, cVar2, false, str6, cVarB2);
                    o0VarE.K(objQ);
                } else {
                    str2 = str3;
                }
                cVarB2 = j53.l.b();
                objQ = new n0(uVar, str2, str4, str, oVar, wVar2, d14, l14, oVar2, cVar2, false, str6, cVarB2);
                o0VarE.K(objQ);
            }
            n0 n0Var = (n0) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.edit_gear_title);
            gg1.o0 o0VarG = dVar.g();
            String str8 = xVar.f99356f;
            Iterable iterable = xVar.f99373y;
            if (iterable == null) {
                iterable = p13.j0.f134944a;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = iterable.iterator();
            while (it4.hasNext()) {
                String str9 = str8;
                String str10 = ((jk0.k) it4.next()).f99274c;
                if (str10 != null) {
                    arrayList3.add(str10);
                }
                str8 = str9;
            }
            String str11 = str8;
            Set setG1 = p13.h0.g1(arrayList3);
            boolean zR = o0VarE.r(n0Var) | ((i15 & 1879048192) == 536870912) | o0VarE.r(q0Var) | o0VarE.r(context) | o0VarE.r(xVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == p3.m.a.f135155b) {
                sg2.g gVar = new sg2.g(n0Var, wVar, q0Var, context, xVar, 4);
                o0VarE.K(gVar);
                objQ2 = gVar;
            }
            int i16 = i15 << 12;
            b(strQ, n0Var, q0Var, o0VarG, false, str11, setG1, pVar, lVar, qVar, qVar2, lVar2, lVar3, (e23.p) objQ2, wVar, o0VarE, ((i15 << 3) & 896) | 24576 | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), ((i15 >> 18) & 1022) | ((i15 >> 15) & 57344), 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.j(xVar, q0Var, dVar, pVar, lVar, qVar, qVar2, lVar2, lVar3, wVar, i14);
        }
    }

    public static final void e(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(2062697089);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.c cVar = j92.b.f97901d;
            h4.r rVarQ = x2.q(aVar, cVar.f97904c);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarQ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            t4.d dVarA = n5.c.a(R.drawable.ic_exclamation, o0VarE, 0);
            bVar.getClass();
            i7.a(dVarA, null, u1.n.e(l4.k.b(x2.q(aVar, cVar.f97903b), k2.i.f102406a), d92.b.a(o0VarE).f().f(), o4.m1.f128891a), d92.b.a(o0VarE).f().f63508c, o0VarE, 48, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new si1.a(i14, 10);
        }
    }

    public static final void f(String str, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1187432904);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(aVar, f14, eVar.f97917b);
            String strP = gl1.y.P(R.string.max_use_threshold_less_than_value, new Object[]{str}, o0VarE);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h3(str, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    public static final void g(boolean z14, final jk0.x xVar, final e23.l<? super jk0.x, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1724718169);
        final int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(xVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        final int i17 = 1;
        final int i18 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                o0VarE.C(385375584);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.unable_save_all_info);
                String strQ2 = gl1.y.Q(o0VarE, R.string.gear_created_but_some_failed);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                int i19 = i15 & 896;
                boolean zR = (i19 == 256) | o0VarE.r(xVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new e23.a() { // from class: sk0.k
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    lVar.invoke(xVar);
                                    break;
                                case 1:
                                    lVar.invoke(xVar);
                                    break;
                                default:
                                    lVar.invoke(xVar);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e23.a() { // from class: sk0.k
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        lVar.invoke(xVar);
                                        break;
                                    case 1:
                                        lVar.invoke(xVar);
                                        break;
                                    default:
                                        lVar.invoke(xVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    }
                }
                e23.a<Unit> aVar2 = (e23.a) objQ;
                boolean zR2 = (i19 == 256) | o0VarE.r(xVar);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new e23.a() { // from class: sk0.k
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    lVar.invoke(xVar);
                                    break;
                                case 1:
                                    lVar.invoke(xVar);
                                    break;
                                default:
                                    lVar.invoke(xVar);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e23.a() { // from class: sk0.k
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        lVar.invoke(xVar);
                                        break;
                                    case 1:
                                        lVar.invoke(xVar);
                                        break;
                                    default:
                                        lVar.invoke(xVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar2, null, (e23.a) objQ2, o0VarE, 0, 0, 729);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(385793960);
                int i24 = (o0Var.r(xVar) ? 1 : 0) | ((i15 & 896) != 256 ? 0 : 1);
                Object objQ3 = o0Var.q();
                if (i24 == 0) {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new e23.a() { // from class: sk0.k
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        lVar.invoke(xVar);
                                        break;
                                    case 1:
                                        lVar.invoke(xVar);
                                        break;
                                    default:
                                        lVar.invoke(xVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var.K(objQ3);
                    }
                } else {
                    objQ3 = new e23.a() { // from class: sk0.k
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    lVar.invoke(xVar);
                                    break;
                                case 1:
                                    lVar.invoke(xVar);
                                    break;
                                default:
                                    lVar.invoke(xVar);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var.K(objQ3);
                }
                uk0.h.c((e23.a) objQ3, o0Var, 0);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(z14, xVar, lVar, i14, 22);
        }
    }

    public static final Double h(c80.u uVar, gg1.o0 o0Var) {
        double d14;
        int i14 = b.f159796a[o0Var.ordinal()];
        if (i14 == 1 || i14 == 2) {
            l3.f23124b.getClass();
            d14 = 643737.6d;
        } else {
            if (i14 != 3) {
                lc.u0.r();
                return null;
            }
            l3.f23124b.getClass();
            d14 = 650000.0d;
        }
        switch (b.f159798c[uVar.ordinal()]) {
            case 1:
            case 3:
                return Double.valueOf(d14);
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return null;
            default:
                lc.u0.r();
                return null;
        }
    }

    public static final b63.o i() {
        return b63.p.c(g22.l.d(b63.o.INSTANCE), new b63.d(0, 0, 1, 3, null));
    }

    public static final int j(c80.w wVar) {
        int i14 = b.f159797b[wVar.ordinal()];
        if (i14 == 1) {
            return R.string.lbl_distance;
        }
        if (i14 == 2) {
            return R.string.common_hours;
        }
        if (i14 == 3) {
            return R.string.txt_date;
        }
        if (i14 == 4) {
            return R.string.lbl_none;
        }
        lc.u0.r();
        return 0;
    }
}
