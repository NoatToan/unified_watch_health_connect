package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wey extends BaseOperate {
    public wey() {
        this.pageType = 104;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadInOneDayNoSource(vzo vzoVar) {
        vzoVar.e(new int[]{2034});
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
    public void setVarOfReadByMonthNoSource(vzo vzoVar) {
        vzoVar.e(new int[]{44306});
        vzoVar.d(new String[]{"pressure"});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthByDeviceSource(vzo vzoVar) {
        vzoVar.e(new int[]{2034});
        vzoVar.d(3);
        vzoVar.d(new String[]{"pressure"});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthByAppSource(vzo vzoVar) {
        setVarOfReadByMonthByDeviceSource(vzoVar);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        return recordDataProcess(list, 1005);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfRecordDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setIntValue(hiHealthData.getIntValue());
        privacyDataModel.setDataTitle(wgv.b(hiHealthData.getIntValue(), false));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setDataDesc(wig.d(hiHealthData.getStartTime()));
        privacyDataModel.setDataTitle(wgv.b(hiHealthData.getInt("pressure"), true));
        privacyDataModel.setStartTime(wgr.d(hiHealthData.getStartTime()));
        privacyDataModel.setEndTime(wgr.b(hiHealthData.getStartTime()));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public int[] getDeleteDataTypes(vzo vzoVar) {
        return new int[]{2034};
    }
}
