package y40;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.r2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import ds.e0;
import i3.a1;
import i3.e5;
import i3.mc;
import i3.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o4.d0;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
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
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.components.CustomCourseBottomSheetKt$CustomCourseBottomSheet$3$1", f = "CustomCourseBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a50.g f194425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<a50.c, Unit> f194426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n1 f194427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1 f194428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(a50.g gVar, e23.l<? super a50.c, Unit> lVar, n1 n1Var, n1 n1Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f194425a = gVar;
            this.f194426b = lVar;
            this.f194427c = n1Var;
            this.f194428d = n1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f194425a, this.f194426b, this.f194427c, this.f194428d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a50.b bVar = this.f194425a.f1398i;
            bVar.getClass();
            if (bVar.f1247a && bVar.f1248b) {
                n1 n1Var = this.f194427c;
                if (n1Var.getIntValue() > 0) {
                    n1 n1Var2 = this.f194428d;
                    if (n1Var2.getIntValue() > 0) {
                        this.f194426b.invoke(new a50.c.b0(n1Var2.getIntValue() + n1Var.getIntValue()));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.components.CustomCourseBottomSheetKt$CustomCourseBottomSheet$4$1", f = "CustomCourseBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<p> f194429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f194430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n1 f194431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1 f194432d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<p> p1Var, n1 n1Var, n1 n1Var2, n1 n1Var3, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f194429a = p1Var;
            this.f194430b = n1Var;
            this.f194431c = n1Var2;
            this.f194432d = n1Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f194429a, this.f194430b, this.f194431c, this.f194432d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<p> p1Var = this.f194429a;
            p f182175a = p1Var.getF182175a();
            if (f182175a != null && f182175a.isAdded()) {
                int intValue = this.f194431c.getIntValue() + this.f194430b.getIntValue();
                n1 n1Var = this.f194432d;
                n1Var.t(intValue);
                p f182175a2 = p1Var.getF182175a();
                if (f182175a2 != null) {
                    f182175a2.y6(n1Var.getIntValue());
                }
                p f182175a3 = p1Var.getF182175a();
                if (f182175a3 != null) {
                    f182175a3.c8();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.components.CustomCourseBottomSheetKt$CustomCourseBottomSheet$5$1", f = "CustomCourseBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<p> f194433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f194434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p1<p> p1Var, p1<Boolean> p1Var2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f194433a = p1Var;
            this.f194434b = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f194433a, this.f194434b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p f182175a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<p> p1Var = this.f194433a;
            p f182175a2 = p1Var.getF182175a();
            if (f182175a2 != null && f182175a2.isAdded() && (f182175a = p1Var.getF182175a()) != null) {
                f182175a.M0 = this.f194434b.getF182175a().booleanValue();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.components.CustomCourseBottomSheetKt$CustomCourseBottomSheet$6$1", f = "CustomCourseBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a50.g f194435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<p> f194436b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a50.g gVar, p1<p> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f194435a = gVar;
            this.f194436b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f194435a, this.f194436b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:121:0x026b  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayListN;
            p f182175a;
            ArrayList arrayListQ;
            p f182175a2;
            p f182175a3;
            p f182175a4;
            boolean z14;
            com.garmin.android.apps.connectmobile.courses.model.e eVar;
            com.garmin.android.apps.connectmobile.courses.model.e eVar2;
            com.garmin.android.library.mapsdkadapter.i.b bVarY;
            p f182175a5;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<p> p1Var = this.f194436b;
            p f182175a6 = p1Var.getF182175a();
            if (f182175a6 != null && f182175a6.isAdded()) {
                a50.g gVar = this.f194435a;
                w20.a aVar2 = gVar.f1393d;
                w20.a aVar3 = gVar.f1393d;
                if (aVar2 != null && (eVar2 = aVar2.f181476a) != null && (bVarY = eVar2.y()) != null && (f182175a5 = p1Var.getF182175a()) != null) {
                    f182175a5.K0 = bVarY;
                }
                a50.a aVarE = gVar.e();
                if (aVarE != null ? aVarE.f1245f : false) {
                    p f182175a7 = p1Var.getF182175a();
                    if (f182175a7 != null) {
                        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = (aVar3 == null || (eVar = aVar3.f181476a) == null) ? null : eVar.j();
                        f182175a7.P = !(listJ == null || listJ.isEmpty());
                    }
                } else {
                    p f182175a8 = p1Var.getF182175a();
                    if (f182175a8 != null) {
                        f182175a8.P = false;
                    }
                }
                p f182175a9 = p1Var.getF182175a();
                List<com.garmin.android.library.mapsdkadapter.l> listD = f182175a9 != null ? f182175a9.f97009l.d(false) : null;
                if (listD == null) {
                    listD = j0.f134944a;
                }
                List<com.garmin.android.library.mapsdkadapter.l> list = listD;
                p f182175a10 = p1Var.getF182175a();
                List<com.garmin.android.library.mapsdkadapter.l> listE = f182175a10 != null ? f182175a10.f97009l.e() : null;
                if (listE == null) {
                    listE = j0.f134944a;
                }
                List<com.garmin.android.library.mapsdkadapter.l> list2 = listE;
                p f182175a11 = p1Var.getF182175a();
                List<qe2.a> listA = f182175a11 != null ? f182175a11.f97009l.a(false) : null;
                if (listA == null) {
                    listA = j0.f134944a;
                }
                List<qe2.a> list3 = listA;
                p f182175a12 = p1Var.getF182175a();
                List<qe2.a> listB = f182175a12 != null ? f182175a12.f97010m.b() : null;
                if (listB == null) {
                    listB = j0.f134944a;
                }
                p f182175a13 = p1Var.getF182175a();
                List<ie2.j> listA2 = f182175a13 != null ? f182175a13.f97007k.a() : null;
                if (listA2 == null) {
                    listA2 = j0.f134944a;
                }
                List<ie2.j> list4 = listA2;
                p f182175a14 = p1Var.getF182175a();
                if (f182175a14 != null) {
                    f182175a14.I6();
                }
                p f182175a15 = p1Var.getF182175a();
                if (f182175a15 != null) {
                    j0 j0Var = j0.f134944a;
                    f182175a15.v7(list, list2, list3, j0Var, j0Var);
                }
                p f182175a16 = p1Var.getF182175a();
                if (f182175a16 != null) {
                    f182175a16.w7(listB);
                }
                p f182175a17 = p1Var.getF182175a();
                if (f182175a17 != null) {
                    f182175a17.x7(list4);
                }
                if (!gVar.b().isEmpty()) {
                    com.garmin.android.apps.connectmobile.courses.model.e eVar3 = aVar3 != null ? aVar3.f181476a : null;
                    if (eVar3 != null && (f182175a4 = p1Var.getF182175a()) != null) {
                        List<List<GeoPointDTO>> listB2 = gVar.b();
                        List<com.garmin.android.library.mapsdkadapter.f> listD2 = gVar.d();
                        boolean z15 = gVar.f1400k;
                        k40.e eVar4 = f182175a4.f97005i;
                        ArrayList arrayList = f182175a4.J0;
                        listB2.getClass();
                        listD2.getClass();
                        if (!listB2.isEmpty()) {
                            arrayList.clear();
                            com.garmin.android.library.mapsdkadapter.i.b bVarH = eVar3.h();
                            com.garmin.android.library.mapsdkadapter.e.a aVar4 = new com.garmin.android.library.mapsdkadapter.e.a();
                            com.garmin.android.library.mapsdkadapter.q qVarA = eVar4.a();
                            ie2.p pVar = qVarA.f50328a;
                            pVar.f93155c = 13.0f;
                            pVar.f93158f = 1.0f;
                            com.garmin.android.library.mapsdkadapter.q qVarA2 = eVar4.a();
                            ie2.p pVar2 = qVarA2.f50328a;
                            pVar2.f93156d = a7.b.getColor(f182175a4.requireContext(), R.color.gcm_system_static_black);
                            pVar2.f93155c = 17.0f;
                            pVar2.f93158f = 0.0f;
                            Iterator<List<GeoPointDTO>> it = listB2.iterator();
                            while (it.hasNext()) {
                                for (GeoPointDTO geoPointDTO : it.next()) {
                                    Iterator<List<GeoPointDTO>> it3 = it;
                                    f182175a4.f97011n.getClass();
                                    com.garmin.android.library.mapsdkadapter.f fVarB = k40.d.b(geoPointDTO, bVarH);
                                    if (fVarB != null) {
                                        pVar.f93153a.add(fVarB);
                                        pVar2.f93153a.add(fVarB);
                                        arrayList.add(fVarB);
                                        aVar4.b(fVarB);
                                    }
                                    it = it3;
                                }
                            }
                            com.garmin.android.library.mapsdkadapter.e eVarA = aVar4.a();
                            f182175a4.f97019x = eVarA;
                            f182175a4.X6().setRecenterMapClickListener(new r2(0, new x9.b(15, f182175a4, eVarA), 1, null));
                            qe2.h hVar = f182175a4.f148294e;
                            if (hVar != null) {
                                hVar.h(qVarA2);
                            }
                            qe2.h hVar2 = f182175a4.f148294e;
                            if (hVar2 != null) {
                                hVar2.h(qVarA);
                            }
                            j40.c.Q7(f182175a4, arrayList);
                            f182175a4.W0 = false;
                            boolean z16 = f182175a4.f194414j1;
                            ArrayList arrayList2 = f182175a4.I0;
                            qe2.h hVar3 = f182175a4.f148294e;
                            if (!z16) {
                                z14 = false;
                                if (hVar3 != null) {
                                    arrayList2.clear();
                                    f182175a4.L0 = bVarH;
                                    if (!listD2.isEmpty()) {
                                        arrayList2.add(0, hVar3.x(f182175a4.g8(listD2.get(0))));
                                    }
                                    if (listD2.size() >= 2) {
                                        com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) com.airbnb.lottie.animation.keyframe.a.c(1, listD2);
                                        com.garmin.android.library.mapsdkadapter.p pVar3 = new com.garmin.android.library.mapsdkadapter.p();
                                        pVar3.d(fVar);
                                        pVar3.e("extra_route_point_marker_tag", fVar);
                                        pVar3.f50327a.f50315g = true;
                                        f182175a4.i8(pVar3, 2131232001);
                                        arrayList2.add(hVar3.x(pVar3));
                                    }
                                }
                            } else if (hVar3 != null) {
                                arrayList2.clear();
                                f182175a4.L0 = bVarH;
                                int size = listD2.size() - 2;
                                boolean z17 = true;
                                if (1 <= size) {
                                    int i14 = 1;
                                    while (true) {
                                        com.garmin.android.library.mapsdkadapter.p pVar4 = new com.garmin.android.library.mapsdkadapter.p();
                                        pVar4.d(listD2.get(i14));
                                        pVar4.f50327a.f50315g = z17;
                                        pVar4.e("extra_route_point_marker_tag", listD2.get(i14));
                                        f182175a4.i8(pVar4, 2131231994);
                                        arrayList2.add(hVar3.x(pVar4));
                                        if (i14 == size) {
                                            break;
                                        }
                                        i14++;
                                        z17 = true;
                                    }
                                }
                                if (listD2.size() >= 2) {
                                    com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) com.airbnb.lottie.animation.keyframe.a.c(1, listD2);
                                    com.garmin.android.library.mapsdkadapter.p pVar5 = new com.garmin.android.library.mapsdkadapter.p();
                                    pVar5.d(fVar2);
                                    pVar5.e("extra_route_point_marker_tag", fVar2);
                                    pVar5.f50327a.f50315g = true;
                                    f182175a4.i8(pVar5, 2131231994);
                                    arrayList2.add(hVar3.x(pVar5));
                                }
                                if (listD2.isEmpty()) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                    arrayList2.add(0, hVar3.x(f182175a4.g8(listD2.get(0))));
                                }
                            } else {
                                z14 = false;
                            }
                            qe2.h hVar4 = f182175a4.f148294e;
                            if (hVar4 != null) {
                                f182175a4.L7(eVar3, hVar4);
                            }
                            boolean z18 = eVar3.G() ? true : z14;
                            f182175a4.P = z18;
                            f182175a4.T7((z18 || !f182175a4.V6().f109894b) ? z14 : true);
                            f182175a4.C6(eVar3.j(), z15);
                            f182175a4.m2();
                        }
                    }
                } else if (gVar.d().size() == 1) {
                    com.garmin.android.library.mapsdkadapter.f fVar3 = (com.garmin.android.library.mapsdkadapter.f) h0.b0(gVar.d());
                    p f182175a18 = p1Var.getF182175a();
                    if (f182175a18 != null) {
                        ArrayList arrayList3 = f182175a18.I0;
                        if (fVar3 != null) {
                            arrayList3.clear();
                            qe2.h hVar5 = f182175a18.f148294e;
                            if (hVar5 != null) {
                                arrayList3.add(hVar5.x(f182175a18.g8(fVar3)));
                            }
                            qe2.h hVar6 = f182175a18.f148294e;
                            if (hVar6 != null) {
                                com.garmin.android.library.mapsdkadapter.i.a.b(hVar6, fVar3, 0.0f, 6);
                            }
                        }
                    }
                }
                List<ClimbDTO> list5 = aVar3 != null ? aVar3.f181477b : null;
                if (list5 != null && !list5.isEmpty() && (f182175a3 = p1Var.getF182175a()) != null) {
                    f182175a3.P7(aVar3.f181477b);
                }
                if ((aVar3 != null ? aVar3.f181479d : null) != null && (arrayListQ = f0.q(aVar3.f181479d, aVar3.f181476a)) != null && !arrayListQ.isEmpty() && (f182175a2 = p1Var.getF182175a()) != null) {
                    f182175a2.U7(arrayListQ);
                }
                if ((aVar3 != null ? aVar3.f181480e : null) != null && (arrayListN = lg.d.n(aVar3.f181480e, aVar3.f181476a)) != null && !arrayListN.isEmpty() && (f182175a = p1Var.getF182175a()) != null) {
                    f182175a.R7(arrayListN);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.components.CustomCourseBottomSheetKt$CustomCourseBottomSheet$7$1", f = "CustomCourseBottomSheet.kt", l = {255}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f194437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2<a50.e> f194438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a1 f194439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f194440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<a50.c, Unit> f194441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f194442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<p> f194443g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n1 f194444h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n1 f194445i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ n1 f194446j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p1<Drawable> f194447k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f194448l;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a1 f194449a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f194450b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e23.l<a50.c, Unit> f194451c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f194452d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p1<p> f194453e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ n1 f194454f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ n1 f194455g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ n1 f194456h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p1<Drawable> f194457i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f194458j;

            /* JADX INFO: renamed from: y40.l$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.components.CustomCourseBottomSheetKt$CustomCourseBottomSheet$7$1$1", f = "CustomCourseBottomSheet.kt", l = {259, 264, 276}, m = "emit", v = 2)
            public static final class C3624a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f194459a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f194460b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f194461c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3624a(a<? super T> aVar, t13.d<? super C3624a> dVar) {
                    super(dVar);
                    this.f194460b = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f194459a = obj;
                    this.f194461c |= Integer.MIN_VALUE;
                    return this.f194460b.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(a1 a1Var, Context context, e23.l<? super a50.c, Unit> lVar, p1<Boolean> p1Var, p1<p> p1Var2, n1 n1Var, n1 n1Var2, n1 n1Var3, p1<Drawable> p1Var3, p1<Boolean> p1Var4) {
                this.f194449a = a1Var;
                this.f194450b = context;
                this.f194451c = lVar;
                this.f194452d = p1Var;
                this.f194453e = p1Var2;
                this.f194454f = n1Var;
                this.f194455g = n1Var2;
                this.f194456h = n1Var3;
                this.f194457i = p1Var3;
                this.f194458j = p1Var4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
            
                if (r11.b(r0) == r1) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
            
                if (r11.f(r0) == r1) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
            
                if (r11.f(r0) == r1) goto L44;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(a50.e eVar, t13.d<? super Unit> dVar) {
                C3624a c3624a;
                p f182175a;
                p f182175a2;
                p f182175a3;
                qe2.h hVar;
                p f182175a4;
                p f182175a5;
                p f182175a6;
                p f182175a7;
                p f182175a8;
                p f182175a9;
                p f182175a10;
                p f182175a11;
                p f182175a12;
                p f182175a13;
                p f182175a14;
                p f182175a15;
                p f182175a16;
                p f182175a17;
                p f182175a18;
                p f182175a19;
                p f182175a20;
                p f182175a21;
                p f182175a22;
                p f182175a23;
                p f182175a24;
                ie2.k uiSettings;
                p f182175a25;
                p f182175a26;
                p f182175a27;
                qe2.h hVar2;
                ie2.k uiSettings2;
                if (dVar instanceof C3624a) {
                    c3624a = (C3624a) dVar;
                    int i14 = c3624a.f194461c;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3624a.f194461c = i14 - Integer.MIN_VALUE;
                    } else {
                        c3624a = new C3624a(this, dVar);
                    }
                } else {
                    c3624a = new C3624a(this, dVar);
                }
                Object obj = c3624a.f194459a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3624a.f194461c;
                n1 n1Var = this.f194456h;
                num = null;
                Integer num = null;
                p1<p> p1Var = this.f194453e;
                if (i15 == 0) {
                    r.b(obj);
                    boolean zG = s.g(eVar, a50.e.n.f1358a);
                    a1 a1Var = this.f194449a;
                    p1<Boolean> p1Var2 = this.f194452d;
                    if (zG) {
                        p1Var2.setValue(Boolean.FALSE);
                        mc mcVar = a1Var.f87409a;
                        c3624a.f194461c = 1;
                    } else if (s.g(eVar, a50.e.f.f1340a)) {
                        p1Var2.setValue(Boolean.FALSE);
                        mc mcVar2 = a1Var.f87409a;
                        c3624a.f194461c = 2;
                    } else if (s.g(eVar, a50.e.o.f1360a)) {
                        p1Var2.setValue(Boolean.TRUE);
                        mc mcVar3 = a1Var.f87409a;
                        c3624a.f194461c = 3;
                    } else if (eVar instanceof a50.e.g0) {
                        p f182175a28 = p1Var.getF182175a();
                        if (f182175a28 != null && f182175a28.isAdded()) {
                            n1Var.t(((a50.e.g0) eVar).f1343a);
                            p f182175a29 = p1Var.getF182175a();
                            if (f182175a29 != null) {
                                f182175a29.y6(n1Var.getIntValue());
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    } else if (eVar instanceof a50.e.i0) {
                        p f182175a30 = p1Var.getF182175a();
                        if (f182175a30 != null && f182175a30.isAdded() && (f182175a27 = p1Var.getF182175a()) != null && (hVar2 = f182175a27.f148294e) != null && (uiSettings2 = hVar2.f144584a.getUiSettings()) != null) {
                            uiSettings2.setAllGesturesEnabled(((a50.e.i0) eVar).f1347a);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.o0) {
                        p f182175a31 = p1Var.getF182175a();
                        if (f182175a31 != null && f182175a31.isAdded() && (f182175a26 = p1Var.getF182175a()) != null) {
                            f182175a26.K6();
                            Unit unit3 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.p) {
                        p f182175a32 = p1Var.getF182175a();
                        if (f182175a32 != null && f182175a32.isAdded() && (f182175a25 = p1Var.getF182175a()) != null) {
                            f182175a25.f7();
                            Unit unit4 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.C0015e) {
                        p f182175a33 = p1Var.getF182175a();
                        if (f182175a33 != null && f182175a33.isAdded() && (f182175a24 = p1Var.getF182175a()) != null) {
                            f182175a24.W0 = true;
                            qe2.h hVar3 = f182175a24.f148294e;
                            if (hVar3 != null) {
                                hVar3.setMyLocationEnabled(true);
                            }
                            qe2.h hVar4 = f182175a24.f148294e;
                            if (hVar4 != null && (uiSettings = hVar4.f144584a.getUiSettings()) != null) {
                                uiSettings.a();
                            }
                            f182175a24.c8();
                            Unit unit5 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.d) {
                        p f182175a34 = p1Var.getF182175a();
                        if (f182175a34 != null && f182175a34.isAdded() && (f182175a23 = p1Var.getF182175a()) != null) {
                            f182175a23.c8();
                            Unit unit6 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.r0) {
                        p f182175a35 = p1Var.getF182175a();
                        if (f182175a35 != null && f182175a35.isAdded() && (f182175a22 = p1Var.getF182175a()) != null) {
                            f182175a22.H6(((a50.e.r0) eVar).f1368a);
                            Unit unit7 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.y) {
                        p f182175a36 = p1Var.getF182175a();
                        if (f182175a36 != null && f182175a36.isAdded() && (f182175a21 = p1Var.getF182175a()) != null) {
                            f182175a21.B7();
                            Unit unit8 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.v) {
                        p f182175a37 = p1Var.getF182175a();
                        if (f182175a37 != null && f182175a37.isAdded() && (f182175a20 = p1Var.getF182175a()) != null) {
                            f182175a20.o7(((a50.e.v) eVar).f1375a);
                            Unit unit9 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.e0) {
                        p f182175a38 = p1Var.getF182175a();
                        if (f182175a38 != null && f182175a38.isAdded() && (f182175a19 = p1Var.getF182175a()) != null) {
                            f182175a19.J7(((a50.e.e0) eVar).f1339a);
                            Unit unit10 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.q) {
                        p f182175a39 = p1Var.getF182175a();
                        if (f182175a39 != null && f182175a39.isAdded() && (f182175a18 = p1Var.getF182175a()) != null) {
                            f182175a18.g7(((a50.e.q) eVar).f1365a);
                            Unit unit11 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.z) {
                        p f182175a40 = p1Var.getF182175a();
                        if (f182175a40 != null && f182175a40.isAdded() && (f182175a17 = p1Var.getF182175a()) != null) {
                            f182175a17.D7(((a50.e.z) eVar).f1383a);
                            Unit unit12 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.k0) {
                        p f182175a41 = p1Var.getF182175a();
                        if (f182175a41 != null && f182175a41.isAdded() && (f182175a16 = p1Var.getF182175a()) != null) {
                            f182175a16.z6(((a50.e.k0) eVar).f1352a);
                            Unit unit13 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.x) {
                        p f182175a42 = p1Var.getF182175a();
                        if (f182175a42 != null && f182175a42.isAdded() && (f182175a15 = p1Var.getF182175a()) != null) {
                            f182175a15.z7();
                            Unit unit14 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.w) {
                        p f182175a43 = p1Var.getF182175a();
                        if (f182175a43 != null && f182175a43.isAdded() && (f182175a14 = p1Var.getF182175a()) != null) {
                            f182175a14.p7(((a50.e.w) eVar).f1377a);
                            Unit unit15 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.f0) {
                        p f182175a44 = p1Var.getF182175a();
                        if (f182175a44 != null && f182175a44.isAdded() && (f182175a13 = p1Var.getF182175a()) != null) {
                            f182175a13.K7(((a50.e.f0) eVar).f1341a);
                            Unit unit16 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.s) {
                        p f182175a45 = p1Var.getF182175a();
                        if (f182175a45 != null && f182175a45.isAdded() && (f182175a12 = p1Var.getF182175a()) != null) {
                            f182175a12.i7(((a50.e.s) eVar).f1369a);
                            Unit unit17 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.b0) {
                        p f182175a46 = p1Var.getF182175a();
                        if (f182175a46 != null && f182175a46.isAdded() && (f182175a11 = p1Var.getF182175a()) != null) {
                            f182175a11.F7(((a50.e.b0) eVar).f1332a);
                            Unit unit18 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.r) {
                        p f182175a47 = p1Var.getF182175a();
                        if (f182175a47 != null && f182175a47.isAdded() && (f182175a10 = p1Var.getF182175a()) != null) {
                            f182175a10.h7(((a50.e.r) eVar).f1367a);
                            Unit unit19 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.a0) {
                        p f182175a48 = p1Var.getF182175a();
                        if (f182175a48 != null && f182175a48.isAdded() && (f182175a9 = p1Var.getF182175a()) != null) {
                            f182175a9.E7(((a50.e.a0) eVar).f1325a);
                            Unit unit20 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.n0) {
                        p f182175a49 = p1Var.getF182175a();
                        if (f182175a49 != null && f182175a49.isAdded() && (f182175a8 = p1Var.getF182175a()) != null) {
                            f182175a8.F6(((a50.e.n0) eVar).f1359a);
                            Unit unit21 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.u) {
                        p f182175a50 = p1Var.getF182175a();
                        if (f182175a50 != null && f182175a50.isAdded() && (f182175a7 = p1Var.getF182175a()) != null) {
                            f182175a7.n7(((a50.e.u) eVar).f1373a);
                            Unit unit22 = Unit.INSTANCE;
                        }
                    } else if (eVar instanceof a50.e.d0) {
                        p f182175a51 = p1Var.getF182175a();
                        if (f182175a51 != null && f182175a51.isAdded() && (f182175a6 = p1Var.getF182175a()) != null) {
                            f182175a6.H7(((a50.e.d0) eVar).f1337a);
                            Unit unit23 = Unit.INSTANCE;
                        }
                    } else {
                        boolean z14 = eVar instanceof a50.e.k;
                        Context context = this.f194450b;
                        p1<Boolean> p1Var3 = this.f194458j;
                        p1<Drawable> p1Var4 = this.f194457i;
                        if (z14) {
                            p1Var4.setValue(j.a.a(context, 2131231994));
                            p1Var3.setValue(Boolean.TRUE);
                        } else if (eVar instanceof a50.e.j) {
                            p1Var4.setValue(new u40.h(context, ((a50.e.j) eVar).f1348a));
                            p1Var3.setValue(Boolean.TRUE);
                        } else if (eVar instanceof a50.e.b) {
                            p f182175a52 = p1Var.getF182175a();
                            if (f182175a52 != null && f182175a52.isAdded() && (f182175a5 = p1Var.getF182175a()) != null) {
                                a50.e.b bVar = (a50.e.b) eVar;
                                j40.c.E6(f182175a5, bVar.f1327a, bVar.f1328b, bVar.f1329c, bVar.f1330d, bVar.f1331e);
                                Unit unit24 = Unit.INSTANCE;
                            }
                        } else if (eVar instanceof a50.e.a) {
                            p f182175a53 = p1Var.getF182175a();
                            if (f182175a53 != null && f182175a53.isAdded() && (f182175a4 = p1Var.getF182175a()) != null) {
                                a50.e.a aVar2 = (a50.e.a) eVar;
                                f182175a4.A6(aVar2.f1320a, aVar2.f1321b, aVar2.f1322c, aVar2.f1323d, aVar2.f1324e, null);
                                Unit unit25 = Unit.INSTANCE;
                            }
                        } else if (eVar instanceof a50.e.l) {
                            p1Var4.setValue(null);
                            p1Var3.setValue(Boolean.FALSE);
                        } else {
                            boolean z15 = eVar instanceof a50.e.i;
                            e23.l<a50.c, Unit> lVar = this.f194451c;
                            if (z15) {
                                p f182175a54 = p1Var.getF182175a();
                                if (f182175a54 != null && f182175a54.isAdded()) {
                                    p f182175a55 = p1Var.getF182175a();
                                    com.garmin.android.library.mapsdkadapter.f fVarT6 = f182175a55 != null ? f182175a55.T6() : null;
                                    if (fVarT6 != null) {
                                        p f182175a56 = p1Var.getF182175a();
                                        if (f182175a56 != null && (hVar = f182175a56.f148294e) != null) {
                                            num = new Integer((int) hVar.f144584a.getY());
                                        }
                                        lVar.invoke(new a50.c.x(fVarT6, num));
                                    }
                                }
                            } else if (eVar instanceof a50.e.h) {
                                p f182175a57 = p1Var.getF182175a();
                                if (f182175a57 != null && f182175a57.isAdded()) {
                                    p f182175a58 = p1Var.getF182175a();
                                    com.garmin.android.library.mapsdkadapter.f fVarT7 = f182175a58 != null ? f182175a58.T6() : null;
                                    if (fVarT7 != null) {
                                        lVar.invoke(new a50.c.w(((a50.e.h) eVar).f1344a, fVarT7));
                                    }
                                }
                            } else if (eVar instanceof a50.e.a1) {
                                p f182175a59 = p1Var.getF182175a();
                                if (f182175a59 != null && f182175a59.isAdded()) {
                                    p f182175a60 = p1Var.getF182175a();
                                    if (f182175a60 != null) {
                                        f182175a60.K0 = ((a50.e.a1) eVar).f1326a;
                                        Unit unit26 = Unit.INSTANCE;
                                    }
                                    p f182175a61 = p1Var.getF182175a();
                                    if (f182175a61 != null) {
                                        f182175a61.L0 = ((a50.e.a1) eVar).f1326a;
                                        Unit unit27 = Unit.INSTANCE;
                                    }
                                }
                            } else if (eVar instanceof a50.e.t) {
                                p f182175a62 = p1Var.getF182175a();
                                if (f182175a62 != null && f182175a62.isAdded()) {
                                    p f182175a63 = p1Var.getF182175a();
                                    if (f182175a63 != null) {
                                        f182175a63.j7(((a50.e.t) eVar).f1371a, 1.0f);
                                        Unit unit28 = Unit.INSTANCE;
                                    }
                                    com.garmin.android.apps.connectmobile.courses.model.g gVar = ((a50.e.t) eVar).f1371a;
                                    Double d14 = gVar.lat;
                                    Double d15 = gVar.lon;
                                    if (zf.b.D(d14) && zf.b.D(d15)) {
                                        p f182175a64 = p1Var.getF182175a();
                                        if (f182175a64 != null) {
                                            f182175a64.f8(new LatLng(d14.doubleValue(), d15.doubleValue()));
                                            Unit unit29 = Unit.INSTANCE;
                                        }
                                        p f182175a65 = p1Var.getF182175a();
                                        if (f182175a65 != null) {
                                            f182175a65.m2();
                                            Unit unit30 = Unit.INSTANCE;
                                        }
                                    }
                                }
                            } else if (eVar instanceof a50.e.c0) {
                                p f182175a66 = p1Var.getF182175a();
                                if (f182175a66 != null && f182175a66.isAdded() && (f182175a3 = p1Var.getF182175a()) != null) {
                                    f182175a3.G7(((a50.e.c0) eVar).f1335a);
                                    Unit unit31 = Unit.INSTANCE;
                                }
                            } else if (eVar instanceof a50.e.m) {
                                p f182175a67 = p1Var.getF182175a();
                                if (f182175a67 != null && f182175a67.isAdded()) {
                                    com.garmin.android.apps.connectmobile.courses.model.f.a aVar3 = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
                                    com.garmin.android.apps.connectmobile.courses.model.g gVar2 = ((a50.e.m) eVar).f1356a;
                                    String coursePointType = gVar2.getCoursePointType();
                                    aVar3.getClass();
                                    p1Var4.setValue(new u40.h(context, com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType)));
                                    p1Var3.setValue(Boolean.TRUE);
                                    p f182175a68 = p1Var.getF182175a();
                                    if (f182175a68 != null) {
                                        f182175a68.j7(gVar2, 0.5f);
                                        Unit unit32 = Unit.INSTANCE;
                                    }
                                    Double d16 = gVar2.lat;
                                    Double d17 = gVar2.lon;
                                    if (zf.b.D(d16) && zf.b.D(d17)) {
                                        p f182175a69 = p1Var.getF182175a();
                                        if (f182175a69 != null) {
                                            f182175a69.f8(new LatLng(d16.doubleValue(), d17.doubleValue()));
                                            Unit unit33 = Unit.INSTANCE;
                                        }
                                        p f182175a70 = p1Var.getF182175a();
                                        if (f182175a70 != null) {
                                            f182175a70.m2();
                                            Unit unit34 = Unit.INSTANCE;
                                        }
                                    }
                                }
                            } else if (eVar instanceof a50.e.g) {
                                p f182175a71 = p1Var.getF182175a();
                                if (f182175a71 != null && f182175a71.isAdded()) {
                                    p f182175a72 = p1Var.getF182175a();
                                    com.garmin.android.library.mapsdkadapter.f fVarT8 = f182175a72 != null ? f182175a72.T6() : null;
                                    if (fVarT8 != null) {
                                        com.garmin.android.apps.connectmobile.courses.model.g gVar3 = ((a50.e.g) eVar).f1342a;
                                        LatLng latLng = fVarT8.f50283a;
                                        lVar.invoke(new a50.c.u(gVar3, new GeoPointDTO(latLng.latitude, latLng.longitude)));
                                    }
                                }
                            } else if ((eVar instanceof a50.e.x0) && (f182175a = p1Var.getF182175a()) != null && f182175a.isAdded() && (f182175a2 = p1Var.getF182175a()) != null) {
                                f182175a2.X7(((a50.e.x0) eVar).f1380a);
                                Unit unit35 = Unit.INSTANCE;
                            }
                        }
                    }
                    return aVar;
                }
                if (i15 == 1) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i15 != 2) {
                    if (i15 == 3) {
                        r.b(obj);
                        return Unit.INSTANCE;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                p f182175a73 = p1Var.getF182175a();
                if (f182175a73 != null && f182175a73.isAdded()) {
                    n1Var.t(this.f194455g.getIntValue() + this.f194454f.getIntValue());
                    p f182175a74 = p1Var.getF182175a();
                    if (f182175a74 != null) {
                        f182175a74.y6(n1Var.getIntValue());
                        Unit unit36 = Unit.INSTANCE;
                    }
                    p f182175a75 = p1Var.getF182175a();
                    if (f182175a75 != null) {
                        f182175a75.m2();
                        Unit unit37 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(d2<? extends a50.e> d2Var, a1 a1Var, Context context, e23.l<? super a50.c, Unit> lVar, p1<Boolean> p1Var, p1<p> p1Var2, n1 n1Var, n1 n1Var2, n1 n1Var3, p1<Drawable> p1Var3, p1<Boolean> p1Var4, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f194438b = d2Var;
            this.f194439c = a1Var;
            this.f194440d = context;
            this.f194441e = lVar;
            this.f194442f = p1Var;
            this.f194443g = p1Var2;
            this.f194444h = n1Var;
            this.f194445i = n1Var2;
            this.f194446j = n1Var3;
            this.f194447k = p1Var3;
            this.f194448l = p1Var4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f194438b, this.f194439c, this.f194440d, this.f194441e, this.f194442f, this.f194443g, this.f194444h, this.f194445i, this.f194446j, this.f194447k, this.f194448l, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f194437a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(this.f194439c, this.f194440d, this.f194441e, this.f194442f, this.f194443g, this.f194444h, this.f194445i, this.f194446j, this.f194447k, this.f194448l);
                this.f194437a = 1;
                if (this.f194438b.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a50.g gVar, d2<? extends a50.e> d2Var, e23.l<? super a50.c, Unit> lVar, p3.m mVar, int i14) {
        a50.g gVar2;
        o0 o0Var;
        float fX;
        n1 n1Var;
        n1 n1Var2;
        p1 p1Var;
        p1 p1Var2;
        t13.d dVar;
        gVar.getClass();
        d2Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-2049177130);
        int i15 = i14 | (o0VarE.r(gVar) ? 4 : 2) | (o0VarE.r(d2Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
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
            p1 p1Var3 = (p1) objQ;
            a1 a1VarD = z0.d(null, null, o0VarE, 0, 3);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(0, o0VarE);
            }
            n1 n1Var3 = (n1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(0, o0VarE);
            }
            n1 n1Var4 = (n1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = e5.o(0, o0VarE);
            }
            n1 n1Var5 = (n1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(null);
                o0VarE.K(objQ5);
            }
            p1 p1Var4 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ6);
            }
            p1 p1Var5 = (p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p0.n(null);
                o0VarE.K(objQ7);
            }
            p1 p1Var6 = (p1) objQ7;
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarE.C(2130794040);
                o0VarE.g0(false);
                fX = 0;
                g6.f.a aVar = g6.f.f75994b;
            } else {
                o0VarE.C(2130795390);
                fX = w02.b0.x(o0VarE, n1Var4.getIntValue() + n1Var3.getIntValue());
                o0VarE.g0(false);
            }
            float f14 = ((g6.f) s1.f.a(fX, null, "CustomCourseSheetPeekHeight", o0VarE, 384, 10).getF182175a()).f75997a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar2 = j92.b.f97900c;
            float f15 = dVar2.f97912d;
            bVar.getClass();
            k2.h hVarC = k2.i.c(f15, dVar2.f97912d, 0.0f, 0.0f, 12);
            long jF = e0.f(o0VarE);
            d0.f128823b.getClass();
            z0.a(z3.f.c(-917021337, new x91.n(gVar, d2Var, lVar, n1Var3, n1Var4, 5), o0VarE), null, a1VarD, f14, 0.0f, hVarC, jF, d0.f128831j, 0.0f, 0.0f, null, false, null, 0L, 0L, z3.f.c(-359687343, new a11.l(gVar, lVar, a1VarD, p1Var4, p1Var5, p1Var6, n1Var5, p1Var3, n1Var3, n1Var4, 11), o0VarE), o0VarE, 12582918, 1572870, 64274);
            o0Var = o0VarE;
            Integer numValueOf = Integer.valueOf(n1Var3.getIntValue());
            Integer numValueOf2 = Integer.valueOf(n1Var4.getIntValue());
            int i16 = i15 & 896;
            boolean zR = o0Var.r(gVar) | (i16 == 256);
            Object objQ8 = o0Var.q();
            if (zR || objQ8 == c2565a) {
                n1Var = n1Var3;
                n1Var2 = n1Var4;
                a aVar2 = new a(gVar, lVar, n1Var, n1Var2, null);
                gVar2 = gVar;
                o0Var.K(aVar2);
                objQ8 = aVar2;
            } else {
                gVar2 = gVar;
                n1Var = n1Var3;
                n1Var2 = n1Var4;
            }
            l0.g(gVar2, numValueOf, numValueOf2, (e23.p) objQ8, o0Var);
            p pVar = (p) p1Var4.getF182175a();
            Integer numValueOf3 = Integer.valueOf(n1Var.getIntValue());
            Integer numValueOf4 = Integer.valueOf(n1Var2.getIntValue());
            Object objQ9 = o0Var.q();
            if (objQ9 == c2565a) {
                objQ9 = new b(p1Var4, n1Var, n1Var2, n1Var5, null);
                p1Var = p1Var4;
                o0Var.K(objQ9);
            } else {
                p1Var = p1Var4;
            }
            l0.g(pVar, numValueOf3, numValueOf4, (e23.p) objQ9, o0Var);
            p pVar2 = (p) p1Var.getF182175a();
            Boolean bool = (Boolean) p1Var5.getF182175a();
            bool.booleanValue();
            Object objQ10 = o0Var.q();
            if (objQ10 == c2565a) {
                p1Var2 = p1Var5;
                dVar = null;
                objQ10 = new c(p1Var, p1Var2, null);
                o0Var.K(objQ10);
            } else {
                p1Var2 = p1Var5;
                dVar = null;
            }
            l0.f(pVar2, bool, (e23.p) objQ10, o0Var);
            p pVar3 = (p) p1Var.getF182175a();
            w20.a aVar3 = gVar2.f1393d;
            List<com.garmin.android.library.mapsdkadapter.f> listD = gVar2.d();
            List<List<GeoPointDTO>> listB = gVar2.b();
            a50.a aVarE = gVar2.e();
            Object[] objArr = {pVar3, aVar3, listD, listB, Boolean.valueOf(aVarE != null ? aVarE.f1245f : false), Boolean.valueOf(gVar2.f1400k)};
            boolean zR2 = o0Var.r(gVar2);
            Object objQ11 = o0Var.q();
            if (zR2 || objQ11 == c2565a) {
                objQ11 = new d(gVar2, p1Var, dVar);
                o0Var.K(objQ11);
            }
            l0.h(objArr, (e23.p) objQ11, o0Var);
            Unit unit = Unit.INSTANCE;
            boolean zR3 = o0Var.r(d2Var) | o0Var.B(a1VarD) | o0Var.r(context) | (i16 == 256);
            Object objQ12 = o0Var.q();
            if (zR3 || objQ12 == c2565a) {
                e eVar = new e(d2Var, a1VarD, context, lVar, p1Var3, p1Var, n1Var, n1Var2, n1Var5, p1Var6, p1Var2, null);
                o0Var.K(eVar);
                objQ12 = eVar;
            }
            l0.e((e23.p) objQ12, unit, o0Var);
        } else {
            gVar2 = gVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(gVar2, d2Var, lVar, i14, 8);
        }
    }
}
