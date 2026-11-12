package defpackage;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.syncmgr.menstrual.MenstrualSyncApi;
import health.compact.a.EnvironmentUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = MenstrualSyncApi.class)
@Singleton
public class mhy implements MenstrualSyncApi {
    @Override // com.huawei.syncmgr.menstrual.MenstrualSyncApi
    public boolean syncMenstrualToDevice(List<eeb> list) {
        DeviceInfo deviceInfoA = a();
        if (deviceInfoA == null) {
            LogUtil.j("MenstrualSyncApiImpl", "syncDataToDevice deviceInfo==null");
            return false;
        }
        if (deviceInfoA.getDeviceConnectState() != 2) {
            LogUtil.j("MenstrualSyncApiImpl", "syncDataToDevice unConnected");
            return false;
        }
        if (njy.e(list)) {
            LogUtil.j("MenstrualSyncApiImpl", "pointInfoList isEmpty");
            return false;
        }
        eea eeaVar = new eea();
        eeaVar.setSrcPkgName("hw.unitedevice.physiological");
        eeaVar.setWearPkgName("hw.watch.health.physiological");
        eeaVar.c(400018L);
        eeaVar.setCommandId(4);
        eeaVar.a(list);
        boolean zSendDictionaryPointInfoCommand = edc.e().sendDictionaryPointInfoCommand(deviceInfoA, eeaVar, "MenstrualSyncApiImpl");
        LogUtil.a("MenstrualSyncApiImpl", "syncMenstrualToDevice() sent (", eeaVar, ") dictionaryPointInfo isValid: ", Boolean.valueOf(zSendDictionaryPointInfoCommand));
        return zSendDictionaryPointInfoCommand;
    }

    @Override // com.huawei.syncmgr.menstrual.MenstrualSyncApi
    public List<HiHealthData> getMenstrualFlow(long j, long j2, long j3) {
        LogUtil.a("MenstrualSyncApiImpl", "startTime: ", Long.valueOf(j), " endTime: ", Long.valueOf(j2), " modifyTime: ", Long.valueOf(j3));
        ArrayList arrayList = new ArrayList();
        List<HiHealthData> listD = d(j, j2);
        if (njy.b(listD)) {
            d(j, j2, j3, listD);
            for (HiHealthData hiHealthData : listD) {
                if (hiHealthData.getModifiedTime() > j3) {
                    arrayList.add(hiHealthData);
                }
            }
        } else {
            d(j, j2, j3, arrayList);
        }
        LogUtil.a("MenstrualSyncApiImpl", "menstrualListSize:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private List<HiHealthData> d(long j, long j2) {
        int iValue = DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE_QUANTITY.value();
        int iValue2 = DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE_DYSMENORRHEA.value();
        final HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(new int[]{iValue, iValue2});
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList();
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: mhy.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("MenstrualSyncApiImpl", "readHiHealthData onResult errorCode = ", Integer.valueOf(i));
                if (obj == null) {
                    LogUtil.j("MenstrualSyncApiImpl", "readHiHealthData onResult data is null errorCode = ", Integer.valueOf(i));
                    countDownLatch.countDown();
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("MenstrualSyncApiImpl", "readHiHealthData onResult map isEmpty");
                    countDownLatch.countDown();
                    return;
                }
                for (int i3 : hiDataReadOption.getType()) {
                    List list = (List) sparseArray.get(i3);
                    if (njy.e(list)) {
                        LogUtil.j("MenstrualSyncApiImpl", "pressureMeasureValueList isEmpty type: ", Integer.valueOf(i3));
                    } else {
                        LogUtil.a("MenstrualSyncApiImpl", "readHiHealthData onResult() pressureMeasureValueList.size=", Integer.valueOf(list.size()), "type = ", Integer.valueOf(i3));
                        LogUtil.d("MenstrualSyncApiImpl", "readHiHealthData onResult() pressureMeasureValueList = ", HiJsonUtil.d(list));
                        arrayList.addAll(list);
                    }
                }
                LogUtil.a("MenstrualSyncApiImpl", "readHiHealthData onResult() result.size=", Integer.valueOf(arrayList.size()));
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("MenstrualSyncApiImpl", "readHiHealthData onResultIntent errorCode = ", Integer.valueOf(i2));
            }
        });
        try {
            if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                ReleaseLogUtil.a("MenstrualSyncApiImpl", "readHiHealthData() timeout");
                return arrayList;
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("MenstrualSyncApiImpl", "readHiHealthData() interruptedException");
        }
        return arrayList;
    }

    private void d(long j, long j2, final long j3, final List<HiHealthData> list) {
        final HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(new int[]{47402, 47403});
        hiDataReadOption.setConstantsKey(new String[]{"menstrual_quantity", "menstrual_dysmenorrhea"});
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: mhy.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("MenstrualSyncApiImpl", "getMenstrualStat readHiHealthData onResult errorCode = ", Integer.valueOf(i));
                if (obj == null) {
                    LogUtil.j("MenstrualSyncApiImpl", "getMenstrualStat readHiHealthData onResult data is null errorCode = ", Integer.valueOf(i));
                    countDownLatch.countDown();
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("MenstrualSyncApiImpl", "getMenstrualStat readHiHealthData onResult map isEmpty");
                    countDownLatch.countDown();
                    return;
                }
                for (int i3 : hiDataReadOption.getType()) {
                    List<HiHealthData> list2 = (List) sparseArray.get(i3);
                    if (njy.e(list2)) {
                        LogUtil.j("MenstrualSyncApiImpl", "getMenstrualStat pressureMeasureValueList isEmpty type: ", Integer.valueOf(i3));
                    } else {
                        LogUtil.a("MenstrualSyncApiImpl", "getMenstrualStat readHiHealthData onResult() pressureMeasureValueList.size=", Integer.valueOf(list2.size()), "type = ", Integer.valueOf(i3));
                        LogUtil.d("MenstrualSyncApiImpl", "getMenstrualStat readHiHealthData onResult() pressureMeasureValueList = ", HiJsonUtil.d(list2));
                        int iValue = DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE_QUANTITY.value();
                        int iValue2 = DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE_DYSMENORRHEA.value();
                        for (HiHealthData hiHealthData : list2) {
                            if (hiHealthData.getModifiedTime() > j3) {
                                if (i3 == 47402) {
                                    hiHealthData.setType(iValue);
                                    mhy.this.a(list, hiHealthData);
                                } else if (i3 == 47403) {
                                    hiHealthData.setType(iValue2);
                                    mhy.this.a(list, hiHealthData);
                                }
                            }
                        }
                    }
                }
                LogUtil.a("MenstrualSyncApiImpl", "getMenstrualStat readHiHealthData onResult() result.size=", Integer.valueOf(list.size()));
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("MenstrualSyncApiImpl", "getMenstrualStat readHiHealthData onResultIntent errorCode = ", Integer.valueOf(i2));
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            ReleaseLogUtil.a("MenstrualSyncApiImpl", "getMenstrualStat readHiHealthData() timeout");
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("MenstrualSyncApiImpl", "getMenstrualStat readHiHealthData() interruptedException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list, HiHealthData hiHealthData) {
        if (list == null) {
            LogUtil.j("MenstrualSyncApiImpl", "menstrualList is null");
            return;
        }
        if (hiHealthData == null) {
            LogUtil.j("MenstrualSyncApiImpl", "hiHealthData is null");
            return;
        }
        for (HiHealthData hiHealthData2 : list) {
            if (hiHealthData2 == null) {
                LogUtil.j("MenstrualSyncApiImpl", "temData is null");
            } else if (hiHealthData.getType() == hiHealthData2.getType() && hiHealthData.getStartTime() == hiHealthData2.getStartTime() && hiHealthData.getEndTime() == hiHealthData2.getEndTime()) {
                LogUtil.j("MenstrualSyncApiImpl", "list contain hiHealthData");
                return;
            }
        }
        list.add(hiHealthData);
    }

    private DeviceInfo a() {
        if (EnvironmentUtils.e()) {
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "MenstrualSyncApiImpl");
            if (!njy.e(deviceList)) {
                return deviceList.get(0);
            }
            LogUtil.a("MenstrualSyncApiImpl", "deviceInfo is empty");
            return null;
        }
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "MenstrualSyncApiImpl");
    }
}
