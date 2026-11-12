package com.huami.passport.api;

import android.os.Handler;
import android.os.Looper;
import com.huami.passport.IAccount;

/* JADX INFO: loaded from: classes12.dex */
public class ApiResult {
    public static <S, E> void onErrorCallback(final IAccount.Callback<S, E> callback, final E e) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.api.ApiResult.1
            @Override // java.lang.Runnable
            public void run() {
                IAccount.Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.onError(e);
                }
            }
        });
    }

    public static <S, E> void onSuccessCallback(final IAccount.Callback<S, E> callback, final S s) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.api.ApiResult.2
            @Override // java.lang.Runnable
            public void run() {
                IAccount.Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.onSuccess(s);
                }
            }
        });
    }
}
