package g30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.planner.AddCoursePointUseCase$invoke$1", f = "AddCoursePointUseCase.kt", l = {23, 23, 25}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f75604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f75607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f75609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f75610g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, b bVar, com.garmin.android.apps.connectmobile.courses.model.g gVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f75607d = eVar;
        this.f75608e = z14;
        this.f75609f = bVar;
        this.f75610g = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f75607d, this.f75608e, this.f75609f, this.f75610g, dVar);
        aVar.f75606c = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
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
        r53.j jVar = (r53.j) this.f75606c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75605b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f75604a;
                o13.r.b(obj);
                this.f75606c = null;
                this.f75604a = null;
                this.f75605b = 2;
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
        com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f75607d);
        eVar.b(this.f75610g);
        if (this.f75608e) {
            t tVar = this.f75609f.f75611a;
            this.f75606c = null;
            this.f75604a = jVar;
            this.f75605b = 1;
            obj = tVar.a(eVar, this);
            if (obj != aVar) {
                this.f75606c = null;
                this.f75604a = null;
                this.f75605b = 2;
            }
        } else {
            this.f75606c = null;
            this.f75605b = 3;
        }
        return aVar;
    }
}
