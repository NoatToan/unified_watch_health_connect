package c30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lc30/h$a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddNewPointUseCase$invoke$1", f = "AddNewPointUseCase.kt", l = {44, 44}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<r53.j<? super h.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f23944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f23947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.g f23948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.d f23949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.f f23950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f23951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f23952i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, com.garmin.android.library.mapsdkadapter.f fVar, Integer num, long j8, t13.d<? super m> dVar2) {
        super(2, dVar2);
        this.f23947d = hVar;
        this.f23948e = gVar;
        this.f23949f = dVar;
        this.f23950g = fVar;
        this.f23951h = num;
        this.f23952i = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f23947d, this.f23948e, this.f23949f, this.f23950g, this.f23951h, this.f23952i, dVar);
        mVar.f23946c = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super h.a> jVar, t13.d<? super Unit> dVar) {
        return ((m) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m mVar;
        r53.j jVar = (r53.j) this.f23946c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23945b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f23946c = null;
            this.f23944a = jVar;
            this.f23945b = 1;
            mVar = this;
            obj = h.a(this.f23947d, this.f23948e, this.f23949f, this.f23950g, this.f23951h, this.f23952i, mVar);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            jVar = this.f23944a;
            o13.r.b(obj);
            mVar = this;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        mVar.f23946c = null;
        mVar.f23944a = null;
        mVar.f23945b = 2;
    }
}
