package defpackage;

import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthApi;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class dry {
    private int d;
    private String e;

    public dry(String str, int i) {
        this.d = i;
        this.e = str;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    public HiHealthData d(HealthData healthData) {
        if (healthData == null) {
            return null;
        }
        HiHealthData hiHealthData = new HiHealthData(this.d);
        hiHealthData.setStartTime(healthData.getStartTime());
        LogUtil.a("PluginDevice_PluginDeviceDataStored", "convertData startTime is ", Long.valueOf(healthData.getStartTime()));
        int i = this.d;
        if (i == 2002) {
            if (healthData instanceof enb) {
                hiHealthData.setValue(((enb) healthData).getHeartRate());
            }
        } else if (i != 2018) {
            if (i != 10006) {
                if (i != 50001) {
                    if (i != 10001) {
                        if (i == 10002 && (healthData instanceof eni)) {
                            b(hiHealthData, (eni) healthData, false);
                        }
                    } else if (healthData instanceof emq) {
                        d((emq) healthData, hiHealthData);
                    }
                } else if (healthData instanceof enb) {
                    hiHealthData.setValue(((enb) healthData).getHeartRate());
                }
            } else if (healthData instanceof dso) {
                dso dsoVar = (dso) healthData;
                hiHealthData.putDouble("bodyWeight", dsoVar.getWeight());
                hiHealthData.putDouble(BleConstants.BODY_FAT_RATE, dsoVar.getBodyFatRat());
            }
        } else if (healthData instanceof eni) {
            b(hiHealthData, (eni) healthData, true);
        }
        hiHealthData.setEndTime(healthData.getEndTime());
        hiHealthData.setDeviceUuid(this.e);
        hiHealthData.setOwnerId(0);
        LogUtil.a("PluginDevice_PluginDeviceDataStored", "convertData EndTime is ", Long.valueOf(healthData.getEndTime()));
        return hiHealthData;
    }

    private void d(emq emqVar, HiHealthData hiHealthData) {
        float bloodSugar = emqVar.getBloodSugar();
        hiHealthData.setType(emq.d(emqVar.getStartTime()));
        hiHealthData.setValue(bloodSugar);
        HiBloodSugarMetaData hiBloodSugarMetaData = new HiBloodSugarMetaData();
        hiBloodSugarMetaData.setConfirmed(false);
        hiHealthData.setMetaData(HiJsonUtil.d(hiBloodSugarMetaData));
    }

    private void b(HiHealthData hiHealthData, eni eniVar, boolean z) {
        if (!z) {
            hiHealthData.putShort("BLOOD_PRESSURE_DIASTOLIC", eniVar.getDiastolic());
            hiHealthData.putShort("BLOOD_PRESSURE_SYSTOLIC", eniVar.getSystolic());
            hiHealthData.putShort(BleConstants.BLOODPRESSURE_SPHYGMUS, eniVar.getHeartRate());
            return;
        }
        hiHealthData.setValue((int) eniVar.getHeartRate());
    }

    public void d(List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("PluginDevice_PluginDeviceDataStored", "putDataIntoDataEngine enter list");
        if (njy.e(list)) {
            LogUtil.j("PluginDevice_PluginDeviceDataStored", "putDataIntoDataEngine dataList is null");
            return;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.j("PluginDevice_PluginDeviceDataStored", "putDataIntoDataEngine callback is null");
            return;
        }
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getType() == 2018) {
                arrayList.add(hiHealthData);
            } else if (hiHealthData.getType() == 10002) {
                HashMap map = new HashMap(3);
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()), Double.valueOf(hiHealthData.getShort("BLOOD_PRESSURE_SYSTOLIC")));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value()), Double.valueOf(hiHealthData.getShort("BLOOD_PRESSURE_DIASTOLIC")));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()), Double.valueOf(hiHealthData.getShort(BleConstants.BLOODPRESSURE_SPHYGMUS)));
                hiHealthData.setFieldsValue(HiJsonUtil.d(map));
                arrayList2.add(hiHealthData);
            } else {
                arrayList2.add(hiHealthData);
            }
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList2);
        final HiHealthApi hiHealthApiD = HiHealthManager.d(dxw.d());
        hiHealthApiD.insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: dsc
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                dry.b(arrayList, hiHealthApiD, iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void b(List list, HiHealthApi hiHealthApi, final IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("PluginDevice_PluginDevice", "PluginDeviceDataStored insert normal data type is " + i);
        if (list.size() > 0 && i == 0) {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(list);
            hiHealthApi.insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: dsd
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i2, Object obj2) {
                    dry.a(iBaseResponseCallback, i2, obj2);
                }
            });
            return;
        }
        iBaseResponseCallback.a(i, obj);
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("PluginDevice_PluginDevice", "PluginDeviceDataStored insert heartRate data type is " + i);
        iBaseResponseCallback.a(i, obj);
    }
}
