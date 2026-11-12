package com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.model.fitness.FitnessAchieveInfoUseCase;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.dex;
import defpackage.iet;
import defpackage.lsl;
import defpackage.njy;
import defpackage.ntx;
import defpackage.peh;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public abstract class FitnessStatisticProvider<T> extends FitnessEntranceProvider<T> {
    private final Observer mLoginStatusChangeObserver = new Observer() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessStatisticProvider.4
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            ReleaseLogUtil.d(FitnessStatisticProvider.this.getLogTag(), "login status changed label = ", str, ", args = ", objArr);
            if (str != null && "com.huawei.plugin.account.login".equals(str)) {
                FitnessStatisticProvider.this.mNeedRefresh = true;
            }
        }
    };
    private volatile boolean mNeedRefresh;

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase = new FitnessAchieveInfoUseCase();
        String strB = dex.b(String.valueOf(getType()));
        LogUtil.a(getLogTag(), "loadDefaultData() jsonDataStr: ", strB);
        if (!TextUtils.isEmpty(strB)) {
            FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase2 = (FitnessAchieveInfoUseCase) peh.b(strB, FitnessAchieveInfoUseCase.class);
            if (fitnessAchieveInfoUseCase2 == null) {
                sectionBean.c(fitnessAchieveInfoUseCase);
                return;
            }
            if (fitnessAchieveInfoUseCase2.getTimeStamp() < lsl.r(System.currentTimeMillis()) || fitnessAchieveInfoUseCase2.getTimeStamp() > lsl.c(System.currentTimeMillis())) {
                fitnessAchieveInfoUseCase2.setTodayTime(0);
                LogUtil.a(getLogTag(), "loadDefaultData() not in the same day data");
            }
            fitnessAchieveInfoUseCase = fitnessAchieveInfoUseCase2;
        }
        LogUtil.a(getLogTag(), "loadDefaultData() data: ", fitnessAchieveInfoUseCase.toString());
        sectionBean.c(fitnessAchieveInfoUseCase);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(final Context context, final SectionBean sectionBean) {
        LogUtil.a(getLogTag(), "loadData course statistic");
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi != null) {
            recordApi.acquireDetailFitnessRecords(new ntx.d().b(0L).d(System.currentTimeMillis()).e(getCourseCategory()).a(), new IBaseResponseCallback() { // from class: idc
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.m1240xc472b3f5(context, sectionBean, i, obj);
                }
            });
        } else {
            LogUtil.e(getLogTag(), "cannot get recordApi");
            sectionBean.c(new FitnessAchieveInfoUseCase());
        }
        ObserverManagerUtil.d(this.mLoginStatusChangeObserver, "com.huawei.plugin.account.login");
    }

    /* JADX INFO: renamed from: lambda$loadData$0$com-huawei-health-suggestion-ui-tabfragments-provider-abstractproviders-FitnessStatisticProvider, reason: not valid java name */
    public /* synthetic */ void m1240xc472b3f5(Context context, SectionBean sectionBean, int i, Object obj) {
        LogUtil.a(getLogTag(), "acquireSummaryFitnessRecordByCategory errorCode:", Integer.valueOf(i));
        if (!LoginInit.getInstance(context).getIsLogined()) {
            sectionBean.c(new FitnessAchieveInfoUseCase());
            return;
        }
        if (njy.b(obj, WorkoutRecord.class)) {
            FitnessAchieveInfoUseCase fitnessAchieveInfoUseCaseD = iet.d((List<WorkoutRecord>) obj);
            if (fitnessAchieveInfoUseCaseD == null) {
                fitnessAchieveInfoUseCaseD = new FitnessAchieveInfoUseCase();
            }
            if (refreshCacheAndUI(fitnessAchieveInfoUseCaseD) || this.mNeedRefresh) {
                LogUtil.a(getLogTag(), "FitnessStatisticProvider mNeedRefresh:", Boolean.valueOf(this.mNeedRefresh));
                sectionBean.c(fitnessAchieveInfoUseCaseD);
                this.mNeedRefresh = false;
            }
        }
    }

    private boolean refreshCacheAndUI(FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase2 = (FitnessAchieveInfoUseCase) peh.b(dex.b(String.valueOf(getType())), FitnessAchieveInfoUseCase.class);
        if (fitnessAchieveInfoUseCase2 != null && fitnessAchieveInfoUseCase2.equals(fitnessAchieveInfoUseCase)) {
            LogUtil.a(getLogTag(), "same cache data");
            return false;
        }
        LogUtil.a(getLogTag(), "refresh cache");
        int type = getType();
        dex.a(String.valueOf(type), peh.c(fitnessAchieveInfoUseCase));
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        ObserverManagerUtil.a(this.mLoginStatusChangeObserver, "com.huawei.plugin.account.login");
    }
}
