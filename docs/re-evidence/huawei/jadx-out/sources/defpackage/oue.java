package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import com.huawei.pluginachievement.manager.model.TrackData;
import health.compact.a.HiDateUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class oue {
    private static otl d;

    public static void a(TrackData trackData, otl otlVar, Context context) {
        double dAcquireMedalLevel;
        if (a(otlVar, context)) {
            return;
        }
        if (TextUtils.isEmpty(osa.e(context, "personal"))) {
            LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "flag is null");
            return;
        }
        if (trackData == null) {
            LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "trackData is null");
            return;
        }
        double dE = e(trackData);
        HashMap map = new HashMap(2);
        ArrayList arrayList = new ArrayList(8);
        List<osf> listD = d.d(9, map);
        ArrayList<String> arrayListL = d.l();
        if (listD == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "medalConfigInfos size ", Integer.valueOf(listD.size()));
        double d2 = 0.0d;
        String strAcquireMedalID = "";
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (pax.b(trackData.acquireType()).equals(medalConfigInfo.acquireMedalType())) {
                    if ("A3".equals(pax.b(trackData.acquireType())) || "A5".equals(pax.b(trackData.acquireType()))) {
                        if (trackData.acquireTrackTime() <= oxi.d(medalConfigInfo.acquireTakeEffectTime())) {
                        }
                    }
                    String strAcquireMedalID2 = medalConfigInfo.acquireMedalID();
                    if ("3".equals(strAcquireMedalID2)) {
                        dAcquireMedalLevel = 21.0975d;
                    } else {
                        dAcquireMedalLevel = "4".equals(strAcquireMedalID2) ? 42.195d : ((double) medalConfigInfo.acquireMedalLevel()) * 1.0d;
                    }
                    if (dE >= dAcquireMedalLevel && !arrayListL.contains(strAcquireMedalID2)) {
                        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "medalIdTmp ", strAcquireMedalID2);
                        arrayList.add(medalConfigInfo);
                        if (dAcquireMedalLevel > d2) {
                            strAcquireMedalID = medalConfigInfo.acquireMedalID();
                            d2 = dAcquireMedalLevel;
                        }
                    }
                }
            }
        }
        b(context, (ArrayList<MedalConfigInfo>) arrayList, strAcquireMedalID, trackData);
    }

    private static double e(TrackData trackData) {
        if (pax.d(trackData.acquireType())) {
            return trackData.acquireTrackNum();
        }
        if (pax.a(trackData.acquireType())) {
            return paw.a((long) trackData.acquireDistance(), false);
        }
        return paw.c((long) trackData.acquireDistance());
    }

    public static boolean a(otl otlVar, Context context) {
        if (context == null) {
            return true;
        }
        if (otlVar == null) {
            d = otl.b(context.getApplicationContext());
            return false;
        }
        d = otlVar;
        return false;
    }

    public static void b(Context context, ArrayList<MedalConfigInfo> arrayList, String str) {
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "dealStableMedal ContinuousStableMedal!");
        b(context, arrayList, str, (TrackData) null);
    }

    public static void b(Context context, ArrayList<MedalConfigInfo> arrayList, String str, TrackData trackData) {
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "dealStableMedal Id == ", str);
        StringBuilder sb = new StringBuilder();
        for (MedalConfigInfo medalConfigInfo : arrayList) {
            String strAcquireMedalID = medalConfigInfo.acquireMedalID();
            sb.append(strAcquireMedalID);
            sb.append(",");
            if (str.equals(strAcquireMedalID) && c(a(trackData))) {
                d.c(strAcquireMedalID, medalConfigInfo.acquireMedalType(), medalConfigInfo.acquireMedalLevel());
            } else {
                e(strAcquireMedalID, a(trackData));
            }
            Map<String, String> mapC = d.c(strAcquireMedalID, String.valueOf(medalConfigInfo.acquireMedalLevel()));
            mapC.put("countryCode", LoginInit.getInstance(context).getAccountInfo(1010));
            d.a(7, mapC);
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
            a(context, sb.toString());
            LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "dealStableMedal stableMedalIdList == ", sb.toString());
        }
    }

    private static long a(TrackData trackData) {
        return trackData == null ? System.currentTimeMillis() : trackData.acquireTrackTime();
    }

    private static boolean c(long j) {
        boolean z = System.currentTimeMillis() - j <= 604800000;
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "isSevenDay ", Boolean.valueOf(z), " trackTime ", Long.valueOf(j));
        return z;
    }

    public static void e(String str, long j) {
        MedalLocation medalLocation = new MedalLocation();
        medalLocation.saveGainedCount(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c(j)) {
            j = jCurrentTimeMillis;
        }
        medalLocation.saveMedalGainedTime(String.valueOf(j));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        medalLocation.saveMedalID(str);
        d.a(medalLocation);
    }

    private static void b(String str, long j, int i) {
        MedalLocation medalLocation = new MedalLocation();
        medalLocation.saveGainedCount(i + 1);
        medalLocation.saveMedalGainedTime(String.valueOf(j));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        medalLocation.saveMedalID(str);
        otl.b(BaseApplication.b()).a(medalLocation);
    }

    private static void a(Context context, String str) {
        HashMap map = new HashMap(2);
        map.put("_uploadMedal", str);
        osa.b(context, map);
    }

    public static void d(ArrayList<TrackData> arrayList, otl otlVar, Context context) {
        if (a(otlVar, context)) {
            return;
        }
        if (otlVar.q() == null || otlVar.q().getHuid() == null) {
            LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "dealTrack userProfile or uid is null");
            otlVar.ac();
            if (otlVar.q() == null || otlVar.q().getHuid() == null) {
                return;
            }
        }
        int iE = e(d(arrayList));
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "medalLevel = ", Integer.valueOf(iE));
        if (iE == 0) {
            return;
        }
        HashMap map = new HashMap(2);
        ArrayList arrayList2 = new ArrayList(8);
        List<osf> listD = d.d(9, map);
        ArrayList<String> arrayListL = d.l();
        if (listD == null) {
            return;
        }
        double d2 = 0.0d;
        String strAcquireMedalID = "";
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if ("A4".equals(medalConfigInfo.acquireMedalType())) {
                    String strAcquireMedalID2 = medalConfigInfo.acquireMedalID();
                    double d3 = iE;
                    if (d3 >= ((double) medalConfigInfo.acquireMedalLevel()) * 1.0d && !arrayListL.contains(strAcquireMedalID2)) {
                        arrayList2.add(medalConfigInfo);
                        if (d3 > d2) {
                            strAcquireMedalID = medalConfigInfo.acquireMedalID();
                            d2 = d3;
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0 || "".equals(strAcquireMedalID)) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "medalID:", strAcquireMedalID);
        b(context, (ArrayList<MedalConfigInfo>) arrayList2, strAcquireMedalID);
    }

    private static int e(Map<String, ArrayList<TrackData>> map) {
        int i = 0;
        for (Map.Entry<String, ArrayList<TrackData>> entry : map.entrySet()) {
            ArrayList<TrackData> value = entry.getValue();
            LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "trackDataMap key = ", entry.getKey());
            if (value.size() != 0) {
                double d2 = 0.0d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                for (TrackData trackData : value) {
                    double dC = paw.c((long) trackData.acquireDistance());
                    LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "trackDataMap  value:", Long.valueOf(trackData.acquireTrackTime()));
                    if (pax.a(trackData.acquireType()) && dC > d2) {
                        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", " runMaxDistance ", Double.valueOf(dC));
                        d2 = dC;
                    }
                    if (pax.e(trackData.acquireType()) && dC > d3) {
                        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", " bikeMaxDistance ", Double.valueOf(dC));
                        d3 = dC;
                    }
                    if (pax.c(trackData.acquireType()) && dC > d4) {
                        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", " swimMaxDistance ", Double.valueOf(dC));
                        d4 = dC;
                    }
                }
                if (d2 >= 10.0d && d3 >= 40.0d && d4 >= 1.5d) {
                    return 2;
                }
                if (d2 < 5.0d || d3 < 20.0d || d4 < 0.75d) {
                    LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "No achieve triathlon!");
                } else {
                    i = 1;
                }
            }
        }
        return i;
    }

    private static Map<String, ArrayList<TrackData>> d(ArrayList<TrackData> arrayList) {
        HashMap map = new HashMap(8);
        for (TrackData trackData : arrayList) {
            String strB = b(trackData.acquireTrackTime());
            if (map.containsKey(strB)) {
                ((ArrayList) map.get(strB)).add(trackData);
            } else {
                ArrayList arrayList2 = new ArrayList(8);
                arrayList2.add(trackData);
                map.put(strB, arrayList2);
            }
        }
        return map;
    }

    private static String b(long j) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date(j));
    }

    public static void a(Bundle bundle) {
        if (TextUtils.isEmpty(osa.e(BaseApplication.b(), "personal"))) {
            LogUtil.j("PLGACHIEVE_AchieveSingleTrackMedalService", "flag is null");
            return;
        }
        if (bundle == null) {
            LogUtil.j("PLGACHIEVE_AchieveSingleTrackMedalService", "bundle is null");
            return;
        }
        String string = bundle.getString("dataType");
        int i = bundle.getInt("dataLevel") * 100;
        long j = bundle.getLong("timestamp");
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "dealThreeCircleMedalGenerate type=", string, " dataLevel=", Integer.valueOf(i), " timestamp=", Long.valueOf(j));
        HashMap map = new HashMap(2);
        ArrayList arrayList = new ArrayList(8);
        List<osf> listD = otl.b(BaseApplication.b()).d(9, map);
        if (listD == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "medalConfigInfos size ", Integer.valueOf(listD.size()));
        double d2 = 0.0d;
        String strAcquireMedalID = "";
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (string.equals(medalConfigInfo.acquireMedalType()) && j > oxi.d(medalConfigInfo.acquireTakeEffectTime())) {
                    int iAcquireMedalLevel = medalConfigInfo.acquireMedalLevel();
                    String strAcquireMedalID2 = medalConfigInfo.acquireMedalID();
                    if (i >= iAcquireMedalLevel) {
                        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "dealThreeCircleMedalGenerate medalIdTmp ", strAcquireMedalID2);
                        arrayList.add(medalConfigInfo);
                        double d3 = iAcquireMedalLevel;
                        if (d3 > d2) {
                            strAcquireMedalID = medalConfigInfo.acquireMedalID();
                            d2 = d3;
                        }
                    }
                }
            }
        }
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "dealThreeCircleMedalGenerate list ", arrayList.toString(), " medalIdTmp ", strAcquireMedalID);
        d((ArrayList<MedalConfigInfo>) arrayList, strAcquireMedalID, j);
    }

    public static void d(ArrayList<MedalConfigInfo> arrayList, String str, long j) {
        List<osf> list;
        LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "dealThreeCircleMedal maxMedalId == ", str);
        if (a(d, BaseApplication.b()) || njy.e(arrayList)) {
            return;
        }
        List<osf> listD = otl.b(BaseApplication.b()).d(8, new HashMap(2));
        for (MedalConfigInfo medalConfigInfo : arrayList) {
            if (njy.b(listD)) {
                String strAcquireMedalID = medalConfigInfo.acquireMedalID();
                for (osf osfVar : listD) {
                    if (osfVar instanceof MedalLocation) {
                        MedalLocation medalLocation = (MedalLocation) osfVar;
                        if (strAcquireMedalID.equals(medalLocation.acquireMedalID())) {
                            int iAcquireGainedCount = medalLocation.acquireGainedCount();
                            String strAcquireMedalName = medalConfigInfo.acquireMedalName();
                            String strAcquireMedalGainedTime = medalLocation.acquireMedalGainedTime();
                            list = listD;
                            LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "dealThreeCircleMedal Id= ", strAcquireMedalID, " name= ", strAcquireMedalName, " lastGainedTime=", strAcquireMedalGainedTime, " timestamp=", Long.valueOf(j));
                            if (a(j, strAcquireMedalGainedTime)) {
                                LogUtil.j("PLGACHIEVE_AchieveSingleTrackMedalService", "dealThreeCircleMedal isTheSameDay.");
                            } else {
                                d(medalConfigInfo, str, j, iAcquireGainedCount);
                            }
                        }
                    }
                }
            } else {
                list = listD;
                LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "parseTakeMedal data isEmpty.");
                d.a(7, e(medalConfigInfo, j));
            }
            listD = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            String strOptString2 = jSONObject.optString("resultDesc");
            if (osv.d(strOptString) && !"take medal failed.".equals(strOptString2)) {
                return true;
            }
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveSingleTrackMedalService", "parseTakeMedal Exception:", e.getMessage());
        }
        return false;
    }

    private static Map<String, String> e(MedalConfigInfo medalConfigInfo, long j) {
        Map<String, String> mapA = d.a(medalConfigInfo.acquireMedalID(), String.valueOf(medalConfigInfo.acquireMedalLevel()), j);
        mapA.put("countryCode", LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010));
        return mapA;
    }

    private static void d(final MedalConfigInfo medalConfigInfo, final String str, final long j, final int i) {
        d.a(7, e(medalConfigInfo, j), new AchieveCallback() { // from class: oue.3
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "parseTakeMedal resCode:", Integer.valueOf(i2));
                if (i2 == 200 && (obj instanceof String)) {
                    String str2 = (String) obj;
                    LogUtil.a("PLGACHIEVE_AchieveSingleTrackMedalService", "parseTakeMedal medalId:", medalConfigInfo.acquireMedalID(), " result:", str2);
                    if (oue.e(str2)) {
                        oue.b(medalConfigInfo, str, j, i);
                    } else {
                        LogUtil.j("PLGACHIEVE_AchieveSingleTrackMedalService", "parseTakeMedal takeMedal fail!");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(MedalConfigInfo medalConfigInfo, String str, long j, int i) {
        String strAcquireMedalID = medalConfigInfo.acquireMedalID();
        if (str.equals(strAcquireMedalID) && !pap.e(j, System.currentTimeMillis())) {
            d.a(strAcquireMedalID, medalConfigInfo.acquireMedalType(), medalConfigInfo.acquireMedalLevel(), i);
        } else {
            b(strAcquireMedalID, j, i);
        }
    }

    private static boolean a(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return HiDateUtil.p(j) == HiDateUtil.p(pap.a(str));
    }
}
