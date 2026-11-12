package ys2;

import androidx.media3.common.PlaybackException;
import androidx.room.a0;
import bs2.q4;
import com.garmin.gfdi.file.FileException;
import java.io.Serializable;
import o13.r;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.u;
import rs2.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lys2/p;", "Lys2/g;", "Lrs2/v;", "messenger", "Lys2/e;", "fileData", "<init>", "(Lrs2/v;Lys2/e;)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f199254e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f199255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f199256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f199258d;

    static {
        a aVar = new a(null);
        rs2.d.f154380a.getClass();
        f199254e = LoggerFactory.getLogger(rs2.d.a("StandardFileSender", -1L, aVar, null));
    }

    public p(v vVar, e eVar) {
        vVar.getClass();
        eVar.getClass();
        this.f199255a = vVar;
        this.f199256b = eVar;
        this.f199257c = vVar.c() - 7;
    }

    @Override // ys2.g
    public final int a(int i14) {
        int i15 = this.f199257c;
        byte[] bArr = new byte[i15];
        int i16 = 0;
        int iA = 0;
        while (i16 < i14) {
            int iMin = Math.min(i15, i14 - i16);
            this.f199256b.a(0, iMin, bArr);
            for (int i17 = 0; i17 < iMin; i17++) {
                iA = q4.a(bArr[i17], iA);
            }
            i16 += iMin;
        }
        return iA;
    }

    @Override // ys2.g
    public final int b() {
        Integer num = this.f199258d;
        if (num == null) {
            return 0;
        }
        return this.f199256b.getSize() - num.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ys2.g
    public final Serializable c(int i14, int i15, boolean z14, e23.p pVar, v13.c cVar) throws FileException {
        q qVar;
        int iA;
        Object objB;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i16 = qVar.f199265g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                qVar.f199265g = i16 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.f199263e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = qVar.f199265g;
        int i18 = this.f199257c;
        e eVar = this.f199256b;
        try {
            if (i17 == 0) {
                r.b(obj);
                if (this.f199258d == null) {
                    this.f199258d = new Integer(i14);
                }
                int iMin = Math.min(eVar.getSize() - i14, i18);
                int i19 = iMin + 7;
                byte[] bArr = new byte[i19];
                bArr[0] = z14 ? (byte) 1 : (byte) 0;
                jg.b.U(bArr, 3, i14);
                if (eVar.a(7, iMin, bArr) < iMin) {
                    throw new FileException(FileException.a.INTERNAL_ERROR, "Incorrect file size supplied");
                }
                iA = i15;
                for (int i24 = 7; i24 < i19; i24++) {
                    iA = q4.a(bArr[i24], iA);
                }
                jg.b.T(1, iA, bArr);
                v vVar = this.f199255a;
                qVar.f199259a = i14;
                qVar.f199260b = i15;
                qVar.f199262d = z14;
                qVar.f199261c = iA;
                qVar.f199265g = 1;
                objB = vVar.b(PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED, bArr, qVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i25 = qVar.f199261c;
                z14 = qVar.f199262d;
                i15 = qVar.f199260b;
                int i26 = qVar.f199259a;
                r.b(obj);
                iA = i25;
                i14 = i26;
                objB = obj;
            }
            byte[] bArr2 = (byte[]) objB;
            Byte bF = u.F(bArr2);
            Integer num = bF != null ? new Integer(bF.byteValue()) : null;
            if (num == null) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bArr2.length, "File data response is too short: "));
            }
            if (num.intValue() != 0) {
                if (num.intValue() == 1) {
                    eVar.b(i14);
                    return new o13.u(new Integer(i14), new Integer(i15), Boolean.valueOf(z14));
                }
                if (num.intValue() == 2) {
                    throw new FileException(FileException.a.CANCELLED_BY_DEVICE);
                }
                if (num.intValue() == 3) {
                    throw new FileException(FileException.a.CRC_MISMATCH);
                }
                if (num.intValue() == 4) {
                    throw new FileException(FileException.a.OFFSET_MISMATCH);
                }
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, a0.g(num, "Invalid file data status "));
            }
            if (bArr2.length < 5) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bArr2.length, "File data response is too short: "));
            }
            int iL = (int) jg.b.L(1, bArr2);
            if (iL == eVar.getSize()) {
                return new o13.u(null, new Integer(iA), Boolean.FALSE);
            }
            int i27 = i14 + i18;
            if (iL == i27) {
                return new o13.u(new Integer(iL), new Integer(iA), Boolean.FALSE);
            }
            f199254e.warn("Send file expected dataOffset: " + i27 + ", nextDataOffset: " + iL);
            throw new FileException(FileException.a.OFFSET_MISMATCH, "Device reported unexpected data offset");
        } catch (Exception e4) {
            throw new FileException(e4);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lys2/p$a;", "", "<init>", "()V", "", "MESSAGE_OVERHEAD_BYTE_COUNT", "I", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
