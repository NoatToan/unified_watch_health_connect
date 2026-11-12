package me1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import l30.i0;
import l72.x0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:104:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:110:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:123:0x0312  */
    /* JADX WARN: Code duplicated, block: B:130:0x0321  */
    /* JADX WARN: Code duplicated, block: B:155:0x0470  */
    /* JADX WARN: Code duplicated, block: B:160:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:172:0x0571  */
    /* JADX WARN: Code duplicated, block: B:178:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2 A[EDGE_INSN: B:47:0x00f2->B:48:0x00f3 BREAK  A[LOOP:0: B:42:0x00de->B:191:?]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:69:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:80:0x0184  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:99:0x02bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final be1.a aVar, o oVar, fe1.n nVar, p3.m mVar, int i14) {
        boolean z14;
        boolean z15;
        Double d14;
        double dDoubleValue;
        Double d15;
        double dDoubleValue2;
        Double d16;
        double dDoubleValue3;
        ArrayList arrayListD;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        DateTime dateTimeAtStartOfDay;
        double dDoubleValue4;
        double dDoubleValue5;
        boolean z16;
        r.a aVar2;
        boolean z17;
        final de1.a aVar3;
        final Context context;
        final p1 p1Var;
        DateTime dateTime;
        Double d17;
        Double d18;
        String str;
        LocalDate localDateW;
        oVar.getClass();
        nVar.getClass();
        o0 o0VarE = mVar.E(1393975603);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(nVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            final p1 p1VarC = s9.c.c(nVar.f70561e, o0VarE);
            r.a aVar4 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA2 = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA2, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            boolean zB = o0VarE.B(aVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar6 = p3.m.f135153a;
            if (zB) {
                if (aVar != null) {
                    z14 = false;
                    break;
                } else {
                    z14 = false;
                    break;
                }
                if (aVar == null) {
                    z15 = false;
                } else {
                    d14 = aVar.f17731r;
                    if (d14 != null) {
                        dDoubleValue = d14.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (dDoubleValue > 0.0d) {
                        d15 = aVar.f17732t;
                        if (d15 != null) {
                            dDoubleValue2 = d15.doubleValue();
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        if (dDoubleValue2 > 0.0d) {
                            d16 = aVar.f17728o;
                            if (d16 != null) {
                                dDoubleValue3 = d16.doubleValue();
                            } else {
                                dDoubleValue3 = 0.0d;
                            }
                            if (dDoubleValue3 > 0.0d) {
                                z15 = false;
                            } else if (z14) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                        } else if (z14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else if (z14) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                objQ = hb.a.n(z15, o0VarE);
            } else {
                aVar6.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (aVar != null && (arrayListD = aVar.d()) != null && !arrayListD.isEmpty()) {
                        Iterator it = arrayListD.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z14 = false;
                                break;
                            } else if (((be1.d) it.next()).f17747b > 0.0d) {
                                z14 = true;
                                break;
                            }
                        }
                    } else {
                        z14 = false;
                        break;
                    }
                    if (aVar == null) {
                        z15 = false;
                    } else {
                        d14 = aVar.f17731r;
                        if (d14 != null) {
                            dDoubleValue = d14.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        if (dDoubleValue > 0.0d) {
                            d15 = aVar.f17732t;
                            if (d15 != null) {
                                dDoubleValue2 = d15.doubleValue();
                            } else {
                                dDoubleValue2 = 0.0d;
                            }
                            if (dDoubleValue2 > 0.0d) {
                                d16 = aVar.f17728o;
                                if (d16 != null) {
                                    dDoubleValue3 = d16.doubleValue();
                                } else {
                                    dDoubleValue3 = 0.0d;
                                }
                                if (dDoubleValue3 > 0.0d) {
                                    z15 = false;
                                } else if (z14) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else if (z14) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else if (z14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    objQ = hb.a.n(z15, o0VarE);
                }
            }
            boolean zBooleanValue = ((Boolean) ((p1) objQ).getF182175a()).booleanValue();
            LocalDate localDateH = g22.l.h(oVar);
            tf0.i iVar = nVar.f70562f;
            r.a aVar7 = r.S;
            g6.f.a aVar8 = g6.f.f75994b;
            r rVarH = x2.h(x2.f(aVar7, 1.0f), 350);
            boolean zR = o0VarE.r(nVar) | o0VarE.r(oVar);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new i0(24, nVar, oVar);
                o0VarE.K(objQ2);
            } else {
                aVar6.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i0(24, nVar, oVar);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar9 = (e23.a) objQ2;
            boolean zR2 = o0VarE.r(nVar);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new kp2.a(nVar, 26);
                o0VarE.K(objQ3);
            } else {
                aVar6.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new kp2.a(nVar, 26);
                    o0VarE.K(objQ3);
                }
            }
            tf0.r.a(zBooleanValue, localDateH, iVar, rVarH, aVar9, (e23.l) objQ3, z3.f.c(1526668006, new lb0.a(aVar, 18, nVar, p1VarC), o0VarE), o0VarE, (tf0.i.f164439d << 6) | 1575936);
            final Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            final a10.a aVar10 = new a10.a(context2);
            float f14 = 16;
            r rVarB = c2.l.B(aVar7, f14, f14, f14, f14);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar11 = h4.d.a.f81536n;
            z zVarA3 = y.a(kVar2, aVar11, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar12 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar12);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA3, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var2 = b0.f22601a;
                x0 x0Var = x0.f111346a;
                final String str2 = aVar10.f244c;
                final int i16 = 0;
                z3.e eVarC = z3.f.c(1187259854, new q() { // from class: me1.a
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i17 = i16;
                        String str3 = str2;
                        a10.a aVar13 = aVar10;
                        be1.a aVar14 = aVar;
                        switch (i17) {
                            case 0:
                                l22.a aVar15 = aVar13.f242a;
                                t2 t2Var = (t2) obj;
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                t2Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    Double d19 = aVar14 != null ? aVar14.f17731r : null;
                                    String strB = c.b(aVar13, d19);
                                    x0 x0Var2 = x0.f111346a;
                                    String string = aVar15.getString(R.string.lbl_respiration_lowest);
                                    String str4 = c.d(d19) ? str3 : null;
                                    b92.a aVarC = c.c(strB, aVar15.getString(R.string.lbl_respiration_lowest), str3, mVar2);
                                    int i18 = b92.a.f16960b;
                                    int i19 = (iIntValue & 14) | (x0.f111348c << 24);
                                    x0Var2.a(i19, 52, aVarC, t2Var, null, null, strB, string, str4, null, mVar2);
                                    Double d24 = aVar14 != null ? aVar14.f17732t : null;
                                    String strB2 = c.b(aVar13, d24);
                                    x0Var2.a(i19, 52, c.c(strB2, aVar15.getString(R.string.lbl_respiration_highest), str3, mVar2), t2Var, null, null, strB2, aVar15.getString(R.string.lbl_respiration_highest), c.d(d24) ? str3 : null, null, mVar2);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                l22.a aVar16 = aVar13.f242a;
                                t2 t2Var2 = (t2) obj;
                                p3.m mVar3 = (p3.m) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                t2Var2.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                                }
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    x1 x1Var4 = p3.n.f135158a;
                                    Double d25 = aVar14 != null ? aVar14.f17728o : null;
                                    String strB3 = c.b(aVar13, d25);
                                    x0 x0Var3 = x0.f111346a;
                                    String string2 = aVar16.getString(R.string.lbl_awake_avg);
                                    String str5 = c.d(d25) ? str3 : null;
                                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                    Double d26 = aVar14 != null ? aVar14.f17728o : null;
                                    c0235a.f16962a.put("merge", e5.g((d26 == null || s.c(d26, 0.0d)) ? aVar16.getString(R.string.txt_empty_page_no_data) : aVar13.c(d26.doubleValue()), StringUtils.SPACE, aVar16.getString(R.string.lbl_awake_average)));
                                    b92.a aVarB = c0235a.b();
                                    int i24 = iIntValue2 & 14;
                                    int i25 = b92.a.f16960b;
                                    int i26 = x0.f111348c;
                                    x0Var3.a(i24 | (i26 << 24), 52, aVarB, t2Var2, null, null, strB3, string2, str5, null, mVar3);
                                    x0Var3.h(t2Var2, mVar3, i24 | (i26 << 3));
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE);
                int i17 = x0.f111348c << 6;
                x0Var.e(null, eVarC, o0VarE, i17 | 48, 1);
                r rVarC4 = c2.l.C(aVar7, 0.0f, f14, 0.0f, 0.0f, 13);
                final int i18 = 1;
                x0Var.e(rVarC4, z3.f.c(1644795383, new q() { // from class: me1.a
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i19 = i18;
                        String str3 = str2;
                        a10.a aVar13 = aVar10;
                        be1.a aVar14 = aVar;
                        switch (i19) {
                            case 0:
                                l22.a aVar15 = aVar13.f242a;
                                t2 t2Var = (t2) obj;
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                t2Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    Double d19 = aVar14 != null ? aVar14.f17731r : null;
                                    String strB = c.b(aVar13, d19);
                                    x0 x0Var2 = x0.f111346a;
                                    String string = aVar15.getString(R.string.lbl_respiration_lowest);
                                    String str4 = c.d(d19) ? str3 : null;
                                    b92.a aVarC = c.c(strB, aVar15.getString(R.string.lbl_respiration_lowest), str3, mVar2);
                                    int i110 = b92.a.f16960b;
                                    int i111 = (iIntValue & 14) | (x0.f111348c << 24);
                                    x0Var2.a(i111, 52, aVarC, t2Var, null, null, strB, string, str4, null, mVar2);
                                    Double d24 = aVar14 != null ? aVar14.f17732t : null;
                                    String strB2 = c.b(aVar13, d24);
                                    x0Var2.a(i111, 52, c.c(strB2, aVar15.getString(R.string.lbl_respiration_highest), str3, mVar2), t2Var, null, null, strB2, aVar15.getString(R.string.lbl_respiration_highest), c.d(d24) ? str3 : null, null, mVar2);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                l22.a aVar16 = aVar13.f242a;
                                t2 t2Var2 = (t2) obj;
                                p3.m mVar3 = (p3.m) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                t2Var2.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                                }
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    x1 x1Var4 = p3.n.f135158a;
                                    Double d25 = aVar14 != null ? aVar14.f17728o : null;
                                    String strB3 = c.b(aVar13, d25);
                                    x0 x0Var3 = x0.f111346a;
                                    String string2 = aVar16.getString(R.string.lbl_awake_avg);
                                    String str5 = c.d(d25) ? str3 : null;
                                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                    Double d26 = aVar14 != null ? aVar14.f17728o : null;
                                    c0235a.f16962a.put("merge", e5.g((d26 == null || s.c(d26, 0.0d)) ? aVar16.getString(R.string.txt_empty_page_no_data) : aVar13.c(d26.doubleValue()), StringUtils.SPACE, aVar16.getString(R.string.lbl_awake_average)));
                                    b92.a aVarB = c0235a.b();
                                    int i24 = iIntValue2 & 14;
                                    int i25 = b92.a.f16960b;
                                    int i26 = x0.f111348c;
                                    x0Var3.a(i24 | (i26 << 24), 52, aVarB, t2Var2, null, null, strB3, string2, str5, null, mVar3);
                                    x0Var3.h(t2Var2, mVar3, i24 | (i26 << 3));
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, i17 | 54, 0);
                o0VarE.g0(true);
                r rVarE = u1.n.e(aVar7, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                zVarA = y.a(kVar2, aVar11, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar12);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                if (aVar == null) {
                    dateTimeAtStartOfDay = null;
                } else {
                    str = aVar.f17715b;
                    if (str != null) {
                        localDateW = g22.k.w(str, "yyyy-MM-dd");
                    } else {
                        localDateW = null;
                    }
                    if (localDateW != null) {
                        dateTimeAtStartOfDay = localDateW.toDateTimeAtStartOfDay();
                    } else {
                        dateTimeAtStartOfDay = null;
                    }
                }
                if (aVar != null || (d18 = aVar.f17729p) == null) {
                    dDoubleValue4 = 0.0d;
                } else {
                    dDoubleValue4 = d18.doubleValue();
                }
                if (aVar != null || (d17 = aVar.f17730q) == null) {
                    dDoubleValue5 = 0.0d;
                } else {
                    dDoubleValue5 = d17.doubleValue();
                }
                if (dateTimeAtStartOfDay != null || (dDoubleValue4 <= 0.0d && dDoubleValue5 <= 0.0d)) {
                    o0VarE = o0VarE;
                    z16 = true;
                    aVar2 = aVar7;
                    o0VarE.C(-1900952206);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1903766975);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_sleep_averages);
                    d92.b.f58624b.getClass();
                    float f15 = 8;
                    double d19 = dDoubleValue5;
                    double d24 = dDoubleValue4;
                    final DateTime dateTime2 = dateTimeAtStartOfDay;
                    mh.c(strQ, c2.l.B(aVar7, f14, 24, f14, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    final de1.a aVar13 = (de1.a) KoinJavaComponent.get$default(de1.a.class, null, null, 6, null);
                    pi0.e eVar2 = aVar10.f243b;
                    if (dDoubleValue4 <= 0.0d || d19 <= 0.0d) {
                        aVar2 = aVar7;
                        double d25 = d24;
                        DateTime dateTimePlusDays = dateTime2;
                        o0VarE.C(-1901952080);
                        if (dDoubleValue4 <= 0.0d) {
                            dateTimePlusDays = dateTimePlusDays.plusDays(1);
                            dateTimePlusDays.getClass();
                            d25 = d19;
                        }
                        String strA = eVar2.a(dateTimePlusDays, qi0.a.WEEKDAY);
                        String strA2 = eVar2.a(dateTimePlusDays, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                        String strB = aVar10.b(d25);
                        r rVarZ = c2.l.z(aVar2, f14, f15);
                        boolean zR3 = o0VarE.r(aVar13) | o0VarE.r(context2) | o0VarE.r(dateTimePlusDays) | o0VarE.B(p1VarC);
                        Object objQ4 = o0VarE.q();
                        if (zR3) {
                            final int i19 = 2;
                            final DateTime dateTime3 = dateTimePlusDays;
                            objQ4 = new e23.a() { // from class: me1.b
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            aVar13.b(context2, dateTime3, dh.b.H(((fe1.o) p1VarC.getF182175a()).f70583e));
                                            break;
                                        case 1:
                                            aVar13.b(context2, dateTime3, dh.b.H(((fe1.o) p1VarC.getF182175a()).f70583e));
                                            break;
                                        default:
                                            aVar13.b(context2, dateTime3, dh.b.H(((fe1.o) p1VarC.getF182175a()).f70583e));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ4);
                        } else {
                            aVar6.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                final int i110 = 2;
                                final DateTime dateTime4 = dateTimePlusDays;
                                objQ4 = new e23.a() { // from class: me1.b
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i110) {
                                            case 0:
                                                aVar13.b(context2, dateTime4, dh.b.H(((fe1.o) p1VarC.getF182175a()).f70583e));
                                                break;
                                            case 1:
                                                aVar13.b(context2, dateTime4, dh.b.H(((fe1.o) p1VarC.getF182175a()).f70583e));
                                                break;
                                            default:
                                                aVar13.b(context2, dateTime4, dh.b.H(((fe1.o) p1VarC.getF182175a()).f70583e));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ4);
                            }
                        }
                        z16 = true;
                        l72.l.e(strA, strA2, strB, null, null, null, rVarZ, null, false, (e23.a) objQ4, o0VarE, 0, 440);
                        o0VarE = o0VarE;
                        z17 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1903384249);
                        r rVarA = c2.l.A(aVar7, f14, 0.0f, 2);
                        s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                        int iHashCode4 = Long.hashCode(o0VarE.U);
                        i2 i2VarA3 = o0VarE.a0();
                        r rVarC5 = h4.k.c(rVarA, o0VarE);
                        if (cVar == null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar12);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, s2VarA, o0VarE);
                        b4.c(c1623g, i2VarA3, o0VarE);
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                            v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
                        }
                        b4.c(fVar, rVarC5, o0VarE);
                        u2 u2Var = u2.f22900a;
                        qi0.a aVar14 = qi0.a.WEEKDAY;
                        String strA3 = eVar2.a(dateTime2, aVar14);
                        String strB2 = aVar10.b(d24);
                        r rVarA2 = u2Var.a(c2.l.C(aVar7, 0.0f, f15, f15, 0.0f, 9), 0.5f, true);
                        boolean zR4 = o0VarE.r(aVar13) | o0VarE.r(context2) | o0VarE.r(dateTime2) | o0VarE.B(p1VarC);
                        Object objQ5 = o0VarE.q();
                        if (zR4) {
                            final int i24 = 0;
                            aVar3 = aVar13;
                            context = context2;
                            p1Var = p1VarC;
                            objQ5 = new e23.a() { // from class: me1.b
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i24) {
                                        case 0:
                                            aVar3.b(context, dateTime2, dh.b.H(((fe1.o) p1Var.getF182175a()).f70583e));
                                            break;
                                        case 1:
                                            aVar3.b(context, dateTime2, dh.b.H(((fe1.o) p1Var.getF182175a()).f70583e));
                                            break;
                                        default:
                                            aVar3.b(context, dateTime2, dh.b.H(((fe1.o) p1Var.getF182175a()).f70583e));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            dateTime = dateTime2;
                            o0VarE.K(objQ5);
                        } else {
                            aVar6.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                final int i25 = 0;
                                aVar3 = aVar13;
                                context = context2;
                                p1Var = p1VarC;
                                objQ5 = new e23.a() { // from class: me1.b
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i25) {
                                            case 0:
                                                aVar3.b(context, dateTime2, dh.b.H(((fe1.o) p1Var.getF182175a()).f70583e));
                                                break;
                                            case 1:
                                                aVar3.b(context, dateTime2, dh.b.H(((fe1.o) p1Var.getF182175a()).f70583e));
                                                break;
                                            default:
                                                aVar3.b(context, dateTime2, dh.b.H(((fe1.o) p1Var.getF182175a()).f70583e));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                dateTime = dateTime2;
                                o0VarE.K(objQ5);
                            } else {
                                aVar3 = aVar13;
                                dateTime = dateTime2;
                                context = context2;
                                p1Var = p1VarC;
                            }
                        }
                        final de1.a aVar15 = aVar3;
                        final Context context3 = context;
                        final p1 p1Var2 = p1Var;
                        l72.l.d(strA3, strB2, null, rVarA2, null, false, (e23.a) objQ5, o0VarE, 0, 52);
                        final DateTime dateTimePlusDays2 = dateTime.plusDays(1);
                        dateTimePlusDays2.getClass();
                        String strA4 = eVar2.a(dateTimePlusDays2, aVar14);
                        String strB3 = aVar10.b(d19);
                        aVar2 = aVar7;
                        r rVarA3 = u2Var.a(c2.l.C(aVar7, f15, f15, 0.0f, 0.0f, 12), 0.5f, true);
                        boolean zR5 = o0VarE.r(aVar15) | o0VarE.r(context3) | o0VarE.r(dateTimePlusDays2) | o0VarE.B(p1Var2);
                        Object objQ6 = o0VarE.q();
                        if (zR5) {
                            final int i26 = 1;
                            objQ6 = new e23.a() { // from class: me1.b
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            aVar15.b(context3, dateTimePlusDays2, dh.b.H(((fe1.o) p1Var2.getF182175a()).f70583e));
                                            break;
                                        case 1:
                                            aVar15.b(context3, dateTimePlusDays2, dh.b.H(((fe1.o) p1Var2.getF182175a()).f70583e));
                                            break;
                                        default:
                                            aVar15.b(context3, dateTimePlusDays2, dh.b.H(((fe1.o) p1Var2.getF182175a()).f70583e));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ6);
                        } else {
                            aVar6.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                final int i27 = 1;
                                objQ6 = new e23.a() { // from class: me1.b
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i27) {
                                            case 0:
                                                aVar15.b(context3, dateTimePlusDays2, dh.b.H(((fe1.o) p1Var2.getF182175a()).f70583e));
                                                break;
                                            case 1:
                                                aVar15.b(context3, dateTimePlusDays2, dh.b.H(((fe1.o) p1Var2.getF182175a()).f70583e));
                                                break;
                                            default:
                                                aVar15.b(context3, dateTimePlusDays2, dh.b.H(((fe1.o) p1Var2.getF182175a()).f70583e));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ6);
                            }
                        }
                        l72.l.d(strA4, strB3, null, rVarA3, null, false, (e23.a) objQ6, o0VarE, 0, 52);
                        o0VarE.g0(true);
                        z17 = false;
                        o0VarE.g0(false);
                        z16 = true;
                    }
                    o0VarE.g0(z17);
                }
                c2.l.f(x2.h(aVar2, 24), o0VarE);
                o0VarE.g0(z16);
                o0VarE.g0(z16);
                x1 x1Var3 = p3.n.f135158a;
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var3 = b0.f22601a;
            x0 x0Var2 = x0.f111346a;
            final String str3 = aVar10.f244c;
            final int i111 = 0;
            z3.e eVarC2 = z3.f.c(1187259854, new q() { // from class: me1.a
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i112 = i111;
                    String str4 = str3;
                    a10.a aVar16 = aVar10;
                    be1.a aVar17 = aVar;
                    switch (i112) {
                        case 0:
                            l22.a aVar18 = aVar16.f242a;
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var4 = p3.n.f135158a;
                                Double d110 = aVar17 != null ? aVar17.f17731r : null;
                                String strB4 = c.b(aVar16, d110);
                                x0 x0Var3 = x0.f111346a;
                                String string = aVar18.getString(R.string.lbl_respiration_lowest);
                                String str5 = c.d(d110) ? str4 : null;
                                b92.a aVarC = c.c(strB4, aVar18.getString(R.string.lbl_respiration_lowest), str4, mVar2);
                                int i113 = b92.a.f16960b;
                                int i114 = (iIntValue & 14) | (x0.f111348c << 24);
                                x0Var3.a(i114, 52, aVarC, t2Var, null, null, strB4, string, str5, null, mVar2);
                                Double d26 = aVar17 != null ? aVar17.f17732t : null;
                                String strB5 = c.b(aVar16, d26);
                                x0Var3.a(i114, 52, c.c(strB5, aVar18.getString(R.string.lbl_respiration_highest), str4, mVar2), t2Var, null, null, strB5, aVar18.getString(R.string.lbl_respiration_highest), c.d(d26) ? str4 : null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            l22.a aVar19 = aVar16.f242a;
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var5 = p3.n.f135158a;
                                Double d27 = aVar17 != null ? aVar17.f17728o : null;
                                String strB6 = c.b(aVar16, d27);
                                x0 x0Var4 = x0.f111346a;
                                String string2 = aVar19.getString(R.string.lbl_awake_avg);
                                String str6 = c.d(d27) ? str4 : null;
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                Double d28 = aVar17 != null ? aVar17.f17728o : null;
                                c0235a.f16962a.put("merge", e5.g((d28 == null || s.c(d28, 0.0d)) ? aVar19.getString(R.string.txt_empty_page_no_data) : aVar16.c(d28.doubleValue()), StringUtils.SPACE, aVar19.getString(R.string.lbl_awake_average)));
                                b92.a aVarB = c0235a.b();
                                int i28 = iIntValue2 & 14;
                                int i29 = b92.a.f16960b;
                                int i210 = x0.f111348c;
                                x0Var4.a(i28 | (i210 << 24), 52, aVarB, t2Var2, null, null, strB6, string2, str6, null, mVar3);
                                x0Var4.h(t2Var2, mVar3, i28 | (i210 << 3));
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i112 = x0.f111348c << 6;
            x0Var2.e(null, eVarC2, o0VarE, i112 | 48, 1);
            r rVarC6 = c2.l.C(aVar7, 0.0f, f14, 0.0f, 0.0f, 13);
            final int i113 = 1;
            x0Var2.e(rVarC6, z3.f.c(1644795383, new q() { // from class: me1.a
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i114 = i113;
                    String str4 = str3;
                    a10.a aVar16 = aVar10;
                    be1.a aVar17 = aVar;
                    switch (i114) {
                        case 0:
                            l22.a aVar18 = aVar16.f242a;
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var4 = p3.n.f135158a;
                                Double d110 = aVar17 != null ? aVar17.f17731r : null;
                                String strB4 = c.b(aVar16, d110);
                                x0 x0Var3 = x0.f111346a;
                                String string = aVar18.getString(R.string.lbl_respiration_lowest);
                                String str5 = c.d(d110) ? str4 : null;
                                b92.a aVarC = c.c(strB4, aVar18.getString(R.string.lbl_respiration_lowest), str4, mVar2);
                                int i115 = b92.a.f16960b;
                                int i116 = (iIntValue & 14) | (x0.f111348c << 24);
                                x0Var3.a(i116, 52, aVarC, t2Var, null, null, strB4, string, str5, null, mVar2);
                                Double d26 = aVar17 != null ? aVar17.f17732t : null;
                                String strB5 = c.b(aVar16, d26);
                                x0Var3.a(i116, 52, c.c(strB5, aVar18.getString(R.string.lbl_respiration_highest), str4, mVar2), t2Var, null, null, strB5, aVar18.getString(R.string.lbl_respiration_highest), c.d(d26) ? str4 : null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            l22.a aVar19 = aVar16.f242a;
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var5 = p3.n.f135158a;
                                Double d27 = aVar17 != null ? aVar17.f17728o : null;
                                String strB6 = c.b(aVar16, d27);
                                x0 x0Var4 = x0.f111346a;
                                String string2 = aVar19.getString(R.string.lbl_awake_avg);
                                String str6 = c.d(d27) ? str4 : null;
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                Double d28 = aVar17 != null ? aVar17.f17728o : null;
                                c0235a.f16962a.put("merge", e5.g((d28 == null || s.c(d28, 0.0d)) ? aVar19.getString(R.string.txt_empty_page_no_data) : aVar16.c(d28.doubleValue()), StringUtils.SPACE, aVar19.getString(R.string.lbl_awake_average)));
                                b92.a aVarB = c0235a.b();
                                int i28 = iIntValue2 & 14;
                                int i29 = b92.a.f16960b;
                                int i210 = x0.f111348c;
                                x0Var4.a(i28 | (i210 << 24), 52, aVarB, t2Var2, null, null, strB6, string2, str6, null, mVar3);
                                x0Var4.h(t2Var2, mVar3, i28 | (i210 << 3));
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i112 | 54, 0);
            o0VarE.g0(true);
            r rVarE2 = u1.n.e(aVar7, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            zVarA = y.a(kVar2, aVar11, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarE2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar12);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            if (aVar == null) {
                dateTimeAtStartOfDay = null;
            } else {
                str = aVar.f17715b;
                if (str != null) {
                    localDateW = g22.k.w(str, "yyyy-MM-dd");
                } else {
                    localDateW = null;
                }
                if (localDateW != null) {
                    dateTimeAtStartOfDay = localDateW.toDateTimeAtStartOfDay();
                } else {
                    dateTimeAtStartOfDay = null;
                }
            }
            if (aVar != null) {
                dDoubleValue4 = 0.0d;
            } else {
                dDoubleValue4 = 0.0d;
            }
            if (aVar != null) {
                dDoubleValue5 = 0.0d;
            } else {
                dDoubleValue5 = 0.0d;
            }
            if (dateTimeAtStartOfDay != null) {
                o0VarE = o0VarE;
                z16 = true;
                aVar2 = aVar7;
                o0VarE.C(-1900952206);
                o0VarE.g0(false);
            } else {
                o0VarE = o0VarE;
                z16 = true;
                aVar2 = aVar7;
                o0VarE.C(-1900952206);
                o0VarE.g0(false);
            }
            c2.l.f(x2.h(aVar2, 24), o0VarE);
            o0VarE.g0(z16);
            o0VarE.g0(z16);
            x1 x1Var4 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a(aVar, oVar, nVar, i14, 19);
        }
    }

    public static final String b(a10.a aVar, Double d14) {
        aVar.getClass();
        if (d(d14)) {
            return String.valueOf((int) (d14 != null ? d14.doubleValue() : 0.0d));
        }
        return aVar.f242a.getString(R.string.no_value_card);
    }

    public static final b92.a c(String str, String str2, String str3, p3.m mVar) {
        str.getClass();
        str3.getClass();
        x1 x1Var = p3.n.f135158a;
        String strD = x.d(str, StringUtils.SPACE, str3, StringUtils.SPACE, str2);
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        if (objQ == p3.m.a.f135155b) {
            objQ = new m30.n(19);
            mVar.K(objQ);
        }
        return wz1.a.a(oi0.c.A(context, (e23.l) objQ, strD));
    }

    public static final boolean d(Double d14) {
        return d14 != null && d14.doubleValue() > 0.0d;
    }
}
