package b30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.x;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ln30/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.UndoCourseRouteStateUseCase$invoke$1", f = "UndoCourseRouteStateUseCase.kt", l = {19, 41, 61, 63}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<r53.j<? super n30.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f15568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f15569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n30.f f15572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f15573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n30.f fVar, u uVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f15572e = fVar;
        this.f15573f = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f15572e, this.f15573f, dVar);
        tVar.f15571d = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super n30.f> jVar, t13.d<? super Unit> dVar) {
        return ((t) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
    
        if (r1.emit(r3, r23) == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
    
        if (r1.emit(r3, r23) == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r1.emit(null, r23) == r2) goto L65;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List listV;
        Object objA;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        k30.u uVar;
        List<ClimbDTO> listB;
        ArrayList arrayList;
        x unpavedSections;
        k30.t highTrafficSections;
        List<fn0.b> listD;
        r53.j jVar = (r53.j) this.f15571d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f15570c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 != 2) {
                if (i14 == 3) {
                    com.garmin.android.apps.connectmobile.courses.model.e eVar2 = this.f15569b;
                    List list = this.f15568a;
                    o13.r.b(obj);
                    eVar = eVar2;
                    listV = list;
                    objA = obj;
                    uVar = (k30.u) objA;
                    if (uVar != null) {
                        listB = uVar.b();
                    } else {
                        listB = null;
                    }
                    if (uVar != null || (listD = uVar.d()) == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(y.r(listD, 10));
                        Iterator<T> it = listD.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(d30.b.d((fn0.b) it.next()));
                        }
                        arrayList = arrayList2;
                    }
                    if (uVar != null) {
                        unpavedSections = uVar.getUnpavedSections();
                    } else {
                        unpavedSections = null;
                    }
                    if (uVar != null) {
                        highTrafficSections = uVar.getHighTrafficSections();
                    } else {
                        highTrafficSections = null;
                    }
                    n30.f fVarA = n30.f.a(this.f15572e, false, null, false, new w20.a(eVar, listB, arrayList, unpavedSections, highTrafficSections, false, 32, null), listV, null, 0, false, null, null, 2007);
                    this.f15571d = null;
                    this.f15568a = null;
                    this.f15569b = null;
                    this.f15570c = 4;
                } else if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        n30.f fVar = this.f15572e;
        List<n30.g> list2 = fVar.f123458f;
        w20.a aVar2 = fVar.f123456d;
        if (list2.size() <= 1) {
            this.f15571d = null;
            this.f15570c = 1;
        } else {
            if ((aVar2 != null ? aVar2.f181476a : null) == null) {
                this.f15571d = null;
                this.f15570c = 1;
            } else {
                listV = h0.V(1, fVar.f123458f);
                n30.g gVar = (n30.g) h0.n0(listV);
                com.garmin.android.apps.connectmobile.courses.model.e eVar3 = new com.garmin.android.apps.connectmobile.courses.model.e(aVar2.f181476a);
                List<GeoPointDTO> list3 = gVar != null ? gVar.f123466a : null;
                if (list3 == null || list3.isEmpty()) {
                    eVar3.geoPoints = j0.f134944a;
                    eVar3.J0(null);
                    eVar3.n0(null);
                    eVar3.o0(null);
                    eVar3.p0(null);
                    eVar3.intervalMarkers = null;
                    eVar3.i0(null);
                    n30.f fVarA2 = n30.f.a(this.f15572e, false, null, false, new w20.a(eVar3, null, null, null, null, false, 32, null), listV, null, 0, false, null, null, 2007);
                    this.f15571d = null;
                    this.f15568a = null;
                    this.f15569b = null;
                    this.f15570c = 2;
                } else {
                    d30.b.e(list3, eVar3);
                    List<com.garmin.android.apps.connectmobile.courses.model.g> list4 = gVar.f123467b;
                    eVar3.i0(list4 != null ? new ArrayList(list4) : null);
                    z20.r rVar = this.f15573f.f15574a;
                    boolean zC = eVar3.m().c();
                    this.f15571d = jVar;
                    this.f15568a = listV;
                    this.f15569b = eVar3;
                    this.f15570c = 3;
                    objA = rVar.a(list3, zC, this);
                    if (objA != aVar) {
                        eVar = eVar3;
                        uVar = (k30.u) objA;
                        if (uVar != null) {
                            listB = uVar.b();
                        } else {
                            listB = null;
                        }
                        if (uVar != null) {
                            arrayList = null;
                        } else {
                            arrayList = null;
                        }
                        if (uVar != null) {
                            unpavedSections = uVar.getUnpavedSections();
                        } else {
                            unpavedSections = null;
                        }
                        if (uVar != null) {
                            highTrafficSections = uVar.getHighTrafficSections();
                        } else {
                            highTrafficSections = null;
                        }
                        n30.f fVarA3 = n30.f.a(this.f15572e, false, null, false, new w20.a(eVar, listB, arrayList, unpavedSections, highTrafficSections, false, 32, null), listV, null, 0, false, null, null, 2007);
                        this.f15571d = null;
                        this.f15568a = null;
                        this.f15569b = null;
                        this.f15570c = 4;
                    }
                }
            }
        }
        return aVar;
    }
}
