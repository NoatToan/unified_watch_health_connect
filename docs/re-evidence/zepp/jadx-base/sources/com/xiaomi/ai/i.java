package com.xiaomi.ai;

import com.xiaomi.ai.c.a;
import com.xiaomi.ai.c.d;
import com.xiaomi.ai.mibrain.MibrainRequest;
import com.xiaomi.ai.utils.Log;
import com.xiaomi.ai.utils.UploadHelper;
import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
class i implements Runnable {
    public final /* synthetic */ SpeechEngine.ParamBuilder a;
    public final /* synthetic */ c b;

    public i(c cVar, SpeechEngine.ParamBuilder paramBuilder) {
        this.b = cVar;
        this.a = paramBuilder;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.b.o) {
            SpeechEngine.ParamBuilder paramBuilder = this.b.r;
            SpeechEngine.ParamBuilder paramBuilder2 = this.a;
            if (paramBuilder != paramBuilder2) {
                Log.w("MiSpeechSDK:MiAiEngine", "new task is already begin!\n");
                return;
            }
            if (!paramBuilder2.needAsr && !paramBuilder2.needVpRec && !paramBuilder2.needVpReg) {
                if (!com.xiaomi.ai.utils.f.a(this.b.mContext)) {
                    this.b.a("Network error ");
                    SpeechError speechError = new SpeechError(SpeechEngine.ProcessStage.STAGE_REQUESTING);
                    speechError.errMsg = "Network error ";
                    speechError.errCode = 13;
                    speechError.errType = 2;
                    this.b.notifyError(this.a, speechError);
                    return;
                }
                try {
                    c cVar = this.b;
                    cVar.m = new MibrainRequest(cVar.b(this.a));
                    this.b.m.setGetAnonymousAuthorizationCallback(this.b.a);
                    Log.d("MiSpeechSDK:MiAiEngine", " new mMibrainRequest = " + this.b.m);
                    c cVar2 = this.b;
                    this.b.m.setRequestListener(cVar2.new d(this.a, cVar2.m));
                    int iStartRequest = this.b.m.startRequest();
                    if (iStartRequest < 0) {
                        String str = "startRequest failed: ret=" + iStartRequest;
                        this.b.a(str);
                        SpeechError speechError2 = new SpeechError(SpeechEngine.ProcessStage.STAGE_REQUESTING);
                        speechError2.errMsg = str;
                        speechError2.errCode = iStartRequest;
                        speechError2.errType = 2;
                        this.b.notifyError(this.a, speechError2);
                        return;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    SpeechError speechError3 = new SpeechError(SpeechEngine.ProcessStage.STAGE_REQUESTING);
                    speechError3.errMsg = e.getMessage();
                    speechError3.errCode = 1;
                    speechError3.errType = 2;
                    this.b.notifyError(this.a, speechError3);
                    return;
                }
            }
            if (this.b.k != null) {
                this.b.k.interrupt();
            }
            if (!com.xiaomi.ai.utils.f.a(this.b.mContext)) {
                this.b.a("Network error ");
                SpeechError speechError4 = new SpeechError(SpeechEngine.ProcessStage.STAGE_REQUESTING);
                speechError4.errMsg = "Network error ";
                speechError4.errCode = 13;
                speechError4.errType = 2;
                this.b.notifyError(this.a, speechError4);
                return;
            }
            try {
                c cVar3 = this.b;
                cVar3.m = new MibrainRequest(cVar3.b(this.a));
                this.b.m.setGetAnonymousAuthorizationCallback(this.b.a);
                Log.d("MiSpeechSDK:MiAiEngine", " new mMibrainRequest = " + this.b.m);
                c cVar4 = this.b;
                c.d dVar = cVar4.new d(this.a, cVar4.m);
                this.b.m.setRequestListener(dVar);
                if (this.b.n == null) {
                    this.b.a("startRequest released!");
                    SpeechError speechError5 = new SpeechError(SpeechEngine.ProcessStage.STAGE_REQUESTING);
                    speechError5.errMsg = "startRequest released!";
                    speechError5.errCode = -1;
                    speechError5.errType = 2;
                    this.b.notifyError(this.a, speechError5);
                    return;
                }
                this.b.n.a(this.b.m);
                this.b.n.a(dVar);
                int iStartRequest2 = this.b.m.startRequest();
                if (iStartRequest2 < 0) {
                    String str2 = "startRequest failed: ret=" + iStartRequest2;
                    this.b.a(str2);
                    SpeechError speechError6 = new SpeechError(SpeechEngine.ProcessStage.STAGE_REQUESTING);
                    speechError6.errMsg = str2;
                    speechError6.errCode = iStartRequest2;
                    speechError6.errType = 2;
                    this.b.notifyError(this.a, speechError6);
                    return;
                }
                SpeechEngine.ParamBuilder paramBuilder3 = this.a;
                if (paramBuilder3.needWakeupData) {
                    byte[] bArr = paramBuilder3.wakeupData;
                    if (bArr.length <= 32768) {
                        this.b.m.addRawData(this.a.wakeupData, 1, false, true);
                    } else {
                        int length = bArr.length / 32768;
                        int length2 = bArr.length % 32768;
                        int i = 0;
                        while (i < length) {
                            int i2 = i + 1;
                            this.b.m.addRawData(Arrays.copyOfRange(this.a.wakeupData, i * 32768, i2 * 32768), 1, false, i == length + (-1) && length2 == 0);
                            i = i2;
                        }
                        if (length2 != 0) {
                            byte[] bArr2 = this.a.wakeupData;
                            this.b.m.addRawData(Arrays.copyOfRange(bArr2, length * 32768, bArr2.length), 1, false, true);
                        }
                    }
                    this.b.m.addRawData(UploadHelper.generateSpliterJSON().getBytes(), 4, false, false);
                }
                c cVar5 = this.b;
                c cVar6 = this.b;
                cVar5.k = cVar6.new a(cVar6.m, this.a);
                dVar.a(this.b.k);
                this.b.k.start();
            } catch (JSONException e2) {
                e2.printStackTrace();
                this.b.a("buildRequestMsg failed !!: ");
                SpeechError speechError7 = new SpeechError(SpeechEngine.ProcessStage.STAGE_REQUESTING);
                speechError7.errMsg = "buildRequestMsg failed !!: ";
                speechError7.errCode = 1;
                speechError7.errType = 2;
                this.b.notifyError(this.a, speechError7);
            }
        }
    }
}
