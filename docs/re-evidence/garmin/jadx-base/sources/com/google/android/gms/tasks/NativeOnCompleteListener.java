package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public NativeOnCompleteListener(long j8) {
        this.zza = j8;
    }

    @KeepForSdk
    public static void createAndAddCallback(Task<Object> task, long j8) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j8));
    }

    @KeepForSdk
    public native void nativeOnComplete(long j8, Object obj, boolean z14, boolean z15, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(Task<Object> task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
