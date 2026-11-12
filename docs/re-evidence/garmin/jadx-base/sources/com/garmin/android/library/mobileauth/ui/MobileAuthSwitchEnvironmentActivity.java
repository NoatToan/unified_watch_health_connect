package com.garmin.android.library.mobileauth.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import e23.p;
import java.util.ArrayList;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v.e0;
import v13.i;
import vb.h;
import xa1.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/MobileAuthSwitchEnvironmentActivity;", "Landroid/app/Activity;", "Lre2/b$b;", "Lcom/garmin/android/library/mobileauth/ui/c$a$a;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MobileAuthSwitchEnvironmentActivity extends Activity implements re2.b.InterfaceC2863b, c.a.InterfaceC1004a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f50406c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlertDialog f50407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f50408b = m.b(new j(28));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.MobileAuthSwitchEnvironmentActivity$onNewEnvironmentSelected$1", f = "MobileAuthSwitchEnvironmentActivity.kt", l = {82}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ve2.e f50410b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ve2.e eVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f50410b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f50410b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50409a;
            if (i14 == 0) {
                r.b(obj);
                re2.b bVar = re2.b.f152215a;
                this.f50409a = 1;
                bVar.getClass();
                if (re2.b.F(this.f50410b, this) == aVar) {
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

    static {
        new a(null);
    }

    @Override // re2.b.InterfaceC2863b
    public final void a() {
    }

    @Override // re2.b.InterfaceC2863b
    public final void b(ve2.r rVar) {
        rVar.getClass();
    }

    @Override // re2.b.InterfaceC2863b
    public final void c(ve2.e eVar) {
        eVar.getClass();
        com.airbnb.lottie.animation.keyframe.a.u("environment changed to ", eVar.name(), ", waiting for 'onUserSignedOut' event...", (Logger) this.f50408b.getValue());
    }

    @Override // com.garmin.android.library.mobileauth.ui.c.a.InterfaceC1004a
    public final void d(ve2.e eVar) throws Throwable {
        eVar.getClass();
        ge1.b.W(t13.h.f161748a, new b(eVar, null));
    }

    @Override // re2.b.InterfaceC2863b
    public final void e(ve2.d dVar, re2.b.d dVar2) {
        dVar.getClass();
        dVar2.getClass();
    }

    @Override // re2.b.InterfaceC2863b
    public final void f() {
        finish();
    }

    @Override // com.garmin.android.library.mobileauth.ui.c.a.InterfaceC1004a
    public final void g() {
        ((Logger) this.f50408b.getValue()).debug("onUserCancelled");
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String callingPackage;
        super.onCreate(bundle);
        boolean zG = s.g(getCallingPackage(), getPackageName());
        t tVar = this.f50408b;
        if (!zG && (callingPackage = getCallingPackage()) != null && callingPackage.length() != 0) {
            ((Logger) tVar.getValue()).error(e0.g("called from [", getCallingPackage(), "], only allowed to be called from [", getPackageName(), "]"));
            finish();
            return;
        }
        ((Logger) tVar.getValue()).debug("onCreate");
        re2.b.f152215a.getClass();
        ArrayList<re2.b.InterfaceC2863b> arrayList = re2.b.f152218d;
        if (!arrayList.contains(this)) {
            re2.b.f152216b.debug("registerEventListener");
            arrayList.add(this);
        }
        c.f50424a.getClass();
        AlertDialog alertDialogA = c.a.a(this, this);
        alertDialogA.show();
        this.f50407a = alertDialogA;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        re2.b.f152215a.getClass();
        re2.b.f152218d.remove(this);
        AlertDialog alertDialog = this.f50407a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f50407a = null;
        super.onDestroy();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/MobileAuthSwitchEnvironmentActivity$a;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
