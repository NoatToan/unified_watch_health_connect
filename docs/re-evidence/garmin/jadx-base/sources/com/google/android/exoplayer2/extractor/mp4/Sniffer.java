package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes13.dex */
final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i14, boolean z14) {
        if ((i14 >>> 8) == 3368816) {
            return true;
        }
        if (i14 == 1751476579 && z14) {
            return true;
        }
        for (int i15 : COMPATIBLE_BRANDS) {
            if (i15 == i14) {
                return true;
            }
        }
        return false;
    }

    public static boolean sniffFragmented(ExtractorInput extractorInput) {
        return sniffInternal(extractorInput, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z14, boolean z15) {
        boolean z16;
        int i14;
        long length = extractorInput.getLength();
        long j8 = -1;
        int i15 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j14 = 4096;
        if (i15 != 0 && length <= 4096) {
            j14 = length;
        }
        int i16 = (int) j14;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i17 = 0;
        int i18 = 0;
        boolean z17 = false;
        while (true) {
            if (i18 < i16) {
                parsableByteArray.reset(8);
                if (extractorInput.peekFully(parsableByteArray.getData(), i17, 8, true)) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    int i19 = parsableByteArray.readInt();
                    if (unsignedInt == 1) {
                        extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                        parsableByteArray.setLimit(16);
                        i14 = 16;
                        unsignedInt = parsableByteArray.readLong();
                    } else {
                        if (unsignedInt == 0) {
                            long length2 = extractorInput.getLength();
                            if (length2 != j8) {
                                unsignedInt = (length2 - extractorInput.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i14 = 8;
                    }
                    long j15 = i14;
                    if (unsignedInt < j15) {
                        return i17;
                    }
                    int i24 = i18 + i14;
                    boolean z18 = i17;
                    if (i19 == 1836019574) {
                        i16 += (int) unsignedInt;
                        if (i15 != 0 && i16 > length) {
                            i16 = (int) length;
                        }
                        i18 = i24;
                        i17 = z18 ? 1 : 0;
                        j8 = -1;
                    } else {
                        if (i19 == 1836019558 || i19 == 1836475768) {
                            z16 = true;
                            return z17 && z14 == z16;
                        }
                        int i25 = i15;
                        if ((((long) i24) + unsignedInt) - j15 < i16) {
                            int i26 = (int) (unsignedInt - j15);
                            i18 = i24 + i26;
                            if (i19 == 1718909296) {
                                if (i26 < 8) {
                                    return z18;
                                }
                                parsableByteArray.reset(i26);
                                extractorInput.peekFully(parsableByteArray.getData(), z18 ? 1 : 0, i26);
                                int i27 = i26 / 4;
                                for (int i28 = 0; i28 < i27; i28++) {
                                    if (i28 != 1) {
                                        if (isCompatibleBrand(parsableByteArray.readInt(), z15)) {
                                            z17 = true;
                                            break;
                                        }
                                    } else {
                                        parsableByteArray.skipBytes(4);
                                    }
                                }
                                if (!z17) {
                                    return false;
                                }
                            } else if (i26 != 0) {
                                extractorInput.advancePeekPosition(i26);
                            }
                            i15 = i25;
                            j8 = -1;
                            i17 = 0;
                        }
                    }
                }
            }
            z16 = false;
            if (z17) {
                return false;
            }
        }
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) {
        return sniffInternal(extractorInput, false, false);
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput, boolean z14) {
        return sniffInternal(extractorInput, false, z14);
    }
}
