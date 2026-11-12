package bt1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.dd;
import i3.mh;
import i3.uc;
import java.util.LinkedHashMap;
import java.util.Locale;
import l72.c3;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.l0;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:100:0x0278  */
    /* JADX WARN: Code duplicated, block: B:101:0x027a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0283  */
    /* JADX WARN: Code duplicated, block: B:105:0x0285  */
    /* JADX WARN: Code duplicated, block: B:108:0x028f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0296  */
    /* JADX WARN: Code duplicated, block: B:113:0x034a  */
    /* JADX WARN: Code duplicated, block: B:114:0x034c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0354  */
    /* JADX WARN: Code duplicated, block: B:119:0x035b  */
    /* JADX WARN: Code duplicated, block: B:122:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:124:0x0405  */
    /* JADX WARN: Code duplicated, block: B:126:0x0409  */
    /* JADX WARN: Code duplicated, block: B:127:0x040b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0413  */
    /* JADX WARN: Code duplicated, block: B:133:0x041b  */
    /* JADX WARN: Code duplicated, block: B:134:0x041d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0466  */
    /* JADX WARN: Code duplicated, block: B:139:0x046d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0471  */
    /* JADX WARN: Code duplicated, block: B:145:0x048e  */
    /* JADX WARN: Code duplicated, block: B:151:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:153:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:159:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:162:0x057c  */
    /* JADX WARN: Code duplicated, block: B:163:0x057e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0585  */
    /* JADX WARN: Code duplicated, block: B:168:0x058c  */
    /* JADX WARN: Code duplicated, block: B:171:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:173:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:174:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:179:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:184:0x0663  */
    /* JADX WARN: Code duplicated, block: B:185:0x0665  */
    /* JADX WARN: Code duplicated, block: B:188:0x066c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0674  */
    /* JADX WARN: Code duplicated, block: B:192:0x0676  */
    /* JADX WARN: Code duplicated, block: B:195:0x0696  */
    /* JADX WARN: Code duplicated, block: B:197:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:199:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:201:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:202:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:205:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:208:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:209:0x06df  */
    /* JADX WARN: Code duplicated, block: B:212:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:213:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:216:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:219:0x0703  */
    /* JADX WARN: Code duplicated, block: B:220:0x0705  */
    /* JADX WARN: Code duplicated, block: B:222:0x0727  */
    /* JADX WARN: Code duplicated, block: B:225:0x073f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0769  */
    /* JADX WARN: Code duplicated, block: B:229:0x076d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0771  */
    /* JADX WARN: Code duplicated, block: B:232:0x0773  */
    /* JADX WARN: Code duplicated, block: B:235:0x077b  */
    /* JADX WARN: Code duplicated, block: B:237:0x0782  */
    /* JADX WARN: Code duplicated, block: B:240:0x0792  */
    /* JADX WARN: Code duplicated, block: B:241:0x0794  */
    /* JADX WARN: Code duplicated, block: B:244:0x079b  */
    /* JADX WARN: Code duplicated, block: B:246:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:249:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:251:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:253:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:255:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:257:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [b92.a, kotlin.jvm.internal.j] */
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
    public static final void a(h4.r rVar, final u uVar, String str, String str2, String str3, String str4, String str5, final e23.a aVar, p3.m mVar, int i14) {
        int i15;
        String str6;
        final e23.a aVar2;
        String str7;
        o0 o0Var;
        Object obj;
        h5.g.a.f fVar;
        h4.r.a aVar3;
        c2.j.C0343j c0343j;
        h4.g.b bVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        u2 u2Var;
        j92.f fVar2;
        Object obj2;
        int i16;
        boolean z14;
        int i17;
        boolean z15;
        boolean z16;
        Object objQ;
        p3.m.a aVar4;
        Object obj3;
        x0 x0Var;
        int i18;
        boolean z17;
        boolean z18;
        Object objQ2;
        Object obj4;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objQ3;
        final int i19;
        Object obj5;
        s2 s2VarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        h5.g.a.b bVar2;
        z zVarA;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        h5.g.a.b bVar3;
        boolean z26;
        Object objQ4;
        Object obj6;
        z zVarA2;
        int iHashCode4;
        i2 i2VarA3;
        h4.r rVarC4;
        o0 o0Var2;
        boolean z27;
        Object objQ5;
        ?? r14;
        Object obj7;
        int i24;
        ?? r15;
        final int i25;
        o0 o0Var3;
        o0 o0Var4;
        boolean z28;
        boolean z29;
        boolean z34;
        Object objQ6;
        Object obj8;
        boolean z35;
        Object objQ7;
        Object obj9;
        boolean z36;
        boolean z37;
        boolean z38;
        Object objQ8;
        Object obj10;
        boolean z39;
        Object objQ9;
        Object obj11;
        uVar.getClass();
        c2 c2Var = uVar.f21157j;
        c2 c2Var2 = uVar.f21156i;
        e23.l<String, String> lVar = uVar.f21153f;
        str.getClass();
        str2.getClass();
        str4.getClass();
        o0 o0VarE = mVar.E(-789062340);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(uVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str4) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= o0VarE.B(str5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        int i26 = i15;
        if (o0VarE.n(i26 & 1, (i26 & 4793491) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object obj12 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarE = u1.n.e(x2.f(rVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar4.getClass();
            float f15 = eVar.f97920e;
            bVar4.getClass();
            h4.r rVarC5 = c2.l.C(rVarE, f14, 0.0f, f15, eVar.f97920e, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81536n;
            z zVarA3 = y.a(kVar, aVar5, o0VarE, 0);
            int iHashCode5 = Long.hashCode(o0VarE.getU());
            i2 i2VarA4 = o0VarE.a0();
            h4.r rVarC6 = h4.k.c(rVarC5, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA3, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA4, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T) {
                obj = obj12;
            } else {
                obj = obj12;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC6, o0VarE);
                b0 b0Var = b0.f22601a;
                aVar3 = h4.r.S;
                c0343j = c2.j.f22692b;
                bVar = h4.d.a.f81533k;
                s2VarA = q2.a(c0343j, bVar, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.getU());
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2Var = u2.f22900a;
                bVar4.getClass();
                h4.r rVarA = u2Var.a(c2.l.C(aVar3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 1.0f, true);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                obj2 = obj;
                mh.c(str, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97936m), o0VarE), o0VarE, (i26 >> 6) & 14, 0, 131068);
                i16 = i26 & 112;
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i17 = i26 & 29360128;
                if (i17 == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objQ = o0VarE.q();
                aVar4 = p3.m.f135153a;
                if (z16) {
                    obj3 = objQ;
                    Object dVar = new bb0.d(6, uVar, aVar);
                    o0VarE.K(dVar);
                    obj3 = dVar;
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        obj3 = objQ;
                        Object dVar2 = new bb0.d(6, uVar, aVar);
                        o0VarE.K(dVar2);
                        obj3 = dVar2;
                    }
                }
                obj3 = objQ;
                h4.r rVarD = w.d(aVar3, false, null, null, (e23.a) obj3, 15);
                bVar4.getClass();
                h4.r rVarY = c2.l.y(rVarD, eVar.f97918c);
                String upperCase = gl1.y.Q(o0VarE, R.string.lbl_reset).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                fVar2.getClass();
                x0Var = j92.f.f97933j;
                mh.c(upperCase, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
                i18 = 1;
                o0VarE.g0(true);
                c3 c3Var = c3.f110949a;
                boolean zR = o0VarE.r(obj2);
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zR | z17;
                objQ2 = o0VarE.q();
                if (z18) {
                    obj4 = objQ2;
                    Object hVar = new bp.h(i18, obj2, uVar);
                    o0VarE.K(hVar);
                    obj4 = hVar;
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        obj4 = objQ2;
                        Object hVar2 = new bp.h(i18, obj2, uVar);
                        o0VarE.K(hVar2);
                        obj4 = hVar2;
                    }
                }
                obj4 = objQ2;
                h4.r rVarC7 = p5.v.c((e23.l) obj4, aVar3, false);
                j23.f<Float> fVarD = uVar.d();
                j23.f<Float> fVar3 = uVar.f21148a;
                int i27 = uVar.f21150c;
                dd ddVar = dd.f87874a;
                long jA = d92.b.a(o0VarE).b().a().a();
                long jA2 = d92.b.a(o0VarE).b().a().a();
                d0.f128823b.getClass();
                long j8 = d0.f128831j;
                long jG = d92.b.a(o0VarE).e().g();
                ddVar.getClass();
                uc ucVarG = dd.g(jA, jA2, j8, jG, j8, o0VarE, 992);
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                String strInvoke = lVar.invoke((String) c2Var2.getF182175a());
                LinkedHashMap linkedHashMap = c0235a.f16962a;
                linkedHashMap.put("slider_start_thumb", strInvoke);
                linkedHashMap.put("slider_end_thumb", lVar.invoke((String) c2Var.getF182175a()));
                b92.a aVarB = c0235a.b();
                if (i16 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (i17 == 8388608) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z24 | z19;
                objQ3 = o0VarE.q();
                if (z25) {
                    i19 = 0;
                    Object obj13 = new e23.l() { // from class: bt1.p
                        @Override // e23.l
                        public final Object invoke(Object obj14) {
                            switch (i19) {
                                case 0:
                                    j23.f fVar4 = (j23.f) obj14;
                                    fVar4.getClass();
                                    u.h(uVar, fVar4, aVar, 2);
                                    break;
                                case 1:
                                    j jVar = (j) obj14;
                                    u uVar2 = uVar;
                                    if (jVar != null) {
                                        float f16 = jVar.f21112a;
                                        uVar2.getClass();
                                        if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                            uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                            uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                            uVar2.f();
                                            e23.a aVar7 = aVar;
                                            if (aVar7 != null) {
                                                aVar7.invoke();
                                            }
                                        }
                                    }
                                    uVar2.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    j jVar2 = (j) obj14;
                                    u uVar3 = uVar;
                                    if (jVar2 != null) {
                                        float f17 = jVar2.f21112a;
                                        uVar3.getClass();
                                        if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                            uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                            uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                            uVar3.f();
                                            e23.a aVar8 = aVar;
                                            if (aVar8 != null) {
                                                aVar8.invoke();
                                            }
                                        }
                                    }
                                    uVar3.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(obj13);
                    obj5 = obj13;
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        i19 = 0;
                        Object obj14 = new e23.l() { // from class: bt1.p
                            @Override // e23.l
                            public final Object invoke(Object obj15) {
                                switch (i19) {
                                    case 0:
                                        j23.f fVar4 = (j23.f) obj15;
                                        fVar4.getClass();
                                        u.h(uVar, fVar4, aVar, 2);
                                        break;
                                    case 1:
                                        j jVar = (j) obj15;
                                        u uVar2 = uVar;
                                        if (jVar != null) {
                                            float f16 = jVar.f21112a;
                                            uVar2.getClass();
                                            if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                                uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                                uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                                uVar2.f();
                                                e23.a aVar7 = aVar;
                                                if (aVar7 != null) {
                                                    aVar7.invoke();
                                                }
                                            }
                                        }
                                        uVar2.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        j jVar2 = (j) obj15;
                                        u uVar3 = uVar;
                                        if (jVar2 != null) {
                                            float f17 = jVar2.f21112a;
                                            uVar3.getClass();
                                            if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                                uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                                uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                                uVar3.f();
                                                e23.a aVar8 = aVar;
                                                if (aVar8 != null) {
                                                    aVar8.invoke();
                                                }
                                            }
                                        }
                                        uVar3.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(obj14);
                        obj5 = obj14;
                    } else {
                        i19 = 0;
                        obj5 = objQ3;
                    }
                }
                int i28 = b92.a.f16960b;
                c3Var.b(fVarD, (e23.l) obj5, rVarC7, false, fVar3, i27, ucVarG, aVarB, null, o0VarE, 0, 264);
                h4.r rVarF = x2.f(aVar3, 1.0f);
                s2VarA2 = q2.a(c0343j, bVar, o0VarE, i19);
                x1 x1Var2 = p3.n.f135158a;
                iHashCode2 = Long.hashCode(o0VarE.getU());
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarF, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T && p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    bVar2 = bVar5;
                } else {
                    bVar2 = bVar5;
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                h4.r rVarA2 = u2Var.a(aVar3, 1.0f, true);
                zVarA = y.a(kVar, aVar5, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.getU());
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, o0VarE);
                bVar4.getClass();
                h4.r rVarC8 = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                String strQ = gl1.y.Q(o0VarE, R.string.common_min_abbreviated_without_period);
                z5.b.f202439b.getClass();
                String strA = l0.a(strQ, z5.b.a.a());
                fVar2.getClass();
                bVar3 = bVar2;
                mh.c(strA, rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                String str8 = (String) c2Var2.getF182175a();
                String strInvoke2 = lVar.invoke((String) c2Var2.getF182175a());
                boolean zC = uVar.c();
                if (i16 == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objQ4 = o0VarE.q();
                if (z26) {
                    obj6 = objQ4;
                    final int i29 = 0;
                    Object obj15 = new e23.a() { // from class: bt1.q
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i29) {
                                case 0:
                                    uVar.f21162o.setValue(Boolean.TRUE);
                                    break;
                                case 1:
                                    uVar.f21163p.setValue(Boolean.TRUE);
                                    break;
                                case 2:
                                    uVar.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    uVar.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(obj15);
                    obj6 = obj15;
                } else {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        obj6 = objQ4;
                        final int i210 = 0;
                        Object obj16 = new e23.a() { // from class: bt1.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i210) {
                                    case 0:
                                        uVar.f21162o.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        uVar.f21163p.setValue(Boolean.TRUE);
                                        break;
                                    case 2:
                                        uVar.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        uVar.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(obj16);
                        obj6 = obj16;
                    }
                }
                obj6 = objQ4;
                n.a(null, str8, strInvoke2, zC, (e23.a) obj6, o0VarE, 0);
                o0VarE.g0(true);
                c2.l.f(u2Var.a(aVar3, 0.1f, true), o0VarE);
                h4.r rVarA3 = u2Var.a(aVar3, 1.0f, true);
                zVarA2 = y.a(kVar, aVar5, o0VarE, 0);
                iHashCode4 = Long.hashCode(o0VarE.getU());
                i2VarA3 = o0VarE.a0();
                rVarC4 = h4.k.c(rVarA3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA3, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar3);
                }
                b4.c(fVar, rVarC4, o0VarE);
                bVar4.getClass();
                h4.r rVarC9 = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                String strQ2 = gl1.y.Q(o0VarE, R.string.common_max);
                fVar2.getClass();
                mh.c(strQ2, rVarC9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                o0Var2 = o0VarE;
                String str9 = (String) c2Var.getF182175a();
                String strInvoke3 = lVar.invoke((String) c2Var.getF182175a());
                boolean zB = uVar.b();
                if (i16 == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objQ5 = o0Var2.q();
                if (z27) {
                    r14 = 1;
                    final boolean z44 = true ? 1 : 0;
                    e23.a aVar7 = new e23.a() { // from class: bt1.q
                        @Override // e23.a
                        public final Object invoke() {
                            switch (z44) {
                                case 0:
                                    uVar.f21162o.setValue(Boolean.TRUE);
                                    break;
                                case 1:
                                    uVar.f21163p.setValue(Boolean.TRUE);
                                    break;
                                case 2:
                                    uVar.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    uVar.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(aVar7);
                    obj7 = aVar7;
                } else {
                    aVar4.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        r14 = 1;
                        final int z45 = true ? 1 : 0;
                        e23.a aVar8 = new e23.a() { // from class: bt1.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (z45) {
                                    case 0:
                                        uVar.f21162o.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        uVar.f21163p.setValue(Boolean.TRUE);
                                        break;
                                    case 2:
                                        uVar.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        uVar.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var2.K(aVar8);
                        obj7 = aVar8;
                    } else {
                        r14 = 1;
                        obj7 = objQ5;
                    }
                }
                n.a(null, str9, strInvoke3, zB, (e23.a) obj7, o0Var2, 0);
                o0Var2.g0(r14);
                o0Var2.g0(r14);
                if (uVar.c()) {
                    o0Var2.C(1997752778);
                    r15 = 0;
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, r14, null);
                    str7 = str3;
                    c0235a2.f16962a.put("title", str7);
                    b92.a aVarB2 = c0235a2.b();
                    i53.c cVarE = i53.a.e(uVar.f21158k);
                    j jVar = (j) uVar.f21160m.getF182175a();
                    if (i16 == 32) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    i24 = i17;
                    if (i24 == 8388608) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z37 | z36;
                    objQ8 = o0Var2.q();
                    if (z38) {
                        aVar2 = aVar;
                        final int i30 = 1;
                        e23.l lVar2 = new e23.l() { // from class: bt1.p
                            @Override // e23.l
                            public final Object invoke(Object obj17) {
                                switch (i30) {
                                    case 0:
                                        j23.f fVar4 = (j23.f) obj17;
                                        fVar4.getClass();
                                        u.h(uVar, fVar4, aVar2, 2);
                                        break;
                                    case 1:
                                        j jVar2 = (j) obj17;
                                        u uVar2 = uVar;
                                        if (jVar2 != null) {
                                            float f16 = jVar2.f21112a;
                                            uVar2.getClass();
                                            if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                                uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                                uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                                uVar2.f();
                                                e23.a aVar9 = aVar2;
                                                if (aVar9 != null) {
                                                    aVar9.invoke();
                                                }
                                            }
                                        }
                                        uVar2.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        j jVar3 = (j) obj17;
                                        u uVar3 = uVar;
                                        if (jVar3 != null) {
                                            float f17 = jVar3.f21112a;
                                            uVar3.getClass();
                                            if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                                uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                                uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                                uVar3.f();
                                                e23.a aVar10 = aVar2;
                                                if (aVar10 != null) {
                                                    aVar10.invoke();
                                                }
                                            }
                                        }
                                        uVar3.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var2.K(lVar2);
                        obj10 = lVar2;
                    } else {
                        aVar4.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            aVar2 = aVar;
                            final int i34 = 1;
                            e23.l lVar3 = new e23.l() { // from class: bt1.p
                                @Override // e23.l
                                public final Object invoke(Object obj17) {
                                    switch (i34) {
                                        case 0:
                                            j23.f fVar4 = (j23.f) obj17;
                                            fVar4.getClass();
                                            u.h(uVar, fVar4, aVar2, 2);
                                            break;
                                        case 1:
                                            j jVar2 = (j) obj17;
                                            u uVar2 = uVar;
                                            if (jVar2 != null) {
                                                float f16 = jVar2.f21112a;
                                                uVar2.getClass();
                                                if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                                    uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                                    uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                                    uVar2.f();
                                                    e23.a aVar9 = aVar2;
                                                    if (aVar9 != null) {
                                                        aVar9.invoke();
                                                    }
                                                }
                                            }
                                            uVar2.f21162o.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            j jVar3 = (j) obj17;
                                            u uVar3 = uVar;
                                            if (jVar3 != null) {
                                                float f17 = jVar3.f21112a;
                                                uVar3.getClass();
                                                if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                                    uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                                    uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                                    uVar3.f();
                                                    e23.a aVar10 = aVar2;
                                                    if (aVar10 != null) {
                                                        aVar10.invoke();
                                                    }
                                                }
                                            }
                                            uVar3.f21163p.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var2.K(lVar3);
                            obj10 = lVar3;
                        } else {
                            aVar2 = aVar;
                            obj10 = objQ8;
                        }
                    }
                    e23.l lVar4 = (e23.l) obj10;
                    if (i16 == 32) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    objQ9 = o0Var2.q();
                    if (z39) {
                        i25 = 2;
                        e23.a aVar9 = new e23.a() { // from class: bt1.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        uVar.f21162o.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        uVar.f21163p.setValue(Boolean.TRUE);
                                        break;
                                    case 2:
                                        uVar.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        uVar.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var2.K(aVar9);
                        obj11 = aVar9;
                    } else {
                        aVar4.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            i25 = 2;
                            e23.a aVar10 = new e23.a() { // from class: bt1.q
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            uVar.f21162o.setValue(Boolean.TRUE);
                                            break;
                                        case 1:
                                            uVar.f21163p.setValue(Boolean.TRUE);
                                            break;
                                        case 2:
                                            uVar.f21162o.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            uVar.f21163p.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var2.K(aVar10);
                            obj11 = aVar10;
                        } else {
                            i25 = 2;
                            obj11 = objQ9;
                        }
                    }
                    v.a(str2, cVarE, jVar, null, null, aVarB2, lVar4, (e23.a) obj11, o0Var2, (i26 >> 9) & 14);
                    o0 o0Var5 = o0Var2;
                    o0Var5.g0(false);
                    o0Var3 = o0Var5;
                } else {
                    str7 = str3;
                    aVar2 = aVar;
                    i24 = i17;
                    r15 = 0;
                    i25 = 2;
                    o0Var2.C(1998487292);
                    o0Var2.g0(false);
                    o0Var3 = o0Var2;
                }
                if (uVar.b()) {
                    o0Var3.C(1998572170);
                    b92.a.C0235a c0235a3 = new b92.a.C0235a(r15, 1, r15);
                    str6 = str5;
                    c0235a3.f16962a.put("title", str6);
                    b92.a aVarB3 = c0235a3.b();
                    i53.c cVarE2 = i53.a.e(uVar.f21159l);
                    j jVar2 = (j) uVar.f21161n.getF182175a();
                    if (i16 == 32) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    if (i24 == 8388608) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = z29 | z28;
                    objQ6 = o0Var3.q();
                    if (z34) {
                        obj8 = objQ6;
                        Object obj17 = new e23.l() { // from class: bt1.p
                            @Override // e23.l
                            public final Object invoke(Object obj18) {
                                switch (i25) {
                                    case 0:
                                        j23.f fVar4 = (j23.f) obj18;
                                        fVar4.getClass();
                                        u.h(uVar, fVar4, aVar2, 2);
                                        break;
                                    case 1:
                                        j jVar3 = (j) obj18;
                                        u uVar2 = uVar;
                                        if (jVar3 != null) {
                                            float f16 = jVar3.f21112a;
                                            uVar2.getClass();
                                            if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                                uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                                uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                                uVar2.f();
                                                e23.a aVar11 = aVar2;
                                                if (aVar11 != null) {
                                                    aVar11.invoke();
                                                }
                                            }
                                        }
                                        uVar2.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        j jVar4 = (j) obj18;
                                        u uVar3 = uVar;
                                        if (jVar4 != null) {
                                            float f17 = jVar4.f21112a;
                                            uVar3.getClass();
                                            if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                                uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                                uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                                uVar3.f();
                                                e23.a aVar12 = aVar2;
                                                if (aVar12 != null) {
                                                    aVar12.invoke();
                                                }
                                            }
                                        }
                                        uVar3.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var3.K(obj17);
                        obj8 = obj17;
                    } else {
                        aVar4.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            obj8 = objQ6;
                            Object obj18 = new e23.l() { // from class: bt1.p
                                @Override // e23.l
                                public final Object invoke(Object obj19) {
                                    switch (i25) {
                                        case 0:
                                            j23.f fVar4 = (j23.f) obj19;
                                            fVar4.getClass();
                                            u.h(uVar, fVar4, aVar2, 2);
                                            break;
                                        case 1:
                                            j jVar3 = (j) obj19;
                                            u uVar2 = uVar;
                                            if (jVar3 != null) {
                                                float f16 = jVar3.f21112a;
                                                uVar2.getClass();
                                                if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                                    uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                                    uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                                    uVar2.f();
                                                    e23.a aVar11 = aVar2;
                                                    if (aVar11 != null) {
                                                        aVar11.invoke();
                                                    }
                                                }
                                            }
                                            uVar2.f21162o.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            j jVar4 = (j) obj19;
                                            u uVar3 = uVar;
                                            if (jVar4 != null) {
                                                float f17 = jVar4.f21112a;
                                                uVar3.getClass();
                                                if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                                    uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                                    uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                                    uVar3.f();
                                                    e23.a aVar12 = aVar2;
                                                    if (aVar12 != null) {
                                                        aVar12.invoke();
                                                    }
                                                }
                                            }
                                            uVar3.f21163p.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var3.K(obj18);
                            obj8 = obj18;
                        }
                    }
                    obj8 = objQ6;
                    e23.l lVar5 = (e23.l) obj8;
                    if (i16 == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ7 = o0Var3.q();
                    if (z35) {
                        obj9 = objQ7;
                        final int i35 = 3;
                        Object obj19 = new e23.a() { // from class: bt1.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i35) {
                                    case 0:
                                        uVar.f21162o.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        uVar.f21163p.setValue(Boolean.TRUE);
                                        break;
                                    case 2:
                                        uVar.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        uVar.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var3.K(obj19);
                        obj9 = obj19;
                    } else {
                        aVar4.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            obj9 = objQ7;
                            final int i36 = 3;
                            Object obj110 = new e23.a() { // from class: bt1.q
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i36) {
                                        case 0:
                                            uVar.f21162o.setValue(Boolean.TRUE);
                                            break;
                                        case 1:
                                            uVar.f21163p.setValue(Boolean.TRUE);
                                            break;
                                        case 2:
                                            uVar.f21162o.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            uVar.f21163p.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var3.K(obj110);
                            obj9 = obj110;
                        }
                    }
                    obj9 = objQ7;
                    o0 o0Var6 = o0Var3;
                    v.a(str4, cVarE2, jVar2, null, null, aVarB3, lVar5, (e23.a) obj9, o0Var6, (i26 >> 15) & 14);
                    o0 o0Var7 = o0Var6;
                    o0Var7.g0(false);
                    o0Var4 = o0Var7;
                } else {
                    str6 = str5;
                    o0Var3.C(1999306684);
                    o0Var3.g0(false);
                    o0Var4 = o0Var3;
                }
                o0Var4.g0(true);
                x1 x1Var3 = p3.n.f135158a;
                o0Var = o0Var4;
            }
            v.h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC6, o0VarE);
            b0 b0Var2 = b0.f22601a;
            aVar3 = h4.r.S;
            c0343j = c2.j.f22692b;
            bVar = h4.d.a.f81533k;
            s2VarA = q2.a(c0343j, bVar, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.getU());
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar3, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2Var = u2.f22900a;
            bVar4.getClass();
            h4.r rVarA4 = u2Var.a(c2.l.C(aVar3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 1.0f, true);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            obj2 = obj;
            mh.c(str, rVarA4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97936m), o0VarE), o0VarE, (i26 >> 6) & 14, 0, 131068);
            i16 = i26 & 112;
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            i17 = i26 & 29360128;
            if (i17 == 8388608) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objQ = o0VarE.q();
            aVar4 = p3.m.f135153a;
            if (z16) {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    obj3 = objQ;
                    Object dVar3 = new bb0.d(6, uVar, aVar);
                    o0VarE.K(dVar3);
                    obj3 = dVar3;
                }
            } else {
                obj3 = objQ;
                Object dVar4 = new bb0.d(6, uVar, aVar);
                o0VarE.K(dVar4);
                obj3 = dVar4;
            }
            obj3 = objQ;
            h4.r rVarD2 = w.d(aVar3, false, null, null, (e23.a) obj3, 15);
            bVar4.getClass();
            h4.r rVarY2 = c2.l.y(rVarD2, eVar.f97918c);
            String upperCase2 = gl1.y.Q(o0VarE, R.string.lbl_reset).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            fVar2.getClass();
            x0Var = j92.f.f97933j;
            mh.c(upperCase2, rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
            i18 = 1;
            o0VarE.g0(true);
            c3 c3Var2 = c3.f110949a;
            boolean zR2 = o0VarE.r(obj2);
            if (i16 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zR2 | z17;
            objQ2 = o0VarE.q();
            if (z18) {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    obj4 = objQ2;
                    Object hVar3 = new bp.h(i18, obj2, uVar);
                    o0VarE.K(hVar3);
                    obj4 = hVar3;
                }
            } else {
                obj4 = objQ2;
                Object hVar4 = new bp.h(i18, obj2, uVar);
                o0VarE.K(hVar4);
                obj4 = hVar4;
            }
            obj4 = objQ2;
            h4.r rVarC10 = p5.v.c((e23.l) obj4, aVar3, false);
            j23.f<Float> fVarD2 = uVar.d();
            j23.f<Float> fVar4 = uVar.f21148a;
            int i211 = uVar.f21150c;
            dd ddVar2 = dd.f87874a;
            long jA3 = d92.b.a(o0VarE).b().a().a();
            long jA4 = d92.b.a(o0VarE).b().a().a();
            d0.f128823b.getClass();
            long j14 = d0.f128831j;
            long jG2 = d92.b.a(o0VarE).e().g();
            ddVar2.getClass();
            uc ucVarG2 = dd.g(jA3, jA4, j14, jG2, j14, o0VarE, 992);
            b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
            String strInvoke4 = lVar.invoke((String) c2Var2.getF182175a());
            LinkedHashMap linkedHashMap2 = c0235a4.f16962a;
            linkedHashMap2.put("slider_start_thumb", strInvoke4);
            linkedHashMap2.put("slider_end_thumb", lVar.invoke((String) c2Var.getF182175a()));
            b92.a aVarB4 = c0235a4.b();
            if (i16 == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (i17 == 8388608) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = z24 | z19;
            objQ3 = o0VarE.q();
            if (z25) {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    i19 = 0;
                    Object obj111 = new e23.l() { // from class: bt1.p
                        @Override // e23.l
                        public final Object invoke(Object obj112) {
                            switch (i19) {
                                case 0:
                                    j23.f fVar5 = (j23.f) obj112;
                                    fVar5.getClass();
                                    u.h(uVar, fVar5, aVar, 2);
                                    break;
                                case 1:
                                    j jVar3 = (j) obj112;
                                    u uVar2 = uVar;
                                    if (jVar3 != null) {
                                        float f16 = jVar3.f21112a;
                                        uVar2.getClass();
                                        if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                            uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                            uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                            uVar2.f();
                                            e23.a aVar11 = aVar;
                                            if (aVar11 != null) {
                                                aVar11.invoke();
                                            }
                                        }
                                    }
                                    uVar2.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    j jVar4 = (j) obj112;
                                    u uVar3 = uVar;
                                    if (jVar4 != null) {
                                        float f17 = jVar4.f21112a;
                                        uVar3.getClass();
                                        if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                            uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                            uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                            uVar3.f();
                                            e23.a aVar12 = aVar;
                                            if (aVar12 != null) {
                                                aVar12.invoke();
                                            }
                                        }
                                    }
                                    uVar3.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(obj111);
                    obj5 = obj111;
                } else {
                    i19 = 0;
                    obj5 = objQ3;
                }
            } else {
                i19 = 0;
                Object obj112 = new e23.l() { // from class: bt1.p
                    @Override // e23.l
                    public final Object invoke(Object obj113) {
                        switch (i19) {
                            case 0:
                                j23.f fVar5 = (j23.f) obj113;
                                fVar5.getClass();
                                u.h(uVar, fVar5, aVar, 2);
                                break;
                            case 1:
                                j jVar3 = (j) obj113;
                                u uVar2 = uVar;
                                if (jVar3 != null) {
                                    float f16 = jVar3.f21112a;
                                    uVar2.getClass();
                                    if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                        uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                        uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                        uVar2.f();
                                        e23.a aVar11 = aVar;
                                        if (aVar11 != null) {
                                            aVar11.invoke();
                                        }
                                    }
                                }
                                uVar2.f21162o.setValue(Boolean.FALSE);
                                break;
                            default:
                                j jVar4 = (j) obj113;
                                u uVar3 = uVar;
                                if (jVar4 != null) {
                                    float f17 = jVar4.f21112a;
                                    uVar3.getClass();
                                    if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                        uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                        uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                        uVar3.f();
                                        e23.a aVar12 = aVar;
                                        if (aVar12 != null) {
                                            aVar12.invoke();
                                        }
                                    }
                                }
                                uVar3.f21163p.setValue(Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj112);
                obj5 = obj112;
            }
            int i212 = b92.a.f16960b;
            c3Var2.b(fVarD2, (e23.l) obj5, rVarC10, false, fVar4, i211, ucVarG2, aVarB4, null, o0VarE, 0, 264);
            h4.r rVarF2 = x2.f(aVar3, 1.0f);
            s2VarA2 = q2.a(c0343j, bVar, o0VarE, i19);
            x1 x1Var4 = p3.n.f135158a;
            iHashCode2 = Long.hashCode(o0VarE.getU());
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarF2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                bVar2 = bVar5;
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                bVar2 = bVar5;
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarA5 = u2Var.a(aVar3, 1.0f, true);
            zVarA = y.a(kVar, aVar5, o0VarE, 0);
            iHashCode3 = Long.hashCode(o0VarE.getU());
            i2VarA2 = o0VarE.a0();
            rVarC3 = h4.k.c(rVarA5, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            bVar4.getClass();
            h4.r rVarC11 = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            String strQ3 = gl1.y.Q(o0VarE, R.string.common_min_abbreviated_without_period);
            z5.b.f202439b.getClass();
            String strA2 = l0.a(strQ3, z5.b.a.a());
            fVar2.getClass();
            bVar3 = bVar2;
            mh.c(strA2, rVarC11, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            String str10 = (String) c2Var2.getF182175a();
            String strInvoke5 = lVar.invoke((String) c2Var2.getF182175a());
            boolean zC2 = uVar.c();
            if (i16 == 32) {
                z26 = true;
            } else {
                z26 = false;
            }
            objQ4 = o0VarE.q();
            if (z26) {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    obj6 = objQ4;
                    final int i213 = 0;
                    Object obj113 = new e23.a() { // from class: bt1.q
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i213) {
                                case 0:
                                    uVar.f21162o.setValue(Boolean.TRUE);
                                    break;
                                case 1:
                                    uVar.f21163p.setValue(Boolean.TRUE);
                                    break;
                                case 2:
                                    uVar.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    uVar.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(obj113);
                    obj6 = obj113;
                }
            } else {
                obj6 = objQ4;
                final int i214 = 0;
                Object obj114 = new e23.a() { // from class: bt1.q
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i214) {
                            case 0:
                                uVar.f21162o.setValue(Boolean.TRUE);
                                break;
                            case 1:
                                uVar.f21163p.setValue(Boolean.TRUE);
                                break;
                            case 2:
                                uVar.f21162o.setValue(Boolean.FALSE);
                                break;
                            default:
                                uVar.f21163p.setValue(Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj114);
                obj6 = obj114;
            }
            obj6 = objQ4;
            n.a(null, str10, strInvoke5, zC2, (e23.a) obj6, o0VarE, 0);
            o0VarE.g0(true);
            c2.l.f(u2Var.a(aVar3, 0.1f, true), o0VarE);
            h4.r rVarA6 = u2Var.a(aVar3, 1.0f, true);
            zVarA2 = y.a(kVar, aVar5, o0VarE, 0);
            iHashCode4 = Long.hashCode(o0VarE.getU());
            i2VarA3 = o0VarE.a0();
            rVarC4 = h4.k.c(rVarA6, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar3);
            } else {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar3);
            }
            b4.c(fVar, rVarC4, o0VarE);
            bVar4.getClass();
            h4.r rVarC12 = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            String strQ4 = gl1.y.Q(o0VarE, R.string.common_max);
            fVar2.getClass();
            mh.c(strQ4, rVarC12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            o0Var2 = o0VarE;
            String str11 = (String) c2Var.getF182175a();
            String strInvoke6 = lVar.invoke((String) c2Var.getF182175a());
            boolean zB2 = uVar.b();
            if (i16 == 32) {
                z27 = true;
            } else {
                z27 = false;
            }
            objQ5 = o0Var2.q();
            if (z27) {
                aVar4.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    r14 = 1;
                    final int z46 = true ? 1 : 0;
                    e23.a aVar11 = new e23.a() { // from class: bt1.q
                        @Override // e23.a
                        public final Object invoke() {
                            switch (z46) {
                                case 0:
                                    uVar.f21162o.setValue(Boolean.TRUE);
                                    break;
                                case 1:
                                    uVar.f21163p.setValue(Boolean.TRUE);
                                    break;
                                case 2:
                                    uVar.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    uVar.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(aVar11);
                    obj7 = aVar11;
                } else {
                    r14 = 1;
                    obj7 = objQ5;
                }
            } else {
                r14 = 1;
                final int z47 = true ? 1 : 0;
                e23.a aVar12 = new e23.a() { // from class: bt1.q
                    @Override // e23.a
                    public final Object invoke() {
                        switch (z47) {
                            case 0:
                                uVar.f21162o.setValue(Boolean.TRUE);
                                break;
                            case 1:
                                uVar.f21163p.setValue(Boolean.TRUE);
                                break;
                            case 2:
                                uVar.f21162o.setValue(Boolean.FALSE);
                                break;
                            default:
                                uVar.f21163p.setValue(Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0Var2.K(aVar12);
                obj7 = aVar12;
            }
            n.a(null, str11, strInvoke6, zB2, (e23.a) obj7, o0Var2, 0);
            o0Var2.g0(r14);
            o0Var2.g0(r14);
            if (uVar.c()) {
                o0Var2.C(1997752778);
                r15 = 0;
                b92.a.C0235a c0235a5 = new b92.a.C0235a(null, r14, null);
                str7 = str3;
                c0235a5.f16962a.put("title", str7);
                b92.a aVarB5 = c0235a5.b();
                i53.c cVarE3 = i53.a.e(uVar.f21158k);
                j jVar3 = (j) uVar.f21160m.getF182175a();
                if (i16 == 32) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                i24 = i17;
                if (i24 == 8388608) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z37 | z36;
                objQ8 = o0Var2.q();
                if (z38) {
                    aVar4.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        aVar2 = aVar;
                        final int i37 = 1;
                        e23.l lVar6 = new e23.l() { // from class: bt1.p
                            @Override // e23.l
                            public final Object invoke(Object obj115) {
                                switch (i37) {
                                    case 0:
                                        j23.f fVar5 = (j23.f) obj115;
                                        fVar5.getClass();
                                        u.h(uVar, fVar5, aVar2, 2);
                                        break;
                                    case 1:
                                        j jVar4 = (j) obj115;
                                        u uVar2 = uVar;
                                        if (jVar4 != null) {
                                            float f16 = jVar4.f21112a;
                                            uVar2.getClass();
                                            if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                                uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                                uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                                uVar2.f();
                                                e23.a aVar13 = aVar2;
                                                if (aVar13 != null) {
                                                    aVar13.invoke();
                                                }
                                            }
                                        }
                                        uVar2.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        j jVar5 = (j) obj115;
                                        u uVar3 = uVar;
                                        if (jVar5 != null) {
                                            float f17 = jVar5.f21112a;
                                            uVar3.getClass();
                                            if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                                uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                                uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                                uVar3.f();
                                                e23.a aVar14 = aVar2;
                                                if (aVar14 != null) {
                                                    aVar14.invoke();
                                                }
                                            }
                                        }
                                        uVar3.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var2.K(lVar6);
                        obj10 = lVar6;
                    } else {
                        aVar2 = aVar;
                        obj10 = objQ8;
                    }
                } else {
                    aVar2 = aVar;
                    final int i38 = 1;
                    e23.l lVar7 = new e23.l() { // from class: bt1.p
                        @Override // e23.l
                        public final Object invoke(Object obj115) {
                            switch (i38) {
                                case 0:
                                    j23.f fVar5 = (j23.f) obj115;
                                    fVar5.getClass();
                                    u.h(uVar, fVar5, aVar2, 2);
                                    break;
                                case 1:
                                    j jVar4 = (j) obj115;
                                    u uVar2 = uVar;
                                    if (jVar4 != null) {
                                        float f16 = jVar4.f21112a;
                                        uVar2.getClass();
                                        if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                            uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                            uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                            uVar2.f();
                                            e23.a aVar13 = aVar2;
                                            if (aVar13 != null) {
                                                aVar13.invoke();
                                            }
                                        }
                                    }
                                    uVar2.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    j jVar5 = (j) obj115;
                                    u uVar3 = uVar;
                                    if (jVar5 != null) {
                                        float f17 = jVar5.f21112a;
                                        uVar3.getClass();
                                        if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                            uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                            uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                            uVar3.f();
                                            e23.a aVar14 = aVar2;
                                            if (aVar14 != null) {
                                                aVar14.invoke();
                                            }
                                        }
                                    }
                                    uVar3.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(lVar7);
                    obj10 = lVar7;
                }
                e23.l lVar8 = (e23.l) obj10;
                if (i16 == 32) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                objQ9 = o0Var2.q();
                if (z39) {
                    aVar4.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        i25 = 2;
                        e23.a aVar13 = new e23.a() { // from class: bt1.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        uVar.f21162o.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        uVar.f21163p.setValue(Boolean.TRUE);
                                        break;
                                    case 2:
                                        uVar.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        uVar.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var2.K(aVar13);
                        obj11 = aVar13;
                    } else {
                        i25 = 2;
                        obj11 = objQ9;
                    }
                } else {
                    i25 = 2;
                    e23.a aVar14 = new e23.a() { // from class: bt1.q
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    uVar.f21162o.setValue(Boolean.TRUE);
                                    break;
                                case 1:
                                    uVar.f21163p.setValue(Boolean.TRUE);
                                    break;
                                case 2:
                                    uVar.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    uVar.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(aVar14);
                    obj11 = aVar14;
                }
                v.a(str2, cVarE3, jVar3, null, null, aVarB5, lVar8, (e23.a) obj11, o0Var2, (i26 >> 9) & 14);
                o0 o0Var8 = o0Var2;
                o0Var8.g0(false);
                o0Var3 = o0Var8;
            } else {
                str7 = str3;
                aVar2 = aVar;
                i24 = i17;
                r15 = 0;
                i25 = 2;
                o0Var2.C(1998487292);
                o0Var2.g0(false);
                o0Var3 = o0Var2;
            }
            if (uVar.b()) {
                o0Var3.C(1998572170);
                b92.a.C0235a c0235a6 = new b92.a.C0235a(r15, 1, r15);
                str6 = str5;
                c0235a6.f16962a.put("title", str6);
                b92.a aVarB6 = c0235a6.b();
                i53.c cVarE4 = i53.a.e(uVar.f21159l);
                j jVar4 = (j) uVar.f21161n.getF182175a();
                if (i16 == 32) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                if (i24 == 8388608) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z34 = z29 | z28;
                objQ6 = o0Var3.q();
                if (z34) {
                    aVar4.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        obj8 = objQ6;
                        Object obj115 = new e23.l() { // from class: bt1.p
                            @Override // e23.l
                            public final Object invoke(Object obj116) {
                                switch (i25) {
                                    case 0:
                                        j23.f fVar5 = (j23.f) obj116;
                                        fVar5.getClass();
                                        u.h(uVar, fVar5, aVar2, 2);
                                        break;
                                    case 1:
                                        j jVar5 = (j) obj116;
                                        u uVar2 = uVar;
                                        if (jVar5 != null) {
                                            float f16 = jVar5.f21112a;
                                            uVar2.getClass();
                                            if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                                uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                                uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                                uVar2.f();
                                                e23.a aVar15 = aVar2;
                                                if (aVar15 != null) {
                                                    aVar15.invoke();
                                                }
                                            }
                                        }
                                        uVar2.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        j jVar6 = (j) obj116;
                                        u uVar3 = uVar;
                                        if (jVar6 != null) {
                                            float f17 = jVar6.f21112a;
                                            uVar3.getClass();
                                            if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                                uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                                uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                                uVar3.f();
                                                e23.a aVar16 = aVar2;
                                                if (aVar16 != null) {
                                                    aVar16.invoke();
                                                }
                                            }
                                        }
                                        uVar3.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var3.K(obj115);
                        obj8 = obj115;
                    }
                } else {
                    obj8 = objQ6;
                    Object obj116 = new e23.l() { // from class: bt1.p
                        @Override // e23.l
                        public final Object invoke(Object obj117) {
                            switch (i25) {
                                case 0:
                                    j23.f fVar5 = (j23.f) obj117;
                                    fVar5.getClass();
                                    u.h(uVar, fVar5, aVar2, 2);
                                    break;
                                case 1:
                                    j jVar5 = (j) obj117;
                                    u uVar2 = uVar;
                                    if (jVar5 != null) {
                                        float f16 = jVar5.f21112a;
                                        uVar2.getClass();
                                        if (!Float.isNaN(f16) && f16 <= uVar2.d().b().floatValue()) {
                                            uVar2.f21155h.setValue(new j23.e(f16, uVar2.d().b().floatValue()));
                                            uVar2.f21156i.setValue(uVar2.f21152e.invoke(Float.valueOf(f16)));
                                            uVar2.f();
                                            e23.a aVar15 = aVar2;
                                            if (aVar15 != null) {
                                                aVar15.invoke();
                                            }
                                        }
                                    }
                                    uVar2.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    j jVar6 = (j) obj117;
                                    u uVar3 = uVar;
                                    if (jVar6 != null) {
                                        float f17 = jVar6.f21112a;
                                        uVar3.getClass();
                                        if (!Float.isNaN(f17) && f17 >= uVar3.d().getStart().floatValue()) {
                                            uVar3.f21155h.setValue(new j23.e(uVar3.d().getStart().floatValue(), f17));
                                            uVar3.f21157j.setValue(uVar3.f21152e.invoke(Float.valueOf(f17)));
                                            uVar3.f();
                                            e23.a aVar16 = aVar2;
                                            if (aVar16 != null) {
                                                aVar16.invoke();
                                            }
                                        }
                                    }
                                    uVar3.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var3.K(obj116);
                    obj8 = obj116;
                }
                obj8 = objQ6;
                e23.l lVar9 = (e23.l) obj8;
                if (i16 == 32) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                objQ7 = o0Var3.q();
                if (z35) {
                    aVar4.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        obj9 = objQ7;
                        final int i39 = 3;
                        Object obj117 = new e23.a() { // from class: bt1.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i39) {
                                    case 0:
                                        uVar.f21162o.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        uVar.f21163p.setValue(Boolean.TRUE);
                                        break;
                                    case 2:
                                        uVar.f21162o.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        uVar.f21163p.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var3.K(obj117);
                        obj9 = obj117;
                    }
                } else {
                    obj9 = objQ7;
                    final int i310 = 3;
                    Object obj118 = new e23.a() { // from class: bt1.q
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i310) {
                                case 0:
                                    uVar.f21162o.setValue(Boolean.TRUE);
                                    break;
                                case 1:
                                    uVar.f21163p.setValue(Boolean.TRUE);
                                    break;
                                case 2:
                                    uVar.f21162o.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    uVar.f21163p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var3.K(obj118);
                    obj9 = obj118;
                }
                obj9 = objQ7;
                o0 o0Var9 = o0Var3;
                v.a(str4, cVarE4, jVar4, null, null, aVarB6, lVar9, (e23.a) obj9, o0Var9, (i26 >> 15) & 14);
                o0 o0Var10 = o0Var9;
                o0Var10.g0(false);
                o0Var4 = o0Var10;
            } else {
                str6 = str5;
                o0Var3.C(1999306684);
                o0Var3.g0(false);
                o0Var4 = o0Var3;
            }
            o0Var4.g0(true);
            x1 x1Var5 = p3.n.f135158a;
            o0Var = o0Var4;
        } else {
            str6 = str5;
            aVar2 = aVar;
            str7 = str3;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar, uVar, str, str2, str7, str4, str6, aVar2, i14, 0);
        }
    }
}
