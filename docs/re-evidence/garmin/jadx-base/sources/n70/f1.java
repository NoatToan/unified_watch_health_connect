package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$refreshData$1", f = "GetDashboardItemsUseCase.kt", l = {603}, m = "invokeSuspend", v = 2)
public final class f1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f124201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f124202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o70.s f124203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(c0 c0Var, boolean z14, o70.s sVar, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f124201b = c0Var;
        this.f124202c = z14;
        this.f124203d = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f1(this.f124201b, this.f124202c, this.f124203d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        d91.u uVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124200a;
        c0 c0Var = this.f124201b;
        if (i14 == 0) {
            o13.r.b(obj);
            l70.c cVar = c0Var.f124063a;
            this.f124200a = 1;
            if (cVar.X(this.f124202c) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        a91.x xVar = c0Var.f124064b;
        o70.s sVar = this.f124203d;
        sVar.getClass();
        int i15 = d91.v.f58610a[sVar.ordinal()];
        if (i15 == 1) {
            uVar = d91.u.SYNC_SUCCESSFUL;
        } else if (i15 == 2) {
            uVar = d91.u.PULL_TO_REFRESH;
        } else {
            if (i15 != 3 && i15 != 4 && i15 != 5) {
                lc.u0.r();
                return null;
            }
            uVar = d91.u.UNSPECIFIED;
        }
        xVar.a(uVar);
        r53.p2 p2Var = c0Var.f124070h.f90676g;
        p2Var.k(null, Integer.valueOf(((Number) p2Var.getValue()).intValue() + 1));
        c0Var.f124073k.T3(false);
        return Unit.INSTANCE;
    }
}
