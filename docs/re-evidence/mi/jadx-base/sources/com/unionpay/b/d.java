package com.unionpay.b;

import android.os.Bundle;
import android.os.Message;
import com.huawei.nfc.sdk.service.HwOpenPayTask;

/* JADX INFO: loaded from: classes6.dex */
final class d implements HwOpenPayTask.IHwResultCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f10757a;

    public d(b bVar) {
        this.f10757a = bVar;
    }

    @Override // com.huawei.nfc.sdk.service.HwOpenPayTask.IHwResultCallBack
    public final void onResult(int i, Bundle bundle) {
        com.unionpay.utils.j.c("uppay", "supportCapacity result:" + i);
        if (this.f10757a.j != null) {
            Message messageObtainMessage = this.f10757a.j.obtainMessage(4004);
            messageObtainMessage.obj = Integer.valueOf(i);
            this.f10757a.j.sendMessage(messageObtainMessage);
        }
    }
}
