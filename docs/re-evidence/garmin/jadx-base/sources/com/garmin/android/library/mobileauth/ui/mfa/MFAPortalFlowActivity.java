package com.garmin.android.library.mobileauth.ui.mfa;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import androidx.lifecycle.i0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import java.net.URI;
import java.net.URL;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import sc2.g;
import u53.o;
import v13.i;
import vb.h;
import xe2.n0;
import ze2.l;
import ze2.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/MFAPortalFlowActivity;", "Lcom/garmin/android/library/mobileauth/ui/mfa/a;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MFAPortalFlowActivity extends com.garmin.android.library.mobileauth.ui.mfa.a {
    public static final a B = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity$onPortalBootstrapFailed$1", f = "MFAPortalFlowActivity.kt", l = {}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity$onPortalBootstrapFailed$1$1$1", f = "MFAPortalFlowActivity.kt", l = {217}, m = "invokeSuspend")
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50487a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MFAPortalFlowActivity f50488b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MFAPortalFlowActivity mFAPortalFlowActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f50488b = mFAPortalFlowActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f50488b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f50487a;
                if (i14 == 0) {
                    r.b(obj);
                    l lVar = l.IT_PORTAL_BOOTSTRAP_FAILURE;
                    this.f50487a = 1;
                    if (com.garmin.android.library.mobileauth.ui.mfa.a.ha(this.f50488b, lVar, this, 5) == aVar) {
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

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MFAPortalFlowActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            MFAPortalFlowActivity mFAPortalFlowActivity = MFAPortalFlowActivity.this;
            AlertDialog alertDialog = mFAPortalFlowActivity.f50501w;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            mFAPortalFlowActivity.f50501w = null;
            String string = mFAPortalFlowActivity.getString(R.string.mobile_auth_msg_sign_in_attempt_failed);
            string.getClass();
            mFAPortalFlowActivity.f50501w = n0.a(mFAPortalFlowActivity, "BOOTSTRAP_FAILURE", string, new af2.b(mFAPortalFlowActivity, 8), null, null, null, 112);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity$onPortalSessionExpired$1", f = "MFAPortalFlowActivity.kt", l = {234}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50489a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MFAPortalFlowActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50489a;
            if (i14 == 0) {
                r.b(obj);
                l lVar = l.IT_PORTAL_SESSION_EXPIRED;
                this.f50489a = 1;
                if (com.garmin.android.library.mobileauth.ui.mfa.a.ha(MFAPortalFlowActivity.this, lVar, this, 4) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity$onPortalUserExit$1", f = "MFAPortalFlowActivity.kt", l = {227}, m = "invokeSuspend")
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50491a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MFAPortalFlowActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50491a;
            if (i14 == 0) {
                r.b(obj);
                this.f50491a = 1;
                if (MFAPortalFlowActivity.this.fa(this) == aVar) {
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

    public MFAPortalFlowActivity() {
        super(g.PORTAL);
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a, com.garmin.android.library.mobileauth.ui.b
    public final void F1() throws Throwable {
        ge1.b.W(t13.h.f161748a, new d(null));
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a, com.garmin.android.library.mobileauth.ui.b
    public final void R4() {
        this.f50497q.warn("onPortalBootstrapFailed");
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, o.f168762a, null, new b(null), 2);
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a, com.garmin.android.library.mobileauth.ui.b
    public final void Y3(WebView webView, String str, String str2) {
        str2.getClass();
        T9();
        ea("onWebViewPageFinishedLoading", str);
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a
    public final Object Y9(URI uri, String str, o13.p pVar, i iVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new n(this, pVar, uri, str, null), iVar);
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a
    public final String aa() {
        String strE = R9().e();
        strE.getClass();
        return strE;
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a
    public final String ca() {
        URL urlF = R9().f(Z9().f177690a);
        urlF.getClass();
        String string = urlF.toString();
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a, com.garmin.android.library.mobileauth.ui.b
    public final void t5() throws Throwable {
        ge1.b.W(t13.h.f161748a, new c(null));
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a, com.garmin.android.library.mobileauth.ui.b
    public final void w6(sc2.h hVar) {
        try {
            X9(hVar.f158506b);
        } catch (Exception e4) {
            this.f50497q.error("onPortalUserAuthenticated", (Throwable) e4);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/MFAPortalFlowActivity$a;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, ve2.e eVar, boolean z14, URI uri, String str, sc2.a aVar, String str2) {
            Intent intent = new Intent(context, (Class<?>) MFAPortalFlowActivity.class);
            intent.putExtra("environment.enum.name", eVar.name());
            intent.putExtra("permanent.mfa", z14);
            intent.putExtra("credential.type.enum.name", aVar.name());
            intent.putExtra("credential.access.token", str2);
            if (uri != null) {
                intent.putExtra("auto.login.uri", uri.toString());
            }
            if (str != null) {
                intent.putExtra("auto.login.sso.portal.client.id", str);
            }
            return intent;
        }

        private a() {
        }
    }
}
