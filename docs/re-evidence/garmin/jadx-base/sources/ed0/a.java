package ed0;

import android.text.TextUtils;
import c22.o;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import ds.e0;
import e23.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.e1;
import o53.s0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import p13.x;
import r53.z1;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Led0/a;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f63825a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f63826b = m.b(new e51.c(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f63827c = m.b(new e51.c(7));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f63828d = m.b(new e51.c(8));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f63829e = m.b(new e51.c(9));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f63830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z1 f63831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f63832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z1 f63833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final tm2.a f63834j;

    /* JADX INFO: renamed from: ed0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1349a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w13.c f63835a = w13.b.g(yl2.b.values());
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ed0/a$b", "Lan2/a$e;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends an2.a.e {

        /* JADX INFO: renamed from: ed0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil$config$2$1$onDeviceRemoved$1", f = "DeviceSharingUtil.kt", l = {148}, m = "invokeSuspend", v = 2)
        public static final class C1350a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f63836a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f63837b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1350a(long j8, t13.d<? super C1350a> dVar) {
                super(2, dVar);
                this.f63837b = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1350a(this.f63837b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1350a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63836a;
                if (i14 == 0) {
                    r.b(obj);
                    l80.a aVar2 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                    this.f63836a = 1;
                    if (aVar2.P(this.f63837b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: ed0.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil$config$2$1$onDeviceRemoved$2", f = "DeviceSharingUtil.kt", l = {151, 151}, m = "invokeSuspend", v = 2)
        public static final class C1351b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f63838a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f63839b;

            public C1351b(t13.d<? super C1351b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1351b(dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return new C1351b(dVar).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (ed0.a.n((java.util.Collection) r6, r5) == r0) goto L15;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                a aVar;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63839b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        aVar = this.f63838a;
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                aVar = a.f63825a;
                aVar.getClass();
                c cVarE = a.e();
                this.f63838a = aVar;
                this.f63839b = 1;
                obj = cVarE.c();
                if (obj != aVar2) {
                }
                return aVar2;
                this.f63838a = null;
                this.f63839b = 2;
                a aVar3 = a.f63825a;
                aVar.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ed0/a$b$c", "Llm2/i$b;", "Ljava/lang/Void;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c implements lm2.i.b<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f63840a;

            public c(long j8) {
                this.f63840a = j8;
            }

            @Override // lm2.i.b
            public final void a(Void r14) {
                a.b(a.f63825a, false, this.f63840a);
            }

            @Override // lm2.i.b
            public final void onFailure(Throwable th3) {
                th3.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil$config$2$1$onNewDeviceAdded$1", f = "DeviceSharingUtil.kt", l = {129, 129}, m = "invokeSuspend", v = 2)
        public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f63841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f63842b;

            public d(t13.d<? super d> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new d(dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return new d(dVar).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (ed0.a.n((java.util.Collection) r6, r5) == r0) goto L15;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                a aVar;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63842b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        aVar = this.f63841a;
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                aVar = a.f63825a;
                aVar.getClass();
                c cVarE = a.e();
                this.f63841a = aVar;
                this.f63842b = 1;
                obj = cVarE.c();
                if (obj != aVar2) {
                }
                return aVar2;
                this.f63841a = null;
                this.f63842b = 2;
                a aVar3 = a.f63825a;
                aVar.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ed0/a$b$e", "Llm2/i$b;", "Ljava/lang/Void;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e implements lm2.i.b<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f63843a;

            public e(long j8) {
                this.f63843a = j8;
            }

            @Override // lm2.i.b
            public final void a(Void r14) {
                a.b(a.f63825a, true, this.f63843a);
            }

            @Override // lm2.i.b
            public final void onFailure(Throwable th3) {
                th3.getClass();
            }
        }

        public b(c cVar, Collection<String> collection, Set<Integer> set, e23.l<? super SharedDeviceInfo, Boolean> lVar) {
            super((dn2.i) cVar, (Collection) collection, (Collection) set, false, (e23.l) lVar, 8, (p005kotlin.jvm.internal.j) null);
        }

        @Override // an2.a.e
        public final Collection<cn2.a> b() {
            return u.m0(new cn2.a[]{cn2.a.f28064b, cn2.a.f28065c, cn2.a.f28066d});
        }

        @Override // an2.a.e
        public final boolean c() {
            return ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).i();
        }

        @Override // an2.a.e
        public final boolean d() {
            lm2.h.d();
            return GarminDeviceWakefulService.f33825e;
        }

        @Override // an2.a.e
        public final void e(SharedDeviceInfo sharedDeviceInfo) {
            sharedDeviceInfo.getClass();
            a.f63825a.getClass();
            a.g().debug("DeviceSharingUtil - onDeviceNeedsBond wasSavedLocally[" + sharedDeviceInfo.getWasSavedLocally() + "] " + sharedDeviceInfo);
            ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).M(sharedDeviceInfo);
        }

        @Override // an2.a.e
        public final void f(long j8, String str, boolean z14) {
            str.getClass();
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            ge1.b.T(c0.a(bVar), null, null, new C1350a(j8, null), 3);
            if (!z14) {
                a.b(a.f63825a, false, j8);
                ge1.b.T(c0.a(bVar), null, null, new C1351b(null), 3);
            } else if (z14) {
                an2.a.f4492e.getClass();
                if (an2.a.d.b(str, this.f4510b) || str.length() == 0) {
                    a.m("BroadcastRemove", new c(j8));
                }
            }
        }

        @Override // an2.a.e
        public final void g(long j8, String str, boolean z14) {
            if (!z14) {
                a.b(a.f63825a, true, j8);
                x53.c cVar = s0.f129406a;
                ge1.b.T(c0.a(x53.b.f189152a), null, null, new d(null), 3);
            } else if (z14) {
                an2.a.f4492e.getClass();
                if (an2.a.d.b(str, this.f4510b) || str.length() == 0) {
                    a.m("BroadcastNew", new e(j8));
                }
            }
        }

        @Override // an2.a.e
        public final boolean h(String str) {
            str.getClass();
            return !u0.u(str, false);
        }

        @Override // an2.a.e
        public final dn2.d i() {
            l lVar = new l();
            a.f63825a.getClass();
            return new dn2.d(lVar, a.f63834j);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ed0/a$c", "Ltm2/c;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends tm2.c {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // tm2.c, tm2.b, dn2.c
        public final Object l(SharedDeviceInfo sharedDeviceInfo, boolean z14, v13.c cVar) {
            ed0.d dVar;
            Object value;
            if (cVar instanceof ed0.d) {
                dVar = (ed0.d) cVar;
                int i14 = dVar.f63854e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    dVar.f63854e = i14 - Integer.MIN_VALUE;
                } else {
                    dVar = new ed0.d(this, cVar);
                }
            } else {
                dVar = new ed0.d(this, cVar);
            }
            Object obj = dVar.f63852c;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = dVar.f63854e;
            if (i15 == 0) {
                r.b(obj);
                dVar.f63850a = sharedDeviceInfo;
                dVar.f63851b = z14;
                dVar.f63854e = 1;
                if (super.l(sharedDeviceInfo, z14, dVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z14 = dVar.f63851b;
                sharedDeviceInfo = dVar.f63850a;
                r.b(obj);
            }
            if (!z14 && sharedDeviceInfo.isPaired()) {
                a.f63825a.getClass();
                wr.g.w("DeviceSharingUtil - updateDevice to paired ", sharedDeviceInfo.getUnitID(), a.g());
                z1 z1Var = (z1) a.f63832h.getValue();
                do {
                    value = z1Var.getValue();
                    ((Number) value).intValue();
                    a.f63825a.getClass();
                } while (!z1Var.b(value, new Integer(a.i())));
            }
            return Unit.INSTANCE;
        }

        @Override // tm2.c
        public final void o(long j8) {
            ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).k(j8);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil$fetchRegisteredGCDevices$1", f = "DeviceSharingUtil.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d80.b f63844a;

        /* JADX INFO: renamed from: ed0.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ed0/a$d$a", "Ldn2/d$c;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1352a implements dn2.d.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d80.b f63845a;

            public C1352a(d80.b bVar) {
                this.f63845a = bVar;
            }

            @Override // dn2.d.c
            public final void a(JSONArray jSONArray) throws JSONException {
                bm2.c cVarD;
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    a.f63825a.getClass();
                    tm2.a aVar = a.f63834j;
                    jSONObject.getClass();
                    aVar.getClass();
                    try {
                        cVarD = bm2.c.d(jSONObject);
                    } catch (Exception unused) {
                        cVarD = null;
                    }
                    if (cVarD != null) {
                        arrayList.add(cVarD);
                    }
                }
                this.f63845a.b(arrayList, d80.b.a.GARMIN_CONNECT);
            }

            @Override // dn2.d.c
            public final void onFailure(Throwable th3) {
                lj0.b bVar = lj0.b.f112951e;
                if (th3 instanceof JSONException) {
                    bVar = lj0.b.f112955i;
                }
                this.f63845a.a(bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d80.b bVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f63844a = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f63844a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l lVar = new l();
            a.f63825a.getClass();
            new dn2.d(lVar, a.f63834j).d(new C1352a(this.f63844a));
            return Unit.INSTANCE;
        }
    }

    static {
        t tVarB = m.b(new e51.c(10));
        f63830f = tVarB;
        f63831g = (z1) tVarB.getValue();
        t tVarB2 = m.b(new e51.c(11));
        f63832h = tVarB2;
        f63833i = (z1) tVarB2.getValue();
        f63834j = new tm2.a();
    }

    private a() {
    }

    public static final an2.a a(a aVar) {
        aVar.getClass();
        return (an2.a) f63829e.getValue();
    }

    public static final void b(a aVar, boolean z14, long j8) {
        aVar.getClass();
        oi2.a.C2513a.a(oi2.a.f132270a, new ql2.a.b(j8, z14));
    }

    public static final void d(d80.b bVar) {
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new d(bVar, null), 3);
    }

    public static c e() {
        return (c) f63827c.getValue();
    }

    public static final Collection<String> f() {
        Set<String> setA = ((pc0.i) KoinJavaComponent.get$default(pc0.i.class, null, null, 6, null)).a();
        f63825a.getClass();
        g().info("DeviceSharingUtil - getDeviceTypes " + setA.size() + " product numbers");
        Set<String> setB = setA;
        if (setB.isEmpty()) {
            w13.c cVar = C1349a.f63835a;
            ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                if (!TextUtils.isEmpty(((yl2.b) next).f197835d)) {
                    arrayListK.add(next);
                }
            }
            setB = yl2.b.b(arrayListK);
        }
        return setB;
    }

    public static Logger g() {
        return (Logger) f63826b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable h(v13.c cVar) {
        e eVar;
        bm2.d dVar;
        Integer numI;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f63856b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f63856b = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar);
            }
        } else {
            eVar = new e(cVar);
        }
        Object objC = eVar.f63855a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f63856b;
        a aVar2 = f63825a;
        if (i15 == 0) {
            r.b(objC);
            aVar2.getClass();
            c cVarE = e();
            eVar.f63856b = 1;
            objC = cVarE.c();
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objC);
        }
        ArrayList<SharedDeviceInfo> arrayList = new ArrayList();
        for (Object obj : (Iterable) objC) {
            if (((SharedDeviceInfo) obj).isPaired()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (SharedDeviceInfo sharedDeviceInfo : arrayList) {
            aVar2.getClass();
            Integer numI2 = d53.t.i(sharedDeviceInfo.getProductNumber());
            if (TextUtils.isEmpty(sharedDeviceInfo.getMacAddress()) || sharedDeviceInfo.getConnectionType() == null || numI2 == null) {
                dVar = null;
            } else {
                long unitID = sharedDeviceInfo.getUnitID();
                int iIntValue = numI2.intValue();
                String macAddress = sharedDeviceInfo.getMacAddress();
                macAddress.getClass();
                String displayName = sharedDeviceInfo.getDisplayName();
                String softwareVersion = sharedDeviceInfo.getSoftwareVersion();
                int iIntValue2 = (softwareVersion == null || (numI = d53.t.i(softwareVersion)) == null) ? 0 : numI.intValue();
                Integer connectionType = sharedDeviceInfo.getConnectionType();
                connectionType.getClass();
                dVar = new bm2.d(unitID, iIntValue, macAddress, displayName, iIntValue2, connectionType.intValue(), new Configuration(sharedDeviceInfo.getCapabilities()));
            }
            if (dVar != null) {
                arrayList2.add(dVar);
            }
        }
        return arrayList2;
    }

    public static int i() {
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        int i14 = 0;
        if (arrayListD != null && !arrayListD.isEmpty()) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                if (((sd2.f) it.next()).isPaired() && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return i14;
    }

    public static Object j(String str, v13.i iVar) throws Throwable {
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
            e0.u("DeviceSharingUtil - Ignoring ", str, ".initializeConnections() user is not signed in!", g());
            return Unit.INSTANCE;
        }
        com.airbnb.lottie.animation.keyframe.a.u("DeviceSharingUtil - ", str, ".initializeConnections()", g());
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new f(null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public static void k(String str) {
        e1 e1Var = e1.f129333a;
        str.getClass();
        e1Var.getClass();
        ge1.b.T(e1Var, null, null, new g(str, null), 3);
    }

    public static final c2 m(String str, lm2.i.b bVar) {
        f63825a.getClass();
        g().info("DeviceSharingUtil - " + str + ".reconcilePairedDevices()");
        e1 e1Var = e1.f129333a;
        x53.c cVar = s0.f129406a;
        return ge1.b.T(e1Var, x53.b.f189152a, null, new h(str, bVar, null), 2);
    }

    public static Object n(Collection collection, v13.c cVar) throws Throwable {
        x53.c cVar2 = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new k(collection, null), cVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, v13.c cVar) {
        ed0.b bVar;
        boolean zBooleanValue;
        if (cVar instanceof ed0.b) {
            bVar = (ed0.b) cVar;
            int i14 = bVar.f63848c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f63848c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new ed0.b(this, cVar);
            }
        } else {
            bVar = new ed0.b(this, cVar);
        }
        Object objE0 = bVar.f63846a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f63848c;
        try {
            if (i15 == 0) {
                r.b(objE0);
                g().info("DeviceSharingUtil - createDeviceBond(" + str + ")");
                x53.c cVar2 = s0.f129406a;
                x53.b bVar2 = x53.b.f189152a;
                ed0.c cVar3 = new ed0.c(str, null);
                bVar.f63848c = 1;
                objE0 = ge1.b.e0(bVar2, cVar3, bVar);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objE0);
            }
            zBooleanValue = ((Boolean) objE0).booleanValue();
        } catch (Throwable th3) {
            g().error("DeviceSharingUtil - createDeviceBond failed", th3);
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (r11.O(r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f63869e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f63869e = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objE0 = iVar.f63867c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f63869e;
        try {
            if (i15 == 0) {
                r.b(objE0);
                g().info("DeviceSharingUtil - " + str + ".reconcilePairedDevices()");
                x53.c cVar2 = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                j jVar = new j(null);
                iVar.f63865a = str;
                iVar.f63869e = 1;
                objE0 = ge1.b.e0(bVar, jVar, iVar);
                if (objE0 == aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                str = iVar.f63865a;
                r.b(objE0);
            } else if (i15 == 2) {
                Collection collection = iVar.f63866b;
                str = iVar.f63865a;
                r.b(objE0);
                l80.a aVar2 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                iVar.f63865a = str;
                iVar.f63866b = null;
                iVar.f63869e = 3;
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Collection collection2 = iVar.f63866b;
                String str2 = iVar.f63865a;
                r.b(objE0);
            }
            return Unit.INSTANCE;
            Collection collection3 = (Collection) objE0;
            g().info("DeviceSharingUtil - " + str + ".reconcilePairedDevices complete");
            iVar.f63865a = str;
            iVar.f63866b = collection3;
            iVar.f63869e = 2;
            if (n(collection3, iVar) != aVar) {
                l80.a aVar3 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                iVar.f63865a = str;
                iVar.f63866b = null;
                iVar.f63869e = 3;
            }
            return aVar;
        } catch (Throwable th3) {
            g().error("DeviceSharingUtil - " + str + ".reconcilePairedDevices failed", th3);
        }
    }
}
