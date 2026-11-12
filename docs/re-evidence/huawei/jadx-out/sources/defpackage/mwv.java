package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mwv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42603c = new Object();
    private static mwv e;
    private long d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExtendHandler f42604b = HandlerCenter.b(new e(), "HwMenstrualHelper");

    private mwv() {
    }

    public static mwv d() {
        mwv mwvVar;
        synchronized (f42603c) {
            if (e == null) {
                e = new mwv();
            }
            mwvVar = e;
        }
        return mwvVar;
    }

    public void d(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwMenstrualHelper", "queryManualData callback null");
        } else {
            ThreadPoolManager.c().a("HwMenstrualHelper", new Runnable() { // from class: mwv.5
                @Override // java.lang.Runnable
                public void run() {
                    HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("com.huawei.health.mc");
                    if (userPreference == null || userPreference.getValue() == null) {
                        LogUtil.j("HwMenstrualHelper", "queryManualData userPreference value empty");
                        iBaseResponseCallback.a(-1, null);
                        return;
                    }
                    String value = userPreference.getValue();
                    LogUtil.a("HwMenstrualHelper", "queryManualData value:", value);
                    try {
                        JSONObject jSONObject = new JSONObject(value);
                        iBaseResponseCallback.a(0, new int[]{jSONObject.getInt("cycleLength"), jSONObject.getInt("periodLength")});
                    } catch (JSONException unused) {
                        LogUtil.e("HwMenstrualHelper", "queryMenstrualSwitch JSONException");
                        iBaseResponseCallback.a(-1, null);
                    }
                }
            });
        }
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwMenstrualHelper", "queryModifyTime callback is null");
            return;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiAggregateOption.setStartTime(jCurrentTimeMillis - ThirdLoginDataStorageUtil.REFRESH_TOKEN_INTERVAL);
        hiAggregateOption.setEndTime(jCurrentTimeMillis + 7776000000L);
        hiAggregateOption.setConstantsKey(new String[]{"menstrual_quantity"});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setType(new int[]{10010});
        hiAggregateOption.setSort("modified_time", 1);
        hiAggregateOption.setCount(1);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: mwv.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "queryModifyTime errorCode :", Integer.valueOf(i));
                if (list == null || list.size() == 0) {
                    LogUtil.e("HwMenstrualHelper", "queryModifyTime datas is null");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "queryModifyTime:", Long.valueOf(list.get(0).getModifiedTime()));
                    iBaseResponseCallback.a(0, Long.valueOf(list.get(0).getModifiedTime() / 1000));
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                LogUtil.j("HwMenstrualHelper", "queryModifyTime onResultIntent");
            }
        });
    }

    public void d(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "getSeveralMenstrualCycleData");
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwMenstrualHelper", "getSeveralMenstrualCycleData call back is null");
        } else {
            b(i, i2, iBaseResponseCallback);
        }
    }

    private void b(final int i, final int i2, final IBaseResponseCallback iBaseResponseCallback) {
        this.d = 0L;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "nowTime:", Long.valueOf(jCurrentTimeMillis));
        hiAggregateOption.setStartTime(jCurrentTimeMillis - (((long) ((i + 1) * 90)) * 86400000));
        hiAggregateOption.setEndTime((((long) ((i2 + 1) * 90)) * 86400000) + jCurrentTimeMillis);
        hiAggregateOption.setType(new int[]{10010});
        hiAggregateOption.setConstantsKey(new String[]{"menstrual_status"});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setAggregateType(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = iBaseResponseCallback;
        this.f42604b.sendMessage(messageObtain, 10000L);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: mwv.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "getAllData errorCode:", Integer.valueOf(i3));
                mwv.this.f42604b.removeMessages(3);
                if (list == null || list.size() == 0) {
                    ReleaseLogUtil.a("DEVMGR_HwMenstrualHelper", "getAllData empty");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "getAllData size:", Integer.valueOf(list.size()));
                    mwv.this.b(list, jCurrentTimeMillis, iBaseResponseCallback, i, i2);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
                LogUtil.j("HwMenstrualHelper", "getAllData onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list, long j, IBaseResponseCallback iBaseResponseCallback, int i, int i2) {
        Iterator<HiHealthData> it = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            HiHealthData next = it.next();
            int i4 = (int) next.getDouble("menstrual_status");
            long startTime = next.getStartTime();
            if ((i4 == 101 || i4 == 301) && j > startTime) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            ReleaseLogUtil.a("DEVMGR_HwMenstrualHelper", "recentMenstrualFirstDayIndex error");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        LogUtil.a("HwMenstrualHelper", "key index:", Integer.valueOf(i3), "key time:", Long.valueOf(list.get(i3).getStartTime()));
        List<mxb> listD = d(list, i3, i);
        List<mxb> listA = a(list, i3, i2);
        if (listD.size() + listA.size() == 0) {
            LogUtil.e("HwMenstrualHelper", "dealKeyData no data error");
            iBaseResponseCallback.a(-1, null);
        } else {
            Collections.reverse(listD);
            listD.addAll(listA);
            iBaseResponseCallback.a(0, new mxa(this.d / 1000, listD));
        }
    }

    private List<mxb> a(List<HiHealthData> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(16);
        mxb mxbVar = new mxb();
        long startTime = list.get(i).getStartTime();
        int i3 = (int) list.get(i).getDouble("menstrual_status");
        mxbVar.a(i3, startTime / 1000);
        mxbVar.b(i3 == 101);
        LogUtil.a("HwMenstrualHelper", "recentMenstrualFirstDay:", Integer.valueOf(i3), ",time:", Long.valueOf(startTime));
        for (int i4 = i - 1; i4 >= 0; i4--) {
            if (list.get(i4).getModifiedTime() > this.d) {
                this.d = list.get(i4).getModifiedTime();
            }
            int i5 = (int) list.get(i4).getDouble("menstrual_status");
            if (i5 == 101 || i5 == 301) {
                int startTime2 = (int) ((list.get(i4).getStartTime() - startTime) / 86400000);
                long startTime3 = list.get(i4).getStartTime();
                mxbVar.c(startTime2);
                arrayList.add(mxbVar);
                LogUtil.a("HwMenstrualHelper", "getFutureMenstrual start:", Long.valueOf(list.get(i4).getStartTime()));
                mxbVar = new mxb();
                mxbVar.b(i5 == 101);
                startTime = startTime3;
            }
            mxbVar.a(i5, list.get(i4).getStartTime() / 1000);
            if (arrayList.size() >= i2 + 1) {
                LogUtil.a("HwMenstrualHelper", "future data is enough");
                return arrayList;
            }
            if (i4 == 0) {
                ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "start getLastCycle");
                d(list, i, arrayList, mxbVar);
            }
        }
        return arrayList;
    }

    private void d(List<HiHealthData> list, int i, List<mxb> list2, mxb mxbVar) {
        if (!list2.isEmpty()) {
            int iA = list2.get(list2.size() - 1).a();
            ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "getLastPredictCycle with Previous cycle:", Integer.valueOf(iA));
            mxbVar.c(iA);
            list2.add(mxbVar);
            return;
        }
        for (int i2 = i + 1; i2 < list.size(); i2++) {
            int i3 = (int) list.get(i2).getDouble("menstrual_status");
            if (i3 == 101 || i3 == 301) {
                int startTime = (int) ((list.get(i).getStartTime() - list.get(i2).getStartTime()) / 86400000);
                ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "getLastPredictCycle traverse:", Integer.valueOf(startTime));
                mxbVar.c(startTime);
                list2.add(mxbVar);
                return;
            }
        }
    }

    private List<mxb> d(List<HiHealthData> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(16);
        if (i2 <= 0) {
            LogUtil.e("HwMenstrualHelper", "device do not need past data");
            return arrayList;
        }
        mxb mxbVar = new mxb();
        long startTime = list.get(i).getStartTime();
        for (int i3 = i + 1; i3 < list.size(); i3++) {
            if (list.get(i3).getModifiedTime() > this.d) {
                this.d = list.get(i3).getModifiedTime();
            }
            int i4 = (int) list.get(i3).getDouble("menstrual_status");
            mxbVar.a(i4, list.get(i3).getStartTime() / 1000);
            if (i4 == 101 || i4 == 301) {
                int startTime2 = (int) ((startTime - list.get(i3).getStartTime()) / 86400000);
                long startTime3 = list.get(i3).getStartTime();
                if (startTime2 > 180) {
                    startTime2 = 180;
                }
                mxbVar.c(startTime2);
                mxbVar.b(i4 == 101);
                arrayList.add(mxbVar);
                LogUtil.a("HwMenstrualHelper", "getPastMenstrual start:", Long.valueOf(list.get(i3).getStartTime()));
                mxbVar = new mxb();
                startTime = startTime3;
            }
            if (arrayList.size() >= i2) {
                LogUtil.a("HwMenstrualHelper", "past data is enough");
                return arrayList;
            }
        }
        return arrayList;
    }

    public void e(int i, int i2, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwMenstrualHelper", "getBodyStatus callback null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(jCurrentTimeMillis - (((long) i) * 86400000));
        hiAggregateOption.setEndTime(jCurrentTimeMillis + (((long) i2) * 86400000));
        hiAggregateOption.setType(new int[]{10010});
        hiAggregateOption.setConstantsKey(new String[]{"menstrual_status"});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setAggregateType(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = iBaseResponseCallback;
        this.f42604b.sendMessage(messageObtain, 10000L);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: mwv.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "getBodyStatus errorCode:", Integer.valueOf(i3));
                mwv.this.f42604b.removeMessages(2);
                if (list == null || list.isEmpty()) {
                    ReleaseLogUtil.e("DEVMGR_HwMenstrualHelper", "getBodyStatus null");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "getBodyStatus size:", Integer.valueOf(list.size()));
                    iBaseResponseCallback.a(0, list);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
                LogUtil.j("HwMenstrualHelper", "getBodyStatus onResultIntent");
            }
        });
    }

    public void a(List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (list == null || list.isEmpty() || iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualHelper", "insertMenstrualDataToDatabase empty warning");
            return;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(list);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = iBaseResponseCallback;
        this.f42604b.sendMessage(messageObtain, 10000L);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mwv.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "insertData errorCode:", Integer.valueOf(i));
                mwv.this.f42604b.removeMessages(1);
                iBaseResponseCallback.a(i, null);
            }
        });
    }

    public String c(List<mxb> list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualHelper", "list is empty");
            return eeq.d(0) + eeq.d(0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int i2 = 0;
        for (mxb mxbVar : list) {
            if (mxbVar.h() + ((((long) mxbVar.a()) * 86400000) / 1000) < jCurrentTimeMillis) {
                i++;
            }
            if (mxbVar.h() > jCurrentTimeMillis) {
                i2++;
            }
        }
        ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "getMouthModel:", Integer.valueOf(i), Integer.valueOf(i2));
        return eeq.d(i) + eeq.d(i2);
    }

    static class e implements Handler.Callback {
        private e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.a("HwMenstrualHelper", "OperationTimeoutHandler operation:", Integer.valueOf(message.what));
            if (!(message.obj instanceof IBaseResponseCallback)) {
                return true;
            }
            ((IBaseResponseCallback) message.obj).a(150001, null);
            return true;
        }
    }

    public DeviceInfo a(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, str);
        if (deviceList == null) {
            LogUtil.j("HwMenstrualHelper", "getActiveMainNotAw70Device() deviceInfoList is null.");
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (!cod.a(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("HwMenstrualHelper", "getActiveMainNotAw70Device deviceInfo ", deviceInfo);
        return deviceInfo;
    }

    public void e(long j, IBaseResponseCallback iBaseResponseCallback) {
        if (j == 0) {
            LogUtil.j("HwMenstrualHelper", "getMenstrualEndData lastTime is 0");
            return;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwMenstrualHelper", "getMenstrualEndData callback null");
            return;
        }
        long j2 = j + 86400000;
        long j3 = j + 7776000000L;
        LogUtil.a("HwMenstrualHelper", "getMenstrualEndData enter, startTime: ", Long.valueOf(j2), ", endTime: ", Long.valueOf(j3));
        b(j2, j3, 4, iBaseResponseCallback);
    }

    private void b(long j, long j2, final int i, final IBaseResponseCallback iBaseResponseCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setType(new int[]{10010});
        hiAggregateOption.setConstantsKey(new String[]{"menstrual_status"});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setAggregateType(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = iBaseResponseCallback;
        this.f42604b.sendMessage(messageObtain, 10000L);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: mwv.10
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "getMenstrualData errorCode:", Integer.valueOf(i2));
                mwv.this.f42604b.removeMessages(i);
                mwv.this.d(i2, list, i, iBaseResponseCallback);
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                LogUtil.j("HwMenstrualHelper", "getMenstrualData onResultIntent");
                iBaseResponseCallback.a(i3, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, List<HiHealthData> list, int i2, IBaseResponseCallback iBaseResponseCallback) {
        if (i != 0) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualHelper", "getMenstrualEndData aggregateHiHealthData fail");
            iBaseResponseCallback.a(i, null);
        } else if (list == null || list.size() == 0) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualHelper", "getMenstrualEndData empty");
            iBaseResponseCallback.a(-1, null);
        } else if (i2 == 4) {
            iBaseResponseCallback.a(i, a(list));
        }
    }

    private List<HiHealthData> a(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(16);
        for (HiHealthData hiHealthData : list) {
            int i = (int) hiHealthData.getDouble("menstrual_status");
            if (i != 0) {
                HiHealthData hiHealthData2 = new HiHealthData(10010);
                LogUtil.a("HwMenstrualHelper", "getMenstrualEndData StartTime: ", Long.valueOf(hiHealthData.getStartTime()), ", old state: ", Integer.valueOf(i), ", new state: ", 0);
                hiHealthData.putDouble("menstrual_status", 0.0d);
                hiHealthData2.setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime());
                hiHealthData2.putDouble("menstrual_quantity", hiHealthData.getDouble("menstrual_quantity"));
                hiHealthData2.putDouble("menstrual_dysmenorrhea", hiHealthData.getDouble("menstrual_dysmenorrhea"));
                hiHealthData2.putDouble("menstrual_physical", hiHealthData.getDouble("menstrual_physical"));
                hiHealthData2.putDouble("menstrual_sub_status", hiHealthData.getDouble("menstrual_sub_status"));
                hiHealthData2.setDeviceUuid("-1");
                arrayList.add(hiHealthData2);
            }
        }
        ReleaseLogUtil.d("DEVMGR_HwMenstrualHelper", "dealEndDirtyData newDataInfos size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }
}
