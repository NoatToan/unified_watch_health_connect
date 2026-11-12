package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.updatesdk.sdk.service.storekit.bean.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bhp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Map<String, String>> f1109b = new HashMap(1);

    private static void a(Map<String, String> map) {
    }

    public static String c(Context context, String str) {
        Map<String, String> mapE;
        synchronized (bhp.class) {
            String strA = bhm.d().a(context);
            Map<String, Map<String, String>> map = f1109b;
            Map<String, String> map2 = map.get(strA);
            String str2 = map2 != null ? map2.get(str) : "";
            if (TextUtils.isEmpty(str2) && (mapE = bhl.e(context, "com.huawei.cloud.agdsdkV02")) != null) {
                map.put(strA, mapE);
                str2 = mapE.get(str);
                a(mapE);
            }
            if (TextUtils.isEmpty(str2)) {
                bhn.b("ServerUrlCache", "get grs url is empty!");
                return str2;
            }
            return str2 + c.CLIENT_API;
        }
    }
}
