package com.huawei.android.appbundle.remote;

import android.os.IBinder;

/* JADX INFO: loaded from: classes22.dex */
public interface RemoteCall<T> {
    T asInterface(IBinder iBinder);
}
