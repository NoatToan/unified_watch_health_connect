package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class f {
    public static final int b = 1751476579;
    private static final int c = 4096;
    public static final int a = 1903435808;
    private static final int[] d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, a.h, a.k, a.l, a.q, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, a, 1297305174, 1684175153, 1769172332, 1885955686};

    private f() {
    }

    private static boolean a(int brand, boolean acceptHeic) {
        if ((brand >>> 8) == 3368816) {
            return true;
        }
        if (brand == 1751476579 && acceptHeic) {
            return true;
        }
        for (int i : d) {
            if (i == brand) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(ExtractorInput input) throws IOException {
        return c(input, true, false);
    }

    private static boolean c(ExtractorInput extractorInput, boolean z, boolean z2) throws IOException {
        boolean z3;
        long length = extractorInput.getLength();
        long j = 4096;
        long j2 = -1;
        if (length != -1 && length <= 4096) {
            j = length;
        }
        int i = (int) j;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = false;
        while (true) {
            if (i2 < i) {
                parsableByteArray.reset(8);
                if (extractorInput.peekFully(parsableByteArray.getData(), z4 ? 1 : 0, 8, true)) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    int i3 = parsableByteArray.readInt();
                    int i4 = 16;
                    if (unsignedInt == 1) {
                        extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                        parsableByteArray.setLimit(16);
                        unsignedInt = parsableByteArray.readLong();
                    } else {
                        if (unsignedInt == 0) {
                            long length2 = extractorInput.getLength();
                            if (length2 != j2) {
                                unsignedInt = (length2 - extractorInput.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i4 = 8;
                    }
                    long j3 = i4;
                    if (unsignedInt < j3) {
                        return z4;
                    }
                    i2 += i4;
                    if (i3 == 1836019574) {
                        i += (int) unsignedInt;
                        if (length != -1 && i > length) {
                            i = (int) length;
                        }
                        j2 = -1;
                    } else {
                        if (i3 == 1836019558 || i3 == 1836475768) {
                            z3 = true;
                            return !z5 && z == z3;
                        }
                        long j4 = length;
                        if ((((long) i2) + unsignedInt) - j3 < i) {
                            int i5 = (int) (unsignedInt - j3);
                            i2 += i5;
                            if (i3 == 1718909296) {
                                if (i5 < 8) {
                                    return false;
                                }
                                parsableByteArray.reset(i5);
                                extractorInput.peekFully(parsableByteArray.getData(), 0, i5);
                                int i6 = i5 / 4;
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if (i7 != 1) {
                                        if (a(parsableByteArray.readInt(), z2)) {
                                            z5 = true;
                                            break;
                                        }
                                    } else {
                                        parsableByteArray.skipBytes(4);
                                    }
                                }
                                if (!z5) {
                                    return false;
                                }
                            } else if (i5 != 0) {
                                extractorInput.advancePeekPosition(i5);
                            }
                            length = j4;
                            j2 = -1;
                            z4 = false;
                        }
                    }
                }
            }
            z3 = false;
            if (z5) {
            }
        }
    }

    public static boolean d(ExtractorInput input) throws IOException {
        return c(input, false, false);
    }

    public static boolean e(ExtractorInput input, boolean acceptHeic) throws IOException {
        return c(input, false, acceptHeic);
    }
}
