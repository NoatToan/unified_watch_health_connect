package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class oup extends BaseCalculator {
    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        d(i);
        b(i);
    }

    public int b(int i) {
        osf osfVarB = otl.b(BaseApplication.getContext()).b(14, new HashMap(2));
        if (!(osfVarB instanceof AchieveUserLevelInfo)) {
            return 1;
        }
        AchieveUserLevelInfo achieveUserLevelInfo = (AchieveUserLevelInfo) osfVarB;
        insertData(i, EnumAnnualType.REPORT_SUMARY.value(), 6002, String.valueOf(achieveUserLevelInfo.acquireUserLevel()));
        return achieveUserLevelInfo.acquireUserLevel();
    }

    private ArrayList<String> c(int i) {
        return owl.a(i, otl.b(BaseApplication.getContext()).d(8, new HashMap(2)));
    }

    public void d(int i) {
        ArrayList<String> arrayListC = c(i);
        if (njy.e(arrayListC)) {
            LogUtil.a("PLGACHIEVE_AchievementCalculator", "gainList null");
            return;
        }
        int size = arrayListC.size();
        insertData(i, EnumAnnualType.REPORT_SUMARY.value(), 6001, String.valueOf(size));
        a(i, size, arrayListC);
    }

    private void a(int i, int i2, ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(arrayList.get(i3));
            if (i3 != i2 - 1) {
                sb.append(",");
            }
        }
        insertData(i, EnumAnnualType.REPORT_REWARD.value(), 5001, sb.toString());
    }
}
