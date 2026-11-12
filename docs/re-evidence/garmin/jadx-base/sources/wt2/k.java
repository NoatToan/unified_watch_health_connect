package wt2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f187201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f187202d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f187199a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0.c f187203e = null;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187204a;

        static {
            int[] iArr = new int[r.values().length];
            f187204a = iArr;
            try {
                iArr[r.TRANSFER_SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f187204a[r.RESEND_LAST_DATA_PACKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f187204a[r.ABORT_EPHEMERIS_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f187204a[r.ERROR_CRC_MISMATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f187204a[r.ERROR_DATA_OFFSET_MISMATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface b {
        void a(byte[] bArr, k7.b bVar);
    }

    public enum c {
        FILE_NOT_FOUND,
        FILE_IO_EXCEPTION,
        CAN_NOT_READ_FROM_FILE,
        DATA_TRANSFER_FAILED,
        REMOTE_DEVICE_ABORT_TRANSFER,
        REMOTE_DEVICE_CRC_ERROR
    }

    public k(int i14, b bVar, Logger logger) {
        this.f187200b = i14;
        this.f187201c = bVar;
        this.f187202d = logger;
    }

    public final void a() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f187199a;
        if (concurrentLinkedQueue.size() <= 0) {
            return;
        }
        Object objPoll = concurrentLinkedQueue.poll();
        while (true) {
            d dVar = (d) objPoll;
            Logger logger = this.f187202d;
            if (dVar == null) {
                logger.debug("transfer queue flushed");
                return;
            }
            String absolutePath = dVar.f187213b.getAbsolutePath();
            if (dVar.f187213b.delete()) {
                com.airbnb.lottie.animation.keyframe.a.w("deleted ", absolutePath, logger);
            }
            objPoll = concurrentLinkedQueue.poll();
        }
    }

    public final void b(byte[] bArr) {
        Logger logger = this.f187202d;
        if (bArr == null) {
            logger.error("processDataResponseMessage: msg is null");
            d(c.DATA_TRANSFER_FAILED);
            return;
        }
        try {
            d dVar = (d) this.f187199a.peek();
            if (dVar != null) {
                r rVar = r.f187231g.get(bArr[0]);
                if (rVar == null) {
                    rVar = r.ABORT_EPHEMERIS_REQUEST;
                }
                int i14 = a.f187204a[rVar.ordinal()];
                if (i14 == 1) {
                    if (dVar.f187213b.length() > dVar.f187215d) {
                        logger.debug("TRANSFER_SUCCESSFUL, sending next block");
                        c(dVar.f187214c, dVar.f187215d);
                        return;
                    }
                    logger.trace("done sending (" + dVar.f187213b.getAbsolutePath() + ")");
                    d(null);
                    return;
                }
                if (i14 == 2) {
                    logger.debug("RESEND_LAST_DATA_PACKET item:" + dVar.f187212a);
                    c(dVar.f187216e, dVar.f187217f);
                    return;
                }
                if (i14 == 3) {
                    logger.debug("ABORT_EPHEMERIS_REQUEST item:" + dVar.f187212a);
                    d(c.REMOTE_DEVICE_ABORT_TRANSFER);
                    return;
                }
                if (i14 == 4) {
                    logger.error("ERROR_CRC_MISMATCH item:" + dVar.f187212a);
                    d(c.REMOTE_DEVICE_CRC_ERROR);
                    return;
                }
                if (i14 == 5 && dVar.f187217f != dVar.f187215d) {
                    logger.warn("ERROR_DATA_OFFSET_MISMATCH " + dVar.f187217f + " curr:" + dVar.f187215d + " item:" + dVar.f187212a);
                    c(dVar.f187214c, dVar.f187215d);
                }
            }
        } catch (Exception e4) {
            logger.error("processDataResponseMessage", (Throwable) e4);
            d(c.DATA_TRANSFER_FAILED);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void c(int i14, int i15) throws Throwable {
        int i16 = this.f187200b;
        Logger logger = this.f187202d;
        d dVar = (d) this.f187199a.peek();
        if (dVar == null) {
            return;
        }
        ?? r14 = 0;
        r14 = 0;
        try {
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(dVar.f187213b));
                    try {
                        try {
                            o oVar = new o(i16);
                            byte[] bArr = oVar.f187222a;
                            oVar.c(dVar.f187212a);
                            int length = (int) dVar.f187213b.length();
                            bArr[8] = (byte) length;
                            bArr[9] = (byte) (length >> 8);
                            bArr[12] = (byte) i15;
                            bArr[13] = (byte) (i15 >> 8);
                            try {
                                int iB = oVar.b(bufferedInputStream, i15, i14, i16 - 12);
                                dVar.f187217f = i15;
                                dVar.f187216e = i14;
                                dVar.f187215d = i15 + iB;
                                dVar.f187214c = oVar.a(10);
                                logger.trace("sendDataMessage: " + oVar);
                                b bVar = this.f187201c;
                                int i17 = oVar.f187223b;
                                byte[] bArr2 = new byte[i17];
                                System.arraycopy(bArr, 0, bArr2, 0, i17);
                                bVar.a(bArr2, new j(this, 1));
                            } catch (IOException e4) {
                                logger.error("sendDataMessage: error occurred while trying to get file data", (Throwable) e4);
                                d(c.FILE_IO_EXCEPTION);
                            }
                            bufferedInputStream.close();
                            r14 = oVar;
                        } catch (Throwable th3) {
                            th = th3;
                            r14 = bufferedInputStream;
                            if (r14 != 0) {
                                try {
                                    r14.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e14) {
                        e = e14;
                        r14 = bufferedInputStream;
                        logger.error("sendDataMessage: can not find file to send data from", (Throwable) e);
                        d(c.FILE_NOT_FOUND);
                        if (r14 != 0) {
                            r14.close();
                            r14 = r14;
                        }
                    }
                } catch (IOException unused2) {
                }
            } catch (FileNotFoundException e15) {
                e = e15;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void d(c cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f187199a;
        d dVar = (d) concurrentLinkedQueue.peek();
        Logger logger = this.f187202d;
        if (dVar != null) {
            String absolutePath = dVar.f187213b.getAbsolutePath();
            if (dVar.f187213b.delete()) {
                logger.trace("deleted " + absolutePath);
            }
            m0.c cVar2 = this.f187203e;
            if (cVar2 != null) {
                cVar2.accept(cVar);
            }
            concurrentLinkedQueue.poll();
        }
        if (cVar == c.REMOTE_DEVICE_ABORT_TRANSFER) {
            logger.debug("remote device requested entire transfer be aborted, flush " + concurrentLinkedQueue.size() + " item(s) from queue");
            a();
            return;
        }
        if (cVar != c.DATA_TRANSFER_FAILED) {
            if (((d) concurrentLinkedQueue.peek()) != null) {
                c(0, 0);
            }
        } else {
            logger.debug("unable to send data to the remote device, flush " + concurrentLinkedQueue.size() + " item(s) from queue");
            a();
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f187212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f187213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f187215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f187216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f187217f;

        private d(k kVar) {
            this.f187212a = -1L;
            this.f187213b = null;
            this.f187214c = -1;
            this.f187215d = -1;
            this.f187216e = -1;
            this.f187217f = -1;
        }

        public /* synthetic */ d(k kVar, a aVar) {
            this(kVar);
        }
    }
}
