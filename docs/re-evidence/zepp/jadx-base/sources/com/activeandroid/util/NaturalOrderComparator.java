package com.activeandroid.util;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class NaturalOrderComparator implements Comparator<Object> {
    public static char charAt(String str, int i) {
        if (i >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int iCompareRight;
        String string = obj.toString();
        String string2 = obj2.toString();
        int i = 0;
        int i2 = 0;
        while (true) {
            char cCharAt = charAt(string, i);
            char cCharAt2 = charAt(string2, i2);
            int i3 = 0;
            while (true) {
                if (!Character.isSpaceChar(cCharAt) && cCharAt != '0') {
                    break;
                }
                i3 = cCharAt == '0' ? i3 + 1 : 0;
                i++;
                cCharAt = charAt(string, i);
            }
            int i4 = 0;
            while (true) {
                if (!Character.isSpaceChar(cCharAt2) && cCharAt2 != '0') {
                    break;
                }
                i4 = cCharAt2 == '0' ? i4 + 1 : 0;
                i2++;
                cCharAt2 = charAt(string2, i2);
            }
            if (Character.isDigit(cCharAt) && Character.isDigit(cCharAt2) && (iCompareRight = compareRight(string.substring(i), string2.substring(i2))) != 0) {
                return iCompareRight;
            }
            if (cCharAt == 0 && cCharAt2 == 0) {
                return i3 - i4;
            }
            if (cCharAt < cCharAt2) {
                return -1;
            }
            if (cCharAt > cCharAt2) {
                return 1;
            }
            i++;
            i2++;
        }
    }

    public int compareRight(String str, String str2) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char cCharAt = charAt(str, i);
            char cCharAt2 = charAt(str2, i2);
            if (!Character.isDigit(cCharAt) && !Character.isDigit(cCharAt2)) {
                return i3;
            }
            if (!Character.isDigit(cCharAt)) {
                return -1;
            }
            if (!Character.isDigit(cCharAt2)) {
                return 1;
            }
            if (cCharAt < cCharAt2) {
                if (i3 == 0) {
                    i3 = -1;
                }
            } else if (cCharAt > cCharAt2) {
                if (i3 == 0) {
                    i3 = 1;
                }
            } else if (cCharAt == 0 && cCharAt2 == 0) {
                return i3;
            }
            i++;
            i2++;
        }
    }
}
