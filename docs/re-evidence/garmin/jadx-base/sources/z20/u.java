package z20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lk30/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.GetPrimaryClimbsUseCase$invoke$1", f = "GetPrimaryClimbsUseCase.kt", l = {24, 25, 27}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<r53.j<? super List<? extends k30.g>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f201951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.e f201952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.c f201953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.b f201954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.b f201955g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, com.garmin.android.library.mapsdkadapter.e eVar, com.garmin.android.apps.connectmobile.courses.model.c cVar, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f201951c = vVar;
        this.f201952d = eVar;
        this.f201953e = cVar;
        this.f201954f = bVar;
        this.f201955g = bVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f201951c, this.f201952d, this.f201953e, this.f201954f, this.f201955g, dVar);
        uVar.f201950b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends k30.g>> jVar, t13.d<? super Unit> dVar) {
        return ((u) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r0.emit(null, r13) == r1) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f201950b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201949a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
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
        d60.b bVar = this.f201951c.f201956a;
        LatLngBounds latLngBoundsH = me2.z.h(this.f201952d);
        this.f201950b = jVar;
        this.f201949a = 1;
        obj = f0.J(bVar, new d60.a0(bVar, latLngBoundsH, this.f201953e, this.f201954f, this.f201955g, null), this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            T t7 = ((v2.b) v2Var).f47386a;
            this.f201950b = null;
            this.f201949a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            this.f201950b = null;
            this.f201949a = 3;
        }
    }
}
