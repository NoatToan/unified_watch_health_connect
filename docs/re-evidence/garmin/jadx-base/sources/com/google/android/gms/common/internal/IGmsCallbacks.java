package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes14.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i14, IBinder iBinder, Bundle bundle);

    void zzb(int i14, Bundle bundle);

    void zzc(int i14, IBinder iBinder, zzj zzjVar);
}
