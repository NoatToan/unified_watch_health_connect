package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class ouy extends BaseCalculator {
    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        d(i);
    }

    public void d(int i) {
        SingleDayRecord singleDayRecordB = b();
        if (singleDayRecordB == null) {
            LogUtil.j("PLGACHIEVE_BestRecordCalculator", "singleDayRecord is null");
            return;
        }
        a(i, singleDayRecordB);
        c(i, singleDayRecordB);
        b(i, singleDayRecordB);
    }

    private SingleDayRecord b() {
        osf osfVarB = otl.b(BaseApplication.getContext()).b(2, new HashMap(2));
        if (osfVarB instanceof SingleDayRecord) {
            return (SingleDayRecord) osfVarB;
        }
        return null;
    }

    private void a(int i, SingleDayRecord singleDayRecord) {
        ozp ozpVarC = owl.c(singleDayRecord.acquireBestStepDay(), i);
        if (ozpVarC != null) {
            insertData(i, EnumAnnualType.REPORT_STEP.value(), 3003, String.valueOf(ozpVarC.d()));
            insertData(i, EnumAnnualType.REPORT_STEP.value(), 3004, String.valueOf(ozpVarC.a()));
        }
    }

    private void c(int i, SingleDayRecord singleDayRecord) {
        ozm ozmVarB = owl.b(singleDayRecord.acquireBestRunDistance(), i);
        if (ozmVarB != null) {
            insertData(i, EnumAnnualType.REPORT_RUN.value(), 2003, String.valueOf(ozmVarB.c()));
            insertData(i, EnumAnnualType.REPORT_RUN.value(), 2004, String.valueOf(ozmVarB.d()));
        }
    }

    private void b(int i, SingleDayRecord singleDayRecord) {
        ozm ozmVarB = owl.b(singleDayRecord.acquireBestCycleDistance(), i);
        if (ozmVarB != null) {
            insertData(i, EnumAnnualType.REPORT_CYCLE.value(), 1003, String.valueOf(ozmVarB.d()));
            insertData(i, EnumAnnualType.REPORT_CYCLE.value(), 1004, String.valueOf(ozmVarB.d()));
        }
    }
}
