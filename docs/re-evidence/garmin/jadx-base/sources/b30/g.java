package b30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ln30/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.GetCourseDataUseCase$invoke$1", f = "GetCourseDataUseCase.kt", l = {19, 19}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<r53.j<? super n30.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f15512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f15515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w20.a f15516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n30.e f15517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, w20.a aVar, n30.e eVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f15515d = hVar;
        this.f15516e = aVar;
        this.f15517f = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f15515d, this.f15516e, this.f15517f, dVar);
        gVar.f15514c = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super n30.f> jVar, t13.d<? super Unit> dVar) {
        return ((g) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f15514c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f15513b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f15514c = null;
            this.f15512a = jVar;
            this.f15513b = 1;
            obj = h.a(this.f15515d, this.f15516e, this.f15517f, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            jVar = this.f15512a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f15514c = null;
        this.f15512a = null;
        this.f15513b = 2;
    }
}
