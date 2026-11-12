package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class x {
    private static void a(Context context, String str, Map<String, String> map, Map<Integer, String> map2) {
        List list = (List) bk.b(map.get(str), List.class, new Class[0]);
        if (bm.a(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int identifier = context.getResources().getIdentifier((String) it.next(), "id", context.getPackageName());
            if (identifier != 0) {
                map2.put(Integer.valueOf(identifier), str);
            }
        }
    }

    public static Map<Integer, String> a(Context context, Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (!br.a(map)) {
            a(context, "title", map, map2);
            a(context, "content", map, map2);
            a(context, "category", map, map2);
            a(context, Constants.AUTOCONTENT_SUBCATEGORY, map, map2);
        }
        return map2;
    }
}
