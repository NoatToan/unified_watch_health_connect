package com.huawei.health.provider;

import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.manager.util.UnitUtilExt;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwhealthdatamgr.sportrecordingstrategy.SportsRecordingBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindaemon.R;
import defpackage.lsl;
import defpackage.lua;
import defpackage.njy;
import defpackage.nlo;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HealthFaDataExtendHelper {
    private static final int[] d = {DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_IS_RING.value()};
    private int h;
    private SportsRecordingBean k;
    private String g = "SC_FA_CARD_STEP";
    private int f = -1;
    private int o = 0;
    private int e = 0;
    private int l = -1;
    private boolean i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8631b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8632c = false;
    private final Map<String, Long> j = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f8630a = 0;

    /* JADX INFO: loaded from: classes8.dex */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static HealthFaDataExtendHelper f8635a = new HealthFaDataExtendHelper();
    }

    public static HealthFaDataExtendHelper d() {
        return c.f8635a;
    }

    private void c(int i, double d2) {
        LogUtil.a("HealthFaDataExtendHelper", "updateSceneByStep enter");
        if (i > this.l) {
            if (this.f8631b) {
                f("SC_FA_CARD_MULTI_DAY_COMPLETE_GOAL");
            }
        } else if (this.f8632c) {
            if (i < 3000 && this.i && lsl.e(Calendar.getInstance().getTimeInMillis()) == 2) {
                f("SC_FA_CARD_LOW_STEP");
            } else if (d2 > 60.0d) {
                f(this.f8631b ? "SC_FA_CARD_MULTI_DAY_NOT_COMPLETE_GOAL" : "SC_FA_CARD_TODAY_NOT_COMPLETE_GOAL");
            }
        }
    }

    public void d(Object obj) {
        LogUtil.a("HealthFaDataExtendHelper", "updateSceneByNewSport enter");
        if (obj == null) {
            LogUtil.j("HealthFaDataExtendHelper", "updateSceneByNewSport sportData is null.");
        } else if (obj instanceof SportsRecordingBean) {
            this.k = (SportsRecordingBean) obj;
            f("SC_FA_CARD_NEW_SPORT");
        } else {
            LogUtil.j("HealthFaDataExtendHelper", "updateSceneByNewSport sportData invalid.");
        }
    }

    public void b() {
        LogUtil.a("HealthFaDataExtendHelper", "processScreenOn enter");
        int i = Calendar.getInstance().get(11);
        this.f8632c = i >= 19 && i <= 21;
        if (c(this.f8630a, System.currentTimeMillis()) >= 1) {
            this.j.clear();
            c();
            this.f8630a = System.currentTimeMillis();
        }
    }

    public void c() {
        LogUtil.a("HealthFaDataExtendHelper", "initRecentStepData enter");
        this.f8631b = false;
        this.h = 0;
        this.i = false;
        b(new ResponseCallback() { // from class: grx
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                LogUtil.a("HealthFaDataExtendHelper", "initRecentStepData status:", Integer.valueOf(i));
            }
        });
    }

    public void d(String str) {
        ReleaseLogUtil.c("HealthFaDataExtendHelper", "refreshSceneByUser scene:", str);
        if (!str.equals(this.g)) {
            ReleaseLogUtil.d("HealthFaDataExtendHelper", "refreshSceneByUser not same scene! mLastScene:", this.g, " ,scene:", str);
            return;
        }
        LogUtil.a("HealthFaDataExtendHelper", "refreshSceneByUser mSportTypeIndex:", Integer.valueOf(this.o));
        if (str.equals("SC_FA_CARD_STEP")) {
            int i = this.o + 1;
            this.o = i;
            if (i >= StepStyleSportType.values().length) {
                this.o = 0;
                return;
            }
            return;
        }
        HandlerCenter.a().d(new Runnable() { // from class: gru
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        }, 300L);
    }

    public /* synthetic */ void e() {
        f("SC_FA_CARD_STEP");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(int i, int i2, double d2, JSONObject jSONObject) {
        byte b2;
        this.l = i2;
        b(d2);
        c(i, d2);
        try {
            String str = this.g;
            switch (str.hashCode()) {
                case -1326452421:
                    if (!str.equals("SC_FA_CARD_NEW_SPORT")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case -353114714:
                    if (!str.equals("SC_FA_CARD_STEP")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 173278997:
                    if (!str.equals("SC_FA_CARD_TODAY_NOT_COMPLETE_GOAL")) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                case 497474257:
                    if (!str.equals("SC_FA_CARD_LOW_STEP")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 703329302:
                    if (!str.equals("SC_FA_CARD_MULTI_DAY_COMPLETE_GOAL")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1798871306:
                    if (!str.equals("SC_FA_CARD_MULTI_DAY_NOT_COMPLETE_GOAL")) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                a(jSONObject);
                return;
            }
            if (b2 == 1) {
                d(jSONObject);
                return;
            }
            if (b2 == 2) {
                c(i2, jSONObject);
                return;
            }
            if (b2 == 3) {
                b(i2, jSONObject);
                return;
            }
            if (b2 == 4) {
                b(i, i2, jSONObject);
            } else if (b2 == 5) {
                e(i, i2, jSONObject);
            } else {
                ReleaseLogUtil.d("HealthFaDataExtendHelper", "addExtraData unknown scene mLastScene:", this.g);
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private void f(String str) {
        LogUtil.a("HealthFaDataExtendHelper", "toggleScene newScene:", str);
        int iC = c(c(str), System.currentTimeMillis());
        if (!str.equals("SC_FA_CARD_NEW_SPORT") && !str.equals("SC_FA_CARD_STEP") && iC == 0) {
            LogUtil.j("HealthFaDataExtendHelper", "toggleScene newScene:", str, " ,fail days:", Integer.valueOf(iC));
            return;
        }
        if (b(str) && this.g.equals("SC_FA_CARD_NEW_SPORT")) {
            LogUtil.j("HealthFaDataExtendHelper", "toggleScene newScene low priority,", " mLastScene:", this.g);
            return;
        }
        this.g = str;
        this.f = -1;
        g(str);
        e(this.g);
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("SC_FA_CARD_LOW_STEP") || str.equals("SC_FA_CARD_MULTI_DAY_COMPLETE_GOAL") || str.equals("SC_FA_CARD_MULTI_DAY_NOT_COMPLETE_GOAL") || str.equals("SC_FA_CARD_TODAY_NOT_COMPLETE_GOAL");
    }

    private void b(double d2) {
        if (this.g.equals("SC_FA_CARD_STEP")) {
            return;
        }
        long jC = c(this.g);
        if (System.currentTimeMillis() - jC > 300000) {
            LogUtil.a("HealthFaDataExtendHelper", "refreshSceneExpire scene:", this.g, " ,sceneUpdateTime:", Long.valueOf(jC), " expired,toggle to step scene.");
            f("SC_FA_CARD_STEP");
        }
        if (this.g.equals("SC_FA_CARD_TODAY_NOT_COMPLETE_GOAL")) {
            if (CommonUtil.b(d2 - 100.0d) || d2 > 100.0d) {
                LogUtil.a("HealthFaDataExtendHelper", "refreshSceneExpire scene:", this.g, " ,percent:", Double.valueOf(d2), " expired,toggle to step scene.");
                f("SC_FA_CARD_STEP");
            }
        }
    }

    private long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (this.j.isEmpty() || !this.j.containsKey(str)) {
            a(str);
        }
        Long l = this.j.get(str);
        if (l == null) {
            return 0L;
        }
        LogUtil.a("HealthFaDataExtendHelper", "getSceneUpdateTime sceneShowTime:", l, " ,scene:", str);
        return l.longValue();
    }

    private void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.j.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    private int d(int i) {
        if (this.f < 0) {
            this.f = nlo.b(i);
        }
        LogUtil.a("HealthFaDataExtendHelper", "getSceneTipIndex mLastSceneTipIndex:", Integer.valueOf(this.f), " ,tipCount:", Integer.valueOf(i));
        return this.f;
    }

    private void a(String str) {
        long jD = lua.d("fa_card_sp", str, 0L);
        LogUtil.a("HealthFaDataExtendHelper", "restoreSceneUpdateTimeFromSp sceneSpUpdateTime:", Long.valueOf(jD), " ,scene:", str);
        this.j.put(str, Long.valueOf(jD));
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        lua.a("fa_card_sp", str, System.currentTimeMillis());
    }

    /* JADX INFO: loaded from: classes8.dex */
    public enum StepStyleSportType {
        OUTDOOR_RUN("SPORT_TYPE_OUTDOOR_RUN", R.string.IDS_start_track_sport_type_outdoor_run, "common/figure_running.png"),
        INDOOR_RUN("SPORT_TYPE_INDOOR_RUN", R.string.IDS_start_track_sport_type_indoor_run, "common/figure_run_treadmill.png"),
        OUTDOOR_WALK("SPORT_TYPE_OUTDOOR_WALK", R.string.IDS_start_track_sport_type_outdoor_walk, "common/sun_figure_walk.png"),
        OUTDOOR_CYCLE("SPORT_TYPE_OUTDOOR_CYCLE", R.string.IDS_start_track_sport_type_outdoor_ride, "common/figure_ride.png");

        private final String mButtonIconPath;
        private final int mNameId;
        private final String mSportType;

        StepStyleSportType(String str, int i, String str2) {
            this.mSportType = str;
            this.mNameId = i;
            this.mButtonIconPath = str2;
        }
    }

    private StepStyleSportType a() {
        if (this.o >= StepStyleSportType.values().length) {
            this.o = 0;
        }
        return StepStyleSportType.values()[this.o];
    }

    private void a(JSONObject jSONObject) throws JSONException {
        e(jSONObject);
        StepStyleSportType stepStyleSportTypeA = a();
        jSONObject.put("style_step", true);
        jSONObject.put("scene_id", "SC_FA_CARD_STEP");
        jSONObject.put("sport_type", stepStyleSportTypeA.mSportType);
        jSONObject.put(KnitFragment.KEY_EXTRA, this.o);
        jSONObject.put("medium_layout_phone_background", "common/fa_card_medium_background_step.png");
        jSONObject.put("start_sport_button_text", BaseApplication.b().getResources().getString(stepStyleSportTypeA.mNameId));
        jSONObject.put("start_sport_button_icon", stepStyleSportTypeA.mButtonIconPath);
    }

    private void b(int i, JSONObject jSONObject) throws JSONException {
        e(jSONObject);
        jSONObject.put("style_multi_day_complete", true);
        jSONObject.put("scene_id", "SC_FA_CARD_MULTI_DAY_COMPLETE_GOAL");
        jSONObject.put("medium_layout_phone_background", "common/fa_card_medium_background_multi_day_complete.png");
        jSONObject.put("step_goal", UnitUtilExt.e(BaseApplication.b(), i, 1, 0));
        jSONObject.put("card_content", nlo.e(d(7), this.e + 1));
        boolean zBa = LanguageUtil.ba(BaseApplication.b());
        int i2 = this.e;
        if (i2 == 1) {
            jSONObject.put("complete_progress_icon", zBa ? "common/progress_completed_2day_mirror.png" : "common/progress_completed_2day.png");
        } else if (i2 == 2) {
            jSONObject.put("complete_progress_icon", zBa ? "common/progress_completed_3day_mirror.png" : "common/progress_completed_3day.png");
        } else {
            jSONObject.put("complete_progress_icon", zBa ? "common/progress_completed_4day_mirror.png" : "common/progress_completed_4day.png");
        }
    }

    private void b(int i, int i2, JSONObject jSONObject) throws JSONException {
        e(jSONObject);
        jSONObject.put("style_multi_day_complete", true);
        jSONObject.put("scene_id", "SC_FA_CARD_MULTI_DAY_NOT_COMPLETE_GOAL");
        jSONObject.put("medium_layout_phone_background", "common/fa_card_medium_background_multi_day_not_complete.png");
        jSONObject.put("step_goal", UnitUtilExt.e(BaseApplication.b(), i2, 1, 0));
        jSONObject.put("card_content", nlo.a(d(7), this.e, i2 - i));
        boolean zBa = LanguageUtil.ba(BaseApplication.b());
        int i3 = this.e;
        if (i3 == 1) {
            jSONObject.put("complete_progress_icon", zBa ? "common/progress_not_completed_1day_mirror.png" : "common/progress_not_completed_1day.png");
        } else if (i3 == 2) {
            jSONObject.put("complete_progress_icon", zBa ? "common/progress_not_completed_2day_mirror.png" : "common/progress_not_completed_2day.png");
        } else {
            jSONObject.put("complete_progress_icon", zBa ? "common/progress_not_completed_3day_mirror.png" : "common/progress_not_completed_3day.png");
        }
    }

    private void c(int i, JSONObject jSONObject) throws JSONException {
        e(jSONObject);
        jSONObject.put("style_today_complete", true);
        jSONObject.put("scene_id", "SC_FA_CARD_LOW_STEP");
        jSONObject.put("medium_layout_phone_background", "common/fa_card_medium_background_today_not_complete.png");
        jSONObject.put("card_content", nlo.b(d(4), this.h));
        jSONObject.put("step_goal", UnitUtilExt.e(BaseApplication.b(), i, 1, 0));
        jSONObject.put("sport_icon", "common/figure_walk.png");
    }

    private void e(int i, int i2, JSONObject jSONObject) throws JSONException {
        e(jSONObject);
        jSONObject.put("style_today_complete", true);
        jSONObject.put("scene_id", "SC_FA_CARD_TODAY_NOT_COMPLETE_GOAL");
        jSONObject.put("card_content", nlo.c(d(7), i2 - i));
        jSONObject.put("sport_icon", "common/figure_walk.png");
        jSONObject.put("step_goal", UnitUtilExt.e(BaseApplication.b(), i2, 1, 0));
        jSONObject.put("medium_layout_phone_background", "common/fa_card_medium_background_today_not_complete.png");
    }

    private void d(JSONObject jSONObject) throws JSONException {
        int i;
        e(jSONObject);
        jSONObject.put("style_new_sport", true);
        jSONObject.put("scene_id", "SC_FA_CARD_NEW_SPORT");
        if (this.k != null) {
            if (LanguageUtil.f(com.huawei.hwcommonmodel.application.BaseApplication.getContext())) {
                jSONObject.put("card_content", nlo.d(d(4), this.k.getSportTypeName()));
            } else {
                jSONObject.put("card_content", this.k.getSportTypeName());
            }
            if (this.k.getShowType() == 10) {
                c(jSONObject);
            } else if (this.k.getShowType() == 5) {
                jSONObject.put("sport_record_value", this.k.getSportData());
                try {
                    i = Integer.parseInt(this.k.getSportData());
                } catch (NumberFormatException unused) {
                    LogUtil.e("HealthFaDataExtendHelper", "Format exception");
                    i = 0;
                }
                jSONObject.put("sport_record_unit", c(R.plurals.IDS_sleep_referece_title_score_string, i, ""));
            } else {
                jSONObject.put("sport_record_value", this.k.getSportData());
                jSONObject.put("sport_record_unit", this.k.getSportUnit());
            }
        }
        jSONObject.put("medium_layout_phone_background", "common/fa_card_medium_background_new_sport.png");
    }

    private void c(JSONObject jSONObject) throws JSONException {
        int[] iArrE = e(Long.parseLong(this.k.getSportKeepTime()));
        int i = iArrE[0];
        int i2 = iArrE[1];
        int i3 = iArrE[2];
        if (i > 0) {
            String strC = c(R.plurals.IDS_physiology_day, i, "");
            jSONObject.put("sport_record_value", UnitUtil.e(i, 1, 0));
            jSONObject.put("sport_record_unit", strC);
        } else {
            jSONObject.put("sport_record_value", "");
            jSONObject.put("sport_record_unit", "");
        }
        if (i2 > 0) {
            String strC2 = c(R.plurals.IDS_hour_single_unit, i2, "");
            jSONObject.put("sport_record_value2", UnitUtil.e(i2, 1, 0));
            jSONObject.put("sport_record_unit2", strC2);
        } else {
            jSONObject.put("sport_record_value2", "");
            jSONObject.put("sport_record_unit2", "");
        }
        if (i3 > 0) {
            String strC3 = c(R.plurals.IDS_min_single_unit, i3, "");
            if (i == 0 && i2 == 0) {
                strC3 = c(R.plurals.IDS_min_insert_unit, i3, "");
            }
            jSONObject.put("sport_record_value3", UnitUtil.e(i3, 1, 0));
            jSONObject.put("sport_record_unit3", strC3);
            return;
        }
        jSONObject.put("sport_record_value3", "");
        jSONObject.put("sport_record_unit3", "");
    }

    private void e(JSONObject jSONObject) throws JSONException {
        jSONObject.put("style_step", false);
        jSONObject.put("style_new_sport", false);
        jSONObject.put("style_today_complete", false);
        jSONObject.put("style_multi_day_complete", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list) {
        if (njy.e(list) || list.size() == 1) {
            LogUtil.j("HealthFaDataExtendHelper", "dealStepHistoryData healthDataList empty or size = 1.");
            return;
        }
        List<HiHealthData> listSubList = list.subList(1, list.size());
        int iC = c(listSubList);
        this.e = iC;
        if (iC >= 1) {
            this.f8631b = true;
            LogUtil.a("HealthFaDataExtendHelper", "dealStepHistoryData mLastAchieved is true,mCompleteGoalDayCount:", Integer.valueOf(iC));
        } else {
            if (listSubList.size() < 7 || !e(listSubList)) {
                return;
            }
            LogUtil.a("HealthFaDataExtendHelper", "dealStepHistoryData mLastLowStep is true");
            this.i = true;
        }
    }

    private boolean e(List<HiHealthData> list) {
        if (list.size() >= 7) {
            HiHealthData hiHealthData = null;
            int i = 0;
            int i2 = 0;
            for (HiHealthData hiHealthData2 : list.subList(0, 7)) {
                if (hiHealthData2 != null) {
                    if ((hiHealthData == null || c(hiHealthData.getStartTime(), hiHealthData2.getStartTime()) == 1) && hiHealthData2.getInt("stepGoalValue") >= 3000) {
                        i2 += hiHealthData2.getInt("stepUserValue");
                        i++;
                        hiHealthData = hiHealthData2;
                    }
                }
            }
            int i3 = i > 0 ? i2 / i : 0;
            if (i3 > 0 && i3 < 3000) {
                this.h = i3;
                return true;
            }
        }
        return false;
    }

    private int c(List<HiHealthData> list) {
        int i = 0;
        if (njy.e(list)) {
            return 0;
        }
        HiHealthData hiHealthData = null;
        for (HiHealthData hiHealthData2 : list) {
            if (hiHealthData2 != null) {
                if (hiHealthData2.getInt("stepGoalState") != 1 || (hiHealthData != null && c(hiHealthData2.getStartTime(), hiHealthData.getStartTime()) != 1)) {
                    break;
                }
                i++;
                hiHealthData = hiHealthData2;
            }
        }
        return i;
    }

    public static int c(long j, long j2) {
        return (int) Math.abs((HiDateUtil.g(j2) - HiDateUtil.g(j)) / 8.64E7d);
    }

    public void b(final ResponseCallback<List<HiHealthData>> responseCallback) {
        LogUtil.a("HealthFaDataExtendHelper", "readStepHistoryData enter ");
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(HiDateUtil.p(a(-31)), HiDateUtil.g(System.currentTimeMillis()));
        hiAggregateOption.setType(d);
        hiAggregateOption.setConstantsKey(new String[]{"stepGoalValue", "stepUserValue", "stepGoalState", "stepIsRing"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setSortOrder(1);
        HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.health.provider.HealthFaDataExtendHelper.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.a("HealthFaDataExtendHelper", "readStepHistoryData callback ", Integer.valueOf(i));
                if (!njy.e(list)) {
                    HealthFaDataExtendHelper.this.b(list);
                    responseCallback.onResponse(i, list);
                } else {
                    LogUtil.j("HealthFaDataExtendHelper", "readStepHistoryData no data");
                    responseCallback.onResponse(i, null);
                }
            }
        });
    }

    private String c(int i, int i2, Object... objArr) {
        try {
            return BaseApplication.b().getResources().getQuantityString(i, i2, objArr);
        } catch (Resources.NotFoundException | IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("HealthFaDataExtendHelper", "getQuantityString exception ", ExceptionUtils.c(e));
            return "";
        }
    }

    private long a(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, i);
        return calendar.getTimeInMillis();
    }

    public static int[] e(long j) {
        int i = (int) (j / 86400000);
        long j2 = j - ((long) (86400000 * i));
        int i2 = (int) (j2 / 3600000);
        int iCeil = (int) Math.ceil((j2 - ((long) (3600000 * i2))) / 60000.0d);
        if (iCeil == 60) {
            i2++;
            if (i2 == 24) {
                i++;
                iCeil = 0;
                i2 = 0;
            } else {
                iCeil = 0;
            }
        }
        return new int[]{i, i2, iCeil};
    }
}
