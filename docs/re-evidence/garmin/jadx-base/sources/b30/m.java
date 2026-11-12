package b30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.x;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lw20/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.GetMultipleCourseRoutesUseCase$invoke$1", f = "GetMultipleCourseRoutesUseCase.kt", l = {31, 37, 42, 45}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<r53.j<? super List<? extends w20.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f15542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f15545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LatLng f15546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.i f15547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n30.e f15548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f15549h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, LatLng latLng, com.garmin.android.apps.connectmobile.courses.model.i iVar, n30.e eVar, String str, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f15545d = nVar;
        this.f15546e = latLng;
        this.f15547f = iVar;
        this.f15548g = eVar;
        this.f15549h = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f15545d, this.f15546e, this.f15547f, this.f15548g, this.f15549h, dVar);
        mVar.f15544c = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends w20.a>> jVar, t13.d<? super Unit> dVar) {
        return ((m) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0129  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
    
        if (r1.emit(r7, r25) == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016a, code lost:
    
        if (r1.emit(null, r25) == r2) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        List list;
        Object objA2;
        k30.u uVar;
        boolean zY;
        ArrayList arrayList;
        int i14;
        int i15;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        k30.t tVar;
        char c14;
        w20.a aVar;
        List<ClimbDTO> listB;
        ?? r18;
        x unpavedSections;
        k30.t highTrafficSections;
        List<fn0.b> listD;
        r53.j jVar = (r53.j) this.f15544c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f15543b;
        n nVar = this.f15545d;
        com.garmin.android.apps.connectmobile.courses.model.i iVar = this.f15547f;
        k30.t tVar2 = null;
        if (i16 == 0) {
            o13.r.b(obj);
            this.f15544c = jVar;
            this.f15543b = 1;
            objA = n.a(nVar, this.f15546e, iVar, this.f15548g, this);
            if (objA != aVar2) {
            }
            return aVar2;
        }
        if (i16 != 1) {
            if (i16 == 2) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i16 == 3) {
                list = this.f15542a;
                o13.r.b(obj);
                objA2 = obj;
                uVar = (k30.u) objA2;
                zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                arrayList = new ArrayList(y.r(list, 10));
                i14 = 0;
                for (Object obj2 : list) {
                    i15 = i14 + 1;
                    if (i14 >= 0) {
                        ?? r24 = tVar2;
                        p13.x.q();
                        throw r24;
                    }
                    eVar = (com.garmin.android.apps.connectmobile.courses.model.e) obj2;
                    eVar.j0(iVar);
                    eVar.courseName = this.f15549h;
                    tVar = tVar2;
                    eVar.sourceTypeId = new Long(3L);
                    eVar.z0(false);
                    s20.d dVar = s20.d.f156005a;
                    List<GeoPointDTO> list2 = eVar.geoPoints;
                    dVar.getClass();
                    eVar.intervalMarkers = s20.d.f(list2, zY);
                    if (i14 == 0) {
                        if (uVar != null) {
                            listB = uVar.b();
                        } else {
                            listB = tVar;
                        }
                        if (uVar != null || (listD = uVar.d()) == null) {
                            c14 = '\n';
                            r18 = tVar;
                        } else {
                            c14 = '\n';
                            ArrayList arrayList2 = new ArrayList(y.r(listD, 10));
                            Iterator it = listD.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(d30.b.d((fn0.b) it.next()));
                            }
                            r18 = arrayList2;
                        }
                        if (uVar != null) {
                            unpavedSections = uVar.getUnpavedSections();
                        } else {
                            unpavedSections = tVar;
                        }
                        if (uVar != null) {
                            highTrafficSections = uVar.getHighTrafficSections();
                        } else {
                            highTrafficSections = tVar;
                        }
                        aVar = new w20.a(eVar, listB, r18, unpavedSections, highTrafficSections, true);
                    } else {
                        c14 = '\n';
                        aVar = new w20.a(eVar, null, null, null, null, false, 32, null);
                    }
                    arrayList.add(aVar);
                    i14 = i15;
                    tVar2 = tVar;
                }
                ?? r14 = tVar2;
                this.f15544c = r14;
                this.f15542a = r14;
                this.f15543b = 4;
            } else {
                if (i16 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        objA = obj;
        list = (List) objA;
        if (list == null || list.isEmpty()) {
            this.f15544c = null;
            this.f15542a = null;
            this.f15543b = 2;
        } else {
            z20.r rVar = nVar.f15551b;
            List<GeoPointDTO> list3 = ((com.garmin.android.apps.connectmobile.courses.model.e) h0.b0(list)).geoPoints;
            boolean zC = iVar.c();
            this.f15544c = jVar;
            this.f15542a = list;
            this.f15543b = 3;
            objA2 = rVar.a(list3, zC, this);
            if (objA2 != aVar2) {
                uVar = (k30.u) objA2;
                zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                arrayList = new ArrayList(y.r(list, 10));
                i14 = 0;
                while (r3.hasNext()) {
                    i15 = i14 + 1;
                    if (i14 >= 0) {
                        ?? r25 = tVar2;
                        p13.x.q();
                        throw r25;
                    }
                    eVar = (com.garmin.android.apps.connectmobile.courses.model.e) obj2;
                    eVar.j0(iVar);
                    eVar.courseName = this.f15549h;
                    tVar = tVar2;
                    eVar.sourceTypeId = new Long(3L);
                    eVar.z0(false);
                    s20.d dVar2 = s20.d.f156005a;
                    List<GeoPointDTO> list4 = eVar.geoPoints;
                    dVar2.getClass();
                    eVar.intervalMarkers = s20.d.f(list4, zY);
                    if (i14 == 0) {
                        if (uVar != null) {
                            listB = uVar.b();
                        } else {
                            listB = tVar;
                        }
                        if (uVar != null) {
                            c14 = '\n';
                            r18 = tVar;
                        } else {
                            c14 = '\n';
                            r18 = tVar;
                        }
                        if (uVar != null) {
                            unpavedSections = uVar.getUnpavedSections();
                        } else {
                            unpavedSections = tVar;
                        }
                        if (uVar != null) {
                            highTrafficSections = uVar.getHighTrafficSections();
                        } else {
                            highTrafficSections = tVar;
                        }
                        aVar = new w20.a(eVar, listB, r18, unpavedSections, highTrafficSections, true);
                    } else {
                        c14 = '\n';
                        aVar = new w20.a(eVar, null, null, null, null, false, 32, null);
                    }
                    arrayList.add(aVar);
                    i14 = i15;
                    tVar2 = tVar;
                }
                ?? r15 = tVar2;
                this.f15544c = r15;
                this.f15542a = r15;
                this.f15543b = 4;
            }
        }
        return aVar2;
    }
}
