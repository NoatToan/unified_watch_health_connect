package n32;

import c2.b0;
import ch.qos.logback.core.CoreConstants;
import d62.h;
import d62.t;
import e23.p;
import f12.l;
import h4.r;
import h5.e0;
import h62.m;
import i3.e5;
import java.util.List;
import l52.y;
import l52.z;
import o52.g;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import p32.c;
import pc0.j;
import q32.d;
import q52.f;
import q71.e;
import r53.i;
import u1.a2;
import zd0.c0;
import zd0.j1;
import zd0.k;
import zd0.x;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123532a;

    public /* synthetic */ a(int i14) {
        this.f123532a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        switch (this.f123532a) {
            case 0:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                b bVar = b.f123533a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                i iVar = (i) parametersHolder.elementAt(0, s0.f105811a.b(i.class));
                b bVar2 = b.f123533a;
                e eVar = e.RUNNING;
                bVar2.getClass();
                return new r32.a(new c(iVar, eVar), eVar);
            case 1:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                b bVar3 = b.f123533a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new d((r32.a) parametersHolder2.elementAt(0, s0.f105811a.b(r32.a.class)), e.RUNNING);
            case 2:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                b bVar4 = b.f123533a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                i iVar2 = (i) parametersHolder3.elementAt(0, s0.f105811a.b(i.class));
                b bVar5 = b.f123533a;
                e eVar2 = e.CYCLING;
                bVar5.getClass();
                return new r32.a(new c(iVar2, eVar2), eVar2);
            case 3:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                b bVar6 = b.f123533a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new d((r32.a) parametersHolder4.elementAt(0, s0.f105811a.b(r32.a.class)), e.CYCLING);
            case 4:
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                b bVar7 = b.f123533a;
                ((Scope) obj).getClass();
                parametersHolder5.getClass();
                i iVar3 = (i) parametersHolder5.elementAt(0, s0.f105811a.b(i.class));
                b bVar8 = b.f123533a;
                e eVar3 = e.ROWING;
                bVar8.getClass();
                return new r32.a(new c(iVar3, eVar3), eVar3);
            case 5:
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                b bVar9 = b.f123533a;
                ((Scope) obj).getClass();
                parametersHolder6.getClass();
                return new d((r32.a) parametersHolder6.elementAt(0, s0.f105811a.b(r32.a.class)), e.ROWING);
            case 6:
                ParametersHolder parametersHolder7 = (ParametersHolder) obj2;
                n42.a aVar = n42.a.f123612a;
                ((Scope) obj).getClass();
                parametersHolder7.getClass();
                return new w42.a(new o42.d((i) parametersHolder7.elementAt(0, s0.f105811a.b(i.class)), new ae0.e("WEIGHT_GRAMS", false, 2, null)));
            case 7:
                ParametersHolder parametersHolder8 = (ParametersHolder) obj2;
                n42.a aVar2 = n42.a.f123612a;
                ((Scope) obj).getClass();
                parametersHolder8.getClass();
                return new v42.b((w42.a) parametersHolder8.elementAt(0, s0.f105811a.b(w42.a.class)));
            case 8:
                Scope scope = (Scope) obj;
                n42.b bVar10 = n42.b.f123614a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new p42.b((m42.b) scope.get((k23.d<?>) s0.f105811a.b(m42.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 9:
                n42.b bVar11 = n42.b.f123614a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new p42.a();
            case 10:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder9 = (ParametersHolder) obj2;
                n52.a aVar3 = n52.a.f123783a;
                scope2.getClass();
                parametersHolder9.getClass();
                t0 t0Var = s0.f105811a;
                return new p52.b((j70.d) parametersHolder9.elementAt(0, t0Var.b(j70.d.class)), (l) scope2.get((k23.d<?>) t0Var.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 11:
                ParametersHolder parametersHolder10 = (ParametersHolder) obj2;
                n52.a aVar4 = n52.a.f123783a;
                ((Scope) obj).getClass();
                parametersHolder10.getClass();
                j70.d dVar = (j70.d) parametersHolder10.elementAt(0, s0.f105811a.b(j70.d.class));
                com.garmin.android.apps.connectmobile.workouts.data.model.d dVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.d) dVar.f97521b;
                if (dVar2 != null) {
                    return new b62.a(dVar.f97520a, dVar2);
                }
                return null;
            case 12:
                ParametersHolder parametersHolder11 = (ParametersHolder) obj2;
                n52.a aVar5 = n52.a.f123783a;
                ((Scope) obj).getClass();
                parametersHolder11.getClass();
                return new a62.a((b62.a) parametersHolder11.elementAt(0, s0.f105811a.b(b62.a.class)));
            case 13:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder12 = (ParametersHolder) obj2;
                n52.b bVar12 = n52.b.f123785a;
                scope3.getClass();
                parametersHolder12.getClass();
                t0 t0Var2 = s0.f105811a;
                k kVar = (k) scope3.get((k23.d<?>) t0Var2.b(k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                Object orNull = parametersHolder12.getOrNull(t0Var2.b(List.class));
                if (orNull != null) {
                    return new h(kVar, (List) orNull);
                }
                throw new DefinitionParameterException(e5.i(t0Var2, List.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
            case 14:
                Scope scope4 = (Scope) obj;
                n52.b bVar13 = n52.b.f123785a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var3 = s0.f105811a;
                return new k62.h((j1) scope4.get((k23.d<?>) t0Var3.b(j1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (o52.e) scope4.get((k23.d<?>) t0Var3.b(o52.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope5 = (Scope) obj;
                n52.b bVar14 = n52.b.f123785a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new k62.d((y) scope5.get((k23.d<?>) s0.f105811a.b(y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                Scope scope6 = (Scope) obj;
                n52.b bVar15 = n52.b.f123785a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return new g((l) scope6.get((k23.d<?>) s0.f105811a.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 17:
                Scope scope7 = (Scope) obj;
                n52.b bVar16 = n52.b.f123785a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                return new m((y) scope7.get((k23.d<?>) t0Var4.b(y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (o52.c) scope7.get((k23.d<?>) t0Var4.b(o52.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 18:
                Scope scope8 = (Scope) obj;
                ParametersHolder parametersHolder13 = (ParametersHolder) obj2;
                n52.b bVar17 = n52.b.f123785a;
                scope8.getClass();
                parametersHolder13.getClass();
                t0 t0Var5 = s0.f105811a;
                y yVar = (y) scope8.get((k23.d<?>) t0Var5.b(y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                Object orNull2 = parametersHolder13.getOrNull(t0Var5.b(m52.k.class));
                if (orNull2 != null) {
                    return new n62.c(yVar, (m52.k) orNull2);
                }
                throw new DefinitionParameterException(e5.i(t0Var5, m52.k.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
            case 19:
                n52.b bVar18 = n52.b.f123785a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                z.f110389c.getClass();
                return z.a.b();
            case 20:
                n52.b bVar19 = n52.b.f123785a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new o52.d();
            case 21:
                Scope scope9 = (Scope) obj;
                n52.b bVar20 = n52.b.f123785a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var6 = s0.f105811a;
                return new o52.c((j) scope9.get((k23.d<?>) t0Var6.b(j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c0) scope9.get((k23.d<?>) t0Var6.b(c0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (o52.e) scope9.get((k23.d<?>) t0Var6.b(o52.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (o52.d) scope9.get((k23.d<?>) t0Var6.b(o52.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                Scope scope10 = (Scope) obj;
                n52.b bVar21 = n52.b.f123785a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                return new f((zr1.a) scope10.get((k23.d<?>) s0.f105811a.b(zr1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 23:
                Scope scope11 = (Scope) obj;
                n52.b bVar22 = n52.b.f123785a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var7 = s0.f105811a;
                return new q52.c((o52.e) scope11.get((k23.d<?>) t0Var7.b(o52.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rt1.m) scope11.get((k23.d<?>) t0Var7.b(rt1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (x) scope11.get((k23.d<?>) t0Var7.b(x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f) scope11.get((k23.d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 24:
                ParametersHolder parametersHolder14 = (ParametersHolder) obj2;
                n52.b bVar23 = n52.b.f123785a;
                ((Scope) obj).getClass();
                parametersHolder14.getClass();
                t0 t0Var8 = s0.f105811a;
                Object orNull3 = parametersHolder14.getOrNull(t0Var8.b(List.class));
                if (orNull3 != null) {
                    return new t((List) orNull3);
                }
                throw new DefinitionParameterException(e5.i(t0Var8, List.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
            case 25:
                ((Integer) obj2).getClass();
                ge1.b.d((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ge1.b.f((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                ge1.b.g((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 28:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                n72.b bVar24 = n72.b.f124848a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarD = c2.l.D(a2.b(r.S, a2.a(mVar), true));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarD, mVar);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar6);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar25 = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar25);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    m72.f.c("Spacing", mVar, 6);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    m72.f.f(eVar4.f97916a, "Gds.dimen.spacing.XXSmall", "2.dp", mVar, 432);
                    m72.f.f(eVar4.f97917b, "Gds.dimen.spacing.XSmall", "4.dp", mVar, 432);
                    m72.f.f(eVar4.f97918c, "Gds.dimen.spacing.Small", "8.dp", mVar, 432);
                    m72.f.f(eVar4.f97919d, "Gds.dimen.spacing.SMedium", "12.dp", mVar, 432);
                    m72.f.f(eVar4.f97920e, "Gds.dimen.spacing.Medium", "16.dp", mVar, 432);
                    m72.f.f(eVar4.f97921f, "Gds.dimen.spacing.Large", "24.dp", mVar, 432);
                    m72.f.f(eVar4.f97922g, "Gds.dimen.spacing.XLarge", "32.dp", mVar, 432);
                    m72.f.f(eVar4.f97923h, "Gds.dimen.spacing.XXLarge", "40.dp", mVar, 432);
                    m72.f.c("Icons", mVar, 6);
                    j92.c cVar = j92.b.f97901d;
                    m72.f.d(cVar.f97902a, "Gds.dimen.icon.XXSmall", "8.dp", mVar, 432);
                    m72.f.d(cVar.f97903b, "Gds.dimen.Icon.XSmall", "16.dp", mVar, 432);
                    m72.f.d(cVar.f97904c, "Gds.dimen.icon.Small", "20.dp", mVar, 432);
                    m72.f.d(cVar.f97905d, "Gds.dimen.icon.Default", "24.dp", mVar, 432);
                    m72.f.d(cVar.f97906e, "Gds.dimen.icon.Large", "40.dp", mVar, 432);
                    m72.f.d(cVar.f97907f, "Gds.dimen.icon.XLarge", "64.dp", mVar, 432);
                    m72.f.d(cVar.f97908g, "Gds.dimen.icon.XXLarge", "128.dp", mVar, 432);
                    m72.f.c("Radius", mVar, 6);
                    j92.d dVar3 = j92.b.f97900c;
                    m72.f.e(dVar3.f97909a, "Gds.dimen.radius.XXSmall", "2.dp", mVar, 432);
                    m72.f.e(dVar3.f97910b, "Gds.dimen.radius.XSmall", "4.dp", mVar, 432);
                    m72.f.e(dVar3.f97911c, "Gds.dimen.radius.Small", "8.dp", mVar, 432);
                    m72.f.e(dVar3.f97912d, "Gds.dimen.radius.Medium", "16.dp", mVar, 432);
                    m72.f.e(dVar3.f97913e, "Gds.dimen.radius.Large", "24.dp", mVar, 432);
                    m72.f.e(dVar3.f97914f, "Gds.dimen.radius.XLarge", "32.dp", mVar, 432);
                    m72.f.e(dVar3.f97915g, "Gds.dimen.radius.XXLarge", "40.dp", mVar, 432);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                n72.e eVar5 = n72.e.f124852a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(int i14, int i15) {
        this.f123532a = i15;
    }
}
