package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.healthcloud.plugintrack.wearengine.rqmanager.RqDataPushReceiver;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.model.HiBloodPressureMetaData;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.up.model.UserInfomation;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class nkb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static nkb f43109c;
    private static final Object d = new Object();
    private static Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43110a;
    private List<Integer> o;
    private ExecutorService k = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HeartZoneConf f43111b = new HeartZoneConf();
    private IntentFilter h = new IntentFilter();
    private List<Integer> f = new ArrayList(16);
    private CountDownLatch j = new CountDownLatch(1);
    private boolean i = false;
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: nkb.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            LogUtil.a("Common_HWHealthDataManager", "receive broadcastReceiver");
            if (intent == null || (action = intent.getAction()) == null || !action.equals("com.huawei.health.heart_zone_conf_migrate_finish")) {
                return;
            }
            LogUtil.a("Common_HWHealthDataManager", "receive com.huawei.health.heart_zone_conf_migrate_finish");
            nkb.this.r();
        }
    };
    private BroadcastReceiver m = new BroadcastReceiver() { // from class: nkb.15
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("Common_HWHealthDataManager", "receive broadcastReceiver");
            if (intent == null || !"com.huawei.bone.action.FITNESS_USERINFO_UPDATED".equals(intent.getAction())) {
                return;
            }
            LogUtil.a("Common_HWHealthDataManager", "userinfo save finished then update heartzonethreshold");
            nkb.this.s();
            if (EnvironmentUtils.d()) {
                LogUtil.a("Common_HWHealthDataManager", "enter main process then send rqdata to device");
                if (RqDataPushReceiver.checkDeviceRqDataCapability()) {
                    LogUtil.a("Common_HWHealthDataManager", "userInfo changed then send rqdata to device");
                    new jyd().b(BaseApplication.getContext(), DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault()));
                }
            }
        }
    };
    private HiSubscribeListener l = new HiSubscribeListener() { // from class: nkb.18
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a("Common_HWHealthDataManager", "subscribeHiHealthData onResult");
            if (list == null || list.isEmpty()) {
                return;
            }
            nkb.this.o = list;
            LogUtil.a("Common_HWHealthDataManager", "subscribeHiHealthData success");
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("Common_HWHealthDataManager", "subscribeHiHealthData onChange type = ", Integer.valueOf(i), ",changeType = ", str);
            if (i == 102 && "HiSyncUserData".equals(str)) {
                LogUtil.a("Common_HWHealthDataManager", "subscribeHiHealthData receive userinfo update Msg");
                nkb.this.s();
                nkb.this.p();
            }
        }
    };

    private nkb() {
        e = BaseApplication.getContext();
        s();
        LocalBroadcastManager.getInstance().registerReceiver(this.m, new IntentFilter("com.huawei.bone.action.FITNESS_USERINFO_UPDATED"));
        this.h.addAction("com.huawei.health.heart_zone_conf_migrate_finish");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.g, this.h, "com.huawei.health.heartZonePermission", null);
        this.f.clear();
        this.f.add(102);
        HiHealthManager.d(e).subscribeHiHealthData(this.f, this.l);
    }

    public static nkb d() {
        nkb nkbVar;
        synchronized (d) {
            if (f43109c == null) {
                f43109c = new nkb();
            }
            nkbVar = f43109c;
        }
        return nkbVar;
    }

    public void b() {
        LogUtil.a("Common_HWHealthDataManager", "enter destroy");
        if (njy.e(this.o)) {
            LogUtil.j("Common_HWHealthDataManager", "destroy, mSuccessList is empty");
            return;
        }
        HiHealthManager.d(e).unSubscribeHiHealthData(this.o, new HiUnSubscribeListener() { // from class: nkb.16
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public void onResult(boolean z) {
                LogUtil.a("Common_HWHealthDataManager", "destroy is unSubscribeHiHealthData, isSuccess is ", Boolean.valueOf(z));
            }
        });
        ExecutorService executorService = this.k;
        if (executorService != null && !executorService.isShutdown()) {
            this.k.shutdown();
        }
        try {
            BaseApplication.getContext().unregisterReceiver(this.g);
        } catch (IllegalArgumentException e2) {
            LogUtil.a("Common_HWHealthDataManager", LogAnonymous.b(e2));
        }
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.m);
        } catch (IllegalArgumentException e3) {
            LogUtil.a("Common_HWHealthDataManager", LogAnonymous.b(e3));
        }
        f43109c = null;
    }

    public HiUserPreference a(Context context, String str) {
        return HiHealthManager.d(context).getUserPreference(str);
    }

    public void a(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager getTrackDetail()");
        nkc.d().a(j, j2, iBaseResponseCallback);
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager getTodayFitnessTotalData()");
        nkc.d().b(iBaseResponseCallback);
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager getTodayDetailPointData()");
        nkc.d().a(iBaseResponseCallback);
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager getTodayDetailSegentData()");
        nkc.d().c(iBaseResponseCallback);
    }

    public void c(long j, int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWOldHealthDataManager getCoreSleepDetail()");
        nku.e().a(j, i, i2, i3, iBaseResponseCallback);
    }

    public void d(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager getTrackDetailData()");
        jxh.a(j, j2, iBaseResponseCallback);
    }

    public void d(final long[] jArr, final double[] dArr, final List<String> list, String str, final IBaseResponseCallback iBaseResponseCallback) {
        synchronized (d) {
            LogUtil.a("Common_HWHealthDataManager", "insertBloodPressureData deviceId == ", str);
            if (!TextUtils.isEmpty(str)) {
                a(jArr, dArr, str, list, iBaseResponseCallback);
            } else if (!TextUtils.isEmpty(this.f43110a)) {
                a(jArr, dArr, this.f43110a, list, iBaseResponseCallback);
            } else {
                LogUtil.a("Common_HWHealthDataManager", "deviceId == null && mDeviceUuid == null");
                HiHealthManager.d(BaseApplication.getContext()).fetchManualDataClient(new HiDataClientListener() { // from class: nkb.17
                    @Override // com.huawei.hihealth.data.listener.HiDataClientListener
                    public void onResult(List<HiHealthClient> list2) {
                        if (njy.e(list2)) {
                            LogUtil.j("Common_HWHealthDataManager", "CollectionUtils.isEmpty()");
                            return;
                        }
                        HiHealthClient hiHealthClient = list2.get(0);
                        nkb.this.f43110a = hiHealthClient.getDeviceUuid();
                        LogUtil.a("Common_HWHealthDataManager", "mDeviceUuid = ", nkb.this.f43110a);
                        nkb nkbVar = nkb.this;
                        nkbVar.a(jArr, dArr, nkbVar.f43110a, (List<String>) list, iBaseResponseCallback);
                    }
                });
            }
        }
    }

    public void d(Context context, HiHealthData hiHealthData, String str, IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || hiHealthData == null || iBaseResponseCallback == null) {
            LogUtil.e("Common_HWHealthDataManager", "insertBloodSugarData params is null");
            return;
        }
        synchronized (d) {
            String deviceUuid = hiHealthData.getDeviceUuid();
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.addData(c(hiHealthData));
            hiDataInsertOption.setPackageName(str);
            if (!TextUtils.isEmpty(deviceUuid)) {
                d(hiDataInsertOption, iBaseResponseCallback);
            } else if (!TextUtils.isEmpty(this.f43110a)) {
                hiHealthData.setDeviceUuid(this.f43110a);
                d(hiDataInsertOption, iBaseResponseCallback);
            } else {
                LogUtil.a("Common_HWHealthDataManager", "insertBloodsugarData mDeviceUuid == null || mDeviceUuid.isEmpty()");
                e(context, hiHealthData, hiDataInsertOption, iBaseResponseCallback);
            }
        }
    }

    private HiHealthData c(HiHealthData hiHealthData) {
        HiHealthData hiHealthData2 = new HiHealthData(DicDataTypeUtil.DataType.BLOODGLUCOSE_BLOODSUGAR.value());
        hiHealthData2.setDeviceUuid(hiHealthData.getDeviceUuid());
        hiHealthData2.setStartTime(hiHealthData.getStartTime());
        hiHealthData2.setEndTime(hiHealthData.getEndTime());
        HashMap map = new HashMap();
        map.put(Integer.valueOf(hiHealthData.getType()), Double.valueOf(hiHealthData.getValue()));
        HiBloodSugarMetaData hiBloodSugarMetaData = (HiBloodSugarMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiBloodSugarMetaData.class);
        if (hiBloodSugarMetaData != null) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.CONFIRMED_STATUS.value()), Integer.valueOf(hiBloodSugarMetaData.getConfirmed() ? 1 : 0));
        }
        hiHealthData2.setFieldsValue(HiJsonUtil.d(map));
        HashMap map2 = new HashMap();
        map2.put(Integer.valueOf(hiHealthData.getType()), hiHealthData.getMetaData());
        hiHealthData2.setFieldsMetaData(HiJsonUtil.d(map2));
        return hiHealthData2;
    }

    public void a(Context context, final long[] jArr, final double[] dArr, final IBaseResponseCallback iBaseResponseCallback) {
        synchronized (d) {
            String str = this.f43110a;
            if (str == null || str.isEmpty()) {
                LogUtil.j("Common_HWHealthDataManager", "insertBloodsugarData mDeviceUuid == null || mDeviceUuid.isEmpty()");
                HiHealthManager.d(context).fetchManualDataClient(new HiDataClientListener() { // from class: nkb.23
                    @Override // com.huawei.hihealth.data.listener.HiDataClientListener
                    public void onResult(List<HiHealthClient> list) {
                        if (njy.e(list)) {
                            return;
                        }
                        LogUtil.a("Common_HWHealthDataManager", "insertBloodSugarData clientList.size == ", Integer.valueOf(list.size()));
                        HiHealthClient hiHealthClient = list.get(0);
                        nkb.this.f43110a = hiHealthClient.getDeviceUuid();
                        nkb nkbVar = nkb.this;
                        nkbVar.c(jArr, dArr, 3, nkbVar.f43110a, iBaseResponseCallback);
                    }
                });
            } else {
                c(jArr, dArr, 3, this.f43110a, iBaseResponseCallback);
            }
        }
    }

    private void e(Context context, final HiHealthData hiHealthData, final HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(context).fetchManualDataClient(new HiDataClientListener() { // from class: nkb.21
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public void onResult(List<HiHealthClient> list) {
                if (njy.e(list)) {
                    return;
                }
                LogUtil.a("Common_HWHealthDataManager", "insertBloodSugarData clientList.size:", Integer.valueOf(list.size()));
                HiHealthClient hiHealthClient = list.get(0);
                nkb.this.f43110a = hiHealthClient.getDeviceUuid();
                hiHealthData.setDeviceUuid(nkb.this.f43110a);
                nkb.this.d(hiDataInsertOption, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long[] jArr, double[] dArr, int i, String str, IBaseResponseCallback iBaseResponseCallback) {
        HiHealthData hiHealthData;
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        if (i == 0) {
            hiHealthData = new HiHealthData(10006);
            hiHealthData.setDeviceUuid(str);
            hiHealthData.setStartTime(jArr[0]);
            hiHealthData.setEndTime(jArr[1]);
            hiHealthData.putDouble("bodyWeight", dArr[0]);
            hiHealthData.putDouble(BleConstants.BODY_FAT_RATE, dArr[1]);
        } else if (i == 1) {
            hiHealthData = null;
        } else if (i == 3) {
            HiHealthData hiHealthData2 = new HiHealthData(10001);
            hiHealthData2.setDeviceUuid(str);
            hiHealthData2.setStartTime(jArr[0]);
            hiHealthData2.setEndTime(jArr[1]);
            hiHealthData2.setType((int) dArr[0]);
            hiHealthData2.setValue(dArr[1]);
            HiBloodSugarMetaData hiBloodSugarMetaData = new HiBloodSugarMetaData();
            hiBloodSugarMetaData.setConfirmed(true);
            hiHealthData2.setMetaData(HiJsonUtil.d(hiBloodSugarMetaData));
            hiHealthData = c(hiHealthData2);
        } else if (i == 6) {
            hiHealthData = new HiHealthData(2104);
            hiHealthData.setDeviceUuid(str);
            hiHealthData.setStartTime(jArr[0]);
            hiHealthData.setEndTime(jArr[1]);
            hiHealthData.setValue(dArr[0]);
        } else {
            LogUtil.j("Common_HWHealthDataManager", "insertData dataType = ", Integer.valueOf(i));
            hiHealthData = null;
        }
        if (hiHealthData == null) {
            return;
        }
        hiDataInsertOption.addData(hiHealthData);
        d(hiDataInsertOption, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: nkb.24
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (obj == null || i != 0) {
                    LogUtil.j("Common_HWHealthDataManager", "insertData fail errorCode = ", Integer.valueOf(i));
                    iBaseResponseCallback.a(100001, false);
                } else {
                    LogUtil.a("Common_HWHealthDataManager", "insertData success");
                    iBaseResponseCallback.a(0, obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long[] jArr, double[] dArr, String str, List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        if (jArr == null || dArr == null || dArr.length < 3) {
            LogUtil.j("Common_HWHealthDataManager", "insertBloodPressureAndHeartRateData invalid parameter");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(jArr[1]);
        hiHealthData.setEndTime(jArr[1]);
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()), Double.valueOf(dArr[0]));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value()), Double.valueOf(dArr[1]));
        if (dArr[2] > 0.0d) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()), Double.valueOf(dArr[2]));
        }
        if (dArr.length == 4) {
            if (njy.b(list)) {
                HashMap map2 = new HashMap(1);
                HiBloodPressureMetaData hiBloodPressureMetaData = new HiBloodPressureMetaData();
                hiBloodPressureMetaData.setActivityActions(list);
                map2.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()), HiJsonUtil.d(hiBloodPressureMetaData));
                hiHealthData.setFieldsMetaData(HiJsonUtil.d(map2));
            }
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()), Double.valueOf(dArr[3]));
        }
        hiHealthData.setFieldsValue(HiJsonUtil.d(map));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        d(hiDataInsertOption, iBaseResponseCallback);
    }

    public void i(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager getVo2maxDetail()");
        nkg.e().d(j, j2, iBaseResponseCallback);
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager getLastVo2max()");
        nkg.e().e(false, iBaseResponseCallback);
    }

    public void d(long j, long j2, int i, final IBaseResponseCallback iBaseResponseCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value(), DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC", BleConstants.BLOODPRESSURE_SPHYGMUS, "beforeMeasureActivity"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        if (i != 0) {
            hiAggregateOption.setCount(i);
        }
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: nkb.25
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (list == null || list.isEmpty()) {
                    iBaseResponseCallback.a(i2, null);
                } else {
                    iBaseResponseCallback.a(i2, list);
                }
            }
        });
    }

    public void c(Context context, HiDataReadProOption hiDataReadProOption, IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(context).readHiHealthDataPro(hiDataReadProOption, new a(iBaseResponseCallback));
    }

    public void b(Context context, HiDataReadOption hiDataReadOption, final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nkb.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                SparseArray sparseArray = (SparseArray) obj;
                if (iBaseResponseCallback == null) {
                    LogUtil.j("Common_HWHealthDataManager", "getBloodSugarData callback is null");
                    return;
                }
                if (sparseArray == null || sparseArray.size() <= 0) {
                    iBaseResponseCallback.a(100001, null);
                    LogUtil.j("Common_HWHealthDataManager", "map none");
                    return;
                }
                ArrayList arrayList = new ArrayList(16);
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2008));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2009));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2010));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2011));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2012));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2013));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2014));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2015));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2106));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2108));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 10001));
                LogUtil.a("Common_HWHealthDataManager", "getBloodSugarData hasData");
                if (arrayList.isEmpty()) {
                    iBaseResponseCallback.a(100001, null);
                } else {
                    LogUtil.a("Common_HWHealthDataManager", "getBloodsugarData total count = ", Integer.valueOf(arrayList.size()));
                    iBaseResponseCallback.a(0, arrayList);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.d("Common_HWHealthDataManager", "onResultIntent rest");
            }
        });
    }

    public void b(Context context, long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{10001});
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setSortOrder(1);
        if (i != 0) {
            hiDataReadOption.setCount(i);
        }
        b(context, hiDataReadOption, iBaseResponseCallback);
    }

    public static void b(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{2108});
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setSortOrder(0);
        hiDataReadOption.setCount(i);
        d().b(com.huawei.haf.application.BaseApplication.b(), hiDataReadOption, iBaseResponseCallback);
    }

    public void c(Context context, long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "getLastTimeHeartRateData enter");
        nkg.e().b(context, j, j2, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Common_HWHealthDataManager", "dealBloodOxygenCallback cannot callback");
            return;
        }
        if (!(obj instanceof SparseArray)) {
            LogUtil.j("Common_HWHealthDataManager", "dealBloodOxygenCallback can not convert");
            iBaseResponseCallback.a(0, null);
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            iBaseResponseCallback.a(0, null);
            return;
        }
        ArrayList<HiHealthData> arrayList = new ArrayList(16);
        Object obj2 = sparseArray.get(2103);
        if (obj2 instanceof List) {
            arrayList.addAll((List) obj2);
        }
        Object obj3 = sparseArray.get(2107);
        if (obj3 instanceof List) {
            arrayList.addAll((List) obj3);
        }
        HiHealthData hiHealthData = new HiHealthData();
        for (HiHealthData hiHealthData2 : arrayList) {
            if (hiHealthData2.getEndTime() > hiHealthData.getEndTime()) {
                hiHealthData = hiHealthData2;
            }
        }
        arrayList.clear();
        if (hiHealthData.getIntValue() > 0) {
            arrayList.add(hiHealthData);
        }
        iBaseResponseCallback.a(0, arrayList);
    }

    public void d(Context context, long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        LogUtil.a("Common_HWHealthDataManager", "getLastTimeBloodOxygenData startTime:", Long.valueOf(j), " endTime:", Long.valueOf(j2));
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(new int[]{2103, 2107});
        hiDataReadOption.setCount(1);
        HiHealthNativeApi.a(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nkb.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                nkb.this.d(obj, iBaseResponseCallback);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.d("Common_HWHealthDataManager", "getLastTimeBloodOxygenData onResultIntent");
            }
        });
    }

    public void e(Context context, long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "getRestHeartRateData enter");
        nkg.e().c(context, j, j2, iBaseResponseCallback);
    }

    public void e(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        nkf.a().a(new ResponseCallback<Float>() { // from class: nkb.5
            @Override // com.huawei.hwbasemgr.ResponseCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, Float f) {
                LogUtil.j("Common_HWHealthDataManager", "initGoalWeight data ", f);
                if (f == null) {
                    iBaseResponseCallback.a(100001, Double.valueOf(60.0d));
                } else {
                    iBaseResponseCallback.a(0, Double.valueOf(Double.parseDouble(String.valueOf(f))));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        lsy.a(new Runnable() { // from class: nke
            @Override // java.lang.Runnable
            public final void run() {
                this.f43154c.m();
            }
        });
    }

    /* synthetic */ void m() {
        LogUtil.a("Common_HWHealthDataManager", "updateHeartRateThroshold enter");
        UserInfomation userInfomationL = l();
        boolean z = userInfomationL.getAgeOrDefaultValue() != 0;
        this.i = z;
        if (!z) {
            LogUtil.j("Common_HWHealthDataManager", "get user info fail.");
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            linkedHashMap.put("actiontype", Integer.toString(1));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HEART_RATE_ZONE_80040005.value(), linkedHashMap);
            return;
        }
        d(userInfomationL);
    }

    private void d(UserInfomation userInfomation) {
        HiUserPreference userPreference = HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).getUserPreference("userPreference_HeartRate_all_posture_data");
        if (userPreference == null || TextUtils.isEmpty(userPreference.getValue())) {
            LogUtil.a("Common_HWHealthDataManager", "new heart data is null");
            e(userInfomation);
            return;
        }
        try {
            b((HeartRateZoneMgr) new Gson().fromJson(userPreference.getValue(), HeartRateZoneMgr.class));
            nkd.c().a(this.f43111b, userInfomation);
        } catch (JsonSyntaxException | NumberFormatException unused) {
            LogUtil.e("Common_HWHealthDataManager", " handleMultipleHeartRate parse value fail ");
            e(userInfomation);
        }
    }

    private void b(HeartRateZoneMgr heartRateZoneMgr) {
        d(this.f43111b, heartRateZoneMgr.getPostureType(1));
        this.j.countDown();
    }

    public void d(HeartZoneConf heartZoneConf, HeartRateThresholdConfig heartRateThresholdConfig) {
        if (heartRateThresholdConfig == null) {
            LogUtil.j("Common_HWHealthDataManager", "writeHeartRateZoneData config is null");
            e(l());
            return;
        }
        heartZoneConf.setWarningEnble(heartRateThresholdConfig.getWarningEnable());
        heartZoneConf.setWarningLimitHR(heartRateThresholdConfig.getWarningLimit());
        heartZoneConf.setWarningEnbleHRR(heartRateThresholdConfig.getWarningEnable());
        heartZoneConf.setWarningLimitHRHRR(heartRateThresholdConfig.getWarningLimit());
        heartZoneConf.setClassifyMethod(heartRateThresholdConfig.getClassifyMethod());
        heartZoneConf.setRestHeartRateDefault(heartRateThresholdConfig.getRestHeartRateDefault());
        heartZoneConf.setRestHeartRate(heartRateThresholdConfig.getRestHeartRate());
        heartZoneConf.setFitnessThreshold(heartRateThresholdConfig.getFitnessThreshold());
        heartZoneConf.setWarmUpThreshold(heartRateThresholdConfig.getWarmUpThreshold());
        heartZoneConf.setFatBurnThreshold(heartRateThresholdConfig.getFatBurnThreshold());
        heartZoneConf.setAerobicThreshold(heartRateThresholdConfig.getAerobicThreshold());
        heartZoneConf.setAnaerobicThreshold(heartRateThresholdConfig.getAnaerobicThreshold());
        heartZoneConf.setMaxThreshold(heartRateThresholdConfig.getMaxThreshold());
        heartZoneConf.setAerobicBaseThreshold(heartRateThresholdConfig.getAerobicBaseThreshold());
        heartZoneConf.setAerobicAdvanceThreshold(heartRateThresholdConfig.getAerobicAdvanceThreshold());
        heartZoneConf.setLacticAcidThreshold(heartRateThresholdConfig.getLacticAcidThreshold());
        heartZoneConf.setAnaerobicBaseThreshold(heartRateThresholdConfig.getAnaerobicBaseThreshold());
        heartZoneConf.setAnaerobicAdvanceThreshold(heartRateThresholdConfig.getAnaerobicAdvanceThreshold());
        heartZoneConf.setHrrMaxThreshold(heartRateThresholdConfig.getMaxThreshold());
    }

    private void e(UserInfomation userInfomation) {
        String birthday = userInfomation.getBirthday();
        int ageOrDefaultValue = userInfomation.getAgeOrDefaultValue();
        if (Integer.toString(-100).equals(birthday)) {
            ageOrDefaultValue = 25;
        }
        HeartZoneConf heartZoneConf = new HeartZoneConf(ageOrDefaultValue);
        heartZoneConf.setRestHeartRateDefault(this.f43111b.getRestHeartRateDefault());
        heartZoneConf.resetHeartZoneConf(ageOrDefaultValue);
        Context context = BaseApplication.getContext();
        HiUserPreference userPreference = HiHealthManager.d(context).getUserPreference("custom.UserPreference_HeartRate_Classify_Method");
        int iJ = userPreference != null ? CommonUtil.j(userPreference.getValue()) : 0;
        heartZoneConf.setClassifyMethod(iJ);
        int restHeartRateDefault = this.f43111b.getRestHeartRateDefault();
        HiUserPreference userPreference2 = HiHealthManager.d(context).getUserPreference("custom.UserPreference_Rest_HeartRate");
        if (userPreference2 != null) {
            restHeartRateDefault = CommonUtil.e(userPreference2.getValue(), 60);
        }
        heartZoneConf.setRestHeartRate(restHeartRateDefault);
        HiUserPreference userPreference3 = HiHealthManager.d(context).getUserPreference("custom.UserPreference_HeartRate_Limit_Flag");
        HiUserPreference userPreference4 = HiHealthManager.d(context).getUserPreference("custom.UserPreference_HeartRate_Flag");
        d(heartZoneConf, userPreference3, userPreference4);
        b(heartZoneConf, userPreference3, userPreference4);
        LogUtil.d("Common_HWHealthDataManager", "getHeartZoneConf ", heartZoneConf);
        this.f43111b.setClassifyMethod(iJ);
        this.f43111b.setRestHeartRate(restHeartRateDefault);
        this.f43111b.setHeartZoneConf(heartZoneConf);
        this.f43111b.setHRRHeartZoneConf(heartZoneConf);
        nkd.c().a(heartZoneConf, userInfomation);
        this.j.countDown();
    }

    private void d(HeartZoneConf heartZoneConf, HiUserPreference hiUserPreference, HiUserPreference hiUserPreference2) {
        if (heartZoneConf == null) {
            return;
        }
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartZone_Config");
        int warningLimitHR = heartZoneConf.getWarningLimitHR();
        int maxThreshold = heartZoneConf.getMaxThreshold();
        if (userPreference == null || userPreference.getValue() == null) {
            return;
        }
        String[] strArrSplit = userPreference.getValue().split(",");
        if (strArrSplit.length != 2) {
            return;
        }
        heartZoneConf.setHRZoneConf(strArrSplit[0]);
        heartZoneConf.setThreshold(strArrSplit[1]);
        if (hiUserPreference != null) {
            int iJ = CommonUtil.j(hiUserPreference.getValue());
            if (iJ == 0) {
                heartZoneConf.setWarningLimitHR(warningLimitHR);
            }
            nkd.c().c(iJ != 0);
        }
        if (hiUserPreference2 != null) {
            int iJ2 = CommonUtil.j(hiUserPreference2.getValue());
            if (iJ2 == 0) {
                heartZoneConf.setMaxThreshold(maxThreshold);
            }
            nkd.c().d(iJ2 != 0);
        }
    }

    private void b(HeartZoneConf heartZoneConf, HiUserPreference hiUserPreference, HiUserPreference hiUserPreference2) {
        if (heartZoneConf == null) {
            return;
        }
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HRRHeartZone_Config");
        int warningLimitHRHRR = heartZoneConf.getWarningLimitHRHRR();
        int hrrMaxThreshold = heartZoneConf.getHrrMaxThreshold();
        if (userPreference == null || userPreference.getValue() == null) {
            return;
        }
        String[] strArrSplit = userPreference.getValue().split(",");
        if (strArrSplit.length != 2) {
            return;
        }
        heartZoneConf.setHRRHRZoneConf(strArrSplit[0]);
        heartZoneConf.setHrrThreshold(strArrSplit[1]);
        if (hiUserPreference != null && CommonUtil.j(hiUserPreference.getValue()) == 0) {
            heartZoneConf.setWarningLimitHRHRR(warningLimitHRHRR);
        }
        if (hiUserPreference2 == null || CommonUtil.j(hiUserPreference2.getValue()) != 0) {
            return;
        }
        heartZoneConf.setHrrMaxThreshold(hrrMaxThreshold);
    }

    public void a(final HeartZoneConf heartZoneConf) {
        this.k.execute(new Runnable() { // from class: nkb.2
            @Override // java.lang.Runnable
            public void run() {
                HeartZoneConf heartZoneConf2 = heartZoneConf;
                if (heartZoneConf2 != null) {
                    nkb.this.f43111b = heartZoneConf2;
                }
                Context context = BaseApplication.getContext();
                nkb.this.e(context, "custom.UserPreference_HeartRate_Limit_Flag");
                nkb.this.e(context, "custom.UserPreference_HeartRate_Flag");
                HiHealthManager.d(context).setUserPreference(new HiUserPreference("custom.UserPreference_HeartRate_Classify_Method", String.valueOf(nkb.this.f43111b.getClassifyMethod())), true);
                HiHealthManager.d(context).setUserPreference(new HiUserPreference("custom.UserPreference_Rest_HeartRate", String.valueOf(nkb.this.f43111b.getRestHeartRate())), true);
                HiHealthManager.d(context).setUserPreference(new HiUserPreference("custom.UserPreference_HRRHeartZone_Config", nkb.this.f43111b.getHRRHRZoneConfStr() + "," + nkb.this.f43111b.getHrrThresholdString()), true);
                HiHealthManager.d(context).setUserPreference(new HiUserPreference("custom.UserPreference_HeartZone_Config", nkb.this.f43111b.getHRZoneConfStr() + "," + nkb.this.f43111b.getThresholdString()), true);
                LogUtil.a("Common_HWHealthDataManager", "setHRRHeartRateThrosholdConf write over");
                if (Utils.h()) {
                    HiSyncOption hiSyncOption = new HiSyncOption();
                    hiSyncOption.setSyncModel(2);
                    hiSyncOption.setSyncAction(0);
                    hiSyncOption.setSyncDataType(10026);
                    hiSyncOption.setSyncScope(1);
                    hiSyncOption.setSyncMethod(2);
                    HiHealthNativeApi.a(nkb.e).synCloud(hiSyncOption, null);
                }
                CommonUtil.am(nkb.e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, String str) {
        try {
            if (HiHealthManager.d(context).getUserPreference(str) == null) {
                HiHealthManager.d(context).setUserPreference(new HiUserPreference(str, "0"), true);
                LogUtil.d("Common_HWHealthDataManager", "writeHeartDataToDataBase userPreferenceLimitHeart is null");
            }
        } catch (Exception e2) {
            LogUtil.e("Common_HWHealthDataManager", LogAnonymous.b(e2));
        }
    }

    public void d(HeartZoneConf heartZoneConf) {
        LogUtil.a("Common_HWHealthDataManager", "setHeartRateThrosholdConf enter");
        this.f43111b.setHeartZoneConf(heartZoneConf);
    }

    public void c(HeartZoneConf heartZoneConf) {
        LogUtil.a("Common_HWHealthDataManager", "setHRRHeartRateThrosholdConf enter");
        this.f43111b.setHRRHeartZoneConf(heartZoneConf);
    }

    public void a(int i) {
        this.f43111b.setClassifyMethod(i);
    }

    public void b(int i) {
        this.f43111b.setRestHeartRate(i);
    }

    public void e(final String str, final String str2) {
        LogUtil.a("Common_HWHealthDataManager", "writeUnitToDb");
        this.k.execute(new Runnable() { // from class: nkb.6
            @Override // java.lang.Runnable
            public void run() {
                HiHealthManager.d(nkb.e).setUserPreference(new HiUserPreference(str, str2));
                if (Utils.h()) {
                    HiHealthNativeApi.a(nkb.e).synCloud(HiSyncOption.getAutoSyncOption(10026), null);
                }
            }
        });
    }

    public void p() {
        this.k.execute(new Runnable() { // from class: nkb.10
            @Override // java.lang.Runnable
            public void run() {
                HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.metric_imperial_unit");
                HiUserPreference userPreference2 = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.temperature_unit");
                HiUserPreference userPreference3 = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.weight_unit");
                nkb.this.e(userPreference);
                nkb.this.a(userPreference2);
                nkb.this.b(userPreference3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HiUserPreference hiUserPreference) {
        int iJ = (hiUserPreference == null || !b(hiUserPreference.getValue())) ? 0 : CommonUtil.j(hiUserPreference.getValue());
        if (iJ != 0) {
            UnitUtil.a(iJ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public void e(HiUserPreference hiUserPreference) {
        boolean z;
        if (hiUserPreference != null && b(hiUserPreference.getValue())) {
            z = qrs.a(hiUserPreference.getValue()) == 1;
        }
        UnitUtil.b("Common_HWHealthDataManager", z);
    }

    private boolean b(String str) {
        if (str == null || "".equals(str.trim())) {
            return false;
        }
        return Pattern.compile("[0-9]+").matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HiUserPreference hiUserPreference) {
        String value;
        if (hiUserPreference == null) {
            value = "";
        } else {
            value = hiUserPreference.getValue();
        }
        UnitUtil.d(!"false".equals(value));
    }

    public void a(Context context, long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        int[] iArrE = HiHealthDataType.e(10006);
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimeInterval(j, j2);
        hiDataDeleteOption.setTypes(iArrE);
        LogUtil.d("Common_HWHealthDataManager", "deleteWeightDatas 222 begain query");
        HiHealthManager.d(context).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: nkb.9
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (!(obj instanceof Boolean)) {
                    iBaseResponseCallback.a(100001, false);
                    return;
                }
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    iBaseResponseCallback.a(0, bool);
                    LogUtil.a("Common_HWHealthDataManager", "deleteWeightData ErrorConstants.SUCCESS");
                } else {
                    iBaseResponseCallback.a(100001, bool);
                    LogUtil.j("Common_HWHealthDataManager", "deleteWeightData ErrorConstants.ERR_NONE");
                }
            }
        });
    }

    public void c(Context context, List<HiTimeInterval> list, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimes(list);
        hiDataDeleteOption.setTypes(HiHealthDataType.e(10006));
        LogUtil.d("Common_HWHealthDataManager", "deleteWeightDatas 111 begain query");
        HiHealthManager.d(context).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: nkb.8
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        iBaseResponseCallback.a(0, true);
                        return;
                    }
                } else {
                    LogUtil.j("Common_HWHealthDataManager", "deleteWeightDatas,obj is not instanceof Boolean");
                }
                iBaseResponseCallback.a(100001, false);
            }
        });
    }

    public void b(final List<HiTimeInterval> list, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimes(list);
        hiDataDeleteOption.setTypes(new int[]{DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_ABNORMAL.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_REMINDER.value(), DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()});
        HiHealthManager.d(BaseApplication.getContext()).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: nkb.7
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (i != 0) {
                    LogUtil.j("Common_HWHealthDataManager", "deleteBloodPressureDatas fail, errorCode = ", Integer.valueOf(i));
                    iBaseResponseCallback.a(i, false);
                } else {
                    LogUtil.a("Common_HWHealthDataManager", "deleteBloodPressureDatas success");
                    nkb.this.d((List<HiTimeInterval>) list, iBaseResponseCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiTimeInterval> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "deletePulse start");
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimes(list);
        hiDataDeleteOption.setTypes(new int[]{DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()});
        HiHealthManager.d(BaseApplication.getContext()).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: nkb.14
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (i != 0) {
                    LogUtil.j("Common_HWHealthDataManager", "deletePulse fail, errorCode = ", Integer.valueOf(i));
                } else {
                    LogUtil.a("Common_HWHealthDataManager", "deletePulse success");
                }
                iBaseResponseCallback.a(0, true);
            }
        });
    }

    public void d(Context context, int i, long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimeInterval(j, j2);
        hiDataDeleteOption.setTypes(new int[]{i});
        HiHealthManager.d(context).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: nkb.11
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                if (i2 == 9) {
                    iBaseResponseCallback.a(100001, obj);
                } else {
                    iBaseResponseCallback.a(0, obj);
                }
            }
        });
    }

    public void c(Context context, List<HiTimeInterval> list, int[] iArr, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || list == null || iArr == null || iBaseResponseCallback == null) {
            LogUtil.j("context == null || hiTimeIntervalList == null || types == null || callback == null", new Object[0]);
            return;
        }
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimes(list);
        hiDataDeleteOption.setTypes(iArr);
        HiHealthManager.d(context).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: nkb.12
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (i == 9) {
                    iBaseResponseCallback.a(100001, obj);
                } else {
                    iBaseResponseCallback.a(0, obj);
                }
            }
        });
    }

    public void d(final IBaseResponseCallback iBaseResponseCallback, long j) {
        HiTimeInterval hiTimeInterval = new HiTimeInterval();
        hiTimeInterval.setStartTime(j);
        hiTimeInterval.setEndTime(lsl.c(j));
        LogUtil.a("Common_HWHealthDataManager", "getCurrentDaySportDataOrigin getHealthApi in. DataOriginStartDay = ", hiTimeInterval);
        HiHealthManager.d(e).fetchDataSourceByType(2, hiTimeInterval, new HiDataClientListener() { // from class: nkb.13
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public void onResult(List<HiHealthClient> list) {
                LogUtil.a("Common_HWHealthDataManager", "getCurrentDaySportDataOrigin getHealthApi out.");
                if (list == null) {
                    LogUtil.j("Common_HWHealthDataManager", "getCurrentDaySportDataOrigin, clientList is null");
                    iBaseResponseCallback.a(1, Collections.EMPTY_LIST);
                } else {
                    LogUtil.a("Common_HWHealthDataManager", "getCurrentDaySportDataOrigin SUCCESS");
                    iBaseResponseCallback.a(0, list);
                }
            }
        });
    }

    public HeartZoneConf j() {
        return this.f43111b;
    }

    public HeartZoneConf i() {
        LogUtil.a("Common_HWHealthDataManager", "enter getHeartZoneConfForBluetoothSend");
        try {
            if (!this.j.await(20L, TimeUnit.SECONDS)) {
                LogUtil.j("Common_HWHealthDataManager", "get info timeout.");
                return null;
            }
            LogUtil.a("Common_HWHealthDataManager", "latch over, return object.");
            if (!this.i) {
                LogUtil.j("Common_HWHealthDataManager", "getHeartZoneConfForBluetoothSend get userinfo fail");
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
                linkedHashMap.put("actiontype", Integer.toString(3));
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HEART_RATE_ZONE_80040005.value(), linkedHashMap);
                return null;
            }
            if (this.f43111b.getAnaerobicThreshold() > this.f43111b.getMaxThreshold() || this.f43111b.getAnaerobicAdvanceThreshold() > this.f43111b.getHrrMaxThreshold()) {
                LogUtil.a("Common_HWHealthDataManager", "getHeartZoneConfForBluetoothSend threshold wrong");
                LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(1);
                linkedHashMap2.put("actiontype", Integer.toString(4));
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HEART_RATE_ZONE_80040005.value(), linkedHashMap2);
            }
            return this.f43111b;
        } catch (InterruptedException e2) {
            LogUtil.e("Common_HWHealthDataManager", "getHeartZoneConfForBluetoothSend exception : ", e2.getMessage());
            return null;
        }
    }

    public void n() {
        if (this.f43111b.getClassifyMethod() == 1) {
            q();
        }
        this.f43111b.resetHeartZoneConf(l().getAgeOrDefaultValue());
        o();
    }

    private void q() {
        HeartZoneConf heartZoneConf = this.f43111b;
        heartZoneConf.setRestHeartRate(heartZoneConf.getRestHeartRateDefault());
    }

    public int g() {
        return this.f43111b.getFitnessThreshold();
    }

    public int h() {
        return this.f43111b.getWarmUpThreshold();
    }

    public int c() {
        return this.f43111b.getAerobicBaseThreshold();
    }

    public int a() {
        return this.f43111b.getAerobicAdvanceThreshold();
    }

    public UserInfomation l() {
        UserInfomation userInfoFromDbSync = LoginInit.getInstance(e).getUserInfoFromDbSync();
        if (userInfoFromDbSync != null) {
            return userInfoFromDbSync;
        }
        UserInfomation userInfomation = new UserInfomation();
        LogUtil.a("Common_HWHealthDataManager", "getLocalUserinfo new userInfomation");
        return userInfomation;
    }

    public void o() {
        HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("custom.UserPreference_HeartRate_Flag", "0"), true);
    }

    public int f() {
        int maxThreshold = new HeartZoneConf(l().getAgeOrDefaultValue()).getMaxThreshold();
        LogUtil.a("Common_HWHealthDataManager", "getHeartRateMaxValue from age = ", Integer.valueOf(maxThreshold));
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartZone_Config");
        if (userPreference != null && userPreference.getValue() != null) {
            String[] strArrSplit = userPreference.getValue().split(",");
            if (strArrSplit.length == 2) {
                String[] strArrSplit2 = strArrSplit[1].split("\\|");
                try {
                    if (strArrSplit2.length > 5) {
                        maxThreshold = Integer.parseInt(strArrSplit2[5]);
                        LogUtil.a("Common_HWHealthDataManager", "getHeartRateMaxValue from sp = ", Integer.valueOf(maxThreshold));
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    LogUtil.e("Common_HWHealthDataManager", e2.getMessage());
                } catch (NumberFormatException e3) {
                    LogUtil.e("Common_HWHealthDataManager", e3.getMessage());
                }
            }
        }
        LogUtil.d("Common_HWHealthDataManager", "getHeartRateMaxValue iMax = ", Integer.valueOf(maxThreshold));
        return maxThreshold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        lsy.a(new Runnable() { // from class: nka
            @Override // java.lang.Runnable
            public final void run() {
                this.f43108c.k();
            }
        });
    }

    /* synthetic */ void k() {
        LogUtil.a("Common_HWHealthDataManager", "MigrateHeartZoneConf enter");
        HeartZoneConf heartZoneConf = new HeartZoneConf(l().getAgeOrDefaultValue());
        e("custom.UserPreference_HeartRate_Classify_Method");
        e("custom.UserPreference_Rest_HeartRate");
        b(heartZoneConf, "custom.UserPreference_HeartZone_Config");
        b(heartZoneConf, "custom.UserPreference_HRRHeartZone_Config");
        LogUtil.a("Common_HWHealthDataManager", "MigrateHeartZoneConf exit");
    }

    private void e(String str) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
        if (userPreference == null) {
            return;
        }
        int iJ = CommonUtil.j(userPreference.getValue());
        if (str.equals("custom.UserPreference_HeartRate_Classify_Method")) {
            a(iJ);
        } else if (str.equals("custom.UserPreference_Rest_HeartRate")) {
            b(iJ);
        } else {
            LogUtil.j("Common_HWHealthDataManager", "setHeartRateConf1 flag is wrong");
        }
    }

    private void b(HeartZoneConf heartZoneConf, String str) {
        LogUtil.d("Common_HWHealthDataManager", "getHeartZoneConf ", heartZoneConf);
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
        if (userPreference == null || userPreference.getValue() == null) {
            return;
        }
        String[] strArrSplit = userPreference.getValue().split(",");
        if (strArrSplit.length != 2) {
            return;
        }
        str.hashCode();
        if (str.equals("custom.UserPreference_HeartZone_Config")) {
            this.f43111b.setThreshold(strArrSplit[0]);
            d(this.f43111b);
        } else if (str.equals("custom.UserPreference_HRRHeartZone_Config")) {
            this.f43111b.setHrrThreshold(strArrSplit[0]);
            c(this.f43111b);
        } else {
            LogUtil.j("Common_HWHealthDataManager", "setHeartRateConf2 flag is wrong");
        }
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "acquireLastTrackData");
        nkx.e().e(iBaseResponseCallback);
    }

    public void b(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        LogUtil.a("Common_HWHealthDataManager", "requestDivingData with isDistinguished is ", Boolean.valueOf(z));
        nkx.e().c(j, j2, i, iBaseResponseCallback, z);
    }

    public void e(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        b(j, j2, i, iBaseResponseCallback, false);
    }

    public void c(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "requestTrackSimplifyData");
        nkx.e().c(j, j2, i, false, iBaseResponseCallback);
    }

    public void a(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        nkx.e().d(j, j2, i, iBaseResponseCallback);
    }

    public void e(ntx ntxVar, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "requestTrackSimplifyData");
        nkx.e().d(ntxVar, false, iBaseResponseCallback);
    }

    public void b(long j, long j2, int[] iArr, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "requestTrackSimplifyData");
        nkx.e().d(j, j2, iArr, false, iBaseResponseCallback);
    }

    public void a(long j, long j2, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "requestTrackStatData");
        nkx.e().c(j, j2, i, i2, iBaseResponseCallback);
    }

    public void b(long j, long j2, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        nkx.e().b(j, j2, i, i2, iBaseResponseCallback);
    }

    public void b(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager getStressDatasForDiagram()");
        nkp.a().d(j, j2, iBaseResponseCallback);
    }

    public void c(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager getPressureMeasureStatistic()");
        nkp.a().b(j, j2, iBaseResponseCallback);
    }

    public void c(String str, HiStressMetaData hiStressMetaData, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWHealthDataManager", "HWHealthDataManager setStressData");
        nkp.a().c(str, hiStressMetaData, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{46018, 46020});
        hiAggregateOption.setConstantsKey(new String[]{"HR_REST", "HR_SLEEP_REST"});
        hiAggregateOption.setStartTime(qrk.c(jCurrentTimeMillis, -30));
        hiAggregateOption.setEndTime(jCurrentTimeMillis);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(3);
        hiAggregateOption.setGroupUnitType(3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiAggregateOption);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: nkb.20
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                if (sparseArray == null || sparseArray.size() == 0) {
                    LogUtil.j("Common_HWHealthDataManager", "there is no average rest heart rate!", " and ", " errorCode :", Integer.valueOf(i));
                    nkb.this.f43111b.setRestHeartRateDefault(60);
                    nkd.c().b(60);
                } else {
                    nkb nkbVar = nkb.this;
                    float fA = nkbVar.a(nkbVar.e(sparseArray)) + 0.0f;
                    if (fA != 0.0f) {
                        nkb.this.f43111b.setRestHeartRateDefault(Math.round(fA));
                    } else {
                        LogUtil.j("Common_HWHealthDataManager", "there is average rest heart rate is zero");
                        nkb.this.f43111b.setRestHeartRateDefault(60);
                    }
                    nkd.c().b(fA != 0.0f ? Math.round(fA) : 60);
                }
                nkb.this.t();
            }
        });
    }

    public List<HiHealthData> e(SparseArray<List<HiHealthData>> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(sparseArray.get(1))) {
            List<HiHealthData> list = sparseArray.get(1);
            LogUtil.a("Common_HWHealthDataManager", "average rest heart rate newValue = ", list.toString());
            arrayList.addAll(list);
        }
        if (!njy.e(sparseArray.get(0))) {
            List<HiHealthData> list2 = sparseArray.get(0);
            LogUtil.a("Common_HWHealthDataManager", "average rest heart rate oldValue = ", list2.toString());
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public float a(List<HiHealthData> list) {
        float f;
        float f2;
        int i = 0;
        if (njy.e(list)) {
            f = 0.0f;
        } else {
            f = 0.0f;
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getFloat("HR_SLEEP_REST") > 0.0f) {
                    f2 = hiHealthData.getFloat("HR_SLEEP_REST");
                } else {
                    f2 = hiHealthData.getFloat("HR_REST");
                }
                f += f2;
                i++;
            }
        }
        if (i != 0) {
            return f / i;
        }
        LogUtil.j("Common_HWHealthDataManager", "count IS  ZERO");
        return 0.0f;
    }

    public static List<HiHealthData> c(SparseArray<Object> sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof List) {
            try {
                return (List) obj;
            } catch (ClassCastException unused) {
                LogUtil.e("Common_HWHealthDataManager", "filterHiHealthDataList, is not List<HiHealthData>");
                return Collections.EMPTY_LIST;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public void e(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        int[] iArr = {257, 258, 259, 260, 262, 264, OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE, OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM, 281, 282};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: nkb.19
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    health.compact.a.util.LogUtil.d("Common_HWHealthDataManager", "getSportRecords callback is null");
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    iBaseResponseCallback2.a(100001, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (!(sparseArray.get(i) instanceof List)) {
                    iBaseResponseCallback.a(100001, null);
                    return;
                }
                List list = (List) sparseArray.get(i);
                if (njy.e(list)) {
                    health.compact.a.util.LogUtil.d("Common_HWHealthDataManager", "getSportRecords healthDataList none");
                    iBaseResponseCallback.a(100001, null);
                } else {
                    iBaseResponseCallback.a(0, list);
                }
            }
        });
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static class a implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IBaseResponseCallback f43139c;

        public a(IBaseResponseCallback iBaseResponseCallback) {
            this.f43139c = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.d("Common_HWHealthDataManager", "data=", obj, "errorCode=", Integer.valueOf(i), "anchor", Integer.valueOf(i2));
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                if (this.f43139c == null) {
                    LogUtil.j("Common_HWHealthDataManager", "getBloodSugarData callback is null");
                    return;
                }
                if (sparseArray.size() == 0) {
                    this.f43139c.a(100001, null);
                    LogUtil.j("Common_HWHealthDataManager", "map none");
                    return;
                }
                ArrayList arrayList = new ArrayList(16);
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2008));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2009));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2010));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2011));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2012));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2013));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2014));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2015));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2106));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 2108));
                arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, 10001));
                LogUtil.a("Common_HWHealthDataManager", "getBloodSugarData hasData");
                if (arrayList.isEmpty()) {
                    this.f43139c.a(100001, null);
                } else {
                    LogUtil.a("Common_HWHealthDataManager", "getBloodsugarData total count = ", Integer.valueOf(arrayList.size()));
                    this.f43139c.a(0, arrayList);
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.d("Common_HWHealthDataManager", "onResultIntent rest");
        }
    }
}
