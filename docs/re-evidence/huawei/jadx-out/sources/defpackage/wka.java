package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelReq;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcloudmodel.model.unite.RunLevelDetail;
import com.huawei.hwcloudmodel.model.unite.UserRunLevelData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningDayData;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningLevelCurrentData;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningLevelSomeDayData;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import com.huawei.up.model.UserInfomation;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wka {
    public static List<qlj> a() {
        Context context = BaseApplication.getContext();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(-20.0f, -16.0f, ContextCompat.getColor(context, R.color.pie_sector_running_level_color_sss), context.getString(R.string.IDS_data_index_very_pool)));
        arrayList.add(new qlj(-16.0f, -6.0f, ContextCompat.getColor(context, R.color.pie_sector_running_level_color_ss), context.getString(R.string.IDS_data_index_pool)));
        arrayList.add(new qlj(-6.0f, 0.5f, ContextCompat.getColor(context, R.color.pie_sector_running_level_color_a), context.getString(R.string.IDS_data_index_normal)));
        arrayList.add(new qlj(0.5f, 3.0f, ContextCompat.getColor(context, R.color.pie_sector_running_level_color_b), context.getString(R.string.IDS_data_index_well)));
        arrayList.add(new qlj(3.0f, 5.0f, ContextCompat.getColor(context, R.color.pie_sector_running_level_color_d), context.getString(R.string.IDS_data_index_very_well)));
        return arrayList;
    }

    public static List<qlj> c(Integer[] numArr) {
        Context context = BaseApplication.getContext();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(numArr[0].intValue(), numArr[1].intValue(), ContextCompat.getColor(context, R.color.pie_sector_running_level_color_sss), context.getString(R.string.IDS_hwh_health_vo2max_level_verypoor)));
        arrayList.add(new qlj(numArr[1].intValue(), numArr[2].intValue(), ContextCompat.getColor(context, R.color.pie_sector_running_level_color_ss), context.getString(R.string.IDS_hwh_health_vo2max_level_poor)));
        arrayList.add(new qlj(numArr[2].intValue(), numArr[3].intValue(), ContextCompat.getColor(context, R.color.pie_sector_running_level_color_s), context.getString(R.string.IDS_hwh_health_vo2max_level_fair)));
        arrayList.add(new qlj(numArr[3].intValue(), numArr[4].intValue(), ContextCompat.getColor(context, R.color.pie_sector_running_level_color_a), context.getString(R.string.IDS_hwh_health_vo2max_level_average)));
        arrayList.add(new qlj(numArr[4].intValue(), numArr[5].intValue(), ContextCompat.getColor(context, R.color.pie_sector_running_level_color_b), context.getString(R.string.IDS_hwh_health_vo2max_level_good)));
        arrayList.add(new qlj(numArr[5].intValue(), numArr[6].intValue(), ContextCompat.getColor(context, R.color.pie_sector_running_level_color_c), context.getString(R.string.IDS_hwh_health_vo2max_level_verygood)));
        arrayList.add(new qlj(numArr[6].intValue(), numArr[7].intValue(), ContextCompat.getColor(context, R.color.pie_sector_running_level_color_d), context.getString(R.string.IDS_hwh_health_vo2max_level_excellent)));
        return arrayList;
    }

    public static List<qlj> d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Context context = BaseApplication.getContext();
        ArrayList arrayList = new ArrayList();
        boolean zE = e();
        if (zE) {
            i = R.color.pie_sector_running_level_color_sss;
        } else {
            i = R.color.pie_sector_running_level_color_d;
        }
        arrayList.add(new qlj(20.0f, 22.0f, ContextCompat.getColor(context, i), context.getString(R.string.IDS_data_running_index_level_d)));
        if (zE) {
            i2 = R.color.pie_sector_running_level_color_ss;
        } else {
            i2 = R.color.pie_sector_running_level_color_c;
        }
        arrayList.add(new qlj(22.0f, 27.0f, ContextCompat.getColor(context, i2), context.getString(R.string.IDS_data_running_index_level_c)));
        if (zE) {
            i3 = R.color.pie_sector_running_level_color_s;
        } else {
            i3 = R.color.pie_sector_running_level_color_b;
        }
        arrayList.add(new qlj(27.0f, 36.0f, ContextCompat.getColor(context, i3), context.getString(R.string.IDS_data_running_index_level_b)));
        arrayList.add(new qlj(36.0f, 45.0f, ContextCompat.getColor(context, R.color.pie_sector_running_level_color_a), context.getString(R.string.IDS_data_running_index_level_a)));
        if (zE) {
            i4 = R.color.pie_sector_running_level_color_b;
        } else {
            i4 = R.color.pie_sector_running_level_color_s;
        }
        arrayList.add(new qlj(45.0f, 53.0f, ContextCompat.getColor(context, i4), context.getString(R.string.IDS_data_running_index_level_s)));
        if (zE) {
            i5 = R.color.pie_sector_running_level_color_c;
        } else {
            i5 = R.color.pie_sector_running_level_color_ss;
        }
        arrayList.add(new qlj(53.0f, 58.0f, ContextCompat.getColor(context, i5), context.getString(R.string.IDS_data_running_index_level_ss)));
        if (zE) {
            i6 = R.color.pie_sector_running_level_color_d_new;
        } else {
            i6 = R.color.pie_sector_running_level_color_sss;
        }
        arrayList.add(new qlj(58.0f, 90.0f, ContextCompat.getColor(context, i6), context.getString(R.string.IDS_data_running_index_level_sss)));
        return arrayList;
    }

    public static List<qlj> b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Context context = BaseApplication.getContext();
        ArrayList arrayList = new ArrayList();
        boolean zE = e();
        if (zE) {
            i = R.color.pie_sector_running_level_color_sss;
        } else {
            i = R.color.pie_sector_running_level_color_d;
        }
        arrayList.add(new qlj(20.0f, 25.0f, ContextCompat.getColor(context, i), context.getString(R.string.IDS_data_running_index_level_d)));
        if (zE) {
            i2 = R.color.pie_sector_running_level_color_ss;
        } else {
            i2 = R.color.pie_sector_running_level_color_c;
        }
        arrayList.add(new qlj(25.0f, 30.0f, ContextCompat.getColor(context, i2), context.getString(R.string.IDS_data_running_index_level_c)));
        if (zE) {
            i3 = R.color.pie_sector_running_level_color_s;
        } else {
            i3 = R.color.pie_sector_running_level_color_b;
        }
        arrayList.add(new qlj(30.0f, 40.0f, ContextCompat.getColor(context, i3), context.getString(R.string.IDS_data_running_index_level_b)));
        arrayList.add(new qlj(40.0f, 50.0f, ContextCompat.getColor(context, R.color.pie_sector_running_level_color_a), context.getString(R.string.IDS_data_running_index_level_a)));
        if (zE) {
            i4 = R.color.pie_sector_running_level_color_b;
        } else {
            i4 = R.color.pie_sector_running_level_color_s;
        }
        arrayList.add(new qlj(50.0f, 60.0f, ContextCompat.getColor(context, i4), context.getString(R.string.IDS_data_running_index_level_s)));
        if (zE) {
            i5 = R.color.pie_sector_running_level_color_c;
        } else {
            i5 = R.color.pie_sector_running_level_color_ss;
        }
        arrayList.add(new qlj(60.0f, 65.0f, ContextCompat.getColor(context, i5), context.getString(R.string.IDS_data_running_index_level_ss)));
        if (zE) {
            i6 = R.color.pie_sector_running_level_color_d_new;
        } else {
            i6 = R.color.pie_sector_running_level_color_sss;
        }
        arrayList.add(new qlj(65.0f, 90.0f, ContextCompat.getColor(context, i6), context.getString(R.string.IDS_data_running_index_level_sss)));
        return arrayList;
    }

    public static int f(float f) {
        Context context = BaseApplication.getContext();
        if (f >= 3.0f) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_d);
        }
        if (f >= 0.5f) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_b);
        }
        if (f >= -6.0f) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_a);
        }
        if (f >= -16.0f) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_ss);
        }
        if (f >= -20.0f) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_sss);
        }
        return ContextCompat.getColor(context, R.color.textColorSecondary);
    }

    public static int c(Integer[] numArr, int i) {
        Context context = BaseApplication.getContext();
        if (i >= numArr[6].intValue()) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_d);
        }
        if (i >= numArr[5].intValue()) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_c);
        }
        if (i >= numArr[4].intValue()) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_b);
        }
        if (i >= numArr[3].intValue()) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_a);
        }
        if (i >= numArr[2].intValue()) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_s);
        }
        if (i >= numArr[1].intValue()) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_ss);
        }
        if (i >= numArr[0].intValue()) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_sss);
        }
        return ContextCompat.getColor(context, R.color.textColorSecondary);
    }

    public static int c(float f) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Context context = BaseApplication.getContext();
        boolean zE = e();
        if (f >= 65.0f) {
            if (zE) {
                i6 = R.color.pie_sector_running_level_color_d_new;
            } else {
                i6 = R.color.pie_sector_running_level_color_sss;
            }
            return ContextCompat.getColor(context, i6);
        }
        if (f >= 60.0f) {
            if (zE) {
                i5 = R.color.pie_sector_running_level_color_c;
            } else {
                i5 = R.color.pie_sector_running_level_color_ss;
            }
            return ContextCompat.getColor(context, i5);
        }
        if (f >= 50.0f) {
            if (zE) {
                i4 = R.color.pie_sector_running_level_color_b;
            } else {
                i4 = R.color.pie_sector_running_level_color_s;
            }
            return ContextCompat.getColor(context, i4);
        }
        if (f >= 40.0f) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_a);
        }
        if (f >= 30.0f) {
            if (zE) {
                i3 = R.color.pie_sector_running_level_color_s;
            } else {
                i3 = R.color.pie_sector_running_level_color_b;
            }
            return ContextCompat.getColor(context, i3);
        }
        if (f >= 25.0f) {
            if (zE) {
                i2 = R.color.pie_sector_running_level_color_ss;
            } else {
                i2 = R.color.pie_sector_running_level_color_c;
            }
            return ContextCompat.getColor(context, i2);
        }
        if (f > 0.0f) {
            if (zE) {
                i = R.color.pie_sector_running_level_color_sss;
            } else {
                i = R.color.pie_sector_running_level_color_d;
            }
            return ContextCompat.getColor(context, i);
        }
        return ContextCompat.getColor(context, R.color.textColorSecondary);
    }

    public static int e(float f) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Context context = BaseApplication.getContext();
        boolean zE = e();
        if (f >= 58.0f) {
            if (zE) {
                i6 = R.color.pie_sector_running_level_color_d_new;
            } else {
                i6 = R.color.pie_sector_running_level_color_sss;
            }
            return ContextCompat.getColor(context, i6);
        }
        if (f >= 53.0f) {
            if (zE) {
                i5 = R.color.pie_sector_running_level_color_c;
            } else {
                i5 = R.color.pie_sector_running_level_color_ss;
            }
            return ContextCompat.getColor(context, i5);
        }
        if (f >= 45.0f) {
            if (zE) {
                i4 = R.color.pie_sector_running_level_color_b;
            } else {
                i4 = R.color.pie_sector_running_level_color_s;
            }
            return ContextCompat.getColor(context, i4);
        }
        if (f >= 36.0f) {
            return ContextCompat.getColor(context, R.color.pie_sector_running_level_color_a);
        }
        if (f >= 27.0f) {
            if (zE) {
                i3 = R.color.pie_sector_running_level_color_s;
            } else {
                i3 = R.color.pie_sector_running_level_color_b;
            }
            return ContextCompat.getColor(context, i3);
        }
        if (f >= 22.0f) {
            if (zE) {
                i2 = R.color.pie_sector_running_level_color_ss;
            } else {
                i2 = R.color.pie_sector_running_level_color_c;
            }
            return ContextCompat.getColor(context, i2);
        }
        if (f > 0.0f) {
            if (zE) {
                i = R.color.pie_sector_running_level_color_sss;
            } else {
                i = R.color.pie_sector_running_level_color_d;
            }
            return ContextCompat.getColor(context, i);
        }
        return ContextCompat.getColor(context, R.color.textColorSecondary);
    }

    public static String i(float f) {
        Context context = BaseApplication.getContext();
        if (f >= 65.0f) {
            return context.getString(R.string.IDS_data_running_index_level_sss);
        }
        if (f >= 60.0f) {
            return context.getString(R.string.IDS_data_running_index_level_ss);
        }
        if (f >= 50.0f) {
            return context.getString(R.string.IDS_data_running_index_level_s);
        }
        if (f >= 40.0f) {
            return context.getString(R.string.IDS_data_running_index_level_a);
        }
        if (f >= 30.0f) {
            return context.getString(R.string.IDS_data_running_index_level_b);
        }
        if (f >= 25.0f) {
            return context.getString(R.string.IDS_data_running_index_level_c);
        }
        if (f > 0.0f) {
            return context.getString(R.string.IDS_data_running_index_level_d);
        }
        return "--";
    }

    public static String b(float f) {
        Context context = BaseApplication.getContext();
        if (f >= 58.0f) {
            return context.getString(R.string.IDS_data_running_index_level_sss);
        }
        if (f >= 53.0f) {
            return context.getString(R.string.IDS_data_running_index_level_ss);
        }
        if (f >= 45.0f) {
            return context.getString(R.string.IDS_data_running_index_level_s);
        }
        if (f >= 36.0f) {
            return context.getString(R.string.IDS_data_running_index_level_a);
        }
        if (f >= 27.0f) {
            return context.getString(R.string.IDS_data_running_index_level_b);
        }
        if (f >= 22.0f) {
            return context.getString(R.string.IDS_data_running_index_level_c);
        }
        if (f > 0.0f) {
            return context.getString(R.string.IDS_data_running_index_level_d);
        }
        return "--";
    }

    public static int c() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            userInfo = new UserInfomation(0);
        }
        return userInfo.getGender();
    }

    public static String g(float f) {
        Context context = BaseApplication.getContext();
        if (f >= 3.0f) {
            return context.getString(R.string.IDS_data_index_very_well);
        }
        if (f >= 0.5f) {
            return context.getString(R.string.IDS_data_index_well);
        }
        if (f >= -6.0f) {
            return context.getString(R.string.IDS_data_index_normal);
        }
        if (f >= -16.0f) {
            return context.getString(R.string.IDS_data_index_pool);
        }
        return context.getString(R.string.IDS_data_index_very_pool);
    }

    public static String j(float f) {
        Context context = BaseApplication.getContext();
        if (f >= 3.0f) {
            return context.getString(R.string.IDS_data_index_very_well_explain);
        }
        if (f >= 0.5f) {
            return context.getString(R.string.IDS_data_day_tab_tip);
        }
        if (f >= -6.0f) {
            return context.getString(R.string.IDS_data_index_normal_explain);
        }
        if (f >= -16.0f) {
            return context.getString(R.string.IDS_data_index_pool_explain);
        }
        return context.getString(R.string.IDS_data_index_very_pool_explain);
    }

    public static HealthTextView c(ViewGroup viewGroup, int i, Activity activity) {
        View viewFindViewById = viewGroup.findViewById(i);
        if (viewFindViewById instanceof HealthTextView) {
            return (HealthTextView) viewFindViewById;
        }
        LogUtil.j("Track_RqDataUtils", "getTextView view is not instanceof HealthTextView");
        return new HealthTextView(activity);
    }

    public static void b(Context context, long j, long j2, final int i, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (context == null || responseCallback == null) {
            return;
        }
        GetRunLevelReq getRunLevelReq = new GetRunLevelReq();
        if (j2 > System.currentTimeMillis()) {
            j2 = System.currentTimeMillis();
        }
        getRunLevelReq.setStartDay(ieg.b(j));
        getRunLevelReq.setEndDay(ieg.b(j2));
        getRunLevelReq.setQueryType(i);
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        getRunLevelReq.setTypes(hashSet);
        getRunLevelReq.setTimeZone(ieg.d());
        LogUtil.a("Track_RqDataUtils", getRunLevelReq.toString());
        lqo.b(context.getApplicationContext()).c(getRunLevelReq, new ResultCallback<GetRunLevelRsp>() { // from class: wka.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(GetRunLevelRsp getRunLevelRsp) {
                if (getRunLevelRsp == null) {
                    return;
                }
                wka.b(responseCallback, getRunLevelRsp.getData(), i);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("Track_RqDataUtils", "getRunLevel error:", th.getMessage());
                responseCallback.onResult(-1, Collections.EMPTY_MAP);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ResponseCallback<Map<Long, IStorageModel>> responseCallback, Map<Integer, RunLevelDetail> map, int i) {
        responseCallback.onResult(0, d(map, i));
    }

    private static Map<Long, IStorageModel> d(Map<Integer, RunLevelDetail> map, int i) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<Integer, RunLevelDetail> entry : map.entrySet()) {
                long jB = b(entry.getKey().intValue(), i);
                map2.put(Long.valueOf(jB), new qmq(c(entry.getValue()).getCurrentRunLevel()));
            }
        }
        return map2;
    }

    private static RunningDayData c(RunLevelDetail runLevelDetail) {
        RunningDayData runningDayData = new RunningDayData();
        if (runLevelDetail != null) {
            runningDayData.setCurrentRunLevel(runLevelDetail.getCurrentRunLevel());
            runningDayData.setRealRunLevel(runLevelDetail.getRealRunLevel());
        }
        return runningDayData;
    }

    private static long b(int i, int i2) {
        String str;
        if (i2 == 1) {
            str = "yyyyMM";
        } else {
            str = "yyyyMMdd";
        }
        try {
            Date date = new SimpleDateFormat(str).parse(String.valueOf(i));
            if (i2 == 1) {
                return c(date).getTime();
            }
            return ltb.h(date.getTime());
        } catch (ParseException e) {
            LogUtil.e(e.getMessage(), new Object[0]);
            return 0L;
        }
    }

    public static Date c(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, Math.round(ltb.s(date) / 2.0f));
        return calendar.getTime();
    }

    public static RunningStateIndexData c(GetRunLevelRsp getRunLevelRsp) {
        RunningStateIndexData runningStateIndexData = new RunningStateIndexData();
        if (getRunLevelRsp != null) {
            if (getRunLevelRsp.getUserRunLevelData() != null) {
                UserRunLevelData userRunLevelData = getRunLevelRsp.getUserRunLevelData();
                RunningLevelCurrentData runningLevelCurrentData = new RunningLevelCurrentData();
                runningLevelCurrentData.setCurrentRunLevel(userRunLevelData.getCurrentRunLevel());
                runningLevelCurrentData.setRanking(userRunLevelData.getRanking());
                runningLevelCurrentData.setTimeForFiveKm(userRunLevelData.getTimeForFiveKm());
                runningLevelCurrentData.setTimeForTenKm(userRunLevelData.getTimeForTenKm());
                runningLevelCurrentData.setHalfMarathon(userRunLevelData.getHalfMarathon());
                runningLevelCurrentData.setMarathon(userRunLevelData.getMarathon());
                runningLevelCurrentData.setLastRecordDay(userRunLevelData.getLastRecordDay());
                runningLevelCurrentData.setLastTotalPoint(userRunLevelData.getLastTotalPoint());
                runningLevelCurrentData.setLastCurrentRunLevel(userRunLevelData.getLastCurrentRunLevel());
                runningLevelCurrentData.setLastRanking(userRunLevelData.getLastRanking());
                runningLevelCurrentData.setLastFitness(userRunLevelData.getLastFitness());
                runningLevelCurrentData.setLastFatigue(userRunLevelData.getLastFatigue());
                runningLevelCurrentData.setLastCondition(userRunLevelData.getLastCondition());
                runningLevelCurrentData.setKm1Pace(userRunLevelData.getKm1Pace());
                runningLevelCurrentData.setKm3Pace(userRunLevelData.getKm3Pace());
                runningLevelCurrentData.setKm5Pace(userRunLevelData.getKm5Pace());
                runningLevelCurrentData.setKm10Pace(userRunLevelData.getKm10Pace());
                runningLevelCurrentData.setHalfMarathonPace(userRunLevelData.getHalfMarathonPace());
                runningLevelCurrentData.setMarathonPace(userRunLevelData.getMarathonPace());
                runningStateIndexData.setRunningLevelCurrentData(runningLevelCurrentData);
            }
            if (getRunLevelRsp.getData() != null) {
                HashMap map = new HashMap();
                for (Map.Entry<Integer, RunLevelDetail> entry : getRunLevelRsp.getData().entrySet()) {
                    if (entry.getValue() != null) {
                        RunningLevelSomeDayData runningLevelSomeDayData = new RunningLevelSomeDayData();
                        runningLevelSomeDayData.setCondition(entry.getValue().getCondition());
                        runningLevelSomeDayData.setCurrentRunLevel(entry.getValue().getCurrentRunLevel());
                        runningLevelSomeDayData.setFitness(entry.getValue().getFitness());
                        runningLevelSomeDayData.setFatigue(entry.getValue().getFatigue());
                        runningLevelSomeDayData.setTotalPoint(entry.getValue().getTotalPoint());
                        map.put(entry.getKey(), runningLevelSomeDayData);
                    }
                }
                runningStateIndexData.setData(map);
            }
        }
        return runningStateIndexData;
    }

    public static String c(int i, float f, float f2, boolean z) {
        String strE;
        StringBuilder sb = new StringBuilder();
        String str = Constants.LINK;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (LanguageUtil.ba(BaseApplication.getContext())) {
                        sb.append("");
                        sb.append(UnitUtil.e(f, 1, 1));
                        sb.append(" ≤");
                    } else {
                        sb.append("≥");
                        sb.append(UnitUtil.e(f, 1, 1));
                    }
                } else {
                    LogUtil.j("Track_RqDataUtils", "setZone wrong type!");
                }
            } else if (LanguageUtil.ba(BaseApplication.getContext())) {
                sb.append("");
                if (!z && f2 < 0.0f && LanguageUtil.c(BaseApplication.getContext())) {
                    strE = UnitUtil.e(-f2, 1, 1) + Constants.LINK;
                } else {
                    strE = UnitUtil.e(f2, 1, 1);
                }
                sb.append(strE);
                sb.append(" >");
            } else {
                sb.append(HiDataFilter.DataFilterExpression.LESS_THAN);
                sb.append(UnitUtil.e(f2, 1, 1));
            }
        } else if (LanguageUtil.c(BaseApplication.getContext())) {
            c(f, f2, z, sb);
        } else {
            sb.append("");
            sb.append(UnitUtil.e(f, 1, 1));
            sb.append(" ");
            if (!z) {
                str = " ~ ";
            }
            sb.append(str);
            sb.append(" ");
            sb.append(UnitUtil.e(f2, 1, 1));
        }
        return sb.toString();
    }

    private static void c(float f, float f2, boolean z, StringBuilder sb) {
        String strE;
        String strE2;
        sb.append("");
        if (!z && f < 0.0f) {
            strE = UnitUtil.e(-f, 1, 1);
        } else {
            strE = UnitUtil.e(f, 1, 1);
        }
        sb.append(strE);
        sb.append(" ");
        sb.append(z ? Constants.LINK : " ~ ");
        sb.append(" ");
        if (!z && f2 < 0.0f) {
            strE2 = Constants.LINK + UnitUtil.e(-f2, 1, 1);
        } else {
            strE2 = UnitUtil.e(f2, 1, 1);
        }
        sb.append(strE2);
    }

    public static String a(float f) {
        double d = UnitUtil.d(f, 1);
        if (Math.abs(d) == 0.0d) {
            return UnitUtil.e(0.0d, 1, 0);
        }
        return UnitUtil.e(d, 1, 1);
    }

    public static String d(float f) {
        return UnitUtil.e(UnitUtil.d(f, 1), 1, 1);
    }

    public static void d(Context context, CustomTitleBar customTitleBar, final String str) {
        if (context == null || customTitleBar == null || TextUtils.isEmpty(str)) {
            return;
        }
        customTitleBar.setRightButtonDrawable(context.getResources().getDrawable(R.drawable.ic_rq_explain), qre.f(R.string.IDS_lactate_tittlebar_top));
        customTitleBar.setRightButtonClickable(true);
        customTitleBar.setRightButtonVisibility(0);
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: wka.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.c(900)) {
                    LogUtil.j("Track_RqDataUtils", "downRemindClick is fast click");
                } else {
                    dem.b().a(str);
                }
            }
        });
    }

    public static boolean e() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RqDataUtils");
        if (deviceInfo == null) {
            LogUtil.j("Track_RqDataUtils", "isRunningIndexOptimization deviceInfo is null");
            return true;
        }
        return eey.d(deviceInfo, 299);
    }
}
