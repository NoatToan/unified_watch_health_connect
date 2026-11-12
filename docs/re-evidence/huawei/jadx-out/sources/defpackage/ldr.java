package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.HealthAlarmInfo;
import com.huawei.hihealth.model.Subscriber;
import com.huawei.hihealthservice.hihealthkit.model.DataObservableNoCallback;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorItem;
import com.huawei.wearengine.monitor.MonitorListener;
import health.compact.a.DeviceUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class ldr extends DataObservableNoCallback<Subscriber> {
    private static Context sContext;
    private static ldr sInstance;
    private String currentListeningDeviceId;
    private yjj monitorClient;
    private final MonitorListener monitorListener = new MonitorListener() { // from class: ldo
        @Override // com.huawei.wearengine.monitor.MonitorListener
        public final void onChanged(int i, MonitorItem monitorItem, MonitorData monitorData) {
            this.f$0.m1960xcf5409ab(i, monitorItem, monitorData);
        }
    };

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-hihealthservice-hihealthkit-model-DeviceObservable, reason: not valid java name */
    /* synthetic */ void m1960xcf5409ab(int i, MonitorItem monitorItem, MonitorData monitorData) {
        if (MonitorItem.MONITOR_ITEM_HEART_RATE_ALARM.getName().equals(monitorItem.getName())) {
            LogUtil.a("DeviceObservable", "monitorListener result:", peh.c(monitorData));
            notifyDataChanged(monitorData);
        }
    }

    public static ldr getInstance(Context context) {
        ldr ldrVar;
        synchronized (ldr.class) {
            if (sInstance == null) {
                sInstance = new ldr();
                sContext = context;
            }
            ldrVar = sInstance;
        }
        return ldrVar;
    }

    public static boolean hasObservableInit() {
        return sInstance != null;
    }

    @Override // com.huawei.hihealthservice.hihealthkit.model.DataObservableNoCallback
    public boolean registerObserver(Parcelable parcelable, Subscriber subscriber) {
        if (!(parcelable instanceof HealthAlarmInfo)) {
            ReleaseLogUtil.a("HiH_DeviceObservable", "registerObserver, error model");
            return false;
        }
        if (!DeviceUtil.b()) {
            ReleaseLogUtil.a("HiH_DeviceObservable", "registerObserver, get device from db is empty");
            return false;
        }
        boolean zRegisterObserver = super.registerObserver(parcelable, subscriber);
        ReleaseLogUtil.e("HiH_DeviceObservable", "registerObserver result: ", Boolean.valueOf(zRegisterObserver));
        if (zRegisterObserver) {
            subscribeToDevice();
        }
        return zRegisterObserver;
    }

    public boolean unregisterObserver(EventTypeInfo eventTypeInfo, Subscriber subscriber) {
        if (super.unregisterObserver((Parcelable) eventTypeInfo, subscriber)) {
            if (!isEmpty()) {
                return true;
            }
            clearObserver();
            unRegisterDeviceListener();
            return true;
        }
        ReleaseLogUtil.a("HiH_DeviceObservable", "unregisterObserver failed");
        return false;
    }

    public void notifyConnectionStateChange(DeviceInfo deviceInfo) {
        synchronized (this) {
            if (!deviceInfo.getDeviceUdid().equals(this.currentListeningDeviceId)) {
                ReleaseLogUtil.d("HiH_DeviceObservable", "connected device has changed!");
                unRegisterDeviceListener();
                subscribeToDevice();
            }
        }
    }

    @Override // com.huawei.hihealthservice.hihealthkit.model.DataObservableNoCallback
    public void notifyDataChanged(Object obj) {
        String name;
        if (!(obj instanceof MonitorData)) {
            ReleaseLogUtil.e("HiH_DeviceObservable", "wrong data construct");
            return;
        }
        int iAsInt = ((MonitorData) obj).asInt();
        ReleaseLogUtil.d("HiH_DeviceObservable", "monitorData status is:", Integer.valueOf(iAsInt));
        if (iAsInt == 1) {
            name = HealthAlarmInfo.Type.TACHYCARDIA.getName();
        } else if (iAsInt == 2) {
            name = HealthAlarmInfo.Type.BRADYCARDIA.getName();
        } else {
            ReleaseLogUtil.d("HiH_DeviceObservable", "status is not support.");
            name = "";
        }
        if (TextUtils.isEmpty(name)) {
            return;
        }
        for (EventTypeInfo eventTypeInfo : this.eventInfos.keySet()) {
            if (eventTypeInfo.getSubType().equals(name)) {
                ley.e(sContext, eventTypeInfo, (Set) this.eventInfos.get(eventTypeInfo));
            }
        }
    }

    private void subscribeToDevice() {
        ReleaseLogUtil.d("HiH_DeviceObservable", "enter subscribeToDevice!");
        yhw.c(sContext).b().addOnSuccessListener(new OnSuccessListener() { // from class: ldt
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.m1961x996fdb27((List) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: ldv
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReleaseLogUtil.a("HiH_DeviceObservable", "getCommonDevice Exception!");
            }
        });
    }

    /* JADX INFO: renamed from: lambda$subscribeToDevice$1$com-huawei-hihealthservice-hihealthkit-model-DeviceObservable, reason: not valid java name */
    /* synthetic */ void m1961x996fdb27(List list) {
        Device device;
        if (list != null && !list.isEmpty()) {
            ReleaseLogUtil.d("HiH_DeviceObservable", "getCommonDevice size is:", Integer.valueOf(list.size()));
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    device = null;
                    break;
                }
                device = (Device) it.next();
                if (device.isConnected()) {
                    ReleaseLogUtil.d("HiH_DeviceObservable", "connected device is:", device.getName());
                    this.currentListeningDeviceId = device.getUuid();
                    break;
                }
            }
        } else {
            device = null;
            break;
        }
        if (device == null) {
            ReleaseLogUtil.e("HiH_DeviceObservable", "There is no connected device.");
        } else if (device.getMonitorCapability() != 0) {
            ReleaseLogUtil.e("HiH_DeviceObservable", "The connected device not support register monitor.");
        } else {
            registerMonitor(device);
        }
    }

    private void registerMonitor(Device device) {
        ReleaseLogUtil.d("HiH_DeviceObservable", "enter registerMonitor!");
        if (this.monitorClient == null) {
            this.monitorClient = yhw.e(sContext);
        }
        this.monitorClient.c(device, MonitorItem.MONITOR_ITEM_HEART_RATE_ALARM, this.monitorListener).addOnSuccessListener(new OnSuccessListener() { // from class: lds
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReleaseLogUtil.d("HiH_DeviceObservable", "register monitor success.");
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: ldq
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReleaseLogUtil.a("HiH_DeviceObservable", "register monitor failure.");
            }
        });
    }

    private void unRegisterDeviceListener() {
        ReleaseLogUtil.d("DeviceObservable", "HiH_DeviceObservable");
        yjj yjjVar = this.monitorClient;
        if (yjjVar == null) {
            ReleaseLogUtil.d("HiH_DeviceObservable", "no monitor listener started!");
        } else {
            yjjVar.d(this.monitorListener);
        }
    }
}
