package c30;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.ImportCourseUseCase$invoke$1", f = "ImportCourseUseCase.kt", l = {28, 28}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f23938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f23941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f23942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<GeoPointDTO> f23943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, com.garmin.android.apps.connectmobile.courses.model.e eVar, List<GeoPointDTO> list, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f23941d = m0Var;
        this.f23942e = eVar;
        this.f23943f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l0 l0Var = new l0(this.f23941d, this.f23942e, this.f23943f, dVar);
        l0Var.f23940c = obj;
        return l0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((l0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0104, code lost:
    
        if (r1.emit(r3, r30) == r2) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        r53.j jVar = (r53.j) this.f23940c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23939b;
        boolean z14 = true;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f23938a;
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
        this.f23940c = null;
        this.f23938a = jVar;
        this.f23939b = 1;
        int i15 = m0.f23953c;
        m0 m0Var = this.f23941d;
        m0Var.getClass();
        List<GeoPointDTO> list = this.f23943f;
        if (list.isEmpty()) {
            objA = null;
        } else {
            int size = list.size();
            com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f23942e;
            if (size == 1) {
                GeoPointDTO geoPointDTO = (GeoPointDTO) p13.h0.b0(list);
                if (geoPointDTO.b()) {
                    w20.a aVar2 = new w20.a(eVar, null, null, null, null, false, 32, null);
                    String str = eVar.courseId;
                    if (str != null && str.length() != 0) {
                        z14 = false;
                    }
                    boolean z15 = z14;
                    boolean zD = g22.n.d(eVar.courseName);
                    Double d14 = geoPointDTO.latitude;
                    double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                    Double d15 = geoPointDTO.longitude;
                    List listC = p13.w.c(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d, com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                    p13.j0 j0Var = p13.j0.f134944a;
                    List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar.j();
                    List listC2 = p13.w.c(new a50.a(listC, j0Var, j0Var, -1L, listJ != null ? p13.h0.b1(listJ) : null, eVar.G(), null));
                    a50.g.f1388s.getClass();
                    objA = new a50.g(false, null, false, aVar2, z15, zD, listC2, a50.g.f1389t, null, 0, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, false, false, null, null, 64263, null);
                } else {
                    objA = null;
                }
            } else {
                objA = m0Var.a(eVar, list, this);
            }
        }
        if (objA != aVar) {
        }
        return aVar;
        this.f23940c = null;
        this.f23938a = null;
        this.f23939b = 2;
    }
}
