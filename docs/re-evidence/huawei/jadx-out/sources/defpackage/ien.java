package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.suggestion.util.FitnessItemDecoration;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Audio;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.TargetConfig;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ien {
    public static boolean a(int i, int i2) {
        if (i != 5) {
            return i == 7 && i2 != 0;
        }
        return true;
    }

    public static boolean b(int i) {
        return i == 5 || i == 6 || i == 7;
    }

    public static boolean e(int i, int i2) {
        if (i != 6) {
            return i == 7 && i2 != 0;
        }
        return true;
    }

    public static int b() {
        return new HealthColumnSystem(BaseApplication.getContext(), 1).j() / 4;
    }

    public static int b(Context context) {
        if (context == null) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "getWindowWidth() context is null!");
            return 0;
        }
        Object systemService = context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "getWindowWidth, object is not instanceof WindowManager");
            return 0;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static void b(Context context, HealthRecycleView healthRecycleView) {
        if (context == null || healthRecycleView == null) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "setRecyclerViewLayout(), Param is null!");
        } else {
            b(context, healthRecycleView, (LinearLayoutManager) new HealthLinearLayoutManager(context), true);
        }
    }

    public static void a(Context context, HealthRecycleView healthRecycleView, LinearLayoutManager linearLayoutManager) {
        b(context, healthRecycleView, linearLayoutManager, true);
    }

    public static void b(final Context context, HealthRecycleView healthRecycleView, boolean z) {
        HealthLinearLayoutManager healthLinearLayoutManager;
        if (context == null || healthRecycleView == null) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "setRecyclerViewLayout(), context or recycleView is null!");
            return;
        }
        if (z) {
            healthLinearLayoutManager = new HealthLinearLayoutManager(context);
        } else {
            healthLinearLayoutManager = new HealthLinearLayoutManager(context) { // from class: com.huawei.health.suggestion.util.FitnessCommonUtil$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            };
        }
        b(context, healthRecycleView, healthLinearLayoutManager, z);
    }

    public static void b(Context context, HealthRecycleView healthRecycleView, LinearLayoutManager linearLayoutManager, boolean z) {
        a(context, healthRecycleView, linearLayoutManager, z, a(context));
    }

    public static void a(Context context, HealthRecycleView healthRecycleView, RecyclerView.LayoutManager layoutManager, boolean z, int i) {
        if (context == null || healthRecycleView == null || layoutManager == null) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "setRecyclerViewLayout(), context or recycleView or linearLayoutManager is null!");
            return;
        }
        if (qrs.af(context)) {
            int iE = qrs.e(context, qqp.b(context));
            if (healthRecycleView.getItemDecorationCount() > 0 && healthRecycleView.getItemDecorationAt(0) != null) {
                healthRecycleView.removeItemDecorationAt(0);
            }
            if (!(layoutManager instanceof GridLayoutManager)) {
                layoutManager = d(context, z, 2);
                healthRecycleView.addItemDecoration(new FitnessItemDecoration(context, iE, a(context)));
            }
            healthRecycleView.setLayoutManager(layoutManager);
            return;
        }
        if (healthRecycleView.getItemDecorationCount() > 0 && healthRecycleView.getItemDecorationAt(0) != null) {
            healthRecycleView.removeItemDecorationAt(0);
        }
        healthRecycleView.addItemDecoration(new FitnessItemDecoration(context, 0, i));
        healthRecycleView.setLayoutManager(layoutManager);
    }

    public static RecyclerView.LayoutManager d(final Context context, boolean z, final int i) {
        if (i <= 0) {
            i = 2;
        }
        final boolean z2 = false;
        final int i2 = 1;
        if (z) {
            return new GridLayoutManager(context, i, 1, false);
        }
        return new GridLayoutManager(context, i, i2, z2) { // from class: com.huawei.health.suggestion.util.FitnessCommonUtil$2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
    }

    public static void c(Context context, int i, final HealthRecycleView healthRecycleView) {
        final GridLayoutManager gridLayoutManager;
        if (context == null || healthRecycleView == null) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "setRecyclerViewLayout(), context or recycleView");
            return;
        }
        if (i == 1) {
            b(context, healthRecycleView, true);
            return;
        }
        if (healthRecycleView.getItemDecorationCount() > 0 && healthRecycleView.getItemDecorationAt(0) != null) {
            healthRecycleView.removeItemDecorationAt(0);
        }
        if (qrs.af(context)) {
            int i2 = i * 2;
            healthRecycleView.addItemDecoration(a(context, i2));
            gridLayoutManager = new GridLayoutManager(context, i2, 1, false);
        } else {
            healthRecycleView.addItemDecoration(a(context, i));
            gridLayoutManager = new GridLayoutManager(context, i, 1, false);
        }
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: ien.4
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i3) {
                if (healthRecycleView.getAdapter() != null && healthRecycleView.getAdapter().getItemViewType(i3) == 0) {
                    return gridLayoutManager.getSpanCount();
                }
                return 1;
            }
        });
        healthRecycleView.setLayoutManager(gridLayoutManager);
    }

    private static ColumnLayoutItemDecoration a(Context context, int i) {
        return new ColumnLayoutItemDecoration(context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle), context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle), i, new int[]{0, context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle), 0, 0});
    }

    public static void d(final Context context, HealthRecycleView healthRecycleView, boolean z, boolean z2) {
        HealthLinearLayoutManager healthLinearLayoutManager;
        if (context == null || healthRecycleView == null) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "setRecyclerViewLayout(), tahitiPadding, defaultPadding is null!");
            return;
        }
        final boolean z3 = false;
        if (qrs.af(context)) {
            int iE = qrs.e(context, qqp.b(context));
            if (healthRecycleView.getItemDecorationCount() > 0 && healthRecycleView.getItemDecorationAt(0) != null) {
                healthRecycleView.removeItemDecorationAt(0);
            }
            healthRecycleView.addItemDecoration(new FitnessItemDecoration(context, iE, 0));
            final int i = 1;
            final int i2 = 2;
            if (z) {
                healthRecycleView.setLayoutManager(new GridLayoutManager(context, 2, 1, false));
                return;
            } else {
                healthRecycleView.setLayoutManager(new GridLayoutManager(context, i2, i, z3) { // from class: com.huawei.health.suggestion.util.FitnessCommonUtil$4
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public boolean canScrollVertically() {
                        return false;
                    }
                });
                return;
            }
        }
        if (healthRecycleView.getItemDecorationCount() > 0 && healthRecycleView.getItemDecorationAt(0) != null) {
            healthRecycleView.removeItemDecorationAt(0);
        }
        if (z2) {
            healthLinearLayoutManager = new HealthLinearLayoutManager(context);
        } else {
            healthLinearLayoutManager = new HealthLinearLayoutManager(context) { // from class: com.huawei.health.suggestion.util.FitnessCommonUtil$5
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            };
        }
        healthRecycleView.addItemDecoration(new FitnessItemDecoration(context, 0, 0));
        healthRecycleView.setLayoutManager(healthLinearLayoutManager);
    }

    public static void e(Context context, HealthRecycleView healthRecycleView, int i) {
        if (context == null || healthRecycleView == null) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "setRecyclerViewLayout(), context or recycleView or linearLayoutManager is null!");
            return;
        }
        HealthLinearLayoutManager healthLinearLayoutManager = new HealthLinearLayoutManager(context);
        if (qrs.af(context)) {
            if (healthRecycleView.getItemDecorationCount() > 0 && healthRecycleView.getItemDecorationAt(0) != null) {
                healthRecycleView.removeItemDecorationAt(0);
            }
            healthRecycleView.addItemDecoration(new FitnessItemDecoration(context, i, a(context)));
            healthRecycleView.setLayoutManager(new GridLayoutManager(context, 2, 1, false));
            return;
        }
        if (healthRecycleView.getItemDecorationCount() > 0 && healthRecycleView.getItemDecorationAt(0) != null) {
            healthRecycleView.removeItemDecorationAt(0);
        }
        healthRecycleView.addItemDecoration(new FitnessItemDecoration(context, 0, a(context)));
        healthRecycleView.setLayoutManager(healthLinearLayoutManager);
    }

    public static boolean e(Context context) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            return false;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "personalized_recommend");
        LogUtil.a("Suggestion_FitnessCommonUtil", "productRecommend = ", strE);
        return "1".equals(strE);
    }

    public static List<FitWorkout> b(List<FitWorkout> list, String str) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (FitWorkout fitWorkout : list) {
            if (fitWorkout != null) {
                if (fitWorkout.getWorkoutType() == 1) {
                    arrayList.add(fitWorkout);
                } else {
                    arrayList2.add(fitWorkout);
                }
            }
        }
        return str.equals("RUNNING_COURSE") ? arrayList2 : arrayList;
    }

    public static Map<String, pcs> e(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            return Collections.EMPTY_MAP;
        }
        Map<String, pcs> mapE = e(fitWorkout.acquireExtendSeaMap());
        if (mapE == null || mapE.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(fitWorkout.acquireNarrowDesc());
                if (!jSONObject.has("extendMap") || TextUtils.isEmpty(jSONObject.optString("extendMap"))) {
                    LogUtil.e("Suggestion_FitnessCommonUtil", "no has JsonObject");
                } else {
                    mapE = b(jSONObject.optString("extendMap"));
                }
            } catch (JSONException e) {
                LogUtil.e("Suggestion_FitnessCommonUtil", "detailInfo JSONException:", LogAnonymous.b(e));
            }
        }
        return mapE == null ? Collections.EMPTY_MAP : mapE;
    }

    public static Map<String, pcs> e(String str) {
        if (str == null || str.length() == 0) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "parseWorkoutExtendBean input null or empty");
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(10);
        try {
            JSONObject jSONObject = new JSONObject(str);
            d(map, jSONObject, "workoutRecommendDec", "courseDesc", HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("suitPeople");
            if (jSONObjectOptJSONObject != null) {
                map.put("suitPeople", new pcs(jSONObjectOptJSONObject.optString("title"), jSONObjectOptJSONObject.optString(ParamConstants.Param.CONTEXT)));
            }
            d(map, jSONObject, "trainingSuggest", "bannerPeople", "attention");
            return map;
        } catch (JSONException e) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "parseWorkoutExtendBean input json exception ", LogAnonymous.b(e));
            return map;
        } catch (Exception e2) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "parseWorkoutExtendBean exception ", LogAnonymous.b(e2));
            return map;
        }
    }

    private static void d(Map<String, pcs> map, JSONObject jSONObject, String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            map.put(str, new pcs(jSONObjectOptJSONObject.optString("title"), jSONObjectOptJSONObject.optString(ParamConstants.Param.CONTEXT)));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(str2);
        if (jSONObjectOptJSONObject2 != null) {
            map.put(str2, new pcs(jSONObjectOptJSONObject2.optString("title"), jSONObjectOptJSONObject2.optString(ParamConstants.Param.CONTEXT)));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(str3);
        if (jSONObjectOptJSONObject3 != null) {
            map.put(str3, new pcs(jSONObjectOptJSONObject3.optString("title"), jSONObjectOptJSONObject3.optString(ParamConstants.Param.CONTEXT)));
        }
    }

    public static Map<String, pcs> b(String str) {
        if (StringUtils.g(str)) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "parseWorkoutExtendOld input null or empty");
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(10);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("课程说明");
            if (StringUtils.j(strOptString)) {
                map.put("courseDesc", new pcs(BaseApplication.getContext().getResources().getString(R.string.IDS_FitnessAdvice_course_description), strOptString));
            }
            String strOptString2 = jSONObject.optString("训练建议");
            if (StringUtils.j(strOptString2)) {
                map.put("trainingSuggest", new pcs(BaseApplication.getContext().getResources().getString(R.string.IDS_FitnessAdvice_training_suggestions), strOptString2));
            }
            String strOptString3 = jSONObject.optString("适用人群");
            if (StringUtils.j(strOptString3)) {
                map.put("suitPeople", new pcs(BaseApplication.getContext().getResources().getString(R.string.IDS_FitnessAdvice_applicable_populations), strOptString3));
            }
            String strOptString4 = jSONObject.optString("禁忌人群");
            if (StringUtils.j(strOptString4)) {
                map.put("bannerPeople", new pcs(BaseApplication.getContext().getResources().getString(R.string.IDS_FitnessAdvice_taboo_people), strOptString4));
            }
            String strOptString5 = jSONObject.optString("注意事项");
            if (StringUtils.j(strOptString5)) {
                map.put("attention", new pcs(BaseApplication.getContext().getResources().getString(R.string.IDS_FitnessAdvice_precautions), strOptString5));
                return map;
            }
        } catch (JSONException e) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "parseWorkoutExtendOld exception ", LogAnonymous.b(e));
        }
        return map;
    }

    public static List<WorkoutAction> a(FitWorkout fitWorkout) {
        ArrayList arrayList = new ArrayList();
        if (fitWorkout != null) {
            WorkoutAction workoutActionAcquireWarmUpRunAction = fitWorkout.acquireWarmUpRunAction();
            if (workoutActionAcquireWarmUpRunAction != null) {
                arrayList.add(workoutActionAcquireWarmUpRunAction);
            }
            List<WorkoutAction> listAcquireWorkoutActions = fitWorkout.acquireWorkoutActions();
            int iAcquireRepeatTimes = fitWorkout.getType() == 3 ? fitWorkout.acquireRepeatTimes() : 1;
            if (listAcquireWorkoutActions != null) {
                for (int i = 0; i < iAcquireRepeatTimes; i++) {
                    arrayList.addAll(listAcquireWorkoutActions);
                }
            }
            WorkoutAction workoutActionAcquireCoolDownRunAction = fitWorkout.acquireCoolDownRunAction();
            if (workoutActionAcquireCoolDownRunAction != null) {
                arrayList.add(workoutActionAcquireCoolDownRunAction);
            }
            return arrayList;
        }
        health.compact.a.util.LogUtil.d("Suggestion_FitnessCommonUtil", "getWorkoutActionRunWorkoutAll fitworkout is null");
        return arrayList;
    }

    public static List<ChoreographedSingleAction> b(FitWorkout fitWorkout) {
        ArrayList arrayList = new ArrayList();
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "getChoreographedMultiActionsAll fitWorkout is null");
            return arrayList;
        }
        List<ChoreographedMultiActions> courseActions = fitWorkout.getCourseActions();
        if (njy.e(courseActions)) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "getChoreographedMultiActionsAll workoutActionList is null");
            return arrayList;
        }
        for (ChoreographedMultiActions choreographedMultiActions : courseActions) {
            if (choreographedMultiActions != null) {
                int repeatTimes = choreographedMultiActions.getRepeatTimes();
                for (int i = 0; i < repeatTimes; i++) {
                    arrayList.addAll(choreographedMultiActions.getActionList());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ChoreographedSingleAction) it.next()).putExtendProperty(MessageConstant.GROUP_MEDAL_TYPE, "1");
        }
        return arrayList;
    }

    public static List<ChoreographedSingleAction> c(List<WorkoutAction> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "convertActionList workoutActionList == null");
            return arrayList;
        }
        for (WorkoutAction workoutAction : list) {
            if (workoutAction == null) {
                LogUtil.e("Suggestion_FitnessCommonUtil", "convertActionList workoutAction null");
            } else {
                ChoreographedSingleAction choreographedSingleAction = new ChoreographedSingleAction();
                b(workoutAction, choreographedSingleAction);
                AtomicAction action = choreographedSingleAction.getAction();
                if (action == null) {
                    LogUtil.j("Suggestion_FitnessCommonUtil", "convertActionList atomicAction is null.");
                } else {
                    action.setExtendProperty(new HashMap());
                    a(action, workoutAction.getAction());
                    action.setId(workoutAction.getActionId());
                    action.putExtendProperty("duration", String.valueOf(workoutAction.getDuration()));
                    if (njy.b(workoutAction.getVideos())) {
                        action.putExtendProperty("actionVideo", new Gson().toJson(workoutAction.getVideos()));
                    }
                    if (workoutAction.getActionMusic() != null) {
                        action.putExtendProperty("actionMusic", new Gson().toJson(workoutAction.getActionMusic()));
                    }
                    action.putExtendProperty("actionStep", String.valueOf(workoutAction.getActionStep()));
                    action.putExtendProperty("introduceLyric", String.valueOf(workoutAction.getIntroduceLyric()));
                    action.putExtendProperty("breath", String.valueOf(workoutAction.getBreath()));
                    action.putExtendProperty("feeling", String.valueOf(workoutAction.getFeeling()));
                    action.putExtendProperty("commonError", String.valueOf(workoutAction.getCommonError()));
                    action.putExtendProperty("calorie", String.valueOf(workoutAction.getCalorie()));
                    if (njy.b(workoutAction.getPictures())) {
                        action.putExtendProperty("pictures", new Gson().toJson(workoutAction.getPictures()));
                    }
                    arrayList.add(choreographedSingleAction);
                }
            }
        }
        return arrayList;
    }

    private static void a(AtomicAction atomicAction, AtomicAction atomicAction2) {
        if (atomicAction2 != null) {
            atomicAction.setName(atomicAction2.getName());
            List extendPropertyList = atomicAction2.getExtendPropertyList("audios", Audio[].class);
            if (njy.b(extendPropertyList)) {
                atomicAction.putExtendProperty("audios", new Gson().toJson(extendPropertyList));
            }
            atomicAction.setActionSportType(atomicAction2.getActionSportType());
            atomicAction.putExtendProperty("frequency", atomicAction2.getExtendPropertyString("frequency"));
            atomicAction.setEquipments(atomicAction2.getEquipments());
            atomicAction.setTrainingPoints(atomicAction2.getTrainingPoints());
            atomicAction.setDifficulty(atomicAction2.getDifficulty());
            atomicAction.setDescription(atomicAction2.getDescription());
            atomicAction.setCovers(atomicAction2.getCovers());
            atomicAction.putExtendProperty("logoImgUrl", atomicAction2.getExtendPropertyString("logoImgUrl"));
        }
    }

    private static void b(WorkoutAction workoutAction, ChoreographedSingleAction choreographedSingleAction) {
        choreographedSingleAction.setCommentaryGap(workoutAction.acquireCommentaryGap());
        choreographedSingleAction.setCommentaryTraining(workoutAction.getCommentaryTraining());
        choreographedSingleAction.setAction(new AtomicAction());
        choreographedSingleAction.setIntensityConfig(new TargetConfig());
        choreographedSingleAction.getIntensityConfig().setId(String.valueOf(workoutAction.acquireIntensityType()));
        c(workoutAction, choreographedSingleAction.getIntensityConfig());
        choreographedSingleAction.setExtendProperty(new HashMap());
        choreographedSingleAction.putExtendProperty(MessageConstant.GROUP_MEDAL_TYPE, String.valueOf(workoutAction.getGroup()));
        choreographedSingleAction.putExtendProperty("gap", String.valueOf(workoutAction.getGap()));
        choreographedSingleAction.putExtendProperty("tabloidPicUrl", workoutAction.acquireTabloidPicUrl());
        choreographedSingleAction.setTargetConfig(new TargetConfig());
        choreographedSingleAction.getTargetConfig().setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
        choreographedSingleAction.getTargetConfig().setValueL(workoutAction.acquireMeasurementValue());
        choreographedSingleAction.getTargetConfig().setId(String.valueOf(workoutAction.acquireMeasurementType()));
    }

    private static void c(WorkoutAction workoutAction, TargetConfig targetConfig) {
        int iAcquireIntensityType = workoutAction.acquireIntensityType();
        if (iAcquireIntensityType == 0) {
            targetConfig.setValueL(workoutAction.acquireSpeedL());
            targetConfig.setValueH(workoutAction.acquireSpeedH());
            return;
        }
        if (iAcquireIntensityType == 1) {
            targetConfig.setValueL(workoutAction.acquireRelativeHeartRatePercentL());
            targetConfig.setValueH(workoutAction.acquireRelativeHeartRatePercentH());
            return;
        }
        if (iAcquireIntensityType == 2) {
            targetConfig.setValueL(CommonUtil.a(workoutAction.acquireAbsoluteHeartRateL()));
            targetConfig.setValueH(CommonUtil.a(workoutAction.acquireAbsoluteHeartRateH()));
            return;
        }
        if (iAcquireIntensityType == 4) {
            targetConfig.setValueL(workoutAction.acquireRelativeHeartRateRangeL());
            targetConfig.setValueH(workoutAction.acquireRelativeHeartRateRangeH());
            return;
        }
        switch (iAcquireIntensityType) {
            case 7:
                targetConfig.setValueL(workoutAction.acquireReserveHeartRatePercentL());
                targetConfig.setValueH(workoutAction.acquireReserveHeartRatePercentH());
                break;
            case 8:
                targetConfig.setValueL(workoutAction.acquireReserveHeartRateRangeL());
                targetConfig.setValueH(workoutAction.acquireReserveHeartRateRangeH());
                break;
            case 9:
                targetConfig.setValueL(workoutAction.acquireMaf180HeartRateRange());
                targetConfig.setValueH(workoutAction.acquireMaf180HeartRateBase());
                break;
            case 10:
                targetConfig.setValueL(workoutAction.acquireSpecifiedSpeed());
                targetConfig.setValueH(workoutAction.acquireSpecifiedSpeed());
                break;
            case 11:
                targetConfig.setValueL(workoutAction.acquireSpecifiedSlope());
                targetConfig.setValueH(workoutAction.acquireSpecifiedSlope());
                break;
            case 12:
                targetConfig.setValueL(workoutAction.acquireSpecifiedSpeed());
                targetConfig.setValueH(workoutAction.acquireSpecifiedSlope());
                break;
            default:
                LogUtil.e("Suggestion_FitnessCommonUtil", "setIntensityRangeValue other type:", Integer.valueOf(iAcquireIntensityType));
                break;
        }
    }

    public static int c(ChoreographedSingleAction choreographedSingleAction) {
        if (choreographedSingleAction == null || choreographedSingleAction.getTargetConfig() == null) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "getTargetValue workoutAction == null");
            return 0;
        }
        if (TargetConfig.ValueTypes.LOW_VALUE.getValue() == choreographedSingleAction.getTargetConfig().getValueType()) {
            return (int) choreographedSingleAction.getTargetConfig().getValueL();
        }
        return (int) choreographedSingleAction.getTargetConfig().getValueH();
    }

    public static List<RecordAction> d(List<ChoreographedSingleAction> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        if (njy.e(list)) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "getRecordActions workoutActions is null");
            return arrayList;
        }
        for (ChoreographedSingleAction choreographedSingleAction : list) {
            if (choreographedSingleAction != null) {
                arrayList.add(d(choreographedSingleAction, i));
            }
        }
        return arrayList;
    }

    private static RecordAction d(ChoreographedSingleAction choreographedSingleAction, int i) {
        if (choreographedSingleAction == null || choreographedSingleAction.getAction() == null) {
            return new RecordAction("", "", 0, 0.0f, nuc.a(""));
        }
        int iJ = CommonUtils.j(choreographedSingleAction.getTargetConfig().getId());
        if (iJ == 4 || iJ == 5) {
            return new RecordAction(choreographedSingleAction.getAction().getId(), choreographedSingleAction.getAction().getName(), 0, Math.round((i * c(choreographedSingleAction)) / 100.0f), iJ);
        }
        return new RecordAction(choreographedSingleAction.getAction().getId(), choreographedSingleAction.getAction().getName(), 0, c(choreographedSingleAction), iJ);
    }

    public static boolean d(FitWorkout fitWorkout) {
        List<ChoreographedSingleAction> listC;
        if (fitWorkout == null) {
            LogUtil.e("Suggestion_FitnessCommonUtil", "fitWorkout == null");
            return false;
        }
        if (fitWorkout.isNewRunCourse()) {
            listC = b(fitWorkout);
        } else {
            listC = c(a(fitWorkout));
        }
        for (ChoreographedSingleAction choreographedSingleAction : listC) {
            if (choreographedSingleAction != null && d(choreographedSingleAction)) {
                LogUtil.a("Suggestion_FitnessCommonUtil", "Treadmill, intensityType = ", choreographedSingleAction.getIntensityConfig().getId());
                return true;
            }
        }
        return false;
    }

    private static boolean d(ChoreographedSingleAction choreographedSingleAction) {
        int iJ = choreographedSingleAction.getTargetConfig() != null ? CommonUtils.j(choreographedSingleAction.getTargetConfig().getId()) : -1;
        if (iJ == 5 || iJ == 4) {
            return true;
        }
        int iJ2 = choreographedSingleAction.getIntensityConfig() != null ? CommonUtils.j(choreographedSingleAction.getIntensityConfig().getId()) : 255;
        if (iJ2 == 17) {
            return true;
        }
        switch (iJ2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static int e() {
        return Utils.o() ? 204 : 4;
    }

    public static int a(Context context) {
        return qrs.e(context, context.getResources().getDimension(com.huawei.ui.commonui.R.dimen.cardMarginMiddle));
    }

    public static int d() {
        int gender;
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "getUserInfo : userProfileMgrApi is null.");
            return 1;
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo == null) {
            gender = 1;
        } else if (!userInfo.isGenderValid()) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "getUserGender !userInfo.isGenderValid()");
            gender = 1;
        } else {
            gender = userInfo.getGender();
        }
        if (gender == 2) {
            return 1;
        }
        return gender;
    }

    public static void a() {
        buh.c("allFitnessCourses");
        buh.c("workoutMyFitnessCourses");
        buh.c("RECOMMEND_WORKOUT_KEY_COURSE");
        buh.c("RECOMMEND_WORKOUT_CREATE_TIME_COURSE");
        buh.c(f());
        buh.c("allFitnessPkgs");
    }

    private static String f() {
        HashMap map = new HashMap(2);
        map.put(MedalConstants.EVENT_KEY, "getFitnessCourseTopicListKey");
        map.put("pageNum", 0);
        return map.toString();
    }

    public static void b(Context context, FitWorkout fitWorkout, Plan plan, long j, int i) {
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.g(i);
        pcdVar.a("10");
        pcdVar.f(plan.acquireName());
        pcdVar.e(j);
        pcdVar.g(plan.acquireId());
        pcdVar.j(e(plan, j));
        pea.a(context, fitWorkout, pcdVar);
    }

    public static void b(Context context, FitWorkout fitWorkout, Plan plan, long j) {
        b(context, fitWorkout, plan, j, 1);
    }

    public static void a(Context context, FitWorkout fitWorkout, Plan plan, long j) {
        if (context == null || fitWorkout == null || plan == null) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "context == null || fitWorkout == null || currentRunPlan == null");
        } else {
            b(context, fitWorkout, plan, 1, j);
        }
    }

    public static void b(Context context, FitWorkout fitWorkout, Plan plan, int i, long j) {
        if (context == null || fitWorkout == null || plan == null) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "context == null || fitWorkout == null || currentRunPlan == null");
        } else {
            b(context, fitWorkout, plan.acquireId(), e(plan, j), i, j);
        }
    }

    private static int e(Plan plan, long j) {
        if (plan.getPlanCategory() == 0) {
            return e(plan.getStartTime() * 1000, j);
        }
        return btw.b(plan);
    }

    public static void b(Context context, FitWorkout fitWorkout, String str, int i, int i2, long j) {
        if (context == null || fitWorkout == null) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "context == null || fitWorkout == null");
            return;
        }
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.g(str);
        pcdVar.j(i);
        pcdVar.g(i2);
        pcdVar.a("10");
        pcdVar.e(j);
        pea.a(context, fitWorkout, pcdVar);
    }

    public static int e(long j, long j2) {
        return (((int) TimeUnit.MILLISECONDS.toDays(ift.a(j2) - ift.a(j))) / 7) + 1;
    }

    public static void e(int i, boolean z) {
        LogUtil.a("Suggestion_FitnessCommonUtil", "setPersonalPrivacySettingValue... privacyId = ", Integer.valueOf(i), ", isOpen = ", Boolean.valueOf(z));
        ioi.d().e(i, z, String.valueOf(i), new IBaseResponseCallback() { // from class: iel
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                ien.a(i2, obj);
            }
        });
    }

    static /* synthetic */ void a(int i, Object obj) {
        if (i == 0) {
            LogUtil.a("Suggestion_FitnessCommonUtil", "onResponse setUserPrivacy success ");
        } else {
            LogUtil.e("Suggestion_FitnessCommonUtil", "onResponse setUserPrivacy failure");
        }
    }

    public static boolean e(int i) {
        String strC = ioi.d().c(i);
        LogUtil.a("Suggestion_FitnessCommonUtil", "getPersonalPrivacySettingValue... privacyId: ", Integer.valueOf(i), " value: ", strC);
        return "true".equals(strC);
    }

    public static float c() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null) {
            return userInfo.getWeightOrDefaultValue();
        }
        return 0.0f;
    }

    public static Integer a(FitWorkout fitWorkout, ImageView imageView) {
        Integer numValueOf = null;
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_FitnessCommonUtil", "getNewImage, fitWorkout is null");
            return null;
        }
        LogUtil.a("Suggestion_FitnessCommonUtil", "getNewImage, fitWorkout Stage=", Integer.valueOf(fitWorkout.acquireStage()), " IsSupportDevice=", Integer.valueOf(fitWorkout.acquireIsSupportDevice()));
        if (fitWorkout.acquireStage() == 0 && fitWorkout.acquireIsSupportDevice() == 0) {
            numValueOf = Integer.valueOf(LanguageUtil.ba(BaseApplication.getContext()) ? R.drawable.pic_corner_new_watchwear_mirror : R.drawable.pic_corner_new_watchwear);
        } else if (fitWorkout.acquireStage() == 0) {
            numValueOf = Integer.valueOf(LanguageUtil.ba(BaseApplication.getContext()) ? R.drawable.new0_mirror : R.drawable.new0);
        } else if (fitWorkout.acquireIsSupportDevice() == 0) {
            numValueOf = Integer.valueOf(LanguageUtil.ba(BaseApplication.getContext()) ? R.drawable.pic_corner_watchwear_mirror : R.drawable.pic_corner_watchwear);
        }
        if (imageView != null) {
            if (numValueOf != null) {
                imageView.setImageResource(numValueOf.intValue());
                imageView.setVisibility(0);
                return numValueOf;
            }
            imageView.setVisibility(8);
        }
        return numValueOf;
    }
}
