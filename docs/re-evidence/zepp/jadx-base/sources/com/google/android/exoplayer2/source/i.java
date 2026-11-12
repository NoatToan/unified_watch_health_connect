package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class i {
    private static final int h = 32;
    private final Allocator a;
    private final int b;
    private final ParsableByteArray c;
    private a d;
    private a e;
    private a f;
    private long g;

    public static final class a {
        public final long a;
        public final long b;
        public boolean c;

        @Nullable
        public Allocation d;

        @Nullable
        public a e;

        public a(long startPosition, int allocationLength) {
            this.a = startPosition;
            this.b = startPosition + ((long) allocationLength);
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public void b(Allocation allocation, a next) {
            this.d = allocation;
            this.e = next;
            this.c = true;
        }

        public int c(long absolutePosition) {
            return ((int) (absolutePosition - this.a)) + this.d.offset;
        }
    }

    public i(Allocator allocator) {
        this.a = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.b = individualAllocationLength;
        this.c = new ParsableByteArray(32);
        a aVar = new a(0L, individualAllocationLength);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    private void a(a aVar) {
        if (aVar.c) {
            a aVar2 = this.f;
            boolean z = aVar2.c;
            int i = (z ? 1 : 0) + (((int) (aVar2.a - aVar.a)) / this.b);
            Allocation[] allocationArr = new Allocation[i];
            for (int i2 = 0; i2 < i; i2++) {
                allocationArr[i2] = aVar.d;
                aVar = aVar.a();
            }
            this.a.release(allocationArr);
        }
    }

    private static a d(a allocationNode, long absolutePosition) {
        while (absolutePosition >= allocationNode.b) {
            allocationNode = allocationNode.e;
        }
        return allocationNode;
    }

    private void g(int length) {
        long j = this.g + ((long) length);
        this.g = j;
        a aVar = this.f;
        if (j == aVar.b) {
            this.f = aVar.e;
        }
    }

    private int h(int length) {
        a aVar = this.f;
        if (!aVar.c) {
            aVar.b(this.a.allocate(), new a(this.f.b, this.b));
        }
        return Math.min(length, (int) (this.f.b - this.g));
    }

    private static a i(a allocationNode, long absolutePosition, ByteBuffer target, int length) {
        a aVarD = d(allocationNode, absolutePosition);
        while (length > 0) {
            int iMin = Math.min(length, (int) (aVarD.b - absolutePosition));
            target.put(aVarD.d.data, aVarD.c(absolutePosition), iMin);
            length -= iMin;
            absolutePosition += (long) iMin;
            if (absolutePosition == aVarD.b) {
                aVarD = aVarD.e;
            }
        }
        return aVarD;
    }

    private static a j(a allocationNode, long absolutePosition, byte[] target, int length) {
        a aVarD = d(allocationNode, absolutePosition);
        int i = length;
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVarD.b - absolutePosition));
            System.arraycopy(aVarD.d.data, aVarD.c(absolutePosition), target, length - i, iMin);
            i -= iMin;
            absolutePosition += (long) iMin;
            if (absolutePosition == aVarD.b) {
                aVarD = aVarD.e;
            }
        }
        return aVarD;
    }

    private static a k(a allocationNode, DecoderInputBuffer buffer, SampleQueue.b extrasHolder, ParsableByteArray scratch) {
        int unsignedShort;
        long j = extrasHolder.b;
        scratch.reset(1);
        a aVarJ = j(allocationNode, j, scratch.getData(), 1);
        long j2 = j + 1;
        byte b = scratch.getData()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        CryptoInfo cryptoInfo = buffer.cryptoInfo;
        byte[] bArr = cryptoInfo.iv;
        if (bArr == null) {
            cryptoInfo.iv = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j2, cryptoInfo.iv, i);
        long j3 = j2 + ((long) i);
        if (z) {
            scratch.reset(2);
            aVarJ2 = j(aVarJ2, j3, scratch.getData(), 2);
            j3 += 2;
            unsignedShort = scratch.readUnsignedShort();
        } else {
            unsignedShort = 1;
        }
        int[] iArr = cryptoInfo.numBytesOfClearData;
        if (iArr == null || iArr.length < unsignedShort) {
            iArr = new int[unsignedShort];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < unsignedShort) {
            iArr3 = new int[unsignedShort];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = unsignedShort * 6;
            scratch.reset(i2);
            aVarJ2 = j(aVarJ2, j3, scratch.getData(), i2);
            j3 += (long) i2;
            scratch.setPosition(0);
            for (int i3 = 0; i3 < unsignedShort; i3++) {
                iArr2[i3] = scratch.readUnsignedShort();
                iArr4[i3] = scratch.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = extrasHolder.a - ((int) (j3 - extrasHolder.b));
        }
        TrackOutput.CryptoData cryptoData = (TrackOutput.CryptoData) Util.castNonNull(extrasHolder.c);
        cryptoInfo.set(unsignedShort, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        long j4 = extrasHolder.b;
        int i4 = (int) (j3 - j4);
        extrasHolder.b = j4 + ((long) i4);
        extrasHolder.a -= i4;
        return aVarJ2;
    }

    private static a l(a allocationNode, DecoderInputBuffer buffer, SampleQueue.b extrasHolder, ParsableByteArray scratch) {
        if (buffer.isEncrypted()) {
            allocationNode = k(allocationNode, buffer, extrasHolder, scratch);
        }
        if (!buffer.hasSupplementalData()) {
            buffer.ensureSpaceForWrite(extrasHolder.a);
            return i(allocationNode, extrasHolder.b, buffer.data, extrasHolder.a);
        }
        scratch.reset(4);
        a aVarJ = j(allocationNode, extrasHolder.b, scratch.getData(), 4);
        int unsignedIntToInt = scratch.readUnsignedIntToInt();
        extrasHolder.b += 4;
        extrasHolder.a -= 4;
        buffer.ensureSpaceForWrite(unsignedIntToInt);
        a aVarI = i(aVarJ, extrasHolder.b, buffer.data, unsignedIntToInt);
        extrasHolder.b += (long) unsignedIntToInt;
        int i = extrasHolder.a - unsignedIntToInt;
        extrasHolder.a = i;
        buffer.resetSupplementalData(i);
        return i(aVarI, extrasHolder.b, buffer.supplementalData, extrasHolder.a);
    }

    public void b(long absolutePosition) {
        a aVar;
        if (absolutePosition == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (absolutePosition < aVar.b) {
                break;
            }
            this.a.release(aVar.d);
            this.d = this.d.a();
        }
        if (this.e.a < aVar.a) {
            this.e = aVar;
        }
    }

    public void c(long totalBytesWritten) {
        this.g = totalBytesWritten;
        if (totalBytesWritten != 0) {
            a aVar = this.d;
            if (totalBytesWritten != aVar.a) {
                while (this.g > aVar.b) {
                    aVar = aVar.e;
                }
                a aVar2 = aVar.e;
                a(aVar2);
                a aVar3 = new a(aVar.b, this.b);
                aVar.e = aVar3;
                if (this.g == aVar.b) {
                    aVar = aVar3;
                }
                this.f = aVar;
                if (this.e == aVar2) {
                    this.e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.d);
        a aVar4 = new a(this.g, this.b);
        this.d = aVar4;
        this.e = aVar4;
        this.f = aVar4;
    }

    public long e() {
        return this.g;
    }

    public void f(DecoderInputBuffer buffer, SampleQueue.b extrasHolder) {
        l(this.e, buffer, extrasHolder, this.c);
    }

    public void m(DecoderInputBuffer buffer, SampleQueue.b extrasHolder) {
        this.e = l(this.e, buffer, extrasHolder, this.c);
    }

    public void n() {
        a(this.d);
        a aVar = new a(0L, this.b);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = 0L;
        this.a.trim();
    }

    public void o() {
        this.e = this.d;
    }

    public int p(DataReader input, int length, boolean allowEndOfInput) throws IOException {
        int iH = h(length);
        a aVar = this.f;
        int i = input.read(aVar.d.data, aVar.c(this.g), iH);
        if (i != -1) {
            g(i);
            return i;
        }
        if (allowEndOfInput) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(ParsableByteArray buffer, int length) {
        while (length > 0) {
            int iH = h(length);
            a aVar = this.f;
            buffer.readBytes(aVar.d.data, aVar.c(this.g), iH);
            length -= iH;
            g(iH);
        }
    }
}
