package b21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$4$1$1$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<List<o21.d>> f15143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q21.m f15144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p7(p3.x3<? extends List<o21.d>> x3Var, q21.m mVar, lc.v vVar, t13.d<? super p7> dVar) {
        super(2, dVar);
        this.f15143a = x3Var;
        this.f15144b = mVar;
        this.f15145c = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p7(this.f15143a, this.f15144b, this.f15145c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        g01.z zVarA;
        ArrayList arrayList;
        Object next;
        k01.d dVarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<o21.d> f182175a = this.f15143a.getF182175a();
        if (f182175a != null) {
            q21.m mVar = this.f15144b;
            mVar.getClass();
            r53.p2 p2Var = mVar.f142262d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q21.l.a((q21.l) value, f182175a, false, 13)));
            g01.z zVar = mVar.f142261c;
            if (zVar != null) {
                List<g01.x> list = zVar.f74294a;
                if (list != null) {
                    arrayList = new ArrayList(p13.y.r(list, 10));
                    for (g01.x xVar : list) {
                        Iterator<T> it = f182175a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            long j8 = ((o21.d) next).f128658a;
                            Long l14 = xVar.f74274a;
                            if (l14 != null && j8 == l14.longValue()) {
                                break;
                            }
                        }
                        o21.d dVar = (o21.d) next;
                        k01.d dVar2 = xVar.f74280g;
                        if (dVar2 != null) {
                            dVarA = k01.d.a(dVar2, dVar != null ? dVar.f128661d : null, dVar != null ? dVar.f128663f : null, dVar != null ? dVar.f128662e : null, dVar != null ? dVar.f128664g : null);
                        } else {
                            dVarA = null;
                        }
                        arrayList.add(g01.x.a(xVar, null, null, dVarA, 4031));
                    }
                } else {
                    arrayList = null;
                }
                zVarA = g01.z.a(zVar, arrayList, null, null, null, 30);
            } else {
                zVarA = null;
            }
            mVar.f142261c = zVarA;
            this.f15145c.a().f(null, "mealGoalsResult");
        }
        return Unit.INSTANCE;
    }
}
