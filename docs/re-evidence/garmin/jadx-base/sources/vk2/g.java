package vk2;

import al2.l;
import al2.n;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o13.r;
import o53.e2;
import o53.j2;
import o53.s;
import o53.s0;
import ok2.a0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\fB=\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lvk2/g;", "Lal2/e;", "", "connectionId", "Lok2/a0;", "transferHelper", HeaderParameterNames.AUTHENTICATION_TAG, "", "startTimeout", "refreshConnectionDelayMillis", "<init>", "(Ljava/lang/String;Lok2/a0;Ljava/lang/String;JJ)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements al2.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f178671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f178672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f178673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u53.d f178674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f178675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f178676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet<String> f178677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap<String, al2.c> f178678j;

    static {
        new a(null);
    }

    public g(String str, a0 a0Var, String str2, long j8, long j14) {
        a0Var.getClass();
        str2.getClass();
        this.f178670b = str;
        this.f178671c = a0Var;
        this.f178672d = j8;
        this.f178673e = j14;
        e2 e2VarH = ge1.b.h();
        x53.c cVar = s0.f129406a;
        this.f178674f = zl.a.e("SyncStartListener", t13.g.a.C3052a.d(x53.b.f189152a, e2VarH));
        Logger logger = LoggerFactory.getLogger("CFT#" + str2 + "Start" + (str != null ? "@".concat(str) : ""));
        logger.getClass();
        this.f178675g = logger;
        this.f178676h = gl.b.b();
        this.f178677i = new CopyOnWriteArraySet<>();
        this.f178678j = new ConcurrentHashMap<>();
    }

    @Override // al2.m
    public final void B(n nVar) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) throws Throwable {
        h hVar;
        g gVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f178682d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f178682d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objB = hVar.f178680b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f178682d;
        if (i15 == 0) {
            r.b(objB);
            try {
                long j8 = this.f178672d;
                i iVar = new i(this, null);
                hVar.f178679a = this;
                hVar.f178682d = 1;
                objB = j2.b(j8, iVar, hVar);
                if (objB == aVar) {
                    return aVar;
                }
                gVar = this;
            } catch (Exception e4) {
                e = e4;
                gVar = this;
                gVar.f178676h.O(e);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                gVar = this;
                gVar.f178671c.j(gVar);
                throw th;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = hVar.f178679a;
            try {
                try {
                    r.b(objB);
                } catch (Exception e14) {
                    e = e14;
                    gVar.f178676h.O(e);
                    throw e;
                }
            } catch (Throwable th4) {
                th = th4;
                gVar.f178671c.j(gVar);
                throw th;
            }
        }
        rs2.c cVar2 = (rs2.c) objB;
        gVar.f178671c.j(gVar);
        return cVar2;
    }

    public final void b(al2.c cVar) {
        a0 a0Var = this.f178671c;
        boolean zI = cl2.c.i(cVar, a0Var);
        rs2.c cVar2 = cVar.f3775a;
        s sVar = this.f178676h;
        if (zI) {
            sVar.g0(cVar2);
            a0Var.j(this);
            return;
        }
        al2.b bVar = cVar.f3777c;
        al2.b bVar2 = al2.b.NO_ITEMS;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = this.f178677i;
        if (bVar == bVar2) {
            copyOnWriteArraySet.remove(cVar2.getF172493a());
        } else if (bVar == al2.b.REJECTED) {
            CoreTransferException coreTransferException = cVar.f3778d;
            if ((coreTransferException != null ? coreTransferException.getFailure() : null) == ok2.e.f132635c) {
                String f172493a = cVar2.getF172493a();
                f172493a.getClass();
                ge1.b.T(this.f178674f, null, null, new j(this, f172493a, null), 3);
            }
        }
        if (copyOnWriteArraySet.isEmpty()) {
            sVar.g0(null);
            a0Var.j(this);
        }
    }

    @Override // al2.e
    public final void s(al2.a aVar) {
    }

    @Override // al2.m
    public final void u(l lVar) {
        lVar.getClass();
    }

    @Override // al2.e
    public final void y(al2.c cVar) {
        rs2.c cVar2 = cVar.f3775a;
        if (cVar.f3782h) {
            return;
        }
        String str = this.f178670b;
        if (str == null || str.equals(cVar2.getF172493a())) {
            if (this.f178677i.contains(cVar2.getF172493a()) && this.f178678j.get(cVar2.getF172493a()) != null) {
                this.f178675g.debug("onStatusChange: " + cVar.f3777c + ", " + cVar.f3778d);
            }
            b(cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvk2/g$a;", "", "<init>", "()V", "", "REFRESH_CONNECTION_DELAY_MILLIS", "J", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public g() {
        this(null, null, null, 0L, 0L, 31, null);
    }

    public /* synthetic */ g(String str, a0 a0Var, String str2, long j8, long j14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? a0.f132585h.a() : a0Var, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? 120000L : j8, (i14 & 16) != 0 ? 5000L : j14);
    }
}
