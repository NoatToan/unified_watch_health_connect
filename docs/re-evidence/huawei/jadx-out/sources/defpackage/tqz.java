package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.main.stories.configuredpage.RequestRunCourseRecommend;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class tqz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f49556a = new Object();
    private static volatile tqz e;
    private List<RequestRunCourseRecommend> d = new ArrayList();

    private tqz() {
    }

    public static tqz d() {
        if (e == null) {
            synchronized (f49556a) {
                if (e == null) {
                    e = new tqz();
                }
            }
        }
        return e;
    }

    public void d(int i, FragmentManager fragmentManager, ArrayList<FitWorkout> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.j("ConfiguredListPage", "recommendWorkoutList isEmpty");
            return;
        }
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        BaseFragment baseFragmentCreateFitnessInstanceFragment = fitnessAdviceApi != null ? fitnessAdviceApi.createFitnessInstanceFragment(2, 0) : null;
        if (baseFragmentCreateFitnessInstanceFragment == null) {
            LogUtil.j("ConfiguredListPage", "addCourseRecommendFragment runCourseRecommendFragment == null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("recommendCourse", arrayList);
        baseFragmentCreateFitnessInstanceFragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(i, baseFragmentCreateFitnessInstanceFragment).commitAllowingStateLoss();
    }
}
