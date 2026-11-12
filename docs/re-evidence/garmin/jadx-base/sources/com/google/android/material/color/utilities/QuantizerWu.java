package com.google.android.material.color.utilities;

import com.google.firebase.messaging.l;
import i3.e5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* JADX INFO: renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i14, int i15) {
            this.resultCount = i15;
        }
    }

    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i14, double d14) {
            this.cutLocation = i14;
            this.maximum = d14;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i14;
        int i15;
        int i16 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i16 == 1) {
            i14 = (-iArr[getIndex(box.f53187r0, box.f53186g1, box.f53184b1)]) + iArr[getIndex(box.f53187r0, box.f53186g1, box.f53183b0)] + iArr[getIndex(box.f53187r0, box.f53185g0, box.f53184b1)];
            i15 = iArr[getIndex(box.f53187r0, box.f53185g0, box.f53183b0)];
        } else if (i16 == 2) {
            i14 = (-iArr[getIndex(box.f53188r1, box.f53185g0, box.f53184b1)]) + iArr[getIndex(box.f53188r1, box.f53185g0, box.f53183b0)] + iArr[getIndex(box.f53187r0, box.f53185g0, box.f53184b1)];
            i15 = iArr[getIndex(box.f53187r0, box.f53185g0, box.f53183b0)];
        } else {
            if (i16 != 3) {
                l.j(direction, "unexpected direction ");
                return 0;
            }
            i14 = (-iArr[getIndex(box.f53188r1, box.f53186g1, box.f53183b0)]) + iArr[getIndex(box.f53188r1, box.f53185g0, box.f53183b0)] + iArr[getIndex(box.f53187r0, box.f53186g1, box.f53183b0)];
            i15 = iArr[getIndex(box.f53187r0, box.f53185g0, box.f53183b0)];
        }
        return i14 - i15;
    }

    public static int getIndex(int i14, int i15, int i16) {
        return (i14 << 10) + (i14 << 6) + i14 + (i15 << 5) + i15 + i16;
    }

    public static int top(Box box, Direction direction, int i14, int[] iArr) {
        int i15;
        int i16;
        int i17 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i17 == 1) {
            i15 = (iArr[getIndex(i14, box.f53186g1, box.f53184b1)] - iArr[getIndex(i14, box.f53186g1, box.f53183b0)]) - iArr[getIndex(i14, box.f53185g0, box.f53184b1)];
            i16 = iArr[getIndex(i14, box.f53185g0, box.f53183b0)];
        } else if (i17 == 2) {
            i15 = (iArr[getIndex(box.f53188r1, i14, box.f53184b1)] - iArr[getIndex(box.f53188r1, i14, box.f53183b0)]) - iArr[getIndex(box.f53187r0, i14, box.f53184b1)];
            i16 = iArr[getIndex(box.f53187r0, i14, box.f53183b0)];
        } else {
            if (i17 != 3) {
                l.j(direction, "unexpected direction ");
                return 0;
            }
            i15 = (iArr[getIndex(box.f53188r1, box.f53186g1, i14)] - iArr[getIndex(box.f53188r1, box.f53185g0, i14)]) - iArr[getIndex(box.f53187r0, box.f53186g1, i14)];
            i16 = iArr[getIndex(box.f53187r0, box.f53185g0, i14)];
        }
        return i15 + i16;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f53188r1, box.f53186g1, box.f53184b1)] - iArr[getIndex(box.f53188r1, box.f53186g1, box.f53183b0)]) - iArr[getIndex(box.f53188r1, box.f53185g0, box.f53184b1)]) + iArr[getIndex(box.f53188r1, box.f53185g0, box.f53183b0)]) - iArr[getIndex(box.f53187r0, box.f53186g1, box.f53184b1)]) + iArr[getIndex(box.f53187r0, box.f53186g1, box.f53183b0)]) + iArr[getIndex(box.f53187r0, box.f53185g0, box.f53184b1)]) - iArr[getIndex(box.f53187r0, box.f53185g0, box.f53183b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = (iRedFromArgb * iIntValue2) + iArr2[index];
            int[] iArr3 = this.momentsG;
            iArr3[index] = (iGreenFromArgb * iIntValue2) + iArr3[index];
            int[] iArr4 = this.momentsB;
            iArr4[index] = (iBlueFromArgb * iIntValue2) + iArr4[index];
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + ((double) e5.c(iBlueFromArgb, iBlueFromArgb, (iGreenFromArgb * iGreenFromArgb) + (iRedFromArgb * iRedFromArgb), iIntValue2));
        }
    }

    public CreateBoxesResult createBoxes(int i14) {
        int i15;
        this.cubes = new Box[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            this.cubes[i16] = new Box(null);
        }
        double[] dArr = new double[i14];
        Box box = this.cubes[0];
        box.f53188r1 = 32;
        box.f53186g1 = 32;
        box.f53184b1 = 32;
        int i17 = 0;
        int i18 = 1;
        while (i18 < i14) {
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i17], boxArr[i18]).booleanValue()) {
                Box box2 = this.cubes[i17];
                dArr[i17] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i18];
                dArr[i18] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i17] = 0.0d;
                i18--;
            }
            double d14 = dArr[0];
            int i19 = 0;
            for (int i24 = 1; i24 <= i18; i24++) {
                double d15 = dArr[i24];
                if (d15 > d14) {
                    i19 = i24;
                    d14 = d15;
                }
            }
            if (d14 <= 0.0d) {
                i15 = i18 + 1;
                return new CreateBoxesResult(i14, i15);
            }
            i18++;
            i17 = i19;
        }
        i15 = i14;
        return new CreateBoxesResult(i14, i15);
    }

    public void createMoments() {
        int i14 = 1;
        while (true) {
            int i15 = 33;
            if (i14 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i16 = 1;
            while (i16 < i15) {
                int i17 = 0;
                int i18 = 0;
                double d14 = 0.0d;
                int i19 = 1;
                int i24 = 0;
                int i25 = 0;
                while (i19 < i15) {
                    int index = getIndex(i14, i16, i19);
                    i17 += this.weights[index];
                    i24 += this.momentsR[index];
                    i25 += this.momentsG[index];
                    i18 += this.momentsB[index];
                    d14 += this.moments[index];
                    iArr[i19] = iArr[i19] + i17;
                    iArr2[i19] = iArr2[i19] + i24;
                    iArr3[i19] = iArr3[i19] + i25;
                    iArr4[i19] = iArr4[i19] + i18;
                    dArr[i19] = dArr[i19] + d14;
                    int index2 = getIndex(i14 - 1, i16, i19);
                    int i26 = i19;
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i26];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i26];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i26];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i26];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i26];
                    i19 = i26 + 1;
                    i15 = 33;
                }
                i16++;
                i15 = 33;
            }
            i14++;
        }
    }

    public List<Integer> createResult(int i14) {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < i14; i15++) {
            Box box = this.cubes[i15];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                int iVolume2 = volume(box, this.momentsR) / iVolume;
                int iVolume3 = volume(box, this.momentsG) / iVolume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / iVolume) & 255) | ((iVolume2 & 255) << 16) | (-16777216) | ((iVolume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximizeResultMaximize = maximize(box, direction, box.f53187r0 + 1, box.f53188r1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultMaximize2 = maximize(box, direction2, box.f53185g0 + 1, box.f53186g1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultMaximize3 = maximize(box, direction3, box.f53183b0 + 1, box.f53184b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d14 = maximizeResultMaximize.maximum;
        double d15 = maximizeResultMaximize2.maximum;
        double d16 = maximizeResultMaximize3.maximum;
        if (d14 < d15 || d14 < d16) {
            if (d15 >= d14 && d15 >= d16) {
                direction3 = direction2;
            }
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f53188r1 = box.f53188r1;
        box2.f53186g1 = box.f53186g1;
        box2.f53184b1 = box.f53184b1;
        int i14 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction3.ordinal()];
        if (i14 == 1) {
            int i15 = maximizeResultMaximize.cutLocation;
            box.f53188r1 = i15;
            box2.f53187r0 = i15;
            box2.f53185g0 = box.f53185g0;
            box2.f53183b0 = box.f53183b0;
        } else if (i14 == 2) {
            int i16 = maximizeResultMaximize2.cutLocation;
            box.f53186g1 = i16;
            box2.f53187r0 = box.f53187r0;
            box2.f53185g0 = i16;
            box2.f53183b0 = box.f53183b0;
        } else if (i14 == 3) {
            int i17 = maximizeResultMaximize3.cutLocation;
            box.f53184b1 = i17;
            box2.f53187r0 = box.f53187r0;
            box2.f53185g0 = box.f53185g0;
            box2.f53183b0 = i17;
        }
        box.vol = (box.f53184b1 - box.f53183b0) * (box.f53186g1 - box.f53185g0) * (box.f53188r1 - box.f53187r0);
        box2.vol = (box2.f53184b1 - box2.f53183b0) * (box2.f53186g1 - box2.f53185g0) * (box2.f53188r1 - box2.f53187r0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i14, int i15, int i16, int i17, int i18, int i19) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int iBottom = bottom(box2, direction, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction, quantizerWu.weights);
        int i24 = -1;
        double d14 = 0.0d;
        int i25 = i14;
        while (i25 < i15) {
            int pVar = top(box2, direction, i25, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction, i25, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction, i25, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction, i25, quantizerWu.weights) + iBottom4;
            if (pVar4 != 0) {
                double d15 = ((double) ((pVar3 * pVar3) + ((pVar2 * pVar2) + (pVar * pVar)))) / ((double) pVar4);
                int i26 = i16 - pVar;
                int i27 = i17 - pVar2;
                int i28 = i18 - pVar3;
                int i29 = i19 - pVar4;
                if (i29 != 0) {
                    double d16 = (((double) ((i28 * i28) + ((i27 * i27) + (i26 * i26)))) / ((double) i29)) + d15;
                    if (d16 > d14) {
                        i24 = i25;
                        d14 = d16;
                    }
                }
            }
            i25++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i24, d14);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i14) {
        constructHistogram(new QuantizerMap().quantize(iArr, i14).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i14).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listCreateResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int i14 = iVolume3 * iVolume3;
        return (((((((this.moments[getIndex(box.f53188r1, box.f53186g1, box.f53184b1)] - this.moments[getIndex(box.f53188r1, box.f53186g1, box.f53183b0)]) - this.moments[getIndex(box.f53188r1, box.f53185g0, box.f53184b1)]) + this.moments[getIndex(box.f53188r1, box.f53185g0, box.f53183b0)]) - this.moments[getIndex(box.f53187r0, box.f53186g1, box.f53184b1)]) + this.moments[getIndex(box.f53187r0, box.f53186g1, box.f53183b0)]) + this.moments[getIndex(box.f53187r0, box.f53185g0, box.f53184b1)]) - this.moments[getIndex(box.f53187r0, box.f53185g0, box.f53183b0)]) - (((double) (i14 + ((iVolume2 * iVolume2) + (iVolume * iVolume)))) / ((double) volume(box, this.weights)));
    }

    public static final class Box {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        int f53183b0;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        int f53184b1;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        int f53185g0;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        int f53186g1;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int f53187r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        int f53188r1;
        int vol;

        private Box() {
            this.f53187r0 = 0;
            this.f53188r1 = 0;
            this.f53185g0 = 0;
            this.f53186g1 = 0;
            this.f53183b0 = 0;
            this.f53184b1 = 0;
            this.vol = 0;
        }

        public /* synthetic */ Box(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
