package f70;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import et1.b2;
import f2.o;
import f21.g0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j61.i;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.h0;
import p5.k0;
import p5.v;
import s5.x0;
import w5.f0;
import ww1.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(b70.h hVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(50195872);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            i iVar = hVar.f16304a;
            if (iVar == null) {
                o0VarE.C(736749756);
                r20.e.b(o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(736800317);
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC = l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC2 = k.c(rVarC, o0VarE);
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
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                j61.d dVar = hVar.f16305b;
                i.Companion companion = i.INSTANCE;
                int i16 = j61.d.f97317e << 3;
                c(iVar, dVar, o0VarE, i16);
                d(hVar.f16306c, hVar.f16305b, false, o0VarE, i16, 4);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(hVar, i14, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(u82.f<b70.h> fVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        fVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1991263916);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        int i16 = 3;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (fVar instanceof u82.f.c) {
                o0VarE.C(345149482);
                b70.h hVar = (b70.h) ((u82.f.c) fVar).f169497b;
                if (hVar != null) {
                    o0VarE.C(345211699);
                    i.Companion companion = i.INSTANCE;
                    a(hVar, o0VarE, j61.d.f97317e);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(345276024);
                    r20.e.b(o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else if (fVar instanceof u82.f.a) {
                o0VarE.C(345381269);
                r20.f.a(aVar, (i15 >> 3) & 14, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                if (!(fVar instanceof u82.f.b)) {
                    throw kg.f.h(o0VarE, 1950794919, false);
                }
                o0VarE.C(1950807096);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(fVar, aVar, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0346  */
    /* JADX WARN: Code duplicated, block: B:103:0x0388  */
    /* JADX WARN: Code duplicated, block: B:105:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:108:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:109:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:112:0x0401  */
    /* JADX WARN: Code duplicated, block: B:113:0x0407  */
    /* JADX WARN: Code duplicated, block: B:115:0x040a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0411  */
    /* JADX WARN: Code duplicated, block: B:118:0x0415  */
    /* JADX WARN: Code duplicated, block: B:119:0x0427  */
    /* JADX WARN: Code duplicated, block: B:121:0x0452  */
    /* JADX WARN: Code duplicated, block: B:122:0x0455  */
    /* JADX WARN: Code duplicated, block: B:128:0x0477  */
    /* JADX WARN: Code duplicated, block: B:131:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:133:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:140:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:146:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:149:0x055f  */
    /* JADX WARN: Code duplicated, block: B:152:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:154:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:157:0x060e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0611  */
    /* JADX WARN: Code duplicated, block: B:161:0x061a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0620  */
    /* JADX WARN: Code duplicated, block: B:164:0x0623  */
    /* JADX WARN: Code duplicated, block: B:165:0x062a  */
    /* JADX WARN: Code duplicated, block: B:167:0x062e  */
    /* JADX WARN: Code duplicated, block: B:168:0x063b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0666  */
    /* JADX WARN: Code duplicated, block: B:171:0x0669  */
    /* JADX WARN: Code duplicated, block: B:177:0x068b  */
    /* JADX WARN: Code duplicated, block: B:180:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:182:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:184:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:189:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:194:0x0706  */
    /* JADX WARN: Code duplicated, block: B:197:0x0749  */
    /* JADX WARN: Code duplicated, block: B:200:0x0789  */
    /* JADX WARN: Code duplicated, block: B:202:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:210:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:212:0x080a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0874  */
    /* JADX WARN: Code duplicated, block: B:217:0x0878  */
    /* JADX WARN: Code duplicated, block: B:219:0x087c  */
    /* JADX WARN: Code duplicated, block: B:81:0x027a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0281  */
    /* JADX WARN: Code duplicated, block: B:85:0x0289  */
    /* JADX WARN: Code duplicated, block: B:90:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d7  */
    /* JADX WARN: Instruction removed from duplicated block: B:168:0x063b, please report this as an issue */
    public static final void c(i iVar, j61.d dVar, m mVar, int i14) {
        int i15;
        i iVar2;
        String str;
        m.a.C2565a c2565a;
        z zVarA;
        m.a.C2565a c2565a2;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        Object objQ;
        x0 x0Var;
        e0.a aVar2;
        h5.g.a.b bVar2;
        Object objQ2;
        x0 x0Var2;
        final String strQ;
        j61.a aVar3;
        int i16;
        final String strQ2;
        Integer num;
        int iIntValue;
        Integer aerobicCapacity;
        String str2;
        String string;
        final String str3;
        boolean zB;
        Object objQ3;
        int i17;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        e0.a aVar4;
        h5.g.a.b bVar3;
        Object objQ4;
        h5.g.a.b bVar4;
        String str4;
        e0.a aVar5;
        Object objQ5;
        final String strQ3;
        j61.b bVar5;
        int i18;
        final String strQ4;
        Integer num2;
        int iIntValue2;
        Integer aerobicEndurance;
        String str5;
        final String str6;
        boolean zB2;
        Object objQ6;
        int i19;
        z zVarA3;
        int iHashCode3;
        i2 i2VarA2;
        r rVarC3;
        Object objQ7;
        Object objQ8;
        Object objQ9;
        iVar.getClass();
        o0 o0VarE = mVar.E(-697138031);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar6 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar6 = d92.b.f58625c;
            bVar6.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = l.A(aVar6, eVar.f97920e, 0.0f, 2);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar7 = h4.d.a.f81536n;
            z zVarA4 = y.a(kVar, aVar7, o0VarE, 0);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            r rVarC4 = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar8 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA4, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA3, o0VarE);
            h5.g.a.b bVar7 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar7);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC4, o0VarE);
            b0 b0Var = b0.f22601a;
            j61.k kVar2 = iVar.f97347a;
            int i24 = kVar2 != null ? kVar2.f97376b : 0;
            j61.l lVar = iVar.f97348b;
            int i25 = lVar != null ? lVar.f97396b : 0;
            Object objQ10 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a3 = m.a.f135155b;
            if (objQ10 == c2565a3) {
                objQ10 = new g0(20);
                o0VarE.K(objQ10);
            }
            r rVarC5 = v.c((e23.l) objQ10, aVar6, false);
            String strQ5 = gl1.y.Q(o0VarE, i24);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var3 = j92.f.f97930g;
            f0.f182097b.getClass();
            mh.c(strQ5, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0.a(x0Var3, 0L, 0L, f0.f182104i, null, 0L, null, null, 0, 0L, null, null, 16777211), o0VarE), o0VarE, 0, 0, 131068);
            String strQ6 = gl1.y.Q(o0VarE, i25);
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            bVar6.getClass();
            mh.c(strQ6, l.A(aVar6, 0.0f, eVar.f97920e, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            final String strQ7 = gl1.y.Q(o0VarE, R.string.activities_training_effect_anaerobic_capacity);
            j61.c cVar2 = iVar.f97349c;
            final String strQ8 = gl1.y.Q(o0VarE, cVar2 != null ? cVar2.f97316b : 0);
            Integer num3 = iVar.f97350d;
            final int iIntValue3 = num3 != null ? num3.intValue() : 0;
            Integer anaerobicCapacity = dVar != null ? dVar.getAnaerobicCapacity() : null;
            if (anaerobicCapacity == null) {
                o0VarE.C(-1959884183);
                o0VarE.g0(false);
                str = null;
            } else {
                o0VarE.C(-1959884182);
                int iIntValue4 = anaerobicCapacity.intValue();
                str = gl1.y.Q(o0VarE, R.string.lbl_course_demands) + ": " + iIntValue4;
                o0VarE.g0(false);
            }
            final String str7 = str == null ? "" : str;
            boolean zB3 = o0VarE.B(strQ7) | o0VarE.B(strQ8) | o0VarE.k(iIntValue3) | o0VarE.B(str7);
            Object objQ11 = o0VarE.q();
            if (zB3) {
                c2565a = c2565a3;
            } else {
                if (objQ11 != c2565a) {
                    c2565a = c2565a3;
                }
                r rVarB = v.b(aVar6, (e23.l) objQ11);
                zVarA = y.a(kVar, aVar7, o0VarE, 0);
                c2565a2 = c2565a;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarB, o0VarE);
                if (cVar != 0) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    aVar = aVar8;
                    o0VarE.M(aVar);
                } else {
                    aVar = aVar8;
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T && s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    bVar = bVar7;
                } else {
                    bVar = bVar7;
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                bVar6.getClass();
                r rVarA2 = l.A(aVar6, 0.0f, eVar.f97918c, 1);
                objQ = o0VarE.q();
                if (objQ == c2565a2) {
                    objQ = new g0(22);
                    o0VarE.K(objQ);
                }
                r rVarB2 = v.b(rVarA2, (e23.l) objQ);
                fVar2.getClass();
                x0Var = j92.f.f97932i;
                aVar2 = aVar;
                bVar2 = bVar;
                iVar2 = iVar;
                mh.c(strQ7, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a2) {
                    objQ2 = new g0(23);
                    o0VarE.K(objQ2);
                }
                r rVarB3 = v.b(aVar6, (e23.l) objQ2);
                fVar2.getClass();
                x0Var2 = j92.f.f97935l;
                mh.c(strQ8, rVarB3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 131068);
                if (anaerobicCapacity != null) {
                    o0VarE.C(1394976320);
                    int iIntValue5 = anaerobicCapacity.intValue();
                    gl.c.f77766a.getClass();
                    long jK = gl.c.a(o0VarE).k();
                    bVar6.getClass();
                    r20.d.a(iIntValue3, iIntValue5, jK, l.y(aVar6, eVar.f97917b), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1395302874);
                    gl.c.f77766a.getClass();
                    long jK2 = gl.c.a(o0VarE).k();
                    bVar6.getClass();
                    e70.b.a(iIntValue3, 0, jK2, l.y(aVar6, eVar.f97917b), o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                bVar6.getClass();
                l.f(x2.h(aVar6, eVar.f97918c), o0VarE);
                strQ = gl1.y.Q(o0VarE, R.string.lbl_aerobic_capacity);
                aVar3 = iVar2.f97351e;
                if (aVar3 != null) {
                    i16 = aVar3.f97276b;
                } else {
                    i16 = 0;
                }
                strQ2 = gl1.y.Q(o0VarE, i16);
                num = iVar2.f97352f;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (dVar != null) {
                    aerobicCapacity = dVar.getAerobicCapacity();
                } else {
                    aerobicCapacity = null;
                }
                if (aerobicCapacity == null) {
                    o0VarE.C(-1957876375);
                    o0VarE.g0(false);
                    string = null;
                    str2 = ": ";
                } else {
                    o0VarE.C(-1957876374);
                    int iIntValue6 = aerobicCapacity.intValue();
                    String strQ9 = gl1.y.Q(o0VarE, R.string.lbl_course_demands);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(strQ9);
                    str2 = ": ";
                    sb3.append(str2);
                    sb3.append(iIntValue6);
                    string = sb3.toString();
                    o0VarE.g0(false);
                }
                if (string == null) {
                    str3 = "";
                } else {
                    str3 = string;
                }
                zB = o0VarE.B(strQ) | o0VarE.B(strQ2) | o0VarE.k(iIntValue) | o0VarE.B(str3);
                objQ3 = o0VarE.q();
                if (!zB || objQ3 == c2565a2) {
                    final int i26 = 0;
                    final int i27 = iIntValue;
                    e23.l lVar2 = new e23.l() { // from class: f70.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            k0 k0Var = (k0) obj;
                            switch (i26) {
                                case 0:
                                    k0Var.getClass();
                                    h0.n(k0Var, strQ + ", " + strQ2 + ", " + i27 + ", " + str3);
                                    break;
                                case 1:
                                    k0Var.getClass();
                                    h0.n(k0Var, strQ + ", " + strQ2 + ", " + i27 + ", " + str3);
                                    break;
                                default:
                                    k0Var.getClass();
                                    h0.n(k0Var, strQ + ", " + strQ2 + ", " + i27 + ", " + str3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    i17 = i27;
                    o0VarE.K(lVar2);
                    objQ3 = lVar2;
                } else {
                    i17 = iIntValue;
                }
                r rVarB4 = v.b(aVar6, (e23.l) objQ3);
                zVarA2 = y.a(kVar, aVar7, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.getU());
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarB4, o0VarE);
                if (cVar != 0) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    aVar4 = aVar2;
                    o0VarE.M(aVar4);
                } else {
                    aVar4 = aVar2;
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T && s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    bVar3 = bVar2;
                } else {
                    bVar3 = bVar2;
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                bVar6.getClass();
                r rVarA3 = l.A(aVar6, 0.0f, eVar.f97918c, 1);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a2) {
                    objQ4 = new g0(16);
                    o0VarE.K(objQ4);
                }
                r rVarB5 = v.b(rVarA3, (e23.l) objQ4);
                fVar2.getClass();
                bVar4 = bVar3;
                str4 = str2;
                aVar5 = aVar4;
                mh.c(strQ, rVarB5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a2) {
                    objQ5 = new g0(17);
                    o0VarE.K(objQ5);
                }
                r rVarB6 = v.b(aVar6, (e23.l) objQ5);
                fVar2.getClass();
                mh.c(strQ2, rVarB6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 131068);
                if (aerobicCapacity != null) {
                    o0VarE.C(-844213395);
                    int iIntValue7 = aerobicCapacity.intValue();
                    gl.c.f77766a.getClass();
                    long jI = gl.c.a(o0VarE).i();
                    bVar6.getClass();
                    r20.d.a(i17, iIntValue7, jI, l.y(aVar6, eVar.f97917b), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-843890747);
                    gl.c.f77766a.getClass();
                    long jI2 = gl.c.a(o0VarE).i();
                    bVar6.getClass();
                    e70.b.a(i17, 0, jI2, l.y(aVar6, eVar.f97917b), o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                bVar6.getClass();
                l.f(x2.h(aVar6, eVar.f97918c), o0VarE);
                strQ3 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                bVar5 = iVar2.f97353g;
                if (bVar5 != null) {
                    i18 = bVar5.f97300b;
                } else {
                    i18 = 0;
                }
                strQ4 = gl1.y.Q(o0VarE, i18);
                num2 = iVar2.f97354h;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (dVar != null) {
                    aerobicEndurance = dVar.getAerobicEndurance();
                } else {
                    aerobicEndurance = null;
                }
                if (aerobicEndurance == null) {
                    o0VarE.C(-1955897335);
                    o0VarE.g0(false);
                    str5 = null;
                } else {
                    o0VarE.C(-1955897334);
                    int iIntValue8 = aerobicEndurance.intValue();
                    str5 = gl1.y.Q(o0VarE, R.string.lbl_course_demands) + str4 + iIntValue8;
                    o0VarE.g0(false);
                }
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                zB2 = o0VarE.B(strQ3) | o0VarE.B(strQ4) | o0VarE.k(iIntValue2) | o0VarE.B(str6);
                objQ6 = o0VarE.q();
                if (!zB2 || objQ6 == c2565a2) {
                    final int i28 = 1;
                    final int i29 = iIntValue2;
                    e23.l lVar3 = new e23.l() { // from class: f70.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            k0 k0Var = (k0) obj;
                            switch (i28) {
                                case 0:
                                    k0Var.getClass();
                                    h0.n(k0Var, strQ3 + ", " + strQ4 + ", " + i29 + ", " + str6);
                                    break;
                                case 1:
                                    k0Var.getClass();
                                    h0.n(k0Var, strQ3 + ", " + strQ4 + ", " + i29 + ", " + str6);
                                    break;
                                default:
                                    k0Var.getClass();
                                    h0.n(k0Var, strQ3 + ", " + strQ4 + ", " + i29 + ", " + str6);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    i19 = i29;
                    o0VarE.K(lVar3);
                    objQ6 = lVar3;
                } else {
                    i19 = iIntValue2;
                }
                r rVarB7 = v.b(aVar6, (e23.l) objQ6);
                zVarA3 = y.a(kVar, aVar7, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.getU());
                i2VarA2 = o0VarE.a0();
                rVarC3 = k.c(rVarB7, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA3, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                }
                b4.c(fVar, rVarC3, o0VarE);
                bVar6.getClass();
                r rVarA4 = l.A(aVar6, 0.0f, eVar.f97918c, 1);
                objQ7 = o0VarE.q();
                if (objQ7 == c2565a2) {
                    objQ7 = new g0(18);
                    o0VarE.K(objQ7);
                }
                r rVarB8 = v.b(rVarA4, (e23.l) objQ7);
                fVar2.getClass();
                mh.c(strQ3, rVarB8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                objQ8 = o0VarE.q();
                if (objQ8 == c2565a2) {
                    objQ8 = new g0(19);
                    o0VarE.K(objQ8);
                }
                r rVarB9 = v.b(aVar6, (e23.l) objQ8);
                fVar2.getClass();
                mh.c(strQ4, rVarB9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 131068);
                if (aerobicEndurance != null) {
                    o0VarE.C(-185826548);
                    int iIntValue9 = aerobicEndurance.intValue();
                    gl.c.f77766a.getClass();
                    long jO = gl.c.a(o0VarE).o();
                    bVar6.getClass();
                    r20.d.a(i19, iIntValue9, jO, l.y(aVar6, eVar.f97917b), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-185503931);
                    gl.c.f77766a.getClass();
                    long jO2 = gl.c.a(o0VarE).o();
                    bVar6.getClass();
                    e70.b.a(i19, 0, jO2, l.y(aVar6, eVar.f97917b), o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                bVar6.getClass();
                l.f(x2.h(aVar6, eVar.f97918c), o0VarE);
                if (anaerobicCapacity != null && aerobicCapacity == null && aerobicEndurance == null) {
                    o0VarE.C(-1954164837);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1954239795);
                    objQ9 = o0VarE.q();
                    if (objQ9 == c2565a2) {
                        objQ9 = new g0(21);
                        o0VarE.K(objQ9);
                    }
                    r20.a.a(v.b(aVar6, (e23.l) objQ9), o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                String strQ10 = gl1.y.Q(o0VarE, R.string.lbl_message_cycling_ability_record_all_your_activities);
                fVar2.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                r rVarE = u1.n.e(aVar6, d92.b.a(o0VarE).c().b(), m1.f128891a);
                bVar6.getClass();
                mh.c(strQ10, l.y(rVarE, eVar.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
            }
            c2565a = c2565a3;
            final int i30 = 2;
            e23.l lVar4 = new e23.l() { // from class: f70.a
                @Override // e23.l
                public final Object invoke(Object obj) {
                    k0 k0Var = (k0) obj;
                    switch (i30) {
                        case 0:
                            k0Var.getClass();
                            h0.n(k0Var, strQ7 + ", " + strQ8 + ", " + iIntValue3 + ", " + str7);
                            break;
                        case 1:
                            k0Var.getClass();
                            h0.n(k0Var, strQ7 + ", " + strQ8 + ", " + iIntValue3 + ", " + str7);
                            break;
                        default:
                            k0Var.getClass();
                            h0.n(k0Var, strQ7 + ", " + strQ8 + ", " + iIntValue3 + ", " + str7);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            o0VarE.K(lVar4);
            objQ11 = lVar4;
            r rVarB10 = v.b(aVar6, (e23.l) objQ11);
            zVarA = y.a(kVar, aVar7, o0VarE, 0);
            c2565a2 = c2565a;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarB10, o0VarE);
            if (cVar != 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar = aVar8;
                o0VarE.M(aVar);
            } else {
                aVar = aVar8;
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                bVar = bVar7;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                bVar = bVar7;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            bVar6.getClass();
            r rVarA5 = l.A(aVar6, 0.0f, eVar.f97918c, 1);
            objQ = o0VarE.q();
            if (objQ == c2565a2) {
                objQ = new g0(22);
                o0VarE.K(objQ);
            }
            r rVarB11 = v.b(rVarA5, (e23.l) objQ);
            fVar2.getClass();
            x0Var = j92.f.f97932i;
            aVar2 = aVar;
            bVar2 = bVar;
            iVar2 = iVar;
            mh.c(strQ7, rVarB11, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = new g0(23);
                o0VarE.K(objQ2);
            }
            r rVarB12 = v.b(aVar6, (e23.l) objQ2);
            fVar2.getClass();
            x0Var2 = j92.f.f97935l;
            mh.c(strQ8, rVarB12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 131068);
            if (anaerobicCapacity != null) {
                o0VarE.C(1394976320);
                int iIntValue10 = anaerobicCapacity.intValue();
                gl.c.f77766a.getClass();
                long jK3 = gl.c.a(o0VarE).k();
                bVar6.getClass();
                r20.d.a(iIntValue3, iIntValue10, jK3, l.y(aVar6, eVar.f97917b), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1395302874);
                gl.c.f77766a.getClass();
                long jK4 = gl.c.a(o0VarE).k();
                bVar6.getClass();
                e70.b.a(iIntValue3, 0, jK4, l.y(aVar6, eVar.f97917b), o0VarE);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            bVar6.getClass();
            l.f(x2.h(aVar6, eVar.f97918c), o0VarE);
            strQ = gl1.y.Q(o0VarE, R.string.lbl_aerobic_capacity);
            aVar3 = iVar2.f97351e;
            if (aVar3 != null) {
                i16 = aVar3.f97276b;
            } else {
                i16 = 0;
            }
            strQ2 = gl1.y.Q(o0VarE, i16);
            num = iVar2.f97352f;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (dVar != null) {
                aerobicCapacity = dVar.getAerobicCapacity();
            } else {
                aerobicCapacity = null;
            }
            if (aerobicCapacity == null) {
                o0VarE.C(-1957876375);
                o0VarE.g0(false);
                string = null;
                str2 = ": ";
            } else {
                o0VarE.C(-1957876374);
                int iIntValue11 = aerobicCapacity.intValue();
                String strQ11 = gl1.y.Q(o0VarE, R.string.lbl_course_demands);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(strQ11);
                str2 = ": ";
                sb4.append(str2);
                sb4.append(iIntValue11);
                string = sb4.toString();
                o0VarE.g0(false);
            }
            if (string == null) {
                str3 = "";
            } else {
                str3 = string;
            }
            zB = o0VarE.B(strQ) | o0VarE.B(strQ2) | o0VarE.k(iIntValue) | o0VarE.B(str3);
            objQ3 = o0VarE.q();
            if (zB) {
                final int i210 = 0;
                final int i211 = iIntValue;
                e23.l lVar5 = new e23.l() { // from class: f70.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        k0 k0Var = (k0) obj;
                        switch (i210) {
                            case 0:
                                k0Var.getClass();
                                h0.n(k0Var, strQ + ", " + strQ2 + ", " + i211 + ", " + str3);
                                break;
                            case 1:
                                k0Var.getClass();
                                h0.n(k0Var, strQ + ", " + strQ2 + ", " + i211 + ", " + str3);
                                break;
                            default:
                                k0Var.getClass();
                                h0.n(k0Var, strQ + ", " + strQ2 + ", " + i211 + ", " + str3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                i17 = i211;
                o0VarE.K(lVar5);
                objQ3 = lVar5;
            } else {
                final int i212 = 0;
                final int i213 = iIntValue;
                e23.l lVar6 = new e23.l() { // from class: f70.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        k0 k0Var = (k0) obj;
                        switch (i212) {
                            case 0:
                                k0Var.getClass();
                                h0.n(k0Var, strQ + ", " + strQ2 + ", " + i213 + ", " + str3);
                                break;
                            case 1:
                                k0Var.getClass();
                                h0.n(k0Var, strQ + ", " + strQ2 + ", " + i213 + ", " + str3);
                                break;
                            default:
                                k0Var.getClass();
                                h0.n(k0Var, strQ + ", " + strQ2 + ", " + i213 + ", " + str3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                i17 = i213;
                o0VarE.K(lVar6);
                objQ3 = lVar6;
            }
            r rVarB13 = v.b(aVar6, (e23.l) objQ3);
            zVarA2 = y.a(kVar, aVar7, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.getU());
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarB13, o0VarE);
            if (cVar != 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar4 = aVar2;
                o0VarE.M(aVar4);
            } else {
                aVar4 = aVar2;
                o0VarE.c();
            }
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                bVar3 = bVar2;
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                bVar3 = bVar2;
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            bVar6.getClass();
            r rVarA6 = l.A(aVar6, 0.0f, eVar.f97918c, 1);
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = new g0(16);
                o0VarE.K(objQ4);
            }
            r rVarB14 = v.b(rVarA6, (e23.l) objQ4);
            fVar2.getClass();
            bVar4 = bVar3;
            str4 = str2;
            aVar5 = aVar4;
            mh.c(strQ, rVarB14, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = new g0(17);
                o0VarE.K(objQ5);
            }
            r rVarB15 = v.b(aVar6, (e23.l) objQ5);
            fVar2.getClass();
            mh.c(strQ2, rVarB15, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 131068);
            if (aerobicCapacity != null) {
                o0VarE.C(-844213395);
                int iIntValue12 = aerobicCapacity.intValue();
                gl.c.f77766a.getClass();
                long jI3 = gl.c.a(o0VarE).i();
                bVar6.getClass();
                r20.d.a(i17, iIntValue12, jI3, l.y(aVar6, eVar.f97917b), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-843890747);
                gl.c.f77766a.getClass();
                long jI4 = gl.c.a(o0VarE).i();
                bVar6.getClass();
                e70.b.a(i17, 0, jI4, l.y(aVar6, eVar.f97917b), o0VarE);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            bVar6.getClass();
            l.f(x2.h(aVar6, eVar.f97918c), o0VarE);
            strQ3 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
            bVar5 = iVar2.f97353g;
            if (bVar5 != null) {
                i18 = bVar5.f97300b;
            } else {
                i18 = 0;
            }
            strQ4 = gl1.y.Q(o0VarE, i18);
            num2 = iVar2.f97354h;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (dVar != null) {
                aerobicEndurance = dVar.getAerobicEndurance();
            } else {
                aerobicEndurance = null;
            }
            if (aerobicEndurance == null) {
                o0VarE.C(-1955897335);
                o0VarE.g0(false);
                str5 = null;
            } else {
                o0VarE.C(-1955897334);
                int iIntValue13 = aerobicEndurance.intValue();
                str5 = gl1.y.Q(o0VarE, R.string.lbl_course_demands) + str4 + iIntValue13;
                o0VarE.g0(false);
            }
            if (str5 == null) {
                str6 = "";
            } else {
                str6 = str5;
            }
            zB2 = o0VarE.B(strQ3) | o0VarE.B(strQ4) | o0VarE.k(iIntValue2) | o0VarE.B(str6);
            objQ6 = o0VarE.q();
            if (zB2) {
                final int i214 = 1;
                final int i215 = iIntValue2;
                e23.l lVar7 = new e23.l() { // from class: f70.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        k0 k0Var = (k0) obj;
                        switch (i214) {
                            case 0:
                                k0Var.getClass();
                                h0.n(k0Var, strQ3 + ", " + strQ4 + ", " + i215 + ", " + str6);
                                break;
                            case 1:
                                k0Var.getClass();
                                h0.n(k0Var, strQ3 + ", " + strQ4 + ", " + i215 + ", " + str6);
                                break;
                            default:
                                k0Var.getClass();
                                h0.n(k0Var, strQ3 + ", " + strQ4 + ", " + i215 + ", " + str6);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                i19 = i215;
                o0VarE.K(lVar7);
                objQ6 = lVar7;
            } else {
                final int i216 = 1;
                final int i217 = iIntValue2;
                e23.l lVar8 = new e23.l() { // from class: f70.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        k0 k0Var = (k0) obj;
                        switch (i216) {
                            case 0:
                                k0Var.getClass();
                                h0.n(k0Var, strQ3 + ", " + strQ4 + ", " + i217 + ", " + str6);
                                break;
                            case 1:
                                k0Var.getClass();
                                h0.n(k0Var, strQ3 + ", " + strQ4 + ", " + i217 + ", " + str6);
                                break;
                            default:
                                k0Var.getClass();
                                h0.n(k0Var, strQ3 + ", " + strQ4 + ", " + i217 + ", " + str6);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                i19 = i217;
                o0VarE.K(lVar8);
                objQ6 = lVar8;
            }
            r rVarB16 = v.b(aVar6, (e23.l) objQ6);
            zVarA3 = y.a(kVar, aVar7, o0VarE, 0);
            iHashCode3 = Long.hashCode(o0VarE.getU());
            i2VarA2 = o0VarE.a0();
            rVarC3 = k.c(rVarB16, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA3, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
            }
            b4.c(fVar, rVarC3, o0VarE);
            bVar6.getClass();
            r rVarA7 = l.A(aVar6, 0.0f, eVar.f97918c, 1);
            objQ7 = o0VarE.q();
            if (objQ7 == c2565a2) {
                objQ7 = new g0(18);
                o0VarE.K(objQ7);
            }
            r rVarB17 = v.b(rVarA7, (e23.l) objQ7);
            fVar2.getClass();
            mh.c(strQ3, rVarB17, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            objQ8 = o0VarE.q();
            if (objQ8 == c2565a2) {
                objQ8 = new g0(19);
                o0VarE.K(objQ8);
            }
            r rVarB18 = v.b(aVar6, (e23.l) objQ8);
            fVar2.getClass();
            mh.c(strQ4, rVarB18, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 131068);
            if (aerobicEndurance != null) {
                o0VarE.C(-185826548);
                int iIntValue14 = aerobicEndurance.intValue();
                gl.c.f77766a.getClass();
                long jO3 = gl.c.a(o0VarE).o();
                bVar6.getClass();
                r20.d.a(i19, iIntValue14, jO3, l.y(aVar6, eVar.f97917b), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-185503931);
                gl.c.f77766a.getClass();
                long jO4 = gl.c.a(o0VarE).o();
                bVar6.getClass();
                e70.b.a(i19, 0, jO4, l.y(aVar6, eVar.f97917b), o0VarE);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            bVar6.getClass();
            l.f(x2.h(aVar6, eVar.f97918c), o0VarE);
            if (anaerobicCapacity != null) {
                o0VarE.C(-1954239795);
                objQ9 = o0VarE.q();
                if (objQ9 == c2565a2) {
                    objQ9 = new g0(21);
                    o0VarE.K(objQ9);
                }
                r20.a.a(v.b(aVar6, (e23.l) objQ9), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1954239795);
                objQ9 = o0VarE.q();
                if (objQ9 == c2565a2) {
                    objQ9 = new g0(21);
                    o0VarE.K(objQ9);
                }
                r20.a.a(v.b(aVar6, (e23.l) objQ9), o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            String strQ12 = gl1.y.Q(o0VarE, R.string.lbl_message_cycling_ability_record_all_your_activities);
            fVar2.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0VarE);
            r rVarE2 = u1.n.e(aVar6, d92.b.a(o0VarE).c().b(), m1.f128891a);
            bVar6.getClass();
            mh.c(strQ12, l.y(rVarE2, eVar.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
        } else {
            iVar2 = iVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(iVar2, dVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x0261  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0308 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final k61.b bVar, final j61.d dVar, boolean z14, m mVar, final int i14, final int i15) {
        int i16;
        boolean z15;
        boolean z16;
        final boolean z17;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        boolean z18;
        i53.c<DateTime> cVar;
        Object objQ;
        m.a.C2565a c2565a;
        p1 p1Var;
        r.a aVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar2;
        Float fValueOf;
        j92.b bVar3;
        float f14;
        m1.a aVar3;
        Float fValueOf2;
        Float fValueOf3;
        i53.c<a0> cVar2;
        Object objQ2;
        Integer aerobicEndurance;
        Integer aerobicCapacity;
        Integer anaerobicCapacity;
        o0 o0VarE = mVar.E(844975719);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                x1 x1Var = n.f135158a;
                if (bVar == null) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        return;
                    }
                    final int i18 = 0;
                    final boolean z19 = z18;
                    pVar = new p() { // from class: f70.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i18) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    c.d(bVar, dVar, z19, (m) obj, p0.t(i14 | 1), i15);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    c.d(bVar, dVar, z19, (m) obj, p0.t(i14 | 1), i15);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    cVar = bVar.f103165c;
                    objQ = o0VarE.q();
                    m.f135153a.getClass();
                    c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p0.n(null);
                        o0VarE.K(objQ);
                    }
                    p1Var = (p1) objQ;
                    aVar = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(aVar, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
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
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(o0VarE, R.string.activities_training_effect_anaerobic_capacity);
                    gl.c.f77766a.getClass();
                    long jK = gl.c.a(o0VarE).k();
                    DateTime dateTime = bVar.f103163a;
                    DateTime dateTime2 = bVar.f103164b;
                    j61.h hVar = bVar.f103167e;
                    i53.c<k61.a> cVar3 = bVar.f103168f;
                    if (dVar != null || (anaerobicCapacity = dVar.getAnaerobicCapacity()) == null) {
                        fValueOf = null;
                    } else {
                        fValueOf = Float.valueOf(anaerobicCapacity.intValue());
                    }
                    d70.k kVar2 = new d70.k(strQ, jK, dateTime, dateTime2, hVar, cVar3, fValueOf, gl.c.a(o0VarE).f(), cVar.size(), z18, null);
                    d92.b.f58623a.getClass();
                    bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f15 = eVar.f97920e;
                    f14 = eVar.f97918c;
                    bVar3.getClass();
                    float f16 = eVar.f97920e;
                    bVar3.getClass();
                    d70.o.c(l.C(aVar, f15, 0.0f, f16, eVar.f97918c, 2), kVar2, (a0) p1Var.getF182175a(), o0VarE, 0);
                    r rVarF = x2.f(aVar, 1.0f);
                    bVar3.getClass();
                    r rVarH = x2.h(rVarF, f14);
                    long jB = d92.b.a(o0VarE).c().b();
                    aVar3 = m1.f128891a;
                    l.f(u1.n.e(rVarH, jB, aVar3), o0VarE);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_capacity);
                    long jI = gl.c.a(o0VarE).i();
                    DateTime dateTime3 = bVar.f103163a;
                    DateTime dateTime4 = bVar.f103164b;
                    j61.h hVar2 = bVar.f103167e;
                    i53.c<k61.a> cVar4 = bVar.f103169g;
                    if (dVar != null || (aerobicCapacity = dVar.getAerobicCapacity()) == null) {
                        fValueOf2 = null;
                    } else {
                        fValueOf2 = Float.valueOf(aerobicCapacity.intValue());
                    }
                    d70.k kVar3 = new d70.k(strQ2, jI, dateTime3, dateTime4, hVar2, cVar4, fValueOf2, gl.c.a(o0VarE).f(), cVar.size(), z18, null);
                    bVar3.getClass();
                    float f17 = eVar.f97920e;
                    bVar3.getClass();
                    float f18 = eVar.f97920e;
                    bVar3.getClass();
                    d70.o.c(l.C(aVar, f17, 0.0f, f18, eVar.f97918c, 2), kVar3, (a0) p1Var.getF182175a(), o0VarE, 0);
                    r rVarF2 = x2.f(aVar, 1.0f);
                    bVar3.getClass();
                    l.f(u1.n.e(x2.h(rVarF2, f14), d92.b.a(o0VarE).c().b(), aVar3), o0VarE);
                    String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                    long jO = gl.c.a(o0VarE).o();
                    DateTime dateTime5 = bVar.f103163a;
                    DateTime dateTime6 = bVar.f103164b;
                    j61.h hVar3 = bVar.f103167e;
                    i53.c<k61.a> cVar5 = bVar.f103170h;
                    if (dVar != null || (aerobicEndurance = dVar.getAerobicEndurance()) == null) {
                        fValueOf3 = null;
                    } else {
                        fValueOf3 = Float.valueOf(aerobicEndurance.intValue());
                    }
                    d70.k kVar4 = new d70.k(strQ3, jO, dateTime5, dateTime6, hVar3, cVar5, fValueOf3, gl.c.a(o0VarE).f(), cVar.size(), z18, null);
                    bVar3.getClass();
                    float f19 = eVar.f97920e;
                    bVar3.getClass();
                    float f22 = eVar.f97920e;
                    bVar3.getClass();
                    d70.o.c(l.C(aVar, f19, 0.0f, f22, eVar.f97918c, 2), kVar4, (a0) p1Var.getF182175a(), o0VarE, 0);
                    o0VarE.g0(true);
                    cVar2 = bVar.f103166d;
                    if (cVar2 == null) {
                        o0VarE.C(-127992094);
                        o0VarE.g0(false);
                    } else {
                        l.f(u1.n.e(x2.h(ds.e0.g(o0VarE, -127992093, aVar, 1.0f, bVar3), f14), d92.b.a(o0VarE).c().b(), aVar3), o0VarE);
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new b2(p1Var, 13);
                            o0VarE.K(objQ2);
                        }
                        e70.c.a(cVar2, (e23.l) objQ2, o0VarE, 48);
                        o0VarE.g0(false);
                    }
                    z17 = z18;
                }
                p2VarI0.f135219d = pVar;
            }
            o0VarE.e();
            z17 = z15;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final int i19 = 1;
                pVar = new p() { // from class: f70.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i19) {
                            case 0:
                                ((Integer) obj2).getClass();
                                c.d(bVar, dVar, z17, (m) obj, p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                c.d(bVar, dVar, z17, (m) obj, p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p2VarI0.f135219d = pVar;
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i16 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i17 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = n.f135158a;
            if (bVar == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    return;
                }
                final int i110 = 0;
                final boolean z110 = z18;
                pVar = new p() { // from class: f70.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i110) {
                            case 0:
                                ((Integer) obj2).getClass();
                                c.d(bVar, dVar, z110, (m) obj, p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                c.d(bVar, dVar, z110, (m) obj, p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                cVar = bVar.f103165c;
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(null);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                aVar = r.S;
                j.f22691a.getClass();
                j.k kVar5 = j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar5, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(aVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                String strQ4 = gl1.y.Q(o0VarE, R.string.activities_training_effect_anaerobic_capacity);
                gl.c.f77766a.getClass();
                long jK2 = gl.c.a(o0VarE).k();
                DateTime dateTime7 = bVar.f103163a;
                DateTime dateTime8 = bVar.f103164b;
                j61.h hVar4 = bVar.f103167e;
                i53.c<k61.a> cVar6 = bVar.f103168f;
                if (dVar != null) {
                    fValueOf = null;
                } else {
                    fValueOf = null;
                }
                d70.k kVar6 = new d70.k(strQ4, jK2, dateTime7, dateTime8, hVar4, cVar6, fValueOf, gl.c.a(o0VarE).f(), cVar.size(), z18, null);
                d92.b.f58623a.getClass();
                bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f110 = eVar2.f97920e;
                f14 = eVar2.f97918c;
                bVar3.getClass();
                float f111 = eVar2.f97920e;
                bVar3.getClass();
                d70.o.c(l.C(aVar, f110, 0.0f, f111, eVar2.f97918c, 2), kVar6, (a0) p1Var.getF182175a(), o0VarE, 0);
                r rVarF3 = x2.f(aVar, 1.0f);
                bVar3.getClass();
                r rVarH2 = x2.h(rVarF3, f14);
                long jB2 = d92.b.a(o0VarE).c().b();
                aVar3 = m1.f128891a;
                l.f(u1.n.e(rVarH2, jB2, aVar3), o0VarE);
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_capacity);
                long jI2 = gl.c.a(o0VarE).i();
                DateTime dateTime9 = bVar.f103163a;
                DateTime dateTime10 = bVar.f103164b;
                j61.h hVar5 = bVar.f103167e;
                i53.c<k61.a> cVar7 = bVar.f103169g;
                if (dVar != null) {
                    fValueOf2 = null;
                } else {
                    fValueOf2 = null;
                }
                d70.k kVar7 = new d70.k(strQ5, jI2, dateTime9, dateTime10, hVar5, cVar7, fValueOf2, gl.c.a(o0VarE).f(), cVar.size(), z18, null);
                bVar3.getClass();
                float f112 = eVar2.f97920e;
                bVar3.getClass();
                float f113 = eVar2.f97920e;
                bVar3.getClass();
                d70.o.c(l.C(aVar, f112, 0.0f, f113, eVar2.f97918c, 2), kVar7, (a0) p1Var.getF182175a(), o0VarE, 0);
                r rVarF4 = x2.f(aVar, 1.0f);
                bVar3.getClass();
                l.f(u1.n.e(x2.h(rVarF4, f14), d92.b.a(o0VarE).c().b(), aVar3), o0VarE);
                String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                long jO2 = gl.c.a(o0VarE).o();
                DateTime dateTime11 = bVar.f103163a;
                DateTime dateTime12 = bVar.f103164b;
                j61.h hVar6 = bVar.f103167e;
                i53.c<k61.a> cVar8 = bVar.f103170h;
                if (dVar != null) {
                    fValueOf3 = null;
                } else {
                    fValueOf3 = null;
                }
                d70.k kVar8 = new d70.k(strQ6, jO2, dateTime11, dateTime12, hVar6, cVar8, fValueOf3, gl.c.a(o0VarE).f(), cVar.size(), z18, null);
                bVar3.getClass();
                float f114 = eVar2.f97920e;
                bVar3.getClass();
                float f24 = eVar2.f97920e;
                bVar3.getClass();
                d70.o.c(l.C(aVar, f114, 0.0f, f24, eVar2.f97918c, 2), kVar8, (a0) p1Var.getF182175a(), o0VarE, 0);
                o0VarE.g0(true);
                cVar2 = bVar.f103166d;
                if (cVar2 == null) {
                    o0VarE.C(-127992094);
                    o0VarE.g0(false);
                } else {
                    l.f(u1.n.e(x2.h(ds.e0.g(o0VarE, -127992093, aVar, 1.0f, bVar3), f14), d92.b.a(o0VarE).c().b(), aVar3), o0VarE);
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new b2(p1Var, 13);
                        o0VarE.K(objQ2);
                    }
                    e70.c.a(cVar2, (e23.l) objQ2, o0VarE, 48);
                    o0VarE.g0(false);
                }
                z17 = z18;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        z17 = z15;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i111 = 1;
            pVar = new p() { // from class: f70.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i111) {
                        case 0:
                            ((Integer) obj2).getClass();
                            c.d(bVar, dVar, z17, (m) obj, p0.t(i14 | 1), i15);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            c.d(bVar, dVar, z17, (m) obj, p0.t(i14 | 1), i15);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
