package defpackage;

import android.util.SparseArray;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wfa extends BaseOperate {
    public wfa() {
        this.pageType = CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthNoSource(final DataSourceCallback<List<whz>> dataSourceCallback) {
        final vzo vzoVarB = b();
        vzoVarB.a(0);
        vzoVarB.e(new int[]{DicDataTypeUtil.DataType.MAX_SKIN_TEMPERATURE.value(), DicDataTypeUtil.DataType.MIN_SKIN_TEMPERATURE.value()});
        readHiHealthDataPro(vzoVarB, new DataSourceCallback() { // from class: wfb
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.d.c(dataSourceCallback, vzoVarB, i, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void c(final DataSourceCallback dataSourceCallback, vzo vzoVar, final int i, SparseArray sparseArray) {
        if (i != 0 || sparseArray == null || sparseArray.size() == 0) {
            this.mHandler.post(new Runnable() { // from class: wfe
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        if (sparseArray.get(vzoVar.o()[0]) != null) {
            this.mMaxDataList.addAll((Collection) sparseArray.get(vzoVar.o()[0]));
        }
        if (sparseArray.get(vzoVar.o()[1]) != null) {
            this.mMinDataList.addAll((Collection) sparseArray.get(vzoVar.o()[1]));
        }
        final List<whz> listHiHealthDataProcess = hiHealthDataProcess(mergeMaxMinList(this.mMaxDataList, this.mMinDataList));
        this.mHandler.post(new Runnable() { // from class: wfg
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(i, listHiHealthDataProcess);
            }
        });
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByDeviceSource(String str, int i, String str2, DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVarB = b();
        vzoVarB.a(i);
        vzoVarB.e(str);
        vzoVarB.c(str2);
        vzoVarB.d(new String[]{"maxSkinTemperature"});
        a(vzoVarB, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByAppSource(String str, DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVarB = b();
        vzoVarB.a(1);
        vzoVarB.c(str);
        vzoVarB.d(new String[]{"maxSkinTemperature"});
        a(vzoVarB, dataSourceCallback);
    }

    private vzo b() {
        vzo vzoVar = new vzo();
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()});
        vzoVar.a(0L);
        vzoVar.e(System.currentTimeMillis());
        vzoVar.d(4);
        return vzoVar;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDayDataNoSource */
    public void m1745xae5c7554(vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()});
        vzoVar.b(true);
        readForOneDayDatas(vzoVar, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDayDataBySource */
    public void m1744xa7339313(vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()});
        vzoVar.b(true);
        readForOneDayDatas(vzoVar, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readInOneDayByDeviceSource(long j, String str, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzo vzoVarB = b(j);
        vzoVarB.a(2);
        vzoVarB.e(str);
        readForOneDayDatas(vzoVarB, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readInOneDayByAppSource(long j, String str, String str2, int i, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzo vzoVarB = b(j);
        vzoVarB.a(i);
        vzoVarB.e(str);
        vzoVarB.c(str2);
        readForOneDayDatas(vzoVarB, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public int[] getDeleteDataTypes(vzo vzoVar) {
        return new int[]{DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()};
    }

    private vzo b(long j) {
        vzo vzoVar = new vzo();
        vzoVar.a(wgr.d(j));
        vzoVar.e(wgr.b(j));
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()});
        return vzoVar;
    }

    private void a(final vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        aggregateProMaxAndMin(vzoVar, new DataSourceCallback() { // from class: wff
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51975a.d(dataSourceCallback, vzoVar, i, (List) obj);
            }
        });
    }

    /* synthetic */ void d(final DataSourceCallback dataSourceCallback, final vzo vzoVar, final int i, final List list) {
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wfh
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        transKeyToValue(list, this.mMaxDataList, vzoVar);
        vzoVar.d(new String[]{"minSkinTemperature"});
        vzoVar.d(5);
        aggregateProMaxAndMin(vzoVar, new DataSourceCallback() { // from class: wfd
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.e.b(list, dataSourceCallback, i, vzoVar, i2, (List) obj);
            }
        });
    }

    /* synthetic */ void b(List list, final DataSourceCallback dataSourceCallback, final int i, vzo vzoVar, int i2, List list2) {
        if (i2 != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wez
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        transKeyToValue(list2, this.mMinDataList, vzoVar);
        final List<whz> listHiHealthDataProcess = hiHealthDataProcess(mergeMaxMinList(this.mMaxDataList, this.mMinDataList));
        this.mHandler.post(new Runnable() { // from class: wfc
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(i, listHiHealthDataProcess);
            }
        });
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        return recordDataProcess(list, 1005);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setDataTitle(wgv.c(hiHealthData.getDouble("maxTemperature"), hiHealthData.getDouble("minTemperature")));
        privacyDataModel.setDataDesc(wig.d(hiHealthData.getStartTime()));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfRecordDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setDoubleValue(hiHealthData.getValue());
        privacyDataModel.setDataTitle(wgv.c(hiHealthData.getValue()));
    }
}
