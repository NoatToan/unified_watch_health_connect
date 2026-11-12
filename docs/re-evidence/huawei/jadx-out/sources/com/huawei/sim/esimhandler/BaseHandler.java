package com.huawei.sim.esimhandler;

import android.content.Context;
import android.os.Handler;
import defpackage.ocr;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseHandler implements EsimHandler {
    protected Context mContext;
    protected ocr mHwMultiDeviceManager;
    public Handler mMsgHandler;

    public Context getContext() {
        return this.mContext;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public Handler getMsgHandler() {
        return this.mMsgHandler;
    }

    public void setMsgHandler(Handler handler) {
        this.mMsgHandler = handler;
    }

    @Override // com.huawei.sim.esimhandler.EsimHandler
    public ocr getHwMultiDeviceManager() {
        return this.mHwMultiDeviceManager;
    }

    @Override // com.huawei.sim.esimhandler.EsimHandler
    public void setHwMultiDeviceManager(ocr ocrVar) {
        this.mHwMultiDeviceManager = ocrVar;
    }
}
