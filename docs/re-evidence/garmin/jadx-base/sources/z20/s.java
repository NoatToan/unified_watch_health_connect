package z20;

import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.GetPointsOfInterestUseCase$invoke$1", f = "GetPointsOfInterestUseCase.kt", l = {23, 25, 26, 28}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<r53.j<? super List<? extends PointOfInterestDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.courses.model.h> f201944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f201945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.e f201946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f201947f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(List<? extends com.garmin.android.apps.connectmobile.courses.model.h> list, t tVar, com.garmin.android.library.mapsdkadapter.e eVar, int i14, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f201944c = list;
        this.f201945d = tVar;
        this.f201946e = eVar;
        this.f201947f = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f201944c, this.f201945d, this.f201946e, this.f201947f, dVar);
        sVar.f201943b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends PointOfInterestDTO>> jVar, t13.d<? super Unit> dVar) {
        return ((s) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r0.emit(null, r14) == r1) goto L35;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        r53.j jVar = (r53.j) this.f201943b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201942a;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        T t7 = ((v2.b) v2Var).f47386a;
                        this.f201943b = null;
                        this.f201942a = 3;
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        this.f201943b = null;
                        this.f201942a = 4;
                    }
                } else if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        List<com.garmin.android.apps.connectmobile.courses.model.h> list = this.f201944c;
        if (list.isEmpty()) {
            j0 j0Var = j0.f134944a;
            this.f201943b = null;
            this.f201942a = 1;
        } else {
            d60.b bVar = this.f201945d.f201948a;
            LatLngBounds latLngBoundsH = me2.z.h(this.f201946e);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.garmin.android.apps.connectmobile.courses.model.h) it.next()).f32965a);
            }
            this.f201943b = jVar;
            this.f201942a = 2;
            obj = bVar.C(new d60.z(bVar, latLngBoundsH, this.f201947f, arrayList, null), this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    T t14 = ((v2.b) v2Var).f47386a;
                    this.f201943b = null;
                    this.f201942a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f201943b = null;
                    this.f201942a = 4;
                }
            }
        }
        return aVar;
    }
}
