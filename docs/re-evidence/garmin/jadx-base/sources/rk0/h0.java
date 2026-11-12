package rk0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lrk0/h0;", "Landroidx/lifecycle/u1;", "Lrk0/f0;", "initialModel", "Lkk0/b;", "gearRepository", "Lmk0/l;", "resolveDefaultGearConflicts", "<init>", "(Lrk0/f0;Lkk0/b;Lmk0/l;)V", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends u1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f153145i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f153146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kk0.b f153147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk0.l f153148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f153149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f153150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2 f153151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c2 f153152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f153153h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153154a;

        static {
            int[] iArr = new int[jk0.p.values().length];
            try {
                iArr[jk0.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jk0.p.Retired.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f153154a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$fetchDetails$1$2", f = "GearDetailsViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f153156b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = h0.this.new c(dVar);
            cVar.f153156b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objY;
            Object value;
            g0 g0Var;
            u0 u0Var;
            Integer num;
            Object value2;
            g0 g0Var2;
            o53.b0 b0Var = (o53.b0) this.f153156b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153155a;
            h0 h0Var = h0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                kk0.b bVar = h0Var.f153147b;
                String str = h0Var.f153146a.f153101a;
                this.f153156b = b0Var;
                this.f153155a = 1;
                objY = bVar.y(str, this);
                if (objY == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objY = obj;
            }
            v2 v2Var = (v2) objY;
            if (v2Var instanceof v2.b) {
                f0.Companion companion = f0.INSTANCE;
                jk0.x xVar = (jk0.x) ((v2.b) v2Var).f47386a;
                companion.getClass();
                f0 f0VarA = f0.Companion.a(xVar);
                p2 p2Var = h0Var.f153149d;
                do {
                    value2 = p2Var.getValue();
                    g0Var2 = (g0) value2;
                } while (!p2Var.b(value2, g0.a(g0Var2, f0VarA, xVar, null, null, o0.b(g0Var2.f153132e, f0VarA.f153103c, f0VarA.f153104d, null, null, false, 505), null, false, false, 104)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var = a2.GEAR;
                v2.a aVar2 = (v2.a) v2Var;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar2.f47383a, "Error retrieving gear details. ");
                i2.f36769a.getClass();
                i2.a.p(a2Var, "GearDetailsViewModel", strD);
                p2 p2Var2 = h0Var.f153149d;
                do {
                    value = p2Var2.getValue();
                    g0Var = (g0) value;
                    u0Var = u0.Failed;
                    num = aVar2.f47384b;
                } while (!p2Var2.b(value, g0.a(g0Var, null, null, u0Var, null, null, null, false, num != null && num.intValue() == 404, 123)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lrk0/g0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$uiState$1", f = "GearDetailsViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<r53.j<? super g0>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153158a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$uiState$1$1", f = "GearDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h0 f153160a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h0 h0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f153160a = h0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f153160a, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                this.f153160a.x4();
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h0.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super g0> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153158a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(h0.this, null);
                this.f153158a = 1;
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

    static {
        new a(null);
    }

    public h0(f0 f0Var, kk0.b bVar, mk0.l lVar) {
        f0Var.getClass();
        bVar.getClass();
        lVar.getClass();
        this.f153146a = f0Var;
        this.f153147b = bVar;
        this.f153148c = lVar;
        p2 p2VarA = q2.a(new g0(f0Var, null, u0.InProgress, null, new o0(f0Var.f153101a, f0Var.f153103c, f0Var.f153104d, null, null, false, false, false, false, 504, null), null, false, false, 224, null));
        this.f153149d = p2VarA;
        this.f153150e = r53.s.K(new r53.v(new d(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), p2VarA.getValue());
        this.f153153h = new ReentrantLock();
    }

    public final void x4() {
        Object value;
        ReentrantLock reentrantLock = this.f153153h;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f153151f;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f153149d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, g0.a((g0) value, null, null, u0.InProgress, null, null, null, false, false, 251)));
                this.f153151f = ge1.b.T(v1.a(this), null, null, new c(null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void y4(jk0.x xVar) {
        xVar.getClass();
        f0.INSTANCE.getClass();
        f0 f0VarA = f0.Companion.a(xVar);
        while (true) {
            p2 p2Var = this.f153149d;
            Object value = p2Var.getValue();
            g0 g0Var = (g0) value;
            jk0.x xVar2 = xVar;
            if (p2Var.b(value, g0.a(g0Var, f0VarA, xVar2, null, null, o0.b(g0Var.f153132e, null, null, xVar.f99351a, null, false, 471), null, false, false, 228))) {
                return;
            } else {
                xVar = xVar2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrk0/h0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
