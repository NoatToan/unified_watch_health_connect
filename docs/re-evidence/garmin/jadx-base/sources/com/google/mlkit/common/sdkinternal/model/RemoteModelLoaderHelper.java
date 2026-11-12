package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public interface RemoteModelLoaderHelper {
    @KeepForSdk
    MappedByteBuffer loadModelAtPath(String str);
}
