package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class RSS14Reader extends AbstractRSSReader {
    private static final int[] m = {1, 10, 34, 70, 126};
    private static final int[] n = {4, 20, 48, 81};
    private static final int[] o = {0, 161, 961, 2015, 2715};
    private static final int[] p = {0, 336, 1036, 1516};
    private static final int[] q = {8, 6, 4, 3, 1};
    private static final int[] r = {2, 4, 6, 8};
    private static final int[][] s = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    private final List<a> k = new ArrayList();
    private final List<a> l = new ArrayList();

    private static void b(Collection<a> collection, a aVar) {
        if (aVar == null) {
            return;
        }
        boolean z = false;
        for (a aVar2 : collection) {
            if (aVar2.getValue() == aVar.getValue()) {
                aVar2.c();
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        collection.add(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003a A[PHI: r6 r7
      0x003a: PHI (r6v5 boolean) = (r6v3 boolean), (r6v13 boolean) binds: [B:24:0x0038, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r7v3 boolean) = (r7v1 boolean), (r7v11 boolean) binds: [B:24:0x0038, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x003f A[PHI: r6 r7
      0x003f: PHI (r6v6 boolean) = (r6v3 boolean), (r6v13 boolean) binds: [B:26:0x003d, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r7v4 boolean) = (r7v1 boolean), (r7v11 boolean) binds: [B:26:0x003d, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0041 A[PHI: r6 r7
      0x0041: PHI (r6v9 boolean) = (r6v3 boolean), (r6v13 boolean) binds: [B:26:0x003d, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r7v9 boolean) = (r7v1 boolean), (r7v11 boolean) binds: [B:26:0x003d, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    private void c(boolean z, int i) throws NotFoundException {
        boolean z2;
        boolean z3;
        boolean z4;
        int iSum = MathUtils.sum(getOddCounts());
        int iSum2 = MathUtils.sum(getEvenCounts());
        boolean z5 = true;
        if (z) {
            if (iSum > 12) {
                z5 = false;
                z2 = true;
            } else {
                z5 = iSum < 4;
                z2 = false;
            }
            if (iSum2 > 12) {
                z3 = false;
                z4 = true;
            } else {
                if (iSum2 < 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = false;
            }
        } else {
            if (iSum > 11) {
                z5 = false;
                z2 = true;
            } else {
                z5 = iSum < 5;
                z2 = false;
            }
            if (iSum2 > 10) {
                z3 = false;
                z4 = true;
            } else {
                if (iSum2 < 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = false;
            }
        }
        int i2 = (iSum + iSum2) - i;
        boolean z6 = (iSum & 1) == z;
        boolean z7 = (iSum2 & 1) == 1;
        if (i2 == 1) {
            if (z6) {
                if (z7) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z2 = true;
            } else {
                if (!z7) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z5 = z5;
                z4 = true;
            }
        } else if (i2 == -1) {
            if (z6) {
                if (z7) {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else {
                if (!z7) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z5 = z5;
                z3 = true;
            }
        } else {
            if (i2 != 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (z6) {
                if (!z7) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (iSum < iSum2) {
                    z4 = true;
                } else {
                    z3 = true;
                    z2 = true;
                }
            } else {
                if (z7) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z5 = z5;
            }
        }
        if (z5) {
            if (z2) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
        }
        if (z2) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z3) {
            if (z4) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
        }
        if (z4) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    private static boolean d(a aVar, a aVar2) {
        int checksumPortion = (aVar.getChecksumPortion() + (aVar2.getChecksumPortion() * 16)) % 79;
        int value = (aVar.b().getValue() * 9) + aVar2.b().getValue();
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        return checksumPortion == value;
    }

    private static Result e(a aVar, a aVar2) {
        String strValueOf = String.valueOf((((long) aVar.getValue()) * 4537077) + ((long) aVar2.getValue()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(strValueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int iCharAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                iCharAt *= 3;
            }
            i += iCharAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        ResultPoint[] resultPoints = aVar.b().getResultPoints();
        ResultPoint[] resultPoints2 = aVar2.b().getResultPoints();
        return new Result(sb.toString(), null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_14);
    }

    private DataCharacter f(BitArray bitArray, FinderPattern finderPattern, boolean z) throws NotFoundException {
        int[] dataCharacterCounters = getDataCharacterCounters();
        for (int i = 0; i < dataCharacterCounters.length; i++) {
            dataCharacterCounters[i] = 0;
        }
        if (z) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1] + 1, dataCharacterCounters);
            int i2 = 0;
            for (int length = dataCharacterCounters.length - 1; i2 < length; length--) {
                int i3 = dataCharacterCounters[i2];
                dataCharacterCounters[i2] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float fSum = MathUtils.sum(dataCharacterCounters) / i4;
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i5 = 0; i5 < dataCharacterCounters.length; i5++) {
            float f = dataCharacterCounters[i5] / fSum;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                oddCounts[i7] = i6;
                oddRoundingErrors[i7] = f - i6;
            } else {
                evenCounts[i7] = i6;
                evenRoundingErrors[i7] = f - i6;
            }
        }
        c(z, i4);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            i8 = (i8 * 9) + oddCounts[length2];
            i9 += oddCounts[length2];
        }
        int i10 = 0;
        int i11 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            i10 = (i10 * 9) + evenCounts[length3];
            i11 += evenCounts[length3];
        }
        int i12 = i8 + (i10 * 3);
        if (!z) {
            if ((i11 & 1) != 0 || i11 > 10 || i11 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i13 = (10 - i11) / 2;
            int i14 = r[i13];
            return new DataCharacter((RSSUtils.getRSSvalue(evenCounts, 9 - i14, false) * n[i13]) + RSSUtils.getRSSvalue(oddCounts, i14, true) + p[i13], i12);
        }
        if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i15 = (12 - i9) / 2;
        int i16 = q[i15];
        return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i16, false) * m[i15]) + RSSUtils.getRSSvalue(evenCounts, 9 - i16, true) + o[i15], i12);
    }

    private a g(BitArray bitArray, boolean z, int i, Map<DecodeHintType, ?> map) {
        try {
            int[] iArrH = h(bitArray, z);
            FinderPattern finderPatternI = i(bitArray, i, z, iArrH);
            ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (resultPointCallback != null) {
                float size = (iArrH[0] + iArrH[1]) / 2.0f;
                if (z) {
                    size = (bitArray.getSize() - 1) - size;
                }
                resultPointCallback.foundPossibleResultPoint(new ResultPoint(size, i));
            }
            DataCharacter dataCharacterF = f(bitArray, finderPatternI, true);
            DataCharacter dataCharacterF2 = f(bitArray, finderPatternI, false);
            return new a((dataCharacterF.getValue() * 1597) + dataCharacterF2.getValue(), dataCharacterF.getChecksumPortion() + (dataCharacterF2.getChecksumPortion() * 4), finderPatternI);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private int[] h(BitArray bitArray, boolean z) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            z2 = !bitArray.get(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < size) {
            if (bitArray.get(i) != z2) {
                decodeFinderCounters[i3] = decodeFinderCounters[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else {
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        return new int[]{i2, i};
                    }
                    i2 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i3--;
                }
                decodeFinderCounters[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private FinderPattern i(BitArray bitArray, int i, boolean z, int[] iArr) throws NotFoundException {
        int size;
        int i2;
        boolean z2 = bitArray.get(iArr[0]);
        int i3 = iArr[0] - 1;
        while (i3 >= 0 && z2 != bitArray.get(i3)) {
            i3--;
        }
        int i4 = i3 + 1;
        int i5 = iArr[0] - i4;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i5;
        int finderValue = AbstractRSSReader.parseFinderValue(decodeFinderCounters, s);
        int i6 = iArr[1];
        if (z) {
            int size2 = (bitArray.getSize() - 1) - i4;
            size = (bitArray.getSize() - 1) - i6;
            i2 = size2;
        } else {
            size = i6;
            i2 = i4;
        }
        return new FinderPattern(finderValue, new int[]{i4, iArr[1]}, i2, size, i);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        b(this.k, g(bitArray, false, i, map));
        bitArray.reverse();
        b(this.l, g(bitArray, true, i, map));
        bitArray.reverse();
        for (a aVar : this.k) {
            if (aVar.a() > 1) {
                for (a aVar2 : this.l) {
                    if (aVar2.a() > 1 && d(aVar, aVar2)) {
                        return e(aVar, aVar2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.k.clear();
        this.l.clear();
    }
}
