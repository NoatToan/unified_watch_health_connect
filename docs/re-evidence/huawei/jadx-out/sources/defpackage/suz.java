package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesInfoManager;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class suz {
    private static int j;
    private static final Map<String, Integer> f = new HashMap<String, Integer>() { // from class: suz.3
        {
            put("entryRun", Integer.valueOf(R.color.colorAccent));
            put("entryWalk", Integer.valueOf(R.color.dynamic_blood_pressure_normal));
            put("entryRide", Integer.valueOf(R.color.quick_entry_bike_color));
            put("entryWarmUpStretch", Integer.valueOf(R.color.colorAccent));
            put("entryFitnessCourse", Integer.valueOf(R.color.colorAccent));
            put("entryHealthHeadline", Integer.valueOf(R.color.colorAccent));
            put("entryMonitoringSleep", Integer.valueOf(R.color.color_selected_manual_sleep));
            put("entryDietLog", Integer.valueOf(R.color.life_diet));
            put("entrySleepMusic", Integer.valueOf(R.color.color_selected_manual_sleep));
            put("entryMindfulnessMeditation", Integer.valueOf(R.color.life_emotion));
            put("entryBreath", Integer.valueOf(R.color.life_emotion));
            put("entryDietaryAnalysis", Integer.valueOf(R.color.life_diet));
            put("entryCustomizedRecipes", Integer.valueOf(R.color.life_diet));
            put("entryHealthCourses", Integer.valueOf(R.color.life_emotion));
            put("entryFamilyDoctor", Integer.valueOf(R.color.life_emotion));
            put("entrySmartFatLoss", Integer.valueOf(R.color.colorAccent));
            put("entrySmartTraining", Integer.valueOf(R.color.colorAccent));
            put("entryHealthAssessment", Integer.valueOf(R.color.life_emotion));
        }
    };
    private static final Map<String, Integer> d = new HashMap<String, Integer>() { // from class: suz.6
        {
            put("entryRun", Integer.valueOf(R.color.colorAccent));
            put("entryWalk", Integer.valueOf(R.color.dynamic_blood_pressure_normal));
            put("entryRide", Integer.valueOf(R.color.quick_entry_bike_color));
            put("entryWarmUpStretch", Integer.valueOf(R.color.colorAccent));
            put("entryHealthHeadline", Integer.valueOf(R.color.colorAccent));
            put("entryMonitoringSleep", Integer.valueOf(R.color.color_selected_manual_sleep));
            put("entryDietLog", Integer.valueOf(R.color.life_diet));
            put("entryFamilyDoctor", Integer.valueOf(R.color.life_emotion));
            put("entryHealthAssessment", Integer.valueOf(R.color.life_emotion));
            put("entryFitnessCourse", Integer.valueOf(R.color.hw_show_benefit_dialog));
            put("entrySleepMusic", Integer.valueOf(R.color.hw_show_benefit_dialog));
            put("entryMindfulnessMeditation", Integer.valueOf(R.color.hw_show_benefit_dialog));
            put("entryBreath", Integer.valueOf(R.color.hw_show_benefit_dialog));
            put("entryDietaryAnalysis", Integer.valueOf(R.color.hw_show_benefit_dialog));
            put("entryCustomizedRecipes", Integer.valueOf(R.color.hw_show_benefit_dialog));
            put("entryHealthCourses", Integer.valueOf(R.color.hw_show_benefit_dialog));
            put("entrySmartFatLoss", Integer.valueOf(R.color.hw_show_benefit_dialog));
            put("entrySmartTraining", Integer.valueOf(R.color.hw_show_benefit_dialog));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Integer> f48722b = new HashMap<String, Integer>() { // from class: suz.8
        {
            put("entryRun", Integer.valueOf(R.drawable.quick_entry_run));
            put("entryWalk", Integer.valueOf(R.drawable.quick_entry_walk));
            put("entryRide", Integer.valueOf(R.drawable.quick_entry_bike));
            put("entryWarmUpStretch", Integer.valueOf(R.drawable.quick_entry_warm_up_stretch));
            put("entryHealthHeadline", Integer.valueOf(R.drawable.quick_entry_health_headline));
            put("entryMonitoringSleep", Integer.valueOf(R.drawable.quick_entry_monitor_sleep));
            put("entryDietLog", Integer.valueOf(R.drawable.quick_entry_record_diet));
            put("entryFamilyDoctor", Integer.valueOf(R.drawable.quick_entry_family_doctor));
            put("entryHealthAssessment", Integer.valueOf(R.drawable.quick_entry_health_assessment));
            put("entryFitnessCourse", Integer.valueOf(R.drawable.quick_entry_fitness_course_vip));
            put("entrySleepMusic", Integer.valueOf(R.drawable.quick_entry_sleep_aiding_music_vip));
            put("entryMindfulnessMeditation", Integer.valueOf(R.drawable.quick_entry_mindfulness_meditation_vip));
            put("entryBreath", Integer.valueOf(R.drawable.quick_entry_breathing_training_vip));
            put("entryDietaryAnalysis", Integer.valueOf(R.drawable.quick_entry_dietary_analysis_vip));
            put("entryCustomizedRecipes", Integer.valueOf(R.drawable.quick_entry_customized_recipes_vip));
            put("entryHealthCourses", Integer.valueOf(R.drawable.quick_entry_health_courses_vip));
            put("entrySmartFatLoss", Integer.valueOf(R.drawable.quick_entry_smart_fat_loss_vip));
            put("entrySmartTraining", Integer.valueOf(R.drawable.quick_entry_smart_training_vip));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f48721a = new HashMap<String, Integer>() { // from class: suz.7
        {
            put("entryRun", Integer.valueOf(R.drawable.quick_entry_run));
            put("entryWalk", Integer.valueOf(R.drawable.quick_entry_walk));
            put("entryRide", Integer.valueOf(R.drawable.quick_entry_bike));
            put("entryWarmUpStretch", Integer.valueOf(R.drawable.quick_entry_warm_up_stretch));
            put("entryHealthHeadline", Integer.valueOf(R.drawable.quick_entry_health_headline));
            put("entryMonitoringSleep", Integer.valueOf(R.drawable.quick_entry_monitor_sleep));
            put("entryDietLog", Integer.valueOf(R.drawable.quick_entry_record_diet));
            put("entryFamilyDoctor", Integer.valueOf(R.drawable.quick_entry_family_doctor));
            put("entryHealthAssessment", Integer.valueOf(R.drawable.quick_entry_health_assessment));
            put("entryFitnessCourse", Integer.valueOf(R.drawable.quick_entry_fitness_course));
            put("entrySleepMusic", Integer.valueOf(R.drawable.quick_entry_sleep_aiding_music));
            put("entryMindfulnessMeditation", Integer.valueOf(R.drawable.quick_entry_mindfulness_meditation));
            put("entryBreath", Integer.valueOf(R.drawable.quick_entry_breathing_training));
            put("entryDietaryAnalysis", Integer.valueOf(R.drawable.quick_entry_dietary_analysis));
            put("entryCustomizedRecipes", Integer.valueOf(R.drawable.quick_entry_customized_recipes));
            put("entryHealthCourses", Integer.valueOf(R.drawable.quick_entry_health_courses));
            put("entrySmartFatLoss", Integer.valueOf(R.drawable.quick_entry_smart_fat_loss));
            put("entrySmartTraining", Integer.valueOf(R.drawable.quick_entry_smart_training));
        }
    };
    private static final Map<String, Integer> e = new HashMap<String, Integer>() { // from class: suz.9
        {
            put("entryRun", Integer.valueOf(R.string.IDS_quick_entry_start_run));
            put("entryWalk", Integer.valueOf(R.string.IDS_quick_entry_start_walk));
            put("entryRide", Integer.valueOf(R.string.IDS_quick_entry_start_ride));
            put("entryWarmUpStretch", Integer.valueOf(R.string.IDS_quick_entry_warm_up_stretch));
            put("entryHealthHeadline", Integer.valueOf(R.string.IDS_quick_entry_health_headline));
            put("entryMonitoringSleep", Integer.valueOf(R.string.IDS_quick_entry_monitor_sleep));
            put("entryDietLog", Integer.valueOf(R.string.IDS_quick_entry_diet_record));
            put("entryFamilyDoctor", Integer.valueOf(R.string.IDS_quick_entry_family_doctor));
            put("entryHealthAssessment", Integer.valueOf(R.string.IDS_quick_entry_health_assessment));
            put("entryFitnessCourse", Integer.valueOf(R.string.IDS_quick_entry_fitness_course));
            put("entrySleepMusic", Integer.valueOf(R.string.IDS_quick_entry_sleep_aiding_music));
            put("entryMindfulnessMeditation", Integer.valueOf(R.string.IDS_quick_entry_mindfulness_meditation));
            put("entryBreath", Integer.valueOf(R.string.IDS_quick_entry_breathing_training));
            put("entryDietaryAnalysis", Integer.valueOf(R.string.IDS_quick_entry_dietary_analysis));
            put("entryCustomizedRecipes", Integer.valueOf(R.string.IDS_quick_entry_customized_recipes));
            put("entryHealthCourses", Integer.valueOf(R.string.IDS_quick_entry_health_courses));
            put("entrySmartFatLoss", Integer.valueOf(R.string.IDS_quick_entry_smart_fat_loss));
            put("entrySmartTraining", Integer.valueOf(R.string.IDS_quick_entry_smart_training));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f48723c = new HashMap<String, Integer>() { // from class: suz.14
        {
            put("entryRun", Integer.valueOf(R.string.IDS_quick_entry_start_run));
            put("entryWalk", Integer.valueOf(R.string.IDS_quick_entry_start_walk));
            put("entryRide", Integer.valueOf(R.string.IDS_quick_entry_start_ride));
            put("entryWarmUpStretch", Integer.valueOf(R.string.IDS_quick_entry_warm_up_stretch));
            put("entryHealthHeadline", Integer.valueOf(R.string.IDS_quick_entry_health_headline));
            put("entryMonitoringSleep", Integer.valueOf(R.string.IDS_quick_entry_sleep_monitor));
            put("entryDietLog", Integer.valueOf(R.string.IDS_quick_entry_record_diet));
            put("entryFamilyDoctor", Integer.valueOf(R.string.IDS_quick_entry_family_doctor));
            put("entryHealthAssessment", Integer.valueOf(R.string.IDS_quick_entry_health_assessment));
            put("entryFitnessCourse", Integer.valueOf(R.string.IDS_quick_entry_fitness_course));
            put("entrySleepMusic", Integer.valueOf(R.string.IDS_quick_entry_sleep_aiding_music));
            put("entryMindfulnessMeditation", Integer.valueOf(R.string.IDS_quick_entry_mindfulness_meditation));
            put("entryBreath", Integer.valueOf(R.string.IDS_quick_entry_breathing_training));
            put("entryDietaryAnalysis", Integer.valueOf(R.string.IDS_quick_entry_dietary_analysis));
            put("entryCustomizedRecipes", Integer.valueOf(R.string.IDS_quick_entry_customized_recipes));
            put("entryHealthCourses", Integer.valueOf(R.string.IDS_quick_entry_health_courses));
            put("entrySmartFatLoss", Integer.valueOf(R.string.IDS_quick_entry_smart_fat_loss));
            put("entrySmartTraining", Integer.valueOf(R.string.IDS_quick_entry_smart_training));
        }
    };

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public static void d(final List<ezg> list, ResponseCallback<ezg> responseCallback) {
        final boolean z;
        if (njy.e(list)) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "getQuickEntry quickEntryList is empty");
            return;
        }
        UserMemberInfo userMemberInfoA = irz.a();
        if (userMemberInfoA != null) {
            z = userMemberInfoA.getMemberFlag() == 1 && !irz.d(userMemberInfoA);
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        list.forEach(new Consumer() { // from class: svf
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                suz.c(list, z, atomicInteger, (ezg) obj);
            }
        });
        if (list.size() > 2) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "getQuickEntry quickEntryList is large 2");
            return;
        }
        for (ezg ezgVar : list) {
            if (ezgVar != null && (list.size() != 2 || Objects.equals(ezgVar.d(), "entryHealthHeadline"))) {
                m(ezgVar, responseCallback);
            }
        }
    }

    static /* synthetic */ void c(List list, boolean z, AtomicInteger atomicInteger, ezg ezgVar) {
        Integer num;
        Integer num2;
        Integer orDefault;
        if (list.size() == 1) {
            num = e.get(ezgVar.d());
            if (z) {
                num2 = d.get(ezgVar.d());
            } else {
                num2 = f.get(ezgVar.d());
            }
        } else {
            num = f48723c.get(ezgVar.d());
            num2 = null;
        }
        String strF = num != null ? qre.f(num.intValue()) : "";
        SpannableString spannableString = new SpannableString(strF);
        if (num2 != null) {
            qri.b(spannableString, strF, num2.intValue());
        }
        ezgVar.d(spannableString);
        if (z) {
            orDefault = f48722b.getOrDefault(ezgVar.d(), Integer.valueOf(ezgVar.a()));
        } else {
            orDefault = f48721a.getOrDefault(ezgVar.d(), Integer.valueOf(ezgVar.a()));
        }
        if (orDefault != null) {
            ezgVar.a(orDefault.intValue());
        }
        ezgVar.b(atomicInteger.incrementAndGet());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    private static void m(ezg ezgVar, ResponseCallback<ezg> responseCallback) {
        String strD = ezgVar.d();
        strD.hashCode();
        switch (strD) {
            case "entryRun":
                o(ezgVar, responseCallback);
                break;
            case "entryDietaryAnalysis":
                a(ezgVar, responseCallback);
                break;
            case "entryDietLog":
                d(ezgVar, responseCallback);
                break;
            case "entrySleepMusic":
                b("1001", ezgVar, responseCallback);
                break;
            case "entryHealthCourses":
                b("1005", ezgVar, responseCallback);
                break;
            case "entryRide":
                l(ezgVar, responseCallback);
                break;
            case "entryWalk":
                n(ezgVar, responseCallback);
                break;
            case "entryMindfulnessMeditation":
                b(FaqConstants.CHANNEL_HICARE, ezgVar, responseCallback);
                break;
            case "entryWarmUpStretch":
                b("1006", ezgVar, responseCallback);
                break;
            case "entryHealthHeadline":
                j(ezgVar, responseCallback);
                break;
            case "entryHealthAssessment":
                h(ezgVar, responseCallback);
                break;
            case "entryFitnessCourse":
                b(ResultCode.ERROR_TS_TIMEOUT, ezgVar, responseCallback);
                break;
            case "entryMonitoringSleep":
                f(ezgVar, responseCallback);
                break;
            case "entryFamilyDoctor":
                i(ezgVar, responseCallback);
                break;
            default:
                g(ezgVar, responseCallback);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    private static void g(ezg ezgVar, ResponseCallback<ezg> responseCallback) {
        byte b2;
        String strD = ezgVar.d();
        strD.hashCode();
        switch (strD) {
            case "entryBreath":
                b2 = 0;
                break;
            case "entryCustomizedRecipes":
                b2 = 1;
                break;
            case "entrySmartFatLoss":
                b2 = 2;
                break;
            case "entrySmartTraining":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            b(BleConstants.CODE_AUTHORIZED_FAIL, ezgVar, responseCallback);
            return;
        }
        if (b2 == 1) {
            e(ezgVar, responseCallback);
        } else if (b2 == 2) {
            c(ezgVar, responseCallback);
        } else {
            if (b2 != 3) {
                return;
            }
            k(ezgVar, responseCallback);
        }
    }

    private static void o(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        b(new int[]{258, 264, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 227}, (ResponseCallback<Float>) new ResponseCallback() { // from class: svd
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                suz.c(ezgVar, responseCallback, i, (Float) obj);
            }
        });
    }

    static /* synthetic */ void c(ezg ezgVar, ResponseCallback responseCallback, int i, Float f2) {
        if (ezgVar != null) {
            ezgVar.e((CharSequence) qre.a(R.string.IDS_quick_entry_has_run_today, a(f2.floatValue())));
            ezgVar.d(f2.floatValue() > 0.0f);
        }
        if (responseCallback != null) {
            responseCallback.onResponse(i, ezgVar);
        }
    }

    private static void n(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        b(new int[]{281, 257, 282}, (ResponseCallback<Float>) new ResponseCallback() { // from class: svj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                suz.e(ezgVar, responseCallback, i, (Float) obj);
            }
        });
    }

    static /* synthetic */ void e(ezg ezgVar, ResponseCallback responseCallback, int i, Float f2) {
        if (ezgVar != null) {
            ezgVar.e((CharSequence) qre.a(R.string.IDS_quick_entry_has_walk_today, a(f2.floatValue())));
            ezgVar.d(f2.floatValue() > 0.0f);
        }
        if (responseCallback != null) {
            responseCallback.onResponse(i, ezgVar);
        }
    }

    private static void l(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        b(new int[]{259, OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE}, (ResponseCallback<Float>) new ResponseCallback() { // from class: svk
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                suz.b(ezgVar, responseCallback, i, (Float) obj);
            }
        });
    }

    static /* synthetic */ void b(ezg ezgVar, ResponseCallback responseCallback, int i, Float f2) {
        if (ezgVar != null) {
            ezgVar.e((CharSequence) qre.a(R.string.IDS_quick_entry_has_ride_today, a(f2.floatValue())));
            ezgVar.d(f2.floatValue() > 0.0f);
        }
        if (responseCallback != null) {
            responseCallback.onResponse(i, ezgVar);
        }
    }

    private static String a(float f2) {
        double dE = ((double) f2) / 1000.0d;
        int i = R.plurals.IDS_indoor_run_km;
        if (UnitUtil.f()) {
            dE = UnitUtil.e(dE, 3);
            i = R.plurals.IDS_indoor_run_mi;
        }
        return qre.e(i, (int) dE, UnitUtil.e(dE, 1, 2));
    }

    private static void b(int[] iArr, final ResponseCallback<Float> responseCallback) {
        long jR = lsl.r(System.currentTimeMillis());
        long jC = lsl.c(System.currentTimeMillis());
        LogUtil.a("Suggestion_QuickEntryConfigMore", "getSportRecords startTime:", Long.valueOf(jR), " endTime:", Long.valueOf(jC));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jR, jC);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: suz.13
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                boolean z = obj instanceof SparseArray;
                Float fValueOf = Float.valueOf(0.0f);
                if (!z) {
                    LogUtil.j("Suggestion_QuickEntryConfigMore", "getSportRecords instanceof SparseArray is false");
                    responseCallback.onResponse(-1, fValueOf);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (!(sparseArray.get(i) instanceof List)) {
                    LogUtil.j("Suggestion_QuickEntryConfigMore", "getSportRecords instanceof List is false");
                    responseCallback.onResponse(-1, fValueOf);
                    return;
                }
                List list = (List) sparseArray.get(i);
                if (!njy.e(list)) {
                    responseCallback.onResponse(0, Float.valueOf(suz.b((List<HiHealthData>) list)));
                } else {
                    LogUtil.j("Suggestion_QuickEntryConfigMore", "getSportRecords healthDataList empty");
                    responseCallback.onResponse(-1, fValueOf);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float b(List<HiHealthData> list) {
        HiTrackMetaData hiTrackMetaData;
        float totalDistance = 0.0f;
        if (njy.e(list)) {
            return 0.0f;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (hiTrackMetaData = (HiTrackMetaData) qqt.e(hiHealthData.getMetaData(), HiTrackMetaData.class)) != null && hiTrackMetaData.getSportDataSource() != 2) {
                if (hiTrackMetaData.getAbnormalTrack() != 0) {
                    LogUtil.j("Suggestion_QuickEntryConfigMore", "getSportRecords abnormalTrack:", Integer.valueOf(hiTrackMetaData.getAbnormalTrack()));
                } else {
                    LogUtil.a("Suggestion_QuickEntryConfigMore", "getSportRecords hiTrackMetaData:", hiTrackMetaData.toString());
                    totalDistance += hiTrackMetaData.getTotalDistance();
                }
            }
        }
        return totalDistance;
    }

    private static void h(ezg ezgVar, ResponseCallback<ezg> responseCallback) {
        if (ezgVar != null) {
            ezgVar.e((CharSequence) qre.f(R.string.IDS_quick_entry_health_status));
        }
        responseCallback.onResponse(0, ezgVar);
    }

    private static void i(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        if (ezgVar != null) {
            int i = j + 1;
            j = i;
            ezgVar.e((CharSequence) (i % 2 == 0 ? qre.f(R.string.IDS_quick_entry_quick_inquiry) : qre.f(R.string.IDS_quick_entry_online_consultation)));
            ezgVar.d(false);
        }
        ugs.e().getDoctorImInfo(new DataCallback() { // from class: suz.12
            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onFailure(int i2, String str) {
                LogUtil.e("Suggestion_QuickEntryConfigMore", "getDoctorImInfo errorCode:", Integer.valueOf(i2), ",errorInfo:", str);
                responseCallback.onResponse(-1, ezgVar);
            }

            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("Suggestion_QuickEntryConfigMore", "getDoctorImInfo:", jSONObject == null ? "" : jSONObject.toString());
                if (jSONObject == null || jSONObject.optInt("resultCode") != 0) {
                    responseCallback.onResponse(0, ezgVar);
                    return;
                }
                int iOptInt = jSONObject.optInt("unReadMsgCount");
                if (ezgVar != null && iOptInt > 0) {
                    ezgVar.e((CharSequence) qre.e(R.plurals.IDS_quick_entry_family_doctor_message, iOptInt, UnitUtil.e(iOptInt, 1, 0)));
                    ezgVar.d(true);
                }
                responseCallback.onResponse(0, ezgVar);
            }
        });
    }

    public static void c(String str, int i) {
        LogUtil.a("Suggestion_QuickEntryConfigMore", "gotoSeriesCourseH5 seriesCourseId ", str, " type ", Integer.valueOf(i));
        ddv.b().initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("mediaCenter", ddv.b().getCommonJsModule("mediaCenter")).addCustomizeJsModule("course", ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).getCourseDetailH5Bridge()).enableOnPauseCallback().setImmerse().showStatusBar().setStatusBarTextBlack(true).addPath("#/seriesCourse?id=" + str + "&type=" + i).setForceDarkMode(1).build();
        SeriesCourseH5Repository.registerService();
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.sleeping-music", h5ProLaunchOptionBuild);
        btq.e().e("COLLECTION_ADD");
    }

    private static void b(String str, ezg ezgVar, ResponseCallback<ezg> responseCallback) {
        b(ezgVar, R.string.IDS_quick_entry_no_data, R.color.common_black_20alpha);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "getRecommendResource courseApi is null");
            responseCallback.onResponse(-1, ezgVar);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            courseApi.getRecommendResource(arrayList, new AnonymousClass11(responseCallback, ezgVar, str));
        }
    }

    /* JADX INFO: renamed from: suz$11, reason: invalid class name */
    class AnonymousClass11 extends UiCallback<pcn> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResponseCallback f48727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f48728c;
        final /* synthetic */ ezg e;

        AnonymousClass11(ResponseCallback responseCallback, ezg ezgVar, String str) {
            this.f48727b = responseCallback;
            this.e = ezgVar;
            this.f48728c = str;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_QuickEntryConfigMore", "getRecommendResource errorCode:", Integer.valueOf(i), " errorInfo:", str);
            this.f48727b.onResponse(-1, this.e);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(pcn pcnVar) {
            ezg ezgVar;
            if (pcnVar == null || njy.e(pcnVar.e())) {
                ReleaseLogUtil.e("Suggestion_QuickEntryConfigMore", "getRecommendResourceList is empty!");
                this.f48727b.onResponse(-1, this.e);
                return;
            }
            final pcn.a aVar = pcnVar.e().get(0);
            if (aVar != null && (ezgVar = this.e) != null) {
                ezgVar.e((CharSequence) aVar.a());
                this.e.e(aVar.b());
                final ezg ezgVar2 = this.e;
                final String str = this.f48728c;
                ezgVar2.c(new View.OnClickListener() { // from class: svi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        suz.d(view.getContext(), str, aVar.e(), ezgVar2);
                    }
                });
            }
            this.f48727b.onResponse(0, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, String str, String str2, ezg ezgVar) {
        if (BleConstants.CODE_AUTHORIZED_FAIL.equals(str)) {
            a(str2);
        } else if ("1001".equals(str)) {
            ddv.b().startOperationWebPage(context, "com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&statusBarTextBlack&isImmerse&id=" + str2 + "&type=sleepAudio");
        } else if (FaqConstants.CHANNEL_HICARE.equals(str)) {
            ddv.b().startOperationWebPage(context, "com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&statusBarTextBlack&isImmerse&id=" + str2 + "&type=decompressAudio");
        } else if ("1006".equals(str) || ResultCode.ERROR_TS_TIMEOUT.equals(str)) {
            c(context, str2);
        } else if ("1005".equals(str)) {
            c(str2, 2);
        }
        sus.e(1, "f3", ezgVar);
    }

    private static void c(final Context context, final String str) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "requestCourseList : courseApi is null.");
        } else {
            courseApi.getCourseById(new gzl.a(str).a(false).c(), new UiCallback<Workout>() { // from class: suz.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.j("Suggestion_QuickEntryConfigMore", "getCourseById fail,", str2, " workoutId:", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Workout workout) {
                    LogUtil.a("Suggestion_QuickEntryConfigMore", "getCourseById onSuccess id:", str);
                    pea.a(context, pea.d(workout));
                }
            });
        }
    }

    private static void a(String str) {
        String strEncode;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "id is empty");
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "marketRouterApi == null");
            return;
        }
        try {
            strEncode = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            LogUtil.e("Suggestion_QuickEntryConfigMore", "gotoBreathTrainH5 Exception ", LogAnonymous.b(e2));
            strEncode = "";
        }
        marketRouterApi.router("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.breath-training?h5pro=true&urlType=4&pName=com.huawei.health&statusBarTextBlack&isImmerse&path=trainPage&trainModeId=" + strEncode);
    }

    private static void j(final ezg ezgVar, ResponseCallback<ezg> responseCallback) {
        b(ezgVar, R.string.IDS_quick_entry_no_data, R.color.common_black_20alpha);
        final gdy gdyVarJ = smp.b().j();
        if (smp.b().q() == 3 && ezgVar != null && gdyVarJ != null) {
            ezgVar.e((CharSequence) gdyVarJ.o());
            ezgVar.e(gdyVarJ.g());
            ezgVar.e(true);
            ezgVar.c(new View.OnClickListener() { // from class: svh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gdy gdyVar = gdyVarJ;
                    suz.d(gdyVar.h(), gdyVar.d(), ezgVar);
                }
            });
            if (responseCallback != null) {
                responseCallback.onResponse(0, ezgVar);
                return;
            }
            return;
        }
        HealthHeadLinesInfoManager healthHeadLinesInfoManagerD = HealthHeadLinesInfoManager.d();
        if (healthHeadLinesInfoManagerD == null) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "getHealthHeadlineEntry infoManager is null");
            responseCallback.onResponse(-1, ezgVar);
        } else {
            healthHeadLinesInfoManagerD.j(new AnonymousClass5(ezgVar, responseCallback));
        }
    }

    /* JADX INFO: renamed from: suz$5, reason: invalid class name */
    class AnonymousClass5 extends UiCallback<List<snk>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ezg f48731a;
        final /* synthetic */ ResponseCallback d;

        AnonymousClass5(ezg ezgVar, ResponseCallback responseCallback) {
            this.f48731a = ezgVar;
            this.d = responseCallback;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_QuickEntryConfigMore", "getHealthHeadlineEntry errorCode:", Integer.valueOf(i), " errorInfo:", str);
            suz.r(this.f48731a, this.d);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<snk> list) {
            if (njy.e(list)) {
                ReleaseLogUtil.e("Suggestion_QuickEntryConfigMore", "getHealthHeadlineEntry audioWorkoutDetails is empty!");
                suz.r(this.f48731a, this.d);
                return;
            }
            LogUtil.a("Suggestion_QuickEntryConfigMore", "getHealthHeadlineEntry audioWorkoutDetails: ", list);
            list.sort(new Comparator() { // from class: svg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((snk) obj2).e(), ((snk) obj).e());
                }
            });
            suz.d(this.f48731a, list.get(0));
            ResponseCallback responseCallback = this.d;
            if (responseCallback != null) {
                responseCallback.onResponse(0, this.f48731a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HealthHeadLinesInfoManager.d().b(new UiCallback<List<snn>>() { // from class: suz.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_QuickEntryConfigMore", "getWorkoutListHistory errorCode:", Integer.valueOf(i), ",errorInfo:", str);
                responseCallback.onResponse(-1, ezgVar);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<snn> list) {
                if (!njy.e(list)) {
                    suz.d(ezgVar, suz.c(list));
                    ResponseCallback responseCallback2 = responseCallback;
                    if (responseCallback2 != null) {
                        responseCallback2.onResponse(0, ezgVar);
                        return;
                    }
                    return;
                }
                ReleaseLogUtil.e("Suggestion_QuickEntryConfigMore", "getWorkoutListHistory data is empty!");
                responseCallback.onResponse(-1, ezgVar);
            }
        }, lsl.c(jCurrentTimeMillis, -29), lsl.c(jCurrentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static snk c(List<snn> list) {
        if (njy.e(list)) {
            return null;
        }
        list.sort(new Comparator() { // from class: sva
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return suz.e((snn) obj, (snn) obj2);
            }
        });
        if (list.get(0) != null) {
            return list.get(0).d();
        }
        return null;
    }

    static /* synthetic */ int e(snn snnVar, snn snnVar2) {
        if (snnVar == null || snnVar2 == null || TextUtils.isEmpty(snnVar.a()) || TextUtils.isEmpty(snnVar2.a())) {
            return 0;
        }
        try {
            return Long.compare(DateFormatUtil.d(snnVar2.a(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD).getTime(), DateFormatUtil.d(snnVar.a(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD).getTime());
        } catch (ParseException unused) {
            LogUtil.e("Suggestion_QuickEntryConfigMore", "Covert Time Format Exception");
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final ezg ezgVar, final snk snkVar) {
        if (ezgVar == null || snkVar == null) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "quickEntryBean or audioWorkoutDetail is null");
            return;
        }
        ezgVar.e((CharSequence) (snkVar.d() != null ? snkVar.d().e() : ""));
        ezgVar.e(snkVar.k() != null ? snkVar.k().a() : "");
        ezgVar.e(false);
        ezgVar.c(new View.OnClickListener() { // from class: sve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                snk snkVar2 = snkVar;
                suz.d(snkVar2.d() != null ? snkVar2.d().c() : "", snkVar2.c() != null ? snkVar2.c().e() : "", ezgVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, String str2, ezg ezgVar) {
        String strEncode;
        sus.e(1, "f3", ezgVar);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "workoutId or onlineDate is empty");
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "marketRouterApi == null");
            return;
        }
        try {
            strEncode = URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            LogUtil.e("Suggestion_QuickEntryConfigMore", "goHealthHeadlineH5 Exception ", LogAnonymous.b(e2));
            strEncode = "";
        }
        marketRouterApi.router(String.format("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-headlines?h5pro=true&urlType=4&pName=com.huawei.health&isImmerse&time=%s&type=2&workoutId=%s&enterPosition=2&path=audio-detail&clickPosition=null", strEncode, str));
    }

    private static void f(ezg ezgVar, ResponseCallback<ezg> responseCallback) {
        if (ezgVar != null) {
            ezgVar.e((CharSequence) qre.f(R.string.IDS_quick_entry_good_sleep));
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "SLEEP_RECORD_ALARM_INFO");
        LogUtil.a("Suggestion_QuickEntryConfigMore", "getMonitoringSleepEntry alarmInfo: ", strE);
        gwd gwdVar = !TextUtils.isEmpty(strE) ? (gwd) HiJsonUtil.d(strE, gwd.class) : null;
        if (gwdVar != null && gwdVar.h() && gwdVar.o() && ezgVar != null) {
            int sleepTime = pjo.b().getSleepTime();
            ezgVar.e((CharSequence) qre.a(R.string.IDS_quick_entry_plan_sleep, DateFormatUtil.a(lsl.a(System.currentTimeMillis(), sleepTime / 60, sleepTime % 60), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE)));
        }
        responseCallback.onResponse(0, ezgVar);
    }

    private static void d(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ReleaseLogUtil.d("Suggestion_QuickEntryConfigMore", "getDietLogEntry dayFormat ", Integer.valueOf(iA));
        iun.c(iA, iA, new ResponseCallback() { // from class: svc
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                suz.d(ezgVar, responseCallback, i, (List) obj);
            }
        });
    }

    static /* synthetic */ void d(ezg ezgVar, ResponseCallback responseCallback, int i, List list) {
        LogUtil.a("Suggestion_QuickEntryConfigMore", "getDietLogEntry errorCode ", Integer.valueOf(i), " list ", list);
        vgo vgoVar = njy.e(list) ? null : (vgo) list.get(0);
        int iRound = vgoVar == null ? 0 : Math.round(vgoVar.d().h());
        String strA = qre.a(R.string.IDS_has_intake_calories, qre.e(R.plurals.IDS_kcalories_unit, iRound, Integer.valueOf(iRound)));
        if (ezgVar != null) {
            ezgVar.e((CharSequence) strA);
            ezgVar.d(iRound > 0);
        }
        responseCallback.onResponse(0, ezgVar);
    }

    private static void a(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        if (ezgVar != null) {
            ezgVar.e((CharSequence) qre.f(R.string.IDS_quick_entry_dietary_record));
        }
        if (!irz.i()) {
            responseCallback.onResponse(0, ezgVar);
            return;
        }
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ReleaseLogUtil.d("Suggestion_QuickEntryConfigMore", "getDietaryAnalysisEntry dayFormat ", Integer.valueOf(iA));
        iun.c(iA, iA, new ResponseCallback() { // from class: svb
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                suz.c(ezgVar, responseCallback, i, (List) obj);
            }
        });
    }

    static /* synthetic */ void c(ezg ezgVar, ResponseCallback responseCallback, int i, List list) {
        LogUtil.a("Suggestion_QuickEntryConfigMore", "getDietaryAnalysisEntry errorCode ", Integer.valueOf(i), " list ", list);
        vgo vgoVar = njy.e(list) ? null : (vgo) list.get(0);
        List<vgw> arrayList = vgoVar == null ? new ArrayList<>() : vgoVar.a();
        String strF = qre.f(R.string.IDS_quick_entry_dietary_record);
        for (vgw vgwVar : arrayList) {
            if (vgwVar != null && njy.b(vgwVar.c())) {
                strF = qre.f(R.string.IDS_quick_entry_dietary_report);
                break;
            }
        }
        if (ezgVar != null) {
            ezgVar.e((CharSequence) strF);
        }
        responseCallback.onResponse(0, ezgVar);
    }

    private static void e(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        if (ezgVar != null) {
            ezgVar.e((CharSequence) qre.f(R.string.IDS_quick_entry_recipes_plan));
        }
        if (!irz.i()) {
            responseCallback.onResponse(0, ezgVar);
        } else {
            xkb.c("900300069", new ResponseCallback() { // from class: sux
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    suz.d(ezgVar, responseCallback, i, (Pair) obj);
                }
            });
        }
    }

    static /* synthetic */ void d(ezg ezgVar, ResponseCallback responseCallback, int i, Pair pair) {
        LogUtil.a("Suggestion_QuickEntryConfigMore", "getNutritionManagement errorCode ", Integer.valueOf(i), " pair ", pair);
        String str = pair != null ? (String) pair.second : "";
        hdg hdgVar = TextUtils.isEmpty(str) ? null : (hdg) HiJsonUtil.d(str, hdg.class);
        if (ezgVar != null && hdgVar != null && (hdgVar.c() != 0 || hdgVar.d() != 0 || hdgVar.e() != 0)) {
            ezgVar.e((CharSequence) qre.f(R.string.IDS_quick_entry_recipes_generated));
        }
        responseCallback.onResponse(0, ezgVar);
    }

    private static void k(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "getSmartTrainingEntry intPlanApi is null.");
            responseCallback.onResponse(-1, ezgVar);
        } else {
            planApi.getCurrentPlan(new UiCallback<qey>() { // from class: suz.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_QuickEntryConfigMore", "getSmartTrainingEntry errorCode:", i + ",errorInfo:", str);
                    responseCallback.onResponse(-1, ezgVar);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(qey qeyVar) {
                    String strA = suz.a(qeyVar);
                    if (ezgVar != null && !TextUtils.isEmpty(strA)) {
                        ezgVar.e((CharSequence) strA);
                    }
                    responseCallback.onResponse(0, ezgVar);
                }
            });
        }
    }

    private static String b(qey qeyVar) {
        if (btw.d(qeyVar) && qeyVar.o() == 1) {
            return qre.f(R.string.IDS_quick_entry_plan_start);
        }
        UserMemberInfo userMemberInfoA = irz.a();
        if (irz.d(userMemberInfoA)) {
            return qre.f(R.string.IDS_quick_entry_vip_expired);
        }
        if (userMemberInfoA == null || userMemberInfoA.getMemberFlag() != 1) {
            return qre.f(R.string.IDS_quick_entry_plan_personal);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(qey qeyVar) {
        String strB = b(qeyVar);
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        if (!btw.d(qeyVar)) {
            return qre.f(R.string.IDS_quick_entry_no_plan);
        }
        int iA = lsl.a(DateFormatUtil.d(qeyVar.i()), System.currentTimeMillis());
        if (iA < 1) {
            return qre.f(R.string.IDS_quick_entry_plan_not_start);
        }
        if (e(qeyVar)) {
            return qre.f(R.string.IDS_quick_entry_plan_competition_day);
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (qfy qfyVar : njy.e(qeyVar.n()) ? new ArrayList<>() : qeyVar.n()) {
            if (!njy.e(qfyVar.n())) {
                for (qfk qfkVar : qfyVar.n()) {
                    if (lsl.c(DateFormatUtil.d(qfkVar.s()), System.currentTimeMillis())) {
                        boolean z4 = planApi != null && planApi.getCompletionStatus(qfkVar.y()) == 1;
                        z = z && z4;
                        z3 = z3 || z4;
                        z2 = true;
                    }
                }
            }
        }
        String strE = qre.e(R.plurals.IDS_physiology_day_num, iA, Integer.valueOf(iA));
        if (!z2) {
            return qre.a(R.string.IDS_quick_entry_plan_rest_day, strE);
        }
        if (z) {
            return qre.a(R.string.IDS_quick_entry_plan_clocked, strE);
        }
        if (z3) {
            return qre.a(R.string.IDS_quick_entry_plan_partial_clocked, strE);
        }
        return qre.a(R.string.IDS_quick_entry_plan_not_clocked, strE);
    }

    private static boolean e(qey qeyVar) {
        List<gnf.e> arrayList;
        gnm gnmVar = (gnm) HiJsonUtil.d(qeyVar.a(), gnm.class);
        if (gnmVar == null || njy.e(gnmVar.a())) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = gnmVar.a();
        }
        for (gnf.e eVar : arrayList) {
            if (eVar != null && lsl.c(eVar.d(), System.currentTimeMillis())) {
                return true;
            }
        }
        return false;
    }

    public static void c(final ezg ezgVar, final ResponseCallback<ezg> responseCallback) {
        if (ezgVar != null) {
            UserMemberInfo userMemberInfoA = irz.a();
            if (irz.d(userMemberInfoA)) {
                ezgVar.e((CharSequence) qre.f(R.string.IDS_quick_entry_vip_expired));
                responseCallback.onResponse(0, ezgVar);
                return;
            } else {
                if (userMemberInfoA == null || userMemberInfoA.getMemberFlag() != 1) {
                    ezgVar.e((CharSequence) qre.f(R.string.IDS_quick_entry_smart_balancing_diet));
                    responseCallback.onResponse(0, ezgVar);
                    return;
                }
                ezgVar.e((CharSequence) qre.f(R.string.IDS_quick_entry_smart_balancing_diet));
            }
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_QuickEntryConfigMore", "getSmartFatLossEntry intPlanApi is null.");
            responseCallback.onResponse(-1, ezgVar);
        } else {
            planApi.getCurrentPlan(new UiCallback<qey>() { // from class: suz.10
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_QuickEntryConfigMore", "getSmartFatLossEntry errorCode:", i + ",errorInfo:", str);
                    responseCallback.onResponse(-1, ezgVar);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(qey qeyVar) {
                    if (!btw.e(qeyVar)) {
                        responseCallback.onResponse(0, ezgVar);
                        return;
                    }
                    int iMax = Math.max(lsl.a(DateFormatUtil.d(qeyVar.i()), System.currentTimeMillis()), 0);
                    String strE = qre.e(R.plurals.IDS_physiology_day_num, iMax, Integer.valueOf(iMax));
                    ezg ezgVar2 = ezgVar;
                    if (ezgVar2 != null) {
                        ezgVar2.e((CharSequence) strE);
                    }
                    responseCallback.onResponse(0, ezgVar);
                }
            });
        }
    }

    private static void b(ezg ezgVar, int i, int i2) {
        if (ezgVar == null) {
            return;
        }
        String strF = qre.f(i);
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        SpannableString spannableString = new SpannableString(strF);
        if (i2 != 0) {
            qri.b(spannableString, strF, i2);
        }
        ezgVar.e(spannableString);
    }
}
