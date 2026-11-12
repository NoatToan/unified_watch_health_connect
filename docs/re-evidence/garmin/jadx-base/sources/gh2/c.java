package gh2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import d53.u;
import e23.p;
import i3.e5;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o13.r;
import o13.t;
import o53.b0;
import o53.c2;
import o53.e2;
import o53.s0;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0010\u0011BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lgh2/c;", "Lgh2/n;", "Landroid/content/Context;", "appContext", "", RemoteConfigComponent.DEFAULTS_FILE_NAME, "", "url", "Lgh2/k;", "request", "", "cacheExpiration", "", "conditions", "<init>", "(Landroid/content/Context;ILjava/lang/String;Lgh2/k;JLjava/util/List;)V", "a", "b", "util_runtimeconfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f77429k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f77430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f77432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f77433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f77434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SharedPreferences f77435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u53.d f77436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c2 f77437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractMap f77438j;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgh2/c$b;", "Lgh2/i$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "defaultConfig", "<init>", "(Landroid/content/Context;I)V", "util_runtimeconfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f77439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f77441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f77442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public dd2.c f77443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<String> f77444f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f77445g;

        public b(Context context, int i14) {
            context.getClass();
            this.f77439a = context;
            this.f77440b = i14;
            this.f77441c = "";
            this.f77442d = "";
            this.f77444f = j0.f134944a;
            this.f77445g = 3600L;
        }

        @Override // gh2.i.a
        public final i.c b() {
            return i.c.GarminConnect;
        }

        @Override // gh2.i.a
        public final n c() {
            g gVar = g.f77454c;
            gVar.f77455a = new File(this.f77439a.getCacheDir(), "remote-config");
            gVar.a();
            String strG = e5.g(u.v(this.f77441c, "/$", "", false), "/system-service/remoteConfig/", this.f77442d);
            dd2.c cVar = this.f77443e;
            if (cVar == null) {
                cVar = new dd2.c("", "", "", "");
            }
            return new c(this.f77439a, this.f77440b, strG, new k(strG, cVar), this.f77445g, this.f77444f, null);
        }
    }

    /* JADX INFO: renamed from: gh2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.runtimeconfig.GCRemoteConfiguration$fetchConfig$1", f = "GCRemoteConfiguration.kt", l = {165}, m = "invokeSuspend")
    public static final class C1565c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f77446a;

        public C1565c(t13.d<? super C1565c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C1565c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1565c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f77446a;
            c cVar = c.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    this.f77446a = 1;
                    int i15 = c.f77429k;
                    cVar.getClass();
                    x53.c cVar2 = s0.f129406a;
                    Object objE0 = ge1.b.e0(x53.b.f189152a, new d(cVar, null), this);
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
                int i16 = c.f77429k;
            } catch (Throwable th3) {
                try {
                    int i17 = c.f77429k;
                    cVar.j().warn("fetchConfig: failed, fallback to last remote config", th3);
                } finally {
                    int i18 = c.f77429k;
                    cVar.k();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    private c(Context context, int i14, String str, k kVar, long j8, List<String> list) {
        this.f77430b = kVar;
        this.f77431c = j8;
        this.f77432d = o13.m.b(new g12.m(21));
        j jVar = new j(list);
        this.f77434f = jVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("remote-config", 0);
        sharedPreferences.getClass();
        this.f77435g = sharedPreferences;
        e2 e2VarH = ge1.b.h();
        x53.c cVar = s0.f129406a;
        this.f77436h = zl.a.e("GCRemoteConfiguration", t13.g.a.C3052a.d(u53.o.f168762a, e2VarH));
        l lVarB = g.f77454c.b(str);
        AbstractMap abstractMapA = lVarB != null ? jVar.a(lVarB.f77474e) : null;
        this.f77438j = abstractMapA == null ? m.b(i14, context) : abstractMapA;
    }

    @Override // gh2.n
    public final void b() {
        dd2.c cVar = this.f77430b.f77469b;
        if (cVar == null || TextUtils.isEmpty(cVar.f59212a) || TextUtils.isEmpty(cVar.f59213b) || TextUtils.isEmpty(cVar.f59214c) || TextUtils.isEmpty(cVar.f59215d)) {
            j().warn("fetchConfig: unusable oAuth1 credential");
            return;
        }
        c2 c2Var = this.f77437i;
        if (c2Var != null && c2Var.isActive()) {
            j().debug("fetchConfig: in progress...");
        } else {
            this.f77437i = ge1.b.T(this.f77436h, null, null, new C1565c(null), 3);
        }
    }

    @Override // gh2.n
    public final boolean c(String str) {
        String str2 = (String) this.f77438j.get(str);
        if (str2 != null) {
            return Boolean.parseBoolean(str2);
        }
        return false;
    }

    @Override // gh2.n
    public final String d() {
        try {
            StringBuilder sb3 = new StringBuilder();
            for (Map.Entry entry : this.f77438j.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                sb3.append(str);
                sb3.append(": ");
                sb3.append(str2);
                sb3.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            return sb3.toString();
        } catch (Exception e4) {
            j().error("getConfiguration", (Throwable) e4);
            return "";
        }
    }

    @Override // gh2.n
    public final Pair[] e() {
        try {
            AbstractMap abstractMap = this.f77438j;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : abstractMap.entrySet()) {
                String str = (String) entry.getKey();
                Pair pair = str.length() == 0 ? null : new Pair(str, m.d((String) entry.getValue()));
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return (Pair[]) h0.N0(arrayList, new e()).toArray(new Pair[0]);
        } catch (Exception e4) {
            j().error("getConfigurationPairs", (Throwable) e4);
            return null;
        }
    }

    @Override // gh2.n
    public final FirebaseRemoteConfigInfo f() {
        return this.f77433e;
    }

    @Override // gh2.n
    public final long g(String str) {
        return m.c(str, (String) this.f77438j.get(str));
    }

    @Override // gh2.n
    public final String h(String str) {
        str.getClass();
        return (String) this.f77438j.get(str);
    }

    @Override // gh2.n
    public final void i() {
        long j8 = this.f77435g.getLong("REMOTE_CONFIG_LAST_UPDATE", 0L);
        String[] list = g.f77454c.f77455a.list();
        boolean z14 = list == null || list.length == 0;
        boolean z15 = (this.f77431c * ((long) 1000)) + j8 < System.currentTimeMillis();
        if (z14 || z15) {
            j().debug("reload config because ".concat(z14 ? "cache does not exist" : "cache is expired"));
            b();
        } else {
            j().debug("reload: ignoring, remote config cache is still fresh");
            k();
        }
    }

    public final Logger j() {
        return (Logger) this.f77432d.getValue();
    }

    public final void k() {
        a();
        setChanged();
        notifyObservers();
        this.f77437i = null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgh2/c$a;", "", "<init>", "()V", "", "REMOTE_CONFIG_PREFERENCES", "Ljava/lang/String;", "PREF_KEY_REMOTE_CONFIG_LAST_UPDATE", "", "DEFAULT_CACHE_EXPIRATION", "J", "util_runtimeconfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(Context context, int i14, String str, k kVar, long j8, List list, p005kotlin.jvm.internal.j jVar) {
        this(context, i14, str, kVar, j8, list);
    }
}
