package g30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.planner.EditFinishDetailsUseCase$invoke$1", f = "EditFinishDetailsUseCase.kt", l = {24, 24, 26}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f75650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f75653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f75655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f75656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f75657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, n nVar, String str, Integer num, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f75653d = eVar;
        this.f75654e = z14;
        this.f75655f = nVar;
        this.f75656g = str;
        this.f75657h = num;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f75653d, this.f75654e, this.f75655f, this.f75656g, this.f75657h, dVar);
        mVar.f75652c = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((m) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f75652c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75651b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f75650a;
                o13.r.b(obj);
                this.f75652c = null;
                this.f75650a = null;
                this.f75651b = 2;
            } else {
                if (i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f75653d);
        eVar.q0(this.f75656g);
        eVar.k0(this.f75657h);
        if (this.f75654e) {
            t tVar = this.f75655f.f75658a;
            this.f75652c = null;
            this.f75650a = jVar;
            this.f75651b = 1;
            obj = tVar.a(eVar, this);
            if (obj != aVar) {
                this.f75652c = null;
                this.f75650a = null;
                this.f75651b = 2;
            }
        } else {
            this.f75652c = null;
            this.f75651b = 3;
        }
        return aVar;
    }
}
