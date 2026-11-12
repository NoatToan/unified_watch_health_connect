package pv1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import jv1.e0;
import kv1.y;
import lc.u0;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getFROGPreferences$1", f = "FBTEditPreferencesViewModel.kt", l = {1205}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f141505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f141505c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f141505c, dVar);
        dVar2.f141504b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f141504b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141503a;
        b bVar = this.f141505c;
        if (i14 == 0) {
            r.b(obj);
            bVar.L0.k(null, Boolean.TRUE);
            y yVar = (y) bVar.I.getValue();
            this.f141504b = b0Var;
            this.f141503a = 1;
            obj = yVar.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            e0 e0Var = (e0) ((v2.b) v2Var).f47386a;
            bVar.getClass();
            e0Var.getClass();
            bVar.f141497k0 = e0Var;
            tu1.i.a aVar2 = tu1.i.f166483a;
            List<String> listD = e0Var.d();
            aVar2.getClass();
            mv1.c cVar = new mv1.c(tu1.i.a.l(listD));
            bVar.X0 = cVar;
            bVar.Y0.k(null, cVar);
            bVar.L0.k(null, Boolean.FALSE);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strH = f3.h(((v2.a) v2Var).f47383a, "Error getting user settings: ", StringUtils.SPACE);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "EventBaseViewModel", strH);
            bVar.L0.k(null, Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
