package com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import defpackage.ibu;
import defpackage.njy;
import defpackage.pea;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public abstract class FitnessMyCourseProvider extends FitnessEntranceProvider<List<ibu>> {
    private static final int PAGE_SIZE = 10;
    private static final String RELEASE_TAG = "R_FitnessMyCourseProvider";
    private static final String TAG = "FitnessMyCourseProvider";

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        this.mIsLoad = true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public List<ibu> getDefaultData() {
        List<ibu> cacheData = getCacheData(new TypeToken<List<ibu>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessMyCourseProvider.1
        }.getType());
        if (njy.e(cacheData)) {
            ReleaseLogUtil.d(RELEASE_TAG, " getDefaultData is empty.");
            return cacheData;
        }
        ReleaseLogUtil.c(RELEASE_TAG, " getDefaultData size is:", Integer.valueOf(cacheData.size()));
        return cacheData;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a(getLogTag(), "loadData MyCourse");
        getCourseData();
    }

    private void getCourseData() {
        LogUtil.a(getLogTag(), "getCourseData start");
        getCloudData(getCourseCategory() == 137 ? "YOGA_COURSE" : "FITNESS_COURSE");
    }

    private void getCloudData(String str) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            return;
        }
        courseApi.getUserCourseList(0, 10, 1, str, new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessMyCourseProvider.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.e(FitnessMyCourseProvider.this.getLogTag(), "getJoinedCourses failed errorCode:", Integer.valueOf(i), " errorInfo:", str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<Workout> list) {
                LogUtil.a(FitnessMyCourseProvider.this.getLogTag(), "getJoinedCourses success.", Integer.valueOf(njy.e(list) ? 0 : list.size()));
                List cloudFitWorkouts = FitnessMyCourseProvider.this.getCloudFitWorkouts(list);
                ArrayList arrayList = new ArrayList(cloudFitWorkouts.size());
                Iterator it = cloudFitWorkouts.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ibu.c().c((FitWorkout) it.next()).b());
                }
                FitnessMyCourseProvider.this.checkAndUpdateUi(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FitWorkout> getCloudFitWorkouts(List<Workout> list) {
        if (njy.e(list)) {
            LogUtil.j(getLogTag(), "getCloudFitWorkouts, list is empty");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (njy.b(list)) {
            getFitnessWorkout(pea.b(list), arrayList);
            sortFitnessByIntervals(arrayList);
        }
        return arrayList;
    }

    private void sortFitnessByIntervals(List<FitWorkout> list) {
        if (njy.e(list)) {
            LogUtil.j(getLogTag(), "sortFitnessByIntervals, list is empty");
        } else {
            Collections.sort(list, new Comparator<FitWorkout>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessMyCourseProvider.3
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int compare(FitWorkout fitWorkout, FitWorkout fitWorkout2) {
                    if (fitWorkout2 == null || fitWorkout == null) {
                        return fitWorkout == null ? -1 : 1;
                    }
                    int intervals = fitWorkout.getIntervals();
                    if (intervals < 0) {
                        intervals += 1000;
                    }
                    int intervals2 = fitWorkout2.getIntervals();
                    if (intervals2 < 0) {
                        intervals2 += 1000;
                    }
                    return intervals - intervals2;
                }
            });
        }
    }

    private void getFitnessWorkout(List<FitWorkout> list, List<FitWorkout> list2) {
        for (FitWorkout fitWorkout : list) {
            if (fitWorkout != null && fitWorkout.getWorkoutType() == 1 && fitWorkout.getIntervals() != -2) {
                list2.add(fitWorkout);
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return TAG;
    }
}
