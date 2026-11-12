package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.Navigation;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.healthcourse.fragment.HealthCourseFragment;
import com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer;
import com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment;
import com.huawei.operation.utils.WebViewHelp;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hom implements PolymericCustomer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36988c;
    private int d;
    private String e;
    private String i;

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public List<FilterCondition> initFilterConditions(Navigation navigation) {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public boolean isSupportFilter() {
        return true;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public PolymericDataFragment createPolymericDataFragment() {
        return HealthCourseFragment.e(acquireFragmentParam());
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public void getPolymericIntentData(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("SKIP_ALL_COURSE_KEY");
            this.e = stringExtra;
            if (stringExtra == null) {
                this.e = "HEALTH_COURSE";
            }
            this.d = intent.getIntExtra("index", 0);
            this.f36987b = intent.getStringExtra(WebViewHelp.BI_KEY_PULL_FROM);
            this.f36986a = intent.getStringExtra("resourceId");
            this.i = intent.getStringExtra("resourceName");
            this.f36988c = CommonUtil.j(intent.getStringExtra("COURSE_PAGE_TYPE"));
        }
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public String getTitleText(Context context) {
        return context.getString(R.string.IDS_FitnessAdvice_all_courses);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public Navigation initActiveNavigation(List<Navigation> list) {
        if (list == null) {
            return null;
        }
        if (this.d != 0) {
            for (Navigation navigation : list) {
                if (navigation.getCategoryId() == this.d) {
                    return navigation;
                }
            }
        }
        return list.get(0);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer
    public Map<String, Object> acquireFragmentParam() {
        HashMap map = new HashMap(3);
        map.put(WebViewHelp.BI_KEY_PULL_FROM, this.f36987b);
        map.put("resourceId", this.f36986a);
        map.put("resourceName", this.i);
        map.put("COURSE_PAGE_TYPE", Integer.valueOf(this.f36988c));
        return map;
    }
}
