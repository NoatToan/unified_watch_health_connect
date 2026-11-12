package com.huawei.health.manager.util;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes2.dex */
public class DelayStartHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Intent f8136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8137b;
    private ExtendHandler d = null;

    public DelayStartHelper(Context context) {
        if (context != null) {
            this.f8137b = context;
            b();
        }
    }

    private void b() {
        this.d = HandlerCenter.b(new Handler.Callback() { // from class: com.huawei.health.manager.util.DelayStartHelper.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                LogUtil.a("Step_DelayStartHelper", "DelayStartHelper try it");
                if (message.what != 1001) {
                    return false;
                }
                if (message.arg1 >= 24 || DelayStartHelper.this.f8137b == null) {
                    DelayStartHelper.this.e();
                } else {
                    try {
                        DelayStartHelper.this.f8137b.startService(DelayStartHelper.this.f8136a);
                        DelayStartHelper.this.e();
                    } catch (IllegalStateException e) {
                        LogUtil.j("Step_DelayStartHelper", " IllegalStateException ", e.getMessage());
                        DelayStartHelper.this.a(message.arg1 + 1);
                    }
                }
                return true;
            }
        }, "delayHelper");
    }

    public void a(Intent intent) {
        if (!CommonUtil.bg() || intent == null) {
            return;
        }
        this.f8136a = intent;
        a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.d == null) {
            LogUtil.a("Step_DelayStartHelper", "tryToStartAgain mExtendHandler is null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.arg1 = i;
        this.d.sendMessage(messageObtain, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.d.quit(true);
            this.d = null;
        }
    }
}
