package com.google.android.exoplayer2.extractor.mkv;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
final class a implements com.google.android.exoplayer2.extractor.mkv.b {
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 4;
    private static final int l = 8;
    private static final int m = 8;
    private static final int n = 4;
    private static final int o = 8;
    private final byte[] a = new byte[8];
    private final ArrayDeque<b> b = new ArrayDeque<>();
    private final d c = new d();
    private EbmlProcessor d;
    private int e;
    private int f;
    private long g;

    public static final class b {
        private final int a;
        private final long b;

        private b(int elementId, long elementEndPosition) {
            this.a = elementId;
            this.b = elementEndPosition;
        }
    }

    @RequiresNonNull({"processor"})
    private long b(ExtractorInput input) throws IOException {
        input.resetPeekPosition();
        while (true) {
            input.peekFully(this.a, 0, 4);
            int iC = d.c(this.a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) d.a(this.a, iC, false);
                if (this.d.isLevel1Element(iA)) {
                    input.skipFully(iC);
                    return iA;
                }
            }
            input.skipFully(1);
        }
    }

    private double c(ExtractorInput input, int byteLength) throws IOException {
        long jD = d(input, byteLength);
        return byteLength == 4 ? Float.intBitsToFloat((int) jD) : Double.longBitsToDouble(jD);
    }

    private long d(ExtractorInput input, int byteLength) throws IOException {
        input.readFully(this.a, 0, byteLength);
        long j2 = 0;
        for (int i2 = 0; i2 < byteLength; i2++) {
            j2 = (j2 << 8) | ((long) (this.a[i2] & 255));
        }
        return j2;
    }

    private static String e(ExtractorInput input, int byteLength) throws IOException {
        if (byteLength == 0) {
            return "";
        }
        byte[] bArr = new byte[byteLength];
        input.readFully(bArr, 0, byteLength);
        while (byteLength > 0 && bArr[byteLength - 1] == 0) {
            byteLength--;
        }
        return new String(bArr, 0, byteLength);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.b
    public void a(EbmlProcessor processor) {
        this.d = processor;
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.b
    public boolean read(ExtractorInput input) throws IOException {
        Assertions.checkStateNotNull(this.d);
        while (true) {
            b bVarPeek = this.b.peek();
            if (bVarPeek != null && input.getPosition() >= bVarPeek.b) {
                this.d.endMasterElement(this.b.pop().a);
                return true;
            }
            if (this.e == 0) {
                long jD = this.c.d(input, true, false, 4);
                if (jD == -2) {
                    jD = b(input);
                }
                if (jD == -1) {
                    return false;
                }
                this.f = (int) jD;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(input, false, true, 8);
                this.e = 2;
            }
            int elementType = this.d.getElementType(this.f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = input.getPosition();
                    this.b.push(new b(this.f, this.g + position));
                    this.d.startMasterElement(this.f, position, this.g);
                    this.e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j2 = this.g;
                    if (j2 <= 8) {
                        this.d.integerElement(this.f, d(input, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw ParserException.createForMalformedContainer(sb.toString(), null);
                }
                if (elementType == 3) {
                    long j3 = this.g;
                    if (j3 <= ParserMinimalBase.MAX_INT_L) {
                        this.d.stringElement(this.f, e(input, (int) j3));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j3);
                    throw ParserException.createForMalformedContainer(sb2.toString(), null);
                }
                if (elementType == 4) {
                    this.d.binaryElement(this.f, (int) this.g, input);
                    this.e = 0;
                    return true;
                }
                if (elementType != 5) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Invalid element type ");
                    sb3.append(elementType);
                    throw ParserException.createForMalformedContainer(sb3.toString(), null);
                }
                long j4 = this.g;
                if (j4 == 4 || j4 == 8) {
                    this.d.floatElement(this.f, c(input, (int) j4));
                    this.e = 0;
                    return true;
                }
                StringBuilder sb4 = new StringBuilder(40);
                sb4.append("Invalid float size: ");
                sb4.append(j4);
                throw ParserException.createForMalformedContainer(sb4.toString(), null);
            }
            input.skipFully((int) this.g);
            this.e = 0;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.b
    public void reset() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }
}
