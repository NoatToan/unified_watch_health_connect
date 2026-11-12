package vc2;

import android.content.Context;
import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import d53.u;
import d53.w;
import e23.q;
import java.net.URL;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;
import r53.q2;
import r53.u1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lvc2/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "statusUrl", "", "checkStatusAtStartUp", "Lkotlin/Function0;", "Lnd2/b;", "statusUrlDelegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLe23/a;)V", "b", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f177088e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f177089f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f177090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f177091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f177092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f177093d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvc2/b;", "connectivityState", "Lvc2/m;", "serverStatus", "", "<anonymous>", "(Lvc2/b;Lvc2/m;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.lib.networking.connectivity.NetworkConnectivityMonitor$2", f = "NetworkConnectivityMonitor.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements q<vc2.b, m, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ vc2.b f177094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ m f177095b;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(vc2.b bVar, m mVar, t13.d<? super Unit> dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f177094a = bVar;
            aVar.f177095b = mVar;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            int i14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            vc2.b dVar = this.f177094a;
            m mVar = this.f177095b;
            c.f177088e.getClass();
            dVar.getClass();
            mVar.getClass();
            if ((dVar instanceof vc2.b.C3312b) && (i14 = mVar.f177128a) != 0 && i14 != 1 && i14 != 2) {
                dVar = new vc2.b.d(mVar.f177129b, ((vc2.b.C3312b) dVar).f177083b);
            }
            c cVar = c.this;
            if (!s.g(cVar.f177091b.getValue(), dVar)) {
                cVar.f177090a.debug("connection state updated [" + dVar + "]");
                cVar.f177091b.k(null, dVar);
            }
            return Unit.INSTANCE;
        }
    }

    public c(Context context, String str, boolean z14, e23.a<nd2.b> aVar) {
        context.getClass();
        str.getClass();
        Logger logger = LoggerFactory.getLogger("NetworkConnectivityMonitor");
        logger.getClass();
        this.f177090a = logger;
        this.f177091b = q2.a(null);
        u53.d dVarA = c0.a(t13.g.a.C3052a.d(s0.f129406a, ge1.b.h()));
        this.f177092c = dVarA;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        g gVar = new g(applicationContext);
        if (aVar == null) {
            if (!w.J(str) && (u.y(str, "http://", true) || u.y(str, "https://", true))) {
                try {
                    new URL(str);
                } catch (Throwable unused) {
                }
            }
            kg.f.n(am.j.m("NetworkConnectivityMonitor initialized with an invalid HTTP statusURL [", str, "]"));
            throw null;
        }
        i iVar = new i(dVarA, z14, aVar == null ? new a90.c(str, 15) : aVar);
        this.f177093d = iVar;
        r53.s.C(new u1(r53.s.f(new f(gVar, null)), iVar.f177114c, new a(null)), dVarA);
    }

    public final void a(int i14) {
        i iVar = this.f177093d;
        synchronized (iVar) {
            if (((m) iVar.f177114c.getValue()).f177128a != 1 || i14 == 104 || i14 == 500 || i14 == 501 || i14 == 502 || i14 == 503 || i14 == 504) {
                if (iVar.f177115d < 0 || SystemClock.elapsedRealtime() - iVar.f177115d >= AbstractComponentTracker.LINGERING_TIMEOUT) {
                    if (iVar.f177116e.getAndSet(true)) {
                        return;
                    }
                    b0 b0Var = iVar.f177112a;
                    x53.c cVar = s0.f129406a;
                    ge1.b.T(b0Var, x53.b.f189152a, null, new j(iVar, null), 2);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvc2/c$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DEFAULT_STATUS_URL", "Lvc2/c;", "defaultNetworkMonitor", "Lvc2/c;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ c(Context context, String str, boolean z14, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? "https://garmin.com/" : str, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? null : aVar);
    }
}
