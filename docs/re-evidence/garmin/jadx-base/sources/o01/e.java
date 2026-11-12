package o01;

import b63.o;
import c2.n0;
import c2.n3;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.l;
import d4.n;
import e23.p;
import f4.s;
import f4.t;
import i3.e5;
import java.util.List;
import m01.g;
import o53.x;
import o62.j;
import o62.q0;
import o62.v0;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p3.m;
import p3.x1;
import v01.b1;
import v01.p0;
import x01.i;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128488a;

    public /* synthetic */ e(int i14) {
        this.f128488a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        int i14 = 2;
        Object[] objArr = 0;
        int i15 = 1;
        switch (this.f128488a) {
            case 0:
                Scope scope = (Scope) obj;
                f fVar = f.f128489a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                e20.a aVarA = e20.a.C1315a.a(e20.a.f62587b);
                t0 t0Var = s0.f105811a;
                return new a21.d(aVarA, (m01.a) scope.get((k23.d<?>) t0Var.b(m01.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i) scope.get((k23.d<?>) t0Var.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 1:
                Scope scope2 = (Scope) obj;
                f fVar2 = f.f128489a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new b1(new kd1.b(new kd1.d((sd1.e) scope2.get((k23.d<?>) t0Var2.b(sd1.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null)), (p0) scope2.get((k23.d<?>) t0Var2.b(p0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s01.a) scope2.get((k23.d<?>) t0Var2.b(s01.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope2.get((k23.d<?>) t0Var2.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (e01.a) scope2.get((k23.d<?>) t0Var2.b(e01.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 2:
                Scope scope3 = (Scope) obj;
                f fVar3 = f.f128489a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var3 = s0.f105811a;
                return new p0((g) scope3.get((k23.d<?>) t0Var3.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (d01.c) scope3.get((k23.d<?>) t0Var3.b(d01.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s01.f) scope3.get((k23.d<?>) t0Var3.b(s01.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 8, null);
            case 3:
                Scope scope4 = (Scope) obj;
                f fVar4 = f.f128489a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new p11.a((e01.a) scope4.get((k23.d<?>) s0.f105811a.b(e01.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 4:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                f fVar5 = f.f128489a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                t0 t0Var4 = s0.f105811a;
                Object orNull = parametersHolder.getOrNull(t0Var4.b(o.class));
                if (orNull != null) {
                    return new s11.c((o) orNull);
                }
                throw new DefinitionParameterException(e5.i(t0Var4, o.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
            case 5:
                Scope scope5 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                f fVar6 = f.f128489a;
                scope5.getClass();
                parametersHolder2.getClass();
                t0 t0Var5 = s0.f105811a;
                Object orNull2 = parametersHolder2.getOrNull(t0Var5.b(o.class));
                if (orNull2 == null) {
                    throw new DefinitionParameterException(e5.i(t0Var5, o.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                }
                o oVar = (o) orNull2;
                Object orNull3 = parametersHolder2.getOrNull(t0Var5.b(Boolean.class));
                if (orNull3 == null) {
                    throw new DefinitionParameterException(e5.i(t0Var5, Boolean.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                }
                boolean zBooleanValue = ((Boolean) orNull3).booleanValue();
                Object orNull4 = parametersHolder2.getOrNull(t0Var5.b(i01.a.class));
                if (orNull4 == null) {
                    throw new DefinitionParameterException(e5.i(t0Var5, i01.a.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                }
                i01.a aVar = (i01.a) orNull4;
                Object orNull5 = parametersHolder2.getOrNull(t0Var5.b(List.class));
                if (orNull5 != null) {
                    return new s11.e(oVar, zBooleanValue, aVar, (List) orNull5, (g) scope5.get((k23.d<?>) t0Var5.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v01.b) scope5.get((k23.d<?>) t0Var5.b(v01.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s01.f) scope5.get((k23.d<?>) t0Var5.b(s01.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bv.d) scope5.get((k23.d<?>) t0Var5.b(bv.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                }
                throw new DefinitionParameterException(e5.i(t0Var5, List.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
            case 6:
                Scope scope6 = (Scope) obj;
                f fVar7 = f.f128489a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return (s01.e) Scope.get$default(scope6, s0.f105811a.b(s01.c.class), (Qualifier) null, (e23.a) null, 6, (Object) null);
            case 7:
                f fVar8 = f.f128489a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new s01.d();
            case 8:
                Scope scope7 = (Scope) obj;
                f fVar9 = f.f128489a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                return new r01.b((i) scope7.get((k23.d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 9:
                Scope scope8 = (Scope) obj;
                f fVar10 = f.f128489a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                return new s01.a((f12.b) scope8.get((k23.d<?>) s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 10:
                Scope scope9 = (Scope) obj;
                f fVar11 = f.f128489a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var6 = s0.f105811a;
                return new v01.t0((g) scope9.get((k23.d<?>) t0Var6.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (d01.c) scope9.get((k23.d<?>) t0Var6.b(d01.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 11:
                n nVar = (n) obj;
                s sVar = (s) obj2;
                nVar.getClass();
                sVar.getClass();
                if (!sVar.isEmpty()) {
                    Object objB0 = h0.b0(sVar);
                    if (!nVar.a(objB0)) {
                        l.i(s0.f105811a.b(objB0.getClass()), " cannot be saved. By default only types which can be stored in the Bundle class can be saved.");
                        return null;
                    }
                }
                return t.d(sVar).f68716c;
            case 12:
                o21.c cVar = (o21.c) obj2;
                ((n) obj).getClass();
                cVar.getClass();
                return cVar.a().toString();
            case 13:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((t13.g.a) obj2) instanceof x));
            case 14:
                t13.g gVar = (t13.g) obj;
                t13.g.a aVar2 = (t13.g.a) obj2;
                if (!(aVar2 instanceof x)) {
                    return gVar.plus(aVar2);
                }
                ((x) aVar2).n();
                return gVar.plus(null);
            case 15:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                o62.b bVar = o62.b.f129645a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    j jVar = new j(new v0(null, true, false, "BARBELL_BACK_SQUAT", "Barbell Back Squat", Double.valueOf(85.0d), Double.valueOf(200.0d), false, null, 384, null), o62.i.SCALED_FROM_BENCHMARK_WEIGHT, null, null, 12, null);
                    Object objQ = mVar.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new o62.a(objArr == true ? 1 : 0);
                        mVar.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new o62.a(i15);
                        mVar.K(objQ2);
                    }
                    e23.l lVar2 = (e23.l) objQ2;
                    Object objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new o62.a(i14);
                        mVar.K(objQ3);
                    }
                    e23.l lVar3 = (e23.l) objQ3;
                    Object objQ4 = mVar.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new o62.a(3);
                        mVar.K(objQ4);
                    }
                    e23.l lVar4 = (e23.l) objQ4;
                    Object objQ5 = mVar.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new o62.a(4);
                        mVar.K(objQ5);
                    }
                    e23.l lVar5 = (e23.l) objQ5;
                    Object objQ6 = mVar.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new o62.a(5);
                        mVar.K(objQ6);
                    }
                    q0.f(jVar, lVar, lVar2, lVar3, lVar4, lVar5, (e23.l) objQ6, mVar, 1797552);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                o72.a.a((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                o72.c.a((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                o72.d.a((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                o72.g.a((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                o72.i.a((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 21:
                m mVar2 = (m) obj;
                ((Integer) obj2).getClass();
                mVar2.C(1252642103);
                x1 x1Var2 = p3.n.f135158a;
                n0 n0Var = n3.f22788a;
                n0 n0Var2 = new n0(0, 0, 0, 0);
                mVar2.f();
                return n0Var2;
            case 22:
                m mVar3 = (m) obj;
                ((Integer) obj2).getClass();
                mVar3.C(294014368);
                x1 x1Var3 = p3.n.f135158a;
                n0 n0Var3 = n3.f22788a;
                n0 n0Var4 = new n0(0, 0, 0, 0);
                mVar3.f();
                return n0Var4;
            case 23:
                m mVar4 = (m) obj;
                ((Integer) obj2).getClass();
                mVar4.C(599687656);
                x1 x1Var4 = p3.n.f135158a;
                n0 n0Var5 = n3.f22788a;
                n0 n0Var6 = new n0(0, 0, 0, 0);
                mVar4.f();
                return n0Var6;
            case 24:
                m mVar5 = (m) obj;
                ((Integer) obj2).getClass();
                mVar5.C(1305229641);
                x1 x1Var5 = p3.n.f135158a;
                n0 n0Var7 = n3.f22788a;
                n0 n0Var8 = new n0(0, 0, 0, 0);
                mVar5.f();
                return n0Var8;
            case 25:
                ((Integer) obj2).getClass();
                o72.l.a((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                o72.l.f((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                o72.l.h((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                o72.l.g((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                o72.l.i((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i14, int i15) {
        this.f128488a = i15;
    }
}
