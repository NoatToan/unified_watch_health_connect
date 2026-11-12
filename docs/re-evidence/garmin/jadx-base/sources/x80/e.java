package x80;

import android.content.Context;
import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.s0;
import c22.s3;
import ca0.b2;
import ca0.o1;
import ca0.z1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import lc.u0;
import o13.q;
import o13.r;
import o53.b0;
import o53.z;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q92.x;
import r53.a2;
import r53.e2;
import r53.g2;
import r53.s;
import y80.p0;
import y80.w;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!¨\u0006#"}, d2 = {"Lx80/e;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "savedStateHandle", "Lca0/o1;", "deviceSetupFlow", "Landroid/content/Context;", "applicationContext", "Lx80/b;", "deviceSetupDelegate", "Ll80/b;", "gdiDelegate", "Lrd2/j;", "deviceSelectQuery", "Lf12/l;", "userSettings", "Lf12/b;", "userAccount", "Lb90/b;", "setupWhatsNewUseCase", "Lfj1/b;", "primaryDeviceRepository", "Lp90/n;", "checkDeviceDriveLiveTrackUseCase", "Lr90/b;", "getDeviceSetupDeniedPermissionsUseCase", "Lf90/a;", "areRequiredConsentsGranted", "Ly80/w;", "deviceSettingsRepository", "Lo53/z;", "ioDispatcher", "<init>", "(Landroidx/lifecycle/j1;Lca0/o1;Landroid/content/Context;Lx80/b;Ll80/b;Lrd2/j;Lf12/l;Lf12/b;Lb90/b;Lfj1/b;Lp90/n;Lr90/b;Lf90/a;Ly80/w;Lo53/z;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f189499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f189500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f189501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x80.b f189502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l80.b f189503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rd2.j f189504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f12.l f189505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f12.b f189506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b90.b f189507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fj1.b f189508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p90.n f189509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r90.b f189510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f90.a f189511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w f189512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z f189513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s0 f189514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e2 f189515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2 f189516r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f189517t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z80.h f189518v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q90.d f189519w;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f189521b;

        static {
            int[] iArr = new int[d90.g.values().length];
            try {
                iArr[d90.g.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d90.g.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d90.g.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f189520a = iArr;
            int[] iArr2 = new int[b2.values().length];
            try {
                iArr2[b2.PAIRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b2.BLE_CONNECTION_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b2.DEVICE_MIGRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b2.USER_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[b2.DEVICE_CUSTOMIZATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[b2.PERMISSIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[b2.CONSENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[b2.FAVORITE_ACTIVITIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[b2.SYNC.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[b2.GESTURE_TUTORIAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[b2.IN_REACH.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[b2.WIFI.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            f189521b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel$nextDeviceSetupPhase$1", f = "DeviceSetupViewModel.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f189522a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q90.c f189524c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q90.c cVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f189524c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new c(this.f189524c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f189522a;
            if (i14 == 0) {
                r.b(obj);
                w wVar = e.this.f189512n;
                long j8 = this.f189524c.f143493a;
                z80.f fVar = new z80.f((List) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, Boolean.TRUE, 127, (p005kotlin.jvm.internal.j) null);
                this.f189522a = 1;
                if (wVar.b(j8, fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                ((q) obj).getClass();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(j1 j1Var, o1 o1Var, Context context, x80.b bVar, l80.b bVar2, rd2.j jVar, f12.l lVar, f12.b bVar3, b90.b bVar4, fj1.b bVar5, p90.n nVar, r90.b bVar6, f90.a aVar, w wVar, z zVar) {
        j1Var.getClass();
        o1Var.getClass();
        context.getClass();
        bVar.getClass();
        bVar2.getClass();
        jVar.getClass();
        lVar.getClass();
        bVar3.getClass();
        bVar4.getClass();
        bVar5.getClass();
        nVar.getClass();
        bVar6.getClass();
        aVar.getClass();
        wVar.getClass();
        zVar.getClass();
        this.f189499a = j1Var;
        this.f189500b = o1Var;
        this.f189501c = context;
        this.f189502d = bVar;
        this.f189503e = bVar2;
        this.f189504f = jVar;
        this.f189505g = lVar;
        this.f189506h = bVar3;
        this.f189507i = bVar4;
        this.f189508j = bVar5;
        this.f189509k = nVar;
        this.f189510l = bVar6;
        this.f189511m = aVar;
        this.f189512n = wVar;
        this.f189513o = zVar;
        p0.f195200a.getClass();
        p0.f195202c = true;
        s0 s0Var = new s0(o1Var == o1.CREATE_ACCOUNT ? "BICLength_NewAccount" : "BICLength_ExistingUser", null, 2, 0 == true ? 1 : 0);
        this.f189514p = s0Var;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        ReentrantLock reentrantLock = s0Var.f23250d;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            reentrantLock.unlock();
            s0Var.f23249c = dateTimeNow;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            e2 e2VarB = g2.b(0, 0, null, 7);
            this.f189515q = e2VarB;
            this.f189516r = s.c(e2VarB);
            this.f189518v = z80.h.c.f203058b;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(e eVar, long j8, v13.c cVar) {
        m mVar;
        eVar.getClass();
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f189549d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f189549d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(eVar, cVar);
            }
        } else {
            mVar = new m(eVar, cVar);
        }
        Object objB = mVar.f189547b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f189549d;
        if (i15 == 0) {
            r.b(objB);
            fj1.b bVar = eVar.f189508j;
            gj1.d dVar = new gj1.d(new Long(j8));
            mVar.f189546a = j8;
            mVar.f189549d = 1;
            objB = bVar.b(dVar, mVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = mVar.f189546a;
            r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String strE = org.apache.commons.lang3.e.e(j8, "Successfully updated primary training device with ID: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSetupViewModel", strE);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String strN = wr.g.n("Failed to update primary training device with ID: ", j8, ". Error: ", ((v2.a) v2Var).f47383a);
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "DeviceSetupViewModel", strN);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(e eVar, long j8, v13.c cVar) {
        n nVar;
        eVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f189553d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f189553d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(eVar, cVar);
            }
        } else {
            nVar = new n(eVar, cVar);
        }
        Object objC = nVar.f189551b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f189553d;
        if (i15 == 0) {
            r.b(objC);
            fj1.b bVar = eVar.f189508j;
            nVar.f189550a = j8;
            nVar.f189553d = 1;
            objC = bVar.c(j8, nVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = nVar.f189550a;
            r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String strE = org.apache.commons.lang3.e.e(j8, "Successfully updated primary wearable device with ID: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSetupViewModel", strE);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String strN = wr.g.n("Failed to update primary wearable device with ID: ", j8, ". Error: ", ((v2.a) v2Var).f47383a);
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "DeviceSetupViewModel", strN);
        }
        return Unit.INSTANCE;
    }

    public final z1 A4(b2 b2Var) {
        b2Var.getClass();
        q90.c cVarZ4 = z4();
        if (cVarZ4 == null) {
            return z1.g.INSTANCE;
        }
        boolean z14 = cVarZ4.f143498f;
        boolean z15 = cVarZ4.f143502j;
        l90.b bVar = cVarZ4.f143495c;
        d90.d dVar = bVar.f111531p;
        int i14 = b.f189521b[b2Var.ordinal()];
        z zVar = this.f189513o;
        int i15 = 1;
        p005kotlin.jvm.internal.j jVar = null;
        switch (i14) {
            case 1:
                return z14 ? z1.a.INSTANCE : A4(b2.BLE_CONNECTION_MODE);
            case 2:
                if (z14) {
                    this.f189502d.q(cVarZ4.f143493a, bVar.f111530o);
                }
                return cVarZ4.f143499g ? z1.e.INSTANCE : A4(b2.DEVICE_MIGRATION);
            case 3:
                return z1.q.INSTANCE;
            case 4:
                if (dVar.f58445k == d90.g.INDEX) {
                    return z1.r.INSTANCE;
                }
                if (!dVar.f58440f.isEmpty()) {
                    return z1.d.INSTANCE;
                }
                ge1.b.T(v1.a(this), zVar, null, new h(cVarZ4, this, null), 2);
                return A4(b2.DEVICE_CUSTOMIZATION);
            case 5:
                q90.c cVarZ5 = z4();
                if (cVarZ5 != null && cVarZ5.f143496d) {
                    ge1.b.T(v1.a(this), zVar, null, new i(this, cVarZ5, null), 2);
                }
                return !this.f189510l.a(bVar.f111531p.f58444j).isEmpty() ? z1.m.INSTANCE : A4(b2.PERMISSIONS);
            case 6:
                this.f189511m.getClass();
                ArrayList<x> arrayListA = f90.j.a(z15);
                if (!arrayListA.isEmpty()) {
                    for (x xVar : arrayListA) {
                        boolean zH = d1.h(xVar, true);
                        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
                        String str = "Consent " + xVar.f143819a + " granted: " + zH;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "AreRequiredConsentsGranted", str);
                        if (!zH) {
                            return new z1.c(false, i15, jVar);
                        }
                    }
                }
                if (z15) {
                    ge1.b.T(v1.a(this), zVar, null, new c(cVarZ4, null), 2);
                }
                return A4(b2.CONSENT);
            case 7:
                s0 s0Var = this.f189514p;
                if (s0Var != null) {
                    ReentrantLock reentrantLock = s0Var.f23250d;
                    DateTime dateTimeNow = DateTime.now();
                    dateTimeNow.getClass();
                    reentrantLock.lock();
                    try {
                        reentrantLock.lock();
                        reentrantLock.unlock();
                        DateTime dateTime = s0Var.f23249c;
                        if (dateTime != null && dateTime.compareTo((ReadableInstant) dateTimeNow) < 0) {
                            s0Var.a(dateTime, dateTimeNow);
                        }
                        reentrantLock.lock();
                        try {
                            s0Var.f23249c = null;
                            reentrantLock.lock();
                            try {
                                Unit unit = Unit.INSTANCE;
                                reentrantLock.unlock();
                                reentrantLock.unlock();
                                reentrantLock.unlock();
                            } catch (Throwable th3) {
                                reentrantLock.unlock();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            reentrantLock.unlock();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        reentrantLock.unlock();
                        throw th5;
                    }
                }
                return dVar.f58446l ? z1.h.INSTANCE : A4(b2.FAVORITE_ACTIVITIES);
            case 8:
                return dVar.f58441g instanceof d90.f.c ? A4(b2.SYNC) : z1.p.INSTANCE;
            case 9:
                hk0.a.f().n(hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS, cVarZ4.f143494b);
                return dVar.f58442h != null ? z1.i.INSTANCE : A4(b2.GESTURE_TUTORIAL);
            case 10:
                return (this.f189506h.f() || s3.b()) ? A4(b2.IN_REACH) : z1.j.INSTANCE;
            case 11:
                int i16 = b.f189520a[dVar.f58445k.ordinal()];
                if (i16 == 1) {
                    return z1.r.INSTANCE;
                }
                if (i16 == 2) {
                    return z1.g.INSTANCE;
                }
                if (i16 == 3) {
                    return A4(b2.WIFI);
                }
                u0.r();
                return null;
            case 12:
                if (dVar.f58445k != d90.g.INDEX) {
                    return z1.g.INSTANCE;
                }
                if (!dVar.f58440f.isEmpty()) {
                    return z1.d.INSTANCE;
                }
                ge1.b.T(v1.a(this), zVar, null, new h(cVarZ4, this, null), 2);
                return A4(b2.DEVICE_CUSTOMIZATION);
            default:
                return z1.g.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceSetupViewModel", "Clearing resources");
        p0.f195200a.getClass();
        p0.f195202c = false;
        dv.a.a().f61318a = false;
    }

    public final q90.c z4() {
        return (q90.c) this.f189499a.a("paired_device");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lx80/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_PAIRED_DEVICE", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(j1 j1Var, o1 o1Var, Context context, x80.b bVar, l80.b bVar2, rd2.j jVar, f12.l lVar, f12.b bVar3, b90.b bVar4, fj1.b bVar5, p90.n nVar, r90.b bVar6, f90.a aVar, w wVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        z zVar2;
        if ((i14 & 16384) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar2 = x53.b.f189152a;
        } else {
            zVar2 = zVar;
        }
        this(j1Var, o1Var, context, bVar, bVar2, jVar, lVar, bVar3, bVar4, bVar5, nVar, bVar6, aVar, wVar, zVar2);
    }
}
