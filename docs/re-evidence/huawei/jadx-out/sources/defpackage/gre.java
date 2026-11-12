package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class gre {
    public static List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.contains("/")) {
                int iLastIndexOf = str.lastIndexOf("/");
                if (iLastIndexOf == -1) {
                    break;
                }
                arrayList.add(str.substring(0, iLastIndexOf));
            }
        }
        return arrayList;
    }

    public static List<String> c(List<String> list) {
        String strSubstring;
        int iLastIndexOf;
        String strSubstring2;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.contains("/")) {
                int iLastIndexOf2 = str.lastIndexOf("/");
                if (iLastIndexOf2 == -1 || (iLastIndexOf = (strSubstring = str.substring(0, iLastIndexOf2)).lastIndexOf("/")) == -1) {
                    break;
                }
                String strSubstring3 = strSubstring.substring(0, iLastIndexOf);
                int i = iLastIndexOf + 1;
                if (i > strSubstring.length()) {
                    strSubstring2 = "";
                } else {
                    strSubstring2 = strSubstring.substring(i);
                }
                arrayList.add(strSubstring3);
                arrayList.add(strSubstring2);
            }
        }
        return arrayList;
    }
}
