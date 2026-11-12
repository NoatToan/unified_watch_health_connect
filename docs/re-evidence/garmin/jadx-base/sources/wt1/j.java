package wt1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel$handleDeleteOrUnsubscribeEvent$1", f = "RaceEventViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f187081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f187082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg0.k f187083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, boolean z14, fg0.k kVar, t13.d<? super j> dVar2) {
        super(2, dVar2);
        this.f187081b = dVar;
        this.f187082c = z14;
        this.f187083d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f187081b, this.f187082c, this.f187083d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187080a;
        d dVar = this.f187081b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f187080a = 1;
            obj = d.y4(dVar, this.f187082c, this.f187083d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            int i15 = d.f187033q;
            y0 y0Var = (y0) dVar.f187043j.getValue();
            g3.a aVar2 = g3.f35298f;
            Unit unit = Unit.INSTANCE;
            aVar2.getClass();
            y0Var.j(g3.a.d(unit));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            int i16 = d.f187033q;
            ((y0) dVar.f187043j.getValue()).j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
