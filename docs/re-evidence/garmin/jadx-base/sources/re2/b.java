package re2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.android.library.mobileauth.exception.CredentialExchangesExhaustedException;
import com.garmin.android.library.mobileauth.exception.IllegalAccountStateException;
import com.garmin.android.library.mobileauth.exception.MFATokenExpiredException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import lc.u0;
import o53.e2;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import p13.t0;
import r1.q2;
import te2.d1;
import te2.e1;
import te2.f2;
import te2.g2;
import te2.h2;
import te2.i2;
import te2.j2;
import te2.x1;
import te2.y1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lre2/b;", "Loc2/a;", "<init>", "()V", "a", "b", "d", "c", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class b implements oc2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f152215a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f152216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u53.d f152217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList<InterfaceC2863b> f152218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f152219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ve2.l f152220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o13.t f152221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f152222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o13.t f152223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f152224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o13.t f152225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static c f152226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static bf2.a f152227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o13.t f152228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o13.t f152229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o13.t f152230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o13.t f152231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final re2.a f152232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f152233s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lre2/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        NO_SYSTEM_ACCOUNT,
        SIGNED_IN,
        SIGNED_OUT,
        TRANSITIONING
    }

    /* JADX INFO: renamed from: re2.b$b, reason: collision with other inner class name */
    public interface InterfaceC2863b {
        void a();

        void b(ve2.r rVar);

        void c(ve2.e eVar);

        void e(ve2.d dVar, d dVar2);

        void f();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lre2/b$c;", "", "", "httpUserAgentLibraryName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        DEFAULT("mobile-auth"),
        MULTI_USER("mobile-auth-multi-user");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f152242a;

        c(String str) {
            this.f152242a = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lre2/b$d;", "", "<init>", "(Ljava/lang/String;I)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        /* JADX INFO: Fake field, exist only in values array */
        ACCT_MIGRATION_GC,
        CONTINUE_AS_EXISTING,
        IT_WEB_SIGN_IN,
        IT_WEB_CREATE_ACCT,
        /* JADX INFO: Fake field, exist only in values array */
        SOCIAL_WECHAT,
        /* JADX INFO: Fake field, exist only in values array */
        SOCIAL_QQ
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152247a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.MULTI_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f152247a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$callEventListenersShareLogs$2", f = "AuthenticationHelper.kt", l = {}, m = "invokeSuspend")
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f152248a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f152248a = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f152248a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str = this.f152248a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                Logger logger = b.f152216b;
                se2.b bVar = se2.b.SHARE_LOGS;
                logger.debug("logging Firebase event {}, source {}", bVar, str);
                se2.c.a(bVar, t0.b(new o13.p(se2.a.SOURCE, str)));
            } catch (Exception e4) {
                b.f152216b.error("logEvent", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lre2/b$a;", "<anonymous>", "(Lo53/b0;)Lre2/b$a;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$evaluate$1", f = "AuthenticationHelper.kt", l = {591, 601}, m = "invokeSuspend")
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152249a;

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super a> dVar) {
            return new g(dVar).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        
            if (r5.G(r4) == r0) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152249a;
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
                return a.TRANSITIONING;
            }
            o13.r.b(obj);
            b.f152215a.getClass();
            boolean z14 = b.m().f177764e;
            this.f152249a = 1;
            obj = b.y(z14, this);
            if (obj != aVar) {
            }
            return aVar;
            if (((Boolean) obj).booleanValue()) {
                b.f152215a.getClass();
                if (b.m().f177764e) {
                    b.f152216b.debug("evaluate -> SIGNED_IN");
                }
                return a.SIGNED_IN;
            }
            g2.f164047a.getClass();
            if (g2.a() == null) {
                b.f152215a.getClass();
                if (b.m().f177764e) {
                    b.f152216b.debug("evaluate -> SIGNED_OUT");
                }
                return a.SIGNED_OUT;
            }
            b.f152216b.debug("evaluate -> TRANSITIONING");
            b bVar = b.f152215a;
            this.f152249a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getActiveAccountAsync$2", f = "AuthenticationHelper.kt", l = {771}, m = "invokeSuspend")
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152250a;

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.d> dVar) {
            return new h(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152250a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            b bVar = b.f152215a;
            c cVar = c.DEFAULT;
            bVar.getClass();
            b.K("getActiveAccount", cVar, null);
            j2 j2Var = j2.f164115a;
            Context contextB = bVar.b();
            this.f152250a = 1;
            Object objA = j2Var.a(contextB, this);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getITClientID$1", f = "AuthenticationHelper.kt", l = {970}, m = "invokeSuspend")
    public static final class i extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ve2.l f152251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ve2.l f152252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f152253c;

        public i(t13.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new i(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
            return new i(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ve2.l lVar;
            ve2.l lVar2;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152253c;
            if (i14 == 0) {
                o13.r.b(obj);
                b.f152215a.getClass();
                ve2.l lVarM = b.m();
                this.f152251a = lVarM;
                this.f152252b = lVarM;
                this.f152253c = 1;
                Object objQ = b.q(this);
                if (objQ == aVar) {
                    return aVar;
                }
                lVar = lVarM;
                obj = objQ;
                lVar2 = lVar;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = this.f152252b;
                lVar2 = this.f152251a;
                o13.r.b(obj);
            }
            sc2.l lVarC = lVar.c((ve2.e) obj);
            if (lVarC != null && (str = lVarC.f158524a) != null) {
                return str;
            }
            ve2.p pVar = lVar2.f177761b.f177843a;
            String str2 = pVar != null ? pVar.f177816a : null;
            return str2 == null ? "" : str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/e;", "<anonymous>", "(Lo53/b0;)Lve2/e;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getPreferredUserEnvironment$2", f = "AuthenticationHelper.kt", l = {918}, m = "invokeSuspend")
    public static final class j extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152254a;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lve2/e;", "<anonymous>", "()Lve2/e;"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getPreferredUserEnvironment$2$1", f = "AuthenticationHelper.kt", l = {930}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.l<t13.d<? super ve2.e>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public r0 f152255a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public j2 f152256b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public r0 f152257c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f152258d;

            public a(t13.d<? super a> dVar) {
                super(1, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super ve2.e> dVar) {
                return new a(dVar).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0087  */
            /* JADX WARN: Code duplicated, block: B:31:0x009d  */
            /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
            /* JADX WARN: Code duplicated, block: B:38:0x00be  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v2, types: [T] */
            /* JADX WARN: Type inference failed for: r3v3, types: [ve2.e] */
            /* JADX WARN: Type inference failed for: r3v5 */
            /* JADX WARN: Type inference failed for: r8v19 */
            /* JADX WARN: Type inference failed for: r8v20, types: [T] */
            /* JADX WARN: Type inference failed for: r8v25 */
            /* JADX WARN: Type inference failed for: r8v26 */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                r0 r0Var;
                r0 r0Var2;
                r0 r0Var3;
                j2 j2Var;
                SharedPreferences sharedPreferences;
                String string;
                ve2.e eVarValueOf;
                ?? L;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f152258d;
                ?? r14 = 0;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b bVar = b.f152215a;
                    bVar.getClass();
                    if (b.w() || b.m().f177762c) {
                        return ve2.e.f177705e;
                    }
                    r0Var = new r0();
                    j2 j2Var2 = j2.f164115a;
                    if (j2Var2.o(bVar.b(), b.m(), false)) {
                        l0 l0Var = l0.f152316a;
                        this.f152255a = r0Var;
                        this.f152256b = j2Var2;
                        this.f152257c = r0Var;
                        this.f152258d = 1;
                        l0Var.getClass();
                        obj = l0.f(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        r0Var2 = r0Var;
                        r0Var3 = r0Var2;
                        j2Var = j2Var2;
                    }
                    if (r0Var.f105810a == null) {
                        g2.f164047a.getClass();
                        sharedPreferences = g2.f164049c;
                        if (sharedPreferences != null) {
                            p005kotlin.jvm.internal.s.m("prefs");
                            throw null;
                        }
                        string = sharedPreferences.getString("environment", "");
                        if (!TextUtils.isEmpty(string)) {
                            string.getClass();
                            eVarValueOf = ve2.e.valueOf(string);
                        }
                        if (r14 == 0) {
                            r14 = eVarValueOf;
                            r14 = ve2.e.f177704d;
                        }
                        r14 = eVarValueOf;
                        r0Var.f105810a = r14;
                    }
                    Object obj2 = r0Var.f105810a;
                    obj2.getClass();
                    return obj2;
                }
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var2 = this.f152257c;
                j2Var = this.f152256b;
                r0Var3 = this.f152255a;
                o13.r.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    g2.f164047a.getClass();
                    ve2.d dVarA = g2.a();
                    if (dVarA != null) {
                        L = dVarA.f177690a;
                    } else {
                        L = 0;
                    }
                } else {
                    b bVar2 = b.f152215a;
                    Context contextB = bVar2.b();
                    j2Var.getClass();
                    Account accountK = j2.k(contextB);
                    if (accountK != null) {
                        AccountManager accountManager = AccountManager.get(bVar2.b());
                        accountManager.getClass();
                        L = j2.l(accountManager, accountK);
                    } else {
                        L = 0;
                    }
                }
                r0Var2.f105810a = L;
                r0Var = r0Var3;
                if (r0Var.f105810a == null) {
                    g2.f164047a.getClass();
                    sharedPreferences = g2.f164049c;
                    if (sharedPreferences != null) {
                        p005kotlin.jvm.internal.s.m("prefs");
                        throw null;
                    }
                    string = sharedPreferences.getString("environment", "");
                    if (!TextUtils.isEmpty(string)) {
                        string.getClass();
                        eVarValueOf = ve2.e.valueOf(string);
                    }
                    if (r14 == 0) {
                        r14 = eVarValueOf;
                        r14 = ve2.e.f177704d;
                    }
                    r14 = eVarValueOf;
                    r0Var.f105810a = r14;
                }
                Object obj3 = r0Var.f105810a;
                obj3.getClass();
                return obj3;
            }
        }

        public j(t13.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new j(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.e> dVar) {
            return new j(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152254a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            b.f152215a.getClass();
            cz2.c cVar = (cz2.c) b.f152231q.getValue();
            a aVar2 = new a(null);
            this.f152254a = 1;
            Object objA = cVar.a(aVar2, this);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/e;", "<anonymous>", "(Lo53/b0;)Lve2/e;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getSignedInUserEnvironment$1", f = "AuthenticationHelper.kt", l = {957, 958}, m = "invokeSuspend")
    public static final class k extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152259a;

        public k(t13.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new k(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.e> dVar) {
            return new k(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152259a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = b.f152215a;
                this.f152259a = 1;
                bVar.getClass();
                obj = b.y(false, this);
                if (obj != aVar) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            if (!((Boolean) obj).booleanValue()) {
                return null;
            }
            b bVar2 = b.f152215a;
            this.f152259a = 2;
            bVar2.getClass();
            Object objQ = b.q(this);
            return objQ == aVar ? aVar : objQ;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$signOutIfOrphanedCredentialExists$1", f = "AuthenticationHelper.kt", l = {533}, m = "invokeSuspend")
    public static final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152260a;

        public l(t13.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new l(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return new l(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152260a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = b.f152215a;
                this.f152260a = 1;
                if (bVar.G(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$sysAcctUpdateListener$1$1", f = "AuthenticationHelper.kt", l = {315}, m = "invokeSuspend")
    public static final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152261a;

        public m(t13.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new m(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return new m(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152261a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = b.f152215a;
                this.f152261a = 1;
                if (bVar.G(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$sysAcctUpdateListener$1$2", f = "AuthenticationHelper.kt", l = {325}, m = "invokeSuspend")
    public static final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152262a;

        public n(t13.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new n(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return new n(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152262a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = b.f152215a;
                this.f152262a = 1;
                if (bVar.G(this) == aVar) {
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

    static {
        l0.f152316a.getClass();
        f152216b = l0.c("Helper");
        e2 e2VarH = ge1.b.h();
        x53.c cVar = s0.f129406a;
        f152217c = zl.a.e("Helper", t13.g.a.C3052a.d(x53.b.f189152a, e2VarH));
        f152218d = new ArrayList<>(2);
        f152221g = o13.m.b(new r70.n(21));
        f152223i = o13.m.b(new r70.n(22));
        f152225k = o13.m.b(new r70.n(23));
        f152226l = c.DEFAULT;
        f152228n = o13.m.b(new r70.n(24));
        f152229o = o13.m.b(new r70.n(25));
        f152230p = o13.m.b(new r70.n(26));
        o13.m.b(new r70.n(27));
        f152231q = o13.m.b(new r70.n(28));
        f152232r = new re2.a();
    }

    private b() {
    }

    public static Object A(b bVar, v13.c cVar) {
        bVar.getClass();
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new r(null, null), cVar);
    }

    public static Object B(v13.c cVar) {
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new s(null), cVar);
    }

    public static Object F(ve2.e eVar, v13.i iVar) throws Throwable {
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new b0(eVar, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public static void J(String str, sc2.a aVar) throws IllegalAccessException {
        if (m().f177761b.a(aVar)) {
            return;
        }
        String strH = com.nimbusds.jose.shaded.gson.internal.a.h(str, ": credential type ", aVar.name(), " not configured");
        f152216b.error(strH);
        com.nimbusds.jose.shaded.gson.internal.a.t(strH);
    }

    public static void K(String str, c cVar, Logger logger) {
        cVar.getClass();
        if (f152226l != cVar) {
            String strJ = androidx.room.a0.j("use of function '", str, "' is restricted to library mode ", cVar.name());
            if (logger != null) {
                logger.error(strJ);
            } else {
                f152216b.error(strJ);
            }
            kg.f.n(strJ);
        }
    }

    public static void M(sc2.a aVar) throws RateLimitException {
        uc2.a.f169996a.getClass();
        uc2.b bVarD = uc2.a.d(aVar);
        if (bVarD == null) {
            return;
        }
        throw new RateLimitException(bVarD.f170001a, "", null, bVarD.f170004d, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r1.t(r4, r0, r2) == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(b bVar, ve2.e eVar, v13.c cVar) throws Exception {
        u uVar;
        ve2.e eVar2;
        bVar.getClass();
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f152338d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f152338d = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(bVar, cVar);
            }
        } else {
            uVar = new u(bVar, cVar);
        }
        Object objE0 = uVar.f152336b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f152338d;
        b bVar2 = f152215a;
        if (i15 == 0) {
            o13.r.b(objE0);
            uVar.f152335a = eVar;
            uVar.f152338d = 1;
            Object objO = o(bVar, uVar);
            if (objO != aVar) {
                eVar2 = eVar;
                objE0 = objO;
            }
            return aVar;
        }
        if (i15 == 1) {
            ve2.e eVar3 = uVar.f152335a;
            o13.r.b(objE0);
            eVar2 = eVar3;
        } else if (i15 == 2) {
            o13.r.b(objE0);
            sc2.b bVar3 = (sc2.b) wc2.b.a((wc2.a) objE0);
            j2 j2Var = j2.f164115a;
            Context contextB = bVar2.b();
            uVar.f152338d = 3;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        g2.f164047a.getClass();
        ve2.d dVarA = g2.a();
        dVarA.getClass();
        return dVarA;
        sc2.m mVar = (sc2.m) objE0;
        if (mVar == null) {
            q2.u("refreshUserProfileByGCSocialProfileEndpoint: getOAuth2DICredentials returned null");
            return null;
        }
        f152216b.debug("refreshUserProfileByGCSocialProfileEndpoint");
        qc2.o oVar = new qc2.o(bVar2.b(), eVar2, mVar.f158528b, null, 8, null);
        uVar.f152335a = null;
        uVar.f152338d = 2;
        x53.c cVar2 = s0.f129406a;
        objE0 = ge1.b.e0(x53.b.f189152a, new qc2.n(oVar, null), uVar);
        if (objE0 != aVar) {
            sc2.b bVar4 = (sc2.b) wc2.b.a((wc2.a) objE0);
            j2 j2Var2 = j2.f164115a;
            Context contextB2 = bVar2.b();
            uVar.f152338d = 3;
        }
        return aVar;
    }

    public static final void f(b bVar) {
        bVar.getClass();
        K("removeAccountFromSharedPrefsAndNotifyListeners", c.DEFAULT, null);
        j2.f164115a.getClass();
        j2.f164117c.set(0L);
        g2.f164047a.getClass();
        g2.b();
        f152216b.debug("signOut: notifying listeners...");
        Iterator<InterfaceC2863b> it = f152218d.iterator();
        while (it.hasNext()) {
            try {
                it.next().f();
            } catch (Exception unused) {
            }
        }
    }

    public static void h(String str) {
        f152216b.debug("callEventListenersShareLogs");
        Iterator<InterfaceC2863b> it = f152218d.iterator();
        while (it.hasNext()) {
            try {
                it.next().b(ve2.r.USER);
            } catch (Exception unused) {
            }
        }
        ge1.b.T(f152217c, null, null, new f(str, null), 3);
    }

    public static Object j(t13.d dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new h(null), dVar);
    }

    public static String k() {
        return (String) f152223i.getValue();
    }

    public static ve2.l m() {
        return (ve2.l) f152221g.getValue();
    }

    public static Object n(v13.c cVar) {
        K("getOAuth1GCCredentials", c.DEFAULT, null);
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new re2.g(null), cVar);
    }

    public static Object o(b bVar, v13.c cVar) throws IllegalAccessException {
        bVar.getClass();
        J("getOAuth2DICredentials", sc2.a.f158477c);
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new re2.h(null, null), cVar);
    }

    public static Object p(b bVar, v13.c cVar) {
        bVar.getClass();
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new re2.i(null, null), cVar);
    }

    public static Object q(t13.d dVar) {
        K("getPreferredUserEnvironment", c.DEFAULT, null);
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new j(null), dVar);
    }

    public static Object r(v13.c cVar) throws Throwable {
        K("handleGlobalSignOut", c.DEFAULT, null);
        x53.c cVar2 = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new re2.j(null), cVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0193  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bb A[PHI: r21
      0x01bb: PHI (r21v2 boolean) = (r21v1 boolean), (r21v7 boolean) binds: [B:65:0x01c1, B:59:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0210  */
    /* JADX WARN: Code duplicated, block: B:74:0x021b  */
    public static void s(b bVar, Context context, ve2.q qVar, InterfaceC2863b interfaceC2863b, ev.a aVar, we2.g gVar, nc2.d dVar, int i14) {
        boolean z14;
        td.a aVar2;
        ArrayList<InterfaceC2863b> arrayList;
        boolean z15;
        boolean z16;
        ev.a aVar3 = (i14 & 8) != 0 ? null : aVar;
        we2.g gVar2 = (i14 & 64) != 0 ? null : gVar;
        bVar.getClass();
        c cVar = c.DEFAULT;
        if (f152233s) {
            com.nimbusds.jose.shaded.gson.internal.a.t("library already initialized");
            return;
        }
        String str = "initializeCommon: portal [" + (gVar2 != null) + "]";
        Logger logger = f152216b;
        logger.debug(str);
        f152219e = context.getApplicationContext();
        f152222h = wc2.c.b(context, cVar.f152242a, "16.1.0");
        f152224j = wc2.c.a(context);
        f152220f = new ve2.l(bVar.b(), qVar, false, gVar2, false, dVar, false);
        f152227m = aVar3;
        g2 g2Var = g2.f164047a;
        Context contextB = bVar.b();
        g2Var.getClass();
        f2 f2Var = new f2();
        try {
            td.a aVarA = td.a.a("mobile.auth.sec", td.b.a(td.b.f163878a), contextB, td.a.d.AES256_SIV, td.a.e.AES256_GCM);
            SharedPreferences sharedPreferences = contextB.getApplicationContext().getSharedPreferences("mobile.auth", 0);
            sharedPreferences.getClass();
            Map<String, ?> all = sharedPreferences.getAll();
            all.getClass();
            if (!all.isEmpty()) {
                f2Var.a().debug("needs migration TRUE");
                f2Var.a().debug("migrate");
                SharedPreferences.Editor editorEdit = aVarA.edit();
                Map<String, ?> all2 = sharedPreferences.getAll();
                all2.getClass();
                f2Var.a().debug("copy");
                try {
                    for (Map.Entry<String, ?> entry : all2.entrySet()) {
                        Object value = entry.getValue();
                        if (value == null ? true : value instanceof String) {
                            ((td.a.b) editorEdit).putString(entry.getKey(), (String) value);
                        } else if (value instanceof Integer) {
                            ((td.a.b) editorEdit).putInt(entry.getKey(), ((Number) value).intValue());
                        } else if (value instanceof Boolean) {
                            ((td.a.b) editorEdit).putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
                        } else if (value instanceof Float) {
                            ((td.a.b) editorEdit).putFloat(entry.getKey(), ((Number) value).floatValue());
                        } else {
                            if (!(value instanceof Long)) {
                                throw new Exception("not handling type [" + value + "]");
                            }
                            z14 = true;
                            try {
                                ((td.a.b) editorEdit).putLong(entry.getKey(), ((Number) value).longValue());
                            } catch (Exception e4) {
                                e = e4;
                                ((td.a.b) editorEdit).commit();
                                f2Var.a().error("copy", (Throwable) e);
                                z15 = false;
                                if (z15) {
                                    z16 = z14;
                                } else {
                                    td.a.b bVar2 = (td.a.b) aVarA.edit();
                                    bVar2.clear();
                                    bVar2.commit();
                                    z16 = false;
                                }
                                if (z16) {
                                    sharedPreferences.edit().clear().apply();
                                    f2Var.a().debug("success");
                                    aVar2 = aVarA;
                                } else {
                                    aVar2 = null;
                                }
                                if (aVar2 != null) {
                                    g2.f164049c = aVar2;
                                } else {
                                    SharedPreferences sharedPreferences2 = contextB.getApplicationContext().getSharedPreferences("mobile.auth", 0);
                                    sharedPreferences2.getClass();
                                    g2.f164049c = sharedPreferences2;
                                    ((Logger) g2.f164048b.getValue()).warn("fallbackToUnencrypted");
                                }
                                f152226l = c.DEFAULT;
                                f152233s = z14;
                                j2 j2Var = j2.f164115a;
                                ve2.l lVarM = m();
                                j2Var.getClass();
                                lVarM.getClass();
                                j2.f164119e = lVarM.C;
                                String str2 = lVarM.B;
                                str2.getClass();
                                j2.f164120f = str2;
                                if (!w()) {
                                    bVar.g();
                                }
                                arrayList = f152218d;
                                if (!arrayList.contains(interfaceC2863b)) {
                                    logger.debug("registerEventListener");
                                    arrayList.add(interfaceC2863b);
                                }
                                logger.debug("initialize complete");
                            }
                        }
                    }
                    z14 = true;
                    ((td.a.b) editorEdit).commit();
                    z15 = true;
                } catch (Exception e14) {
                    e = e14;
                    z14 = true;
                }
                if (z15) {
                    td.a.b bVar3 = (td.a.b) aVarA.edit();
                    bVar3.clear();
                    bVar3.commit();
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (z16) {
                    sharedPreferences.edit().clear().apply();
                    f2Var.a().debug("success");
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    g2.f164049c = aVar2;
                } else {
                    SharedPreferences sharedPreferences3 = contextB.getApplicationContext().getSharedPreferences("mobile.auth", 0);
                    sharedPreferences3.getClass();
                    g2.f164049c = sharedPreferences3;
                    ((Logger) g2.f164048b.getValue()).warn("fallbackToUnencrypted");
                }
                f152226l = c.DEFAULT;
                f152233s = z14;
                j2 j2Var2 = j2.f164115a;
                ve2.l lVarM2 = m();
                j2Var2.getClass();
                lVarM2.getClass();
                j2.f164119e = lVarM2.C;
                String str3 = lVarM2.B;
                str3.getClass();
                j2.f164120f = str3;
                if (!w()) {
                    bVar.g();
                }
                arrayList = f152218d;
                if (!arrayList.contains(interfaceC2863b)) {
                    logger.debug("registerEventListener");
                    arrayList.add(interfaceC2863b);
                }
                logger.debug("initialize complete");
            }
            z14 = true;
            aVar2 = aVarA;
        } catch (Exception e15) {
            z14 = true;
            f2Var.a().error("creating/opening encrypted file", (Throwable) e15);
        }
        if (aVar2 != null) {
            g2.f164049c = aVar2;
        } else {
            SharedPreferences sharedPreferences4 = contextB.getApplicationContext().getSharedPreferences("mobile.auth", 0);
            sharedPreferences4.getClass();
            g2.f164049c = sharedPreferences4;
            ((Logger) g2.f164048b.getValue()).warn("fallbackToUnencrypted");
        }
        f152226l = c.DEFAULT;
        f152233s = z14;
        j2 j2Var3 = j2.f164115a;
        ve2.l lVarM3 = m();
        j2Var3.getClass();
        lVarM3.getClass();
        j2.f164119e = lVarM3.C;
        String str4 = lVarM3.B;
        str4.getClass();
        j2.f164120f = str4;
        if (!w()) {
            bVar.g();
        }
        arrayList = f152218d;
        if (!arrayList.contains(interfaceC2863b)) {
            logger.debug("registerEventListener");
            arrayList.add(interfaceC2863b);
        }
        logger.debug("initialize complete");
    }

    public static Object t(String str, v13.c cVar) {
        if (u()) {
            x53.c cVar2 = s0.f129406a;
            return ge1.b.e0(x53.b.f189152a, new re2.l(str, null), cVar);
        }
        kg.f.n(fb1.c.n("not yet implemented for mode ", f152226l.name()));
        return null;
    }

    public static boolean u() {
        return c.DEFAULT == f152226l;
    }

    public static boolean v() {
        return c.MULTI_USER == f152226l;
    }

    public static boolean w() {
        K("isPendingChinaPrivacyConsent", c.DEFAULT, null);
        if (m().f177762c) {
            g2.f164047a.getClass();
            SharedPreferences sharedPreferences = g2.f164049c;
            if (sharedPreferences == null) {
                p005kotlin.jvm.internal.s.m("prefs");
                throw null;
            }
            if (!sharedPreferences.getBoolean("is.shown.privacy.consent", false)) {
                return true;
            }
        }
        return false;
    }

    public static Object x(sc2.a aVar, v13.i iVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new re2.n(aVar, null), iVar);
    }

    public static Object y(boolean z14, v13.c cVar) {
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new o(z14, null), cVar);
    }

    public static Object z(b bVar, v13.i iVar) throws IllegalAccessException, RateLimitException {
        bVar.getClass();
        sc2.a aVar = sc2.a.f158477c;
        J("refreshOAuth2DICredentials", aVar);
        M(aVar);
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new q(null, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x015c A[Catch: all -> 0x01bf, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01bf, blocks: (B:54:0x015c, B:63:0x01c1), top: B:92:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1 A[Catch: all -> 0x01bf, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01bf, blocks: (B:54:0x015c, B:63:0x01c1), top: B:92:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x021d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [T, ve2.d] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.slf4j.Logger] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [T] */
    /* JADX WARN: Type inference failed for: r7v12, types: [T] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object C(String str, boolean z14, ve2.d dVar, v13.c cVar) throws Throwable {
        w wVar;
        r0 r0VarS;
        String str2;
        ?? r14;
        r0 r0Var;
        r0 r0Var2;
        ?? r15;
        m0 m0Var;
        r0 r0Var3;
        r0 r0Var4;
        m0 m0Var2;
        ?? r16;
        r0 r0Var5;
        r0 r0Var6;
        String str3;
        Object objE0;
        r0 r0Var7;
        ?? r17;
        ?? r18;
        ?? r19;
        Object obj;
        Object objE1;
        Object objE2;
        ?? r24;
        Object obj2;
        Object obj3;
        String str4 = str;
        ?? r25 = z14;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f152350j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f152350j = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object obj4 = wVar.f152348h;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        try {
            switch (wVar.f152350j) {
                case 0:
                    r0VarS = wr.g.s(obj4);
                    m0 m0Var3 = new m0();
                    r0 r0Var8 = new r0();
                    int i15 = e.f152247a[f152226l.ordinal()];
                    if (i15 != 1) {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        if (dVar == 0) {
                            throw new IllegalAccessException(tn.k.g(str4, ": [multiUserAuthGarminAccount] is null, API is for multi-user-auth library module only, not for app use"));
                        }
                        m0Var3.f105804a = true;
                        r0Var8.f105810a = dVar;
                        new te2.e2();
                        wVar.f152341a = str4;
                        wVar.f152342b = r0VarS;
                        wVar.f152343c = m0Var3;
                        wVar.f152344d = r0Var8;
                        wVar.f152345e = r0VarS;
                        wVar.f152347g = r25;
                        wVar.f152350j = 3;
                        Object objE3 = ge1.b.e0(s0.f129406a, new y1(dVar, null), wVar);
                        if (objE3 != aVar) {
                            r0Var4 = r0VarS;
                            m0Var2 = m0Var3;
                            r16 = objE3;
                            r0Var5 = r0Var8;
                            r24 = r25;
                            r0VarS.f105810a = r16;
                            str3 = str4;
                            r19 = r24;
                            try {
                                if (r19 != 0) {
                                    Context contextB = b();
                                    Object obj5 = r0Var5.f105810a;
                                    obj5.getClass();
                                    dd2.a aVar2 = ((ve2.d) obj5).f177695f;
                                    aVar2.getClass();
                                    ve2.l lVarM = m();
                                    Object obj6 = r0Var5.f105810a;
                                    obj6.getClass();
                                    ve2.e eVar = ((ve2.d) obj6).f177690a;
                                    Object obj7 = r0Var5.f105810a;
                                    obj7.getClass();
                                    h2 h2Var = new h2(contextB, aVar2, lVarM, eVar, ((ve2.d) obj7).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                                    wVar.f152341a = str3;
                                    wVar.f152342b = null;
                                    wVar.f152343c = null;
                                    wVar.f152344d = null;
                                    wVar.f152345e = null;
                                    wVar.f152346f = null;
                                    wVar.f152350j = 4;
                                    x53.c cVar2 = s0.f129406a;
                                    objE2 = ge1.b.e0(x53.b.f189152a, new te2.g(h2Var, null), wVar);
                                    if (objE2 != aVar) {
                                        obj2 = objE2;
                                        return (sc2.m) obj2;
                                    }
                                } else {
                                    Context contextB2 = b();
                                    Object obj8 = r0Var5.f105810a;
                                    obj8.getClass();
                                    dd2.a aVar3 = ((ve2.d) obj8).f177695f;
                                    aVar3.getClass();
                                    ve2.l lVarM2 = m();
                                    Object obj9 = r0Var5.f105810a;
                                    obj9.getClass();
                                    ve2.e eVar2 = ((ve2.d) obj9).f177690a;
                                    Object obj10 = r0Var5.f105810a;
                                    obj10.getClass();
                                    d1 d1Var = new d1(contextB2, aVar3, lVarM2, eVar2, ((ve2.d) obj10).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                                    wVar.f152341a = str3;
                                    wVar.f152342b = null;
                                    wVar.f152343c = null;
                                    wVar.f152344d = null;
                                    wVar.f152345e = null;
                                    wVar.f152346f = null;
                                    wVar.f152350j = 5;
                                    x53.c cVar3 = s0.f129406a;
                                    objE1 = ge1.b.e0(x53.b.f189152a, new te2.g(d1Var, null), wVar);
                                    if (objE1 != aVar) {
                                        obj3 = objE1;
                                        return (sc2.m) obj3;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r25 = str3;
                                boolean z15 = th instanceof CredentialExchangesExhaustedException;
                                ?? r26 = f152216b;
                                if (!z15) {
                                    if (th instanceof UnknownHostException) {
                                        r26.warn(r25, this);
                                        throw new NoNetworkException();
                                    }
                                    if (th instanceof RateLimitException) {
                                        r26.warn(r25, this);
                                        throw th;
                                    }
                                    r26.error(r25, th);
                                    throw th;
                                }
                                r26.warn(r25, this);
                                wVar.f152341a = th;
                                wVar.f152342b = null;
                                wVar.f152343c = null;
                                wVar.f152344d = null;
                                wVar.f152345e = null;
                                wVar.f152346f = null;
                                wVar.f152350j = 6;
                                if (r(wVar) != aVar) {
                                    throw th;
                                }
                            }
                        }
                        break;
                    } else {
                        I(str);
                        wVar.f152341a = str4;
                        wVar.f152342b = r0VarS;
                        wVar.f152343c = m0Var3;
                        wVar.f152344d = r0Var8;
                        wVar.f152345e = r0Var8;
                        wVar.f152347g = r25;
                        wVar.f152350j = 1;
                        Object objJ = j(wVar);
                        if (objJ != aVar) {
                            str2 = str4;
                            r14 = r25;
                            r0Var = r0Var8;
                            r0Var2 = r0VarS;
                            r15 = objJ;
                            m0Var = m0Var3;
                            r0Var3 = r0Var;
                            r15.getClass();
                            r0Var.f105810a = r15;
                            try {
                                new te2.e2();
                                wVar.f152341a = str2;
                                wVar.f152342b = r0Var2;
                                wVar.f152343c = m0Var;
                                wVar.f152344d = r0Var3;
                                wVar.f152345e = r0Var2;
                                wVar.f152346f = r0Var2;
                                wVar.f152347g = r14;
                                wVar.f152350j = 2;
                                x53.c cVar4 = s0.f129406a;
                                objE0 = ge1.b.e0(x53.b.f189152a, new x1(false, true, null), wVar);
                                if (objE0 != aVar) {
                                    m0Var2 = m0Var;
                                    r0Var7 = r0Var2;
                                    r0Var6 = r0Var7;
                                    r0Var4 = r0Var6;
                                    str3 = str2;
                                    r14 = r14;
                                    obj = objE0;
                                    r18 = r14;
                                    r17 = (ve2.k) obj;
                                    r0Var5 = r0Var3;
                                    r0Var7.f105810a = r17;
                                    r19 = r18;
                                    if (r19 != 0) {
                                        Context contextB3 = b();
                                        Object obj11 = r0Var5.f105810a;
                                        obj11.getClass();
                                        dd2.a aVar4 = ((ve2.d) obj11).f177695f;
                                        aVar4.getClass();
                                        ve2.l lVarM3 = m();
                                        Object obj12 = r0Var5.f105810a;
                                        obj12.getClass();
                                        ve2.e eVar3 = ((ve2.d) obj12).f177690a;
                                        Object obj13 = r0Var5.f105810a;
                                        obj13.getClass();
                                        h2 h2Var2 = new h2(contextB3, aVar4, lVarM3, eVar3, ((ve2.d) obj13).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                                        wVar.f152341a = str3;
                                        wVar.f152342b = null;
                                        wVar.f152343c = null;
                                        wVar.f152344d = null;
                                        wVar.f152345e = null;
                                        wVar.f152346f = null;
                                        wVar.f152350j = 4;
                                        x53.c cVar5 = s0.f129406a;
                                        objE2 = ge1.b.e0(x53.b.f189152a, new te2.g(h2Var2, null), wVar);
                                        if (objE2 != aVar) {
                                            obj2 = objE2;
                                            return (sc2.m) obj2;
                                        }
                                    } else {
                                        Context contextB4 = b();
                                        Object obj14 = r0Var5.f105810a;
                                        obj14.getClass();
                                        dd2.a aVar5 = ((ve2.d) obj14).f177695f;
                                        aVar5.getClass();
                                        ve2.l lVarM4 = m();
                                        Object obj15 = r0Var5.f105810a;
                                        obj15.getClass();
                                        ve2.e eVar4 = ((ve2.d) obj15).f177690a;
                                        Object obj16 = r0Var5.f105810a;
                                        obj16.getClass();
                                        d1 d1Var2 = new d1(contextB4, aVar5, lVarM4, eVar4, ((ve2.d) obj16).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                                        wVar.f152341a = str3;
                                        wVar.f152342b = null;
                                        wVar.f152343c = null;
                                        wVar.f152344d = null;
                                        wVar.f152345e = null;
                                        wVar.f152346f = null;
                                        wVar.f152350j = 5;
                                        x53.c cVar6 = s0.f129406a;
                                        objE1 = ge1.b.e0(x53.b.f189152a, new te2.g(d1Var2, null), wVar);
                                        if (objE1 != aVar) {
                                            obj3 = objE1;
                                            return (sc2.m) obj3;
                                        }
                                    }
                                }
                            } catch (MFATokenExpiredException unused) {
                                m0Var2 = m0Var;
                                r0Var6 = r0Var2;
                                r0Var4 = r0Var6;
                                str3 = str2;
                                r0Var7 = r0Var6;
                                r17 = 0;
                                r18 = r14;
                            }
                        }
                        break;
                    }
                    return aVar;
                case 1:
                    boolean z16 = wVar.f152347g;
                    r0Var = wVar.f152345e;
                    r0 r0Var9 = wVar.f152344d;
                    m0 m0Var4 = wVar.f152343c;
                    r0Var2 = wVar.f152342b;
                    str2 = (String) wVar.f152341a;
                    o13.r.b(obj4);
                    r0Var3 = r0Var9;
                    m0Var = m0Var4;
                    r14 = z16;
                    r15 = obj4;
                    r15.getClass();
                    r0Var.f105810a = r15;
                    new te2.e2();
                    wVar.f152341a = str2;
                    wVar.f152342b = r0Var2;
                    wVar.f152343c = m0Var;
                    wVar.f152344d = r0Var3;
                    wVar.f152345e = r0Var2;
                    wVar.f152346f = r0Var2;
                    wVar.f152347g = r14;
                    wVar.f152350j = 2;
                    x53.c cVar7 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new x1(false, true, null), wVar);
                    if (objE0 != aVar) {
                        m0Var2 = m0Var;
                        r0Var7 = r0Var2;
                        r0Var6 = r0Var7;
                        r0Var4 = r0Var6;
                        str3 = str2;
                        r14 = r14;
                        obj = objE0;
                        r18 = r14;
                        r17 = (ve2.k) obj;
                        r0Var5 = r0Var3;
                        r0Var7.f105810a = r17;
                        r19 = r18;
                        if (r19 != 0) {
                            Context contextB5 = b();
                            Object obj17 = r0Var5.f105810a;
                            obj17.getClass();
                            dd2.a aVar6 = ((ve2.d) obj17).f177695f;
                            aVar6.getClass();
                            ve2.l lVarM5 = m();
                            Object obj18 = r0Var5.f105810a;
                            obj18.getClass();
                            ve2.e eVar5 = ((ve2.d) obj18).f177690a;
                            Object obj19 = r0Var5.f105810a;
                            obj19.getClass();
                            h2 h2Var3 = new h2(contextB5, aVar6, lVarM5, eVar5, ((ve2.d) obj19).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                            wVar.f152341a = str3;
                            wVar.f152342b = null;
                            wVar.f152343c = null;
                            wVar.f152344d = null;
                            wVar.f152345e = null;
                            wVar.f152346f = null;
                            wVar.f152350j = 4;
                            x53.c cVar8 = s0.f129406a;
                            objE2 = ge1.b.e0(x53.b.f189152a, new te2.g(h2Var3, null), wVar);
                            if (objE2 != aVar) {
                                obj2 = objE2;
                                return (sc2.m) obj2;
                            }
                        } else {
                            Context contextB6 = b();
                            Object obj110 = r0Var5.f105810a;
                            obj110.getClass();
                            dd2.a aVar7 = ((ve2.d) obj110).f177695f;
                            aVar7.getClass();
                            ve2.l lVarM6 = m();
                            Object obj111 = r0Var5.f105810a;
                            obj111.getClass();
                            ve2.e eVar6 = ((ve2.d) obj111).f177690a;
                            Object obj112 = r0Var5.f105810a;
                            obj112.getClass();
                            d1 d1Var3 = new d1(contextB6, aVar7, lVarM6, eVar6, ((ve2.d) obj112).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                            wVar.f152341a = str3;
                            wVar.f152342b = null;
                            wVar.f152343c = null;
                            wVar.f152344d = null;
                            wVar.f152345e = null;
                            wVar.f152346f = null;
                            wVar.f152350j = 5;
                            x53.c cVar9 = s0.f129406a;
                            objE1 = ge1.b.e0(x53.b.f189152a, new te2.g(d1Var3, null), wVar);
                            if (objE1 != aVar) {
                                obj3 = objE1;
                                return (sc2.m) obj3;
                            }
                        }
                    }
                    return aVar;
                case 2:
                    r14 = wVar.f152347g;
                    r0Var7 = wVar.f152346f;
                    r0Var6 = wVar.f152345e;
                    r0Var3 = wVar.f152344d;
                    m0Var2 = wVar.f152343c;
                    r0Var4 = wVar.f152342b;
                    str3 = (String) wVar.f152341a;
                    try {
                        o13.r.b(obj4);
                        r14 = r14;
                        obj = obj4;
                        r18 = r14;
                        r17 = (ve2.k) obj;
                        break;
                    } catch (MFATokenExpiredException unused2) {
                        r0Var7 = r0Var6;
                        r17 = 0;
                        r18 = r14;
                    }
                    r0Var5 = r0Var3;
                    r0Var7.f105810a = r17;
                    r19 = r18;
                    if (r19 != 0) {
                        Context contextB7 = b();
                        Object obj113 = r0Var5.f105810a;
                        obj113.getClass();
                        dd2.a aVar8 = ((ve2.d) obj113).f177695f;
                        aVar8.getClass();
                        ve2.l lVarM7 = m();
                        Object obj114 = r0Var5.f105810a;
                        obj114.getClass();
                        ve2.e eVar7 = ((ve2.d) obj114).f177690a;
                        Object obj115 = r0Var5.f105810a;
                        obj115.getClass();
                        h2 h2Var4 = new h2(contextB7, aVar8, lVarM7, eVar7, ((ve2.d) obj115).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                        wVar.f152341a = str3;
                        wVar.f152342b = null;
                        wVar.f152343c = null;
                        wVar.f152344d = null;
                        wVar.f152345e = null;
                        wVar.f152346f = null;
                        wVar.f152350j = 4;
                        x53.c cVar10 = s0.f129406a;
                        objE2 = ge1.b.e0(x53.b.f189152a, new te2.g(h2Var4, null), wVar);
                        if (objE2 != aVar) {
                            obj2 = objE2;
                            return (sc2.m) obj2;
                        }
                    } else {
                        Context contextB8 = b();
                        Object obj116 = r0Var5.f105810a;
                        obj116.getClass();
                        dd2.a aVar9 = ((ve2.d) obj116).f177695f;
                        aVar9.getClass();
                        ve2.l lVarM8 = m();
                        Object obj117 = r0Var5.f105810a;
                        obj117.getClass();
                        ve2.e eVar8 = ((ve2.d) obj117).f177690a;
                        Object obj118 = r0Var5.f105810a;
                        obj118.getClass();
                        d1 d1Var4 = new d1(contextB8, aVar9, lVarM8, eVar8, ((ve2.d) obj118).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                        wVar.f152341a = str3;
                        wVar.f152342b = null;
                        wVar.f152343c = null;
                        wVar.f152344d = null;
                        wVar.f152345e = null;
                        wVar.f152346f = null;
                        wVar.f152350j = 5;
                        x53.c cVar11 = s0.f129406a;
                        objE1 = ge1.b.e0(x53.b.f189152a, new te2.g(d1Var4, null), wVar);
                        if (objE1 != aVar) {
                            obj3 = objE1;
                            return (sc2.m) obj3;
                        }
                    }
                    return aVar;
                case 3:
                    boolean z17 = wVar.f152347g;
                    r0 r0Var10 = wVar.f152345e;
                    r0Var5 = wVar.f152344d;
                    m0 m0Var5 = wVar.f152343c;
                    r0 r0Var11 = wVar.f152342b;
                    String str5 = (String) wVar.f152341a;
                    o13.r.b(obj4);
                    r24 = z17;
                    str4 = str5;
                    r0Var4 = r0Var11;
                    m0Var2 = m0Var5;
                    r16 = obj4;
                    r0VarS = r0Var10;
                    r0VarS.f105810a = r16;
                    str3 = str4;
                    r19 = r24;
                    if (r19 != 0) {
                        Context contextB9 = b();
                        Object obj119 = r0Var5.f105810a;
                        obj119.getClass();
                        dd2.a aVar10 = ((ve2.d) obj119).f177695f;
                        aVar10.getClass();
                        ve2.l lVarM9 = m();
                        Object obj1110 = r0Var5.f105810a;
                        obj1110.getClass();
                        ve2.e eVar9 = ((ve2.d) obj1110).f177690a;
                        Object obj1111 = r0Var5.f105810a;
                        obj1111.getClass();
                        h2 h2Var5 = new h2(contextB9, aVar10, lVarM9, eVar9, ((ve2.d) obj1111).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                        wVar.f152341a = str3;
                        wVar.f152342b = null;
                        wVar.f152343c = null;
                        wVar.f152344d = null;
                        wVar.f152345e = null;
                        wVar.f152346f = null;
                        wVar.f152350j = 4;
                        x53.c cVar12 = s0.f129406a;
                        objE2 = ge1.b.e0(x53.b.f189152a, new te2.g(h2Var5, null), wVar);
                        if (objE2 != aVar) {
                            obj2 = objE2;
                            return (sc2.m) obj2;
                        }
                    } else {
                        Context contextB10 = b();
                        Object obj1112 = r0Var5.f105810a;
                        obj1112.getClass();
                        dd2.a aVar11 = ((ve2.d) obj1112).f177695f;
                        aVar11.getClass();
                        ve2.l lVarM10 = m();
                        Object obj1113 = r0Var5.f105810a;
                        obj1113.getClass();
                        ve2.e eVar10 = ((ve2.d) obj1113).f177690a;
                        Object obj1114 = r0Var5.f105810a;
                        obj1114.getClass();
                        d1 d1Var5 = new d1(contextB10, aVar11, lVarM10, eVar10, ((ve2.d) obj1114).f177691b, m0Var2.f105804a, (ve2.k) r0Var4.f105810a, f152226l, null);
                        wVar.f152341a = str3;
                        wVar.f152342b = null;
                        wVar.f152343c = null;
                        wVar.f152344d = null;
                        wVar.f152345e = null;
                        wVar.f152346f = null;
                        wVar.f152350j = 5;
                        x53.c cVar13 = s0.f129406a;
                        objE1 = ge1.b.e0(x53.b.f189152a, new te2.g(d1Var5, null), wVar);
                        if (objE1 != aVar) {
                            obj3 = objE1;
                            return (sc2.m) obj3;
                        }
                    }
                    return aVar;
                case 4:
                    o13.r.b(obj4);
                    obj2 = obj4;
                    return (sc2.m) obj2;
                case 5:
                    o13.r.b(obj4);
                    obj3 = obj4;
                    return (sc2.m) obj3;
                case 6:
                    Throwable th4 = (Throwable) wVar.f152341a;
                    o13.r.b(obj4);
                    throw th4;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b9 A[Catch: all -> 0x00e5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e5, blocks: (B:42:0x00b9, B:51:0x00e7), top: B:76:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7 A[Catch: all -> 0x00e5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e5, blocks: (B:42:0x00b9, B:51:0x00e7), top: B:76:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r5 == r4) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(String str, boolean z14, ve2.d dVar, v13.c cVar) throws Throwable {
        x xVar;
        boolean z15;
        Object objJ;
        ve2.d dVar2;
        String str2;
        boolean z16;
        Object objE0;
        Object objE1;
        String str3 = str;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f152355e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f152355e = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj = xVar.f152353c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        String str4 = xVar.f152355e;
        Logger logger = f152216b;
        try {
            try {
                if (str4 == 0) {
                    o13.r.b(obj);
                    int i15 = e.f152247a[f152226l.ordinal()];
                    if (i15 != 1) {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        if (dVar == null) {
                            throw new IllegalAccessException(tn.k.g(str3, ": [multiUserAuthGarminAccount] is null, API is for multi-user-auth library module only, not for app use"));
                        }
                        dVar2 = dVar;
                        str2 = str3;
                        z16 = z14;
                        logger.debug("runOAuth2IT");
                        if (z16) {
                            i2 i2Var = new i2(b(), dVar2, m(), f152226l, null);
                            xVar.f152351a = str2;
                            xVar.f152355e = 2;
                            x53.c cVar2 = s0.f129406a;
                            objE1 = ge1.b.e0(x53.b.f189152a, new te2.q(i2Var, null), xVar);
                            if (objE1 != aVar) {
                                obj = objE1;
                                return (sc2.o) obj;
                            }
                        } else {
                            e1 e1Var = new e1(b(), dVar2, m(), f152226l, null);
                            xVar.f152351a = str2;
                            xVar.f152355e = 3;
                            x53.c cVar3 = s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new te2.q(e1Var, null), xVar);
                            if (objE0 != aVar) {
                                obj = objE0;
                                return (sc2.o) obj;
                            }
                        }
                    } else {
                        if (dVar != null) {
                            throw new IllegalAccessException(tn.k.g(str3, ": passing [multiUserAuthGarminAccount] object is only allowed by the multi-user-auth library module"));
                        }
                        I(str);
                        xVar.f152351a = str3;
                        z15 = z14;
                        xVar.f152352b = z15;
                        xVar.f152355e = 1;
                        objJ = j(xVar);
                    }
                    return aVar;
                }
                if (str4 != 1) {
                    if (str4 == 2) {
                        o13.r.b(obj);
                        return (sc2.o) obj;
                    }
                    if (str4 == 3) {
                        o13.r.b(obj);
                        return (sc2.o) obj;
                    }
                    if (str4 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th3 = (Throwable) xVar.f152351a;
                    o13.r.b(obj);
                    throw th3;
                }
                boolean z17 = xVar.f152352b;
                String str5 = (String) xVar.f152351a;
                o13.r.b(obj);
                z15 = z17;
                str3 = str5;
                objJ = obj;
                if (z16) {
                    i2 i2Var2 = new i2(b(), dVar2, m(), f152226l, null);
                    xVar.f152351a = str2;
                    xVar.f152355e = 2;
                    x53.c cVar4 = s0.f129406a;
                    objE1 = ge1.b.e0(x53.b.f189152a, new te2.q(i2Var2, null), xVar);
                    if (objE1 != aVar) {
                        obj = objE1;
                        return (sc2.o) obj;
                    }
                } else {
                    e1 e1Var2 = new e1(b(), dVar2, m(), f152226l, null);
                    xVar.f152351a = str2;
                    xVar.f152355e = 3;
                    x53.c cVar5 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new te2.q(e1Var2, null), xVar);
                    if (objE0 != aVar) {
                        obj = objE0;
                        return (sc2.o) obj;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                str4 = str2;
                if (!(th instanceof CredentialExchangesExhaustedException)) {
                    if (th instanceof UnknownHostException) {
                        logger.warn(str4, this);
                        throw new NoNetworkException();
                    }
                    if (th instanceof RateLimitException) {
                        logger.warn(str4, this);
                        throw th;
                    }
                    logger.error(str4, th);
                    throw th;
                }
                logger.warn(str4, this);
                xVar.f152351a = th;
                xVar.f152355e = 4;
                if (r(xVar) != aVar) {
                    throw th;
                }
            }
            objJ.getClass();
            boolean z18 = z15;
            str2 = str3;
            z16 = z18;
            dVar2 = (ve2.d) objJ;
            logger.debug("runOAuth2IT");
        } catch (Throwable th5) {
            th = th5;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(String str, sc2.a aVar, y yVar, v13.c cVar) throws Throwable {
        z zVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f152360c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f152360c = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objE0 = zVar.f152358a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f152360c;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a0 a0Var = new a0(str, aVar, yVar, null);
            zVar.f152360c = 1;
            objE0 = ge1.b.e0(bVar, a0Var, zVar);
            if (objE0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        return (String) objE0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(v13.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f152272c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f152272c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object obj = c0Var.f152270a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f152272c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                K("signOut", c.DEFAULT, null);
                x53.c cVar2 = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                d0 d0Var = new d0(null);
                c0Var.f152272c = 1;
                if (ge1.b.e0(bVar, d0Var, c0Var) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (CancellationException unused) {
        } catch (Throwable th3) {
            f152216b.error("signOut", th3);
        }
        return Unit.INSTANCE;
    }

    public final boolean H() {
        K("signOutIfOrphanedCredentialExists", c.DEFAULT, null);
        g2.f164047a.getClass();
        SharedPreferences sharedPreferences = g2.f164049c;
        if (sharedPreferences == null) {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
        boolean z14 = sharedPreferences.getBoolean("is.first.launch", true);
        if (z14) {
            SharedPreferences sharedPreferences2 = g2.f164049c;
            if (sharedPreferences2 == null) {
                p005kotlin.jvm.internal.s.m("prefs");
                throw null;
            }
            sharedPreferences2.edit().putBoolean("is.first.launch", false).apply();
        }
        if (z14) {
            j2 j2Var = j2.f164115a;
            Context contextB = b();
            j2Var.getClass();
            String[] strArrN = j2.n(contextB, true, null);
            if (strArrN != null && p13.u.z(strArrN, b().getPackageName())) {
                try {
                    f152216b.debug("orphaned credentials found, calling 'signOut' to clean up...");
                    x53.c cVar = s0.f129406a;
                    ge1.b.W(x53.b.f189152a, new l(null));
                } catch (Throwable unused) {
                }
                return true;
            }
        }
        return false;
    }

    public final void I(String str) throws IllegalAccountStateException {
        str.getClass();
        a aVarI = i();
        if (a.SIGNED_IN == aVarI) {
            return;
        }
        f152216b.error(str + ": current AccountState " + aVarI.name());
        throw new IllegalAccountStateException(aVarI);
    }

    public final void L() throws NoNetworkException {
        l0 l0Var = l0.f152316a;
        Context contextB = b();
        l0Var.getClass();
        if (!l0.e(contextB)) {
            throw new NoNetworkException();
        }
    }

    @Override // oc2.a
    public final Object a(tj2.b bVar) {
        return E("safeGetOAuth2ITToken", sc2.a.f158478d, new y(null, null), bVar);
    }

    @Override // oc2.a
    public final Context b() {
        Context context = f152219e;
        if (context != null) {
            return context;
        }
        p005kotlin.jvm.internal.s.m("appContext");
        throw null;
    }

    @Override // oc2.a
    public final ve2.e c() {
        x53.c cVar = s0.f129406a;
        return (ve2.e) ge1.b.W(x53.b.f189152a, new k(null));
    }

    @Override // oc2.a
    @SuppressLint({"VisibleForTests"})
    public final String d() throws IllegalAccessException {
        J("getITClientID", sc2.a.f158478d);
        x53.c cVar = s0.f129406a;
        return (String) ge1.b.W(x53.b.f189152a, new i(null));
    }

    public final boolean g() {
        re2.a aVar = f152232r;
        Logger logger = f152216b;
        K("addSysAcctUpdateListener", c.DEFAULT, null);
        try {
            try {
                boolean zH = H();
                try {
                    AccountManager.get(b()).addOnAccountsUpdatedListener(aVar, new Handler(b().getMainLooper()), false);
                    logger.debug("addSysAcctUpdateListener");
                    return zH;
                } catch (IllegalStateException unused) {
                    logger.error("addSysAcctUpdateListener: AccountManager listener already added. Is the app calling initialize more than once?");
                    return zH;
                }
            } catch (IllegalStateException unused2) {
                logger.error("addSysAcctUpdateListener: AccountManager listener already added. Is the app calling initialize more than once?");
                return false;
            }
        } catch (Throwable unused3) {
            AccountManager.get(b()).addOnAccountsUpdatedListener(aVar, new Handler(b().getMainLooper()), false);
            logger.debug("addSysAcctUpdateListener");
            return false;
        }
    }

    public final a i() {
        K("evaluate", c.DEFAULT, null);
        if (w()) {
            return a.NO_SYSTEM_ACCOUNT;
        }
        j2 j2Var = j2.f164115a;
        Context contextB = b();
        j2Var.getClass();
        if (j2.k(contextB) != null) {
            x53.c cVar = s0.f129406a;
            return (a) ge1.b.W(x53.b.f189152a, new g(null));
        }
        g2.f164047a.getClass();
        SharedPreferences sharedPreferences = g2.f164049c;
        if (sharedPreferences == null) {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
        boolean zContains = sharedPreferences.contains("is.signin.fallback");
        Logger logger = f152216b;
        if (!zContains) {
            logger.debug("evaluate -> NO_SYSTEM_ACCOUNT");
            return a.NO_SYSTEM_ACCOUNT;
        }
        if (m().f177764e) {
            logger.debug("evaluate -> SIGNED_IN (signin fallback)");
        }
        return a.SIGNED_IN;
    }

    @Override // oc2.a
    public final boolean isInitialized() {
        return f152233s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(v13.c cVar) throws Throwable {
        re2.e eVar;
        if (cVar instanceof re2.e) {
            eVar = (re2.e) cVar;
            int i14 = eVar.f152282c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f152282c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new re2.e(this, cVar);
            }
        } else {
            eVar = new re2.e(this, cVar);
        }
        Object objE0 = eVar.f152280a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f152282c;
        if (i15 == 0) {
            o13.r.b(objE0);
            if (!u()) {
                kg.f.n(fb1.c.n("not yet implemented for mode ", f152226l.name()));
                return null;
            }
            eVar.f152282c = 1;
            if (!u()) {
                kg.f.n(fb1.c.n("not yet implemented for mode ", f152226l.name()));
                return null;
            }
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new re2.f(null), eVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        ve2.k kVar = (ve2.k) objE0;
        if (kVar != null) {
            return kVar.f177753a;
        }
        return null;
    }
}
