package c30;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.UpdateCourseWaypointPositionUseCase$invoke$1", f = "UpdateCourseWaypointPositionUseCase.kt", l = {32, 32}, m = "invokeSuspend", v = 2)
public final class a1 extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f23781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f23784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.g f23785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.d f23786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.f f23787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23788h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, com.garmin.android.library.mapsdkadapter.f fVar, int i14, t13.d<? super a1> dVar2) {
        super(2, dVar2);
        this.f23784d = b1Var;
        this.f23785e = gVar;
        this.f23786f = dVar;
        this.f23787g = fVar;
        this.f23788h = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a1 a1Var = new a1(this.f23784d, this.f23785e, this.f23786f, this.f23787g, this.f23788h, dVar);
        a1Var.f23783c = obj;
        return a1Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((a1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        if (r8.emit(r0, r29) == r9) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        int i14;
        r53.j jVar = (r53.j) this.f23783c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f23782b;
        if (i15 != 0) {
            if (i15 == 1) {
                jVar = this.f23781a;
                o13.r.b(obj);
                objA = obj;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        this.f23783c = null;
        this.f23781a = jVar;
        this.f23782b = 1;
        int i16 = b1.f23804e;
        b1 b1Var = this.f23784d;
        b1Var.getClass();
        a50.g gVar = this.f23785e;
        w20.a aVar2 = gVar.f1393d;
        if (aVar2 == null || (eVar = aVar2.f181476a) == null || (i14 = this.f23788h) < 0 || i14 >= gVar.d().size()) {
            objA = null;
        } else {
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
            ArrayList arrayListD1 = p13.h0.d1(gVar.d());
            arrayListD1.set(i14, this.f23787g);
            if (arrayListD1.size() >= 2) {
                objA = b1Var.a(gVar, this.f23786f, eVar2, arrayListD1, i14, eVar.G(), this);
            } else if (arrayListD1.size() == 1) {
                p13.j0 j0Var = p13.j0.f134944a;
                eVar2.geoPoints = j0Var;
                eVar2.J0(null);
                eVar2.n0(null);
                eVar2.o0(null);
                eVar2.p0(null);
                eVar2.intervalMarkers = null;
                eVar2.i0(null);
                objA = b1Var.f23808d.a(a50.g.a(gVar, false, null, false, new w20.a(eVar2, null, null, null, null, false, 32, null), false, p13.h0.D0(gVar.f1396g, new a50.a(arrayListD1, j0Var, j0Var, 3L, j0Var, false, null)), null, null, 0, false, false, false, false, null, null, 65463));
            } else {
                objA = null;
            }
        }
        if (objA != aVar) {
        }
        return aVar;
        this.f23783c = null;
        this.f23781a = null;
        this.f23782b = 2;
    }
}
