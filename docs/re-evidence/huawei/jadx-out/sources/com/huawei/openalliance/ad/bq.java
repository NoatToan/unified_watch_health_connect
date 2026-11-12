package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.constant.JsDslClickActionType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class bq {
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    public static void a(String str, ContentRecord contentRecord) {
        String strOptString;
        byte b2;
        int i;
        if (contentRecord == null) {
            return;
        }
        try {
            strOptString = new JSONObject(str).optString("type");
        } catch (Throwable unused) {
            hw.c("H5DslUtils", "get action type error");
            strOptString = "";
        }
        if (com.huawei.openalliance.ad.utils.dg.b(strOptString)) {
            return;
        }
        List<Integer> listO = contentRecord.O();
        strOptString.hashCode();
        int iHashCode = strOptString.hashCode();
        if (iHashCode != 2086) {
            if (iHashCode != 65025) {
                if (iHashCode == 85812 && strOptString.equals(JsDslClickActionType.OPEN_WEB)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strOptString.equals("APP")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strOptString.equals(JsDslClickActionType.OPEN_AG)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                hw.b("H5DslUtils", "open app");
                i = 3;
            } else if (b2 != 2) {
                hw.b("H5DslUtils", "illegal type, do nothing");
            } else {
                hw.b("H5DslUtils", "open web");
                i = 4;
            }
            listO = Collections.singletonList(Integer.valueOf(i));
        } else {
            hw.b("H5DslUtils", "open ag");
            listO = a(listO, (List<Integer>) Arrays.asList(2, 8, 9));
        }
        contentRecord.e(listO);
    }

    private static List<Integer> a(List<Integer> list, List<Integer> list2) {
        if (com.huawei.openalliance.ad.utils.bm.a(list) || com.huawei.openalliance.ad.utils.bm.a(list2)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            Iterator<Integer> it = list2.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == num.intValue()) {
                    arrayList.add(num);
                    break;
                }
            }
        }
        return arrayList;
    }
}
