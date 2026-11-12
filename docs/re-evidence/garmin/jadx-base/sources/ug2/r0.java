package ug2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.apache.commons.text.StringSubstitutor;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.k2;
import r53.l1;
import r53.m2;
import r53.n1;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lug2/r0;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "b", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 extends u1 implements KoinComponent {
    public static final /* synthetic */ int D = 0;
    public final b2 A;
    public final b2 B;
    public final b2 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f170924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f170925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f170926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f170927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f170928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f170929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f170930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f170931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f170932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f170933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f170934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f170935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f170936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f170937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f170938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f170939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f170940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f170941r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e2 f170942t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f170943v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ag2.c.a f170944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p2 f170945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p2 f170946y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b2 f170947z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$1", f = "MainViewModel.kt", l = {196}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170948a;

        /* JADX INFO: renamed from: ug2.r0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lof2/b0;", "newSessionData", "", "<anonymous>", "(Lof2/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$1$1", f = "MainViewModel.kt", l = {200, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
        public static final class C3185a extends v13.i implements e23.p<of2.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f170950a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f170951b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f170952c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r0 f170953d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3185a(r0 r0Var, t13.d<? super C3185a> dVar) {
                super(2, dVar);
                this.f170953d = r0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3185a c3185a = new C3185a(this.f170953d, dVar);
                c3185a.f170952c = obj;
                return c3185a;
            }

            @Override // e23.p
            public final Object invoke(of2.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3185a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
            
                if (ug2.r0.x4(r4, r13, r12) == r1) goto L48;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i14;
                Object objZ4;
                of2.b0 b0Var = (of2.b0) this.f170952c;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f170951b;
                r0 r0Var = this.f170953d;
                if (i15 != 0) {
                    if (i15 == 1) {
                        i14 = this.f170950a;
                        o13.r.b(obj);
                    } else {
                        if (i15 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                zg2.c cVar = zg2.c.f204692a;
                boolean z14 = false;
                String strG = n23.j.g("Received new session data {key: ", b0Var != null ? b0Var.f131748e : null, ", hasWorkout: ", (b0Var != null ? b0Var.f131753j : null) != null, StringSubstitutor.DEFAULT_VAR_END);
                cVar.getClass();
                zg2.c.d("MainViewModel", strG);
                i14 = (b0Var != null ? b0Var.f131753j : null) != null ? 1 : 0;
                p2 p2Var = r0Var.f170939p;
                if (i14 != 0 && (b0Var.f131752i instanceof rf2.l.d)) {
                    z14 = true;
                }
                p2Var.k(null, Boolean.valueOf(z14));
                this.f170952c = b0Var;
                this.f170950a = i14;
                this.f170951b = 1;
                if (b0Var == null) {
                    zg2.c.a("MainViewModel", "Received null session data. This means the session was ended, which is handled in StateViewModel.");
                    objZ4 = Unit.INSTANCE;
                } else {
                    zf2.d dVar = b0Var.f131747d;
                    zf2.d dVar2 = zf2.d.f204593g2;
                    if (dVar == dVar2) {
                        zg2.c.d("MainViewModel", "Showing unsupported activity view.");
                        r0Var.y4(b0Var, true, new ag2.d(null, null, null));
                        r0Var.f170936m.setValue(dVar2);
                        p2 p2Var2 = r0Var.f170945x;
                        Boolean bool = Boolean.FALSE;
                        p2Var2.k(null, bool);
                        r0Var.f170946y.k(null, bool);
                        objZ4 = Unit.INSTANCE;
                    } else {
                        zg2.c.d("MainViewModel", "Showing supported activity view");
                        objZ4 = r0Var.z4(b0Var, this);
                        if (objZ4 != aVar) {
                            objZ4 = Unit.INSTANCE;
                        }
                    }
                }
                if (objZ4 != aVar) {
                }
                return aVar;
                if (b0Var != null) {
                    tf2.c cVar2 = b0Var.f131754k;
                    this.f170952c = null;
                    this.f170950a = i14;
                    this.f170951b = 2;
                }
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r0.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170948a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = r0.D;
                r0 r0Var = r0.this;
                p2 p2Var = r0Var.B4().f71482f;
                C3185a c3185a = new C3185a(r0Var, null);
                this.f170948a = 1;
                if (r53.s.k(p2Var, c3185a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$cleanActiveSession$1", f = "MainViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170954a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r0.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170954a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = r0.D;
                fg2.f fVarB4 = r0.this.B4();
                this.f170954a = 1;
                if (fVarB4.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lof2/b0;", "<unused var>", "", "deviceBatteryPercentage", "<anonymous>", "(Lof2/b0;I)I"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$deviceBatteryPercentage$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<of2.b0, Integer, t13.d<? super Integer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Integer f170956a;

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(of2.b0 b0Var, Integer num, t13.d<? super Integer> dVar) {
            d dVar2 = r0.this.new d(dVar);
            dVar2.f170956a = num;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Integer num = this.f170956a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = r0.D;
            of2.b bVar = (of2.b) r0.this.B4().f71478b.f131778g.getValue();
            if (bVar != null) {
                zg2.a aVar2 = new zg2.a(bVar.f131726e, ((of2.b0) bVar.f131736o.getValue()).f131745b.getF92746j(), new of2.a(bVar, 1));
                bVar.f131729h = aVar2;
                aVar2.a();
            }
            return num;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lof2/b0;", "sessionData", "", "emptyState", "<anonymous>", "(Lof2/b0;Z)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$isBackNavigationDisabled$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<of2.b0, Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ of2.b0 f170958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f170959b;

        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(of2.b0 b0Var, Boolean bool, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            e eVar = r0.this.new e(dVar);
            eVar.f170958a = b0Var;
            eVar.f170959b = zBooleanValue;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            of2.b0 b0Var = this.f170958a;
            boolean z14 = this.f170959b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            jg2.a aVar2 = b0Var.f131746c;
            ((bh2.d) r0.this.f170927d.getValue()).getClass();
            return Boolean.valueOf(bh2.d.a(aVar2, !z14));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lof2/b0;", "sessionData", "", "hasActiveSession", "<anonymous>", "(Lof2/b0;Z)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$isEmptyState$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.q<of2.b0, Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ of2.b0 f170961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f170962b;

        public f(t13.d<? super f> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(of2.b0 b0Var, Boolean bool, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            f fVar = new f(dVar);
            fVar.f170961a = b0Var;
            fVar.f170962b = zBooleanValue;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            of2.b0 b0Var = this.f170961a;
            boolean z14 = this.f170962b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            jg2.a aVar2 = b0Var.f131746c;
            aVar2.getClass();
            boolean z15 = false;
            if ((aVar2 instanceof jg2.a.C1897a) && !z14) {
                z15 = true;
            }
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "previousEmptyState", "currentEmptyState"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$isEmptyState$2", f = "MainViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.q<Boolean, Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Boolean f170963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f170964b;

        public g(t13.d<? super g> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Boolean bool, Boolean bool2, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool2.booleanValue();
            g gVar = new g(dVar);
            gVar.f170963a = bool;
            gVar.f170964b = zBooleanValue;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Boolean bool = this.f170963a;
            boolean z14 = this.f170964b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Boolean bool2 = Boolean.FALSE;
            return p005kotlin.jvm.internal.s.g(bool, bool2) ? bool2 : Boolean.valueOf(z14);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<fg2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f170965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f170966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f170967c;

        public h(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f170965a = koinComponent;
            this.f170966b = qualifier;
            this.f170967c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [fg2.f, java.lang.Object] */
        @Override // e23.a
        public final fg2.f invoke() {
            KoinComponent koinComponent = this.f170965a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(fg2.f.class), this.f170966b, this.f170967c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<tf2.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f170968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f170969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f170970c;

        public i(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f170968a = koinComponent;
            this.f170969b = qualifier;
            this.f170970c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, tf2.g] */
        @Override // e23.a
        public final tf2.g invoke() {
            KoinComponent koinComponent = this.f170968a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tf2.g.class), this.f170969b, this.f170970c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<fg2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f170971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f170972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f170973c;

        public j(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f170971a = koinComponent;
            this.f170972b = qualifier;
            this.f170973c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [fg2.c, java.lang.Object] */
        @Override // e23.a
        public final fg2.c invoke() {
            KoinComponent koinComponent = this.f170971a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(fg2.c.class), this.f170972b, this.f170973c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.a<bh2.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f170974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f170975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f170976c;

        public k(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f170974a = koinComponent;
            this.f170975b = qualifier;
            this.f170976c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [bh2.d, java.lang.Object] */
        @Override // e23.a
        public final bh2.d invoke() {
            KoinComponent koinComponent = this.f170974a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(bh2.d.class), this.f170975b, this.f170976c);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l implements r53.i<zf2.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f170977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0 f170978b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f170979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f170980b;

            /* JADX INFO: renamed from: ug2.r0$l$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$special$$inlined$map$1$2", f = "MainViewModel.kt", l = {51, 50}, m = "emit", v = 2)
            public static final class C3186a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f170981a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f170982b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public r53.j f170984d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f170985e;

                public C3186a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f170981a = obj;
                    this.f170982b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, r0 r0Var) {
                this.f170979a = jVar;
                this.f170980b = r0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
            
                if (r2.emit(r10, r0) == r1) goto L22;
             */
            @Override // r53.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, t13.d dVar) {
                C3186a c3186a;
                int i14;
                r53.j jVar;
                if (dVar instanceof C3186a) {
                    c3186a = (C3186a) dVar;
                    int i15 = c3186a.f170982b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c3186a.f170982b = i15 - Integer.MIN_VALUE;
                    } else {
                        c3186a = new C3186a(dVar);
                    }
                } else {
                    c3186a = new C3186a(dVar);
                }
                Object objF = c3186a.f170981a;
                Object obj2 = u13.a.COROUTINE_SUSPENDED;
                int i16 = c3186a.f170982b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i14 = c3186a.f170985e;
                        r53.j jVar2 = c3186a.f170984d;
                        o13.r.b(objF);
                        jVar = jVar2;
                    } else {
                        if (i16 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(objF);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(objF);
                int i17 = r0.D;
                fg2.f fVarB4 = this.f170980b.B4();
                Long l14 = new Long(((of2.b0) obj).f131745b.getF92746j());
                r53.j jVar3 = this.f170979a;
                c3186a.f170984d = jVar3;
                c3186a.f170985e = 0;
                c3186a.f170982b = 1;
                objF = fVarB4.f(l14, c3186a);
                if (objF != obj2) {
                    i14 = 0;
                    jVar = jVar3;
                }
                return obj2;
                c3186a.f170984d = null;
                c3186a.f170985e = i14;
                c3186a.f170982b = 2;
            }
        }

        public l(r53.i iVar, r0 r0Var) {
            this.f170977a = iVar;
            this.f170978b = r0Var;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super zf2.e> jVar, t13.d dVar) {
            Object objCollect = this.f170977a.collect(new a(jVar, this.f170978b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f170986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0 f170987b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f170988a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f170989b;

            /* JADX INFO: renamed from: ug2.r0$m$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$special$$inlined$map$2$2", f = "MainViewModel.kt", l = {51, 50}, m = "emit", v = 2)
            public static final class C3187a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f170990a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f170991b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public r53.j f170993d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f170994e;

                public C3187a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f170990a = obj;
                    this.f170991b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, r0 r0Var) {
                this.f170988a = jVar;
                this.f170989b = r0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L21;
             */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, o13.l] */
            @Override // r53.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, t13.d dVar) {
                C3187a c3187a;
                r53.j jVar;
                int i14;
                r53.j jVar2;
                if (dVar instanceof C3187a) {
                    c3187a = (C3187a) dVar;
                    int i15 = c3187a.f170991b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c3187a.f170991b = i15 - Integer.MIN_VALUE;
                    } else {
                        c3187a = new C3187a(dVar);
                    }
                } else {
                    c3187a = new C3187a(dVar);
                }
                Object objD = c3187a.f170990a;
                Object obj2 = u13.a.COROUTINE_SUSPENDED;
                int i16 = c3187a.f170991b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i14 = c3187a.f170994e;
                        r53.j jVar3 = c3187a.f170993d;
                        o13.r.b(objD);
                        jVar2 = jVar3;
                    } else {
                        if (i16 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(objD);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(objD);
                fg2.c cVar = (fg2.c) this.f170989b.f170926c.getValue();
                long f92746j = ((of2.b0) obj).f131745b.getF92746j();
                jVar = this.f170988a;
                c3187a.f170993d = jVar;
                i14 = 0;
                c3187a.f170994e = 0;
                c3187a.f170991b = 1;
                objD = cVar.d(f92746j, c3187a);
                if (objD != obj2) {
                }
                jVar2 = jVar;
                return obj2;
                jVar2 = jVar;
                c3187a.f170993d = null;
                c3187a.f170994e = i14;
                c3187a.f170991b = 2;
            }
        }

        public m(r53.i iVar, r0 r0Var) {
            this.f170986a = iVar;
            this.f170987b = r0Var;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f170986a.collect(new a(jVar, this.f170987b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo13/p;", "Ljava/util/UUID;", "Lyf2/a;", "completedValueEstimationType", "Lof2/b0;", "sessionData", "Lug2/w0;", "<anonymous>", "(Lo13/p;Lof2/b0;)Lug2/w0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel$valueEstimationCompleteDialogState$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class n extends v13.i implements e23.q<o13.p<? extends UUID, ? extends yf2.a>, of2.b0, t13.d<? super w0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ o13.p f170995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ of2.b0 f170996b;

        public n(t13.d<? super n> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(o13.p<? extends UUID, ? extends yf2.a> pVar, of2.b0 b0Var, t13.d<? super w0> dVar) {
            n nVar = new n(dVar);
            nVar.f170995a = pVar;
            nVar.f170996b = b0Var;
            return nVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o13.p pVar = this.f170995a;
            of2.b0 b0Var = this.f170996b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean zG = p005kotlin.jvm.internal.s.g(b0Var.f131744a, pVar != null ? (UUID) pVar.f128594a : null);
            zg2.c cVar = zg2.c.f204692a;
            String str = "valueEstimationCompleteDialogState: completedValueEstimationType=" + pVar + ", sessionData=" + b0Var.f131744a + ", visible=" + zG;
            cVar.getClass();
            zg2.c.a("MainViewModel", str);
            return new w0(zG, pVar != null ? (yf2.a) pVar.f128595b : null);
        }
    }

    static {
        new b(null);
    }

    public r0() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this.f170924a = o13.m.a(koinPlatformTools.defaultLazyMode(), new h(this, null, null));
        this.f170925b = o13.m.a(koinPlatformTools.defaultLazyMode(), new i(this, null, null));
        this.f170926c = o13.m.a(koinPlatformTools.defaultLazyMode(), new j(this, null, null));
        this.f170927d = o13.m.a(koinPlatformTools.defaultLazyMode(), new k(this, null, null));
        this.f170928e = q2.a(new ag2.d(null, null, null));
        l1 l1Var = new l1(new n1(null, new r53.u1(new l1(B4().f71482f), B4().f71478b.f131784m, new f(null)), new g(null)));
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        aVar.getClass();
        m2 m2Var = k2.a.f150706c;
        Boolean bool = Boolean.FALSE;
        b2 b2VarK = r53.s.K(l1Var, aVarA, m2Var, bool);
        this.f170929f = b2VarK;
        this.f170930g = r53.s.K(new r53.u1(new l1(B4().f71482f), b2VarK, new e(null)), v1.a(this), m2Var, bool);
        this.f170931h = q2.a(null);
        p2 p2VarA = q2.a(bool);
        this.f170932i = p2VarA;
        this.f170933j = q2.a(null);
        this.f170934k = q2.a(null);
        this.f170935l = q2.a(null);
        this.f170936m = q2.a(zf2.d.f204593g2);
        this.f170937n = q2.a(bool);
        this.f170938o = q2.a(bool);
        p2 p2VarA2 = q2.a(bool);
        this.f170939p = p2VarA2;
        this.f170940q = p2VarA2;
        this.f170941r = q2.a(null);
        this.f170942t = g2.b(0, Integer.MAX_VALUE, q53.a.DROP_OLDEST, 1);
        this.f170945x = q2.a(bool);
        this.f170946y = q2.a(bool);
        this.f170947z = r53.s.K(new r53.u1(new l1(B4().f71482f), B4().f71484h, new d(null)), v1.a(this), k2.a.a(aVar, 2), null);
        this.A = r53.s.K(new l(new l1(B4().f71482f), this), v1.a(this), k2.a.a(aVar, 2), null);
        this.B = r53.s.K(new m(new l1(B4().f71482f), this), v1.a(this), k2.a.a(aVar, 2), bool);
        this.C = r53.s.K(new r53.u1(B4().f71496t, new l1(B4().f71482f), new n(null)), v1.a(this), k2.a.a(aVar, 2), new w0(false, null, 3, null));
        zg2.c.f204692a.getClass();
        zg2.c.a("MainViewModel", "init");
        p2VarA.k(null, Boolean.valueOf(B4().f71478b.f131780i.f144649d));
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a x4(r0 r0Var, tf2.c cVar, v13.c cVar2) {
        t0 t0Var;
        r0Var.getClass();
        if (cVar2 instanceof t0) {
            t0Var = (t0) cVar2;
            int i14 = t0Var.f171029c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t0Var.f171029c = i14 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(r0Var, cVar2);
            }
        } else {
            t0Var = new t0(r0Var, cVar2);
        }
        Object obj = t0Var.f171027a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t0Var.f171029c;
        if (i15 == 0) {
            o13.r.b(obj);
            e2 e2Var = cVar.f164470b.f164468a;
            u0 u0Var = new u0(r0Var);
            t0Var.f171029c = 1;
            e2Var.getClass();
            if (e2.m(e2Var, u0Var, t0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    public final void A4() {
        ge1.b.T(v1.a(this), null, null, new c(null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final fg2.f B4() {
        return (fg2.f) this.f170924a.getValue();
    }

    public final void C4() {
        mf2.h hVarE = B4().e();
        if (hVarE != null) {
            ArrayList arrayList = hVarE.f118313h;
            if (p13.h0.n0(arrayList) instanceof mf2.h.c.b) {
                return;
            }
            zg2.c.f204692a.getClass();
            zg2.c.d("Analytics", "Paused overlay is now visible");
            arrayList.add(new mf2.h.c.b(mf2.h.b.PAUSED));
        }
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
    public final void y4(of2.b0 b0Var, boolean z14, ag2.d dVar) {
        p2 p2Var;
        Object value;
        String strA = b0Var.f131751h;
        zf2.d dVar2 = b0Var.f131747d;
        String str = b0Var.f131748e;
        ?? r14 = this.f170925b;
        if (strA == null && (strA = b0Var.f131757n) == null) {
            if (dVar2 != zf2.d.f204593g2) {
                strA = ((tf2.g) r14.getValue()).d(dVar2);
            } else {
                strA = str != null ? ((tf2.g) r14.getValue()).a(str) : null;
            }
        }
        this.f170933j.setValue(strA);
        do {
            p2Var = this.f170934k;
            value = p2Var.getValue();
        } while (!p2Var.b(value, str != null ? ((tf2.g) r14.getValue()).c(str) : null));
        this.f170935l.setValue(str != null ? ((tf2.g) r14.getValue()).a(str) : null);
        this.f170938o.k(null, Boolean.valueOf(z14));
        this.f170928e.k(null, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object z4(of2.b0 b0Var, v13.c cVar) {
        s0 s0Var;
        List<ag2.c> listB;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f171002d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f171002d = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        s0 s0Var2 = s0Var;
        Object objG = s0Var2.f171000b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var2.f171002d;
        if (i15 == 0) {
            o13.r.b(objG);
            fg2.f fVarB4 = B4();
            zf2.d dVar = b0Var.f131747d;
            boolean z14 = (b0Var.f131752i == null && b0Var.f131750g == null) ? false : true;
            jg2.a aVar2 = b0Var.f131746c;
            long f92746j = b0Var.f131745b.getF92746j();
            s0Var2.f170999a = b0Var;
            s0Var2.f171002d = 1;
            objG = fVarB4.g(dVar, z14, aVar2, f92746j, s0Var2);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b0Var = s0Var2.f170999a;
            o13.r.b(objG);
        }
        ag2.d dVar2 = (ag2.d) objG;
        Object obj = null;
        if (dVar2 == null) {
            dVar2 = new ag2.d(null, null, null);
        }
        zg2.c.f204692a.getClass();
        zg2.c.a("MainViewModel", "Update to new UI layout " + dVar2);
        y4(b0Var, false, dVar2);
        zf2.d dVar3 = b0Var.f131747d;
        this.f170936m.setValue(dVar3);
        this.f170945x.k(null, Boolean.valueOf(b0Var.f131758o));
        this.f170946y.k(null, Boolean.valueOf(b0Var.f131759p));
        ag2.c.a aVar3 = this.f170944w;
        if (aVar3 == null) {
            return Unit.INSTANCE;
        }
        List<ag2.a> listB2 = dVar2.b();
        if (listB2 != null) {
            for (Object obj2 : listB2) {
                if (((ag2.a) obj2).c() == ag2.a.EnumC0052a.MEDIA_CAROUSEL) {
                    obj = obj2;
                    break;
                }
            }
            ag2.a aVar4 = (ag2.a) obj;
            if (aVar4 != null && (listB = aVar4.b()) != null && !listB.isEmpty()) {
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    if (((ag2.c) it.next()).a() == aVar3) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        zg2.c.f204692a.getClass();
        zg2.c.d("MainViewModel", "Current chart type isn't supported by activityType " + dVar3 + ". Navigating back to Dashboard.");
        this.f170931h.setValue(vg2.a.C3329a.INSTANCE);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lug2/r0$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
