package pv1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d60.e0;
import e23.p;
import java.util.List;
import kv1.y;
import kv1.z;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getTriathlonPreferences$1", f = "FBTEditPreferencesViewModel.kt", l = {703, 704, 705, 706, 711, 737, 739}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f141528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f141529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f141530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v2 f141531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2.b f141532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f141533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f141534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f141535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public jv1.c f141536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jv1.c f141537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f141538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f141539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f141540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pv1.b f141541n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getTriathlonPreferences$1$eventResult$1", f = "FBTEditPreferencesViewModel.kt", l = {706}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends fg0.k>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141543b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pv1.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141543b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141543b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends fg0.k>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141542a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            pv1.b bVar = this.f141543b;
            zf0.d dVar = bVar.f204384a;
            long j8 = bVar.T;
            this.f141542a = 1;
            Object objC = dVar.c(j8, this);
            return objC == aVar ? aVar : objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getTriathlonPreferences$1$fbtPlanResult$1", f = "FBTEditPreferencesViewModel.kt", l = {705}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends tw1.m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pv1.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f141545b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f141545b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends tw1.m>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141544a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            int i15 = pv1.b.f141488i1;
            pv1.b bVar = this.f141545b;
            kv1.b bVarD5 = bVar.d5();
            long j8 = bVar.T;
            this.f141544a = 1;
            Object objC = bVarD5.c(j8, this);
            return objC == aVar ? aVar : objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getTriathlonPreferences$1$triathlonTypesCall$1", f = "FBTEditPreferencesViewModel.kt", l = {708}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.f>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141547b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pv1.b bVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f141547b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f141547b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.f>>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141546a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            d60.b bVarF4 = this.f141547b.F4();
            this.f141546a = 1;
            bVarF4.getClass();
            Object objJ = f0.J(bVarF4, new e0(bVarF4, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljv1/e0;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getTriathlonPreferences$1$userSettingsResult$1", f = "FBTEditPreferencesViewModel.kt", l = {703}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super v2<? extends jv1.e0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141549b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(pv1.b bVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f141549b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f141549b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends jv1.e0>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141548a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141549b);
            this.f141548a = 1;
            Object objA = yVarZ4.a(this);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljv1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getTriathlonPreferences$1$workoutsResult$1", f = "FBTEditPreferencesViewModel.kt", l = {704}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends jv1.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141551b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pv1.b bVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f141551b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f141551b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends jv1.b>>> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141550a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141551b);
            this.f141550a = 1;
            yVarZ4.getClass();
            Object objJ = f0.J(yVarZ4, new z(yVarZ4, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pv1.b bVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f141541n = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f141541n, dVar);
        gVar.f141540m = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:102:0x02be  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:109:0x0317  */
    /* JADX WARN: Code duplicated, block: B:110:0x032c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0330  */
    /* JADX WARN: Code duplicated, block: B:118:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00bb A[PHI: r3 r9
      0x00bb: PHI (r3v8 com.garmin.android.apps.connectmobile.v2) = (r3v6 com.garmin.android.apps.connectmobile.v2), (r3v10 com.garmin.android.apps.connectmobile.v2) binds: [B:17:0x00b7, B:11:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r9v4 java.lang.Object) = (r9v3 java.lang.Object), (r9v7 java.lang.Object) binds: [B:17:0x00b7, B:11:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:29:0x010c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0116  */
    /* JADX WARN: Code duplicated, block: B:32:0x0119  */
    /* JADX WARN: Code duplicated, block: B:35:0x012e  */
    /* JADX WARN: Code duplicated, block: B:37:0x013f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0146  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d6 A[LOOP:1: B:61:0x01bb->B:66:0x01d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0254  */
    /* JADX WARN: Code duplicated, block: B:86:0x0257  */
    /* JADX WARN: Code duplicated, block: B:87:0x025c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0265  */
    /* JADX WARN: Code duplicated, block: B:92:0x026a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0294  */
    /* JADX WARN: Code duplicated, block: B:98:0x029f  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r17v4 java.lang.Object, still in use, count: 2, list:
          (r17v4 java.lang.Object) from 0x01ad: PHI (r17 I:??) = (r17v1 java.lang.Object), (r17v4 java.lang.Object) binds: [B:55:0x01ab, B:117:0x01ad] A[DONT_GENERATE, DONT_INLINE]
          (r17v4 java.lang.Object) from 0x019d: CHECK_CAST (jv1.b) (r17v4 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
