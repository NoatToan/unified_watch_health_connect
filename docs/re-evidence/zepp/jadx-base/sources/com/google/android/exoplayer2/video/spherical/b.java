package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
final class b {
    private static final int a = 2037673328;
    private static final int b = 1836279920;
    private static final int c = 1918990112;
    private static final int d = 1684433976;
    private static final int e = 1835365224;
    private static final int f = 1886547818;
    private static final int g = 10000;
    private static final int h = 32000;
    private static final int i = 128000;

    private b() {
    }

    @Nullable
    public static Projection a(byte[] projectionData, int stereoMode) {
        ArrayList<Projection.Mesh> arrayListF;
        ParsableByteArray parsableByteArray = new ParsableByteArray(projectionData);
        try {
            arrayListF = c(parsableByteArray) ? f(parsableByteArray) : e(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new Projection(arrayListF.get(0), stereoMode);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(arrayListF.get(0), arrayListF.get(1), stereoMode);
    }

    private static int b(int n) {
        return (-(n & 1)) ^ (n >> 1);
    }

    private static boolean c(ParsableByteArray input) {
        input.skipBytes(4);
        int i2 = input.readInt();
        input.setPosition(0);
        return i2 == 1886547818;
    }

    @Nullable
    private static Projection.Mesh d(ParsableByteArray input) {
        int i2 = input.readInt();
        if (i2 > 10000) {
            return null;
        }
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = input.readFloat();
        }
        int i4 = input.readInt();
        if (i4 > 32000) {
            return null;
        }
        double d2 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) i2) * 2.0d) / dLog);
        ParsableBitArray parsableBitArray = new ParsableBitArray(input.getData());
        int i5 = 8;
        parsableBitArray.setPosition(input.getPosition() * 8);
        float[] fArr2 = new float[i4 * 5];
        int i6 = 5;
        int[] iArr = new int[5];
        int i7 = 0;
        int i8 = 0;
        while (i7 < i4) {
            int i9 = 0;
            while (i9 < i6) {
                int iB = iArr[i9] + b(parsableBitArray.readBits(iCeil));
                if (iB >= i2 || iB < 0) {
                    return null;
                }
                fArr2[i8] = fArr[iB];
                iArr[i9] = iB;
                i9++;
                i8++;
                i6 = 5;
            }
            i7++;
            i6 = 5;
        }
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i10 = 32;
        int bits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[bits];
        int i11 = 0;
        while (i11 < bits) {
            int bits2 = parsableBitArray.readBits(i5);
            int bits3 = parsableBitArray.readBits(i5);
            int bits4 = parsableBitArray.readBits(i10);
            if (bits4 > i) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) i4) * d2) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int iB2 = 0;
            for (int i12 = 0; i12 < bits4; i12++) {
                iB2 += b(parsableBitArray.readBits(iCeil2));
                if (iB2 < 0 || iB2 >= i4) {
                    return null;
                }
                int i13 = i12 * 3;
                int i14 = iB2 * 5;
                fArr3[i13] = fArr2[i14];
                fArr3[i13 + 1] = fArr2[i14 + 1];
                fArr3[i13 + 2] = fArr2[i14 + 2];
                int i15 = i12 * 2;
                fArr4[i15] = fArr2[i14 + 3];
                fArr4[i15 + 1] = fArr2[i14 + 4];
            }
            subMeshArr[i11] = new Projection.SubMesh(bits2, fArr3, fArr4, bits3);
            i11++;
            i10 = 32;
            d2 = 2.0d;
            i5 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> e(ParsableByteArray input) {
        if (input.readUnsignedByte() != 0) {
            return null;
        }
        input.skipBytes(7);
        int i2 = input.readInt();
        if (i2 == d) {
            ParsableByteArray parsableByteArray = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(input, parsableByteArray, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                input = parsableByteArray;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (i2 != c) {
            return null;
        }
        return g(input);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> f(ParsableByteArray input) {
        int i2;
        input.skipBytes(8);
        int position = input.getPosition();
        int iLimit = input.limit();
        while (position < iLimit && (i2 = input.readInt() + position) > position && i2 <= iLimit) {
            int i3 = input.readInt();
            if (i3 == a || i3 == b) {
                input.setLimit(i2);
                return e(input);
            }
            input.setPosition(i2);
            position = i2;
        }
        return null;
    }

    @Nullable
    private static ArrayList<Projection.Mesh> g(ParsableByteArray input) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = input.getPosition();
        int iLimit = input.limit();
        while (position < iLimit) {
            int i2 = input.readInt() + position;
            if (i2 <= position || i2 > iLimit) {
                return null;
            }
            if (input.readInt() == e) {
                Projection.Mesh meshD = d(input);
                if (meshD == null) {
                    return null;
                }
                arrayList.add(meshD);
            }
            input.setPosition(i2);
            position = i2;
        }
        return arrayList;
    }
}
