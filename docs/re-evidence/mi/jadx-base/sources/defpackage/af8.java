package defpackage;

import android.content.Intent;
import com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.MiJiaEnvironment;

/* JADX INFO: loaded from: classes5.dex */
public class af8 {
    public static void a(String str, String str2, String str3) {
        RnPluginLog.addFrameworkLog("notifyDeviceNameChanged,newName=" + str2);
        Intent intent = new Intent("action.more.rename.notify");
        intent.putExtra(IBluetoothService.EXTRA_DID, str);
        intent.putExtra("extra.name", str2);
        intent.putExtra(IBluetoothService.EXTRA_RESULT, str3);
        if (MiJiaEnvironment.getAppContext() != null) {
            MiJiaEnvironment.getAppContext().sendBroadcast(intent);
        }
    }
}
