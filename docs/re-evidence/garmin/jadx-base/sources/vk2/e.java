package vk2;

import al2.n;
import com.nimbusds.jose.HeaderParameterNames;
import e23.l;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import ok2.a0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011BU\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lvk2/e;", "Lal2/e;", "", "connectionId", "Lok2/a0;", "transferHelper", "Lzy2/e;", "clock", HeaderParameterNames.AUTHENTICATION_TAG, "Lkotlin/Function1;", "Lal2/a;", "", "progressNotify", "", "syncEndTimeout", "<init>", "(Ljava/lang/String;Lok2/a0;Lzy2/e;Ljava/lang/String;Le23/l;J)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements al2.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicReference<String> f178658i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f178660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zy2.e f178661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<al2.a, Unit> f178662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f178663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f178664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap<String, Long> f178665h;

    static {
        new a(null);
        f178658i = new AtomicReference<>(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, a0 a0Var, zy2.e eVar, String str2, l<? super al2.a, Unit> lVar, long j8) {
        a0Var.getClass();
        eVar.getClass();
        str2.getClass();
        this.f178659b = str;
        this.f178660c = a0Var;
        this.f178661d = eVar;
        this.f178662e = lVar;
        this.f178663f = j8;
        Logger logger = LoggerFactory.getLogger("CFT#" + str2 + "Finish" + (str != null ? fb1.c.n("@", str) : ""));
        logger.getClass();
        this.f178664g = logger;
        this.f178665h = new ConcurrentHashMap<>();
        a0Var.b(this);
    }

    @Override // al2.m
    public final void B(n nVar) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[Catch: all -> 0x002a, Exception -> 0x00c3, TryCatch #2 {Exception -> 0x00c3, all -> 0x002a, blocks: (B:12:0x0025, B:41:0x00b4, B:19:0x0038, B:21:0x0055, B:35:0x0083, B:24:0x005c, B:25:0x0060, B:27:0x0066, B:32:0x0079, B:30:0x006f, B:38:0x00a9, B:43:0x00bc), top: B:50:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x002a, Exception -> 0x00c3, TryCatch #2 {Exception -> 0x00c3, all -> 0x002a, blocks: (B:12:0x0025, B:41:0x00b4, B:19:0x0038, B:21:0x0055, B:35:0x0083, B:24:0x005c, B:25:0x0060, B:27:0x0066, B:32:0x0079, B:30:0x006f, B:38:0x00a9, B:43:0x00bc), top: B:50:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[LOOP:0: B:25:0x0060->B:34:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b1 -> B:41:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(v13.c r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vk2.e.a(v13.c):java.lang.Object");
    }

    @Override // al2.e
    public final void s(al2.a aVar) {
        AtomicReference<String> atomicReference = f178658i;
        String str = atomicReference.get();
        rs2.c cVar = aVar.f3759a;
        if (!s.g(str, cVar.getF172493a())) {
            if (str != null) {
                return;
            }
            String f172493a = cVar.getF172493a();
            while (!atomicReference.compareAndSet(null, f172493a)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
        }
        l<al2.a, Unit> lVar = this.f178662e;
        if (lVar != null) {
            lVar.invoke(aVar);
        }
    }

    @Override // al2.m
    public final void u(al2.l lVar) {
        lVar.getClass();
    }

    @Override // al2.e
    public final void y(al2.c cVar) {
        rs2.c cVar2 = cVar.f3775a;
        if (cVar.f3782h) {
            return;
        }
        String str = this.f178659b;
        if (str == null || str.equals(cVar2.getF172493a())) {
            this.f178664g.debug("Sync event: " + cVar);
            boolean z14 = cVar.f3777c.f3774a;
            AtomicReference<String> atomicReference = f178658i;
            ConcurrentHashMap<String, Long> concurrentHashMap = this.f178665h;
            if (z14) {
                concurrentHashMap.put(cVar2.getF172493a(), Long.valueOf(this.f178661d.millis()));
                String f172493a = cVar2.getF172493a();
                while (!atomicReference.compareAndSet(f172493a, null) && atomicReference.get() == f172493a) {
                }
                return;
            }
            if (cl2.c.i(cVar, this.f178660c)) {
                concurrentHashMap.put(cVar2.getF172493a(), 0L);
                String f172493a2 = cVar2.getF172493a();
                while (!atomicReference.compareAndSet(null, f172493a2) && atomicReference.get() == null) {
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvk2/e$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public e() {
        this(null, null, null, null, null, 0L, 63, null);
    }

    public /* synthetic */ e(String str, a0 a0Var, zy2.e eVar, String str2, l lVar, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? a0.f132585h.a() : a0Var, (i14 & 4) != 0 ? new zy2.f() : eVar, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? null : lVar, (i14 & 32) != 0 ? 15000L : j8);
    }
}
