package com.mibi.sdk.task;

import android.content.Context;
import com.mibi.sdk.task.handler.ExceptionDispatcher;
import defpackage.b6h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RxBaseErrorHandleTaskListener<R> implements b6h<R> {
    private Context mContext;
    private RxBaseErrorHandler mErrorHandler;
    private RxBaseSuccessHandler<R> mSuccessHandler;

    public RxBaseErrorHandleTaskListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mErrorHandler = new RxBaseErrorHandler(applicationContext) { // from class: com.mibi.sdk.task.RxBaseErrorHandleTaskListener.1
            @Override // com.mibi.sdk.task.RxBaseErrorHandler
            public void handleError(int i, String str, Throwable th) {
                RxBaseErrorHandleTaskListener.this.handleError(i, str, th);
            }
        };
        this.mSuccessHandler = new RxBaseSuccessHandler<R>() { // from class: com.mibi.sdk.task.RxBaseErrorHandleTaskListener.2
            @Override // com.mibi.sdk.task.RxBaseSuccessHandler
            public void handleSuccess(R r2) {
                RxBaseErrorHandleTaskListener.this.handleSuccess(r2);
            }
        };
    }

    public ExceptionDispatcher getDispatcher() {
        return this.mErrorHandler.getDispathcher();
    }

    public void handleError(int i, String str, Throwable th) {
    }

    public void handleSuccess(R r2) {
    }

    @Override // defpackage.b6h
    public void onError(Throwable th) {
        this.mErrorHandler.call(th);
    }

    @Override // defpackage.b6h
    public void onSuccess(R r2) {
        this.mSuccessHandler.call(r2);
    }
}
