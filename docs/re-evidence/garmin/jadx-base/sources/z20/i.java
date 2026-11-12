package z20;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.DuplicateCourseUseCase$invoke$1", f = "DuplicateCourseUseCase.kt", l = {22, 32}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<r53.j<? super v2<? extends com.garmin.android.apps.connectmobile.courses.model.e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f201918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f201919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f201920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, j jVar, String str2, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f201918c = str;
        this.f201919d = jVar;
        this.f201920e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f201918c, this.f201919d, this.f201920e, dVar);
        iVar.f201917b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends com.garmin.android.apps.connectmobile.courses.model.e>> jVar, t13.d<? super Unit> dVar) {
        return ((i) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r13 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        r53.j jVar = (r53.j) this.f201917b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201916a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
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
        String str = this.f201918c;
        if (str != null) {
            d60.b bVar = this.f201919d.f201921a;
            k30.p pVar = new k30.p(this.f201920e);
            this.f201917b = jVar;
            this.f201916a = 1;
            obj = f0.J(bVar, new d60.f(bVar, str, pVar, null), this);
        } else {
            aVar = new v2.a(new Exception("Invalid course id."), null, null, 6, null);
            if (aVar instanceof v2.b) {
                s20.d dVar = s20.d.f156005a;
                com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) aVar).f47386a;
                List<GeoPointDTO> list = eVar.geoPoints;
                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                dVar.getClass();
                eVar.intervalMarkers = s20.d.f(list, zY);
            }
            this.f201917b = null;
            this.f201916a = 2;
        }
        return aVar2;
        aVar = (v2) obj;
        if (aVar instanceof v2.b) {
            s20.d dVar2 = s20.d.f156005a;
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) aVar).f47386a;
            List<GeoPointDTO> list2 = eVar2.geoPoints;
            boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            dVar2.getClass();
            eVar2.intervalMarkers = s20.d.f(list2, zY2);
        }
        this.f201917b = null;
        this.f201916a = 2;
    }
}
