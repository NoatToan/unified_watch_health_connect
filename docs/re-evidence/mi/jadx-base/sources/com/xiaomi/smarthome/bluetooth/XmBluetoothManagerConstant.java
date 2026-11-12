package com.xiaomi.smarthome.bluetooth;

/* JADX INFO: loaded from: classes4.dex */
public final class XmBluetoothManagerConstant {
    public static final String ACTION_CHARACTER_CHANGED = "com.xiaomi.smarthome.bluetooth.character_changed";
    public static final String ACTION_CHARACTER_WRITE = "com.xiaomi.smarthome.bluetooth.character_write";
    public static final String ACTION_CONNECT_STATUS_CHANGED = "com.xiaomi.smarthome.bluetooth.connect_status_changed";
    public static final int ALERT_ALARM_ENABLED = 3;
    public static final int ALERT_INCALL_IN_CONTACTS_ENABLED = 1;
    public static final int ALERT_INCALL_NO_CONTACTS_ENABLED = 2;
    public static final int ALERT_SMS_IN_CONTACTS_ENABLED = 4;
    public static final int ALERT_SMS_NO_CONTACTS_ENABLED = 5;
    public static final String EXTRA_GATT_PROFILE = "key_gatt_profile";
    public static final String EXTRA_SCANRECORD = "extra.scanRecord";
    public static final String EXTRA_TOKEN = "token";
    public static final String EXTRA_UPGRADE_PROCESS = "extra_upgrade_progress";
    public static final String KEY_CHARACTER_UUID = "key_character_uuid";
    public static final String KEY_CHARACTER_VALUE = "key_character_value";
    public static final String KEY_CHARACTER_WRITE_STATUS = "key_character_write_status";
    public static final String KEY_CONNECT_STATUS = "key_connect_status";
    public static final String KEY_DEVICES = "devices";
    public static final String KEY_DEVICE_ADDRESS = "key_device_address";
    public static final String KEY_MISERVICE_CHARACTERS = "key_miservice_characters";
    public static final String KEY_SERVICE_UUID = "key_service_uuid";
    public static final int SECURITY_CHIP_BOLT_OPERATOR = 2;
    public static final int SECURITY_CHIP_LOCK_OPERATOR = 1;
    public static final int SECURITY_CHIP_UNLOCK_OPERATOR = 0;
    public static final int STATUS_CONNECTED = 16;
    public static final int STATUS_DISCONNECTED = 32;
    public static final int STATUS_OFFLINE = 64;
    public static final int STATUS_ONLINE = 48;
    public static final int STATUS_UNKNOWN = 5;

    public static class Code {
        public static final int REQUEST_FAILED = -1;
        public static final int REQUEST_PINCODE_IS_EMPTY = -38;
        public static final int REQUEST_SUCCESS = 0;
    }
}
