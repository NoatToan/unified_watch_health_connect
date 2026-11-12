package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class pza extends HashMap<String, String> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String put(String str, String str2) {
        String str3 = get(str);
        if (str3 != null) {
            if (str3.contains(str2)) {
                return str2;
            }
            return (String) super.put(str, str3 + "HWSKINNERGS" + str2);
        }
        return (String) super.put(str, str2);
    }

    public String[] e(String str) {
        String str2 = get(str);
        if (str2 == null) {
            return null;
        }
        if (str2.contains("HWSKINNERGS")) {
            return str2.split("HWSKINNERGS");
        }
        return new String[]{str2};
    }
}
