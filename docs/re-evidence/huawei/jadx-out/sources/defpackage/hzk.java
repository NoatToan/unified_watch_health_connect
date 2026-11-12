package defpackage;

import androidx.lifecycle.MutableLiveData;
import com.braintreepayments.api.PayPalPaymentIntent;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.NavigationFilter;
import com.huawei.basefitnessadvice.model.WorkoutListBean;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.ui.callback.UiPagingCallback;
import com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hzk implements PolymericDataStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CourseApi f37382a;

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy
    public void init(Map<String, Object> map) {
        this.f37382a = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy
    public void getNavigationData(final MutableLiveData<NavigationFilter> mutableLiveData) {
        CourseApi courseApi = this.f37382a;
        if (courseApi == null) {
            mutableLiveData.postValue(null);
        } else {
            courseApi.getAggregatePageByType(3, new UiCallback<NavigationFilter>() { // from class: hzk.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_RunCourseHandler", "getAggregatePageByType:", Integer.valueOf(i), str);
                    mutableLiveData.postValue(null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(NavigationFilter navigationFilter) {
                    if (navigationFilter == null || navigationFilter.getLeftNavigations() == null) {
                        LogUtil.e("Suggestion_RunCourseHandler", "getAggregatePageByType data empty.");
                    } else {
                        mutableLiveData.postValue(navigationFilter);
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy
    public void getPolymericData(final MutableLiveData<Map<String, Object>> mutableLiveData, Object obj) {
        if (obj instanceof WorkoutListBean) {
            if (this.f37382a == null) {
                LogUtil.j("Suggestion_RunCourseHandler", "getFilterWorkoutData() courseApi is null.");
                return;
            }
            final WorkoutListBean workoutListBean = (WorkoutListBean) obj;
            workoutListBean.setWorkoutType(new Integer[]{3, 2});
            workoutListBean.setCourseType(2);
            workoutListBean.setSupportWear(-1);
            if (workoutListBean.getSearchCondition() != null && workoutListBean.getSearchCondition().getLeftNavigationId() == 9999) {
                workoutListBean.setUserDefinedType(1);
            }
            final HashMap map = new HashMap();
            this.f37382a.getCoursesByFilter(workoutListBean, new UiPagingCallback<List<Workout>>() { // from class: hzk.5
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccessFirst(List<Workout> list) {
                    LogUtil.a("Suggestion_RunCourseHandler", "getCoursesByFilter, onSuccess:", Integer.valueOf(list == null ? 0 : list.size()));
                    List<FitWorkout> listB = pea.b(list);
                    if (workoutListBean.getUserDefinedType() != null && workoutListBean.getUserDefinedType().equals(1)) {
                        listB = hzk.this.a(listB);
                    }
                    map.put("visible_course_list", listB);
                    map.put("is_success", true);
                    map.put("data_owner_id", workoutListBean.getSearchCondition());
                    map.put(PayPalPaymentIntent.ORDER, workoutListBean.getWorkoutRank());
                    mutableLiveData.postValue(map);
                }

                @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
                public void onFailureFirst(int i, String str) {
                    LogUtil.j("Suggestion_RunCourseHandler", "getCoursesByFilter() ==Failed-- errorCode:", Integer.valueOf(i), "errorInfo:", str);
                    if (i == -1) {
                        map.put("is_success", true);
                    } else {
                        map.put("is_success", false);
                    }
                    map.put("data_owner_id", workoutListBean.getSearchCondition());
                    map.put(PayPalPaymentIntent.ORDER, workoutListBean.getWorkoutRank());
                    map.put("is_success", false);
                    mutableLiveData.postValue(map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FitWorkout> a(List<FitWorkout> list) {
        LogUtil.a("Suggestion_RunCourseHandler", "handleCoursesData.");
        if (njy.e(list)) {
            LogUtil.j("Suggestion_RunCourseHandler", "handleCoursesData is null.");
            return list;
        }
        Iterator<FitWorkout> it = list.iterator();
        while (it.hasNext()) {
            it.next().setCourseDefineType(1);
        }
        List<FitWorkout> listC = ibn.c(list);
        hjs.b().b(listC);
        return listC;
    }
}
