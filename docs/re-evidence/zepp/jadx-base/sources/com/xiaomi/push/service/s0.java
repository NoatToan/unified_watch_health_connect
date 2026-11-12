package com.xiaomi.push.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes22.dex */
class s0 extends Handler {
    public final /* synthetic */ XMPushService a;

    public s0(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null) {
            try {
                int i = message.what;
                if (i == 17) {
                    Object obj = message.obj;
                    if (obj != null) {
                        this.a.onStart((Intent) obj, 1);
                    }
                } else if (i == 18) {
                    Message messageObtain = Message.obtain((Handler) null, 0);
                    messageObtain.what = 18;
                    Bundle bundle = new Bundle();
                    bundle.putString("xmsf_region", a.a(this.a.getApplicationContext()).a());
                    messageObtain.setData(bundle);
                    message.replyTo.send(messageObtain);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
