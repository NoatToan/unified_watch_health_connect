package c30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.UndoCourseRouteStateUseCase$invoke$1", f = "UndoCourseRouteStateUseCase.kt", l = {21, 34, 43, 45, 58, 72}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f24044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f24045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a50.a f24046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a50.g f24049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f24050g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(a50.g gVar, w0 w0Var, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f24049f = gVar;
        this.f24050g = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v0 v0Var = new v0(this.f24049f, this.f24050g, dVar);
        v0Var.f24048e = obj;
        return v0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((v0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c3  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0151, code lost:
    
        if (r1.emit(r3, r26) == r2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        if (r1.emit(null, r26) == r2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01bd, code lost:
    
        if (r1.emit(r3, r26) == r2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cb, code lost:
    
        if (r1.emit(null, r26) == r2) goto L73;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List listV;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        a50.a aVar;
        Object objA;
        List list;
        Object objA2;
        k30.u uVar;
        List<ClimbDTO> listB;
        ArrayList arrayList;
        k30.x unpavedSections;
        k30.t highTrafficSections;
        List<fn0.b> listD;
        r53.j jVar = (r53.j) this.f24048e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24047d;
        w0 w0Var = this.f24050g;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                a50.g gVar = this.f24049f;
                List<a50.a> list2 = gVar.f1396g;
                w20.a aVar3 = gVar.f1393d;
                if (list2.size() <= 1) {
                    this.f24048e = null;
                    this.f24047d = 1;
                    break;
                } else {
                    if ((aVar3 != null ? aVar3.f181476a : null) != null) {
                        listV = p13.h0.V(1, gVar.f1396g);
                        eVar = new com.garmin.android.apps.connectmobile.courses.model.e(aVar3.f181476a);
                        aVar = (a50.a) p13.h0.n0(listV);
                        List<List<GeoPointDTO>> list3 = aVar != null ? aVar.f1241b : null;
                        if (list3 == null || list3.isEmpty()) {
                            eVar.geoPoints = p13.j0.f134944a;
                            eVar.J0(null);
                            eVar.n0(null);
                            eVar.o0(null);
                            eVar.p0(null);
                            eVar.intervalMarkers = null;
                            eVar.i0(null);
                            a50.g gVarA = a50.g.a(this.f24049f, false, null, false, new w20.a(eVar, null, null, null, null, false, 32, null), false, listV, null, null, 0, false, false, false, false, null, null, 65463);
                            this.f24048e = null;
                            this.f24044a = null;
                            this.f24045b = null;
                            this.f24046c = null;
                            this.f24047d = 6;
                        } else {
                            z20.l lVar = w0Var.f24051a;
                            ArrayList arrayListS = p13.y.s(list3);
                            this.f24048e = jVar;
                            this.f24044a = listV;
                            this.f24045b = eVar;
                            this.f24046c = aVar;
                            this.f24047d = 2;
                            objA = lVar.a(eVar, arrayListS, this);
                            if (objA != aVar2) {
                                list = (List) objA;
                                if (list == null && !list.isEmpty()) {
                                    d30.b.e(list, eVar);
                                    List<com.garmin.android.apps.connectmobile.courses.model.g> list4 = aVar.f1244e;
                                    eVar.i0(list4 != null ? new ArrayList(list4) : null);
                                    z20.r rVar = w0Var.f24052b;
                                    boolean zC = eVar.m().c();
                                    this.f24048e = jVar;
                                    this.f24044a = listV;
                                    this.f24045b = eVar;
                                    this.f24046c = null;
                                    this.f24047d = 3;
                                    objA2 = rVar.a(list, zC, this);
                                    if (objA2 != aVar2) {
                                        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = eVar;
                                        uVar = (k30.u) objA2;
                                        if (uVar != null) {
                                            listB = uVar.b();
                                        } else {
                                            listB = null;
                                        }
                                        if (uVar != null || (listD = uVar.d()) == null) {
                                            arrayList = null;
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(p13.y.r(listD, 10));
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
                                        a50.g gVarA2 = a50.g.a(this.f24049f, false, null, false, new w20.a(eVar2, listB, arrayList, unpavedSections, highTrafficSections, false, 32, null), false, listV, null, null, 0, false, false, false, false, null, null, 65463);
                                        this.f24048e = null;
                                        this.f24044a = null;
                                        this.f24045b = null;
                                        this.f24046c = null;
                                        this.f24047d = 4;
                                    }
                                } else {
                                    this.f24048e = null;
                                    this.f24044a = null;
                                    this.f24045b = null;
                                    this.f24046c = null;
                                    this.f24047d = 5;
                                }
                            }
                        }
                    } else {
                        this.f24048e = null;
                        this.f24047d = 1;
                    }
                    break;
                }
                return aVar2;
            case 1:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 2:
                a50.a aVar4 = this.f24046c;
                com.garmin.android.apps.connectmobile.courses.model.e eVar3 = this.f24045b;
                List list5 = this.f24044a;
                o13.r.b(obj);
                aVar = aVar4;
                eVar = eVar3;
                listV = list5;
                objA = obj;
                list = (List) objA;
                if (list == null) {
                }
                this.f24048e = null;
                this.f24044a = null;
                this.f24045b = null;
                this.f24046c = null;
                this.f24047d = 5;
                break;
            case 3:
                eVar = this.f24045b;
                List list6 = this.f24044a;
                o13.r.b(obj);
                listV = list6;
                objA2 = obj;
                com.garmin.android.apps.connectmobile.courses.model.e eVar4 = eVar;
                uVar = (k30.u) objA2;
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
                a50.g gVarA3 = a50.g.a(this.f24049f, false, null, false, new w20.a(eVar4, listB, arrayList, unpavedSections, highTrafficSections, false, 32, null), false, listV, null, null, 0, false, false, false, false, null, null, 65463);
                this.f24048e = null;
                this.f24044a = null;
                this.f24045b = null;
                this.f24046c = null;
                this.f24047d = 4;
                break;
            case 4:
            case 5:
            case 6:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
