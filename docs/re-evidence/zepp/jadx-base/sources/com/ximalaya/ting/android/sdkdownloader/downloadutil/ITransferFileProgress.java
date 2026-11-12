package com.ximalaya.ting.android.sdkdownloader.downloadutil;

import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.sdkdownloader.exception.TransferSavePathException;

/* JADX INFO: loaded from: classes22.dex */
public interface ITransferFileProgress extends IDoSomethingProgress<TransferSavePathException> {
    void progress(int i, int i2, Track track);
}
