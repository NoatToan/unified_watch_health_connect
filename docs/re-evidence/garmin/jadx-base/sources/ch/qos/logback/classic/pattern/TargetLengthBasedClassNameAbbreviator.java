package ch.qos.logback.classic.pattern;

import java.io.PrintStream;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class TargetLengthBasedClassNameAbbreviator implements Abbreviator {
    final int targetLength;

    public TargetLengthBasedClassNameAbbreviator(int i14) {
        this.targetLength = i14;
    }

    public static int computeDotIndexes(String str, int[] iArr) {
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int iIndexOf = str.indexOf(46, i14);
            if (iIndexOf == -1 || i15 >= 16) {
                break;
            }
            iArr[i15] = iIndexOf;
            i15++;
            i14 = iIndexOf + 1;
        }
        return i15;
    }

    public static void printArray(String str, int[] iArr) {
        System.out.print(str);
        for (int i14 = 0; i14 < iArr.length; i14++) {
            PrintStream printStream = System.out;
            if (i14 == 0) {
                printStream.print(iArr[i14]);
            } else {
                printStream.print(", " + iArr[i14]);
            }
        }
        System.out.println();
    }

    @Override // ch.qos.logback.classic.pattern.Abbreviator
    public String abbreviate(String str) {
        String strSubstring;
        StringBuilder sb3 = new StringBuilder(this.targetLength);
        if (str == null) {
            h.s("Class name may not be null");
            return null;
        }
        if (str.length() >= this.targetLength) {
            int[] iArr = new int[16];
            int[] iArr2 = new int[17];
            int iComputeDotIndexes = computeDotIndexes(str, iArr);
            if (iComputeDotIndexes != 0) {
                computeLengthArray(str, iArr, iArr2, iComputeDotIndexes);
                for (int i14 = 0; i14 <= iComputeDotIndexes; i14++) {
                    if (i14 == 0) {
                        strSubstring = str.substring(0, iArr2[i14] - 1);
                    } else {
                        int i15 = iArr[i14 - 1];
                        strSubstring = str.substring(i15, iArr2[i14] + i15);
                    }
                    sb3.append(strSubstring);
                }
                return sb3.toString();
            }
        }
        return str;
    }

    public void computeLengthArray(String str, int[] iArr, int[] iArr2, int i14) {
        int length = str.length() - this.targetLength;
        int i15 = 0;
        while (i15 < i14) {
            int i16 = (iArr[i15] - (i15 > 0 ? iArr[i15 - 1] : -1)) - 1;
            int i17 = (length <= 0 || i16 < 1) ? i16 : 1;
            length -= i16 - i17;
            iArr2[i15] = i17 + 1;
            i15++;
        }
        iArr2[i14] = str.length() - iArr[i14 - 1];
    }
}
