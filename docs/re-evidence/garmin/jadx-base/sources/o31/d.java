package o31;

import am.j;
import android.R;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.n0;
import c22.k;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.ktx.AppUpdateManagerKtxKt;
import e23.p;
import f.i;
import f12.l;
import ht2.n;
import ht2.r;
import mt0.h0;
import o13.m;
import o13.q;
import o13.t;
import o53.b0;
import o53.c0;
import o53.e2;
import o53.f0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r22.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lo31/d;", "Lo31/a;", "Lc22/k;", "appConfiguration", "Lf12/l;", "userSettings", "Lo53/z;", "ioDispatcher", "<init>", "(Lc22/k;Lf12/l;Lo53/z;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements o31.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f128763j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f128764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f128765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f128766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b.g f128767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f.c<i> f128768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f128769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f128770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f128771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f128772i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.inappupdate.InAppUpdateManager$initialize$1", f = "InAppUpdateManager.kt", l = {105}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f128773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f128774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f128775c;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f128775c = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            b0 b0Var = (b0) this.f128775c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128774b;
            if (i14 == 0) {
                o13.r.b(obj);
                r rVar2 = new r(0, 1, null);
                n nVar = n.f85666a;
                this.f128775c = b0Var;
                this.f128773a = rVar2;
                this.f128774b = 1;
                if (nVar.d(rVar2, this) == aVar) {
                    return aVar;
                }
                rVar = rVar2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rVar = this.f128773a;
                o13.r.b(obj);
            }
            String str = "In app updates initialized with settings: " + rVar;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "InAppUpdateManager", str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.inappupdate.InAppUpdateManager$onResume$1", f = "InAppUpdateManager.kt", l = {211}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f128777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.inappupdate.d f128778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f128779d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.garmin.inappupdate.d dVar, d dVar2, t13.d<? super c> dVar3) {
            super(2, dVar3);
            this.f128778c = dVar;
            this.f128779d = dVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(this.f128778c, this.f128779d, dVar);
            cVar.f128777b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object bVar2;
            b0 b0Var = (b0) this.f128777b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128776a;
            com.garmin.inappupdate.d dVar = this.f128778c;
            d dVar2 = this.f128779d;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var, "InAppUpdateManager", "Checking status for started in-app update with type: " + dVar);
                    int i15 = q.f128596b;
                    int i16 = d.f128763j;
                    AppUpdateManager appUpdateManagerB = dVar2.b();
                    this.f128777b = b0Var;
                    this.f128776a = 1;
                    obj = AppUpdateManagerKtxKt.requestAppUpdateInfo(appUpdateManagerB, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                bVar = (AppUpdateInfo) obj;
                int i17 = q.f128596b;
            } catch (Throwable th3) {
                int i18 = q.f128596b;
                bVar = new q.b(th3);
            }
            Throwable thB = q.b(bVar);
            if (thB != null) {
                String strP = j.p("Failed to retrieve app update info: ", thB);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "InAppUpdateManager", strP);
                return Unit.INSTANCE;
            }
            AppUpdateInfo appUpdateInfo = (AppUpdateInfo) bVar;
            if (!c0.g(b0Var)) {
                return Unit.INSTANCE;
            }
            if (appUpdateInfo.installStatus() == 4) {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var3, "InAppUpdateManager", "In-app update is already installed, resetting prompt type");
                dVar2.f128765b.u2(com.garmin.inappupdate.d.NONE.f52420a, "in_app_update_started_prompt_type");
            } else if (dVar == com.garmin.inappupdate.d.IMMEDIATE && appUpdateInfo.updateAvailability() == 3) {
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar5.getClass();
                i2.a.b(a2Var4, "InAppUpdateManager", "In-app update is already in progress, resuming update flow");
                try {
                    int i19 = d.f128763j;
                    AppUpdateManager appUpdateManagerB2 = dVar2.b();
                    f.c<i> cVar = dVar2.f128768e;
                    if (cVar == null) {
                        s.m("inAppUpdateLauncher");
                        throw null;
                    }
                    bVar2 = Boolean.valueOf(appUpdateManagerB2.startUpdateFlowForResult(appUpdateInfo, cVar, AppUpdateOptions.newBuilder(1).build()));
                    Throwable thB2 = q.b(bVar2);
                    if (thB2 != null) {
                        String strP2 = j.p("Failed to resume in-app update flow: ", thB2);
                        i2.a aVar6 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar6.getClass();
                        i2.a.f(a2Var5, "InAppUpdateManager", strP2);
                    }
                    if (!(bVar2 instanceof q.b)) {
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var6 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.b(a2Var6, "InAppUpdateManager", "In-app update flow resumed successfully");
                    }
                } catch (Throwable th4) {
                    int i24 = q.f128596b;
                    bVar2 = new q.b(th4);
                }
            } else if (dVar == com.garmin.inappupdate.d.FLEXIBLE && appUpdateInfo.installStatus() == 11) {
                i2.a aVar8 = i2.f36769a;
                a2 a2Var7 = a2.GENERAL;
                aVar8.getClass();
                i2.a.b(a2Var7, "InAppUpdateManager", "In-app flexible update is is downloaded but not installed, notify the user to complete the update.");
                int i25 = d.f128763j;
                t tVar = dVar2.f128771h;
                if (((q0) tVar.getValue()).isShownOrQueued()) {
                    ((q0) tVar.getValue()).dismiss();
                }
                ((q0) tVar.getValue()).show();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public d(k kVar, l lVar, z zVar) {
        kVar.getClass();
        lVar.getClass();
        zVar.getClass();
        this.f128764a = kVar;
        this.f128765b = lVar;
        this.f128766c = zVar;
        final int i14 = 0;
        this.f128769f = m.b(new e23.a(this) { // from class: o31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f128761b;

            {
                this.f128761b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                String installerPackageName;
                int i15 = i14;
                boolean z14 = false;
                final d dVar = this.f128761b;
                switch (i15) {
                    case 0:
                        b.g gVar = dVar.f128767d;
                        if (gVar == null) {
                            s.m("activity");
                            throw null;
                        }
                        Context applicationContext = gVar.getApplicationContext();
                        applicationContext.getClass();
                        try {
                            if (Build.VERSION.SDK_INT >= 30) {
                                InstallSourceInfo installSourceInfo = applicationContext.getPackageManager().getInstallSourceInfo(applicationContext.getPackageName());
                                installSourceInfo.getClass();
                                installerPackageName = installSourceInfo.getInstallingPackageName();
                            } else {
                                installerPackageName = applicationContext.getPackageManager().getInstallerPackageName(applicationContext.getPackageName());
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException e4) {
                            String strN = fb1.c.n("Package name not found: ", e4.getMessage());
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.f(a2Var, "InAppUpdateManager", strN);
                            installerPackageName = null;
                        } catch (Exception e14) {
                            String strN2 = fb1.c.n("Error getting installer package name: ", e14.getMessage());
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.f(a2Var2, "InAppUpdateManager", strN2);
                            installerPackageName = null;
                        }
                        String strN3 = fb1.c.n("Installer package name: ", installerPackageName);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "InAppUpdateManager", strN3);
                        boolean z15 = installerPackageName != null && (installerPackageName.equals("com.android.vending") || installerPackageName.equals("com.google.android.gms"));
                        i2.a.b(a2Var3, "InAppUpdateManager", "Is app installed from Google Play: " + z15);
                        b.g gVar2 = dVar.f128767d;
                        if (gVar2 == null) {
                            s.m("activity");
                            throw null;
                        }
                        boolean zC = c22.h.c(gVar2.getApplicationContext());
                        i2.a.b(a2Var3, "InAppUpdateManager", "Is Google Play Services available: " + zC);
                        if (z15 && zC) {
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 1:
                        b.g gVar3 = dVar.f128767d;
                        if (gVar3 == null) {
                            s.m("activity");
                            throw null;
                        }
                        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(gVar3.getApplicationContext());
                        appUpdateManagerCreate.getClass();
                        return appUpdateManagerCreate;
                    case 2:
                        int i16 = d.f128763j;
                        q0.b bVar = q0.f149800b;
                        b.g gVar4 = dVar.f128767d;
                        if (gVar4 == null) {
                            s.m("activity");
                            throw null;
                        }
                        View viewFindViewById = gVar4.getWindow().getDecorView().findViewById(R.id.content);
                        viewFindViewById.getClass();
                        b.g gVar5 = dVar.f128767d;
                        if (gVar5 == null) {
                            s.m("activity");
                            throw null;
                        }
                        String string = gVar5.getString(com.garmin.android.apps.connectmobile.R.string.msg_app_download_complete, gVar5.getString(com.garmin.android.apps.connectmobile.R.string.common_garmin_connect));
                        string.getClass();
                        q0 q0VarC = q0.b.c(bVar, viewFindViewById, string, null, 12);
                        q0VarC.setDuration(0);
                        q0VarC.b(com.garmin.android.apps.connectmobile.R.string.lbl_restart, new h0(dVar, 27));
                        return q0VarC;
                    default:
                        int i17 = d.f128763j;
                        return new InstallStateUpdatedListener() { // from class: o31.c
                            @Override // com.google.android.play.core.listener.StateUpdatedListener
                            public final void onStateUpdate(InstallState installState) {
                                InstallState installState2 = installState;
                                int i18 = d.f128763j;
                                installState2.getClass();
                                int iInstallStatus = installState2.installStatus();
                                d dVar2 = dVar;
                                if (iInstallStatus == 4) {
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar4.getClass();
                                    i2.a.b(a2Var4, "InAppUpdateManager", "In-app update installed successfully");
                                    dVar2.f128765b.u2(com.garmin.inappupdate.d.NONE.f52420a, "in_app_update_started_prompt_type");
                                    return;
                                }
                                if (iInstallStatus != 11) {
                                    String strH = j.h(installState2.installStatus(), "In-app update state changed: ");
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var5 = a2.GENERAL;
                                    aVar5.getClass();
                                    i2.a.b(a2Var5, "InAppUpdateManager", strH);
                                    return;
                                }
                                if (dVar2.c() != com.garmin.inappupdate.d.FLEXIBLE) {
                                    i2.a aVar6 = i2.f36769a;
                                    a2 a2Var6 = a2.GENERAL;
                                    aVar6.getClass();
                                    i2.a.b(a2Var6, "InAppUpdateManager", "Immediate In-app update downloaded");
                                    return;
                                }
                                i2.a aVar7 = i2.f36769a;
                                a2 a2Var7 = a2.GENERAL;
                                aVar7.getClass();
                                i2.a.b(a2Var7, "InAppUpdateManager", "Flexible In-app update downloaded, prompting user to complete update");
                                t tVar = dVar2.f128771h;
                                if (((q0) tVar.getValue()).isShownOrQueued()) {
                                    ((q0) tVar.getValue()).dismiss();
                                }
                                ((q0) tVar.getValue()).show();
                            }
                        };
                }
            }
        });
        final int i15 = 1;
        this.f128770g = m.b(new e23.a(this) { // from class: o31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f128761b;

            {
                this.f128761b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                String installerPackageName;
                int i16 = i15;
                boolean z14 = false;
                final d dVar = this.f128761b;
                switch (i16) {
                    case 0:
                        b.g gVar = dVar.f128767d;
                        if (gVar == null) {
                            s.m("activity");
                            throw null;
                        }
                        Context applicationContext = gVar.getApplicationContext();
                        applicationContext.getClass();
                        try {
                            if (Build.VERSION.SDK_INT >= 30) {
                                InstallSourceInfo installSourceInfo = applicationContext.getPackageManager().getInstallSourceInfo(applicationContext.getPackageName());
                                installSourceInfo.getClass();
                                installerPackageName = installSourceInfo.getInstallingPackageName();
                            } else {
                                installerPackageName = applicationContext.getPackageManager().getInstallerPackageName(applicationContext.getPackageName());
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException e4) {
                            String strN = fb1.c.n("Package name not found: ", e4.getMessage());
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.f(a2Var, "InAppUpdateManager", strN);
                            installerPackageName = null;
                        } catch (Exception e14) {
                            String strN2 = fb1.c.n("Error getting installer package name: ", e14.getMessage());
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.f(a2Var2, "InAppUpdateManager", strN2);
                            installerPackageName = null;
                        }
                        String strN3 = fb1.c.n("Installer package name: ", installerPackageName);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "InAppUpdateManager", strN3);
                        boolean z15 = installerPackageName != null && (installerPackageName.equals("com.android.vending") || installerPackageName.equals("com.google.android.gms"));
                        i2.a.b(a2Var3, "InAppUpdateManager", "Is app installed from Google Play: " + z15);
                        b.g gVar2 = dVar.f128767d;
                        if (gVar2 == null) {
                            s.m("activity");
                            throw null;
                        }
                        boolean zC = c22.h.c(gVar2.getApplicationContext());
                        i2.a.b(a2Var3, "InAppUpdateManager", "Is Google Play Services available: " + zC);
                        if (z15 && zC) {
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 1:
                        b.g gVar3 = dVar.f128767d;
                        if (gVar3 == null) {
                            s.m("activity");
                            throw null;
                        }
                        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(gVar3.getApplicationContext());
                        appUpdateManagerCreate.getClass();
                        return appUpdateManagerCreate;
                    case 2:
                        int i17 = d.f128763j;
                        q0.b bVar = q0.f149800b;
                        b.g gVar4 = dVar.f128767d;
                        if (gVar4 == null) {
                            s.m("activity");
                            throw null;
                        }
                        View viewFindViewById = gVar4.getWindow().getDecorView().findViewById(R.id.content);
                        viewFindViewById.getClass();
                        b.g gVar5 = dVar.f128767d;
                        if (gVar5 == null) {
                            s.m("activity");
                            throw null;
                        }
                        String string = gVar5.getString(com.garmin.android.apps.connectmobile.R.string.msg_app_download_complete, gVar5.getString(com.garmin.android.apps.connectmobile.R.string.common_garmin_connect));
                        string.getClass();
                        q0 q0VarC = q0.b.c(bVar, viewFindViewById, string, null, 12);
                        q0VarC.setDuration(0);
                        q0VarC.b(com.garmin.android.apps.connectmobile.R.string.lbl_restart, new h0(dVar, 27));
                        return q0VarC;
                    default:
                        int i18 = d.f128763j;
                        return new InstallStateUpdatedListener() { // from class: o31.c
                            @Override // com.google.android.play.core.listener.StateUpdatedListener
                            public final void onStateUpdate(InstallState installState) {
                                InstallState installState2 = installState;
                                int i19 = d.f128763j;
                                installState2.getClass();
                                int iInstallStatus = installState2.installStatus();
                                d dVar2 = dVar;
                                if (iInstallStatus == 4) {
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar4.getClass();
                                    i2.a.b(a2Var4, "InAppUpdateManager", "In-app update installed successfully");
                                    dVar2.f128765b.u2(com.garmin.inappupdate.d.NONE.f52420a, "in_app_update_started_prompt_type");
                                    return;
                                }
                                if (iInstallStatus != 11) {
                                    String strH = j.h(installState2.installStatus(), "In-app update state changed: ");
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var5 = a2.GENERAL;
                                    aVar5.getClass();
                                    i2.a.b(a2Var5, "InAppUpdateManager", strH);
                                    return;
                                }
                                if (dVar2.c() != com.garmin.inappupdate.d.FLEXIBLE) {
                                    i2.a aVar6 = i2.f36769a;
                                    a2 a2Var6 = a2.GENERAL;
                                    aVar6.getClass();
                                    i2.a.b(a2Var6, "InAppUpdateManager", "Immediate In-app update downloaded");
                                    return;
                                }
                                i2.a aVar7 = i2.f36769a;
                                a2 a2Var7 = a2.GENERAL;
                                aVar7.getClass();
                                i2.a.b(a2Var7, "InAppUpdateManager", "Flexible In-app update downloaded, prompting user to complete update");
                                t tVar = dVar2.f128771h;
                                if (((q0) tVar.getValue()).isShownOrQueued()) {
                                    ((q0) tVar.getValue()).dismiss();
                                }
                                ((q0) tVar.getValue()).show();
                            }
                        };
                }
            }
        });
        final int i16 = 2;
        this.f128771h = m.b(new e23.a(this) { // from class: o31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f128761b;

            {
                this.f128761b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                String installerPackageName;
                int i17 = i16;
                boolean z14 = false;
                final d dVar = this.f128761b;
                switch (i17) {
                    case 0:
                        b.g gVar = dVar.f128767d;
                        if (gVar == null) {
                            s.m("activity");
                            throw null;
                        }
                        Context applicationContext = gVar.getApplicationContext();
                        applicationContext.getClass();
                        try {
                            if (Build.VERSION.SDK_INT >= 30) {
                                InstallSourceInfo installSourceInfo = applicationContext.getPackageManager().getInstallSourceInfo(applicationContext.getPackageName());
                                installSourceInfo.getClass();
                                installerPackageName = installSourceInfo.getInstallingPackageName();
                            } else {
                                installerPackageName = applicationContext.getPackageManager().getInstallerPackageName(applicationContext.getPackageName());
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException e4) {
                            String strN = fb1.c.n("Package name not found: ", e4.getMessage());
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.f(a2Var, "InAppUpdateManager", strN);
                            installerPackageName = null;
                        } catch (Exception e14) {
                            String strN2 = fb1.c.n("Error getting installer package name: ", e14.getMessage());
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.f(a2Var2, "InAppUpdateManager", strN2);
                            installerPackageName = null;
                        }
                        String strN3 = fb1.c.n("Installer package name: ", installerPackageName);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "InAppUpdateManager", strN3);
                        boolean z15 = installerPackageName != null && (installerPackageName.equals("com.android.vending") || installerPackageName.equals("com.google.android.gms"));
                        i2.a.b(a2Var3, "InAppUpdateManager", "Is app installed from Google Play: " + z15);
                        b.g gVar2 = dVar.f128767d;
                        if (gVar2 == null) {
                            s.m("activity");
                            throw null;
                        }
                        boolean zC = c22.h.c(gVar2.getApplicationContext());
                        i2.a.b(a2Var3, "InAppUpdateManager", "Is Google Play Services available: " + zC);
                        if (z15 && zC) {
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 1:
                        b.g gVar3 = dVar.f128767d;
                        if (gVar3 == null) {
                            s.m("activity");
                            throw null;
                        }
                        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(gVar3.getApplicationContext());
                        appUpdateManagerCreate.getClass();
                        return appUpdateManagerCreate;
                    case 2:
                        int i18 = d.f128763j;
                        q0.b bVar = q0.f149800b;
                        b.g gVar4 = dVar.f128767d;
                        if (gVar4 == null) {
                            s.m("activity");
                            throw null;
                        }
                        View viewFindViewById = gVar4.getWindow().getDecorView().findViewById(R.id.content);
                        viewFindViewById.getClass();
                        b.g gVar5 = dVar.f128767d;
                        if (gVar5 == null) {
                            s.m("activity");
                            throw null;
                        }
                        String string = gVar5.getString(com.garmin.android.apps.connectmobile.R.string.msg_app_download_complete, gVar5.getString(com.garmin.android.apps.connectmobile.R.string.common_garmin_connect));
                        string.getClass();
                        q0 q0VarC = q0.b.c(bVar, viewFindViewById, string, null, 12);
                        q0VarC.setDuration(0);
                        q0VarC.b(com.garmin.android.apps.connectmobile.R.string.lbl_restart, new h0(dVar, 27));
                        return q0VarC;
                    default:
                        int i19 = d.f128763j;
                        return new InstallStateUpdatedListener() { // from class: o31.c
                            @Override // com.google.android.play.core.listener.StateUpdatedListener
                            public final void onStateUpdate(InstallState installState) {
                                InstallState installState2 = installState;
                                int i110 = d.f128763j;
                                installState2.getClass();
                                int iInstallStatus = installState2.installStatus();
                                d dVar2 = dVar;
                                if (iInstallStatus == 4) {
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar4.getClass();
                                    i2.a.b(a2Var4, "InAppUpdateManager", "In-app update installed successfully");
                                    dVar2.f128765b.u2(com.garmin.inappupdate.d.NONE.f52420a, "in_app_update_started_prompt_type");
                                    return;
                                }
                                if (iInstallStatus != 11) {
                                    String strH = j.h(installState2.installStatus(), "In-app update state changed: ");
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var5 = a2.GENERAL;
                                    aVar5.getClass();
                                    i2.a.b(a2Var5, "InAppUpdateManager", strH);
                                    return;
                                }
                                if (dVar2.c() != com.garmin.inappupdate.d.FLEXIBLE) {
                                    i2.a aVar6 = i2.f36769a;
                                    a2 a2Var6 = a2.GENERAL;
                                    aVar6.getClass();
                                    i2.a.b(a2Var6, "InAppUpdateManager", "Immediate In-app update downloaded");
                                    return;
                                }
                                i2.a aVar7 = i2.f36769a;
                                a2 a2Var7 = a2.GENERAL;
                                aVar7.getClass();
                                i2.a.b(a2Var7, "InAppUpdateManager", "Flexible In-app update downloaded, prompting user to complete update");
                                t tVar = dVar2.f128771h;
                                if (((q0) tVar.getValue()).isShownOrQueued()) {
                                    ((q0) tVar.getValue()).dismiss();
                                }
                                ((q0) tVar.getValue()).show();
                            }
                        };
                }
            }
        });
        final int i17 = 3;
        this.f128772i = m.b(new e23.a(this) { // from class: o31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f128761b;

            {
                this.f128761b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                String installerPackageName;
                int i18 = i17;
                boolean z14 = false;
                final d dVar = this.f128761b;
                switch (i18) {
                    case 0:
                        b.g gVar = dVar.f128767d;
                        if (gVar == null) {
                            s.m("activity");
                            throw null;
                        }
                        Context applicationContext = gVar.getApplicationContext();
                        applicationContext.getClass();
                        try {
                            if (Build.VERSION.SDK_INT >= 30) {
                                InstallSourceInfo installSourceInfo = applicationContext.getPackageManager().getInstallSourceInfo(applicationContext.getPackageName());
                                installSourceInfo.getClass();
                                installerPackageName = installSourceInfo.getInstallingPackageName();
                            } else {
                                installerPackageName = applicationContext.getPackageManager().getInstallerPackageName(applicationContext.getPackageName());
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException e4) {
                            String strN = fb1.c.n("Package name not found: ", e4.getMessage());
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.f(a2Var, "InAppUpdateManager", strN);
                            installerPackageName = null;
                        } catch (Exception e14) {
                            String strN2 = fb1.c.n("Error getting installer package name: ", e14.getMessage());
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.f(a2Var2, "InAppUpdateManager", strN2);
                            installerPackageName = null;
                        }
                        String strN3 = fb1.c.n("Installer package name: ", installerPackageName);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "InAppUpdateManager", strN3);
                        boolean z15 = installerPackageName != null && (installerPackageName.equals("com.android.vending") || installerPackageName.equals("com.google.android.gms"));
                        i2.a.b(a2Var3, "InAppUpdateManager", "Is app installed from Google Play: " + z15);
                        b.g gVar2 = dVar.f128767d;
                        if (gVar2 == null) {
                            s.m("activity");
                            throw null;
                        }
                        boolean zC = c22.h.c(gVar2.getApplicationContext());
                        i2.a.b(a2Var3, "InAppUpdateManager", "Is Google Play Services available: " + zC);
                        if (z15 && zC) {
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                    case 1:
                        b.g gVar3 = dVar.f128767d;
                        if (gVar3 == null) {
                            s.m("activity");
                            throw null;
                        }
                        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(gVar3.getApplicationContext());
                        appUpdateManagerCreate.getClass();
                        return appUpdateManagerCreate;
                    case 2:
                        int i19 = d.f128763j;
                        q0.b bVar = q0.f149800b;
                        b.g gVar4 = dVar.f128767d;
                        if (gVar4 == null) {
                            s.m("activity");
                            throw null;
                        }
                        View viewFindViewById = gVar4.getWindow().getDecorView().findViewById(R.id.content);
                        viewFindViewById.getClass();
                        b.g gVar5 = dVar.f128767d;
                        if (gVar5 == null) {
                            s.m("activity");
                            throw null;
                        }
                        String string = gVar5.getString(com.garmin.android.apps.connectmobile.R.string.msg_app_download_complete, gVar5.getString(com.garmin.android.apps.connectmobile.R.string.common_garmin_connect));
                        string.getClass();
                        q0 q0VarC = q0.b.c(bVar, viewFindViewById, string, null, 12);
                        q0VarC.setDuration(0);
                        q0VarC.b(com.garmin.android.apps.connectmobile.R.string.lbl_restart, new h0(dVar, 27));
                        return q0VarC;
                    default:
                        int i110 = d.f128763j;
                        return new InstallStateUpdatedListener() { // from class: o31.c
                            @Override // com.google.android.play.core.listener.StateUpdatedListener
                            public final void onStateUpdate(InstallState installState) {
                                InstallState installState2 = installState;
                                int i111 = d.f128763j;
                                installState2.getClass();
                                int iInstallStatus = installState2.installStatus();
                                d dVar2 = dVar;
                                if (iInstallStatus == 4) {
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar4.getClass();
                                    i2.a.b(a2Var4, "InAppUpdateManager", "In-app update installed successfully");
                                    dVar2.f128765b.u2(com.garmin.inappupdate.d.NONE.f52420a, "in_app_update_started_prompt_type");
                                    return;
                                }
                                if (iInstallStatus != 11) {
                                    String strH = j.h(installState2.installStatus(), "In-app update state changed: ");
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var5 = a2.GENERAL;
                                    aVar5.getClass();
                                    i2.a.b(a2Var5, "InAppUpdateManager", strH);
                                    return;
                                }
                                if (dVar2.c() != com.garmin.inappupdate.d.FLEXIBLE) {
                                    i2.a aVar6 = i2.f36769a;
                                    a2 a2Var6 = a2.GENERAL;
                                    aVar6.getClass();
                                    i2.a.b(a2Var6, "InAppUpdateManager", "Immediate In-app update downloaded");
                                    return;
                                }
                                i2.a aVar7 = i2.f36769a;
                                a2 a2Var7 = a2.GENERAL;
                                aVar7.getClass();
                                i2.a.b(a2Var7, "InAppUpdateManager", "Flexible In-app update downloaded, prompting user to complete update");
                                t tVar = dVar2.f128771h;
                                if (((q0) tVar.getValue()).isShownOrQueued()) {
                                    ((q0) tVar.getValue()).dismiss();
                                }
                                ((q0) tVar.getValue()).show();
                            }
                        };
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(d dVar, com.garmin.inappupdate.e eVar, v13.c cVar) {
        f fVar;
        Object bVar;
        dVar.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f128788d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f128788d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar, cVar);
            }
        } else {
            fVar = new f(dVar, cVar);
        }
        Object objRequestAppUpdateInfo = fVar.f128786b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f128788d;
        try {
            if (i15 == 0) {
                o13.r.b(objRequestAppUpdateInfo);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "InAppUpdateManager", "Checking for Play Store in app update " + eVar);
                int i16 = q.f128596b;
                AppUpdateManager appUpdateManagerB = dVar.b();
                fVar.f128785a = eVar;
                fVar.f128788d = 1;
                objRequestAppUpdateInfo = AppUpdateManagerKtxKt.requestAppUpdateInfo(appUpdateManagerB, fVar);
                if (objRequestAppUpdateInfo == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eVar = fVar.f128785a;
                o13.r.b(objRequestAppUpdateInfo);
            }
            bVar = (AppUpdateInfo) objRequestAppUpdateInfo;
            int i17 = q.f128596b;
        } catch (Throwable th3) {
            int i18 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            String strP = j.p("Failed to retrieve app update info: ", thB);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "InAppUpdateManager", strP);
            return null;
        }
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) bVar;
        i2.a aVar4 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var3, "InAppUpdateManager", "Play Store app update info retrieved successfully");
        boolean zIsUpdateTypeAllowed = false;
        boolean z14 = appUpdateInfo.updateAvailability() == 2;
        int i19 = eVar.f52422a.f52420a;
        if (i19 == 0) {
            zIsUpdateTypeAllowed = appUpdateInfo.isUpdateTypeAllowed(0);
        } else if (i19 == 1) {
            zIsUpdateTypeAllowed = appUpdateInfo.isUpdateTypeAllowed(1);
        }
        i2.a.b(a2Var3, "InAppUpdateManager", "Checked promptType[" + eVar.f52422a + "] -> isUpdateAvailable[" + z14 + "], isUpdateAllowed[" + zIsUpdateTypeAllowed + "]");
        if (z14 && zIsUpdateTypeAllowed) {
            return appUpdateInfo;
        }
        return null;
    }

    @Override // o31.a
    public final void K0(androidx.fragment.app.m mVar) {
        mVar.getClass();
    }

    @Override // o31.a
    public final Object K1(b.g gVar, cv.f.b.a aVar) {
        if (this.f128767d == null) {
            this.f128767d = gVar;
        }
        if (!d()) {
            return Boolean.FALSE;
        }
        return ge1.b.e0(this.f128766c, new h(this, null), aVar);
    }

    @Override // o31.a
    public final void Y2(b.g gVar, ya0.l lVar) {
        gVar.getClass();
        if (this.f128767d == null) {
            this.f128767d = gVar;
        }
        if (d()) {
            ge1.b.T(f0.w(gVar), null, null, new e(this, lVar, null), 3);
        } else {
            lVar.invoke();
        }
    }

    public final AppUpdateManager b() {
        return (AppUpdateManager) this.f128770g.getValue();
    }

    public final com.garmin.inappupdate.d c() {
        Object next;
        w13.c cVar = com.garmin.inappupdate.d.f52419g;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (((com.garmin.inappupdate.d) next).f52420a != this.f128765b.i2(com.garmin.inappupdate.d.NONE.f52420a, "in_app_update_started_prompt_type"));
        com.garmin.inappupdate.d dVar = (com.garmin.inappupdate.d) next;
        return dVar == null ? com.garmin.inappupdate.d.NONE : dVar;
    }

    public final boolean d() {
        return ((Boolean) this.f128769f.getValue()).booleanValue();
    }

    @Override // androidx.lifecycle.n
    public final void onCreate(n0 n0Var) {
        if (n0Var instanceof b.g) {
            b.g gVar = (b.g) n0Var;
            this.f128767d = gVar;
            this.f128768e = gVar.registerForActivityResult(new g.i(), new jp.a(this, 12));
        }
        if (d()) {
            b().registerListener((InstallStateUpdatedListener) this.f128772i.getValue());
        }
    }

    @Override // androidx.lifecycle.n
    public final void onDestroy(n0 n0Var) {
        if (d()) {
            b().unregisterListener((InstallStateUpdatedListener) this.f128772i.getValue());
        }
    }

    @Override // androidx.lifecycle.n
    public final void onResume(n0 n0Var) {
        com.garmin.inappupdate.d dVarC;
        if (d() && (dVarC = c()) != com.garmin.inappupdate.d.NONE) {
            b.g gVar = this.f128767d;
            if (gVar != null) {
                ge1.b.T(f0.w(gVar), null, null, new c(dVarC, this, null), 3);
            } else {
                s.m("activity");
                throw null;
            }
        }
    }

    @Override // o31.a
    public final void z1(Context context) {
        context.getClass();
        e2 e2VarH = ge1.b.h();
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH)), null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lo31/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "IN_APP_UPDATE_CONFIG", "IN_APP_UPDATE_STARTED_PROMPT_TYPE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(k kVar, l lVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(kVar, lVar, zVar);
    }
}
