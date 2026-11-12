package com.xiaomi.hm.health.bt.profile.mili;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public interface IMiLiProfile {
    public static final int ALIAS_LEN = 10;
    public static final int NOTIFY_AUTHENTICATION_FAILED = 6;
    public static final int NOTIFY_AUTHENTICATION_SUCCESS = 5;
    public static final int NOTIFY_CONN_PARAM_UPDATE_FAILED = 3;
    public static final int NOTIFY_CONN_PARAM_UPDATE_SUCCESS = 4;
    public static final int NOTIFY_DEVICE_MALFUNCTION = 255;
    public static final int NOTIFY_FIRMWARE_UPDATE_FAILED = 1;
    public static final int NOTIFY_FIRMWARE_UPDATE_SUCCESS = 2;
    public static final int NOTIFY_FITNESS_GOAL_ACHIEVED = 7;
    public static final int NOTIFY_FW_CHECK_FAILED = 11;
    public static final int NOTIFY_FW_CHECK_SUCCESS = 12;
    public static final int NOTIFY_NORMAL = 0;
    public static final int NOTIFY_PAIR_CANCEL = 239;
    public static final int NOTIFY_RESET_AUTHENTICATION_FAILED = 9;
    public static final int NOTIFY_RESET_AUTHENTICATION_SUCCESS = 10;
    public static final int NOTIFY_SET_LATENCY_SUCCESS = 8;
    public static final int NOTIFY_STATUS_MOTOR_ALARM = 17;
    public static final int NOTIFY_STATUS_MOTOR_AUTH = 19;
    public static final int NOTIFY_STATUS_MOTOR_AUTH_SUCCESS = 21;
    public static final int NOTIFY_STATUS_MOTOR_CALL = 14;
    public static final int NOTIFY_STATUS_MOTOR_DISCONNECT = 15;
    public static final int NOTIFY_STATUS_MOTOR_GOAL = 18;
    public static final int NOTIFY_STATUS_MOTOR_NOTIFY = 13;
    public static final int NOTIFY_STATUS_MOTOR_SHUTDOWN = 20;
    public static final int NOTIFY_STATUS_MOTOR_SMART_ALARM = 16;
    public static final int NOTIFY_STATUS_MOTOR_SPEED_WARNING = 27;
    public static final int NOTIFY_STATUS_MOTOR_TEST = 22;
    public static final int NOTIFY_UNKNOWN = -1;
    public static final UUID UUID_CHARACTERISTIC_DEVICE_INFO = GattUtils.uuid16("FF01");
    public static final UUID UUID_CHARACTERISTIC_DEVICE_NAME = GattUtils.uuid16("FF02");
    public static final UUID UUID_CHARACTERISTIC_NOTIFICATION = GattUtils.uuid16("FF03");
    public static final UUID UUID_CHARACTERISTIC_USER_INFO = GattUtils.uuid16("FF04");
    public static final UUID UUID_CHARACTERISTIC_CONTROL_POINT = GattUtils.uuid16("FF05");
    public static final UUID UUID_CHARACTERISTIC_REALTIME_STEPS = GattUtils.uuid16("FF06");
    public static final UUID UUID_CHARACTERISTIC_ACTIVITY_DATA = GattUtils.uuid16("FF07");
    public static final UUID UUID_CHARACTERISTIC_FIRMWARE_DATA = GattUtils.uuid16("FF08");
    public static final UUID UUID_CHARACTERISTIC_LE_PARAMS = GattUtils.uuid16("FF09");
    public static final UUID UUID_CHARACTERISTIC_DATE_TIME_OLD = GattUtils.uuid16("FF0A");
    public static final UUID UUID_CHARACTERISTIC_STATISTICS = GattUtils.uuid16("FF0B");
    public static final UUID UUID_CHARACTERISTIC_BATTERY = GattUtils.uuid16("FF0C");
    public static final UUID UUID_CHARACTERISTIC_TEST = GattUtils.uuid16("FF0D");
    public static final UUID UUID_CHARACTERISTIC_PAIR = GattUtils.uuid16("FF0F");
}
