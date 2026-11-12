package com.miui.tsmclient.hcievent;

/* JADX INFO: loaded from: classes6.dex */
public class HciEventConstants {
    public static final String ACTION_RF_FIELD_OFF = "com.android.nfc_extras.action.RF_FIELD_OFF_DETECTED";
    public static final String ACTION_RF_FIELD_ON = "com.android.nfc_extras.action.RF_FIELD_ON_DETECTED";
    public static final String ACTION_TRANSACTION = "com.miui.nfc.action.TRANSACTION";
    public static final String ACTION_TRANSACTION_LOCAL = "com.miui.tsmclient.action.TRANSACTION";
    public static final String ACTION_TRANSACTION_QR = "com.miui.nfc.action.TRANSACTION_QR";
    public static final String ARGS_HCI_EVENT_INFO = "extra_hci_event_info";
    public static final String EXTRAS_SWITCH_CARD_LAUNCHABLE = "com.miui.nfc.extras.SWITCH_CARD_LAUNCHABLE";
    public static final String EXTRAS_TRANSACTION_AID = "com.miui.nfc.extras.AID";
    public static final String EXTRAS_TRANSACTION_DATA = "com.miui.nfc.extras.DATA";
    public static final String EXTRAS_TRANSACTION_FLAG_QR_PAY = "com.miui.nfc.extras.FLAG_QR_PAY";
    public static final int FLAG_COMPENSATION = 2;
    public static final int FLAG_NEED_ACTIVATE = 1;
    public static final String PERMISSION_SEND_HCI_EVENT = "com.miui.nfc.permission.SEND_HCI_EVENT";

    private HciEventConstants() {
    }
}
