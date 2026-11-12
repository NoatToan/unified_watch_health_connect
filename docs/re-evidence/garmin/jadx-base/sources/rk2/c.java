package rk2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import java.util.Map;
import java.util.Set;
import o13.m;
import o13.r;
import o13.t;
import ok2.a0;
import ok2.w;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.k0;
import pk2.b0;
import pk2.c0;
import pk2.e0;
import pk2.x;
import pk2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u007f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\f\u0012\u0004\u0012\u00020\t0\u000b\u0012\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0017\u0010\u0019¨\u0006\u001c"}, d2 = {"Lrk2/c;", "Lpk2/c0;", "Lmy2/a$b;", "serviceFactory", "Lkotlin/Function0;", "", "omtClientName", "Lrk2/c$d;", "xmlReader", "Lpk2/e0;", "defaultPriority", "", "Lcom/garmin/device/filetransfer/DataType;", "perDataTypePriority", "Lkotlin/Function2;", "Lrs2/c;", "Ljy2/a;", "", "isAllowedUpdate", "Lrk2/i;", "transferRegistry", "Lrk2/g;", "firmwareListener", "<init>", "(Lmy2/a$b;Le23/a;Lrk2/c$d;Lpk2/e0;Ljava/util/Map;Le23/p;Lrk2/i;Lrk2/g;)V", "(Lmy2/a$b;Ljava/lang/String;Le23/p;)V", "c", "d", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c implements c0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2901c f153359i = new C2901c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f153360j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<String> f153361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f153362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f153363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, e0> f153364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p<rs2.c, jy2.a, Boolean> f153365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f153366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f153367h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rk2/c$a", "Lrk2/c$d;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d {
        @Override // rk2.c.d
        public final Object a(rs2.c cVar, e eVar) {
            return d.a.a(cVar, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rk2/c$b", "Lrk2/c$d;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {
        @Override // rk2.c.d
        public final Object a(rs2.c cVar, e eVar) {
            return d.a.a(cVar, eVar);
        }
    }

    public interface d {

        public static final class a {
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public static Object a(rs2.c cVar, v13.c cVar2) throws IllegalAccessException {
                rk2.d dVar;
                if (cVar2 instanceof rk2.d) {
                    dVar = (rk2.d) cVar2;
                    int i14 = dVar.f153369b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        dVar.f153369b = i14 - Integer.MIN_VALUE;
                    } else {
                        dVar = new rk2.d(cVar2);
                    }
                } else {
                    dVar = new rk2.d(cVar2);
                }
                Object objB = dVar.f153368a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = dVar.f153369b;
                if (i15 == 0) {
                    r.b(objB);
                    w wVarA = a0.f132585h.a().a(cVar.getF172493a());
                    if (wVarA == null) {
                        com.nimbusds.jose.shaded.gson.internal.a.t("TransferManager not configured");
                        return null;
                    }
                    dVar.f153369b = 1;
                    objB = wVarA.b(true, null, dVar);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objB);
                }
                return ((o13.p) objB).f128594a;
            }
        }

        Object a(rs2.c cVar, e eVar);
    }

    static {
        Logger logger = LoggerFactory.getLogger("OmtFirmwareDownloadAgent");
        logger.getClass();
        f153360j = logger;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(my2.a.b bVar, e23.a aVar, d dVar, e0 e0Var, Map map, p pVar, i iVar, g gVar, int i14, j jVar) {
        Map map2;
        d aVar2 = (i14 & 4) != 0 ? new a() : dVar;
        e0 e0Var2 = (i14 & 8) != 0 ? e0.SILENT : e0Var;
        if ((i14 & 16) != 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            map2 = k0Var;
        } else {
            map2 = map;
        }
        this(bVar, aVar, aVar2, e0Var2, map2, (i14 & 32) != 0 ? new rk2.b((byte) 0, 0) : pVar, (i14 & 64) != 0 ? new rk2.a() : iVar, (i14 & 128) != 0 ? null : gVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0154  */
    /* JADX WARN: Code duplicated, block: B:43:0x018f  */
    /* JADX WARN: Code duplicated, block: B:46:0x019f  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0207  */
    /* JADX WARN: Code duplicated, block: B:57:0x021b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0272  */
    /* JADX WARN: Code duplicated, block: B:62:0x0290  */
    /* JADX WARN: Code duplicated, block: B:65:0x0298  */
    /* JADX WARN: Code duplicated, block: B:67:0x029b  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x018f -> B:44:0x0195). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:49:0x01c6
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.io.Serializable a(rk2.c r19, rs2.c r20, v13.c r21) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk2.c.a(rk2.c, rs2.c, v13.c):java.io.Serializable");
    }

    @Override // pk2.z
    public final String A() {
        return "";
    }

    @Override // pk2.z
    public final Map<String, e0> D() {
        return this.f153364e;
    }

    @Override // pk2.z
    public final void c(a0 a0Var) {
    }

    @Override // pk2.c0
    public final Object d(rs2.c cVar, wk2.f fVar, CoreTransferException coreTransferException, v13.c cVar2) {
        Unit unitB = this.f153366g.b(fVar);
        return unitB == u13.a.COROUTINE_SUSPENDED ? unitB : Unit.INSTANCE;
    }

    @Override // pk2.z
    public final Object e(rs2.c cVar, ok2.j jVar) {
        Unit unit = Unit.INSTANCE;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return unit;
    }

    @Override // pk2.c0
    public final boolean h(rs2.c cVar, wk2.f fVar) {
        cVar.getClass();
        fVar.getClass();
        return true;
    }

    @Override // pk2.z
    /* JADX INFO: renamed from: k, reason: from getter */
    public final e0 getF153363d() {
        return this.f153363d;
    }

    @Override // pk2.c0
    public final void l(b0 b0Var) {
    }

    @Override // pk2.c0
    public final Object o(rs2.c cVar, boolean z14, pk2.f fVar) {
        return a(this, cVar, fVar);
    }

    @Override // pk2.z
    public final x q(rs2.c cVar, wk2.f fVar, x xVar) {
        cVar.getClass();
        fVar.getClass();
        xVar.getClass();
        return null;
    }

    @Override // pk2.z
    public final Set t(rs2.c cVar, wk2.f fVar) {
        fVar.getClass();
        cVar.getClass();
        return z.a.a(cVar, fVar);
    }

    /* JADX INFO: renamed from: rk2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lrk2/c$c;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "DELTA_SOFTWARE_UPDATES", "I", "DELTA_SOFTWARE_UPDATES_REQUESTED", "", "RAW_HEADING", "Ljava/lang/String;", "FILTERED_HEADING", "SKIPPED_HEADING", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2901c {
        public /* synthetic */ C2901c(j jVar) {
            this();
        }

        private C2901c() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(my2.a.b bVar, e23.a<String> aVar, d dVar) {
        this(bVar, aVar, dVar, null, null, null, null, null, 248, null);
        bVar.getClass();
        aVar.getClass();
        dVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(my2.a.b bVar, e23.a<String> aVar, d dVar, e0 e0Var) {
        this(bVar, aVar, dVar, e0Var, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        bVar.getClass();
        aVar.getClass();
        dVar.getClass();
        e0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(my2.a.b bVar, e23.a<String> aVar, d dVar, e0 e0Var, Map<String, ? extends e0> map) {
        this(bVar, aVar, dVar, e0Var, map, null, null, null, 224, null);
        bVar.getClass();
        aVar.getClass();
        dVar.getClass();
        e0Var.getClass();
        map.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(my2.a.b bVar, e23.a<String> aVar, d dVar, e0 e0Var, Map<String, ? extends e0> map, p<? super rs2.c, ? super jy2.a, Boolean> pVar) {
        this(bVar, aVar, dVar, e0Var, map, pVar, null, null, 192, null);
        bVar.getClass();
        aVar.getClass();
        dVar.getClass();
        e0Var.getClass();
        map.getClass();
        pVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(my2.a.b bVar, e23.a<String> aVar, d dVar, e0 e0Var, Map<String, ? extends e0> map, p<? super rs2.c, ? super jy2.a, Boolean> pVar, i iVar) {
        this(bVar, aVar, dVar, e0Var, map, pVar, iVar, null, 128, null);
        bVar.getClass();
        aVar.getClass();
        dVar.getClass();
        e0Var.getClass();
        map.getClass();
        pVar.getClass();
        iVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(my2.a.b bVar, e23.a<String> aVar, d dVar, e0 e0Var, Map<String, ? extends e0> map, p<? super rs2.c, ? super jy2.a, Boolean> pVar, i iVar, g gVar) {
        bVar.getClass();
        aVar.getClass();
        dVar.getClass();
        e0Var.getClass();
        map.getClass();
        pVar.getClass();
        iVar.getClass();
        this.f153361b = aVar;
        this.f153362c = dVar;
        this.f153363d = e0Var;
        this.f153364e = map;
        this.f153365f = pVar;
        this.f153366g = iVar;
        this.f153367h = m.b(new rk0.f(4, bVar, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(my2.a.b bVar, e23.a<String> aVar) {
        this(bVar, aVar, null, null, null, null, null, null, 252, null);
        bVar.getClass();
        aVar.getClass();
    }

    public /* synthetic */ c(my2.a.b bVar, String str, p pVar, int i14, j jVar) {
        if ((i14 & 4) != 0) {
            pVar = new r72.g((byte) 0, 29);
        }
        this(bVar, str, (p<? super rs2.c, ? super jy2.a, Boolean>) pVar);
    }

    public c(my2.a.b bVar, String str, p<? super rs2.c, ? super jy2.a, Boolean> pVar) {
        bVar.getClass();
        str.getClass();
        pVar.getClass();
        a90.c cVar = new a90.c(str, 12);
        b bVar2 = new b();
        e0 e0Var = e0.SILENT;
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this(bVar, cVar, bVar2, e0Var, k0Var, pVar, null, null, 192, null);
    }
}
