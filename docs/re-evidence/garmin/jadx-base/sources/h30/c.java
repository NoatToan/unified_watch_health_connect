package h30;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLngBounds;
import d60.j0;
import e23.p;
import java.util.Set;
import k30.l;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.j;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk30/l;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.courses.domain.search.SearchCoursesUseCase$invoke$1", f = "SearchCoursesUseCase.kt", l = {22, 38}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<j<? super v2<? extends l>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f81284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f81285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f81286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LatLngBounds f81287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set<String> f81288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, LatLngBounds latLngBounds, Set<String> set, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f81286c = dVar;
        this.f81287d = latLngBounds;
        this.f81288e = set;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f81286c, this.f81287d, this.f81288e, dVar);
        cVar.f81285b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(j<? super v2<? extends l>> jVar, t13.d<? super Unit> dVar) {
        return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar = (j) this.f81285b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f81284a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        d60.b bVar = this.f81286c.f81289a;
        this.f81285b = jVar;
        this.f81284a = 1;
        obj = bVar.C(new j0(bVar, this.f81287d, null), this);
        if (obj != aVar) {
        }
        return aVar;
        v2 bVar2 = (v2) obj;
        if (bVar2 instanceof v2.b) {
            v2.b bVar3 = (v2.b) bVar2;
            l lVar = (l) bVar3.f47386a;
            if (lVar == null) {
                lVar = new l(p13.j0.f134944a, null, 2, null);
            }
            l lVar2 = lVar;
            if (!lVar2.f102567c) {
                Set<String> set = this.f81288e;
                if (!set.isEmpty()) {
                    for (com.garmin.android.apps.connectmobile.courses.model.d dVar : lVar2.courseList) {
                        if (h0.R(set, dVar.courseId)) {
                            dVar.isFavorite = true;
                        }
                    }
                }
            }
            bVar2 = new v2.b(lVar2, bVar3.f47387b, null, null, 12, null);
        } else if (!(bVar2 instanceof v2.a)) {
            u0.r();
            return null;
        }
        this.f81285b = null;
        this.f81284a = 2;
    }
}
