package t21;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.p2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.screen.NutritionSetupLocationScreenKt$NutritionSetupLocationScreen$1$hideBottomSheet$1$1$1", f = "NutritionSetupLocationScreen.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f161973b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f161973b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f161973b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161972a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f161972a = 1;
                if (this.f161973b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(boolean z14, s21.u uVar, e23.l<? super l01.d, Unit> lVar, e23.l<? super String, Unit> lVar2, p3.m mVar, int i14) {
        e23.l<? super l01.d, Unit> lVar3;
        boolean z15;
        int i15;
        int i16;
        boolean z16;
        String str;
        e23.l<? super String, Unit> lVar4 = lVar2;
        uVar.getClass();
        String strJ = uVar.f156179d;
        lVar.getClass();
        lVar4.getClass();
        p3.o0 o0VarE = mVar.E(-676637079);
        int i17 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(uVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar4) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(k1.COUNTRY);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            h4.g.a aVar3 = h4.d.a.f81537o;
            h4.r rVarB = b0Var2.b(rVarF2, aVar3);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarB, 0.0f, f14, 0.0f, eVar.f97921f, 5);
            bVar2.getClass();
            h4.r rVarA = c2.l.A(rVarC2, f15, 0.0f, 2);
            if (z14) {
                i15 = -952569161;
                i16 = R.string.region_language_setting_effects;
                z15 = false;
            } else {
                z15 = false;
                i15 = -952567180;
                i16 = R.string.select_location_and_language;
            }
            String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, z15);
            d6.h.f57752b.getClass();
            int i18 = d6.h.f57755e;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strJ2, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_region);
            l01.d dVar = uVar.f156182g;
            String strJ3 = dVar != null ? dVar.f107845b : null;
            if (strJ3 == null) {
                strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -952557564, R.string.no_selection, o0VarE, false);
            } else {
                o0VarE.C(-952558587);
                o0VarE.g0(false);
            }
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new p40.q0(p1Var, p1Var2, 6);
                o0VarE.K(objQ4);
            }
            p2Var.h(strQ, strJ3, null, null, null, false, false, null, null, null, (e23.a) objQ4, o0VarE, 0, 6, 1020);
            String strQ2 = gl1.y.Q(o0VarE, R.string.device_setting_language);
            if (strJ != null && (str = uVar.f156180e) != null && strJ.equals(str)) {
                o0VarE.C(-952541327);
                strJ = gl1.y.P(R.string.lbl_language_recommendation, new Object[]{strJ}, o0VarE);
                o0VarE.g0(false);
            } else if (strJ != null) {
                o0VarE.C(-952536013);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -952533884, R.string.no_selection, o0VarE, false);
            }
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new p40.q0(p1Var, p1Var2, 7);
                o0VarE.K(objQ5);
            }
            p2Var.h(strQ2, strJ, null, null, null, false, false, null, null, null, (e23.a) objQ5, o0VarE, 0, 6, 1020);
            h4.r rVarB2 = b0Var2.b(aVar, aVar3);
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(rVarB2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(rVarC3, f15, 0.0f, 2);
            String strQ3 = gl1.y.Q(o0VarE, R.string.msg_region_language_optimization);
            fVar.getClass();
            mh.c(strQ3, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ6 = o0VarE.q();
            if (zR || objQ6 == c2565a) {
                objQ6 = new fo.j(b0Var, mcVarF, p1Var2, 18);
                o0VarE.K(objQ6);
            }
            e23.a aVar4 = (e23.a) objQ6;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(537160125);
                if (((k1) p1Var.getF182175a()) == k1.COUNTRY) {
                    o0VarE.C(537194597);
                    String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_region);
                    List<l01.d> list = uVar.f156183h;
                    l01.d dVar2 = uVar.f156182g;
                    e eVar2 = new e(2);
                    boolean zB = o0VarE.B(aVar4) | ((i17 & 896) == 256);
                    Object objQ7 = o0VarE.q();
                    if (zB || objQ7 == c2565a) {
                        lVar3 = lVar;
                        objQ7 = new et1.g1(7, aVar4, lVar3);
                        o0VarE.K(objQ7);
                    } else {
                        lVar3 = lVar;
                    }
                    e23.l lVar5 = (e23.l) objQ7;
                    boolean zB2 = o0VarE.B(aVar4);
                    Object objQ8 = o0VarE.q();
                    if (zB2 || objQ8 == c2565a) {
                        objQ8 = new t21.a(aVar4, 12);
                        o0VarE.K(objQ8);
                    }
                    r21.l.a(strQ4, list, dVar2, mcVarF, eVar2, lVar5, (e23.a) objQ8, o0VarE, 0);
                    z16 = false;
                    o0VarE.g0(false);
                    lVar4 = lVar2;
                } else {
                    lVar3 = lVar;
                    o0VarE.C(537935342);
                    String strQ5 = gl1.y.Q(o0VarE, R.string.device_setting_language);
                    Map<String, String> map = uVar.f156181f;
                    ArrayList arrayList = new ArrayList(map.size());
                    Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getValue());
                    }
                    String str2 = uVar.f156179d;
                    v0 v0Var = new v0(uVar, 0);
                    boolean zB3 = o0VarE.B(aVar4) | ((i17 & 7168) == 2048);
                    Object objQ9 = o0VarE.q();
                    if (zB3 || objQ9 == p3.m.a.f135155b) {
                        lVar4 = lVar2;
                        objQ9 = new et1.g1(8, aVar4, lVar4);
                        o0VarE.K(objQ9);
                    } else {
                        lVar4 = lVar2;
                    }
                    e23.l lVar6 = (e23.l) objQ9;
                    boolean zB4 = o0VarE.B(aVar4);
                    Object objQ10 = o0VarE.q();
                    if (zB4 || objQ10 == p3.m.a.f135155b) {
                        objQ10 = new t21.a(aVar4, 13);
                        o0VarE.K(objQ10);
                    }
                    r21.l.a(strQ5, arrayList, str2, mcVarF, v0Var, lVar6, (e23.a) objQ10, o0VarE, 0);
                    z16 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
            } else {
                lVar3 = lVar;
                lVar4 = lVar2;
                o0VarE.C(538857251);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            lVar3 = lVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(z14, uVar, lVar3, lVar4, i14, 10);
        }
    }
}
