package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes11.dex */
public class uhs extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XMPushService f35776a;

    public uhs(XMPushService xMPushService) {
        this.f35776a = xMPushService;
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
                        this.f35776a.onStart((Intent) obj, 1);
                    }
                } else if (i == 18) {
                    Message messageObtain = Message.obtain((Handler) null, 0);
                    messageObtain.what = 18;
                    Bundle bundle = new Bundle();
                    bundle.putString("xmsf_region", yes.a(this.f35776a.getApplicationContext()).b());
                    messageObtain.setData(bundle);
                    message.replyTo.send(messageObtain);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
