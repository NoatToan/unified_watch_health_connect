package zo1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.k3;
import c2.n3;
import c2.q3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mc;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    /* JADX WARN: Code duplicated, block: B:118:0x0209  */
    /* JADX WARN: Code duplicated, block: B:119:0x0212  */
    /* JADX WARN: Code duplicated, block: B:121:0x0215  */
    /* JADX WARN: Code duplicated, block: B:122:0x0229  */
    /* JADX WARN: Code duplicated, block: B:125:0x0230  */
    /* JADX WARN: Code duplicated, block: B:128:0x024b  */
    /* JADX WARN: Code duplicated, block: B:131:0x025c  */
    /* JADX WARN: Code duplicated, block: B:134:0x026d  */
    /* JADX WARN: Code duplicated, block: B:137:0x027e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0288  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:142:0x02af  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:150:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x0343  */
    /* JADX WARN: Code duplicated, block: B:155:0x0351  */
    /* JADX WARN: Code duplicated, block: B:156:0x0363  */
    /* JADX WARN: Code duplicated, block: B:158:0x038f  */
    /* JADX WARN: Code duplicated, block: B:159:0x039c  */
    /* JADX WARN: Code duplicated, block: B:162:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:165:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:168:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:171:0x041f  */
    /* JADX WARN: Code duplicated, block: B:174:0x044a  */
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
    public static final void a(final yo1.h hVar, boolean z14, final mc mcVar, final o53.b0 b0Var, final q qVar, final String str, boolean z15, String str2, final e23.a aVar, e23.a aVar2, e23.l lVar, e23.a aVar3, p3.m mVar, int i14, int i15) {
        boolean z16;
        String str3;
        e23.a aVar4;
        int i16;
        char c14;
        int i17;
        p3.o0 o0Var;
        e23.l lVar2;
        e23.a aVar5;
        e23.a aVar6;
        yo1.h hVar2;
        String str4;
        Context context;
        DateTime dateTimeQ;
        DateTime dateTimeWithZone;
        String string;
        Object objQ;
        p3.m.a.C2565a c2565a;
        final p1 p1Var;
        Object objQ2;
        final p1 p1Var2;
        Object objQ3;
        final p1 p1Var3;
        Object objQ4;
        final p1 p1Var4;
        boolean z17;
        boolean z18;
        Object objQ5;
        int i18;
        e23.a aVar7;
        e23.l lVar3;
        p3.o0 o0Var2;
        p1 p1Var5;
        p3.m.a.C2565a c2565a2;
        int i19;
        boolean z19;
        b bVar;
        boolean zR;
        Object objQ6;
        a aVar8;
        Object objQ7;
        boolean z24;
        hVar.getClass();
        mcVar.getClass();
        b0Var.getClass();
        qVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(581973105);
        int i24 = i14 | (o0VarE.r(hVar) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i24 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i25 = i24 | (o0VarE.B(mcVar) ? 256 : 128) | (o0VarE.r(b0Var) ? 2048 : 1024) | (o0VarE.r(qVar) ? 16384 : 8192);
        if ((i14 & 196608) == 0) {
            i25 |= o0VarE.B(str) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            z16 = z15;
            i25 |= o0VarE.h(z16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            z16 = z15;
        }
        if ((i14 & 12582912) == 0) {
            str3 = str2;
            i25 |= o0VarE.B(str3) ? 8388608 : 4194304;
        } else {
            str3 = str2;
        }
        int i26 = i25 | (o0VarE.r(aVar) ? 67108864 : 33554432);
        int i27 = i15 & 512;
        if (i27 != 0) {
            i16 = i26 | C.ENCODING_PCM_32BIT;
            aVar4 = aVar2;
        } else {
            aVar4 = aVar2;
            i16 = i26 | (o0VarE.r(aVar4) ? 536870912 : 268435456);
        }
        int i28 = i15 & 1024;
        if (i28 != 0) {
            c14 = 6;
        } else {
            c14 = o0VarE.r(lVar) ? (char) 4 : (char) 2;
        }
        int i29 = i15 & 2048;
        if (i29 != 0) {
            i17 = c14 | '0';
        } else {
            i17 = c14 | (o0VarE.r(aVar3) ? ' ' : (char) 16);
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            if (i27 != 0) {
                aVar4 = null;
            }
            e23.l lVar4 = i28 != 0 ? null : lVar;
            e23.a aVar9 = i29 != 0 ? null : aVar3;
            x1 x1Var = p3.n.f135158a;
            final i53.f fVarA = i53.a.a(new g02.p1(gl1.y.Q(o0VarE, R.string.lbl_results), null, null, 6, null), new g02.p1(gl1.y.Q(o0VarE, R.string.lbl_riders), null, null, 6, null));
            Unit unit = Unit.INSTANCE;
            final e23.l lVar5 = lVar4;
            boolean zR2 = o0VarE.r(qVar) | ((i16 & 14) == 4 || o0VarE.r(hVar));
            Object objQ8 = o0VarE.q();
            p3.m.a aVar10 = p3.m.f135153a;
            if (zR2) {
                objQ8 = new k(qVar, hVar, null);
                o0VarE.K(objQ8);
            } else {
                aVar10.getClass();
                if (objQ8 == p3.m.a.f135155b) {
                    objQ8 = new k(qVar, hVar, null);
                    o0VarE.K(objQ8);
                }
            }
            p3.l0.e((e23.p) objQ8, unit, o0VarE);
            yo1.h hVar3 = (yo1.h) s9.c.c(qVar.f206424k, o0VarE).getF182175a();
            if (hVar3 == null) {
                o0VarE.C(-1221101094);
                o0VarE.g0(false);
                lVar3 = lVar5;
                o0Var = o0VarE;
                aVar7 = aVar4;
            } else {
                yo1.j jVar = hVar3.f198481d;
                o0VarE.C(-1221101093);
                boolean zR3 = o0VarE.r(fVarA);
                Object objQ9 = o0VarE.q();
                if (zR3) {
                    hVar2 = hVar3;
                } else {
                    aVar10.getClass();
                    hVar2 = hVar3;
                    if (objQ9 == p3.m.a.f135155b) {
                    }
                    final h2.b bVarB = h2.o0.b(z14 ? 1 : 0, (e23.a) objQ9, o0VarE, 0, 2);
                    str4 = hVar.f198480c;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    String name = jVar.getName();
                    dateTimeQ = g22.k.q(jVar.getStartTime(), "yyyy-MM-dd'T'HH:mm:ss.S", DateTimeZone.UTC);
                    if (dateTimeQ != null) {
                        dateTimeWithZone = dateTimeQ.withZone(DateTimeZone.getDefault());
                    } else {
                        dateTimeWithZone = null;
                    }
                    if (dateTimeWithZone != null) {
                        string = context.getString(R.string.string_comma_string_pattern, c22.j0.p(dateTimeWithZone), c22.j0.r(context, dateTimeWithZone));
                    } else {
                        string = "";
                    }
                    string.getClass();
                    if (str4 != null) {
                        string = context.getString(R.string.string_space_dot_space_string_pattern, str4, string);
                        string.getClass();
                    }
                    String str5 = string;
                    objQ = o0VarE.q();
                    aVar10.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    p1Var = (p1) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p3.p0.n(null);
                        o0VarE.K(objQ2);
                    }
                    p1Var2 = (p1) objQ2;
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var3 = (p1) objQ3;
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = p3.p0.n(null);
                        o0VarE.K(objQ4);
                    }
                    p1Var4 = (p1) objQ4;
                    l72.w wVar = l72.w.f111301a;
                    z3.e eVarC = z3.f.c(-1724654437, new xk1.e(b0Var, 29, mcVar, aVar9), o0VarE);
                    boolean zR4 = o0VarE.r(b0Var);
                    if ((i16 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zR4 | z17 | ((i17 & 112) == 32);
                    objQ5 = o0VarE.q();
                    if (z18 || objQ5 == c2565a) {
                        objQ5 = new eu.b(b0Var, aVar9, mcVar, 15);
                        o0VarE.K(objQ5);
                    }
                    i18 = i16;
                    final e23.a aVar11 = aVar4;
                    final boolean z25 = z16;
                    final String str6 = str3;
                    final yo1.h hVar4 = hVar2;
                    aVar7 = aVar11;
                    lVar3 = lVar5;
                    wVar.f(name, str5, null, eVarC, (e23.a) objQ5, mcVar, true, null, z3.f.c(2102881201, new e23.q() { // from class: zo1.i
                        /* JADX WARN: Code duplicated, block: B:12:0x0060  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((c2.a0) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x1 x1Var2 = p3.n.f135158a;
                                int i30 = k3.f22728a;
                                final float f22739d = n3.c(q3.a(mVar2), mVar2).getF22739d();
                                final q qVar2 = qVar;
                                p1 p1VarC = p3.p0.c(qVar2.f206422i, mVar2, 0);
                                m3.s sVarE = m3.l.e(mVar2);
                                boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
                                boolean zR5 = mVar2.r(qVar2);
                                Object objQ10 = mVar2.q();
                                if (zR5) {
                                    objQ10 = new j(qVar2, 0);
                                    mVar2.K(objQ10);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new j(qVar2, 0);
                                        mVar2.K(objQ10);
                                    }
                                }
                                z3.e eVarC2 = z3.f.c(1362094218, new ky0.a0(sVarE, p1VarC, 3), mVar2);
                                final yo1.h hVar5 = hVar;
                                final yo1.h hVar6 = hVar4;
                                final o53.b0 b0Var2 = b0Var;
                                final mc mcVar2 = mcVar;
                                final e23.a aVar12 = aVar;
                                final e23.a aVar13 = aVar11;
                                final e23.l lVar6 = lVar5;
                                final h2.j0 j0Var = bVarB;
                                final i53.f fVar = fVarA;
                                final String str7 = str;
                                final boolean z26 = z25;
                                final String str8 = str6;
                                final p1 p1Var6 = p1Var3;
                                final p1 p1Var7 = p1Var4;
                                final p1 p1Var8 = p1Var;
                                final p1 p1Var9 = p1Var2;
                                m3.l.b(zBooleanValue, (e23.a) objQ10, null, sVarE, null, eVarC2, z3.f.c(1626115083, new e23.q() { // from class: zo1.g
                                    @Override // e23.q
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        float f14;
                                        p3.m mVar3;
                                        p3.m mVar4 = (p3.m) obj5;
                                        int iIntValue2 = ((Integer) obj6).intValue();
                                        ((c2.t) obj4).getClass();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            yo1.h hVar7 = hVar5;
                                            List<yo1.b> listB = hVar7.f198481d.b();
                                            if (!(listB == null || listB.isEmpty()) || o.b(hVar7)) {
                                                f14 = 16;
                                                g6.f.a aVar14 = g6.f.f75994b;
                                            } else {
                                                f14 = 0;
                                                g6.f.a aVar15 = g6.f.f75994b;
                                            }
                                            h4.r rVarC = c2.l.C(u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar4), m1.f128891a), 0.0f, f14, 0.0f, f22739d, 5);
                                            c2.j.f22691a.getClass();
                                            c2.j.k kVar = c2.j.f22694d;
                                            h4.d.f81522a.getClass();
                                            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                                            int iHashCode = Long.hashCode(mVar4.getU());
                                            i2 i2VarX = mVar4.x();
                                            h4.r rVarC2 = h4.k.c(rVarC, mVar4);
                                            h5.g.V.getClass();
                                            h5.e0.a aVar16 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p3.p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar16);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            c2.b0 b0Var3 = c2.b0.f22601a;
                                            List<yo1.b> listB2 = hVar7.f198481d.b();
                                            boolean z27 = listB2 == null || listB2.isEmpty();
                                            final yo1.h hVar8 = hVar6;
                                            final o53.b0 b0Var4 = b0Var2;
                                            final mc mcVar3 = mcVar2;
                                            final q qVar3 = qVar2;
                                            final e23.a aVar17 = aVar12;
                                            final e23.a aVar18 = aVar13;
                                            final e23.l lVar7 = lVar6;
                                            if (!z27 || o.b(hVar7)) {
                                                mVar4.C(1033623429);
                                                h2.j0 j0Var2 = j0Var;
                                                g02.t.a(j0Var2, b0Var4, fVar, null, mVar4, 0, 8);
                                                final String str9 = str7;
                                                final boolean z28 = z26;
                                                final String str10 = str8;
                                                final p1 p1Var10 = p1Var6;
                                                final p1 p1Var11 = p1Var7;
                                                final p1 p1Var12 = p1Var8;
                                                final p1 p1Var13 = p1Var9;
                                                h2.u.a(j0Var2, null, null, null, 2, 0.0f, null, null, false, null, null, null, null, z3.f.c(-1076188784, new e23.r() { // from class: zo1.h
                                                    @Override // e23.r
                                                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) throws Throwable {
                                                        int iIntValue3 = ((Integer) obj8).intValue();
                                                        p3.m mVar5 = (p3.m) obj9;
                                                        ((Integer) obj10).getClass();
                                                        ((h2.c0) obj7).getClass();
                                                        x1 x1Var4 = p3.n.f135158a;
                                                        yo1.h hVar9 = hVar8;
                                                        q qVar4 = qVar3;
                                                        e23.l lVar8 = lVar7;
                                                        if (iIntValue3 == 0) {
                                                            mVar5.C(869702110);
                                                            Object objQ11 = mVar5.q();
                                                            p3.m.f135153a.getClass();
                                                            p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                                                            if (objQ11 == c2565a3) {
                                                                objQ11 = new sk0.l(p1Var10, p1Var11, 9);
                                                                mVar5.K(objQ11);
                                                            }
                                                            e23.l lVar9 = (e23.l) objQ11;
                                                            Object objQ12 = mVar5.q();
                                                            if (objQ12 == c2565a3) {
                                                                objQ12 = new sk0.l(p1Var12, p1Var13, 10);
                                                                mVar5.K(objQ12);
                                                            }
                                                            r0.i(hVar9, lVar9, (e23.l) objQ12, qVar4, str9, z28, str10, lVar8, mVar5, 440);
                                                            mVar5.f();
                                                        } else if (iIntValue3 != 1) {
                                                            mVar5.C(1192626770);
                                                            mVar5.f();
                                                        } else {
                                                            mVar5.C(869736295);
                                                            w0.b(hVar9.f198481d, b0Var4, mcVar3, qVar4, aVar17, aVar18, lVar8, mVar5, yo1.j.f198503j);
                                                            mVar5.f();
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }, mVar4), mVar4, 24576, 24576, 16366);
                                                mVar3 = mVar4;
                                                mVar3.f();
                                            } else {
                                                mVar4.C(1033017286);
                                                w0.b(hVar8.f198481d, b0Var4, mcVar3, qVar3, aVar17, aVar18, lVar7, mVar4, yo1.j.f198503j);
                                                mVar3 = mVar4;
                                                mVar3.f();
                                            }
                                            mVar3.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 1769472, 20);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, ((i18 << 9) & 458752) | 806882304, 388);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        o0VarE.C(1146789352);
                        aVar8 = (a) p1Var2.getF182175a();
                        if (aVar8 == null) {
                            o0VarE.C(1190731545);
                            o0VarE.g0(false);
                            o0Var2 = o0VarE;
                            z24 = false;
                            p1Var5 = p1Var3;
                            c2565a2 = c2565a;
                            i19 = 15;
                        } else {
                            o0VarE.C(1190731546);
                            vo1.b bVar2 = (vo1.b) KoinJavaComponent.get$default(vo1.b.class, null, null, 6, null);
                            ps.x1 x1Var2 = aVar8.f206215a;
                            List<ps.x1> list = aVar8.f206216b;
                            String str7 = aVar8.f206217c;
                            boolean z26 = aVar8.f206218d;
                            ActivityDetailChartDTO activityDetailChartDTO = aVar8.f206219e;
                            yo1.f fVar = aVar8.f206220f;
                            boolean z27 = aVar8.f206221g;
                            boolean z28 = aVar8.f206222h;
                            e23.l<Boolean, Unit> lVar6 = aVar8.f206223i;
                            objQ7 = o0VarE.q();
                            c2565a2 = c2565a;
                            if (objQ7 == c2565a2) {
                                i19 = 15;
                                objQ7 = new p40.q0(p1Var, p1Var2, 15);
                                o0VarE.K(objQ7);
                            } else {
                                i19 = 15;
                            }
                            p1Var5 = p1Var3;
                            bVar2.e(x1Var2, list, str7, z26, activityDetailChartDTO, fVar, z27, z28, z15, lVar6, (e23.a) objQ7, o0VarE, ps.x1.G1 | (yo1.f.f198451e << i19) | ((i18 << 6) & 234881024));
                            o0Var2 = o0VarE;
                            z24 = false;
                            o0Var2.g0(false);
                        }
                        o0Var2.g0(z24);
                    } else {
                        o0Var2 = o0VarE;
                        p1Var5 = p1Var3;
                        c2565a2 = c2565a;
                        i19 = 15;
                        o0Var2.C(1191462216);
                        o0Var2.g0(false);
                    }
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        o0Var2.C(1146815359);
                        bVar = (b) p1Var4.getF182175a();
                        if (bVar == null) {
                            o0Var2.C(1191537762);
                            z19 = false;
                            o0Var2.g0(false);
                            o0Var = o0Var2;
                        } else {
                            o0Var2.C(1191537763);
                            vo1.b bVar3 = (vo1.b) KoinJavaComponent.get$default(vo1.b.class, null, null, 6, null);
                            List<ps.x1> list2 = bVar.f206228a;
                            ActivityDetailChartDTO activityDetailChartDTO2 = bVar.f206229b;
                            yo1.f fVar2 = bVar.f206230c;
                            boolean z29 = bVar.f206231d;
                            zR = o0Var2.r(bVar);
                            objQ6 = o0Var2.q();
                            if (zR || objQ6 == c2565a2) {
                                objQ6 = new x72.k(bVar, i19, p1Var5, p1Var4);
                                o0Var2.K(objQ6);
                            }
                            p3.o0 o0Var3 = o0Var2;
                            bVar3.a(list2, activityDetailChartDTO2, fVar2, z29, z15, (e23.a) objQ6, o0Var3, (yo1.f.f198451e << 6) | (57344 & (i18 >> 6)));
                            o0Var = o0Var3;
                            z19 = false;
                            o0Var.g0(false);
                        }
                        o0Var.g0(z19);
                    } else {
                        o0Var = o0Var2;
                        z19 = false;
                        o0Var.C(1191983016);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z19);
                }
                objQ9 = new ak0.w(fVarA, 8);
                o0VarE.K(objQ9);
                final h2.b bVarB2 = h2.o0.b(z14 ? 1 : 0, (e23.a) objQ9, o0VarE, 0, 2);
                str4 = hVar.f198480c;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                String name2 = jVar.getName();
                dateTimeQ = g22.k.q(jVar.getStartTime(), "yyyy-MM-dd'T'HH:mm:ss.S", DateTimeZone.UTC);
                if (dateTimeQ != null) {
                    dateTimeWithZone = dateTimeQ.withZone(DateTimeZone.getDefault());
                } else {
                    dateTimeWithZone = null;
                }
                if (dateTimeWithZone != null) {
                    string = context.getString(R.string.string_comma_string_pattern, c22.j0.p(dateTimeWithZone), c22.j0.r(context, dateTimeWithZone));
                } else {
                    string = "";
                }
                string.getClass();
                if (str4 != null) {
                    string = context.getString(R.string.string_space_dot_space_string_pattern, str4, string);
                    string.getClass();
                }
                String str8 = string;
                objQ = o0VarE.q();
                aVar10.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p3.p0.n(null);
                    o0VarE.K(objQ2);
                }
                p1Var2 = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var3 = (p1) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = p3.p0.n(null);
                    o0VarE.K(objQ4);
                }
                p1Var4 = (p1) objQ4;
                l72.w wVar2 = l72.w.f111301a;
                z3.e eVarC2 = z3.f.c(-1724654437, new xk1.e(b0Var, 29, mcVar, aVar9), o0VarE);
                boolean zR5 = o0VarE.r(b0Var);
                if ((i16 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zR5 | z17 | ((i17 & 112) == 32);
                objQ5 = o0VarE.q();
                if (z18) {
                    objQ5 = new eu.b(b0Var, aVar9, mcVar, 15);
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new eu.b(b0Var, aVar9, mcVar, 15);
                    o0VarE.K(objQ5);
                }
                i18 = i16;
                final e23.a aVar12 = aVar4;
                final boolean z210 = z16;
                final String str9 = str3;
                final yo1.h hVar5 = hVar2;
                aVar7 = aVar12;
                lVar3 = lVar5;
                wVar2.f(name2, str8, null, eVarC2, (e23.a) objQ5, mcVar, true, null, z3.f.c(2102881201, new e23.q() { // from class: zo1.i
                    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((c2.a0) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var3 = p3.n.f135158a;
                            int i30 = k3.f22728a;
                            final float f22739d = n3.c(q3.a(mVar2), mVar2).getF22739d();
                            final q qVar2 = qVar;
                            p1 p1VarC = p3.p0.c(qVar2.f206422i, mVar2, 0);
                            m3.s sVarE = m3.l.e(mVar2);
                            boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
                            boolean zR6 = mVar2.r(qVar2);
                            Object objQ10 = mVar2.q();
                            if (zR6) {
                                objQ10 = new j(qVar2, 0);
                                mVar2.K(objQ10);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    objQ10 = new j(qVar2, 0);
                                    mVar2.K(objQ10);
                                }
                            }
                            z3.e eVarC3 = z3.f.c(1362094218, new ky0.a0(sVarE, p1VarC, 3), mVar2);
                            final yo1.h hVar6 = hVar;
                            final yo1.h hVar7 = hVar5;
                            final o53.b0 b0Var2 = b0Var;
                            final mc mcVar2 = mcVar;
                            final e23.a aVar13 = aVar;
                            final e23.a aVar14 = aVar12;
                            final e23.l lVar7 = lVar5;
                            final h2.j0 j0Var = bVarB2;
                            final i53.f fVar3 = fVarA;
                            final String str10 = str;
                            final boolean z211 = z210;
                            final String str11 = str9;
                            final p1 p1Var6 = p1Var3;
                            final p1 p1Var7 = p1Var4;
                            final p1 p1Var8 = p1Var;
                            final p1 p1Var9 = p1Var2;
                            m3.l.b(zBooleanValue, (e23.a) objQ10, null, sVarE, null, eVarC3, z3.f.c(1626115083, new e23.q() { // from class: zo1.g
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    float f14;
                                    p3.m mVar3;
                                    p3.m mVar4 = (p3.m) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    ((c2.t) obj4).getClass();
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        yo1.h hVar8 = hVar6;
                                        List<yo1.b> listB = hVar8.f198481d.b();
                                        if (!(listB == null || listB.isEmpty()) || o.b(hVar8)) {
                                            f14 = 16;
                                            g6.f.a aVar15 = g6.f.f75994b;
                                        } else {
                                            f14 = 0;
                                            g6.f.a aVar16 = g6.f.f75994b;
                                        }
                                        h4.r rVarC = c2.l.C(u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar4), m1.f128891a), 0.0f, f14, 0.0f, f22739d, 5);
                                        c2.j.f22691a.getClass();
                                        c2.j.k kVar = c2.j.f22694d;
                                        h4.d.f81522a.getClass();
                                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                                        int iHashCode = Long.hashCode(mVar4.getU());
                                        i2 i2VarX = mVar4.x();
                                        h4.r rVarC2 = h4.k.c(rVarC, mVar4);
                                        h5.g.V.getClass();
                                        h5.e0.a aVar17 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p3.p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar17);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                            v.h.z(iHashCode, mVar4, iHashCode, bVar4);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                        c2.b0 b0Var3 = c2.b0.f22601a;
                                        List<yo1.b> listB2 = hVar8.f198481d.b();
                                        boolean z212 = listB2 == null || listB2.isEmpty();
                                        final yo1.h hVar9 = hVar7;
                                        final o53.b0 b0Var4 = b0Var2;
                                        final mc mcVar3 = mcVar2;
                                        final q qVar3 = qVar2;
                                        final e23.a aVar18 = aVar13;
                                        final e23.a aVar19 = aVar14;
                                        final e23.l lVar8 = lVar7;
                                        if (!z212 || o.b(hVar8)) {
                                            mVar4.C(1033623429);
                                            h2.j0 j0Var2 = j0Var;
                                            g02.t.a(j0Var2, b0Var4, fVar3, null, mVar4, 0, 8);
                                            final String str12 = str10;
                                            final boolean z213 = z211;
                                            final String str13 = str11;
                                            final p1 p1Var10 = p1Var6;
                                            final p1 p1Var11 = p1Var7;
                                            final p1 p1Var12 = p1Var8;
                                            final p1 p1Var13 = p1Var9;
                                            h2.u.a(j0Var2, null, null, null, 2, 0.0f, null, null, false, null, null, null, null, z3.f.c(-1076188784, new e23.r() { // from class: zo1.h
                                                @Override // e23.r
                                                public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) throws Throwable {
                                                    int iIntValue3 = ((Integer) obj8).intValue();
                                                    p3.m mVar5 = (p3.m) obj9;
                                                    ((Integer) obj10).getClass();
                                                    ((h2.c0) obj7).getClass();
                                                    x1 x1Var5 = p3.n.f135158a;
                                                    yo1.h hVar10 = hVar9;
                                                    q qVar4 = qVar3;
                                                    e23.l lVar9 = lVar8;
                                                    if (iIntValue3 == 0) {
                                                        mVar5.C(869702110);
                                                        Object objQ11 = mVar5.q();
                                                        p3.m.f135153a.getClass();
                                                        p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                                                        if (objQ11 == c2565a3) {
                                                            objQ11 = new sk0.l(p1Var10, p1Var11, 9);
                                                            mVar5.K(objQ11);
                                                        }
                                                        e23.l lVar10 = (e23.l) objQ11;
                                                        Object objQ12 = mVar5.q();
                                                        if (objQ12 == c2565a3) {
                                                            objQ12 = new sk0.l(p1Var12, p1Var13, 10);
                                                            mVar5.K(objQ12);
                                                        }
                                                        r0.i(hVar10, lVar10, (e23.l) objQ12, qVar4, str12, z213, str13, lVar9, mVar5, 440);
                                                        mVar5.f();
                                                    } else if (iIntValue3 != 1) {
                                                        mVar5.C(1192626770);
                                                        mVar5.f();
                                                    } else {
                                                        mVar5.C(869736295);
                                                        w0.b(hVar10.f198481d, b0Var4, mcVar3, qVar4, aVar18, aVar19, lVar9, mVar5, yo1.j.f198503j);
                                                        mVar5.f();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, mVar4), mVar4, 24576, 24576, 16366);
                                            mVar3 = mVar4;
                                            mVar3.f();
                                        } else {
                                            mVar4.C(1033017286);
                                            w0.b(hVar9.f198481d, b0Var4, mcVar3, qVar3, aVar18, aVar19, lVar8, mVar4, yo1.j.f198503j);
                                            mVar3 = mVar4;
                                            mVar3.f();
                                        }
                                        mVar3.y();
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, mVar2), mVar2, 1769472, 20);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, ((i18 << 9) & 458752) | 806882304, 388);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(1146789352);
                    aVar8 = (a) p1Var2.getF182175a();
                    if (aVar8 == null) {
                        o0VarE.C(1190731545);
                        o0VarE.g0(false);
                        o0Var2 = o0VarE;
                        z24 = false;
                        p1Var5 = p1Var3;
                        c2565a2 = c2565a;
                        i19 = 15;
                    } else {
                        o0VarE.C(1190731546);
                        vo1.b bVar4 = (vo1.b) KoinJavaComponent.get$default(vo1.b.class, null, null, 6, null);
                        ps.x1 x1Var3 = aVar8.f206215a;
                        List<ps.x1> list3 = aVar8.f206216b;
                        String str10 = aVar8.f206217c;
                        boolean z211 = aVar8.f206218d;
                        ActivityDetailChartDTO activityDetailChartDTO3 = aVar8.f206219e;
                        yo1.f fVar3 = aVar8.f206220f;
                        boolean z212 = aVar8.f206221g;
                        boolean z213 = aVar8.f206222h;
                        e23.l<Boolean, Unit> lVar7 = aVar8.f206223i;
                        objQ7 = o0VarE.q();
                        c2565a2 = c2565a;
                        if (objQ7 == c2565a2) {
                            i19 = 15;
                            objQ7 = new p40.q0(p1Var, p1Var2, 15);
                            o0VarE.K(objQ7);
                        } else {
                            i19 = 15;
                        }
                        p1Var5 = p1Var3;
                        bVar4.e(x1Var3, list3, str10, z211, activityDetailChartDTO3, fVar3, z212, z213, z15, lVar7, (e23.a) objQ7, o0VarE, ps.x1.G1 | (yo1.f.f198451e << i19) | ((i18 << 6) & 234881024));
                        o0Var2 = o0VarE;
                        z24 = false;
                        o0Var2.g0(false);
                    }
                    o0Var2.g0(z24);
                } else {
                    o0Var2 = o0VarE;
                    p1Var5 = p1Var3;
                    c2565a2 = c2565a;
                    i19 = 15;
                    o0Var2.C(1191462216);
                    o0Var2.g0(false);
                }
                if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                    o0Var2.C(1146815359);
                    bVar = (b) p1Var4.getF182175a();
                    if (bVar == null) {
                        o0Var2.C(1191537762);
                        z19 = false;
                        o0Var2.g0(false);
                        o0Var = o0Var2;
                    } else {
                        o0Var2.C(1191537763);
                        vo1.b bVar5 = (vo1.b) KoinJavaComponent.get$default(vo1.b.class, null, null, 6, null);
                        List<ps.x1> list4 = bVar.f206228a;
                        ActivityDetailChartDTO activityDetailChartDTO4 = bVar.f206229b;
                        yo1.f fVar4 = bVar.f206230c;
                        boolean z214 = bVar.f206231d;
                        zR = o0Var2.r(bVar);
                        objQ6 = o0Var2.q();
                        if (zR) {
                            objQ6 = new x72.k(bVar, i19, p1Var5, p1Var4);
                            o0Var2.K(objQ6);
                        } else {
                            objQ6 = new x72.k(bVar, i19, p1Var5, p1Var4);
                            o0Var2.K(objQ6);
                        }
                        p3.o0 o0Var4 = o0Var2;
                        bVar5.a(list4, activityDetailChartDTO4, fVar4, z214, z15, (e23.a) objQ6, o0Var4, (yo1.f.f198451e << 6) | (57344 & (i18 >> 6)));
                        o0Var = o0Var4;
                        z19 = false;
                        o0Var.g0(false);
                    }
                    o0Var.g0(z19);
                } else {
                    o0Var = o0Var2;
                    z19 = false;
                    o0Var.C(1191983016);
                    o0Var.g0(false);
                }
                o0Var.g0(z19);
            }
            Object objQ10 = o0Var.q();
            aVar10.getClass();
            if (objQ10 == p3.m.a.f135155b) {
                objQ10 = new n(null);
                o0Var.K(objQ10);
            }
            p3.l0.e((e23.p) objQ10, unit, o0Var);
            aVar5 = aVar9;
            aVar6 = aVar7;
            lVar2 = lVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            lVar2 = lVar;
            aVar5 = aVar3;
            aVar6 = aVar4;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v02.a(hVar, z14, mcVar, b0Var, qVar, str, z15, str2, aVar, aVar6, lVar2, aVar5, i14, i15);
        }
    }

    public static final boolean b(yo1.h hVar) {
        List<yo1.d> listD;
        Object next;
        yo1.f fVar = hVar.f198486i;
        Object obj = null;
        if (fVar != null && (listD = fVar.d()) != null) {
            for (Object obj2 : listD) {
                Iterator<T> it = ((yo1.d) obj2).f().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((yo1.e) next).getRanking() == null);
                if (next != null) {
                    obj = obj2;
                    break;
                }
            }
            obj = (yo1.d) obj;
        }
        return obj != null;
    }
}
