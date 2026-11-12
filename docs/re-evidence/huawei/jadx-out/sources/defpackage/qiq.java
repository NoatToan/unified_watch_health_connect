package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes43.dex */
public class qiq {
    public static String d(String str) {
        if (str.endsWith(File.separator)) {
            str = str.substring(0, str.length() - 2);
        }
        int iLastIndexOf = str.lastIndexOf(File.separator);
        if (iLastIndexOf == -1) {
            return "";
        }
        return str.substring(0, iLastIndexOf);
    }
}
