package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.sdkinternal.MLTaskInput;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class MLTask<T, S extends MLTaskInput> extends ModelResource {
    public MLTask() {
    }

    @KeepForSdk
    public abstract T run(S s8);

    @KeepForSdk
    public MLTask(TaskQueue taskQueue) {
        super(taskQueue);
    }
}
