package com.google.zxing.oned.rss.expanded;

import com.baseflow.permissionhandler.m;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int A = 11;
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 5;
    private final List<b> k = new ArrayList(11);
    private final List<c> l = new ArrayList();
    private final int[] m = new int[2];
    private boolean n;
    private static final int[] o = {7, 5, 4, 3, 1};
    private static final int[] p = {4, 20, 52, 104, 204};
    private static final int[] q = {0, 348, 1388, 2948, 3988};
    private static final int[][] r = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] s = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, m.c, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, DataTypeSource.SPORT_TYPE_DISCO, 136, 197, 169, 85, 44, 132}, new int[]{DataTypeSource.SPORT_TYPE_MODERN_DANCE, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, DataTypeSource.SPORT_TYPE_CHESS, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, DataTypeSource.SPORT_TYPE_TAP_DANCE, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, DataTypeSource.SPORT_TYPE_BRIDGE, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING, 112, 125, 164}, new int[]{70, m.d, 208, 202, DataTypeSource.SPORT_TYPE_BOULDERING, 130, DataTypeSource.SPORT_TYPE_SHOOT, 115}, new int[]{134, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, DataTypeSource.SPORT_TYPE_CHECKERS, 100, 89}};
    private static final int[][] z = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    private void b(int i) throws NotFoundException {
        boolean z2;
        boolean z3;
        boolean z4;
        int iSum = MathUtils.sum(getOddCounts());
        int iSum2 = MathUtils.sum(getEvenCounts());
        boolean z5 = true;
        if (iSum > 13) {
            z5 = false;
            z2 = true;
        } else {
            z5 = iSum < 4;
            z2 = false;
        }
        if (iSum2 > 13) {
            z3 = false;
            z4 = true;
        } else {
            z3 = iSum2 < 4;
            z4 = false;
        }
        int i2 = (iSum + iSum2) - i;
        boolean z6 = (iSum & 1) == 1;
        boolean z7 = (iSum2 & 1) == 0;
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

    private boolean c() {
        b bVar = this.k.get(0);
        DataCharacter dataCharacterC = bVar.c();
        DataCharacter dataCharacterD = bVar.d();
        if (dataCharacterD == null) {
            return false;
        }
        int checksumPortion = dataCharacterD.getChecksumPortion();
        int i = 2;
        for (int i2 = 1; i2 < this.k.size(); i2++) {
            b bVar2 = this.k.get(i2);
            checksumPortion += bVar2.c().getChecksumPortion();
            i++;
            DataCharacter dataCharacterD2 = bVar2.d();
            if (dataCharacterD2 != null) {
                checksumPortion += dataCharacterD2.getChecksumPortion();
                i++;
            }
        }
        return ((i + (-4)) * 211) + (checksumPortion % 211) == dataCharacterC.getValue();
    }

    private List<b> d(List<c> list, int i) throws NotFoundException {
        while (i < this.l.size()) {
            c cVar = this.l.get(i);
            this.k.clear();
            Iterator<c> it2 = list.iterator();
            while (it2.hasNext()) {
                this.k.addAll(it2.next().a());
            }
            this.k.addAll(cVar.a());
            if (n(this.k)) {
                if (c()) {
                    return this.k;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return d(arrayList, i + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private List<b> e(boolean z2) {
        List<b> listD = null;
        if (this.l.size() > 25) {
            this.l.clear();
            return null;
        }
        this.k.clear();
        if (z2) {
            Collections.reverse(this.l);
        }
        try {
            listD = d(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z2) {
            Collections.reverse(this.l);
        }
        return listD;
    }

    public static Result f(List<b> list) throws NotFoundException, FormatException {
        String information = AbstractExpandedDecoder.createDecoder(a.a(list)).parseInformation();
        ResultPoint[] resultPoints = list.get(0).b().getResultPoints();
        ResultPoint[] resultPoints2 = list.get(list.size() - 1).b().getResultPoints();
        return new Result(information, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    private void i(BitArray bitArray, List<b> list, int i) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).b().getStartEnd()[1];
        }
        boolean z2 = list.size() % 2 != 0;
        if (this.n) {
            z2 = !z2;
        }
        boolean z3 = false;
        while (i < size) {
            z3 = !bitArray.get(i);
            if (!z3) {
                break;
            } else {
                i++;
            }
        }
        boolean z4 = z3;
        int i2 = 0;
        int i3 = i;
        while (i < size) {
            if (bitArray.get(i) != z4) {
                decodeFinderCounters[i2] = decodeFinderCounters[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z2) {
                        r(decodeFinderCounters);
                    }
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        int[] iArr = this.m;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z2) {
                        r(decodeFinderCounters);
                    }
                    i3 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                decodeFinderCounters[i2] = 1;
                z4 = !z4;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int j(BitArray bitArray, int i) {
        return bitArray.get(i) ? bitArray.getNextSet(bitArray.getNextUnset(i)) : bitArray.getNextUnset(bitArray.getNextSet(i));
    }

    private static boolean l(FinderPattern finderPattern, boolean z2, boolean z3) {
        return (finderPattern.getValue() == 0 && z2 && z3) ? false : true;
    }

    private static boolean m(Iterable<b> iterable, Iterable<c> iterable2) {
        boolean z2;
        boolean z3;
        Iterator<c> it2 = iterable2.iterator();
        do {
            z2 = false;
            if (!it2.hasNext()) {
                return false;
            }
            c next = it2.next();
            Iterator<b> it3 = iterable.iterator();
            do {
                if (!it3.hasNext()) {
                    z2 = true;
                    break;
                }
                b next2 = it3.next();
                Iterator<b> it4 = next.a().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z3 = false;
                        break;
                    }
                    if (next2.equals(it4.next())) {
                        z3 = true;
                        break;
                    }
                }
            } while (z3);
        } while (!z2);
        return true;
    }

    private static boolean n(List<b> list) {
        boolean z2;
        for (int[] iArr : z) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z2 = true;
                        break;
                    }
                    if (list.get(i).b().getValue() != iArr[i]) {
                        z2 = false;
                        break;
                    }
                    i++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    private FinderPattern o(BitArray bitArray, int i, boolean z2) {
        int i2;
        int i3;
        int i4;
        if (z2) {
            int i5 = this.m[0] - 1;
            while (i5 >= 0 && !bitArray.get(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.m;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.m;
            int i7 = iArr2[0];
            int nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i2 = nextUnset;
            i3 = i7;
            i4 = nextUnset - this.m[1];
        }
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i4;
        try {
            return new FinderPattern(AbstractRSSReader.parseFinderValue(decodeFinderCounters, r), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void p(List<b> list, List<c> list2) {
        boolean z2;
        boolean z3;
        Iterator<c> it2 = list2.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (next.a().size() != list.size()) {
                Iterator<b> it3 = next.a().iterator();
                do {
                    z2 = false;
                    z3 = true;
                    if (!it3.hasNext()) {
                        z2 = true;
                        break;
                    }
                    b next2 = it3.next();
                    Iterator<b> it4 = list.iterator();
                    do {
                        if (!it4.hasNext()) {
                            z3 = false;
                            break;
                        }
                    } while (!next2.equals(it4.next()));
                } while (z3);
                if (z2) {
                    it2.remove();
                }
            }
        }
    }

    private static void r(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    private void s(int i, boolean z2) {
        boolean zC = false;
        int i2 = 0;
        boolean zC2 = false;
        while (i2 < this.l.size()) {
            c cVar = this.l.get(i2);
            if (cVar.b() > i) {
                zC = cVar.c(this.k);
                break;
            } else {
                zC2 = cVar.c(this.k);
                i2++;
            }
        }
        if (zC || zC2 || m(this.k, this.l)) {
            return;
        }
        this.l.add(i2, new c(this.k, i, z2));
        p(this.k, this.l);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.k.clear();
        this.n = false;
        try {
            return f(h(i, bitArray));
        } catch (NotFoundException unused) {
            this.k.clear();
            this.n = true;
            return f(h(i, bitArray));
        }
    }

    public DataCharacter g(BitArray bitArray, FinderPattern finderPattern, boolean z2, boolean z3) throws NotFoundException {
        int[] dataCharacterCounters = getDataCharacterCounters();
        for (int i = 0; i < dataCharacterCounters.length; i++) {
            dataCharacterCounters[i] = 0;
        }
        if (z3) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1], dataCharacterCounters);
            int i2 = 0;
            for (int length = dataCharacterCounters.length - 1; i2 < length; length--) {
                int i3 = dataCharacterCounters[i2];
                dataCharacterCounters[i2] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i3;
                i2++;
            }
        }
        float fSum = MathUtils.sum(dataCharacterCounters) / 17.0f;
        float f = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / 15.0f;
        if (Math.abs(fSum - f) / f > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i4 = 0; i4 < dataCharacterCounters.length; i4++) {
            float f2 = (dataCharacterCounters[i4] * 1.0f) / fSum;
            int i5 = (int) (0.5f + f2);
            if (i5 <= 0) {
                if (f2 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i5 = 1;
            } else if (i5 > 8) {
                if (f2 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                oddCounts[i6] = i5;
                oddRoundingErrors[i6] = f2 - i5;
            } else {
                evenCounts[i6] = i5;
                evenRoundingErrors[i6] = f2 - i5;
            }
        }
        b(17);
        int value = (((finderPattern.getValue() * 4) + (z2 ? 0 : 2)) + (!z3 ? 1 : 0)) - 1;
        int i7 = 0;
        int i8 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            if (l(finderPattern, z2, z3)) {
                i7 += oddCounts[length2] * s[value][length2 * 2];
            }
            i8 += oddCounts[length2];
        }
        int i9 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            if (l(finderPattern, z2, z3)) {
                i9 += evenCounts[length3] * s[value][(length3 * 2) + 1];
            }
        }
        int i10 = i7 + i9;
        if ((i8 & 1) != 0 || i8 > 13 || i8 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i11 = (13 - i8) / 2;
        int i12 = o[i11];
        return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i12, true) * p[i11]) + RSSUtils.getRSSvalue(evenCounts, 9 - i12, false) + q[i11], i10);
    }

    public List<b> h(int i, BitArray bitArray) throws NotFoundException {
        boolean z2 = false;
        while (!z2) {
            try {
                List<b> list = this.k;
                list.add(q(bitArray, list, i));
            } catch (NotFoundException e) {
                if (this.k.isEmpty()) {
                    throw e;
                }
                z2 = true;
            }
        }
        if (c()) {
            return this.k;
        }
        boolean z3 = !this.l.isEmpty();
        s(i, false);
        if (z3) {
            List<b> listE = e(false);
            if (listE != null) {
                return listE;
            }
            List<b> listE2 = e(true);
            if (listE2 != null) {
                return listE2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public List<c> k() {
        return this.l;
    }

    public b q(BitArray bitArray, List<b> list, int i) throws NotFoundException {
        FinderPattern finderPatternO;
        DataCharacter dataCharacterG;
        boolean z2 = list.size() % 2 == 0;
        if (this.n) {
            z2 = !z2;
        }
        int iJ = -1;
        boolean z3 = true;
        do {
            i(bitArray, list, iJ);
            finderPatternO = o(bitArray, i, z2);
            if (finderPatternO == null) {
                iJ = j(bitArray, this.m[0]);
            } else {
                z3 = false;
            }
        } while (z3);
        DataCharacter dataCharacterG2 = g(bitArray, finderPatternO, z2, true);
        if (!list.isEmpty() && list.get(list.size() - 1).g()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacterG = g(bitArray, finderPatternO, z2, false);
        } catch (NotFoundException unused) {
            dataCharacterG = null;
        }
        return new b(dataCharacterG2, dataCharacterG, finderPatternO, true);
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.k.clear();
        this.l.clear();
    }
}
