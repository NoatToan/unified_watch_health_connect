package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.ui.BaseFitnessSearchActivity;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessActionLibraryActivity;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessActionTypeActivity;
import com.huawei.health.suggestion.ui.fitness.helper.FitnessSearchAllHelper;
import com.huawei.health.suggestion.ui.fragment.FitSearchFragmentRecyclerView;
import com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class hjv extends FitnessSearchAllHelper implements FitnessSearchFragmentBar.OnQueryTextListener, FitSearchFragmentRecyclerView.LoadMoreListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f36828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BaseFitnessSearchActivity f36829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36830c;
    private int d;

    @Override // com.huawei.health.suggestion.ui.fitness.helper.FitnessSearchAllHelper, com.huawei.health.suggestion.ui.fragment.FitSearchFragmentRecyclerView.LoadMoreListener
    public void loadMore() {
    }

    public hjv(Activity activity) {
        super(activity, 2);
        this.d = 0;
        this.f36830c = 0;
        this.f36828a = new Handler(Looper.getMainLooper());
        if ((activity instanceof FitnessActionTypeActivity) || (activity instanceof FitnessActionLibraryActivity)) {
            this.f36829b = (BaseFitnessSearchActivity) activity;
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.FitnessSearchAllHelper, com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        e(str);
        return false;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.FitnessSearchAllHelper, com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        BaseFitnessSearchActivity baseFitnessSearchActivity;
        if (!TextUtils.isEmpty(str) || (baseFitnessSearchActivity = this.f36829b) == null) {
            return false;
        }
        baseFitnessSearchActivity.updateViewState();
        return false;
    }

    private void e(String str) {
        b();
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessActionSearchHelper", "queryRecords : courseApi is null.");
        } else {
            courseApi.searchCourseActionList(this.d, 50, this.f36830c, str, new UiCallback<List<AtomicAction>>() { // from class: hjv.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.j("Suggestion_FitnessActionSearchHelper", "searchActionList Search Action Lists Fauile");
                    hjv.this.b((List<AtomicAction>) null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<AtomicAction> list) {
                    hjv.this.b(list);
                }
            });
        }
    }

    private void b() {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        idy.b(AnalyticsValue.HEALTH_FITNESS_ACTION_SEARCH_1130033.value(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final List<AtomicAction> list) {
        this.f36828a.post(new Runnable() { // from class: hjv.4
            @Override // java.lang.Runnable
            public void run() {
                hjv.this.f36829b.clear();
                hjv.this.f36829b.resetData(list);
            }
        });
    }

    public void c(int i) {
        this.f36830c = i;
    }
}
