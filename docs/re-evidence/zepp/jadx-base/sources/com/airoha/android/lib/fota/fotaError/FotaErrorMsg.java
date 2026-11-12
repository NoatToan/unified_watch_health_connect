package com.airoha.android.lib.fota.fotaError;

import com.alipay.sdk.m.f0.c;
import com.huami.wallet.datasource.cloud.Const;

/* JADX INFO: loaded from: classes2.dex */
public class FotaErrorMsg {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ErrorEnum.values().length];
            a = iArr;
            try {
                iArr[ErrorEnum.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ErrorEnum.EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ErrorEnum.INTERRUPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ErrorEnum.ERROR_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ErrorEnum.RESPONSE_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ErrorEnum.BATTERY_LOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ErrorEnum.WRONG_PARTITION_ADDR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ErrorEnum.FOTA_BIN_FILE_NOT_FOUND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ErrorEnum.USER_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ErrorEnum.ABNORMALLY_DISCONNECTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_PARTNER_LOSS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_FOTA_FAIL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_FOTA_TIMEOUT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_FOTA_NOT_ALLOWED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_FOTA_SP_LOST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_FOTA_AGENT_LOST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_FOTA_BT_OFF.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_FOTA_UNEXPECTED_RHO_ONGOING.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_FOTA_UNEXPECTED_RHO_DONE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[ErrorEnum.DEVICE_CANCELLED_FOTA_UNKNOWN_REASON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[ErrorEnum.CONNECTION_TIMEOUT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static String findErrorMsg(ErrorEnum errorEnum) {
        switch (a.a[errorEnum.ordinal()]) {
            case 1:
                return c.p;
            case 2:
                return Const.CardState.EXCEPTION;
            case 3:
                return "All partitions are the same, interrupt FOTA";
            case 4:
                return "Status of response is error";
            case 5:
                return "Response timeout";
            case 6:
                return "Battery is Low";
            case 7:
                return "Wrong Partition Address";
            case 8:
                return "FOTA bin file not found";
            case 9:
                return "User cancel FOTA";
            case 10:
                return "Device cancel FOTA";
            case 11:
                return "Abnormally disconnected";
            case 12:
                return "Device cancel FOTA because partner loss";
            case 13:
                return "Device cancel FOTA because FOTA is fail";
            case 14:
                return "Device cancel FOTA because FOTA is timeout";
            case 15:
                return "Device cancel FOTA because FOTA is not allowed or idle timeout.";
            case 16:
                return "Device cancel FOTA because smart phone loss";
            case 17:
                return "Device cancel FOTA because agent loss";
            case 18:
                return "Device cancel FOTA because BT is OFF";
            case 19:
                return "Device cancel FOTA because unexpected RHO ongoing";
            case 20:
                return "Device cancel FOTA because unexpected RHO done";
            case 21:
                return "Device cancel FOTA because unknown reason";
            case 22:
                return "Reconnect device timeout";
            default:
                return "Unknown Error";
        }
    }
}
