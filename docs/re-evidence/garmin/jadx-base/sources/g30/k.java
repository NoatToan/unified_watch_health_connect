package g30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.planner.EditCoursePointUseCase$invoke$1", f = "EditCoursePointUseCase.kt", l = {27, 33, 33, 35}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f75641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f75644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f75646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f75647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f75648h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, l lVar, com.garmin.android.apps.connectmobile.courses.model.g gVar, com.garmin.android.apps.connectmobile.courses.model.g gVar2, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f75644d = eVar;
        this.f75645e = z14;
        this.f75646f = lVar;
        this.f75647g = gVar;
        this.f75648h = gVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f75644d, this.f75645e, this.f75646f, this.f75647g, this.f75648h, dVar);
        kVar.f75643c = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((k) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r0.emit(null, r13) == r1) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f75643c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75642b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                jVar = this.f75641a;
                o13.r.b(obj);
                this.f75643c = null;
                this.f75641a = null;
                this.f75642b = 3;
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f75644d);
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar.j();
        if (listJ == null) {
            listJ = j0.f134944a;
        }
        ArrayList arrayListD1 = h0.d1(listJ);
        Iterator it = arrayListD1.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.g) it.next()).getCoursePointId(), this.f75648h.getCoursePointId())) {
                break;
            }
            i15++;
        }
        if (i15 != -1) {
            arrayListD1.set(i15, this.f75647g);
            eVar.i0(arrayListD1);
            if (this.f75645e) {
                t tVar = this.f75646f.f75649a;
                this.f75643c = null;
                this.f75641a = jVar;
                this.f75642b = 2;
                obj = tVar.a(eVar, this);
                if (obj != aVar) {
                    this.f75643c = null;
                    this.f75641a = null;
                    this.f75642b = 3;
                }
            } else {
                this.f75643c = null;
                this.f75642b = 4;
            }
        } else {
            this.f75643c = null;
            this.f75641a = null;
            this.f75642b = 1;
        }
        return aVar;
    }
}
