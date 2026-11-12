package defpackage;

import com.huawei.health.courseplanservice.api.DataPlatformApi;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.helper.RecyclerHolder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hiv {
    public static void c(RecyclerHolder recyclerHolder, RecordAction recordAction) {
        if (recyclerHolder == null || recordAction == null) {
            LogUtil.j("Suggestion_CoachActivityHelper", "dealDiffType holder == null || itemData == null");
        } else {
            recyclerHolder.b(R.id.sug_coach_tv_finish_actionname, recordAction.getActionName());
            d(recordAction, recyclerHolder);
        }
    }

    private static String e(float f) {
        return UnitUtil.e(f / 60.0f, 1, Math.round((10.0f * f) / 60.0f) % 10 != 0 ? 1 : 0);
    }

    private static void d(RecordAction recordAction, RecyclerHolder recyclerHolder) {
        float finishedAction = recordAction.getFinishedAction();
        float actionTargetValue = recordAction.getActionTargetValue();
        int actionTargetType = recordAction.getActionTargetType();
        if (actionTargetType == 0) {
            e(recyclerHolder, finishedAction, actionTargetValue);
            return;
        }
        if (actionTargetType == 1) {
            c(recyclerHolder, finishedAction, actionTargetValue);
            return;
        }
        if (actionTargetType == 3) {
            a(recyclerHolder, finishedAction, actionTargetValue);
            return;
        }
        if (actionTargetType == 4 || actionTargetType == 5) {
            d(recyclerHolder, finishedAction, actionTargetValue);
            return;
        }
        if (actionTargetType == 10) {
            j(recyclerHolder, finishedAction, actionTargetValue);
            return;
        }
        if (actionTargetType == 101) {
            b(recyclerHolder, finishedAction, actionTargetValue);
        } else if (actionTargetType == 255) {
            e(recyclerHolder, finishedAction);
        } else {
            d(recyclerHolder, finishedAction);
        }
    }

    private static void d(RecyclerHolder recyclerHolder, float f) {
        recyclerHolder.b(R.id.sug_coach_tv_finish_actionmsg, UnitUtil.e(f, 1, 2));
        recyclerHolder.e(R.id.sug_coach_tv_unit_, 8);
        recyclerHolder.e(R.id.sug_coach_finish_total, 8);
        recyclerHolder.e(R.id.sug_coach_finish_unit, 8);
    }

    private static void d(RecyclerHolder recyclerHolder, float f, float f2) {
        recyclerHolder.b(R.id.sug_coach_finish_unit, a(R.plurals.IDS_hwh_motiontrack_stroke_rate_unit, (int) f2, new Object[0]));
        recyclerHolder.b(R.id.sug_coach_tv_finish_actionmsg, a(f));
        recyclerHolder.b(R.id.sug_coach_finish_total, a(f2));
    }

    private static void b(RecyclerHolder recyclerHolder, float f, float f2) {
        recyclerHolder.b(R.id.sug_coach_finish_unit, a(R.string.sug_coach_score_unit));
        recyclerHolder.b(R.id.sug_coach_tv_finish_actionmsg, a(f));
        recyclerHolder.b(R.id.sug_coach_finish_total, a(f2));
    }

    private static void a(RecyclerHolder recyclerHolder, float f, float f2) {
        recyclerHolder.b(R.id.sug_coach_finish_unit, a(R.string.sug_finess_kcal1));
        recyclerHolder.b(R.id.sug_coach_tv_finish_actionmsg, a(f));
        recyclerHolder.b(R.id.sug_coach_finish_total, a(f2));
    }

    private static void j(RecyclerHolder recyclerHolder, float f, float f2) {
        recyclerHolder.b(R.id.sug_coach_finish_unit, a(R.string.sug_coach_ci));
        recyclerHolder.b(R.id.sug_coach_tv_finish_actionmsg, a(f));
        recyclerHolder.b(R.id.sug_coach_finish_total, a(f2));
    }

    private static void c(RecyclerHolder recyclerHolder, float f, float f2) {
        if (f2 >= 60.0f) {
            String strE = e(f);
            String strE2 = e(f2);
            recyclerHolder.e(R.id.sug_coach_tv_unit_, 8);
            recyclerHolder.b(R.id.sug_coach_finish_unit, BaseApplication.getContext().getResources().getString(R.string.IDS_guide_page_num, strE, a(R.plurals.IDS_min_unit, (int) (f2 / 60.0f), strE2)));
            return;
        }
        recyclerHolder.b(R.id.sug_coach_tv_finish_actionmsg, a(f));
        recyclerHolder.b(R.id.sug_coach_finish_unit, a(R.string.sug_second_unit));
        recyclerHolder.b(R.id.sug_coach_finish_total, a(f2));
    }

    private static void e(RecyclerHolder recyclerHolder, float f) {
        String strA;
        if (f >= 60.0f) {
            strA = a(R.plurals.IDS_min_unit, (int) (f / 60.0f), e(f));
        } else {
            strA = a(R.plurals.IDS_plugin_fitnessadvice_second, (int) f, a(f));
        }
        recyclerHolder.b(R.id.sug_coach_tv_finish_actionmsg, strA);
        recyclerHolder.e(R.id.sug_coach_tv_unit_, 8);
        recyclerHolder.e(R.id.sug_coach_finish_total, 8);
        recyclerHolder.e(R.id.sug_coach_finish_unit, 8);
    }

    private static void e(RecyclerHolder recyclerHolder, float f, float f2) {
        int i = (int) f;
        recyclerHolder.b(R.id.sug_coach_tv_finish_actionmsg, ped.f(ped.b(i)));
        String strA = a(R.string.sug_unit_KM);
        String strF = ped.f(ped.b(i));
        String strF2 = ped.f(ped.b((int) f2));
        if (UnitUtil.f()) {
            strA = a(R.string.IDS_hwh_motiontrack_show_speed_pace_mi);
            strF = c(f);
            strF2 = c(f2);
        }
        recyclerHolder.b(R.id.sug_coach_finish_unit, strA);
        recyclerHolder.b(R.id.sug_coach_tv_finish_actionmsg, strF);
        recyclerHolder.b(R.id.sug_coach_finish_total, strF2);
    }

    private static String c(float f) {
        return UnitUtil.e(UnitUtil.e(ped.b((int) f), 3), 1, 2);
    }

    private static String a(int i) {
        return BaseApplication.getContext().getString(i);
    }

    private static String a(int i, int i2, Object... objArr) {
        return BaseApplication.getContext().getResources().getQuantityString(i, i2, objArr);
    }

    private static String a(float f) {
        return UnitUtil.e(f, 1, 0);
    }

    public static void c(Map<Long, Integer> map, long j, long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.TIME_FORMAT_WITHOUT_MILLS);
        long j3 = j / 60000;
        long j4 = j3 * 60000;
        long j5 = j2 / 60000;
        long j6 = j5 * 60000;
        int i = (int) (j5 - j3);
        int i2 = (int) ((j2 - j) / 1000);
        LogUtil.a("Suggestion_CoachActivityHelper", "minDuration：", Integer.valueOf(i), ": ", simpleDateFormat.format(Long.valueOf(j)), Constants.LINK, simpleDateFormat.format(Long.valueOf(j2)));
        if (i == 0) {
            LogUtil.a("Suggestion_CoachActivityHelper", "durationSecond:", Integer.valueOf(i2));
            c(map, j4, i2);
            return;
        }
        if (i < 0) {
            LogUtil.e("Suggestion_CoachActivityHelper", "saveFitnessIntensityToMap durationMin < 0 error");
            return;
        }
        for (int i3 = 0; i3 <= i; i3++) {
            if (i3 == 0) {
                c(map, j4, (int) (((j4 + 60000) - j) / 1000));
            } else if (i3 > 0 && i3 < i) {
                map.put(Long.valueOf((((long) i3) * 60000) + j4), 60);
            } else {
                map.put(Long.valueOf(j6), Integer.valueOf((int) ((j2 - j6) / 1000)));
            }
        }
    }

    private static void c(Map<Long, Integer> map, long j, int i) {
        if (map.containsKey(Long.valueOf(j))) {
            i += map.get(Long.valueOf(j)).intValue();
        }
        map.put(Long.valueOf(j), Integer.valueOf(i));
    }

    public static void e(Map<Long, Integer> map, List<HeartRateData> list, int i) {
        LogUtil.a("Suggestion_CoachActivityHelper", "saveFitnessIntensityToMap:", Integer.valueOf(i));
        ArrayList<HeartRateData> arrayList = new ArrayList();
        long jAcquireTime = list.get(0).acquireTime();
        int iAcquireHeartRate = list.get(0).acquireHeartRate();
        int i2 = 1;
        for (int i3 = 1; i3 < list.size(); i3++) {
            HeartRateData heartRateData = list.get(i3);
            iAcquireHeartRate += heartRateData.acquireHeartRate();
            i2++;
            if (heartRateData.acquireTime() - jAcquireTime > 60000) {
                LogUtil.a("Suggestion_CoachActivityHelper", "minuteHeartRate:", Long.valueOf(heartRateData.acquireTime()), Integer.valueOf(heartRateData.acquireHeartRate()));
                long jAcquireTime2 = (heartRateData.acquireTime() / 60000) * 60000;
                int iRound = Math.round(iAcquireHeartRate / i2);
                LogUtil.a("Suggestion_CoachActivityHelper", "timeMill:", Long.valueOf(jAcquireTime2), "hearRate:", Integer.valueOf(iRound));
                arrayList.add(new HeartRateData(jAcquireTime2, iRound));
                jAcquireTime = heartRateData.acquireTime();
                iAcquireHeartRate = 0;
                i2 = 0;
            }
        }
        if (i2 != 0) {
            long j = (jAcquireTime / 60000) * 60000;
            int iRound2 = Math.round(iAcquireHeartRate / i2);
            LogUtil.a("Suggestion_CoachActivityHelper", "timeMill:", Long.valueOf(j), "hearRate:", Integer.valueOf(iRound2));
            arrayList.add(new HeartRateData(j, iRound2));
        }
        for (HeartRateData heartRateData2 : arrayList) {
            if (heartRateData2.acquireHeartRate() >= i && heartRateData2.acquireTime() > 0) {
                map.put(Long.valueOf(heartRateData2.acquireTime()), 60);
            }
        }
    }

    public static void a(Map<Long, Integer> map) {
        if (map == null) {
            LogUtil.j("Suggestion_CoachActivityHelper", "saveMapToFitnessIntensity map is null");
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.TIME_FORMAT_WITHOUT_MILLS);
        StringBuilder sb = new StringBuilder(16);
        int i = 0;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getValue().intValue();
            if (iIntValue <= 0) {
                LogUtil.e("Suggestion_CoachActivityHelper", "saveMapToFitnessIntensity key < = 0 error");
            } else {
                arrayList.add(entry.getKey());
                String str = simpleDateFormat.format(entry.getKey());
                i += iIntValue;
                sb.append("~key:");
                sb.append(str);
                sb.append("-value:");
                sb.append(entry.getValue());
            }
        }
        LogUtil.a("Suggestion_CoachActivityHelper", "saveMapToFitnessIntensity sumSecond:", Integer.valueOf(i), "--logStr:", sb);
        DataPlatformApi dataPlatformApi = (DataPlatformApi) Services.d("CoursePlanService", DataPlatformApi.class);
        if (dataPlatformApi == null) {
            LogUtil.j("Suggestion_CoachActivityHelper", "saveMapToFitnessIntensity dataPlatformApi is null.");
        } else {
            dataPlatformApi.insertFitnessIntensityData(BaseApplication.getContext(), arrayList);
            map.clear();
        }
    }
}
