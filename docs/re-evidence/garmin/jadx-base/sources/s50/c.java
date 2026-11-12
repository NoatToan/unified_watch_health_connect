package s50;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.g;
import com.garmin.android.library.mapsdkadapter.f;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.LatLng;
import ds.e0;
import e23.l;
import e23.p;
import i3.a1;
import i3.e5;
import i3.mc;
import i3.z0;
import java.util.Comparator;
import o13.r;
import o4.d0;
import o53.b0;
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
import rx1.u;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.components.CoursePointListBottomSheetKt$CoursePointListBottomSheet$3$1", f = "CoursePointListBottomSheet.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f157342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<c50.i> f157343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1 f157344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n1 f157345e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1 a1Var, p1<c50.i> p1Var, n1 n1Var, n1 n1Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157342b = a1Var;
            this.f157343c = p1Var;
            this.f157344d = n1Var;
            this.f157345e = n1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157342b, this.f157343c, this.f157344d, this.f157345e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157341a;
            if (i14 == 0) {
                r.b(obj);
                p1<c50.i> p1Var = this.f157343c;
                c50.i f182175a = p1Var.getF182175a();
                if (f182175a != null && f182175a.isAdded()) {
                    int intValue = this.f157344d.getIntValue();
                    n1 n1Var = this.f157345e;
                    n1Var.t(intValue);
                    c50.i f182175a2 = p1Var.getF182175a();
                    if (f182175a2 != null) {
                        f182175a2.y6(n1Var.getIntValue());
                    }
                    c50.i f182175a3 = p1Var.getF182175a();
                    if (f182175a3 != null) {
                        f182175a3.u6(f182175a3.f97019x, f182175a3.f148290a);
                    }
                }
                mc mcVar = this.f157342b.f87409a;
                this.f157341a = 1;
                if (mcVar.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.components.CoursePointListBottomSheetKt$CoursePointListBottomSheet$4$1", f = "CoursePointListBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<c50.i> f157346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f157347b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<c50.i> p1Var, p1<Boolean> p1Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f157346a = p1Var;
            this.f157347b = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f157346a, this.f157347b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c50.i f182175a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<c50.i> p1Var = this.f157346a;
            c50.i f182175a2 = p1Var.getF182175a();
            if (f182175a2 != null && f182175a2.isAdded() && (f182175a = p1Var.getF182175a()) != null) {
                f182175a.M0 = this.f157347b.getF182175a().booleanValue();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: s50.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.components.CoursePointListBottomSheetKt$CoursePointListBottomSheet$5$1", f = "CoursePointListBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2964c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t50.e f157348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<c50.i> f157349b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2964c(t50.e eVar, p1<c50.i> p1Var, t13.d<? super C2964c> dVar) {
            super(2, dVar);
            this.f157348a = eVar;
            this.f157349b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2964c(this.f157348a, this.f157349b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2964c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c50.i f182175a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<c50.i> p1Var = this.f157349b;
            c50.i f182175a2 = p1Var.getF182175a();
            if (f182175a2 != null && f182175a2.isAdded()) {
                t50.e eVar = this.f157348a;
                if (eVar.f162543c != null && (f182175a = p1Var.getF182175a()) != null) {
                    f182175a.e8(eVar.f162543c);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.components.CoursePointListBottomSheetKt$CoursePointListBottomSheet$6$1", f = "CoursePointListBottomSheet.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2<t50.c> f157351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a1 f157352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f157353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<t50.b, Unit> f157354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f157355f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<c50.i> f157356g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n1 f157357h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n1 f157358i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p1<Drawable> f157359j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f157360k;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a1 f157361a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f157362b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l<t50.b, Unit> f157363c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f157364d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p1<c50.i> f157365e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ n1 f157366f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ n1 f157367g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ p1<Drawable> f157368h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f157369i;

            /* JADX WARN: Multi-variable type inference failed */
            public a(a1 a1Var, Context context, l<? super t50.b, Unit> lVar, p1<Boolean> p1Var, p1<c50.i> p1Var2, n1 n1Var, n1 n1Var2, p1<Drawable> p1Var3, p1<Boolean> p1Var4) {
                this.f157361a = a1Var;
                this.f157362b = context;
                this.f157363c = lVar;
                this.f157364d = p1Var;
                this.f157365e = p1Var2;
                this.f157366f = n1Var;
                this.f157367g = n1Var2;
                this.f157368h = p1Var3;
                this.f157369i = p1Var4;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                c50.i f182175a;
                f fVarT6;
                c50.i f182175a2;
                c50.i f182175a3;
                c50.i f182175a4;
                c50.i f182175a5;
                c50.i f182175a6;
                c50.i f182175a7;
                t50.c cVar = (t50.c) obj;
                boolean zG = s.g(cVar, t50.c.j.f162526a);
                a1 a1Var = this.f157361a;
                p1<Boolean> p1Var = this.f157364d;
                if (zG) {
                    p1Var.setValue(Boolean.FALSE);
                    Object objB = a1Var.f87409a.b(dVar);
                    return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
                }
                if (s.g(cVar, t50.c.k.f162527a)) {
                    p1Var.setValue(Boolean.TRUE);
                    Object objF = a1Var.f87409a.f(dVar);
                    return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
                }
                boolean z14 = cVar instanceof t50.c.n;
                p1<c50.i> p1Var2 = this.f157365e;
                if (z14) {
                    c50.i f182175a8 = p1Var2.getF182175a();
                    if (f182175a8 != null && f182175a8.isAdded()) {
                        int iMax = Math.max(this.f157366f.getIntValue(), ((t50.c.n) cVar).f162530a);
                        n1 n1Var = this.f157367g;
                        n1Var.t(iMax);
                        c50.i f182175a9 = p1Var2.getF182175a();
                        if (f182175a9 != null) {
                            f182175a9.y6(n1Var.getIntValue());
                        }
                    }
                } else if (cVar instanceof t50.c.p) {
                    c50.i f182175a10 = p1Var2.getF182175a();
                    if (f182175a10 != null && f182175a10.isAdded() && (f182175a7 = p1Var2.getF182175a()) != null) {
                        f182175a7.G6(((t50.c.p) cVar).f162532a);
                    }
                } else {
                    boolean z15 = cVar instanceof t50.c.g;
                    Context context = this.f157362b;
                    p1<Drawable> p1Var3 = this.f157368h;
                    p1<Boolean> p1Var4 = this.f157369i;
                    if (z15) {
                        p1Var3.setValue(new u40.h(context, ((t50.c.g) cVar).f162523a));
                        p1Var4.setValue(Boolean.TRUE);
                    } else if (cVar instanceof t50.c.h) {
                        p1Var4.setValue(Boolean.FALSE);
                    } else if (cVar instanceof t50.c.b) {
                        c50.i f182175a11 = p1Var2.getF182175a();
                        if (f182175a11 != null && f182175a11.isAdded() && (f182175a6 = p1Var2.getF182175a()) != null) {
                            t50.c.b bVar = (t50.c.b) cVar;
                            j40.c.E6(f182175a6, bVar.f162513a, bVar.f162514b, bVar.f162515c, bVar.f162516d, bVar.f162517e);
                        }
                    } else if (cVar instanceof t50.c.a) {
                        c50.i f182175a12 = p1Var2.getF182175a();
                        if (f182175a12 != null && f182175a12.isAdded() && (f182175a5 = p1Var2.getF182175a()) != null) {
                            t50.c.a aVar = (t50.c.a) cVar;
                            f182175a5.A6(aVar.f162508a, aVar.f162509b, aVar.f162510c, aVar.f162511d, aVar.f162512e, null);
                        }
                    } else if (cVar instanceof t50.c.l) {
                        c50.i f182175a13 = p1Var2.getF182175a();
                        if (f182175a13 != null && f182175a13.isAdded()) {
                            c50.i f182175a14 = p1Var2.getF182175a();
                            if (f182175a14 != null) {
                                f182175a14.j7(((t50.c.l) cVar).f162528a, 1.0f);
                            }
                            g gVar = ((t50.c.l) cVar).f162528a;
                            Double d14 = gVar.lat;
                            Double d15 = gVar.lon;
                            if (zf.b.D(d14) && zf.b.D(d15)) {
                                c50.i f182175a15 = p1Var2.getF182175a();
                                if (f182175a15 != null) {
                                    f182175a15.c8(new LatLng(d14.doubleValue(), d15.doubleValue()));
                                }
                                c50.i f182175a16 = p1Var2.getF182175a();
                                if (f182175a16 != null) {
                                    f182175a16.m2();
                                }
                            }
                        }
                    } else if (cVar instanceof t50.c.m) {
                        c50.i f182175a17 = p1Var2.getF182175a();
                        if (f182175a17 != null && f182175a17.isAdded() && (f182175a4 = p1Var2.getF182175a()) != null) {
                            f182175a4.G7(((t50.c.m) cVar).f162529a);
                        }
                    } else if (cVar instanceof t50.c.r) {
                        c50.i f182175a18 = p1Var2.getF182175a();
                        if (f182175a18 != null && f182175a18.isAdded() && (f182175a3 = p1Var2.getF182175a()) != null) {
                            f182175a3.X7(((t50.c.r) cVar).f162535a);
                        }
                    } else if (cVar instanceof t50.c.f) {
                        c50.i f182175a19 = p1Var2.getF182175a();
                        if (f182175a19 != null && f182175a19.isAdded() && (f182175a2 = p1Var2.getF182175a()) != null) {
                            j40.c.J6(f182175a2, ((t50.c.f) cVar).f162522a);
                        }
                    } else if (cVar instanceof t50.c.i) {
                        c50.i f182175a20 = p1Var2.getF182175a();
                        if (f182175a20 != null && f182175a20.isAdded()) {
                            com.garmin.android.apps.connectmobile.courses.model.f.a aVar2 = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
                            g gVar2 = ((t50.c.i) cVar).f162525a;
                            String coursePointType = gVar2.getCoursePointType();
                            aVar2.getClass();
                            p1Var3.setValue(new u40.h(context, com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType)));
                            p1Var4.setValue(Boolean.TRUE);
                            c50.i f182175a21 = p1Var2.getF182175a();
                            if (f182175a21 != null) {
                                f182175a21.j7(gVar2, 0.5f);
                            }
                            Double d16 = gVar2.lat;
                            Double d17 = gVar2.lon;
                            if (zf.b.D(d16) && zf.b.D(d17)) {
                                c50.i f182175a22 = p1Var2.getF182175a();
                                if (f182175a22 != null) {
                                    f182175a22.c8(new LatLng(d16.doubleValue(), d17.doubleValue()));
                                }
                                c50.i f182175a23 = p1Var2.getF182175a();
                                if (f182175a23 != null) {
                                    f182175a23.m2();
                                }
                            }
                        }
                    } else {
                        boolean z16 = cVar instanceof t50.c.d;
                        l<t50.b, Unit> lVar = this.f157363c;
                        if (z16) {
                            c50.i f182175a24 = p1Var2.getF182175a();
                            if (f182175a24 != null && f182175a24.isAdded()) {
                                c50.i f182175a25 = p1Var2.getF182175a();
                                fVarT6 = f182175a25 != null ? f182175a25.T6() : null;
                                if (fVarT6 != null) {
                                    g gVar3 = ((t50.c.d) cVar).f162520a;
                                    LatLng latLng = fVarT6.f50283a;
                                    lVar.invoke(new t50.b.i(gVar3, new GeoPointDTO(latLng.latitude, latLng.longitude)));
                                }
                            }
                        } else if ((cVar instanceof t50.c.e) && (f182175a = p1Var2.getF182175a()) != null && f182175a.isAdded()) {
                            c50.i f182175a26 = p1Var2.getF182175a();
                            fVarT6 = f182175a26 != null ? f182175a26.T6() : null;
                            if (fVarT6 != null) {
                                lVar.invoke(new t50.b.j(((t50.c.e) cVar).f162521a, fVarT6));
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(d2<? extends t50.c> d2Var, a1 a1Var, Context context, l<? super t50.b, Unit> lVar, p1<Boolean> p1Var, p1<c50.i> p1Var2, n1 n1Var, n1 n1Var2, p1<Drawable> p1Var3, p1<Boolean> p1Var4, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f157351b = d2Var;
            this.f157352c = a1Var;
            this.f157353d = context;
            this.f157354e = lVar;
            this.f157355f = p1Var;
            this.f157356g = p1Var2;
            this.f157357h = n1Var;
            this.f157358i = n1Var2;
            this.f157359j = p1Var3;
            this.f157360k = p1Var4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f157351b, this.f157352c, this.f157353d, this.f157354e, this.f157355f, this.f157356g, this.f157357h, this.f157358i, this.f157359j, this.f157360k, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157350a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(this.f157352c, this.f157353d, this.f157354e, this.f157355f, this.f157356g, this.f157357h, this.f157358i, this.f157359j, this.f157360k);
                this.f157350a = 1;
                if (this.f157351b.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            Double distance = ((g) t7).getDistance();
            Double dValueOf = Double.valueOf(distance != null ? distance.doubleValue() : 0.0d);
            Double distance2 = ((g) t14).getDistance();
            return r13.a.b(dValueOf, Double.valueOf(distance2 != null ? distance2.doubleValue() : 0.0d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(t50.e eVar, d2<? extends t50.c> d2Var, l<? super t50.b, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        float fX;
        n1 n1Var;
        eVar.getClass();
        d2Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(810998420);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(d2Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
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
                o0VarE.C(1980426422);
                o0VarE.g0(false);
                fX = 0;
                g6.f.a aVar = g6.f.f75994b;
            } else {
                o0VarE.C(1980427100);
                fX = w02.b0.x(o0VarE, n1Var2.getIntValue());
                o0VarE.g0(false);
            }
            float f14 = ((g6.f) s1.f.a(fX, null, "CoursePointListSheetPeekHeight", o0VarE, 384, 10).getF182175a()).f75997a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar = j92.b.f97900c;
            float f15 = dVar.f97912d;
            bVar.getClass();
            k2.h hVarC = k2.i.c(f15, dVar.f97912d, 0.0f, 0.0f, 12);
            long jF = e0.f(o0VarE);
            d0.f128823b.getClass();
            z0.a(z3.f.c(294628581, new mw0.h(eVar, lVar, context, n1Var2, 17), o0VarE), null, a1VarD, f14, 0.0f, hVarC, jF, d0.f128831j, 0.0f, 0.0f, null, false, null, 0L, 0L, z3.f.c(-1536487857, new ak0.h(eVar, lVar, p1Var2, p1Var3, p1Var4, n1Var3, 21), o0VarE), o0VarE, 12582918, 1572870, 64274);
            o0Var = o0VarE;
            c50.i iVar = (c50.i) p1Var2.getF182175a();
            Integer numValueOf = Integer.valueOf(n1Var2.getIntValue());
            boolean zB = o0Var.B(a1VarD);
            Object objQ7 = o0Var.q();
            if (zB || objQ7 == c2565a) {
                n1Var = n1Var2;
                a aVar2 = new a(a1VarD, p1Var2, n1Var, n1Var3, null);
                o0Var.K(aVar2);
                objQ7 = aVar2;
            } else {
                n1Var = n1Var2;
            }
            l0.f(iVar, numValueOf, (p) objQ7, o0Var);
            c50.i iVar2 = (c50.i) p1Var2.getF182175a();
            Boolean bool = (Boolean) p1Var3.getF182175a();
            bool.booleanValue();
            Object objQ8 = o0Var.q();
            if (objQ8 == c2565a) {
                objQ8 = new b(p1Var2, p1Var3, null);
                o0Var.K(objQ8);
            }
            l0.f(iVar2, bool, (p) objQ8, o0Var);
            c50.i iVar3 = (c50.i) p1Var2.getF182175a();
            w20.a aVar3 = eVar.f162543c;
            boolean zR = o0Var.r(eVar);
            Object objQ9 = o0Var.q();
            if (zR || objQ9 == c2565a) {
                objQ9 = new C2964c(eVar, p1Var2, null);
                o0Var.K(objQ9);
            }
            l0.f(iVar3, aVar3, (p) objQ9, o0Var);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0Var.r(d2Var) | o0Var.B(a1VarD) | o0Var.r(context) | ((i15 & 896) == 256);
            Object objQ10 = o0Var.q();
            if (zR2 || objQ10 == c2565a) {
                d dVar2 = new d(d2Var, a1VarD, context, lVar, p1Var, p1Var2, n1Var, n1Var3, p1Var4, p1Var3, null);
                o0Var.K(dVar2);
                objQ10 = dVar2;
            }
            l0.e((p) objQ10, unit, o0Var);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(eVar, d2Var, lVar, i14, 4);
        }
    }
}
