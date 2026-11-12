package c30;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddClimbToCourseRouteUseCase$invoke$1", f = "AddClimbToCourseRouteUseCase.kt", l = {33, 33}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f23827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f23830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.g f23831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.d f23832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<GeoPointDTO> f23833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, List<GeoPointDTO> list, t13.d<? super d> dVar2) {
        super(2, dVar2);
        this.f23830d = aVar;
        this.f23831e = gVar;
        this.f23832f = dVar;
        this.f23833g = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f23830d, this.f23831e, this.f23832f, this.f23833g, dVar);
        dVar2.f23829c = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f23829c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23828b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f23829c = null;
            this.f23827a = jVar;
            this.f23828b = 1;
            obj = a.a(this.f23830d, this.f23831e, this.f23832f, this.f23833g, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            jVar = this.f23827a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f23829c = null;
        this.f23827a = null;
        this.f23828b = 2;
    }
}
