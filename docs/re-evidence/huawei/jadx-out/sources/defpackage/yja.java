package defpackage;

import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.wearengine.device.Device;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class yja extends JSONObject {
    public yja(String str) throws JSONException {
        super(str);
    }

    private yja() throws JSONException {
        this("{}");
    }

    public static String c(Device device) {
        if (device == null) {
            return "";
        }
        try {
            Field declaredField = device.getClass().getDeclaredField("mReservedness");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(device);
            return obj instanceof String ? (String) obj : "";
        } catch (IllegalAccessException unused) {
            yis.c("DeviceJson", "getJsonFromDevice catch IllegalAccessException");
            return "";
        } catch (NoSuchFieldException unused2) {
            yis.c("DeviceJson", "getJsonFromDevice catch NoSuchFieldException");
            return "";
        }
    }

    public String b() {
        Object objOpt = opt("device_extra");
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return "";
    }

    public void c(String str) {
        try {
            put("device_extra", str);
        } catch (JSONException unused) {
            yit.c("DeviceJson", "setExtra catch JSONException");
        }
    }

    public static class b {
        private String d = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f53410c = "";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f53408a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f53409b = "";

        public b c(String str) {
            this.d = str;
            return this;
        }

        public b e(String str) {
            this.f53410c = str;
            return this;
        }

        public b d(boolean z) {
            this.f53408a = z;
            return this;
        }

        public b a(String str) {
            this.f53409b = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public yja e() {
            yja yjaVar = null;
            try {
                yja yjaVar2 = new yja();
                try {
                    yjaVar2.put("device_reservedness", this.d);
                    yjaVar2.put(OpAnalyticsConstants.DEVICE_SOFT_VERSION, this.f53410c);
                    yjaVar2.put("device_is_support_ota", this.f53408a);
                    yjaVar2.put("device_extra", this.f53409b);
                    return yjaVar2;
                } catch (JSONException unused) {
                    yjaVar = yjaVar2;
                    yis.d("DeviceJson", "build catch JSONException");
                    return yjaVar;
                }
            } catch (JSONException unused2) {
            }
        }
    }
}
