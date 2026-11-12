package com.xiaomi.hm.health.bt.profile.dfu;

/* JADX INFO: loaded from: classes12.dex */
public class DfuState {
    public static final int BUSY = 9;
    public static final int COMMAND_SEND_FAILED = -5;
    public static final int COUNTDOWN_ALIVE = 35;
    public static final int CRC_ERR = 5;
    public static final int DECOMPRESS_FAILED = 86;
    public static final int DISCONNECT = 14;
    public static final int ECG_ALIVE = 50;
    public static final int ESIM_ACTIVATING = 36;
    public static final int EXCEEDS_LIMIT = 4;
    public static final int EXTERNAL_RESOURCE_UPGRADE_FAILED = 70;
    public static final int FAILED = 6;
    public static final int FILE_NOT_FOUND = -7;
    public static final int FIRMWARE_INTERNAL_ERROR = 80;
    public static final int FORMAT_ERR = 8;
    public static final int HTTP_OTA_RUNNING = 39;
    public static final int IAP_FAILED = 88;
    public static final int INVALID_HEADER = 12;
    public static final int INVALID_LENGHT = 13;
    public static final int INVALID_STATE = 2;
    public static final int LOSE = 7;
    public static final int LOW_BATTERY = 34;
    public static final int MODEM_UPGRADE_FAILED = 69;
    public static final int MUSIC_ALIVE = 48;
    public static final int OPEN_FILE_FAILED = 84;
    public static final int OPEN_SOURCE_FILE_FAILED = 87;
    public static final int PHONE_CALL_ALIVE = 38;
    public static final int READ_WRITE_FILE_FAILED = 85;
    public static final int RECORDER_ALIVE = 37;
    public static final int RESPONSE_IS_NULL = -6;
    public static final int R_SEQ_ERR = 11;
    public static final int R_TIMEOUT = 10;
    public static final int SIG_HEAD_FMT_ERR = 65;
    public static final int SIG_NO_HEAD = 64;
    public static final int SIG_PNP_NOT_MATCH = 66;
    public static final int SIG_VERIFY_FAIL = 67;
    public static final int SPACE_NOT_ENOUGH = 71;
    public static final int SPORT_ALIVE = 32;
    public static final int SUB_FILE_ORDER_ERROR = 83;
    public static final int SUCCESS = 1;
    public static final int TIMER_ALIVE = 33;
    public static final int TP_UPGRADING = 51;
    public static final int TRANSFER_ERROR = -1;
    public static final int TRANSFER_LENGTH_ERROR = -4;
    public static final int TRANSFER_NO_CONTINUE_RESPONSE = -2;
    public static final int UNKNOW = 0;
    public static final int UNSUPPORT_FILE_TYPE = 81;
    public static final int UNSUPPORT_SUB_FILE_TYPE = 82;
    public static final int UPGRADE_GPS_FAILED = 68;
    public static final int WRITE_TRUNK_FAILED = -3;
    public static final int XIAOAI_ALIVE = 49;
    private int a;

    public DfuState() {
        this.a = 0;
    }

    public int getState() {
        return this.a;
    }

    public DfuState(int state) {
        this.a = 0;
        this.a = state;
    }
}
