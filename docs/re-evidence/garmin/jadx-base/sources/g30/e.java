package g30;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.planner.DeleteAllNotesUseCase$invoke$1", f = "DeleteAllNotesUseCase.kt", l = {25, 25, 27}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f75619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f75622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f75624f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, f fVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f75622d = eVar;
        this.f75623e = z14;
        this.f75624f = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f75622d, this.f75623e, this.f75624f, dVar);
        eVar.f75621c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f75621c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75620b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f75619a;
                o13.r.b(obj);
                this.f75621c = null;
                this.f75619a = null;
                this.f75620b = 2;
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
        com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f75622d);
        ArrayList arrayListK = eVar.k();
        if (arrayListK != null) {
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                ((com.garmin.android.apps.connectmobile.courses.model.g) it.next()).note = null;
            }
        }
        eVar.E0(null);
        eVar.q0(null);
        if (this.f75623e) {
            t tVar = this.f75624f.f75625a;
            this.f75621c = null;
            this.f75619a = jVar;
            this.f75620b = 1;
            obj = tVar.a(eVar, this);
            if (obj != aVar) {
                this.f75621c = null;
                this.f75619a = null;
                this.f75620b = 2;
            }
        } else {
            this.f75621c = null;
            this.f75620b = 3;
        }
        return aVar;
    }
}
