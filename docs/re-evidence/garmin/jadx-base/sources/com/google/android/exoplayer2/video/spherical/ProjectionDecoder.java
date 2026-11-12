package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes14.dex */
final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private ProjectionDecoder() {
    }

    public static Projection decode(byte[] bArr, int i14) {
        ArrayList<Projection.Mesh> proj;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            proj = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new Projection(proj.get(0), i14);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(proj.get(0), proj.get(1), i14);
    }

    private static int decodeZigZag(int i14) {
        return (-(i14 & 1)) ^ (i14 >> 1);
    }

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int i14 = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return i14 == 1886547818;
    }

    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int i14 = parsableByteArray.readInt();
        Projection.Mesh mesh = null;
        if (i14 > 10000) {
            return null;
        }
        float[] fArr = new float[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            fArr[i15] = parsableByteArray.readFloat();
        }
        int i16 = parsableByteArray.readInt();
        if (i16 > MAX_VERTEX_COUNT) {
            return null;
        }
        double d14 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) i14) * 2.0d) / dLog);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        int i17 = 8;
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[i16 * 5];
        int[] iArr = new int[5];
        int i18 = 0;
        int i19 = 0;
        while (i18 < i16) {
            Projection.Mesh mesh2 = mesh;
            int i24 = 0;
            while (i24 < 5) {
                int iDecodeZigZag = iArr[i24] + decodeZigZag(parsableBitArray.readBits(iCeil));
                if (iDecodeZigZag >= i14 || iDecodeZigZag < 0) {
                    return mesh2;
                }
                fArr2[i19] = fArr[iDecodeZigZag];
                iArr[i24] = iDecodeZigZag;
                i24++;
                i19++;
            }
            i18++;
            mesh = mesh2;
        }
        Projection.Mesh mesh3 = mesh;
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i25 = 32;
        int bits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[bits];
        int i26 = 0;
        while (i26 < bits) {
            int bits2 = parsableBitArray.readBits(i17);
            int bits3 = parsableBitArray.readBits(i17);
            int bits4 = parsableBitArray.readBits(i25);
            if (bits4 > MAX_TRIANGLE_INDICES) {
                return mesh3;
            }
            int i27 = bits;
            int iCeil2 = (int) Math.ceil(Math.log(((double) i16) * d14) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int i28 = 0;
            int i29 = 0;
            while (i28 < bits4) {
                int iDecodeZigZag2 = i29 + decodeZigZag(parsableBitArray.readBits(iCeil2));
                if (iDecodeZigZag2 < 0 || iDecodeZigZag2 >= i16) {
                    return mesh3;
                }
                int i30 = i28 * 3;
                int i34 = iDecodeZigZag2 * 5;
                fArr3[i30] = fArr2[i34];
                fArr3[i30 + 1] = fArr2[i34 + 1];
                fArr3[i30 + 2] = fArr2[i34 + 2];
                int i35 = i28 * 2;
                fArr4[i35] = fArr2[i34 + 3];
                fArr4[i35 + 1] = fArr2[i34 + 4];
                i28++;
                i29 = iDecodeZigZag2;
            }
            subMeshArr[i26] = new Projection.SubMesh(bits2, fArr3, fArr4, bits3);
            i26++;
            bits = i27;
            i25 = 32;
            d14 = 2.0d;
            i17 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int i14 = parsableByteArray.readInt();
        if (i14 == TYPE_DFL8) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } catch (Throwable th3) {
                inflater.end();
                throw th3;
            }
        } else if (i14 != TYPE_RAW) {
            return null;
        }
        return parseRawMshpData(parsableByteArray);
    }

    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        int i14;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && (i14 = parsableByteArray.readInt() + position) > position && i14 <= iLimit) {
            int i15 = parsableByteArray.readInt();
            if (i15 == TYPE_YTMP || i15 == TYPE_MSHP) {
                parsableByteArray.setLimit(i14);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(i14);
            position = i14;
        }
        return null;
    }

    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i14 = parsableByteArray.readInt() + position;
            if (i14 <= position || i14 > iLimit) {
                return null;
            }
            if (parsableByteArray.readInt() == TYPE_MESH) {
                Projection.Mesh mesh = parseMesh(parsableByteArray);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            parsableByteArray.setPosition(i14);
            position = i14;
        }
        return arrayList;
    }
}
