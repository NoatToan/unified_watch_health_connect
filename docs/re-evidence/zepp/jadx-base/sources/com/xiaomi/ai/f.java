package com.xiaomi.ai;

import com.xiaomi.ai.mibrain.MibrainRequest;
import com.xiaomi.ai.mibrain.MibrainRequestListener;
import com.xiaomi.ai.utils.Log;

/* JADX INFO: loaded from: classes18.dex */
class f implements MibrainRequestListener {
    public final /* synthetic */ SendWakeupDataStatusInterface a;
    public final /* synthetic */ c b;

    public f(c cVar, SendWakeupDataStatusInterface sendWakeupDataStatusInterface) {
        this.b = cVar;
        this.a = sendWakeupDataStatusInterface;
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
        Log.d("MiSpeechSDK:MiAiEngine", "send wakeup data error " + str);
        SendWakeupDataStatusInterface sendWakeupDataStatusInterface = this.a;
        if (sendWakeupDataStatusInterface != null) {
            sendWakeupDataStatusInterface.onSendError(str);
        }
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public String onRequestGetToken(MibrainRequest mibrainRequest, boolean z) {
        String str;
        m mVar = this.b.s;
        if (mVar == null) {
            Log.e("MiSpeechSDK:MiAiEngine", "send wakeup data onRequestGetToken aiOauthHelper = null ");
            return null;
        }
        m.a aVarA = mVar.a(z);
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
        Log.d("MiSpeechSDK:MiAiEngine", "send wakeup data return " + str);
        SendWakeupDataStatusInterface sendWakeupDataStatusInterface = this.a;
        if (sendWakeupDataStatusInterface != null) {
            sendWakeupDataStatusInterface.onSendResult(str);
        }
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestSessionEnd(MibrainRequest mibrainRequest) {
        Log.d("MiSpeechSDK:MiAiEngine", "send wakeup data end");
        SendWakeupDataStatusInterface sendWakeupDataStatusInterface = this.a;
        if (sendWakeupDataStatusInterface != null) {
            sendWakeupDataStatusInterface.onSendEnd();
        }
    }

    @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
    public void onRequestSessionStart(MibrainRequest mibrainRequest) {
        Log.d("MiSpeechSDK:MiAiEngine", "start send wakeup data");
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
