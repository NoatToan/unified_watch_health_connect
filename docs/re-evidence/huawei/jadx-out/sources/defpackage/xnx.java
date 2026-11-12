package defpackage;

import com.tencent.open.SocialConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class xnx {
    public static void b(String str, int i, String str2) {
        b(str, str2, true);
    }

    private static void b(final String str, final String str2, final boolean z) {
        xpc.b().c().post(new Runnable() { // from class: xnu
            @Override // java.lang.Runnable
            public final void run() {
                xnx.b(str2, z, str);
            }
        });
    }

    static /* synthetic */ void b(String str, boolean z, String str2) {
        int i;
        String strSubstring;
        int length = str.length();
        if (length % 24576 == 0) {
            i = length / 24576;
        } else {
            i = (length / 24576) + 1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put("log", xni.e());
        }
        if (length == 0) {
            linkedHashMap.put("group_time", jCurrentTimeMillis + "");
            linkedHashMap.put(SocialConstants.PARAM_APP_DESC, str);
            xob.e(0, str2, linkedHashMap);
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            if (i2 == i - 1) {
                strSubstring = str.substring(i2 * 24576, length);
            } else {
                strSubstring = str.substring(i2 * 24576, (i2 + 1) * 24576);
            }
            linkedHashMap.put("group_time", jCurrentTimeMillis + "");
            linkedHashMap.put("total_segment", i + "");
            StringBuilder sb = new StringBuilder();
            i2++;
            sb.append(i2);
            sb.append("");
            linkedHashMap.put("subindex", sb.toString());
            linkedHashMap.put(SocialConstants.PARAM_APP_DESC, strSubstring);
            xob.e(0, str2, linkedHashMap);
        }
    }

    public static void b(String str, String str2) {
        b(str, 2, str2);
    }

    public static void a(String str) {
        b("RequestAndResponse_Message", 2, str);
    }
}
