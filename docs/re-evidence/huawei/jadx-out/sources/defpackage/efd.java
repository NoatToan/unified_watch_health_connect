package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.health.ecologydevice.callback.DataChangedCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class efd implements MessageReceiveCallback {
    private static Map<String, DataChangedCallback> e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BleTaskQueueUtil f32865a;
    private String d;

    public efd(String str) {
        this(str, null);
    }

    public efd(String str, BleTaskQueueUtil bleTaskQueueUtil) {
        this.d = str;
        this.f32865a = bleTaskQueueUtil;
    }

    @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
    public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
        if (cmmVar == null) {
            LogUtil.a("EcologyDevice_ThirdPartyMessageReceiveCallback", "ThirdPartyMessageReceiveCallback#onDataReceived dataContents is null");
            return;
        }
        String strB = cmmVar.b();
        LogUtil.a("EcologyDevice_ThirdPartyMessageReceiveCallback", "ThirdPartyMessageReceiveCallback#onDataReceived errorCode is ", Integer.valueOf(i));
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("EcologyDevice_ThirdPartyMessageReceiveCallback", "characterUuid is null");
            return;
        }
        DataChangedCallback dataChangedCallback = e.get(this.d);
        if (dataChangedCallback == null) {
            LogUtil.j("EcologyDevice_ThirdPartyMessageReceiveCallback", "DataChangedCallback is null");
        } else {
            dataChangedCallback.onDataChanged(cmmVar);
        }
    }

    @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
    public void onChannelEnable(DeviceInfo deviceInfo, String str, int i) {
        LogUtil.a("EcologyDevice_ThirdPartyMessageReceiveCallback", "onChannelEnable errorCode:", Integer.valueOf(i));
        BleTaskQueueUtil bleTaskQueueUtil = this.f32865a;
        if (bleTaskQueueUtil != null) {
            bleTaskQueueUtil.e();
        }
    }

    public static void d(String str, DataChangedCallback dataChangedCallback) {
        e.put(str, dataChangedCallback);
    }

    public static void b() {
        e.clear();
    }

    public static int d() {
        Map<String, DataChangedCallback> map = e;
        if (map == null) {
            return 0;
        }
        return map.size();
    }
}
