package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.HeartRateRaiseRemindAlarm;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiHearRateUpMetaData;
import com.huawei.hihealth.data.model.HiHeartRateData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myv {
    public static myv b() {
        return a.d;
    }

    static class a {
        private static final myv d = new myv();
    }

    public void d(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "enter getHeartRateRaiseAlarm");
        if (TextUtils.isEmpty(deviceIdentify)) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "getHeartRateRaiseAlarm deviceIdentify is null");
            return;
        }
        final DeviceCapability deviceCapabilityC = myo.c(deviceIdentify);
        if (deviceCapabilityC == null) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "getHeartRateRaiseAlarm deviceCapability is null");
        } else if (!deviceCapabilityC.isSupportGetHeartRateRaiseAlarmNumber()) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "isSupportGetHeartRateRaiseAlarmNumber is not support");
        } else {
            mit.b("AlarmData_HeartRateAlarmManager", new Runnable() { // from class: myv.5
                @Override // java.lang.Runnable
                public void run() {
                    myv.this.b(deviceCapabilityC);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceCapability deviceCapability) {
        myr myrVarB = myr.b(myp.b());
        long jE = myrVarB.e();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "lastStatusTime:", Long.valueOf(jE), "endTime:", Long.valueOf(jCurrentTimeMillis));
        long j = jE - jCurrentTimeMillis;
        if (j > k.b.l || jE == 0) {
            jE = myo.d(jCurrentTimeMillis - k.b.l);
            e(jE);
        } else if (jE >= jCurrentTimeMillis && j <= 300) {
            ReleaseLogUtil.a("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "syncStatusPoint lastStatusTime is not correct.");
            jE = jCurrentTimeMillis - 61;
        } else if (j > 300) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "getHeartRateRaiseAlarm lastStatusTime is not correct and need write back.");
            jE = jCurrentTimeMillis - 61;
            myrVarB.c(jE);
        } else {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "getHeartRateRaiseAlarm unknown");
        }
        mys.b(jE, jCurrentTimeMillis, true);
        if (deviceCapability.isSupportHeartRateDownAlarm()) {
            mys.b(jE, jCurrentTimeMillis, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        myr.b(myp.b()).c(j);
    }

    public void d(byte[] bArr) {
        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "enter processHeartRateRemindAlarm");
        String strE = eeq.e(bArr);
        HeartRateRaiseRemindAlarm heartRateRaiseRemindAlarm = new HeartRateRaiseRemindAlarm();
        int i = 0;
        if (strE != null && strE.length() > 4) {
            try {
                ees eesVarB = new eet().b(strE.substring(4, strE.length()));
                int iD = d(eesVarB.e());
                try {
                    ArrayList arrayList = new ArrayList(16);
                    heartRateRaiseRemindAlarm.setDataList(arrayList);
                    List<ees> listB = eesVarB.b();
                    if (!coq.d(listB)) {
                        LogUtil.a("AlarmData_HeartRateAlarmManager", "5.7.30 tlvFatherList.size() :", Integer.valueOf(listB.size()));
                        Iterator<ees> it = listB.iterator();
                        while (it.hasNext()) {
                            List<ees> listB2 = it.next().b();
                            if (!coq.d(listB2)) {
                                LogUtil.d("AlarmData_HeartRateAlarmManager", "5.7.30 childTLVFatherList.size() :", Integer.valueOf(listB2.size()));
                                a(listB2, arrayList);
                            } else {
                                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "childTLVFatherList is null or size is zero");
                                return;
                            }
                        }
                        LogUtil.a("AlarmData_HeartRateAlarmManager", "5.7.30 parse end :", heartRateRaiseRemindAlarm.toString());
                        i = iD;
                    } else {
                        ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "tlvFatherList is null or size is zero");
                        return;
                    }
                } catch (eeu e) {
                    e = e;
                    i = iD;
                    ReleaseLogUtil.a("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "processHeartRateRemindAlarm Exception ", ExceptionUtils.c(e));
                }
            } catch (eeu e2) {
                e = e2;
            }
        } else {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "5.7.30 get wrong command.");
        }
        d(heartRateRaiseRemindAlarm);
        d(heartRateRaiseRemindAlarm, i);
    }

    private int d(List<eew> list) {
        if (list == null || list.size() <= 0) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "processGetHeartRateAlarmType tlvList is null or size is zero");
            return 0;
        }
        LogUtil.a("AlarmData_HeartRateAlarmManager", "processGetHeartRateAlarmType");
        while (true) {
            int i = 0;
            for (eew eewVar : list) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV != 14) {
                    if (iV != 127) {
                        ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "processGetHeartRateAlarmType default");
                    } else {
                        ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "5.7.30 get error code.");
                    }
                } else if (CommonUtil.v(eewVar.b()) == 1) {
                    LogUtil.a("AlarmData_HeartRateAlarmManager", "heartRateAlarmType down");
                    i = 1;
                } else {
                    LogUtil.a("AlarmData_HeartRateAlarmManager", "heartRateAlarmType raise");
                }
            }
            return i;
        }
    }

    private void a(List<ees> list, List<HeartRateRaiseRemindAlarm.Entity> list2) {
        for (ees eesVar : list) {
            HeartRateRaiseRemindAlarm.Entity entity = new HeartRateRaiseRemindAlarm.Entity();
            a(eesVar.b(), entity);
            List<eew> listE = eesVar.e();
            if (coq.d(listE)) {
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "childTlv is null or size is zero");
                return;
            }
            Iterator<eew> it = listE.iterator();
            while (true) {
                if (it.hasNext()) {
                    eew next = it.next();
                    int iV = CommonUtil.v(next.e());
                    if (iV != 5) {
                        if (iV != 6) {
                            if (iV != 7) {
                                if (iV != 8) {
                                    if (iV == 15) {
                                        entity.setThreshold(CommonUtil.v(next.b()));
                                    } else {
                                        ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "receive wrong info.This entity is error.");
                                        break;
                                    }
                                } else {
                                    entity.setMaxNumber(CommonUtil.v(next.b()));
                                }
                            } else {
                                entity.setMinNumber(CommonUtil.v(next.b()));
                            }
                        } else {
                            entity.setEndTime(CommonUtil.x(next.b()));
                        }
                    } else {
                        entity.setStartTime(CommonUtil.x(next.b()));
                    }
                } else {
                    LogUtil.a("AlarmData_HeartRateAlarmManager", "entity to string:", entity.toString());
                    list2.add(entity);
                    break;
                }
            }
        }
    }

    private void a(List<ees> list, HeartRateRaiseRemindAlarm.Entity entity) {
        if (list == null || list.size() <= 0) {
            return;
        }
        LogUtil.a("AlarmData_HeartRateAlarmManager", "5.7.30fatherTlv.size() :", Integer.valueOf(list.size()));
        for (ees eesVar : list) {
            ArrayList<HiHeartRateData> arrayList = new ArrayList<>(10);
            d(eesVar.b(), arrayList);
            entity.setRateData(arrayList);
        }
    }

    private void d(List<ees> list, ArrayList<HiHeartRateData> arrayList) {
        if (list == null || list.size() <= 0) {
            return;
        }
        LogUtil.a("AlarmData_HeartRateAlarmManager", "pointStructTlv.size() :", Integer.valueOf(list.size()));
        for (ees eesVar : list) {
            HiHeartRateData hiHeartRateData = new HiHeartRateData();
            e(eesVar.e(), hiHeartRateData);
            LogUtil.a("AlarmData_HeartRateAlarmManager", "rateData to String:", hiHeartRateData.toString());
            arrayList.add(hiHeartRateData);
        }
    }

    private void e(List<eew> list, HiHeartRateData hiHeartRateData) {
        if (list == null || list.size() <= 0) {
            return;
        }
        LogUtil.a("AlarmData_HeartRateAlarmManager", "detailTlv.size() :", Integer.valueOf(list.size()));
        for (eew eewVar : list) {
            try {
                int i = Integer.parseInt(eewVar.e(), 16);
                if (i == 11) {
                    hiHeartRateData.setTimestamp(Long.parseLong(eewVar.b(), 16) * 1000);
                } else if (i != 12) {
                    ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "receive wrong info.pointStructChildTlv is error.");
                } else {
                    hiHeartRateData.setHeartRate(Integer.parseInt(eewVar.b(), 16));
                }
            } catch (NumberFormatException e) {
                ReleaseLogUtil.a("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "processDetailTlv Exception ", ExceptionUtils.c(e));
            }
        }
    }

    private void d(HeartRateRaiseRemindAlarm heartRateRaiseRemindAlarm) {
        LogUtil.a("AlarmData_HeartRateAlarmManager", "enter heartRateRaiseAlarmNumberSortByTime");
        if (heartRateRaiseRemindAlarm == null) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "heartRateRaiseAlarmNumberSortByTime value is null.");
        } else if (heartRateRaiseRemindAlarm.getDataList() == null || heartRateRaiseRemindAlarm.getDataList().size() <= 1) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "data list is empty or size is 1");
        } else {
            Collections.sort(heartRateRaiseRemindAlarm.getDataList());
            LogUtil.a("AlarmData_HeartRateAlarmManager", "sort by start time end.");
        }
    }

    private void d(HeartRateRaiseRemindAlarm heartRateRaiseRemindAlarm, int i) {
        LogUtil.a("AlarmData_HeartRateAlarmManager", "enter saveOnData.");
        if (heartRateRaiseRemindAlarm == null || heartRateRaiseRemindAlarm.getDataList() == null || heartRateRaiseRemindAlarm.getDataList().size() <= 0) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "no data save on data.");
            return;
        }
        List<HeartRateRaiseRemindAlarm.Entity> dataList = heartRateRaiseRemindAlarm.getDataList();
        DeviceInfo deviceInfoE = myo.e("AlarmData_HeartRateAlarmManager");
        if (deviceInfoE == null) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "5.7.30 get deviceInfo fail.Save data fail.");
            return;
        }
        myo.a(deviceInfoE);
        String strB = myo.b();
        if (dataList == null) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "5.7.30 saveOnData dataInfoList is null.");
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        for (int i2 = 0; i2 < dataList.size(); i2++) {
            HiHearRateUpMetaData hiHearRateUpMetaData = new HiHearRateUpMetaData();
            HeartRateRaiseRemindAlarm.Entity entity = dataList.get(i2);
            hiHearRateUpMetaData.setMinHeartRate(entity.getMinNumber());
            hiHearRateUpMetaData.setMaxHeartRate(entity.getMaxNumber());
            hiHearRateUpMetaData.setThreshold(entity.getThreshold());
            if (entity.getRateData() != null && entity.getRateData().size() != 0) {
                hiHearRateUpMetaData.setDetails(entity.getRateData());
            }
            HiHealthData hiHealthData = new HiHealthData();
            if (i == 0) {
                hiHealthData.setType(2101);
            } else {
                hiHealthData.setType(2102);
            }
            hiHealthData.setTimeInterval(entity.getStartTime() * 1000, entity.getEndTime() * 1000);
            hiHealthData.setMetaData(HiJsonUtil.d(hiHearRateUpMetaData));
            hiHealthData.setDeviceUuid(strB);
            arrayList.add(hiHealthData);
        }
        LogUtil.a("AlarmData_HeartRateAlarmManager", "dataList :", arrayList.toString());
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        c(hiDataInsertOption, dataList.get(dataList.size() - 1).getEndTime() + 1);
    }

    private void c(HiDataInsertOption hiDataInsertOption, final long j) {
        LogUtil.a("AlarmData_HeartRateAlarmManager", "insertData:", hiDataInsertOption.toString());
        HiHealthNativeApi.a(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: myv.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (obj == null) {
                    ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "insertData object is null");
                    return;
                }
                LogUtil.a("AlarmData_HeartRateAlarmManager", "5.7.30 set heart rate raise remind alarm; errorCode :", Integer.valueOf(i), "object :", HiJsonUtil.d(obj));
                if (i == 0) {
                    ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "save success.updateTime is:", Long.valueOf(j));
                    myv.this.e(j);
                } else {
                    ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_HeartRateAlarmManager", "save heart rate raise remind alarm fail.");
                }
            }
        });
        myo.e();
    }
}
