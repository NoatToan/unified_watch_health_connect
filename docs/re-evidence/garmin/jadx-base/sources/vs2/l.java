package vs2;

import com.garmin.gfdi.GfdiException;
import com.garmin.gfdi.ResponseStatusException;
import java.io.IOException;
import java.util.Set;
import o13.r;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.l0;
import p13.u;
import rs2.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvs2/l;", "Lrs2/h;", "", "", "hostConfig", "<init>", "(Ljava/util/Set;)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements rs2.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Integer> f179982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f179983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Logger f179984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f179985e;

    static {
        new a(null);
    }

    public l(Set<Integer> set) {
        set.getClass();
        this.f179982b = set;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9 A[Catch: all -> 0x0041, TryCatch #3 {all -> 0x0041, blocks: (B:12:0x003b, B:32:0x008b, B:34:0x0093, B:40:0x009d, B:53:0x00c5, B:55:0x00c9, B:56:0x00cc, B:57:0x00cd, B:58:0x0101, B:59:0x0102, B:61:0x0106, B:62:0x0109, B:63:0x010a, B:64:0x012a, B:23:0x0057, B:25:0x005b, B:27:0x0061, B:29:0x0074, B:49:0x00b9, B:50:0x00be, B:51:0x00bf, B:52:0x00c4), top: B:73:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd A[Catch: all -> 0x0041, TryCatch #3 {all -> 0x0041, blocks: (B:12:0x003b, B:32:0x008b, B:34:0x0093, B:40:0x009d, B:53:0x00c5, B:55:0x00c9, B:56:0x00cc, B:57:0x00cd, B:58:0x0101, B:59:0x0102, B:61:0x0106, B:62:0x0109, B:63:0x010a, B:64:0x012a, B:23:0x0057, B:25:0x005b, B:27:0x0061, B:29:0x0074, B:49:0x00b9, B:50:0x00be, B:51:0x00bf, B:52:0x00c4), top: B:73:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0106 A[Catch: all -> 0x0041, TryCatch #3 {all -> 0x0041, blocks: (B:12:0x003b, B:32:0x008b, B:34:0x0093, B:40:0x009d, B:53:0x00c5, B:55:0x00c9, B:56:0x00cc, B:57:0x00cd, B:58:0x0101, B:59:0x0102, B:61:0x0106, B:62:0x0109, B:63:0x010a, B:64:0x012a, B:23:0x0057, B:25:0x005b, B:27:0x0061, B:29:0x0074, B:49:0x00b9, B:50:0x00be, B:51:0x00bf, B:52:0x00c4), top: B:73:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x010a A[Catch: all -> 0x0041, TryCatch #3 {all -> 0x0041, blocks: (B:12:0x003b, B:32:0x008b, B:34:0x0093, B:40:0x009d, B:53:0x00c5, B:55:0x00c9, B:56:0x00cc, B:57:0x00cd, B:58:0x0101, B:59:0x0102, B:61:0x0106, B:62:0x0109, B:63:0x010a, B:64:0x012a, B:23:0x0057, B:25:0x005b, B:27:0x0061, B:29:0x0074, B:49:0x00b9, B:50:0x00be, B:51:0x00bf, B:52:0x00c4), top: B:73:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x00cd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x010a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    public final Object a(k kVar, v13.c cVar) {
        m mVar;
        ?? r18;
        Logger logger;
        ?? r19;
        Logger logger2;
        i iVar;
        i iVar2;
        k kVar2 = kVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f179989d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f179989d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objB = mVar.f179987b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f179989d;
        Object obj = null;
        Set<Integer> set = this.f179982b;
        try {
            try {
                try {
                    if (i15 == 0) {
                        r.b(objB);
                        Logger logger3 = this.f179984d;
                        if (logger3 == null) {
                            s.m("logger");
                            throw null;
                        }
                        logger3.info("Sending System Event " + kVar2.name());
                        v vVar = this.f179983c;
                        if (vVar == null) {
                            s.m("messenger");
                            throw null;
                        }
                        obj = null;
                        byte[] bArr = {kVar2.f179981a, 0};
                        mVar.f179986a = kVar2;
                        mVar.f179989d = 1;
                        objB = vVar.b(5030, bArr, mVar);
                        if (objB == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kVar2 = mVar.f179986a;
                        r.b(objB);
                    }
                    Byte bF = u.F((byte[]) objB);
                    Integer num = new Integer(bF != null ? bF.byteValue() : (byte) -1);
                    if (kVar2 == k.HANDSHAKE_COMPLETE && set.contains(new Integer(3)) && (iVar2 = this.f179985e) != null) {
                        iVar2.e();
                    }
                    return num;
                } catch (Throwable th3) {
                    if (kVar2 == k.HANDSHAKE_COMPLETE && set.contains(new Integer(3)) && (iVar = this.f179985e) != null) {
                        iVar.e();
                    }
                    throw th3;
                }
            } catch (ResponseStatusException e4) {
                e = e4;
                r19 = obj;
                logger2 = this.f179984d;
                if (logger2 == null) {
                    s.m("logger");
                    throw r19;
                }
                logger2.warn("Device rejected system event " + kVar2 + ": " + e.getStatus(), (Throwable) e);
                throw new GfdiException("Device rejected system event " + kVar2 + ": " + e.getStatus(), e);
            } catch (IOException e14) {
                e = e14;
                r18 = obj;
                logger = this.f179984d;
                if (logger == null) {
                    s.m("logger");
                    throw r18;
                }
                logger.warn("Failed to send system event: " + kVar2, (Throwable) e);
                throw new GfdiException("Failed to send system event " + kVar2, e);
            }
        } catch (ResponseStatusException e15) {
            e = e15;
            r19 = cVar;
            logger2 = this.f179984d;
            if (logger2 == null) {
                s.m("logger");
                throw r19;
            }
            logger2.warn("Device rejected system event " + kVar2 + ": " + e.getStatus(), (Throwable) e);
            throw new GfdiException("Device rejected system event " + kVar2 + ": " + e.getStatus(), e);
        } catch (IOException e16) {
            e = e16;
            r18 = cVar;
            logger = this.f179984d;
            if (logger == null) {
                s.m("logger");
                throw r18;
            }
            logger.warn("Failed to send system event: " + kVar2, (Throwable) e);
            throw new GfdiException("Failed to send system event " + kVar2, e);
        }
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        rs2.d dVar = rs2.d.f154380a;
        String str = ((us2.f) cVar).f172493a;
        dVar.getClass();
        this.f179984d = LoggerFactory.getLogger(rs2.d.a("SystemEventSender", -1L, this, str));
        this.f179983c = vVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lvs2/l$a;", "", "<init>", "()V", "", "SEND_EVENT_RESULT_SUCCESS", "I", "SEND_EVENT_RESULT_UNSUPPORTED", "SEND_EVENT_RESULT_UNKNOWN", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
