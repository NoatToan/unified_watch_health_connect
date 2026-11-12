package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.FilterOption;
import com.huawei.basefitnessadvice.model.Navigation;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.fragment.SportAllCourseListFragment;
import com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer;
import com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hnp implements PolymericCustomer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36960a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36962c;
    private ArrayList<String> e;
    private String f;
    private String h;
    private int g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36961b = 0;
    private boolean d = false;
    private boolean j = false;

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public PolymericDataFragment createPolymericDataFragment() {
        return SportAllCourseListFragment.e(this.d, this.e, this.j);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public void getPolymericIntentData(Intent intent) {
        String stringExtra = intent.getStringExtra("SKIP_ALL_COURSE_KEY");
        this.f = stringExtra;
        if (stringExtra == null) {
            this.f = "";
        }
        this.f36962c = CommonUtil.j(intent.getStringExtra("COURSE_PAGE_TYPE"));
        this.g = intent.getIntExtra("index", 0);
        this.f36961b = intent.getIntExtra("COURSE_CATEGORY_KEY", 0);
        int iA = lsk.a(intent.getStringExtra("KEY_SECOND_CATEGORY_INDEX"), 10);
        if (iA > 0) {
            this.f36960a = iA;
        }
        this.d = intent.getBooleanExtra("KEY_SUG_COURSE_ADD_STATUS", false);
        this.j = intent.getBooleanExtra("KEY_SUG_COURSE_REPLACE_STATUS", false);
        this.h = intent.getStringExtra("KEY_SUG_COURSE_REPLACE_ID");
        try {
            this.e = intent.getStringArrayListExtra("KEY_SUG_COURSE_ADD_IDS");
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.e("Suggestion_SportPolymericCustomer", "get added course id fail");
        }
        String str = this.f;
        int i = this.f36960a;
        int i2 = this.g;
        int i3 = this.f36961b;
        boolean z = this.d;
        ReleaseLogUtil.d("Suggestion_SportPolymericCustomer", "mPageType:", str, "mEquipmentId:", Integer.valueOf(i), " mTabIndex:", Integer.valueOf(i2), " mCourseCategory:", Integer.valueOf(i3), " mIsAddCourse:", Boolean.valueOf(z), " mAddCourseId:", this.e);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public boolean isSupportFilter() {
        return !this.f.equals("RUNNING_COURSE");
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public String getTitleText(Context context) {
        if (TextUtils.equals(this.f, "FITNESS_COURSE")) {
            return context.getString(R.string.IDS_FitnessAdvice_all_fitness_courses);
        }
        if (TextUtils.equals(this.f, "RUNNING_COURSE")) {
            return context.getString(R.string.IDS_fitness_advice_run_all_running_courses);
        }
        return context.getString(R.string.IDS_FitnessAdvice_all_courses);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public Navigation initActiveNavigation(List<Navigation> list) {
        if (njy.e(list)) {
            return null;
        }
        Navigation navigationB = b(list, this.f36961b);
        if (navigationB != null) {
            return navigationB;
        }
        c();
        Navigation navigationB2 = b(list, this.g);
        if (navigationB2 != null) {
            return navigationB2;
        }
        for (Navigation navigation : list) {
            if (navigation.getValue() == 0) {
                return navigation;
            }
        }
        return list.get(0);
    }

    private void c() {
        if (this.g == 13546) {
            this.g = 283;
        }
        if (this.g == 11087) {
            this.g = 137;
        }
    }

    private Navigation b(List<Navigation> list, int i) {
        if (i == 0) {
            return null;
        }
        for (Navigation navigation : list) {
            if (navigation.getCategoryId() == i) {
                return navigation;
            }
        }
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public List<FilterCondition> initFilterConditions(Navigation navigation) {
        ArrayList arrayList = new ArrayList();
        if (navigation != null && navigation.getFilterConditions() != null) {
            for (FilterCondition filterCondition : navigation.getFilterConditions()) {
                if (filterCondition.getFilterOptions() != null) {
                    c(arrayList, filterCondition, this.f36960a);
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public Map<String, Object> acquireFragmentParam() {
        HashMap map = new HashMap();
        map.put("SKIP_ALL_COURSE_KEY", this.f);
        map.put("KEY_SUG_COURSE_ADD_STATUS", Boolean.valueOf(this.d));
        map.put("KEY_SUG_COURSE_REPLACE_STATUS", Boolean.valueOf(this.j));
        map.put("KEY_SUG_COURSE_ADD_IDS", this.e);
        map.put("KEY_SUG_COURSE_REPLACE_ID", this.h);
        map.put("COURSE_PAGE_TYPE", Integer.valueOf(this.f36962c));
        return map;
    }

    private void c(List<FilterCondition> list, FilterCondition filterCondition, int i) {
        for (FilterOption filterOption : filterCondition.getFilterOptions()) {
            if (i != 0 && filterOption.getCategoryId() == i) {
                list.add(new FilterCondition.Builder().value(filterCondition.getValue()).filterOptions(Collections.singletonList(filterOption)).type(filterCondition.getType()).categoryId(filterCondition.getCategoryId()).build());
                return;
            }
        }
    }
}
