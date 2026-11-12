package defpackage;

import android.os.Handler;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wef extends BaseOperate {
    public wef() {
        this.pageType = 110;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getValue() > 0.0d) {
                PrivacyDataModel privacyDataModel = new PrivacyDataModel();
                privacyDataModel.setStartTime(hiHealthData.getStartTime());
                privacyDataModel.setEndTime(hiHealthData.getEndTime());
                privacyDataModel.setModifyTime(hiHealthData.getModifiedTime());
                privacyDataModel.setDataDesc(wgr.a(hiHealthData, 1001));
                privacyDataModel.setPageType(110);
                privacyDataModel.setType(hiHealthData.getType());
                privacyDataModel.setClientId(hiHealthData.getClientId());
                privacyDataModel.setDoubleValue(hiHealthData.getValue());
                privacyDataModel.setDataTitle(wgv.e((float) hiHealthData.getValue()));
                arrayList.add(privacyDataModel);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthNoSource(vzo vzoVar) {
        vzoVar.e(new int[]{SmartMsgConstant.MSG_TYPE_RIDE_USER});
        vzoVar.d(new String[]{"climbStair"});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthByDeviceSource(vzo vzoVar) {
        setVarOfReadByMonthNoSource(vzoVar);
        vzoVar.e(new int[]{5});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadByMonthByAppSource(vzo vzoVar) {
        setVarOfReadByMonthNoSource(vzoVar);
        vzoVar.e(new int[]{5});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setDataTitle(wgv.e(hiHealthData.getFloat("climbStair")));
        privacyDataModel.setDataDesc(wig.d(hiHealthData.getStartTime()));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadInOneDayNoSource(vzo vzoVar) {
        vzoVar.e(new int[]{5});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadInOneDayByDeviceSource(vzo vzoVar) {
        setVarOfReadInOneDayNoSource(vzoVar);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readInOneDayByAppSource(long j, String str, String str2, int i, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        this.mHiHealthDataListRecursive.clear();
        HiAggregateOption hiAggregateOptionB = b(j);
        hiAggregateOptionB.setDeviceUuid(str);
        hiAggregateOptionB.setReadType(i);
        LogUtil.a("ClimbOperateImp", "readInOneDayByAppSource start");
        e(str2, hiAggregateOptionB, new AnonymousClass1(dataSourceCallback));
    }

    /* JADX INFO: renamed from: wef$1, reason: invalid class name */
    class AnonymousClass1 implements DataSourceCallback<List<HiHealthData>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DataSourceCallback f51934b;

        AnonymousClass1(DataSourceCallback dataSourceCallback) {
            this.f51934b = dataSourceCallback;
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResponse(final int i, List<HiHealthData> list) {
            LogUtil.a("ClimbOperateImp", "readInOneDayByAppSource end resultCode = ", Integer.valueOf(i));
            if (i != 0 || njy.e(list)) {
                Handler handler = wef.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.f51934b;
                handler.post(new Runnable() { // from class: weg
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(i, new ArrayList());
                    }
                });
            } else {
                final List<PrivacyDataModel> listProResultOfReadInOneDayNoSource = wef.this.proResultOfReadInOneDayNoSource(list);
                Handler handler2 = wef.this.mHandler;
                final DataSourceCallback dataSourceCallback2 = this.f51934b;
                handler2.post(new Runnable() { // from class: wek
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback2.onResponse(i, listProResultOfReadInOneDayNoSource);
                    }
                });
            }
        }
    }

    private HiAggregateOption b(long j) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(wgr.d(j));
        hiAggregateOption.setEndTime(wgr.b(j));
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(new String[]{"climbStair"});
        hiAggregateOption.setType(new int[]{5});
        hiAggregateOption.setAlignType(20001);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, final HiAggregateOption hiAggregateOption, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(str).e();
        LogUtil.e("ClimbOperateImp", "readInOneDayForApp start");
        HiHealthManager.d(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new HiAggregateListener() { // from class: wef.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.e("ClimbOperateImp", "readInOneDayForApp end errorCode = ", Integer.valueOf(i));
                if (i != 0) {
                    dataSourceCallback.onResponse(1, new ArrayList());
                    return;
                }
                if (list == null || list.isEmpty()) {
                    dataSourceCallback.onResponse(0, wef.this.mHiHealthDataListRecursive);
                    return;
                }
                wef.this.mHiHealthDataListRecursive.addAll(list);
                hiAggregateOption.setEndTime(list.get(list.size() - 1).getStartTime() - 1);
                wef.this.e(str, hiAggregateOption, dataSourceCallback);
            }
        });
    }
}
