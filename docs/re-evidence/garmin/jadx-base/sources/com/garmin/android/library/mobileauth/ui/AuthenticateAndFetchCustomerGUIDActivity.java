package com.garmin.android.library.mobileauth.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.lifecycle.i0;
import e23.p;
import java.util.Set;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import re2.j0;
import re2.l0;
import v13.i;
import vb.h;
import ve2.s;
import xa1.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/AuthenticateAndFetchCustomerGUIDActivity;", "Lcom/garmin/android/library/mobileauth/ui/a;", "Lcom/garmin/android/library/mobileauth/ui/b;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthenticateAndFetchCustomerGUIDActivity extends com.garmin.android.library.mobileauth.ui.a implements com.garmin.android.library.mobileauth.ui.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f50337n = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f50338m = m.b(new j(21));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticateAndFetchCustomerGUIDActivity$onCreate$2$1", f = "AuthenticateAndFetchCustomerGUIDActivity.kt", l = {91}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50340b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f50342d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f50342d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = AuthenticateAndFetchCustomerGUIDActivity.this.new b(this.f50342d, dVar);
            bVar.f50340b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50339a;
            AuthenticateAndFetchCustomerGUIDActivity authenticateAndFetchCustomerGUIDActivity = AuthenticateAndFetchCustomerGUIDActivity.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    b0 b0Var2 = (b0) this.f50340b;
                    int i15 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                    authenticateAndFetchCustomerGUIDActivity.X9().debug("onCreate: generating lock to email address token");
                    String str = this.f50342d;
                    this.f50340b = b0Var2;
                    this.f50339a = 1;
                    Object objP9 = authenticateAndFetchCustomerGUIDActivity.P9(str, this);
                    if (objP9 == aVar) {
                        return aVar;
                    }
                    b0Var = b0Var2;
                    obj = objP9;
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (b0) this.f50340b;
                    r.b(obj);
                }
                String str2 = (String) obj;
                int i16 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                authenticateAndFetchCustomerGUIDActivity.X9().debug("onCreate: generated lock to email address token");
                if (c0.g(b0Var)) {
                    authenticateAndFetchCustomerGUIDActivity.Y9(str2);
                }
            } catch (Throwable unused) {
                int i17 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                authenticateAndFetchCustomerGUIDActivity.W9();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void B0() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void D3() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void F1() {
        X9().debug("finishWithResultCanceled");
        Q9().post(new xe2.d(this, 0));
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Object K6(i iVar) {
        l0.f152316a.getClass();
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new j0(null, null), iVar);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Object L7(v13.c cVar) {
        return null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void N8() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void R4() {
        X9().warn("onPortalBootstrapFailed");
        W9();
    }

    public final void W9() {
        X9().warn("finishWithResultError");
        Q9().post(new xe2.d(this, 1));
    }

    public final Logger X9() {
        return (Logger) this.f50338m.getValue();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void Y3(WebView webView, String str, String str2) {
        str2.getClass();
    }

    public final void Y9(String str) {
        af2.g gVar = new af2.g();
        if (str != null) {
            Bundle bundle = new Bundle(1);
            bundle.putString(af2.g.ARG_LOCK_TO_EMAIL_ADDRESS_TOKEN, str);
            gVar.setArguments(bundle);
        }
        Q9().post(new vg1.d(15, this, gVar));
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void b4() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Set<Integer> c1() {
        return this.f50421j;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final boolean d7() {
        return R9().f177764e;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void j3(bf2.b bVar) {
        bVar.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void k3(e.a.EnumC1005a enumC1005a, String str) {
        enumC1005a.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void n6(int i14) {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void n7(WebView webView, String str, String str2) {
        str2.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void o0(e.a.EnumC1005a enumC1005a) {
        enumC1005a.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void o1(boolean z14) {
    }

    @Override // b.g, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        X9().debug("onBackPressed");
        X9().debug("finishWithResultCanceled");
        Q9().post(new xe2.d(this, 0));
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!R9().g()) {
            kg.f.n("AuthenticateAndFetchCustomerGUIDActivity only supports IT SSO Portal.");
            return;
        }
        X9().debug("onCreate");
        V9();
        if (R9().K) {
            getWindow().setFlags(8192, 8192);
        }
        String stringExtra = getIntent().getStringExtra("intent.arg.lock.to.email.address");
        if (stringExtra == null) {
            Y9(null);
            Unit unit = Unit.INSTANCE;
        } else {
            i0 i0VarW = f0.w(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, x53.b.f189152a, null, new b(stringExtra, null), 2);
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void p1() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void p9(WebView webView, String str, String str2) {
        str2.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    /* JADX INFO: renamed from: r9 */
    public final s getF50349r() {
        return null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void s1() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void t2() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void t5() {
        X9().warn("onPortalSessionExpired");
        W9();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    /* JADX INFO: renamed from: u7 */
    public final int getF50348q() {
        return -1;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void w2() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void w6(sc2.h hVar) {
        V9();
        Q9().post(new xe2.d(this, 2));
        X9().debug("onPortalUserAuthenticated");
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new xe2.e(this, applicationContext, hVar, null), 2);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void y0() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void y1() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/AuthenticateAndFetchCustomerGUIDActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "INTENT_ARG_LOCK_TO_EMAIL_ADDRESS", "", "RESULT_ERROR", "I", "EXTRA_CUSTOMER_GUID", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
