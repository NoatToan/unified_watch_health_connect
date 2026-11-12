package lx1;

import c83.a0;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import ix1.k;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import o72.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2", f = "STPRepoImpl.kt", l = {81, 82, 83, 84, 85, 104}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f115215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f115216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f115217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f115218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2 f115219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2 f115220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v2 f115221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v2 f115222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v2 f115223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f115224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f115225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ lx1.e f115226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f115227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f115228n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lix1/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$1", f = "STPRepoImpl.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super v2<? extends k>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lx1.e f115230b;

        /* JADX INFO: renamed from: lx1.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lix1/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$1$1", f = "STPRepoImpl.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class C2193a extends i implements l<t13.d<? super a0<k>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f115231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ lx1.e f115232b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2193a(lx1.e eVar, t13.d<? super C2193a> dVar) {
                super(1, dVar);
                this.f115232b = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new C2193a(this.f115232b, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super a0<k>> dVar) {
                return ((C2193a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f115231a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                jx1.b bVar = this.f115232b.f115261a;
                this.f115231a = 1;
                Object objA = bVar.a(this);
                return objA == aVar ? aVar : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lx1.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f115230b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f115230b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends k>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115229a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            lx1.e eVar = this.f115230b;
            C2193a c2193a = new C2193a(eVar, null);
            this.f115229a = 1;
            eVar.getClass();
            Object objJ = f0.J(eVar, c2193a, this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$2", f = "STPRepoImpl.kt", l = {62}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super v2<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lx1.e f115234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f115235c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$2$1", f = "STPRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements l<t13.d<? super a0<String>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lx1.e f115236a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f115237b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lx1.e eVar, boolean z14, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f115236a = eVar;
                this.f115237b = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f115236a, this.f115237b, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super a0<String>> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return t.E(this.f115236a.f115263c, this.f115237b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lx1.e eVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f115234b = eVar;
            this.f115235c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f115234b, this.f115235c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends String>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115233a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            boolean z14 = this.f115235c;
            lx1.e eVar = this.f115234b;
            a aVar2 = new a(eVar, z14, null);
            this.f115233a = 1;
            eVar.getClass();
            Object objJ = f0.J(eVar, aVar2, this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX INFO: renamed from: lx1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$3", f = "STPRepoImpl.kt", l = {67}, m = "invokeSuspend", v = 2)
    public static final class C2194c extends i implements p<b0, t13.d<? super v2<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lx1.e f115239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f115240c;

        /* JADX INFO: renamed from: lx1.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$3$1", f = "STPRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements l<t13.d<? super a0<String>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lx1.e f115241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f115242b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lx1.e eVar, String str, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f115241a = eVar;
                this.f115242b = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f115241a, this.f115242b, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super a0<String>> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                a0<String> a0VarExecute = this.f115241a.f115263c.j(oc.b.A(this.f115242b)).execute();
                a0VarExecute.getClass();
                return a0VarExecute;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2194c(lx1.e eVar, String str, t13.d<? super C2194c> dVar) {
            super(2, dVar);
            this.f115239b = eVar;
            this.f115240c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2194c(this.f115239b, this.f115240c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends String>> dVar) {
            return ((C2194c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115238a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            String str = this.f115240c;
            lx1.e eVar = this.f115239b;
            a aVar2 = new a(eVar, str, null);
            this.f115238a = 1;
            eVar.getClass();
            Object objJ = f0.J(eVar, aVar2, this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$4", f = "STPRepoImpl.kt", l = {72}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lx1.e f115244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(lx1.e eVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f115244b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f115244b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115243a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            e3 e3Var = this.f115244b.f115264d;
            this.f115243a = 1;
            Object objM = e3Var.M(this);
            return objM == aVar ? aVar : objM;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lix1/h;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$5", f = "STPRepoImpl.kt", l = {77}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements p<b0, t13.d<? super v2<? extends ix1.h>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lx1.e f115246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f115247c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lix1/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$5$1", f = "STPRepoImpl.kt", l = {77}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements l<t13.d<? super a0<ix1.h>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f115248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ lx1.e f115249b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Long f115250c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lx1.e eVar, Long l14, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f115249b = eVar;
                this.f115250c = l14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f115249b, this.f115250c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super a0<ix1.h>> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f115248a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                jx1.a aVar2 = this.f115249b.f115262b;
                long jLongValue = this.f115250c.longValue();
                this.f115248a = 1;
                Object objA = aVar2.a(jLongValue, this);
                return objA == aVar ? aVar : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lx1.e eVar, Long l14, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f115246b = eVar;
            this.f115247c = l14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f115246b, this.f115247c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends ix1.h>> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115245a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            Long l14 = this.f115247c;
            lx1.e eVar = this.f115246b;
            a aVar2 = new a(eVar, l14, null);
            this.f115245a = 1;
            eVar.getClass();
            Object objJ = f0.J(eVar, aVar2, this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$6", f = "STPRepoImpl.kt", l = {102}, m = "invokeSuspend", v = 2)
    public static final class f extends i implements p<b0, t13.d<? super v2<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lx1.e f115252b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$loadData$2$6$1", f = "STPRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements l<t13.d<? super a0<String>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lx1.e f115253a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lx1.e eVar, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f115253a = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f115253a, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super a0<String>> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                a0<String> a0VarExecute = this.f115253a.f115263c.j("en").execute();
                a0VarExecute.getClass();
                return a0VarExecute;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(lx1.e eVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f115252b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f115252b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends String>> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115251a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            lx1.e eVar = this.f115252b;
            a aVar2 = new a(eVar, null);
            this.f115251a = 1;
            eVar.getClass();
            Object objJ = f0.J(eVar, aVar2, this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(lx1.e eVar, Long l14, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f115226l = eVar;
        this.f115227m = l14;
        this.f115228n = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f115226l, this.f115227m, this.f115228n, dVar);
        cVar.f115225k = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0233  */
    /* JADX WARN: Code duplicated, block: B:106:0x023d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0247  */
    /* JADX WARN: Code duplicated, block: B:110:0x024d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0251  */
    /* JADX WARN: Code duplicated, block: B:116:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0270  */
    /* JADX WARN: Code duplicated, block: B:122:0x027c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0288  */
    /* JADX WARN: Code duplicated, block: B:128:0x0292  */
    /* JADX WARN: Code duplicated, block: B:130:0x029c  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:159:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0156  */
    /* JADX WARN: Code duplicated, block: B:59:0x0162  */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0199  */
    /* JADX WARN: Code duplicated, block: B:73:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x020d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0229  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r15 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0129, code lost:
    
        if (r15 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0181, code lost:
    
        if (r15 == r1) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        i0 i0VarJ;
        i0 i0VarJ2;
        i0 i0VarJ3;
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        v2 v2Var;
        i0 i0Var4;
        i0 i0Var5;
        v2 v2Var2;
        v2 v2Var3;
        Object objAwait;
        i0 i0Var6;
        i0 i0Var7;
        v2 v2Var4;
        v2 v2Var5;
        v2 v2Var6;
        v2 v2Var7;
        v2 v2Var8;
        v2 v2Var9;
        v2 v2Var10;
        Object objAwait2;
        i0 i0Var8;
        v2 v2Var11;
        Object objC;
        v2 v2Var12;
        v2 v2Var13;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVarA;
        List<com.garmin.android.apps.connectmobile.repcounting.model.d> listI0;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list;
        List<com.garmin.android.apps.connectmobile.repcounting.model.d> list2;
        String str;
        Iterator<T> it;
        Object next;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar2;
        List<com.garmin.android.apps.connectmobile.repcounting.model.d> list3;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr;
        List<com.garmin.android.apps.connectmobile.repcounting.model.d> listI1;
        List<com.garmin.android.apps.connectmobile.repcounting.model.d> list4;
        String str2;
        v2 v2Var14;
        b0 b0Var = (b0) this.f115225k;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115224j;
        boolean z14 = true;
        String str3 = this.f115228n;
        Long l14 = this.f115227m;
        lx1.e eVar = this.f115226l;
        switch (i14) {
            case 0:
                r.b(obj);
                j0 j0VarJ2 = eVar.f115265e == null ? ge1.b.j(b0Var, null, null, new a(eVar, null), 3) : null;
                if (eVar.f115266f == null) {
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    j0VarJ = ge1.b.j(b0Var, null, null, new b(eVar, k1.f37122a.F(), null), 3);
                } else {
                    j0VarJ = null;
                }
                i0VarJ = eVar.f115268h == null ? ge1.b.j(b0Var, null, null, new C2194c(eVar, str3, null), 3) : null;
                i0VarJ2 = (eVar.f115269i == null && l14 == null) ? ge1.b.j(b0Var, null, null, new d(eVar, null), 3) : null;
                i0VarJ3 = (eVar.f115270j != null || l14 == null) ? null : ge1.b.j(b0Var, null, null, new e(eVar, l14, null), 3);
                if (j0VarJ2 != null) {
                    this.f115225k = b0Var;
                    this.f115215a = j0VarJ;
                    this.f115216b = i0VarJ;
                    this.f115217c = i0VarJ2;
                    this.f115218d = i0VarJ3;
                    this.f115224j = 1;
                    obj = j0VarJ2.C(this);
                    break;
                } else {
                    i0Var = i0VarJ;
                    i0Var2 = i0VarJ2;
                    i0Var3 = i0VarJ3;
                    v2Var = null;
                    if (j0VarJ == null) {
                        i0Var4 = i0Var2;
                        i0Var5 = i0Var3;
                        v2Var2 = v2Var;
                        v2Var3 = null;
                        if (i0Var != null) {
                            i0Var7 = i0Var5;
                            v2Var4 = v2Var2;
                            v2Var5 = v2Var3;
                            v2Var6 = null;
                            if (i0Var4 == null) {
                                v2Var7 = v2Var4;
                                v2Var8 = v2Var5;
                                v2Var9 = v2Var6;
                                v2Var10 = null;
                                if (i0Var7 == null) {
                                    v2Var11 = null;
                                    if (v2Var7 instanceof v2.b) {
                                        eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                                    }
                                    if (v2Var8 instanceof v2.b) {
                                        com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                        String str4 = (String) ((v2.b) v2Var8).f47386a;
                                        bVar.getClass();
                                        cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str4);
                                        if (cVarA != null) {
                                            listI0 = null;
                                        } else {
                                            listI0 = null;
                                        }
                                        eVar.f115266f = listI0;
                                    }
                                    if (v2Var9 instanceof v2.b) {
                                        eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                                    } else if (!s.g(str3, "en")) {
                                        j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                        this.f115225k = null;
                                        this.f115215a = null;
                                        this.f115216b = null;
                                        this.f115217c = null;
                                        this.f115218d = null;
                                        this.f115219e = null;
                                        this.f115220f = null;
                                        this.f115221g = null;
                                        this.f115222h = v2Var10;
                                        this.f115223i = v2Var11;
                                        this.f115224j = 6;
                                        objC = j0VarJ3.C(this);
                                        if (objC != aVar) {
                                            v2Var12 = v2Var11;
                                            obj = objC;
                                            v2Var13 = v2Var10;
                                            v2Var14 = (v2) obj;
                                            if (v2Var14 instanceof v2.b) {
                                                eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                            }
                                            v2Var11 = v2Var12;
                                            v2Var10 = v2Var13;
                                        }
                                    }
                                    if (eVar.f115267g == null) {
                                        com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar2 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                        dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                        String str5 = eVar.f115268h;
                                        bVar2.getClass();
                                        com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str5);
                                        if (dVarArr != null) {
                                            listI1 = u.i0(dVarArr);
                                        } else {
                                            listI1 = null;
                                        }
                                        eVar.f115267g = listI1;
                                        if (listI1 != null) {
                                            while (r0.hasNext()) {
                                                str2 = dVar.f41103b;
                                                if (str2 == null) {
                                                    str2 = dVar.f41102a;
                                                } else {
                                                    if (str2.length() == 0) {
                                                        str2 = dVar.f41102a;
                                                    }
                                                    if (str2 == null) {
                                                        str2 = dVar.f41102a;
                                                    }
                                                }
                                                dVar.f41103b = str2;
                                            }
                                        }
                                        list4 = eVar.f115267g;
                                        if (list4 != null) {
                                            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                            cVar.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                            eVar.f115271k = cVar;
                                        }
                                    }
                                    if (v2Var10 instanceof v2.b) {
                                        eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                                    }
                                    if (v2Var11 instanceof v2.b) {
                                        eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                                    }
                                    list = eVar.f115269i;
                                    if (list != null) {
                                        while (r15.hasNext()) {
                                            list2 = eVar.f115267g;
                                            if (list2 != null) {
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                        if (s.g(dVar2.f41106e, bVar.getBenchmarkKey())) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                if (dVar != null) {
                                                    str = dVar.f41107f;
                                                } else {
                                                    str = null;
                                                }
                                            } else {
                                                str = null;
                                            }
                                            bVar.r(str);
                                        }
                                    }
                                    if (eVar.f115265e != null) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                                }
                                this.f115225k = b0Var;
                                this.f115215a = null;
                                this.f115216b = null;
                                this.f115217c = null;
                                this.f115218d = null;
                                this.f115219e = v2Var7;
                                this.f115220f = v2Var8;
                                this.f115221g = v2Var9;
                                this.f115222h = v2Var10;
                                this.f115224j = 5;
                                obj = i0Var7.await(this);
                            } else {
                                this.f115225k = b0Var;
                                this.f115215a = null;
                                this.f115216b = null;
                                this.f115217c = null;
                                this.f115218d = i0Var7;
                                this.f115219e = v2Var4;
                                this.f115220f = v2Var5;
                                this.f115221g = v2Var6;
                                this.f115224j = 4;
                                objAwait2 = i0Var4.await(this);
                                if (objAwait2 != aVar) {
                                    i0Var8 = i0Var7;
                                    obj = objAwait2;
                                    v2 v2Var15 = v2Var6;
                                    v2Var10 = (v2) obj;
                                    i0Var7 = i0Var8;
                                    v2Var7 = v2Var4;
                                    v2Var8 = v2Var5;
                                    v2Var9 = v2Var15;
                                    if (i0Var7 == null) {
                                        v2Var11 = null;
                                        if (v2Var7 instanceof v2.b) {
                                            eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                                        }
                                        if (v2Var8 instanceof v2.b) {
                                            com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar3 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                            String str6 = (String) ((v2.b) v2Var8).f47386a;
                                            bVar3.getClass();
                                            cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str6);
                                            if (cVarA != null) {
                                                listI0 = null;
                                            } else {
                                                listI0 = null;
                                            }
                                            eVar.f115266f = listI0;
                                        }
                                        if (v2Var9 instanceof v2.b) {
                                            eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                                        } else if (!s.g(str3, "en")) {
                                            j0 j0VarJ4 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                            this.f115225k = null;
                                            this.f115215a = null;
                                            this.f115216b = null;
                                            this.f115217c = null;
                                            this.f115218d = null;
                                            this.f115219e = null;
                                            this.f115220f = null;
                                            this.f115221g = null;
                                            this.f115222h = v2Var10;
                                            this.f115223i = v2Var11;
                                            this.f115224j = 6;
                                            objC = j0VarJ4.C(this);
                                            if (objC != aVar) {
                                                v2Var12 = v2Var11;
                                                obj = objC;
                                                v2Var13 = v2Var10;
                                                v2Var14 = (v2) obj;
                                                if (v2Var14 instanceof v2.b) {
                                                    eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                                }
                                                v2Var11 = v2Var12;
                                                v2Var10 = v2Var13;
                                            }
                                        }
                                        if (eVar.f115267g == null) {
                                            com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar4 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                            dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                            String str7 = eVar.f115268h;
                                            bVar4.getClass();
                                            com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str7);
                                            if (dVarArr != null) {
                                                listI1 = u.i0(dVarArr);
                                            } else {
                                                listI1 = null;
                                            }
                                            eVar.f115267g = listI1;
                                            if (listI1 != null) {
                                                while (r0.hasNext()) {
                                                    str2 = dVar.f41103b;
                                                    if (str2 == null) {
                                                        str2 = dVar.f41102a;
                                                    } else {
                                                        if (str2.length() == 0) {
                                                            str2 = dVar.f41102a;
                                                        }
                                                        if (str2 == null) {
                                                            str2 = dVar.f41102a;
                                                        }
                                                    }
                                                    dVar.f41103b = str2;
                                                }
                                            }
                                            list4 = eVar.f115267g;
                                            if (list4 != null) {
                                                com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                                cVar2.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                                eVar.f115271k = cVar2;
                                            }
                                        }
                                        if (v2Var10 instanceof v2.b) {
                                            eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                                        }
                                        if (v2Var11 instanceof v2.b) {
                                            eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                                        }
                                        list = eVar.f115269i;
                                        if (list != null) {
                                            while (r15.hasNext()) {
                                                list2 = eVar.f115267g;
                                                if (list2 != null) {
                                                    it = list2.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                            dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                            if (s.g(dVar2.f41106e, bVar.getBenchmarkKey())) {
                                                            }
                                                        } else {
                                                            next = null;
                                                        }
                                                    }
                                                    dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                    if (dVar != null) {
                                                        str = dVar.f41107f;
                                                    } else {
                                                        str = null;
                                                    }
                                                } else {
                                                    str = null;
                                                }
                                                bVar.r(str);
                                            }
                                        }
                                        if (eVar.f115265e != null) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        return Boolean.valueOf(z14);
                                    }
                                    this.f115225k = b0Var;
                                    this.f115215a = null;
                                    this.f115216b = null;
                                    this.f115217c = null;
                                    this.f115218d = null;
                                    this.f115219e = v2Var7;
                                    this.f115220f = v2Var8;
                                    this.f115221g = v2Var9;
                                    this.f115222h = v2Var10;
                                    this.f115224j = 5;
                                    obj = i0Var7.await(this);
                                }
                            }
                        } else {
                            this.f115225k = b0Var;
                            this.f115215a = null;
                            this.f115216b = null;
                            this.f115217c = i0Var4;
                            this.f115218d = i0Var5;
                            this.f115219e = v2Var2;
                            this.f115220f = v2Var3;
                            this.f115224j = 3;
                            obj = i0Var.await(this);
                        }
                    } else {
                        this.f115225k = b0Var;
                        this.f115215a = null;
                        this.f115216b = i0Var;
                        this.f115217c = i0Var2;
                        this.f115218d = i0Var3;
                        this.f115219e = v2Var;
                        this.f115224j = 2;
                        objAwait = j0VarJ.await(this);
                        if (objAwait != aVar) {
                            i0Var6 = i0Var;
                            obj = objAwait;
                            v2 v2Var16 = v2Var;
                            v2Var3 = (v2) obj;
                            i0Var = i0Var6;
                            i0Var4 = i0Var2;
                            i0Var5 = i0Var3;
                            v2Var2 = v2Var16;
                            if (i0Var != null) {
                                i0Var7 = i0Var5;
                                v2Var4 = v2Var2;
                                v2Var5 = v2Var3;
                                v2Var6 = null;
                                if (i0Var4 == null) {
                                    v2Var7 = v2Var4;
                                    v2Var8 = v2Var5;
                                    v2Var9 = v2Var6;
                                    v2Var10 = null;
                                    if (i0Var7 == null) {
                                        v2Var11 = null;
                                        if (v2Var7 instanceof v2.b) {
                                            eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                                        }
                                        if (v2Var8 instanceof v2.b) {
                                            com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar5 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                            String str8 = (String) ((v2.b) v2Var8).f47386a;
                                            bVar5.getClass();
                                            cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str8);
                                            if (cVarA != null) {
                                                listI0 = null;
                                            } else {
                                                listI0 = null;
                                            }
                                            eVar.f115266f = listI0;
                                        }
                                        if (v2Var9 instanceof v2.b) {
                                            eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                                        } else if (!s.g(str3, "en")) {
                                            j0 j0VarJ5 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                            this.f115225k = null;
                                            this.f115215a = null;
                                            this.f115216b = null;
                                            this.f115217c = null;
                                            this.f115218d = null;
                                            this.f115219e = null;
                                            this.f115220f = null;
                                            this.f115221g = null;
                                            this.f115222h = v2Var10;
                                            this.f115223i = v2Var11;
                                            this.f115224j = 6;
                                            objC = j0VarJ5.C(this);
                                            if (objC != aVar) {
                                                v2Var12 = v2Var11;
                                                obj = objC;
                                                v2Var13 = v2Var10;
                                                v2Var14 = (v2) obj;
                                                if (v2Var14 instanceof v2.b) {
                                                    eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                                }
                                                v2Var11 = v2Var12;
                                                v2Var10 = v2Var13;
                                            }
                                        }
                                        if (eVar.f115267g == null) {
                                            com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar6 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                            dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                            String str9 = eVar.f115268h;
                                            bVar6.getClass();
                                            com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str9);
                                            if (dVarArr != null) {
                                                listI1 = u.i0(dVarArr);
                                            } else {
                                                listI1 = null;
                                            }
                                            eVar.f115267g = listI1;
                                            if (listI1 != null) {
                                                while (r0.hasNext()) {
                                                    str2 = dVar.f41103b;
                                                    if (str2 == null) {
                                                        str2 = dVar.f41102a;
                                                    } else {
                                                        if (str2.length() == 0) {
                                                            str2 = dVar.f41102a;
                                                        }
                                                        if (str2 == null) {
                                                            str2 = dVar.f41102a;
                                                        }
                                                    }
                                                    dVar.f41103b = str2;
                                                }
                                            }
                                            list4 = eVar.f115267g;
                                            if (list4 != null) {
                                                com.garmin.android.apps.connectmobile.repcounting.model.c cVar3 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                                cVar3.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                                eVar.f115271k = cVar3;
                                            }
                                        }
                                        if (v2Var10 instanceof v2.b) {
                                            eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                                        }
                                        if (v2Var11 instanceof v2.b) {
                                            eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                                        }
                                        list = eVar.f115269i;
                                        if (list != null) {
                                            while (r15.hasNext()) {
                                                list2 = eVar.f115267g;
                                                if (list2 != null) {
                                                    it = list2.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                            dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                            if (s.g(dVar2.f41106e, bVar.getBenchmarkKey())) {
                                                            }
                                                        } else {
                                                            next = null;
                                                        }
                                                    }
                                                    dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                    if (dVar != null) {
                                                        str = dVar.f41107f;
                                                    } else {
                                                        str = null;
                                                    }
                                                } else {
                                                    str = null;
                                                }
                                                bVar.r(str);
                                            }
                                        }
                                        if (eVar.f115265e != null) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        return Boolean.valueOf(z14);
                                    }
                                    this.f115225k = b0Var;
                                    this.f115215a = null;
                                    this.f115216b = null;
                                    this.f115217c = null;
                                    this.f115218d = null;
                                    this.f115219e = v2Var7;
                                    this.f115220f = v2Var8;
                                    this.f115221g = v2Var9;
                                    this.f115222h = v2Var10;
                                    this.f115224j = 5;
                                    obj = i0Var7.await(this);
                                } else {
                                    this.f115225k = b0Var;
                                    this.f115215a = null;
                                    this.f115216b = null;
                                    this.f115217c = null;
                                    this.f115218d = i0Var7;
                                    this.f115219e = v2Var4;
                                    this.f115220f = v2Var5;
                                    this.f115221g = v2Var6;
                                    this.f115224j = 4;
                                    objAwait2 = i0Var4.await(this);
                                    if (objAwait2 != aVar) {
                                        i0Var8 = i0Var7;
                                        obj = objAwait2;
                                        v2 v2Var17 = v2Var6;
                                        v2Var10 = (v2) obj;
                                        i0Var7 = i0Var8;
                                        v2Var7 = v2Var4;
                                        v2Var8 = v2Var5;
                                        v2Var9 = v2Var17;
                                        if (i0Var7 == null) {
                                            v2Var11 = null;
                                            if (v2Var7 instanceof v2.b) {
                                                eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                                            }
                                            if (v2Var8 instanceof v2.b) {
                                                com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar7 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                                String str10 = (String) ((v2.b) v2Var8).f47386a;
                                                bVar7.getClass();
                                                cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str10);
                                                if (cVarA != null || (dVarArrF = cVarA.F()) == null) {
                                                    listI0 = null;
                                                } else {
                                                    listI0 = u.i0(dVarArrF);
                                                }
                                                eVar.f115266f = listI0;
                                            }
                                            if (v2Var9 instanceof v2.b) {
                                                eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                                            } else if (!s.g(str3, "en")) {
                                                j0 j0VarJ6 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                                this.f115225k = null;
                                                this.f115215a = null;
                                                this.f115216b = null;
                                                this.f115217c = null;
                                                this.f115218d = null;
                                                this.f115219e = null;
                                                this.f115220f = null;
                                                this.f115221g = null;
                                                this.f115222h = v2Var10;
                                                this.f115223i = v2Var11;
                                                this.f115224j = 6;
                                                objC = j0VarJ6.C(this);
                                                if (objC != aVar) {
                                                    v2Var12 = v2Var11;
                                                    obj = objC;
                                                    v2Var13 = v2Var10;
                                                    v2Var14 = (v2) obj;
                                                    if (v2Var14 instanceof v2.b) {
                                                        eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                                    }
                                                    v2Var11 = v2Var12;
                                                    v2Var10 = v2Var13;
                                                }
                                            }
                                            if (eVar.f115267g == null && (list3 = eVar.f115266f) != null && eVar.f115268h != null) {
                                                com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar8 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                                dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                                String str11 = eVar.f115268h;
                                                bVar8.getClass();
                                                com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str11);
                                                if (dVarArr != null) {
                                                    listI1 = u.i0(dVarArr);
                                                } else {
                                                    listI1 = null;
                                                }
                                                eVar.f115267g = listI1;
                                                if (listI1 != null) {
                                                    for (com.garmin.android.apps.connectmobile.repcounting.model.d dVar3 : listI1) {
                                                        str2 = dVar3.f41103b;
                                                        if (str2 == null) {
                                                            str2 = dVar3.f41102a;
                                                        } else {
                                                            if (str2.length() == 0) {
                                                                str2 = dVar3.f41102a;
                                                            }
                                                            if (str2 == null) {
                                                                str2 = dVar3.f41102a;
                                                            }
                                                        }
                                                        dVar3.f41103b = str2;
                                                    }
                                                }
                                                list4 = eVar.f115267g;
                                                if (list4 != null) {
                                                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar4 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                                    cVar4.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                                    eVar.f115271k = cVar4;
                                                }
                                            }
                                            if (v2Var10 instanceof v2.b) {
                                                eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                                            }
                                            if (v2Var11 instanceof v2.b) {
                                                eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                                            }
                                            list = eVar.f115269i;
                                            if (list != null) {
                                                for (com.garmin.android.apps.connectmobile.workouts.data.model.b bVar9 : list) {
                                                    list2 = eVar.f115267g;
                                                    if (list2 != null) {
                                                        it = list2.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                                if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey()) || !s.g(dVar2.f41102a, bVar9.getBenchmarkCategoryKey())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                        if (dVar != null) {
                                                            str = dVar.f41107f;
                                                        } else {
                                                            str = null;
                                                        }
                                                    } else {
                                                        str = null;
                                                    }
                                                    bVar9.r(str);
                                                }
                                            }
                                            if (eVar.f115265e != null || eVar.f115267g == null || ((l14 != null || eVar.f115269i == null) && eVar.f115270j == null)) {
                                                z14 = false;
                                            }
                                            return Boolean.valueOf(z14);
                                        }
                                        this.f115225k = b0Var;
                                        this.f115215a = null;
                                        this.f115216b = null;
                                        this.f115217c = null;
                                        this.f115218d = null;
                                        this.f115219e = v2Var7;
                                        this.f115220f = v2Var8;
                                        this.f115221g = v2Var9;
                                        this.f115222h = v2Var10;
                                        this.f115224j = 5;
                                        obj = i0Var7.await(this);
                                    }
                                }
                            } else {
                                this.f115225k = b0Var;
                                this.f115215a = null;
                                this.f115216b = null;
                                this.f115217c = i0Var4;
                                this.f115218d = i0Var5;
                                this.f115219e = v2Var2;
                                this.f115220f = v2Var3;
                                this.f115224j = 3;
                                obj = i0Var.await(this);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                i0VarJ3 = this.f115218d;
                i0VarJ2 = this.f115217c;
                i0VarJ = this.f115216b;
                j0VarJ = this.f115215a;
                r.b(obj);
                i0 i0Var9 = i0VarJ3;
                v2Var = (v2) obj;
                i0Var = i0VarJ;
                i0Var2 = i0VarJ2;
                i0Var3 = i0Var9;
                if (j0VarJ == null) {
                    this.f115225k = b0Var;
                    this.f115215a = null;
                    this.f115216b = i0Var;
                    this.f115217c = i0Var2;
                    this.f115218d = i0Var3;
                    this.f115219e = v2Var;
                    this.f115224j = 2;
                    objAwait = j0VarJ.await(this);
                    if (objAwait != aVar) {
                        i0Var6 = i0Var;
                        obj = objAwait;
                        v2 v2Var18 = v2Var;
                        v2Var3 = (v2) obj;
                        i0Var = i0Var6;
                        i0Var4 = i0Var2;
                        i0Var5 = i0Var3;
                        v2Var2 = v2Var18;
                        if (i0Var != null) {
                            i0Var7 = i0Var5;
                            v2Var4 = v2Var2;
                            v2Var5 = v2Var3;
                            v2Var6 = null;
                            if (i0Var4 == null) {
                                v2Var7 = v2Var4;
                                v2Var8 = v2Var5;
                                v2Var9 = v2Var6;
                                v2Var10 = null;
                                if (i0Var7 == null) {
                                    v2Var11 = null;
                                    if (v2Var7 instanceof v2.b) {
                                        eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                                    }
                                    if (v2Var8 instanceof v2.b) {
                                        com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar10 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                        String str12 = (String) ((v2.b) v2Var8).f47386a;
                                        bVar10.getClass();
                                        cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str12);
                                        if (cVarA != null) {
                                            listI0 = null;
                                        } else {
                                            listI0 = null;
                                        }
                                        eVar.f115266f = listI0;
                                    }
                                    if (v2Var9 instanceof v2.b) {
                                        eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                                    } else if (!s.g(str3, "en")) {
                                        j0 j0VarJ7 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                        this.f115225k = null;
                                        this.f115215a = null;
                                        this.f115216b = null;
                                        this.f115217c = null;
                                        this.f115218d = null;
                                        this.f115219e = null;
                                        this.f115220f = null;
                                        this.f115221g = null;
                                        this.f115222h = v2Var10;
                                        this.f115223i = v2Var11;
                                        this.f115224j = 6;
                                        objC = j0VarJ7.C(this);
                                        if (objC != aVar) {
                                            v2Var12 = v2Var11;
                                            obj = objC;
                                            v2Var13 = v2Var10;
                                            v2Var14 = (v2) obj;
                                            if (v2Var14 instanceof v2.b) {
                                                eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                            }
                                            v2Var11 = v2Var12;
                                            v2Var10 = v2Var13;
                                        }
                                    }
                                    if (eVar.f115267g == null) {
                                        com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar11 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                        dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                        String str13 = eVar.f115268h;
                                        bVar11.getClass();
                                        com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str13);
                                        if (dVarArr != null) {
                                            listI1 = u.i0(dVarArr);
                                        } else {
                                            listI1 = null;
                                        }
                                        eVar.f115267g = listI1;
                                        if (listI1 != null) {
                                            while (r0.hasNext()) {
                                                str2 = dVar3.f41103b;
                                                if (str2 == null) {
                                                    str2 = dVar3.f41102a;
                                                } else {
                                                    if (str2.length() == 0) {
                                                        str2 = dVar3.f41102a;
                                                    }
                                                    if (str2 == null) {
                                                        str2 = dVar3.f41102a;
                                                    }
                                                }
                                                dVar3.f41103b = str2;
                                            }
                                        }
                                        list4 = eVar.f115267g;
                                        if (list4 != null) {
                                            com.garmin.android.apps.connectmobile.repcounting.model.c cVar5 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                            cVar5.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                            eVar.f115271k = cVar5;
                                        }
                                    }
                                    if (v2Var10 instanceof v2.b) {
                                        eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                                    }
                                    if (v2Var11 instanceof v2.b) {
                                        eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                                    }
                                    list = eVar.f115269i;
                                    if (list != null) {
                                        while (r15.hasNext()) {
                                            list2 = eVar.f115267g;
                                            if (list2 != null) {
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                        if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                if (dVar != null) {
                                                    str = dVar.f41107f;
                                                } else {
                                                    str = null;
                                                }
                                            } else {
                                                str = null;
                                            }
                                            bVar9.r(str);
                                        }
                                    }
                                    if (eVar.f115265e != null) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                                }
                                this.f115225k = b0Var;
                                this.f115215a = null;
                                this.f115216b = null;
                                this.f115217c = null;
                                this.f115218d = null;
                                this.f115219e = v2Var7;
                                this.f115220f = v2Var8;
                                this.f115221g = v2Var9;
                                this.f115222h = v2Var10;
                                this.f115224j = 5;
                                obj = i0Var7.await(this);
                            } else {
                                this.f115225k = b0Var;
                                this.f115215a = null;
                                this.f115216b = null;
                                this.f115217c = null;
                                this.f115218d = i0Var7;
                                this.f115219e = v2Var4;
                                this.f115220f = v2Var5;
                                this.f115221g = v2Var6;
                                this.f115224j = 4;
                                objAwait2 = i0Var4.await(this);
                                if (objAwait2 != aVar) {
                                    i0Var8 = i0Var7;
                                    obj = objAwait2;
                                    v2 v2Var19 = v2Var6;
                                    v2Var10 = (v2) obj;
                                    i0Var7 = i0Var8;
                                    v2Var7 = v2Var4;
                                    v2Var8 = v2Var5;
                                    v2Var9 = v2Var19;
                                    if (i0Var7 == null) {
                                        v2Var11 = null;
                                        if (v2Var7 instanceof v2.b) {
                                            eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                                        }
                                        if (v2Var8 instanceof v2.b) {
                                            com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar12 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                            String str14 = (String) ((v2.b) v2Var8).f47386a;
                                            bVar12.getClass();
                                            cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str14);
                                            if (cVarA != null) {
                                                listI0 = null;
                                            } else {
                                                listI0 = null;
                                            }
                                            eVar.f115266f = listI0;
                                        }
                                        if (v2Var9 instanceof v2.b) {
                                            eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                                        } else if (!s.g(str3, "en")) {
                                            j0 j0VarJ8 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                            this.f115225k = null;
                                            this.f115215a = null;
                                            this.f115216b = null;
                                            this.f115217c = null;
                                            this.f115218d = null;
                                            this.f115219e = null;
                                            this.f115220f = null;
                                            this.f115221g = null;
                                            this.f115222h = v2Var10;
                                            this.f115223i = v2Var11;
                                            this.f115224j = 6;
                                            objC = j0VarJ8.C(this);
                                            if (objC != aVar) {
                                                v2Var12 = v2Var11;
                                                obj = objC;
                                                v2Var13 = v2Var10;
                                                v2Var14 = (v2) obj;
                                                if (v2Var14 instanceof v2.b) {
                                                    eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                                }
                                                v2Var11 = v2Var12;
                                                v2Var10 = v2Var13;
                                            }
                                        }
                                        if (eVar.f115267g == null) {
                                            com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar13 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                            dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                            String str15 = eVar.f115268h;
                                            bVar13.getClass();
                                            com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str15);
                                            if (dVarArr != null) {
                                                listI1 = u.i0(dVarArr);
                                            } else {
                                                listI1 = null;
                                            }
                                            eVar.f115267g = listI1;
                                            if (listI1 != null) {
                                                while (r0.hasNext()) {
                                                    str2 = dVar3.f41103b;
                                                    if (str2 == null) {
                                                        str2 = dVar3.f41102a;
                                                    } else {
                                                        if (str2.length() == 0) {
                                                            str2 = dVar3.f41102a;
                                                        }
                                                        if (str2 == null) {
                                                            str2 = dVar3.f41102a;
                                                        }
                                                    }
                                                    dVar3.f41103b = str2;
                                                }
                                            }
                                            list4 = eVar.f115267g;
                                            if (list4 != null) {
                                                com.garmin.android.apps.connectmobile.repcounting.model.c cVar6 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                                cVar6.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                                eVar.f115271k = cVar6;
                                            }
                                        }
                                        if (v2Var10 instanceof v2.b) {
                                            eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                                        }
                                        if (v2Var11 instanceof v2.b) {
                                            eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                                        }
                                        list = eVar.f115269i;
                                        if (list != null) {
                                            while (r15.hasNext()) {
                                                list2 = eVar.f115267g;
                                                if (list2 != null) {
                                                    it = list2.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                            dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                            if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                                            }
                                                        } else {
                                                            next = null;
                                                        }
                                                    }
                                                    dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                    if (dVar != null) {
                                                        str = dVar.f41107f;
                                                    } else {
                                                        str = null;
                                                    }
                                                } else {
                                                    str = null;
                                                }
                                                bVar9.r(str);
                                            }
                                        }
                                        if (eVar.f115265e != null) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        return Boolean.valueOf(z14);
                                    }
                                    this.f115225k = b0Var;
                                    this.f115215a = null;
                                    this.f115216b = null;
                                    this.f115217c = null;
                                    this.f115218d = null;
                                    this.f115219e = v2Var7;
                                    this.f115220f = v2Var8;
                                    this.f115221g = v2Var9;
                                    this.f115222h = v2Var10;
                                    this.f115224j = 5;
                                    obj = i0Var7.await(this);
                                }
                            }
                        } else {
                            this.f115225k = b0Var;
                            this.f115215a = null;
                            this.f115216b = null;
                            this.f115217c = i0Var4;
                            this.f115218d = i0Var5;
                            this.f115219e = v2Var2;
                            this.f115220f = v2Var3;
                            this.f115224j = 3;
                            obj = i0Var.await(this);
                        }
                    }
                    break;
                } else {
                    i0Var4 = i0Var2;
                    i0Var5 = i0Var3;
                    v2Var2 = v2Var;
                    v2Var3 = null;
                    if (i0Var != null) {
                        i0Var7 = i0Var5;
                        v2Var4 = v2Var2;
                        v2Var5 = v2Var3;
                        v2Var6 = null;
                        if (i0Var4 == null) {
                            v2Var7 = v2Var4;
                            v2Var8 = v2Var5;
                            v2Var9 = v2Var6;
                            v2Var10 = null;
                            if (i0Var7 == null) {
                                v2Var11 = null;
                                if (v2Var7 instanceof v2.b) {
                                    eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                                }
                                if (v2Var8 instanceof v2.b) {
                                    com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar14 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                    String str16 = (String) ((v2.b) v2Var8).f47386a;
                                    bVar14.getClass();
                                    cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str16);
                                    if (cVarA != null) {
                                        listI0 = null;
                                    } else {
                                        listI0 = null;
                                    }
                                    eVar.f115266f = listI0;
                                }
                                if (v2Var9 instanceof v2.b) {
                                    eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                                } else if (!s.g(str3, "en")) {
                                    j0 j0VarJ9 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                    this.f115225k = null;
                                    this.f115215a = null;
                                    this.f115216b = null;
                                    this.f115217c = null;
                                    this.f115218d = null;
                                    this.f115219e = null;
                                    this.f115220f = null;
                                    this.f115221g = null;
                                    this.f115222h = v2Var10;
                                    this.f115223i = v2Var11;
                                    this.f115224j = 6;
                                    objC = j0VarJ9.C(this);
                                    if (objC != aVar) {
                                        v2Var12 = v2Var11;
                                        obj = objC;
                                        v2Var13 = v2Var10;
                                        v2Var14 = (v2) obj;
                                        if (v2Var14 instanceof v2.b) {
                                            eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                        }
                                        v2Var11 = v2Var12;
                                        v2Var10 = v2Var13;
                                    }
                                }
                                if (eVar.f115267g == null) {
                                    com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar15 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                    dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                    String str17 = eVar.f115268h;
                                    bVar15.getClass();
                                    com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str17);
                                    if (dVarArr != null) {
                                        listI1 = u.i0(dVarArr);
                                    } else {
                                        listI1 = null;
                                    }
                                    eVar.f115267g = listI1;
                                    if (listI1 != null) {
                                        while (r0.hasNext()) {
                                            str2 = dVar3.f41103b;
                                            if (str2 == null) {
                                                str2 = dVar3.f41102a;
                                            } else {
                                                if (str2.length() == 0) {
                                                    str2 = dVar3.f41102a;
                                                }
                                                if (str2 == null) {
                                                    str2 = dVar3.f41102a;
                                                }
                                            }
                                            dVar3.f41103b = str2;
                                        }
                                    }
                                    list4 = eVar.f115267g;
                                    if (list4 != null) {
                                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar7 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                        cVar7.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                        eVar.f115271k = cVar7;
                                    }
                                }
                                if (v2Var10 instanceof v2.b) {
                                    eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                                }
                                if (v2Var11 instanceof v2.b) {
                                    eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                                }
                                list = eVar.f115269i;
                                if (list != null) {
                                    while (r15.hasNext()) {
                                        list2 = eVar.f115267g;
                                        if (list2 != null) {
                                            it = list2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                    if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                            if (dVar != null) {
                                                str = dVar.f41107f;
                                            } else {
                                                str = null;
                                            }
                                        } else {
                                            str = null;
                                        }
                                        bVar9.r(str);
                                    }
                                }
                                if (eVar.f115265e != null) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                return Boolean.valueOf(z14);
                            }
                            this.f115225k = b0Var;
                            this.f115215a = null;
                            this.f115216b = null;
                            this.f115217c = null;
                            this.f115218d = null;
                            this.f115219e = v2Var7;
                            this.f115220f = v2Var8;
                            this.f115221g = v2Var9;
                            this.f115222h = v2Var10;
                            this.f115224j = 5;
                            obj = i0Var7.await(this);
                        } else {
                            this.f115225k = b0Var;
                            this.f115215a = null;
                            this.f115216b = null;
                            this.f115217c = null;
                            this.f115218d = i0Var7;
                            this.f115219e = v2Var4;
                            this.f115220f = v2Var5;
                            this.f115221g = v2Var6;
                            this.f115224j = 4;
                            objAwait2 = i0Var4.await(this);
                            if (objAwait2 != aVar) {
                                i0Var8 = i0Var7;
                                obj = objAwait2;
                                v2 v2Var110 = v2Var6;
                                v2Var10 = (v2) obj;
                                i0Var7 = i0Var8;
                                v2Var7 = v2Var4;
                                v2Var8 = v2Var5;
                                v2Var9 = v2Var110;
                                if (i0Var7 == null) {
                                    v2Var11 = null;
                                    if (v2Var7 instanceof v2.b) {
                                        eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                                    }
                                    if (v2Var8 instanceof v2.b) {
                                        com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar16 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                        String str18 = (String) ((v2.b) v2Var8).f47386a;
                                        bVar16.getClass();
                                        cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str18);
                                        if (cVarA != null) {
                                            listI0 = null;
                                        } else {
                                            listI0 = null;
                                        }
                                        eVar.f115266f = listI0;
                                    }
                                    if (v2Var9 instanceof v2.b) {
                                        eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                                    } else if (!s.g(str3, "en")) {
                                        j0 j0VarJ10 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                        this.f115225k = null;
                                        this.f115215a = null;
                                        this.f115216b = null;
                                        this.f115217c = null;
                                        this.f115218d = null;
                                        this.f115219e = null;
                                        this.f115220f = null;
                                        this.f115221g = null;
                                        this.f115222h = v2Var10;
                                        this.f115223i = v2Var11;
                                        this.f115224j = 6;
                                        objC = j0VarJ10.C(this);
                                        if (objC != aVar) {
                                            v2Var12 = v2Var11;
                                            obj = objC;
                                            v2Var13 = v2Var10;
                                            v2Var14 = (v2) obj;
                                            if (v2Var14 instanceof v2.b) {
                                                eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                            }
                                            v2Var11 = v2Var12;
                                            v2Var10 = v2Var13;
                                        }
                                    }
                                    if (eVar.f115267g == null) {
                                        com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar17 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                        dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                        String str19 = eVar.f115268h;
                                        bVar17.getClass();
                                        com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str19);
                                        if (dVarArr != null) {
                                            listI1 = u.i0(dVarArr);
                                        } else {
                                            listI1 = null;
                                        }
                                        eVar.f115267g = listI1;
                                        if (listI1 != null) {
                                            while (r0.hasNext()) {
                                                str2 = dVar3.f41103b;
                                                if (str2 == null) {
                                                    str2 = dVar3.f41102a;
                                                } else {
                                                    if (str2.length() == 0) {
                                                        str2 = dVar3.f41102a;
                                                    }
                                                    if (str2 == null) {
                                                        str2 = dVar3.f41102a;
                                                    }
                                                }
                                                dVar3.f41103b = str2;
                                            }
                                        }
                                        list4 = eVar.f115267g;
                                        if (list4 != null) {
                                            com.garmin.android.apps.connectmobile.repcounting.model.c cVar8 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                            cVar8.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                            eVar.f115271k = cVar8;
                                        }
                                    }
                                    if (v2Var10 instanceof v2.b) {
                                        eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                                    }
                                    if (v2Var11 instanceof v2.b) {
                                        eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                                    }
                                    list = eVar.f115269i;
                                    if (list != null) {
                                        while (r15.hasNext()) {
                                            list2 = eVar.f115267g;
                                            if (list2 != null) {
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                        if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                if (dVar != null) {
                                                    str = dVar.f41107f;
                                                } else {
                                                    str = null;
                                                }
                                            } else {
                                                str = null;
                                            }
                                            bVar9.r(str);
                                        }
                                    }
                                    if (eVar.f115265e != null) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                                }
                                this.f115225k = b0Var;
                                this.f115215a = null;
                                this.f115216b = null;
                                this.f115217c = null;
                                this.f115218d = null;
                                this.f115219e = v2Var7;
                                this.f115220f = v2Var8;
                                this.f115221g = v2Var9;
                                this.f115222h = v2Var10;
                                this.f115224j = 5;
                                obj = i0Var7.await(this);
                            }
                        }
                    } else {
                        this.f115225k = b0Var;
                        this.f115215a = null;
                        this.f115216b = null;
                        this.f115217c = i0Var4;
                        this.f115218d = i0Var5;
                        this.f115219e = v2Var2;
                        this.f115220f = v2Var3;
                        this.f115224j = 3;
                        obj = i0Var.await(this);
                    }
                    break;
                }
                return aVar;
            case 2:
                v2Var = this.f115219e;
                i0Var3 = this.f115218d;
                i0Var2 = this.f115217c;
                i0Var6 = this.f115216b;
                r.b(obj);
                v2 v2Var111 = v2Var;
                v2Var3 = (v2) obj;
                i0Var = i0Var6;
                i0Var4 = i0Var2;
                i0Var5 = i0Var3;
                v2Var2 = v2Var111;
                if (i0Var != null) {
                    this.f115225k = b0Var;
                    this.f115215a = null;
                    this.f115216b = null;
                    this.f115217c = i0Var4;
                    this.f115218d = i0Var5;
                    this.f115219e = v2Var2;
                    this.f115220f = v2Var3;
                    this.f115224j = 3;
                    obj = i0Var.await(this);
                    break;
                } else {
                    i0Var7 = i0Var5;
                    v2Var4 = v2Var2;
                    v2Var5 = v2Var3;
                    v2Var6 = null;
                    if (i0Var4 == null) {
                        v2Var7 = v2Var4;
                        v2Var8 = v2Var5;
                        v2Var9 = v2Var6;
                        v2Var10 = null;
                        if (i0Var7 == null) {
                            v2Var11 = null;
                            if (v2Var7 instanceof v2.b) {
                                eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                            }
                            if (v2Var8 instanceof v2.b) {
                                com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar18 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                String str110 = (String) ((v2.b) v2Var8).f47386a;
                                bVar18.getClass();
                                cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str110);
                                if (cVarA != null) {
                                    listI0 = null;
                                } else {
                                    listI0 = null;
                                }
                                eVar.f115266f = listI0;
                            }
                            if (v2Var9 instanceof v2.b) {
                                eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                            } else if (!s.g(str3, "en")) {
                                j0 j0VarJ11 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                this.f115225k = null;
                                this.f115215a = null;
                                this.f115216b = null;
                                this.f115217c = null;
                                this.f115218d = null;
                                this.f115219e = null;
                                this.f115220f = null;
                                this.f115221g = null;
                                this.f115222h = v2Var10;
                                this.f115223i = v2Var11;
                                this.f115224j = 6;
                                objC = j0VarJ11.C(this);
                                if (objC != aVar) {
                                    v2Var12 = v2Var11;
                                    obj = objC;
                                    v2Var13 = v2Var10;
                                    v2Var14 = (v2) obj;
                                    if (v2Var14 instanceof v2.b) {
                                        eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                    }
                                    v2Var11 = v2Var12;
                                    v2Var10 = v2Var13;
                                }
                            }
                            if (eVar.f115267g == null) {
                                com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar19 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                String str111 = eVar.f115268h;
                                bVar19.getClass();
                                com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str111);
                                if (dVarArr != null) {
                                    listI1 = u.i0(dVarArr);
                                } else {
                                    listI1 = null;
                                }
                                eVar.f115267g = listI1;
                                if (listI1 != null) {
                                    while (r0.hasNext()) {
                                        str2 = dVar3.f41103b;
                                        if (str2 == null) {
                                            str2 = dVar3.f41102a;
                                        } else {
                                            if (str2.length() == 0) {
                                                str2 = dVar3.f41102a;
                                            }
                                            if (str2 == null) {
                                                str2 = dVar3.f41102a;
                                            }
                                        }
                                        dVar3.f41103b = str2;
                                    }
                                }
                                list4 = eVar.f115267g;
                                if (list4 != null) {
                                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar9 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                    cVar9.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                    eVar.f115271k = cVar9;
                                }
                            }
                            if (v2Var10 instanceof v2.b) {
                                eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                            }
                            if (v2Var11 instanceof v2.b) {
                                eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                            }
                            list = eVar.f115269i;
                            if (list != null) {
                                while (r15.hasNext()) {
                                    list2 = eVar.f115267g;
                                    if (list2 != null) {
                                        it = list2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                        if (dVar != null) {
                                            str = dVar.f41107f;
                                        } else {
                                            str = null;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    bVar9.r(str);
                                }
                            }
                            if (eVar.f115265e != null) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            return Boolean.valueOf(z14);
                        }
                        this.f115225k = b0Var;
                        this.f115215a = null;
                        this.f115216b = null;
                        this.f115217c = null;
                        this.f115218d = null;
                        this.f115219e = v2Var7;
                        this.f115220f = v2Var8;
                        this.f115221g = v2Var9;
                        this.f115222h = v2Var10;
                        this.f115224j = 5;
                        obj = i0Var7.await(this);
                    } else {
                        this.f115225k = b0Var;
                        this.f115215a = null;
                        this.f115216b = null;
                        this.f115217c = null;
                        this.f115218d = i0Var7;
                        this.f115219e = v2Var4;
                        this.f115220f = v2Var5;
                        this.f115221g = v2Var6;
                        this.f115224j = 4;
                        objAwait2 = i0Var4.await(this);
                        if (objAwait2 != aVar) {
                            i0Var8 = i0Var7;
                            obj = objAwait2;
                            v2 v2Var112 = v2Var6;
                            v2Var10 = (v2) obj;
                            i0Var7 = i0Var8;
                            v2Var7 = v2Var4;
                            v2Var8 = v2Var5;
                            v2Var9 = v2Var112;
                            if (i0Var7 == null) {
                                v2Var11 = null;
                                if (v2Var7 instanceof v2.b) {
                                    eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                                }
                                if (v2Var8 instanceof v2.b) {
                                    com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar110 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                    String str112 = (String) ((v2.b) v2Var8).f47386a;
                                    bVar110.getClass();
                                    cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str112);
                                    if (cVarA != null) {
                                        listI0 = null;
                                    } else {
                                        listI0 = null;
                                    }
                                    eVar.f115266f = listI0;
                                }
                                if (v2Var9 instanceof v2.b) {
                                    eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                                } else if (!s.g(str3, "en")) {
                                    j0 j0VarJ12 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                    this.f115225k = null;
                                    this.f115215a = null;
                                    this.f115216b = null;
                                    this.f115217c = null;
                                    this.f115218d = null;
                                    this.f115219e = null;
                                    this.f115220f = null;
                                    this.f115221g = null;
                                    this.f115222h = v2Var10;
                                    this.f115223i = v2Var11;
                                    this.f115224j = 6;
                                    objC = j0VarJ12.C(this);
                                    if (objC != aVar) {
                                        v2Var12 = v2Var11;
                                        obj = objC;
                                        v2Var13 = v2Var10;
                                        v2Var14 = (v2) obj;
                                        if (v2Var14 instanceof v2.b) {
                                            eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                        }
                                        v2Var11 = v2Var12;
                                        v2Var10 = v2Var13;
                                    }
                                }
                                if (eVar.f115267g == null) {
                                    com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar111 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                    dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                    String str113 = eVar.f115268h;
                                    bVar111.getClass();
                                    com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str113);
                                    if (dVarArr != null) {
                                        listI1 = u.i0(dVarArr);
                                    } else {
                                        listI1 = null;
                                    }
                                    eVar.f115267g = listI1;
                                    if (listI1 != null) {
                                        while (r0.hasNext()) {
                                            str2 = dVar3.f41103b;
                                            if (str2 == null) {
                                                str2 = dVar3.f41102a;
                                            } else {
                                                if (str2.length() == 0) {
                                                    str2 = dVar3.f41102a;
                                                }
                                                if (str2 == null) {
                                                    str2 = dVar3.f41102a;
                                                }
                                            }
                                            dVar3.f41103b = str2;
                                        }
                                    }
                                    list4 = eVar.f115267g;
                                    if (list4 != null) {
                                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar10 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                        cVar10.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                        eVar.f115271k = cVar10;
                                    }
                                }
                                if (v2Var10 instanceof v2.b) {
                                    eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                                }
                                if (v2Var11 instanceof v2.b) {
                                    eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                                }
                                list = eVar.f115269i;
                                if (list != null) {
                                    while (r15.hasNext()) {
                                        list2 = eVar.f115267g;
                                        if (list2 != null) {
                                            it = list2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                    if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                            if (dVar != null) {
                                                str = dVar.f41107f;
                                            } else {
                                                str = null;
                                            }
                                        } else {
                                            str = null;
                                        }
                                        bVar9.r(str);
                                    }
                                }
                                if (eVar.f115265e != null) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                return Boolean.valueOf(z14);
                            }
                            this.f115225k = b0Var;
                            this.f115215a = null;
                            this.f115216b = null;
                            this.f115217c = null;
                            this.f115218d = null;
                            this.f115219e = v2Var7;
                            this.f115220f = v2Var8;
                            this.f115221g = v2Var9;
                            this.f115222h = v2Var10;
                            this.f115224j = 5;
                            obj = i0Var7.await(this);
                        }
                    }
                    break;
                }
                return aVar;
            case 3:
                v2Var3 = this.f115220f;
                v2Var2 = this.f115219e;
                i0Var5 = this.f115218d;
                i0Var4 = this.f115217c;
                r.b(obj);
                v2 v2Var20 = v2Var3;
                v2Var6 = (v2) obj;
                i0Var7 = i0Var5;
                v2Var4 = v2Var2;
                v2Var5 = v2Var20;
                if (i0Var4 == null) {
                    this.f115225k = b0Var;
                    this.f115215a = null;
                    this.f115216b = null;
                    this.f115217c = null;
                    this.f115218d = i0Var7;
                    this.f115219e = v2Var4;
                    this.f115220f = v2Var5;
                    this.f115221g = v2Var6;
                    this.f115224j = 4;
                    objAwait2 = i0Var4.await(this);
                    if (objAwait2 != aVar) {
                        i0Var8 = i0Var7;
                        obj = objAwait2;
                        v2 v2Var113 = v2Var6;
                        v2Var10 = (v2) obj;
                        i0Var7 = i0Var8;
                        v2Var7 = v2Var4;
                        v2Var8 = v2Var5;
                        v2Var9 = v2Var113;
                        if (i0Var7 == null) {
                            v2Var11 = null;
                            if (v2Var7 instanceof v2.b) {
                                eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                            }
                            if (v2Var8 instanceof v2.b) {
                                com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar112 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                                String str114 = (String) ((v2.b) v2Var8).f47386a;
                                bVar112.getClass();
                                cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str114);
                                if (cVarA != null) {
                                    listI0 = null;
                                } else {
                                    listI0 = null;
                                }
                                eVar.f115266f = listI0;
                            }
                            if (v2Var9 instanceof v2.b) {
                                eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                            } else if (!s.g(str3, "en")) {
                                j0 j0VarJ13 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                                this.f115225k = null;
                                this.f115215a = null;
                                this.f115216b = null;
                                this.f115217c = null;
                                this.f115218d = null;
                                this.f115219e = null;
                                this.f115220f = null;
                                this.f115221g = null;
                                this.f115222h = v2Var10;
                                this.f115223i = v2Var11;
                                this.f115224j = 6;
                                objC = j0VarJ13.C(this);
                                if (objC != aVar) {
                                    v2Var12 = v2Var11;
                                    obj = objC;
                                    v2Var13 = v2Var10;
                                    v2Var14 = (v2) obj;
                                    if (v2Var14 instanceof v2.b) {
                                        eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                    }
                                    v2Var11 = v2Var12;
                                    v2Var10 = v2Var13;
                                }
                            }
                            if (eVar.f115267g == null) {
                                com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar113 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                                dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                                String str115 = eVar.f115268h;
                                bVar113.getClass();
                                com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str115);
                                if (dVarArr != null) {
                                    listI1 = u.i0(dVarArr);
                                } else {
                                    listI1 = null;
                                }
                                eVar.f115267g = listI1;
                                if (listI1 != null) {
                                    while (r0.hasNext()) {
                                        str2 = dVar3.f41103b;
                                        if (str2 == null) {
                                            str2 = dVar3.f41102a;
                                        } else {
                                            if (str2.length() == 0) {
                                                str2 = dVar3.f41102a;
                                            }
                                            if (str2 == null) {
                                                str2 = dVar3.f41102a;
                                            }
                                        }
                                        dVar3.f41103b = str2;
                                    }
                                }
                                list4 = eVar.f115267g;
                                if (list4 != null) {
                                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar11 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                    cVar11.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                    eVar.f115271k = cVar11;
                                }
                            }
                            if (v2Var10 instanceof v2.b) {
                                eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                            }
                            if (v2Var11 instanceof v2.b) {
                                eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                            }
                            list = eVar.f115269i;
                            if (list != null) {
                                while (r15.hasNext()) {
                                    list2 = eVar.f115267g;
                                    if (list2 != null) {
                                        it = list2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                                if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                        if (dVar != null) {
                                            str = dVar.f41107f;
                                        } else {
                                            str = null;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    bVar9.r(str);
                                }
                            }
                            if (eVar.f115265e != null) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            return Boolean.valueOf(z14);
                        }
                        this.f115225k = b0Var;
                        this.f115215a = null;
                        this.f115216b = null;
                        this.f115217c = null;
                        this.f115218d = null;
                        this.f115219e = v2Var7;
                        this.f115220f = v2Var8;
                        this.f115221g = v2Var9;
                        this.f115222h = v2Var10;
                        this.f115224j = 5;
                        obj = i0Var7.await(this);
                    }
                    break;
                } else {
                    v2Var7 = v2Var4;
                    v2Var8 = v2Var5;
                    v2Var9 = v2Var6;
                    v2Var10 = null;
                    if (i0Var7 == null) {
                        v2Var11 = null;
                        if (v2Var7 instanceof v2.b) {
                            eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                        }
                        if (v2Var8 instanceof v2.b) {
                            com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar114 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                            String str116 = (String) ((v2.b) v2Var8).f47386a;
                            bVar114.getClass();
                            cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str116);
                            if (cVarA != null) {
                                listI0 = null;
                            } else {
                                listI0 = null;
                            }
                            eVar.f115266f = listI0;
                        }
                        if (v2Var9 instanceof v2.b) {
                            eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                        } else if (!s.g(str3, "en")) {
                            j0 j0VarJ14 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                            this.f115225k = null;
                            this.f115215a = null;
                            this.f115216b = null;
                            this.f115217c = null;
                            this.f115218d = null;
                            this.f115219e = null;
                            this.f115220f = null;
                            this.f115221g = null;
                            this.f115222h = v2Var10;
                            this.f115223i = v2Var11;
                            this.f115224j = 6;
                            objC = j0VarJ14.C(this);
                            if (objC != aVar) {
                                v2Var12 = v2Var11;
                                obj = objC;
                                v2Var13 = v2Var10;
                                v2Var14 = (v2) obj;
                                if (v2Var14 instanceof v2.b) {
                                    eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                                }
                                v2Var11 = v2Var12;
                                v2Var10 = v2Var13;
                            }
                        }
                        if (eVar.f115267g == null) {
                            com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar115 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                            dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                            String str117 = eVar.f115268h;
                            bVar115.getClass();
                            com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str117);
                            if (dVarArr != null) {
                                listI1 = u.i0(dVarArr);
                            } else {
                                listI1 = null;
                            }
                            eVar.f115267g = listI1;
                            if (listI1 != null) {
                                while (r0.hasNext()) {
                                    str2 = dVar3.f41103b;
                                    if (str2 == null) {
                                        str2 = dVar3.f41102a;
                                    } else {
                                        if (str2.length() == 0) {
                                            str2 = dVar3.f41102a;
                                        }
                                        if (str2 == null) {
                                            str2 = dVar3.f41102a;
                                        }
                                    }
                                    dVar3.f41103b = str2;
                                }
                            }
                            list4 = eVar.f115267g;
                            if (list4 != null) {
                                com.garmin.android.apps.connectmobile.repcounting.model.c cVar12 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                                cVar12.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                                eVar.f115271k = cVar12;
                            }
                        }
                        if (v2Var10 instanceof v2.b) {
                            eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                        }
                        if (v2Var11 instanceof v2.b) {
                            eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                        }
                        list = eVar.f115269i;
                        if (list != null) {
                            while (r15.hasNext()) {
                                list2 = eVar.f115267g;
                                if (list2 != null) {
                                    it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                            if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                    if (dVar != null) {
                                        str = dVar.f41107f;
                                    } else {
                                        str = null;
                                    }
                                } else {
                                    str = null;
                                }
                                bVar9.r(str);
                            }
                        }
                        if (eVar.f115265e != null) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        return Boolean.valueOf(z14);
                    }
                    this.f115225k = b0Var;
                    this.f115215a = null;
                    this.f115216b = null;
                    this.f115217c = null;
                    this.f115218d = null;
                    this.f115219e = v2Var7;
                    this.f115220f = v2Var8;
                    this.f115221g = v2Var9;
                    this.f115222h = v2Var10;
                    this.f115224j = 5;
                    obj = i0Var7.await(this);
                    break;
                }
                return aVar;
            case 4:
                v2Var6 = this.f115221g;
                v2Var5 = this.f115220f;
                v2Var4 = this.f115219e;
                i0Var8 = this.f115218d;
                r.b(obj);
                v2 v2Var114 = v2Var6;
                v2Var10 = (v2) obj;
                i0Var7 = i0Var8;
                v2Var7 = v2Var4;
                v2Var8 = v2Var5;
                v2Var9 = v2Var114;
                if (i0Var7 == null) {
                    v2Var11 = null;
                    if (v2Var7 instanceof v2.b) {
                        eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                    }
                    if (v2Var8 instanceof v2.b) {
                        com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar116 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                        String str118 = (String) ((v2.b) v2Var8).f47386a;
                        bVar116.getClass();
                        cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str118);
                        if (cVarA != null) {
                            listI0 = null;
                        } else {
                            listI0 = null;
                        }
                        eVar.f115266f = listI0;
                    }
                    if (v2Var9 instanceof v2.b) {
                        eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                    } else if (!s.g(str3, "en")) {
                        j0 j0VarJ15 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                        this.f115225k = null;
                        this.f115215a = null;
                        this.f115216b = null;
                        this.f115217c = null;
                        this.f115218d = null;
                        this.f115219e = null;
                        this.f115220f = null;
                        this.f115221g = null;
                        this.f115222h = v2Var10;
                        this.f115223i = v2Var11;
                        this.f115224j = 6;
                        objC = j0VarJ15.C(this);
                        if (objC != aVar) {
                            v2Var12 = v2Var11;
                            obj = objC;
                            v2Var13 = v2Var10;
                            v2Var14 = (v2) obj;
                            if (v2Var14 instanceof v2.b) {
                                eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                            }
                            v2Var11 = v2Var12;
                            v2Var10 = v2Var13;
                        }
                    }
                    if (eVar.f115267g == null) {
                        com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar117 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                        dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                        String str119 = eVar.f115268h;
                        bVar117.getClass();
                        com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str119);
                        if (dVarArr != null) {
                            listI1 = u.i0(dVarArr);
                        } else {
                            listI1 = null;
                        }
                        eVar.f115267g = listI1;
                        if (listI1 != null) {
                            while (r0.hasNext()) {
                                str2 = dVar3.f41103b;
                                if (str2 == null) {
                                    str2 = dVar3.f41102a;
                                } else {
                                    if (str2.length() == 0) {
                                        str2 = dVar3.f41102a;
                                    }
                                    if (str2 == null) {
                                        str2 = dVar3.f41102a;
                                    }
                                }
                                dVar3.f41103b = str2;
                            }
                        }
                        list4 = eVar.f115267g;
                        if (list4 != null) {
                            com.garmin.android.apps.connectmobile.repcounting.model.c cVar13 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                            cVar13.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                            eVar.f115271k = cVar13;
                        }
                    }
                    if (v2Var10 instanceof v2.b) {
                        eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                    }
                    if (v2Var11 instanceof v2.b) {
                        eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                    }
                    list = eVar.f115269i;
                    if (list != null) {
                        while (r15.hasNext()) {
                            list2 = eVar.f115267g;
                            if (list2 != null) {
                                it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                        if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                if (dVar != null) {
                                    str = dVar.f41107f;
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            bVar9.r(str);
                        }
                    }
                    if (eVar.f115265e != null) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    return Boolean.valueOf(z14);
                }
                this.f115225k = b0Var;
                this.f115215a = null;
                this.f115216b = null;
                this.f115217c = null;
                this.f115218d = null;
                this.f115219e = v2Var7;
                this.f115220f = v2Var8;
                this.f115221g = v2Var9;
                this.f115222h = v2Var10;
                this.f115224j = 5;
                obj = i0Var7.await(this);
                break;
                return aVar;
            case 5:
                v2Var10 = this.f115222h;
                v2Var9 = this.f115221g;
                v2Var8 = this.f115220f;
                v2Var7 = this.f115219e;
                r.b(obj);
                v2Var11 = (v2) obj;
                if (v2Var7 instanceof v2.b) {
                    eVar.f115265e = (k) ((v2.b) v2Var7).f47386a;
                }
                if (v2Var8 instanceof v2.b) {
                    com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar118 = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                    String str1110 = (String) ((v2.b) v2Var8).f47386a;
                    bVar118.getClass();
                    cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str1110);
                    if (cVarA != null) {
                        listI0 = null;
                    } else {
                        listI0 = null;
                    }
                    eVar.f115266f = listI0;
                }
                if (v2Var9 instanceof v2.b) {
                    eVar.f115268h = (String) ((v2.b) v2Var9).f47386a;
                } else if (!s.g(str3, "en")) {
                    j0 j0VarJ16 = ge1.b.j(b0Var, null, null, new f(eVar, null), 3);
                    this.f115225k = null;
                    this.f115215a = null;
                    this.f115216b = null;
                    this.f115217c = null;
                    this.f115218d = null;
                    this.f115219e = null;
                    this.f115220f = null;
                    this.f115221g = null;
                    this.f115222h = v2Var10;
                    this.f115223i = v2Var11;
                    this.f115224j = 6;
                    objC = j0VarJ16.C(this);
                    if (objC != aVar) {
                        v2Var12 = v2Var11;
                        obj = objC;
                        v2Var13 = v2Var10;
                        v2Var14 = (v2) obj;
                        if (v2Var14 instanceof v2.b) {
                            eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                        }
                        v2Var11 = v2Var12;
                        v2Var10 = v2Var13;
                    }
                    return aVar;
                }
                if (eVar.f115267g == null) {
                    com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar119 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                    dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                    String str1111 = eVar.f115268h;
                    bVar119.getClass();
                    com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str1111);
                    if (dVarArr != null) {
                        listI1 = u.i0(dVarArr);
                    } else {
                        listI1 = null;
                    }
                    eVar.f115267g = listI1;
                    if (listI1 != null) {
                        while (r0.hasNext()) {
                            str2 = dVar3.f41103b;
                            if (str2 == null) {
                                str2 = dVar3.f41102a;
                            } else {
                                if (str2.length() == 0) {
                                    str2 = dVar3.f41102a;
                                }
                                if (str2 == null) {
                                    str2 = dVar3.f41102a;
                                }
                            }
                            dVar3.f41103b = str2;
                        }
                    }
                    list4 = eVar.f115267g;
                    if (list4 != null) {
                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar14 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                        cVar14.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                        eVar.f115271k = cVar14;
                    }
                }
                if (v2Var10 instanceof v2.b) {
                    eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                }
                if (v2Var11 instanceof v2.b) {
                    eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                }
                list = eVar.f115269i;
                if (list != null) {
                    while (r15.hasNext()) {
                        list2 = eVar.f115267g;
                        if (list2 != null) {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                    if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                            if (dVar != null) {
                                str = dVar.f41107f;
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        bVar9.r(str);
                    }
                }
                if (eVar.f115265e != null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 6:
                v2Var12 = this.f115223i;
                v2Var13 = this.f115222h;
                r.b(obj);
                v2Var14 = (v2) obj;
                if (v2Var14 instanceof v2.b) {
                    eVar.f115268h = (String) ((v2.b) v2Var14).f47386a;
                }
                v2Var11 = v2Var12;
                v2Var10 = v2Var13;
                if (eVar.f115267g == null) {
                    com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar1110 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                    dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) list3.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                    String str1112 = eVar.f115268h;
                    bVar1110.getClass();
                    com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr, str1112);
                    if (dVarArr != null) {
                        listI1 = u.i0(dVarArr);
                    } else {
                        listI1 = null;
                    }
                    eVar.f115267g = listI1;
                    if (listI1 != null) {
                        while (r0.hasNext()) {
                            str2 = dVar3.f41103b;
                            if (str2 == null) {
                                str2 = dVar3.f41102a;
                            } else {
                                if (str2.length() == 0) {
                                    str2 = dVar3.f41102a;
                                }
                                if (str2 == null) {
                                    str2 = dVar3.f41102a;
                                }
                            }
                            dVar3.f41103b = str2;
                        }
                    }
                    list4 = eVar.f115267g;
                    if (list4 != null) {
                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar15 = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                        cVar15.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) list4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                        eVar.f115271k = cVar15;
                    }
                }
                if (v2Var10 instanceof v2.b) {
                    eVar.f115269i = (List) ((v2.b) v2Var10).f47386a;
                }
                if (v2Var11 instanceof v2.b) {
                    eVar.f115270j = (ix1.h) ((v2.b) v2Var11).f47386a;
                }
                list = eVar.f115269i;
                if (list != null) {
                    while (r15.hasNext()) {
                        list2 = eVar.f115267g;
                        if (list2 != null) {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                                    if (s.g(dVar2.f41106e, bVar9.getBenchmarkKey())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                            if (dVar != null) {
                                str = dVar.f41107f;
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        bVar9.r(str);
                    }
                }
                if (eVar.f115265e != null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
