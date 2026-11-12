package c30;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.OutAndBackUseCase$invoke$1", f = "OutAndBackUseCase.kt", l = {32, 37}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a50.g f23975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f23976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(a50.g gVar, p0 p0Var, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f23975c = gVar;
        this.f23976d = p0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o0 o0Var = new o0(this.f23975c, this.f23976d, dVar);
        o0Var.f23974b = obj;
        return o0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((o0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0161, code lost:
    
        if (r1.emit((a50.g) r3, r24) == r2) goto L52;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        Integer sortOrder;
        r53.j jVar = (r53.j) this.f23974b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23973a;
        if (i14 != 0) {
            if (i14 == 1) {
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
        a50.g gVar = this.f23975c;
        List<com.garmin.android.library.mapsdkadapter.f> listD = gVar.d();
        w20.a aVar2 = gVar.f1393d;
        List<com.garmin.android.library.mapsdkadapter.f> listG0 = p13.h0.G0(gVar.d());
        ArrayList arrayList = new ArrayList(p13.y.r(listG0, 10));
        for (com.garmin.android.library.mapsdkadapter.f fVar : listG0) {
            LatLng latLng = fVar.f50283a;
            com.garmin.android.library.mapsdkadapter.i.b bVar = fVar.f50284b;
            latLng.getClass();
            bVar.getClass();
            arrayList.add(new com.garmin.android.library.mapsdkadapter.f(latLng, bVar));
        }
        ArrayList arrayListC0 = p13.h0.C0(listD, arrayList);
        List<List<GeoPointDTO>> listB = gVar.b();
        List<List<GeoPointDTO>> listB2 = gVar.b();
        ArrayList arrayList2 = new ArrayList(p13.y.r(listB2, 10));
        Iterator<T> it = listB2.iterator();
        while (it.hasNext()) {
            List listG1 = p13.h0.G0((List) it.next());
            ArrayList arrayList3 = new ArrayList(p13.y.r(listG1, 10));
            Iterator it3 = listG1.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new GeoPointDTO((GeoPointDTO) it3.next()));
            }
            arrayList2.add(arrayList3);
        }
        ArrayList arrayListC1 = p13.h0.C0(listB, p13.h0.G0(arrayList2));
        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
        CourseSegmentDTO courseSegmentDTO = (CourseSegmentDTO) p13.h0.n0(gVar.c());
        p0Var.f105807a = (courseSegmentDTO == null || (sortOrder = courseSegmentDTO.getSortOrder()) == null) ? 0 : sortOrder.intValue();
        List<CourseSegmentDTO> listC = gVar.c();
        List<CourseSegmentDTO> listG2 = p13.h0.G0(gVar.c());
        ArrayList arrayList4 = new ArrayList(p13.y.r(listG2, 10));
        for (CourseSegmentDTO courseSegmentDTO2 : listG2) {
            int i15 = p0Var.f105807a + 1;
            p0Var.f105807a = i15;
            arrayList4.add(CourseSegmentDTO.b(courseSegmentDTO2, new Integer(i15)));
        }
        a50.a aVar3 = new a50.a(arrayListC0, arrayListC1, p13.h0.C0(listC, arrayList4), 1L, (aVar2 == null || (eVar2 = aVar2.f181476a) == null || (listJ = eVar2.j()) == null) ? null : p13.h0.b1(listJ), (aVar2 == null || (eVar = aVar2.f181476a) == null || !eVar.G()) ? false : true, null);
        y0 y0Var = this.f23976d.f23981a;
        this.f23974b = jVar;
        this.f23973a = 1;
        objA = y0Var.a(gVar, aVar3, this);
        if (objA != aVar) {
        }
        return aVar;
        this.f23974b = null;
        this.f23973a = 2;
    }
}
