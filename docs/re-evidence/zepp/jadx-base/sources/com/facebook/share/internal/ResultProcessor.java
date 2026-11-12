package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResultProcessor {
    private FacebookCallback a;

    public ResultProcessor(FacebookCallback facebookCallback) {
        this.a = facebookCallback;
    }

    public void onCancel(AppCall appCall) {
        FacebookCallback facebookCallback = this.a;
        if (facebookCallback != null) {
            facebookCallback.onCancel();
        }
    }

    public void onError(AppCall appCall, FacebookException facebookException) {
        FacebookCallback facebookCallback = this.a;
        if (facebookCallback != null) {
            facebookCallback.onError(facebookException);
        }
    }

    public abstract void onSuccess(AppCall appCall, Bundle bundle);
}
