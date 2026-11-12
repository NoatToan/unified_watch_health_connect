package com.miui.tsmclient.nfc;

import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public class NfcOperatorManager {
    public static final String NFC_FEATURE_AUTO_RF = "Auto_RF";
    private static final String SDK_VERSION_S = "S";
    private static volatile NfcOperatorManager sInstance;
    private INfcOperator mOperator;

    private NfcOperatorManager() {
        if (Build.VERSION.CODENAME.equals(SDK_VERSION_S) || Build.VERSION.SDK_INT > 30) {
            this.mOperator = new NfcOperatorApi31Impl();
        } else {
            this.mOperator = new NfcOperationBaseImpl();
        }
    }

    private static NfcOperatorManager getInstance() {
        if (sInstance == null) {
            synchronized (NfcOperatorManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new NfcOperatorManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static INfcOperator getOperator() {
        return getInstance().mOperator;
    }
}
