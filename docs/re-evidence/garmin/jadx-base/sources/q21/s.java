package q21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.viewmodel.NutritionSettingsViewModel$fetchNutritionSettings$1", f = "NutritionSettingsViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f142299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f142300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f142300c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f142300c, dVar);
        sVar.f142299b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objY;
        Object value2;
        Object value3;
        Object value4;
        b0 b0Var = (b0) this.f142299b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142298a;
        r rVar = this.f142300c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = rVar.f142295h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q.a((q) value, false, false, null, null, true, null, false, false, null, 495)));
            m01.g gVar = rVar.f142288a;
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            this.f142299b = b0Var;
            this.f142298a = 1;
            objY = gVar.Y(oVarD, this);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objY = obj;
        }
        v2 v2Var = (v2) objY;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            T t7 = bVar.f47386a;
            if (bVar.f47387b == 204) {
                a2 a2Var = a2.NUTRITION;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "NutritionSettingsViewModel", "fetchNutritionSettings: no settings data available");
                p2 p2Var2 = rVar.f142295h;
                do {
                    value4 = p2Var2.getValue();
                } while (!p2Var2.b(value4, q.a((q) value4, false, false, null, null, false, null, true, rVar.f142290c.e(), null, 303)));
                return Unit.INSTANCE;
            }
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "NutritionSettingsViewModel", "fetchNutritionSettings: successfully retrieved nutrition settings");
            l01.k kVar = (l01.k) t7;
            int i15 = r.f142287j;
            rVar.x4(kVar);
            p2 p2Var3 = rVar.f142291d;
            do {
                value3 = p2Var3.getValue();
                ((Boolean) value3).getClass();
            } while (!p2Var3.b(value3, Boolean.TRUE));
            rVar.z4(kVar);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "NutritionSettingsViewModel", "fetchNutritionSettings: error retrieving nutrition settings");
            p2 p2Var4 = rVar.f142295h;
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, q.a((q) value2, false, false, null, null, false, null, true, false, null, 431)));
        }
        return Unit.INSTANCE;
    }
}
