package i6;

import e23.l;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = arrayList.get(i14);
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String b(List list, String str, l lVar, int i14) {
        if ((i14 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i14 & 2) != 0 ? "" : "[\n\t";
        String str3 = (i14 & 4) == 0 ? "\n]" : "";
        if ((i14 & 32) != 0) {
            lVar = null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) str2);
        int size = list.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            Object obj = list.get(i16);
            i15++;
            if (i15 > 1) {
                sb3.append((CharSequence) str);
            }
            if (lVar != null) {
                sb3.append((CharSequence) lVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) str3);
        return sb3.toString();
    }

    public static final Void c(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void d(String str) {
        throw new UnsupportedOperationException(str);
    }
}
