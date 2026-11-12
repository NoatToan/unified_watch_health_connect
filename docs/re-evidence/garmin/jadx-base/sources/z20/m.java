package z20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lfn0/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.GetHazardsUseCase$invoke$1", f = "GetHazardsUseCase.kt", l = {19, 20, 22, 25}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<r53.j<? super List<? extends fn0.e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<fn0.c> f201927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f201928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.e f201929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(List<? extends fn0.c> list, n nVar, com.garmin.android.library.mapsdkadapter.e eVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f201927c = list;
        this.f201928d = nVar;
        this.f201929e = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f201927c, this.f201928d, this.f201929e, dVar);
        mVar.f201926b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends fn0.e>> jVar, t13.d<? super Unit> dVar) {
        return ((m) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        List<fn0.e> listA;
        r53.j jVar = (r53.j) this.f201926b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201925a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    listA = ((fn0.d) ((v2.b) v2Var).f47386a).a();
                    if (listA == null) {
                        listA = j0.f134944a;
                    }
                    this.f201926b = null;
                    this.f201925a = 2;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    j0 j0Var = j0.f134944a;
                    this.f201926b = null;
                    this.f201925a = 3;
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
        List<fn0.c> list = this.f201927c;
        if (list.isEmpty()) {
            j0 j0Var2 = j0.f134944a;
            this.f201926b = null;
            this.f201925a = 4;
        } else {
            gn0.b bVar = this.f201928d.f201930a;
            LatLngBounds latLngBoundsH = me2.z.h(this.f201929e);
            this.f201926b = jVar;
            this.f201925a = 1;
            obj = f0.J(bVar, new gn0.c(bVar, latLngBoundsH, list, null), this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    listA = ((fn0.d) ((v2.b) v2Var).f47386a).a();
                    if (listA == null) {
                        listA = j0.f134944a;
                    }
                    this.f201926b = null;
                    this.f201925a = 2;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    j0 j0Var3 = j0.f134944a;
                    this.f201926b = null;
                    this.f201925a = 3;
                }
            }
        }
        return aVar;
    }
}
