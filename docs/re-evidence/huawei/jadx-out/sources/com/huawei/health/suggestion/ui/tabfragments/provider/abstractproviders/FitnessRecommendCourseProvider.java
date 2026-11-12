package com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders;

import android.content.Context;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import defpackage.ibs;
import defpackage.njy;
import defpackage.pea;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public abstract class FitnessRecommendCourseProvider<T> extends FitnessEntranceProvider<T> {
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return false;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a(getLogTag(), "loadData RecommendCourse");
        if (super.isNeedUpdate()) {
            ThreadPoolManager.c().execute(new d(this, sectionBean));
        }
    }

    protected void getLocalCourseData(SectionBean sectionBean) {
        LogUtil.a(getLogTag(), "getLocalCourseData");
        List<FitWorkout> listD = ibs.d(getCourseCategory());
        if (listD == null || listD.size() == 0) {
            LogUtil.a(getLogTag(), "local data is empty");
        } else {
            LogUtil.a(getLogTag(), "update ui from local data");
            sectionBean.c(listD);
        }
    }

    public static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<FitnessRecommendCourseProvider> f10149a;
        WeakReference<SectionBean> d;

        public d(FitnessRecommendCourseProvider fitnessRecommendCourseProvider, SectionBean sectionBean) {
            this.f10149a = new WeakReference<>(fitnessRecommendCourseProvider);
            this.d = new WeakReference<>(sectionBean);
        }

        @Override // java.lang.Runnable
        public void run() {
            final FitnessRecommendCourseProvider fitnessRecommendCourseProvider = this.f10149a.get();
            final SectionBean sectionBean = this.d.get();
            if (fitnessRecommendCourseProvider == null || sectionBean == null) {
                return;
            }
            LogUtil.a(fitnessRecommendCourseProvider.getLogTag(), "GetRecWorkoutRunnable start");
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                LogUtil.j(fitnessRecommendCourseProvider.getLogTag(), "getRecommendCourseRecord : courseApi is null.");
            } else {
                courseApi.getRecWorkoutByCourseType(fitnessRecommendCourseProvider.getCourseCategory(), new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessRecommendCourseProvider.d.3
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.j(fitnessRecommendCourseProvider.getLogTag(), "getRecWorkoutByCourseType onfalure errorCode:", Integer.valueOf(i), " errorInfo:", str);
                        fitnessRecommendCourseProvider.getLocalCourseData(sectionBean);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(List<Workout> list) {
                        if (njy.e(list)) {
                            LogUtil.e(fitnessRecommendCourseProvider.getLogTag(), "getRecWorkoutByCourseType onSuccess with null");
                            return;
                        }
                        LogUtil.a(fitnessRecommendCourseProvider.getLogTag(), "getRecommendCoursesByRules onSuccess List<FitWorkout> size:", Integer.valueOf(list.size()));
                        List<FitWorkout> listB = pea.b(list);
                        sectionBean.c(listB);
                        ibs.d(listB, fitnessRecommendCourseProvider.getCourseCategory());
                        fitnessRecommendCourseProvider.mIsLoad = true;
                    }
                });
            }
        }
    }
}
