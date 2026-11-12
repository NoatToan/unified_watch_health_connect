package vu1;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardViewModel$deleteOrUnsubscribeEvent$1", f = "FBTDashBoardViewModel.kt", l = {147}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f180367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f180368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f180369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg0.k f180370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f180371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o oVar, boolean z14, boolean z15, fg0.k kVar, e23.a<Unit> aVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f180367b = oVar;
        this.f180368c = z14;
        this.f180369d = z15;
        this.f180370e = kVar;
        this.f180371f = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f180367b, this.f180368c, this.f180369d, this.f180370e, this.f180371f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f180366a;
        o oVar = this.f180367b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f180366a = 1;
            obj = o.e5(oVar, this.f180368c, this.f180369d, this.f180370e, this);
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
            this.f180371f.invoke();
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            oVar.d5().m(g3.a.a(g3.f35298f, aVar2.f47385c, aVar2.f47383a, null, null, 12));
        }
        return Unit.INSTANCE;
    }
}
