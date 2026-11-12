package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.fitness.FitnessAchieveInfoUseCase;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessActionLibraryActivity;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSessionManager;
import com.huawei.health.suggestion.ui.tabfragments.provider.WorkoutStatisticProvider;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessStatisticProvider;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.lmf;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class WorkoutStatisticProvider extends FitnessStatisticProvider<FitnessAchieveInfoUseCase> {
    public static /* synthetic */ void a(int i, Object obj) {
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 22;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 10001;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        a(context, map, fitnessAchieveInfoUseCase);
    }

    private void a(Context context, HashMap<String, Object> map, FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        map.put("SECTION_STYLE", BaseSection.FITNESS_STYLE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.drawable.pic_fitness));
        arrayList.add(Integer.valueOf(R.drawable.pic_fitness_tahiti));
        map.put("BACKGROUND", arrayList);
        map.put("BUTTON_TEXT", BaseApplication.getContext().getResources().getString(R.string.IDS_FitnessAdvice_all_courses));
        map.put("AUXILIARY_BUTTON_TEXT", BaseApplication.getContext().getResources().getString(R.string.sug_action_lib));
        map.put("ACCUMULATED_DURATION", Integer.valueOf((int) fitnessAchieveInfoUseCase.getSumExerciseTime()));
        map.put("ACCUMULATED_DURATION_TEXT", BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_duration_text));
        map.put("FITNESS_DURATION", Integer.valueOf(fitnessAchieveInfoUseCase.getTodayTime()));
        map.put("FITNESS_DURATION_UNIT", BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_min));
        map.put("FITNESS_DURATION_TEXT", BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_group_today));
        map.put("ACCUMULATED_DAYS", Integer.valueOf(fitnessAchieveInfoUseCase.getSumDays()));
        map.put("ACCUMULATED_DAYS_UNIT", BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_day, fitnessAchieveInfoUseCase.getSumDays()));
        map.put("ACCUMULATED_DAYS_TEXT", BaseApplication.getContext().getResources().getString(R.string.IDS_user_profile_achieve_sum));
        map.put("ACCUMULATED_TIMES", Integer.valueOf(fitnessAchieveInfoUseCase.getExerciseCount()));
        map.put("ACCUMULATED_TIMES_UNIT", BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hwh_motiontrack_sport_data_time, fitnessAchieveInfoUseCase.getExerciseCount()));
        map.put("ACCUMULATED_TIMES_TEXT", BaseApplication.getContext().getResources().getString(R.string.sug_total_times));
        e(context, map);
    }

    private void e(final Context context, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.WorkoutStatisticProvider.2
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if (qrs.r()) {
                    LogUtil.a("Track_Provider_Track_WorkoutStatisticProvider", "CLICK_EVENT_LISTENER onClick isFastClick");
                    return;
                }
                if ("ACCUMULATED_DURATION_CLICK_VIEW".equals(str)) {
                    WorkoutStatisticProvider.this.e(context);
                } else if ("BUTTON_TEXT".equals(str)) {
                    WorkoutStatisticProvider.this.d(context);
                } else if ("AUXILIARY_BUTTON_TEXT".equals(str)) {
                    WorkoutStatisticProvider.this.c(context);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: ict
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    WorkoutStatisticProvider.a(i, obj);
                }
            }, "");
            return;
        }
        FitnessSessionManager.SessionActivityAction sessionActivityActionD = FitnessSessionManager.b().d();
        if (sessionActivityActionD == null) {
            LogUtil.j("Track_Provider_Track_WorkoutStatisticProvider", "FitnessSessionManager getSessionForActivityAction null");
        } else {
            sessionActivityActionD.startSportHistoryActivity(context, 10001, getCourseCategory());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        MarketingBiUtils.c(getPageType(), getSubViewTitle(), 0);
        try {
            JumpUtil.a(context, getCourseCategory(), 1, "FITNESS_COURSE");
        } catch (ActivityNotFoundException e) {
            LogUtil.j("Track_Provider_Track_WorkoutStatisticProvider", "ActivityNotFound", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context) {
        Intent intent = new Intent(context, (Class<?>) FitnessActionLibraryActivity.class);
        intent.putExtra("courseCategoryKey", getCourseCategory());
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, 10001);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_FITNESS_ACTION_LIBRARY_1130027.value(), map, 0);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.j("Track_Provider_Track_WorkoutStatisticProvider", "ActivityNotFound", e.getMessage());
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Track_WorkoutStatisticProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return "";
    }
}
