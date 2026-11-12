package cn.hutool.core.comparator;

import defpackage.g4h;
import defpackage.tt3;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VersionComparator implements Comparator<String>, Serializable {
    public static final VersionComparator INSTANCE = new VersionComparator();
    private static final long serialVersionUID = 8083701245147495562L;

    @Override // java.util.Comparator
    public int compare(String str, String str2) {
        if (g4h.g(str, str2)) {
            return 0;
        }
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        List<String> listX = tt3.X(str, '.');
        List<String> listX2 = tt3.X(str2, '.');
        int iMin = Math.min(listX.size(), listX2.size());
        int iCompareTo = 0;
        for (int i = 0; i < iMin; i++) {
            String str3 = listX.get(i);
            String str4 = listX2.get(i);
            int length = str3.length() - str4.length();
            iCompareTo = length == 0 ? str3.compareTo(str4) : length;
            if (iCompareTo != 0) {
                break;
            }
        }
        return iCompareTo != 0 ? iCompareTo : listX.size() - listX2.size();
    }
}
