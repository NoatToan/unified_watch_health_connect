package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qzf extends Handler {
    private int e = 0;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == 1) {
            ReleaseLogUtil.d("Dfx_AppEventDeleteHandler", "handleMessage DELETE_APP_EVENT_MESSAGE_FIRST");
            removeMessages(1);
            sendEmptyMessageDelayed(2, 180000L);
            return;
        }
        if (i == 2) {
            int i2 = this.e + 1;
            this.e = i2;
            ReleaseLogUtil.d("Dfx_AppEventDeleteHandler", "handleMessage DELETE_APP_EVENT_MESSAGE count: ", Integer.valueOf(i2));
            if (!cpj.c(BaseApplication.b(), "ProblemSuggestActivity")) {
                ReleaseLogUtil.d("Dfx_AppEventDeleteHandler", "handleMessage not isTopActivity");
                d();
                return;
            }
            ReleaseLogUtil.d("Dfx_AppEventDeleteHandler", "handleMessage isTopActivity");
            if (this.e == 3) {
                d();
                return;
            } else {
                sendEmptyMessageDelayed(2, 180000L);
                return;
            }
        }
        LogUtil.c("AppEventDeleteHandler", "handleMessage default");
    }

    private void d() {
        ReleaseLogUtil.d("Dfx_AppEventDeleteHandler", "handleMessage deleteDeal");
        removeMessages(2);
        cpj.b();
        this.e = 0;
    }
}
