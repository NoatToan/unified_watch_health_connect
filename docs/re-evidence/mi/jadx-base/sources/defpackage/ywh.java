package defpackage;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/* JADX INFO: loaded from: classes3.dex */
public class ywh {
    public static String[] a(char c, ukb ukbVar) throws BadHanyuPinyinOutputFormatCombination {
        String[] strArrB = b(c);
        if (strArrB == null) {
            return null;
        }
        for (int i = 0; i < strArrB.length; i++) {
            strArrB[i] = xwh.b(strArrB[i], ukbVar);
        }
        return strArrB;
    }

    public static String[] b(char c) {
        return nv3.c().b(c);
    }

    public static String[] c(char c, ukb ukbVar) throws BadHanyuPinyinOutputFormatCombination {
        return a(c, ukbVar);
    }
}
