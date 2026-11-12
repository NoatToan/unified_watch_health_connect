package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.webkit.ProxyConfig;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.pluginachievement.manager.model.AchieveInfo;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.KakaLineRecord;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginachievement.manager.model.TrackData;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class otu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile otu f44728a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile otl f44729b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ott f44730c = null;
    private static boolean d = false;
    private static long e;
    private Context i;

    private otu(Context context) {
        this.i = context.getApplicationContext();
    }

    public static otu b(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        f44729b = otl.b(context.getApplicationContext());
        f44730c = ott.e(context.getApplicationContext());
        if (f44728a == null) {
            synchronized (otu.class) {
                if (f44728a == null) {
                    f44728a = new otu(context);
                }
            }
        }
        return f44728a;
    }

    public void d(ArrayList<TrackData> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealTrackData list is empty");
            return;
        }
        HashMap map = new HashMap(2);
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTrackData trackData size = ", Integer.valueOf(arrayList.size()));
        long jP = HiDateUtil.p(System.currentTimeMillis());
        long jG = HiDateUtil.g(System.currentTimeMillis());
        int i = 0;
        boolean z = false;
        TrackData trackData = null;
        boolean z2 = false;
        for (TrackData trackData2 : arrayList) {
            if (trackData2 != null && oun.c(trackData2.acquireType())) {
                long jAcquireEndTime = trackData2.acquireEndTime();
                if (jAcquireEndTime >= jP && jAcquireEndTime <= jG) {
                    if (!z2 && oun.b(trackData2.acquireType())) {
                        c(String.valueOf(20003), map);
                        z2 = true;
                    } else if (!z && oun.j(trackData2.acquireType())) {
                        c(String.valueOf(20005), map);
                        z = true;
                    } else if (oun.e(trackData2.acquireType())) {
                        int totalTime = (int) trackData2.getTotalTime();
                        if (totalTime > i) {
                            i = totalTime;
                        }
                    } else if (!oun.a(trackData2.acquireType())) {
                        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTrackData trackData need not process");
                    } else if (trackData == null || trackData.acquireDistance() < trackData2.acquireDistance()) {
                        trackData = trackData2;
                    }
                }
            }
        }
        if (trackData != null) {
            map.put(KakaConstants.TRACK_TIME, Long.valueOf(trackData.acquireEndTime()));
            map.put(KakaConstants.TRACK_DISTANCE, Float.valueOf(trackData.acquireDistance()));
            c(String.valueOf(KakaConstants.TASK_RUN_BEHAVIOR), map);
        }
        if (i > 0) {
            map.put(KakaConstants.ROPE_DURATION, Integer.valueOf(i));
            c(String.valueOf(20006), map);
        }
    }

    public void c(String str, Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "setEvent");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "setEvent key is empty");
            return;
        }
        if (pap.c(str)) {
            f44730c.b(str);
            return;
        }
        if (pap.m(str)) {
            f44730c.b(str);
        }
        if (String.valueOf(1500).equals(str)) {
            a(map);
            f44730c.b(str);
        } else {
            if (String.valueOf(1).equals(str)) {
                c(map);
                return;
            }
            if (String.valueOf(40000).equals(str)) {
                if (map == null || !map.containsKey("share_key")) {
                    return;
                }
                e(((Integer) map.get("share_key")).intValue());
                return;
            }
            e(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, final Map<String, Object> map) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: otu.2
            @Override // java.lang.Runnable
            public void run() {
                otu.this.a(str, (Map<String, Object>) map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Map<String, Object> map) {
        int iB = b(str);
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTaskFinishWithKey taskRuleId=", Integer.valueOf(iB));
        if (!pap.l(String.valueOf(iB))) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealTaskFinish invalid key");
            return;
        }
        List<osg> listA = a(0, -1, a(iB));
        if (njy.b(listA)) {
            for (osg osgVar : listA) {
                a(osgVar.ai(), osgVar, map);
            }
            return;
        }
        a(iB, (osg) null, map);
    }

    private int[] a(int i) {
        if (i == 40012) {
            return new int[]{i, 40011};
        }
        if (i == 30009) {
            return new int[]{i, 30018};
        }
        return new int[]{i};
    }

    private void a(int i, osg osgVar, Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTaskFinish taskRuleId=", Integer.valueOf(i));
        if (i == 20001) {
            g(osgVar, map);
            return;
        }
        if (i == 20002) {
            j(osgVar, map);
            return;
        }
        if (i == 20004) {
            b(osgVar, map);
            return;
        }
        if (i == 30002) {
            i(osgVar, map);
            return;
        }
        if (i == 30005) {
            c(osgVar);
            f44730c.b(String.valueOf(KakaConstants.TASK_ENTER_TODAY_WEIGHT));
            return;
        }
        if (i != 30009) {
            if (i == 30018) {
                d(osgVar, map);
                return;
            }
            if (i == 40003) {
                e(osgVar, map);
                return;
            }
            if (i != 20006) {
                if (i != 20007 && i != 30013 && i != 30014) {
                    switch (i) {
                        case SmartMsgConstant.MSG_TYPE_BLOOD_SUGAR_USER /* 40006 */:
                        case SmartMsgConstant.MSG_TYPE_SLEEP_USER /* 40007 */:
                        case 40008:
                        case 40009:
                            break;
                        default:
                            switch (i) {
                                case 40012:
                                    c(osgVar, map);
                                    break;
                                case 40013:
                                    f(osgVar, map);
                                    break;
                                default:
                                    c(osgVar);
                                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "other key");
                                    break;
                            }
                            break;
                    }
                    return;
                }
                a(osgVar, map);
                return;
            }
        }
        h(osgVar, map);
    }

    private void a(osg osgVar, Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealDesignatedTask");
        if (osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealDesignatedTask kakaTaskInfo is null");
            return;
        }
        if (TextUtils.isEmpty(osgVar.d()) || map == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealDesignatedTask map is null");
            c(osgVar);
            return;
        }
        Object obj = map.get(ParsedFieldTag.TASK_KEY);
        if (obj instanceof String) {
            String str = (String) obj;
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealDesignatedTask taskKey: ", str);
            if (str.equals(osgVar.d())) {
                c(osgVar);
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealDesignatedTask finish!");
            }
        }
    }

    private void f(osg osgVar, Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealTimeHeadLinesTask");
        if (map == null || osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealTimeHeadLinesTask map or kakaTaskInfo is null");
            return;
        }
        Object obj = map.get(KakaConstants.SLEEP_MUSIC_DURATION);
        if (obj instanceof Long) {
            Long l = (Long) obj;
            long jLongValue = l.longValue();
            int iAd = osgVar.ad();
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTimeHeadLinesTask level ", Integer.valueOf(iAd), " duration ", l);
            if (((long) iAd) * 60 <= jLongValue) {
                c(osgVar);
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTimeHeadLinesTask finish!");
            }
        }
    }

    private void c(osg osgVar, Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealHeadLinesTask");
        if (map == null || osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealHeadLinesTask map or kakaTaskInfo is null");
            return;
        }
        if (map.get(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID) instanceof String) {
            String str = (String) map.get(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID);
            String strD = osgVar.d();
            if (strD == null || !strD.equals(str)) {
                return;
            }
            c(osgVar);
        }
    }

    private void c(ozu ozuVar) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealTaskFinishByTaskRecord");
        if (ozuVar == null || ozuVar.k() == 0) {
            return;
        }
        HashMap map = new HashMap(2);
        String strI = ozuVar.i();
        if (strI == null) {
            strI = "";
        }
        map.put(ParsedFieldTag.TASK_KEY, strI);
        e(String.valueOf(ozuVar.k()), map);
    }

    private void e(final osg osgVar, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealActivityShareTask map null");
            return;
        }
        final String strValueOf = String.valueOf(map.get("url"));
        if (TextUtils.isEmpty(strValueOf)) {
            return;
        }
        Tasks.callInBackground(new Callable<Boolean>() { // from class: otu.13
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call() throws Exception {
                String url = GRSManager.c(otu.this.i).getUrl("activityUrl");
                String url2 = GRSManager.c(otu.this.i).getUrl("domainContentcenterDbankcdnNew");
                if (strValueOf.contains(url) || ((strValueOf.contains(url2) && strValueOf.contains("activityId")) || (strValueOf.contains("activityId") && strValueOf.contains("groupChallenge")))) {
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealActivityShareTask end");
                    otu.this.c(osgVar);
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(osg osgVar) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealNoParamTask");
        if (f44729b == null || osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealNoParamTask mAchieveDataManager or kakaTaskInfo is empty");
            return;
        }
        int iAi = osgVar.ai();
        if (pap.b(osgVar) && !pap.d(iAi)) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealNoParamTask isKakaTask isFinished or lapsed. taskRuleId == ", Integer.valueOf(iAi));
            return;
        }
        long jQ = osgVar.q();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strT = osgVar.t();
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealNoParamTask KakaTaskInfo taskRule =", Integer.valueOf(iAi), " taskStatus = ", strT, " taskSyncTimestamp = ", Long.valueOf(jQ), " curTimestamp =", Long.valueOf(jCurrentTimeMillis));
        if (pap.a(jCurrentTimeMillis, jQ)) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "curTimestamp is invalid =", Long.valueOf(jCurrentTimeMillis));
            return;
        }
        if (String.valueOf(0).equals(strT)) {
            a(osgVar);
            return;
        }
        if (String.valueOf(1).equals(strT)) {
            osgVar.a(System.currentTimeMillis());
            f44729b.a(osgVar);
            d(osgVar, 1);
        } else if (String.valueOf(2).equals(strT)) {
            b(osgVar, jQ, jCurrentTimeMillis);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "taskStatus is lapsed =", strT);
        }
    }

    private void a(osg osgVar) {
        osa.b(this.i, "taskReachInfo", osgVar.h());
        osgVar.i(-1);
        a(osgVar, 1);
        d(osgVar, 1);
    }

    private void b(osg osgVar, long j, long j2) {
        if (!pap.e(osgVar.ai()) && pap.e(j, j2)) {
            osa.b(this.i, "taskReachInfo", osgVar.h());
            osgVar.i(-1);
            a(osgVar, 1);
            d(osgVar, 1);
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "taskStatus is TASK_PICKED");
        if (String.valueOf(30008).equals(osgVar.h())) {
            d(osgVar, 1);
        }
    }

    public void c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateUserTaskStatusToDB fail taskId is invalid");
            return;
        }
        HashMap map = new HashMap(2);
        map.put("taskId", str);
        osf osfVarB = f44729b.b(12, map);
        if (osfVarB instanceof osg) {
            osg osgVar = (osg) osfVarB;
            osgVar.i(0);
            a(osgVar, i);
        }
    }

    public void a(osg osgVar, int i) {
        if (osgVar.ai() == 30008) {
            int iG = osgVar.g();
            if (i == 1) {
                osgVar.b(iG + 1);
            } else {
                osgVar.b(iG - 1);
            }
        }
        if (i == 1) {
            osgVar.a(System.currentTimeMillis());
        }
        osgVar.h(String.valueOf(i));
        osgVar.j(0);
        f44729b.a(osgVar);
    }

    public void d(osg osgVar, int i) {
        c(osgVar, i, "");
    }

    public void c(osg osgVar, int i, String str) {
        if (TextUtils.isEmpty(osgVar.h())) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateBinderaskStatusToCloud fail taskId is invalid");
            return;
        }
        if (i == 2) {
            t();
        }
        pap.a(osgVar);
        if (osgVar.ac() == 2) {
            i = 2;
        }
        final int iAc = osgVar.ac();
        final String strH = osgVar.h();
        f44729b.d(12, e(osgVar, i, str), new AchieveCallback() { // from class: otu.12
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                String str2;
                if (!(obj instanceof String)) {
                    str2 = "";
                } else {
                    str2 = (String) obj;
                }
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateTaskStatus resCode:", Integer.valueOf(i2), " result:", str2);
                if (i2 != 200 && iAc == 2) {
                    String strE = osa.e(BaseApplication.getContext(), "_uploadLevelTask");
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateTaskStatus taskIds ", strE);
                    if (strE.contains(strH)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (TextUtils.isEmpty(strE)) {
                        sb.append(oxb.b(System.currentTimeMillis()));
                    }
                    sb.append(strE);
                    sb.append(",");
                    sb.append(strH);
                    osa.b(BaseApplication.getContext(), "_uploadLevelTask", sb.toString());
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateTaskStatus newTaskIds = ", sb.toString());
                }
            }
        });
    }

    public void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: otu.11
            @Override // java.lang.Runnable
            public void run() {
                otu.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTaskNotDealEvent getData()");
        String strE = osa.e(this.i, "_uploadLevelTask");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        String strB = oxb.b(System.currentTimeMillis());
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTaskNotDealEvent taskIds:", strE, " currentDate:", strB);
        if (!strE.contains(strB)) {
            osa.b(BaseApplication.getContext(), "_uploadLevelTask", "");
            return;
        }
        List<osg> listC = c(2);
        if (njy.e(listC)) {
            return;
        }
        boolean z = false;
        for (osg osgVar : listC) {
            if (strE.contains(osgVar.h())) {
                f44729b.d(12, e(osgVar, 2, ""), new AchieveCallback() { // from class: otu.15
                    @Override // com.huawei.pluginachievement.impl.AchieveCallback
                    public void onResponse(int i, Object obj) {
                        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTaskNotDealEvent resCode:", Integer.valueOf(i), " result:", obj instanceof String ? (String) obj : "");
                        if (i == 200) {
                            osa.b(BaseApplication.getContext(), "_uploadLevelTask", "");
                        }
                    }
                });
                z = true;
            }
        }
        if (z) {
            return;
        }
        osa.b(BaseApplication.getContext(), "_uploadLevelTask", "");
    }

    private JSONObject e(osg osgVar, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ParsedFieldTag.KAKA_TASK_UUID, osgVar.h());
            jSONObject2.put("status", String.valueOf(i));
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("productId", str);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put(ParsedFieldTag.KAKA_TASKS, jSONArray);
            String strC = HiDateUtil.c((String) null);
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "getParam getCurrentTimezone=", strC);
            jSONObject.put("timeZone", strC);
            jSONObject.put(ParsedFieldTag.KAKA_TASK_SCENARIO, osgVar.ac());
            return jSONObject;
        } catch (JSONException e2) {
            LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "JSONException  ", e2.getMessage());
            return jSONObject;
        }
    }

    public boolean f() {
        String strE = osa.e(this.i, "wechatBindStatusV3");
        return (TextUtils.isEmpty(strE) || "false".equals(strE)) ? false : true;
    }

    private void t() {
        osa.b(this.i, "taskReachInfo", "");
    }

    public boolean a() {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "getKakaTaskRedDot enter");
        if (!Utils.o() && VersionControlUtil.isSupportOperationAccount()) {
            return k();
        }
        return false;
    }

    public void c(final Handler handler, final int i) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealKakaTask enter");
        if (!d(100)) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: otu.19
                @Override // java.lang.Runnable
                public void run() {
                    otu.this.d(handler, i);
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealKakaTask isFastClick!");
    }

    public static boolean d(int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - e < i) {
            return true;
        }
        e = jElapsedRealtime;
        return false;
    }

    private boolean k() {
        String strE = osa.e(this.i, "taskFinishInfo");
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "getReachResult taskReachInfo = ", strE);
        return !TextUtils.isEmpty(strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Handler handler, int i) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "aquireKakaTask enter");
        ArrayList<ozs> arrayListN = n();
        if (arrayListN == null || arrayListN.isEmpty()) {
            if (handler != null) {
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "sendMessage MSG_UPDATE_MEDAL_RED_POINT! taskRecyclerViewData is empty");
                handler.sendEmptyMessage(i);
            } else {
                LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "aquireKakaTask handler is null");
            }
            j();
            return;
        }
        Iterator<ozs> it = arrayListN.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ozu ozuVarE = it.next().e();
            if (ozuVarE != null && "1".equals(ozuVarE.j())) {
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "getRedDotResult is true ", Integer.valueOf(ozuVarE.k()));
                z = true;
            }
        }
        if (z) {
            s();
        } else {
            j();
        }
        if (handler != null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "sendMessage MSG_UPDATE_MEDAL_RED_POINT!isFinished = ", Boolean.valueOf(z), " what = ", Integer.valueOf(i));
            handler.sendEmptyMessage(i);
        }
    }

    private void j() {
        osa.b(this.i, "taskFinishInfo", "");
    }

    private void s() {
        osa.b(this.i, "taskFinishInfo", "SHOW");
    }

    private ArrayList<ozs> n() {
        ArrayList<ozs> arrayList = new ArrayList<>(0);
        HashMap map = new HashMap(2);
        map.put(ParsedFieldTag.KAKA_TASK_SCENARIO, String.valueOf(0));
        if (f44729b != null) {
            List<osf> listD = f44729b.d(12, map);
            if (listD == null) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(listD.size());
            for (osf osfVar : listD) {
                if (osfVar instanceof osg) {
                    arrayList2.add((osg) osfVar);
                }
            }
            return oyx.b(arrayList2);
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "mService is null");
        return arrayList;
    }

    private void a(Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealBinderDeviceTask");
        if (map == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealBinderDeviceTask map is null");
            return;
        }
        if (map.get("productId") == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealBinderDeviceTask productId is null");
            return;
        }
        final PluginAchieveAdapter adapter = oru.a(this.i).getAdapter();
        if (adapter == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "pluginAchieveAdapter is null");
        } else {
            final String strValueOf = String.valueOf(map.get("deviceId"));
            ThreadPoolManager.c().execute(new Runnable() { // from class: otu.16
                @Override // java.lang.Runnable
                public void run() {
                    List<osf> listL = otu.this.l();
                    if (listL == null) {
                        LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "kakas is null");
                        return;
                    }
                    for (osf osfVar : listL) {
                        if (osfVar instanceof osg) {
                            osg osgVar = (osg) osfVar;
                            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealBinderDeviceTask update task ruleid = ", Integer.valueOf(osgVar.ai()), "Scenario ", Integer.valueOf(osgVar.ac()));
                            if (!otu.this.b(osgVar.ai(), strValueOf, adapter)) {
                                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealBinderDeviceTask device Already bound");
                                return;
                            } else {
                                otu.this.c(osgVar, 1, strValueOf);
                                osgVar.i(-1);
                                otu.this.a(osgVar, 1);
                            }
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i, String str, PluginAchieveAdapter pluginAchieveAdapter) {
        if (i == 10004) {
            return true;
        }
        String encryptData = pluginAchieveAdapter.getEncryptData(str, this.i);
        String strE = osa.e(this.i, "bindDeviceProductId");
        if (c(strE, str, pluginAchieveAdapter)) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealBinderDeviceTask device Already bind");
            return false;
        }
        if (!TextUtils.isEmpty(strE)) {
            encryptData = strE.concat(",").concat(encryptData);
        }
        osa.b(this.i, "bindDeviceProductId", encryptData);
        return true;
    }

    private List<osf> h(int i) {
        HashMap map = new HashMap(2);
        map.put(ParsedFieldTag.KAKA_TASK_RULE, String.valueOf(i));
        return f44729b.d(12, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<osf> l() {
        String strE = osa.e(this.i, "isFirstBindDeviceFinishedV2");
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "getBinderDeviceTask isFirstBindDeviceFinished ", strE);
        if ("finished".equals(strE)) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "getBinderDeviceTask TASK_BIND_DEVICE！");
            return h(30008);
        }
        List<osf> listH = h(10004);
        boolean zE = e(listH);
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "getBinderDeviceTask isUnFinish ", Boolean.valueOf(zE), " kakas.size ", Integer.valueOf(listH.size()));
        if (zE) {
            return listH;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "first bind device is finished");
        osa.b(this.i, "isFirstBindDeviceFinishedV2", "finished");
        return h(30008);
    }

    private boolean e(List<osf> list) {
        if (list == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "kakas is null");
            return false;
        }
        for (osf osfVar : list) {
            if (osfVar instanceof osg) {
                osg osgVar = (osg) osfVar;
                if (String.valueOf(0).equals(osgVar.t())) {
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "first bind device is unfinished ruleid = ", Integer.valueOf(osgVar.ai()));
                    return true;
                }
            }
        }
        return false;
    }

    public long i() {
        String strE = osa.e(this.i, "kakaSyncDate");
        if (TextUtils.isEmpty(strE)) {
            return 0L;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "syncDate=", strE);
        try {
            return Long.parseLong(strE);
        } catch (NumberFormatException e2) {
            LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "NumberFormatException", e2.getMessage());
            return 0L;
        }
    }

    private void b(osg osgVar, Map<String, Object> map) {
        int i;
        int i2;
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealFitnessTask");
        Date date = new Date(System.currentTimeMillis());
        if (map == null || map.get(KakaConstants.FITNESS_DURATION) == null) {
            i = 0;
        } else {
            try {
                i2 = Integer.parseInt(String.valueOf(map.get(KakaConstants.FITNESS_DURATION)));
                try {
                    i = (i2 / 1000) / 60;
                } catch (NumberFormatException unused) {
                    LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "NumberFormatException");
                    i = i2;
                }
            } catch (NumberFormatException unused2) {
                i2 = 0;
            }
        }
        PluginAchieveAdapter adapter = oru.a(this.i).getAdapter();
        int totalFitDuration = adapter != null ? adapter.getTotalFitDuration(date, date) : 0;
        LogUtil.d("PLGACHIEVE_AchieveKakaDataManager", "duration=", Integer.valueOf(totalFitDuration), "singleDuration=", Integer.valueOf(i));
        if (i >= 10 || totalFitDuration >= 10) {
            f44730c.b(String.valueOf(KakaConstants.TASK_FITNESS_BEHAVIOR));
        }
        if (osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealFitnessTask kakaTaskInfo is null");
            return;
        }
        int iAd = osgVar.ad();
        LogUtil.d("PLGACHIEVE_AchieveKakaDataManager", " fitLevelTime=", Integer.valueOf(iAd));
        if (i >= iAd || totalFitDuration >= iAd) {
            c(osgVar);
        }
    }

    private void i(osg osgVar, Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealSleepTask");
        if (map == null || osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealSleepTask map or kakaTaskInfo is null");
            return;
        }
        if (map.get(KakaConstants.SLEEP_DURATION) != null) {
            Integer num = (Integer) map.get(KakaConstants.SLEEP_DURATION);
            int iIntValue = num.intValue();
            int iAd = osgVar.ad();
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealSleepTask hourLevel:", Integer.valueOf(iAd), " sleepDuration ", num);
            if (iAd * 60 <= iIntValue) {
                c(osgVar);
            }
        }
    }

    private void j(osg osgVar, Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealSingleTrackTask");
        if (map == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealSingleTrackTask map is null");
            return;
        }
        if (map.get(KakaConstants.TRACK_TIME) == null || map.get(KakaConstants.TRACK_DISTANCE) == null) {
            return;
        }
        try {
            Object obj = map.get(KakaConstants.TRACK_TIME);
            Object obj2 = map.get(KakaConstants.TRACK_DISTANCE);
            long j = Long.parseLong(String.valueOf(obj));
            double dC = paw.c((long) Float.parseFloat(String.valueOf(obj2)));
            if (pap.e(j)) {
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealSingleTrackTask track is valid");
                if (dC >= 3.0d) {
                    f44730c.b(String.valueOf(KakaConstants.TASK_RUN_BEHAVIOR));
                }
                if (osgVar == null) {
                    LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealSingleTrackTask kakaTaskInfo is null");
                    return;
                }
                int iAd = osgVar.ad();
                if (dC >= iAd) {
                    c(osgVar);
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealSingleTrackTask run success! trackTime ", Long.valueOf(j));
                } else {
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealSingleTrackTask track distance < ", Integer.valueOf(iAd));
                }
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "dealSingleTrackTask NumberFormatException");
        }
    }

    private void g(osg osgVar, Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealStepsChangeTask");
        if (map == null || osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealStepsChangeTask map or kakaTaskInfo is null");
            return;
        }
        if (map.get("step") != null) {
            try {
                final int i = Integer.parseInt(String.valueOf(map.get("step")));
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: otu.18
                    @Override // java.lang.Runnable
                    public void run() {
                        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "generateHistoryBestMsg() enter");
                        otu.f44729b.b(i);
                    }
                });
                executorServiceNewSingleThreadExecutor.shutdown();
                if (i >= osgVar.ad()) {
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealNoParamTask STEPS_TASK_GOAL.");
                    c(osgVar);
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "dealSingleTrackTask NumberFormatException");
            }
        }
    }

    private void h(osg osgVar, Map<String, Object> map) {
        String str;
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealOneDurationParamTask");
        if (map == null || osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealOneDurationParamTask map or kakaTaskInfo is null");
            return;
        }
        int iAi = osgVar.ai();
        if (iAi == 20006) {
            str = KakaConstants.ROPE_DURATION;
        } else if (iAi == 30009) {
            str = KakaConstants.SLEEP_MUSIC_DURATION;
        } else {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealOneDurationParamTask error taskRuleId");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealOneDurationParamTask map = ", map.toString());
        if (TextUtils.isEmpty(str) || map.get(str) == null) {
            return;
        }
        Integer num = (Integer) map.get(str);
        int iIntValue = num.intValue();
        int iAd = osgVar.ad();
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealOneDurationParamTask duration = ", num, " minuteLevel= ", Integer.valueOf(iAd));
        if (iAd * 60000 <= iIntValue) {
            c(osgVar);
        }
    }

    private void d(osg osgVar, Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealAssignSleepMusicParamTask");
        if (map == null || osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealAssignSleepMusicParamTask map or kakaTaskInfo is null");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealAssignSleepMusicParamTask map = ", map.toString());
        if (TextUtils.isEmpty(KakaConstants.SLEEP_MUSIC_ID) || map.get(KakaConstants.SLEEP_MUSIC_ID) == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealAssignSleepMusicParamTask paramPlayIdKey is null");
            return;
        }
        String strD = osgVar.d();
        if (strD == null || !strD.equals(String.valueOf(map.get(KakaConstants.SLEEP_MUSIC_ID)))) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealAssignSleepMusicParamTask taskKey is wrong!");
            return;
        }
        if (TextUtils.isEmpty(KakaConstants.SLEEP_MUSIC_DURATION) || map.get(KakaConstants.SLEEP_MUSIC_DURATION) == null) {
            return;
        }
        Integer num = (Integer) map.get(KakaConstants.SLEEP_MUSIC_DURATION);
        int iIntValue = num.intValue();
        int iAd = osgVar.ad();
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealAssignSleepMusicParamTask duration = ", num, " minuteLevel= ", Integer.valueOf(iAd));
        if (iAd * 60000 <= iIntValue) {
            c(osgVar);
        }
    }

    public void a(ozu ozuVar, Context context) {
        if (ozuVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "gotoTaskPageByTaskID taskRecord is empty");
            return;
        }
        if (!pap.l(String.valueOf(ozuVar.k()))) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "gotoTaskPageByTaskID key is invalid");
            return;
        }
        PluginAchieveAdapter adapter = oru.a(this.i).getAdapter();
        if (adapter == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "pluginAchieveAdapter is null");
        } else {
            a(adapter, ozuVar, context);
        }
    }

    private void a(PluginAchieveAdapter pluginAchieveAdapter, ozu ozuVar, Context context) {
        if (ozuVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "gotoTaskPageByTaskID taskRecord is empty");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "gotoTaskPage taskRule = ", Integer.valueOf(ozuVar.k()));
        if (e(pluginAchieveAdapter, ozuVar, context)) {
            return;
        }
        int iK = ozuVar.k();
        if (iK == 10004 || iK == 30008) {
            pluginAchieveAdapter.gotoAllDeviceBinding(context);
            return;
        }
        if (iK != 30015) {
            if (iK == 30011) {
                pluginAchieveAdapter.goToPhysiologicalCycle(context);
                c(ozuVar);
                return;
            }
            if (iK != 30012) {
                switch (iK) {
                    case 20001:
                        pluginAchieveAdapter.gotoStepRecord(context);
                        break;
                    case 20002:
                        e(KakaConstants.RUN_URL + (ozuVar.f() * 1000));
                        break;
                    case 20003:
                        e(KakaConstants.RIDE_URL);
                        break;
                    case 20004:
                        pluginAchieveAdapter.gotoFitness();
                        break;
                    default:
                        switch (iK) {
                            case 20006:
                                e(KakaConstants.SKIP_ROPE_URL + (ozuVar.f() * 60000));
                                break;
                            case 20007:
                                pluginAchieveAdapter.gotoTrainDetailActivity(ozuVar.d(), ozuVar.i());
                                break;
                            case 20008:
                                pluginAchieveAdapter.gotoFitnessAllCourses();
                                break;
                            default:
                                d(pluginAchieveAdapter, ozuVar.k(), context);
                                break;
                        }
                        break;
                }
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("pressure_is_have_datas", d);
        gry.a(context, bundle);
    }

    private boolean e(PluginAchieveAdapter pluginAchieveAdapter, ozu ozuVar, Context context) {
        if (TextUtils.isEmpty(ozuVar.a())) {
            return false;
        }
        if (ozuVar.k() == 20006 && SportSupportUtil.i()) {
            return false;
        }
        e(context, pluginAchieveAdapter, ozuVar);
        if (pap.c(ozuVar.k())) {
            c(ozuVar);
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "task hasOperationUrl");
        return true;
    }

    private void e(Context context) {
        ffv.a(context, (Uri) null);
    }

    private void d(PluginAchieveAdapter pluginAchieveAdapter, int i, Context context) {
        if (i == 10002) {
            d(KakaConstants.USER_INFO_URL, context);
            return;
        }
        if (i == 10003) {
            pluginAchieveAdapter.gotoWeChatActivity(context);
            return;
        }
        if (i == 10005) {
            pap.a(context, 5);
            return;
        }
        if (i == 20009) {
            if (CommonUtil.cl()) {
                pap.c(context, KakaConstants.TEST_REDUCE_PLAN_URL);
                return;
            } else {
                pap.c(context, KakaConstants.REDUCE_PLAN_URL);
                return;
            }
        }
        if (i == 30016) {
            pap.c(context, KakaConstants.DIET_REPORT_URL);
            return;
        }
        if (i == 30017) {
            pap.c(context, KakaConstants.DIET_RECIPE_URL);
            return;
        }
        switch (i) {
            case 40001:
                oru.a(context).h(context);
                break;
            case 40002:
                pluginAchieveAdapter.gotoRunRecord(context);
                break;
            case 40003:
            case 40004:
            case SmartMsgConstant.MSG_TYPE_RIDE_USER /* 40005 */:
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "error, taskDetailUrl is empty");
                break;
            default:
                a(pluginAchieveAdapter, i, context);
                break;
        }
    }

    private void a(PluginAchieveAdapter pluginAchieveAdapter, int i, Context context) {
        if (i == 1200) {
            pluginAchieveAdapter.startMyTargetActivity(context);
            return;
        }
        if (i != 30009) {
            if (i != 30010) {
                switch (i) {
                    case 30001:
                        e(context);
                        break;
                    case 30002:
                        break;
                    case OnRegisterSkinAttrsListener.REGISTER_BY_SCAN /* 30003 */:
                        pluginAchieveAdapter.gotoMeasureDeivice(context, "HDK_BLOOD_PRESSURE");
                        break;
                    case 30004:
                        pluginAchieveAdapter.gotoMeasureDeivice(context, "HDK_BLOOD_SUGAR");
                        break;
                    case 30005:
                        pluginAchieveAdapter.gotoMeasureDeivice(context, "HDK_WEIGHT");
                        break;
                    case 30006:
                        pluginAchieveAdapter.gotoMeasureDeivice(context, "HDK_WEAR");
                        break;
                    case 30007:
                        ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).gotoFamilyHealth(context, nio.e(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "sIsFirstHealth"));
                        break;
                    default:
                        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "invalid key");
                        break;
                }
                return;
            }
            prf.c(BaseApplication.getContext(), "com.huawei.health.ecg.collection");
            return;
        }
        pluginAchieveAdapter.gotoSleepDetailPage(context);
    }

    private void e(Context context, PluginAchieveAdapter pluginAchieveAdapter, ozu ozuVar) {
        if (ozuVar == null || context == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "handleTaskTodoSkip messageObject is null");
            return;
        }
        String strA = ozuVar.a();
        if (!strA.contains("pullfrom=kaka") && strA.contains("?")) {
            strA = strA + "&pullfrom=kaka";
        }
        LogUtil.d("PLGACHIEVE_AchieveKakaDataManager", "handleTaskTodoSkip btnDetailUrl: ", strA);
        if (strA.startsWith("huaweischeme")) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(strA));
            intent.setPackage(context.getPackageName());
            lsx.c(intent, context);
            return;
        }
        pluginAchieveAdapter.startWebActivityForResult(context, strA);
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "url is null");
            return;
        }
        if (a(str) || str.startsWith("mailto:") || str.startsWith(KakaConstants.SCHEME_TEL)) {
            try {
                Intent intent = new Intent();
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setFlags(268435456);
                intent.setData(Uri.parse(str));
                this.i.startActivity(intent);
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "jump to scheme view");
            } catch (ActivityNotFoundException e2) {
                LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", e2.getMessage());
            }
        }
    }

    private boolean a(String str) {
        return (str.startsWith("http") || str.startsWith(ProxyConfig.MATCH_HTTPS)) || (str.startsWith("huaweihealth") || str.startsWith("huaweischeme") || str.startsWith("geo:"));
    }

    private void d(String str, Context context) {
        try {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), str);
            context.startActivity(intent);
        } catch (ActivityNotFoundException | IllegalArgumentException e2) {
            LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", e2.getMessage());
        }
    }

    public void b(int i) {
        osf osfVarB = f44729b.b(5, new HashMap(2));
        if (osfVarB instanceof AchieveInfo) {
            AchieveInfo achieveInfo = (AchieveInfo) osfVarB;
            int userPoint = achieveInfo.getUserPoint();
            if (i > userPoint) {
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "kakaTotalNum=", Integer.valueOf(i));
                achieveInfo.setUserPoint(i);
                f44729b.a(achieveInfo);
                return;
            }
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "kaka=", Integer.valueOf(userPoint));
        }
    }

    private boolean c(String str, String str2, PluginAchieveAdapter pluginAchieveAdapter) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str3 : str.split(",")) {
            if (!TextUtils.isEmpty(str3) && pluginAchieveAdapter.decryptData(str3, this.i).equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: otu.17
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap(2);
                map.put(ParsedFieldTag.KAKA_TASK_RULE, String.valueOf(10003));
                List<osf> listD = otu.f44729b.d(12, map);
                if (listD == null) {
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "kakas is null");
                    return;
                }
                for (osf osfVar : listD) {
                    if (osfVar instanceof osg) {
                        osg osgVar = (osg) osfVar;
                        if (String.valueOf(0).equals(osgVar.t())) {
                            otu.this.d(osgVar, 1);
                            osgVar.h(String.valueOf(1));
                            otu.f44729b.a(osgVar);
                        }
                    }
                }
                osa.b(otu.this.i, "wechatBindStatusV3", "true");
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public long a(otl otlVar) {
        HashMap map = new HashMap(3);
        map.put("page", String.valueOf(1));
        map.put(IAchieveDBMgr.PARAM_PAGE_SIZE, String.valueOf(1));
        osf osfVarB = otlVar != null ? otlVar.b(6, map) : null;
        if (osfVarB == null || !(osfVarB instanceof KakaLineRecord)) {
            return 0L;
        }
        KakaLineRecord kakaLineRecord = (KakaLineRecord) osfVarB;
        if (kakaLineRecord.getKakaLineRecords() == null || kakaLineRecord.getKakaLineRecords().size() == 0) {
            return 0L;
        }
        return kakaLineRecord.getKakaLineRecords().get(0).getDate();
    }

    public boolean e(int i) {
        String strValueOf;
        if (i == 6) {
            strValueOf = String.valueOf(KakaConstants.TASK_SHARE_RUN_ACHIEVEMENT);
        } else if (i == 2) {
            strValueOf = String.valueOf(KakaConstants.TASK_SHARE_FITNESS_ACHIEVEMENT);
        } else if (i == 4) {
            strValueOf = String.valueOf(KakaConstants.TASK_SHARE_STEPS_ACHIEVEMENT);
        } else if (i == 5) {
            strValueOf = String.valueOf(KakaConstants.TASK_SHARE_MEDAL);
        } else if (i == 40002) {
            strValueOf = String.valueOf(i);
        } else if (i != 1100064) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "key not in (TRACK，FITNESS，STEP，MEDAL)");
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(40010);
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealShareTask key ", strValueOf);
        if (TextUtils.isEmpty(strValueOf)) {
            return false;
        }
        e(strValueOf, (Map<String, Object>) null);
        return true;
    }

    public void c() {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealLoginTask");
        if (!m()) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealLoginTask return");
        } else if (LoginInit.getInstance(BaseApplication.getContext()).getIsLogined()) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: otu.3
                @Override // java.lang.Runnable
                public void run() {
                    HashMap map = new HashMap(2);
                    map.put(ParsedFieldTag.KAKA_TASK_RULE, String.valueOf(10001));
                    osf osfVarB = otu.f44729b.b(12, map);
                    if (osfVarB != null) {
                        otu.this.d((osg) osfVarB);
                    } else {
                        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "kakas is null");
                    }
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
        }
    }

    private boolean m() {
        long j;
        String strE = osa.e(this.i, "kakaLoginTaskV2");
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        try {
            j = Long.parseLong(strE);
        } catch (NumberFormatException e2) {
            LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "judgeRequireLoginTask", e2.getMessage());
            j = -1;
        }
        if (j != 0) {
            return true;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "all loginTask is finish");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(osg osgVar) {
        if (osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "dealTodayLoginTask kakaTaskInfo is null");
            return;
        }
        if (String.valueOf(0).equals(osgVar.t())) {
            osa.b(this.i, "kakaLoginTaskV2", String.valueOf(0));
            osgVar.h(String.valueOf(1));
            f44729b.a(osgVar);
            d(osgVar, 1);
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealTodayLoginTask Id=", Integer.valueOf(osgVar.ai()));
        }
    }

    public Map<Integer, Pair<Double, Long>> b(long j, int i) {
        long timeInMillis;
        HashMap map = new HashMap(11);
        osf osfVarB = f44729b.b(2, new HashMap(2));
        SingleDayRecord singleDayRecord = osfVarB instanceof SingleDayRecord ? (SingleDayRecord) osfVarB : null;
        if (i == 1) {
            timeInMillis = 604799999 + j;
        } else if (i == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            calendar.set(5, calendar.getActualMaximum(5));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            timeInMillis = calendar.getTimeInMillis();
        } else {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "report type is not WEEK and MONTH.");
            timeInMillis = 0;
        }
        long j2 = timeInMillis;
        e(j, j2, singleDayRecord, map, 2);
        e(j, j2, singleDayRecord, map, 1);
        e(j, j2, singleDayRecord, map, 3);
        e(j, j2, singleDayRecord, map, 4);
        e(j, j2, singleDayRecord, map, 5);
        e(j, j2, singleDayRecord, map, 6);
        e(j, j2, singleDayRecord, map, 7);
        e(j, j2, singleDayRecord, map, 8);
        e(j, j2, singleDayRecord, map, 9);
        e(j, j2, singleDayRecord, map, 10);
        e(j, j2, singleDayRecord, map, 11);
        return map;
    }

    private void e(long j, long j2, SingleDayRecord singleDayRecord, Map map, int i) {
        Pair<Double, Long> pairE = paw.e(paw.a(i, singleDayRecord), j, j2, i);
        if (pairE != null) {
            LogUtil.d("PLGACHIEVE_AchieveKakaDataManager", "structBreakInfoByType=", Integer.valueOf(i), "first=", pairE.first);
            map.put(Integer.valueOf(i), pairE);
        }
    }

    private void c(Map<String, Object> map) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "enter dealDeleteTrackData");
        if (map == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealDeleteTrackData map is null");
            return;
        }
        if (map.get("startTime") == null || map.get("type") == null) {
            return;
        }
        try {
            Object obj = map.get("startTime");
            Object obj2 = map.get("type");
            final long j = Long.parseLong(String.valueOf(obj));
            final int i = Integer.parseInt(String.valueOf(obj2));
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "dealDeleteTrackData type=", Integer.valueOf(i), "trackTime=", Long.valueOf(j));
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: otu.4
                @Override // java.lang.Runnable
                public void run() {
                    osf osfVarB = otu.f44729b.b(2, new HashMap(2));
                    SingleDayRecord singleDayRecord = osfVarB instanceof SingleDayRecord ? (SingleDayRecord) osfVarB : null;
                    if (singleDayRecord != null) {
                        if (otu.this.a(singleDayRecord, i, j) > 0) {
                            singleDayRecord.setDelete(true);
                            otu.f44729b.a(singleDayRecord);
                            otu.this.h();
                            return;
                        }
                        return;
                    }
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "singleDayRecord is null");
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "dealSingleTrackTask NumberFormatException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (Utils.o()) {
            ory.e(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(SingleDayRecord singleDayRecord, int i, long j) {
        int iC;
        int iC2;
        int iC3;
        if (oun.a(i)) {
            int iC4 = c(singleDayRecord, 3, j);
            int iC5 = c(singleDayRecord, 4, j);
            int iC6 = c(singleDayRecord, 5, j);
            iC2 = iC4 + iC5 + iC6 + c(singleDayRecord, 6, j) + c(singleDayRecord, 7, j) + c(singleDayRecord, 8, j);
            iC3 = c(singleDayRecord, 9, j);
        } else {
            if (oun.g(i)) {
                iC = c(singleDayRecord, 1, j);
            } else if (oun.b(i)) {
                iC2 = c(singleDayRecord, 10, j);
                iC3 = c(singleDayRecord, 11, j);
            } else if (oun.e(i)) {
                iC2 = c(singleDayRecord, 12, j) + c(singleDayRecord, 13, j) + c(singleDayRecord, 14, j);
                iC3 = c(singleDayRecord, 15, j);
            } else {
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "type is not in (run，walk，cycle)");
                iC = 0;
            }
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "count=", Integer.valueOf(iC));
            return iC;
        }
        iC = iC3 + iC2;
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "count=", Integer.valueOf(iC));
        return iC;
    }

    private int c(SingleDayRecord singleDayRecord, int i, long j) {
        String strB = paw.b(j, paw.a(i, singleDayRecord));
        if (TextUtils.isEmpty(strB)) {
            return 0;
        }
        paw.d(i, singleDayRecord, strB);
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "str=", paw.a(i, singleDayRecord));
        return 1;
    }

    public List<osg> a(int i, int i2, int[] iArr) {
        int i3;
        ArrayList arrayList = new ArrayList(2);
        if (i == 1 || i == 2) {
            i3 = 17;
        } else {
            if (i != 0) {
                LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "getKakaTaskLists error type = ", Integer.valueOf(i));
                return arrayList;
            }
            if (!pap.e(i(), System.currentTimeMillis())) {
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "can getKakaListFromDb");
                List<osg> listC = c(i2);
                return njy.b(listC) ? pap.e(iArr, listC) : listC;
            }
            i3 = 11;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "getKakaTaskLists contentType = ", Integer.valueOf(i3));
        otr otrVar = new otr(BaseApplication.getContext(), i3);
        otrVar.a(iArr);
        otl.b(BaseApplication.getContext()).c(otrVar);
        HashMap map = new HashMap(2);
        map.put("type", String.valueOf(i));
        map.put(ParsedFieldTag.KAKA_TASK_SCENARIO, String.valueOf(i2));
        map.put("timeZone", HiDateUtil.c((String) null));
        otl.b(BaseApplication.getContext()).a(i3, map);
        try {
            otrVar.d(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "AchieveKakaObserver.await(): catch a InterruptedException");
        }
        if (!(otrVar.a() instanceof ArrayList)) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "getKakaTaskLists error");
        } else {
            arrayList = (ArrayList) otrVar.a();
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "kakaTaskInfoList == ", arrayList.toString());
        otl.b(BaseApplication.getContext()).d(otrVar);
        return arrayList;
    }

    private List<osg> c(int i) {
        ArrayList arrayList = new ArrayList(2);
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "can getKakaListFromDb");
        HashMap map = new HashMap(2);
        if (i != -1) {
            map.put(ParsedFieldTag.KAKA_TASK_SCENARIO, String.valueOf(i));
        }
        List<osf> listD = f44729b.d(12, map);
        if (listD == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "getKakaListFromDb kaka lists in dabase is empty");
            return arrayList;
        }
        for (osf osfVar : listD) {
            if (osfVar instanceof osg) {
                osg osgVar = (osg) osfVar;
                if (!String.valueOf(3).equals(osgVar.t())) {
                    arrayList.add(osgVar);
                }
            }
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "getKakaListFromDb kakaTaskInfos size = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public osd a(int i, String[] strArr) {
        ArrayList arrayList = new ArrayList(2);
        for (String str : strArr) {
            osj osjVar = new osj();
            osjVar.d(str);
            osjVar.c(2);
            arrayList.add(osjVar);
        }
        return a(arrayList, i, 0);
    }

    public osd a(List<osj> list, int i, int i2) {
        int i3;
        String strC = HiDateUtil.c((String) null);
        if (i2 == 1) {
            strC = CommonUtil.ak();
            i3 = 18;
        } else {
            i3 = 12;
        }
        otr otrVar = new otr(BaseApplication.getContext(), i3);
        otl.b(BaseApplication.getContext()).c(otrVar);
        JSONObject jSONObject = new JSONObject();
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateUserTaskStatus getCurrentTimezone=", strC);
        try {
            jSONObject.put("timeZone", strC);
            jSONObject.put(ParsedFieldTag.KAKA_TASK_SCENARIO, i);
            jSONObject.put(ParsedFieldTag.KAKA_TASKS, e(i3, list));
        } catch (JSONException e2) {
            LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "JSONException  ", e2.getMessage());
        }
        f44729b.e(i3, jSONObject);
        try {
            otrVar.d(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_AchieveKakaDataManager", "AchieveKakaObserver.await(): catch a InterruptedException");
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateKakaTaskStatus success");
        if (otrVar.a() instanceof osd) {
            osd osdVar = (osd) otrVar.a();
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "kakaUpdateReturnBody == ", osdVar.toString());
            return osdVar;
        }
        LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "updateKakaTaskStatus error ");
        return null;
    }

    private JSONArray e(int i, List<osj> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (osj osjVar : list) {
                JSONObject jSONObject = new JSONObject();
                if (i == 12) {
                    jSONObject.put(ParsedFieldTag.KAKA_TASK_UUID, osjVar.a());
                } else {
                    jSONObject.put("taskId", osjVar.a());
                    jSONObject.put(ParsedFieldTag.KAKA_VALUE_TYPE, osjVar.c());
                    jSONObject.put("timeZone", osjVar.e());
                }
                jSONObject.put("status", osjVar.b());
                jSONObject.put("productId", osjVar.d());
                jSONArray.put(jSONObject);
            }
        } catch (JSONException e2) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "JSONException", e2.getMessage());
        }
        return jSONArray;
    }

    private int b(String str) {
        int iA = qrs.a(str);
        return KakaConstants.TASK_ID_TO_NEW_RULE_ID.containsKey(Integer.valueOf(iA)) ? KakaConstants.TASK_ID_TO_NEW_RULE_ID.get(Integer.valueOf(iA)).intValue() : iA;
    }

    public void j(final CountDownLatch countDownLatch) {
        PluginAchieveAdapter adapter = oru.a(this.i).getAdapter();
        if (adapter == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateSleepTask pluginAchieveAdapter is null");
            pap.a(countDownLatch);
            return;
        }
        long jM = ltb.m(new Date()) * 1000;
        long j = jM - 14400000;
        long j2 = 72000000 + jM;
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateSleepTask startTime = ", Long.valueOf(j), " endTime = ", Long.valueOf(j2));
        adapter.getLatestSleepDatas(j, j2, new AchieveCallback() { // from class: otu.5
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i, Object obj) {
                otu.this.c(countDownLatch, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void c(CountDownLatch countDownLatch, T t) {
        String str;
        String str2;
        String str3;
        if (t instanceof List) {
            List list = (List) t;
            if (njy.e(list)) {
                LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "sleep data is empty! ");
                pap.a(countDownLatch);
                return;
            }
            HiHealthData hiHealthData = (HiHealthData) list.get(0);
            LogUtil.d("PLGACHIEVE_AchieveKakaDataManager", "sleep data == ", hiHealthData);
            long startTime = hiHealthData.getStartTime();
            if (pap.e(startTime, System.currentTimeMillis())) {
                LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "today have no sleep data. startTime ", Long.valueOf(startTime));
                pap.a(countDownLatch);
                return;
            }
            int i = hiHealthData.getInt("maxSleepVersion");
            if (i == 5) {
                str = "dayShallowDurationN1N2";
            } else {
                str = "core_sleep_shallow_key";
            }
            int i2 = hiHealthData.getInt(str);
            if (i == 5) {
                str2 = "dayDeepDurationN3";
            } else {
                str2 = "core_sleep_deep_key";
            }
            int i3 = hiHealthData.getInt(str2);
            if (i == 5) {
                str3 = "dayDreamDurationREM";
            } else {
                str3 = "core_sleep_wake_dream_key";
            }
            int i4 = hiHealthData.getInt(str3);
            int i5 = hiHealthData.getInt("core_sleep_day_sleep_time_key");
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "maxSleepVersion:", Integer.valueOf(i), ", lightSum:", Integer.valueOf(i2), ", deepSum:", Integer.valueOf(i3), ", dreamSum:", Integer.valueOf(i4), ", noonSum:", Integer.valueOf(i5), ", StartTime:", Long.valueOf(hiHealthData.getStartTime()));
            int i6 = i2 + i3 + i4 + i5;
            if (i6 == 0) {
                int i7 = hiHealthData.getInt("sleep_deep_key");
                int i8 = hiHealthData.getInt("sleep_shallow_key");
                i6 = (i7 + i8) / 60;
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateSleepTask lightSum:", Integer.valueOf(i8), ", deepSum:", Integer.valueOf(i7), ", sleepSum:", Integer.valueOf(i6));
            }
            if (i6 > 0) {
                HashMap map = new HashMap(2);
                map.put(KakaConstants.SLEEP_DURATION, Integer.valueOf(i6));
                c(String.valueOf(30002), map);
            }
        } else {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "getSleepReport data is not correct");
        }
        pap.a(countDownLatch);
    }

    public void b(CountDownLatch countDownLatch) {
        HashMap map = new HashMap();
        map.put(KakaConstants.FITNESS_DURATION, 1000);
        c(String.valueOf(KakaConstants.TASK_FITNESS_BEHAVIOR), map);
        pap.a(countDownLatch);
    }

    public void b(final CountDownLatch countDownLatch, final int i) {
        PluginAchieveAdapter adapter = oru.a(this.i).getAdapter();
        if (adapter == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkHealthMeasureRecordTask pluginAchieveAdapter is null");
            pap.a(countDownLatch);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkHealthMeasureRecordTask dataTypeId = ", Integer.valueOf(i));
            adapter.getLatestMesureDatas(HiDateUtil.p(System.currentTimeMillis()), HiDateUtil.g(System.currentTimeMillis()), i, new AchieveCallback() { // from class: otu.1
                @Override // com.huawei.pluginachievement.impl.AchieveCallback
                public void onResponse(int i2, Object obj) {
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (!njy.e(list)) {
                            otu.this.b(i, (List<HiHealthData>) list);
                        } else {
                            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkHealthMeasureRecordTask measureList is empty");
                            pap.a(countDownLatch);
                            return;
                        }
                    } else {
                        LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkHealthMeasureRecordTask data is not correct");
                    }
                    pap.a(countDownLatch);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, List<HiHealthData> list) {
        HiHealthData next;
        int i2;
        Iterator<HiHealthData> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && e(next, i)) {
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkHealthMeasureRecordTask has record, dataTypeId = ", Integer.valueOf(i));
                break;
            }
        }
        if (next == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkHealthMeasureRecordTask has no record, dataTypeId = ", Integer.valueOf(i));
            return;
        }
        if (i == 2103) {
            i2 = 30006;
        } else if (i == 10006) {
            i2 = 30005;
        } else if (i != 10001) {
            i2 = i != 10002 ? 0 : OnRegisterSkinAttrsListener.REGISTER_BY_SCAN;
        } else {
            i2 = 30004;
        }
        if (i2 != 0) {
            e(String.valueOf(i2), (Map<String, Object>) null);
        }
    }

    private boolean e(HiHealthData hiHealthData, int i) {
        if (!pap.e(hiHealthData.getStartTime())) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "isMeasureDataInvalid not today data");
            return false;
        }
        int i2 = hiHealthData.getInt("trackdata_deviceType");
        String string = hiHealthData.getString("device_uniquecode");
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "isMeasureDataInvalid dataType=", Integer.valueOf(i2), " uniqueId= ", string);
        if (i2 <= 1 || i2 == 10001 || "-1".equals(string)) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "isMeasureDataInvalid is input data, dataType=", Integer.valueOf(i2));
            return false;
        }
        String string2 = hiHealthData.getString("metadata");
        if (i != 10006 || !"-1".equals(string2)) {
            return true;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "isMeasureDataInvalid is unclaimed data");
        return false;
    }

    public void d(final CountDownLatch countDownLatch) {
        PluginAchieveAdapter adapter = oru.a(this.i).getAdapter();
        if (adapter == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkEcgMesureTask pluginAchieveAdapter is null");
            pap.a(countDownLatch);
        } else {
            adapter.getLatestMesureDatas(HiDateUtil.p(System.currentTimeMillis()), HiDateUtil.g(System.currentTimeMillis()), 31002, new AchieveCallback() { // from class: otu.10
                @Override // com.huawei.pluginachievement.impl.AchieveCallback
                public void onResponse(int i, Object obj) {
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (njy.e(list)) {
                            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkEcgMesureTask oxygenMeasureList is empty");
                            pap.a(countDownLatch);
                            return;
                        }
                        HiHealthData hiHealthData = (HiHealthData) list.get(0);
                        if (hiHealthData == null) {
                            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkEcgMesureTask healthData is null");
                            pap.a(countDownLatch);
                            return;
                        } else if (pap.e(hiHealthData.getStartTime())) {
                            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkEcgMesureTask has record");
                            otu.this.e(String.valueOf(30010), (Map<String, Object>) null);
                        }
                    } else {
                        LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkEcgMesureTask data is not correct");
                    }
                    pap.a(countDownLatch);
                }
            });
        }
    }

    public void a(final CountDownLatch countDownLatch) {
        PluginAchieveAdapter adapter = oru.a(this.i).getAdapter();
        if (adapter == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkPressureDetectionTask pluginAchieveAdapter is null");
            pap.a(countDownLatch);
        } else {
            adapter.getLatestMesureDatas(0L, System.currentTimeMillis(), 2034, new AchieveCallback() { // from class: otu.9
                @Override // com.huawei.pluginachievement.impl.AchieveCallback
                public void onResponse(int i, Object obj) {
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkPressureDetectionTask errCode = ", Integer.valueOf(i));
                    boolean unused = otu.d = false;
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (njy.e(list)) {
                            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkPressureDetectionTask list is empty");
                            pap.a(countDownLatch);
                            return;
                        }
                        HiHealthData hiHealthData = (HiHealthData) list.get(0);
                        if (hiHealthData != null) {
                            boolean unused2 = otu.d = true;
                            int intValue = hiHealthData.getIntValue();
                            if (intValue <= 0 || intValue >= 100) {
                                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkPressureDetectionTask is not stressData,stressScore= ", Integer.valueOf(intValue));
                                pap.a(countDownLatch);
                                return;
                            } else if (pap.e(hiHealthData.getStartTime())) {
                                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkPressureDetectionTask has record");
                                otu.this.e(String.valueOf(30012), (Map<String, Object>) null);
                            }
                        } else {
                            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkPressureDetectionTask healthData is null");
                            pap.a(countDownLatch);
                            return;
                        }
                    } else {
                        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkPressureDetectionTask has no data");
                    }
                    pap.a(countDownLatch);
                }
            });
        }
    }

    public void e(final CountDownLatch countDownLatch) {
        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkBreatheTask start");
        long jP = HiDateUtil.p(System.currentTimeMillis());
        long jG = HiDateUtil.g(System.currentTimeMillis());
        PluginAchieveAdapter adapter = oru.a(this.i).getAdapter();
        if (adapter == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkBreatheTask pluginAchieveAdapter is null");
            pap.a(countDownLatch);
        } else {
            adapter.getLatestMesureDatas(jP, jG, DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value(), new AchieveCallback() { // from class: otu.6
                @Override // com.huawei.pluginachievement.impl.AchieveCallback
                public void onResponse(int i, Object obj) {
                    if (obj instanceof List) {
                        List list = (List) obj;
                        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkBreatheTask onResult errorCode ", Integer.valueOf(i));
                        if (njy.e(list)) {
                            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkBreatheTask dataList is empty");
                            pap.a(countDownLatch);
                            return;
                        }
                        HiHealthData hiHealthData = (HiHealthData) list.get(0);
                        if (hiHealthData == null) {
                            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkBreatheTask dataList is empty");
                            pap.a(countDownLatch);
                            return;
                        } else {
                            LogUtil.d("PLGACHIEVE_AchieveKakaDataManager", "checkBreatheTask onResult hiHealthData = ", hiHealthData.toString());
                            if (pap.e(hiHealthData.getStartTime())) {
                                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkBreathTask has record");
                                otu.this.e(String.valueOf(30015), (Map<String, Object>) null);
                            }
                            pap.a(countDownLatch);
                        }
                    } else {
                        LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkBreatheTask data is not correct");
                    }
                    pap.a(countDownLatch);
                }
            });
        }
    }

    public void c(CountDownLatch countDownLatch) {
        HashMap map = new HashMap(2);
        map.put(ParsedFieldTag.KAKA_TASK_RULE, String.valueOf(20007));
        map.put(ParsedFieldTag.KAKA_TASK_SCENARIO, String.valueOf(1));
        osf osfVarB = f44729b.b(12, map);
        if (osfVarB instanceof osg) {
            a((osg) osfVarB, countDownLatch);
        }
    }

    public void e(final osg osgVar) {
        if (osgVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "taskInfo is empty.");
        } else if (!String.valueOf(0).equals(osgVar.t())) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "taskInfo is finished, mCourseId == ", osgVar.d());
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: otu.7
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "mCourseId == ", osgVar.d());
                    otu.this.a(osgVar, (CountDownLatch) null);
                }
            });
        }
    }

    public void a(final osg osgVar, final CountDownLatch countDownLatch) {
        if (osgVar == null || TextUtils.isEmpty(osgVar.d())) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkCourseFinished workoutId is empty.");
            pap.a(countDownLatch);
            return;
        }
        long jP = HiDateUtil.p(System.currentTimeMillis());
        long jG = HiDateUtil.g(System.currentTimeMillis());
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaDataManager", "checkCourseFinished recordApi is null.");
            pap.a(countDownLatch);
        } else {
            final String strD = osgVar.d();
            recordApi.acquireExerciseFinished(jP, jG, strD, new ResultCallback() { // from class: otu.8
                @Override // com.huawei.health.suggestion.ResultCallback
                public void onResult(int i, Object obj) {
                    LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "acquireExerciseFinished errorCode = ", Integer.valueOf(i));
                    if (obj instanceof Boolean) {
                        Boolean bool = (Boolean) obj;
                        boolean zBooleanValue = bool.booleanValue();
                        LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "checkCourseFinished courseId == ", strD, " finished = ", bool);
                        if (zBooleanValue) {
                            HashMap map = new HashMap(2);
                            map.put(ParsedFieldTag.TASK_KEY, strD);
                            otu.this.e(String.valueOf(osgVar.ai()), map);
                        }
                    }
                    pap.a(countDownLatch);
                }
            });
        }
    }

    public void g() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: otu.14
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("PLGACHIEVE_AchieveKakaDataManager", "updateEachTaskStatus");
                otu.this.j(null);
                otu.this.b((CountDownLatch) null);
                otu.this.b((CountDownLatch) null, 2103);
                otu.this.b((CountDownLatch) null, 10002);
                otu.this.b((CountDownLatch) null, 10001);
                otu.this.b((CountDownLatch) null, 10006);
                otu.this.d((CountDownLatch) null);
                otu.this.a((CountDownLatch) null);
                otu.this.e((CountDownLatch) null);
            }
        });
    }
}
