package l30;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw20/a;", "data", "", "<anonymous>", "(Lw20/a;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$convertToGCJ02IfNeeded$2", f = "CreateCourseViewModel.kt", l = {592}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<w20.a, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f109610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f109611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f109612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, e23.a<Unit> aVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f109611c = zVar;
        this.f109612d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f109611c, this.f109612d, dVar);
        oVar.f109610b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(w20.a aVar, t13.d<? super Unit> dVar) {
        return ((o) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        w20.a aVar = (w20.a) this.f109610b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f109609a;
        if (i14 == 0) {
            o13.r.b(obj);
            z zVar = this.f109611c;
            if (aVar != null) {
                p2 p2Var = zVar.f109668w;
                p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, false, aVar, null, null, 0, false, null, null, 2039));
                zVar.z4(new n30.c.p0(com.garmin.android.library.mapsdkadapter.i.b.GCJ02));
                this.f109610b = null;
                this.f109609a = 1;
                if (o53.m0.b(500L, this) == aVar2) {
                    return aVar2;
                }
            } else {
                zVar.z4(n30.c.f0.f123412a);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f109612d.invoke();
        return Unit.INSTANCE;
    }
}
