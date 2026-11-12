package defpackage;

import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wgc extends BaseOperate {
    public wgc() {
        this.pageType = AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthByDeviceSource(vzo vzoVar) {
        vzoVar.e(new int[]{2004});
        vzoVar.d(new String[]{"weight"});
        vzoVar.d(3);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthByAppSource(vzo vzoVar) {
        vzoVar.e(new int[]{2004});
        vzoVar.d(new String[]{"weight"});
        vzoVar.d(3);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadInOneDayByDeviceSource(vzo vzoVar) {
        vzoVar.e(new int[]{2004});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadInOneDayByAppSource(vzo vzoVar) {
        vzoVar.e(new int[]{2004});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        return recordDataProcess(list, 1005);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfRecordDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        double dB = UnitUtil.b(hiHealthData.getValue(), 1);
        privacyDataModel.setDoubleValue(dB);
        privacyDataModel.setDataTitle(wgv.e(dB, false));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setDataTitle(wgv.e(UnitUtil.b(hiHealthData.getDouble("weight"), 1), true));
        privacyDataModel.setDataDesc(wig.d(hiHealthData.getStartTime()));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public int[] getDeleteDataTypes(vzo vzoVar) {
        return HiHealthDataType.e(10006);
    }
}
