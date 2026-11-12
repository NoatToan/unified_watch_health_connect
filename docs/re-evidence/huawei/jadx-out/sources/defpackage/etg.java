package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class etg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f33448b;

    private etg(b bVar) {
        this.f33448b = bVar;
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, Object> f33449b = new HashMap(6);

        public b e(double d) {
            this.f33449b.put("connected_time", String.valueOf(d));
            return this;
        }

        public b a(String str) {
            this.f33449b.put("enter_type", str);
            return this;
        }

        public b d(String str) {
            this.f33449b.put("device_name", etn.c(str));
            return this;
        }

        public b b(String str) {
            this.f33449b.put(DeviceCategoryFragment.DEVICE_TYPE, str);
            return this;
        }

        public b a(int i) {
            if (i == 2) {
                this.f33449b.put("failed_status", "connect success");
                return this;
            }
            if (i == 12) {
                this.f33449b.put("failed_status", "bond success");
                return this;
            }
            this.f33449b.put("failed_status", String.valueOf(i));
            return this;
        }

        public b c(int i) {
            if (i == 1 || i == -11) {
                this.f33449b.put("download_status", "download_success");
                return this;
            }
            this.f33449b.put("download_status", String.valueOf(i));
            return this;
        }

        public b d(int i) {
            this.f33449b.put("reconnect_time", String.valueOf(i));
            return this;
        }

        public Map<String, Object> a() {
            return this.f33449b;
        }

        public b e(String str) {
            this.f33449b.put("macAddress", erh.d(str));
            return this;
        }

        public b j(String str) {
            this.f33449b.put("prodId", era.b(str));
            return this;
        }

        public b c(String str) {
            this.f33449b.put("page_id", str);
            return this;
        }

        public etg b() {
            return new etg(this);
        }
    }

    public void c(Context context) {
        if (context == null) {
            LogUtil.j("EcologyBiAnalyticsUtils", "context or touchingConnectMap is null");
            return;
        }
        Map<String, Object> mapA = this.f33448b.a();
        LogUtil.d("EcologyBiAnalyticsUtils", "touchingConnectMap is ", mapA.toString());
        lmf.d().c(context, AnalyticsValue.HEALTH_MEASURE_NFC_BLOOD_PRESSURE_2060055.value(), mapA, 0);
    }

    public void b(Context context) {
        if (context == null) {
            LogUtil.e("EcologyBiAnalyticsUtils", "context = null");
            return;
        }
        Map<String, Object> mapA = this.f33448b.a();
        LogUtil.d("EcologyBiAnalyticsUtils", "tickBiRopeLevel2PageBrowsing is ", mapA.toString());
        lmf.d().c(context, AnalyticsValue.HEALTH_ROPE_TWO_LEVEL_PAGE_2170040.value(), mapA, 0);
    }

    public static double c(long j) {
        return (System.currentTimeMillis() - j) / 1000.0f;
    }

    public static void d(String str, String str2, String str3) {
        LogUtil.a("EcologyBiAnalyticsUtils", "doDeviceBindBiEvent pair passed");
        HashMap map = new HashMap(16);
        if (Utils.o()) {
            String strD = erh.d(str2);
            if (strD != null && !TextUtils.isEmpty(strD) && strD.length() > 24) {
                map.put("macAddress", strD.substring(0, 24));
            }
        } else {
            map.put("macAddress", erh.d(str2));
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null) {
            map.put("device_name", etn.c(str, elhVarD.l().d()));
            map.put(DeviceCategoryFragment.DEVICE_TYPE, elhVarD.m().name());
            map.put("deviceId", elhVarD.h());
        }
        map.put("prodId", era.b(str));
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_SUCCEED_2060005.value(), map, 0);
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_SUCCEED_WHITE_2060087.value(), map, 0);
        map.put("productId", str);
        if (str3 != null) {
            map.put("uniqueId", str3);
        }
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(1500), map);
    }

    public static void e(String str, String str2) {
        String strI = emh.b().i();
        String strD = emh.b().d();
        HashMap map = new HashMap(16);
        map.put("prodId", era.b(strI));
        map.put("macAddress", erh.d(strD));
        map.put("courseIdList", str);
        map.put("action", str2);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.DELETE_AND_DISABLE_COURSE_EVENT_VALUE.value(), map, 0);
    }
}
