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
import com.huawei.pluginfitnessadvice.Workout;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hzf implements PolymericDataStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f37370c;
    private CourseApi e;

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy
    public void init(Map<String, Object> map) {
        this.e = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        this.f37370c = map;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy
    public void getNavigationData(final MutableLiveData<NavigationFilter> mutableLiveData) {
        int iIntValue;
        if (this.e == null) {
            mutableLiveData.postValue(null);
            return;
        }
        Map<String, Object> map = this.f37370c;
        if (map == null || !(map.get("COURSE_PAGE_TYPE") instanceof Integer) || (iIntValue = ((Integer) this.f37370c.get("COURSE_PAGE_TYPE")).intValue()) == 0) {
            iIntValue = 2;
        }
        this.e.getAggregatePageByType(iIntValue, new UiCallback<NavigationFilter>() { // from class: hzf.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_HealthCourseHandler", "getAggregatePageByType:", Integer.valueOf(i), str);
                mutableLiveData.postValue(null);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(NavigationFilter navigationFilter) {
                if (navigationFilter == null || navigationFilter.getLeftNavigations() == null) {
                    LogUtil.e("Suggestion_HealthCourseHandler", "getAggregatePageByType data empty.");
                }
                mutableLiveData.postValue(navigationFilter);
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy
    public void getPolymericData(final MutableLiveData<Map<String, Object>> mutableLiveData, Object obj) {
        if (!(obj instanceof WorkoutListBean)) {
            LogUtil.e("Suggestion_HealthCourseHandler", "error param.");
            return;
        }
        if (this.e == null) {
            LogUtil.j("Suggestion_HealthCourseHandler", "getFilterWorkoutData() courseApi is null.");
            return;
        }
        final WorkoutListBean workoutListBean = (WorkoutListBean) obj;
        if (workoutListBean.getCourseType() == 1000623) {
            workoutListBean.setCourseType(1);
        } else {
            workoutListBean.setCourseType(0);
        }
        final HashMap map = new HashMap();
        this.e.getCoursesByFilter(workoutListBean, new UiPagingCallback<List<Workout>>() { // from class: hzf.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccessFirst(List<Workout> list) {
                LogUtil.a("Suggestion_HealthCourseHandler", "getCoursesByFilter, onSuccess:", Integer.valueOf(list == null ? 0 : list.size()));
                map.put("visible_course_list", pea.a(list));
                map.put("is_success", true);
                map.put("data_owner_id", workoutListBean.getSearchCondition());
                map.put(PayPalPaymentIntent.ORDER, workoutListBean.getWorkoutRank());
                mutableLiveData.postValue(map);
            }

            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            public void onFailureFirst(int i, String str) {
                LogUtil.j("Suggestion_HealthCourseHandler", "getCoursesByFilter() ==Failed-- errorCode:", Integer.valueOf(i), "errorInfo:", str);
                map.put("is_success", false);
                map.put("data_owner_id", workoutListBean.getSearchCondition());
                map.put(PayPalPaymentIntent.ORDER, workoutListBean.getWorkoutRank());
                mutableLiveData.postValue(map);
            }
        });
    }
}
