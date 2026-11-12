package au0;

import am.x0;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.c2;
import o53.s0;
import of2.y0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.z1;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lau0/z;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lof2/c0;", "liveActivityManager", "Lfg2/z;", "subscriptionStatusProvider", "Lfg2/c;", "deviceProvider", "Lr22/z1;", "themeDelegate", "Lau0/s;", "notificationsDelegate", "Lau0/x;", "preferences", "<init>", "(Landroid/content/Context;Lof2/c0;Lfg2/z;Lfg2/c;Lr22/z1;Lau0/s;Lau0/x;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f13001t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of2.c0 f13003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg2.z f13004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg2.c f13005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1 f13006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f13007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f13008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bh2.d f13009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f13010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f13011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f13012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f13013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f13014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f13015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f13016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f13017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b2 f13018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x0 f13019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c2 f13020s;

    static {
        new a(null);
    }

    public z(Context context, of2.c0 c0Var, fg2.z zVar, fg2.c cVar, z1 z1Var, s sVar, x xVar) {
        context.getClass();
        c0Var.getClass();
        zVar.getClass();
        cVar.getClass();
        z1Var.getClass();
        sVar.getClass();
        xVar.getClass();
        this.f13002a = context;
        this.f13003b = c0Var;
        this.f13004c = zVar;
        this.f13005d = cVar;
        this.f13006e = z1Var;
        this.f13007f = sVar;
        this.f13008g = xVar;
        this.f13009h = (bh2.d) KoinJavaComponent.get$default(bh2.d.class, null, null, 6, null);
        this.f13010i = q2.a(null);
        Boolean bool = Boolean.FALSE;
        this.f13011j = q2.a(bool);
        this.f13012k = c0Var.f131784m;
        p2 p2VarA = q2.a(null);
        this.f13013l = p2VarA;
        this.f13014m = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(null);
        this.f13015n = p2VarA2;
        this.f13016o = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(bool);
        this.f13017p = p2VarA3;
        this.f13018q = r53.s.d(p2VarA3);
        c0 c0Var2 = new c0(this);
        d0 d0Var = new d0(this);
        mf2.e eVar = (mf2.e) KoinJavaComponent.get$default(mf2.e.class, null, null, 6, null);
        y0 y0Var = (y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null);
        y0Var.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.a("LSVSessionManager", "registerManager");
        c0Var.f131782k = c0Var2;
        c0Var.f131779h = d0Var;
        c0Var.f131780i = d0Var.a();
        if (eVar != null) {
            c0Var.f131772a.c(eVar);
        }
        c0Var.f131783l = y0Var;
        ge1.b.T(o53.c0.a(s0.f129406a), null, null, new e0(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f12907c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f12907c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj = f0Var.f12905a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f12907c;
        if (i15 == 0) {
            o13.r.b(obj);
            f0Var.f12907c = 1;
            Object objL = this.f13003b.l(f0Var);
            return objL == aVar ? aVar : objL;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            return ((o13.q) obj).f128597a;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j8, yf2.a aVar, v13.c cVar) {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f12914d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f12914d = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object obj = g0Var.f12912b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f12914d;
        if (i15 == 0) {
            o13.r.b(obj);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "LiveActivityRepositoryWrapper", "valueEstimationComplete for deviceUnitId: " + j8 + ", valueEstimationType: " + aVar);
            g0Var.f12911a = aVar;
            g0Var.f12914d = 1;
            if (this.f13003b.s(j8, aVar, g0Var) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = g0Var.f12911a;
            o13.r.b(obj);
        }
        if (aVar == yf2.a.VO2_MAX) {
            this.f13017p.k(null, Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau0/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
