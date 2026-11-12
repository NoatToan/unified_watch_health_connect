package com.unionpay.b;

import android.os.Bundle;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.huawei.nfc.sdk.service.HwOpenPayTask;

/* JADX INFO: loaded from: classes6.dex */
final class f implements HwOpenPayTask.IHwPayResultCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f10759a;

    public f(b bVar) {
        this.f10759a = bVar;
    }

    @Override // com.huawei.nfc.sdk.service.HwOpenPayTask.IHwPayResultCallBack
    public final void onError(String str, String str2) {
        com.unionpay.utils.j.c("uppay", "queryHwPayStatus onError, errorCode:" + str + " errorMsg:" + str2);
        if (this.f10759a.j != null) {
            Message messageObtainMessage = this.f10759a.j.obtainMessage(AMapException.CODE_AMAP_SHARE_SIGNATURE_FAILURE);
            Bundle bundle = new Bundle();
            bundle.putString("errorCode", str);
            bundle.putString("errorDesc", str2);
            messageObtainMessage.obj = bundle;
            this.f10759a.j.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.nfc.sdk.service.HwOpenPayTask.IHwPayResultCallBack
    public final void onResult(Bundle bundle) {
        com.unionpay.utils.j.c("uppay", "queryHwPayStatus onResult");
        if (this.f10759a.j != null) {
            Message messageObtainMessage = this.f10759a.j.obtainMessage(4001);
            messageObtainMessage.obj = bundle;
            this.f10759a.j.sendMessage(messageObtainMessage);
        }
    }
}
