package com.xiaomi.ai;

import com.xiaomi.ai.utils.UploadHelper;

/* JADX INFO: loaded from: classes18.dex */
class e implements Runnable {
    public final /* synthetic */ SendWakeupDataStatusInterface a;
    public final /* synthetic */ UploadHelper.ASRRecordInfo b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ c d;

    public e(c cVar, SendWakeupDataStatusInterface sendWakeupDataStatusInterface, UploadHelper.ASRRecordInfo aSRRecordInfo, byte[] bArr) {
        this.d = cVar;
        this.a = sendWakeupDataStatusInterface;
        this.b = aSRRecordInfo;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        UploadHelper uploadHelper = this.d.getUploadHelper(this.a);
        if (uploadHelper == null) {
            this.a.onSendError("getUploadHelper Error");
            return;
        }
        String strGenerateASRRecordMessage = UploadHelper.generateASRRecordMessage(this.d.mContext, this.b);
        if (strGenerateASRRecordMessage == null) {
            this.a.onSendError("getUploadHelper gen asr msg Error");
            return;
        }
        uploadHelper.addUploadData(strGenerateASRRecordMessage.getBytes(), true);
        uploadHelper.addUploadData(this.c, false);
        uploadHelper.endUploadData();
    }
}
