package q21;

import b63.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.viewmodel.NutritionSettingsViewModel$toggleAutoCalorieAdjustment$1", f = "NutritionSettingsViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f142302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f142303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f142304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, boolean z14, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f142303c = rVar;
        this.f142304d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f142303c, this.f142304d, dVar);
        tVar.f142302b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objB0;
        Object value2;
        Object value3;
        b0 b0Var = (b0) this.f142302b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142301a;
        r rVar = this.f142303c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = rVar.f142295h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q.a((q) value, false, false, null, null, true, null, false, false, null, 495)));
            l01.k kVar = new l01.k((String) null, (b63.o) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (l01.i) null, (l01.h) null, Boolean.valueOf(this.f142304d), (String) null, (String) null, (v) null, (v) null, (Double) null, (Double) null, (l01.e) null, (List) null, 261631, (p005kotlin.jvm.internal.j) null);
            m01.g gVar = rVar.f142288a;
            int iB = rVar.f142290c.b();
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            this.f142302b = b0Var;
            this.f142301a = 1;
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
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionSettingsViewModel", "toggleAutoCalorieAdjustment: successfully updated nutrition settings");
            l01.k kVar2 = (l01.k) ((v2.b) v2Var).f47386a;
            int i15 = r.f142287j;
            rVar.x4(kVar2);
            p2 p2Var2 = rVar.f142291d;
            do {
                value3 = p2Var2.getValue();
                ((Boolean) value3).getClass();
            } while (!p2Var2.b(value3, Boolean.TRUE));
            rVar.z4(kVar2);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "NutritionSettingsViewModel", "toggleAutoCalorieAdjustment: error updating nutrition settings");
            p2 p2Var3 = rVar.f142295h;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, q.a((q) value2, false, false, null, null, false, null, false, false, null, 495)));
            rVar.y4(R.string.generic_error_message);
        }
        return Unit.INSTANCE;
    }
}
