package b30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ln30/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.UpdateCourseTypeUseCase$invoke$1", f = "UpdateCourseTypeUseCase.kt", l = {21, 30, 73}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<r53.j<? super n30.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f15575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n30.f f15578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.i f15579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f15580f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n30.f fVar, com.garmin.android.apps.connectmobile.courses.model.i iVar, w wVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f15578d = fVar;
        this.f15579e = iVar;
        this.f15580f = wVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f15578d, this.f15579e, this.f15580f, dVar);
        vVar.f15577c = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super n30.f> jVar, t13.d<? super Unit> dVar) {
        return ((v) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r1.emit(r7, r25) == r2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r3 == r2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016b, code lost:
    
        if (r1.emit(r3, r25) == r2) goto L69;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        w20.a aVar;
        Object objA;
        n30.e eVar2;
        n30.e eVar3;
        ArrayList arrayList;
        List<fn0.b> listD;
        r53.j jVar = (r53.j) this.f15577c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f15576b;
        n30.f fVar = this.f15578d;
        if (i14 == 0) {
            o13.r.b(obj);
            w20.a aVar3 = fVar.f123456d;
            com.garmin.android.apps.connectmobile.courses.model.e eVar4 = aVar3 != null ? aVar3.f181476a : null;
            if (eVar4 == null) {
                this.f15577c = null;
                this.f15576b = 1;
            } else {
                eVar = new com.garmin.android.apps.connectmobile.courses.model.e(eVar4);
                com.garmin.android.apps.connectmobile.courses.model.i iVar = this.f15579e;
                eVar.j0(iVar);
                if (iVar.c()) {
                    z20.r rVar = this.f15580f.f15581a;
                    List<GeoPointDTO> list = eVar.geoPoints;
                    boolean zC = eVar.m().c();
                    this.f15577c = jVar;
                    this.f15575a = eVar;
                    this.f15576b = 2;
                    objA = rVar.a(list, zC, this);
                } else {
                    if (!iVar.e()) {
                        eVar.w0(null);
                    }
                    aVar = new w20.a(eVar, null, null, null, null, false, 32, null);
                }
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        if (i14 == 2) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar5 = this.f15575a;
            o13.r.b(obj);
            eVar = eVar5;
            objA = obj;
            k30.u uVar = (k30.u) objA;
            List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
            if (uVar == null || (listD = uVar.d()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(y.r(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList2.add(d30.b.d((fn0.b) it.next()));
                }
                arrayList = arrayList2;
            }
            aVar = new w20.a(eVar, listB, arrayList, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null);
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        w20.a aVar4 = aVar;
        n30.g gVarB = fVar.b();
        List listD0 = fVar.f123458f;
        if (gVarB != null) {
            n30.g gVarB2 = fVar.b();
            k30.k kVar = (gVarB2 == null || (eVar3 = gVarB2.f123469d) == null) ? k30.k.POPULARITY : eVar3.f123446a;
            k30.k.a aVar5 = k30.k.f102555d;
            com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
            aVar5.getClass();
            if (!k30.k.a.a(iVarM).contains(kVar)) {
                n30.e eVar6 = gVarB.f123469d;
                if (eVar6 != null) {
                    k30.k kVar2 = k30.k.POPULARITY;
                    boolean z14 = eVar6.f123447b;
                    boolean z15 = eVar6.f123448c;
                    boolean z16 = eVar6.f123449d;
                    double d14 = eVar6.f123450e;
                    w20.b bVar = eVar6.f123451f;
                    int i15 = eVar6.f123452g;
                    kVar2.getClass();
                    eVar2 = new n30.e(kVar2, z14, z15, z16, d14, bVar, i15);
                } else {
                    eVar2 = null;
                }
                listD0 = h0.D0(h0.V(1, listD0), n30.g.a(gVarB, null, false, eVar2, 7));
            }
        }
        n30.f fVarA = n30.f.a(this.f15578d, false, null, false, aVar4, listD0, null, 0, false, null, null, 2007);
        this.f15577c = null;
        this.f15575a = null;
        this.f15576b = 3;
    }
}
