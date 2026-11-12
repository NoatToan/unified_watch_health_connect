package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.os.Message;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.api.MeasureKitManagerApi;
import com.huawei.health.device.api.MultiUsersManagerApi;
import com.huawei.health.device.callback.HeartRateDeviceSelectedCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.MeasureResult;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.util.ISimpleHandler;
import com.huawei.hihealth.device.open.IHealthDeviceCallback;
import com.huawei.hihealth.device.open.MeasureController;
import com.huawei.hihealth.device.open.MeasureKit;
import com.huawei.hihealth.device.open.data.MeasureRecord;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class eny implements ISimpleHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static eny f33253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f33254c = new Object();
    private HeartRateDeviceSelectedCallback d;
    private MeasureResult.MeasureResultListener h;
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33255a = false;
    private boolean g = false;
    private String j = null;
    private String m = null;
    private String f = null;
    private String n = null;
    private boolean i = false;

    private eny() {
    }

    public static eny a() {
        eny enyVar;
        synchronized (f33254c) {
            if (f33253b == null) {
                f33253b = new eny();
            }
            enyVar = f33253b;
        }
        return enyVar;
    }

    public void b(HeartRateDeviceSelectedCallback heartRateDeviceSelectedCallback) {
        this.d = heartRateDeviceSelectedCallback;
    }

    public String a(HealthDevice.HealthDeviceKind healthDeviceKind, MeasureResult.MeasureResultListener measureResultListener) {
        if (healthDeviceKind != HealthDevice.HealthDeviceKind.HDK_HEART_RATE) {
            if (measureResultListener != null) {
                measureResultListener.onMeasureFailed(MeasureResult.MeasureErrorCode.NOT_SUPPORT);
            }
            LogUtil.e("PluginDevice_MeasureHelper", "startMeasureBackground failed, no suitable kit.");
            return "";
        }
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        ArrayList<ContentValues> bondedDeviceByDeviceKind = healthDeviceEntryApi.getBondedDeviceByDeviceKind(healthDeviceKind);
        if (bondedDeviceByDeviceKind == null || njy.e(bondedDeviceByDeviceKind)) {
            if (measureResultListener != null) {
                measureResultListener.onMeasureFailed(MeasureResult.MeasureErrorCode.NO_DEVICE);
            }
            LogUtil.e("PluginDevice_MeasureHelper", "Measure failed, no device bonded for " + healthDeviceKind.name());
            return "";
        }
        if (bondedDeviceByDeviceKind.size() == 1) {
            String asString = bondedDeviceByDeviceKind.get(0).getAsString("productId");
            String asString2 = bondedDeviceByDeviceKind.get(0).getAsString("uniqueId");
            if (measureResultListener != null) {
                measureResultListener.onMeasureDevice(asString, asString2, false);
            }
            LogUtil.a("PluginDevice_MeasureHelper", "Found 1 product, ID: " + asString);
            if (e(measureResultListener, healthDeviceEntryApi, asString, asString2)) {
                return "";
            }
            this.h = measureResultListener;
            return asString;
        }
        LogUtil.a("PluginDevice_MeasureHelper", "productsList.size() > 1");
        this.h = measureResultListener;
        dxw.d("PluginDevice_MeasureHelper", this);
        b("unknown_device");
        return "";
    }

    private boolean e(MeasureResult.MeasureResultListener measureResultListener, HealthDeviceEntryApi healthDeviceEntryApi, String str, String str2) {
        if (healthDeviceEntryApi.isDeviceKitUniversal(str)) {
            b(str, str2);
            return false;
        }
        if (healthDeviceEntryApi.getBondedDevice(str) == null) {
            if (measureResultListener != null) {
                measureResultListener.onMeasureFailed(MeasureResult.MeasureErrorCode.NO_DEVICE);
            }
            LogUtil.e("PluginDevice_MeasureHelper", "Measure failed, getBondedDevice returned null:" + str);
            return true;
        }
        LogUtil.a("PluginDevice_MeasureHelper", "startMeasureBackground with product: " + str);
        dxw.d("PluginDevice_MeasureHelper", this);
        this.f = str;
        this.n = str2;
        b(str);
        return false;
    }

    private void b(String str) {
        if (BluetoothAdapter.getDefaultAdapter().getState() == 10) {
            LogUtil.e("PluginDevice_MeasureHelper", "Measure failed,the bluetooth is off");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = str;
        messageObtain.what = 1;
        LogUtil.a("PluginDevice_MeasureHelper", "MeasureHelper sendMessage " + messageObtain.obj);
        dxw.a("PluginDevice_MeasureHelper", messageObtain);
    }

    public void e(String str, String str2) {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        if (healthDeviceEntryApi.isDeviceKitUniversal(str)) {
            healthDeviceEntryApi.stopMeasureUniversal(str, str2);
            healthDeviceEntryApi.cleanupMeasureUniversal(str, str2);
        } else {
            healthDeviceEntryApi.stopMeasure(str, str2);
        }
    }

    @Override // com.huawei.health.device.util.ISimpleHandler
    public void handleMessage(Message message) {
        LogUtil.a("PluginDevice_MeasureHelper", "MeasureHelper handleMessage");
        if (message == null) {
            LogUtil.j("PluginDevice_MeasureHelper", "MeasureHelper message is null");
            return;
        }
        if (message.what == 1) {
            if (message.obj == null) {
                LogUtil.j("PluginDevice_MeasureHelper", "message.obj is null");
                return;
            }
            String str = message.obj instanceof String ? (String) message.obj : null;
            dxw.a("PluginDevice_MeasureHelper", this);
            if ("cancelEnableBluetooth".equals(str)) {
                LogUtil.a("PluginDevice_MeasureHelper", "MeasureHelper message is cancelEnableBluetooth");
                return;
            } else {
                i();
                return;
            }
        }
        LogUtil.j("PluginDevice_MeasureHelper", "handleMessage default");
    }

    private void i() {
        final enw enwVar = new enw(50001);
        ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).startMeasureHeartRate(HealthDevice.HealthDeviceKind.HDK_HEART_RATE, new enw(50001) { // from class: eny.3
            @Override // defpackage.enw, com.huawei.health.device.callback.IHealthDeviceCallback
            public void onStatusChanged(HealthDevice healthDevice, int i) {
                super.onStatusChanged(healthDevice, i);
                LogUtil.a("PluginDevice_MeasureHelper", "onStatusChanged:", Integer.valueOf(i));
                if (eny.this.h == null || i != 2) {
                    return;
                }
                eny.this.h.onMeasureDevice(eny.this.f, eny.this.n, true);
            }
        }, this.d, new IHealthDeviceCallback() { // from class: eny.1
            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onFailed(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i) {
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onProgressChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, MeasureRecord measureRecord) {
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onDataChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, com.huawei.hihealth.device.open.data.MeasureResult measureResult) {
                eny.this.e(measureResult, healthDevice, enwVar);
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onStatusChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i) {
                LogUtil.a("PluginDevice_MeasureHelper", "-----heartRateData_onStatusChanged---:", Integer.valueOf(i));
            }
        }, this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        MeasureController measureController;
        this.j = str;
        this.m = str2;
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHonourDevice(str)) {
            com.huawei.hihealth.device.open.HealthDevice bondedDeviceUniversal = dmg.a().getBondedDeviceUniversal(str, str2);
            MeasureKit healthDeviceKitUniversal = ((MeasureKitManagerApi) Services.b("PluginDevice", MeasureKitManagerApi.class)).getHealthDeviceKitUniversal("54C9739F-CA5C-4347-9F00-75B9DDF2C649");
            if (healthDeviceKitUniversal == null || (measureController = healthDeviceKitUniversal.getMeasureController()) == null) {
                return;
            }
            measureController.prepare(bondedDeviceUniversal, new IHealthDeviceCallback() { // from class: eny.2
                @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
                public void onDataChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, com.huawei.hihealth.device.open.data.MeasureResult measureResult) {
                }

                @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
                public void onFailed(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i) {
                }

                @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
                public void onProgressChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, MeasureRecord measureRecord) {
                }

                @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
                public void onStatusChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i) {
                    LogUtil.a("PluginDevice_MeasureHelper", "-----prepare_heartRateData_onStatusChanged---:" + i);
                    if (BaseApplication.isRunningForeground() && i == 2) {
                        eny.this.f();
                    }
                }
            }, ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).getAm16Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        final enw enwVar = new enw(50001);
        ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).startMeasureHeartRate(HealthDevice.HealthDeviceKind.HDK_HEART_RATE, new enw(50001), this.d, new IHealthDeviceCallback() { // from class: eny.5
            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onFailed(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i) {
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onProgressChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, MeasureRecord measureRecord) {
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onDataChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, com.huawei.hihealth.device.open.data.MeasureResult measureResult) {
                eny.this.e(measureResult, healthDevice, enwVar);
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onStatusChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i) {
                LogUtil.a("PluginDevice_MeasureHelper", "-----heartRateData_onStatusChanged---:" + i);
                if (i == 2) {
                    if (eny.this.j == null || !eny.this.i) {
                        return;
                    }
                    eny enyVar = eny.this;
                    enyVar.b(enyVar.j, eny.this.m);
                    return;
                }
                if (i == 3) {
                    eny.this.i = true;
                    return;
                }
                if (i == 14) {
                    eny.this.i = false;
                } else {
                    if (i == 17) {
                        eny.this.i = false;
                        eny.this.j = null;
                        eny.this.m = null;
                        return;
                    }
                    LogUtil.a("PluginDevice_MeasureHelper", "onStatusChanged default");
                }
            }
        }, this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(com.huawei.hihealth.device.open.data.MeasureResult measureResult, final com.huawei.hihealth.device.open.HealthDevice healthDevice, enw enwVar) {
        HealthData healthDataE = eqv.d().e(measureResult);
        enb enbVar = healthDataE instanceof enb ? (enb) healthDataE : null;
        if (enbVar != null) {
            LogUtil.d("PluginDevice_MeasureHelper", "-----heartRateData---:" + enbVar.getHeartRate());
            HealthDevice healthDevice2 = new HealthDevice() { // from class: eny.4
                @Override // com.huawei.health.device.model.HealthDevice
                public String getDeviceName() {
                    return healthDevice.getDeviceName();
                }

                @Override // com.huawei.health.device.model.HealthDevice
                public String getAddress() {
                    return healthDevice.getAddress();
                }

                @Override // com.huawei.health.device.model.HealthDevice
                public String getUniqueId() {
                    return healthDevice.getUniqueId();
                }
            };
            if (enbVar.getHeartRate() != -1) {
                enwVar.onDataChanged(healthDevice2, enbVar);
            }
        }
    }

    public boolean b() {
        return this.e;
    }

    public void d(String str) {
        String strB = era.b(str);
        LogUtil.a("PluginDevice_MeasureHelper", "setHonorWeightScale prodId is：", strB);
        this.e = "005A".equals(strB) || "0059".equals(strB);
        this.f33255a = ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiWspScaleProduct(str);
        this.g = "2A19".equals(strB);
    }

    public boolean c() {
        return this.f33255a;
    }

    public boolean d() {
        return this.g;
    }

    public void h() {
        this.e = false;
    }

    public boolean c(double d, double d2) {
        boolean z = false;
        if (d <= 0.0d) {
            return false;
        }
        float f = ((MultiUsersManagerApi) Services.b("PluginDevice", MultiUsersManagerApi.class)).getCurrentUser().f();
        if (f <= 0.0f) {
            LogUtil.a("PluginDevice_MeasureHelper", "judgeIsReachedGoal startWeight <= 0 ");
            return false;
        }
        boolean z2 = d - ((double) f) <= 0.0d;
        LogUtil.a("PluginDevice_MeasureHelper", "isLooseWeight: " + z2);
        if (d2 <= d && z2) {
            LogUtil.a("PluginDevice_MeasureHelper", "looseWeight user reach goal");
            z = true;
        }
        if (d2 < d || z2) {
            return z;
        }
        LogUtil.a("PluginDevice_MeasureHelper", "gainWeight user reach goal");
        return true;
    }

    public int e() {
        return BaseApplication.getContext().getSharedPreferences("sleep_shared_pref_smart_msg", 0).getInt("weight_goal_over", 0);
    }
}
