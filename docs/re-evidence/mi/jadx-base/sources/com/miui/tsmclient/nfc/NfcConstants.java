package com.miui.tsmclient.nfc;

/* JADX INFO: loaded from: classes6.dex */
public class NfcConstants {
    public static final String CHIP_TYPE_NXP = "NXP";
    public static final String CHIP_TYPE_ST = "ST";
    public static final byte[] DEFAULT_FW_VERSION = new byte[0];
    public static final int ENABLE_FW_VERSION_CONTROL = 1;
    public static final int LISTEN_MASK = 15;
    public static final int MASK_LISTEN_DISABLE = 0;
    public static final int MASK_LISTEN_DISABLE_COMPAT = 0;
    public static final int MASK_LISTEN_ENABLE = 1;
    public static final int MASK_LISTEN_ENABLE_COMPAT = 16;
    public static final int MASK_POLL_DISABLE = 0;
    public static final int MASK_POLL_DISABLE_COMPAT = 0;
    public static final int MASK_POLL_ENABLE = 256;
    public static final int MASK_POLL_ENABLE_COMPAT = 4096;
    public static final String METHOD_EXT_SMART_CARD_API = "extSmartcardApi";
    public static final String METHOD_GET_FW_VERSION = "getFwVersion";
    public static final String METHOD_GET_NFCC_DIEID = "getNfccDieid";
    public static final String METHOD_GET_SE_ROUTING = "getSeRouting";
    public static final String METHOD_SET_CONFIG = "setConfig";
    public static final String METHOD_SET_SE_ROUTING = "setSeRouting";
    public static final byte MODE_LISTEN = 1;
    public static final byte MODE_LISTEN_COMPAT = 16;
    public static final byte MODE_POLL = 2;
    public static final byte MODE_POLL_COMPAT = 32;
    public static final int SE_ROUTE_ESE = 1;
    public static final int SE_ROUTE_HCE = 0;
    public static final int SE_ROUTE_UNKNOWN = -1;
    public static final int TECH_TYPE_A = 1;
    public static final int TECH_TYPE_B = 2;
    public static final int TECH_TYPE_F = 4;

    private NfcConstants() {
    }
}
