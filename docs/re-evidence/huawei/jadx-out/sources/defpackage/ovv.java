package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import health.compact.a.UnitUtil;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes13.dex */
public class ovv extends BaseCalculator {
    private PluginAchieveAdapter d = getPluginAchieveAdapter();
    private Context e = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        c(i);
    }

    public void c(final int i) {
        if (this.d == null) {
            LogUtil.a("PLGACHIEVE_OperationActivityCalculator", "getAnnualActivityData() achieveAdapter is null,return");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.d.getAnnualActivityReport(this.e, i, new AchieveCallback() { // from class: ovv.2
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                countDownLatch.countDown();
                List<nsj> listD = oxf.d(obj);
                if (njy.e(listD)) {
                    LogUtil.j("PLGACHIEVE_OperationActivityCalculator", "getAnnualActivityData allActivitySimpleList is empty");
                } else {
                    ovv.this.b(i, oxf.d(listD, i));
                }
            }
        });
        oxi.d(countDownLatch, 8000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, List<nsj> list) {
        int iB;
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_OperationActivityCalculator", "generateActivityReport currentYearActivityList is empty");
            return;
        }
        int size = list.size();
        b(i, 10001, String.valueOf(size));
        int iE = oxf.e(list);
        b(i, 10002, UnitUtil.e((size <= 0 || iE > size) ? 0.0f : (iE * 1.0f) / size, 1, 2));
        if (i < 2022) {
            iB = oxf.d(list);
        } else {
            iB = oxf.b(list);
        }
        b(i, 10003, String.valueOf(iB));
    }

    private void b(int i, int i2, String str) {
        insertData(i, EnumAnnualType.REPORT_ACTIVITY.value(), i2, str);
    }
}
