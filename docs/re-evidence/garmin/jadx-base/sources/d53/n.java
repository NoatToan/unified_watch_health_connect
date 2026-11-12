package d53;

import c53.c0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class n extends m {
    public static String b(String str) {
        return c0.m(c0.o(new v(str), new cq.t("    ", 9)), "\n");
    }

    public static String c(String str) {
        int length;
        List listS = c0.s(new v(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (!w.J((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!a.b(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) h0.t0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listS.size();
        int size = listS.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listS) {
            int i14 = length + 1;
            if (length < 0) {
                p13.x.q();
                throw null;
            }
            String str3 = (String) obj2;
            String strN0 = ((length == 0 || length == size) && w.J(str3)) ? null : y.n0(iIntValue, str3);
            if (strN0 != null) {
                arrayList3.add(strN0);
            }
            length = i14;
        }
        StringBuilder sb3 = new StringBuilder(length3);
        h0.j0(arrayList3, sb3, "\n", null, null, null, 124);
        return sb3.toString();
    }

    public static String d(String str) throws IOException {
        if (w.J("|")) {
            vb.h.s("marginPrefix must be non-blank string.");
            return null;
        }
        List listS = c0.s(new v(str));
        int length = str.length();
        listS.size();
        int size = listS.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : listS) {
            int i15 = i14 + 1;
            String strSubstring = null;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            String str2 = (String) obj;
            if ((i14 != 0 && i14 != size) || !w.J(str2)) {
                int length2 = str2.length();
                int i16 = 0;
                while (true) {
                    if (i16 >= length2) {
                        i16 = -1;
                        break;
                    }
                    if (!a.b(str2.charAt(i16))) {
                        break;
                    }
                    i16++;
                }
                if (i16 != -1 && u.x(i16, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i16);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i14 = i15;
        }
        StringBuilder sb3 = new StringBuilder(length);
        h0.j0(arrayList, sb3, "\n", null, null, null, 124);
        return sb3.toString();
    }
}
