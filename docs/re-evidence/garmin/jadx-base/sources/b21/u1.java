package b21;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$6$1$1$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s11.d> f15271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i21.d f15272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s11.e f15273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(p3.x3<s11.d> x3Var, i21.d dVar, s11.e eVar, lc.m0 m0Var, t13.d<? super u1> dVar2) {
        super(2, dVar2);
        this.f15271a = x3Var;
        this.f15272b = dVar;
        this.f15273c = eVar;
        this.f15274d = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u1(this.f15271a, this.f15272b, this.f15273c, this.f15274d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        i21.c cVar;
        i21.b bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o13.p<i01.a, List<b63.o>> pVar = this.f15271a.getF182175a().f155890l;
        if (pVar != null) {
            i01.a aVar2 = pVar.f128594a;
            List<b63.o> list = pVar.f128595b;
            i21.d dVar = this.f15272b;
            dVar.getClass();
            aVar2.getClass();
            list.getClass();
            dVar.Q4(list);
            dVar.f87287t.setValue(p13.l0.f134950a);
            r53.p2 p2Var = dVar.f87285q;
            do {
                value = p2Var.getValue();
                cVar = (i21.c) value;
                int i14 = i21.d.c.f87296b[aVar2.ordinal()];
                if (i14 == 1) {
                    bVar = i21.b.C1730b.f87241b;
                } else {
                    if (i14 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    bVar = i21.b.d.f87243b;
                }
            } while (!p2Var.b(value, i21.c.a(cVar, new i21.a(bVar, null, 2, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194302)));
            this.f15273c.y4();
            l4.y0 y0Var = l4.y0.INSTANCE;
            lc.m0 m0Var = this.f15274d;
            if (!lc.y.q(m0Var, y0Var)) {
                lc.y.l(m0Var, y0Var);
            }
        }
        return Unit.INSTANCE;
    }
}
