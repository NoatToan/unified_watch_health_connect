package com.xiaomi.passport.ui.logiccontroller;

import android.content.Context;
import com.xiaomi.accountsdk.utils.AccountLogger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ExceptionHandler {
    public final ExceptionHandler nextHandler;

    public ExceptionHandler(ExceptionHandler exceptionHandler) {
        this.nextHandler = exceptionHandler;
    }

    public abstract boolean handle(Context context, Throwable th);

    public void handleException(Context context, Throwable th) {
        AccountLogger.log("ExceptionHandler", "handle exception", th);
        for (ExceptionHandler exceptionHandler = this; exceptionHandler != null; exceptionHandler = exceptionHandler.nextHandler) {
            if (exceptionHandler.handle(context, th)) {
                return;
            }
        }
        throw new IllegalStateException("can not handle exception: " + th);
    }
}
