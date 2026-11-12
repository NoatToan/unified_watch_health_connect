package com.huami.watch.companion.util;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class AlphaPinYinComparator implements Comparator<Object> {
    private PackageManager a;
    private Collator b = Collator.getInstance(Locale.CHINESE);

    public AlphaPinYinComparator(PackageManager packageManager) {
        this.a = packageManager;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? 0 : -1;
        }
        if (obj2 == null) {
            return 1;
        }
        String string = ((ApplicationInfo) obj).loadLabel(this.a).toString();
        String string2 = ((ApplicationInfo) obj2).loadLabel(this.a).toString();
        char[] charArray = string.trim().toCharArray();
        char[] charArray2 = string2.trim().toCharArray();
        int iMin = Math.min(charArray.length, charArray2.length);
        for (int i = 0; i < iMin; i++) {
            boolean zMatches = Character.toString(charArray[i]).matches("[\\u4E00-\\u9FA5]+");
            boolean zMatches2 = Character.toString(charArray2[i]).matches("[\\u4E00-\\u9FA5]+");
            if (zMatches && zMatches2) {
                return this.b.compare(string, string2);
            }
            if (zMatches) {
                return (charArray2[i] < '0' || charArray2[i] > '9') ? -1 : 1;
            }
            if (zMatches2) {
                return (charArray[i] < '0' || charArray[i] > '9') ? 1 : -1;
            }
            char lowerCase = (charArray[i] < 'A' || charArray[i] > 'Z') ? charArray[i] : Character.toLowerCase(charArray[i]);
            char lowerCase2 = (charArray2[i] < 'A' || charArray2[i] > 'Z') ? charArray2[i] : Character.toLowerCase(charArray2[i]);
            if (lowerCase > lowerCase2) {
                return 1;
            }
            if (lowerCase < lowerCase2) {
                return -1;
            }
        }
        if (charArray.length == charArray2.length) {
            return 0;
        }
        return charArray.length > iMin ? 1 : -1;
    }
}
