package defpackage;

import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.wearengine.device.Device;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class ylh extends JSONObject {
    public ylh(String str) throws JSONException {
        super(str);
    }

    private ylh() throws JSONException {
        this("{}");
    }

    public static String a(Device device) {
        if (device == null) {
            return "";
        }
        try {
            Field declaredField = device.getClass().getDeclaredField("mReservedness");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(device);
            return obj instanceof String ? (String) obj : "";
        } catch (IllegalAccessException unused) {
            LogUtil.e("DeviceJson", "getJsonFromDevice catch IllegalAccessException");
            return "";
        } catch (NoSuchFieldException unused2) {
            LogUtil.e("DeviceJson", "getJsonFromDevice catch NoSuchFieldException");
            return "";
        }
    }

    public void a(String str) {
        try {
            put("device_wear_engine_device_id", str);
        } catch (JSONException unused) {
            LogUtil.j("DeviceJson", "setWearEngineDeviceId catch JSONException");
        }
    }

    public void b(int i) {
        try {
            put("device_p2p_capability", i);
        } catch (JSONException unused) {
            LogUtil.j("DeviceJson", "setP2pCapability catch JSONException");
        }
    }

    public void c(int i) {
        try {
            put("device_monitor_capability", i);
        } catch (JSONException unused) {
            LogUtil.j("DeviceJson", "setMonitorCapability catch JSONException");
        }
    }

    public void a(int i) {
        try {
            put("device_notify_capability", i);
        } catch (JSONException unused) {
            LogUtil.j("DeviceJson", "setNotifyCapability catch JSONException");
        }
    }

    public void d(int i) {
        try {
            put("device_sensor_capability", i);
        } catch (JSONException unused) {
            LogUtil.j("DeviceJson", "setSensorCapability catch JSONException");
        }
    }

    public void c(String str) {
        try {
            put(PluginPayAdapter.DEVICE_CATEGORY, str);
        } catch (JSONException unused) {
            LogUtil.j("DeviceJson", "setDeviceCategory catch JSONException");
        }
    }

    public String b() {
        Object objOpt = opt("device_extra");
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return "";
    }

    public void e(String str) {
        try {
            put("device_extra", str);
        } catch (JSONException unused) {
            LogUtil.j("DeviceJson", "setExtra catch JSONException");
        }
    }

    public void b(String str) {
        try {
            put("device_fid", str);
        } catch (JSONException unused) {
            LogUtil.j("DeviceJson", "setDeviceFid has an JSONException");
        }
    }

    public static class d {
        private String f = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f53619c = "";
        private String d = "";
        private String g = "";
        private String o = "";
        private String k = "";
        private int j = 2;
        private int i = 2;
        private int h = 2;
        private int m = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f53618b = "";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f53617a = "";
        private int e = -1;

        public d e(String str) {
            this.f = str;
            return this;
        }

        public d d(String str) {
            this.o = str;
            return this;
        }

        public d c(String str) {
            this.k = str;
            return this;
        }

        public d e(int i) {
            this.e = i;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ylh c() {
            ylh ylhVar = null;
            try {
                ylh ylhVar2 = new ylh();
                try {
                    ylhVar2.put("device_reservedness", this.f);
                    ylhVar2.put("device_capability", this.f53619c);
                    ylhVar2.put("device_basic_info", this.d);
                    ylhVar2.put("device_identify", this.g);
                    ylhVar2.put("device_wear_engine_device_id", this.o);
                    ylhVar2.put(OpAnalyticsConstants.DEVICE_SOFT_VERSION, this.k);
                    ylhVar2.put("device_p2p_capability", this.j);
                    ylhVar2.put("device_monitor_capability", this.i);
                    ylhVar2.put("device_notify_capability", this.h);
                    ylhVar2.put("device_sensor_capability", this.m);
                    ylhVar2.put(PluginPayAdapter.DEVICE_CATEGORY, this.f53618b);
                    ylhVar2.put("device_extra", this.f53617a);
                    ylhVar2.put(DeviceCategoryFragment.DEVICE_TYPE, this.e);
                    return ylhVar2;
                } catch (JSONException unused) {
                    ylhVar = ylhVar2;
                    LogUtil.j("DeviceJson", "build catch JSONException");
                    return ylhVar;
                }
            } catch (JSONException unused2) {
            }
        }
    }
}
