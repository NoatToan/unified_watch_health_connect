package com.xiaomi.continuity.channel;

import com.xiaomi.continuity.jni.NObject;

/* JADX INFO: loaded from: classes7.dex */
class NConnMgrSendResultCallback extends NObject implements SendResultCallback {
    @Override // com.xiaomi.continuity.channel.SendResultCallback
    public native void onProgress(int i);

    @Override // com.xiaomi.continuity.channel.SendResultCallback
    public native void onResult(int i, String str);
}
