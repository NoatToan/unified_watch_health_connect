package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.bean.AnnualReportFitness;
import com.huawei.pluginachievement.report.bean.AnnualReportFitnessRaw;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ovd extends BaseCalculator {
    private PluginAchieveAdapter d = getPluginAchieveAdapter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f44839b = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        b(i);
        d(i);
    }

    public void d(final int i) {
        if (this.d == null) {
            this.d = oru.a(BaseApplication.getContext()).getAdapter();
        }
        this.d.getAnnualFitnessRecord(BaseApplication.getContext(), oxi.a(i, true), oxi.a(i, false), new AchieveCallback() { // from class: ovd.4
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                ovd.this.d(obj, i);
            }
        });
    }

    public void b(final int i) {
        if (this.d == null) {
            LogUtil.a("PLGACHIEVE_FitnessCalculator", "mAchieveAdapter is null,return");
            return;
        }
        this.d.getAnnualFitnessReport(this.f44839b, oxi.a(i, true), oxi.a(i, false), new AchieveCallback() { // from class: ovd.1
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (!(obj instanceof List)) {
                    LogUtil.j("PLGACHIEVE_FitnessCalculator", "getAnnualFitnessData: data error");
                    return;
                }
                try {
                    List list = (List) obj;
                    if (list.size() != 0) {
                        ovd.this.d(owz.a(list, i), i);
                    } else {
                        LogUtil.a("PLGACHIEVE_FitnessCalculator", "getFitnessListData is empty,return");
                    }
                } catch (ClassCastException unused) {
                    LogUtil.e("PLGACHIEVE_FitnessCalculator", "getAnnualFitnessReport data ClassCastException");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void d(T t, int i) {
        if (!(t instanceof List)) {
            LogUtil.j("PLGACHIEVE_FitnessCalculator", "getAnnualFitnessReport: !(data instanceof List)");
            return;
        }
        try {
            List list = (List) t;
            if (list.size() == 0) {
                LogUtil.j("PLGACHIEVE_FitnessCalculator", "getFitnessListData is empty,return");
            } else if (i < 2022) {
                d(owz.a((List<AnnualReportFitnessRaw>) list), i);
            } else {
                d(owz.e((List<AnnualReportFitnessRaw>) list), i);
            }
        } catch (ClassCastException unused) {
            LogUtil.e("PLGACHIEVE_FitnessCalculator", "getAnnualFitnessReport data ClassCastException");
        }
    }

    private void d(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_FitnessCalculator", "saveRecordFitnessData data isEmpty.");
        } else {
            insertData(i, EnumAnnualType.REPORT_FITNESS.value(), 4007, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AnnualReportFitness annualReportFitness, int i) {
        if (annualReportFitness == null) {
            LogUtil.j("PLGACHIEVE_FitnessCalculator", "saveReportFitnessData annualReportFitness is null");
            return;
        }
        insertData(i, EnumAnnualType.REPORT_FITNESS.value(), 4003, String.valueOf(annualReportFitness.acquireMaxDuration()));
        insertData(i, EnumAnnualType.REPORT_FITNESS.value(), 4004, String.valueOf(annualReportFitness.acquireMaxDurationDay()));
        insertData(i, EnumAnnualType.REPORT_FITNESS.value(), 4005, String.valueOf(annualReportFitness.acquireDescription()));
        insertData(i, EnumAnnualType.REPORT_FITNESS.value(), 4001, String.valueOf(annualReportFitness.acquireTotalDuration()));
        insertData(i, EnumAnnualType.REPORT_FITNESS.value(), 4002, String.valueOf(annualReportFitness.acquireNumberOfTimes()));
    }
}
