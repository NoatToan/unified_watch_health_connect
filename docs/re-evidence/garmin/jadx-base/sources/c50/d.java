package c50;

import a42.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import ds.e0;
import e23.l;
import e23.p;
import i3.a1;
import i3.e5;
import i3.mc;
import i3.z0;
import ie2.k;
import java.util.ArrayList;
import java.util.List;
import k30.t;
import k30.x;
import o13.r;
import o4.d0;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.d2;
import r53.j;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.components.CourseDetailsBottomSheetKt$CourseDetailsBottomSheet$3$1", f = "CourseDetailsBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<i> f24468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f24469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n1 f24470c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<i> p1Var, n1 n1Var, n1 n1Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f24468a = p1Var;
            this.f24469b = n1Var;
            this.f24470c = n1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f24468a, this.f24469b, this.f24470c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<i> p1Var = this.f24468a;
            i f182175a = p1Var.getF182175a();
            if (f182175a != null && f182175a.isAdded()) {
                int intValue = this.f24469b.getIntValue();
                n1 n1Var = this.f24470c;
                n1Var.t(intValue);
                i f182175a2 = p1Var.getF182175a();
                if (f182175a2 != null) {
                    f182175a2.y6(n1Var.getIntValue());
                }
                i f182175a3 = p1Var.getF182175a();
                if (f182175a3 != null) {
                    f182175a3.u6(f182175a3.f97019x, f182175a3.f148290a);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.components.CourseDetailsBottomSheetKt$CourseDetailsBottomSheet$4$1", f = "CourseDetailsBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<i> f24471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f24472b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<i> p1Var, p1<Boolean> p1Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f24471a = p1Var;
            this.f24472b = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f24471a, this.f24472b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i f182175a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<i> p1Var = this.f24471a;
            i f182175a2 = p1Var.getF182175a();
            if (f182175a2 != null && f182175a2.isAdded() && (f182175a = p1Var.getF182175a()) != null) {
                f182175a.M0 = this.f24472b.getF182175a().booleanValue();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.components.CourseDetailsBottomSheetKt$CourseDetailsBottomSheet$5$1", f = "CourseDetailsBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e50.d f24473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<i> f24474b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e50.d dVar, p1<i> p1Var, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f24473a = dVar;
            this.f24474b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f24473a, this.f24474b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayListN;
            i f182175a;
            ArrayList arrayListQ;
            i f182175a2;
            i f182175a3;
            i f182175a4;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<i> p1Var = this.f24474b;
            i f182175a5 = p1Var.getF182175a();
            if (f182175a5 != null && f182175a5.isAdded()) {
                e50.d dVar = this.f24473a;
                w20.a aVar2 = dVar.f62992d;
                w20.a aVar3 = dVar.f62992d;
                if (aVar2 != null) {
                    i f182175a6 = p1Var.getF182175a();
                    if (f182175a6 != null) {
                        f182175a6.f8(aVar3.f181476a);
                    }
                    i f182175a7 = p1Var.getF182175a();
                    if (f182175a7 != null) {
                        f182175a7.C6(aVar3.f181476a.j(), dVar.f62998j);
                    }
                    i f182175a8 = p1Var.getF182175a();
                    if (f182175a8 != null) {
                        f182175a8.K0 = aVar3.f181476a.y();
                    }
                    List<ClimbDTO> list = aVar3.f181477b;
                    if (list != null && !list.isEmpty() && (f182175a4 = p1Var.getF182175a()) != null) {
                        f182175a4.P7(aVar3.f181477b);
                    }
                    List<fn0.a> list2 = aVar3.f181478c;
                    if (list2 != null && !list2.isEmpty() && (f182175a3 = p1Var.getF182175a()) != null) {
                        f182175a3.G6(aVar3.f181478c);
                    }
                    x xVar = aVar3.f181479d;
                    if (xVar != null && (arrayListQ = f0.q(xVar, aVar3.f181476a)) != null && !arrayListQ.isEmpty() && (f182175a2 = p1Var.getF182175a()) != null) {
                        f182175a2.U7(arrayListQ);
                    }
                    t tVar = aVar3.f181480e;
                    if (tVar != null && (arrayListN = lg.d.n(tVar, aVar3.f181476a)) != null && !arrayListN.isEmpty() && (f182175a = p1Var.getF182175a()) != null) {
                        f182175a.R7(arrayListN);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: c50.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.components.CourseDetailsBottomSheetKt$CourseDetailsBottomSheet$6$1", f = "CourseDetailsBottomSheet.kt", l = {198}, m = "invokeSuspend", v = 2)
    public static final class C0352d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2<e50.b> f24476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a1 f24477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f24478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<e50.a, Unit> f24479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f24480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<i> f24481g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n1 f24482h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n1 f24483i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p1<Drawable> f24484j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f24485k;

        /* JADX INFO: renamed from: c50.d$d$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a1 f24486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f24487b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l<e50.a, Unit> f24488c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f24489d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p1<i> f24490e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ n1 f24491f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ n1 f24492g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ p1<Drawable> f24493h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f24494i;

            /* JADX INFO: renamed from: c50.d$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.components.CourseDetailsBottomSheetKt$CourseDetailsBottomSheet$6$1$1", f = "CourseDetailsBottomSheet.kt", l = {202, 214}, m = "emit", v = 2)
            public static final class C0353a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f24495a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f24496b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f24497c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0353a(a<? super T> aVar, t13.d<? super C0353a> dVar) {
                    super(dVar);
                    this.f24496b = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f24495a = obj;
                    this.f24497c |= Integer.MIN_VALUE;
                    return this.f24496b.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(a1 a1Var, Context context, l<? super e50.a, Unit> lVar, p1<Boolean> p1Var, p1<i> p1Var2, n1 n1Var, n1 n1Var2, p1<Drawable> p1Var3, p1<Boolean> p1Var4) {
                this.f24486a = a1Var;
                this.f24487b = context;
                this.f24488c = lVar;
                this.f24489d = p1Var;
                this.f24490e = p1Var2;
                this.f24491f = n1Var;
                this.f24492g = n1Var2;
                this.f24493h = p1Var3;
                this.f24494i = p1Var4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
            
                if (r9.f(r0) == r1) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
            
                if (r9.f(r0) == r1) goto L35;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(e50.b bVar, t13.d<? super Unit> dVar) {
                C0353a c0353a;
                i f182175a;
                i f182175a2;
                i f182175a3;
                i f182175a4;
                i f182175a5;
                List<ie2.j> listQ;
                i f182175a6;
                List<ie2.j> listQ2;
                i f182175a7;
                i f182175a8;
                i f182175a9;
                qe2.h hVar;
                k uiSettings;
                i f182175a10;
                if (dVar instanceof C0353a) {
                    c0353a = (C0353a) dVar;
                    int i14 = c0353a.f24497c;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0353a.f24497c = i14 - Integer.MIN_VALUE;
                    } else {
                        c0353a = new C0353a(this, dVar);
                    }
                } else {
                    c0353a = new C0353a(this, dVar);
                }
                Object obj = c0353a.f24495a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0353a.f24497c;
                n1 n1Var = this.f24492g;
                p1<i> p1Var = this.f24490e;
                if (i15 == 0) {
                    r.b(obj);
                    boolean zG = s.g(bVar, e50.b.a.f62947a);
                    a1 a1Var = this.f24486a;
                    p1<Boolean> p1Var2 = this.f24489d;
                    if (zG) {
                        p1Var2.setValue(Boolean.FALSE);
                        mc mcVar = a1Var.f87409a;
                        c0353a.f24497c = 1;
                    } else if (s.g(bVar, e50.b.e.f62955a)) {
                        p1Var2.setValue(Boolean.TRUE);
                        mc mcVar2 = a1Var.f87409a;
                        c0353a.f24497c = 2;
                    } else if (bVar instanceof e50.b.f) {
                        i f182175a11 = p1Var.getF182175a();
                        if (f182175a11 != null && f182175a11.isAdded() && (f182175a10 = p1Var.getF182175a()) != null) {
                            f182175a10.f7();
                        }
                    } else if (bVar instanceof e50.b.o) {
                        i f182175a12 = p1Var.getF182175a();
                        if (f182175a12 != null && f182175a12.isAdded()) {
                            n1Var.t(((e50.b.o) bVar).f62965a);
                            i f182175a13 = p1Var.getF182175a();
                            if (f182175a13 != null) {
                                f182175a13.y6(n1Var.getIntValue());
                            }
                        }
                    } else if (bVar instanceof e50.b.p) {
                        i f182175a14 = p1Var.getF182175a();
                        if (f182175a14 != null && f182175a14.isAdded() && (f182175a9 = p1Var.getF182175a()) != null && (hVar = f182175a9.f148294e) != null && (uiSettings = hVar.f144584a.getUiSettings()) != null) {
                            uiSettings.setAllGesturesEnabled(((e50.b.p) bVar).f62966a);
                        }
                    } else if (bVar instanceof e50.b.g) {
                        i f182175a15 = p1Var.getF182175a();
                        if (f182175a15 != null && f182175a15.isAdded() && (f182175a8 = p1Var.getF182175a()) != null) {
                            f182175a8.g7(((e50.b.g) bVar).f62957a);
                        }
                    } else if (bVar instanceof e50.b.m) {
                        i f182175a16 = p1Var.getF182175a();
                        if (f182175a16 != null && f182175a16.isAdded() && (f182175a7 = p1Var.getF182175a()) != null) {
                            f182175a7.D7(((e50.b.m) bVar).f62963a);
                        }
                    } else {
                        T t7 = null;
                        jVar = null;
                        ie2.j jVar = null;
                        T t14 = null;
                        jVar = null;
                        ie2.j jVar2 = null;
                        if (bVar instanceof e50.b.i) {
                            i f182175a17 = p1Var.getF182175a();
                            if (f182175a17 != null && f182175a17.isAdded() && (f182175a6 = p1Var.getF182175a()) != null) {
                                fn0.a aVar2 = ((e50.b.i) bVar).f62959a;
                                k40.h hVar2 = f182175a6.f97010m;
                                hVar2.getClass();
                                k40.b bVar2 = hVar2.f102844a;
                                Context contextM0 = bVar2.m0();
                                if (contextM0 != null) {
                                    Bitmap bitmapA = hVar2.a(aVar2.h().f72176d, contextM0);
                                    qe2.h map = bVar2.getMap();
                                    if (map != null && (listQ2 = map.f144584a.Q()) != null) {
                                        for (T t15 : listQ2) {
                                            Object objMo329getTag = ((ie2.j) t15).mo329getTag();
                                            Bundle bundle = objMo329getTag instanceof Bundle ? (Bundle) objMo329getTag : null;
                                            if (s.g(bundle != null ? bundle.getString("extra_hazard_on_course_index") : null, aVar2.getGeohash())) {
                                                t7 = t15;
                                                break;
                                            }
                                        }
                                        jVar = (ie2.j) t7;
                                    }
                                    if (jVar != null) {
                                        jVar.f(bitmapA);
                                        jVar.a(15.0f);
                                        com.garmin.android.library.mapsdkadapter.e.a aVar3 = new com.garmin.android.library.mapsdkadapter.e.a();
                                        aVar3.b(jVar.getPosition());
                                        bVar2.w1(aVar3.a());
                                        bVar2.m2();
                                    }
                                }
                            }
                        } else if (bVar instanceof e50.b.l) {
                            i f182175a18 = p1Var.getF182175a();
                            if (f182175a18 != null && f182175a18.isAdded() && (f182175a5 = p1Var.getF182175a()) != null) {
                                fn0.a aVar4 = ((e50.b.l) bVar).f62962a;
                                k40.h hVar3 = f182175a5.f97010m;
                                hVar3.getClass();
                                k40.b bVar3 = hVar3.f102844a;
                                Context contextM1 = bVar3.m0();
                                if (contextM1 != null) {
                                    qe2.h map2 = bVar3.getMap();
                                    if (map2 != null && (listQ = map2.f144584a.Q()) != null) {
                                        for (T t16 : listQ) {
                                            Object objMo329getTag2 = ((ie2.j) t16).mo329getTag();
                                            Bundle bundle2 = objMo329getTag2 instanceof Bundle ? (Bundle) objMo329getTag2 : null;
                                            if (s.g(bundle2 != null ? bundle2.getString("extra_hazard_on_course_index") : null, aVar4.getGeohash())) {
                                                t14 = t16;
                                                break;
                                            }
                                        }
                                        jVar2 = (ie2.j) t14;
                                    }
                                    if (jVar2 != null) {
                                        jVar2.f(hVar3.a(aVar4.h().f72175c, contextM1));
                                        jVar2.a(-230.0f);
                                    }
                                }
                            }
                        } else if (bVar instanceof e50.b.w) {
                            i f182175a19 = p1Var.getF182175a();
                            if (f182175a19 != null && f182175a19.isAdded() && (f182175a4 = p1Var.getF182175a()) != null) {
                                f182175a4.G6(((e50.b.w) bVar).f62974a);
                            }
                        } else if (bVar instanceof e50.b.h) {
                            i f182175a20 = p1Var.getF182175a();
                            if (f182175a20 != null && f182175a20.isAdded()) {
                                i f182175a21 = p1Var.getF182175a();
                                if (f182175a21 != null) {
                                    f182175a21.j7(((e50.b.h) bVar).f62958a, 1.0f);
                                }
                                com.garmin.android.apps.connectmobile.courses.model.g gVar = ((e50.b.h) bVar).f62958a;
                                Double d14 = gVar.lat;
                                Double d15 = gVar.lon;
                                if (zf.b.D(d14) && zf.b.D(d15)) {
                                    i f182175a22 = p1Var.getF182175a();
                                    if (f182175a22 != null) {
                                        f182175a22.c8(new LatLng(d14.doubleValue(), d15.doubleValue()));
                                    }
                                    i f182175a23 = p1Var.getF182175a();
                                    if (f182175a23 != null) {
                                        f182175a23.m2();
                                    }
                                }
                            }
                        } else if (bVar instanceof e50.b.n) {
                            i f182175a24 = p1Var.getF182175a();
                            if (f182175a24 != null && f182175a24.isAdded() && (f182175a3 = p1Var.getF182175a()) != null) {
                                f182175a3.G7(((e50.b.n) bVar).f62964a);
                            }
                        } else {
                            boolean z14 = bVar instanceof e50.b.d;
                            p1<Boolean> p1Var3 = this.f24494i;
                            p1<Drawable> p1Var4 = this.f24493h;
                            if (z14) {
                                i f182175a25 = p1Var.getF182175a();
                                if (f182175a25 != null && f182175a25.isAdded()) {
                                    com.garmin.android.apps.connectmobile.courses.model.f.a aVar5 = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
                                    com.garmin.android.apps.connectmobile.courses.model.g gVar2 = ((e50.b.d) bVar).f62953a;
                                    String coursePointType = gVar2.getCoursePointType();
                                    aVar5.getClass();
                                    p1Var4.setValue(new u40.h(this.f24487b, com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType)));
                                    p1Var3.setValue(Boolean.TRUE);
                                    i f182175a26 = p1Var.getF182175a();
                                    if (f182175a26 != null) {
                                        f182175a26.j7(gVar2, 0.5f);
                                    }
                                    Double d16 = gVar2.lat;
                                    Double d17 = gVar2.lon;
                                    if (zf.b.D(d16) && zf.b.D(d17)) {
                                        i f182175a27 = p1Var.getF182175a();
                                        if (f182175a27 != null) {
                                            f182175a27.c8(new LatLng(d16.doubleValue(), d17.doubleValue()));
                                        }
                                        i f182175a28 = p1Var.getF182175a();
                                        if (f182175a28 != null) {
                                            f182175a28.m2();
                                        }
                                    }
                                }
                            } else if (bVar instanceof e50.b.c) {
                                p1Var4.setValue(null);
                                p1Var3.setValue(Boolean.FALSE);
                            } else if (bVar instanceof e50.b.C1327b) {
                                i f182175a29 = p1Var.getF182175a();
                                if (f182175a29 != null && f182175a29.isAdded()) {
                                    i f182175a30 = p1Var.getF182175a();
                                    com.garmin.android.library.mapsdkadapter.f fVarT6 = f182175a30 != null ? f182175a30.T6() : null;
                                    if (fVarT6 != null) {
                                        com.garmin.android.apps.connectmobile.courses.model.g gVar3 = ((e50.b.C1327b) bVar).f62949a;
                                        LatLng latLng = fVarT6.f50283a;
                                        this.f24488c.invoke(new e50.a.x(gVar3, new GeoPointDTO(latLng.latitude, latLng.longitude)));
                                    }
                                }
                            } else if ((bVar instanceof e50.b.c0) && (f182175a = p1Var.getF182175a()) != null && f182175a.isAdded() && (f182175a2 = p1Var.getF182175a()) != null) {
                                f182175a2.X7(((e50.b.c0) bVar).f62952a);
                            }
                        }
                    }
                    return aVar;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        r.b(obj);
                        return Unit.INSTANCE;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                i f182175a31 = p1Var.getF182175a();
                if (f182175a31 != null && f182175a31.isAdded()) {
                    n1Var.t(this.f24491f.getIntValue());
                    i f182175a32 = p1Var.getF182175a();
                    if (f182175a32 != null) {
                        f182175a32.y6(n1Var.getIntValue());
                    }
                    i f182175a33 = p1Var.getF182175a();
                    if (f182175a33 != null) {
                        f182175a33.m2();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0352d(d2<? extends e50.b> d2Var, a1 a1Var, Context context, l<? super e50.a, Unit> lVar, p1<Boolean> p1Var, p1<i> p1Var2, n1 n1Var, n1 n1Var2, p1<Drawable> p1Var3, p1<Boolean> p1Var4, t13.d<? super C0352d> dVar) {
            super(2, dVar);
            this.f24476b = d2Var;
            this.f24477c = a1Var;
            this.f24478d = context;
            this.f24479e = lVar;
            this.f24480f = p1Var;
            this.f24481g = p1Var2;
            this.f24482h = n1Var;
            this.f24483i = n1Var2;
            this.f24484j = p1Var3;
            this.f24485k = p1Var4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C0352d(this.f24476b, this.f24477c, this.f24478d, this.f24479e, this.f24480f, this.f24481g, this.f24482h, this.f24483i, this.f24484j, this.f24485k, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0352d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f24475a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(this.f24477c, this.f24478d, this.f24479e, this.f24480f, this.f24481g, this.f24482h, this.f24483i, this.f24484j, this.f24485k);
                this.f24475a = 1;
                if (this.f24476b.collect(aVar2, this) == aVar) {
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
    public static final void a(e50.d dVar, d2<? extends e50.b> d2Var, l<? super e50.a, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        float fX;
        n1 n1Var;
        dVar.getClass();
        d2Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1366081656);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(d2Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
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
            n1 n1Var2 = (n1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(0, o0VarE);
            }
            n1 n1Var3 = (n1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(null);
                o0VarE.K(objQ4);
            }
            p1 p1Var2 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p1 p1Var3 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(null);
                o0VarE.K(objQ6);
            }
            p1 p1Var4 = (p1) objQ6;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1455496038);
                o0VarE.g0(false);
                fX = 0;
                g6.f.a aVar = g6.f.f75994b;
            } else {
                o0VarE.C(-1455495360);
                fX = w02.b0.x(o0VarE, n1Var2.getIntValue());
                o0VarE.g0(false);
            }
            float f14 = ((g6.f) s1.f.a(fX, null, "CourseDetailsSheetPeekHeight", o0VarE, 384, 10).getF182175a()).f75997a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar2 = j92.b.f97900c;
            float f15 = dVar2.f97912d;
            bVar.getClass();
            k2.h hVarC = k2.i.c(f15, dVar2.f97912d, 0.0f, 0.0f, 12);
            long jF = e0.f(o0VarE);
            d0.f128823b.getClass();
            z0.a(z3.f.c(-117316727, new y(dVar, a1VarD, lVar, false, n1Var2, 13), o0VarE), null, a1VarD, f14, 0.0f, hVarC, jF, d0.f128831j, 0.0f, 0.0f, null, false, null, 0L, 0L, z3.f.c(649403507, new ak0.h(dVar, lVar, p1Var2, p1Var3, p1Var4, n1Var3, 4), o0VarE), o0VarE, 12582918, 1572870, 64274);
            o0Var = o0VarE;
            i iVar = (i) p1Var2.getF182175a();
            Integer numValueOf = Integer.valueOf(n1Var2.getIntValue());
            Object objQ7 = o0Var.q();
            if (objQ7 == c2565a) {
                n1Var = n1Var2;
                objQ7 = new a(p1Var2, n1Var, n1Var3, null);
                o0Var.K(objQ7);
            } else {
                n1Var = n1Var2;
            }
            l0.f(iVar, numValueOf, (p) objQ7, o0Var);
            i iVar2 = (i) p1Var2.getF182175a();
            Boolean bool = (Boolean) p1Var3.getF182175a();
            bool.booleanValue();
            Object objQ8 = o0Var.q();
            if (objQ8 == c2565a) {
                objQ8 = new b(p1Var2, p1Var3, null);
                o0Var.K(objQ8);
            }
            l0.f(iVar2, bool, (p) objQ8, o0Var);
            i iVar3 = (i) p1Var2.getF182175a();
            w20.a aVar2 = dVar.f62992d;
            Boolean boolValueOf = Boolean.valueOf(dVar.f62998j);
            boolean zR = o0Var.r(dVar);
            Object objQ9 = o0Var.q();
            if (zR || objQ9 == c2565a) {
                objQ9 = new c(dVar, p1Var2, null);
                o0Var.K(objQ9);
            }
            l0.g(iVar3, aVar2, boolValueOf, (p) objQ9, o0Var);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0Var.r(d2Var) | o0Var.B(a1VarD) | o0Var.r(context) | ((i15 & 896) == 256);
            Object objQ10 = o0Var.q();
            if (zR2 || objQ10 == c2565a) {
                C0352d c0352d = new C0352d(d2Var, a1VarD, context, lVar, p1Var, p1Var2, n1Var, n1Var3, p1Var4, p1Var3, null);
                o0Var.K(c0352d);
                objQ10 = c0352d;
            }
            l0.e((p) objQ10, unit, o0Var);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(dVar, d2Var, lVar, i14, 29);
        }
    }
}
