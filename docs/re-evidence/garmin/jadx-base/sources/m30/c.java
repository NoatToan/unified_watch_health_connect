package m30;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.r2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.TileOverlay;
import ds.e0;
import i3.a1;
import i3.e5;
import i3.mc;
import i3.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.d0;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.d2;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.AutomaticCourseBottomSheetKt$AutomaticCourseBottomSheet$3$1", f = "AutomaticCourseBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n30.f f116305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<n30.a, Unit> f116306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(n30.f fVar, e23.l<? super n30.a, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f116305a = fVar;
            this.f116306b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f116305a, this.f116306b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            n30.h hVar = this.f116305a.f123459g;
            hVar.getClass();
            if (hVar.f123470a && hVar.f123471b) {
                this.f116306b.invoke(n30.a.n.f123368a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.AutomaticCourseBottomSheetKt$AutomaticCourseBottomSheet$4$1", f = "AutomaticCourseBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<m> f116307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f116308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n1 f116309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1 f116310d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<m> p1Var, n1 n1Var, n1 n1Var2, n1 n1Var3, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f116307a = p1Var;
            this.f116308b = n1Var;
            this.f116309c = n1Var2;
            this.f116310d = n1Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f116307a, this.f116308b, this.f116309c, this.f116310d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1<m> p1Var = this.f116307a;
            m f182175a = p1Var.getF182175a();
            if (f182175a != null && f182175a.isAdded()) {
                int intValue = this.f116309c.getIntValue() + this.f116308b.getIntValue();
                n1 n1Var = this.f116310d;
                n1Var.t(intValue);
                m f182175a2 = p1Var.getF182175a();
                if (f182175a2 != null) {
                    f182175a2.y6(n1Var.getIntValue());
                }
                m f182175a3 = p1Var.getF182175a();
                if (f182175a3 != null) {
                    f182175a3.c8();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: m30.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.AutomaticCourseBottomSheetKt$AutomaticCourseBottomSheet$5$1", f = "AutomaticCourseBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2213c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<m> f116311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f116312b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2213c(p1<m> p1Var, p1<Boolean> p1Var2, t13.d<? super C2213c> dVar) {
            super(2, dVar);
            this.f116311a = p1Var;
            this.f116312b = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2213c(this.f116311a, this.f116312b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2213c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            m f182175a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1<m> p1Var = this.f116311a;
            m f182175a2 = p1Var.getF182175a();
            if (f182175a2 != null && f182175a2.isAdded() && (f182175a = p1Var.getF182175a()) != null) {
                f182175a.M0 = this.f116312b.getF182175a().booleanValue();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.AutomaticCourseBottomSheetKt$AutomaticCourseBottomSheet$6$1", f = "AutomaticCourseBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n30.f f116313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<m> f116314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n30.f fVar, p1<m> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f116313a = fVar;
            this.f116314b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f116313a, this.f116314b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:89:0x01e7  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p1<m> p1Var;
            List<com.garmin.android.library.mapsdkadapter.l> list;
            List<com.garmin.android.library.mapsdkadapter.l> list2;
            List<qe2.a> list3;
            w20.a aVar;
            List<ClimbDTO> list4;
            ArrayList arrayListN;
            m f182175a;
            ArrayList arrayListQ;
            m f182175a2;
            m f182175a3;
            k40.d dVar;
            boolean z14;
            boolean z15;
            com.garmin.android.apps.connectmobile.courses.model.e eVar;
            com.garmin.android.library.mapsdkadapter.i.b bVarY;
            m f182175a4;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1<m> p1Var2 = this.f116314b;
            m f182175a5 = p1Var2.getF182175a();
            if (f182175a5 != null && f182175a5.isAdded()) {
                m f182175a6 = p1Var2.getF182175a();
                List<com.garmin.android.library.mapsdkadapter.l> listD = f182175a6 != null ? f182175a6.f97009l.d(false) : null;
                if (listD == null) {
                    listD = j0.f134944a;
                }
                List<com.garmin.android.library.mapsdkadapter.l> list5 = listD;
                m f182175a7 = p1Var2.getF182175a();
                List<com.garmin.android.library.mapsdkadapter.l> listE = f182175a7 != null ? f182175a7.f97009l.e() : null;
                if (listE == null) {
                    listE = j0.f134944a;
                }
                List<com.garmin.android.library.mapsdkadapter.l> list6 = listE;
                m f182175a8 = p1Var2.getF182175a();
                List<qe2.a> listA = f182175a8 != null ? f182175a8.f97009l.a(false) : null;
                if (listA == null) {
                    listA = j0.f134944a;
                }
                List<qe2.a> list7 = listA;
                m f182175a9 = p1Var2.getF182175a();
                List<qe2.a> listB = f182175a9 != null ? f182175a9.f97010m.b() : null;
                if (listB == null) {
                    listB = j0.f134944a;
                }
                m f182175a10 = p1Var2.getF182175a();
                List<ie2.j> listA2 = f182175a10 != null ? f182175a10.f97007k.a() : null;
                if (listA2 == null) {
                    listA2 = j0.f134944a;
                }
                List<ie2.j> list8 = listA2;
                m f182175a11 = p1Var2.getF182175a();
                if (f182175a11 != null) {
                    f182175a11.I6();
                }
                n30.f fVar = this.f116313a;
                w20.a aVar3 = fVar.f123456d;
                w20.a aVar4 = fVar.f123456d;
                if (aVar3 != null && (eVar = aVar3.f181476a) != null && (bVarY = eVar.y()) != null && (f182175a4 = p1Var2.getF182175a()) != null) {
                    f182175a4.K0 = bVarY;
                }
                com.garmin.android.apps.connectmobile.courses.model.e eVar2 = aVar4 != null ? aVar4.f181476a : null;
                if (eVar2 != null) {
                    m f182175a12 = p1Var2.getF182175a();
                    if (f182175a12 != null) {
                        ArrayList arrayList = f182175a12.J0;
                        k40.d dVar2 = f182175a12.f97011n;
                        k40.e eVar3 = f182175a12.f97005i;
                        arrayList.clear();
                        qe2.h hVar = f182175a12.f148294e;
                        if (hVar != null) {
                            f182175a12.I6();
                            List<GeoPointDTO> list9 = eVar2.geoPoints;
                            com.garmin.android.library.mapsdkadapter.i.b bVarH = eVar2.h();
                            f182175a12.L0 = bVarH;
                            if (list9 != null) {
                                f182175a12.M6();
                                p1Var = p1Var2;
                                com.garmin.android.library.mapsdkadapter.e.a aVar5 = new com.garmin.android.library.mapsdkadapter.e.a();
                                com.garmin.android.library.mapsdkadapter.q qVarA = eVar3.a();
                                ie2.p pVar = qVarA.f50328a;
                                list = list5;
                                pVar.f93155c = 13.0f;
                                pVar.f93158f = 1.0f;
                                com.garmin.android.library.mapsdkadapter.q qVarA2 = eVar3.a();
                                list2 = list6;
                                ie2.p pVar2 = qVarA2.f50328a;
                                list3 = list7;
                                dVar = dVar2;
                                pVar2.f93156d = a7.b.getColor(f182175a12.requireContext(), R.color.gcm_system_static_black);
                                pVar2.f93155c = 17.0f;
                                pVar2.f93158f = 0.0f;
                                Iterator<GeoPointDTO> it = list9.iterator();
                                while (it.hasNext()) {
                                    GeoPointDTO next = it.next();
                                    dVar.getClass();
                                    com.garmin.android.library.mapsdkadapter.f fVarB = k40.d.b(next, bVarH);
                                    if (fVarB != null) {
                                        pVar.f93153a.add(fVarB);
                                        pVar2.f93153a.add(fVarB);
                                        arrayList.add(fVarB);
                                        aVar5.b(fVarB);
                                        it = it;
                                    }
                                }
                                f182175a12.f97019x = aVar5.a();
                                z14 = true;
                                aVar = aVar4;
                                z15 = false;
                                f182175a12.X6().setRecenterMapClickListener(new r2(0, new l(f182175a12, 1), 1, null));
                                hVar.h(qVarA2);
                                hVar.h(qVarA);
                                j40.c.Q7(f182175a12, arrayList);
                                if (!list9.isEmpty()) {
                                    f182175a12.W0 = false;
                                    f182175a12.u6(f182175a12.f97019x, f182175a12.f148290a);
                                }
                            } else {
                                p1Var = p1Var2;
                                list = list5;
                                list2 = list6;
                                list3 = list7;
                                aVar = aVar4;
                                dVar = dVar2;
                                z14 = true;
                                z15 = false;
                            }
                            GeoPointDTO geoPointDTOD = eVar2.D();
                            if (geoPointDTOD != null) {
                                dVar.getClass();
                                f182175a12.b8(k40.d.b(geoPointDTOD, bVarH));
                            }
                            f182175a12.L7(eVar2, hVar);
                            boolean zG = eVar2.G();
                            f182175a12.P = zG;
                            f182175a12.T7((zG || !f182175a12.V6().f109894b) ? z15 : z14);
                            list4 = null;
                            f182175a12.C6(eVar2.j(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y());
                            boolean z16 = f182175a12.V6().f109895c;
                            qe2.h hVar2 = f182175a12.f148294e;
                            if ((hVar2 != null ? hVar2.f144584a.getF125703t() : null) == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX) {
                                qe2.h hVar3 = f182175a12.f148294e;
                                if (hVar3 != null) {
                                    hVar3.z(z16);
                                }
                            } else {
                                TileOverlay tileOverlay = f182175a12.f97004h.f102840a;
                                if (tileOverlay != null) {
                                    tileOverlay.setVisible(z16);
                                }
                            }
                        } else {
                            p1Var = p1Var2;
                            list = list5;
                            list2 = list6;
                            list3 = list7;
                            aVar = aVar4;
                            list4 = null;
                        }
                    } else {
                        p1Var = p1Var2;
                        list = list5;
                        list2 = list6;
                        list3 = list7;
                        aVar = aVar4;
                        list4 = null;
                    }
                    m f182175a13 = p1Var.getF182175a();
                    if (f182175a13 != null) {
                        f182175a13.C6(eVar2.j(), fVar.f123461i);
                    }
                } else {
                    p1Var = p1Var2;
                    list = list5;
                    list2 = list6;
                    list3 = list7;
                    aVar = aVar4;
                    list4 = null;
                }
                m f182175a14 = p1Var.getF182175a();
                if (f182175a14 != null) {
                    j0 j0Var = j0.f134944a;
                    f182175a14.v7(list, list2, list3, j0Var, j0Var);
                }
                m f182175a15 = p1Var.getF182175a();
                if (f182175a15 != null) {
                    f182175a15.w7(listB);
                }
                m f182175a16 = p1Var.getF182175a();
                if (f182175a16 != null) {
                    f182175a16.x7(list8);
                }
                w20.a aVar6 = aVar;
                List<ClimbDTO> list10 = aVar != null ? aVar6.f181477b : list4;
                if (list10 != null && !list10.isEmpty() && (f182175a3 = p1Var.getF182175a()) != null) {
                    f182175a3.P7(aVar6.f181477b);
                }
                if ((aVar6 != null ? aVar6.f181479d : list4) != null && (arrayListQ = f0.q(aVar6.f181479d, aVar6.f181476a)) != null && !arrayListQ.isEmpty() && (f182175a2 = p1Var.getF182175a()) != null) {
                    f182175a2.U7(arrayListQ);
                }
                if ((aVar6 != null ? aVar6.f181480e : list4) != null && (arrayListN = lg.d.n(aVar6.f181480e, aVar6.f181476a)) != null && !arrayListN.isEmpty() && (f182175a = p1Var.getF182175a()) != null) {
                    f182175a.R7(arrayListN);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.AutomaticCourseBottomSheetKt$AutomaticCourseBottomSheet$7$1", f = "AutomaticCourseBottomSheet.kt", l = {237}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2<n30.c> f116316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a1 f116317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f116318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<n30.a, Unit> f116319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f116320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<m> f116321g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n1 f116322h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n1 f116323i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ n1 f116324j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p1<Drawable> f116325k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f116326l;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a1 f116327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f116328b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e23.l<n30.a, Unit> f116329c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f116330d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p1<m> f116331e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ n1 f116332f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ n1 f116333g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ n1 f116334h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p1<Drawable> f116335i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f116336j;

            /* JADX INFO: renamed from: m30.c$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.AutomaticCourseBottomSheetKt$AutomaticCourseBottomSheet$7$1$1", f = "AutomaticCourseBottomSheet.kt", l = {241, 246, 258}, m = "emit", v = 2)
            public static final class C2214a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f116337a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f116338b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f116339c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2214a(a<? super T> aVar, t13.d<? super C2214a> dVar) {
                    super(dVar);
                    this.f116338b = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f116337a = obj;
                    this.f116339c |= Integer.MIN_VALUE;
                    return this.f116338b.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(a1 a1Var, Context context, e23.l<? super n30.a, Unit> lVar, p1<Boolean> p1Var, p1<m> p1Var2, n1 n1Var, n1 n1Var2, n1 n1Var3, p1<Drawable> p1Var3, p1<Boolean> p1Var4) {
                this.f116327a = a1Var;
                this.f116328b = context;
                this.f116329c = lVar;
                this.f116330d = p1Var;
                this.f116331e = p1Var2;
                this.f116332f = n1Var;
                this.f116333g = n1Var2;
                this.f116334h = n1Var3;
                this.f116335i = p1Var3;
                this.f116336j = p1Var4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
            
                if (r10.b(r0) == r1) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
            
                if (r10.f(r0) == r1) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
            
                if (r10.f(r0) == r1) goto L44;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(n30.c cVar, t13.d<? super Unit> dVar) {
                C2214a c2214a;
                m f182175a;
                m f182175a2;
                com.garmin.android.library.mapsdkadapter.f fVarT6;
                m f182175a3;
                m f182175a4;
                m f182175a5;
                m f182175a6;
                m f182175a7;
                m f182175a8;
                m f182175a9;
                m f182175a10;
                m f182175a11;
                m f182175a12;
                m f182175a13;
                m f182175a14;
                m f182175a15;
                m f182175a16;
                m f182175a17;
                m f182175a18;
                m f182175a19;
                m f182175a20;
                m f182175a21;
                m f182175a22;
                m f182175a23;
                ie2.k uiSettings;
                m f182175a24;
                m f182175a25;
                if (dVar instanceof C2214a) {
                    c2214a = (C2214a) dVar;
                    int i14 = c2214a.f116339c;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2214a.f116339c = i14 - Integer.MIN_VALUE;
                    } else {
                        c2214a = new C2214a(this, dVar);
                    }
                } else {
                    c2214a = new C2214a(this, dVar);
                }
                Object obj = c2214a.f116337a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2214a.f116339c;
                n1 n1Var = this.f116334h;
                p1<m> p1Var = this.f116331e;
                if (i15 == 0) {
                    o13.r.b(obj);
                    boolean zG = p005kotlin.jvm.internal.s.g(cVar, n30.c.k.f123422a);
                    a1 a1Var = this.f116327a;
                    p1<Boolean> p1Var2 = this.f116330d;
                    if (zG) {
                        p1Var2.setValue(Boolean.FALSE);
                        mc mcVar = a1Var.f87409a;
                        c2214a.f116339c = 1;
                    } else if (p005kotlin.jvm.internal.s.g(cVar, n30.c.e.f123409a)) {
                        p1Var2.setValue(Boolean.FALSE);
                        mc mcVar2 = a1Var.f87409a;
                        c2214a.f116339c = 2;
                    } else if (p005kotlin.jvm.internal.s.g(cVar, n30.c.l.f123424a)) {
                        p1Var2.setValue(Boolean.TRUE);
                        mc mcVar3 = a1Var.f87409a;
                        c2214a.f116339c = 3;
                    } else if (cVar instanceof n30.c.d0) {
                        m f182175a26 = p1Var.getF182175a();
                        if (f182175a26 != null && f182175a26.isAdded()) {
                            n1Var.t(((n30.c.d0) cVar).f123408a);
                            m f182175a27 = p1Var.getF182175a();
                            if (f182175a27 != null) {
                                f182175a27.y6(n1Var.getIntValue());
                            }
                        }
                    } else if (cVar instanceof n30.c.h0) {
                        m f182175a28 = p1Var.getF182175a();
                        if (f182175a28 != null && f182175a28.isAdded() && (f182175a25 = p1Var.getF182175a()) != null) {
                            f182175a25.K6();
                        }
                    } else if (cVar instanceof n30.c.m) {
                        m f182175a29 = p1Var.getF182175a();
                        if (f182175a29 != null && f182175a29.isAdded() && (f182175a24 = p1Var.getF182175a()) != null) {
                            f182175a24.f7();
                        }
                    } else if (cVar instanceof n30.c.d) {
                        m f182175a30 = p1Var.getF182175a();
                        if (f182175a30 != null && f182175a30.isAdded() && (f182175a23 = p1Var.getF182175a()) != null) {
                            f182175a23.W0 = true;
                            qe2.h hVar = f182175a23.f148294e;
                            if (hVar != null) {
                                hVar.setMyLocationEnabled(true);
                            }
                            qe2.h hVar2 = f182175a23.f148294e;
                            if (hVar2 != null && (uiSettings = hVar2.f144584a.getUiSettings()) != null) {
                                uiSettings.a();
                            }
                            f182175a23.c8();
                        }
                    } else if (cVar instanceof n30.c.j0) {
                        m f182175a31 = p1Var.getF182175a();
                        if (f182175a31 != null && f182175a31.isAdded() && (f182175a22 = p1Var.getF182175a()) != null) {
                            f182175a22.H6(((n30.c.j0) cVar).f123421a);
                        }
                    } else if (cVar instanceof n30.c.v) {
                        m f182175a32 = p1Var.getF182175a();
                        if (f182175a32 != null && f182175a32.isAdded() && (f182175a21 = p1Var.getF182175a()) != null) {
                            f182175a21.B7();
                        }
                    } else if (cVar instanceof n30.c.s) {
                        m f182175a33 = p1Var.getF182175a();
                        if (f182175a33 != null && f182175a33.isAdded() && (f182175a20 = p1Var.getF182175a()) != null) {
                            f182175a20.o7(((n30.c.s) cVar).f123436a);
                        }
                    } else if (cVar instanceof n30.c.b0) {
                        m f182175a34 = p1Var.getF182175a();
                        if (f182175a34 != null && f182175a34.isAdded() && (f182175a19 = p1Var.getF182175a()) != null) {
                            f182175a19.J7(((n30.c.b0) cVar).f123403a);
                        }
                    } else if (cVar instanceof n30.c.n) {
                        m f182175a35 = p1Var.getF182175a();
                        if (f182175a35 != null && f182175a35.isAdded() && (f182175a18 = p1Var.getF182175a()) != null) {
                            f182175a18.g7(((n30.c.n) cVar).f123428a);
                        }
                    } else if (cVar instanceof n30.c.w) {
                        m f182175a36 = p1Var.getF182175a();
                        if (f182175a36 != null && f182175a36.isAdded() && (f182175a17 = p1Var.getF182175a()) != null) {
                            f182175a17.D7(((n30.c.w) cVar).f123440a);
                        }
                    } else if (cVar instanceof n30.c.e0) {
                        m f182175a37 = p1Var.getF182175a();
                        if (f182175a37 != null && f182175a37.isAdded() && (f182175a16 = p1Var.getF182175a()) != null) {
                            f182175a16.z6(((n30.c.e0) cVar).f123410a);
                        }
                    } else if (cVar instanceof n30.c.u) {
                        m f182175a38 = p1Var.getF182175a();
                        if (f182175a38 != null && f182175a38.isAdded() && (f182175a15 = p1Var.getF182175a()) != null) {
                            f182175a15.z7();
                        }
                    } else if (cVar instanceof n30.c.t) {
                        m f182175a39 = p1Var.getF182175a();
                        if (f182175a39 != null && f182175a39.isAdded() && (f182175a14 = p1Var.getF182175a()) != null) {
                            f182175a14.p7(((n30.c.t) cVar).f123437a);
                        }
                    } else if (cVar instanceof n30.c.c0) {
                        m f182175a40 = p1Var.getF182175a();
                        if (f182175a40 != null && f182175a40.isAdded() && (f182175a13 = p1Var.getF182175a()) != null) {
                            f182175a13.K7(((n30.c.c0) cVar).f123406a);
                        }
                    } else if (cVar instanceof n30.c.p) {
                        m f182175a41 = p1Var.getF182175a();
                        if (f182175a41 != null && f182175a41.isAdded() && (f182175a12 = p1Var.getF182175a()) != null) {
                            f182175a12.i7(((n30.c.p) cVar).f123432a);
                        }
                    } else if (cVar instanceof n30.c.y) {
                        m f182175a42 = p1Var.getF182175a();
                        if (f182175a42 != null && f182175a42.isAdded() && (f182175a11 = p1Var.getF182175a()) != null) {
                            f182175a11.F7(((n30.c.y) cVar).f123442a);
                        }
                    } else if (cVar instanceof n30.c.o) {
                        m f182175a43 = p1Var.getF182175a();
                        if (f182175a43 != null && f182175a43.isAdded() && (f182175a10 = p1Var.getF182175a()) != null) {
                            f182175a10.h7(((n30.c.o) cVar).f123430a);
                        }
                    } else if (cVar instanceof n30.c.x) {
                        m f182175a44 = p1Var.getF182175a();
                        if (f182175a44 != null && f182175a44.isAdded() && (f182175a9 = p1Var.getF182175a()) != null) {
                            f182175a9.E7(((n30.c.x) cVar).f123441a);
                        }
                    } else if (cVar instanceof n30.c.g0) {
                        m f182175a45 = p1Var.getF182175a();
                        if (f182175a45 != null && f182175a45.isAdded() && (f182175a8 = p1Var.getF182175a()) != null) {
                            f182175a8.F6(((n30.c.g0) cVar).f123414a);
                        }
                    } else if (cVar instanceof n30.c.r) {
                        m f182175a46 = p1Var.getF182175a();
                        if (f182175a46 != null && f182175a46.isAdded() && (f182175a7 = p1Var.getF182175a()) != null) {
                            f182175a7.n7(((n30.c.r) cVar).f123435a);
                        }
                    } else if (cVar instanceof n30.c.a0) {
                        m f182175a47 = p1Var.getF182175a();
                        if (f182175a47 != null && f182175a47.isAdded() && (f182175a6 = p1Var.getF182175a()) != null) {
                            f182175a6.H7(((n30.c.a0) cVar).f123397a);
                        }
                    } else if (cVar instanceof n30.c.q) {
                        m f182175a48 = p1Var.getF182175a();
                        if (f182175a48 != null && f182175a48.isAdded()) {
                            m f182175a49 = p1Var.getF182175a();
                            if (f182175a49 != null) {
                                f182175a49.j7(((n30.c.q) cVar).f123434a, 1.0f);
                            }
                            com.garmin.android.apps.connectmobile.courses.model.g gVar = ((n30.c.q) cVar).f123434a;
                            Double d14 = gVar.lat;
                            Double d15 = gVar.lon;
                            if (zf.b.D(d14) && zf.b.D(d15)) {
                                m f182175a50 = p1Var.getF182175a();
                                if (f182175a50 != null) {
                                    f182175a50.f8(new LatLng(d14.doubleValue(), d15.doubleValue()));
                                }
                                m f182175a51 = p1Var.getF182175a();
                                if (f182175a51 != null) {
                                    f182175a51.m2();
                                }
                            }
                        }
                    } else if (cVar instanceof n30.c.z) {
                        m f182175a52 = p1Var.getF182175a();
                        if (f182175a52 != null && f182175a52.isAdded() && (f182175a5 = p1Var.getF182175a()) != null) {
                            f182175a5.G7(((n30.c.z) cVar).f123443a);
                        }
                    } else if (cVar instanceof n30.c.n0) {
                        m f182175a53 = p1Var.getF182175a();
                        if (f182175a53 != null && f182175a53.isAdded() && (f182175a4 = p1Var.getF182175a()) != null) {
                            f182175a4.X7(((n30.c.n0) cVar).f123429a);
                        }
                    } else {
                        boolean z14 = cVar instanceof n30.c.j;
                        Context context = this.f116328b;
                        p1<Boolean> p1Var3 = this.f116336j;
                        p1<Drawable> p1Var4 = this.f116335i;
                        if (z14) {
                            m f182175a54 = p1Var.getF182175a();
                            if (f182175a54 != null && f182175a54.isAdded()) {
                                com.garmin.android.apps.connectmobile.courses.model.f.a aVar2 = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
                                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = ((n30.c.j) cVar).f123420a;
                                String coursePointType = gVar2.getCoursePointType();
                                aVar2.getClass();
                                p1Var4.setValue(new u40.h(context, com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType)));
                                p1Var3.setValue(Boolean.TRUE);
                                m f182175a55 = p1Var.getF182175a();
                                if (f182175a55 != null) {
                                    f182175a55.j7(gVar2, 0.5f);
                                }
                                Double d16 = gVar2.lat;
                                Double d17 = gVar2.lon;
                                if (zf.b.D(d16) && zf.b.D(d17)) {
                                    m f182175a56 = p1Var.getF182175a();
                                    if (f182175a56 != null) {
                                        f182175a56.f8(new LatLng(d16.doubleValue(), d17.doubleValue()));
                                    }
                                    m f182175a57 = p1Var.getF182175a();
                                    if (f182175a57 != null) {
                                        f182175a57.m2();
                                    }
                                }
                            }
                        } else {
                            if (cVar instanceof n30.c.i) {
                                p1Var4.setValue(null);
                                p1Var3.setValue(Boolean.FALSE);
                            } else {
                                boolean z15 = cVar instanceof n30.c.f;
                                e23.l<n30.a, Unit> lVar = this.f116329c;
                                if (z15) {
                                    m f182175a58 = p1Var.getF182175a();
                                    if (f182175a58 != null && f182175a58.isAdded()) {
                                        m f182175a59 = p1Var.getF182175a();
                                        fVarT6 = f182175a59 != null ? f182175a59.T6() : null;
                                        if (fVarT6 != null) {
                                            com.garmin.android.apps.connectmobile.courses.model.g gVar3 = ((n30.c.f) cVar).f123411a;
                                            LatLng latLng = fVarT6.f50283a;
                                            lVar.invoke(new n30.a.j(gVar3, new GeoPointDTO(latLng.latitude, latLng.longitude)));
                                        }
                                    }
                                } else if (cVar instanceof n30.c.h) {
                                    p1Var4.setValue(new u40.h(context, ((n30.c.h) cVar).f123415a));
                                    p1Var3.setValue(Boolean.TRUE);
                                } else if (cVar instanceof n30.c.b) {
                                    m f182175a60 = p1Var.getF182175a();
                                    if (f182175a60 != null && f182175a60.isAdded() && (f182175a3 = p1Var.getF182175a()) != null) {
                                        n30.c.b bVar = (n30.c.b) cVar;
                                        j40.c.E6(f182175a3, bVar.f123398a, bVar.f123399b, bVar.f123400c, bVar.f123401d, bVar.f123402e);
                                    }
                                } else if (cVar instanceof n30.c.g) {
                                    m f182175a61 = p1Var.getF182175a();
                                    if (f182175a61 != null && f182175a61.isAdded()) {
                                        m f182175a62 = p1Var.getF182175a();
                                        fVarT6 = f182175a62 != null ? f182175a62.T6() : null;
                                        if (fVarT6 != null) {
                                            lVar.invoke(new n30.a.k(((n30.c.g) cVar).f123413a, fVarT6));
                                        }
                                    }
                                } else if (cVar instanceof n30.c.p0) {
                                    m f182175a63 = p1Var.getF182175a();
                                    if (f182175a63 != null && f182175a63.isAdded()) {
                                        m f182175a64 = p1Var.getF182175a();
                                        if (f182175a64 != null) {
                                            f182175a64.K0 = ((n30.c.p0) cVar).f123433a;
                                        }
                                        m f182175a65 = p1Var.getF182175a();
                                        if (f182175a65 != null) {
                                            f182175a65.L0 = ((n30.c.p0) cVar).f123433a;
                                        }
                                    }
                                } else if ((cVar instanceof n30.c.a) && (f182175a = p1Var.getF182175a()) != null && f182175a.isAdded() && (f182175a2 = p1Var.getF182175a()) != null) {
                                    n30.c.a aVar3 = (n30.c.a) cVar;
                                    f182175a2.A6(aVar3.f123392a, aVar3.f123393b, aVar3.f123394c, aVar3.f123395d, aVar3.f123396e, null);
                                }
                            }
                        }
                    }
                    return aVar;
                }
                if (i15 == 1) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i15 != 2) {
                    if (i15 == 3) {
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                m f182175a66 = p1Var.getF182175a();
                if (f182175a66 != null && f182175a66.isAdded()) {
                    n1Var.t(this.f116333g.getIntValue() + this.f116332f.getIntValue());
                    m f182175a67 = p1Var.getF182175a();
                    if (f182175a67 != null) {
                        f182175a67.y6(n1Var.getIntValue());
                    }
                    m f182175a68 = p1Var.getF182175a();
                    if (f182175a68 != null) {
                        f182175a68.m2();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(d2<? extends n30.c> d2Var, a1 a1Var, Context context, e23.l<? super n30.a, Unit> lVar, p1<Boolean> p1Var, p1<m> p1Var2, n1 n1Var, n1 n1Var2, n1 n1Var3, p1<Drawable> p1Var3, p1<Boolean> p1Var4, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f116316b = d2Var;
            this.f116317c = a1Var;
            this.f116318d = context;
            this.f116319e = lVar;
            this.f116320f = p1Var;
            this.f116321g = p1Var2;
            this.f116322h = n1Var;
            this.f116323i = n1Var2;
            this.f116324j = n1Var3;
            this.f116325k = p1Var3;
            this.f116326l = p1Var4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f116316b, this.f116317c, this.f116318d, this.f116319e, this.f116320f, this.f116321g, this.f116322h, this.f116323i, this.f116324j, this.f116325k, this.f116326l, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f116315a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(this.f116317c, this.f116318d, this.f116319e, this.f116320f, this.f116321g, this.f116322h, this.f116323i, this.f116324j, this.f116325k, this.f116326l);
                this.f116315a = 1;
                if (this.f116316b.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n30.f fVar, d2<? extends n30.c> d2Var, e23.l<? super n30.a, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        float fX;
        fVar.getClass();
        d2Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-555116736);
        int i15 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(d2Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            a1 a1VarD = z0.d(null, null, o0VarE, 0, 3);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(0, o0VarE);
            }
            n1 n1Var2 = (n1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = e5.o(0, o0VarE);
            }
            n1 n1Var3 = (n1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(null);
                o0VarE.K(objQ5);
            }
            p1 p1Var2 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ6);
            }
            p1 p1Var3 = (p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p0.n(null);
                o0VarE.K(objQ7);
            }
            p1 p1Var4 = (p1) objQ7;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-891211230);
                o0VarE.g0(false);
                fX = 0;
                g6.f.a aVar = g6.f.f75994b;
            } else {
                o0VarE.C(-891209880);
                fX = w02.b0.x(o0VarE, n1Var2.getIntValue() + n1Var.getIntValue());
                o0VarE.g0(false);
            }
            float f14 = ((g6.f) s1.f.a(fX, null, "AutomaticCourseSheetPeekHeight", o0VarE, 384, 10).getF182175a()).f75997a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar = j92.b.f97900c;
            float f15 = dVar.f97912d;
            bVar.getClass();
            k2.h hVarC = k2.i.c(f15, dVar.f97912d, 0.0f, 0.0f, 12);
            long jF = e0.f(o0VarE);
            d0.f128823b.getClass();
            z0.a(z3.f.c(1429674321, new fb0.b((Object) fVar, (e23.l) lVar, (Object) n1Var, (Object) n1Var2, 26), o0VarE), null, a1VarD, f14, 0.0f, hVarC, jF, d0.f128831j, 0.0f, 0.0f, null, false, null, 0L, 0L, z3.f.c(-1631598533, new a11.l(fVar, lVar, a1VarD, p1Var2, p1Var3, p1Var4, n1Var3, p1Var, n1Var, n1Var2, 4), o0VarE), o0VarE, 12582918, 1572870, 64274);
            o0Var = o0VarE;
            n30.h hVar = fVar.f123459g;
            int i16 = i15 & 896;
            boolean zR = o0Var.r(fVar) | (i16 == 256);
            Object objQ8 = o0Var.q();
            if (zR || objQ8 == c2565a) {
                objQ8 = new a(fVar, lVar, null);
                o0Var.K(objQ8);
            }
            l0.e((e23.p) objQ8, hVar, o0Var);
            m mVar2 = (m) p1Var2.getF182175a();
            Integer numValueOf = Integer.valueOf(n1Var.getIntValue());
            Integer numValueOf2 = Integer.valueOf(r4.getIntValue());
            Object objQ9 = o0Var.q();
            if (objQ9 == c2565a) {
                objQ9 = new b(p1Var2, n1Var, n1Var2, n1Var3, null);
                o0Var.K(objQ9);
            }
            l0.g(mVar2, numValueOf, numValueOf2, (e23.p) objQ9, o0Var);
            m mVar3 = (m) p1Var2.getF182175a();
            Boolean bool = (Boolean) p1Var3.getF182175a();
            bool.booleanValue();
            Object objQ10 = o0Var.q();
            if (objQ10 == c2565a) {
                objQ10 = new C2213c(p1Var2, p1Var3, null);
                o0Var.K(objQ10);
            }
            l0.f(mVar3, bool, (e23.p) objQ10, o0Var);
            m mVar4 = (m) p1Var2.getF182175a();
            w20.a aVar2 = fVar.f123456d;
            Boolean boolValueOf = Boolean.valueOf(fVar.f123461i);
            boolean zR2 = o0Var.r(fVar);
            Object objQ11 = o0Var.q();
            if (zR2 || objQ11 == c2565a) {
                objQ11 = new d(fVar, p1Var2, null);
                o0Var.K(objQ11);
            }
            l0.g(mVar4, aVar2, boolValueOf, (e23.p) objQ11, o0Var);
            Unit unit = Unit.INSTANCE;
            boolean zR3 = o0Var.r(d2Var) | o0Var.B(a1VarD) | o0Var.r(context) | (i16 == 256);
            Object objQ12 = o0Var.q();
            if (zR3 || objQ12 == c2565a) {
                e eVar = new e(d2Var, a1VarD, context, lVar, p1Var, p1Var2, n1Var, r4, n1Var3, p1Var4, p1Var3, null);
                o0Var.K(eVar);
                objQ12 = eVar;
            }
            l0.e((e23.p) objQ12, unit, o0Var);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) fVar, (Object) d2Var, (Object) lVar, i14, 10);
        }
    }
}
