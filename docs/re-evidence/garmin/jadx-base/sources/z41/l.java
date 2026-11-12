package z41;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import j23.t;
import java.util.Collection;
import l72.p2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import ya0.f0;
import yg2.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202349a;

        static {
            int[] iArr = new int[t41.g.values().length];
            try {
                iArr[t41.g.GOAL_PACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t41.g.GOAL_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t41.g.SPLIT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t41.g.DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f202349a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0331  */
    /* JADX WARN: Code duplicated, block: B:104:0x0333  */
    /* JADX WARN: Code duplicated, block: B:110:0x0354  */
    /* JADX WARN: Code duplicated, block: B:113:0x0384  */
    /* JADX WARN: Code duplicated, block: B:114:0x0386  */
    /* JADX WARN: Code duplicated, block: B:118:0x038f  */
    /* JADX WARN: Code duplicated, block: B:121:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:122:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x03db  */
    /* JADX WARN: Code duplicated, block: B:125:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:129:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:134:0x0427  */
    /* JADX WARN: Code duplicated, block: B:137:0x0436  */
    /* JADX WARN: Code duplicated, block: B:138:0x0438  */
    /* JADX WARN: Code duplicated, block: B:142:0x0443  */
    /* JADX WARN: Code duplicated, block: B:145:0x0451  */
    /* JADX WARN: Code duplicated, block: B:146:0x0453  */
    /* JADX WARN: Code duplicated, block: B:150:0x045e  */
    /* JADX WARN: Code duplicated, block: B:153:0x046c  */
    /* JADX WARN: Code duplicated, block: B:154:0x046e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0477  */
    /* JADX WARN: Code duplicated, block: B:161:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:164:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:167:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:168:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:172:0x0509  */
    /* JADX WARN: Code duplicated, block: B:176:0x0523  */
    /* JADX WARN: Code duplicated, block: B:178:0x0553  */
    /* JADX WARN: Code duplicated, block: B:181:0x0572  */
    /* JADX WARN: Code duplicated, block: B:183:0x057a  */
    /* JADX WARN: Code duplicated, block: B:184:0x057e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0587  */
    /* JADX WARN: Code duplicated, block: B:188:0x058b  */
    /* JADX WARN: Code duplicated, block: B:191:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:192:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:196:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:200:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:202:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:205:0x0604  */
    /* JADX WARN: Code duplicated, block: B:208:0x0618  */
    /* JADX WARN: Code duplicated, block: B:210:0x0626  */
    /* JADX WARN: Code duplicated, block: B:214:0x064b  */
    /* JADX WARN: Code duplicated, block: B:215:0x064d  */
    /* JADX WARN: Code duplicated, block: B:219:0x0657  */
    /* JADX WARN: Code duplicated, block: B:223:0x0670  */
    /* JADX WARN: Code duplicated, block: B:225:0x0686  */
    /* JADX WARN: Code duplicated, block: B:228:0x069b  */
    /* JADX WARN: Code duplicated, block: B:230:0x06af  */
    /* JADX WARN: Code duplicated, block: B:231:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:237:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:241:0x0707  */
    /* JADX WARN: Code duplicated, block: B:243:0x0718  */
    /* JADX WARN: Code duplicated, block: B:79:0x0249  */
    /* JADX WARN: Code duplicated, block: B:80:0x024b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0265  */
    /* JADX WARN: Code duplicated, block: B:90:0x02af  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:94:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v60 */
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
    public static final void a(o51.f fVar, e23.l<? super w41.a, Unit> lVar, p3.m mVar, int i14) {
        o51.f fVar2;
        o0 o0Var;
        Object obj;
        final p1 p1Var;
        Context context;
        Object obj2;
        boolean z14;
        boolean zB;
        Object obj3;
        Object obj4;
        int i15;
        final o51.f fVar3;
        int i16;
        boolean zB2;
        Object objQ;
        boolean z15;
        boolean zB3;
        Object obj5;
        final p1 p1Var2;
        final o51.f fVar4;
        int i17;
        boolean z16;
        boolean zB4;
        Object objQ2;
        p1 p1Var3;
        o0 o0Var2;
        boolean z17;
        Object objQ3;
        o51.b bVar;
        boolean z18;
        boolean z19;
        Object objQ4;
        o0 o0Var3;
        boolean zB5;
        Object objQ5;
        boolean z24;
        Object objQ6;
        boolean z25;
        Object objQ7;
        boolean z26;
        Object objQ8;
        o51.f fVar5;
        x3 x3Var;
        p1 p1Var4;
        boolean z27;
        o0 o0Var4;
        o0 o0Var5;
        t41.g gVarValueOf;
        boolean z28;
        boolean zK;
        Object jVar;
        ?? r14;
        int i18;
        p1 p1Var5;
        boolean zB6;
        Object objQ9;
        boolean zB7;
        Object objQ10;
        Collection collectionK;
        boolean z29;
        boolean z34;
        Object objQ11;
        boolean zB8;
        Object objQ12;
        int i19;
        int i24;
        boolean z35;
        boolean z36;
        Object objQ13;
        boolean zB9;
        Object objQ14;
        String strP;
        boolean zB10;
        Object objQ15;
        boolean z37;
        boolean z38;
        Object objQ16;
        boolean zB11;
        Object objQ17;
        e23.l<? super w41.a, Unit> lVar2 = lVar;
        fVar.getClass();
        boolean z39 = fVar.f129246k;
        String str = fVar.f129257v;
        String str2 = fVar.f129252q;
        Long l14 = fVar.f129237b;
        lVar2.getClass();
        o0 o0VarE = mVar.E(-497501013);
        int i25 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.r(lVar2) ? 32 : 16);
        if (o0VarE.n(i25 & 1, (i25 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ18 = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj6 = p3.m.a.f135155b;
            if (objQ18 == obj6) {
                objQ18 = new yx2.b(28);
                o0VarE.K(objQ18);
            }
            final p1 p1Var6 = (p1) d4.a.e(objArr, (e23.a) objQ18, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ19 = o0VarE.q();
            if (objQ19 == obj6) {
                objQ19 = new yx2.b(29);
                o0VarE.K(objQ19);
            }
            p1 p1Var7 = (p1) d4.a.e(objArr2, (e23.a) objQ19, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ20 = o0VarE.q();
            if (objQ20 == obj6) {
                objQ20 = new j(0);
                o0VarE.K(objQ20);
            }
            final p1 p1Var8 = (p1) d4.a.e(objArr3, (e23.a) objQ20, o0VarE, 48);
            Object[] objArr4 = new Object[0];
            Object objQ21 = o0VarE.q();
            if (objQ21 == obj6) {
                objQ21 = new j(1);
                o0VarE.K(objQ21);
            }
            final p1 p1Var9 = (p1) d4.a.e(objArr4, (e23.a) objQ21, o0VarE, 48);
            Object[] objArr5 = new Object[0];
            Object objQ22 = o0VarE.q();
            if (objQ22 == obj6) {
                objQ22 = new j(2);
                o0VarE.K(objQ22);
            }
            p1 p1Var10 = (p1) d4.a.e(objArr5, (e23.a) objQ22, o0VarE, 48);
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_name);
            String str3 = fVar.f129238c;
            int i26 = i25 & 112;
            boolean z44 = i26 == 32;
            Object objQ23 = o0VarE.q();
            if (z44 || objQ23 == obj6) {
                objQ23 = new wr1.d(lVar2, 21);
                o0VarE.K(objQ23);
            }
            c51.a.a(strQ, str3, (e23.l) objQ23, null, o0VarE, 0);
            p2 p2Var = p2.f111205a;
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_distance);
            String str4 = fVar.f129245j;
            boolean z45 = l14 == null;
            int i27 = i25 & 14;
            boolean zB12 = (i27 == 4) | o0VarE.B(p1Var10) | o0VarE.B(p1Var9) | (i26 == 32);
            Object objQ24 = o0VarE.q();
            if (zB12 || objQ24 == obj6) {
                obj = obj6;
                objQ24 = new ug2.k(fVar, lVar2, p1Var10, p1Var9, 22);
                p1Var = p1Var10;
                o0VarE.K(objQ24);
            } else {
                obj = obj6;
                p1Var = p1Var10;
            }
            p2Var.h(strQ2, str4, null, null, null, z45, false, null, null, null, (e23.a) objQ24, o0VarE, 0, 0, 988);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_goal_time);
            String str5 = fVar.f129251p;
            boolean zB13 = o0VarE.B(str2);
            Object objQ25 = o0VarE.q();
            if (zB13) {
                context = r17;
                obj2 = obj;
            } else {
                context = context2;
                obj2 = obj;
                if (objQ25 == obj2) {
                }
                b92.a aVar3 = (b92.a) objQ25;
                if (i27 != 4) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                zB = o0VarE.B(p1Var) | z14 | o0VarE.B(p1Var9) | o0VarE.B(p1Var6);
                Object objQ26 = o0VarE.q();
                if (!zB || objQ26 == obj2) {
                    final int i28 = 0;
                    obj4 = "label_secondary";
                    i15 = i27;
                    fVar3 = fVar;
                    obj3 = new e23.a() { // from class: z41.k
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i28) {
                                case 0:
                                    if (fVar3.E) {
                                        p1Var.setValue("GOAL_TIME");
                                        l.b(p1Var9, true);
                                    } else {
                                        p1Var6.setValue(Boolean.TRUE);
                                    }
                                    break;
                                case 1:
                                    if (fVar3.E) {
                                        p1Var.setValue("GOAL_PACE");
                                        l.b(p1Var9, true);
                                    } else {
                                        p1Var6.setValue(Boolean.TRUE);
                                    }
                                    break;
                                default:
                                    if (fVar3.E) {
                                        p1Var.setValue("SPLIT_TYPE");
                                        l.b(p1Var9, true);
                                    } else {
                                        p1Var6.setValue(Boolean.TRUE);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(obj3);
                } else {
                    i15 = i27;
                    obj3 = objQ26;
                    fVar3 = fVar;
                    obj4 = "label_secondary";
                }
                e23.a<Unit> aVar4 = (e23.a) obj3;
                int i29 = b92.a.f16960b;
                i16 = i15;
                p2Var.h(strQ3, str5, null, null, aVar3, false, false, null, null, null, aVar4, o0VarE, 0, 0, 1004);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_course_goal_pace);
                String str6 = fVar3.f129256u;
                zB2 = o0VarE.B(str);
                objQ = o0VarE.q();
                if (zB2 || objQ == obj2) {
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put(obj4, str);
                    objQ = c0235a.b();
                    o0VarE.K(objQ);
                }
                b92.a aVar5 = (b92.a) objQ;
                if (i16 != 4) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                zB3 = o0VarE.B(p1Var) | z15 | o0VarE.B(p1Var9) | o0VarE.B(p1Var7);
                Object objQ27 = o0VarE.q();
                if (!zB3 || objQ27 == obj2) {
                    p1Var2 = p1Var7;
                    final int i30 = 1;
                    fVar4 = fVar;
                    i17 = i16;
                    obj5 = new e23.a() { // from class: z41.k
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i30) {
                                case 0:
                                    if (fVar4.E) {
                                        p1Var.setValue("GOAL_TIME");
                                        l.b(p1Var9, true);
                                    } else {
                                        p1Var2.setValue(Boolean.TRUE);
                                    }
                                    break;
                                case 1:
                                    if (fVar4.E) {
                                        p1Var.setValue("GOAL_PACE");
                                        l.b(p1Var9, true);
                                    } else {
                                        p1Var2.setValue(Boolean.TRUE);
                                    }
                                    break;
                                default:
                                    if (fVar4.E) {
                                        p1Var.setValue("SPLIT_TYPE");
                                        l.b(p1Var9, true);
                                    } else {
                                        p1Var2.setValue(Boolean.TRUE);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(obj5);
                } else {
                    fVar4 = fVar;
                    i17 = i16;
                    p1Var2 = p1Var7;
                    obj5 = objQ27;
                }
                p2Var.h(strQ4, str6, null, null, aVar5, false, false, null, null, null, (e23.a) obj5, o0VarE, 0, 0, 1004);
                String strQ5 = gl1.y.Q(o0VarE, R.string.pacepro_lbl_plan_splits_type);
                String strQ6 = gl1.y.Q(o0VarE, fVar4.f129258w.f162322b);
                if (i17 != 4) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                zB4 = o0VarE.B(p1Var) | z16 | o0VarE.B(p1Var9) | o0VarE.B(p1Var8);
                objQ2 = o0VarE.q();
                if (!zB4 || objQ2 == obj2) {
                    final int i34 = 2;
                    Object obj7 = new e23.a() { // from class: z41.k
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i34) {
                                case 0:
                                    if (fVar4.E) {
                                        p1Var.setValue("GOAL_TIME");
                                        l.b(p1Var9, true);
                                    } else {
                                        p1Var8.setValue(Boolean.TRUE);
                                    }
                                    break;
                                case 1:
                                    if (fVar4.E) {
                                        p1Var.setValue("GOAL_PACE");
                                        l.b(p1Var9, true);
                                    } else {
                                        p1Var8.setValue(Boolean.TRUE);
                                    }
                                    break;
                                default:
                                    if (fVar4.E) {
                                        p1Var.setValue("SPLIT_TYPE");
                                        l.b(p1Var9, true);
                                    } else {
                                        p1Var8.setValue(Boolean.TRUE);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    p1Var3 = p1Var9;
                    o0VarE.K(obj7);
                    objQ2 = obj7;
                } else {
                    p1Var3 = p1Var9;
                }
                p2Var.h(strQ5, strQ6, null, null, null, false, false, null, null, null, (e23.a) objQ2, o0VarE, 0, 0, 1020);
                o0Var2 = o0VarE;
                if (i26 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ3 = o0Var2.q();
                if (z17 || objQ3 == obj2) {
                    objQ3 = new f0(lVar, 16);
                    o0Var2.K(objQ3);
                }
                i.a(fVar4, (e23.a) objQ3, o0Var2, i17);
                bVar = fVar4.G;
                if (bVar == null) {
                    o0Var2.C(-1770991770);
                    z18 = false;
                    o0Var2.g0(false);
                    o0Var3 = o0Var2;
                } else {
                    z18 = false;
                    o0Var2.C(-1770991769);
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarH = x2.h(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), 250);
                    if (i26 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objQ4 = o0Var2.q();
                    if (z19 || objQ4 == obj2) {
                        objQ4 = new f0(lVar, 17);
                        o0Var2.K(objQ4);
                    }
                    y41.e.a(bVar, rVarH, (e23.a) objQ4, o0Var2, 0, 0);
                    o0 o0Var6 = o0Var2;
                    Unit unit = Unit.INSTANCE;
                    o0Var6.g0(false);
                    o0Var3 = o0Var6;
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(aVar, 0.0f, j92.b.f97899b.f97920e, 1);
                zB5 = o0Var3.B(p1Var) | o0Var3.B(p1Var3);
                objQ5 = o0Var3.q();
                if (zB5 || objQ5 == obj2) {
                    objQ5 = new sk0.l(p1Var, p1Var3, 7);
                    o0Var3.K(objQ5);
                }
                e23.l lVar3 = (e23.l) objQ5;
                if (i26 == 32) {
                    z24 = true;
                } else {
                    z24 = z18;
                }
                objQ6 = o0Var3.q();
                if (z24 || objQ6 == obj2) {
                    objQ6 = new wr1.d(lVar, 22);
                    o0Var3.K(objQ6);
                }
                e23.l lVar4 = (e23.l) objQ6;
                if (i26 == 32) {
                    z25 = true;
                } else {
                    z25 = z18;
                }
                objQ7 = o0Var3.q();
                if (z25 || objQ7 == obj2) {
                    objQ7 = new wr1.d(lVar, 23);
                    o0Var3.K(objQ7);
                }
                e23.l lVar5 = (e23.l) objQ7;
                if (i26 == 32) {
                    z26 = true;
                } else {
                    z26 = z18;
                }
                objQ8 = o0Var3.q();
                if (z26 || objQ8 == obj2) {
                    objQ8 = new wr1.d(lVar, 24);
                    o0Var3.K(objQ8);
                }
                fVar5 = fVar4;
                x3Var = p1Var;
                p1Var4 = p1Var3;
                o.a(fVar5, rVarA, lVar3, lVar4, lVar5, (e23.l) objQ8, o0Var3, i17);
                o0Var3.g0(true);
                if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                    o0Var3.C(884368352);
                    strP = gl1.y.P(R.string.value_parenthesis_value, new Object[]{gl1.y.Q(o0Var3, R.string.pacepro_lbl_plan_goal_time), gl1.y.Q(o0Var3, R.string.hour_minute_second_format)}, o0Var3);
                    zB10 = o0Var3.B(strP);
                    objQ15 = o0Var3.q();
                    if (zB10 || objQ15 == obj2) {
                        oi0.b bVar3 = new oi0.b(new l22.a(context), strP);
                        bVar3.o();
                        objQ15 = bVar3.f132238b;
                        o0Var3.K(objQ15);
                    }
                    String str7 = (String) objQ15;
                    int i35 = fVar5.f129248m;
                    int i36 = fVar5.f129249n;
                    int iE = t.e(fVar5.f129250o, i35, i36);
                    boolean zB14 = o0Var3.B(p1Var6);
                    if (i26 == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = zB14 | z37;
                    objQ16 = o0Var3.q();
                    if (z38 || objQ16 == obj2) {
                        objQ16 = new oy0.c(lVar, p1Var6, 14);
                        o0Var3.K(objQ16);
                    }
                    e23.l lVar6 = (e23.l) objQ16;
                    zB11 = o0Var3.B(p1Var6);
                    objQ17 = o0Var3.q();
                    if (zB11 || objQ17 == obj2) {
                        objQ17 = new l0(p1Var6, 23);
                        o0Var3.K(objQ17);
                    }
                    o0 o0Var7 = o0Var3;
                    z27 = false;
                    n02.j.a(i35, i36, iE, false, strP, str7, null, lVar6, (e23.a) objQ17, o0Var7, 0);
                    o0 o0Var8 = o0Var7;
                    o0Var8.g0(false);
                    o0Var4 = o0Var8;
                } else {
                    z27 = false;
                    o0Var3.C(885374519);
                    o0Var3.g0(false);
                    o0Var4 = o0Var3;
                }
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0Var4.C(885450469);
                    if (z39) {
                        i19 = R.string.lbl_pace_unit_km;
                    } else {
                        i19 = R.string.lbl_pace_unit_mi;
                    }
                    String strQ7 = gl1.y.Q(o0Var4, i19);
                    if (z39) {
                        i24 = R.string.lbl_minutes_per_kilometer;
                    } else {
                        i24 = R.string.lbl_minutes_per_mile;
                    }
                    String strQ8 = gl1.y.Q(o0Var4, i24);
                    int i37 = fVar5.f129253r;
                    int i38 = fVar5.f129254s;
                    int iE2 = t.e(fVar5.f129255t, i37, i38);
                    boolean zB15 = o0Var4.B(p1Var2);
                    if (i26 == 32) {
                        z35 = true;
                    } else {
                        z35 = z27;
                    }
                    z36 = zB15 | z35;
                    objQ13 = o0Var4.q();
                    if (z36 || objQ13 == obj2) {
                        objQ13 = new oy0.c(lVar, p1Var2, 15);
                        o0Var4.K(objQ13);
                    }
                    e23.l lVar7 = (e23.l) objQ13;
                    zB9 = o0Var4.B(p1Var2);
                    objQ14 = o0Var4.q();
                    if (zB9 || objQ14 == obj2) {
                        objQ14 = new l0(p1Var2, 20);
                        o0Var4.K(objQ14);
                    }
                    o0 o0Var9 = o0Var4;
                    n02.k.a(i37, i38, iE2, false, strQ7, strQ8, null, lVar7, (e23.a) objQ14, o0Var9, 0);
                    o0 o0Var10 = o0Var9;
                    o0Var10.g0(z27);
                    o0Var5 = o0Var10;
                } else {
                    o0Var4.C(886457783);
                    o0Var4.g0(z27);
                    o0Var5 = o0Var4;
                }
                if (((Boolean) r33.getF182175a()).booleanValue()) {
                    o0Var5.C(886529083);
                    zB7 = o0Var5.B(l14);
                    objQ10 = o0Var5.q();
                    if (zB7 || objQ10 == obj2) {
                        collectionK = x.k(t41.i.EVERY_MILE, t41.i.EVERY_KM);
                        if (l14 != null) {
                            collectionK = h0.D0(collectionK, t41.i.ELEVATION_BASED);
                        }
                        objQ10 = p0.n(i53.a.e(collectionK));
                        o0Var5.K(objQ10);
                    }
                    p1 p1Var11 = (p1) objQ10;
                    t41.i iVar = fVar5.f129258w;
                    i53.c cVar = (i53.c) p1Var11.getF182175a();
                    boolean zB16 = o0Var5.B(r33);
                    if (i26 == 32) {
                        z29 = true;
                    } else {
                        z29 = z27;
                    }
                    z34 = zB16 | z29;
                    objQ11 = o0Var5.q();
                    if (z34 || objQ11 == obj2) {
                        objQ11 = new oy0.c(lVar, r33, 13);
                        o0Var5.K(objQ11);
                    }
                    e23.l lVar8 = (e23.l) objQ11;
                    zB8 = o0Var5.B(r33);
                    objQ12 = o0Var5.q();
                    if (zB8 || objQ12 == obj2) {
                        objQ12 = new l0(p1Var8, 21);
                        o0Var5.K(objQ12);
                    }
                    a51.o.a(iVar, cVar, lVar8, (e23.a) objQ12, o0Var5, 0);
                    o0Var5.g0(z27);
                } else {
                    o0Var5.C(887417047);
                    o0Var5.g0(z27);
                }
                if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                    o0Var5.C(887500065);
                    gVarValueOf = t41.g.valueOf((String) x3Var.getF182175a());
                    if (i26 == 32) {
                        z28 = true;
                    } else {
                        z28 = z27;
                    }
                    zK = o0Var5.k(gVarValueOf.ordinal()) | z28 | o0Var5.B(p1Var2) | o0Var5.B(r11) | o0Var5.B(r33) | o0Var5.B(p1Var4);
                    Object objQ28 = o0Var5.q();
                    if (!zK || objQ28 == obj2) {
                        r14 = z27;
                        i18 = 22;
                        fVar2 = fVar;
                        jVar = new ck0.j(lVar, gVarValueOf, p1Var2, p1Var6, (Object) r33, p1Var4, 18);
                        lVar2 = lVar;
                        gVarValueOf = gVarValueOf;
                        p1Var5 = p1Var4;
                        o0Var5.K(jVar);
                    } else {
                        p1Var5 = p1Var4;
                        r14 = z27;
                        lVar2 = lVar;
                        fVar2 = fVar5;
                        jVar = objQ28;
                        i18 = 22;
                    }
                    e23.a aVar7 = (e23.a) jVar;
                    zB6 = o0Var5.B(p1Var5);
                    objQ9 = o0Var5.q();
                    if (zB6 || objQ9 == obj2) {
                        objQ9 = new l0(p1Var5, i18);
                        o0Var5.K(objQ9);
                    }
                    dh.b.d(gVarValueOf, aVar7, (e23.a) objQ9, o0Var5, r14);
                    o0Var5.g0(r14);
                    o0Var = o0Var5;
                } else {
                    lVar2 = lVar;
                    fVar2 = fVar5;
                    o0Var5.C(888628279);
                    o0Var5.g0(z27);
                    o0Var = o0Var5;
                }
            }
            b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
            c0235a2.f16962a.put("label_secondary", str2);
            objQ25 = c0235a2.b();
            o0VarE.K(objQ25);
            b92.a aVar8 = (b92.a) objQ25;
            if (i27 != 4) {
                z14 = false;
            } else {
                z14 = true;
            }
            zB = o0VarE.B(p1Var) | z14 | o0VarE.B(p1Var9) | o0VarE.B(p1Var6);
            Object objQ29 = o0VarE.q();
            if (zB) {
                final int i210 = 0;
                obj4 = "label_secondary";
                i15 = i27;
                fVar3 = fVar;
                obj3 = new e23.a() { // from class: z41.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i210) {
                            case 0:
                                if (fVar3.E) {
                                    p1Var.setValue("GOAL_TIME");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var6.setValue(Boolean.TRUE);
                                }
                                break;
                            case 1:
                                if (fVar3.E) {
                                    p1Var.setValue("GOAL_PACE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var6.setValue(Boolean.TRUE);
                                }
                                break;
                            default:
                                if (fVar3.E) {
                                    p1Var.setValue("SPLIT_TYPE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var6.setValue(Boolean.TRUE);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj3);
            } else {
                final int i211 = 0;
                obj4 = "label_secondary";
                i15 = i27;
                fVar3 = fVar;
                obj3 = new e23.a() { // from class: z41.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i211) {
                            case 0:
                                if (fVar3.E) {
                                    p1Var.setValue("GOAL_TIME");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var6.setValue(Boolean.TRUE);
                                }
                                break;
                            case 1:
                                if (fVar3.E) {
                                    p1Var.setValue("GOAL_PACE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var6.setValue(Boolean.TRUE);
                                }
                                break;
                            default:
                                if (fVar3.E) {
                                    p1Var.setValue("SPLIT_TYPE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var6.setValue(Boolean.TRUE);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj3);
            }
            e23.a<Unit> aVar9 = (e23.a) obj3;
            int i212 = b92.a.f16960b;
            i16 = i15;
            p2Var.h(strQ3, str5, null, null, aVar8, false, false, null, null, null, aVar9, o0VarE, 0, 0, 1004);
            String strQ9 = gl1.y.Q(o0VarE, R.string.lbl_course_goal_pace);
            String str8 = fVar3.f129256u;
            zB2 = o0VarE.B(str);
            objQ = o0VarE.q();
            if (zB2) {
                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                c0235a3.f16962a.put(obj4, str);
                objQ = c0235a3.b();
                o0VarE.K(objQ);
            } else {
                b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                c0235a4.f16962a.put(obj4, str);
                objQ = c0235a4.b();
                o0VarE.K(objQ);
            }
            b92.a aVar10 = (b92.a) objQ;
            if (i16 != 4) {
                z15 = false;
            } else {
                z15 = true;
            }
            zB3 = o0VarE.B(p1Var) | z15 | o0VarE.B(p1Var9) | o0VarE.B(p1Var7);
            Object objQ210 = o0VarE.q();
            if (zB3) {
                p1Var2 = p1Var7;
                final int i39 = 1;
                fVar4 = fVar;
                i17 = i16;
                obj5 = new e23.a() { // from class: z41.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i39) {
                            case 0:
                                if (fVar4.E) {
                                    p1Var.setValue("GOAL_TIME");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var2.setValue(Boolean.TRUE);
                                }
                                break;
                            case 1:
                                if (fVar4.E) {
                                    p1Var.setValue("GOAL_PACE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var2.setValue(Boolean.TRUE);
                                }
                                break;
                            default:
                                if (fVar4.E) {
                                    p1Var.setValue("SPLIT_TYPE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var2.setValue(Boolean.TRUE);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj5);
            } else {
                p1Var2 = p1Var7;
                final int i310 = 1;
                fVar4 = fVar;
                i17 = i16;
                obj5 = new e23.a() { // from class: z41.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i310) {
                            case 0:
                                if (fVar4.E) {
                                    p1Var.setValue("GOAL_TIME");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var2.setValue(Boolean.TRUE);
                                }
                                break;
                            case 1:
                                if (fVar4.E) {
                                    p1Var.setValue("GOAL_PACE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var2.setValue(Boolean.TRUE);
                                }
                                break;
                            default:
                                if (fVar4.E) {
                                    p1Var.setValue("SPLIT_TYPE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var2.setValue(Boolean.TRUE);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj5);
            }
            p2Var.h(strQ9, str8, null, null, aVar10, false, false, null, null, null, (e23.a) obj5, o0VarE, 0, 0, 1004);
            String strQ10 = gl1.y.Q(o0VarE, R.string.pacepro_lbl_plan_splits_type);
            String strQ11 = gl1.y.Q(o0VarE, fVar4.f129258w.f162322b);
            if (i17 != 4) {
                z16 = false;
            } else {
                z16 = true;
            }
            zB4 = o0VarE.B(p1Var) | z16 | o0VarE.B(p1Var9) | o0VarE.B(p1Var8);
            objQ2 = o0VarE.q();
            if (zB4) {
                final int i311 = 2;
                Object obj8 = new e23.a() { // from class: z41.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i311) {
                            case 0:
                                if (fVar4.E) {
                                    p1Var.setValue("GOAL_TIME");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var8.setValue(Boolean.TRUE);
                                }
                                break;
                            case 1:
                                if (fVar4.E) {
                                    p1Var.setValue("GOAL_PACE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var8.setValue(Boolean.TRUE);
                                }
                                break;
                            default:
                                if (fVar4.E) {
                                    p1Var.setValue("SPLIT_TYPE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var8.setValue(Boolean.TRUE);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p1Var3 = p1Var9;
                o0VarE.K(obj8);
                objQ2 = obj8;
            } else {
                final int i312 = 2;
                Object obj9 = new e23.a() { // from class: z41.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i312) {
                            case 0:
                                if (fVar4.E) {
                                    p1Var.setValue("GOAL_TIME");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var8.setValue(Boolean.TRUE);
                                }
                                break;
                            case 1:
                                if (fVar4.E) {
                                    p1Var.setValue("GOAL_PACE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var8.setValue(Boolean.TRUE);
                                }
                                break;
                            default:
                                if (fVar4.E) {
                                    p1Var.setValue("SPLIT_TYPE");
                                    l.b(p1Var9, true);
                                } else {
                                    p1Var8.setValue(Boolean.TRUE);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p1Var3 = p1Var9;
                o0VarE.K(obj9);
                objQ2 = obj9;
            }
            p2Var.h(strQ10, strQ11, null, null, null, false, false, null, null, null, (e23.a) objQ2, o0VarE, 0, 0, 1020);
            o0Var2 = o0VarE;
            if (i26 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            objQ3 = o0Var2.q();
            if (z17) {
                objQ3 = new f0(lVar, 16);
                o0Var2.K(objQ3);
            } else {
                objQ3 = new f0(lVar, 16);
                o0Var2.K(objQ3);
            }
            i.a(fVar4, (e23.a) objQ3, o0Var2, i17);
            bVar = fVar4.G;
            if (bVar == null) {
                o0Var2.C(-1770991770);
                z18 = false;
                o0Var2.g0(false);
                o0Var3 = o0Var2;
            } else {
                z18 = false;
                o0Var2.C(-1770991769);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                g6.f.a aVar11 = g6.f.f75994b;
                h4.r rVarH2 = x2.h(c2.l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2), 250);
                if (i26 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objQ4 = o0Var2.q();
                if (z19) {
                    objQ4 = new f0(lVar, 17);
                    o0Var2.K(objQ4);
                } else {
                    objQ4 = new f0(lVar, 17);
                    o0Var2.K(objQ4);
                }
                y41.e.a(bVar, rVarH2, (e23.a) objQ4, o0Var2, 0, 0);
                o0 o0Var11 = o0Var2;
                Unit unit2 = Unit.INSTANCE;
                o0Var11.g0(false);
                o0Var3 = o0Var11;
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA2 = c2.l.A(aVar, 0.0f, j92.b.f97899b.f97920e, 1);
            zB5 = o0Var3.B(p1Var) | o0Var3.B(p1Var3);
            objQ5 = o0Var3.q();
            if (zB5) {
                objQ5 = new sk0.l(p1Var, p1Var3, 7);
                o0Var3.K(objQ5);
            } else {
                objQ5 = new sk0.l(p1Var, p1Var3, 7);
                o0Var3.K(objQ5);
            }
            e23.l lVar9 = (e23.l) objQ5;
            if (i26 == 32) {
                z24 = true;
            } else {
                z24 = z18;
            }
            objQ6 = o0Var3.q();
            if (z24) {
                objQ6 = new wr1.d(lVar, 22);
                o0Var3.K(objQ6);
            } else {
                objQ6 = new wr1.d(lVar, 22);
                o0Var3.K(objQ6);
            }
            e23.l lVar10 = (e23.l) objQ6;
            if (i26 == 32) {
                z25 = true;
            } else {
                z25 = z18;
            }
            objQ7 = o0Var3.q();
            if (z25) {
                objQ7 = new wr1.d(lVar, 23);
                o0Var3.K(objQ7);
            } else {
                objQ7 = new wr1.d(lVar, 23);
                o0Var3.K(objQ7);
            }
            e23.l lVar11 = (e23.l) objQ7;
            if (i26 == 32) {
                z26 = true;
            } else {
                z26 = z18;
            }
            objQ8 = o0Var3.q();
            if (z26) {
                objQ8 = new wr1.d(lVar, 24);
                o0Var3.K(objQ8);
            } else {
                objQ8 = new wr1.d(lVar, 24);
                o0Var3.K(objQ8);
            }
            fVar5 = fVar4;
            x3Var = p1Var;
            p1Var4 = p1Var3;
            o.a(fVar5, rVarA2, lVar9, lVar10, lVar11, (e23.l) objQ8, o0Var3, i17);
            o0Var3.g0(true);
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                o0Var3.C(884368352);
                strP = gl1.y.P(R.string.value_parenthesis_value, new Object[]{gl1.y.Q(o0Var3, R.string.pacepro_lbl_plan_goal_time), gl1.y.Q(o0Var3, R.string.hour_minute_second_format)}, o0Var3);
                zB10 = o0Var3.B(strP);
                objQ15 = o0Var3.q();
                if (zB10) {
                    oi0.b bVar4 = new oi0.b(new l22.a(context), strP);
                    bVar4.o();
                    objQ15 = bVar4.f132238b;
                    o0Var3.K(objQ15);
                } else {
                    oi0.b bVar5 = new oi0.b(new l22.a(context), strP);
                    bVar5.o();
                    objQ15 = bVar5.f132238b;
                    o0Var3.K(objQ15);
                }
                String str9 = (String) objQ15;
                int i313 = fVar5.f129248m;
                int i314 = fVar5.f129249n;
                int iE3 = t.e(fVar5.f129250o, i313, i314);
                boolean zB17 = o0Var3.B(p1Var6);
                if (i26 == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = zB17 | z37;
                objQ16 = o0Var3.q();
                if (z38) {
                    objQ16 = new oy0.c(lVar, p1Var6, 14);
                    o0Var3.K(objQ16);
                } else {
                    objQ16 = new oy0.c(lVar, p1Var6, 14);
                    o0Var3.K(objQ16);
                }
                e23.l lVar12 = (e23.l) objQ16;
                zB11 = o0Var3.B(p1Var6);
                objQ17 = o0Var3.q();
                if (zB11) {
                    objQ17 = new l0(p1Var6, 23);
                    o0Var3.K(objQ17);
                } else {
                    objQ17 = new l0(p1Var6, 23);
                    o0Var3.K(objQ17);
                }
                o0 o0Var12 = o0Var3;
                z27 = false;
                n02.j.a(i313, i314, iE3, false, strP, str9, null, lVar12, (e23.a) objQ17, o0Var12, 0);
                o0 o0Var13 = o0Var12;
                o0Var13.g0(false);
                o0Var4 = o0Var13;
            } else {
                z27 = false;
                o0Var3.C(885374519);
                o0Var3.g0(false);
                o0Var4 = o0Var3;
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var4.C(885450469);
                if (z39) {
                    i19 = R.string.lbl_pace_unit_km;
                } else {
                    i19 = R.string.lbl_pace_unit_mi;
                }
                String strQ12 = gl1.y.Q(o0Var4, i19);
                if (z39) {
                    i24 = R.string.lbl_minutes_per_kilometer;
                } else {
                    i24 = R.string.lbl_minutes_per_mile;
                }
                String strQ13 = gl1.y.Q(o0Var4, i24);
                int i315 = fVar5.f129253r;
                int i316 = fVar5.f129254s;
                int iE4 = t.e(fVar5.f129255t, i315, i316);
                boolean zB18 = o0Var4.B(p1Var2);
                if (i26 == 32) {
                    z35 = true;
                } else {
                    z35 = z27;
                }
                z36 = zB18 | z35;
                objQ13 = o0Var4.q();
                if (z36) {
                    objQ13 = new oy0.c(lVar, p1Var2, 15);
                    o0Var4.K(objQ13);
                } else {
                    objQ13 = new oy0.c(lVar, p1Var2, 15);
                    o0Var4.K(objQ13);
                }
                e23.l lVar13 = (e23.l) objQ13;
                zB9 = o0Var4.B(p1Var2);
                objQ14 = o0Var4.q();
                if (zB9) {
                    objQ14 = new l0(p1Var2, 20);
                    o0Var4.K(objQ14);
                } else {
                    objQ14 = new l0(p1Var2, 20);
                    o0Var4.K(objQ14);
                }
                o0 o0Var14 = o0Var4;
                n02.k.a(i315, i316, iE4, false, strQ12, strQ13, null, lVar13, (e23.a) objQ14, o0Var14, 0);
                o0 o0Var15 = o0Var14;
                o0Var15.g0(z27);
                o0Var5 = o0Var15;
            } else {
                o0Var4.C(886457783);
                o0Var4.g0(z27);
                o0Var5 = o0Var4;
            }
            if (((Boolean) r33.getF182175a()).booleanValue()) {
                o0Var5.C(886529083);
                zB7 = o0Var5.B(l14);
                objQ10 = o0Var5.q();
                if (zB7) {
                    collectionK = x.k(t41.i.EVERY_MILE, t41.i.EVERY_KM);
                    if (l14 != null) {
                        collectionK = h0.D0(collectionK, t41.i.ELEVATION_BASED);
                    }
                    objQ10 = p0.n(i53.a.e(collectionK));
                    o0Var5.K(objQ10);
                } else {
                    collectionK = x.k(t41.i.EVERY_MILE, t41.i.EVERY_KM);
                    if (l14 != null) {
                        collectionK = h0.D0(collectionK, t41.i.ELEVATION_BASED);
                    }
                    objQ10 = p0.n(i53.a.e(collectionK));
                    o0Var5.K(objQ10);
                }
                p1 p1Var12 = (p1) objQ10;
                t41.i iVar2 = fVar5.f129258w;
                i53.c cVar2 = (i53.c) p1Var12.getF182175a();
                boolean zB19 = o0Var5.B(r33);
                if (i26 == 32) {
                    z29 = true;
                } else {
                    z29 = z27;
                }
                z34 = zB19 | z29;
                objQ11 = o0Var5.q();
                if (z34) {
                    objQ11 = new oy0.c(lVar, r33, 13);
                    o0Var5.K(objQ11);
                } else {
                    objQ11 = new oy0.c(lVar, r33, 13);
                    o0Var5.K(objQ11);
                }
                e23.l lVar14 = (e23.l) objQ11;
                zB8 = o0Var5.B(r33);
                objQ12 = o0Var5.q();
                if (zB8) {
                    objQ12 = new l0(p1Var8, 21);
                    o0Var5.K(objQ12);
                } else {
                    objQ12 = new l0(p1Var8, 21);
                    o0Var5.K(objQ12);
                }
                a51.o.a(iVar2, cVar2, lVar14, (e23.a) objQ12, o0Var5, 0);
                o0Var5.g0(z27);
            } else {
                o0Var5.C(887417047);
                o0Var5.g0(z27);
            }
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0Var5.C(887500065);
                gVarValueOf = t41.g.valueOf((String) x3Var.getF182175a());
                if (i26 == 32) {
                    z28 = true;
                } else {
                    z28 = z27;
                }
                zK = o0Var5.k(gVarValueOf.ordinal()) | z28 | o0Var5.B(p1Var2) | o0Var5.B(r11) | o0Var5.B(r33) | o0Var5.B(p1Var4);
                Object objQ211 = o0Var5.q();
                if (zK) {
                    r14 = z27;
                    i18 = 22;
                    fVar2 = fVar;
                    jVar = new ck0.j(lVar, gVarValueOf, p1Var2, p1Var6, (Object) r33, p1Var4, 18);
                    lVar2 = lVar;
                    gVarValueOf = gVarValueOf;
                    p1Var5 = p1Var4;
                    o0Var5.K(jVar);
                } else {
                    r14 = z27;
                    i18 = 22;
                    fVar2 = fVar;
                    jVar = new ck0.j(lVar, gVarValueOf, p1Var2, p1Var6, (Object) r33, p1Var4, 18);
                    lVar2 = lVar;
                    gVarValueOf = gVarValueOf;
                    p1Var5 = p1Var4;
                    o0Var5.K(jVar);
                }
                e23.a aVar12 = (e23.a) jVar;
                zB6 = o0Var5.B(p1Var5);
                objQ9 = o0Var5.q();
                if (zB6) {
                    objQ9 = new l0(p1Var5, i18);
                    o0Var5.K(objQ9);
                } else {
                    objQ9 = new l0(p1Var5, i18);
                    o0Var5.K(objQ9);
                }
                dh.b.d(gVarValueOf, aVar12, (e23.a) objQ9, o0Var5, r14);
                o0Var5.g0(r14);
                o0Var = o0Var5;
            } else {
                lVar2 = lVar;
                fVar2 = fVar5;
                o0Var5.C(888628279);
                o0Var5.g0(z27);
                o0Var = o0Var5;
            }
        } else {
            fVar2 = fVar;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(fVar2, lVar2, i14, 2);
        }
    }

    public static final void b(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }
}
