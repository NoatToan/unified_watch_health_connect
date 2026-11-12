package defpackage;

import android.os.Bundle;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dnt {
    public void c(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("com.huawei.health.scale.log", str);
        bundle.putString("com.huawei.health.scale.log", str2);
        EventBus.a(new EventBus.d("event_bus_upload_ble_log", bundle));
    }

    public void a(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_file_id", i);
        bundle.putInt("key_check_mode", i2);
        EventBus.a(new EventBus.d("event_bus_file_check", bundle));
    }

    public void c(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_file_id", i);
        EventBus.a(new EventBus.d("event_bus_file_parameter", bundle));
    }

    public void e(int i, int i2, int i3) {
        LogUtil.a("WspFileCommandSender", "get 5.44.4 for file id:", Integer.valueOf(i));
        Bundle bundle = new Bundle();
        bundle.putInt("key_file_id", i);
        bundle.putInt("key_file_offset", i2);
        bundle.putInt("key_file_length", i3);
        EventBus.a(new EventBus.d("event_bus_file_data_request", bundle));
    }

    public void d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_file_id", i);
        bundle.putInt("key_file_result_type", i2);
        EventBus.a(new EventBus.d("event_bus_file_result_notify", bundle));
    }
}
