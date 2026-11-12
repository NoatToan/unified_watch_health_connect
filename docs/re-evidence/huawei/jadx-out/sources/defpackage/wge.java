package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wge extends BaseOperate {
    public wge() {
        this.pageType = 103;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthNoSource(vzo vzoVar) {
        vzoVar.d(new String[]{"step"});
        vzoVar.e(new int[]{40002});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthByDeviceSource(vzo vzoVar) {
        setVarOfReadByMonthNoSource(vzoVar);
        vzoVar.e(new int[]{2});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthByAppSource(vzo vzoVar) {
        setVarOfReadByMonthNoSource(vzoVar);
        vzoVar.e(new int[]{2});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadInOneDayNoSource(vzo vzoVar) {
        vzoVar.e(new int[]{2});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadInOneDayByDeviceSource(vzo vzoVar) {
        setVarOfReadInOneDayNoSource(vzoVar);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadInOneDayByAppSource(vzo vzoVar) {
        setVarOfReadInOneDayNoSource(vzoVar);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        return recordDataProcess(list, 1001);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfRecordDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        int value = (int) hiHealthData.getValue();
        privacyDataModel.setIntValue(value);
        privacyDataModel.setDataTitle(wgv.g(value));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setDataTitle(wgv.g(hiHealthData.getInt("step")));
        privacyDataModel.setDataDesc(wig.d(hiHealthData.getStartTime()));
    }
}
