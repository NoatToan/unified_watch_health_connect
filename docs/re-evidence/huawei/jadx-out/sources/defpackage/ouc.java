package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.TrackData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ouc {
    public static void b(TrackData trackData, otl otlVar, Context context) {
        LogUtil.a("PLGACHIEVE_AchieveTrackMedalService", "Enter dealEventMedalGenerate");
        if (context == null) {
            return;
        }
        HashMap map = new HashMap(2);
        if (otlVar == null) {
            otlVar = otl.b(context.getApplicationContext());
        }
        List<osf> listD = otlVar.d(9, map);
        ArrayList<String> arrayListL = otlVar.l();
        LogUtil.a("PLGACHIEVE_AchieveTrackMedalService", "getMedalLightList size:", Integer.valueOf(arrayListL.size()));
        if (listD != null) {
            for (osf osfVar : listD) {
                if (osfVar instanceof MedalConfigInfo) {
                    MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                    String strAcquireMedalType = medalConfigInfo.acquireMedalType();
                    if (!TextUtils.isEmpty(strAcquireMedalType) && !pax.l(strAcquireMedalType) && strAcquireMedalType.length() >= 3 && !arrayListL.contains(medalConfigInfo.acquireMedalID())) {
                        d(medalConfigInfo, trackData, otlVar);
                    }
                }
            }
        }
    }

    private static void d(MedalConfigInfo medalConfigInfo, TrackData trackData, otl otlVar) {
        if (!a(medalConfigInfo, trackData)) {
            LogUtil.a("PLGACHIEVE_AchieveTrackMedalService", "judgeTimeIsValid:invalid.");
            return;
        }
        int iAcquireActionType = medalConfigInfo.acquireActionType();
        LogUtil.a("PLGACHIEVE_AchieveTrackMedalService", "medalActionType=", Integer.valueOf(iAcquireActionType));
        String strAcquireMedalID = medalConfigInfo.acquireMedalID();
        String strAcquireMedalType = medalConfigInfo.acquireMedalType();
        int iAcquireMedalLevel = medalConfigInfo.acquireMedalLevel();
        double dC = paw.c((long) trackData.acquireDistance());
        LogUtil.a("PLGACHIEVE_AchieveTrackMedalService", "medalLevel=", Integer.valueOf(iAcquireMedalLevel), " medalType=", strAcquireMedalType, " medalId=", strAcquireMedalID);
        if (3 == iAcquireActionType || 11 == iAcquireActionType) {
            if (!oun.a(trackData.acquireType()) || dC < iAcquireMedalLevel) {
                return;
            }
            otlVar.c(strAcquireMedalID, strAcquireMedalType, iAcquireMedalLevel);
            b(otlVar, strAcquireMedalID, iAcquireMedalLevel);
            return;
        }
        if (4 == iAcquireActionType || 12 == iAcquireActionType) {
            if (259 != trackData.acquireType() || dC < iAcquireMedalLevel) {
                return;
            }
            otlVar.c(strAcquireMedalID, strAcquireMedalType, iAcquireMedalLevel);
            b(otlVar, strAcquireMedalID, iAcquireMedalLevel);
            return;
        }
        LogUtil.j("PLGACHIEVE_AchieveTrackMedalService", "dealTrackData type error:", Integer.valueOf(iAcquireActionType));
    }

    private static void b(otl otlVar, String str, int i) {
        if (otlVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveTrackMedalService", "doRefreshMedal medalId ", str, " medalLevel ", String.valueOf(i));
        Map<String, String> mapC = otlVar.c(str, String.valueOf(i));
        mapC.put("countryCode", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        otlVar.a(7, mapC);
    }

    private static boolean a(MedalConfigInfo medalConfigInfo, TrackData trackData) {
        long j;
        if (!oun.a(medalConfigInfo.acquireStartTime()) || !oun.a(medalConfigInfo.acquireEndTime())) {
            return false;
        }
        long j2 = 0;
        try {
            j = Long.parseLong(medalConfigInfo.acquireStartTime());
            try {
                j2 = Long.parseLong(medalConfigInfo.acquireEndTime());
            } catch (NumberFormatException unused) {
                LogUtil.e("PLGACHIEVE_AchieveTrackMedalService", "requestSportData NumberFormatException");
            }
        } catch (NumberFormatException unused2) {
            j = 0;
        }
        return j2 >= trackData.acquireTrackTime() && trackData.acquireTrackTime() >= j;
    }
}
