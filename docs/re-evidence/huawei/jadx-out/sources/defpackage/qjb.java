package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.operation.utils.Constants;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qjb {
    private static List<String> d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f46301c;

    static {
        ArrayList arrayList = new ArrayList(10);
        d = arrayList;
        arrayList.add("com.huawei.health.MainActivity");
        d.add(ComponentInfo.PluginHealthModel_A_1);
        d.add("com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity");
        d.add("com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity");
        d.add("com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity");
        d.add("com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity");
        d.add("com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity");
        d.add("com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity");
        d.add("com.huawei.health.h5pro.core.H5ProWebViewActivity");
        d.add(Constants.KNIT_SLEEP_DETAIL_ACTIVITY);
        d.add("com.huawei.ui.main.stories.fitness.activity.active.KnitActiveRecordActivity");
        d.add(Constants.SPORT_HISTORY);
        d.add("com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity");
        d.add("com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity");
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final qjb f46302b = new qjb();
    }

    private qjb() {
    }

    public static qjb c() {
        return a.f46302b;
    }

    public void c(View view) {
        this.f46301c = view;
    }

    public View b() {
        return this.f46301c;
    }

    public void d(boolean z) {
        this.f46300b = z;
    }

    public boolean c(String str) {
        return this.f46300b && d.contains(str);
    }

    public void d() {
        View view = this.f46301c;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            LogUtil.b("MiniPlayerProvider", "remove minibar from old parent view");
            ((ViewGroup) this.f46301c.getParent()).removeView(this.f46301c);
        }
    }
}
