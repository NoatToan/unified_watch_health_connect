package defpackage;

import android.content.Context;
import com.huawei.android.location.activityrecognition.HwActivityChangedEvent;
import com.huawei.android.location.activityrecognition.HwActivityChangedExtendEvent;
import com.huawei.android.location.activityrecognition.HwActivityRecognition;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionEvent;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionExtendEvent;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionServiceConnection;
import com.huawei.android.location.activityrecognition.HwEnvironmentChangedEvent;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.Map;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes11.dex */
public class mvu {
    private static mvu d;
    private static final Object e = new Object();
    private HwActivityRecognition i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42522a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwActivityRecognitionHardwareSink f42524c = new HwActivityRecognitionHardwareSink() { // from class: mvu.2
        @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink
        public void onActivityChanged(HwActivityChangedEvent hwActivityChangedEvent) {
            if (hwActivityChangedEvent == null || hwActivityChangedEvent.getActivityRecognitionEvents() == null) {
                return;
            }
            LogUtil.a("HwActivityRecognitionManager", "handleActivityChange hwActivityChangedEvent");
            for (HwActivityRecognitionEvent hwActivityRecognitionEvent : hwActivityChangedEvent.getActivityRecognitionEvents()) {
                if (hwActivityRecognitionEvent != null && hwActivityRecognitionEvent.getActivity() != null) {
                    mvu.this.a(hwActivityRecognitionEvent.getActivity(), hwActivityRecognitionEvent.getEventType());
                } else {
                    LogUtil.j("HwActivityRecognitionManager", "event or event getActivity is null, system error");
                    return;
                }
            }
        }

        @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink
        public void onActivityExtendChanged(HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
            if (hwActivityChangedExtendEvent == null || hwActivityChangedExtendEvent.getActivityRecognitionExtendEvents() == null) {
                return;
            }
            LogUtil.a("HwActivityRecognitionManager", "onActivityExtendChanged hwActivityChangedExtendEvent");
            for (HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEvent.getActivityRecognitionExtendEvents()) {
                if (hwActivityRecognitionExtendEvent != null && hwActivityRecognitionExtendEvent.getActivity() != null) {
                    mvu.this.e(hwActivityRecognitionExtendEvent.getActivity(), hwActivityRecognitionExtendEvent.getEventType());
                } else {
                    LogUtil.j("HwActivityRecognitionManager", "event or event getActivity is null, system error");
                    return;
                }
            }
        }

        @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink
        public void onEnvironmentChanged(HwEnvironmentChangedEvent hwEnvironmentChangedEvent) {
            LogUtil.a("HwActivityRecognitionManager", "onEnvironmentChanged()");
        }
    };
    private HwActivityRecognitionServiceConnection h = new HwActivityRecognitionServiceConnection() { // from class: mvu.3
        @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionServiceConnection
        public void onServiceConnected() {
            mvu.this.f42522a = true;
            mvu.this.i();
            LogUtil.a("HwActivityRecognitionManager", "HwActivityRecognitionServiceConnection onServiceConnected()");
            if (mvu.this.i != null) {
                mvu.this.i.b();
            }
        }

        @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionServiceConnection
        public void onServiceDisconnected() {
            mvu.this.f42522a = false;
            LogUtil.a("HwActivityRecognitionManager", "HwActivityRecognitionServiceConnection onServiceDisconnected()");
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f42523b = BaseApplication.getContext();

    private mvu() {
    }

    public static mvu a() {
        mvu mvuVar;
        synchronized (e) {
            if (d == null) {
                d = new mvu();
            }
            mvuVar = d;
        }
        return mvuVar;
    }

    public void e() {
        if (!b()) {
            LogUtil.j("HwActivityRecognitionManager", "startMotionDetector() isSupportActivityRecognitionCapability is null");
            return;
        }
        LogUtil.a("HwActivityRecognitionManager", "initMotionDetector() mStillActivityRecognition is:", Boolean.valueOf(this.i == null), " mIsConnectServiceSuccess:", Boolean.valueOf(this.f42522a));
        HwActivityRecognition hwActivityRecognition = this.i;
        if (hwActivityRecognition == null || !this.f42522a) {
            if (hwActivityRecognition != null) {
                h();
                this.i = null;
            }
            try {
                HwActivityRecognition hwActivityRecognition2 = new HwActivityRecognition(BaseApplication.getContext());
                this.i = hwActivityRecognition2;
                hwActivityRecognition2.e(this.f42524c, this.h);
            } catch (SecurityException unused) {
                LogUtil.e("HwActivityRecognitionManager", "initMotionDetector() SecurityException");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.a("HwActivityRecognitionManager", "serviceConnectedEnable() start serviceConnectedEnable");
        e("android.activity_recognition.still", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        e("android.activity_recognition.still", 2, 2000000000L);
        e("android.activity_recognition.walking", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        e("android.activity_recognition.walking", 2, 2000000000L);
        e("android.activity_recognition.fast_walking", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        e("android.activity_recognition.fast_walking", 2, 2000000000L);
        e("android.activity_recognition.running", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        e("android.activity_recognition.running", 2, 2000000000L);
        g();
    }

    private void g() {
        e("android.activity_recognition.on_bicycle", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        e("android.activity_recognition.on_bicycle", 2, 2000000000L);
        e("android.activity_recognition.in_vehicle", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        e("android.activity_recognition.in_vehicle", 2, 2000000000L);
        e("android.activity_recognition.high_speed_rail", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        e("android.activity_recognition.high_speed_rail", 2, 2000000000L);
    }

    private void h() {
        LogUtil.a("HwActivityRecognitionManager", "disconnectDisableActivityEvent()");
        try {
            c("android.activity_recognition.still");
            c("android.activity_recognition.walking");
            c("android.activity_recognition.running");
            c("android.activity_recognition.in_vehicle");
            c("android.activity_recognition.on_bicycle");
            c("android.activity_recognition.fast_walking");
            c("android.activity_recognition.high_speed_rail");
            this.i.a();
        } catch (SecurityException unused) {
            LogUtil.e("HwActivityRecognitionManager", "disconnectDisableActivityEvent() SecurityException");
        } catch (Exception unused2) {
            LogUtil.e("HwActivityRecognitionManager", "disconnectDisableActivityEvent() exception");
        }
    }

    private void e(String str, int i, long j) {
        HwActivityRecognition hwActivityRecognition = this.i;
        if (hwActivityRecognition == null) {
            LogUtil.j("HwActivityRecognitionManager", "enableActivityEvent() mStillActivityRecognition is null");
        } else {
            LogUtil.a("HwActivityRecognitionManager", "enableActivityEvent() activityStatus:", str, ", type:", Integer.valueOf(i), ", delayTime:", Long.valueOf(j), ", isSuccess:", Boolean.valueOf(hwActivityRecognition.b(str, i, j)));
        }
    }

    private void c(String str) {
        HwActivityRecognition hwActivityRecognition = this.i;
        if (hwActivityRecognition == null) {
            LogUtil.j("HwActivityRecognitionManager", "disableActivityEvent() mStillActivityRecognition is null");
            return;
        }
        LogUtil.a("HwActivityRecognitionManager", "disableActivityEvent() activityStatus:", str, ", isDisableActivityEnter:", Boolean.valueOf(hwActivityRecognition.e(str, 1)), ", isDisableActivityExit:", Boolean.valueOf(this.i.e(str, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i) {
        LogUtil.a("HwActivityRecognitionManager", "activityChanged() ", str, " ", Integer.valueOf(i));
        int iC = 1;
        if (!"android.activity_recognition.still".equals(str) || i != 1) {
            if ("android.activity_recognition.still".equals(str) && i == 2) {
                iC = 2;
            } else if ("android.activity_recognition.walking".equals(str) && i == 1) {
                iC = 3;
            } else if ("android.activity_recognition.walking".equals(str) && i == 2) {
                iC = 4;
            } else if ("android.activity_recognition.running".equals(str) && i == 1) {
                iC = 5;
            } else if ("android.activity_recognition.running".equals(str) && i == 2) {
                iC = 6;
            } else if ("android.activity_recognition.on_bicycle".equals(str) && i == 1) {
                iC = 7;
            } else if ("android.activity_recognition.on_bicycle".equals(str) && i == 2) {
                iC = 8;
            } else {
                iC = ("android.activity_recognition.in_vehicle".equals(str) && i == 1) ? 9 : c(str, i);
            }
        }
        e(iC);
    }

    private int c(String str, int i) {
        if ("android.activity_recognition.in_vehicle".equals(str) && i == 2) {
            return 10;
        }
        if ("android.activity_recognition.fast_walking".equals(str) && i == 1) {
            return 11;
        }
        if ("android.activity_recognition.fast_walking".equals(str) && i == 2) {
            return 12;
        }
        if ("android.activity_recognition.high_speed_rail".equals(str) && i == 1) {
            return 13;
        }
        if ("android.activity_recognition.high_speed_rail".equals(str) && i == 2) {
            return 14;
        }
        LogUtil.j("HwActivityRecognitionManager", "default");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, int i) {
        LogUtil.a("HwActivityRecognitionManager", "activityExtendChange() ", str, " ", Integer.valueOf(i));
        int iB = 1;
        if (!"android.activity_recognition.still".equals(str) || i != 1) {
            if ("android.activity_recognition.still".equals(str) && i == 2) {
                iB = 2;
            } else if ("android.activity_recognition.walking".equals(str) && i == 1) {
                iB = 3;
            } else if ("android.activity_recognition.walking".equals(str) && i == 2) {
                iB = 4;
            } else if ("android.activity_recognition.running".equals(str) && i == 1) {
                iB = 5;
            } else {
                iB = ("android.activity_recognition.running".equals(str) && i == 2) ? 6 : b(str, i);
            }
        }
        e(iB);
    }

    private int b(String str, int i) {
        if ("android.activity_recognition.on_bicycle".equals(str) && i == 1) {
            return 7;
        }
        if ("android.activity_recognition.on_bicycle".equals(str) && i == 2) {
            return 8;
        }
        if ("android.activity_recognition.in_vehicle".equals(str) && i == 1) {
            return 9;
        }
        if ("android.activity_recognition.in_vehicle".equals(str) && i == 2) {
            return 10;
        }
        if ("android.activity_recognition.fast_walking".equals(str) && i == 1) {
            return 11;
        }
        if ("android.activity_recognition.fast_walking".equals(str) && i == 2) {
            return 12;
        }
        if ("android.activity_recognition.high_speed_rail".equals(str) && i == 1) {
            return 13;
        }
        if ("android.activity_recognition.high_speed_rail".equals(str) && i == 2) {
            return 14;
        }
        LogUtil.j("HwActivityRecognitionManager", "default");
        return 0;
    }

    public boolean b() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", "HwActivityRecognitionManager");
        DeviceCapability value = null;
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        if (value == null) {
            LogUtil.j("HwActivityRecognitionManager", "isSupportActivityRecognitionCapability() Capability is null");
            return false;
        }
        if (value.isSupportActivityRecognitionStatus()) {
            return true;
        }
        LogUtil.j("HwActivityRecognitionManager", "isSupportActivityRecognitionCapability() has not Capability");
        return false;
    }

    public void e(int i) {
        if (!b()) {
            LogUtil.j("HwActivityRecognitionManager", "sendActivityRecognitionStatus() has not Capability");
        } else {
            LogUtil.a("HwActivityRecognitionManager", "sendActivityRecognitionStatus() status:", Integer.valueOf(i));
            c(i);
        }
    }

    public void c() {
        if (this.i != null) {
            h();
            this.i = null;
        }
        d();
    }

    public static void d() {
        synchronized (e) {
            d = null;
        }
    }

    public void c(int i) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(24);
        deviceCommand.setCommandID(9);
        String strD = eeq.d(i);
        String strD2 = eeq.d(strD.length() / 2);
        String strD3 = eeq.d(1);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD3);
        sb.append(strD2);
        sb.append(strD);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("HwActivityRecognitionManager", "enter sendCommand value :", Integer.valueOf(i), "sendCommand() deviceCommand:", deviceCommand.toString());
        mkf.e(this.f42523b).sendDeviceData(deviceCommand);
    }

    public void d(DeviceInfo deviceInfo) {
        LogUtil.a("HwActivityRecognitionManager", "notifyDeviceReceiveSuccess");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(24);
        deviceCommand.setCommandID(8);
        byte[] bArrD = d(100000);
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(this.f42523b).sendDeviceData(deviceCommand);
    }

    private byte[] d(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(eeq.d(127) + eeq.d(4) + eeq.c(i));
        String string = sb.toString();
        LogUtil.a("HwActivityRecognitionManager", "packageCommand（） Code Command :", string);
        return eeq.c(string);
    }
}
