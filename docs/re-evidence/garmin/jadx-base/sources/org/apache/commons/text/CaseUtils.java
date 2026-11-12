package org.apache.commons.text;

import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CaseUtils {
    private static Set<Integer> generateDelimiterSet(char[] cArr) {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(Character.codePointAt(new char[]{' '}, 0)));
        if (!ArrayUtils.isEmpty(cArr)) {
            for (int i14 = 0; i14 < cArr.length; i14++) {
                hashSet.add(Integer.valueOf(Character.codePointAt(cArr, i14)));
            }
        }
        return hashSet;
    }

    public static String toCamelCase(String str, boolean z14, char... cArr) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        String lowerCase = str.toLowerCase();
        int length = lowerCase.length();
        int[] iArr = new int[length];
        Set<Integer> setGenerateDelimiterSet = generateDelimiterSet(cArr);
        boolean z15 = z14;
        int iCharCount = 0;
        int i14 = 0;
        while (iCharCount < length) {
            int iCodePointAt = lowerCase.codePointAt(iCharCount);
            if (setGenerateDelimiterSet.contains(Integer.valueOf(iCodePointAt))) {
                z15 = i14 != 0;
                iCharCount = Character.charCount(iCodePointAt) + iCharCount;
            } else if (z15 || (i14 == 0 && z14)) {
                int titleCase = Character.toTitleCase(iCodePointAt);
                int i15 = i14 + 1;
                iArr[i14] = titleCase;
                int iCharCount2 = Character.charCount(titleCase) + iCharCount;
                z15 = false;
                iCharCount = iCharCount2;
                i14 = i15;
            } else {
                iArr[i14] = iCodePointAt;
                iCharCount = Character.charCount(iCodePointAt) + iCharCount;
                i14++;
            }
        }
        return i14 != 0 ? new String(iArr, 0, i14) : lowerCase;
    }
}
