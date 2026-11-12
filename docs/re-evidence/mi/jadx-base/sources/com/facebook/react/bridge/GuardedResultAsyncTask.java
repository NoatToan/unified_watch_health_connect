package com.facebook.react.bridge;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
    private final NativeModuleCallExceptionHandler mExceptionHandler;

    @Deprecated
    public GuardedResultAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    public abstract Result doInBackgroundGuarded();

    @Override // android.os.AsyncTask
    public final void onPostExecute(Result result) {
        try {
            onPostExecuteGuarded(result);
        } catch (RuntimeException e) {
            this.mExceptionHandler.handleException(e);
        }
    }

    public abstract void onPostExecuteGuarded(Result result);

    public GuardedResultAsyncTask(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mExceptionHandler = nativeModuleCallExceptionHandler;
    }

    @Override // android.os.AsyncTask
    public final Result doInBackground(Void... voidArr) {
        try {
            return doInBackgroundGuarded();
        } catch (RuntimeException e) {
            this.mExceptionHandler.handleException(e);
            throw e;
        }
    }
}
