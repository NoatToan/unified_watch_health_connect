package com.huawei.health.suggestion.ui.polymericpage.model;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.Navigation;
import com.huawei.basefitnessadvice.model.NavigationFilter;
import com.huawei.basefitnessadvice.model.SearchCondition;
import com.huawei.basefitnessadvice.model.WorkoutListBean;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.hzd;
import defpackage.hzf;
import defpackage.hzk;
import defpackage.irz;
import defpackage.njy;
import defpackage.peh;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class PolymericDataViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MutableLiveData<NavigationFilter> f9827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PolymericDataStrategy f9829c;
    private Map<String, Object> d;
    private MutableLiveData<Map<String, Object>> e;
    private WorkoutListBean j;

    public void a(String str, Map<String, Object> map) {
        if (str == null) {
            LogUtil.e("Suggestion_PolymericDataViewModel", "pageType is null or empty in init");
            this.f9828b = "";
        } else {
            this.f9828b = str;
        }
        if (map == null) {
            this.d = new HashMap();
        } else {
            this.d = map;
        }
        this.d.put("PAGE_TYPE", this.f9828b);
        LogUtil.a("Suggestion_PolymericDataViewModel", "init view model.", this.f9828b);
        if (this.f9828b.equals("RUNNING_COURSE")) {
            this.f9829c = new hzk();
        } else if (this.f9828b.equals("FITNESS_COURSE") || this.f9828b.equals("")) {
            this.f9829c = new hzd();
        } else if (this.f9828b.equals("HEALTH_COURSE")) {
            this.f9829c = new hzf();
        } else {
            LogUtil.e("Suggestion_PolymericDataViewModel", "page type un know.");
            return;
        }
        this.f9829c.init(this.d);
    }

    public String b() {
        return TextUtils.isEmpty(this.f9828b) ? "" : this.f9828b;
    }

    public int c() {
        WorkoutListBean workoutListBean = this.j;
        if (workoutListBean == null || workoutListBean.getSearchCondition() == null) {
            return 0;
        }
        return this.j.getSearchCondition().getLeftNavigationId();
    }

    public SearchCondition d() {
        WorkoutListBean workoutListBean = this.j;
        if (workoutListBean == null) {
            return null;
        }
        return workoutListBean.getSearchCondition();
    }

    public Navigation b(int i) {
        NavigationFilter value = this.f9827a.getValue();
        if (value == null || njy.e(value.getLeftNavigations())) {
            return null;
        }
        for (Navigation navigation : value.getLeftNavigations()) {
            if (navigation.getValue() == i) {
                return navigation;
            }
        }
        return null;
    }

    public void a() {
        LogUtil.a("Suggestion_PolymericDataViewModel", "getNavigationData.");
        if (this.f9827a == null) {
            this.f9827a = new MutableLiveData<>();
        }
        PolymericDataStrategy polymericDataStrategy = this.f9829c;
        if (polymericDataStrategy == null) {
            this.f9827a.postValue(null);
        } else {
            polymericDataStrategy.getNavigationData(this.f9827a);
        }
    }

    public void d(Navigation navigation, List<FilterCondition> list, boolean z, int i) {
        if (this.f9829c == null || navigation == null) {
            return;
        }
        WorkoutListBean workoutListBeanE = e(navigation, list, z, i);
        this.j = workoutListBeanE;
        LogUtil.a("Suggestion_PolymericDataViewModel", "doFilter:", peh.c(workoutListBeanE));
        this.f9829c.getPolymericData(this.e, this.j);
    }

    private WorkoutListBean e(Navigation navigation, List<FilterCondition> list, boolean z, int i) {
        WorkoutListBean workoutListBean = new WorkoutListBean();
        workoutListBean.setCourseType(navigation.getCategoryType());
        if (!VersionControlUtil.isSupportOperationAccount()) {
            workoutListBean.setCommodityFlag(0);
        }
        e(navigation, list, workoutListBean);
        if (navigation.getValue() == 9999) {
            workoutListBean.setUseCache(false);
        } else {
            workoutListBean.setUseCache(z);
        }
        workoutListBean.setPageStart(i * 10);
        workoutListBean.setPageSize(10);
        return workoutListBean;
    }

    private void e(Navigation navigation, List<FilterCondition> list, WorkoutListBean workoutListBean) {
        ArrayList arrayList;
        FilterCondition filterCondition = null;
        if (njy.e(list)) {
            arrayList = new ArrayList(0);
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            for (FilterCondition filterCondition2 : list) {
                if (filterCondition2 == null || filterCondition2.getType() != 1000612) {
                    arrayList2.add(filterCondition2);
                } else {
                    filterCondition = filterCondition2;
                }
            }
            arrayList = arrayList2;
        }
        workoutListBean.setSearchCondition(new SearchCondition.Builder().leftNavigationId(navigation.getValue()).filterConditions(arrayList).build());
        a(workoutListBean, filterCondition);
    }

    private void a(WorkoutListBean workoutListBean, FilterCondition filterCondition) {
        if (filterCondition != null && njy.b(filterCondition.getFilterOptions())) {
            workoutListBean.setWorkoutRank(Integer.valueOf(filterCondition.getFilterOptions().get(0).getCategoryId()));
        } else {
            a(workoutListBean);
        }
    }

    private void a(WorkoutListBean workoutListBean) {
        boolean zBooleanValue = this.d.get("KEY_SUG_COURSE_REPLACE_STATUS") instanceof Boolean ? ((Boolean) this.d.get("KEY_SUG_COURSE_REPLACE_STATUS")).booleanValue() : false;
        boolean zE = e();
        ReleaseLogUtil.d("Suggestion_PolymericDataViewModel", "setDefaultWorkoutRank isReplaceCourseOperation", Boolean.valueOf(zBooleanValue), " isVip:", Boolean.valueOf(zE), " mPageType:", this.f9828b);
        if (zE && !zBooleanValue) {
            workoutListBean.setWorkoutRank(6);
            return;
        }
        if (zBooleanValue) {
            workoutListBean.setWorkoutRank(5);
        } else if ("HEALTH_COURSE".equals(this.f9828b)) {
            workoutListBean.setWorkoutRank(0);
        } else {
            workoutListBean.setWorkoutRank(1);
        }
    }

    private boolean e() {
        UserMemberInfo userMemberInfoA = irz.a();
        if (userMemberInfoA != null) {
            return userMemberInfoA.getMemberFlag() == 1 && !irz.d(userMemberInfoA);
        }
        LogUtil.j("Suggestion_PolymericDataViewModel", "isVip userMemberInfo == null");
        return false;
    }

    public void a(int i, boolean z) {
        if (this.j == null || this.f9829c == null) {
            LogUtil.e("Suggestion_PolymericDataViewModel", "mSelectItems == null or mPolymericDataHandler == null.");
            return;
        }
        LogUtil.a("Suggestion_PolymericDataViewModel", "loadMoreData:", Integer.valueOf(i), " isUseCache:", Boolean.valueOf(z));
        this.j.setUseCache(z);
        this.j.setPageStart(i * 10);
        this.f9829c.getPolymericData(this.e, this.j);
    }

    public void a(LifecycleOwner lifecycleOwner, Observer<Map<String, Object>> observer) {
        if (lifecycleOwner == null || observer == null) {
            LogUtil.j("Suggestion_PolymericDataViewModel", "observePolymericData() is null");
            return;
        }
        if (this.e == null) {
            this.e = new MutableLiveData<>();
        }
        this.e.observe(lifecycleOwner, observer);
    }

    public void e(LifecycleOwner lifecycleOwner, Observer<NavigationFilter> observer) {
        if (lifecycleOwner == null || observer == null) {
            LogUtil.j("Suggestion_PolymericDataViewModel", "observePolymericData() is null");
            return;
        }
        if (this.f9827a == null) {
            this.f9827a = new MutableLiveData<>();
        }
        this.f9827a.observe(lifecycleOwner, observer);
    }

    public void b(Observer<Map<String, Object>> observer) {
        if (observer == null) {
            LogUtil.j("Suggestion_PolymericDataViewModel", "removeNavigationObserve() is null");
            return;
        }
        MutableLiveData<Map<String, Object>> mutableLiveData = this.e;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(observer);
        }
    }

    public void d(Observer<NavigationFilter> observer) {
        if (observer == null) {
            LogUtil.j("Suggestion_PolymericDataViewModel", "removeNavigationObserve() is null");
            return;
        }
        MutableLiveData<NavigationFilter> mutableLiveData = this.f9827a;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(observer);
        }
    }
}
