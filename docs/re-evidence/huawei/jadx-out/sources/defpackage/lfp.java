package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealthservice.R;
import com.huawei.hihealthservice.postprocessing.HiPostProcessAction;
import com.huawei.hihealthservice.postprocessing.HiPostProcessor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class lfp implements HiPostProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40043a = new Object();
    private final List<HiPostProcessAction> d;

    private lfp() {
        this.d = new CopyOnWriteArrayList();
        a();
    }

    private void a() {
        e("BloodPressure", R.string.IDS_blood_pressure_sync_title, R.string.IDS_blood_pressure_sync_notify, "messagecenter://BloodPressure?skipType=1&destination=com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity", 10002);
        e("VascularHealth", -1, R.string.IDS_vascular_health_sync_notify, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vascular-health?h5pro=true&urlType=4&from=7", DicDataTypeUtil.DataType.VASCULAR_HEALTH.value());
        e("HiHealthProcessor_PPG", R.string.IDS_ppg_sync_title, -1, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.ppg?h5pro=true&urlType=4&pName=com.huawei.health&dst=result&from=7", DicDataTypeUtil.DataType.ARRHYTHMIA_RESULT_TYPE.value());
        a("HiHealthProcessor_MedicalExamReport", R.string.IDS_medical_exam_report_generated_title, R.string.IDS_medical_exam_report_generated_content, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-record?h5pro=true&isNeedLogin=true&urlType=4&pName=com.huawei.health&path=micro_report_detail&from=2", DicDataTypeUtil.DataType.MEDICAL_EXAM_REPORT.value(), true);
    }

    private void e(String str, int i, int i2, String str2, int i3) {
        a(str, i, i2, str2, i3, false);
    }

    private void a(String str, int i, int i2, String str2, int i3, boolean z) {
        lfu lfuVar = new lfu(5L, TimeUnit.MINUTES);
        lfuVar.setModule("HiHealthService");
        lfuVar.setType(str);
        lfuVar.c(i);
        lfuVar.d(i2);
        lfuVar.a(str2);
        lfuVar.setPosition(2);
        lfuVar.setGroupSummary(z);
        lfq lfqVar = new lfq();
        lfqVar.a(Integer.valueOf(i3), lfuVar);
        this.d.add(lfqVar);
    }

    static class e {
        private static final lfp d = new lfp();
    }

    public static lfp c() {
        return e.d;
    }

    @Override // com.huawei.hihealthservice.postprocessing.HiPostProcessor
    public boolean process(HiHealthData hiHealthData) {
        HiHealthDictType hiHealthDictTypeI;
        int iL;
        ArrayList<HiPostProcessAction> arrayList = new ArrayList(this.d);
        HiHealthDataType.Category categoryD = HiHealthDataType.d(hiHealthData.getType());
        if (categoryD == HiHealthDataType.Category.SEQUENCE) {
            iL = hiHealthData.getType();
        } else {
            if (categoryD != HiHealthDataType.Category.POINT || (hiHealthDictTypeI = HiHealthDictManager.a(BaseApplication.getContext()).i(hiHealthData.getType())) == null) {
                return false;
            }
            iL = hiHealthDictTypeI.l();
        }
        if (iL == DicDataTypeUtil.DataType.VASCULAR_HEALTH.value() && !Utils.o()) {
            ReleaseLogUtil.d("HiH_HiDefaultPostProcessor", "VASCULAR_HEALTH not show in china");
            return false;
        }
        for (HiPostProcessAction hiPostProcessAction : arrayList) {
            if (hiPostProcessAction.getDataTypes().contains(Integer.valueOf(iL)) && hiPostProcessAction.beforePostProcessAction(hiHealthData, iL) && !hiPostProcessAction.postProcessAction(hiHealthData, iL)) {
                return false;
            }
        }
        return true;
    }
}
