package defpackage;

import android.util.SparseArray;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes19.dex */
public class wcv extends BaseOperate {
    public wcv() {
        this.pageType = 108;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public int[] getDeleteDataTypes(vzo vzoVar) {
        return HiHealthDataType.e(10001);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByDeviceSource(String str, int i, String str2, DataSourceCallback<List<whz>> dataSourceCallback) {
        this.mHiHealthDataListRecursive.clear();
        vzo vzoVar = new vzo();
        vzoVar.e(str);
        vzoVar.c(str2);
        vzoVar.a(i);
        ThreadPoolManager.c().execute(c(vzoVar, dataSourceCallback));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByAppSource(String str, DataSourceCallback<List<whz>> dataSourceCallback) {
        this.mHiHealthDataListRecursive.clear();
        vzo vzoVar = new vzo();
        vzoVar.a(1);
        vzoVar.c(str);
        ThreadPoolManager.c().execute(c(vzoVar, dataSourceCallback));
    }

    Runnable c(final vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        final int[] iArr = {2015, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2106};
        vzoVar.e(300);
        return new Runnable() { // from class: wda
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(iArr, vzoVar, dataSourceCallback);
            }
        };
    }

    /* synthetic */ void c(int[] iArr, vzo vzoVar, final DataSourceCallback dataSourceCallback) {
        for (int i : iArr) {
            vzoVar.e(new int[]{i});
            vzoVar.a(0L);
            vzoVar.e(System.currentTimeMillis());
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            d(vzoVar, new DataSourceCallback() { // from class: wdb
                @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
                public final void onResponse(int i2, Object obj) {
                    this.f51891c.b(dataSourceCallback, countDownLatch, i2, (List) obj);
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                LogUtil.e("BloodSugarOperateImp", "CountDownLatch Exception");
                this.mHandler.post(new Runnable() { // from class: wde
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
                return;
            }
        }
        sortHiHealthDataToDesc(this.mHiHealthDataListRecursive);
        final List<whz> listHiHealthDataProcess = hiHealthDataProcess(this.mHiHealthDataListRecursive);
        this.mHandler.post(new Runnable() { // from class: wdd
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(0, listHiHealthDataProcess);
            }
        });
    }

    /* synthetic */ void b(final DataSourceCallback dataSourceCallback, CountDownLatch countDownLatch, final int i, List list) {
        if (i != 0) {
            LogUtil.e("BloodSugarOperateImp", "type data null");
            this.mHandler.post(new Runnable() { // from class: wcw
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            countDownLatch.countDown();
            return;
        }
        countDownLatch.countDown();
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        double value = hiHealthData.getValue();
        privacyDataModel.setDoubleValue(value);
        privacyDataModel.setDataTitle(wgv.b(value));
        privacyDataModel.setDataDesc(wig.b(hiHealthData.getStartTime()));
    }

    protected void d(final vzo vzoVar, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setReadType(vzoVar.l());
        hiDataReadOption.setStartTime(vzoVar.m());
        hiDataReadOption.setEndTime(vzoVar.h());
        hiDataReadOption.setType(vzoVar.o());
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setDeviceUuid(vzoVar.j());
        hiDataReadOption.setCount(vzoVar.b());
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(hiDataReadOption).a(vzoVar.f()).b();
        LogUtil.a("BloodSugarOperateImp", "readHiHealthDataProForBloodSugar start");
        HiHealthNativeApi.a(this.mContext).readHiHealthDataPro(hiDataReadProOptionB, new HiDataReadResultListener() { // from class: wcv.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("BloodSugarOperateImp", "readHiHealthDataProForBloodSugar end errorCode = ", Integer.valueOf(i));
                if (i != 0) {
                    dataSourceCallback.onResponse(1, new ArrayList());
                    return;
                }
                SparseArray<List<HiHealthData>> sparseArray = new SparseArray<>();
                if (obj instanceof SparseArray) {
                    sparseArray = (SparseArray) obj;
                }
                if (sparseArray.size() == 0) {
                    dataSourceCallback.onResponse(0, wcv.this.mHiHealthDataListRecursive);
                    return;
                }
                List<HiHealthData> listDealResultForReadInOneDay = wcv.this.dealResultForReadInOneDay(sparseArray, vzoVar);
                vzoVar.e(listDealResultForReadInOneDay.get(listDealResultForReadInOneDay.size() - 1).getStartTime() - 1);
                wcv.this.readHiHealthDataProInOneDay(vzoVar, dataSourceCallback);
            }
        });
    }
}
