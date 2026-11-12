package lk2;

import com.garmin.device.filetransfer.FileTransferException;
import com.garmin.device.filetransfer.ItemAccessException;
import com.garmin.device.filetransfer.PriorityUpdateException;
import com.garmin.device.filetransfer.TransferCancelledException;
import com.garmin.device.filetransfer.TransferStatusException;
import com.garmin.proto.generated.GDIFileAccess;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.TimeoutCancellationException;
import o53.e2;
import o53.j2;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Llk2/c0;", "Llk2/b0;", "", "taskName", "Ljava/util/UUID;", "fileId", "", "initialPriority", "Lcom/garmin/device/filetransfer/b;", "protoRequests", "", "timeout", "<init>", "(Ljava/lang/String;Ljava/util/UUID;ILcom/garmin/device/filetransfer/b;J)V", "b", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 implements b0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f113162p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f113164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.device.filetransfer.b f113165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f113166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f113167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f113168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u53.d f113169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o53.s f113170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o53.s f113171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o53.s f113172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o53.s f113173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArraySet<e23.p<Long, Long, Unit>> f113174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f113175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f113176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f113177o;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004¨\u0006\u0005"}, d2 = {"lk2/c0$a", "Lkotlin/Function2;", "", "", "Lcom/garmin/device/filetransfer/TransferProgress;", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e23.p<Long, Long, Unit> {
        public a() {
        }

        @Override // e23.p
        public final Unit invoke(Long l14, Long l15) {
            l14.longValue();
            l15.longValue();
            c0 c0Var = c0.this;
            o53.s sVar = c0Var.f113173k;
            Unit unit = Unit.INSTANCE;
            sVar.g0(unit);
            c0Var.f113174l.remove(this);
            return unit;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f113180b;

        static {
            int[] iArr = new int[GDIFileAccess.ItemAccessResult.values().length];
            try {
                iArr[GDIFileAccess.ItemAccessResult.ITEM_TYPE_NOT_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIFileAccess.ItemAccessResult.UNKNOWN_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDIFileAccess.ItemAccessResult.NO_AVAILABLE_RESOURCES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GDIFileAccess.ItemAccessResult.NO_SPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f113179a = iArr;
            int[] iArr2 = new int[GDIFileAccess.TransferStatusRequest.FailureReason.values().length];
            try {
                iArr2[GDIFileAccess.TransferStatusRequest.FailureReason.ITEM_DELETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GDIFileAccess.TransferStatusRequest.FailureReason.HIGHER_PRIORITY_REQUEST_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GDIFileAccess.TransferStatusRequest.FailureReason.CANCELLED_BY_CLIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[GDIFileAccess.TransferStatusRequest.FailureReason.CANCELLED_BY_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f113180b = iArr2;
        }
    }

    static {
        new b(null);
    }

    public c0(String str, UUID uuid, int i14, com.garmin.device.filetransfer.b bVar, long j8) {
        str.getClass();
        uuid.getClass();
        bVar.getClass();
        this.f113163a = str;
        this.f113164b = uuid;
        this.f113165c = bVar;
        this.f113166d = j8;
        this.f113167e = LoggerFactory.getLogger("FT#TransferTask[" + uuid + "]");
        CopyOnWriteArraySet<e23.p<Long, Long, Unit>> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f113174l = copyOnWriteArraySet;
        e2 e2VarH = ge1.b.h();
        this.f113169g = o53.c0.a(t13.g.a.C3052a.d(s0.f129406a, e2VarH).plus(new o53.a0("TransferTask[" + uuid + "]")));
        this.f113170h = new o53.s(e2VarH);
        this.f113171i = new o53.s(e2VarH);
        this.f113172j = new o53.s(e2VarH);
        this.f113173k = new o53.s(e2VarH);
        copyOnWriteArraySet.add(new a());
        this.f113175m = new byte[0];
        this.f113176n = i14;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final Object d(c0 c0Var, e23.l lVar, e23.q qVar, v13.c cVar) throws FileTransferException {
        g0 g0Var;
        long j8;
        i0 i0Var;
        c0Var.getClass();
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f113224e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f113224e = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(c0Var, cVar);
            }
        } else {
            g0Var = new g0(c0Var, cVar);
        }
        Object objInvoke = g0Var.f113222c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f113224e;
        try {
            try {
                try {
                    if (i15 != 0) {
                        if (i15 == 1) {
                            qVar = g0Var.f113221b;
                            c0Var = g0Var.f113220a;
                            o13.r.b(objInvoke);
                        } else if (i15 == 2) {
                            c0Var = g0Var.f113220a;
                            o13.r.b(objInvoke);
                            c0Var.f113171i.g0(Unit.INSTANCE);
                            Logger logger = c0Var.f113167e;
                            String str = c0Var.f113163a;
                            synchronized (c0Var.f113175m) {
                                Integer num = c0Var.f113177o;
                            }
                            logger.debug(str + " transfer completed " + num);
                            j8 = c0Var.f113166d;
                            i0Var = new i0(c0Var, null);
                            g0Var.f113220a = c0Var;
                            g0Var.f113221b = null;
                            g0Var.f113224e = 3;
                            if (j2.b(j8, i0Var, g0Var) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i15 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            c0Var = g0Var.f113220a;
                            o13.r.b(objInvoke);
                        }
                        o53.s sVar = c0Var.f113173k;
                        Unit unit = Unit.INSTANCE;
                        sVar.g0(unit);
                        return unit;
                    }
                    o13.r.b(objInvoke);
                    g0Var.f113220a = c0Var;
                    g0Var.f113221b = qVar;
                    g0Var.f113224e = 1;
                    objInvoke = lVar.invoke(g0Var);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    a0 a0Var = (a0) objInvoke;
                    Integer num2 = new Integer(a0Var.f113158a);
                    synchronized (c0Var.f113175m) {
                        c0Var.f113177o = num2;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    c0Var.f113170h.g0(num2);
                    o53.c0.f(c0Var.f113169g);
                    h0 h0Var = new h0(c0Var);
                    g0Var.f113220a = c0Var;
                    g0Var.f113221b = null;
                    g0Var.f113224e = 2;
                    if (qVar.invoke(a0Var, h0Var, g0Var) == aVar) {
                        return aVar;
                    }
                    c0Var.f113171i.g0(Unit.INSTANCE);
                    Logger logger2 = c0Var.f113167e;
                    String str2 = c0Var.f113163a;
                    synchronized (c0Var.f113175m) {
                        Integer num3 = c0Var.f113177o;
                        logger2.debug(str2 + " transfer completed " + num3);
                        j8 = c0Var.f113166d;
                        i0Var = new i0(c0Var, null);
                        g0Var.f113220a = c0Var;
                        g0Var.f113221b = null;
                        g0Var.f113224e = 3;
                        if (j2.b(j8, i0Var, g0Var) == aVar) {
                            return aVar;
                        }
                        o53.s sVar2 = c0Var.f113173k;
                        Unit unit3 = Unit.INSTANCE;
                        sVar2.g0(unit3);
                        return unit3;
                    }
                } catch (Exception e4) {
                    c0Var.getClass();
                    boolean zH = h(e4);
                    Logger logger3 = c0Var.f113167e;
                    String str3 = c0Var.f113163a;
                    if (zH) {
                        logger3.warn(str3 + StringUtils.SPACE + e4.getMessage());
                    } else {
                        logger3.error(str3 + " transfer failed", (Throwable) e4);
                    }
                    FileTransferException fileTransferExceptionI = i(e4, c0Var.f113163a + " failed: Error " + e4.getMessage());
                    c0Var.f113171i.O(fileTransferExceptionI);
                    if (fileTransferExceptionI instanceof TransferStatusException) {
                        c0Var.f113172j.O(fileTransferExceptionI);
                    }
                }
            } catch (Exception e14) {
                throw i(e14, c0Var.f113163a + " failed: Error during setup");
            }
        } catch (TimeoutCancellationException e15) {
            c0Var.f113167e.error(c0Var.f113163a + " failed: device did not send status notification");
            c0Var.f113172j.O(e15);
        } catch (Exception e16) {
            c0Var.f113167e.error(c0Var.f113163a + " failed", (Throwable) e16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public static boolean h(Exception exc) {
        int i14;
        if (!(exc instanceof FileTransferException)) {
            return false;
        }
        if (!(exc instanceof TransferCancelledException)) {
            if (exc instanceof ItemAccessException) {
                int i15 = c.f113179a[((ItemAccessException) exc).getItemAccessResult().ordinal()];
                if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 4) {
                    if (exc instanceof TransferStatusException) {
                        return false;
                    }
                    i14 = c.f113180b[((TransferStatusException) exc).getStatus().ordinal()];
                    if (i14 == 1 && i14 != 2 && i14 != 3 && i14 != 4) {
                        return false;
                    }
                }
            } else {
                if (exc instanceof TransferStatusException) {
                    return false;
                }
                i14 = c.f113180b[((TransferStatusException) exc).getStatus().ordinal()];
                if (i14 == 1) {
                }
            }
        }
        return true;
    }

    public static FileTransferException i(Exception exc, String str) {
        if (exc instanceof FileTransferException) {
            return (FileTransferException) exc;
        }
        Throwable cause = exc.getCause();
        FileTransferException fileTransferException = cause instanceof FileTransferException ? (FileTransferException) cause : null;
        return fileTransferException != null ? fileTransferException : new FileTransferException(str, exc);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // lk2.b0
    public final Object a(int i14, v13.c cVar) throws PriorityUpdateException {
        j0 j0Var;
        c0 c0Var;
        c0 c0Var2;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i15 = j0Var.f113257e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                j0Var.f113257e = i15 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object objC = j0Var.f113255c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = j0Var.f113257e;
        int i17 = 2;
        if (i16 == 0) {
            o13.r.b(objC);
            if (!o53.c0.g(this.f113169g)) {
                throw new PriorityUpdateException("Priority update failed: Transfer is already complete", null, i17, 0 == true ? 1 : 0);
            }
            try {
                o53.s sVar = this.f113170h;
                j0Var.f113253a = this;
                j0Var.f113254b = i14;
                j0Var.f113257e = 1;
                objC = sVar.C(j0Var);
                if (objC != aVar) {
                    c0Var = this;
                }
                return aVar;
            } catch (Exception e4) {
                e = e4;
                c0Var = this;
                c0Var.f113167e.error("Update priority failed", (Throwable) e);
                throw new PriorityUpdateException(fb1.c.n("Priority update failed: ", e.getMessage()), e);
            }
        }
        if (i16 == 1) {
            i14 = j0Var.f113254b;
            c0Var = j0Var.f113253a;
            try {
                o13.r.b(objC);
            } catch (Exception e14) {
                e = e14;
                c0Var.f113167e.error("Update priority failed", (Throwable) e);
                throw new PriorityUpdateException(fb1.c.n("Priority update failed: ", e.getMessage()), e);
            }
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = j0Var.f113254b;
            c0Var2 = j0Var.f113253a;
            o13.r.b(objC);
        }
        synchronized (c0Var2.f113175m) {
            c0Var2.f113176n = i14;
        }
        return Unit.INSTANCE;
        int iIntValue = ((Number) objC).intValue();
        com.garmin.device.filetransfer.b bVar = c0Var.f113165c;
        j0Var.f113253a = c0Var;
        j0Var.f113254b = i14;
        j0Var.f113257e = 2;
        if (bVar.g(iIntValue, i14, j0Var) != aVar) {
            c0Var2 = c0Var;
            synchronized (c0Var2.f113175m) {
                c0Var2.f113176n = i14;
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }

    @Override // lk2.b0
    public final Object b(v13.c cVar) {
        return j2.c(this.f113166d, new e0(this, null), cVar);
    }

    @Override // lk2.b0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getF113168f() {
        return this.f113168f;
    }

    @Override // lk2.b0
    public final void cancel() {
        g(new TransferCancelledException());
    }

    public final void e(e23.p<? super Long, ? super Long, Unit> pVar) {
        pVar.getClass();
        this.f113174l.add(pVar);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) throws Exception {
        d0 d0Var;
        c0 c0Var;
        Exception exc;
        Exception e4;
        c0 c0Var2;
        Object objC;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i14 = d0Var.f113191e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d0Var.f113191e = i14 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, cVar);
            }
        } else {
            d0Var = new d0(this, cVar);
        }
        Object obj = d0Var.f113189c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d0Var.f113191e;
        if (i15 == 0) {
            o13.r.b(obj);
            try {
                o53.s sVar = this.f113171i;
                d0Var.f113187a = this;
                d0Var.f113191e = 1;
                if (sVar.C(d0Var) != aVar) {
                    c0Var = this;
                    e = null;
                    o53.s sVar2 = c0Var.f113172j;
                    d0Var.f113187a = c0Var;
                    d0Var.f113188b = e;
                    d0Var.f113191e = 2;
                    objC = sVar2.C(d0Var);
                    u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                    if (objC != aVar) {
                        exc = e;
                        c0Var2 = c0Var;
                        e4 = null;
                    }
                }
            } catch (Exception e14) {
                e = e14;
                c0Var = this;
            }
            return aVar;
        }
        if (i15 == 1) {
            c0Var = d0Var.f113187a;
            try {
                o13.r.b(obj);
                e = null;
            } catch (Exception e15) {
                e = e15;
            }
            try {
                o53.s sVar3 = c0Var.f113172j;
                d0Var.f113187a = c0Var;
                d0Var.f113188b = e;
                d0Var.f113191e = 2;
                objC = sVar3.C(d0Var);
                u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                if (objC != aVar) {
                    exc = e;
                    c0Var2 = c0Var;
                    e4 = null;
                }
                return aVar;
            } catch (Exception e16) {
                exc = e;
                e4 = e16;
                c0Var2 = c0Var;
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            exc = d0Var.f113188b;
            c0Var2 = d0Var.f113187a;
            try {
                o13.r.b(obj);
                e4 = null;
            } catch (Exception e17) {
                e4 = e17;
            }
        }
        o53.s sVar4 = c0Var2.f113173k;
        Unit unit = Unit.INSTANCE;
        sVar4.g0(unit);
        if (exc != null || e4 != null) {
            if (e4 != null) {
                if (exc != null) {
                    if ((e4 instanceof TimeoutCancellationException ? (TimeoutCancellationException) e4 : null) != null) {
                        throw exc;
                    }
                }
                if (e4 instanceof FileTransferException) {
                    throw ((FileTransferException) e4);
                }
                throw new FileTransferException("Transfer error", e4);
            }
            if (exc != null) {
                throw exc;
            }
        }
        return unit;
    }

    public final void g(FileTransferException fileTransferException) {
        this.f113170h.O(fileTransferException);
        this.f113171i.O(fileTransferException);
        this.f113172j.O(fileTransferException);
        this.f113173k.g0(Unit.INSTANCE);
        o53.c0.c(this.f113169g, null);
    }

    @Override // lk2.b0
    public final int getPriority() {
        int i14;
        synchronized (this.f113175m) {
            i14 = this.f113176n;
        }
        return i14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llk2/c0$b;", "", "<init>", "()V", "", "NOTIFICATION_TIMEOUT", "J", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ c0(String str, UUID uuid, int i14, com.garmin.device.filetransfer.b bVar, long j8, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, uuid, i14, bVar, (i15 & 16) != 0 ? 30000L : j8);
    }
}
