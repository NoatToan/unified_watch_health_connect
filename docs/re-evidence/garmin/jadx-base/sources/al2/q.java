package al2;

import androidx.room.a0;
import com.garmin.device.filetransfer.TransferStatusException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.proto.generated.GDIFileAccess;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import ok2.g0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import pk2.f0;
import pk2.x;
import pk2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lal2/q;", "", "Lok2/d;", "config", "Lal2/p;", "saver", "<init>", "(Lok2/d;Lal2/p;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f3839f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ok2.d f3840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f3841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0 f3843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<l> f3844e;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3845a;

        static {
            int[] iArr = new int[al2.b.values().length];
            try {
                iArr[al2.b.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[al2.b.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[al2.b.NO_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[al2.b.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[al2.b.INTERRUPTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[al2.b.SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3845a = iArr;
        }
    }

    static {
        new a(null);
        Logger logger = LoggerFactory.getLogger("CFT#SyncResult");
        logger.getClass();
        f3839f = logger;
    }

    public q(ok2.d dVar, p pVar) {
        dVar.getClass();
        pVar.getClass();
        this.f3840a = dVar;
        this.f3841b = pVar;
        this.f3842c = new Object();
        this.f3844e = new ArrayList<>();
    }

    public final void a(c cVar) {
        g0 g0Var;
        CoreTransferException coreTransferException;
        String message;
        y yVar;
        List<f0> list;
        mk2.a aVarValueOf;
        switch (b.f3845a[cVar.f3777c.ordinal()]) {
            case 1:
                synchronized (this.f3842c) {
                    this.f3843d = cVar.f3776b;
                    Unit unit = Unit.INSTANCE;
                }
                this.f3841b.C(cVar.f3775a);
                return;
            case 2:
            case 3:
                synchronized (this.f3842c) {
                    this.f3843d = null;
                    this.f3844e.clear();
                    Unit unit2 = Unit.INSTANCE;
                }
                if (cVar.f3777c != al2.b.REJECTED || cVar.f3776b.a() < 30) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("******************** SYNC REJECT: " + cVar.f3776b + " ********************");
                sb3.append('\n');
                sb3.append("IsConnected=" + cVar.f3781g);
                sb3.append('\n');
                CoreTransferException coreTransferException2 = cVar.f3778d;
                sb3.append("Overall Reason=" + (coreTransferException2 != null ? coreTransferException2.getMessage() : null));
                sb3.append("\n*****************************************************\n");
                String string = sb3.toString();
                f3839f.info(string);
                this.f3841b.g(cVar.f3775a, string, cVar.f3777c);
                return;
            case 4:
            case 5:
            case 6:
                ArrayList<l> arrayList = new ArrayList();
                synchronized (this.f3842c) {
                    g0Var = this.f3843d;
                    arrayList.addAll(this.f3844e);
                    synchronized (this.f3842c) {
                        this.f3843d = null;
                        this.f3844e.clear();
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
                if (g0Var != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("******************** SYNC STARTED: " + g0Var + " *******************");
                    sb4.append('\n');
                    sb4.append("******************** SYNC RESULT: " + cVar.f3776b + ": " + cl2.c.p(cVar.f3775a) + " ********************");
                    sb4.append('\n');
                    al2.b bVar = cVar.f3777c;
                    StringBuilder sb5 = new StringBuilder("Overall Sync Status=");
                    sb5.append(bVar);
                    sb4.append(sb5.toString());
                    sb4.append('\n');
                    CoreTransferException coreTransferException3 = cVar.f3778d;
                    if (coreTransferException3 != null) {
                        sb4.append("Overall Reason=" + coreTransferException3.getMessage());
                        sb4.append('\n');
                    }
                    sb4.append("IsConnected=" + cVar.f3781g);
                    sb4.append('\n');
                    for (f0 f0Var : this.f3840a.f132627g) {
                        String strA = f0Var.A();
                        String strR = f0Var.r(cVar.f3775a);
                        if (strA.length() > 0 && strR != null && strR.length() != 0) {
                            sb4.append(strA + "=" + strR);
                            sb4.append('\n');
                        }
                    }
                    sb4.append("Total Files=" + cVar.f3780f + ": VisibleFailures=" + cVar.a());
                    sb4.append('\n');
                    List<j> list2 = cVar.f3779e;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list2) {
                        if (((j) obj).f3804a == null) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        sb4.append("GENERAL=" + ((j) it.next()).f3806c.getMessage());
                        sb4.append('\n');
                    }
                    for (l lVar : arrayList) {
                        StringBuilder sb6 = new StringBuilder();
                        wk2.f fVar = lVar.f3821c;
                        x xVar = lVar.f3823e;
                        sb6.append(fVar.f185844c.f185854a + ": ");
                        wk2.f fVar2 = lVar.f3821c;
                        sb6.append(cl2.c.o(fVar2.f185843b));
                        if (fVar2.a()) {
                            String str = fVar2.f185847f.get("AD_HOC_LATENCY_PROPERTY_KEY");
                            if (str != null) {
                                try {
                                    aVarValueOf = mk2.a.valueOf(str);
                                } catch (Exception unused) {
                                    aVarValueOf = null;
                                }
                            } else {
                                aVarValueOf = null;
                            }
                            sb6.append("(" + aVarValueOf + ")");
                        }
                        sb6.append("/" + fVar2.f185845d + "B");
                        if (xVar != null && (yVar = xVar.f138496a) != null && !yVar.f138508a) {
                            if (fVar2.f185844c != wk2.h.DEVICE_TO_PHONE) {
                                sb6.append(": ACKED");
                            } else if (s.g(fVar2.f185843b, "GDXml") || ((list = this.f3840a.f132627g) != null && list.isEmpty())) {
                                sb6.append(": CACHED");
                            } else {
                                Iterator<T> it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        sb6.append(": CACHED");
                                    } else if (!((f0) it3.next()).getF159941g().f113303b.isEmpty()) {
                                        CoreTransferException coreTransferException4 = lVar.f3826h;
                                        Throwable cause = coreTransferException4 != null ? coreTransferException4.getCause() : null;
                                        TransferStatusException transferStatusException = cause instanceof TransferStatusException ? (TransferStatusException) cause : null;
                                        if ((transferStatusException != null ? transferStatusException.getStatus() : null) != GDIFileAccess.TransferStatusRequest.FailureReason.COMPRESSION_FAILED) {
                                            sb6.append(": ARCHIVED");
                                        }
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        if ((xVar != null ? xVar.f138496a : null) != y.SUCCESS && xVar != null && (coreTransferException = xVar.f138497b) != null && (message = coreTransferException.getMessage()) != null) {
                            sb6.append(" - ".concat(message));
                        }
                        sb6.append(" - " + fVar2.f185842a);
                        String string2 = sb6.toString();
                        if (sb4.length() + string2.length() > 4000) {
                            Logger logger = f3839f;
                            String string3 = sb4.toString();
                            logger.getClass();
                            if (cVar.f3777c != al2.b.SUCCESS) {
                                logger.warn(string3);
                            } else {
                                logger.info(string3);
                            }
                            sb4 = new StringBuilder();
                            sb4.append("******************** SYNC CONTINUED: " + cVar.f3776b + " *******************");
                            sb4.append('\n');
                        }
                        sb4.append(string2);
                        sb4.append('\n');
                        break;
                    }
                    String strM = a0.m(sb4, "*****************************************************", '\n');
                    Logger logger2 = f3839f;
                    logger2.getClass();
                    if (cVar.f3777c != al2.b.SUCCESS) {
                        logger2.warn(strM);
                    } else {
                        logger2.info(strM);
                    }
                    this.f3841b.g(cVar.f3775a, strM, cVar.f3777c);
                    return;
                }
                return;
            default:
                u0.r();
                return;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lal2/q$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
