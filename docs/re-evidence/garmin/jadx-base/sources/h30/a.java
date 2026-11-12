package h30;

import com.google.android.gms.maps.model.LatLng;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.courses.domain.search.GetTrailsAvailabilityUseCase$invoke$1", f = "GetTrailsAvailabilityUseCase.kt", l = {19, 19}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<j<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f81278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f81280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f81281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LatLng f81282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, LatLng latLng, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f81281d = bVar;
        this.f81282e = latLng;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f81281d, this.f81282e, dVar);
        aVar.f81280c = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
        return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        j jVar = (j) this.f81280c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f81279b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f81278a;
                r.b(obj);
                aVar = this;
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
        s20.h hVar = this.f81281d.f81283a;
        LatLng latLng = this.f81282e;
        double d14 = latLng.latitude;
        double d15 = latLng.longitude;
        this.f81280c = null;
        this.f81278a = jVar;
        this.f81279b = 1;
        aVar = this;
        obj = hVar.f(d14, d15, aVar);
        if (obj != aVar2) {
        }
        return aVar2;
        aVar.f81280c = null;
        aVar.f81278a = null;
        aVar.f81279b = 2;
    }
}
