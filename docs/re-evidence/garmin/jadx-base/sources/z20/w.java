package z20;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.GetSecondaryClimbsUseCase$invoke$1", f = "GetSecondaryClimbsUseCase.kt", l = {30, 39, 40, 43, 46}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<r53.j<? super List<? extends ClimbDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f201957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f201958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f201959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f201960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<k30.a> f201961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f201962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.b f201963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.b f201964h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(List<k30.a> list, x xVar, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f201961e = list;
        this.f201962f = xVar;
        this.f201963g = bVar;
        this.f201964h = bVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f201961e, this.f201962f, this.f201963g, this.f201964h, dVar);
        wVar.f201960d = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends ClimbDTO>> jVar, t13.d<? super Unit> dVar) {
        return ((w) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if (r1.emit(r3, r22) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r1.emit(null, r22) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (r1.emit(null, r22) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        if (r1.emit(null, r22) == r2) goto L46;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        double d14;
        double d15;
        v2 v2Var;
        r53.j jVar = (r53.j) this.f201960d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201959c;
        if (i14 != 0) {
            if (i14 == 1) {
                double d16 = this.f201958b;
                d14 = this.f201957a;
                o13.r.b(obj);
                d15 = d16;
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    T t7 = ((v2.b) v2Var).f47386a;
                    this.f201960d = null;
                    this.f201957a = d14;
                    this.f201958b = d15;
                    this.f201959c = 2;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f201960d = null;
                    this.f201957a = d14;
                    this.f201958b = d15;
                    this.f201959c = 3;
                }
            } else {
                if (i14 != 2 && i14 != 3 && i14 != 4 && i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        List<k30.a> list = this.f201961e;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Long l14 = ((k30.a) it.next()).f102522a;
                if (l14 != null) {
                    arrayList.add(l14);
                }
            }
            k30.a aVar2 = (k30.a) h0.b0(list);
            String str = aVar2.f102523b;
            com.garmin.android.library.mapsdkadapter.f fVar = aVar2.f102525d;
            if (arrayList.isEmpty() || str == null) {
                this.f201960d = null;
                this.f201959c = 4;
            } else {
                LatLng latLng = fVar.f50283a;
                double d17 = latLng.latitude;
                double d18 = latLng.longitude;
                d60.b bVar = this.f201962f.f201965a;
                this.f201960d = jVar;
                this.f201957a = d17;
                this.f201958b = d18;
                this.f201959c = 1;
                objJ = f0.J(bVar, new d60.c0(bVar, arrayList, str, d17, d18, this.f201963g, this.f201964h, null), this);
                if (objJ != aVar) {
                    d14 = d17;
                    d15 = d18;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        T t14 = ((v2.b) v2Var).f47386a;
                        this.f201960d = null;
                        this.f201957a = d14;
                        this.f201958b = d15;
                        this.f201959c = 2;
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        this.f201960d = null;
                        this.f201957a = d14;
                        this.f201958b = d15;
                        this.f201959c = 3;
                    }
                }
            }
            return aVar;
        }
        this.f201960d = null;
        this.f201959c = 5;
    }
}
