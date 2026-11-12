package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.RevokeProductImprovementConsentUseCase$invoke$1", f = "RevokeProductImprovementConsentUseCase.kt", l = {12, 13}, m = "invokeSuspend", v = 2)
public final class e7 extends v13.i implements e23.p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f124189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s92.g f124190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(s92.g gVar, t13.d<? super e7> dVar) {
        super(2, dVar);
        this.f124190c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e7 e7Var = new e7(this.f124190c, dVar);
        e7Var.f124189b = obj;
        return e7Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
        return ((e7) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f124189b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124188a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        p92.o oVar = p92.o.f136619a;
        q92.x xVar = q92.x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE;
        this.f124189b = jVar;
        this.f124188a = 1;
        obj = oVar.u(xVar, this.f124190c, this);
        if (obj != aVar) {
        }
        return aVar;
        Boolean boolValueOf = Boolean.valueOf(((q92.v) obj) != null);
        this.f124189b = null;
        this.f124188a = 2;
    }
}
