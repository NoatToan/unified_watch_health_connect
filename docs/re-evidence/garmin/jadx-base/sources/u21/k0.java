package u21;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupLocationViewModel$saveRegionAndLanguageSettings$1", f = "NutritionSetupLocationViewModel.kt", l = {93}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f168023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f168024b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f168024b = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k0(this.f168024b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objB0;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f168023a;
        j0 j0Var = this.f168024b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = j0Var.f168016d;
            p2 p2Var2 = j0Var.f168016d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s21.u.a((s21.u) value, true, false, null, null, null, null, null, 254)));
            l01.d dVar = ((s21.u) p2Var2.getValue()).f156182g;
            String str = dVar != null ? dVar.f107844a : null;
            v21.f fVar = v21.f.f175333a;
            Map<String, String> map = ((s21.u) p2Var2.getValue()).f156181f;
            String str2 = ((s21.u) p2Var2.getValue()).f156179d;
            fVar.getClass();
            l01.k kVar = new l01.k((String) null, (b63.o) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (l01.i) null, (l01.h) null, (Boolean) null, str, v21.f.k(str2, map), (b63.v) null, (b63.v) null, (Double) null, (Double) null, (l01.e) null, (List) null, 259071, (p005kotlin.jvm.internal.j) null);
            m01.g gVar = j0Var.f168014b;
            int iB = j0Var.f168015c.b();
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            this.f168023a = 1;
            objB0 = gVar.b0(iB, oVarD, kVar, this);
            if (objB0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objB0 = obj;
        }
        v2 v2Var = (v2) objB0;
        if (v2Var instanceof v2.b) {
            p2 p2Var3 = j0Var.f168016d;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, s21.u.a((s21.u) value3, false, false, null, null, null, null, null, 250)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            p2 p2Var4 = j0Var.f168016d;
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, s21.u.a((s21.u) value2, false, true, null, null, null, null, null, 252)));
        }
        return Unit.INSTANCE;
    }
}
