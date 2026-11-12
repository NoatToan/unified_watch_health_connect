package defpackage;

import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cjt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f1652b;

    static {
        HashMap map = new HashMap(5);
        f1652b = map;
        map.put(cmj.j.toString(), cmj.f.toString());
    }

    public static String e(String str) {
        Map<String, String> map = f1652b;
        if (!map.containsKey(str)) {
            return str;
        }
        String str2 = map.get(str);
        LogUtil.b("CharacteristicConfig", "getCharacteristic ", str, " to ", str2);
        return str2;
    }
}
