package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class crl {
    public static boolean b(otl otlVar, Context context) {
        if (context == null || otlVar == null) {
            return true;
        }
        if (otlVar.q() == null || otlVar.q().getHuid() == null) {
            otlVar.ac();
            if (otlVar.q() == null || otlVar.q().getHuid() == null) {
                LogUtil.j("PLGACHIEVE_MedalRule", "dealTrack userProfile or uid is null");
                return true;
            }
        }
        if (!TextUtils.isEmpty(osa.e(context, "personal"))) {
            return false;
        }
        LogUtil.j("PLGACHIEVE_MedalRule", "flag is null");
        return true;
    }

    public static void a(Context context, ArrayList<MedalConfigInfo> arrayList, String str) {
        LogUtil.a("PLGACHIEVE_MedalRule", "dealStableMedal stableMedalId == ", str);
        otl otlVarB = otl.b(context);
        StringBuilder sb = new StringBuilder();
        for (MedalConfigInfo medalConfigInfo : arrayList) {
            String strAcquireMedalID = medalConfigInfo.acquireMedalID();
            sb.append(strAcquireMedalID);
            sb.append(",");
            if (str.equals(strAcquireMedalID)) {
                otlVarB.c(strAcquireMedalID, medalConfigInfo.acquireMedalType(), medalConfigInfo.acquireMedalLevel());
            } else {
                b(strAcquireMedalID);
            }
            Map<String, String> mapC = otlVarB.c(strAcquireMedalID, String.valueOf(medalConfigInfo.acquireMedalLevel()));
            mapC.put("countryCode", LoginInit.getInstance(context).getCountryCode(null));
            otlVarB.a(7, mapC);
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
            d(context, sb.toString());
            LogUtil.a("PLGACHIEVE_MedalRule", "dealStableMedal stableMedalIdList == ", sb.toString());
        }
    }

    public static void b(String str) {
        MedalLocation medalLocation = new MedalLocation();
        medalLocation.saveGainedCount(1);
        medalLocation.saveMedalGainedTime(String.valueOf(System.currentTimeMillis()));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        medalLocation.saveMedalID(str);
        otl.b(BaseApplication.getContext()).a(medalLocation);
    }

    private static void d(Context context, String str) {
        HashMap map = new HashMap(2);
        map.put("_uploadMedal", str);
        osa.b(context, map);
    }

    public static String b(long j) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date(j));
    }
}
