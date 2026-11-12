package c30;

import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddPointOfInterestToCourseRouteUseCase$invoke$1", f = "AddPointOfInterestToCourseRouteUseCase.kt", l = {41, 41}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f23982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f23985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.g f23986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.d f23987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PointOfInterestDTO f23988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f23989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, PointOfInterestDTO pointOfInterestDTO, String str, t13.d<? super q> dVar2) {
        super(2, dVar2);
        this.f23985d = nVar;
        this.f23986e = gVar;
        this.f23987f = dVar;
        this.f23988g = pointOfInterestDTO;
        this.f23989h = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f23985d, this.f23986e, this.f23987f, this.f23988g, this.f23989h, dVar);
        qVar.f23984c = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((q) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q qVar;
        r53.j jVar = (r53.j) this.f23984c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23983b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f23984c = null;
            this.f23982a = jVar;
            this.f23983b = 1;
            qVar = this;
            obj = n.a(this.f23985d, this.f23986e, this.f23987f, this.f23988g, this.f23989h, qVar);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            jVar = this.f23982a;
            o13.r.b(obj);
            qVar = this;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        qVar.f23984c = null;
        qVar.f23982a = null;
        qVar.f23983b = 2;
    }
}
