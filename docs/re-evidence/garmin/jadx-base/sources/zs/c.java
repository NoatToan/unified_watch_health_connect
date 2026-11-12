package zs;

import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import e23.q;
import e23.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.b2;
import r53.j;
import r53.m;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.w;
import v13.e;
import v13.i;
import vb.h;
import vs.f;
import xs.g;
import zb0.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lzs/c;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "deviceUnitId", "", "deviceName", "deviceImageUrl", "Lxs/g;", "recentActivitiesHandler", "Lxs/d;", "getAllActivities", "Lxs/a;", "activityRecordingStateHandler", "Lus/a;", "protobufDataHandler", "Lxs/e;", "getDeviceConnectionState", "<init>", "(Landroidx/lifecycle/j1;JLjava/lang/String;Ljava/lang/String;Lxs/g;Lxs/d;Lxs/a;Lus/a;Lxs/e;)V", "d", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f206784l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f206785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f206786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f206787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xs.d f206788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xs.a f206789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public us.a f206790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f206791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f206792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f206793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f206794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f206795k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.activityrecording.presentation.ActivityRecordingViewModel$1", f = "ActivityRecordingViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f206797b;

        /* JADX INFO: renamed from: zs.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lvs/e;", "recentActivities", "allActivities", "selectedActivity", "Lvs/a;", "recordingState", "Lys/b;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Lvs/e;Lvs/a;)Lys/b;"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.activityrecording.presentation.ActivityRecordingViewModel$1$1", f = "ActivityRecordingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C3854a extends i implements s<List<? extends vs.e>, List<? extends vs.e>, vs.e, vs.a, t13.d<? super ys.b>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ List f206799a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ List f206800b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ vs.e f206801c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ vs.a f206802d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b0 f206803e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ c f206804f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3854a(b0 b0Var, c cVar, t13.d<? super C3854a> dVar) {
                super(5, dVar);
                this.f206803e = b0Var;
                this.f206804f = cVar;
            }

            @Override // e23.s
            public final Object invoke(List<? extends vs.e> list, List<? extends vs.e> list2, vs.e eVar, vs.a aVar, t13.d<? super ys.b> dVar) {
                C3854a c3854a = new C3854a(this.f206803e, this.f206804f, dVar);
                c3854a.f206799a = list;
                c3854a.f206800b = list2;
                c3854a.f206801c = eVar;
                c3854a.f206802d = aVar;
                return c3854a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                vs.e eVar;
                List<vs.e> list = this.f206799a;
                List list2 = this.f206800b;
                vs.e eVar2 = this.f206801c;
                vs.a aVar = this.f206802d;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                if (p005kotlin.jvm.internal.s.g(aVar.f179693b, ys.a.C3724a.f199152a) || aVar.f179693b == null) {
                    a2 a2Var = a2.ACTIVITY_RECORDING;
                    String str = "recording selected activity: " + (eVar2 != null ? eVar2.f179706a : null);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "ActivityRecordingViewModel", str);
                    eVar = eVar2;
                } else {
                    f fVar = aVar.f179692a;
                    if (fVar != null) {
                        i2.f36769a.getClass();
                        i2.a.b(a2.ACTIVITY_RECORDING, "ActivityRecordingViewModel", "recording status activity from device: " + fVar);
                        eVar = new vs.e(fVar, true);
                    } else {
                        eVar = null;
                    }
                }
                ys.b bVar = (ys.b) this.f206804f.f206791g.getValue();
                ArrayList arrayList = new ArrayList(y.r(list2, 10));
                Iterator it = list2.iterator();
                while (true) {
                    boolean z14 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    vs.e eVar3 = (vs.e) it.next();
                    if (eVar3.f179706a == (eVar2 != null ? eVar2.f179706a : null)) {
                        z14 = true;
                    }
                    arrayList.add(vs.e.b(eVar3, z14));
                }
                ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                for (vs.e eVar4 : list) {
                    arrayList2.add(vs.e.b(eVar4, eVar4.f179706a == (eVar2 != null ? eVar2.f179706a : null)));
                }
                return ys.b.b(bVar, false, false, eVar, aVar, arrayList2, arrayList, 3);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lys/b;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.activityrecording.presentation.ActivityRecordingViewModel$1$2", f = "ActivityRecordingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements q<j<? super ys.b>, Throwable, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ j f206805a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Throwable f206806b;

            public b(t13.d<? super b> dVar) {
                super(3, dVar);
            }

            @Override // e23.q
            public final Object invoke(j<? super ys.b> jVar, Throwable th3, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar);
                bVar.f206805a = jVar;
                bVar.f206806b = th3;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Throwable th3 = this.f206806b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                a2 a2Var = a2.ACTIVITY_RECORDING;
                String strN = fb1.c.n("Exception combining activity recording data: ", th3.getMessage());
                i2.f36769a.getClass();
                i2.a.b(a2Var, "ActivityRecordingViewModel", strN);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: zs.c$a$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3855c<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f206807a;

            public C3855c(c cVar) {
                this.f206807a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Object value;
                ys.b bVar = (ys.b) obj;
                int i14 = c.f206784l;
                c cVar = this.f206807a;
                p2 p2Var = cVar.f206791g;
                do {
                    value = p2Var.getValue();
                    ((ys.b) p2Var.getValue()).getClass();
                } while (!p2Var.b(value, bVar));
                cVar.f206785a.f(p2Var.getValue(), "ui_state");
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f206797b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f206797b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206796a;
            if (i14 == 0) {
                r.b(obj);
                c cVar = c.this;
                p2 p2Var = cVar.f206787c.f192053b;
                ts.a aVar2 = cVar.f206788d.f192046a;
                w13.c cVar2 = f.f179710h;
                ArrayList arrayList = new ArrayList(y.r(cVar2, 10));
                Iterator<T> it = cVar2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new vs.e((f) it.next(), false, 2, null));
                }
                w wVar = new w(r53.s.m(p2Var, new m(arrayList), cVar.f206793i, r53.s.d(cVar.f206789e.f192035c), new C3854a(b0Var, cVar, null)), new b(null));
                C3855c c3855c = new C3855c(cVar);
                this.f206797b = null;
                this.f206796a = 1;
                if (wVar.collect(c3855c, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxs/c;", "data", "", "<anonymous>", "(Lxs/c;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.activityrecording.presentation.ActivityRecordingViewModel$2", f = "ActivityRecordingViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<xs.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f206809b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = c.this.new b(dVar);
            bVar.f206809b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(xs.c cVar, t13.d<? super Unit> dVar) {
            return ((b) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x006c  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            vs.d dVar;
            xs.c cVar = (xs.c) this.f206809b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206808a;
            c cVar2 = c.this;
            if (i14 == 0) {
                r.b(obj);
                DeviceProfile deviceProfile = cVar.f192043a;
                if (deviceProfile != null) {
                    long f92746j = deviceProfile.getF92746j();
                    long j8 = cVar2.f206786b;
                    if (f92746j == j8) {
                        if (cVar instanceof xs.c.a) {
                            cVar2.f206790f = (us.a) k.b(us.a.class, j8);
                            xs.a aVar2 = cVar2.f206789e;
                            this.f206809b = cVar;
                            this.f206808a = 1;
                            if (aVar2.a(this) == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
                a2 a2Var = a2.ACTIVITY_RECORDING;
                DeviceProfile deviceProfile2 = cVar.f192043a;
                String strN = fb1.c.n("Get device connection state ", deviceProfile2 != null ? deviceProfile2.getF92742f() : null);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "ActivityRecordingViewModel", strN);
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            p2 p2Var = cVar2.f206794j;
            vs.d dVar2 = (vs.d) p2Var.getValue();
            if (dVar2 != null) {
                String f92742f = cVar.f192043a.getF92742f();
                f92742f.getClass();
                dVar = new vs.d(f92742f, dVar2.f179704b, cVar);
            } else {
                dVar = null;
            }
            p2Var.setValue(dVar);
            a2 a2Var2 = a2.ACTIVITY_RECORDING;
            DeviceProfile deviceProfile3 = cVar.f192043a;
            String strN2 = fb1.c.n("Get device connection state ", deviceProfile3 != null ? deviceProfile3.getF92742f() : null);
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "ActivityRecordingViewModel", strN2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: zs.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lxs/c;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.activityrecording.presentation.ActivityRecordingViewModel$3", f = "ActivityRecordingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3856c extends i implements q<j<? super xs.c>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ j f206811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f206812b;

        public C3856c(t13.d<? super C3856c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(j<? super xs.c> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            C3856c c3856c = new C3856c(dVar);
            c3856c.f206811a = jVar;
            c3856c.f206812b = th3;
            return c3856c.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f206812b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a2 a2Var = a2.ACTIVITY_RECORDING;
            String strN = fb1.c.n("Exception getting device connection state: ", th3.getMessage());
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ActivityRecordingViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    static {
        new d(null);
    }

    public c(j1 j1Var, long j8, String str, String str2, g gVar, xs.d dVar, xs.a aVar, us.a aVar2, xs.e eVar) {
        j1Var.getClass();
        str.getClass();
        gVar.getClass();
        dVar.getClass();
        aVar.getClass();
        this.f206785a = j1Var;
        this.f206786b = j8;
        this.f206787c = gVar;
        this.f206788d = dVar;
        this.f206789e = aVar;
        this.f206790f = aVar2;
        ys.b bVar = (ys.b) j1Var.a("ui_state");
        p2 p2VarA = q2.a(bVar == null ? new ys.b(false, false, null, null, null, null, 63, null) : bVar);
        this.f206791g = p2VarA;
        this.f206792h = r53.s.d(p2VarA);
        this.f206793i = q2.a(null);
        p2 p2VarA2 = q2.a(new vs.d(str, str2, new xs.c.a(null)));
        this.f206794j = p2VarA2;
        this.f206795k = p2VarA2;
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        if (eVar != null) {
            r53.s.C(new w(new m1(r53.s.f(new xs.f(eVar, null)), new b(null)), new C3856c(null)), v1.a(this));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lzs/c$d;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "UI_STATE", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    public /* synthetic */ c(j1 j1Var, long j8, String str, String str2, g gVar, xs.d dVar, xs.a aVar, us.a aVar2, xs.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j1Var, j8, str, (i14 & 8) != 0 ? null : str2, gVar, dVar, aVar, aVar2, eVar);
    }
}
