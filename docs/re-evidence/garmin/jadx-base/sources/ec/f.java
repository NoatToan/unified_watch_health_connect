package ec;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private f() {
    }

    public static g a(g gVar, String[] strArr, Map<String, g> map) {
        int i14 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i14 < length) {
                    gVar2.a(map.get(strArr[i14]));
                    i14++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a(map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i14 < length2) {
                    gVar.a(map.get(strArr[i14]));
                    i14++;
                }
            }
        }
        return gVar;
    }
}
