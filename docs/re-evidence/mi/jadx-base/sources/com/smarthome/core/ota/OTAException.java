package com.smarthome.core.ota;

import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;

/* JADX INFO: loaded from: classes6.dex */
public class OTAException extends Exception {
    private int mCode;

    public OTAException(int i) {
        super(code2String(i));
        this.mCode = i;
    }

    public static String code2String(int i) {
        if (i == -599) {
            return "switch firmware unknown error";
        }
        if (i == -499) {
            return "packet response unknown error";
        }
        if (i == -413) {
            return "packet response busy";
        }
        if (i == -412) {
            return "packet response timeout";
        }
        if (i == -201) {
            return "read remote version info fail";
        }
        if (i == -200) {
            return "read firmware version fail";
        }
        if (i == -108) {
            return "open data fragment notify fail";
        }
        if (i == -107) {
            return "open control point notify fail";
        }
        if (i == 0) {
            return "ota success";
        }
        if (i == 1) {
            return "it's latest version";
        }
        if (i == 2) {
            return "user cancel upgrade";
        }
        if (i == 3) {
            return "protocol version is low, need to update app";
        }
        switch (i) {
            case OTAErrorCode.DEVICE_LOW_BATTERY /* -508 */:
                return "device low battery";
            case OTAErrorCode.RECEIVE_FIRMWARE_FRAGMENT_FAIL /* -507 */:
                return "receive firmware fragment fail";
            case OTAErrorCode.SWITCH_FIRMWARE_SIGN_FAIL /* -506 */:
                return "switch firmware invalid sign";
            case OTAErrorCode.SWITCH_FIRMWARE_DEVICE_BUSY /* -505 */:
                return "switch firmware device busy";
            case OTAErrorCode.SWITCH_FIRMWARE_MEMORY_IS_FULL /* -504 */:
                return "switch firmware memory is full";
            case OTAErrorCode.SWITCH_FIRMWARE_ILLGAL_PARAMS /* -503 */:
                return "switch firmware invalid params";
            case OTAErrorCode.SWITCH_FIRMWARE_AUTH_FAIL /* -502 */:
                return "switch firmware auth fail";
            case OTAErrorCode.SWITCH_FIRMWARE_COMMAND_WRONG /* -501 */:
                return "switch firmware invalid command";
            default:
                switch (i) {
                    case OTAErrorCode.DFU_READ_FRAGMENT_SIZE_FAIL /* -403 */:
                        return "read device fragment size fail";
                    case OTAErrorCode.DFU_READ_LAST_INDEX_FAIL /* -402 */:
                        return "read fragment last index fail";
                    case OTAErrorCode.DFU_READ_PROTOCOL_VERSION_FAIL /* -401 */:
                        return "read protocol version fail";
                    default:
                        switch (i) {
                            case OTAErrorCode.DOWNLOAD_URL_IS_EMPTY /* -303 */:
                                return "download url is empty";
                            case OTAErrorCode.DOWNLOAD_MD5_NOT_EQUAL /* -302 */:
                                return "download file md5 not equal";
                            case OTAErrorCode.DOWNLOAD_FAIL /* -301 */:
                                return "download file fail";
                            default:
                                switch (i) {
                                    case OTAErrorCode.BLE_DISCONNECTED_STATUS /* -105 */:
                                        return "ble disconnect";
                                    case -104:
                                        return "download file not exist";
                                    case -103:
                                        return "another update ongoing";
                                    case -102:
                                        return "mac is empty";
                                    case -101:
                                        return "ota ongoing,but ble disconnect";
                                    case -100:
                                        return "connect device fail";
                                    default:
                                        return "unknown error!【" + i + "】";
                                }
                        }
                }
        }
    }

    public int getCode() {
        return this.mCode;
    }

    public OTAException(int i, String str) {
        super(str);
        this.mCode = i;
    }
}
