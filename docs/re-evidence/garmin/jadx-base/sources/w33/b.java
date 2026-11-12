package w33;

import am.j;
import i3.e5;
import java.util.LinkedHashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;
import p13.h0;
import p13.x;
import tn.k;
import w5.r;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f181889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f181890b;

    static {
        new b();
        f181889a = h0.k0(x.k('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listK = x.k("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iN = r.n(0, listK.size() - 1, 2);
        if (iN >= 0) {
            int i14 = 0;
            while (true) {
                StringBuilder sb3 = new StringBuilder();
                String str = f181889a;
                sb3.append(str);
                sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb3.append((String) listK.get(i14));
                int i15 = i14 + 1;
                linkedHashMap.put(sb3.toString(), listK.get(i15));
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(IOUtils.DIR_SEPARATOR_UNIX);
                linkedHashMap.put(j.o((String) listK.get(i14), "Array", sb4), "[" + ((String) listK.get(i15)));
                if (i14 == iN) {
                    break;
                } else {
                    i14 += 2;
                }
            }
        }
        linkedHashMap.put(f181889a + "/Unit", "V");
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : x.k("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : x.k("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(fb1.c.n("collections/", str3), "java/util/" + str3, linkedHashMap);
            a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i16 = 0; i16 < 23; i16++) {
            String strH = j.h(i16, "Function");
            StringBuilder sb5 = new StringBuilder();
            String str4 = f181889a;
            sb5.append(str4);
            sb5.append("/jvm/functions/Function");
            sb5.append(i16);
            a(strH, sb5.toString(), linkedHashMap);
            a("reflect/KFunction" + i16, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : x.k("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(k.g(str5, ".Companion"), e5.h(new StringBuilder(), f181889a, "/jvm/internal/", str5, "CompanionObject"), linkedHashMap);
        }
        f181890b = linkedHashMap;
    }

    private b() {
    }

    public static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(f181889a + IOUtils.DIR_SEPARATOR_UNIX + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        str.getClass();
        String str2 = (String) f181890b.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb3 = new StringBuilder("L");
        String strReplace = str.replace('.', '$');
        strReplace.getClass();
        sb3.append(strReplace);
        sb3.append(';');
        return sb3.toString();
    }
}
