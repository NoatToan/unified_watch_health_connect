package qk2;

import al2.f;
import al2.n;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.device.filetransfer.adhoc.AdHocCancelException;
import com.garmin.device.filetransfer.adhoc.AdHocDeviceDisconnectException;
import com.garmin.device.filetransfer.adhoc.AdHocException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import e23.l;
import i3.e5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.u0;
import o13.p;
import ok2.g0;
import ok2.h0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p40.o0;
import pk2.d0;
import pk2.x;
import pk2.y;
import wk2.i;
import wk2.m;
import zk2.k;
import zy2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0012\u0013BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lqk2/b;", "Lmk2/d;", "Lrs2/c;", "device", "Lpk2/d0;", "agent", "Lkotlin/Function0;", "Lok2/g0;", "isSyncInProgress", "Lzy2/e;", "clock", "", "bufferSize", "Lkotlin/Function1;", "", "dispatch", "<init>", "(Lrs2/c;Lpk2/d0;Le23/a;Lzy2/e;ILe23/l;)V", "c", "b", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements mk2.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f145178k = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f145179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f145180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<g0> f145181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f145182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f145183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<e23.a<Unit>, Unit> f145184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f145185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f145186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f145187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap<UUID, C2737b> f145188j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends q implements l<e23.a<? extends Unit>, Unit> {
        public a(Object obj) {
            super(1, obj, f.a.class, "dispatchToMain", "dispatchToMain(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(e23.a<? extends Unit> aVar) {
            e23.a<? extends Unit> aVar2 = aVar;
            aVar2.getClass();
            ((f.a) this.receiver).getClass();
            f.a.a(aVar2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145196a;

        static {
            int[] iArr = new int[ok2.e.values().length];
            try {
                iArr[ok2.e.f132635c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ok2.e.f132636d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ok2.e.E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f145196a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(rs2.c cVar, d0 d0Var, e23.a<? extends g0> aVar, e eVar, int i14, l<? super e23.a<Unit>, Unit> lVar) {
        cVar.getClass();
        d0Var.getClass();
        aVar.getClass();
        eVar.getClass();
        lVar.getClass();
        this.f145179a = cVar;
        this.f145180b = d0Var;
        this.f145181c = aVar;
        this.f145182d = eVar;
        this.f145183e = i14;
        this.f145184f = lVar;
        Logger logger = LoggerFactory.getLogger("CFT#AdHocService@" + cVar.getF92741e());
        logger.getClass();
        this.f145185g = logger;
        this.f145186h = cVar.getF92741e();
        this.f145187i = new Object();
        this.f145188j = new LinkedHashMap<>();
        logger.debug("service created");
    }

    public static final AdHocException b(b bVar, CoreTransferException coreTransferException, String str) {
        ok2.e failure;
        bVar.getClass();
        String strG = e5.g(str, ": ", (coreTransferException == null || (failure = coreTransferException.getFailure()) == null) ? null : failure.name());
        ok2.e failure2 = coreTransferException != null ? coreTransferException.getFailure() : null;
        int i14 = failure2 == null ? -1 : d.f145196a[failure2.ordinal()];
        if (i14 == 1 || i14 == 2) {
            return new AdHocDeviceDisconnectException(strG, coreTransferException);
        }
        return i14 != 3 ? new AdHocException(strG, coreTransferException) : new AdHocCancelException(strG, coreTransferException);
    }

    @Override // mk2.d
    public final UUID a(byte[] bArr, mk2.b bVar, zj2.d dVar) throws Throwable {
        Throwable th3;
        C2737b c2737b;
        mk2.b bVar2;
        b bVar3;
        bArr.getClass();
        synchronized (this.f145187i) {
            try {
                wk2.e.f185839a.getClass();
                wk2.c cVar = new wk2.c(new wd.c(bArr, 5));
                C2737b c2737bC = c(bVar);
                if (c2737bC != null) {
                    try {
                        c2737bC.f145192e.addIfAbsent(dVar);
                        c2737b = c2737bC;
                        bVar2 = bVar;
                        bVar3 = this;
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                } else {
                    bVar2 = bVar;
                    try {
                        c2737b = new C2737b(this, dVar, bVar2, null, 4, null);
                        bVar3 = this;
                    } catch (Throwable th5) {
                        th = th5;
                        th3 = th;
                        throw th3;
                    }
                }
                try {
                    Map mapB = t0.b(new p("AD_HOC_LATENCY_PROPERTY_KEY", bVar2.f119192c.name()));
                    wk2.f.a aVar = wk2.f.f185841i;
                    UUID uuid = bVar2.f119190a;
                    String str = bVar2.f119193d;
                    String str2 = bVar2.f119191b != null ? "AD_HOC_XFER" : "AD_HOC_";
                    if (str.length() > 0) {
                        str2 = str2 + "_" + str;
                    }
                    long f61810d = cVar.getF126459l();
                    aVar.getClass();
                    k kVarB = i.a.b(i.f185855a, wk2.f.a.a(uuid, str2, f61810d, mapB), cVar, h0.a(bVar2.f119192c, bVar3.f145181c.invoke()), m.f185863c, bVar3.f145182d, c2737b, null, SyslogConstants.LOG_LOCAL4);
                    LinkedHashMap<UUID, C2737b> linkedHashMap = bVar3.f145188j;
                    UUID uuid2 = kVarB.f205152b.f185842a;
                    al2.m mVar = kVarB.f205159i;
                    mVar.getClass();
                    linkedHashMap.put(uuid2, (C2737b) mVar);
                    bVar3.f145180b.a(bVar3.f145186h, kVarB);
                    return kVarB.f205152b.f185842a;
                } catch (Throwable th6) {
                    th = th6;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    public final C2737b c(mk2.b bVar) {
        C2737b c2737b;
        synchronized (this.f145187i) {
            try {
                C2737b c2737b2 = this.f145188j.get(bVar.f119190a);
                Long l14 = bVar.f119191b;
                if (l14 != null) {
                    if (c2737b2 != null && !s.g(c2737b2.f145189b.f119191b, l14)) {
                        throw new IllegalArgumentException("Duplicate request with different xferId");
                    }
                    LinkedHashMap<UUID, C2737b> linkedHashMap = this.f145188j;
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry<UUID, C2737b> entry : linkedHashMap.entrySet()) {
                            if (!s.g(entry.getKey(), bVar.f119190a) && s.g(entry.getValue().f145189b.f119191b, bVar.f119191b) && entry.getValue().f145190c == null) {
                                throw new IllegalArgumentException("Existing xferId already queued with different fileId");
                            }
                        }
                    }
                }
                c2737b = this.f145188j.get(bVar.f119190a);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c2737b;
    }

    public final boolean d(UUID uuid, CoreTransferException coreTransferException) {
        C2737b c2737b;
        uuid.getClass();
        coreTransferException.getClass();
        synchronized (this.f145187i) {
            c2737b = this.f145188j.get(uuid);
        }
        if (c2737b == null) {
            return true;
        }
        c cVar = f145178k;
        mk2.b bVar = c2737b.f145189b;
        cVar.getClass();
        bVar.getClass();
        if (bVar.f119191b != null) {
            int i14 = c.a.f145195a[coreTransferException.getFailure().ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                return true;
            }
            if (i14 != 4 && !coreTransferException.getFailure().a()) {
                return true;
            }
        }
        return false;
    }

    public final void e(UUID uuid, dz2.b bVar) {
        uuid.getClass();
        bVar.getClass();
        synchronized (this.f145187i) {
            C2737b c2737b = this.f145188j.get(uuid);
            if (c2737b == null) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            dz2.a aVar = c2737b.f145190c;
            b bVar2 = c2737b.f145193f;
            if (aVar != null) {
                while (bVar.d()) {
                    aVar.write(bVar.e(bVar2.f145183e));
                }
            } else {
                bVar2.f145185g.error("writeToDataSink but no dataSink found");
            }
            c2737b.a(uuid, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqk2/b$c;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f145195a;

            static {
                int[] iArr = new int[ok2.e.values().length];
                try {
                    iArr[ok2.e.f132640h.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ok2.e.f132635c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ok2.e.f132636d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ok2.e.f132641i.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f145195a = iArr;
            }
        }

        public /* synthetic */ c(j jVar) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: qk2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqk2/b$b;", "Lal2/m;", "Lmk2/c;", "adHocListener", "Lmk2/b;", "options", "Ldz2/a;", "dataSink", "<init>", "(Lqk2/b;Lmk2/c;Lmk2/b;Ldz2/a;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class C2737b implements al2.m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mk2.b f145189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dz2.a f145190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f145191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CopyOnWriteArrayList<mk2.c> f145192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f145193f;

        /* JADX INFO: renamed from: qk2.b$b$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f145194a;

            static {
                int[] iArr = new int[y.values().length];
                try {
                    iArr[y.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.TREAT_AS_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[y.NO_RETRY_FAILURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[y.FILE_TYPE_BLOCKING_FAILURE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[y.NON_BLOCKING_FAILURE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f145194a = iArr;
            }
        }

        public C2737b(b bVar, mk2.c cVar, mk2.b bVar2, dz2.a aVar) {
            bVar2.getClass();
            this.f145193f = bVar;
            this.f145189b = bVar2;
            this.f145190c = aVar;
            this.f145191d = new AtomicBoolean(false);
            CopyOnWriteArrayList<mk2.c> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f145192e = copyOnWriteArrayList;
            if (cVar != null) {
                copyOnWriteArrayList.add(cVar);
            }
        }

        @Override // al2.m
        public final void B(n nVar) {
            Iterator<mk2.c> it = this.f145192e.iterator();
            while (it.hasNext()) {
                this.f145193f.f145184f.invoke(new o0(27, it.next(), nVar));
            }
        }

        public final void a(UUID uuid, AdHocException adHocException) {
            b bVar = this.f145193f;
            uuid.getClass();
            if (this.f145191d.compareAndSet(false, true)) {
                Iterator<mk2.c> it = this.f145192e.iterator();
                while (it.hasNext()) {
                    bVar.f145184f.invoke(new qk2.c(it.next(), adHocException, 1));
                }
            }
            bVar.getClass();
            synchronized (bVar.f145187i) {
                bVar.f145188j.remove(uuid);
            }
        }

        @Override // al2.m
        public final void u(al2.l lVar) {
            boolean z14;
            boolean z15;
            b bVar = this.f145193f;
            CoreTransferException coreTransferException = lVar.f3826h;
            UUID uuid = lVar.f3821c.f185842a;
            if (lVar.f3822d == al2.k.REJECTED && coreTransferException != null && bVar.d(uuid, coreTransferException)) {
                CoreTransferException coreTransferException2 = new CoreTransferException(ok2.e.E, "AdHocService cannot process on re-connect", null, 4, null);
                synchronized (bVar.f145187i) {
                    try {
                        synchronized (bVar.f145187i) {
                            z15 = bVar.f145188j.remove(uuid) != null;
                        }
                        if (z15) {
                            Unit unit = Unit.INSTANCE;
                            bVar.f145180b.c(bVar.f145186h, uuid, coreTransferException2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                a(uuid, b.b(bVar, coreTransferException, "Could not start"));
            }
            x xVar = lVar.f3823e;
            y yVar = xVar != null ? xVar.f138496a : null;
            int i14 = yVar == null ? -1 : a.f145194a[yVar.ordinal()];
            if (i14 != -1) {
                if (i14 == 1 || i14 == 2) {
                    a(uuid, null);
                    return;
                }
                if (i14 == 3) {
                    a(uuid, b.b(bVar, coreTransferException, "Transfer failed"));
                    return;
                }
                if (i14 != 4 && i14 != 5) {
                    u0.r();
                    return;
                }
                if (coreTransferException == null || !bVar.d(uuid, coreTransferException)) {
                    AdHocException adHocExceptionB = b.b(bVar, coreTransferException, "Transfer interrupted");
                    Iterator<mk2.c> it = this.f145192e.iterator();
                    while (it.hasNext()) {
                        bVar.f145184f.invoke(new qk2.c(it.next(), adHocExceptionB, 0));
                    }
                    return;
                }
                AdHocException adHocExceptionB2 = b.b(bVar, coreTransferException, "Transfer failed");
                synchronized (bVar.f145187i) {
                    synchronized (bVar.f145187i) {
                        z14 = bVar.f145188j.remove(uuid) != null;
                    }
                    if (z14) {
                        Unit unit2 = Unit.INSTANCE;
                        bVar.f145180b.c(bVar.f145186h, uuid, coreTransferException);
                    }
                }
                a(uuid, adHocExceptionB2);
            }
        }

        public /* synthetic */ C2737b(b bVar, mk2.c cVar, mk2.b bVar2, dz2.a aVar, int i14, j jVar) {
            this(bVar, cVar, bVar2, (i14 & 4) != 0 ? null : aVar);
        }
    }

    public /* synthetic */ b(rs2.c cVar, d0 d0Var, e23.a aVar, e eVar, int i14, l lVar, int i15, j jVar) {
        this(cVar, d0Var, aVar, (i15 & 8) != 0 ? new zy2.f() : eVar, (i15 & 16) != 0 ? 96000 : i14, (i15 & 32) != 0 ? new a(f.f3791c) : lVar);
    }
}
