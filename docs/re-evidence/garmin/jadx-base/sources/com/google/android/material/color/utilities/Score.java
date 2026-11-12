package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    public static class ScoredHCT {
        public final Hct hct;
        public final double score;

        public ScoredHCT(Hct hct, double d14) {
            this.hct = hct;
            this.score = d14;
        }
    }

    private Score() {
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i14, int i15, boolean z14) {
        ArrayList<Hct> arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d14 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Hct hctFromInt = Hct.fromInt(entry.getKey().intValue());
            arrayList.add(hctFromInt);
            int iFloor = (int) Math.floor(hctFromInt.getHue());
            int iIntValue = entry.getValue().intValue();
            iArr[iFloor] = iArr[iFloor] + iIntValue;
            d14 += (double) iIntValue;
        }
        double[] dArr = new double[360];
        for (int i16 = 0; i16 < 360; i16++) {
            double d15 = ((double) iArr[i16]) / d14;
            for (int i17 = i16 - 14; i17 < i16 + 16; i17++) {
                int iSanitizeDegreesInt = MathUtils.sanitizeDegreesInt(i17);
                dArr[iSanitizeDegreesInt] = dArr[iSanitizeDegreesInt] + d15;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Hct hct : arrayList) {
            double d16 = dArr[MathUtils.sanitizeDegreesInt((int) Math.round(hct.getHue()))];
            if (!z14 || (hct.getChroma() >= CUTOFF_CHROMA && d16 > CUTOFF_EXCITED_PROPORTION)) {
                arrayList2.add(new ScoredHCT(hct, ((hct.getChroma() - TARGET_CHROMA) * (hct.getChroma() < TARGET_CHROMA ? 0.1d : WEIGHT_CHROMA_ABOVE)) + (d16 * 100.0d * 0.7d)));
            }
        }
        Collections.sort(arrayList2, new ScoredComparator());
        ArrayList arrayList3 = new ArrayList();
        for (int i18 = 90; i18 >= 15; i18--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Hct hct2 = ((ScoredHCT) it.next()).hct;
                Iterator it3 = arrayList3.iterator();
                do {
                    if (!it3.hasNext()) {
                        arrayList3.add(hct2);
                        break;
                    }
                } while (MathUtils.differenceDegrees(hct2.getHue(), ((Hct) it3.next()).getHue()) >= i18);
                if (arrayList3.size() >= i14) {
                    break;
                }
            }
            if (arrayList3.size() >= i14) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i15));
            return arrayList4;
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Integer.valueOf(((Hct) it4.next()).toInt()));
        }
        return arrayList4;
    }

    public static class ScoredComparator implements Comparator<ScoredHCT> {
        @Override // java.util.Comparator
        public int compare(ScoredHCT scoredHCT, ScoredHCT scoredHCT2) {
            return Double.compare(scoredHCT2.score, scoredHCT.score);
        }
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i14) {
        return score(map, i14, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i14, int i15) {
        return score(map, i14, i15, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        return score(map, 4, BLUE_500, true);
    }
}
