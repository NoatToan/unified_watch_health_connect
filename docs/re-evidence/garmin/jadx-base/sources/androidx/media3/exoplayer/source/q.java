package androidx.media3.exoplayer.source;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderInputBuffer;
import bb.l0;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import fa.z;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.b f9608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.r f9610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f9611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f9612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f9613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9614g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f9615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public xa.a f9617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f9618d;

        public a(long j8, int i14) {
            fa.a.d(this.f9617c == null);
            this.f9615a = j8;
            this.f9616b = j8 + ((long) i14);
        }
    }

    public q(xa.b bVar) {
        this.f9608a = bVar;
        int i14 = ((xa.f) bVar).f189674b;
        this.f9609b = i14;
        this.f9610c = new fa.r(32);
        a aVar = new a(0L, i14);
        this.f9611d = aVar;
        this.f9612e = aVar;
        this.f9613f = aVar;
    }

    public static a d(a aVar, long j8, ByteBuffer byteBuffer, int i14) {
        while (j8 >= aVar.f9616b) {
            aVar = aVar.f9618d;
        }
        while (i14 > 0) {
            int iMin = Math.min(i14, (int) (aVar.f9616b - j8));
            xa.a aVar2 = aVar.f9617c;
            byteBuffer.put(aVar2.f189665a, ((int) (j8 - aVar.f9615a)) + aVar2.f189666b, iMin);
            i14 -= iMin;
            j8 += (long) iMin;
            if (j8 == aVar.f9616b) {
                aVar = aVar.f9618d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, long j8, byte[] bArr, int i14) {
        while (j8 >= aVar.f9616b) {
            aVar = aVar.f9618d;
        }
        int i15 = i14;
        while (i15 > 0) {
            int iMin = Math.min(i15, (int) (aVar.f9616b - j8));
            xa.a aVar2 = aVar.f9617c;
            System.arraycopy(aVar2.f189665a, ((int) (j8 - aVar.f9615a)) + aVar2.f189666b, bArr, i14 - i15, iMin);
            i15 -= iMin;
            j8 += (long) iMin;
            if (j8 == aVar.f9616b) {
                aVar = aVar.f9618d;
            }
        }
        return aVar;
    }

    public static a f(a aVar, DecoderInputBuffer decoderInputBuffer, r.b bVar, fa.r rVar) {
        if (decoderInputBuffer.b(1073741824)) {
            long j8 = bVar.f9646b;
            int iA = 1;
            rVar.D(1);
            a aVarE = e(aVar, j8, rVar.f70054a, 1);
            long j14 = j8 + 1;
            byte b14 = rVar.f70054a[0];
            boolean z14 = (b14 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
            int i14 = b14 & Ascii.DEL;
            ia.b bVar2 = decoderInputBuffer.f8630c;
            byte[] bArr = bVar2.f92373a;
            if (bArr == null) {
                bVar2.f92373a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = e(aVarE, j14, bVar2.f92373a, i14);
            long j15 = j14 + ((long) i14);
            if (z14) {
                rVar.D(2);
                aVar = e(aVar, j15, rVar.f70054a, 2);
                j15 += 2;
                iA = rVar.A();
            }
            int[] iArr = bVar2.f92376d;
            if (iArr == null || iArr.length < iA) {
                iArr = new int[iA];
            }
            int[] iArr2 = bVar2.f92377e;
            if (iArr2 == null || iArr2.length < iA) {
                iArr2 = new int[iA];
            }
            if (z14) {
                int i15 = iA * 6;
                rVar.D(i15);
                aVar = e(aVar, j15, rVar.f70054a, i15);
                j15 += (long) i15;
                rVar.G(0);
                for (int i16 = 0; i16 < iA; i16++) {
                    iArr[i16] = rVar.A();
                    iArr2[i16] = rVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f9645a - ((int) (j15 - bVar.f9646b));
            }
            l0.a aVar2 = bVar.f9647c;
            int i17 = z.f70071a;
            byte[] bArr2 = aVar2.f17216b;
            byte[] bArr3 = bVar2.f92373a;
            int i18 = aVar2.f17215a;
            int i19 = aVar2.f17217c;
            int i24 = aVar2.f17218d;
            bVar2.f92378f = iA;
            bVar2.f92376d = iArr;
            bVar2.f92377e = iArr2;
            bVar2.f92374b = bArr2;
            bVar2.f92373a = bArr3;
            bVar2.f92375c = i18;
            bVar2.f92379g = i19;
            bVar2.f92380h = i24;
            MediaCodec.CryptoInfo cryptoInfo = bVar2.f92381i;
            cryptoInfo.numSubSamples = iA;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i18;
            if (z.f70071a >= 24) {
                ia.b.C1763b c1763b = bVar2.f92382j;
                c1763b.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = c1763b.f92384b;
                pattern.set(i19, i24);
                c1763b.f92383a.setPattern(pattern);
            }
            long j16 = bVar.f9646b;
            int i25 = (int) (j15 - j16);
            bVar.f9646b = j16 + ((long) i25);
            bVar.f9645a -= i25;
        }
        if (!decoderInputBuffer.b(268435456)) {
            decoderInputBuffer.e(bVar.f9645a);
            return d(aVar, bVar.f9646b, decoderInputBuffer.f8631d, bVar.f9645a);
        }
        rVar.D(4);
        a aVarE2 = e(aVar, bVar.f9646b, rVar.f70054a, 4);
        int iY = rVar.y();
        bVar.f9646b += 4;
        bVar.f9645a -= 4;
        decoderInputBuffer.e(iY);
        a aVarD = d(aVarE2, bVar.f9646b, decoderInputBuffer.f8631d, iY);
        bVar.f9646b += (long) iY;
        int i26 = bVar.f9645a - iY;
        bVar.f9645a = i26;
        ByteBuffer byteBuffer = decoderInputBuffer.f8634g;
        if (byteBuffer == null || byteBuffer.capacity() < i26) {
            decoderInputBuffer.f8634g = ByteBuffer.allocate(i26);
        } else {
            decoderInputBuffer.f8634g.clear();
        }
        return d(aVarD, bVar.f9646b, decoderInputBuffer.f8634g, bVar.f9645a);
    }

    public final void a(a aVar) {
        if (aVar.f9617c == null) {
            return;
        }
        xa.f fVar = (xa.f) this.f9608a;
        synchronized (fVar) {
            a aVar2 = aVar;
            while (aVar2 != null) {
                try {
                    xa.a[] aVarArr = fVar.f189679g;
                    int i14 = fVar.f189678f;
                    fVar.f189678f = i14 + 1;
                    xa.a aVar3 = aVar2.f9617c;
                    aVar3.getClass();
                    aVarArr[i14] = aVar3;
                    fVar.f189677e--;
                    aVar2 = aVar2.f9618d;
                    if (aVar2 == null || aVar2.f9617c == null) {
                        aVar2 = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            fVar.notifyAll();
        }
        aVar.f9617c = null;
        aVar.f9618d = null;
    }

    public final void b(long j8) {
        a aVar;
        if (j8 == -1) {
            return;
        }
        while (true) {
            aVar = this.f9611d;
            if (j8 < aVar.f9616b) {
                break;
            }
            xa.b bVar = this.f9608a;
            xa.a aVar2 = aVar.f9617c;
            xa.f fVar = (xa.f) bVar;
            synchronized (fVar) {
                xa.a[] aVarArr = fVar.f189679g;
                int i14 = fVar.f189678f;
                fVar.f189678f = i14 + 1;
                aVarArr[i14] = aVar2;
                fVar.f189677e--;
                fVar.notifyAll();
            }
            a aVar3 = this.f9611d;
            aVar3.f9617c = null;
            a aVar4 = aVar3.f9618d;
            aVar3.f9618d = null;
            this.f9611d = aVar4;
        }
        if (this.f9612e.f9615a < aVar.f9615a) {
            this.f9612e = aVar;
        }
    }

    public final int c(int i14) {
        xa.a aVar;
        a aVar2 = this.f9613f;
        if (aVar2.f9617c == null) {
            xa.f fVar = (xa.f) this.f9608a;
            synchronized (fVar) {
                try {
                    fVar.f189677e++;
                    int i15 = fVar.f189678f;
                    if (i15 > 0) {
                        xa.a[] aVarArr = fVar.f189679g;
                        int i16 = i15 - 1;
                        fVar.f189678f = i16;
                        aVar = aVarArr[i16];
                        aVar.getClass();
                        fVar.f189679g[fVar.f189678f] = null;
                    } else {
                        aVar = new xa.a(new byte[fVar.f189674b], 0);
                        int i17 = fVar.f189677e;
                        xa.a[] aVarArr2 = fVar.f189679g;
                        if (i17 > aVarArr2.length) {
                            fVar.f189679g = (xa.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            a aVar3 = new a(this.f9613f.f9616b, this.f9609b);
            aVar2.f9617c = aVar;
            aVar2.f9618d = aVar3;
        }
        return Math.min(i14, (int) (this.f9613f.f9616b - this.f9614g));
    }
}
