package n70;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lvb0/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetRemainingInReachSubscriptionsUseCase$getBannerData$1", f = "GetRemainingInReachSubscriptionsUseCase.kt", l = {47, 48, 51}, m = "invokeSuspend", v = 2)
public final class f3 extends v13.i implements e23.p<r53.j<? super vb0.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f124210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d3 f124211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(d3 d3Var, t13.d<? super f3> dVar) {
        super(2, dVar);
        this.f124211c = d3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f3 f3Var = new f3(this.f124211c, dVar);
        f3Var.f124210b = obj;
        return f3Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super vb0.a> jVar, t13.d<? super Unit> dVar) {
        return ((f3) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        r53.j jVar = (r53.j) this.f124210b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124209a;
        d3 d3Var = this.f124211c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f124210b = jVar;
            this.f124209a = 1;
            if (d3.a(d3Var, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            list = (List) obj;
            if (!list.isEmpty()) {
                vb0.a aVar2 = new vb0.a(((Number) p13.h0.b0(list)).longValue(), null);
                this.f124210b = null;
                this.f124209a = 3;
            }
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        vb0.b bVar = d3Var.f124135a;
        this.f124210b = jVar;
        this.f124209a = 2;
        obj = bVar.c(this);
        if (obj != aVar) {
            list = (List) obj;
            if (!list.isEmpty()) {
                vb0.a aVar3 = new vb0.a(((Number) p13.h0.b0(list)).longValue(), null);
                this.f124210b = null;
                this.f124209a = 3;
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
