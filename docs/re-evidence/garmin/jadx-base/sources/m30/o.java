package m30;

import c22.r2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
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
import p13.h0;
import p13.j0;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import r53.d2;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.MultipleCoursesBottomSheetKt$MultipleCoursesBottomSheet$3$1", f = "MultipleCoursesBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n30.l f116374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<n30.i, Unit> f116375b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(n30.l lVar, e23.l<? super n30.i, Unit> lVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f116374a = lVar;
            this.f116375b = lVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f116374a, this.f116375b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            n30.h hVar = this.f116374a.f123529e;
            hVar.getClass();
            if (hVar.f123470a && hVar.f123471b) {
                this.f116375b.invoke(n30.i.g.f123480a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.MultipleCoursesBottomSheetKt$MultipleCoursesBottomSheet$4$1", f = "MultipleCoursesBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<m> f116376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f116377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n1 f116378c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<m> p1Var, n1 n1Var, n1 n1Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f116376a = p1Var;
            this.f116377b = n1Var;
            this.f116378c = n1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f116376a, this.f116377b, this.f116378c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1<m> p1Var = this.f116376a;
            m f182175a = p1Var.getF182175a();
            if (f182175a != null && f182175a.isAdded()) {
                m f182175a2 = p1Var.getF182175a();
                if (f182175a2 != null) {
                    f182175a2.y6(this.f116378c.getIntValue() + this.f116377b.getIntValue());
                }
                m f182175a3 = p1Var.getF182175a();
                if (f182175a3 != null) {
                    f182175a3.c8();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.MultipleCoursesBottomSheetKt$MultipleCoursesBottomSheet$5$1", f = "MultipleCoursesBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n30.l f116379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<m> f116380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<n30.i, Unit> f116381c;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"m30/o$c$a", "", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.l<n30.i, Unit> f116382a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(e23.l<? super n30.i, Unit> lVar) {
                this.f116382a = lVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(n30.l lVar, p1<m> p1Var, e23.l<? super n30.i, Unit> lVar2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f116379a = lVar;
            this.f116380b = p1Var;
            this.f116381c = lVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f116379a, this.f116380b, this.f116381c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:131:0x02da  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            k40.d dVar;
            ArrayList arrayListN;
            ArrayList arrayListQ;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1<m> p1Var = this.f116380b;
            m f182175a = p1Var.getF182175a();
            if (f182175a != null && f182175a.isAdded()) {
                m f182175a2 = p1Var.getF182175a();
                if (f182175a2 != null) {
                    f182175a2.f116359a1 = new a(this.f116381c);
                }
                n30.l lVar = this.f116379a;
                List<w20.a> listB = lVar.b();
                if (listB == null || listB.isEmpty()) {
                    m f182175a3 = p1Var.getF182175a();
                    if (f182175a3 != null) {
                        f182175a3.I6();
                        s30.c cVar = f182175a3.R0;
                        if (cVar != null) {
                            j0 j0Var = j0.f134944a;
                            j0Var.getClass();
                            cVar.f156417f = j0Var;
                            cVar.f156418g = cVar.a();
                            cVar.f156421j = Integer.MIN_VALUE;
                            cVar.c();
                        }
                        f182175a3.U0 = j0.f134944a;
                        f182175a3.J0.clear();
                        f182175a3.X6().setRecenterMapClickListener(null);
                    }
                } else {
                    m f182175a4 = p1Var.getF182175a();
                    List<com.garmin.android.library.mapsdkadapter.l> listD = f182175a4 != null ? f182175a4.f97009l.d(false) : null;
                    if (listD == null) {
                        listD = j0.f134944a;
                    }
                    List<com.garmin.android.library.mapsdkadapter.l> list = listD;
                    m f182175a5 = p1Var.getF182175a();
                    List<com.garmin.android.library.mapsdkadapter.l> listE = f182175a5 != null ? f182175a5.f97009l.e() : null;
                    if (listE == null) {
                        listE = j0.f134944a;
                    }
                    List<com.garmin.android.library.mapsdkadapter.l> list2 = listE;
                    m f182175a6 = p1Var.getF182175a();
                    List<qe2.a> listA = f182175a6 != null ? f182175a6.f97009l.a(false) : null;
                    if (listA == null) {
                        listA = j0.f134944a;
                    }
                    List<qe2.a> list3 = listA;
                    m f182175a7 = p1Var.getF182175a();
                    List<qe2.a> listB2 = f182175a7 != null ? f182175a7.f97010m.b() : null;
                    if (listB2 == null) {
                        listB2 = j0.f134944a;
                    }
                    m f182175a8 = p1Var.getF182175a();
                    List<ie2.j> listA2 = f182175a8 != null ? f182175a8.f97007k.a() : null;
                    if (listA2 == null) {
                        listA2 = j0.f134944a;
                    }
                    List<ie2.j> list4 = listA2;
                    m f182175a9 = p1Var.getF182175a();
                    if (f182175a9 == null) {
                        list3 = list3;
                        list4 = list4;
                    } else {
                        n30.k kVar = (n30.k) h0.n0(lVar.f123528d);
                        int i14 = kVar != null ? kVar.f123523b : 0;
                        k40.d dVar2 = f182175a9.f97011n;
                        ArrayList arrayList = f182175a9.J0;
                        k40.e eVar = f182175a9.f97005i;
                        qe2.h hVar = f182175a9.f148294e;
                        if (hVar == null || listB.isEmpty()) {
                            list3 = list3;
                            list4 = list4;
                        } else {
                            Integer numValueOf = Integer.valueOf(i14);
                            if (i14 < 0 || i14 >= listB.size()) {
                                numValueOf = null;
                            }
                            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                            w20.a aVar2 = listB.get(iIntValue);
                            f182175a9.M6();
                            f182175a9.I6();
                            arrayList.clear();
                            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = aVar2.f181476a;
                            com.garmin.android.library.mapsdkadapter.i.b bVarY = eVar2.y();
                            if (bVarY != null) {
                                f182175a9.K0 = bVarY;
                            }
                            com.garmin.android.library.mapsdkadapter.i.b bVarH = eVar2.h();
                            f182175a9.L0 = bVarH;
                            int i15 = 2;
                            int size = listB.size() * 2;
                            com.garmin.android.library.mapsdkadapter.e.a aVar3 = new com.garmin.android.library.mapsdkadapter.e.a();
                            List<GeoPointDTO> list5 = eVar2.geoPoints;
                            if (list5 == null || list5.isEmpty()) {
                                dVar = dVar2;
                            } else {
                                com.garmin.android.library.mapsdkadapter.q qVarA = eVar.a();
                                ie2.p pVar = qVarA.f50328a;
                                dVar = dVar2;
                                pVar.f93158f = size;
                                pVar.f93155c = 13.0f;
                                pVar.f93159g = true;
                                pVar.f93164l = Integer.valueOf(iIntValue);
                                com.garmin.android.library.mapsdkadapter.q qVarA2 = eVar.a();
                                ie2.p pVar2 = qVarA2.f50328a;
                                pVar2.f93156d = a7.b.getColor(f182175a9.requireContext(), R.color.gcm_system_static_black);
                                pVar2.f93155c = 17.0f;
                                pVar2.f93159g = false;
                                pVar2.f93158f = size - 1;
                                Iterator<GeoPointDTO> it = list5.iterator();
                                while (it.hasNext()) {
                                    GeoPointDTO next = it.next();
                                    dVar.getClass();
                                    com.garmin.android.library.mapsdkadapter.f fVarB = k40.d.b(next, bVarH);
                                    if (fVarB != null) {
                                        pVar.f93153a.add(fVarB);
                                        pVar2.f93153a.add(fVarB);
                                        arrayList.add(fVarB);
                                        aVar3.b(fVarB);
                                        it = it;
                                    }
                                }
                                hVar.h(qVarA2);
                                hVar.h(qVarA);
                                j40.c.Q7(f182175a9, arrayList);
                            }
                            GeoPointDTO geoPointDTOD = eVar2.D();
                            if (geoPointDTOD != null) {
                                dVar.getClass();
                                f182175a9.b8(k40.d.b(geoPointDTOD, bVarH));
                            }
                            f182175a9.L7(eVar2, hVar);
                            boolean zG = eVar2.G();
                            f182175a9.P = zG;
                            f182175a9.T7(!zG && f182175a9.V6().f109894b);
                            f182175a9.C6(eVar2.j(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y());
                            List<ClimbDTO> list6 = aVar2.f181477b;
                            if (list6 != null) {
                                if (list6.isEmpty()) {
                                    list6 = null;
                                }
                                if (list6 != null) {
                                    f182175a9.P7(list6);
                                }
                            }
                            k30.x xVar = aVar2.f181479d;
                            if (xVar != null && (arrayListQ = f0.q(xVar, eVar2)) != null && !arrayListQ.isEmpty()) {
                                f182175a9.U7(arrayListQ);
                            }
                            k30.t tVar = aVar2.f181480e;
                            if (tVar != null && (arrayListN = lg.d.n(tVar, eVar2)) != null && !arrayListN.isEmpty()) {
                                f182175a9.R7(arrayListN);
                            }
                            int size2 = listB.size();
                            float f14 = 0.0f;
                            int i16 = 0;
                            while (i16 < size2) {
                                if (i16 != iIntValue) {
                                    List<GeoPointDTO> list7 = listB.get(i16).f181476a.geoPoints;
                                    if (list7 != null && !list7.isEmpty()) {
                                        com.garmin.android.library.mapsdkadapter.q qVarA3 = eVar.a();
                                        ie2.p pVar3 = qVarA3.f50328a;
                                        pVar3.f93156d = a7.b.getColor(f182175a9.requireContext(), R.color.gds_data_viz_blue_secondary);
                                        pVar3.f93155c = 13.0f;
                                        pVar3.f93158f = f14;
                                        pVar3.f93159g = true;
                                        pVar3.f93164l = Integer.valueOf(i16);
                                        com.garmin.android.library.mapsdkadapter.q qVarA4 = eVar.a();
                                        ie2.p pVar4 = qVarA4.f50328a;
                                        pVar4.f93156d = a7.b.getColor(f182175a9.requireContext(), R.color.gcm_system_static_black);
                                        pVar4.f93155c = 17.0f;
                                        pVar4.f93159g = false;
                                        pVar4.f93158f = f14 - 1;
                                        for (GeoPointDTO geoPointDTO : list7) {
                                            dVar.getClass();
                                            com.garmin.android.library.mapsdkadapter.f fVarB2 = k40.d.b(geoPointDTO, bVarH);
                                            if (fVarB2 != null) {
                                                pVar3.f93153a.add(fVarB2);
                                                pVar4.f93153a.add(fVarB2);
                                                aVar3.b(fVarB2);
                                            }
                                        }
                                        hVar.h(qVarA4);
                                        hVar.h(qVarA3);
                                    }
                                    f14 += 2.0f;
                                } else {
                                    size2 = size2;
                                }
                                i16++;
                                size2 = size2;
                            }
                            com.garmin.android.library.mapsdkadapter.e eVarA = aVar3.a();
                            f182175a9.f97019x = eVarA;
                            f182175a9.W0 = false;
                            f182175a9.u6(eVarA, f182175a9.f148290a);
                            f182175a9.X6().setRecenterMapClickListener(new r2(0, new l(f182175a9, i15), 1, null));
                        }
                    }
                    m f182175a10 = p1Var.getF182175a();
                    if (f182175a10 != null) {
                        j0 j0Var2 = j0.f134944a;
                        f182175a10.v7(list, list2, list3, j0Var2, j0Var2);
                    }
                    m f182175a11 = p1Var.getF182175a();
                    if (f182175a11 != null) {
                        f182175a11.w7(listB2);
                    }
                    m f182175a12 = p1Var.getF182175a();
                    if (f182175a12 != null) {
                        f182175a12.x7(list4);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.MultipleCoursesBottomSheetKt$MultipleCoursesBottomSheet$6$1", f = "MultipleCoursesBottomSheet.kt", l = {169}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2<n30.j> f116384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a1 f116385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f116386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<m> f116387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n1 f116388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ n1 f116389g;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a1 f116390a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f116391b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p1<m> f116392c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ n1 f116393d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ n1 f116394e;

            /* JADX INFO: renamed from: m30.o$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.components.MultipleCoursesBottomSheetKt$MultipleCoursesBottomSheet$6$1$1", f = "MultipleCoursesBottomSheet.kt", l = {173, SyslogConstants.LOG_LOCAL7}, m = "emit", v = 2)
            public static final class C2215a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f116395a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f116396b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f116397c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2215a(a<? super T> aVar, t13.d<? super C2215a> dVar) {
                    super(dVar);
                    this.f116396b = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f116395a = obj;
                    this.f116397c |= Integer.MIN_VALUE;
                    return this.f116396b.emit(null, this);
                }
            }

            public a(a1 a1Var, p1<Boolean> p1Var, p1<m> p1Var2, n1 n1Var, n1 n1Var2) {
                this.f116390a = a1Var;
                this.f116391b = p1Var;
                this.f116392c = p1Var2;
                this.f116393d = n1Var;
                this.f116394e = n1Var2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
            
                if (r8.f(r0) == r1) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
            
                if (r8.f(r0) == r1) goto L35;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(n30.j jVar, t13.d<? super Unit> dVar) {
                C2215a c2215a;
                m f182175a;
                m f182175a2;
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
                ie2.k uiSettings;
                m f182175a20;
                m f182175a21;
                m f182175a22;
                if (dVar instanceof C2215a) {
                    c2215a = (C2215a) dVar;
                    int i14 = c2215a.f116397c;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2215a.f116397c = i14 - Integer.MIN_VALUE;
                    } else {
                        c2215a = new C2215a(this, dVar);
                    }
                } else {
                    c2215a = new C2215a(this, dVar);
                }
                Object obj = c2215a.f116395a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2215a.f116397c;
                p1<m> p1Var = this.f116392c;
                if (i15 == 0) {
                    o13.r.b(obj);
                    boolean zG = p005kotlin.jvm.internal.s.g(jVar, n30.j.b.f123497a);
                    a1 a1Var = this.f116390a;
                    p1<Boolean> p1Var2 = this.f116391b;
                    if (zG) {
                        p1Var2.setValue(Boolean.FALSE);
                        mc mcVar = a1Var.f87409a;
                        c2215a.f116397c = 1;
                    } else if (p005kotlin.jvm.internal.s.g(jVar, n30.j.d.f123499a)) {
                        p1Var2.setValue(Boolean.TRUE);
                        mc mcVar2 = a1Var.f87409a;
                        c2215a.f116397c = 2;
                    } else if (jVar instanceof n30.j.t) {
                        m f182175a23 = p1Var.getF182175a();
                        if (f182175a23 != null && f182175a23.isAdded() && (f182175a22 = p1Var.getF182175a()) != null) {
                            f182175a22.y6(((n30.j.t) jVar).f123515a);
                        }
                    } else if (jVar instanceof n30.j.w) {
                        m f182175a24 = p1Var.getF182175a();
                        if (f182175a24 != null && f182175a24.isAdded() && (f182175a21 = p1Var.getF182175a()) != null) {
                            f182175a21.K6();
                        }
                    } else if (jVar instanceof n30.j.c) {
                        m f182175a25 = p1Var.getF182175a();
                        if (f182175a25 != null && f182175a25.isAdded() && (f182175a20 = p1Var.getF182175a()) != null) {
                            f182175a20.f7();
                        }
                    } else if (p005kotlin.jvm.internal.s.g(jVar, n30.j.a.f123496a)) {
                        m f182175a26 = p1Var.getF182175a();
                        if (f182175a26 != null && f182175a26.isAdded() && (f182175a19 = p1Var.getF182175a()) != null) {
                            f182175a19.W0 = true;
                            qe2.h hVar = f182175a19.f148294e;
                            if (hVar != null) {
                                hVar.setMyLocationEnabled(true);
                            }
                            qe2.h hVar2 = f182175a19.f148294e;
                            if (hVar2 != null && (uiSettings = hVar2.f144584a.getUiSettings()) != null) {
                                uiSettings.a();
                            }
                            f182175a19.c8();
                        }
                    } else if (jVar instanceof n30.j.x) {
                        m f182175a27 = p1Var.getF182175a();
                        if (f182175a27 != null && f182175a27.isAdded() && (f182175a18 = p1Var.getF182175a()) != null) {
                            f182175a18.H6(((n30.j.x) jVar).f123519a);
                        }
                    } else if (jVar instanceof n30.j.m) {
                        m f182175a28 = p1Var.getF182175a();
                        if (f182175a28 != null && f182175a28.isAdded() && (f182175a17 = p1Var.getF182175a()) != null) {
                            f182175a17.B7();
                        }
                    } else if (jVar instanceof n30.j.i) {
                        m f182175a29 = p1Var.getF182175a();
                        if (f182175a29 != null && f182175a29.isAdded() && (f182175a16 = p1Var.getF182175a()) != null) {
                            f182175a16.o7(((n30.j.i) jVar).f123504a);
                        }
                    } else if (jVar instanceof n30.j.r) {
                        m f182175a30 = p1Var.getF182175a();
                        if (f182175a30 != null && f182175a30.isAdded() && (f182175a15 = p1Var.getF182175a()) != null) {
                            f182175a15.J7(((n30.j.r) jVar).f123513a);
                        }
                    } else if (jVar instanceof n30.j.e) {
                        m f182175a31 = p1Var.getF182175a();
                        if (f182175a31 != null && f182175a31.isAdded() && (f182175a14 = p1Var.getF182175a()) != null) {
                            f182175a14.g7(((n30.j.e) jVar).f123500a);
                        }
                    } else if (jVar instanceof n30.j.n) {
                        m f182175a32 = p1Var.getF182175a();
                        if (f182175a32 != null && f182175a32.isAdded() && (f182175a13 = p1Var.getF182175a()) != null) {
                            f182175a13.D7(((n30.j.n) jVar).f123509a);
                        }
                    } else if (jVar instanceof n30.j.u) {
                        m f182175a33 = p1Var.getF182175a();
                        if (f182175a33 != null && f182175a33.isAdded() && (f182175a12 = p1Var.getF182175a()) != null) {
                            f182175a12.z6(((n30.j.u) jVar).f123516a);
                        }
                    } else if (jVar instanceof n30.j.l) {
                        m f182175a34 = p1Var.getF182175a();
                        if (f182175a34 != null && f182175a34.isAdded() && (f182175a11 = p1Var.getF182175a()) != null) {
                            f182175a11.z7();
                        }
                    } else if (jVar instanceof n30.j.C2317j) {
                        m f182175a35 = p1Var.getF182175a();
                        if (f182175a35 != null && f182175a35.isAdded() && (f182175a10 = p1Var.getF182175a()) != null) {
                            f182175a10.p7(((n30.j.C2317j) jVar).f123505a);
                        }
                    } else if (jVar instanceof n30.j.s) {
                        m f182175a36 = p1Var.getF182175a();
                        if (f182175a36 != null && f182175a36.isAdded() && (f182175a9 = p1Var.getF182175a()) != null) {
                            f182175a9.K7(((n30.j.s) jVar).f123514a);
                        }
                    } else if (jVar instanceof n30.j.g) {
                        m f182175a37 = p1Var.getF182175a();
                        if (f182175a37 != null && f182175a37.isAdded() && (f182175a8 = p1Var.getF182175a()) != null) {
                            f182175a8.i7(((n30.j.g) jVar).f123502a);
                        }
                    } else if (jVar instanceof n30.j.p) {
                        m f182175a38 = p1Var.getF182175a();
                        if (f182175a38 != null && f182175a38.isAdded() && (f182175a7 = p1Var.getF182175a()) != null) {
                            f182175a7.F7(((n30.j.p) jVar).f123511a);
                        }
                    } else if (jVar instanceof n30.j.f) {
                        m f182175a39 = p1Var.getF182175a();
                        if (f182175a39 != null && f182175a39.isAdded() && (f182175a6 = p1Var.getF182175a()) != null) {
                            f182175a6.h7(((n30.j.f) jVar).f123501a);
                        }
                    } else if (jVar instanceof n30.j.o) {
                        m f182175a40 = p1Var.getF182175a();
                        if (f182175a40 != null && f182175a40.isAdded() && (f182175a5 = p1Var.getF182175a()) != null) {
                            f182175a5.E7(((n30.j.o) jVar).f123510a);
                        }
                    } else if (jVar instanceof n30.j.v) {
                        m f182175a41 = p1Var.getF182175a();
                        if (f182175a41 != null && f182175a41.isAdded() && (f182175a4 = p1Var.getF182175a()) != null) {
                            f182175a4.F6(((n30.j.v) jVar).f123517a);
                        }
                    } else if (jVar instanceof n30.j.h) {
                        m f182175a42 = p1Var.getF182175a();
                        if (f182175a42 != null && f182175a42.isAdded() && (f182175a3 = p1Var.getF182175a()) != null) {
                            f182175a3.n7(((n30.j.h) jVar).f123503a);
                        }
                    } else if ((jVar instanceof n30.j.q) && (f182175a = p1Var.getF182175a()) != null && f182175a.isAdded() && (f182175a2 = p1Var.getF182175a()) != null) {
                        f182175a2.H7(((n30.j.q) jVar).f123512a);
                    }
                    return aVar;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                m f182175a43 = p1Var.getF182175a();
                if (f182175a43 != null && f182175a43.isAdded()) {
                    m f182175a44 = p1Var.getF182175a();
                    if (f182175a44 != null) {
                        f182175a44.y6(this.f116394e.getIntValue() + this.f116393d.getIntValue());
                    }
                    m f182175a45 = p1Var.getF182175a();
                    if (f182175a45 != null) {
                        f182175a45.m2();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(d2<? extends n30.j> d2Var, a1 a1Var, p1<Boolean> p1Var, p1<m> p1Var2, n1 n1Var, n1 n1Var2, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f116384b = d2Var;
            this.f116385c = a1Var;
            this.f116386d = p1Var;
            this.f116387e = p1Var2;
            this.f116388f = n1Var;
            this.f116389g = n1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f116384b, this.f116385c, this.f116386d, this.f116387e, this.f116388f, this.f116389g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f116383a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(this.f116385c, this.f116386d, this.f116387e, this.f116388f, this.f116389g);
                this.f116383a = 1;
                if (this.f116384b.collect(aVar2, this) == aVar) {
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
    public static final void a(n30.l lVar, d2<? extends n30.j> d2Var, e23.l<? super n30.i, Unit> lVar2, p3.m mVar, int i14) {
        n30.l lVar3;
        o0 o0Var;
        float fX;
        t13.d dVar;
        lVar.getClass();
        d2Var.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1257318430);
        int i15 = i14 | (o0VarE.r(lVar) ? 4 : 2) | (o0VarE.r(d2Var) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
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
                objQ4 = p0.n(null);
                o0VarE.K(objQ4);
            }
            p1 p1Var2 = (p1) objQ4;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1397181692);
                o0VarE.g0(false);
                fX = 0;
                g6.f.a aVar = g6.f.f75994b;
            } else {
                o0VarE.C(-1397180342);
                fX = w02.b0.x(o0VarE, n1Var2.getIntValue() + n1Var.getIntValue());
                o0VarE.g0(false);
            }
            x3 x3VarA = s1.f.a(fX, null, "RouteOptionsSheetPeekHeight", o0VarE, 384, 10);
            z3.e eVarC = z3.f.c(727472627, new fb0.b((Object) lVar, (e23.l) lVar2, (Object) n1Var, (Object) n1Var2, 27), o0VarE);
            float f14 = ((g6.f) x3VarA.getF182175a()).f75997a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar2 = j92.b.f97900c;
            float f15 = dVar2.f97912d;
            bVar.getClass();
            k2.h hVarC = k2.i.c(f15, dVar2.f97912d, 0.0f, 0.0f, 12);
            long jF = e0.f(o0VarE);
            d0.f128823b.getClass();
            lVar3 = lVar;
            z0.a(eVarC, null, a1VarD, f14, 0.0f, hVarC, jF, d0.f128831j, 0.0f, 0.0f, null, false, null, 0L, 0L, z3.f.c(1961167069, new bv0.e(lVar, lVar2, a1VarD, p1Var2, p1Var, n1Var, n1Var2, 4), o0VarE), o0VarE, 12582918, 1572870, 64274);
            o0Var = o0VarE;
            n30.h hVar = lVar3.f123529e;
            int i16 = i15 & 896;
            boolean zR = o0Var.r(lVar3) | (i16 == 256);
            Object objQ5 = o0Var.q();
            if (zR || objQ5 == c2565a) {
                dVar = null;
                objQ5 = new a(lVar3, lVar2, null);
                o0Var.K(objQ5);
            } else {
                dVar = null;
            }
            l0.e((e23.p) objQ5, hVar, o0Var);
            m mVar2 = (m) p1Var2.getF182175a();
            Integer numValueOf = Integer.valueOf(n1Var.getIntValue());
            Integer numValueOf2 = Integer.valueOf(n1Var2.getIntValue());
            Object objQ6 = o0Var.q();
            if (objQ6 == c2565a) {
                objQ6 = new b(p1Var2, n1Var, n1Var2, dVar);
                o0Var.K(objQ6);
            }
            l0.g(mVar2, numValueOf, numValueOf2, (e23.p) objQ6, o0Var);
            m mVar3 = (m) p1Var2.getF182175a();
            List<w20.a> listB = lVar3.b();
            n30.k kVar = (n30.k) h0.n0(lVar3.f123528d);
            Integer numValueOf3 = Integer.valueOf(kVar != null ? kVar.f123523b : 0);
            boolean zR2 = (i16 == 256) | o0Var.r(lVar3);
            Object objQ7 = o0Var.q();
            if (zR2 || objQ7 == c2565a) {
                objQ7 = new c(lVar3, p1Var2, lVar2, dVar);
                o0Var.K(objQ7);
            }
            l0.g(mVar3, listB, numValueOf3, (e23.p) objQ7, o0Var);
            Unit unit = Unit.INSTANCE;
            boolean zR3 = o0Var.r(d2Var) | o0Var.B(a1VarD);
            Object objQ8 = o0Var.q();
            if (zR3 || objQ8 == c2565a) {
                d dVar3 = new d(d2Var, a1VarD, p1Var, p1Var2, n1Var, n1Var2, null);
                o0Var.K(dVar3);
                objQ8 = dVar3;
            }
            l0.e((e23.p) objQ8, unit, o0Var);
        } else {
            lVar3 = lVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) lVar3, (Object) d2Var, (Object) lVar2, i14, 12);
        }
    }
}
