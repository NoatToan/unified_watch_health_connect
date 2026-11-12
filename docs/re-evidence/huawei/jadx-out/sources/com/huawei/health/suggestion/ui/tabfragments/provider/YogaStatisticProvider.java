package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.View;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.fitness.FitnessAchieveInfoUseCase;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSessionManager;
import com.huawei.health.suggestion.ui.tabfragments.provider.YogaStatisticProvider;
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
public class YogaStatisticProvider extends FitnessStatisticProvider<FitnessAchieveInfoUseCase> {
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 23;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        a(context, map, fitnessAchieveInfoUseCase);
    }

    private void a(Context context, HashMap<String, Object> map, FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        ArrayList arrayList = new ArrayList();
        map.put("SECTION_STYLE", BaseSection.YOGA_STYLE);
        arrayList.add(Integer.valueOf(R.drawable.pic_yoga));
        arrayList.add(Integer.valueOf(R.drawable.pic_yoga_tahiti));
        map.put("BACKGROUND", arrayList);
        map.put("BUTTON_TEXT", BaseApplication.getContext().getResources().getString(R.string.IDS_FitnessAdvice_all_courses));
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
        b(context, map);
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.tabfragments.provider.YogaStatisticProvider$5, reason: invalid class name */
    public class AnonymousClass5 implements OnClickSectionListener {
        final /* synthetic */ Context d;

        public static /* synthetic */ void e(int i, Object obj) {
        }

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

        AnonymousClass5(Context context) {
            this.d = context;
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
            if (qrs.r()) {
                LogUtil.a("Track_Provider_Track_YogaStatisticProvider", "CLICK_EVENT_LISTENER onClick isFastClick");
                return;
            }
            if ("ACCUMULATED_DURATION_CLICK_VIEW".equals(str)) {
                if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                    LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: icv
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public final void a(int i, Object obj) {
                            YogaStatisticProvider.AnonymousClass5.e(i, obj);
                        }
                    }, "");
                    return;
                }
                FitnessSessionManager.SessionActivityAction sessionActivityActionD = FitnessSessionManager.b().d();
                if (sessionActivityActionD == null) {
                    LogUtil.j("Track_Provider_Track_YogaStatisticProvider", "FitnessSessionManager getSessionForActivityAction null");
                    return;
                } else {
                    sessionActivityActionD.startSportHistoryActivity(this.d, 10001, YogaStatisticProvider.this.getCourseCategory());
                    return;
                }
            }
            if ("BUTTON_TEXT".equals(str)) {
                HashMap map = new HashMap(10);
                map.put("click", 1);
                map.put(BleConstants.SPORT_TYPE, Integer.valueOf(YogaStatisticProvider.this.getType()));
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.EVENT_CLICK_FITNESS_COURSE_MORE.value(), map, 0);
                try {
                    JumpUtil.a(this.d, YogaStatisticProvider.this.getCourseCategory(), 1, "FITNESS_COURSE");
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("Track_Provider_Track_YogaStatisticProvider", "setClickListener ActivityNotFoundException.");
                }
            }
        }
    }

    private void b(Context context, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass5(context));
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Track_YogaStatisticProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return BaseApplication.getContext().getString(R.string.sug_my_yoga_class);
    }
}
