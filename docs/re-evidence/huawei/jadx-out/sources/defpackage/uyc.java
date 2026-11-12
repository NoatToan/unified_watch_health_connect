package defpackage;

import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarLineChartView;
import com.huawei.ui.main.stories.health.views.healthdata.bloodsugarview.BloodSugarDetectionDistributionView;
import com.huawei.ui.main.stories.template.BaseComponent;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class uyc extends wpt {
    public void e(String str, Map<Long, IStorageModel> map) {
        if (njy.b(this.f52331c)) {
            for (BaseComponent baseComponent : this.f52331c) {
                if (baseComponent instanceof BloodSugarDetectionDistributionView) {
                    ((BloodSugarDetectionDistributionView) baseComponent).setBloodSugarData(str, map);
                    return;
                }
            }
        }
    }

    public void e() {
        if (njy.b(this.f52331c)) {
            for (BaseComponent baseComponent : this.f52331c) {
                if (baseComponent instanceof BloodSugarLineChartView) {
                    ((BloodSugarLineChartView) baseComponent).updatePopGuide();
                    return;
                }
            }
        }
    }
}
