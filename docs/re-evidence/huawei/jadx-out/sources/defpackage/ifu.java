package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public class ifu {
    private static void a() {
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put("type", 2);
        map.put("from", 5);
        map.put("dataType", new String[]{"weight"});
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_HEALTH_WEIGHT_INPUT_2030017.value(), map, 0);
    }

    public static void e(double d) {
        dso dsoVar = new dso();
        dsoVar.setBodyFatRat(0.0f);
        dsoVar.setWeight((float) d);
        dsoVar.setStartTime(System.currentTimeMillis());
        dsoVar.d(true);
        dsoVar.setEndTime(System.currentTimeMillis());
        HealthDevice healthDevice = new HealthDevice() { // from class: ifu.4
            @Override // com.huawei.health.device.model.HealthDevice
            public String getAddress() {
                return null;
            }

            @Override // com.huawei.health.device.model.HealthDevice
            public String getDeviceName() {
                return null;
            }

            @Override // com.huawei.health.device.model.HealthDevice
            public String getUniqueId() {
                return "-1";
            }
        };
        enw enwVar = new enw(10006);
        enwVar.c(new IBaseResponseCallback() { // from class: iga
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                ifu.b(i, obj);
            }
        });
        enwVar.onDataChanged(healthDevice, dsoVar);
    }

    static /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            a();
        }
    }
}
