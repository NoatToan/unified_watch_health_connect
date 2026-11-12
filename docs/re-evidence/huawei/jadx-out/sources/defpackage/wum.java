package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class wum {
    private static Map<String, String> d = new HashMap<String, String>() { // from class: wum.5
        private static final long serialVersionUID = -8160320276311542531L;

        {
            put("EXCE_SCORE__ERROR", HiAnalyticsConstant.KeyAndValue.NUMBER_01);
            put("EXCE_LIGHTSLEEP__MIN_ERROR", a.t);
            put("EXCE_LIGHTSLEEP__MIX _ERROR", "03");
            put("EXCE_DEEPSLEEP__MIN_ERROR", "04");
            put("EXCE_DEEPSLEEP__MIX _ERROR", "05");
            put("EXCE_REMLEEP__MIN_ERROR", "06");
            put("EXCE_REMSLEEP__MIX _ERROR", "07");
            put("EXCE_BREATH__SCORE_ERROR", "08");
            put("EXCE_TRUSLEEP__TIME_ERROR", "09");
            put("EXCE_NORMALSLEEP__TIME_ERROR", "10");
        }
    };

    public static void a(Context context, String str, String str2) {
        if (CommonUtil.bu() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (c(new SimpleDateFormat("yyyy-MM-dd").format(ltb.b()), str, "yyyy-MM-dd") + 1 > 7) {
            LogUtil.a("UIHLH_FitnessUpgUtils", "the time is > 7 days");
            return;
        }
        ArrayList<String> arrayListA = a(str2);
        String str3 = d.get(str2);
        if (njy.b(arrayListA)) {
            if (c(arrayListA, str)) {
                return;
            }
            arrayListA.add(str);
            Collections.sort(arrayListA);
            if (arrayListA.size() > 7) {
                arrayListA.remove(0);
            }
            mjh.a(context, "031302", str2, str3, str);
            e(context, str2, arrayListA);
            return;
        }
        mjh.a(context, "031302", str2, str3, str);
        arrayListA.add(str);
        e(context, str2, arrayListA);
    }

    private static ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String strA = wvf.e().a(str);
        if (!TextUtils.isEmpty(strA)) {
            try {
                return (ArrayList) new Gson().fromJson(strA, new TypeToken<ArrayList<String>>() { // from class: com.huawei.ui.main.stories.utils.FitnessUpgUtils$2
                }.getType());
            } catch (JsonSyntaxException e) {
                LogUtil.a("UIHLH_FitnessUpgUtils", "JsonSyntaxException ", e.getMessage());
            }
        }
        return arrayList;
    }

    private static boolean c(ArrayList<String> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            String str2 = arrayList.get(i);
            if (str2 != null && str2.equals(str)) {
                LogUtil.a("UIHLH_FitnessUpgUtils", "the time already has been write down");
                return true;
            }
        }
        return false;
    }

    private static void e(Context context, String str, ArrayList<String> arrayList) {
        DeviceInfo deviceInfoC = mgg.c("UIHLH_FitnessUpgUtils");
        if (deviceInfoC == null) {
            deviceInfoC = mgi.c("UIHLH_FitnessUpgUtils");
        }
        if (deviceInfoC == null || !njy.b(arrayList)) {
            return;
        }
        try {
            wvf.e().b(new Gson().toJson(arrayList), str);
        } catch (JsonIOException unused) {
            LogUtil.e("UIHLH_FitnessUpgUtils", "setSleepUpgInformation JsonIOException");
        }
    }

    private static int c(String str, String str2, String str3) {
        Date dateB = ieg.b(str, str3);
        Date dateB2 = ieg.b(str2, str3);
        if (dateB2 == null || dateB == null) {
            return 0;
        }
        return Math.abs(ift.j(dateB.getTime()) - ift.j(dateB2.getTime()));
    }
}
