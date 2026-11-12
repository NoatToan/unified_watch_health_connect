package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class xed {
    public static String[][] a(String[][] strArr) {
        String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, strArr.length, 2);
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i][0] = strArr[i][1];
            strArr2[i][1] = strArr[i][0];
        }
        return strArr2;
    }
}
