package c30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.GetCourseDataUseCase$invoke$1", f = "GetCourseDataUseCase.kt", l = {23, 23}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f23815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f23818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f23819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f23818d = d0Var;
        this.f23819e = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f23818d, this.f23819e, dVar);
        c0Var.f23817c = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((c0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f23817c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23816b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f23817c = null;
            this.f23815a = jVar;
            this.f23816b = 1;
            obj = d0.a(this.f23818d, this.f23819e, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            jVar = this.f23815a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f23817c = null;
        this.f23815a = null;
        this.f23816b = 2;
    }
}
