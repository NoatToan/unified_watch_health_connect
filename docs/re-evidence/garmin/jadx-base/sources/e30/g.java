package e30;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.GetCourseDetailsUseCase$invoke$1", f = "GetCourseDetailsUseCase.kt", l = {20, 26, 29, 32}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f62680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f62681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f62680c = hVar;
        this.f62681d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f62680c, this.f62681d, dVar);
        gVar.f62679b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.courses.model.e> jVar, t13.d<? super Unit> dVar) {
        return ((g) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r0.emit(null, r12) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r0.emit(null, r12) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long lValueOf;
        v2 v2Var;
        r53.j jVar = (r53.j) this.f62679b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62678a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                    boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                    s20.d dVar = s20.d.f156005a;
                    List<GeoPointDTO> list = eVar.geoPoints;
                    dVar.getClass();
                    eVar.intervalMarkers = s20.d.f(list, zY);
                    this.f62679b = null;
                    this.f62678a = 2;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f62679b = null;
                    this.f62678a = 3;
                }
            } else {
                if (i14 != 2 && i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        int i15 = h.f62682b;
        h hVar = this.f62680c;
        hVar.getClass();
        String str = this.f62681d;
        if (str == null || str.length() == 0) {
            lValueOf = null;
        } else {
            try {
                long j8 = Long.parseLong(str);
                if (j8 > 0) {
                    lValueOf = Long.valueOf(j8);
                } else {
                    lValueOf = null;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (lValueOf != null) {
            d60.b bVar = hVar.f62683a;
            long jLongValue = lValueOf.longValue();
            this.f62679b = jVar;
            this.f62678a = 1;
            obj = f0.J(bVar, new d60.j(bVar, jLongValue, null), this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                    boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                    s20.d dVar2 = s20.d.f156005a;
                    List<GeoPointDTO> list2 = eVar2.geoPoints;
                    dVar2.getClass();
                    eVar2.intervalMarkers = s20.d.f(list2, zY2);
                    this.f62679b = null;
                    this.f62678a = 2;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f62679b = null;
                    this.f62678a = 3;
                }
            }
        } else {
            this.f62679b = null;
            this.f62678a = 4;
        }
        return aVar;
    }
}
