package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import a11.b0;
import android.content.Context;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import b21.a5;
import b21.v4;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import cw1.c0;
import e23.p;
import g02.q0;
import gl1.y;
import i3.ef;
import i3.ff;
import i3.hf;
import i3.mh;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import mg2.o;
import mt0.s1;
import nw0.x;
import o13.t;
import o4.m1;
import o62.e0;
import o62.f0;
import o62.g0;
import o62.h0;
import o62.i0;
import o62.k0;
import o62.l0;
import o62.m0;
import o62.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p13.u;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p62.r;
import s5.x0;
import u1.a2;
import u1.w;
import w52.y1;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements p<com.garmin.android.apps.connectmobile.workouts.data.model.a, File, Unit> {
        public a(Object obj) {
            super(2, obj, j.class, "updateAudioNote", "updateAudioNote(Lcom/garmin/android/apps/connectmobile/workouts/data/model/AudioNoteDTO;Ljava/io/File;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, File file) {
            j jVar = (j) this.receiver;
            jVar.getClass();
            ge1.b.T(v1.a(jVar), null, null, new l(jVar, file, aVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements e23.q<String, String, e23.a<? extends Unit>, Unit> {
        public b(Object obj) {
            super(3, obj, j.class, "downloadAudioNote", "downloadAudioNote(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // e23.q
        public final Unit invoke(String str, String str2, e23.a<? extends Unit> aVar) {
            String str3 = str;
            String str4 = str2;
            e23.a<? extends Unit> aVar2 = aVar;
            str3.getClass();
            str4.getClass();
            aVar2.getClass();
            j jVar = (j) this.receiver;
            jVar.getClass();
            ge1.b.T(v1.a(jVar), null, null, new k(jVar, str3, str4, aVar2, null), 3);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f49695b;

        static {
            int[] iArr = new int[m52.k.values().length];
            try {
                iArr[m52.k.f116759t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.k.f116760v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m52.k.f116762x.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m52.k.f116763y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m52.k.f116761w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m52.k.f116758r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m52.k.f116755o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m52.k.f116754n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m52.k.B.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m52.k.f116757q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f49694a = iArr;
            int[] iArr2 = new int[x52.f.values().length];
            try {
                iArr2[x52.f.f189088q.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[x52.f.f189082k.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f49695b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public static final void A(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(564300010);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            j0 j0Var = iVar.f49697b;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, 9);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, 9);
                    o0VarE.K(objQ);
                }
            }
            D(j0Var, (e23.l) objQ, o0VarE, j0.R0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    public static final void B(m52.k kVar, j0 j0Var, e23.l<? super x52.f, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-471501006);
        int i15 = (i14 & 6) == 0 ? (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            x52.f[] fVarArrB = u0.b();
            o0VarE.C(-2140892610);
            ArrayList arrayList = new ArrayList(fVarArrB.length);
            for (x52.f fVar : fVarArrB) {
                arrayList.add(new o13.p(y.Q(o0VarE, fVar.f189097b), Integer.valueOf(fVar.f189096a)));
            }
            o0VarE.g0(false);
            x52.f.f189078g.getClass();
            int iM = u.M(fVarArrB, x52.f.a.b(j0Var, kVar));
            String strQ = y.Q(o0VarE, R.string.workout_intensity_target_type);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new na0.l(lVar, 12);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 12);
                    o0VarE.K(objQ);
                }
            }
            y52.d.a(arrayList, iM, strQ, false, null, (e23.l) objQ, null, y.Q(o0VarE, R.string.workout_no_target), false, o0VarE, 3072, 336);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(kVar, j0Var, lVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public static final void C(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2089142169);
        int i15 = 2;
        int i16 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.k kVar = iVar.f49696a;
            j0 j0Var = iVar.f49697b;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, i15);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, i15);
                    o0VarE.K(objQ);
                }
            }
            B(kVar, j0Var, (e23.l) objQ, o0VarE, j0.R0 << 3);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(iVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    public static final void D(j0 j0Var, e23.l<? super Double, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(-1921398439);
        int i16 = 4;
        int i17 = ((i14 & 8) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strD = u0.d(context, j0Var.J0);
            boolean zR = o0VarE.r(context) | ((i17 & 14) == 4 || ((i17 & 8) != 0 && o0VarE.r(j0Var))) | ((i17 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new nw0.p(context, i16, j0Var, lVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new nw0.p(context, i16, j0Var, lVar);
                    o0VarE.K(objQ);
                }
            }
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.lbl_pack_weight);
            o0Var = o0VarE;
            i15 = 0;
            p2Var.h(strQ, strD, null, null, null, true, false, null, null, null, (e23.a) objQ, o0Var, 196608, 0, 988);
        } else {
            o0Var = o0VarE;
            i15 = 0;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i0(j0Var, lVar, i14, i15);
        }
    }

    public static final void E(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(102996028);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            int i16 = (i15 & 14) | 432;
            J(iVar, z3.f.c(-118532670, new f0(iVar, 23), o0VarE), z3.f.c(460233475, new f0(iVar, 24), o0VarE), o0VarE, i16);
            J(iVar, z3.f.c(884821675, new f0(iVar, 25), o0VarE), z3.f.c(-1266661460, new f0(iVar, 26), o0VarE), o0VarE, i16);
            J(iVar, z3.f.c(133272522, new f0(iVar, 28), o0VarE), z3.f.c(-2018210613, new f0(iVar, 29), o0VarE), o0VarE, i16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    public static final void F(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1374571513);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.workout_secondary_target);
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new l0(iVar, 5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new l0(iVar, 5);
                    o0VarE.K(objQ);
                }
            }
            K(strQ, (e23.a) objQ, o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    public static final void G(m52.k kVar, j0 j0Var, e23.l<? super x52.f, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1396524277);
        int i15 = (i14 & 6) == 0 ? (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            x52.f.f189078g.getClass();
            x52.f[] fVarArrA = u0.a(x52.f.a.b(j0Var, kVar).a(), j0Var.f48227l);
            o0VarE.C(2030052001);
            ArrayList arrayList = new ArrayList(fVarArrA.length);
            for (x52.f fVar : fVarArrA) {
                arrayList.add(new o13.p(y.Q(o0VarE, fVar.f189097b), Integer.valueOf(fVar.f189096a)));
            }
            o0VarE.g0(false);
            x52.f.f189078g.getClass();
            int iM = u.M(fVarArrA, x52.f.a.a(j0Var, kVar));
            String strQ = y.Q(o0VarE, R.string.workout_intensity_target);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new na0.l(lVar, 5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 5);
                    o0VarE.K(objQ);
                }
            }
            y52.d.a(arrayList, iM, strQ, false, null, (e23.l) objQ, null, y.Q(o0VarE, R.string.workout_no_target), j0Var.f48232q == m52.g.NONE, o0VarE, 3072, 80);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(kVar, j0Var, lVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public static final void H(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-203198358);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.k kVar = iVar.f49699d.f49701a;
            j0 j0Var = iVar.f49697b;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, 12);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, 12);
                    o0VarE.K(objQ);
                }
            }
            G(kVar, j0Var, (e23.l) objQ, o0VarE, j0.R0 << 3);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    public static final void I(i iVar, m mVar, int i14) {
        m52.k kVar = iVar.f49696a;
        j0 j0Var = iVar.f49697b;
        o0 o0VarE = mVar.E(1601947531);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            x52.f.f189078g.getClass();
            x52.f fVarA = x52.f.a.a(j0Var, kVar);
            boolean zK = o0VarE.k(fVarA.ordinal());
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zK) {
                objQ = iVar.f49699d.D4(fVarA);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = iVar.f49699d.D4(fVarA);
                    o0VarE.K(objQ);
                }
            }
            r rVar = (r) objQ;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
            boolean zR = o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new e0(iVar, 14);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e0(iVar, 14);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar = (e23.l) objQ2;
            boolean zR2 = o0VarE.r(iVar);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new l0(iVar, 2);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new l0(iVar, 2);
                    o0VarE.K(objQ3);
                }
            }
            e23.a aVar2 = (e23.a) objQ3;
            boolean zR3 = o0VarE.r(iVar);
            Object objQ4 = o0VarE.q();
            if (zR3) {
                objQ4 = new l0(iVar, 3);
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new l0(iVar, 3);
                    o0VarE.K(objQ4);
                }
            }
            j(kVar, j0Var, bVar, fVarA, rVar, lVar, aVar2, (e23.a) objQ4, o0VarE, j0.R0 << 3);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 27);
        }
    }

    public static final void J(i iVar, z3.e eVar, z3.e eVar2, m mVar, int i14) {
        o0 o0VarE = mVar.E(1778341219);
        if (o0VarE.n(i14 & 1, (i14 & 145) != 144)) {
            x1 x1Var = n.f135158a;
            eVar.invoke(o0VarE, 6);
            eVar2.invoke(o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(iVar, eVar, eVar2, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01a1  */
    public static final void K(String str, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        e23.a<Unit> aVar2;
        int i16;
        e23.a<Unit> aVar3;
        e23.a<Unit> aVar4;
        e23.a<Unit> aVar5;
        o0 o0VarE = mVar.E(-105099896);
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i16 = i17 | (o0VarE.r(aVar2) ? 32 : 16);
        }
        int i19 = i16;
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            if (i18 != 0) {
                aVar2 = null;
            }
            x1 x1Var = n.f135158a;
            h4.r.a aVar6 = h4.r.S;
            h4.r rVarF = x2.f(aVar6, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            float f14 = eVar.f97921f;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarA, 0.0f, f14, 0.0f, eVar.f97917b, 5);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar7 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97934k;
            e23.a<Unit> aVar8 = aVar2;
            mh.c(upperCase, u2Var.a(aVar6, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            if (aVar8 != null) {
                o0VarE.C(-142920528);
                String strQ = y.Q(o0VarE, R.string.lbl_help);
                fVar.getClass();
                x0 x0VarA = x0.a(x0Var, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(aVar6, eVar.f97919d, 0.0f, 0.0f, 0.0f, 14);
                boolean z14 = (i19 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z14) {
                    aVar5 = aVar8;
                    objQ = new x(aVar5, 5);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        aVar5 = aVar8;
                        objQ = new x(aVar5, 5);
                        o0VarE.K(objQ);
                    } else {
                        aVar5 = aVar8;
                    }
                }
                aVar4 = aVar5;
                mh.c(strQ, w.d(rVarC3, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                aVar4 = aVar8;
                o0VarE = o0VarE;
                o0VarE.C(-142620386);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            aVar3 = aVar4;
        } else {
            o0VarE.e();
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.j(str, aVar3, i14, i15, 2);
        }
    }

    public static final void L(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1386131389);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            K(y.Q(o0VarE, R.string.workout_step_info), null, o0VarE, 0, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 26);
        }
    }

    public static final void M(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1748672936);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            K(y.Q(o0VarE, R.string.workout_step_settings), null, o0VarE, 0, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(iVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    public static final void N(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1590272550);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.k kVar = iVar.f49696a;
            m52.d dVar = iVar.f49697b.f48217c;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, i16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, i16);
                    o0VarE.K(objQ);
                }
            }
            O(kVar, dVar, bVar, (e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(iVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0196  */
    public static final void O(m52.k kVar, m52.d dVar, com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar, e23.l<? super m52.d, Unit> lVar, m mVar, int i14) {
        List<m52.d> listK;
        boolean z14;
        String strB;
        o0 o0VarE = mVar.E(1186071576);
        int i15 = i14 | (o0VarE.k(kVar.ordinal()) ? 4 : 2) | (o0VarE.k(dVar == null ? -1 : dVar.ordinal()) ? 32 : 16) | (o0VarE.B(bVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            m52.k kVar2 = m52.k.f116758r;
            boolean z15 = kVar == kVar2;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c cVar = bVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c ? (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) bVar : null;
            boolean z16 = cVar != null ? cVar.f49625a : false;
            m52.d dVar2 = m52.d.REST;
            boolean z17 = dVar == dVar2;
            if (kVar == kVar2) {
                listK = (z16 && z17) ? p13.j0.f134944a : z16 ? p13.x.k(m52.d.WARM_UP, m52.d.MAIN, m52.d.COOL_DOWN, m52.d.INTERVAL) : p13.x.k(m52.d.WARM_UP, m52.d.MAIN, m52.d.COOL_DOWN, dVar2, m52.d.INTERVAL);
            } else if (kVar == m52.k.f116754n) {
                listK = p13.x.k(m52.d.WARM_UP, m52.d.INTERVAL, m52.d.WALK, m52.d.RECOVERY, dVar2, m52.d.COOL_DOWN, m52.d.OTHER);
            } else {
                listK = kVar == m52.k.f116759t ? p13.x.k(m52.d.WARM_UP, m52.d.INTERVAL, dVar2, m52.d.COOL_DOWN, m52.d.OTHER) : p13.x.k(m52.d.WARM_UP, m52.d.INTERVAL, m52.d.RECOVERY, dVar2, m52.d.COOL_DOWN, m52.d.OTHER);
            }
            int iIndexOf = !listK.isEmpty() ? listK.indexOf(dVar) : 0;
            o0VarE.C(1648470082);
            ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
            for (m52.d dVar3 : listK) {
                x52.e.f189070c.getClass();
                arrayList.add(new o13.p(x52.e.a.a(dVar3).b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), kVar), Integer.valueOf(dVar3.f116694b)));
            }
            o0VarE.g0(false);
            if (z15 && z16 && z17) {
                o0VarE.C(-436824425);
                x52.e.a aVar = x52.e.f189070c;
                m52.d dVar4 = m52.d.REST;
                aVar.getClass();
                strB = x52.e.a.a(dVar4).b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), kVar);
                z14 = false;
                o0VarE.g0(false);
            } else {
                z14 = false;
                o0VarE.C(-436707400);
                o0VarE.g0(false);
                strB = "";
            }
            String strQ = y.Q(o0VarE, R.string.workout_step_type);
            boolean z18 = (i15 & 7168) == 2048 ? true : z14;
            Object objQ = o0VarE.q();
            if (z18) {
                objQ = new na0.l(lVar, 9);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 9);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar2 = (e23.l) objQ;
            if (z15 && z16 && z17) {
                z14 = true;
            }
            y52.d.a(arrayList, iIndexOf, strQ, false, null, lVar2, null, strB, z14, o0VarE, 3072, 80);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a((Object) kVar, (Object) dVar, (Object) bVar, (e23.l) lVar, i14, 10);
        }
    }

    public static final void P(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-363120740);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            int i16 = (i15 & 14) | 432;
            J(iVar, z3.f.c(1359424214, new m0(iVar, 6), o0VarE), z3.f.c(2121305525, new m0(iVar, 12), o0VarE), o0VarE, i16);
            J(iVar, z3.f.c(-1896329459, new f0(iVar, 6), o0VarE), z3.f.c(127170092, new f0(iVar, 7), o0VarE), o0VarE, i16);
            J(iVar, z3.f.c(575450574, new f0(iVar, 8), o0VarE), z3.f.c(-1696017171, new f0(iVar, 9), o0VarE), o0VarE, i16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(iVar, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    public static final void Q(qs.f fVar, e23.l<? super qs.f, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1534769462);
        int i15 = (o0VarE.k(fVar == null ? -1 : fVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            w13.c cVar = qs.f.f147067k;
            ArrayList<qs.f> arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                if (((qs.f) next).f147070c) {
                    arrayListK.add(next);
                }
            }
            o0VarE.C(1739677103);
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListK, 10));
            for (qs.f fVar2 : arrayListK) {
                arrayList.add(new o13.p(y.Q(o0VarE, fVar2.f147069b), Integer.valueOf(fVar2.f147068a)));
            }
            o0VarE.g0(false);
            int iIndexOf = arrayListK.indexOf(fVar == null ? qs.f.NONE : fVar);
            String strQ = y.Q(o0VarE, R.string.activity_details_swim_stroke_drill);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new na0.l(lVar, 14);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 14);
                    o0VarE.K(objQ);
                }
            }
            y52.d.a(arrayList, iIndexOf, strQ, false, null, (e23.l) objQ, null, "", false, o0VarE, 12585984, 336);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(fVar, lVar, i14, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void R(m52.e eVar, e23.l<? super m52.e, Unit> lVar, m mVar, int i14) {
        p1 p1Var;
        eVar = eVar;
        o0 o0VarE = mVar.E(1602655918);
        int i15 = i14 | (o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n((eVar == null || eVar == m52.e.NONE) ? false : true, o0VarE);
            }
            p1 p1Var2 = (p1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = y.Q(o0VarE, R.string.activity_details_equipment);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            h4.r rVarA = u2Var.a(aVar, 1.0f, true);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            mh.c(strQ, c2.l.y(rVarA, eVar2.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            ef efVarA = d92.c.a(ff.f88115a, o0VarE);
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11);
            int i16 = i15 & 112;
            boolean z14 = i16 == 32;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                p1Var = p1Var2;
                objQ2 = new b0(lVar, p1Var, 28);
                o0VarE.K(objQ2);
            } else {
                p1Var = p1Var2;
            }
            hf.a(zBooleanValue, (e23.l) objQ2, rVarC2, false, efVarA, o0VarE, 0, 88);
            o0VarE.g0(true);
            List<m52.e> listK = p13.x.k(m52.e.FINS, m52.e.KICKBOARD, m52.e.PADDLES, m52.e.PULL_BUOY, m52.e.SNORKEL);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(1866914325);
                o0VarE.C(-1740890451);
                ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
                for (m52.e eVar3 : listK) {
                    arrayList.add(new o13.p(u0.f(eVar3, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), Integer.valueOf(eVar3.f116703a)));
                }
                o0VarE.g0(false);
                int iIndexOf = listK.indexOf(eVar);
                String strQ2 = y.Q(o0VarE, R.string.workout_swim_equipment);
                boolean z15 = i16 == 32;
                Object objQ3 = o0VarE.q();
                if (z15 || objQ3 == m.a.f135155b) {
                    objQ3 = new na0.l(lVar, 8);
                    o0VarE.K(objQ3);
                }
                y52.d.a(arrayList, iIndexOf, strQ2, false, null, (e23.l) objQ3, null, y.Q(o0VarE, R.string.workout_select_equipment), false, o0VarE, 3072, 336);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1867436148);
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(eVar, lVar, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    public static final void S(m52.f fVar, e23.l<? super m52.f, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1456466634);
        int i15 = (o0VarE.k(fVar == null ? -1 : fVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            m52.f[] fVarArrValues = m52.f.values();
            ArrayList<m52.f> arrayList = new ArrayList();
            for (m52.f fVar2 : fVarArrValues) {
                if (fVar2.f116713c) {
                    arrayList.add(fVar2);
                }
            }
            int iIndexOf = arrayList.indexOf(fVar);
            o0VarE.C(-494894781);
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            for (m52.f fVar3 : arrayList) {
                arrayList2.add(new o13.p(y.Q(o0VarE, fVar3.f116712b), Integer.valueOf(fVar3.f116711a)));
            }
            o0VarE.g0(false);
            String strQ = y.Q(o0VarE, R.string.workout_swim_stroke);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new na0.l(lVar, 10);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 10);
                    o0VarE.K(objQ);
                }
            }
            y52.d.a(arrayList2, iIndexOf, strQ, false, null, (e23.l) objQ, null, "", false, o0VarE, 12585984, 336);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(fVar, lVar, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public static final void T(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1086287880);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            qs.f fVar = iVar.f49697b.f48226k0;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, 20);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, 20);
                    o0VarE.K(objQ);
                }
            }
            Q(fVar, (e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 8);
        }
    }

    public static final void U(i iVar, m mVar, int i14) {
        j0 j0Var = iVar.f49697b;
        o0 o0VarE = mVar.E(1698517784);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
            if (j0Var.f48227l == m52.a.f116656l && zf.b.D(((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) bVar).f49626b)) {
                o0VarE.C(1533769421);
                b(j0Var, bVar, o0VarE, j0.R0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1533828042);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    public static final void V(i iVar, m mVar, int i14) {
        j0 j0Var = iVar.f49697b;
        o0 o0VarE = mVar.E(-1871420566);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.a aVar = j0Var.f48227l;
            boolean zK = o0VarE.k(aVar == null ? -1 : aVar.ordinal());
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zK) {
                objQ = iVar.f49699d.z4(j0Var.f48227l);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = iVar.f49699d.z4(j0Var.f48227l);
                    o0VarE.K(objQ);
                }
            }
            p62.f fVar = (p62.f) objQ;
            if (fVar != null) {
                o0VarE.C(1480642337);
                m52.k kVar = iVar.f49696a;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
                boolean zR = o0VarE.r(iVar);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new e0(iVar, 16);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new e0(iVar, 16);
                        o0VarE.K(objQ2);
                    }
                }
                f(kVar, j0Var, bVar, fVar, (e23.l) objQ2, o0VarE, j0.R0 << 3);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1480787448);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public static final void W(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(960136827);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.e eVar = iVar.f49697b.Z;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, 21);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, 21);
                    o0VarE.K(objQ);
                }
            }
            R(eVar, (e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    public static final void X(i iVar, m mVar, int i14) {
        boolean z14;
        o13.p<Boolean, Double> pVar;
        j jVar = iVar.f49699d;
        o0 o0VarE = mVar.E(-1183941672);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            j0 j0Var = iVar.f49697b;
            m52.k kVar = jVar.f49701a;
            m52.k kVar2 = m52.k.f116758r;
            if (kVar == kVar2 && (pVar = jVar.C4().f49629e) != null && pVar.f128594a.booleanValue()) {
                o13.p<Boolean, Double> pVar2 = jVar.C4().f49629e;
                if ((pVar2 != null ? pVar2.f128595b : null) == null && (j0Var.f48227l == m52.a.f116659o || j0Var.E == m52.g.SWIM_CSS_OFFSET)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            i(z14, jVar.f49701a == kVar2 && j0Var.E == m52.g.PACE && !zf.b.D(jVar.C4().f49626b), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    public static final void Y(m52.k kVar, j0 j0Var, e23.l<? super x52.f, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-260185712);
        int i15 = (i14 & 6) == 0 ? (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            x52.f[] fVarArrC = u0.c();
            o0VarE.C(-930357924);
            ArrayList arrayList = new ArrayList(fVarArrC.length);
            for (x52.f fVar : fVarArrC) {
                arrayList.add(new o13.p(y.Q(o0VarE, fVar.f189097b), Integer.valueOf(fVar.f189096a)));
            }
            o0VarE.g0(false);
            x52.f.f189078g.getClass();
            int iM = u.M(fVarArrC, x52.f.a.a(j0Var, kVar));
            String strQ = y.Q(o0VarE, R.string.workout_intensity_target);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new na0.l(lVar, 6);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 6);
                    o0VarE.K(objQ);
                }
            }
            y52.d.a(arrayList, iM, strQ, false, null, (e23.l) objQ, null, "", false, o0VarE, 12585984, 336);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(kVar, j0Var, lVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public static final void Z(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1136821269);
        int i15 = 4;
        int i16 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.k kVar = iVar.f49696a;
            j0 j0Var = iVar.f49697b;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, i15);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, i15);
                    o0VarE.K(objQ);
                }
            }
            Y(kVar, j0Var, (e23.l) objQ, o0VarE, j0.R0 << 3);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x012b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0146  */
    public static final void a(i iVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-481885838);
        int i16 = i14 | (o0VarE.r(iVar) ? 4 : 2);
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.k kVar = iVar.f49696a;
            j jVar = iVar.f49699d;
            t tVar = k52.g.f102952a;
            if (kVar == m52.k.f116758r || !k52.g.d()) {
                i15 = 1;
                o0VarE.C(-2079545680);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2080183784);
                h4.r rVarE = u1.n.e(h4.r.S, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(rVarE, j92.b.f97899b.f97920e);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                String strQ = y.Q(o0VarE, R.string.audio_note);
                d92.b.f58624b.getClass();
                i15 = 1;
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVarF = iVar.f49697b.f();
                String str = iVar.f49700e.f182503c;
                boolean zR = o0VarE.r(jVar);
                Object objQ = o0VarE.q();
                m.a aVar2 = m.f135153a;
                if (zR) {
                    objQ = new a(jVar);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a(jVar);
                        o0VarE.K(objQ);
                    }
                }
                k23.g gVar = (k23.g) objQ;
                boolean zR2 = o0VarE.r(jVar);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new b(jVar);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new b(jVar);
                        o0VarE.K(objQ2);
                    }
                }
                w52.b.a(aVarF, str, (e23.q) ((k23.g) objQ2), (p) gVar, true, o0VarE, com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d | 24576);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(iVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    public static final void a0(i iVar, m mVar, int i14) {
        m52.k kVar = iVar.f49696a;
        j0 j0Var = iVar.f49697b;
        o0 o0VarE = mVar.E(-1570558934);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            x52.f.f189078g.getClass();
            x52.f fVarA = x52.f.a.a(j0Var, kVar);
            boolean zK = o0VarE.k(fVarA.ordinal());
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zK) {
                objQ = iVar.f49699d.E4(fVarA);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = iVar.f49699d.E4(fVarA);
                    o0VarE.K(objQ);
                }
            }
            r rVar = (r) objQ;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
            boolean zR = o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            int i16 = 13;
            if (zR) {
                objQ2 = new e0(iVar, i16);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e0(iVar, i16);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar = (e23.l) objQ2;
            Object objQ3 = o0VarE.q();
            aVar.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = new nw1.e(12);
                o0VarE.K(objQ3);
            }
            e23.a aVar2 = (e23.a) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new nw1.e(13);
                o0VarE.K(objQ4);
            }
            j(kVar, j0Var, bVar, fVarA, rVar, lVar, aVar2, (e23.a) objQ4, o0VarE, 14155776 | (j0.R0 << 3));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    public static final void b(j0 j0Var, com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar, m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        boolean z15;
        o0 o0VarE = mVar.E(-379698775);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 4 : 2) | i14 | (o0VarE.B(bVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (bVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) {
                o0VarE.C(1337832898);
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c cVar = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) bVar;
                o13.p<Boolean, Double> pVar = cVar.f49629e;
                String strJ = null;
                if (pVar != null && pVar.f128594a.booleanValue()) {
                    if ((pVar != null ? pVar.f128595b : null) == null && (j0Var.f48227l == m52.a.f116659o || j0Var.E == m52.g.SWIM_CSS_OFFSET)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                boolean z16 = j0Var.E == m52.g.PACE && !zf.b.D(cVar.f49626b);
                if (z14) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 181721557, R.string.msg_workout_use_default_css_if_not_available_footer, o0VarE, false);
                } else if (z16) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 181725170, R.string.msg_workout_target_pace_device_adjustment_footer, o0VarE, false);
                } else {
                    o0VarE.C(1338604084);
                    o0VarE.g0(false);
                }
                String str = strJ;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97920e;
                if (str == null) {
                    o0VarE.C(1338694728);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                    z15 = false;
                } else {
                    o0VarE.C(1338694729);
                    h4.r rVarC = c2.l.C(c2.l.A(x2.f(h4.r.S, 1.0f), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f14, 7);
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                    z15 = false;
                    mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                }
                o0Var.g0(z15);
            } else {
                o0Var = o0VarE;
                o0Var.C(1338992825);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(j0Var, bVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public static final void b0(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-219135115);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.f fVar = iVar.f49697b.X;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, 17);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, 17);
                    o0VarE.K(objQ);
                }
            }
            S(fVar, (e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 1);
        }
    }

    public static final void c(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(490843523);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            K(y.Q(o0VarE, R.string.workout_duration), null, o0VarE, 0, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 12);
        }
    }

    public static final void c0(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-260136136);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            int i16 = (i15 & 14) | 432;
            J(iVar, z3.f.c(1462408818, new f0(iVar, 16), o0VarE), z3.f.c(-2070677167, new f0(iVar, 27), o0VarE), o0VarE, i16);
            J(iVar, z3.f.c(-1793344855, new k0(iVar, 8), o0VarE), z3.f.c(230154696, new k0(iVar, 15), o0VarE), o0VarE, i16);
            if (iVar.f49697b.f48217c != m52.d.REST) {
                o0VarE.C(-1594002986);
                J(iVar, z3.f.c(1186008781, new k0(iVar, 20), o0VarE), z3.f.c(-998267156, new k0(iVar, 25), o0VarE), o0VarE, i16);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1593799254);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    public static final void d(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-205703826);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            j0 j0Var = iVar.f49697b;
            m52.a aVar = j0Var.f48227l;
            m52.k kVar = iVar.f49696a;
            m52.d dVar = j0Var.f48217c;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zR) {
                objQ = new e0(iVar, 10);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, 10);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new e0(iVar, 11);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e0(iVar, 11);
                    o0VarE.K(objQ2);
                }
            }
            e(aVar, kVar, dVar, bVar, lVar, (e23.l) objQ2, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 22);
        }
    }

    public static final void d0(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1735402898);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            K(y.Q(o0VarE, R.string.workout_target_setting), null, o0VarE, 0, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:114:0x0228  */
    public static final void e(m52.a aVar, m52.k kVar, m52.d dVar, com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar, e23.l<? super m52.a, Unit> lVar, e23.l<? super m52.a, Unit> lVar2, m mVar, int i14) {
        o0 o0Var;
        List<m52.a> listK;
        String strL;
        o0 o0VarE = mVar.E(455451787);
        int i15 = (o0VarE.k(dVar != null ? dVar.ordinal() : -1) ? 256 : 128) | i14 | (o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 4 : 2) | (o0VarE.k(kVar.ordinal()) ? 32 : 16) | (o0VarE.B(bVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b c0980b = bVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b ? (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b) bVar : null;
            boolean z14 = c0980b != null ? c0980b.f49622a : false;
            if (kVar == m52.k.f116755o) {
                listK = p13.x.k(m52.a.f116649e, m52.a.f116650f, m52.a.f116648d, m52.a.f116651g, m52.a.f116653i, m52.a.f116652h);
            } else if (kVar == m52.k.f116758r) {
                listK = dVar == m52.d.REST ? p13.x.k(m52.a.f116648d, m52.a.f116655k, m52.a.f116656l, m52.a.f116659o) : p13.x.k(m52.a.f116650f, m52.a.f116649e, m52.a.f116648d);
            } else if (!k52.g.b().contains(kVar)) {
                listK = p13.x.k(m52.a.f116649e, m52.a.f116650f, m52.a.f116648d, m52.a.f116651g, m52.a.f116653i);
            } else if (dVar == m52.d.REST) {
                listK = z14 ? p13.x.k(m52.a.f116648d, m52.a.f116653i) : p13.x.k(m52.a.f116649e, m52.a.f116648d, m52.a.f116653i);
            } else if (kVar == m52.k.f116761w) {
                listK = p13.x.k(m52.a.f116649e, m52.a.f116648d, m52.a.f116651g, m52.a.f116653i);
            } else {
                listK = z14 ? p13.x.k(m52.a.f116657m, m52.a.f116648d, m52.a.f116651g, m52.a.f116653i) : p13.x.k(m52.a.f116657m, m52.a.f116649e, m52.a.f116648d, m52.a.f116651g, m52.a.f116653i);
            }
            o0VarE.C(-397480154);
            ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
            for (m52.a aVar2 : listK) {
                x52.c.f189053e.getClass();
                x52.c cVarA = x52.c.a.a(aVar2);
                Integer numValueOf = cVarA != null ? Integer.valueOf(cVarA.f189060a) : null;
                if (numValueOf == null) {
                    o0VarE.C(403256706);
                    o0VarE.g0(false);
                    strL = null;
                } else {
                    strL = lc.u0.l(o0VarE, 403256707, numValueOf, o0VarE, false);
                }
                if (strL == null) {
                    strL = "";
                }
                arrayList.add(new o13.p(strL, Integer.valueOf(aVar2.f116661a)));
            }
            o0VarE.g0(false);
            int i16 = u.m0(new m52.k[]{m52.k.f116759t, m52.k.f116760v}).contains(kVar) ? R.string.workout_intensity_target_type : R.string.workout_duration_type;
            int iIndexOf = listK.indexOf(aVar);
            String strQ = y.Q(o0VarE, i16);
            boolean z15 = kVar == m52.k.f116758r && dVar == m52.d.REST;
            boolean z16 = (458752 & r10) == 131072;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z16) {
                objQ = new na0.l(lVar2, 11);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar2, 11);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar3 = (e23.l) objQ;
            boolean z17 = ((r10 & 14) == 4) | ((i15 & 57344) == 16384);
            Object objQ2 = o0VarE.q();
            if (z17) {
                objQ2 = new s1(19, aVar, lVar);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new s1(19, aVar, lVar);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            y52.d.a(arrayList, iIndexOf, strQ, z15, null, lVar3, (e23.a) objQ2, "", false, o0Var, 12582912, 272);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j(aVar, kVar, dVar, bVar, lVar, lVar2, i14, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    public static final void e0(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-420026241);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            String str = iVar.f49697b.f48225k;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, 6);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, 6);
                    o0VarE.K(objQ);
                }
            }
            y1.a(0, 4, (e23.l) objQ, str, o0VarE, false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 18);
        }
    }

    public static final void f(m52.k kVar, j0 j0Var, com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar, p62.f fVar, e23.l<? super j0, Unit> lVar, m mVar, int i14) {
        int i15;
        Object obj;
        o0 o0Var;
        o0 o0VarE = mVar.E(977603621);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(fVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            obj = lVar;
            i15 |= o0VarE.r(obj) ? 16384 : 8192;
        } else {
            obj = lVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new o62.a(6);
                o0VarE.K(objQ);
            }
            e23.l lVar2 = (e23.l) objQ;
            boolean zR = ((i15 & 14) == 4) | o0VarE.r(fVar) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(j0Var))) | ((i15 & 896) == 256 || ((i15 & 512) != 0 && o0VarE.r(bVar))) | ((i15 & 57344) == 16384);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                jv0.c cVar = new jv0.c(kVar, fVar, j0Var, bVar, obj, 11);
                o0VarE.K(cVar);
                objQ2 = cVar;
            }
            o0Var = o0VarE;
            p002j6.c.b(lVar2, rVarF, (e23.l) objQ2, o0Var, 54, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e((Object) kVar, (Object) j0Var, (Object) bVar, (Object) fVar, (e23.l) lVar, i14, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f0(j jVar, w52.e eVar, m mVar, int i14) {
        j jVar2;
        w52.e eVar2;
        jVar.getClass();
        eVar.getClass();
        o0 o0VarE = mVar.E(-1291968473);
        int i15 = (o0VarE.r(jVar) ? 4 : 2) | i14 | (o0VarE.r(eVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r rVarB = a2.b(h4.r.S, a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            m52.k kVar2 = jVar.f49701a;
            T f182175a = o53.f0.G(jVar.f49704d, o0VarE).getF182175a();
            f182175a.getClass();
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar2 = jVar.f49702b;
            o0VarE.C(1735270382);
            jVar2 = jVar;
            eVar2 = eVar;
            i iVar = new i(kVar2, (j0) f182175a, bVar2, jVar2, eVar2);
            m52.k kVar3 = jVar2.f49701a;
            if (kVar3 == m52.k.f116758r) {
                o0VarE.C(-685811929);
                c0(iVar, o0VarE, 0);
                o0VarE.g0(false);
            } else if (kVar3 == m52.k.f116759t) {
                o0VarE.C(-685631385);
                P(iVar, o0VarE, 0);
                o0VarE.g0(false);
            } else if (kVar3 == m52.k.B) {
                o0VarE.C(-685452856);
                E(iVar, o0VarE, 0);
                o0VarE.g0(false);
            } else if (k52.g.f(kVar3)) {
                o0VarE.C(-685219612);
                z(iVar, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-685042199);
                o(iVar, o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
        } else {
            jVar2 = jVar;
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(jVar2, eVar2, i14, 17);
        }
    }

    public static final void g(m52.k kVar, j0 j0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        int i16;
        int i17;
        o0 o0VarE = mVar.E(1040602675);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (u.m0(new m52.k[]{m52.k.f116762x, m52.k.f116763y}).contains(kVar)) {
                i16 = R.string.lbl_move;
            } else {
                i16 = kVar == m52.k.f116761w ? R.string.lbl_pose : R.string.title_exercise;
            }
            String strG = j0Var.g();
            String str = j0Var.H0;
            String strG2 = (strG == null || str == null) ? null : cVar.G(str, strG);
            if (strG2 == null) {
                o0VarE.C(-708190208);
                int i18 = c.f49694a[kVar.ordinal()];
                if (i18 == 3 || i18 == 4) {
                    i17 = R.string.lbl_select_move;
                } else {
                    i17 = i18 != 5 ? R.string.workout_select_an_exercise : R.string.lbl_select_pose;
                }
                strG2 = y.Q(o0VarE, i17);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-708195881);
                o0VarE.g0(false);
            }
            o0Var = o0VarE;
            l72.p2.f111205a.h(y.Q(o0VarE, i16), strG2, null, null, null, j0Var.f48217c != m52.d.REST, false, null, null, null, aVar, o0Var, 0, (i15 >> 9) & 14, 988);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(kVar, j0Var, cVar, aVar, i14, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x016a  */
    public static final void h(j0 j0Var, com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b c0980b, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, e23.l<? super Context, Unit> lVar, e23.l<? super Double, Unit> lVar2, m mVar, int i14) {
        int i15;
        Object obj;
        Object obj2;
        o0 o0Var;
        String strK;
        o0 o0VarE = mVar.E(-737554354);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(c0980b) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            obj = lVar;
            i15 |= o0VarE.r(obj) ? 2048 : 1024;
        } else {
            obj = lVar;
        }
        if ((i14 & 24576) == 0) {
            obj2 = lVar2;
            i15 |= o0VarE.r(obj2) ? 16384 : 8192;
        } else {
            obj2 = lVar2;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            com.garmin.android.apps.connectmobile.repcounting.model.d dVarD = cVar.D(j0Var.H0, j0Var.g());
            String strJ = null;
            if (dVarD == null) {
                o0VarE.C(571292278);
                o0VarE.g0(false);
            } else {
                o0VarE.C(571292279);
                j0.c cVar2 = j0Var.f48224j;
                if (cVar2 == null) {
                    o0VarE.C(-1823616135);
                    o0VarE.g0(false);
                    strK = null;
                } else {
                    o0VarE.C(-1823616134);
                    strK = v52.f.k((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), cVar2);
                    o0VarE.g0(false);
                }
                if (strK == null) {
                    o0VarE.C(-1823504441);
                    Double dR = v52.f.r(j0Var);
                    v52.h hVar = new v52.h((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), false, 2, null);
                    l3.f23124b.getClass();
                    String strA = hVar.a(dR, l3.f23130h);
                    o0VarE.g0(false);
                    strJ = strA;
                } else {
                    o0VarE.C(-1167205690);
                    o0VarE.g0(false);
                    strJ = strK;
                }
                o0VarE.g0(false);
            }
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -120108561, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(-120118822);
                o0VarE.g0(false);
            }
            String str = strJ;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = ((i15 & 57344) == 16384) | o0VarE.r(c0980b) | ((i15 & 7168) == 2048) | o0VarE.r(context) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(j0Var)));
            Object objQ = o0VarE.q();
            if (zR) {
                v4 v4Var = new v4(c0980b, obj, context, j0Var, obj2, 23);
                o0VarE.K(v4Var);
                objQ = v4Var;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    v4 v4Var2 = new v4(c0980b, obj, context, j0Var, obj2, 23);
                    o0VarE.K(v4Var2);
                    objQ = v4Var2;
                }
            }
            o0Var = o0VarE;
            l72.p2.f111205a.h(y.Q(o0VarE, R.string.lbl_weight), str, null, null, null, dVarD != null, false, null, null, null, (e23.a) objQ, o0Var, 0, 0, 988);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e((Parcelable) j0Var, (Object) c0980b, (Object) cVar, (e23.l) lVar, (e23.l) lVar2, i14, 8);
        }
    }

    public static final void i(boolean z14, boolean z15, m mVar, int i14) {
        o0 o0Var;
        Integer numValueOf;
        o0 o0VarE = mVar.E(1532496460);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.h(z15) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                numValueOf = Integer.valueOf(R.string.msg_workout_use_default_css_if_not_available_footer);
            } else {
                numValueOf = z15 ? Integer.valueOf(R.string.msg_workout_target_pace_device_adjustment_footer) : null;
            }
            if (numValueOf == null) {
                o0VarE.C(-899943968);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(-899943967);
                String strQ = y.Q(o0VarE, numValueOf.intValue());
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58625c.getClass();
                mh.c(strQ, c2.l.y(rVarF, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ew0.u(i14, 3, z14, z15);
        }
    }

    public static final void j(final m52.k kVar, final j0 j0Var, final com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar, final x52.f fVar, final r rVar, final e23.l<? super j0, Unit> lVar, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, m mVar, final int i14) {
        int i15;
        e23.l<? super j0, Unit> lVar2;
        e23.a<Unit> aVar3;
        o0 o0Var;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar.E(1486346441);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(fVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (i14 & 32768) == 0 ? o0VarE.B(rVar) : o0VarE.r(rVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        } else {
            lVar2 = lVar;
        }
        if ((1572864 & i14) == 0) {
            aVar3 = aVar;
            i15 |= o0VarE.r(aVar3) ? 1048576 : 524288;
        } else {
            aVar3 = aVar;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (i15 & 4793491) != 4793490)) {
            x1 x1Var = n.f135158a;
            if (rVar == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                final e23.l<? super j0, Unit> lVar3 = lVar2;
                final e23.a<Unit> aVar4 = aVar3;
                pVar = new p() { // from class: o62.j0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i16) {
                            case 0:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.j(kVar, j0Var, bVar, fVar, rVar, lVar3, aVar4, aVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                            case 1:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.j(kVar, j0Var, bVar, fVar, rVar, lVar3, aVar4, aVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.j(kVar, j0Var, bVar, fVar, rVar, lVar3, aVar4, aVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else if ((fVar != x52.f.f189079h && fVar != x52.f.f189081j) || k52.g.e(kVar) || ((Set) k52.g.f102953b.getValue()).contains(kVar)) {
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new o62.a(7);
                    o0VarE.K(objQ);
                }
                e23.l lVar4 = (e23.l) objQ;
                boolean z14 = ((i15 & 14) == 4) | ((i15 & 7168) == 2048) | ((3670016 & i15) == 1048576) | ((29360128 & i15) == 8388608) | ((57344 & i15) == 16384 || ((i15 & 32768) != 0 && o0VarE.r(rVar))) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(j0Var))) | ((i15 & 896) == 256 || ((i15 & 512) != 0 && o0VarE.r(bVar))) | ((i15 & 458752) == 131072);
                Object objQ2 = o0VarE.q();
                if (z14 || objQ2 == c2565a) {
                    a5 a5Var = new a5(fVar, kVar, rVar, j0Var, bVar, aVar, aVar2, lVar, 7);
                    o0VarE.K(a5Var);
                    objQ2 = a5Var;
                }
                o0Var = o0VarE;
                p002j6.c.b(lVar4, rVarF, (e23.l) objQ2, o0Var, 54, 0);
            } else {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 1;
                pVar = new p() { // from class: o62.j0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i17) {
                            case 0:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.j(kVar, j0Var, bVar, fVar, rVar, lVar, aVar, aVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                            case 1:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.j(kVar, j0Var, bVar, fVar, rVar, lVar, aVar, aVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.j(kVar, j0Var, bVar, fVar, rVar, lVar, aVar, aVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i18 = 2;
            pVar = new p() { // from class: o62.j0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i18) {
                        case 0:
                            ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.j(kVar, j0Var, bVar, fVar, rVar, lVar, aVar, aVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                            break;
                        case 1:
                            ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.j(kVar, j0Var, bVar, fVar, rVar, lVar, aVar, aVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.j(kVar, j0Var, bVar, fVar, rVar, lVar, aVar, aVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public static final void k(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1758527639);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new l0(iVar, 6);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new l0(iVar, 6);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar = (e23.a) objQ;
            String strQ = y.Q(o0VarE, R.string.workout_intensity_target);
            if (iVar.f49696a != m52.k.f116755o) {
                aVar = null;
            }
            K(strQ, aVar, o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0177  */
    public static final void l(m52.k kVar, j0 j0Var, e23.l<? super x52.f, Unit> lVar, m mVar, int i14) {
        x52.f[] fVarArrC;
        o0 o0VarE = mVar.E(-1504495123);
        int i15 = (i14 & 6) == 0 ? (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            x52.f.f189078g.getClass();
            x52.f fVarA = x52.f.a.a(j0Var, kVar);
            switch (c.f49694a[kVar.ordinal()]) {
                case 6:
                    fVarArrC = u0.c();
                    break;
                case 7:
                    fVarArrC = u0.a(fVarA.a(), j0Var.f48227l);
                    break;
                case 8:
                    if (j0Var.f48217c == m52.d.WALK) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(x52.f.f189079h);
                        arrayList.add(x52.f.f189083l);
                        arrayList.add(x52.f.f189086o);
                        arrayList.add(x52.f.f189088q);
                        arrayList.add(x52.f.f189089r);
                        arrayList.add(x52.f.B);
                        fVarArrC = (x52.f[]) arrayList.toArray(new x52.f[0]);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(x52.f.f189079h);
                        arrayList2.add(x52.f.f189083l);
                        arrayList2.add(x52.f.f189086o);
                        arrayList2.add(x52.f.f189088q);
                        arrayList2.add(x52.f.f189089r);
                        if (bo1.a.a().c().t0()) {
                            arrayList2.add(x52.f.f189092w);
                            arrayList2.add(x52.f.f189094y);
                        }
                        fVarArrC = (x52.f[]) arrayList2.toArray(new x52.f[0]);
                    }
                    break;
                case 9:
                    fVarArrC = u0.b();
                    break;
                case 10:
                    fVarArrC = new x52.f[]{x52.f.f189079h, x52.f.f189083l, x52.f.f189086o, x52.f.f189088q, x52.f.f189089r, x52.f.B};
                    break;
                default:
                    fVarArrC = new x52.f[]{x52.f.f189079h, x52.f.f189083l, x52.f.f189085n, x52.f.f189086o, x52.f.f189088q, x52.f.f189089r};
                    break;
            }
            o0VarE.C(1584205017);
            ArrayList arrayList3 = new ArrayList(fVarArrC.length);
            for (x52.f fVar : fVarArrC) {
                arrayList3.add(new o13.p(y.Q(o0VarE, fVar.f189097b), Integer.valueOf(fVar.f189096a)));
            }
            o0VarE.g0(false);
            x52.f.f189078g.getClass();
            int iM = u.M(fVarArrC, x52.f.a.b(j0Var, kVar));
            String strQ = y.Q(o0VarE, R.string.workout_intensity_target_type);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new na0.l(lVar, 7);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 7);
                    o0VarE.K(objQ);
                }
            }
            y52.d.a(arrayList3, iM, strQ, false, null, (e23.l) objQ, null, "", false, o0VarE, 12585984, 336);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(kVar, j0Var, lVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    public static final void m(double d14, e23.l<? super Double, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        Object g0Var;
        Context context;
        String strJ;
        o0 o0VarE = mVar.E(1965527327);
        int i15 = (o0VarE.m(d14) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = ((i15 & 14) == 4) | o0VarE.r(context2) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                context = context2;
                g0Var = new g0(context, d14, lVar, 0);
                o0VarE.K(g0Var);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    context = context2;
                    g0Var = new g0(context, d14, lVar, 0);
                    o0VarE.K(g0Var);
                } else {
                    g0Var = objQ;
                    context = context2;
                }
            }
            e23.a<Unit> aVar = (e23.a) g0Var;
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.workout_target);
            if (Double.isNaN(d14) || d14 < 0.0d) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -913824832, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(-913825956);
                o0VarE.g0(false);
                strJ = u0.d(context, d14);
            }
            o0Var = o0VarE;
            p2Var.h(strQ, strJ, null, null, null, false, false, null, null, null, aVar, o0Var, 0, 0, 1020);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(i14, d14, lVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    public static final void n(i iVar, m mVar, int i14) {
        j0 j0Var = iVar.f49697b;
        o0 o0VarE = mVar.E(1903180128);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.a aVar = j0Var.f48227l;
            boolean zK = o0VarE.k(aVar == null ? -1 : aVar.ordinal());
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zK) {
                objQ = j.x4(j0Var.f48227l);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = j.x4(j0Var.f48227l);
                    o0VarE.K(objQ);
                }
            }
            p62.f fVar = (p62.f) objQ;
            if (fVar != null) {
                o0VarE.C(-223829557);
                m52.k kVar = iVar.f49696a;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
                boolean zR = o0VarE.r(iVar);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new e0(iVar, 19);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new e0(iVar, 19);
                        o0VarE.K(objQ2);
                    }
                }
                f(kVar, j0Var, bVar, fVar, (e23.l) objQ2, o0VarE, j0.R0 << 3);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-223684446);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 7);
        }
    }

    public static final void o(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1964605054);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            int i16 = (i15 & 14) | 432;
            J(iVar, z3.f.c(-863372484, new k0(iVar, 1), o0VarE), z3.f.c(-1537439269, new k0(iVar, 2), o0VarE), o0VarE, i16);
            J(iVar, z3.f.c(1108656435, new k0(iVar, 3), o0VarE), z3.f.c(1870537746, new k0(iVar, 4), o0VarE), o0VarE, i16);
            J(iVar, z3.f.c(-993797068, new k0(iVar, 5), o0VarE), z3.f.c(-231915757, new k0(iVar, 6), o0VarE), o0VarE, i16);
            if (iVar.f49696a == m52.k.f116755o) {
                o0VarE.C(-29227315);
                J(iVar, z3.f.c(-59191721, new k0(iVar, 7), o0VarE), z3.f.c(184345142, new k0(iVar, 9), o0VarE), o0VarE, i16);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-29055296);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public static final void p(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1888275292);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.k kVar = iVar.f49696a;
            j0 j0Var = iVar.f49697b;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            int i16 = 3;
            if (zR) {
                objQ = new e0(iVar, i16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, i16);
                    o0VarE.K(objQ);
                }
            }
            l(kVar, j0Var, (e23.l) objQ, o0VarE, j0.R0 << 3);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(iVar, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    public static final void q(i iVar, m mVar, int i14) {
        m52.k kVar = iVar.f49696a;
        j0 j0Var = iVar.f49697b;
        o0 o0VarE = mVar.E(2013121241);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            x52.f.f189078g.getClass();
            x52.f fVarB = x52.f.a.b(j0Var, kVar);
            boolean zK = o0VarE.k(fVarB.ordinal());
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zK) {
                objQ = iVar.f49699d.F4(fVarB);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = iVar.f49699d.F4(fVarB);
                    o0VarE.K(objQ);
                }
            }
            r rVar = (r) objQ;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
            boolean zR = o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new e0(iVar, 5);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e0(iVar, 5);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar = (e23.l) objQ2;
            boolean zR2 = o0VarE.r(iVar);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new l0(iVar, 0);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new l0(iVar, 0);
                    o0VarE.K(objQ3);
                }
            }
            e23.a aVar2 = (e23.a) objQ3;
            boolean zR3 = o0VarE.r(iVar);
            Object objQ4 = o0VarE.q();
            if (zR3) {
                objQ4 = new l0(iVar, 1);
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new l0(iVar, 1);
                    o0VarE.K(objQ4);
                }
            }
            j(kVar, j0Var, bVar, fVarB, rVar, lVar, aVar2, (e23.a) objQ4, o0VarE, j0.R0 << 3);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    public static final void r(j0 j0Var, e23.l<? super x52.f, Unit> lVar, m mVar, int i14) {
        int i15;
        lVar.getClass();
        o0 o0VarE = mVar.E(531008384);
        int i16 = ((i14 & 8) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            List<x52.f> listK = j0Var.f48217c != m52.d.REST ? p13.x.k(x52.f.f189080i, x52.f.f189088q, x52.f.f189082k) : p13.x.k(x52.f.f189080i, x52.f.f189088q);
            o0VarE.C(-802040980);
            ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
            for (x52.f fVar : listK) {
                arrayList.add(new o13.p(y.Q(o0VarE, fVar.f189097b), Integer.valueOf(fVar.f189096a)));
            }
            o0VarE.g0(false);
            x52.f.f189078g.getClass();
            int iIndexOf = listK.indexOf(j0Var.f48232q == m52.g.HEART_RATE ? x52.f.f189088q : !Double.isNaN(j0Var.J0) ? x52.f.f189082k : x52.f.f189080i);
            String strQ = y.Q(o0VarE, R.string.workout_intensity_target_type);
            boolean z14 = (i16 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new na0.l(lVar, 13);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 13);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar2 = (e23.l) objQ;
            i15 = 1;
            y52.d.a(arrayList, iIndexOf, strQ, false, null, lVar2, null, "", false, o0VarE, 12585984, 336);
            x1 x1Var2 = n.f135158a;
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i0(j0Var, lVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e7  */
    public static final void s(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-921086419);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.k kVar = iVar.f49696a;
            j0 j0Var = iVar.f49697b;
            m52.k kVar2 = m52.k.f116759t;
            m.a aVar = m.f135153a;
            if (kVar == kVar2 && j0Var.f48227l == m52.a.f116657m) {
                o0VarE.C(460731841);
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ = y.Q(o0VarE, R.string.workout_target);
                l3.a aVar2 = l3.f23124b;
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                double d14 = j0Var.f48229n;
                boolean z14 = j0Var.f48223i;
                aVar2.getClass();
                String strQ0 = l3.a.Q0(d14, context, z14);
                boolean zR = o0VarE.r(iVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new l0(iVar, 4);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new l0(iVar, 4);
                        o0VarE.K(objQ);
                    }
                }
                p2Var.h(strQ, strQ0, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 0, 0, 1020);
                o0VarE.g0(false);
            } else {
                o0VarE.C(461291701);
                m52.a aVar3 = j0Var.f48227l;
                boolean zK = o0VarE.k(aVar3 == null ? -1 : aVar3.ordinal());
                Object objQ2 = o0VarE.q();
                if (zK) {
                    objQ2 = j.y4(j0Var.f48227l);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = j.y4(j0Var.f48227l);
                        o0VarE.K(objQ2);
                    }
                }
                p62.f fVar = (p62.f) objQ2;
                if (fVar != null) {
                    o0VarE.C(461494286);
                    m52.k kVar3 = iVar.f49696a;
                    com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
                    boolean zR2 = o0VarE.r(iVar);
                    Object objQ3 = o0VarE.q();
                    if (zR2) {
                        objQ3 = new e0(iVar, 15);
                        o0VarE.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new e0(iVar, 15);
                            o0VarE.K(objQ3);
                        }
                    }
                    f(kVar3, j0Var, bVar, fVar, (e23.l) objQ3, o0VarE, j0.R0 << 3);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(461654773);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 28);
        }
    }

    public static final void t(i iVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1967927067);
        int i16 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.k kVar = iVar.f49696a;
            int i17 = c.f49694a[kVar.ordinal()];
            if (i17 == 1 || i17 == 2) {
                i15 = R.string.workout_exercise_settings;
            } else if (k52.g.e(kVar)) {
                i15 = R.string.lbl_details;
            } else {
                if (!((Set) k52.g.f102953b.getValue()).contains(kVar)) {
                    com.google.protobuf.a.m();
                    return;
                }
                i15 = R.string.workout_step_settings;
            }
            K(y.Q(o0VarE, i15), null, o0VarE, 0, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    public static final void u(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1226882764);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m52.k kVar = iVar.f49696a;
            j0 j0Var = iVar.f49697b;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = ((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b) iVar.f49698c).f49623b;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new l0(iVar, 7);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new l0(iVar, 7);
                    o0VarE.K(objQ);
                }
            }
            g(kVar, j0Var, cVar, (e23.a) objQ, o0VarE, (j0.R0 << 3) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 6));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    public static final void v(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1415052106);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            j0 j0Var = iVar.f49697b;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b c0980b = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b) bVar;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = ((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b) bVar).f49623b;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new e0(iVar, 22);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, 22);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new e0(iVar, i16);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e0(iVar, i16);
                    o0VarE.K(objQ2);
                }
            }
            h(j0Var, c0980b, cVar, lVar, (e23.l) objQ2, o0VarE, j0.R0 | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 6));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(iVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public static final void w(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-340900592);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            j0 j0Var = iVar.f49697b;
            boolean zR = o0VarE.r(iVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e0(iVar, 18);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(iVar, 18);
                    o0VarE.K(objQ);
                }
            }
            r(j0Var, (e23.l) objQ, o0VarE, j0.R0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    public static final void x(i iVar, m mVar, int i14) {
        x52.f fVar;
        m52.k kVar = iVar.f49696a;
        j0 j0Var = iVar.f49697b;
        o0 o0VarE = mVar.E(1628145573);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            x52.f.f189078g.getClass();
            if (j0Var.f48232q == m52.g.HEART_RATE) {
                fVar = x52.f.f189088q;
            } else {
                fVar = !Double.isNaN(j0Var.J0) ? x52.f.f189082k : x52.f.f189080i;
            }
            int i16 = c.f49695b[fVar.ordinal()];
            m.a aVar = m.f135153a;
            if (i16 == 1) {
                o0VarE.C(1019299341);
                x52.f fVarB = x52.f.a.b(j0Var, kVar);
                boolean zK = o0VarE.k(fVarB.ordinal());
                Object objQ = o0VarE.q();
                if (zK) {
                    objQ = iVar.f49699d.F4(fVarB);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = iVar.f49699d.F4(fVarB);
                        o0VarE.K(objQ);
                    }
                }
                r rVar = (r) objQ;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = iVar.f49698c;
                boolean zR = o0VarE.r(iVar);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new e0(iVar, 7);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new e0(iVar, 7);
                        o0VarE.K(objQ2);
                    }
                }
                e23.l lVar = (e23.l) objQ2;
                Object objQ3 = o0VarE.q();
                aVar.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = new nw1.e(10);
                    o0VarE.K(objQ3);
                }
                e23.a aVar2 = (e23.a) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new nw1.e(11);
                    o0VarE.K(objQ4);
                }
                j(kVar, j0Var, bVar, fVarB, rVar, lVar, aVar2, (e23.a) objQ4, o0VarE, 14155776 | (j0.R0 << 3));
                o0VarE.g0(false);
            } else if (i16 != 2) {
                o0VarE.C(1279834665);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1020036645);
                double d14 = j0Var.J0;
                boolean zR2 = o0VarE.r(iVar);
                Object objQ5 = o0VarE.q();
                if (zR2) {
                    objQ5 = new e0(iVar, 8);
                    o0VarE.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new e0(iVar, 8);
                        o0VarE.K(objQ5);
                    }
                }
                m(d14, (e23.l) objQ5, o0VarE, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(iVar, i14, 19);
        }
    }

    public static final void y(i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(785442275);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            int i16 = c.f49694a[iVar.f49696a.ordinal()];
            K(y.Q(o0VarE, (i16 == 1 || i16 == 2) ? R.string.workout_step_settings : R.string.workout_step_info), null, o0VarE, 0, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(iVar, i14, 11);
        }
    }

    public static final void z(i iVar, m mVar, int i14) {
        m52.k kVar = iVar.f49696a;
        o0 o0VarE = mVar.E(-1279978091);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            int i16 = (i15 & 14) | 432;
            J(iVar, z3.f.c(-1212506085, new f0(iVar, 11), o0VarE), z3.f.c(1386437852, new f0(iVar, 13), o0VarE), o0VarE, i16);
            if (kVar == m52.k.f116760v) {
                o0VarE.C(-1107363412);
                J(iVar, z3.f.c(-1993701920, new f0(iVar, 14), o0VarE), z3.f.c(-708639391, new f0(iVar, 15), o0VarE), o0VarE, i16);
                J(iVar, z3.f.c(-237358327, new f0(iVar, 17), o0VarE), z3.f.c(2052118090, new f0(iVar, 18), o0VarE), o0VarE, i16);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1107011531);
                J(iVar, z3.f.c(-1133421321, new f0(iVar, 19), o0VarE), z3.f.c(-126498632, new f0(iVar, 20), o0VarE), o0VarE, i16);
                o0VarE.g0(false);
            }
            if (k52.g.e(kVar)) {
                o0VarE.C(-1106718829);
                J(iVar, z3.f.c(766346505, new f0(iVar, 21), o0VarE), z3.f.c(-1239144374, new f0(iVar, 22), o0VarE), o0VarE, i16);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1106540083);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(iVar, i14, 12);
        }
    }
}
