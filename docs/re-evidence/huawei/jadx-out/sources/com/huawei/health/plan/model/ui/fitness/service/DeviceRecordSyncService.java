package com.huawei.health.plan.model.ui.fitness.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.model.RateInfo;
import com.huawei.health.courseplanservice.api.OnStateListener;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.devicemgr.api.constant.DataCallbackType;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.btt;
import defpackage.buh;
import defpackage.dsf;
import defpackage.dsh;
import defpackage.dsj;
import defpackage.ecu;
import defpackage.gls;
import defpackage.ifp;
import defpackage.njy;
import defpackage.nuc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class DeviceRecordSyncService extends Service {
    private int d;
    private a e;
    private int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f8588a = new DeviceDataSyncBinder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8590c = false;
    private boolean j = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f8589b = new IBaseResponseCallback() { // from class: com.huawei.health.plan.model.ui.fitness.service.DeviceRecordSyncService.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i != 5) {
                if (i == 7) {
                    d(obj);
                    return;
                } else {
                    if (i != 127) {
                        return;
                    }
                    Integer num = (Integer) obj;
                    int iIntValue = num.intValue();
                    LogUtil.e("Suggestion_DeviceRecordSyncService", "sync fail error code:", num);
                    DeviceRecordSyncService.this.e(2, String.valueOf(iIntValue));
                    return;
                }
            }
            if (njy.b(obj, dsf.class)) {
                for (dsf dsfVar : (List) obj) {
                    if (dsfVar != null) {
                        DeviceRecordSyncService.this.e(dsfVar);
                    }
                }
                DeviceRecordSyncService.this.j = true;
                HashMap map = new HashMap(16);
                map.put(1, String.valueOf(5));
                map.put(2, String.valueOf(100000));
                ecu.d().sendDeviceData(36, 12, map, null, "Suggestion_DeviceRecordSyncService");
                if (DeviceRecordSyncService.this.f8590c && DeviceRecordSyncService.this.j) {
                    DeviceRecordSyncService deviceRecordSyncService = DeviceRecordSyncService.this;
                    deviceRecordSyncService.a(deviceRecordSyncService.d);
                    DeviceRecordSyncService.this.c();
                }
            }
        }

        private void d(Object obj) {
            if (njy.b(obj, dsj.class)) {
                for (dsj dsjVar : (List) obj) {
                    if (dsjVar != null) {
                        DeviceRecordSyncService.this.a(dsjVar);
                    }
                }
                DeviceRecordSyncService.this.f8590c = true;
                HashMap map = new HashMap(16);
                map.put(1, String.valueOf(7));
                map.put(2, String.valueOf(100000));
                ecu.d().sendDeviceData(36, 12, map, null, "Suggestion_DeviceRecordSyncService");
                if (DeviceRecordSyncService.this.f8590c && DeviceRecordSyncService.this.j) {
                    DeviceRecordSyncService deviceRecordSyncService = DeviceRecordSyncService.this;
                    deviceRecordSyncService.a(deviceRecordSyncService.d);
                    DeviceRecordSyncService.this.c();
                }
            }
        }
    };

    public class DeviceDataSyncBinder extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        OnStateListener f8592a;

        public DeviceDataSyncBinder() {
        }

        public OnStateListener getListener() {
            return this.f8592a;
        }

        public void setListener(OnStateListener onStateListener) {
            this.f8592a = onStateListener;
        }

        public void dataSync() {
            DeviceRecordSyncService.this.e.sendEmptyMessage(0);
        }
    }

    static class a extends Handler {
        private final WeakReference<DeviceRecordSyncService> e;

        a(DeviceRecordSyncService deviceRecordSyncService) {
            this.e = new WeakReference<>(deviceRecordSyncService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DeviceRecordSyncService deviceRecordSyncService = this.e.get();
            if (deviceRecordSyncService == null) {
                LogUtil.j("Suggestion_DeviceRecordSyncService", "handleMessage, service == null");
                super.handleMessage(message);
            } else {
                if (message.what != 0) {
                    return;
                }
                deviceRecordSyncService.b();
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.e = new a(this);
        LogUtil.a("Suggestion_DeviceRecordSyncService", "start data sync service");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            super.onStartCommand(intent, i, i2);
        }
        this.e.sendEmptyMessage(0);
        LogUtil.a("Suggestion_DeviceRecordSyncService", "onStartCommand ");
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str) {
        IBinder iBinder = this.f8588a;
        if (iBinder instanceof DeviceDataSyncBinder) {
            OnStateListener listener = ((DeviceDataSyncBinder) iBinder).getListener();
            LogUtil.a("Suggestion_DeviceRecordSyncService", "onStateListener:", listener);
            if (listener != null) {
                listener.onFailure(i, str);
            }
            stopSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        IBinder iBinder = this.f8588a;
        if (iBinder instanceof DeviceDataSyncBinder) {
            OnStateListener listener = ((DeviceDataSyncBinder) iBinder).getListener();
            if (listener != null) {
                listener.onFinish();
            }
            stopSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_DeviceRecordSyncService");
        if (deviceInfo == null) {
            LogUtil.a("Suggestion_DeviceRecordSyncService", "device is not connected!");
            e(0, "device is not connected");
            return;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = ecu.d().queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "Suggestion_DeviceRecordSyncService");
        if (mapQueryDeviceCapability == null) {
            LogUtil.j("Suggestion_DeviceRecordSyncService", "dataSync deviceCapabilityHashMaps is null!");
            return;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability == null) {
            LogUtil.j("Suggestion_DeviceRecordSyncService", "dataSync deviceCapability is null!");
            return;
        }
        if (!deviceCapability.isSupportPosture()) {
            LogUtil.a("Suggestion_DeviceRecordSyncService", "device is not support!");
            e(1, "device is not support");
        } else {
            this.h = e();
            this.d = (int) (System.currentTimeMillis() / 1000);
            LogUtil.a("Suggestion_DeviceRecordSyncService", "enter queryDeviceRecords");
            btt.d().c(new Runnable() { // from class: com.huawei.health.plan.model.ui.fitness.service.DeviceRecordSyncService.1
                @Override // java.lang.Runnable
                public void run() {
                    ecu.d().registerDataCallback(DeviceRecordSyncService.this.f8589b, DataCallbackType.FITNESS_POSTURE_MANAGER, "Suggestion_DeviceRecordSyncService");
                    HashMap map = new HashMap(16);
                    map.put(1, String.valueOf(DeviceRecordSyncService.this.h));
                    map.put(2, String.valueOf(DeviceRecordSyncService.this.d));
                    ecu.d().sendDeviceData(36, 7, map, null, "Suggestion_DeviceRecordSyncService");
                    ecu.d().sendDeviceData(36, 5, map, null, "Suggestion_DeviceRecordSyncService");
                }
            });
        }
    }

    private int e() {
        LogUtil.a("Suggestion_DeviceRecordSyncService", "getLastSyncTime:", buh.e("deviceLastSyncTime"));
        return ifp.e((Object) buh.e("deviceLastSyncTime"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("Suggestion_DeviceRecordSyncService", "setLastSyncTime:", Integer.valueOf(i));
        buh.d("deviceLastSyncTime", String.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(dsj dsjVar) {
        LogUtil.a("Suggestion_DeviceRecordSyncService", "courseRecord:", dsjVar.toString());
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveWorkoutId(dsjVar.b());
        workoutRecord.saveWorkoutName(dsjVar.f());
        workoutRecord.saveExerciseTime(((long) dsjVar.j()) * 1000);
        workoutRecord.setDuration(dsjVar.m() * 1000);
        workoutRecord.saveFinishRate(dsjVar.a());
        workoutRecord.saveActionSummary(new Gson().toJson(e(dsjVar.i())));
        LogUtil.a("Suggestion_DeviceRecordSyncService", "saveActionSummary", new Gson().toJson(dsjVar.i()));
        workoutRecord.saveActualCalorie(dsjVar.e() * 1000.0f);
        RateInfo rateInfo = new RateInfo();
        rateInfo.saveMaxRate(dsjVar.n());
        rateInfo.saveMinRate(dsjVar.o());
        rateInfo.saveLimit(dsjVar.k());
        rateInfo.setAnaerobic(dsjVar.d());
        rateInfo.setAerobic(dsjVar.c());
        rateInfo.saveFatBurning(dsjVar.h());
        rateInfo.saveWarmUp(dsjVar.l());
        workoutRecord.saveExtend(false, 0, rateInfo);
        workoutRecord.saveWearType(dsjVar.g());
        gls.b().updatePlanProgress(workoutRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(dsf dsfVar) {
        LogUtil.a("Suggestion_DeviceRecordSyncService", "postureRecord:", dsfVar.toString());
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveWorkoutId("D" + dsfVar.o());
        workoutRecord.saveWorkoutName(dsfVar.k());
        workoutRecord.saveExerciseTime(((long) dsfVar.h()) * 1000);
        workoutRecord.setDuration(dsfVar.p() * 1000);
        workoutRecord.saveActionSummary("[]");
        if (dsfVar.i() != 0) {
            if (dsfVar.f() == 0) {
                workoutRecord.saveFinishRate((dsfVar.g() * 100.0f) / dsfVar.i());
            } else if (dsfVar.f() == 1) {
                workoutRecord.saveFinishRate((dsfVar.p() * 100.0f) / dsfVar.i());
            }
        }
        workoutRecord.saveActualCalorie(dsfVar.b() * 1000.0f);
        RateInfo rateInfo = new RateInfo();
        rateInfo.saveMaxRate(dsfVar.n());
        rateInfo.saveMinRate(dsfVar.m());
        rateInfo.saveLimit(dsfVar.l());
        rateInfo.setAnaerobic(dsfVar.a());
        rateInfo.setAerobic(dsfVar.d());
        rateInfo.saveFatBurning(dsfVar.j());
        rateInfo.saveWarmUp(dsfVar.s());
        workoutRecord.saveExtend(true, dsfVar.g(), dsfVar.c(), rateInfo);
        workoutRecord.saveWearType(dsfVar.e());
        gls.b().updatePlanProgress(workoutRecord);
    }

    private List<RecordAction> e(List<dsh> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (dsh dshVar : list) {
            if (dshVar != null) {
                arrayList.add(new RecordAction("", dshVar.e(), dshVar.d(), dshVar.b(), nuc.a(dshVar.c())));
            }
        }
        return arrayList;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ecu.d().unregisterDataCallback(0);
        LogUtil.a("Suggestion_DeviceRecordSyncService", "destroy data sync service");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        LogUtil.a("Suggestion_DeviceRecordSyncService", "onBind ");
        return this.f8588a;
    }
}
