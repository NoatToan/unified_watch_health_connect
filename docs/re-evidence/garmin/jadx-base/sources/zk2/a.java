package zk2;

import bl2.o;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import cz2.p;
import e23.l;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import ok2.g0;
import ok2.z;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import pk2.c0;
import pk2.x;
import pk2.y;
import yr.o0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lzk2/a;", "Lbl2/b$b;", "Lok2/z;", "Lok2/b;", "helper", "batch", "Lrs2/c;", "device", "Lo53/b0;", "coroutineScope", "", "logDebug", "Lkotlin/Function0;", "Lpk2/c0;", "adHocAgentFunc", "<init>", "(Lok2/b;Lok2/z;Lrs2/c;Lo53/b0;ZLe23/a;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements bl2.b.InterfaceC0272b, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ok2.b f205097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f205098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rs2.c f205099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f205100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f205101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.a<c0> f205102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f205103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o.a f205104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f205105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<bl2.b> f205106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference<String> f205107k;

    /* JADX WARN: Multi-variable type inference failed */
    public a(ok2.b bVar, z zVar, rs2.c cVar, b0 b0Var, boolean z14, e23.a<? extends c0> aVar) {
        bVar.getClass();
        zVar.getClass();
        cVar.getClass();
        b0Var.getClass();
        aVar.getClass();
        this.f205097a = bVar;
        this.f205098b = zVar;
        this.f205099c = cVar;
        this.f205100d = b0Var;
        this.f205101e = z14;
        this.f205102f = aVar;
        Logger logger = LoggerFactory.getLogger("CFT#AdHocQueue@" + cVar.getF172493a());
        logger.getClass();
        this.f205103g = logger;
        this.f205104h = new o.a(cVar, this, logger, "notifyFileEventAdHoc");
        this.f205105i = new p();
        this.f205106j = new AtomicReference<>(null);
        this.f205107k = new AtomicReference<>(null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x011e A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:37:0x00ee, B:39:0x00fc, B:41:0x0100, B:43:0x0104, B:45:0x010c, B:47:0x0110, B:49:0x0116, B:51:0x011a, B:52:0x011e), top: B:137:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141 A[Catch: all -> 0x017b, TryCatch #1 {all -> 0x017b, blocks: (B:56:0x0133, B:58:0x0141, B:61:0x0148, B:69:0x015c, B:71:0x0162, B:74:0x0167, B:63:0x014e, B:65:0x0154, B:68:0x015a), top: B:138:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e A[Catch: all -> 0x017b, TryCatch #1 {all -> 0x017b, blocks: (B:56:0x0133, B:58:0x0141, B:61:0x0148, B:69:0x015c, B:71:0x0162, B:74:0x0167, B:63:0x014e, B:65:0x0154, B:68:0x015a), top: B:138:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0154 A[Catch: all -> 0x017b, TryCatch #1 {all -> 0x017b, blocks: (B:56:0x0133, B:58:0x0141, B:61:0x0148, B:69:0x015c, B:71:0x0162, B:74:0x0167, B:63:0x014e, B:65:0x0154, B:68:0x015a), top: B:138:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x015a A[Catch: all -> 0x017b, TryCatch #1 {all -> 0x017b, blocks: (B:56:0x0133, B:58:0x0141, B:61:0x0148, B:69:0x015c, B:71:0x0162, B:74:0x0167, B:63:0x014e, B:65:0x0154, B:68:0x015a), top: B:138:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0173  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d1 A[DONT_INVERT] */
    public static final Object d(a aVar, wk2.i iVar, l lVar, v13.c cVar) {
        c cVar2;
        C3829a c3829a;
        a aVar2;
        l lVar2;
        a aVar3;
        wk2.i iVar2;
        wk2.i iVar3;
        CoreTransferException coreTransferException;
        x f205158h;
        ok2.e failure;
        x f205158h2;
        CoreTransferException coreTransferException2;
        wk2.f f205152b;
        c0 c0VarInvoke;
        boolean zL;
        String strN;
        x f205158h3;
        y yVar;
        x f205158h4;
        y yVar2;
        Logger logger = aVar.f205103g;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f205125f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f205125f = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(aVar, cVar);
            }
        } else {
            cVar2 = new c(aVar, cVar);
        }
        c cVar3 = cVar2;
        Object obj = cVar3.f205123d;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f205125f;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(obj);
            if (aVar.g() && aVar.f205107k.get() == null) {
                logger.info("Ad Hoc " + iVar.getDirection().f185854a + " started directly for " + iVar.getId());
                try {
                    bl2.b.a aVar5 = bl2.b.f18599l;
                    ok2.b bVar = aVar.f205097a;
                    b0 b0Var = aVar.f205100d;
                    rs2.c cVar4 = aVar.f205099c;
                    o.a aVar6 = aVar.f205104h;
                    aVar5.getClass();
                    bl2.b bVarA = bl2.b.a.a(bVar, b0Var, cVar4, iVar, aVar, aVar6);
                    wk2.i iVar4 = bVarA.f18603d;
                    aVar.f205106j.set(bVarA);
                    if (aVar.f205101e) {
                        logger.debug("activeAdHoc=" + iVar4.getId() + ", " + iVar4.getF205155e());
                    }
                    cVar3.f205120a = aVar;
                    cVar3.f205121b = iVar;
                    cVar3.f205122c = lVar;
                    cVar3.f205125f = 1;
                    Object objP = bVarA.l(new bl2.h(null), new bl2.i(null), new b4.b(21)).P(cVar3);
                    if (objP != aVar4) {
                        objP = Unit.INSTANCE;
                    }
                    if (objP == aVar4) {
                        return aVar4;
                    }
                    aVar2 = aVar;
                    iVar3 = iVar;
                    lVar2 = lVar;
                    C3829a.f205108d.getClass();
                    iVar3.getClass();
                    f205158h4 = iVar3.getF205158h();
                    if (f205158h4 == null) {
                        c3829a = new C3829a(iVar3, null, null);
                    } else {
                        c3829a = new C3829a(iVar3, null, null);
                    }
                    aVar2.f205106j.set(null);
                    if (aVar2.f205101e) {
                        aVar2.f205103g.debug("activeAdHoc=null");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    aVar3 = aVar;
                    iVar2 = iVar;
                    lVar2 = lVar;
                    C3829a.f205108d.getClass();
                    iVar2.getClass();
                    if (th instanceof CoreTransferException) {
                        coreTransferException = th;
                    } else {
                        coreTransferException = null;
                    }
                    if (coreTransferException != null) {
                        f205158h = iVar2.getF205158h();
                        if (f205158h != null) {
                            failure = f205158h.f138498c;
                        } else {
                            failure = null;
                        }
                        if (failure == null) {
                            failure = ok2.e.f132645m;
                        }
                    } else {
                        f205158h = iVar2.getF205158h();
                        if (f205158h != null) {
                            failure = f205158h.f138498c;
                        } else {
                            failure = null;
                        }
                        if (failure == null) {
                            failure = ok2.e.f132645m;
                        }
                    }
                    f205158h2 = iVar2.getF205158h();
                    if (f205158h2 != null) {
                        th = coreTransferException2;
                    }
                    C3829a c3829a2 = new C3829a(iVar2, failure, th);
                    aVar3.f205106j.set(null);
                    if (aVar3.f205101e) {
                        aVar3.f205103g.debug("activeAdHoc=null");
                    }
                    c3829a = c3829a2;
                    aVar2 = aVar3;
                }
            } else {
                C3829a.f205108d.getClass();
                iVar.getClass();
                c3829a = new C3829a(iVar, ok2.e.f132641i, null);
                aVar2 = aVar;
                lVar2 = lVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar2 = cVar3.f205122c;
            iVar3 = cVar3.f205121b;
            aVar2 = cVar3.f205120a;
            try {
                r.b(obj);
                C3829a.f205108d.getClass();
                iVar3.getClass();
                f205158h4 = iVar3.getF205158h();
                if (f205158h4 == null && (yVar2 = f205158h4.f138496a) != null && yVar2.f138508a) {
                    x f205158h5 = iVar3.getF205158h();
                    ok2.e eVar = f205158h5 != null ? f205158h5.f138498c : null;
                    x f205158h6 = iVar3.getF205158h();
                    c3829a = new C3829a(iVar3, eVar, f205158h6 != null ? f205158h6.f138497b : null);
                } else {
                    c3829a = new C3829a(iVar3, null, null);
                }
                aVar2.f205106j.set(null);
                if (aVar2.f205101e) {
                    aVar2.f205103g.debug("activeAdHoc=null");
                }
            } catch (Throwable th4) {
                th = th4;
                aVar3 = aVar2;
                iVar2 = iVar3;
                try {
                    C3829a.f205108d.getClass();
                    iVar2.getClass();
                    if (th instanceof CoreTransferException) {
                        coreTransferException = th;
                    } else {
                        coreTransferException = null;
                    }
                    if (coreTransferException != null || (failure = coreTransferException.getFailure()) == null) {
                        f205158h = iVar2.getF205158h();
                        if (f205158h != null) {
                            failure = f205158h.f138498c;
                        } else {
                            failure = null;
                        }
                        if (failure == null) {
                            failure = ok2.e.f132645m;
                        }
                    }
                    f205158h2 = iVar2.getF205158h();
                    if (f205158h2 != null && (coreTransferException2 = f205158h2.f138497b) != null) {
                        th = coreTransferException2;
                    }
                    C3829a c3829a3 = new C3829a(iVar2, failure, th);
                    aVar3.f205106j.set(null);
                    if (aVar3.f205101e) {
                        aVar3.f205103g.debug("activeAdHoc=null");
                    }
                    c3829a = c3829a3;
                    aVar2 = aVar3;
                } catch (Throwable th5) {
                    aVar3.f205106j.set(null);
                    if (aVar3.f205101e) {
                        aVar3.f205103g.debug("activeAdHoc=null");
                    }
                    throw th5;
                }
            }
        }
        rs2.c cVar5 = aVar2.f205099c;
        e23.a<c0> aVar7 = aVar2.f205102f;
        Logger logger2 = aVar2.f205103g;
        if (aVar2.f205101e) {
            logger2.debug(String.valueOf(c3829a));
        }
        if (c3829a.f205110b != null) {
            wk2.i iVar5 = c3829a.f205109a;
            Throwable th6 = c3829a.f205111c;
            if (th6 == null) {
                wk2.f f205152b2 = iVar5.getF205152b();
                c0 c0VarInvoke2 = aVar7.invoke();
                if (c0VarInvoke2 != null ? cl2.c.l(c0VarInvoke2, cVar5, f205152b2) : false) {
                    strN = "unable to start new item";
                } else {
                    if (th6 == null) {
                        strN = "no longer relevant to agent";
                    } else {
                        f205152b = iVar5.getF205152b();
                        c0VarInvoke = aVar7.invoke();
                        if (c0VarInvoke != null) {
                            zL = cl2.c.l(c0VarInvoke, cVar5, f205152b);
                        } else {
                            zL = false;
                        }
                        if (zL || !((f205158h3 = iVar5.getF205158h()) == null || (yVar = f205158h3.f138496a) == null || yVar.f138508a || aVar2.f205098b.c() != null)) {
                            strN = fb1.c.n("task failed and agent disabled retry: ", th6.getMessage());
                        } else {
                            strN = fb1.c.n("task failed: ", th6.getMessage());
                        }
                    }
                    z14 = false;
                }
            } else {
                if (th6 == null) {
                    strN = "no longer relevant to agent";
                } else {
                    f205152b = iVar5.getF205152b();
                    c0VarInvoke = aVar7.invoke();
                    if (c0VarInvoke != null) {
                        zL = cl2.c.l(c0VarInvoke, cVar5, f205152b);
                    } else {
                        zL = false;
                    }
                    if (zL) {
                    }
                    strN = fb1.c.n("task failed and agent disabled retry: ", th6.getMessage());
                }
                z14 = false;
            }
            String str = "AdHocRetry=" + z14 + StringUtils.SPACE + iVar5.getId() + ": " + strN;
            logger2.getClass();
            if (z14) {
                logger2.debug(str);
            } else {
                logger2.warn(str);
            }
            if ((th6 instanceof CancellationException) || ((th6 instanceof CoreTransferException) && ((CoreTransferException) th6).getFailure().a())) {
                AtomicReference<String> atomicReference = aVar2.f205107k;
                while (!atomicReference.compareAndSet(null, "runTransfer") && atomicReference.get() == null) {
                }
            }
            if (z14) {
                lVar2.invoke(iVar5);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // ok2.z
    public final g0 c() {
        wk2.i iVar;
        bl2.b bVar = this.f205106j.get();
        if (bVar == null || (iVar = bVar.f18603d) == null) {
            return null;
        }
        return iVar.getF205155e();
    }

    public final bl2.b e(g0 g0Var, x xVar) {
        xVar.getClass();
        ok2.e eVar = xVar.f138498c;
        bl2.b bVar = this.f205106j.get();
        if (bVar != null) {
            wk2.i iVar = bVar.f18603d;
            this.f205107k.set("interruptCurrentItem");
            Logger logger = this.f205103g;
            if (g0Var != null && g0Var.a() < iVar.getF205155e().a()) {
                logger.debug("wait for higher priority Ad Hoc item " + iVar.getId());
                return bVar;
            }
            j(iVar, xVar);
            bVar.m(true, eVar);
            logger.debug("cancel active Ad Hoc item " + iVar.getId() + StringUtils.SPACE + eVar);
        }
        return bVar;
    }

    public final boolean g() {
        return this.f205097a.c(this.f205099c.getF172493a()) != null && this.f205098b.c() == null;
    }

    @Override // bl2.b.InterfaceC0272b
    public final boolean h(int i14, UUID uuid) {
        return false;
    }

    @Override // bl2.b.InterfaceC0272b
    public final Unit j(wk2.i iVar, x xVar) {
        iVar.getClass();
        xVar.getClass();
        k kVar = iVar instanceof k ? (k) iVar : null;
        if (kVar == null) {
            return null;
        }
        kVar.k(xVar);
        return Unit.INSTANCE;
    }

    @Override // bl2.b.InterfaceC0272b
    public final Integer o(wk2.i iVar) {
        iVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: zk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzk2/a$a;", "", "Lwk2/i;", "item", "Lok2/e;", "failure", "", "ex", "<init>", "(Lwk2/i;Lok2/e;Ljava/lang/Throwable;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C3829a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C3830a f205108d = new C3830a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wk2.i f205109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ok2.e f205110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f205111c;

        public C3829a(wk2.i iVar, ok2.e eVar, Throwable th3) {
            iVar.getClass();
            this.f205109a = iVar;
            this.f205110b = eVar;
            this.f205111c = th3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3829a)) {
                return false;
            }
            C3829a c3829a = (C3829a) obj;
            return this.f205109a.equals(c3829a.f205109a) && this.f205110b == c3829a.f205110b && s.g(this.f205111c, c3829a.f205111c);
        }

        public final int hashCode() {
            int iHashCode = this.f205109a.hashCode() * 31;
            ok2.e eVar = this.f205110b;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            Throwable th3 = this.f205111c;
            return iHashCode2 + (th3 != null ? th3.hashCode() : 0);
        }

        public final String toString() {
            Object obj = this.f205110b;
            if (obj == null) {
                obj = "none";
            }
            Throwable th3 = this.f205111c;
            return "failure=" + obj + ", ex=" + (th3 != null ? th3.getMessage() : null);
        }

        /* JADX INFO: renamed from: zk2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk2/a$a$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C3830a {
            public /* synthetic */ C3830a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3830a() {
            }
        }
    }

    public /* synthetic */ a(ok2.b bVar, z zVar, rs2.c cVar, b0 b0Var, boolean z14, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, zVar, cVar, b0Var, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? new o0(bVar, 20) : aVar);
    }
}
