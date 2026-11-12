package r0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private t() {
    }

    public static void a(int i14, Collection collection) {
        boolean zContains = collection.contains(Integer.valueOf(i14));
        Locale locale = Locale.US;
        String strB = b(i14);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(b(((Integer) it.next()).intValue()));
        }
        k7.h.b(zContains, e0.g("Effects target ", strB, " is not in the supported list ", "[" + String.join(", ", arrayList) + "]", "."));
    }

    public static String b(int i14) {
        ArrayList arrayList = new ArrayList();
        if ((i14 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i14 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i14 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }
}
