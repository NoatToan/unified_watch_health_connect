package mr;

import am.x0;
import am.z0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.o1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lps/p;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase$getActivitySplitsFlow$1", f = "GetCompactActivityDetailsUseCase.kt", l = {114, 119, 125, 128, 132}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<r53.j<? super ps.p>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ps.r f120333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f120334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f120335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f120336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ps.r rVar, x0 x0Var, g0 g0Var, long j8, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f120333c = rVar;
        this.f120334d = x0Var;
        this.f120335e = g0Var;
        this.f120336f = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y yVar = new y(this.f120333c, this.f120334d, this.f120335e, this.f120336f, dVar);
        yVar.f120332b = obj;
        return yVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super ps.p> jVar, t13.d<? super Unit> dVar) {
        return ((y) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r3 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r3 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        if (r3 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
    
        if (r3 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r1.emit(r3, r23) == r2) goto L65;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ps.p pVar;
        Object objB;
        List<o1> listT;
        Object objE;
        Object objB2;
        Object objA;
        r53.j jVar = (r53.j) this.f120332b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120331a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objA = obj;
                pVar = (ps.p) objA;
            } else if (i14 == 2) {
                o13.r.b(obj);
                objB2 = obj;
                pVar = (ps.p) objB2;
            } else if (i14 == 3) {
                o13.r.b(obj);
                objE = obj;
                pVar = (ps.p) objE;
            } else if (i14 == 4) {
                o13.r.b(obj);
                objB = obj;
                pVar = (ps.p) objB;
            } else {
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        ps.r rVar = this.f120333c;
        boolean zD = oe2.f.D(rVar);
        long j8 = this.f120336f;
        g0 g0Var = this.f120335e;
        x0 x0Var = this.f120334d;
        if (!zD || z0.o(x0Var.f4358a)) {
            List<o1> listT2 = rVar.t();
            List<ps.w> listI = rVar.i();
            if (tq.k.l(x0Var, listT2, !(listI == null || listI.isEmpty())) && !oe2.f.I(rVar) && !z0.x(x0Var.f4358a)) {
                this.f120332b = jVar;
                this.f120331a = 2;
                objB2 = g0.b(g0Var, j8, true, this);
            } else if (tq.k.j(x0Var) && oe2.f.E(rVar) && (listT = rVar.t()) != null && !listT.isEmpty() && !oe2.f.I(rVar)) {
                this.f120332b = jVar;
                this.f120331a = 3;
                objE = g0Var.e(j8, new ps.p(0L, null, null, null, null, 31, null), this);
            } else if (oe2.f.I(rVar)) {
                pVar = null;
            } else {
                boolean zE = oe2.f.E(rVar);
                this.f120332b = jVar;
                this.f120331a = 4;
                objB = g0.b(g0Var, j8, zE, this);
            }
        } else {
            this.f120332b = jVar;
            this.f120331a = 1;
            objA = g0.a(g0Var, j8, this);
        }
        return aVar;
        this.f120332b = null;
        this.f120331a = 5;
    }
}
