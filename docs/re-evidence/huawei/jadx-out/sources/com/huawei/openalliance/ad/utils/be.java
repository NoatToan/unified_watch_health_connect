package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.constant.InsAppKey;
import com.huawei.openalliance.ad.fe;
import com.huawei.openalliance.ad.ge;
import com.huawei.openalliance.ad.hw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class be {
    public static void a(Context context, String str) {
        cn cnVarA;
        List<String> arrayList;
        ge geVarA = fe.a(context);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(InsAppKey.ENCODING_MODE);
            String strOptString2 = jSONObject.optString(InsAppKey.INS_APP_TYPES);
            String strOptString3 = jSONObject.optString(InsAppKey.INS_APP);
            long jOptLong = jSONObject.optLong(InsAppKey.LABEL_GEN_TIME);
            long jD = geVarA.d();
            if (jSONObject.has(InsAppKey.LABEL_GEN_TIME) && jOptLong <= jD) {
                hw.b("InsAppsUtil", "ins app label not update");
                return;
            }
            if (strOptString.equals(geVarA.b())) {
                strOptString3 = a(geVarA.a(), strOptString3);
                hw.a("InsAppsUtil", "merged ins app: %s", strOptString3);
            } else {
                hw.a("InsAppsUtil", "override ins app");
            }
            geVarA.a(strOptString3);
            if (!dg.b(strOptString)) {
                geVarA.b(strOptString);
            }
            if (dg.b(strOptString2)) {
                cnVarA = cn.a(context);
                arrayList = new ArrayList<>();
            } else {
                cnVarA = cn.a(context);
                arrayList = Arrays.asList(strOptString2.split(","));
            }
            cnVarA.b(arrayList);
            if (jSONObject.has(InsAppKey.LABEL_GEN_TIME)) {
                geVarA.a(jOptLong);
            }
        } catch (Throwable th) {
            hw.c("InsAppsUtil", "parse ins app result fail: %s", th.getClass().getSimpleName());
        }
    }

    private static String a(String str, String str2) {
        List<String> listA = dg.a(str2, ",");
        List<String> listA2 = dg.a(str, ",");
        HashSet hashSet = new HashSet();
        if (!bm.a(listA)) {
            hashSet.addAll(listA);
        }
        if (!bm.a(listA2)) {
            hashSet.addAll(listA2);
        }
        return dg.a((Collection<String>) hashSet, ",");
    }

    public static int a(String str) {
        if (dg.b(str)) {
            return 180;
        }
        int iA = dg.a(str, 180);
        if (iA == -1) {
            return -1;
        }
        if (iA < 0) {
            return 180;
        }
        return iA;
    }
}
