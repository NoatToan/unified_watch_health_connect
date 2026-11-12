package c30;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.ReverseDirectionUseCase$invoke$1", f = "ReverseDirectionUseCase.kt", l = {17, 53, 58}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a50.g f23992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f23993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(a50.g gVar, r0 r0Var, t13.d<? super q0> dVar) {
        super(2, dVar);
        this.f23992c = gVar;
        this.f23993d = r0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q0 q0Var = new q0(this.f23992c, this.f23993d, dVar);
        q0Var.f23991b = obj;
        return q0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((q0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r1.emit(null, r25) == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016a, code lost:
    
        if (r1.emit((a50.g) r3, r25) == r2) goto L64;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        r53.j jVar = (r53.j) this.f23991b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23990a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                objA = obj;
                this.f23991b = null;
                this.f23990a = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        a50.g gVar = this.f23992c;
        w20.a aVar2 = gVar.f1393d;
        if ((aVar2 != null ? aVar2.f181476a : null) == null) {
            this.f23991b = null;
            this.f23990a = 1;
        } else {
            List listG0 = p13.h0.G0(gVar.d());
            List<List<GeoPointDTO>> listB = gVar.b();
            ArrayList arrayList = new ArrayList(p13.y.r(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(p13.h0.G0((List) it.next()));
            }
            List listG1 = p13.h0.G0(arrayList);
            List listG2 = p13.h0.G0(gVar.c());
            int i15 = 0;
            for (Object obj2 : listG2) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                ((CourseSegmentDTO) obj2).k(new Integer(i16));
                i15 = i16;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(gVar.f1393d.f181476a);
            List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar.j();
            if (listJ != null && !listJ.isEmpty()) {
                List<com.garmin.android.apps.connectmobile.courses.model.g> listG3 = p13.h0.G0(listJ);
                for (com.garmin.android.apps.connectmobile.courses.model.g gVar2 : listG3) {
                    if (zf.b.D(gVar2.getDistance())) {
                        double dQ = eVar.q();
                        Double distance = gVar2.getDistance();
                        gVar2.o(new Double(dQ - (distance != null ? distance.doubleValue() : 0.0d)));
                    }
                }
                eVar.i0(new ArrayList(listG3));
            }
            a50.a aVarE = gVar.e();
            long j8 = aVarE != null ? aVarE.f1243d : -1L;
            List<com.garmin.android.apps.connectmobile.courses.model.g> listJ2 = eVar.j();
            a50.a aVar3 = new a50.a(listG0, listG1, listG2, j8, listJ2 != null ? p13.h0.b1(listJ2) : null, eVar.G(), null);
            y0 y0Var = this.f23993d.f24005a;
            a50.g gVarA = a50.g.a(gVar, false, null, false, w20.a.b(gVar.f1393d, eVar, null, null, null, null, 62), false, null, null, null, 0, false, false, false, false, null, null, 65527);
            this.f23991b = jVar;
            this.f23990a = 2;
            objA = y0Var.a(gVarA, aVar3, this);
            if (objA != aVar) {
                this.f23991b = null;
                this.f23990a = 3;
            }
        }
        return aVar;
    }
}
