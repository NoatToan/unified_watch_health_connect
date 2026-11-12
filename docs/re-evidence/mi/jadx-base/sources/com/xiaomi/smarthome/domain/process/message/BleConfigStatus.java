package com.xiaomi.smarthome.domain.process.message;

import android.content.Context;
import com.xiaomi.fitness.common.utils.NetworkStateUtil;
import com.xiaomi.smarthome.dddcommon.Aggregate;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@Aggregate
public interface BleConfigStatus {
    public static final int LOG_BLEAUTH_END = 6;
    public static final int LOG_BLEAUTH_START = 5;
    public static final int LOG_BLEConnectEnd = 4;
    public static final int LOG_BLEConnectStart = 3;
    public static final int LOG_Connected = 10;
    public static final int LOG_FetchBindKeyEnd = 2;
    public static final int LOG_FetchBindkeyStart = 1;
    public static final int LOG_NextStepClick = 0;
    public static final int LOG_SendWifiEnd = 8;
    public static final int LOG_SendWifiStart = 7;
    public static final int LOG_WifiNotifyConnected = 9;
    public static final int NOTIFY_AUTHENTICATION_ERROR = 5;
    public static final int NOTIFY_COMBO_BLE_ERROR_AUTH_FAIL = 9;
    public static final int NOTIFY_COMBO_BLE_ERROR_CONNECT_NETWORK_FAIL = 12;
    public static final int NOTIFY_COMBO_BLE_ERROR_DHCP_FAIL = 11;
    public static final int NOTIFY_COMBO_BLE_ERROR_FIND_ROUTER_FAIL = 8;
    public static final int NOTIFY_COMBO_BLE_ERROR_WEAK_WIFI = 10;
    public static final int NOTIFY_COMBO_BLE_ERROR_WEAK_WIFI2 = 18;
    public static final int NOTIFY_CONNECTING_ROUTER = 1;
    public static final int NOTIFY_DEVICE_BIND_FAIL = 17;
    public static final int NOTIFY_DEVICE_BIND_SUCCESS = 16;
    public static final int NOTIFY_PASSPORT_AUTH_SUCCESS = 6;
    public static final int NOTIFY_ROUTER_CONNECTED = 2;
    public static final int NOTIFY_SERVER_CONNECTED = 3;
    public static final int NOTIFY_START = 0;
    public static final int NOTIFY_UNKNONW_ERROR = 4;
    public static final Map<Integer, Long> stepTimestamps = new HashMap();

    static void addStepLog(int i) {
        addStepLog(i, null);
    }

    static void clearStepTimestamps() {
        for (int i = 0; i <= 10; i++) {
            stepTimestamps.put(Integer.valueOf(i), 0L);
        }
    }

    static void addStepLog(int i, Context context) {
        if (i == 0) {
            clearStepTimestamps();
        }
        Map<Integer, Long> map = stepTimestamps;
        map.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(i);
        if (i == 10 && MiJiaEnvironment.isDebugBuildOrDevChannel()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("分段时间binekey、ble连接、ble认证、从点击下一步到连接认证蓝牙成功、发送wifi数据、发完wifi到wifi连接、整体连接：");
            sb2.append(map.get(2).longValue() - map.get(1).longValue());
            sb2.append(" ");
            sb2.append(map.get(4).longValue() - map.get(3).longValue());
            sb2.append(" ");
            sb2.append(map.get(6).longValue() - map.get(5).longValue());
            sb2.append(" ");
            sb2.append(map.get(6).longValue() - map.get(0).longValue());
            sb2.append(" ");
            sb2.append(map.get(8).longValue() - map.get(7).longValue());
            sb2.append(" ");
            sb2.append(map.get(9).longValue() - map.get(8).longValue());
            sb2.append(" ");
            sb2.append(map.get(10).longValue() - map.get(0).longValue());
            sb2.append(" ");
            if (context != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("分段时间bindkey: ");
                sb3.append(map.get(2).longValue() - map.get(1).longValue());
                sb3.append("\n");
                StringBuilder sb4 = new StringBuilder();
                sb4.append("ble连接: ");
                sb4.append(map.get(4).longValue() - map.get(3).longValue());
                sb4.append("\n");
                StringBuilder sb5 = new StringBuilder();
                sb5.append("ble认证: ");
                sb5.append(map.get(6).longValue() - map.get(5).longValue());
                sb5.append("\n");
                StringBuilder sb6 = new StringBuilder();
                sb6.append("从点击下一步到连接认证蓝牙成功: ");
                sb6.append(map.get(6).longValue() - map.get(0).longValue());
                sb6.append("\n");
                StringBuilder sb7 = new StringBuilder();
                sb7.append("发送wifi数据: ");
                sb7.append(map.get(8).longValue() - map.get(7).longValue());
                sb7.append("\n");
                StringBuilder sb8 = new StringBuilder();
                sb8.append("发完wifi到wifi连接: ");
                sb8.append(map.get(9).longValue() > 0 ? Long.valueOf(map.get(9).longValue() - map.get(8).longValue()) : NetworkStateUtil.NO_NETWORK);
                sb8.append("\n");
                StringBuilder sb9 = new StringBuilder();
                sb9.append("整体连接: ");
                sb9.append(map.get(10).longValue() - map.get(0).longValue());
                sb9.append("\n");
            }
        }
    }
}
