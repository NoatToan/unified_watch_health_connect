package g30;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.planner.DeleteAllCutoffsUseCase$invoke$1", f = "DeleteAllCutoffsUseCase.kt", l = {24, 24, 26}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f75612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f75615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f75617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, d dVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f75615d = eVar;
        this.f75616e = z14;
        this.f75617f = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f75615d, this.f75616e, this.f75617f, dVar);
        cVar.f75614c = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f75614c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75613b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f75612a;
                o13.r.b(obj);
                this.f75614c = null;
                this.f75612a = null;
                this.f75613b = 2;
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
        com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f75615d);
        ArrayList arrayListK = eVar.k();
        if (arrayListK != null) {
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                ((com.garmin.android.apps.connectmobile.courses.model.g) it.next()).cutoffDuration = null;
            }
        }
        eVar.k0(null);
        if (this.f75616e) {
            t tVar = this.f75617f.f75618a;
            this.f75614c = null;
            this.f75612a = jVar;
            this.f75613b = 1;
            obj = tVar.a(eVar, this);
            if (obj != aVar) {
                this.f75614c = null;
                this.f75612a = null;
                this.f75613b = 2;
            }
        } else {
            this.f75614c = null;
            this.f75613b = 3;
        }
        return aVar;
    }
}
