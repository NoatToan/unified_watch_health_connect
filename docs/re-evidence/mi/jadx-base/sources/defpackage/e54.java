package defpackage;

import android.content.Context;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.deviceId.IdentifierManager;

/* JADX INFO: loaded from: classes4.dex */
public class e54 {
    public static String a(Context context) {
        String deviceId = SystemApi.getInstance().getDeviceId(context, ServerCompact.isEurope(context));
        String strA = uwf.a(context);
        String oaid = IdentifierManager.getOAID(context);
        if (deviceId == null) {
            deviceId = "";
        }
        if (strA == null) {
            strA = "";
        }
        if (oaid == null) {
            oaid = "";
        }
        return deviceId + "|" + strA + "|" + oaid;
    }
}
