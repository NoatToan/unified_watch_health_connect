package com.huami.wallet.ui.pref;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes16.dex */
public class AndroidWalletPreference implements WalletPreference {
    private static final String b = "Wallet";
    private static final String c = "KEY_SEND_SMS_CODE_TIMESTAMP";
    private final SharedPreferences a;

    public AndroidWalletPreference(Context context) {
        this.a = context.getSharedPreferences(b, 0);
    }

    @Override // com.huami.wallet.ui.pref.WalletPreference
    public void clear() {
        this.a.edit().clear().apply();
    }

    @Override // com.huami.wallet.ui.pref.WalletPreference
    public long getSendSmsCodeTimestamp() {
        return this.a.getLong(c, 0L);
    }

    @Override // com.huami.wallet.ui.pref.WalletPreference
    public void saveSendSmsCodeTimestamp(long j) {
        this.a.edit().putLong(c, j).apply();
    }
}
