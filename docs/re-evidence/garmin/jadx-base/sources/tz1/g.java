package tz1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d6.p;
import e23.l;
import f72.hd;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import o4.d0;
import o70.n;
import o70.t;
import oz1.u;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import rr0.x;
import s5.x0;
import sk0.k1;
import t21.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167303a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.GENESIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f167303a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    public static final void a(r rVar, Integer num, Integer num2, int i14, m mVar, int i15) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-324576696);
        int i16 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(num) ? 32 : 16) | (o0VarE.B(num2) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, num2 != null ? num2.intValue() : R.string.no_data_label);
            String strQ2 = y.Q(o0VarE, i14);
            boolean zB = o0VarE.B(strQ2) | o0VarE.B(strQ);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new cn1.j(strQ2, strQ, 17);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new cn1.j(strQ2, strQ, 17);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((l) objQ, rVar, false);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ3 = y.Q(o0VarE, num != null ? num.intValue() : R.string.no_value);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            p.f57793b.getClass();
            int i17 = p.f57795d;
            mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 2, 0, null, x0VarB, o0VarE, 0, 24960, 110590);
            String strQ4 = y.Q(o0VarE, i14);
            fVar.getClass();
            mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 2, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 24960, 110590);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(rVar, num, num2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fe  */
    public static final void b(r rVar, rz1.h hVar, m mVar, int i14) {
        int i15;
        n nVar;
        yz1.d dVar;
        long jH;
        r rVar2 = rVar;
        o0 o0VarE = mVar.E(592519047);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            s62.a.f157643a.getClass();
            u4.d dVarA = hd.a(t62.c.f162799a);
            gl.c.f77766a.getClass();
            long jC = gl.c.a(o0VarE).c();
            String strQ = y.Q(o0VarE, R.string.training_readiness);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new s70.r(context, 27);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s70.r(context, 27);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            if (hVar == null || !s.g(hVar.f155237h, Boolean.FALSE)) {
                nVar = (hVar == null || !s.g(hVar.f155236g, Boolean.FALSE)) ? n.VALID_DATA : n.EMPTY;
            } else {
                nVar = n.GENESIS;
            }
            int i16 = a.f167303a[nVar.ordinal()];
            if (i16 != 1) {
                if (i16 != 2) {
                    o0VarE.C(-577888275);
                    i53.c<oz1.a> cVar = hVar != null ? hVar.f155235f : null;
                    Float f14 = hVar != null ? s.g(hVar.f155234e, Boolean.TRUE) : false ? hVar.f155231b : null;
                    yz1.d dVar2 = hVar != null ? hVar.f155230a : null;
                    d0 d0VarE = t.L0.e(null, o0VarE, 1);
                    if (d0VarE == null) {
                        o0VarE.C(-1819745970);
                        jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
                    } else {
                        o0VarE.C(-1819748171);
                        o0VarE.g0(false);
                        jH = d0VarE.f128833a;
                    }
                    yz1.s.c(rVar2, dVar2, strQ, null, dVarA, d0.a(jH), 0.0f, 0, null, 0.0f, null, null, z3.f.c(1160180766, new tb0.h(f14, 8, hVar, cVar), o0VarE), aVar2, o0VarE, i15 & 14, 384, 4040);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    int i17 = i15;
                    o0VarE.C(-579075761);
                    String strJ = hVar != null ? s.g(hVar.f155238i, Boolean.TRUE) : false ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -579032857, R.string.lbl_data_not_available, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -578943670, R.string.msg_not_enough_data, o0VarE, false);
                    String strJ2 = hVar != null ? s.g(hVar.f155238i, Boolean.TRUE) : false ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -578784795, R.string.check_back_later_message, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -578692663, R.string.tr_wear_you_device_to_reveal_your_training_readiness, o0VarE, false);
                    dVar = hVar != null ? hVar.f155230a : null;
                    boolean zR2 = o0VarE.r(context);
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        objQ2 = new s70.r(context, 29);
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new s70.r(context, 29);
                            o0VarE.K(objQ2);
                        }
                    }
                    yz1.s.d(rVar, dVar, strQ, strJ, strJ2, dVarA, null, 0.0f, null, 0.0f, aVar2, (e23.a) objQ2, null, o0VarE, i17 & 14, 0, 40896);
                    o0VarE.g0(false);
                }
                rVar2 = rVar;
            } else {
                int i18 = i15;
                o0VarE.C(-579994105);
                String strQ2 = y.Q(o0VarE, R.string.get_ready_to_train);
                String strQ3 = y.Q(o0VarE, R.string.see_how_your_sleep);
                dVar = hVar != null ? hVar.f155230a : null;
                d0 d0VarA = d0.a(jC);
                boolean zR3 = o0VarE.r(context);
                Object objQ3 = o0VarE.q();
                if (zR3) {
                    objQ3 = new s70.r(context, 28);
                    o0VarE.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new s70.r(context, 28);
                        o0VarE.K(objQ3);
                    }
                }
                rVar2 = rVar;
                yz1.s.d(rVar2, dVar, strQ, strQ2, strQ3, dVarA, d0VarA, 0.0f, null, 0.0f, aVar2, (e23.a) objQ3, null, o0VarE, i18 & 14, 0, 40832);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar2, hVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0270  */
    /* JADX WARN: Code duplicated, block: B:107:0x028b  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x02be  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:133:0x0307  */
    /* JADX WARN: Code duplicated, block: B:136:0x0327  */
    /* JADX WARN: Code duplicated, block: B:137:0x032e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:140:0x033a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0346  */
    /* JADX WARN: Code duplicated, block: B:146:0x0350  */
    /* JADX WARN: Code duplicated, block: B:148:0x0359  */
    /* JADX WARN: Code duplicated, block: B:149:0x035c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x0387  */
    /* JADX WARN: Code duplicated, block: B:159:0x038e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0392  */
    /* JADX WARN: Code duplicated, block: B:162:0x0399  */
    /* JADX WARN: Code duplicated, block: B:165:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:167:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:168:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:173:0x0410  */
    /* JADX WARN: Code duplicated, block: B:176:0x041c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0426  */
    /* JADX WARN: Code duplicated, block: B:181:0x042f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0432  */
    /* JADX WARN: Code duplicated, block: B:188:0x043e  */
    /* JADX WARN: Code duplicated, block: B:191:0x045d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0464  */
    /* JADX WARN: Code duplicated, block: B:194:0x0468  */
    /* JADX WARN: Code duplicated, block: B:195:0x046f  */
    /* JADX WARN: Code duplicated, block: B:198:0x047f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0489  */
    /* JADX WARN: Code duplicated, block: B:203:0x0492  */
    /* JADX WARN: Code duplicated, block: B:204:0x0495  */
    /* JADX WARN: Code duplicated, block: B:210:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:213:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:214:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:216:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:217:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:220:0x051b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0522  */
    /* JADX WARN: Code duplicated, block: B:223:0x0526  */
    /* JADX WARN: Code duplicated, block: B:228:0x0547  */
    /* JADX WARN: Code duplicated, block: B:231:0x0553  */
    /* JADX WARN: Code duplicated, block: B:234:0x055d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0566  */
    /* JADX WARN: Code duplicated, block: B:237:0x0569  */
    /* JADX WARN: Code duplicated, block: B:243:0x0575  */
    /* JADX WARN: Code duplicated, block: B:246:0x0594  */
    /* JADX WARN: Code duplicated, block: B:247:0x059b  */
    /* JADX WARN: Code duplicated, block: B:249:0x059f  */
    /* JADX WARN: Code duplicated, block: B:250:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:253:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:256:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:258:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:259:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:265:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:268:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:269:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:271:0x0602  */
    /* JADX WARN: Code duplicated, block: B:273:0x061c  */
    /* JADX WARN: Code duplicated, block: B:275:0x0620  */
    /* JADX WARN: Code duplicated, block: B:277:0x0624  */
    /* JADX WARN: Code duplicated, block: B:279:0x0628  */
    /* JADX WARN: Code duplicated, block: B:289:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0439 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x05d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:61:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0205  */
    /* JADX WARN: Code duplicated, block: B:87:0x020c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0210  */
    /* JADX WARN: Code duplicated, block: B:91:0x0218  */
    /* JADX WARN: Code duplicated, block: B:94:0x0228  */
    /* JADX WARN: Code duplicated, block: B:96:0x022c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0265  */
    public static final void c(Float f14, u uVar, oz1.s sVar, List<oz1.a> list, m mVar, int i14) {
        c2.j.e eVarI;
        j92.b bVar;
        h5.g.a.f fVar;
        u2 u2Var;
        j92.b bVar2;
        u2 u2Var2;
        e0.a aVar;
        float f15;
        h5.g.a.e eVar;
        h5.g.a.b bVar3;
        h5.g.a.f fVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        oz1.a aVar2;
        Integer numValueOf;
        Integer numValueOf2;
        oz1.a aVar3;
        Integer numValueOf3;
        Integer numValueOf4;
        s2 s2VarA2;
        int iHashCode3;
        i2 i2VarA2;
        r rVarC3;
        e0.a aVar4;
        h5.g.a.b bVar4;
        oz1.a aVar5;
        Integer numValueOf5;
        Integer numValueOf6;
        oz1.a aVar6;
        Integer numValueOf7;
        Integer numValueOf8;
        s2 s2VarA3;
        int iHashCode4;
        i2 i2VarA3;
        r rVarC4;
        e0.a aVar7;
        h5.g.a.b bVar5;
        oz1.a aVar8;
        Integer numValueOf9;
        Integer numValueOf10;
        oz1.a aVar9;
        Integer numValueOf11;
        Iterator<T> it;
        Object next;
        oz1.a aVar10;
        oz1.c cVar;
        Iterator<T> it3;
        Object next2;
        oz1.a aVar11;
        oz1.c cVar2;
        Iterator<T> it4;
        Object next3;
        oz1.a aVar12;
        oz1.c cVar3;
        Iterator<T> it5;
        Object next4;
        oz1.a aVar13;
        oz1.c cVar4;
        Iterator<T> it6;
        Object next5;
        oz1.a aVar14;
        oz1.c cVar5;
        Iterator<T> it7;
        Object next6;
        oz1.a aVar15;
        oz1.c cVar6;
        s2 s2VarA4;
        int iHashCode5;
        i2 i2VarA4;
        r rVarC5;
        Integer numValueOf12;
        Integer numValueOf13;
        Integer numValueOf14;
        Integer numValueOf15;
        o0 o0VarE = mVar.E(-1117788175);
        p3.c<?> cVar7 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(f14) ? 4 : 2) | (o0VarE.k(uVar == null ? -1 : uVar.ordinal()) ? 32 : 16) | (o0VarE.k(sVar != null ? sVar.ordinal() : -1) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            boolean z14 = f75992b >= 2.0f;
            r.a aVar16 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar6 = d92.b.f58625c;
            bVar6.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f16 = eVar2.f97920e;
            float f17 = eVar2.f97920e;
            bVar6.getClass();
            r rVarF = x2.f(c2.l.C(aVar16, 0.0f, f16, 0.0f, eVar2.f97920e, 5), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.b bVar7 = h4.d.a.f81534l;
            c2.j jVar = c2.j.f22691a;
            if (z14) {
                jVar.getClass();
                eVarI = c2.j.f22696f;
            } else {
                bVar6.getClass();
                float f18 = eVar2.f97921f;
                jVar.getClass();
                eVarI = c2.j.i(f18);
            }
            s2 s2VarA5 = q2.a(eVarI, bVar7, o0VarE, 48);
            int iHashCode6 = Long.hashCode(o0VarE.U);
            i2 i2VarA5 = o0VarE.a0();
            r rVarC6 = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar17 = h5.g.a.f81805b;
            if (cVar7 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar17);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, s2VarA5, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA5, o0VarE);
            h5.g.a.b bVar8 = h5.g.a.f81813j;
            if (o0VarE.T) {
                bVar = bVar6;
            } else {
                bVar = bVar6;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode6))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC6, o0VarE);
                u2Var = u2.f22900a;
                g6.f.a aVar18 = g6.f.f75994b;
                int i16 = i15 << 3;
                bVar2 = bVar;
                b.a(x2.q(aVar16, 64 * f75992b), f14, uVar, false, o0VarE, (i16 & 896) | (i16 & 112) | 3072, 0);
                o0VarE = o0VarE;
                if (z14) {
                    o0VarE.C(49191733);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(49113892);
                    if (uVar != null) {
                        numValueOf14 = Integer.valueOf(uVar.f134640c);
                    } else {
                        numValueOf14 = null;
                    }
                    if (sVar != null) {
                        numValueOf15 = Integer.valueOf(sVar.f134618c);
                    } else {
                        numValueOf15 = null;
                    }
                    d(numValueOf14, numValueOf15, o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (z14) {
                    o0VarE.C(-1145135367);
                    bVar2.getClass();
                    aVar = aVar17;
                    float f19 = eVar2.f97918c;
                    bVar2.getClass();
                    u2Var2 = u2Var;
                    r rVarF2 = x2.f(c2.l.C(aVar16, 0.0f, f19, 0.0f, eVar2.f97920e, 5), 1.0f);
                    f15 = f17;
                    s2VarA4 = q2.a(r1.q2.g(bVar2, c2.j.f22691a, f15), h4.d.a.f81533k, o0VarE, 0);
                    iHashCode5 = Long.hashCode(o0VarE.U);
                    i2VarA4 = o0VarE.a0();
                    rVarC5 = k.c(rVarF2, o0VarE);
                    if (cVar7 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    eVar = eVar3;
                    b4.c(eVar, s2VarA4, o0VarE);
                    b4.c(c1623g, i2VarA4, o0VarE);
                    if (o0VarE.T && s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                        bVar3 = bVar8;
                    } else {
                        bVar3 = bVar8;
                        v.h.A(iHashCode5, o0VarE, iHashCode5, bVar3);
                    }
                    fVar2 = fVar;
                    b4.c(fVar2, rVarC5, o0VarE);
                    if (uVar != null) {
                        numValueOf12 = Integer.valueOf(uVar.f134640c);
                    } else {
                        numValueOf12 = null;
                    }
                    if (sVar != null) {
                        numValueOf13 = Integer.valueOf(sVar.f134618c);
                    } else {
                        numValueOf13 = null;
                    }
                    d(numValueOf12, numValueOf13, o0VarE, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                } else {
                    u2Var2 = u2Var;
                    aVar = aVar17;
                    f15 = f17;
                    eVar = eVar3;
                    bVar3 = bVar8;
                    fVar2 = fVar;
                    o0VarE.C(-1144774031);
                    o0VarE.g0(false);
                }
                r rVarC7 = x2.c(aVar16, 1.0f);
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22698h, h4.d.a.f81536n, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC7, o0VarE);
                if (cVar7 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar2, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                r rVarF3 = x2.f(aVar16, 1.0f);
                bVar2.getClass();
                s2VarA = q2.a(c2.j.i(f15), h4.d.a.f81533k, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarF3, o0VarE);
                if (cVar7 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar2, rVarC2, o0VarE);
                if (list != null) {
                    it7 = list.iterator();
                    do {
                        if (it7.hasNext()) {
                            next6 = null;
                            break;
                        }
                        next6 = it7.next();
                        aVar15 = (oz1.a) next6;
                        if (aVar15 != null) {
                            cVar6 = aVar15.f134490a;
                        } else {
                            cVar6 = null;
                        }
                    } while (cVar6 != oz1.c.SLEEP_SCORE);
                    aVar2 = (oz1.a) next6;
                } else {
                    aVar2 = null;
                }
                r rVarA = u2Var2.a(r.S, 1.0f, true);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA2 = c2.l.A(rVarA, 0.0f, j92.b.f97899b.f97918c, 1);
                if (aVar2 != null) {
                    numValueOf = Integer.valueOf(aVar2.f134492c);
                } else {
                    numValueOf = null;
                }
                if (aVar2 != null) {
                    numValueOf2 = Integer.valueOf(aVar2.f134493d);
                } else {
                    numValueOf2 = null;
                }
                a(rVarA2, numValueOf, numValueOf2, R.string.sleep_title, o0VarE, 0);
                if (list != null) {
                    it6 = list.iterator();
                    do {
                        if (it6.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it6.next();
                        aVar14 = (oz1.a) next5;
                        if (aVar14 != null) {
                            cVar5 = aVar14.f134490a;
                        } else {
                            cVar5 = null;
                        }
                    } while (cVar5 != oz1.c.RECOVERY_TIME);
                    aVar3 = (oz1.a) next5;
                } else {
                    aVar3 = null;
                }
                r.a aVar19 = r.S;
                r rVarA3 = u2Var2.a(aVar19, 1.0f, true);
                d92.b.f58623a.getClass();
                j92.b bVar9 = d92.b.f58625c;
                bVar9.getClass();
                j92.e eVar4 = j92.b.f97899b;
                r rVarA4 = c2.l.A(rVarA3, 0.0f, eVar4.f97918c, 1);
                if (aVar3 != null) {
                    numValueOf3 = Integer.valueOf(aVar3.f134492c);
                } else {
                    numValueOf3 = null;
                }
                if (aVar3 != null) {
                    numValueOf4 = Integer.valueOf(aVar3.f134493d);
                } else {
                    numValueOf4 = null;
                }
                a(rVarA4, numValueOf3, numValueOf4, R.string.activities_training_effect_recovery, o0VarE, 0);
                o0VarE.g0(true);
                r rVarF4 = x2.f(aVar19, 1.0f);
                c2.j jVar2 = c2.j.f22691a;
                bVar9.getClass();
                float f22 = eVar4.f97920e;
                jVar2.getClass();
                c2.j.i iVarI = c2.j.i(f22);
                h4.d.f81522a.getClass();
                s2VarA2 = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
                x1 x1Var2 = p3.n.f135158a;
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = k.c(rVarF4, o0VarE);
                h5.g.V.getClass();
                aVar4 = h5.g.a.f81805b;
                if (cVar7 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA2, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA2, o0VarE);
                bVar4 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                u2 u2Var3 = u2.f22900a;
                if (list != null) {
                    it5 = list.iterator();
                    do {
                        if (it5.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it5.next();
                        aVar13 = (oz1.a) next4;
                        if (aVar13 != null) {
                            cVar4 = aVar13.f134490a;
                        } else {
                            cVar4 = null;
                        }
                    } while (cVar4 != oz1.c.HRV_STATUS);
                    aVar5 = (oz1.a) next4;
                } else {
                    aVar5 = null;
                }
                r rVarA5 = u2Var3.a(r.S, 1.0f, true);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA6 = c2.l.A(rVarA5, 0.0f, j92.b.f97899b.f97918c, 1);
                if (aVar5 != null) {
                    numValueOf5 = Integer.valueOf(aVar5.f134492c);
                } else {
                    numValueOf5 = null;
                }
                if (aVar5 != null) {
                    numValueOf6 = Integer.valueOf(aVar5.f134493d);
                } else {
                    numValueOf6 = null;
                }
                a(rVarA6, numValueOf5, numValueOf6, R.string.tr_factor_hrv_status, o0VarE, 0);
                if (list != null) {
                    it4 = list.iterator();
                    do {
                        if (it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                        aVar12 = (oz1.a) next3;
                        if (aVar12 != null) {
                            cVar3 = aVar12.f134490a;
                        } else {
                            cVar3 = null;
                        }
                    } while (cVar3 != oz1.c.ACUTE_LOAD);
                    aVar6 = (oz1.a) next3;
                } else {
                    aVar6 = null;
                }
                r.a aVar20 = r.S;
                r rVarA7 = u2Var3.a(aVar20, 1.0f, true);
                d92.b.f58623a.getClass();
                j92.b bVar10 = d92.b.f58625c;
                bVar10.getClass();
                j92.e eVar5 = j92.b.f97899b;
                r rVarA8 = c2.l.A(rVarA7, 0.0f, eVar5.f97918c, 1);
                if (aVar6 != null) {
                    numValueOf7 = Integer.valueOf(aVar6.f134492c);
                } else {
                    numValueOf7 = null;
                }
                if (aVar6 != null) {
                    numValueOf8 = Integer.valueOf(aVar6.f134493d);
                } else {
                    numValueOf8 = null;
                }
                a(rVarA8, numValueOf7, numValueOf8, R.string.tr_factor_acute_load, o0VarE, 0);
                o0VarE.g0(true);
                r rVarF5 = x2.f(aVar20, 1.0f);
                c2.j jVar3 = c2.j.f22691a;
                bVar10.getClass();
                float f24 = eVar5.f97920e;
                jVar3.getClass();
                c2.j.i iVarI2 = c2.j.i(f24);
                h4.d.f81522a.getClass();
                s2VarA3 = q2.a(iVarI2, h4.d.a.f81533k, o0VarE, 0);
                x1 x1Var3 = p3.n.f135158a;
                iHashCode4 = Long.hashCode(o0VarE.U);
                i2VarA3 = o0VarE.a0();
                rVarC4 = k.c(rVarF5, o0VarE);
                h5.g.V.getClass();
                aVar7 = h5.g.a.f81805b;
                if (cVar7 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA3, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA3, o0VarE);
                bVar5 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar5);
                }
                b4.c(h5.g.a.f81807d, rVarC4, o0VarE);
                u2 u2Var4 = u2.f22900a;
                if (list != null) {
                    it3 = list.iterator();
                    do {
                        if (it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        aVar11 = (oz1.a) next2;
                        if (aVar11 != null) {
                            cVar2 = aVar11.f134490a;
                        } else {
                            cVar2 = null;
                        }
                    } while (cVar2 != oz1.c.RECENT_SLEEP_SCORE);
                    aVar8 = (oz1.a) next2;
                } else {
                    aVar8 = null;
                }
                r rVarA9 = u2Var4.a(r.S, 1.0f, true);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA10 = c2.l.A(rVarA9, 0.0f, j92.b.f97899b.f97918c, 1);
                if (aVar8 != null) {
                    numValueOf9 = Integer.valueOf(aVar8.f134492c);
                } else {
                    numValueOf9 = null;
                }
                if (aVar8 != null) {
                    numValueOf10 = Integer.valueOf(aVar8.f134493d);
                } else {
                    numValueOf10 = null;
                }
                a(rVarA10, numValueOf9, numValueOf10, R.string.tr_factor_recent_sleep, o0VarE, 0);
                if (list != null) {
                    it = list.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        aVar10 = (oz1.a) next;
                        if (aVar10 != null) {
                            cVar = aVar10.f134490a;
                        } else {
                            cVar = null;
                        }
                    } while (cVar != oz1.c.RECENT_STRESS);
                    aVar9 = (oz1.a) next;
                } else {
                    aVar9 = null;
                }
                r rVarA11 = u2Var4.a(r.S, 1.0f, true);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA12 = c2.l.A(rVarA11, 0.0f, j92.b.f97899b.f97918c, 1);
                if (aVar9 != null) {
                    numValueOf11 = Integer.valueOf(aVar9.f134492c);
                } else {
                    numValueOf11 = null;
                }
                a(rVarA12, numValueOf11, aVar9 != null ? Integer.valueOf(aVar9.f134493d) : null, R.string.tr_factor_recent_stress, o0VarE, 0);
                o0VarE.g0(true);
                o0VarE.g0(true);
                x1 x1Var4 = p3.n.f135158a;
            }
            v.h.A(iHashCode6, o0VarE, iHashCode6, bVar8);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC6, o0VarE);
            u2Var = u2.f22900a;
            g6.f.a aVar110 = g6.f.f75994b;
            int i17 = i15 << 3;
            bVar2 = bVar;
            b.a(x2.q(aVar16, 64 * f75992b), f14, uVar, false, o0VarE, (i17 & 896) | (i17 & 112) | 3072, 0);
            o0VarE = o0VarE;
            if (z14) {
                o0VarE.C(49113892);
                if (uVar != null) {
                    numValueOf14 = Integer.valueOf(uVar.f134640c);
                } else {
                    numValueOf14 = null;
                }
                if (sVar != null) {
                    numValueOf15 = Integer.valueOf(sVar.f134618c);
                } else {
                    numValueOf15 = null;
                }
                d(numValueOf14, numValueOf15, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(49191733);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (z14) {
                o0VarE.C(-1145135367);
                bVar2.getClass();
                aVar = aVar17;
                float f110 = eVar2.f97918c;
                bVar2.getClass();
                u2Var2 = u2Var;
                r rVarF6 = x2.f(c2.l.C(aVar16, 0.0f, f110, 0.0f, eVar2.f97920e, 5), 1.0f);
                f15 = f17;
                s2VarA4 = q2.a(r1.q2.g(bVar2, c2.j.f22691a, f15), h4.d.a.f81533k, o0VarE, 0);
                iHashCode5 = Long.hashCode(o0VarE.U);
                i2VarA4 = o0VarE.a0();
                rVarC5 = k.c(rVarF6, o0VarE);
                if (cVar7 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar = eVar3;
                b4.c(eVar, s2VarA4, o0VarE);
                b4.c(c1623g, i2VarA4, o0VarE);
                if (o0VarE.T) {
                    bVar3 = bVar8;
                    v.h.A(iHashCode5, o0VarE, iHashCode5, bVar3);
                } else {
                    bVar3 = bVar8;
                    v.h.A(iHashCode5, o0VarE, iHashCode5, bVar3);
                }
                fVar2 = fVar;
                b4.c(fVar2, rVarC5, o0VarE);
                if (uVar != null) {
                    numValueOf12 = Integer.valueOf(uVar.f134640c);
                } else {
                    numValueOf12 = null;
                }
                if (sVar != null) {
                    numValueOf13 = Integer.valueOf(sVar.f134618c);
                } else {
                    numValueOf13 = null;
                }
                d(numValueOf12, numValueOf13, o0VarE, 0);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                u2Var2 = u2Var;
                aVar = aVar17;
                f15 = f17;
                eVar = eVar3;
                bVar3 = bVar8;
                fVar2 = fVar;
                o0VarE.C(-1144774031);
                o0VarE.g0(false);
            }
            r rVarC8 = x2.c(aVar16, 1.0f);
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22698h, h4.d.a.f81536n, o0VarE, 6);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC8, o0VarE);
            if (cVar7 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar2, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            r rVarF7 = x2.f(aVar16, 1.0f);
            bVar2.getClass();
            s2VarA = q2.a(c2.j.i(f15), h4.d.a.f81533k, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarF7, o0VarE);
            if (cVar7 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            if (list != null) {
                it7 = list.iterator();
                do {
                    if (it7.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it7.next();
                    aVar15 = (oz1.a) next6;
                    if (aVar15 != null) {
                        cVar6 = aVar15.f134490a;
                    } else {
                        cVar6 = null;
                    }
                } while (cVar6 != oz1.c.SLEEP_SCORE);
                aVar2 = (oz1.a) next6;
            } else {
                aVar2 = null;
            }
            r rVarA13 = u2Var2.a(r.S, 1.0f, true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA14 = c2.l.A(rVarA13, 0.0f, j92.b.f97899b.f97918c, 1);
            if (aVar2 != null) {
                numValueOf = Integer.valueOf(aVar2.f134492c);
            } else {
                numValueOf = null;
            }
            if (aVar2 != null) {
                numValueOf2 = Integer.valueOf(aVar2.f134493d);
            } else {
                numValueOf2 = null;
            }
            a(rVarA14, numValueOf, numValueOf2, R.string.sleep_title, o0VarE, 0);
            if (list != null) {
                it6 = list.iterator();
                do {
                    if (it6.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it6.next();
                    aVar14 = (oz1.a) next5;
                    if (aVar14 != null) {
                        cVar5 = aVar14.f134490a;
                    } else {
                        cVar5 = null;
                    }
                } while (cVar5 != oz1.c.RECOVERY_TIME);
                aVar3 = (oz1.a) next5;
            } else {
                aVar3 = null;
            }
            r.a aVar111 = r.S;
            r rVarA15 = u2Var2.a(aVar111, 1.0f, true);
            d92.b.f58623a.getClass();
            j92.b bVar11 = d92.b.f58625c;
            bVar11.getClass();
            j92.e eVar6 = j92.b.f97899b;
            r rVarA16 = c2.l.A(rVarA15, 0.0f, eVar6.f97918c, 1);
            if (aVar3 != null) {
                numValueOf3 = Integer.valueOf(aVar3.f134492c);
            } else {
                numValueOf3 = null;
            }
            if (aVar3 != null) {
                numValueOf4 = Integer.valueOf(aVar3.f134493d);
            } else {
                numValueOf4 = null;
            }
            a(rVarA16, numValueOf3, numValueOf4, R.string.activities_training_effect_recovery, o0VarE, 0);
            o0VarE.g0(true);
            r rVarF8 = x2.f(aVar111, 1.0f);
            c2.j jVar4 = c2.j.f22691a;
            bVar11.getClass();
            float f25 = eVar6.f97920e;
            jVar4.getClass();
            c2.j.i iVarI3 = c2.j.i(f25);
            h4.d.f81522a.getClass();
            s2VarA2 = q2.a(iVarI3, h4.d.a.f81533k, o0VarE, 0);
            x1 x1Var5 = p3.n.f135158a;
            iHashCode3 = Long.hashCode(o0VarE.U);
            i2VarA2 = o0VarE.a0();
            rVarC3 = k.c(rVarF8, o0VarE);
            h5.g.V.getClass();
            aVar4 = h5.g.a.f81805b;
            if (cVar7 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA2, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA2, o0VarE);
            bVar4 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
            u2 u2Var5 = u2.f22900a;
            if (list != null) {
                it5 = list.iterator();
                do {
                    if (it5.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it5.next();
                    aVar13 = (oz1.a) next4;
                    if (aVar13 != null) {
                        cVar4 = aVar13.f134490a;
                    } else {
                        cVar4 = null;
                    }
                } while (cVar4 != oz1.c.HRV_STATUS);
                aVar5 = (oz1.a) next4;
            } else {
                aVar5 = null;
            }
            r rVarA17 = u2Var5.a(r.S, 1.0f, true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA18 = c2.l.A(rVarA17, 0.0f, j92.b.f97899b.f97918c, 1);
            if (aVar5 != null) {
                numValueOf5 = Integer.valueOf(aVar5.f134492c);
            } else {
                numValueOf5 = null;
            }
            if (aVar5 != null) {
                numValueOf6 = Integer.valueOf(aVar5.f134493d);
            } else {
                numValueOf6 = null;
            }
            a(rVarA18, numValueOf5, numValueOf6, R.string.tr_factor_hrv_status, o0VarE, 0);
            if (list != null) {
                it4 = list.iterator();
                do {
                    if (it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                    aVar12 = (oz1.a) next3;
                    if (aVar12 != null) {
                        cVar3 = aVar12.f134490a;
                    } else {
                        cVar3 = null;
                    }
                } while (cVar3 != oz1.c.ACUTE_LOAD);
                aVar6 = (oz1.a) next3;
            } else {
                aVar6 = null;
            }
            r.a aVar21 = r.S;
            r rVarA19 = u2Var5.a(aVar21, 1.0f, true);
            d92.b.f58623a.getClass();
            j92.b bVar12 = d92.b.f58625c;
            bVar12.getClass();
            j92.e eVar7 = j92.b.f97899b;
            r rVarA20 = c2.l.A(rVarA19, 0.0f, eVar7.f97918c, 1);
            if (aVar6 != null) {
                numValueOf7 = Integer.valueOf(aVar6.f134492c);
            } else {
                numValueOf7 = null;
            }
            if (aVar6 != null) {
                numValueOf8 = Integer.valueOf(aVar6.f134493d);
            } else {
                numValueOf8 = null;
            }
            a(rVarA20, numValueOf7, numValueOf8, R.string.tr_factor_acute_load, o0VarE, 0);
            o0VarE.g0(true);
            r rVarF9 = x2.f(aVar21, 1.0f);
            c2.j jVar5 = c2.j.f22691a;
            bVar12.getClass();
            float f26 = eVar7.f97920e;
            jVar5.getClass();
            c2.j.i iVarI4 = c2.j.i(f26);
            h4.d.f81522a.getClass();
            s2VarA3 = q2.a(iVarI4, h4.d.a.f81533k, o0VarE, 0);
            x1 x1Var6 = p3.n.f135158a;
            iHashCode4 = Long.hashCode(o0VarE.U);
            i2VarA3 = o0VarE.a0();
            rVarC4 = k.c(rVarF9, o0VarE);
            h5.g.V.getClass();
            aVar7 = h5.g.a.f81805b;
            if (cVar7 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA3, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA3, o0VarE);
            bVar5 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar5);
            } else {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar5);
            }
            b4.c(h5.g.a.f81807d, rVarC4, o0VarE);
            u2 u2Var6 = u2.f22900a;
            if (list != null) {
                it3 = list.iterator();
                do {
                    if (it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    aVar11 = (oz1.a) next2;
                    if (aVar11 != null) {
                        cVar2 = aVar11.f134490a;
                    } else {
                        cVar2 = null;
                    }
                } while (cVar2 != oz1.c.RECENT_SLEEP_SCORE);
                aVar8 = (oz1.a) next2;
            } else {
                aVar8 = null;
            }
            r rVarA21 = u2Var6.a(r.S, 1.0f, true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA110 = c2.l.A(rVarA21, 0.0f, j92.b.f97899b.f97918c, 1);
            if (aVar8 != null) {
                numValueOf9 = Integer.valueOf(aVar8.f134492c);
            } else {
                numValueOf9 = null;
            }
            if (aVar8 != null) {
                numValueOf10 = Integer.valueOf(aVar8.f134493d);
            } else {
                numValueOf10 = null;
            }
            a(rVarA110, numValueOf9, numValueOf10, R.string.tr_factor_recent_sleep, o0VarE, 0);
            if (list != null) {
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    aVar10 = (oz1.a) next;
                    if (aVar10 != null) {
                        cVar = aVar10.f134490a;
                    } else {
                        cVar = null;
                    }
                } while (cVar != oz1.c.RECENT_STRESS);
                aVar9 = (oz1.a) next;
            } else {
                aVar9 = null;
            }
            r rVarA111 = u2Var6.a(r.S, 1.0f, true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA112 = c2.l.A(rVarA111, 0.0f, j92.b.f97899b.f97918c, 1);
            if (aVar9 != null) {
                numValueOf11 = Integer.valueOf(aVar9.f134492c);
            } else {
                numValueOf11 = null;
            }
            a(rVarA112, numValueOf11, aVar9 != null ? Integer.valueOf(aVar9.f134493d) : null, R.string.tr_factor_recent_stress, o0VarE, 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
            x1 x1Var7 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1(f14, uVar, sVar, list, i14, 14);
        }
    }

    public static final void d(Integer num, Integer num2, m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(-1148810907);
        int i16 = (o0VarE.B(num) ? 4 : 2) | i14 | (o0VarE.B(num2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            int iIntValue = R.string.no_value;
            String strQ = y.Q(o0VarE, num != null ? num.intValue() : R.string.no_value);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            p.f57793b.getClass();
            int i17 = p.f57795d;
            i15 = 1;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 1, 0, null, x0VarB, o0VarE, 0, 24960, 110590);
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            String strQ2 = y.Q(o0VarE, iIntValue);
            fVar.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 1, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, 0, 24960, 110590);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(num, num2, i14, i15);
        }
    }
}
