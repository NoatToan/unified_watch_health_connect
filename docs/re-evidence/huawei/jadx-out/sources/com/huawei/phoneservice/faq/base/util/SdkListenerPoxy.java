package com.huawei.phoneservice.faq.base.util;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SdkListenerPoxy implements SdkListener {
    private static final String TAG = "SdkListenerPoxy";
    private SdkListener sdkListener;

    public abstract void onSdkInitImpl(int i, int i2, String str);

    @Override // com.huawei.phoneservice.faq.base.util.SdkListener
    public void onSdkInit(int i, int i2, String str) {
        onSdkInitImpl(i, i2, str);
    }

    @Override // com.huawei.phoneservice.faq.base.util.SdkListener
    public void onSdkErr(String str, String str2) {
        g.a(TAG, "onSdkErr: key:" + str + " value: " + str2);
        this.sdkListener.onSdkErr(str, str2);
    }

    @Override // com.huawei.phoneservice.faq.base.util.SdkListener
    public boolean haveSdkErr(String str) {
        g.a(TAG, "haveSdkErr: key:" + str);
        return this.sdkListener.haveSdkErr(str);
    }

    public SdkListener getSdkListener() {
        return this.sdkListener;
    }

    public SdkListenerPoxy(SdkListener sdkListener) {
        this.sdkListener = sdkListener;
    }
}
