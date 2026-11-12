package com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders;

import android.content.Context;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public abstract class FitnessSeriesCourseProvider<T> extends FitnessEntranceProvider<T> {
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return !CommonUtil.ca();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a(getLogTag(), "loadData SeriesCourse");
        if (super.isNeedUpdate()) {
            ThreadPoolManager.c().execute(new c(this, sectionBean));
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<FitnessSeriesCourseProvider> f10153a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<SectionBean> f10154c;

        public c(FitnessSeriesCourseProvider fitnessSeriesCourseProvider, SectionBean sectionBean) {
            this.f10153a = new WeakReference<>(fitnessSeriesCourseProvider);
            this.f10154c = new WeakReference<>(sectionBean);
        }

        @Override // java.lang.Runnable
        public void run() {
            final FitnessSeriesCourseProvider fitnessSeriesCourseProvider = this.f10153a.get();
            final SectionBean sectionBean = this.f10154c.get();
            if (fitnessSeriesCourseProvider == null || sectionBean == null) {
                return;
            }
            LogUtil.a(fitnessSeriesCourseProvider.getLogTag(), "GetCourseTopicsRunnable start");
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                LogUtil.j(fitnessSeriesCourseProvider.getLogTag(), "getSeriesCourseRecord : courseApi is null.");
            } else {
                courseApi.getCourseTopicList(fitnessSeriesCourseProvider.getCourseCategory(), 0, new UiCallback<List<Topic>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessSeriesCourseProvider.c.2
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e(fitnessSeriesCourseProvider.getLogTag(), "failed to get series errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(List<Topic> list) {
                        if (njy.e(list)) {
                            LogUtil.j(fitnessSeriesCourseProvider.getLogTag(), "getCourseTopicList data is null");
                            return;
                        }
                        LogUtil.a(fitnessSeriesCourseProvider.getLogTag(), "getCourseTopicList List<Topic>", Integer.valueOf(list.size()));
                        sectionBean.c(list);
                        fitnessSeriesCourseProvider.mIsLoad = true;
                    }
                });
            }
        }
    }
}
