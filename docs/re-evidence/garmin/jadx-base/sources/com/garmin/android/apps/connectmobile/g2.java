package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.locale.LocaleUpdateWorker;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileLoginWorker;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.android.gms.wallet.WalletConstants;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g2;", "Lxf0/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g2 extends xf0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GarminConnectMobileApp f35290a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.GarminConnectMobileApp$registerEventListeners$1$onAppForeground$1", f = "GarminConnectMobileApp.kt", l = {353}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GarminConnectMobileApp f35292b;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.g2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.GarminConnectMobileApp$registerEventListeners$1$onAppForeground$1$1", f = "GarminConnectMobileApp.kt", l = {358}, m = "invokeSuspend", v = 2)
        public static final class C0607a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35293a;

            public C0607a(t13.d<? super C0607a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0607a(dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return new C0607a(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object objC;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f35293a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    dq1.d.f60719j.getClass();
                    dq1.d dVar = (dq1.d) dq1.d.f60720k.getValue();
                    this.f35293a = 1;
                    if (!dVar.f60722b.invoke().booleanValue() || (objC = dVar.c("app foreground", true, this)) != aVar) {
                        objC = Unit.INSTANCE;
                    }
                    if (objC == aVar) {
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
        @v13.e(c = "com.garmin.android.apps.connectmobile.GarminConnectMobileApp$registerEventListeners$1$onAppForeground$1$2", f = "GarminConnectMobileApp.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, 408}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35294a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f35295b;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f35295b = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
            
                if (r7.e(r6) == r0) goto L15;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f35294a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                a2 a2Var = a2.PROMOTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var, "GarminConnectMobileApp", "App foreground. Reset promos if old.");
                zd0.p0 p0Var = zd0.p0.f204108a;
                this.f35295b = null;
                this.f35294a = 1;
                if (p0Var.a(this) != aVar) {
                }
                return aVar;
                zd0.q0 q0Var = (zd0.q0) KoinJavaComponent.get$default(zd0.q0.class, null, null, 6, null);
                this.f35295b = null;
                this.f35294a = 2;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.GarminConnectMobileApp$registerEventListeners$1$onAppForeground$1$3", f = "GarminConnectMobileApp.kt", l = {416, 417}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35296a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GarminConnectMobileApp f35297b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(GarminConnectMobileApp garminConnectMobileApp, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f35297b = garminConnectMobileApp;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f35297b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
            
                if (c22.f2.a("GarminConnectMobileApp", r4) == r0) goto L17;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f35296a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    o53.c2 c2Var = this.f35297b.f28694f;
                    if (c2Var != null) {
                        this.f35296a = 1;
                        if (c2Var.P(this) != aVar) {
                        }
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
                this.f35296a = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GarminConnectMobileApp garminConnectMobileApp, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f35292b = garminConnectMobileApp;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f35292b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Object objE;
            ea2.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35291a;
            if (i14 == 0) {
                o13.r.b(obj);
                f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                this.f35291a = 1;
                objE = bVar.E(this);
                if (objE == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objE = obj;
            }
            boolean zBooleanValue = ((Boolean) objE).booleanValue();
            GarminConnectMobileApp garminConnectMobileApp = this.f35292b;
            if (zBooleanValue) {
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new C0607a(null), 3);
                if (!y80.p0.f195202c) {
                    yr1.e.f199078a.getClass();
                    if (((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).l()) {
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.SYNC;
                        aVar3.getClass();
                        i2.a.b(a2Var, "GarminConnectMobileApp", "sendAppForegroundEvent - user is in setup flow, NOT notifying connected devices of app visibility");
                    } else {
                        ArrayList<DeviceProfile> arrayListW = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).w();
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var2 = a2.SYNC;
                        String str = "sendAppForegroundEvent - connected devices count = " + arrayListW.size();
                        aVar4.getClass();
                        i2.a.b(a2Var2, "GarminConnectMobileApp", str);
                        for (DeviceProfile deviceProfile : arrayListW) {
                            i2.a aVar5 = i2.f36769a;
                            a2 a2Var3 = a2.SYNC;
                            String str2 = "sendAppForegroundEvent - macAddress[" + deviceProfile.getMacAddress() + "] DeviceProfile[" + deviceProfile + "]";
                            aVar5.getClass();
                            i2.a.b(a2Var3, "GarminConnectMobileApp", str2);
                            yr1.d.c(deviceProfile.getF92746j(), false);
                        }
                    }
                }
                long j8 = GCMSettingManager.f41536b.getLong(GCMSettingManager.f41535a.getString(R.string.key_users_last_login_timestamp), 0L);
                long millis = c22.j0.R(DateTime.now()).getMillis();
                if (millis - j8 >= 86400000) {
                    GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_users_last_login_timestamp), millis).apply();
                    UserProfileLoginWorker.f46522g.getClass();
                    UserProfileLoginWorker.a.a();
                }
                for (ok2.g gVar : ok2.a0.f132585h.a().e()) {
                    gVar.getClass();
                    ok2.y.a aVar6 = new ok2.y.a(null, null, null, null, null, false, null, 127, null);
                    aVar6.f132819f = true;
                    ok2.y.d dVar = ok2.y.d.DEFAULT;
                    dVar.getClass();
                    aVar6.f132816c = dVar;
                    ok2.y.d dVar2 = ok2.y.d.BLOCKED;
                    dVar2.getClass();
                    aVar6.f132817d = dVar2;
                    aVar6.f132818e = ok2.g0.AUTOMATIC_STANDARD;
                    if (gVar.B() == null) {
                        gVar.f132686e.set(true);
                    }
                    if (gVar.B() != null) {
                        gVar.H(new ok2.y(aVar6), null);
                    }
                }
                if (!GarminDeviceWakefulService.f33825e) {
                    GarminConnectMobileApp.f28685g.getClass();
                    hk0.a.g(GarminConnectMobileApp.a.a()).getClass();
                    for (DeviceProfile deviceProfile2 : ((da2.b) hk0.s.a()).e()) {
                        if (!zb0.u0.n(String.valueOf(deviceProfile2.getF92744h()), zb0.u0.L5) && !((l80.b) KoinJavaComponent.get(l80.b.class)).h(deviceProfile2.getF92746j()) && (aVar = (ea2.a) hk0.s.a().getCapability(deviceProfile2.getMacAddress(), ea2.a.class)) != null) {
                            aVar.setApplicationVisibility(true);
                        }
                    }
                }
                zb0.b bVarA = zb0.b.a();
                GarminConnectMobileApp.f28685g.getClass();
                Context contextA = GarminConnectMobileApp.a.a();
                bVarA.getClass();
                j22.b.f96736a.getClass();
                if (j22.b.b(contextA)) {
                    bVarA.postDelayed(new za.j(2, bVarA, contextA), 2000L);
                }
                Context contextA2 = GarminConnectMobileApp.a.a();
                Uri uri = GolfDeviceProviderWorker.f28701e;
                com.airbnb.lottie.animation.keyframe.a.o(ue.i0.f170088a, contextA2).a("com.garmin.android.apps.golf", ue.l.REPLACE, new ue.x.a((Class<? extends androidx.work.d>) GolfDeviceProviderWorker.class).e(0L, TimeUnit.MILLISECONDS).a()).a();
                ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).a().e(true);
                ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().d(true);
                KoinJavaComponent.get$default(n00.e.class, null, null, 6, null);
                LocaleUpdateWorker.a aVar7 = LocaleUpdateWorker.f43431l;
                Context contextA3 = GarminConnectMobileApp.a.a();
                aVar7.getClass();
                LocaleUpdateWorker.a.a(contextA3);
                com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar8 = (com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null);
                if (garminConnectMobileApp.f28690b || aVar8.i()) {
                    aVar8.k(garminConnectMobileApp.f28690b ? com.garmin.android.apps.connectmobile.googlehealthconnect.b.c.APP_STARTED : com.garmin.android.apps.connectmobile.googlehealthconnect.b.c.APP_FOREGROUNDED, false);
                }
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new b(null), 3);
            }
            l.g().getClass();
            gh2.i.f77458c.a().i();
            x53.c cVar2 = o53.s0.f129406a;
            ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new c(garminConnectMobileApp, null), 3);
            v1.f47374a.getClass();
            v1.i();
            return Unit.INSTANCE;
        }
    }

    public g2(GarminConnectMobileApp garminConnectMobileApp) {
        this.f35290a = garminConnectMobileApp;
    }

    @Override // xf0.a
    public final void onAppBackground(pi2.d dVar) {
        dVar.getClass();
        super.onAppBackground(dVar);
        GarminConnectMobileApp garminConnectMobileApp = this.f35290a;
        garminConnectMobileApp.f28689a = true;
        garminConnectMobileApp.f28690b = false;
        GarminConnectMobileApp.f28686h.debug("*** BACKGROUND ***");
    }

    @Override // xf0.a
    public final void onAppForeground(pi2.e eVar) {
        eVar.getClass();
        super.onAppForeground(eVar);
        GarminConnectMobileApp garminConnectMobileApp = this.f35290a;
        garminConnectMobileApp.f28689a = false;
        GarminConnectMobileApp.f28686h.debug("*** FOREGROUND ***");
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(u53.o.f168762a.H()), null, null, new a(garminConnectMobileApp, null), 3);
    }
}
