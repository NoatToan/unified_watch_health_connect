package ly0;

import a42.e0;
import android.annotation.SuppressLint;
import androidx.lifecycle.v1;
import c2.x2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import i3.e9;
import i3.mc;
import java.util.List;
import l30.y0;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ly0/g$a", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.android.library.mapsdkadapter.i.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f115294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GCMMapView f115295b;

        public a(o oVar, GCMMapView gCMMapView) {
            this.f115294a = oVar;
            this.f115295b = gCMMapView;
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.l
        public final void O5(com.garmin.android.library.mapsdkadapter.i.d dVar) {
            dVar.getClass();
            this.f115295b.c();
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.l
        public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
            qe2.h mapProxy = this.f115295b.getMapProxy();
            o oVar = this.f115294a;
            oVar.getClass();
            mapProxy.getClass();
            mapProxy.R(new hc0.c(26, oVar, mapProxy));
            mapProxy.O(new ly0.h(oVar));
            mapProxy.B(new ly0.h(oVar));
            mapProxy.Z(new ly0.i(mapProxy));
            mapProxy.i(new ly0.i(mapProxy));
            mapProxy.setMapType(((Number) oVar.f115350k.getValue()).intValue());
            oVar.Y = mapProxy;
            ge1.b.T(v1.a(oVar), null, null, new n(oVar, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenKt$MapFullscreen$2$1$4$2$3$1$1", f = "MapFullscreen.kt", l = {225}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f115297b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenKt$MapFullscreen$2$1$4$2$3$1$1$1", f = "MapFullscreen.kt", l = {226}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f115298a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f115299b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o oVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f115299b = oVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f115299b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f115298a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f115298a = 1;
                    o oVar = this.f115299b;
                    oVar.getClass();
                    Object objE = c0.e(new k(oVar, null), this);
                    if (objE != obj2) {
                        objE = Unit.INSTANCE;
                    }
                    if (objE == obj2) {
                        return obj2;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f115297b = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f115297b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115296a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(this.f115297b, null);
                this.f115296a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f115300a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.l<? super Long, Unit> lVar) {
            this.f115300a = lVar;
        }

        @Override // e23.l
        public final Unit invoke(Long l14) {
            this.f115300a.invoke(Long.valueOf(l14.longValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f115301a = new d();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f115302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f115303b;

        public e(e23.l lVar, List list) {
            this.f115302a = lVar;
            this.f115303b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f115302a.invoke(this.f115303b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f115304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fy0.e f115305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l f115306c;

        public f(List list, fy0.e eVar, e23.l lVar) {
            this.f115304a = list;
            this.f115305b = eVar;
            this.f115306c = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0069  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                ly0.a aVar = (ly0.a) this.f115304a.get(iIntValue);
                mVar2.C(435655976);
                ActivityListItemDTO activityListItemDTO = aVar.f115281a;
                e23.l lVar = this.f115306c;
                boolean zB = mVar2.B(lVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new c(lVar);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new c(lVar);
                        mVar2.K(objQ);
                    }
                }
                this.f115305b.c(activityListItemDTO, (e23.l) objQ, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ly0.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2196g implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2196g f115307a = new C2196g();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f115308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f115309b;

        public h(e23.l lVar, List list) {
            this.f115308a = lVar;
            this.f115309b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f115308a.invoke(this.f115309b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f115310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a f115311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fy0.e f115312c;

        public i(List list, e23.a aVar, fy0.e eVar) {
            this.f115310a = list;
            this.f115311b = aVar;
            this.f115312c = eVar;
        }

        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                ly0.a aVar = (ly0.a) this.f115310a.get(iIntValue);
                mVar2.C(-1346897019);
                fy0.e.a.a(x2.f(h4.r.S, 1.0f), aVar.f115281a, aVar.f115282b, null, this.f115311b, this.f115312c, mVar2, (ps.m.f139904n << 6) | 3078);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"MutableCollectionMutableState", "ConfigurationScreenWidthHeight"})
    public static final void a(o oVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o oVar2;
        o0 o0Var;
        oVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1209030510);
        int i15 = (o0VarE.r(oVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            fy0.e eVar = (fy0.e) KoinJavaComponent.get$default(fy0.e.class, null, null, 6, null);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            p1 p1VarC = s9.c.c(oVar.f115349j, o0VarE);
            p1 p1VarC2 = s9.c.c(oVar.f115352l, o0VarE);
            p1 p1VarC3 = s9.c.c(oVar.f115355o, o0VarE);
            p1 p1VarC4 = s9.c.c(oVar.f115357q, o0VarE);
            p1 p1VarC5 = s9.c.c(oVar.f115359t, o0VarE);
            p1 p1VarC6 = s9.c.c(oVar.f115361w, o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new lq1.a(25);
                o0VarE.K(objQ3);
            }
            mc mcVarF = e9.f(true, (e23.l) objQ3, o0VarE, 54, 0);
            boolean zH = o0VarE.h(((Boolean) p1VarC3.getF182175a()).booleanValue());
            Object objQ4 = o0VarE.q();
            if (zH || objQ4 == c2565a) {
                objQ4 = !((Boolean) p1VarC3.getF182175a()).booleanValue() ? "3D" : "2D";
                o0VarE.K(objQ4);
            }
            z3.e eVarC = z3.f.c(-1362764493, new af0.c(aVar, p1VarC6, 2), o0VarE);
            e0 e0Var = new e0(oVar, p1VarC, p1VarC2, mcVarF, (String) objQ4, p1VarC3, p1Var, p1VarC5, eVar, b0Var, p1VarC4);
            oVar2 = oVar;
            o0Var = o0VarE;
            z02.d.a(false, eVarC, null, null, null, z3.f.c(952300087, e0Var, o0VarE), o0Var, 196656, 29);
        } else {
            oVar2 = oVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(oVar2, aVar, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    public static final void b(fy0.e eVar, i53.c<ly0.a> cVar, h4.r rVar, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        eVar.getClass();
        cVar.getClass();
        rVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1419783690);
        int i15 = 2;
        int i16 = i14 | (o0VarE.B(eVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int size = cVar.size();
            p3.m.a aVar2 = p3.m.f135153a;
            if (size > 1) {
                o0VarE.C(62280295);
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                boolean z14 = ((i16 & 14) == 4) | ((i16 & 112) == 32) | ((i16 & 7168) == 2048);
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new ls0.h(cVar, i17, eVar, lVar);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ls0.h(cVar, i17, eVar, lVar);
                        o0VarE.K(objQ);
                    }
                }
                e2.c.b(rVar, null, null, iVarI, null, null, false, null, (e23.l) objQ, o0VarE, (i16 >> 6) & 14, 494);
                o0VarE.g0(false);
            } else {
                o0VarE.C(62649474);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarA = c2.l.A(rVar, eVar2.f97920e, 0.0f, 2);
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                boolean z15 = ((57344 & i16) == 16384) | ((i16 & 112) == 32) | ((i16 & 14) == 4);
                Object objQ2 = o0VarE.q();
                if (z15) {
                    objQ2 = new ls0.h(cVar, i15, aVar, eVar);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ls0.h(cVar, i15, aVar, eVar);
                        o0VarE.K(objQ2);
                    }
                }
                e2.c.b(rVarC, null, null, null, null, null, false, null, (e23.l) objQ2, o0VarE, 0, 510);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(eVar, cVar, rVar, lVar, aVar, i14, 21);
        }
    }
}
