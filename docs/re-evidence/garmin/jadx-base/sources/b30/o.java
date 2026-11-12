package b30;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ln30/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.SaveCourseUseCase$invoke$1", f = "SaveCourseUseCase.kt", l = {29, 34, 45, 47, 75, 77, 90, 98}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<r53.j<? super n30.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f15552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n30.f f15556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f15557f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((com.garmin.android.apps.connectmobile.courses.model.g) t7).getDistance(), ((com.garmin.android.apps.connectmobile.courses.model.g) t14).getDistance());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n30.f fVar, p pVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f15556e = fVar;
        this.f15557f = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f15556e, this.f15557f, dVar);
        oVar.f15555d = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super n30.f> jVar, t13.d<? super Unit> dVar) {
        return ((o) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x019f A[LOOP:3: B:91:0x016b->B:103:0x019f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:120:0x0205  */
    /* JADX WARN: Code duplicated, block: B:124:0x020e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x0226  */
    /* JADX WARN: Code duplicated, block: B:132:0x022a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0241  */
    /* JADX WARN: Code duplicated, block: B:139:0x024a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0254  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x02be  */
    /* JADX WARN: Code duplicated, block: B:150:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:165:0x0122 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0148 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x015d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0167  */
    /* JADX WARN: Code duplicated, block: B:93:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x0180  */
    /* JADX WARN: Code duplicated, block: B:96:0x0187  */
    /* JADX WARN: Code duplicated, block: B:99:0x018d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r1.emit(null, r24) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ee, code lost:
    
        if (r1.emit(null, r24) == r2) goto L20;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x0171, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v22, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.util.ArrayList] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        Object objA;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ2;
        ArrayList arrayList;
        String str;
        int i14;
        int i15;
        d60.b bVar;
        Object objJ;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        Object objI;
        List listN0;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ3;
        ?? arrayList2;
        List<GeoPointDTO> list;
        com.garmin.android.apps.connectmobile.courses.model.e eVar4;
        Iterator it;
        Object next;
        GeoPointDTO geoPointDTO;
        Double d14;
        double dDoubleValue;
        Double d15;
        com.garmin.android.apps.connectmobile.courses.model.g gVar;
        List list2;
        v2 v2Var;
        String str2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar5;
        n30.f fVarA;
        r53.j jVar = (r53.j) this.f15555d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f15554c;
        n30.f fVar = this.f15556e;
        p pVar = this.f15557f;
        switch (i16) {
            case 0:
                o13.r.b(obj);
                w20.a aVar2 = fVar.f123456d;
                if ((aVar2 != null ? aVar2.f181476a : null) == null) {
                    this.f15555d = null;
                    this.f15554c = 1;
                    break;
                } else {
                    List<GeoPointDTO> list3 = aVar2.f181476a.geoPoints;
                    if (list3 == null || list3.isEmpty()) {
                        this.f15555d = null;
                        this.f15554c = 2;
                        if (jVar.emit(null, this) == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    }
                    eVar = new com.garmin.android.apps.connectmobile.courses.model.e(fVar.f123456d.f181476a);
                    Long l14 = eVar.sourceTypeId;
                    if (l14 == null || l14.longValue() != 4) {
                        eVar.sourceTypeId = new Long(3L);
                    }
                    int i17 = p.f15558c;
                    pVar.getClass();
                    List<GeoPointDTO> list4 = eVar.geoPoints;
                    if (list4 == null || list4.isEmpty()) {
                        int i18 = p.f15558c;
                        pVar.getClass();
                        listJ = eVar.j();
                        if (listJ != null && !listJ.isEmpty()) {
                            for (com.garmin.android.apps.connectmobile.courses.model.g gVar2 : listJ) {
                                if (gVar2.getDistance() != null || gVar2.elevation == null) {
                                    listJ3 = eVar.j();
                                    if (listJ3 != null) {
                                        arrayList2 = new ArrayList();
                                        for (Object obj2 : listJ3) {
                                            gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj2;
                                            if (gVar.getDistance() != null || gVar.elevation == null) {
                                                arrayList2.add(obj2);
                                            }
                                        }
                                    } else {
                                        arrayList2 = 0;
                                    }
                                    if (arrayList2 == 0) {
                                        arrayList2 = j0.f134944a;
                                    }
                                    for (com.garmin.android.apps.connectmobile.courses.model.g gVar3 : (Iterable) arrayList2) {
                                        list = eVar.geoPoints;
                                        if (list != null) {
                                            it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    GeoPointDTO geoPointDTO2 = (GeoPointDTO) next;
                                                    d14 = geoPointDTO2.latitude;
                                                    if (d14 != null) {
                                                        dDoubleValue = d14.doubleValue();
                                                    } else {
                                                        dDoubleValue = 0.0d;
                                                    }
                                                    d15 = geoPointDTO2.longitude;
                                                    eVar4 = eVar;
                                                    if (!gVar3.i(new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d))) {
                                                        eVar = eVar4;
                                                    }
                                                } else {
                                                    eVar4 = eVar;
                                                    next = null;
                                                }
                                            }
                                            geoPointDTO = (GeoPointDTO) next;
                                            if (geoPointDTO != null) {
                                                gVar3.o(geoPointDTO.distance);
                                                gVar3.elevation = geoPointDTO.elevation;
                                            }
                                            eVar = eVar4;
                                        } else {
                                            eVar4 = eVar;
                                        }
                                        a2 a2Var = a2.COURSES;
                                        String str3 = "Did not find point for Lat:" + gVar3.lat + ", Lng:" + gVar3.lon;
                                        i2.f36769a.getClass();
                                        i2.a.a(a2Var, str3);
                                        eVar = eVar4;
                                    }
                                }
                            }
                        }
                        eVar2 = eVar;
                        listJ2 = eVar2.j();
                        if (listJ2 != null || (listN0 = h0.N0(listJ2, new a())) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(listN0);
                        }
                        eVar2.i0(arrayList);
                        str = eVar2.courseId;
                        if (str != null || str.length() == 0) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        i15 = i14 ^ 1;
                        bVar = pVar.f15559a;
                        if (i14 == 0) {
                            this.f15555d = jVar;
                            this.f15552a = eVar2;
                            this.f15553b = i15;
                            this.f15554c = 5;
                            objI = bVar.i(str, eVar2, this);
                            if (objI != aVar) {
                                eVar3 = eVar2;
                                v2Var = (v2) objI;
                                if (v2Var instanceof v2.b) {
                                    eVar5 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                                    if (i15 != 0) {
                                        a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.e.f912b, eVar5);
                                    }
                                    boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                    s20.d dVar = s20.d.f156005a;
                                    List<GeoPointDTO> list5 = eVar5.geoPoints;
                                    dVar.getClass();
                                    eVar5.intervalMarkers = s20.d.f(list5, zY);
                                    fVarA = n30.f.a(fVar, false, null, false, w20.a.b(fVar.f123456d, eVar5, null, null, null, null, 62), null, null, 0, false, null, null, 2039);
                                    this.f15555d = null;
                                    this.f15552a = null;
                                    this.f15553b = i15;
                                    this.f15554c = 7;
                                    if (jVar.emit(fVarA, this) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (v2Var instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    if (i15 != 0) {
                                        a30.a aVar3 = (a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null);
                                        str2 = ((v2.a) v2Var).f47385c;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        a30.d.a(aVar3, new a30.c.d(str2), eVar3);
                                    }
                                    this.f15555d = null;
                                    this.f15552a = null;
                                    this.f15553b = i15;
                                    this.f15554c = 8;
                                    if (jVar.emit(null, this) == aVar) {
                                        return aVar;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            this.f15555d = jVar;
                            this.f15552a = eVar2;
                            this.f15553b = i15;
                            this.f15554c = 6;
                            objJ = f0.J(bVar, new d60.d(bVar, eVar2, null), this);
                            if (objJ != aVar) {
                                eVar3 = eVar2;
                                v2Var = (v2) objJ;
                                if (v2Var instanceof v2.b) {
                                    eVar5 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                                    if (i15 != 0) {
                                        a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.e.f912b, eVar5);
                                    }
                                    boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                    s20.d dVar2 = s20.d.f156005a;
                                    List<GeoPointDTO> list6 = eVar5.geoPoints;
                                    dVar2.getClass();
                                    eVar5.intervalMarkers = s20.d.f(list6, zY2);
                                    fVarA = n30.f.a(fVar, false, null, false, w20.a.b(fVar.f123456d, eVar5, null, null, null, null, 62), null, null, 0, false, null, null, 2039);
                                    this.f15555d = null;
                                    this.f15552a = null;
                                    this.f15553b = i15;
                                    this.f15554c = 7;
                                    if (jVar.emit(fVarA, this) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (v2Var instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    if (i15 != 0) {
                                        a30.a aVar4 = (a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null);
                                        str2 = ((v2.a) v2Var).f47385c;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        a30.d.a(aVar4, new a30.c.d(str2), eVar3);
                                    }
                                    this.f15555d = null;
                                    this.f15552a = null;
                                    this.f15553b = i15;
                                    this.f15554c = 8;
                                    if (jVar.emit(null, this) == aVar) {
                                        return aVar;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        Iterator it3 = list4.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                GeoPointDTO geoPointDTO3 = (GeoPointDTO) it3.next();
                                if (geoPointDTO3.distance == null || geoPointDTO3.elevation == null) {
                                    z20.l lVar = pVar.f15560b;
                                    this.f15555d = jVar;
                                    this.f15552a = eVar;
                                    this.f15554c = 3;
                                    objA = lVar.a(eVar, list3, this);
                                    if (objA != aVar) {
                                        list2 = (List) objA;
                                        if (list2 != null || list2.isEmpty()) {
                                            this.f15555d = null;
                                            this.f15552a = null;
                                            this.f15554c = 4;
                                            break;
                                        } else {
                                            d30.b.e(list2, eVar);
                                            int i19 = p.f15558c;
                                            pVar.getClass();
                                            listJ = eVar.j();
                                            if (listJ != null) {
                                                while (true) {
                                                    if (gVar2.getDistance() != null) {
                                                    }
                                                    listJ3 = eVar.j();
                                                    if (listJ3 != null) {
                                                        arrayList2 = new ArrayList();
                                                        while (r3.hasNext()) {
                                                            gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj2;
                                                            if (gVar.getDistance() != null) {
                                                            }
                                                            arrayList2.add(obj2);
                                                        }
                                                    } else {
                                                        arrayList2 = 0;
                                                    }
                                                    if (arrayList2 == 0) {
                                                        arrayList2 = j0.f134944a;
                                                    }
                                                    while (r3.hasNext()) {
                                                        list = eVar.geoPoints;
                                                        if (list != null) {
                                                            it = list.iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    next = it.next();
                                                                    GeoPointDTO geoPointDTO4 = (GeoPointDTO) next;
                                                                    d14 = geoPointDTO4.latitude;
                                                                    if (d14 != null) {
                                                                        dDoubleValue = d14.doubleValue();
                                                                    } else {
                                                                        dDoubleValue = 0.0d;
                                                                    }
                                                                    d15 = geoPointDTO4.longitude;
                                                                    eVar4 = eVar;
                                                                    if (!gVar3.i(new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d))) {
                                                                        eVar = eVar4;
                                                                    }
                                                                } else {
                                                                    eVar4 = eVar;
                                                                    next = null;
                                                                }
                                                            }
                                                            geoPointDTO = (GeoPointDTO) next;
                                                            if (geoPointDTO != null) {
                                                                gVar3.o(geoPointDTO.distance);
                                                                gVar3.elevation = geoPointDTO.elevation;
                                                            }
                                                            eVar = eVar4;
                                                        } else {
                                                            eVar4 = eVar;
                                                        }
                                                        a2 a2Var2 = a2.COURSES;
                                                        String str4 = "Did not find point for Lat:" + gVar3.lat + ", Lng:" + gVar3.lon;
                                                        i2.f36769a.getClass();
                                                        i2.a.a(a2Var2, str4);
                                                        eVar = eVar4;
                                                    }
                                                }
                                            }
                                            eVar2 = eVar;
                                            listJ2 = eVar2.j();
                                            if (listJ2 != null) {
                                                arrayList = null;
                                            } else {
                                                arrayList = null;
                                            }
                                            eVar2.i0(arrayList);
                                            str = eVar2.courseId;
                                            if (str != null) {
                                                i14 = 1;
                                            } else {
                                                i14 = 1;
                                            }
                                            i15 = i14 ^ 1;
                                            bVar = pVar.f15559a;
                                            if (i14 == 0) {
                                                this.f15555d = jVar;
                                                this.f15552a = eVar2;
                                                this.f15553b = i15;
                                                this.f15554c = 5;
                                                objI = bVar.i(str, eVar2, this);
                                                if (objI != aVar) {
                                                    eVar3 = eVar2;
                                                    v2Var = (v2) objI;
                                                    if (v2Var instanceof v2.b) {
                                                        eVar5 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                                                        if (i15 != 0) {
                                                            a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.e.f912b, eVar5);
                                                        }
                                                        boolean zY3 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                                        s20.d dVar3 = s20.d.f156005a;
                                                        List<GeoPointDTO> list7 = eVar5.geoPoints;
                                                        dVar3.getClass();
                                                        eVar5.intervalMarkers = s20.d.f(list7, zY3);
                                                        fVarA = n30.f.a(fVar, false, null, false, w20.a.b(fVar.f123456d, eVar5, null, null, null, null, 62), null, null, 0, false, null, null, 2039);
                                                        this.f15555d = null;
                                                        this.f15552a = null;
                                                        this.f15553b = i15;
                                                        this.f15554c = 7;
                                                        if (jVar.emit(fVarA, this) == aVar) {
                                                            return aVar;
                                                        }
                                                    } else {
                                                        if (v2Var instanceof v2.a) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        if (i15 != 0) {
                                                            a30.a aVar5 = (a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null);
                                                            str2 = ((v2.a) v2Var).f47385c;
                                                            if (str2 == null) {
                                                                str2 = "";
                                                            }
                                                            a30.d.a(aVar5, new a30.c.d(str2), eVar3);
                                                        }
                                                        this.f15555d = null;
                                                        this.f15552a = null;
                                                        this.f15553b = i15;
                                                        this.f15554c = 8;
                                                        if (jVar.emit(null, this) == aVar) {
                                                            return aVar;
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                this.f15555d = jVar;
                                                this.f15552a = eVar2;
                                                this.f15553b = i15;
                                                this.f15554c = 6;
                                                objJ = f0.J(bVar, new d60.d(bVar, eVar2, null), this);
                                                if (objJ != aVar) {
                                                    eVar3 = eVar2;
                                                    v2Var = (v2) objJ;
                                                    if (v2Var instanceof v2.b) {
                                                        eVar5 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                                                        if (i15 != 0) {
                                                            a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.e.f912b, eVar5);
                                                        }
                                                        boolean zY4 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                                        s20.d dVar4 = s20.d.f156005a;
                                                        List<GeoPointDTO> list8 = eVar5.geoPoints;
                                                        dVar4.getClass();
                                                        eVar5.intervalMarkers = s20.d.f(list8, zY4);
                                                        fVarA = n30.f.a(fVar, false, null, false, w20.a.b(fVar.f123456d, eVar5, null, null, null, null, 62), null, null, 0, false, null, null, 2039);
                                                        this.f15555d = null;
                                                        this.f15552a = null;
                                                        this.f15553b = i15;
                                                        this.f15554c = 7;
                                                        if (jVar.emit(fVarA, this) == aVar) {
                                                            return aVar;
                                                        }
                                                    } else {
                                                        if (v2Var instanceof v2.a) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        if (i15 != 0) {
                                                            a30.a aVar6 = (a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null);
                                                            str2 = ((v2.a) v2Var).f47385c;
                                                            if (str2 == null) {
                                                                str2 = "";
                                                            }
                                                            a30.d.a(aVar6, new a30.c.d(str2), eVar3);
                                                        }
                                                        this.f15555d = null;
                                                        this.f15552a = null;
                                                        this.f15553b = i15;
                                                        this.f15554c = 8;
                                                        if (jVar.emit(null, this) == aVar) {
                                                            return aVar;
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int i110 = p.f15558c;
                                pVar.getClass();
                                listJ = eVar.j();
                                if (listJ != null) {
                                    while (true) {
                                        if (gVar2.getDistance() != null) {
                                        }
                                        listJ3 = eVar.j();
                                        if (listJ3 != null) {
                                            arrayList2 = new ArrayList();
                                            while (r3.hasNext()) {
                                                gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj2;
                                                if (gVar.getDistance() != null) {
                                                }
                                                arrayList2.add(obj2);
                                            }
                                        } else {
                                            arrayList2 = 0;
                                        }
                                        if (arrayList2 == 0) {
                                            arrayList2 = j0.f134944a;
                                        }
                                        while (r3.hasNext()) {
                                            list = eVar.geoPoints;
                                            if (list != null) {
                                                it = list.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        GeoPointDTO geoPointDTO5 = (GeoPointDTO) next;
                                                        d14 = geoPointDTO5.latitude;
                                                        if (d14 != null) {
                                                            dDoubleValue = d14.doubleValue();
                                                        } else {
                                                            dDoubleValue = 0.0d;
                                                        }
                                                        d15 = geoPointDTO5.longitude;
                                                        eVar4 = eVar;
                                                        if (!gVar3.i(new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d))) {
                                                            eVar = eVar4;
                                                        }
                                                    } else {
                                                        eVar4 = eVar;
                                                        next = null;
                                                    }
                                                }
                                                geoPointDTO = (GeoPointDTO) next;
                                                if (geoPointDTO != null) {
                                                    gVar3.o(geoPointDTO.distance);
                                                    gVar3.elevation = geoPointDTO.elevation;
                                                }
                                                eVar = eVar4;
                                            } else {
                                                eVar4 = eVar;
                                            }
                                            a2 a2Var3 = a2.COURSES;
                                            String str5 = "Did not find point for Lat:" + gVar3.lat + ", Lng:" + gVar3.lon;
                                            i2.f36769a.getClass();
                                            i2.a.a(a2Var3, str5);
                                            eVar = eVar4;
                                        }
                                    }
                                }
                                eVar2 = eVar;
                                listJ2 = eVar2.j();
                                if (listJ2 != null) {
                                    arrayList = null;
                                } else {
                                    arrayList = null;
                                }
                                eVar2.i0(arrayList);
                                str = eVar2.courseId;
                                if (str != null) {
                                    i14 = 1;
                                } else {
                                    i14 = 1;
                                }
                                i15 = i14 ^ 1;
                                bVar = pVar.f15559a;
                                if (i14 == 0) {
                                    this.f15555d = jVar;
                                    this.f15552a = eVar2;
                                    this.f15553b = i15;
                                    this.f15554c = 5;
                                    objI = bVar.i(str, eVar2, this);
                                    if (objI != aVar) {
                                        eVar3 = eVar2;
                                        v2Var = (v2) objI;
                                        if (v2Var instanceof v2.b) {
                                            eVar5 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                                            if (i15 != 0) {
                                                a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.e.f912b, eVar5);
                                            }
                                            boolean zY5 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                            s20.d dVar5 = s20.d.f156005a;
                                            List<GeoPointDTO> list9 = eVar5.geoPoints;
                                            dVar5.getClass();
                                            eVar5.intervalMarkers = s20.d.f(list9, zY5);
                                            fVarA = n30.f.a(fVar, false, null, false, w20.a.b(fVar.f123456d, eVar5, null, null, null, null, 62), null, null, 0, false, null, null, 2039);
                                            this.f15555d = null;
                                            this.f15552a = null;
                                            this.f15553b = i15;
                                            this.f15554c = 7;
                                            if (jVar.emit(fVarA, this) == aVar) {
                                                return aVar;
                                            }
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                u0.r();
                                                return null;
                                            }
                                            if (i15 != 0) {
                                                a30.a aVar7 = (a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null);
                                                str2 = ((v2.a) v2Var).f47385c;
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                a30.d.a(aVar7, new a30.c.d(str2), eVar3);
                                            }
                                            this.f15555d = null;
                                            this.f15552a = null;
                                            this.f15553b = i15;
                                            this.f15554c = 8;
                                            if (jVar.emit(null, this) == aVar) {
                                                return aVar;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    this.f15555d = jVar;
                                    this.f15552a = eVar2;
                                    this.f15553b = i15;
                                    this.f15554c = 6;
                                    objJ = f0.J(bVar, new d60.d(bVar, eVar2, null), this);
                                    if (objJ != aVar) {
                                        eVar3 = eVar2;
                                        v2Var = (v2) objJ;
                                        if (v2Var instanceof v2.b) {
                                            eVar5 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                                            if (i15 != 0) {
                                                a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.e.f912b, eVar5);
                                            }
                                            boolean zY6 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                            s20.d dVar6 = s20.d.f156005a;
                                            List<GeoPointDTO> list10 = eVar5.geoPoints;
                                            dVar6.getClass();
                                            eVar5.intervalMarkers = s20.d.f(list10, zY6);
                                            fVarA = n30.f.a(fVar, false, null, false, w20.a.b(fVar.f123456d, eVar5, null, null, null, null, 62), null, null, 0, false, null, null, 2039);
                                            this.f15555d = null;
                                            this.f15552a = null;
                                            this.f15553b = i15;
                                            this.f15554c = 7;
                                            if (jVar.emit(fVarA, this) == aVar) {
                                                return aVar;
                                            }
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                u0.r();
                                                return null;
                                            }
                                            if (i15 != 0) {
                                                a30.a aVar8 = (a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null);
                                                str2 = ((v2.a) v2Var).f47385c;
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                a30.d.a(aVar8, new a30.c.d(str2), eVar3);
                                            }
                                            this.f15555d = null;
                                            this.f15552a = null;
                                            this.f15553b = i15;
                                            this.f15554c = 8;
                                            if (jVar.emit(null, this) == aVar) {
                                                return aVar;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 2:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.courses.model.e eVar6 = this.f15552a;
                o13.r.b(obj);
                eVar = eVar6;
                objA = obj;
                list2 = (List) objA;
                if (list2 != null) {
                }
                this.f15555d = null;
                this.f15552a = null;
                this.f15554c = 4;
                break;
            case 4:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 5:
                int i24 = this.f15553b;
                eVar3 = this.f15552a;
                o13.r.b(obj);
                i15 = i24;
                objI = obj;
                v2Var = (v2) objI;
                if (v2Var instanceof v2.b) {
                    eVar5 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                    if (i15 != 0) {
                        a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.e.f912b, eVar5);
                    }
                    boolean zY7 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                    s20.d dVar7 = s20.d.f156005a;
                    List<GeoPointDTO> list11 = eVar5.geoPoints;
                    dVar7.getClass();
                    eVar5.intervalMarkers = s20.d.f(list11, zY7);
                    fVarA = n30.f.a(fVar, false, null, false, w20.a.b(fVar.f123456d, eVar5, null, null, null, null, 62), null, null, 0, false, null, null, 2039);
                    this.f15555d = null;
                    this.f15552a = null;
                    this.f15553b = i15;
                    this.f15554c = 7;
                    if (jVar.emit(fVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    if (i15 != 0) {
                        a30.a aVar9 = (a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null);
                        str2 = ((v2.a) v2Var).f47385c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a30.d.a(aVar9, new a30.c.d(str2), eVar3);
                    }
                    this.f15555d = null;
                    this.f15552a = null;
                    this.f15553b = i15;
                    this.f15554c = 8;
                    if (jVar.emit(null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                int i25 = this.f15553b;
                eVar3 = this.f15552a;
                o13.r.b(obj);
                i15 = i25;
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    eVar5 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
                    if (i15 != 0) {
                        a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.e.f912b, eVar5);
                    }
                    boolean zY8 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                    s20.d dVar8 = s20.d.f156005a;
                    List<GeoPointDTO> list12 = eVar5.geoPoints;
                    dVar8.getClass();
                    eVar5.intervalMarkers = s20.d.f(list12, zY8);
                    fVarA = n30.f.a(fVar, false, null, false, w20.a.b(fVar.f123456d, eVar5, null, null, null, null, 62), null, null, 0, false, null, null, 2039);
                    this.f15555d = null;
                    this.f15552a = null;
                    this.f15553b = i15;
                    this.f15554c = 7;
                    if (jVar.emit(fVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    if (i15 != 0) {
                        a30.a aVar10 = (a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null);
                        str2 = ((v2.a) v2Var).f47385c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a30.d.a(aVar10, new a30.c.d(str2), eVar3);
                    }
                    this.f15555d = null;
                    this.f15552a = null;
                    this.f15553b = i15;
                    this.f15554c = 8;
                    if (jVar.emit(null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            case 7:
            case 8:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
