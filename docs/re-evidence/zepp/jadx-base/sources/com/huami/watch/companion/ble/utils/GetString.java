package com.huami.watch.companion.ble.utils;

import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public class GetString {
    public static String BtConnState(int i) {
        if (i == 1) {
            return "STATE_CONNECTING(1)";
        }
        if (i == 3) {
            return "STATE_CONNECTING(0)";
        }
        return "UNKNOWN(" + i + ")";
    }

    public static String BtProfileState(int i) {
        if (i == 0) {
            return "STATE_DISCONNECTED(0)";
        }
        if (i == 1) {
            return "STATE_CONNECTING(1)";
        }
        if (i == 2) {
            return "STATE_CONNECTED(2)";
        }
        if (i == 3) {
            return "STATE_DISCONNECTING(3)";
        }
        return "UNKNOWN(" + i + ")";
    }

    public static String StartAdvErr(int i) {
        if (i == 1) {
            return "ADVERTISE_FAILED_DATA_TOO_LARGE(1)";
        }
        if (i == 2) {
            return "ADVERTISE_FAILED_TOO_MANY_ADVERTISERS(2)";
        }
        if (i == 3) {
            return "ADVERTISE_FAILED_ALREADY_STARTED(3)";
        }
        if (i == 4) {
            return "ADVERTISE_FAILED_INTERNAL_ERROR(4)";
        }
        if (i == 5) {
            return "ADVERTISE_FAILED_FEATURE_UNSUPPORTED(5)";
        }
        return "UNKNOWN(" + i + ")";
    }

    public static String bondState(int i) {
        switch (i) {
            case 10:
                return "BOND_NONE(10)";
            case 11:
                return "BOND_BONDING(11)";
            case 12:
                return "BOND_BONDED(12)";
            default:
                return "UNKNOWN(" + i + ")";
        }
    }

    public static String scanMode(int i) {
        if (i == 20) {
            return "SCAN_MODE_NONE(20)";
        }
        if (i == 21) {
            return "SCAN_MODE_CONNECTABLE(21)";
        }
        if (i == 23) {
            return "SCAN_MODE_CONNECTABLE_DISCOVERABLE(23)";
        }
        return "UNKNOWN(" + i + ")";
    }

    public static String toString(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        int length = bArr.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(JsonLexerKt.BEGIN_LIST);
        int i = 0;
        while (true) {
            sb.append(Integer.toHexString(bArr[i] & 255));
            if (i == length) {
                sb.append(JsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }
}
