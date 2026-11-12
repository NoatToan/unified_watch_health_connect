package e30;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.DeleteCoursePointUseCase$invoke$1", f = "DeleteCoursePointUseCase.kt", l = {33, 34, 35, 38}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f62645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f62647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f62648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f62649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f62650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.android.apps.connectmobile.courses.model.e eVar, b bVar, com.garmin.android.apps.connectmobile.courses.model.g gVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f62648d = eVar;
        this.f62649e = bVar;
        this.f62650f = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f62648d, this.f62649e, this.f62650f, dVar);
        aVar.f62647c = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r0.emit(r2, r9) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r0.emit(null, r9) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r0.emit(null, r9) == r1) goto L35;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        v2 v2Var;
        r53.j jVar = (r53.j) this.f62647c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62646b;
        if (i14 != 0) {
            if (i14 == 1) {
                eVar = this.f62645a;
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    this.f62647c = null;
                    this.f62645a = null;
                    this.f62646b = 2;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f62647c = null;
                    this.f62645a = null;
                    this.f62646b = 3;
                }
            } else {
                if (i14 != 2 && i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f62648d);
        eVar.f(this.f62650f);
        String str = eVar.courseId;
        if (str == null || str.length() == 0) {
            this.f62647c = null;
            this.f62645a = null;
            this.f62646b = 4;
        } else {
            d60.b bVar = this.f62649e.f62656a;
            this.f62647c = jVar;
            this.f62645a = eVar;
            this.f62646b = 1;
            obj = bVar.i(str, eVar, this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    this.f62647c = null;
                    this.f62645a = null;
                    this.f62646b = 2;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f62647c = null;
                    this.f62645a = null;
                    this.f62646b = 3;
                }
            }
        }
        return aVar;
    }
}
