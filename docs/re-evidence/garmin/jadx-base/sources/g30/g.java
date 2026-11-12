package g30;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.planner.DeleteAllRestsUseCase$invoke$1", f = "DeleteAllRestsUseCase.kt", l = {23, 23, 25}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f75626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f75629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f75631f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, h hVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f75629d = eVar;
        this.f75630e = z14;
        this.f75631f = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f75629d, this.f75630e, this.f75631f, dVar);
        gVar.f75628c = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((g) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f75628c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75627b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f75626a;
                o13.r.b(obj);
                this.f75628c = null;
                this.f75626a = null;
                this.f75627b = 2;
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
        com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f75629d);
        ArrayList arrayListK = eVar.k();
        if (arrayListK != null) {
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                ((com.garmin.android.apps.connectmobile.courses.model.g) it.next()).restDuration = null;
            }
        }
        if (this.f75630e) {
            t tVar = this.f75631f.f75632a;
            this.f75628c = null;
            this.f75626a = jVar;
            this.f75627b = 1;
            obj = tVar.a(eVar, this);
            if (obj != aVar) {
                this.f75628c = null;
                this.f75626a = null;
                this.f75627b = 2;
            }
        } else {
            this.f75628c = null;
            this.f75627b = 3;
        }
        return aVar;
    }
}
