package com.huawei.unitedevice.api;

import android.content.Context;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import com.huawei.unitedevice.p2p.P2pReceiver;
import defpackage.xgz;
import defpackage.xhr;

/* JADX INFO: loaded from: classes.dex */
public interface EngineChannelInterface {
    void p2pSendForWearEngine(Context context, UniteDevice uniteDevice, xgz xgzVar, SendCallback sendCallback);

    void pingSendForWearEngine(Context context, UniteDevice uniteDevice, String str, PingCallback pingCallback, int i);

    void registerReceiver(Context context, xgz xgzVar, P2pReceiver p2pReceiver, SendCallback sendCallback);

    void startReceiveFileFromWear(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback);

    void startTransferFileToWear(xhr xhrVar, IResultAIDLCallback iResultAIDLCallback);

    void stopReceiveFileFromWear(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback);

    void stopTransferFileToWear(xhr xhrVar, ITransferFileCallback iTransferFileCallback);

    void unregisterReceiver(Context context, P2pReceiver p2pReceiver, xgz xgzVar);
}
