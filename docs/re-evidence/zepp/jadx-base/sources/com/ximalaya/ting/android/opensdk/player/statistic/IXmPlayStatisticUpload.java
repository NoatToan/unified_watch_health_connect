package com.ximalaya.ting.android.opensdk.player.statistic;

import com.ximalaya.ting.android.opensdk.model.history.XmPlayRecord;

/* JADX INFO: loaded from: classes22.dex */
public interface IXmPlayStatisticUpload {
    void release();

    void upLoadData(XmPlayRecord xmPlayRecord);
}
