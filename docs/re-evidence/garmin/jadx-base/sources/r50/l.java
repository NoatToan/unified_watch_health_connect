package r50;

import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw20/a;", "data", "", "<anonymous>", "(Lw20/a;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListViewModel$convertToGCJ02IfNeeded$2", f = "CoursePointListViewModel.kt", l = {321}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<w20.a, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f150452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f150453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f150454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, e23.a<Unit> aVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f150453c = gVar;
        this.f150454d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f150453c, this.f150454d, dVar);
        lVar.f150452b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(w20.a aVar, t13.d<? super Unit> dVar) {
        return ((l) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        w20.a aVar = (w20.a) this.f150452b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150451a;
        if (i14 == 0) {
            o13.r.b(obj);
            g gVar = this.f150453c;
            if (aVar != null) {
                p2 p2Var = gVar.f150432k;
                p2Var.k(null, t50.e.a((t50.e) p2Var.getValue(), false, false, aVar, null, 27));
                this.f150452b = null;
                this.f150451a = 1;
                if (m0.b(500L, this) == aVar2) {
                    return aVar2;
                }
            } else {
                gVar.y4(t50.c.o.f162531a);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f150454d.invoke();
        return Unit.INSTANCE;
    }
}
