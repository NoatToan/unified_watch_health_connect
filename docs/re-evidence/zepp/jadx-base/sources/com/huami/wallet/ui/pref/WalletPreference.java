package com.huami.wallet.ui.pref;

/* JADX INFO: loaded from: classes16.dex */
public interface WalletPreference {
    void clear();

    long getSendSmsCodeTimestamp();

    void saveSendSmsCodeTimestamp(long j);
}
