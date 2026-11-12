package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class DvbParser {
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, Ascii.SI};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private Bitmap bitmap;
    private final Canvas canvas;
    private final ClutDefinition defaultClutDefinition;
    private final DisplayDefinition defaultDisplayDefinition;
    private final Paint defaultPaint;
    private final Paint fillRegionPaint;
    private final SubtitleService subtitleService;

    public static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f53090id;

        public ClutDefinition(int i14, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f53090id = i14;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    public static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i14, int i15, int i16, int i17, int i18, int i19) {
            this.width = i14;
            this.height = i15;
            this.horizontalPositionMinimum = i16;
            this.horizontalPositionMaximum = i17;
            this.verticalPositionMinimum = i18;
            this.verticalPositionMaximum = i19;
        }
    }

    public static final class ObjectData {
        public final byte[] bottomFieldData;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f53091id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i14, boolean z14, byte[] bArr, byte[] bArr2) {
            this.f53091id = i14;
            this.nonModifyingColorFlag = z14;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    public static final class PageComposition {
        public final SparseArray<PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i14, int i15, int i16, SparseArray<PageRegion> sparseArray) {
            this.timeOutSecs = i14;
            this.version = i15;
            this.state = i16;
            this.regions = sparseArray;
        }
    }

    public static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i14, int i15) {
            this.horizontalAddress = i14;
            this.verticalAddress = i15;
        }
    }

    public static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f53092id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i14, boolean z14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, SparseArray<RegionObject> sparseArray) {
            this.f53092id = i14;
            this.fillFlag = z14;
            this.width = i15;
            this.height = i16;
            this.levelOfCompatibility = i17;
            this.depth = i18;
            this.clutId = i19;
            this.pixelCode8Bit = i24;
            this.pixelCode4Bit = i25;
            this.pixelCode2Bit = i26;
            this.regionObjects = sparseArray;
        }

        public void mergeFrom(RegionComposition regionComposition) {
            SparseArray<RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                this.regionObjects.put(sparseArray.keyAt(i14), sparseArray.valueAt(i14));
            }
        }
    }

    public static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i14, int i15, int i16, int i17, int i18, int i19) {
            this.type = i14;
            this.provider = i15;
            this.horizontalPosition = i16;
            this.verticalPosition = i17;
            this.foregroundPixelCode = i18;
            this.backgroundPixelCode = i19;
        }
    }

    public static final class SubtitleService {
        public final int ancillaryPageId;
        public DisplayDefinition displayDefinition;
        public PageComposition pageComposition;
        public final int subtitlePageId;
        public final SparseArray<RegionComposition> regions = new SparseArray<>();
        public final SparseArray<ClutDefinition> cluts = new SparseArray<>();
        public final SparseArray<ObjectData> objects = new SparseArray<>();
        public final SparseArray<ClutDefinition> ancillaryCluts = new SparseArray<>();
        public final SparseArray<ObjectData> ancillaryObjects = new SparseArray<>();

        public SubtitleService(int i14, int i15) {
            this.subtitlePageId = i14;
            this.ancillaryPageId = i15;
        }

        public void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    public DvbParser(int i14, int i15) {
        Paint paint = new Paint();
        this.defaultPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new Canvas();
        this.defaultDisplayDefinition = new DisplayDefinition(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.defaultClutDefinition = new ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new SubtitleService(i14, i15);
    }

    private static byte[] buildClutMapTable(int i14, int i15, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            bArr[i16] = (byte) parsableBitArray.readBits(i15);
        }
        return bArr;
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i14 = 1; i14 < 16; i14++) {
            if (i14 < 8) {
                iArr[i14] = getColor(255, (i14 & 1) != 0 ? 255 : 0, (i14 & 2) != 0 ? 255 : 0, (i14 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i14] = getColor(255, (i14 & 1) != 0 ? 127 : 0, (i14 & 2) != 0 ? 127 : 0, (i14 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i14 = 0; i14 < 256; i14++) {
            if (i14 < 8) {
                iArr[i14] = getColor(63, (i14 & 1) != 0 ? 255 : 0, (i14 & 2) != 0 ? 255 : 0, (i14 & 4) == 0 ? 0 : 255);
            } else {
                int i15 = i14 & SyslogConstants.LOG_LOCAL1;
                if (i15 == 0) {
                    iArr[i14] = getColor(255, ((i14 & 1) != 0 ? 85 : 0) + ((i14 & 16) != 0 ? 170 : 0), ((i14 & 2) != 0 ? 85 : 0) + ((i14 & 32) != 0 ? 170 : 0), ((i14 & 4) == 0 ? 0 : 85) + ((i14 & 64) == 0 ? 0 : 170));
                } else if (i15 == 8) {
                    iArr[i14] = getColor(127, ((i14 & 1) != 0 ? 85 : 0) + ((i14 & 16) != 0 ? 170 : 0), ((i14 & 2) != 0 ? 85 : 0) + ((i14 & 32) != 0 ? 170 : 0), ((i14 & 4) == 0 ? 0 : 85) + ((i14 & 64) == 0 ? 0 : 170));
                } else if (i15 == 128) {
                    iArr[i14] = getColor(255, ((i14 & 1) != 0 ? 43 : 0) + 127 + ((i14 & 16) != 0 ? 85 : 0), ((i14 & 2) != 0 ? 43 : 0) + 127 + ((i14 & 32) != 0 ? 85 : 0), ((i14 & 4) == 0 ? 0 : 43) + 127 + ((i14 & 64) == 0 ? 0 : 85));
                } else if (i15 == 136) {
                    iArr[i14] = getColor(255, ((i14 & 1) != 0 ? 43 : 0) + ((i14 & 16) != 0 ? 85 : 0), ((i14 & 2) != 0 ? 43 : 0) + ((i14 & 32) != 0 ? 85 : 0), ((i14 & 4) == 0 ? 0 : 43) + ((i14 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int getColor(int i14, int i15, int i16, int i17) {
        return (i14 << 24) | (i15 << 16) | (i16 << 8) | i17;
    }

    private static int paint2BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i14, int i15, Paint paint, Canvas canvas) {
        int i16;
        int bits;
        int bits2;
        boolean z14 = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(2);
            if (bits3 != 0) {
                z14 = z14;
                i16 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    bits = parsableBitArray.readBits(3) + 3;
                    bits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        i16 = 1;
                    } else {
                        int bits4 = parsableBitArray.readBits(2);
                        if (bits4 == 0) {
                            z14 = true;
                        } else if (bits4 == 1) {
                            i16 = 2;
                        } else if (bits4 == 2) {
                            bits = parsableBitArray.readBits(4) + 12;
                            bits2 = parsableBitArray.readBits(2);
                        } else if (bits4 != 3) {
                            z14 = z14;
                        } else {
                            bits = parsableBitArray.readBits(8) + 29;
                            bits2 = parsableBitArray.readBits(2);
                        }
                        bits3 = 0;
                        i16 = 0;
                    }
                    bits3 = 0;
                }
                z14 = z14;
                i16 = bits;
                bits3 = bits2;
            }
            if (i16 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i14, i15, i14 + i16, 1 + i15, paint);
            }
            i14 += i16;
            if (z14) {
                return i14;
            }
            z14 = z14;
        }
    }

    private static int paint4BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i14, int i15, Paint paint, Canvas canvas) {
        int i16;
        int bits;
        int bits2;
        boolean z14 = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(4);
            if (bits3 != 0) {
                z14 = z14;
                i16 = 1;
            } else if (parsableBitArray.readBit()) {
                if (parsableBitArray.readBit()) {
                    int bits4 = parsableBitArray.readBits(2);
                    if (bits4 == 0) {
                        i16 = 1;
                        bits3 = 0;
                    } else if (bits4 == 1) {
                        bits3 = 0;
                        i16 = 2;
                        z14 = z14;
                    } else if (bits4 == 2) {
                        bits = parsableBitArray.readBits(4) + 9;
                        bits2 = parsableBitArray.readBits(4);
                    } else if (bits4 != 3) {
                        z14 = z14;
                        bits3 = 0;
                        i16 = 0;
                    } else {
                        bits = parsableBitArray.readBits(8) + 25;
                        bits2 = parsableBitArray.readBits(4);
                    }
                } else {
                    bits = parsableBitArray.readBits(2) + 4;
                    bits2 = parsableBitArray.readBits(4);
                }
                z14 = z14;
                i16 = bits;
                bits3 = bits2;
            } else {
                int bits5 = parsableBitArray.readBits(3);
                if (bits5 != 0) {
                    i16 = bits5 + 2;
                    bits3 = 0;
                } else {
                    z14 = true;
                    bits3 = 0;
                    i16 = 0;
                }
            }
            if (i16 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i14, i15, i14 + i16, 1 + i15, paint);
            }
            i14 += i16;
            if (z14) {
                return i14;
            }
            z14 = z14;
        }
    }

    private static int paint8BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i14, int i15, Paint paint, Canvas canvas) {
        boolean z14;
        int bits;
        boolean z15 = false;
        while (true) {
            int bits2 = parsableBitArray.readBits(8);
            if (bits2 != 0) {
                z14 = z15;
                bits = 1;
            } else if (parsableBitArray.readBit()) {
                z14 = z15;
                bits = parsableBitArray.readBits(7);
                bits2 = parsableBitArray.readBits(8);
            } else {
                int bits3 = parsableBitArray.readBits(7);
                if (bits3 != 0) {
                    z14 = z15;
                    bits = bits3;
                    bits2 = 0;
                } else {
                    z14 = true;
                    bits2 = 0;
                    bits = 0;
                }
            }
            if (bits != 0 && paint != null) {
                if (bArr != null) {
                    bits2 = bArr[bits2];
                }
                paint.setColor(iArr[bits2]);
                canvas.drawRect(i14, i15, i14 + bits, 1 + i15, paint);
            }
            i14 += bits;
            if (z14) {
                return i14;
            }
            z15 = z14;
        }
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i14, int i15, int i16, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        byte[] bArrBuildClutMapTable = null;
        byte[] bArrBuildClutMapTable2 = null;
        int iPaint2BitPixelCodeString = i15;
        int i17 = i16;
        byte[] bArrBuildClutMapTable3 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int bits = parsableBitArray.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i14 != 3) {
                            if (i14 == 2) {
                                bArr3 = bArrBuildClutMapTable2 == null ? defaultMap2To4 : bArrBuildClutMapTable2;
                            } else {
                                bArr2 = null;
                            }
                            iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr2, bArr2, iPaint2BitPixelCodeString, i17, paint2, canvas2);
                            parsableBitArray.byteAlign();
                        } else {
                            bArr3 = bArrBuildClutMapTable3 == null ? defaultMap2To8 : bArrBuildClutMapTable3;
                        }
                        bArr2 = bArr3;
                        iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr2, bArr2, iPaint2BitPixelCodeString, i17, paint2, canvas2);
                        parsableBitArray.byteAlign();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        iPaint2BitPixelCodeString = paint4BitPixelCodeString(parsableBitArray, iArr2, i14 == 3 ? bArrBuildClutMapTable == null ? defaultMap4To8 : bArrBuildClutMapTable : null, iPaint2BitPixelCodeString, i17, paint2, canvas2);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iPaint2BitPixelCodeString = paint8BitPixelCodeString(parsableBitArray, iArr2, null, iPaint2BitPixelCodeString, i17, paint2, canvas2);
                        break;
                    default:
                        switch (bits) {
                            case 32:
                                bArrBuildClutMapTable2 = buildClutMapTable(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrBuildClutMapTable3 = buildClutMapTable(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrBuildClutMapTable = buildClutMapTable(16, 8, parsableBitArray);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i17 += 2;
                iPaint2BitPixelCodeString = i15;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void paintPixelDataSubBlocks(ObjectData objectData, ClutDefinition clutDefinition, int i14, int i15, int i16, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i14 == 3) {
            iArr = clutDefinition.clutEntries8Bit;
        } else {
            iArr = i14 == 2 ? clutDefinition.clutEntries4Bit : clutDefinition.clutEntries2Bit;
        }
        int[] iArr2 = iArr;
        paintPixelDataSubBlock(objectData.topFieldData, iArr2, i14, i15, i16, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr2, i14, i15, i16 + 1, paint, canvas);
    }

    private static ClutDefinition parseClutDefinition(ParsableBitArray parsableBitArray, int i14) {
        int[] iArr;
        int bits;
        int i15;
        int bits2;
        int bits3;
        int bits4;
        int i16 = 8;
        int bits5 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i17 = 2;
        int i18 = i14 - 2;
        int[] iArrGenerateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] iArrGenerateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] iArrGenerateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i18 > 0) {
            int bits6 = parsableBitArray.readBits(i16);
            int bits7 = parsableBitArray.readBits(i16);
            if ((bits7 & 128) != 0) {
                iArr = iArrGenerateDefault2BitClutEntries;
            } else {
                iArr = (bits7 & 64) != 0 ? iArrGenerateDefault4BitClutEntries : iArrGenerateDefault8BitClutEntries;
            }
            if ((bits7 & 1) != 0) {
                bits3 = parsableBitArray.readBits(i16);
                bits4 = parsableBitArray.readBits(i16);
                bits = parsableBitArray.readBits(i16);
                bits2 = parsableBitArray.readBits(i16);
                i15 = i18 - 6;
            } else {
                int bits8 = parsableBitArray.readBits(6) << i17;
                int bits9 = parsableBitArray.readBits(4) << 4;
                bits = parsableBitArray.readBits(4) << 4;
                i15 = i18 - 4;
                bits2 = parsableBitArray.readBits(i17) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits2 = 255;
                bits4 = 0;
                bits = 0;
            }
            double d14 = bits3;
            double d15 = bits4 - 128;
            double d16 = bits - 128;
            iArr[bits6] = getColor((byte) (255 - (bits2 & 255)), Util.constrainValue((int) ((1.402d * d15) + d14), 0, 255), Util.constrainValue((int) ((d14 - (0.34414d * d16)) - (d15 * 0.71414d)), 0, 255), Util.constrainValue((int) ((d16 * 1.772d) + d14), 0, 255));
            i18 = i15;
            bits5 = bits5;
            i16 = 8;
            i17 = 2;
        }
        return new ClutDefinition(bits5, iArrGenerateDefault2BitClutEntries, iArrGenerateDefault4BitClutEntries, iArrGenerateDefault8BitClutEntries);
    }

    private static DisplayDefinition parseDisplayDefinition(ParsableBitArray parsableBitArray) {
        int i14;
        int i15;
        int i16;
        int bits;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        if (bit) {
            int bits4 = parsableBitArray.readBits(16);
            int bits5 = parsableBitArray.readBits(16);
            int bits6 = parsableBitArray.readBits(16);
            bits = parsableBitArray.readBits(16);
            i16 = bits5;
            i15 = bits6;
            i14 = bits4;
        } else {
            i14 = 0;
            i15 = 0;
            i16 = bits2;
            bits = bits3;
        }
        return new DisplayDefinition(bits2, bits3, i14, i16, i15, bits);
    }

    private static ObjectData parseObjectData(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int bits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int bits2 = parsableBitArray.readBits(2);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = parsableBitArray.readBits(16);
                int bits4 = parsableBitArray.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    parsableBitArray.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    parsableBitArray.readBytes(bArr, 0, bits4);
                }
            }
            return new ObjectData(bits, bit, bArr2, bArr);
        }
        parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        bArr = bArr2;
        return new ObjectData(bits, bit, bArr2, bArr);
    }

    private static PageComposition parsePageComposition(ParsableBitArray parsableBitArray, int i14) {
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(4);
        int bits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i15 = i14 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int bits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i15 -= 6;
            sparseArray.put(bits4, new PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new PageComposition(bits, bits2, bits3, sparseArray);
    }

    private static RegionComposition parseRegionComposition(ParsableBitArray parsableBitArray, int i14) {
        int i15;
        int bits;
        int bits2;
        char c14;
        int bits3 = parsableBitArray.readBits(8);
        int i16 = 4;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i17 = 16;
        int bits4 = parsableBitArray.readBits(16);
        int bits5 = parsableBitArray.readBits(16);
        int bits6 = parsableBitArray.readBits(3);
        int bits7 = parsableBitArray.readBits(3);
        int i18 = 2;
        parsableBitArray.skipBits(2);
        int bits8 = parsableBitArray.readBits(8);
        int bits9 = parsableBitArray.readBits(8);
        int bits10 = parsableBitArray.readBits(4);
        int bits11 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i19 = i14 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i19 > 0) {
            int bits12 = parsableBitArray.readBits(i17);
            int bits13 = parsableBitArray.readBits(i18);
            int bits14 = parsableBitArray.readBits(i18);
            int bits15 = parsableBitArray.readBits(12);
            parsableBitArray.skipBits(i16);
            int bits16 = parsableBitArray.readBits(12);
            int i24 = i19 - 6;
            if (bits13 != 1) {
                i15 = 2;
                if (bits13 != 2) {
                    bits2 = 0;
                    bits = 0;
                    i19 = i24;
                    c14 = '\b';
                }
                sparseArray.put(bits12, new RegionObject(bits13, bits14, bits15, bits16, bits2, bits));
                i17 = 16;
                i18 = i15;
                i16 = 4;
            } else {
                i15 = 2;
            }
            c14 = '\b';
            i19 -= 8;
            bits2 = parsableBitArray.readBits(8);
            bits = parsableBitArray.readBits(8);
            sparseArray.put(bits12, new RegionObject(bits13, bits14, bits15, bits16, bits2, bits));
            i17 = 16;
            i18 = i15;
            i16 = 4;
        }
        return new RegionComposition(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    private static void parseSubtitlingSegment(ParsableBitArray parsableBitArray, SubtitleService subtitleService) {
        RegionComposition regionComposition;
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + bits3;
        if (bits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == subtitleService.subtitlePageId) {
                    PageComposition pageComposition = subtitleService.pageComposition;
                    PageComposition pageComposition2 = parsePageComposition(parsableBitArray, bits3);
                    if (pageComposition2.state != 0) {
                        subtitleService.pageComposition = pageComposition2;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                    } else if (pageComposition != null && pageComposition.version != pageComposition2.version) {
                        subtitleService.pageComposition = pageComposition2;
                    }
                }
                break;
            case 17:
                PageComposition pageComposition3 = subtitleService.pageComposition;
                if (bits2 == subtitleService.subtitlePageId && pageComposition3 != null) {
                    RegionComposition regionComposition2 = parseRegionComposition(parsableBitArray, bits3);
                    if (pageComposition3.state == 0 && (regionComposition = subtitleService.regions.get(regionComposition2.f53092id)) != null) {
                        regionComposition2.mergeFrom(regionComposition);
                    }
                    subtitleService.regions.put(regionComposition2.f53092id, regionComposition2);
                }
                break;
            case 18:
                if (bits2 == subtitleService.subtitlePageId) {
                    ClutDefinition clutDefinition = parseClutDefinition(parsableBitArray, bits3);
                    subtitleService.cluts.put(clutDefinition.f53090id, clutDefinition);
                } else if (bits2 == subtitleService.ancillaryPageId) {
                    ClutDefinition clutDefinition2 = parseClutDefinition(parsableBitArray, bits3);
                    subtitleService.ancillaryCluts.put(clutDefinition2.f53090id, clutDefinition2);
                }
                break;
            case 19:
                if (bits2 == subtitleService.subtitlePageId) {
                    ObjectData objectData = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(objectData.f53091id, objectData);
                } else if (bits2 == subtitleService.ancillaryPageId) {
                    ObjectData objectData2 = parseObjectData(parsableBitArray);
                    subtitleService.ancillaryObjects.put(objectData2.f53091id, objectData2);
                }
                break;
            case 20:
                if (bits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = parseDisplayDefinition(parsableBitArray);
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    public List<Cue> decode(byte[] bArr, int i14) {
        int i15;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i14);
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        SubtitleService subtitleService = this.subtitleService;
        PageComposition pageComposition = subtitleService.pageComposition;
        if (pageComposition == null) {
            return Collections.EMPTY_LIST;
        }
        DisplayDefinition displayDefinition = subtitleService.displayDefinition;
        if (displayDefinition == null) {
            displayDefinition = this.defaultDisplayDefinition;
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || displayDefinition.width + 1 != bitmap.getWidth() || displayDefinition.height + 1 != this.bitmap.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, Bitmap.Config.ARGB_8888);
            this.bitmap = bitmapCreateBitmap;
            this.canvas.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<PageRegion> sparseArray = pageComposition.regions;
        int i16 = 0;
        while (i16 < sparseArray.size()) {
            this.canvas.save();
            PageRegion pageRegionValueAt = sparseArray.valueAt(i16);
            RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray.keyAt(i16));
            int i17 = pageRegionValueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i18 = pageRegionValueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            this.canvas.clipRect(i17, i18, Math.min(regionComposition.width + i17, displayDefinition.horizontalPositionMaximum), Math.min(regionComposition.height + i18, displayDefinition.verticalPositionMaximum));
            ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            ClutDefinition clutDefinition2 = clutDefinition;
            SparseArray<RegionObject> sparseArray2 = regionComposition.regionObjects;
            int i19 = 0;
            while (i19 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i19);
                RegionObject regionObjectValueAt = sparseArray2.valueAt(i19);
                ObjectData objectData = this.subtitleService.objects.get(iKeyAt);
                if (objectData == null) {
                    objectData = this.subtitleService.ancillaryObjects.get(iKeyAt);
                }
                if (objectData != null) {
                    paintPixelDataSubBlocks(objectData, clutDefinition2, regionComposition.depth, regionObjectValueAt.horizontalPosition + i17, regionObjectValueAt.verticalPosition + i18, objectData.nonModifyingColorFlag ? null : this.defaultPaint, this.canvas);
                }
                i19++;
                sparseArray = sparseArray;
            }
            SparseArray<PageRegion> sparseArray3 = sparseArray;
            if (regionComposition.fillFlag) {
                int i24 = regionComposition.depth;
                if (i24 == 3) {
                    i15 = clutDefinition2.clutEntries8Bit[regionComposition.pixelCode8Bit];
                } else {
                    i15 = i24 == 2 ? clutDefinition2.clutEntries4Bit[regionComposition.pixelCode4Bit] : clutDefinition2.clutEntries2Bit[regionComposition.pixelCode2Bit];
                }
                this.fillRegionPaint.setColor(i15);
                this.canvas.drawRect(i17, i18, regionComposition.width + i17, regionComposition.height + i18, this.fillRegionPaint);
            }
            arrayList.add(new Cue.Builder().setBitmap(Bitmap.createBitmap(this.bitmap, i17, i18, regionComposition.width, regionComposition.height)).setPosition(i17 / displayDefinition.width).setPositionAnchor(0).setLine(i18 / displayDefinition.height, 0).setLineAnchor(0).setSize(regionComposition.width / displayDefinition.width).setBitmapHeight(regionComposition.height / displayDefinition.height).build());
            this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.canvas.restore();
            i16++;
            sparseArray = sparseArray3;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void reset() {
        this.subtitleService.reset();
    }
}
