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
public class hzd implements PolymericDataStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f37362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CourseApi f37363b;

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy
    public void init(Map<String, Object> map) {
        this.f37363b = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (map == null) {
            this.f37362a = new HashMap();
        } else {
            this.f37362a = map;
        }
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy
    public void getNavigationData(final MutableLiveData<NavigationFilter> mutableLiveData) {
        int iIntValue;
        if (this.f37363b == null) {
            return;
        }
        Map<String, Object> map = this.f37362a;
        if (map == null || !(map.get("COURSE_PAGE_TYPE") instanceof Integer) || (iIntValue = ((Integer) this.f37362a.get("COURSE_PAGE_TYPE")).intValue()) == 0) {
            iIntValue = 1;
        }
        this.f37363b.getAggregatePageByType(iIntValue, new UiCallback<NavigationFilter>() { // from class: hzd.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_FitnessCourseHandler", "getAggregatePageByType:", Integer.valueOf(i), str);
                mutableLiveData.postValue(null);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(NavigationFilter navigationFilter) {
                if (navigationFilter == null || navigationFilter.getLeftNavigations() == null) {
                    LogUtil.e("Suggestion_FitnessCourseHandler", "getAggregatePageByType data empty.");
                }
                mutableLiveData.postValue(navigationFilter);
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataStrategy
    public void getPolymericData(final MutableLiveData<Map<String, Object>> mutableLiveData, Object obj) {
        String str;
        if (!(obj instanceof WorkoutListBean)) {
            LogUtil.e("Suggestion_FitnessCourseHandler", "error param.");
            return;
        }
        if (this.f37363b == null) {
            LogUtil.j("Suggestion_FitnessCourseHandler", "getFilterWorkoutData() courseApi is null.");
            return;
        }
        final WorkoutListBean workoutListBean = (WorkoutListBean) obj;
        workoutListBean.setWorkoutType(new Integer[]{1});
        workoutListBean.setCourseType(2);
        workoutListBean.setSupportWear(-1);
        if ((this.f37362a.get("KEY_SUG_COURSE_REPLACE_STATUS") instanceof Boolean) && ((Boolean) this.f37362a.get("KEY_SUG_COURSE_REPLACE_STATUS")).booleanValue() && (this.f37362a.get("KEY_SUG_COURSE_REPLACE_ID") instanceof String) && (str = (String) this.f37362a.get("KEY_SUG_COURSE_REPLACE_ID")) != null) {
            workoutListBean.setReplacedWorkoutId(str);
        }
        final HashMap map = new HashMap();
        this.f37363b.getCoursesByFilter(workoutListBean, new UiPagingCallback<List<Workout>>() { // from class: hzd.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccessFirst(List<Workout> list) {
                LogUtil.a("Suggestion_FitnessCourseHandler", "getCoursesByFilter, onSuccess:", Integer.valueOf(list == null ? 0 : list.size()));
                map.put("visible_course_list", pea.b(list));
                map.put("is_success", true);
                map.put("data_owner_id", workoutListBean.getSearchCondition());
                map.put(PayPalPaymentIntent.ORDER, workoutListBean.getWorkoutRank());
                mutableLiveData.postValue(map);
            }

            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            public void onFailureFirst(int i, String str2) {
                LogUtil.j("Suggestion_FitnessCourseHandler", "getCoursesByFilter() ==Failed-- errorCode:", Integer.valueOf(i), "errorInfo:", str2);
                map.put("is_success", false);
                map.put("data_owner_id", workoutListBean.getSearchCondition());
                map.put(PayPalPaymentIntent.ORDER, workoutListBean.getWorkoutRank());
                mutableLiveData.postValue(map);
            }
        });
    }
}
