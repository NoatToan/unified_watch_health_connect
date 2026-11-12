package com.garmin.android.library.mobileauth.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.garmin.android.library.geolocationrestapi.CountrySettingActivity;
import com.garmin.android.library.geolocationrestapi.CountrySettingsActivityLandscape;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import d53.u;
import d53.w;
import e23.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import lc.u0;
import o13.m;
import o13.q;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.f0;
import o53.s0;
import o53.t1;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import re2.g0;
import re2.l0;
import te2.g2;
import te2.h0;
import te2.j0;
import te2.j2;
import u53.o;
import ve2.l;
import ve2.s;
import xe2.a0;
import xe2.i0;
import xe2.n0;
import xe2.y;
import xe2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/AuthenticationActivity;", "Lcom/garmin/android/library/mobileauth/ui/a;", "Lcom/garmin/android/library/mobileauth/ui/b;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AuthenticationActivity extends com.garmin.android.library.mobileauth.ui.a implements com.garmin.android.library.mobileauth.ui.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f50343v = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ve2.d f50345n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AlertDialog f50346o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f50347p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f50349r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f.c<Intent> f50350t;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f50344m = m.b(new xa1.j(22));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f50348q = -1;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f50352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f50353c;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.WELCOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.CONTINUE_AS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i0.CREATE_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i0.CREATE_ACCOUNT_PORTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i0.SIGN_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i0.SIGN_IN_PORTAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i0.TERMS_OF_USE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[i0.CREATE_ACCOUNT_WARNING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[i0.AGE_SIGNALS_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[i0.CHINA_PRIVACY_CONSENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f50351a = iArr;
            int[] iArr2 = new int[com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a.values().length];
            try {
                iArr2[com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a.SIGN_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a.CREATE_ACCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a.CONTINUE_AS.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a.SOCIAL_SIGN_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f50352b = iArr2;
            int[] iArr3 = new int[re2.b.a.values().length];
            try {
                iArr3[re2.b.a.SIGNED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            f50353c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$countrySettingsContract$1$1", f = "AuthenticationActivity.kt", l = {133}, m = "invokeSuspend")
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f.a f50355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AuthenticationActivity f50356c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.a aVar, AuthenticationActivity authenticationActivity, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f50355b = aVar;
            this.f50356c = authenticationActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f50355b, this.f50356c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50354a;
            if (i14 == 0) {
                r.b(obj);
                Intent intent = this.f50355b.f67586b;
                String stringExtra = intent != null ? intent.getStringExtra("extra.country.code.data") : null;
                AuthenticationActivity authenticationActivity = this.f50356c;
                if (stringExtra != null) {
                    a aVar2 = AuthenticationActivity.f50343v;
                    com.airbnb.lottie.animation.keyframe.a.u("countrySettingsContract: country code [", stringExtra, "]", authenticationActivity.Z9());
                    ud2.b.f170019a.getClass();
                    ve2.e eVarValueOf = ve2.e.valueOf((u.q(Locale.CHINA.getCountry(), stringExtra, true) ? ve2.e.f177705e : ve2.e.f177704d).name());
                    re2.b bVar = re2.b.f152215a;
                    this.f50354a = 1;
                    bVar.getClass();
                    if (re2.b.F(eVarValueOf, this) == aVar) {
                        return aVar;
                    }
                } else {
                    a aVar3 = AuthenticationActivity.f50343v;
                    authenticationActivity.Z9().warn("countrySettingsContract: intent extra does not contain 'EXTRA_COUNTRY_CODE_DATA'");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$createSysAcct$1", f = "AuthenticationActivity.kt", l = {813, 815, 825}, m = "invokeSuspend")
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f50359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sc2.h f50360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AuthenticationActivity f50361e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$createSysAcct$1$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AuthenticationActivity f50362a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AuthenticationActivity authenticationActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f50362a = authenticationActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f50362a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                AuthenticationActivity authenticationActivity = this.f50362a;
                authenticationActivity.setResult(-1);
                authenticationActivity.finish();
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$createSysAcct$1$2", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
        public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AuthenticationActivity f50363a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Exception f50364b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AuthenticationActivity authenticationActivity, Exception exc, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f50363a = authenticationActivity;
                this.f50364b = exc;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f50363a, this.f50364b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                a aVar2 = AuthenticationActivity.f50343v;
                AuthenticationActivity authenticationActivity = this.f50363a;
                authenticationActivity.Y9();
                String string = authenticationActivity.getString(R.string.mobile_auth_title_unable_to_continue);
                String message = this.f50364b.getMessage();
                if (message == null) {
                    message = "";
                }
                authenticationActivity.f50346o = n0.a(authenticationActivity, string, message, new xe2.f(authenticationActivity, 1), null, null, null, 112);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, sc2.h hVar, AuthenticationActivity authenticationActivity, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f50359c = context;
            this.f50360d = hVar;
            this.f50361e = authenticationActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f50359c, this.f50360d, this.f50361e, dVar);
            dVar2.f50358b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        
            if (ge1.b.e0(r11, r4, r10) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
        
            if (ge1.b.e0(r1, r3, r10) == r0) goto L35;
         */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, o53.b0] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            b0 b0Var;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            ?? r14 = this.f50357a;
            AuthenticationActivity authenticationActivity = this.f50361e;
            try {
                if (r14 != 0) {
                    if (r14 == 1) {
                        b0Var = (b0) this.f50358b;
                        r.b(obj);
                    } else if (r14 == 2) {
                        r.b(obj);
                    } else {
                        if (r14 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                b0Var = (b0) this.f50358b;
                Context context = this.f50359c;
                context.getClass();
                j0 j0Var = new j0(context, this.f50360d, authenticationActivity.f50347p);
                this.f50358b = b0Var;
                this.f50357a = 1;
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new te2.i0(j0Var, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                }
                return obj2;
                x53.c cVar2 = s0.f129406a;
                t1 t1Var = o.f168762a;
                a aVar = new a(authenticationActivity, null);
                this.f50358b = b0Var;
                this.f50357a = 2;
            } catch (Exception e4) {
                if (c0.g(r14)) {
                    if (e4 instanceof RateLimitException) {
                        a aVar2 = AuthenticationActivity.f50343v;
                        authenticationActivity.getClass();
                        androidx.lifecycle.i0 i0VarW = f0.w(authenticationActivity);
                        x53.c cVar3 = s0.f129406a;
                        ge1.b.T(i0VarW, o.f168762a, null, new xe2.j(authenticationActivity, null), 2);
                    } else {
                        x53.c cVar4 = s0.f129406a;
                        t1 t1Var2 = o.f168762a;
                        b bVar = new b(authenticationActivity, e4, null);
                        this.f50358b = null;
                        this.f50357a = 3;
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$loadFragment$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i0 f50365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AuthenticationActivity f50366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f50367c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$loadFragment$1$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i0 f50368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthenticationActivity f50369b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f50370c;

            /* JADX INFO: renamed from: com.garmin.android.library.mobileauth.ui.AuthenticationActivity$e$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1002a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f50371a;

                static {
                    int[] iArr = new int[i0.values().length];
                    try {
                        iArr[i0.CONTINUE_AS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[i0.WELCOME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[i0.TERMS_OF_USE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[i0.CREATE_ACCOUNT_WARNING.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[i0.SIGN_IN.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[i0.SIGN_IN_PORTAL.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[i0.CREATE_ACCOUNT.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[i0.CREATE_ACCOUNT_PORTAL.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[i0.CHINA_PRIVACY_CONSENT.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[i0.AGE_SIGNALS_ERROR.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    f50371a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i0 i0Var, AuthenticationActivity authenticationActivity, Bundle bundle, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f50368a = i0Var;
                this.f50369b = authenticationActivity;
                this.f50370c = bundle;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f50368a, this.f50369b, this.f50370c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Fragment yVar;
                i0 i0Var = this.f50368a;
                AuthenticationActivity authenticationActivity = this.f50369b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                try {
                    int[] iArr = C1002a.f50371a;
                    switch (iArr[i0Var.ordinal()]) {
                        case 1:
                            yVar = new y();
                            break;
                        case 2:
                            yVar = new com.garmin.android.library.mobileauth.ui.g();
                            break;
                        case 3:
                            yVar = new com.garmin.android.library.mobileauth.ui.e();
                            break;
                        case 4:
                            yVar = new z();
                            break;
                        case 5:
                            yVar = new com.garmin.android.library.mobileauth.ui.d();
                            break;
                        case 6:
                            yVar = new af2.g();
                            break;
                        case 7:
                            yVar = new a0();
                            break;
                        case 8:
                            yVar = new af2.a();
                            break;
                        case 9:
                            yVar = new xe2.r();
                            break;
                        case 10:
                            yVar = new ye2.b();
                            break;
                        default:
                            a aVar2 = AuthenticationActivity.f50343v;
                            authenticationActivity.Z9().error("loadFragment: unknown fragment type [" + i0Var + "]");
                            yVar = null;
                            break;
                    }
                    if (yVar != null) {
                        Bundle bundle = this.f50370c;
                        if (bundle != null) {
                            yVar.setArguments(bundle);
                        }
                        authenticationActivity.U9(yVar, i0Var.name(), i0Var);
                        if (authenticationActivity.R9().K) {
                            i0 i0Var2 = authenticationActivity.f50417f;
                            int i14 = i0Var2 == null ? -1 : iArr[i0Var2.ordinal()];
                            if (i14 == 5 || i14 == 6 || i14 == 7 || i14 == 8) {
                                authenticationActivity.getWindow().setFlags(8192, 8192);
                            } else {
                                authenticationActivity.getWindow().clearFlags(8192);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                } finally {
                    authenticationActivity.T9();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i0 i0Var, AuthenticationActivity authenticationActivity, Bundle bundle, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f50365a = i0Var;
            this.f50366b = authenticationActivity;
            this.f50367c = bundle;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f50365a, this.f50366b, this.f50367c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            i0 i0Var = i0.SIGN_IN;
            AuthenticationActivity authenticationActivity = this.f50366b;
            i0 i0Var2 = this.f50365a;
            if ((i0Var == i0Var2 || i0.SIGN_IN_PORTAL == i0Var2 || i0.CREATE_ACCOUNT == i0Var2 || i0.CREATE_ACCOUNT_PORTAL == i0Var2) && !g0.a(authenticationActivity)) {
                a aVar2 = AuthenticationActivity.f50343v;
                authenticationActivity.f50417f = null;
                androidx.lifecycle.i0 i0VarW = f0.w(authenticationActivity);
                x53.c cVar = s0.f129406a;
                ge1.b.T(i0VarW, o.f168762a, null, new xe2.k(authenticationActivity, i0Var2, null), 2);
            } else {
                androidx.lifecycle.i0 i0VarW2 = f0.w(authenticationActivity);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(i0VarW2, o.f168762a, null, new a(i0Var2, authenticationActivity, this.f50367c, null), 2);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$onAgreeChinaPrivacyConsent$2", f = "AuthenticationActivity.kt", l = {594}, m = "invokeSuspend")
    public static final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50372a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return AuthenticationActivity.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50372a;
            if (i14 == 0) {
                r.b(obj);
                this.f50372a = 1;
                a aVar = AuthenticationActivity.f50343v;
                AuthenticationActivity authenticationActivity = AuthenticationActivity.this;
                authenticationActivity.getClass();
                Object objE0 = ge1.b.e0(s0.f129406a, new xe2.m(authenticationActivity, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$onClickLoadCountrySelector$1", f = "AuthenticationActivity.kt", l = {650, 652}, m = "invokeSuspend")
    public static final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50375b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$onClickLoadCountrySelector$1$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AuthenticationActivity f50377a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ve2.e f50378b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AuthenticationActivity authenticationActivity, ve2.e eVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f50377a = authenticationActivity;
                this.f50378b = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f50377a, this.f50378b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                CountrySettingActivity.a aVar2 = CountrySettingActivity.f50141g;
                AuthenticationActivity authenticationActivity = this.f50377a;
                boolean z14 = authenticationActivity.R9().f177775p;
                aVar2.getClass();
                authenticationActivity.getClass();
                ve2.e eVar = this.f50378b;
                eVar.getClass();
                Intent intent = new Intent(authenticationActivity, (Class<?>) (!z14 ? CountrySettingsActivityLandscape.class : CountrySettingActivity.class));
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("extra.sso.env", eVar);
                intent.putExtras(bundle);
                authenticationActivity.f50350t.a(intent, null);
                return Unit.INSTANCE;
            }
        }

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = AuthenticationActivity.this.new g(dVar);
            gVar.f50375b = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (ge1.b.e0(r1, r5, r7) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50374a;
            AuthenticationActivity authenticationActivity = AuthenticationActivity.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    b0Var = (b0) this.f50375b;
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
            b0Var = (b0) this.f50375b;
            a aVar2 = AuthenticationActivity.f50343v;
            authenticationActivity.Z9().debug("onClickLoadCountrySelector");
            re2.b bVar = re2.b.f152215a;
            this.f50375b = b0Var;
            this.f50374a = 1;
            bVar.getClass();
            obj = re2.b.q(this);
            if (obj != aVar) {
            }
            return aVar;
            ve2.e eVar = (ve2.e) obj;
            if (c0.g(b0Var)) {
                x53.c cVar = s0.f129406a;
                t1 t1Var = o.f168762a;
                a aVar3 = new a(authenticationActivity, eVar, null);
                this.f50375b = null;
                this.f50374a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$onTermsOfUseApproval$1", f = "AuthenticationActivity.kt", l = {467, 471}, m = "invokeSuspend")
    public static final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50380b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$onTermsOfUseApproval$1$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AuthenticationActivity f50382a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AuthenticationActivity authenticationActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f50382a = authenticationActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f50382a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                AuthenticationActivity authenticationActivity = this.f50382a;
                authenticationActivity.setResult(-1);
                authenticationActivity.finish();
                return Unit.INSTANCE;
            }
        }

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            h hVar = AuthenticationActivity.this.new h(dVar);
            hVar.f50380b = obj;
            return hVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        
            if (ge1.b.e0(r11, r1, r10) == r0) goto L26;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            b0 b0Var;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50379a;
            final int i15 = 1;
            final AuthenticationActivity authenticationActivity = AuthenticationActivity.this;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        b0Var = (b0) this.f50380b;
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
                b0Var = (b0) this.f50380b;
                Context applicationContext = authenticationActivity.getApplicationContext();
                applicationContext.getClass();
                ve2.d dVar = authenticationActivity.f50345n;
                dVar.getClass();
                l lVarR9 = authenticationActivity.R9();
                re2.b.f152215a.getClass();
                h0 h0Var = new h0(applicationContext, dVar, lVarR9, re2.b.f152218d);
                this.f50380b = b0Var;
                this.f50379a = 1;
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new te2.g0(h0Var, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                }
                return obj2;
                if (c0.g(b0Var)) {
                    a aVar = AuthenticationActivity.f50343v;
                    authenticationActivity.Z9().debug("CONTINUE_AS complete");
                    x53.c cVar2 = s0.f129406a;
                    t1 t1Var = o.f168762a;
                    a aVar2 = new a(authenticationActivity, null);
                    this.f50380b = null;
                    this.f50379a = 2;
                }
            } catch (Exception e4) {
                a aVar3 = AuthenticationActivity.f50343v;
                authenticationActivity.Z9().warn("CONTINUE_AS failure");
                if (e4 instanceof RateLimitException) {
                    androidx.lifecycle.i0 i0VarW = f0.w(authenticationActivity);
                    x53.c cVar3 = s0.f129406a;
                    ge1.b.T(i0VarW, o.f168762a, null, new xe2.j(authenticationActivity, null), 2);
                } else {
                    final int i16 = 0;
                    authenticationActivity.O9(e4, new e23.a() { // from class: xe2.n
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i16;
                            AuthenticationActivity authenticationActivity2 = authenticationActivity;
                            switch (i17) {
                                case 0:
                                    authenticationActivity2.setResult(0);
                                    authenticationActivity2.finish();
                                    break;
                                default:
                                    AuthenticationActivity.a aVar4 = AuthenticationActivity.f50343v;
                                    authenticationActivity2.getClass();
                                    androidx.lifecycle.i0 i0VarW2 = o53.f0.w(authenticationActivity2);
                                    x53.c cVar4 = o53.s0.f129406a;
                                    ge1.b.T(i0VarW2, u53.o.f168762a, null, new l(authenticationActivity2, null), 2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new e23.a() { // from class: xe2.n
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i15;
                            AuthenticationActivity authenticationActivity2 = authenticationActivity;
                            switch (i17) {
                                case 0:
                                    authenticationActivity2.setResult(0);
                                    authenticationActivity2.finish();
                                    break;
                                default:
                                    AuthenticationActivity.a aVar4 = AuthenticationActivity.f50343v;
                                    authenticationActivity2.getClass();
                                    androidx.lifecycle.i0 i0VarW2 = o53.f0.w(authenticationActivity2);
                                    x53.c cVar4 = o53.s0.f129406a;
                                    ge1.b.T(i0VarW2, u53.o.f168762a, null, new l(authenticationActivity2, null), 2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$onTermsOfUseApproval$2", f = "AuthenticationActivity.kt", l = {500}, m = "invokeSuspend")
    public static final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50383a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f50385c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f50385c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return AuthenticationActivity.this.new i(this.f50385c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50383a;
            if (i14 == 0) {
                r.b(obj);
                re2.b bVar = re2.b.f152215a;
                this.f50383a = 1;
                bVar.getClass();
                obj = re2.b.q(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            ve2.e eVar = (ve2.e) obj;
            re2.b.f152215a.getClass();
            bf2.a aVar2 = re2.b.f152227m;
            if (aVar2 != null && aVar2.a(eVar) != null) {
                p13.i0.f134941a.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$onWebViewPageFinishedLoading$1", f = "AuthenticationActivity.kt", l = {749}, m = "invokeSuspend")
    public static final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MobileAuthTextView f50386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50387b;

        public j(t13.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return AuthenticationActivity.this.new j(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag;
            MobileAuthTextView toolbarTitle;
            MobileAuthTextView mobileAuthTextView;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50387b;
            if (i14 == 0) {
                r.b(obj);
                Fragment fragmentG = AuthenticationActivity.this.getSupportFragmentManager().G("CREATE_ACCOUNT");
                if (fragmentG != null && (toolbarTitle = (mobileAuthAbstractWebFrag = (MobileAuthAbstractWebFrag) fragmentG).getToolbarTitle()) != null) {
                    com.garmin.android.library.mobileauth.ui.d.Companion aVar2 = com.garmin.android.library.mobileauth.ui.d.INSTANCE;
                    Resources resources = mobileAuthAbstractWebFrag.getResources();
                    resources.getClass();
                    ve2.e environment = mobileAuthAbstractWebFrag.getEnvironment();
                    this.f50386a = toolbarTitle;
                    this.f50387b = 1;
                    aVar2.getClass();
                    l0 l0Var = l0.f152316a;
                    String string = resources.getString(R.string.txt_sign_in_button);
                    string.getClass();
                    l0Var.getClass();
                    x53.c cVar = s0.f129406a;
                    obj = ge1.b.e0(x53.b.f189152a, new re2.i0(environment, resources, string, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    mobileAuthTextView = toolbarTitle;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mobileAuthTextView = this.f50386a;
            r.b(obj);
            mobileAuthTextView.setText((CharSequence) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$privateOnResume$1", f = "AuthenticationActivity.kt", l = {170}, m = "invokeSuspend")
    public static final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50389a;

        public k(t13.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return AuthenticationActivity.this.new k(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50389a;
            if (i14 == 0) {
                r.b(obj);
                this.f50389a = 1;
                a aVar = AuthenticationActivity.f50343v;
                AuthenticationActivity authenticationActivity = AuthenticationActivity.this;
                authenticationActivity.getClass();
                Object objE0 = ge1.b.e0(s0.f129406a, new xe2.m(authenticationActivity, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
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

    public AuthenticationActivity() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new tr2.y(this, 13));
        cVarRegisterForActivityResult.getClass();
        this.f50350t = cVarRegisterForActivityResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (ge1.b.e0(r7, r2, r0) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W9(AuthenticationActivity authenticationActivity, ue2.e eVar, v13.c cVar) {
        xe2.h hVar;
        Object objC;
        if (cVar instanceof xe2.h) {
            hVar = (xe2.h) cVar;
            int i14 = hVar.f190485c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f190485c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new xe2.h(cVar);
            }
        } else {
            hVar = new xe2.h(cVar);
        }
        Object obj = hVar.f190484b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f190485c;
        if (i15 == 0) {
            r.b(obj);
            hVar.f190483a = authenticationActivity;
            hVar.f190485c = 1;
            objC = eVar.c(authenticationActivity, hVar);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            authenticationActivity = hVar.f190483a;
            r.b(obj);
            objC = ((q) obj).f128597a;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Boolean.FALSE;
        Throwable thB = q.b(objC);
        if (thB != null) {
            if (thB instanceof ue2.b) {
                authenticationActivity.aa(((ue2.b) thB).f170260a);
            } else {
                x53.c cVar2 = s0.f129406a;
                t1 t1Var = o.f168762a;
                xe2.i iVar = new xe2.i(authenticationActivity, thB, null);
                hVar.f190483a = null;
                hVar.f190485c = 2;
            }
            return Boolean.FALSE;
        }
        int iIntValue = ((Number) objC).intValue();
        if (iIntValue == 0 || 2 == iIntValue) {
            authenticationActivity.ba(false, false);
            return Boolean.FALSE;
        }
        if (3 != iIntValue) {
            return 1 == iIntValue ? Boolean.TRUE : Boolean.FALSE;
        }
        authenticationActivity.aa(ue2.a.VERIFICATION_REQUIRED);
        return Boolean.FALSE;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void B0() {
        androidx.lifecycle.i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new g(null), 2);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void D3() {
        Z9().debug("onClickSwitchAccounts: calling 'SystemAcctMgr.deleteSystemAccount'...");
        j2.f164115a.getClass();
        j2.j(this);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void F1() {
        re2.b.f152215a.getClass();
        if (re2.b.v()) {
            setResult(0);
            finish();
        } else {
            this.f50417f = null;
            da();
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Object K6(v13.i iVar) {
        ve2.e eVar;
        re2.b.f152215a.getClass();
        if (re2.b.u()) {
            l0 l0Var = l0.f152316a;
            ve2.d dVar = this.f50345n;
            l0Var.getClass();
            x53.c cVar = s0.f129406a;
            return ge1.b.e0(x53.b.f189152a, new re2.j0(dVar, null), iVar);
        }
        if (!re2.b.v()) {
            kg.f.n("isChinaEnvironment: unhandled mode");
            return null;
        }
        ve2.m mVarS9 = S9();
        if (mVarS9 != null && (eVar = mVarS9.f177786a) != null) {
            return Boolean.valueOf(ve2.f.b(eVar));
        }
        kg.f.n("isChinaEnvironment: null 'MultiUserMode'");
        return null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Object L7(v13.c cVar) {
        return this.f50345n;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void N8() {
        Z9().debug("onTryAgainPressedFromAgeSignalsErrorScreen");
        Z9().debug("evaluatePlayStoreAgeSignals");
        ge1.b.T(f0.w(this), null, null, new xe2.g(this, null), 3);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void R4() {
        Q9().postAtFrontOfQueue(new vg1.d(17, this, "onPortalBootstrapFailed"));
    }

    public final void X9(sc2.h hVar) {
        Context applicationContext = getApplicationContext();
        androidx.lifecycle.i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new d(applicationContext, hVar, this, null), 2);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void Y3(WebView webView, String str, String str2) {
        str2.getClass();
        if (R9().g() || !w.z(str, str2, false)) {
            return;
        }
        try {
            if (!w.z(str, "/sso/signin", false)) {
                w.z(str, "/sso/createNewAccount", false);
                return;
            }
            i0 i0Var = this.f50417f;
            if (i0Var == null || i0.CREATE_ACCOUNT != i0Var) {
                return;
            }
            androidx.lifecycle.i0 i0VarW = f0.w(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, o.f168762a, null, new j(null), 2);
        } catch (Exception unused) {
        }
    }

    public final void Y9() {
        AlertDialog alertDialog = this.f50346o;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f50346o = null;
    }

    public final Logger Z9() {
        return (Logger) this.f50344m.getValue();
    }

    public final void aa(ue2.a aVar) {
        i0 i0Var = i0.AGE_SIGNALS_ERROR;
        Bundle bundle = new Bundle(1);
        bundle.putString("error_enum_name", aVar.name());
        Unit unit = Unit.INSTANCE;
        ca(i0Var, bundle);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void b4() {
        Z9().debug("onClickLoadCreateAccount");
        this.f50347p = true;
        i0 i0Var = i0.TERMS_OF_USE;
        Bundle bundle = new Bundle(1);
        bundle.putString("arg.flow", "CREATE_ACCT");
        Unit unit = Unit.INSTANCE;
        ca(i0Var, bundle);
    }

    public final void ba(boolean z14, boolean z15) {
        if (!z14 && R9().L) {
            i0 i0Var = i0.CREATE_ACCOUNT_WARNING;
            Bundle bundle = new Bundle(1);
            bundle.putBoolean(af2.a.ARG_PARENTAL_CONSENT_REQUIRED, z15);
            ca(i0Var, bundle);
            return;
        }
        if (!R9().g()) {
            ca(i0.CREATE_ACCOUNT, null);
            return;
        }
        i0 i0Var2 = i0.CREATE_ACCOUNT_PORTAL;
        Bundle bundle2 = new Bundle(1);
        bundle2.putBoolean(af2.a.ARG_PARENTAL_CONSENT_REQUIRED, z15);
        ca(i0Var2, bundle2);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Set<Integer> c1() {
        return this.f50421j;
    }

    public final void ca(i0 i0Var, Bundle bundle) {
        i0Var.getClass();
        androidx.lifecycle.i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, o.f168762a, null, new e(i0Var, this, bundle, null), 2);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final boolean d7() {
        return R9().f177764e;
    }

    public final void da() {
        re2.b.f152215a.getClass();
        if (re2.b.u()) {
            Z9().debug("onResume");
            ge1.b.T(f0.w(this), null, null, new k(null), 3);
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void j3(bf2.b bVar) {
        bVar.getClass();
        Logger loggerZ9 = Z9();
        String str = bVar.f17825a;
        loggerZ9.debug("onClickSocialLoginApp: ".concat(str));
        this.f50347p = false;
        i0 i0Var = i0.TERMS_OF_USE;
        Bundle bundle = new Bundle(2);
        bundle.putString("arg.flow", "SOCIAL_SIGN_IN");
        bundle.putString("arg.social_platform", str);
        Unit unit = Unit.INSTANCE;
        ca(i0Var, bundle);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void k3(com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a, String str) {
        enumC1005a.getClass();
        Z9().debug("onTermsOfUseApproval: flow = " + enumC1005a.name() + ", socialApp = " + str);
        int i14 = b.f50352b[enumC1005a.ordinal()];
        if (i14 == 1) {
            if (R9().g()) {
                ca(i0.SIGN_IN_PORTAL, null);
                return;
            } else {
                ca(i0.SIGN_IN, null);
                return;
            }
        }
        if (i14 == 2) {
            if (R9().f177762c) {
                ba(false, false);
                return;
            } else {
                Z9().debug("evaluatePlayStoreAgeSignals");
                ge1.b.T(f0.w(this), null, null, new xe2.g(this, null), 3);
                return;
            }
        }
        if (i14 == 3) {
            androidx.lifecycle.i0 i0VarW = f0.w(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, x53.b.f189152a, null, new h(null), 2);
        } else if (i14 == 4) {
            ge1.b.T(f0.w(this), null, null, new i(str, null), 3);
        } else {
            u0.r();
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void n6(int i14) {
        this.f50348q = i14;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void n7(WebView webView, String str, String str2) {
        str2.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void o0(com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a) {
        enumC1005a.getClass();
        com.airbnb.lottie.animation.keyframe.a.w("onTermsOfUseBackPressed: flow ", enumC1005a.name(), Z9());
        int i14 = b.f50352b[enumC1005a.ordinal()];
        if (i14 != 1 && i14 != 2) {
            if (i14 == 3) {
                ca(i0.CONTINUE_AS, null);
                return;
            } else if (i14 != 4) {
                u0.r();
                return;
            }
        }
        re2.b.f152215a.getClass();
        if (!re2.b.v()) {
            ca(i0.WELCOME, null);
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void o1(boolean z14) {
        Z9().debug("onCreateAccountWarningNext");
        ba(true, z14);
    }

    @Override // b.g, android.app.Activity
    public final void onBackPressed() {
        i0 i0Var = this.f50417f;
        switch (i0Var == null ? -1 : b.f50351a[i0Var.ordinal()]) {
            case 1:
            case 2:
                setResult(0);
                finish();
                return;
            case 3:
            case 4:
                re2.b.f152215a.getClass();
                if (!re2.b.v()) {
                    ca(i0.WELCOME, null);
                    return;
                } else {
                    setResult(0);
                    finish();
                    return;
                }
            case 5:
                Fragment fragmentG = getSupportFragmentManager().G("SIGN_IN");
                if (fragmentG == null || ((com.garmin.android.library.mobileauth.ui.d) fragmentG).onBackPressedHandled$mobile_auth_release()) {
                    return;
                }
                re2.b.f152215a.getClass();
                if (!re2.b.v()) {
                    ca(i0.WELCOME, null);
                    return;
                } else {
                    setResult(0);
                    finish();
                    return;
                }
            case 6:
                Fragment fragmentG2 = getSupportFragmentManager().G("SIGN_IN_PORTAL");
                if (fragmentG2 == null || ((af2.g) fragmentG2).onBackPressedHandled$mobile_auth_release()) {
                    return;
                }
                re2.b.f152215a.getClass();
                if (!re2.b.v()) {
                    ca(i0.WELCOME, null);
                    return;
                } else {
                    setResult(0);
                    finish();
                    return;
                }
            case 7:
                Fragment fragmentG3 = getSupportFragmentManager().G("TERMS_OF_USE");
                fragmentG3.getClass();
                com.garmin.android.library.mobileauth.ui.e eVar = (com.garmin.android.library.mobileauth.ui.e) fragmentG3;
                com.garmin.android.library.mobileauth.ui.b fragListener$mobile_auth_release = eVar.getFragListener$mobile_auth_release();
                com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a = eVar.f50433e;
                if (enumC1005a != null) {
                    fragListener$mobile_auth_release.o0(enumC1005a);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("flow");
                    throw null;
                }
            case 8:
                Fragment fragmentG4 = getSupportFragmentManager().G("CREATE_ACCOUNT_WARNING");
                fragmentG4.getClass();
                z zVar = (z) fragmentG4;
                Button button = zVar.f190604a;
                if (button == null) {
                    p005kotlin.jvm.internal.s.m("buttonNext");
                    throw null;
                }
                if (button.getVisibility() == 4) {
                    return;
                }
                zVar.getFragListener$mobile_auth_release().s1();
                return;
            case 9:
                Fragment fragmentG5 = getSupportFragmentManager().G("AGE_SIGNALS_ERROR");
                fragmentG5.getClass();
                ye2.b bVar = (ye2.b) fragmentG5;
                ge1.b.T(f0.w(bVar), null, null, new ye2.c(bVar, null), 3);
                return;
            case 10:
                return;
            default:
                super.onBackPressed();
                return;
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("skip.signin.config")) {
            Z9().debug("onCreate");
        } else {
            this.f50349r = Build.VERSION.SDK_INT >= 33 ? (s) getIntent().getParcelableExtra("skip.signin.config", s.class) : (s) getIntent().getParcelableExtra("skip.signin.config");
            Z9().debug("onCreate: {}", this.f50349r);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Z9().debug("onDestroy");
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        Z9().debug("onPause");
        Y9();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        Z9().debug("onRestart");
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        da();
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Z9().debug("onStop");
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void p1() {
        Z9().debug("onBackPressedFromAgeSignalsErrorScreen");
        ca(i0.WELCOME, null);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void p9(WebView webView, String str, String str2) {
        Collection collectionS0;
        str2.getClass();
        l0.f152316a.getClass();
        sc2.h hVar = null;
        if (!l0.e(this)) {
            if (this.f50345n == null) {
                ca(i0.WELCOME, null);
                return;
            } else {
                ca(i0.CONTINUE_AS, null);
                return;
            }
        }
        if (R9().g()) {
            return;
        }
        if (w.z(str, str2, false) && w.z(str, "ticket=", false)) {
            try {
                webView.stopLoading();
                webView.loadUrl("file:///android_asset/loading.html");
                Z9().debug("ticket found");
                List listG = new d53.k("\\?ticket=").g(0, str);
                if (!listG.isEmpty()) {
                    ListIterator listIterator = listG.listIterator(listG.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            collectionS0 = p13.j0.f134944a;
                            break;
                        } else if (((String) listIterator.previous()).length() != 0) {
                            collectionS0 = p13.h0.S0(listG, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                } else {
                    collectionS0 = p13.j0.f134944a;
                    break;
                }
                String[] strArr = (String[]) collectionS0.toArray(new String[0]);
                hVar = new sc2.h(strArr[0], strArr[1]);
            } catch (Exception e4) {
                Z9().error("onLoadWebViewResource", (Throwable) e4);
            }
        }
        if (hVar != null) {
            X9(hVar);
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    /* JADX INFO: renamed from: r9, reason: from getter */
    public final s getF50349r() {
        return this.f50349r;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void s1() {
        Z9().debug("onCreateAccountWarningBackPressed");
        re2.b.f152215a.getClass();
        if (!re2.b.v()) {
            ca(i0.WELCOME, null);
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void t2() {
        Z9().debug("onClickLoadSignIn");
        this.f50347p = false;
        i0 i0Var = i0.TERMS_OF_USE;
        Bundle bundle = new Bundle(1);
        bundle.putString("arg.flow", "SIGN_IN");
        Unit unit = Unit.INSTANCE;
        ca(i0Var, bundle);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void t5() {
        Q9().postAtFrontOfQueue(new vg1.d(17, this, "onPortalSessionExpired"));
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    /* JADX INFO: renamed from: u7, reason: from getter */
    public final int getF50494n() {
        return this.f50348q;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void w2() {
        Z9().debug("onClickContinue");
        this.f50347p = false;
        i0 i0Var = i0.TERMS_OF_USE;
        Bundle bundle = new Bundle(1);
        bundle.putString("arg.flow", "CONTINUE_AS");
        Unit unit = Unit.INSTANCE;
        ca(i0Var, bundle);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void w6(sc2.h hVar) {
        re2.b.f152215a.getClass();
        if (re2.b.v()) {
            return;
        }
        X9(hVar);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void y0() {
        Z9().debug("onClickSkipSignIn");
        setResult(1);
        finish();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void y1() {
        v supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentG = supportFragmentManager.G("CHINA_PRIVACY_CONSENT");
        if (fragmentG != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.v(fragmentG);
            aVar.s(true, true);
        }
        re2.b bVar = re2.b.f152215a;
        bVar.getClass();
        int i14 = re2.b.e.f152247a[re2.b.f152226l.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                return;
            } else {
                kg.f.n(fb1.c.n("not yet implemented for mode ", re2.b.f152226l.name()));
                return;
            }
        }
        g2.f164047a.getClass();
        SharedPreferences sharedPreferences = g2.f164049c;
        if (sharedPreferences == null) {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
        sharedPreferences.edit().putBoolean("is.shown.privacy.consent", true).commit();
        Iterator<re2.b.InterfaceC2863b> it = re2.b.f152218d.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Exception unused) {
            }
        }
        re2.b.a aVarI = !bVar.g() ? bVar.i() : null;
        int i15 = aVarI == null ? -1 : b.f50353c[aVarI.ordinal()];
        if (i15 == -1) {
            setResult(0);
            finish();
        } else if (i15 == 1) {
            setResult(-1);
            finish();
        } else {
            re2.b.f152215a.getClass();
            if (re2.b.u()) {
                ge1.b.T(f0.w(this), null, null, new f(null), 3);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/AuthenticationActivity$a;", "", "<init>", "()V", "", "ARG_SKIP_SIGNIN_CONFIG", "Ljava/lang/String;", "", "LEGAL_GATEWAY_REQUEST_CODE", "I", "RESULT_SKIP_SIGNIN", "RESULT_RATE_LIMITED", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
