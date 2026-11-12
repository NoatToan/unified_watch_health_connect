package com.xiaomi.ai.utils;

import com.xiaomi.ai.SendWakeupDataStatusInterface;
import com.xiaomi.ai.mibrain.MibrainRequest;
import com.xiaomi.ai.mibrain.MibrainRequestListener;

/* JADX INFO: loaded from: classes18.dex */
class m implements MibrainRequestListener {
    public final /* synthetic */ SendWakeupDataStatusInterface a;
    public final /* synthetic */ com.xiaomi.ai.m b;
    public final /* synthetic */ UploadHelper c;

    public m(UploadHelper uploadHelper, SendWakeupDataStatusInterface sendWakeupDataStatusInterface, com.xiaomi.ai.m mVar) {
        this.c = uploadHelper;
        this.a = sendWakeupDataStatusInterface;
        this.b = mVar;
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onEventTrack(String str) {
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onInstruction(MibrainRequest mibrainRequest, String str) {
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public String onNeedUpdateToken() {
        return null;
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestASRResult(MibrainRequest mibrainRequest, String str, boolean z) {
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestError(MibrainRequest mibrainRequest, String str, int i, int i2) {
        Log.d("UploadHelper", "startUploadRequest error " + str);
        SendWakeupDataStatusInterface sendWakeupDataStatusInterface = this.a;
        if (sendWakeupDataStatusInterface != null) {
            sendWakeupDataStatusInterface.onSendError(str);
        }
        this.c.mFlag.compareAndSet(true, false);
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public String onRequestGetToken(MibrainRequest mibrainRequest, boolean z) {
        String str;
        com.xiaomi.ai.m mVar = this.b;
        if (mVar == null) {
            Log.e("UploadHelper", "upload data onRequestGetToken aiOauthHelper = null ");
            return null;
        }
        com.xiaomi.ai.m.a aVarA = mVar.a(z);
        if (aVarA == null || (str = aVarA.a) == null) {
            return null;
        }
        return str;
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestNLpResult(MibrainRequest mibrainRequest, String str) {
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestOtherResult(MibrainRequest mibrainRequest, String str) {
        Log.d("UploadHelper", "upload data return " + str);
        SendWakeupDataStatusInterface sendWakeupDataStatusInterface = this.a;
        if (sendWakeupDataStatusInterface != null) {
            sendWakeupDataStatusInterface.onSendResult(str);
        }
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestSessionEnd(MibrainRequest mibrainRequest) {
        Log.d("UploadHelper", "upload data end");
        SendWakeupDataStatusInterface sendWakeupDataStatusInterface = this.a;
        if (sendWakeupDataStatusInterface != null) {
            sendWakeupDataStatusInterface.onSendEnd();
        }
        this.c.mFlag.compareAndSet(true, false);
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestSessionStart(MibrainRequest mibrainRequest) {
        Log.d("UploadHelper", "start startUploadRequest");
        SendWakeupDataStatusInterface sendWakeupDataStatusInterface = this.a;
        if (sendWakeupDataStatusInterface != null) {
            sendWakeupDataStatusInterface.onSendStart();
        }
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestTTSResult(MibrainRequest mibrainRequest, String str, byte[] bArr, boolean z) {
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestVoiceprintDeleteResult(MibrainRequest mibrainRequest, String str) {
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestVoiceprintQueryResult(MibrainRequest mibrainRequest, String str) {
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestVoiceprintRecognizedResult(MibrainRequest mibrainRequest, String str) {
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestVoiceprintRegisteredResult(MibrainRequest mibrainRequest, String str, boolean z) {
    }
}
