package xs2;

import am.j;
import com.garmin.gfdi.file.FileException;
import e23.p;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.TimeoutCancellationException;
import o13.u;
import o53.l1;
import o53.m0;
import o53.r;
import o53.s;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.v;
import rs2.x;
import ws2.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lxs2/c;", "", "Lrs2/v;", "messenger", "", "fileIndex", "", "timeoutMillis", "", "enableCompression", "Lkotlin/Function2;", "", "progress", "<init>", "(Lrs2/v;IJZLe23/p;)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f192091h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f192092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f192093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f192094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f192095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<Integer, Integer, Unit> f192096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f192097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<r<u<Integer, byte[], x>>> f192098g;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(v vVar, int i14, long j8, boolean z14, p<? super Integer, ? super Integer, Unit> pVar) {
        vVar.getClass();
        pVar.getClass();
        this.f192092a = vVar;
        this.f192093b = i14;
        this.f192094c = j8;
        this.f192095d = z14;
        this.f192096e = pVar;
        rs2.d.f154380a.getClass();
        this.f192097f = LoggerFactory.getLogger(rs2.d.a("ReadFileTask", -1L, this, null));
        this.f192098g = new AtomicReference<>();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:37:0x00c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(int r12, java.io.OutputStream r13, v13.c r14) throws com.garmin.gfdi.file.FileException {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs2.c.a(int, java.io.OutputStream, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(OutputStream outputStream, v13.c cVar) throws FileException {
        g gVar;
        long j8;
        long j14;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f192120e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f192120e = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objC = gVar.f192118c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f192120e;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                this.f192098g.set(new s((l1) gVar.getF129302c().get(l1.f129368i0)));
                long jCurrentTimeMillis = System.currentTimeMillis();
                gVar.f192116a = outputStream;
                gVar.f192117b = jCurrentTimeMillis;
                gVar.f192120e = 1;
                objC = c(1, gVar);
                if (objC != obj) {
                    j8 = jCurrentTimeMillis;
                }
                return obj;
            }
            if (i15 == 1) {
                j8 = gVar.f192117b;
                outputStream = gVar.f192116a;
                o13.r.b(objC);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j14 = gVar.f192117b;
                o13.r.b(objC);
            }
            return new l(((Number) objC).intValue(), System.currentTimeMillis() - j14);
            int iIntValue = ((Number) objC).intValue();
            gVar.f192116a = null;
            gVar.f192117b = j8;
            gVar.f192120e = 2;
            objC = a(iIntValue, outputStream, gVar);
            if (objC != obj) {
                j14 = j8;
                return new l(((Number) objC).intValue(), System.currentTimeMillis() - j14);
            }
            return obj;
        } catch (FileException e4) {
            throw e4;
        } catch (TimeoutCancellationException unused) {
            throw new FileException(FileException.a.TIMEOUT);
        } catch (CancellationException e14) {
            throw new FileException(FileException.a.CANCELLED_BY_APP, e14);
        } catch (Exception e15) {
            throw new FileException(e15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i14, v13.c cVar) throws FileException {
        h hVar;
        Object objC;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i15 = hVar.f192124d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                hVar.f192124d = i15 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objB = hVar.f192122b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = hVar.f192124d;
        try {
            if (i16 != 0) {
                if (i16 == 1) {
                    i14 = hVar.f192121a;
                    o13.r.b(objB);
                } else {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            o13.r.b(objB);
                            return objB;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i14 = hVar.f192121a;
                    o13.r.b(objB);
                }
                hVar.f192124d = 3;
                objC = c(i14 - 1, hVar);
                if (objC != obj) {
                    return obj;
                }
                return objC;
            }
            o13.r.b(objB);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(13);
            lg.d.P(byteArrayOutputStream, this.f192093b);
            long j8 = 0;
            lg.d.Q(byteArrayOutputStream, j8);
            byteArrayOutputStream.write(1);
            lg.d.P(byteArrayOutputStream, 0);
            lg.d.Q(byteArrayOutputStream, j8);
            byteArrayOutputStream.write(this.f192095d ? 1 : 0);
            v vVar = this.f192092a;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            hVar.f192121a = i14;
            hVar.f192124d = 1;
            objB = vVar.b(5002, byteArray, hVar);
            if (objB == obj) {
            }
            return obj;
            byte[] bArr = (byte[]) objB;
            Byte bF = p13.u.F(bArr);
            if (bF == null) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, j.h(bArr.length, "Download file response is too short: "));
            }
            byte bByteValue = bF.byteValue();
            switch (bByteValue) {
                case 0:
                    if (bArr.length >= 5) {
                        return new Integer((int) jg.b.L(1, bArr));
                    }
                    throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, j.h(bArr.length, "Download file response is too short: "));
                case 1:
                    throw new FileException(FileException.a.FILE_INDEX_DOES_NOT_EXIST);
                case 2:
                    throw new FileException(FileException.a.FILE_INDEX_NOT_READABLE);
                case 3:
                    if (i14 <= 0) {
                        throw new FileException(FileException.a.NOT_READY);
                    }
                    hVar.f192121a = i14;
                    hVar.f192124d = 2;
                    if (m0.b(1000L, hVar) != obj) {
                        hVar.f192124d = 3;
                        objC = c(i14 - 1, hVar);
                        if (objC != obj) {
                            return objC;
                        }
                    }
                    return obj;
                case 4:
                    throw new FileException(FileException.a.INVALID_REQUEST);
                case 5:
                    throw new FileException(FileException.a.CRC_MISMATCH);
                case 6:
                    throw new FileException(FileException.a.DATA_REQUESTED_EXCEEDS_FILE_SIZE);
                default:
                    throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, j.h(bByteValue, "Invalid download request response status: "));
            }
        } catch (Exception e4) {
            throw new FileException(e4);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxs2/c$a;", "", "<init>", "()V", "", "ALLOWED_READ_RETRIES", "I", "", "MILLIS_DELAY_BETWEEN_RETRIES", "J", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
