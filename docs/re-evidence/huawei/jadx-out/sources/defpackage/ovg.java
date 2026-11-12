package defpackage;

import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.marketing.request.SleepAudio;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.connectivity.https.HttpResCallBack;
import com.huawei.pluginachievement.report.bean.Goal;
import com.huawei.pluginachievement.report.bean.H5ResponseData;
import com.huawei.pluginachievement.report.bean.UserMemberInfo;
import com.huawei.pluginachievement.report.bean.WorkoutPlayInfo;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class ovg extends BaseCalculator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PluginAchieveAdapter f44848c = getPluginAchieveAdapter();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        e(i);
    }

    private void e(int i) {
        if (this.f44848c == null) {
            this.f44848c = oru.a(BaseApplication.getContext()).getAdapter();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c(i, countDownLatch);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_H5RecordCalculator", "getRecordData.await(): catch InterruptedException");
        }
    }

    private void c(final int i, final CountDownLatch countDownLatch) {
        String str;
        String str2 = "/functions/13EZwy3Ao5DP1dbrrORTkG";
        String str3 = "/bff/annual-report";
        if (CommonUtil.cl()) {
            str = BleConstants.WEIGHT_KEY;
        } else if (CommonUtil.ao()) {
            str = "debug";
            str3 = "/bff/annualReport-debug";
        } else {
            str2 = "/functions/2PioDjylqtMakeB6DPy3Ij";
            str = "beta&release";
        }
        String str4 = GRSManager.c(BaseApplication.getContext()).getUrl("domainGlobalSearch") + str2 + str3;
        LogUtil.a("PLGACHIEVE_H5RecordCalculator", "getH5RecordData environment ", str, ",", str4);
        LogUtil.d("PLGACHIEVE_H5RecordCalculator", "pullData ret=", Integer.valueOf(osk.a(str4, oxb.c(i), oxb.a(), new HttpResCallBack() { // from class: ovg.5
            @Override // com.huawei.pluginachievement.connectivity.https.HttpResCallBack
            public void onFinished(int i2, String str5) {
                LogUtil.a("PLGACHIEVE_H5RecordCalculator", "getH5RecordData resCode ", Integer.valueOf(i2));
                ovg.this.c(i, oxb.e(str5));
                countDownLatch.countDown();
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, H5ResponseData h5ResponseData) {
        if (h5ResponseData == null) {
            LogUtil.j("PLGACHIEVE_H5RecordCalculator", "dealH5DataInfo responseData is null.");
            return;
        }
        c(i, h5ResponseData.getGoal());
        a(i, h5ResponseData.getWorkoutPlayList(), h5ResponseData.getAudioCompleteCount());
        b(i, h5ResponseData.getSleepAudios());
        c(i, h5ResponseData.getMemberInfo());
    }

    private void b(int i, List<SleepAudio> list) {
        if (njy.e(list)) {
            d(i, 0, "0", null);
            return;
        }
        HashMap<String, Integer> map = new HashMap<>(16);
        for (SleepAudio sleepAudio : list) {
            if (sleepAudio.getAudioType() == 1 || sleepAudio.getAudioType() == 3) {
                oxb.e(map, "1");
            } else if (sleepAudio.getAudioType() == 2) {
                oxb.e(map, "2");
            }
            if (sleepAudio.getDecompressType() == 1) {
                oxb.e(map, "3");
            }
            if (sleepAudio.getAudioType() == 4 || sleepAudio.getDecompressType() == 2) {
                oxb.e(map, "4");
            }
        }
        int size = list.size();
        String strA = a(map);
        LogUtil.a("PLGACHIEVE_H5RecordCalculator", "computeReportMusic favoriteHypnoticMusicType ", strA, " favoriteMusicMap ", map.toString());
        d(i, size, strA, map);
    }

    private static String a(HashMap<String, Integer> map) {
        if (map == null || map.size() == 0) {
            return "-1";
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() { // from class: ovg.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().intValue() - entry.getValue().intValue();
            }
        });
        for (Map.Entry entry : arrayList) {
            LogUtil.a("PLGACHIEVE_H5RecordCalculator", "acquireFavoriteMusic mapSet.getKey() ", entry.getKey(), " mapSet.getValue() ", entry.getValue());
        }
        return (String) ((Map.Entry) arrayList.get(0)).getKey();
    }

    private void d(int i, int i2, String str, HashMap<String, Integer> map) {
        String strD;
        insertData(i, EnumAnnualType.REPORT_MUSIC.value(), 10038, String.valueOf(i2));
        insertData(i, EnumAnnualType.REPORT_MUSIC.value(), 10039, str);
        if (map == null) {
            strD = "";
        } else {
            strD = HiJsonUtil.d(map);
        }
        LogUtil.a("PLGACHIEVE_H5RecordCalculator", "saveMusicData totalNumOfMusicType= ", strD);
        insertData(i, EnumAnnualType.REPORT_MUSIC.value(), 10050, strD);
    }

    private void a(int i, List<WorkoutPlayInfo> list, int i2) {
        if (njy.e(list)) {
            e(i, 0, 0, 0);
            return;
        }
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        HashSet hashSet = new HashSet(list.size());
        HashSet hashSet2 = new HashSet(list.size());
        for (WorkoutPlayInfo workoutPlayInfo : list) {
            hashSet.add(workoutPlayInfo.getOnlineDate());
            if (workoutPlayInfo.getStatus() == 1 || workoutPlayInfo.getStatus() == 2) {
                long jD = oxb.d(workoutPlayInfo.getOnlineDate());
                if (jD >= jA && jD <= jA2) {
                    hashSet2.add(Long.valueOf(jD));
                }
            }
        }
        int size = hashSet.size();
        ArrayList arrayList = new ArrayList(hashSet2);
        LogUtil.a("PLGACHIEVE_H5RecordCalculator", "computeHeadline dayArray = ", arrayList.toString());
        e(i, size, owj.c(arrayList), i2);
    }

    private void e(int i, int i2, int i3, int i4) {
        LogUtil.a("PLGACHIEVE_H5RecordCalculator", "saveHeadline year ", Integer.valueOf(i), " headlineNum ", Integer.valueOf(i2), " maxContinuousHeadlineDay ", Integer.valueOf(i3), " headlineDayNum ", Integer.valueOf(i4));
        insertData(i, EnumAnnualType.REPORT_MUSIC.value(), 10035, String.valueOf(i2));
        insertData(i, EnumAnnualType.REPORT_MUSIC.value(), PrebakedEffectId.RT_SNIPER_RIFLE, String.valueOf(i3));
        insertData(i, EnumAnnualType.REPORT_MUSIC.value(), PrebakedEffectId.RT_ASSAULT_RIFLE, String.valueOf(i4));
    }

    private void c(int i, UserMemberInfo userMemberInfo) {
        long createTime;
        int i2 = 1;
        if (userMemberInfo != null) {
            createTime = userMemberInfo.getCreateTime();
            if (userMemberInfo.getMemberFlag() == 1) {
                i2 = userMemberInfo.getExpireTime() > userMemberInfo.getNowTime() ? 0 : 2;
            }
        } else {
            createTime = 0;
        }
        LogUtil.a("PLGACHIEVE_H5RecordCalculator", "computeReportVip firstBeVipTime = ", Long.valueOf(createTime));
        insertData(i, EnumAnnualType.REPORT_VIP.value(), PrebakedEffectId.RT_FAST_MOVING, String.valueOf(createTime));
        LogUtil.a("PLGACHIEVE_H5RecordCalculator", "computeReportVip currentVipStatus = ", Integer.valueOf(i2));
        insertData(i, EnumAnnualType.REPORT_VIP.value(), PrebakedEffectId.RT_FLY, String.valueOf(i2));
    }

    private void c(int i, List<Goal> list) {
        int i2 = 0;
        if (njy.e(list)) {
            a(i, 0, 0);
            LogUtil.j("PLGACHIEVE_H5RecordCalculator", "computeGoal goalList is empty!");
            return;
        }
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        int i3 = 0;
        for (Goal goal : list) {
            if (goal.getStartTime() >= jA && goal.getEndTime() <= jA2) {
                if (goal.getStatus() == 1) {
                    i3++;
                }
                i2++;
            }
        }
        a(i, i2, i3);
    }

    private void a(int i, int i2, int i3) {
        LogUtil.a("PLGACHIEVE_H5RecordCalculator", "saveGoalData annualFlagNum = ", Integer.valueOf(i2));
        insertData(i, EnumAnnualType.REPORT_REWARD.value(), PrebakedEffectId.RT_DRAWING_ARROW, String.valueOf(i2));
        LogUtil.a("PLGACHIEVE_H5RecordCalculator", "saveGoalData annualReachFlagNum = ", Integer.valueOf(i3));
        insertData(i, EnumAnnualType.REPORT_REWARD.value(), 10034, String.valueOf(i3));
    }
}
