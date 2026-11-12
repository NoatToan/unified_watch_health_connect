package g30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.planner.DeleteCoursePointUseCase$invoke$1", f = "DeleteCoursePointUseCase.kt", l = {23, 23, 25}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f75633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f75636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f75638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f75639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, j jVar, com.garmin.android.apps.connectmobile.courses.model.g gVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f75636d = eVar;
        this.f75637e = z14;
        this.f75638f = jVar;
        this.f75639g = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f75636d, this.f75637e, this.f75638f, this.f75639g, dVar);
        iVar.f75635c = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((i) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f75635c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75634b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f75633a;
                o13.r.b(obj);
                this.f75635c = null;
                this.f75633a = null;
                this.f75634b = 2;
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
        com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f75636d);
        eVar.f(this.f75639g);
        if (this.f75637e) {
            t tVar = this.f75638f.f75640a;
            this.f75635c = null;
            this.f75633a = jVar;
            this.f75634b = 1;
            obj = tVar.a(eVar, this);
            if (obj != aVar) {
                this.f75635c = null;
                this.f75633a = null;
                this.f75634b = 2;
            }
        } else {
            this.f75635c = null;
            this.f75634b = 3;
        }
        return aVar;
    }
}
