package z20;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lw20/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.UpdateCourseTypeUseCase$invoke$1", f = "UpdateCourseTypeUseCase.kt", l = {21, 46}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<r53.j<? super w20.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f201891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f201892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f201893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w20.a f201894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.i f201895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f201896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(w20.a aVar, com.garmin.android.apps.connectmobile.courses.model.i iVar, e0 e0Var, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f201894d = aVar;
        this.f201895e = iVar;
        this.f201896f = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f201894d, this.f201895e, this.f201896f, dVar);
        d0Var.f201893c = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super w20.a> jVar, t13.d<? super Unit> dVar) {
        return ((d0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r3 == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        if (r1.emit(r7, r16) == r2) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        w20.a aVar;
        Object objA;
        ArrayList arrayList;
        List<fn0.b> listD;
        r53.j jVar = (r53.j) this.f201893c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201892b;
        if (i14 != 0) {
            if (i14 == 1) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar2 = this.f201891a;
                o13.r.b(obj);
                eVar = eVar2;
                objA = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f201894d.f181476a);
        com.garmin.android.apps.connectmobile.courses.model.i iVar = this.f201895e;
        eVar.j0(iVar);
        if (iVar.c()) {
            r rVar = this.f201896f.f201904a;
            List<GeoPointDTO> list = eVar.geoPoints;
            boolean zC = eVar.m().c();
            this.f201893c = jVar;
            this.f201891a = eVar;
            this.f201892b = 1;
            objA = rVar.a(list, zC, this);
        } else {
            if (!iVar.e()) {
                eVar.w0(null);
            }
            aVar = new w20.a(eVar, null, null, null, null, false, 32, null);
            this.f201893c = null;
            this.f201891a = null;
            this.f201892b = 2;
        }
        return aVar2;
        k30.u uVar = (k30.u) objA;
        List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
        if (uVar == null || (listD = uVar.d()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(p13.y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList2.add(d30.b.d((fn0.b) it.next()));
            }
            arrayList = arrayList2;
        }
        aVar = new w20.a(eVar, listB, arrayList, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null);
        this.f201893c = null;
        this.f201891a = null;
        this.f201892b = 2;
    }
}
