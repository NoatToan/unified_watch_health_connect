package na0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.iid.InstanceID;
import gg1.o0;
import lc.u0;
import o53.b0;
import o53.c2;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.v;
import y80.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lna0/r;", "Landroidx/lifecycle/u1;", "Ly80/q0;", "speedSensorRepository", "<init>", "(Ly80/q0;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f125175e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f125176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c2 f125177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f125178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f125179d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lna0/q;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelViewModel$customizationStatus$1", f = "BikeWheelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super q>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f125180a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelViewModel$customizationStatus$1$1", f = "BikeWheelViewModel.kt", l = {36}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f125182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f125183b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f125184c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r rVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f125184c = rVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f125184c, dVar);
                aVar.f125183b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                b0 b0Var = (b0) this.f125183b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f125182a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    a2 a2Var = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "BikeWheelViewModel", "Starting timeout for speed sensor file event");
                    this.f125183b = b0Var;
                    this.f125182a = 1;
                    if (m0.b(5000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                a2 a2Var2 = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "BikeWheelViewModel", "Speed sensor file event timeout reached");
                p2 p2Var = this.f125184c.f125178c;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, q.a((q) value, false, new Integer(R.string.txt_something_went_wrong_try_again), null, 0, null, 58)));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: na0.r$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj90/l;", "event", "", "<anonymous>", "(Lj90/l;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelViewModel$customizationStatus$1$2", f = "BikeWheelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C2411b extends v13.i implements e23.p<j90.l, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f125185a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.j<q> f125186b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f125187c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2411b(r53.j<? super q> jVar, r rVar, t13.d<? super C2411b> dVar) {
                super(2, dVar);
                this.f125186b = jVar;
                this.f125187c = rVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2411b c2411b = new C2411b(this.f125186b, this.f125187c, dVar);
                c2411b.f125185a = obj;
                return c2411b;
            }

            @Override // e23.p
            public final Object invoke(j90.l lVar, t13.d<? super Unit> dVar) {
                return ((C2411b) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object value2;
                q qVar;
                j90.l lVar = (j90.l) this.f125185a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "BikeWheelViewModel", "Received speed sensor file event: " + lVar);
                r rVar = this.f125187c;
                c2 c2Var = rVar.f125177b;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                q0 q0Var = rVar.f125176a;
                p2 p2Var = rVar.f125178c;
                if (lVar instanceof j90.l.a) {
                    j90.m mVar = ((j90.l.a) lVar).f97835a;
                    boolean z14 = mVar instanceof j90.m.b;
                    do {
                        value2 = p2Var.getValue();
                        qVar = (q) value2;
                    } while (!p2Var.b(value2, q.a(qVar, false, mVar.getF97837a(), null, z14 ? q0Var.d() : qVar.f125173e, z14 ? q0Var.k() : qVar.f125174f, 10)));
                } else {
                    if (!(lVar instanceof j90.l.b)) {
                        u0.r();
                        return null;
                    }
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, q.a((q) value, false, ((j90.l.b) lVar).f97836a.getF97837a(), null, 0, null, 56)));
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = r.this.new b(dVar);
            bVar.f125180a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super q> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f125180a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r rVar = r.this;
            rVar.f125177b = ge1.b.T(v1.a(rVar), null, null, new a(rVar, null), 3);
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BikeWheelViewModel", "Started collecting speed sensor file events");
            r53.s.C(new m1(rVar.f125176a.b(), new C2411b(jVar, rVar, null)), v1.a(rVar));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelViewModel$saveBikeWheelPreferences$2", f = "BikeWheelViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f125189b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = r.this.new c(dVar);
            cVar.f125189b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            b0 b0Var = (b0) this.f125189b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125188a;
            if (i14 == 0) {
                o13.r.b(obj);
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "BikeWheelViewModel", "Starting timeout for saving bike wheel preferences");
                this.f125189b = b0Var;
                this.f125188a = 1;
                if (m0.b(5000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            a2 a2Var2 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "BikeWheelViewModel", "Save bike wheel preferences timeout reached");
            p2 p2Var = r.this.f125178c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q.a((q) value, false, new Integer(R.string.txt_something_went_wrong_try_again), null, 0, null, 58)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelViewModel$saveBikeWheelPreferences$3", f = "BikeWheelViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125191a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f125193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o0 f125194d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i14, o0 o0Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f125193c = i14;
            this.f125194d = o0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new d(this.f125193c, this.f125194d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125191a;
            if (i14 == 0) {
                o13.r.b(obj);
                q0 q0Var = r.this.f125176a;
                this.f125191a = 1;
                if (q0Var.c(this.f125194d, this.f125193c) == aVar) {
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

    public r(q0 q0Var) {
        q0Var.getClass();
        this.f125176a = q0Var;
        p2 p2VarA = q2.a(new q(true, false, null, null, 0, null, 62, null));
        this.f125178c = p2VarA;
        this.f125179d = r53.s.K(new v(new b(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new q(true, false, null, null, 0, null, 62, null));
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        a2 a2Var = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BikeWheelViewModel", "Clearing speed sensor status message");
        do {
            p2Var = this.f125178c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, q.a((q) value, false, null, null, 0, null, 59)));
    }

    public final void y4(o0 o0Var, int i14) {
        p2 p2Var;
        Object value;
        o0Var.getClass();
        do {
            p2Var = this.f125178c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, q.a((q) value, true, null, null, 0, null, 62)));
        this.f125177b = ge1.b.T(v1.a(this), null, null, new c(null), 3);
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "BikeWheelViewModel", "Saving bike wheel preferences: circumference=" + i14 + "mm, measurementSystem=" + o0Var);
        ge1.b.T(v1.a(this), null, null, new d(i14, o0Var, null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lna0/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", InstanceID.ERROR_TIMEOUT, "J", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
