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
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ln30/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.GetCourseRouteUseCase$invoke$1", f = "GetCourseRouteUseCase.kt", l = {40, 48, 59, 79, 97}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<r53.j<? super n30.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f15522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n30.f f15527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f15528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LatLng f15529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w20.b f15530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ double f15531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k30.k f15532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f15533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f15534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f15535n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n30.f fVar, k kVar, LatLng latLng, w20.b bVar, double d14, k30.k kVar2, boolean z14, boolean z15, boolean z16, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f15527f = fVar;
        this.f15528g = kVar;
        this.f15529h = latLng;
        this.f15530i = bVar;
        this.f15531j = d14;
        this.f15532k = kVar2;
        this.f15533l = z14;
        this.f15534m = z15;
        this.f15535n = z16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f15527f, this.f15528g, this.f15529h, this.f15530i, this.f15531j, this.f15532k, this.f15533l, this.f15534m, this.f15535n, dVar);
        jVar.f15526e = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super n30.f> jVar, t13.d<? super Unit> dVar) {
        return ((j) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0156 A[PHI: r0 r1 r2 r3 r20
      0x0156: PHI (r0v17 java.lang.Object) = (r0v14 java.lang.Object), (r0v33 java.lang.Object) binds: [B:41:0x0152, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r1v4 boolean) = (r1v3 boolean), (r1v7 boolean) binds: [B:41:0x0152, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r2v5 com.garmin.android.apps.connectmobile.courses.model.e) = 
      (r2v8 com.garmin.android.apps.connectmobile.courses.model.e)
      (r2v9 com.garmin.android.apps.connectmobile.courses.model.e)
     binds: [B:41:0x0152, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r3v8 boolean) = (r3v7 boolean), (r3v9 boolean) binds: [B:41:0x0152, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r20v2 n30.f) = (r20v1 n30.f), (r20v4 n30.f) binds: [B:41:0x0152, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x015e  */
    /* JADX WARN: Code duplicated, block: B:48:0x016a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0173  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01df  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ea  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r11.emit(null, r41) == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r11.emit(r14, r41) == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0232, code lost:
    
        if (r11.emit(r0, r41) == r12) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.garmin.android.apps.connectmobile.courses.model.e, e23.a, java.lang.Object, java.util.ArrayList, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r14v5 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n30.f fVar;
        ?? r14;
        int i14;
        Object objA;
        boolean z14;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        boolean zY;
        com.garmin.android.library.mapsdkadapter.i.b bVarF;
        Object objA2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        k30.u uVar;
        List list;
        n30.g gVarB;
        int i15;
        List<ClimbDTO> listB;
        ArrayList arrayList;
        x unpavedSections;
        k30.t highTrafficSections;
        List<fn0.b> listD;
        n30.e eVar4;
        r53.j jVar = (r53.j) this.f15526e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f15525d;
        k kVar = this.f15528g;
        n30.f fVar2 = this.f15527f;
        if (i16 == 0) {
            o13.r.b(obj);
            w20.a aVar2 = fVar2.f123456d;
            w20.a aVar3 = fVar2.f123456d;
            if ((aVar2 != null ? aVar2.f181476a : null) == null) {
                this.f15526e = null;
                this.f15525d = 1;
            } else {
                com.garmin.android.apps.connectmobile.courses.model.e eVar5 = new com.garmin.android.apps.connectmobile.courses.model.e(aVar3.f181476a);
                boolean zG = eVar5.G();
                com.garmin.android.apps.connectmobile.courses.model.i iVarM = aVar3.f181476a.m();
                this.f15526e = jVar;
                this.f15522a = eVar5;
                this.f15523b = zG;
                this.f15525d = 2;
                fVar = fVar2;
                r14 = 0;
                i14 = 3;
                objA = k.a(this.f15528g, this.f15529h, this.f15530i, iVarM, this.f15531j, this.f15532k, this.f15533l, this.f15534m, this.f15535n, this);
                if (objA != aVar) {
                    z14 = zG;
                    eVar = eVar5;
                    eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) objA;
                    if (eVar2 == null) {
                        this.f15526e = r14;
                        this.f15522a = r14;
                        this.f15523b = z14;
                        this.f15525d = i14;
                    } else {
                        zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, r14, r14, 6, r14)).y();
                        eVar.J0(eVar2.D());
                        eVar.geoPoints = eVar2.geoPoints;
                        eVar.n0(new Double(eVar2.q()));
                        eVar.o0(new Double(eVar2.r()));
                        eVar.p0(new Double(eVar2.s()));
                        eVar.g0(eVar2.h());
                        bVarF = eVar2.F();
                        if (bVarF != null) {
                            eVar.L0(bVarF);
                        }
                        eVar.x0(eVar2.z());
                        s20.d dVar = s20.d.f156005a;
                        List<GeoPointDTO> list2 = eVar2.geoPoints;
                        dVar.getClass();
                        eVar.intervalMarkers = s20.d.f(list2, zY);
                        eVar.i0(r14);
                        z20.r rVar = kVar.f15537b;
                        List<GeoPointDTO> list3 = eVar2.geoPoints;
                        boolean zC = eVar.m().c();
                        this.f15526e = jVar;
                        this.f15522a = eVar;
                        this.f15523b = z14;
                        this.f15524c = zY;
                        this.f15525d = 4;
                        objA2 = rVar.a(list3, zC, this);
                        eVar3 = eVar;
                        if (objA2 != aVar) {
                            uVar = (k30.u) objA2;
                            list = eVar3.geoPoints;
                            if (list == null) {
                                list = j0.f134944a;
                            }
                            List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar3.j();
                            gVarB = fVar.b();
                            if (gVarB != null) {
                                i15 = -1;
                            } else {
                                i15 = -1;
                            }
                            n30.g gVar = new n30.g(list, listJ, z14, new n30.e(this.f15532k, this.f15533l, this.f15534m, this.f15535n, this.f15531j, this.f15530i, i15));
                            c cVar = kVar.f15538c;
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
                            n30.f fVar3 = fVar;
                            n30.f fVarA = c.a(new n30.f(false, null, false, new w20.a(eVar3, listB, arrayList, unpavedSections, highTrafficSections, false, 32, null), false, h0.D0(fVar3.f123458f, gVar), null, 0, fVar3.f123461i, null, null, 1751, null));
                            this.f15526e = null;
                            this.f15522a = null;
                            this.f15523b = z14;
                            this.f15524c = zY;
                            this.f15525d = 5;
                        }
                    }
                }
            }
            return aVar;
        }
        if (i16 == 1) {
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        if (i16 != 2) {
            if (i16 == 3) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i16 == 4) {
                boolean z15 = this.f15524c;
                z14 = this.f15523b;
                com.garmin.android.apps.connectmobile.courses.model.e eVar6 = this.f15522a;
                o13.r.b(obj);
                zY = z15;
                fVar = fVar2;
                objA2 = obj;
                eVar3 = eVar6;
                uVar = (k30.u) objA2;
                list = eVar3.geoPoints;
                if (list == null) {
                    list = j0.f134944a;
                }
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ2 = eVar3.j();
                gVarB = fVar.b();
                if (gVarB != null || (eVar4 = gVarB.f123469d) == null) {
                    i15 = -1;
                } else {
                    i15 = eVar4.f123452g;
                }
                n30.g gVar2 = new n30.g(list, listJ2, z14, new n30.e(this.f15532k, this.f15533l, this.f15534m, this.f15535n, this.f15531j, this.f15530i, i15));
                c cVar2 = kVar.f15538c;
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
                n30.f fVar4 = fVar;
                n30.f fVarA2 = c.a(new n30.f(false, null, false, new w20.a(eVar3, listB, arrayList, unpavedSections, highTrafficSections, false, 32, null), false, h0.D0(fVar4.f123458f, gVar2), null, 0, fVar4.f123461i, null, null, 1751, null));
                this.f15526e = null;
                this.f15522a = null;
                this.f15523b = z14;
                this.f15524c = zY;
                this.f15525d = 5;
            } else {
                if (i16 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        boolean z16 = this.f15523b;
        com.garmin.android.apps.connectmobile.courses.model.e eVar7 = this.f15522a;
        o13.r.b(obj);
        i14 = 3;
        fVar = fVar2;
        r14 = 0;
        z14 = z16;
        objA = obj;
        eVar = eVar7;
        eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) objA;
        if (eVar2 == null) {
            this.f15526e = r14;
            this.f15522a = r14;
            this.f15523b = z14;
            this.f15525d = i14;
        } else {
            zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, r14, r14, 6, r14)).y();
            eVar.J0(eVar2.D());
            eVar.geoPoints = eVar2.geoPoints;
            eVar.n0(new Double(eVar2.q()));
            eVar.o0(new Double(eVar2.r()));
            eVar.p0(new Double(eVar2.s()));
            eVar.g0(eVar2.h());
            bVarF = eVar2.F();
            if (bVarF != null) {
                eVar.L0(bVarF);
            }
            eVar.x0(eVar2.z());
            s20.d dVar2 = s20.d.f156005a;
            List<GeoPointDTO> list4 = eVar2.geoPoints;
            dVar2.getClass();
            eVar.intervalMarkers = s20.d.f(list4, zY);
            eVar.i0(r14);
            z20.r rVar2 = kVar.f15537b;
            List<GeoPointDTO> list5 = eVar2.geoPoints;
            boolean zC2 = eVar.m().c();
            this.f15526e = jVar;
            this.f15522a = eVar;
            this.f15523b = z14;
            this.f15524c = zY;
            this.f15525d = 4;
            objA2 = rVar2.a(list5, zC2, this);
            eVar3 = eVar;
            if (objA2 != aVar) {
                uVar = (k30.u) objA2;
                list = eVar3.geoPoints;
                if (list == null) {
                    list = j0.f134944a;
                }
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ3 = eVar3.j();
                gVarB = fVar.b();
                if (gVarB != null) {
                    i15 = -1;
                } else {
                    i15 = -1;
                }
                n30.g gVar3 = new n30.g(list, listJ3, z14, new n30.e(this.f15532k, this.f15533l, this.f15534m, this.f15535n, this.f15531j, this.f15530i, i15));
                c cVar3 = kVar.f15538c;
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
                n30.f fVar5 = fVar;
                n30.f fVarA3 = c.a(new n30.f(false, null, false, new w20.a(eVar3, listB, arrayList, unpavedSections, highTrafficSections, false, 32, null), false, h0.D0(fVar5.f123458f, gVar3), null, 0, fVar5.f123461i, null, null, 1751, null));
                this.f15526e = null;
                this.f15522a = null;
                this.f15523b = z14;
                this.f15524c = zY;
                this.f15525d = 5;
            }
        }
        return aVar;
    }
}
