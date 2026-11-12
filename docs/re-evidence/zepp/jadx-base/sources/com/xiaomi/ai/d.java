package com.xiaomi.ai;

import com.xiaomi.ai.utils.UploadHelper;

/* JADX INFO: loaded from: classes18.dex */
class d implements Runnable {
    public final /* synthetic */ SendWakeupDataStatusInterface a;
    public final /* synthetic */ UploadHelper.WakeupDataInfo b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ c d;

    public d(c cVar, SendWakeupDataStatusInterface sendWakeupDataStatusInterface, UploadHelper.WakeupDataInfo wakeupDataInfo, byte[] bArr) {
        this.d = cVar;
        this.a = sendWakeupDataStatusInterface;
        this.b = wakeupDataInfo;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        UploadHelper uploadHelper = this.d.getUploadHelper(this.a);
        if (uploadHelper == null) {
            this.a.onSendError("getUploadHelper Error");
            return;
        }
        String strGenerateWakeupDataMessage = UploadHelper.generateWakeupDataMessage(this.d.mContext, this.b);
        if (strGenerateWakeupDataMessage == null) {
            this.a.onSendError("getUploadHelper gen asr msg Error");
            return;
        }
        uploadHelper.addUploadData(strGenerateWakeupDataMessage.getBytes(), true);
        uploadHelper.addUploadData(this.c, false);
        uploadHelper.endUploadData();
    }
}
