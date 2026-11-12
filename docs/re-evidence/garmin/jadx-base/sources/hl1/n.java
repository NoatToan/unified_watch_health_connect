package hl1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o53.b0;
import o53.i0;
import o53.j0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.l0;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lhl1/n;", "Landroidx/lifecycle/u1;", "", "deviceId", "Lfl1/c;", "getRecentRecordedActivities", "Lfl1/g;", "getFavoriteActivities", "Lfl1/f;", "getDeviceWheelchairAvailability", "Lfl1/k;", "getWorkoutSupportedActivityTypes", "Lfl1/m;", "isGpsActivity", "Lfl1/n;", "shouldShowPreciseLocation", "Lcl1/a;", "preferences", "Ly51/a;", "pendingActivitiesRepo", "Lws/a;", "activityRecordingDelegate", "Lo53/z;", "ioDispatcher", "<init>", "(JLfl1/c;Lfl1/g;Lfl1/f;Lfl1/k;Lfl1/m;Lfl1/n;Lcl1/a;Ly51/a;Lws/a;Lo53/z;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl1.c f84416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fl1.g f84417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fl1.f f84418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fl1.k f84419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fl1.m f84420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fl1.n f84421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cl1.a f84422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y51.a f84423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ws.a f84424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z f84425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f84426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f84427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Set<String> f84428n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel$fetchActivities$2", f = "SelectActivityViewModel.kt", l = {71, 74, 76, 77}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f84429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f84430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i0 f84431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f84432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f84433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f84434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f84435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f84436h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "Lzf2/d;", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel$fetchActivities$2$favoriteActivitiesDeferred$1", f = "SelectActivityViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super o13.q<? extends List<? extends zf2.d>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f84438a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f84439b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f84439b = nVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f84439b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super o13.q<? extends List<? extends zf2.d>>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f84438a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    n nVar = this.f84439b;
                    fl1.g gVar = nVar.f84417c;
                    long j8 = nVar.f84415a;
                    this.f84438a = 1;
                    objB = gVar.b(j8, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                    objB = ((o13.q) obj).f128597a;
                }
                return o13.q.a(objB);
            }
        }

        /* JADX INFO: renamed from: hl1.n$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "Lzf2/d;", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel$fetchActivities$2$recentActivitiesDeferred$1", f = "SelectActivityViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
        public static final class C1675b extends v13.i implements e23.p<b0, t13.d<? super o13.q<? extends List<? extends zf2.d>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f84440a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f84441b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1675b(n nVar, t13.d<? super C1675b> dVar) {
                super(2, dVar);
                this.f84441b = nVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1675b(this.f84441b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super o13.q<? extends List<? extends zf2.d>>> dVar) {
                return ((C1675b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object objA;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f84440a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    n nVar = this.f84441b;
                    fl1.c cVar = nVar.f84416b;
                    Long l14 = new Long(nVar.f84415a);
                    Integer num = new Integer(15);
                    this.f84440a = 1;
                    objA = cVar.a(l14, num, this);
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                    objA = ((o13.q) obj).f128597a;
                }
                return o13.q.a(objA);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lzf2/d;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel$fetchActivities$2$supportedActivityTypesDeferred$1", f = "SelectActivityViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<b0, t13.d<? super List<? extends zf2.d>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f84442a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f84443b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(n nVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f84443b = nVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f84443b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends zf2.d>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f84442a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f84442a = 1;
                    Object objX4 = n.x4(this.f84443b, this);
                    return objX4 == aVar ? aVar : objX4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lzf2/d;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel$fetchActivities$2$supportedWorkoutsTypesDeferred$1", f = "SelectActivityViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
        public static final class d extends v13.i implements e23.p<b0, t13.d<? super List<? extends zf2.d>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f84444a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f84445b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(n nVar, t13.d<? super d> dVar) {
                super(2, dVar);
                this.f84445b = nVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new d(this.f84445b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends zf2.d>> dVar) {
                return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f84444a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                n nVar = this.f84445b;
                fl1.k kVar = nVar.f84419e;
                long j8 = nVar.f84415a;
                this.f84444a = 1;
                Object objE0 = ge1.b.e0(kVar.f72020c, new fl1.l(kVar, j8, null), this);
                return objE0 == aVar ? aVar : objE0;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = n.this.new b(dVar);
            bVar.f84436h = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e4 A[PHI: r1 r3 r4 r13
          0x00e4: PHI (r1v6 java.lang.Object) = (r1v5 java.lang.Object), (r1v14 java.lang.Object) binds: [B:29:0x00e1, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x00e4: PHI (r3v8 java.lang.Object) = (r3v7 java.lang.Object), (r3v17 java.lang.Object) binds: [B:29:0x00e1, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x00e4: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v9 java.lang.Object) binds: [B:29:0x00e1, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x00e4: PHI (r13v4 o53.i0) = (r13v3 o53.i0), (r13v8 o53.i0) binds: [B:29:0x00e1, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:34:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:37:0x0109  */
        /* JADX WARN: Code duplicated, block: B:40:0x0110  */
        /* JADX WARN: Code duplicated, block: B:44:0x0122  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j0 j0VarJ;
            i0 i0VarJ;
            Object objC;
            i0 i0Var;
            Object obj2;
            Object objAwait;
            i0 i0Var2;
            Object obj3;
            Throwable thB;
            Object objAwait2;
            List list;
            Object objAwait3;
            Object obj4;
            List list2;
            List list3;
            p13.j0 j0Var;
            List list4;
            List listS0;
            p2 p2Var;
            Object value;
            zf2.d dVar;
            b0 b0Var = (b0) this.f84436h;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84435g;
            n nVar = n.this;
            if (i14 == 0) {
                o13.r.b(obj);
                j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(nVar, null), 3);
                j0VarJ = ge1.b.j(b0Var, null, null, new C1675b(nVar, null), 3);
                j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new c(nVar, null), 3);
                i0VarJ = ge1.b.j(b0Var, null, null, new d(nVar, null), 3);
                this.f84436h = b0Var;
                this.f84429a = j0VarJ;
                this.f84430b = j0VarJ3;
                this.f84431c = i0VarJ;
                this.f84435g = 1;
                objC = j0VarJ2.C(this);
                if (objC != aVar) {
                    i0Var = j0VarJ3;
                }
                return aVar;
            }
            if (i14 == 1) {
                i0 i0Var3 = this.f84431c;
                i0Var = this.f84430b;
                j0VarJ = this.f84429a;
                o13.r.b(obj);
                i0VarJ = i0Var3;
                objC = obj;
            } else {
                if (i14 == 2) {
                    Object obj5 = this.f84432d;
                    i0 i0Var4 = this.f84431c;
                    i0Var2 = this.f84430b;
                    o13.r.b(obj);
                    i0VarJ = i0Var4;
                    obj2 = obj5;
                    objAwait = obj;
                    obj3 = ((o13.q) objAwait).f128597a;
                    thB = o13.q.b(obj3);
                    if (thB != null) {
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.g(a2Var, "SelectActivityViewModel", thB);
                    }
                    this.f84436h = null;
                    this.f84429a = null;
                    this.f84430b = null;
                    this.f84431c = i0VarJ;
                    this.f84432d = obj2;
                    this.f84433e = obj3;
                    this.f84435g = 3;
                    objAwait2 = i0Var2.await(this);
                    if (objAwait2 != aVar) {
                        list = (List) objAwait2;
                        this.f84436h = null;
                        this.f84429a = null;
                        this.f84430b = null;
                        this.f84431c = null;
                        this.f84432d = obj2;
                        this.f84433e = obj3;
                        this.f84434f = list;
                        this.f84435g = 4;
                        objAwait3 = i0VarJ.await(this);
                        if (objAwait3 != aVar) {
                            obj4 = obj3;
                            list2 = list;
                        }
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    obj3 = this.f84433e;
                    obj2 = this.f84432d;
                    i0 i0Var5 = this.f84431c;
                    o13.r.b(obj);
                    i0VarJ = i0Var5;
                    objAwait2 = obj;
                    list = (List) objAwait2;
                    this.f84436h = null;
                    this.f84429a = null;
                    this.f84430b = null;
                    this.f84431c = null;
                    this.f84432d = obj2;
                    this.f84433e = obj3;
                    this.f84434f = list;
                    this.f84435g = 4;
                    objAwait3 = i0VarJ.await(this);
                    if (objAwait3 != aVar) {
                        obj4 = obj3;
                        list2 = list;
                    }
                    return aVar;
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = this.f84434f;
                obj4 = this.f84433e;
                obj2 = this.f84432d;
                o13.r.b(obj);
                objAwait3 = obj;
            }
            list3 = (List) objAwait3;
            j0Var = p13.j0.f134944a;
            int i15 = o13.q.f128596b;
            if (obj2 instanceof o13.q.b) {
                obj2 = j0Var;
            }
            list4 = (List) obj2;
            if (obj4 instanceof o13.q.b) {
                obj4 = j0Var;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj6 : (Iterable) obj4) {
                dVar = (zf2.d) obj6;
                if (list4.contains(dVar) && list2.contains(dVar)) {
                    arrayList.add(obj6);
                }
            }
            listS0 = h0.S0(arrayList, 5);
            p2Var = nVar.f84426l;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, f.a((f) value, false, false, null, i53.a.e(list4), i53.a.e(listS0), i53.a.e(list3), null, false, false, 454)));
            return Unit.INSTANCE;
            obj2 = ((o13.q) objC).f128597a;
            Throwable thB2 = o13.q.b(obj2);
            if (thB2 != null) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.g(a2Var2, "SelectActivityViewModel", thB2);
            }
            this.f84436h = b0Var;
            this.f84429a = null;
            this.f84430b = i0Var;
            this.f84431c = i0VarJ;
            this.f84432d = obj2;
            this.f84435g = 2;
            objAwait = j0VarJ.await(this);
            if (objAwait != aVar) {
                i0Var2 = i0Var;
                obj3 = ((o13.q) objAwait).f128597a;
                thB = o13.q.b(obj3);
                if (thB != null) {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.g(a2Var3, "SelectActivityViewModel", thB);
                }
                this.f84436h = null;
                this.f84429a = null;
                this.f84430b = null;
                this.f84431c = i0VarJ;
                this.f84432d = obj2;
                this.f84433e = obj3;
                this.f84435g = 3;
                objAwait2 = i0Var2.await(this);
                if (objAwait2 != aVar) {
                    list = (List) objAwait2;
                    this.f84436h = null;
                    this.f84429a = null;
                    this.f84430b = null;
                    this.f84431c = null;
                    this.f84432d = obj2;
                    this.f84433e = obj3;
                    this.f84434f = list;
                    this.f84435g = 4;
                    objAwait3 = i0VarJ.await(this);
                    if (objAwait3 != aVar) {
                        obj4 = obj3;
                        list2 = list;
                        list3 = (List) objAwait3;
                        j0Var = p13.j0.f134944a;
                        int i16 = o13.q.f128596b;
                        if (obj2 instanceof o13.q.b) {
                            obj2 = j0Var;
                        }
                        list4 = (List) obj2;
                        if (obj4 instanceof o13.q.b) {
                            obj4 = j0Var;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        while (r2.hasNext()) {
                            dVar = (zf2.d) obj6;
                            if (list4.contains(dVar)) {
                            }
                        }
                        listS0 = h0.S0(arrayList2, 5);
                        p2Var = nVar.f84426l;
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, f.a((f) value, false, false, null, i53.a.e(list4), i53.a.e(listS0), i53.a.e(list3), null, false, false, 454)));
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lhl1/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel$uiState$1", f = "SelectActivityViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super f>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super f> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            n nVar = n.this;
            nVar.getClass();
            ge1.b.T(v1.a(nVar), null, null, new o(nVar, null), 3);
            nVar.y4();
            ge1.b.T(v1.a(nVar), null, null, new p(nVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public n(long j8, fl1.c cVar, fl1.g gVar, fl1.f fVar, fl1.k kVar, fl1.m mVar, fl1.n nVar, cl1.a aVar, y51.a aVar2, ws.a aVar3, z zVar) {
        cVar.getClass();
        gVar.getClass();
        fVar.getClass();
        kVar.getClass();
        mVar.getClass();
        nVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        zVar.getClass();
        this.f84415a = j8;
        this.f84416b = cVar;
        this.f84417c = gVar;
        this.f84418d = fVar;
        this.f84419e = kVar;
        this.f84420f = mVar;
        this.f84421g = nVar;
        this.f84422h = aVar;
        this.f84423i = aVar2;
        this.f84424j = aVar3;
        this.f84425k = zVar;
        p2 p2VarA = q2.a(new f(false, false, null, null, null, null, null, false, false, 511, null));
        this.f84426l = p2VarA;
        r53.v vVar = new r53.v(new c(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f84427m = r53.s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
        this.f84428n = l0.f134950a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(n nVar, v13.c cVar) throws Throwable {
        q qVar;
        Object objA;
        boolean z14;
        nVar.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f84458d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f84458d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(nVar, cVar);
            }
        } else {
            qVar = new q(nVar, cVar);
        }
        Object obj = qVar.f84456b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f84458d;
        if (i15 == 0) {
            o13.r.b(obj);
            fl1.f fVar = nVar.f84418d;
            long j8 = nVar.f84415a;
            qVar.f84458d = 1;
            objA = fVar.a(j8, qVar);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            objA = ((o13.q) obj).f128597a;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = qVar.f84455a;
            o13.r.b(obj);
        }
        kl1.c.f105264a.getClass();
        return h0.b1(y.s(kl1.c.a((String) obj, z14).values()));
        Throwable thB = o13.q.b(objA);
        if (thB != null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.g(a2Var, "SelectActivityViewModel", thB);
        }
        Boolean bool = Boolean.FALSE;
        if (objA instanceof o13.q.b) {
            objA = bool;
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        z zVar = nVar.f84425k;
        r rVar = new r(nVar, null);
        qVar.f84455a = zBooleanValue;
        qVar.f84458d = 2;
        Object objE0 = ge1.b.e0(zVar, rVar, qVar);
        if (objE0 != aVar) {
            obj = objE0;
            z14 = zBooleanValue;
            kl1.c.f105264a.getClass();
            return h0.b1(y.s(kl1.c.a((String) obj, z14).values()));
        }
        return aVar;
    }

    public final void A4() {
        p2 p2Var;
        Object value;
        this.f84422h.a();
        do {
            p2Var = this.f84426l;
            value = p2Var.getValue();
        } while (!p2Var.b(value, f.a((f) value, false, false, null, null, null, null, null, false, false, 383)));
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f84426l;
            value = p2Var.getValue();
        } while (!p2Var.b(value, f.a((f) value, true, false, null, null, null, null, null, false, false, 510)));
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    public final void z4(zf2.d dVar) {
        Object value;
        p2 p2Var = this.f84426l;
        if (dVar == null) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, f.a((f) value, false, false, null, null, null, null, null, false, false, 319)));
            return;
        }
        boolean zA = this.f84421g.a(this.f84428n, dVar);
        while (true) {
            Object value2 = p2Var.getValue();
            zf2.d dVar2 = dVar;
            if (p2Var.b(value2, f.a((f) value2, false, false, null, null, null, null, dVar2, zA, false, 319))) {
                return;
            } else {
                dVar = dVar2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lhl1/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "RECENT_ACTIVITIES_COUNT", "I", "MAX_RECENT_ACTIVITIES", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(long j8, fl1.c cVar, fl1.g gVar, fl1.f fVar, fl1.k kVar, fl1.m mVar, fl1.n nVar, cl1.a aVar, y51.a aVar2, ws.a aVar3, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        z zVar2;
        if ((i14 & 1024) != 0) {
            x53.c cVar2 = s0.f129406a;
            zVar2 = x53.b.f189152a;
        } else {
            zVar2 = zVar;
        }
        this(j8, cVar, gVar, fVar, kVar, mVar, nVar, aVar, aVar2, aVar3, zVar2);
    }
}
