package ys2;

import bs2.q4;
import com.garmin.gfdi.file.FileException;
import com.google.common.primitives.UnsignedBytes;
import o13.r;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import rs2.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lys2/a;", "Lys2/g;", "Lrs2/v;", "messenger", "Lys2/e;", "fileData", "", "windowBits", "bufferSize", "<init>", "(Lrs2/v;Lys2/e;II)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C3733a f199179i = new C3733a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f199180j = LoggerFactory.getLogger("GFDI#CompressedFileSender");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f199181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f199182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f199184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f199185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f199186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f199187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f199188h;

    public a(v vVar, e eVar, int i14, int i15) {
        vVar.getClass();
        eVar.getClass();
        this.f199181a = vVar;
        this.f199182b = eVar;
        this.f199183c = i14;
        this.f199184d = zl.a.e("CompressedFileSender", s0.f129406a.plus(ge1.b.h()));
        this.f199185e = vVar.c() - 8;
        this.f199187g = new byte[i15];
        f199179i.getClass();
        if (9 > i14 || i14 >= 16) {
            vb.h.s("windowBits must be in valid range");
            throw null;
        }
    }

    @Override // ys2.g
    public final int a(int i14) {
        int i15 = this.f199185e;
        byte[] bArr = new byte[i15];
        int i16 = 0;
        int iA = 0;
        while (i16 < i14) {
            int iMin = Math.min(i15, i14 - i16);
            this.f199182b.a(0, iMin, bArr);
            for (int i17 = 0; i17 < iMin; i17++) {
                iA = q4.a(bArr[i17], iA);
            }
            i16 += iMin;
        }
        return iA;
    }

    @Override // ys2.g
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF199188h() {
        return this.f199188h;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0161 A[Catch: all -> 0x0196, TryCatch #10 {all -> 0x0196, blocks: (B:40:0x015a, B:42:0x0161, B:44:0x017f, B:46:0x0187, B:51:0x01a2, B:56:0x01c0), top: B:128:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x017f A[Catch: all -> 0x0196, TryCatch #10 {all -> 0x0196, blocks: (B:40:0x015a, B:42:0x0161, B:44:0x017f, B:46:0x0187, B:51:0x01a2, B:56:0x01c0), top: B:128:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0187 A[Catch: all -> 0x0196, LOOP:0: B:45:0x0185->B:46:0x0187, LOOP_END, TryCatch #10 {all -> 0x0196, blocks: (B:40:0x015a, B:42:0x0161, B:44:0x017f, B:46:0x0187, B:51:0x01a2, B:56:0x01c0), top: B:128:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01a2 A[Catch: all -> 0x0196, TryCatch #10 {all -> 0x0196, blocks: (B:40:0x015a, B:42:0x0161, B:44:0x017f, B:46:0x0187, B:51:0x01a2, B:56:0x01c0), top: B:128:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0232 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0233  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0147 -> B:128:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0233 -> B:14:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ys2.g
    public final java.io.Serializable c(int r27, int r28, boolean r29, e23.p r30, v13.c r31) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ys2.a.c(int, int, boolean, e23.p, v13.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(int i14, int i15, boolean z14, byte[] bArr, int i16, boolean z15, v13.c cVar) throws FileException {
        b bVar;
        int iMin;
        boolean z16;
        Object objB;
        boolean z17;
        int i17;
        int i18 = i14;
        int i19 = i15;
        byte b14 = z14;
        byte[] bArr2 = bArr;
        int i24 = i16;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i25 = bVar.f199198j;
            if ((i25 & Integer.MIN_VALUE) != 0) {
                bVar.f199198j = i25 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f199196h;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i26 = bVar.f199198j;
        if (i26 == 0) {
            r.b(obj);
            iMin = Math.min(bArr2.length - i24, this.f199185e);
            if (iMin <= 0) {
                vb.h.s("Invalid compressedOffset supplied");
                return null;
            }
            byte[] bArr3 = new byte[iMin + 8];
            bArr3[0] = (byte) this.f199186f;
            bArr3[1] = b14;
            if (i24 + iMin >= bArr2.length) {
                bArr3[1] = (byte) (b14 | 2);
            }
            jg.b.U(bArr3, 2, i18);
            jg.b.T(6, i19, bArr3);
            System.arraycopy(bArr2, i24, bArr3, 8, iMin);
            bVar.f199195g = bArr2;
            bVar.f199189a = i18;
            bVar.f199190b = i19;
            bVar.f199193e = b14;
            bVar.f199191c = i24;
            z16 = z15;
            bVar.f199194f = z16;
            bVar.f199192d = iMin;
            bVar.f199198j = 1;
            objB = this.f199181a.b(5054, bArr3, bVar);
            z17 = b14;
            if (objB != obj2) {
            }
        }
        if (i26 != 1) {
            if (i26 == 2) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i27 = bVar.f199192d;
        boolean z18 = bVar.f199194f;
        int i28 = bVar.f199191c;
        boolean z19 = bVar.f199193e;
        int i29 = bVar.f199190b;
        int i30 = bVar.f199189a;
        byte[] bArr4 = bVar.f199195g;
        r.b(obj);
        iMin = i27;
        i18 = i30;
        objB = obj;
        z16 = z18;
        i19 = i29;
        i24 = i28;
        z17 = z19;
        bArr2 = bArr4;
        byte[] bArr5 = (byte[]) objB;
        if (bArr5.length < 2) {
            throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bArr5.length, "File data response is too short: "));
        }
        int i34 = bArr5[0] & UnsignedBytes.MAX_VALUE;
        byte b15 = bArr5[1];
        Logger logger = f199180j;
        if (b15 == 0) {
            int i35 = this.f199186f;
            if (i34 != i35) {
                if (z16) {
                    logger.error("Packet counter still wrong after retry. Transfer cannot continue");
                    throw new FileException(FileException.a.UNEXPECTED_PACKET_COUNTER);
                }
                logger.warn(am.j.g(i34, i35, "Unexpected packet counter received ", " expected ", ". Retrying message."));
                bVar.f199195g = null;
                bVar.f199198j = 2;
                Object objD = d(i18, i19, z17, bArr2, i24, true, bVar);
                return objD == obj2 ? obj2 : objD;
            }
            i17 = 255;
        } else {
            if (b15 == 1) {
                logger.error("ABORT_TRANSFER response received");
                throw new FileException(FileException.a.CANCELLED_BY_DEVICE);
            }
            if (b15 == 2) {
                logger.error("INCORRECT_CRC response received");
                throw new FileException(FileException.a.CRC_MISMATCH);
            }
            if (b15 == 3) {
                logger.error("DECOMPRESS_FAILURE response received");
                throw new FileException(FileException.a.COMPRESSION_ERROR);
            }
            if (b15 != 4) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(b15, "Invalid file data status "));
            }
            if (bArr5.length < 3) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bArr5.length, "File data response is too short: "));
            }
            i17 = 255;
            if (i34 + 1 != (bArr5[2] & UnsignedBytes.MAX_VALUE) || i34 != this.f199186f) {
                throw new FileException(FileException.a.UNEXPECTED_PACKET_COUNTER);
            }
        }
        int i36 = this.f199186f + 1;
        this.f199186f = i36;
        if (i36 > i17) {
            this.f199186f = 0;
        }
        return new Integer(iMin);
    }

    /* JADX INFO: renamed from: ys2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lys2/a$a;", "", "<init>", "()V", "", "MESSAGE_OVERHEAD_BYTE_COUNT", "I", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3733a {
        public /* synthetic */ C3733a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3733a() {
        }
    }

    public /* synthetic */ a(v vVar, e eVar, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(vVar, eVar, i14, (i16 & 8) != 0 ? 32768 : i15);
    }
}
