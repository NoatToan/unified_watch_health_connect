package c30;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.UpdateCourseWaypointsUseCase$invoke$1", f = "UpdateCourseWaypointsUseCase.kt", l = {32, 32}, m = "invokeSuspend", v = 2)
public final class f1 extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f23866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f23869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.g f23870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.d f23871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.library.mapsdkadapter.f> f23872g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(c1 c1Var, a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, List<com.garmin.android.library.mapsdkadapter.f> list, t13.d<? super f1> dVar2) {
        super(2, dVar2);
        this.f23869d = c1Var;
        this.f23870e = gVar;
        this.f23871f = dVar;
        this.f23872g = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f1 f1Var = new f1(this.f23869d, this.f23870e, this.f23871f, this.f23872g, dVar);
        f1Var.f23868c = obj;
        return f1Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((f1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ca, code lost:
    
        if (r7.emit(r0, r28) == r8) goto L24;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        r53.j jVar = (r53.j) this.f23868c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23867b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f23866a;
                o13.r.b(obj);
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
        this.f23868c = null;
        this.f23866a = jVar;
        this.f23867b = 1;
        int i15 = c1.f23820e;
        c1 c1Var = this.f23869d;
        c1Var.getClass();
        a50.g gVar = this.f23870e;
        w20.a aVar2 = gVar.f1393d;
        if (aVar2 == null || (eVar = aVar2.f181476a) == null) {
            objA = null;
        } else {
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
            List listB1 = p13.h0.b1(this.f23872g);
            if (listB1.size() >= 2) {
                objA = c1Var.a(gVar, this.f23871f, eVar2, listB1, eVar.G(), this);
            } else {
                p13.j0 j0Var = p13.j0.f134944a;
                eVar2.geoPoints = j0Var;
                eVar2.n0(null);
                eVar2.o0(null);
                eVar2.p0(null);
                eVar2.intervalMarkers = null;
                eVar2.i0(null);
                objA = c1Var.f23824d.a(a50.g.a(gVar, false, null, false, new w20.a(eVar2, null, null, null, null, false, 32, null), false, p13.h0.D0(gVar.f1396g, new a50.a(listB1, j0Var, j0Var, 3L, j0Var, false, null)), null, null, 0, false, false, false, false, null, null, 65463));
            }
        }
        if (objA != aVar) {
        }
        return aVar;
        this.f23868c = null;
        this.f23866a = null;
        this.f23867b = 2;
    }
}
