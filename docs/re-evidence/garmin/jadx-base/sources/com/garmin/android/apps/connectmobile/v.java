package com.garmin.android.apps.connectmobile;

import android.content.Intent;
import android.os.Bundle;
import ca0.d4;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v;", "Li/c;", "<init>", "()V", "", "relaunchApp", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lf12/b;", "userAccount$delegate", "Lo13/l;", "getUserAccount", "()Lf12/b;", "userAccount", "Lc22/d2;", "onDemandResourcesInstaller$delegate", "getOnDemandResourcesInstaller", "()Lc22/d2;", "onDemandResourcesInstaller", "Companion", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class v extends i.c {
    private static final String TAG = "AuthenticationBaseActivity";
    private static final List<String> listOfClassesToIgnore;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: userAccount$delegate, reason: from kotlin metadata */
    private final o13.l userAccount = o13.m.b(new d4(20));

    /* JADX INFO: renamed from: onDemandResourcesInstaller$delegate, reason: from kotlin metadata */
    private final o13.l onDemandResourcesInstaller = o13.m.b(new d4(21));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.AuthenticationBaseActivity$onResume$1", f = "AuthenticationBaseActivity.kt", l = {71}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47365b;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47367a;

            static {
                int[] iArr = new int[re2.b.a.values().length];
                try {
                    iArr[re2.b.a.NO_SYSTEM_ACCOUNT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[re2.b.a.SIGNED_OUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f47367a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.v$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lre2/b$a;", "<anonymous>", "(Lo53/b0;)Lre2/b$a;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.AuthenticationBaseActivity$onResume$1$mobileAuthState$1", f = "AuthenticationBaseActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0925b extends v13.i implements e23.p<o53.b0, t13.d<? super re2.b.a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v f47368a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0925b(v vVar, t13.d<? super C0925b> dVar) {
                super(2, dVar);
                this.f47368a = vVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0925b(this.f47368a, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super re2.b.a> dVar) {
                return ((C0925b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return this.f47368a.getUserAccount().o();
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = v.this.new b(dVar);
            bVar.f47365b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o53.b0 b0Var = (o53.b0) this.f47365b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47364a;
            v vVar = v.this;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                C0925b c0925b = new C0925b(vVar, null);
                this.f47365b = b0Var;
                this.f47364a = 1;
                obj = ge1.b.e0(bVar, c0925b, this);
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
            re2.b.a aVar2 = (re2.b.a) obj;
            if (vVar.isFinishing() || vVar.isDestroyed()) {
                String strM = am.j.m("Activity ", vVar.getLocalClassName(), " is finishing/destroyed, skipping auth state handling");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var, v.TAG, strM);
                return Unit.INSTANCE;
            }
            int i15 = aVar2 == null ? -1 : a.f47367a[aVar2.ordinal()];
            if (i15 == 1) {
                String strM2 = am.j.m("No system account found when resuming ", vVar.getLocalClassName(), " trigger sign out to clear app cached data");
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var2, v.TAG, strM2);
                bv.b.f21239a.getClass();
                bv.b.a();
                cw.c cVarM = cw.c.M();
                cVarM.getClass();
                com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.c0(cVarM), null);
                vVar.relaunchApp();
            } else if (i15 == 2) {
                String strM3 = am.j.m("User is signed out when resuming ", vVar.getLocalClassName(), " relaunch app to show welcome screen");
                i2.a aVar5 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar5.getClass();
                i2.a.b(a2Var3, v.TAG, strM3);
                vVar.relaunchApp();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        bv.b.f21239a.getClass();
        bv.b.a();
        listOfClassesToIgnore = p13.x.k("GCMActivityStartup", "LegalGatewayActivity", "HelpDetailsActivity");
    }

    private final c22.d2 getOnDemandResourcesInstaller() {
        return (c22.d2) this.onDemandResourcesInstaller.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f12.b getUserAccount() {
        return (f12.b) this.userAccount.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c22.d2 onDemandResourcesInstaller_delegate$lambda$0() {
        return (c22.d2) KoinJavaComponent.get$default(c22.d2.class, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void relaunchApp() {
        Intent intent = new Intent(getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName()));
        intent.setFlags(268468224);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f12.b userAccount_delegate$lambda$0() {
        return (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!getUserAccount().l()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, TAG, "AuthenticationHelper not initialized, redirecting to startup activity");
            relaunchApp();
            finish();
            return;
        }
        if (getOnDemandResourcesInstaller().getF23068b()) {
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var2, TAG, "onDemandResourcesInstaller is not initialized, redirecting to startup activity");
        relaunchApp();
        finish();
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onResume() {
        super.onResume();
        String localClassName = getLocalClassName();
        localClassName.getClass();
        int iK = d53.w.K('.', 0, 6, localClassName);
        if (iK > -1) {
            localClassName = localClassName.substring(iK + 1, localClassName.length());
        }
        if (listOfClassesToIgnore.contains(localClassName)) {
            return;
        }
        ge1.b.T(o53.f0.w(this), null, null, new b(null), 3);
    }
}
