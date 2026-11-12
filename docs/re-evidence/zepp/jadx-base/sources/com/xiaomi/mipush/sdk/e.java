package com.xiaomi.mipush.sdk;

/* JADX INFO: loaded from: classes22.dex */
final class e implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MiPushClient.ICallbackResult d;

    public e(String str, String str2, String str3, MiPushClient.ICallbackResult iCallbackResult) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = iCallbackResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strName;
        if (MiPushClient.sUserSetRegion != null) {
            strName = MiPushClient.sUserSetRegion.name();
            MiPushClient.sUserSetRegion = null;
        } else {
            strName = "";
        }
        MiPushClient.initialize(MiPushClient.sContext, this.a, this.b, null, this.c, this.d, strName);
    }
}
