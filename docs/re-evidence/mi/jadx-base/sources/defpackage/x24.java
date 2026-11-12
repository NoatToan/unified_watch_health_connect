package defpackage;

import android.text.TextUtils;
import com.miui.tsmclientsdk.MiTsmConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes7.dex */
public class x24 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static String b(String str, String str2, String str3) throws Exception {
        return new g6j(q34.b(q34.c(a(q34.a(str3), q34.a(str2))))).a(str);
    }

    public static Map<String, String> c(String str, String str2, Map<String, String> map, String str3, String str4) throws Exception {
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    treeMap.put(key, value);
                }
            }
        }
        String strB = q34.b(q34.c(a(q34.a(str4), q34.a(str3))));
        treeMap.put("rc4_hash__", c24.b(str, str2, treeMap, strB));
        g6j g6jVar = new g6j(strB);
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String strC = g6jVar.c((String) entry2.getValue());
            treeMap2.put((String) entry2.getKey(), strC);
            map2.put((String) entry2.getKey(), strC);
        }
        map2.put(MiTsmConstants.KEY_SIGNATURE, c24.b(str, str2, treeMap2, strB));
        map2.put("_nonce", str3);
        return map2;
    }

    public static Map<String, String> d(String str, Map<String, String> map, String str2, String str3) throws Exception {
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    treeMap.put(key, value);
                }
            }
        }
        String strB = q34.b(q34.c(a(q34.a(str3), q34.a(str2))));
        ArrayList<String> arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        arrayList.add(strB);
        arrayList.add(str2);
        if (treeMap.isEmpty()) {
            arrayList.add("data=");
        } else {
            for (Map.Entry entry2 : treeMap.entrySet()) {
                arrayList.add(String.format("%s=%s", entry2.getKey(), entry2.getValue()));
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str4 : arrayList) {
            if (!z) {
                sb.append(Typography.amp);
            }
            sb.append(str4);
            z = false;
        }
        map2.put(MiTsmConstants.KEY_SIGNATURE, f(sb.toString(), strB));
        map2.put("_nonce", str2);
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }

    public static String e(long j) {
        return c24.a(j);
    }

    public static String f(String str, String str2) throws Exception {
        return q34.b(ucb.a(q34.a(str2), str.getBytes()));
    }
}
