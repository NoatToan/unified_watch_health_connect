package lm2;

import bd0.c0;
import bd0.d0;
import bd0.e0;
import hk0.o;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llm2/h;", "", "<init>", "()V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f113618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f113619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c0 f113620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d0 f113621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static o f113622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static e0 f113623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static yb2.b.a f113624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static vm2.d f113625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static am2.a f113626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f113627j;

    static {
        new h();
        f113618a = LoggerFactory.getLogger("PAIR#PairingInitializer");
        f113627j = new Object();
    }

    private h() {
    }

    public static final void a() {
        synchronized (f113627j) {
            try {
                if (f113626i != null) {
                    f113618a.debug("Disabling Connectivity Analytics");
                    d0 d0Var = f113621d;
                    if (d0Var == null) {
                        s.m("adapter");
                        throw null;
                    }
                    am2.a aVar = f113626i;
                    aVar.getClass();
                    d0Var.m(aVar);
                    f113626i = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static final void b(boolean z14) {
        synchronized (f113627j) {
            try {
                am2.a aVar = f113626i;
                if (aVar == null) {
                    f113618a.debug("Enabling Connectivity Analytics with BleOnly: " + z14 + " ExcludeTimeouts: true");
                    am2.a aVar2 = new am2.a(z14, true);
                    f113626i = aVar2;
                    d0 d0Var = f113621d;
                    if (d0Var == null) {
                        s.m("adapter");
                        throw null;
                    }
                    d0Var.a(aVar2);
                } else if (aVar.f4408a != z14 || !aVar.f4409b) {
                    f113618a.debug("Re-Enabling Connectivity Analytics since configuration values don't match");
                    a();
                    b(z14);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static final g c() {
        d0 d0Var = f113621d;
        if (d0Var != null) {
            return d0Var;
        }
        s.m("adapter");
        throw null;
    }

    public static final e d() {
        c0 c0Var = f113620c;
        if (c0Var != null) {
            return c0Var;
        }
        s.m("dataCallback");
        throw null;
    }

    public static final f e() {
        o oVar = f113622e;
        if (oVar != null) {
            return oVar;
        }
        s.m("databaseDelegate");
        throw null;
    }

    public static final i f() {
        e0 e0Var = f113623f;
        if (e0Var != null) {
            return e0Var;
        }
        s.m("serverDelegate");
        throw null;
    }
}
