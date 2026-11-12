package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceState;
import com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.CoreError;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public interface quc {
    PluginDeviceState a(boolean z);

    void b(PluginDeviceState pluginDeviceState, int i, String str, CoreAsyncCallback<q1i, CoreError> coreAsyncCallback);

    void c(PluginDeviceState pluginDeviceState, int i, String str, CoreAsyncCallback<HashMap<String, wb6>, CoreError> coreAsyncCallback);
}
