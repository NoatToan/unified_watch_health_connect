package com.huami.passport.domain.utils;

import android.os.Handler;
import android.os.Looper;
import com.huami.passport.domain.AccountCallback;

/* JADX INFO: loaded from: classes12.dex */
public class AccountResult {
    public static <R> void onCallback(final AccountCallback<R> accountCallback, final R r) {
        if (accountCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.domain.utils.AccountResult.1
            @Override // java.lang.Runnable
            public void run() {
                accountCallback.onResult(r);
            }
        });
    }
}
