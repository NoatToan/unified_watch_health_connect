package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.homeroom.model.Room;

/* JADX INFO: loaded from: classes5.dex */
public class xye implements IMRnAppProxyProvider {
    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider
    public void activeABTestByPath(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider
    public void deleteDevice(String str, int i, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider
    public String getABTestConfigByPath(String str) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider
    public void getDeviceIcon(int i, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider
    public Home getHomeByDid(String str) {
        return mvk.e().b().getHomeByDid(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider
    public Room getRoomByDid(String str) {
        return mvk.e().b().getRoomByDid(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider
    public void getServerName(ReactApplicationContext reactApplicationContext, Callback callback) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ServerBean currentServer = ServerCompact.getCurrentServer(reactApplicationContext);
        if (currentServer != null) {
            writableMapCreateMap.putString("serverCode", currentServer.machineCode);
            writableMapCreateMap.putString("countryCode", currentServer.countryCode);
        }
        callback.invoke(writableMapCreateMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider
    public void setGatewayScene(String str, DeviceStat deviceStat, int i, String str2, Callback callback) {
    }
}
