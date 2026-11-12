package com.huawei.phoneservice.feedback.mvp.presenter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.phoneservice.faq.base.util.FaqHandler;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.mvp.contract.f;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.phoneservice.feedbackcommon.utils.CancelInterface;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class d extends com.huawei.phoneservice.feedback.mvp.base.d<f> implements FaqHandler.CallBack {
    @Override // com.huawei.phoneservice.faq.base.util.FaqHandler.CallBack
    public void handleMessage(int i, Message message) {
        if (i == 6) {
            this.l = 0;
            this.m = null;
            String str = (String) message.obj;
            ((f) this.r).a();
            ((f) this.r).a(str);
            this.e = false;
            return;
        }
        if (i != 7) {
            if (i != 100) {
                return;
            }
            this.q = com.huawei.phoneservice.feedbackcommon.utils.e.a().reUploadZipWithCancel(this.j, this.f21674b, ((f) this.r).c().getLogsSize(), ((f) this.r).c().getZipFileName(), this);
            return;
        }
        String str2 = (String) message.obj;
        if (this.l != 0) {
            this.l = 3;
            this.m = str2;
            return;
        }
        this.l = 0;
        this.m = null;
        ((f) this.r).a();
        ((f) this.r).c(str2);
        this.e = false;
        if (com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener() != null) {
            com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener().onSubmitResult(-1, null, ((f) this.r).c().getProblemId(), ((f) this.r).c().getSrCode(), str2);
        }
    }

    public void i() {
        com.huawei.phoneservice.feedbackcommon.utils.e.a().zipCompress(this.j, this);
    }

    public void f() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CancelInterface cancelInterface = this.q;
        if (cancelInterface != null) {
            cancelInterface.isCancel(true);
        }
        this.e = false;
        this.f = true;
        ((f) this.r).a();
        if (com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener() != null) {
            com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener().onSubmitResult(-1, null, ((f) this.r).c().getProblemId(), ((f) this.r).c().getSrCode(), "");
        }
        this.l = 0;
        CancelInterface cancelInterface2 = this.q;
        if (cancelInterface2 != null) {
            cancelInterface2.isCancel(false);
        }
    }

    public void d() {
        if (this.l == 1) {
            this.l = 0;
            return;
        }
        if (this.l == 2) {
            this.l = 0;
            a((List<String>) null);
        } else {
            if (this.l != 3 || TextUtils.isEmpty(this.m)) {
                return;
            }
            this.l = 0;
            Handler handler = this.i;
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(7, this.m));
            }
        }
    }

    public void e() {
        if (this.l == 0) {
            this.l = 1;
        }
    }

    public boolean c() {
        return !this.e;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.f
    public void b() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.i = null;
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.c
    public void a(boolean z) {
        this.o = z;
        if (z) {
            a((List<String>) null);
            return;
        }
        Handler handler = this.i;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(7, this.j.getString(R.string.feedback_sdk_feedback_failed)));
        }
    }

    public void c(Context context, boolean z) {
        ((f) this.r).e();
        this.e = true;
        this.f = false;
        this.l = 0;
        this.d = ((f) this.r).c().getFlag();
        this.f21674b = FeedbackWebConstants.getZipFilePath(context);
        if (!z || this.d != 2) {
            a((List<String>) null);
            return;
        }
        File file = new File(this.f21674b + File.separator + ((f) this.r).c().getZipFileName() + ".zip");
        a(this.f21674b, file.length(), file.getName());
    }

    public void c(int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.f
    public void a() {
        this.i = new FaqHandler(this);
    }

    public d(f fVar, Context context) {
        super(fVar);
        this.j = context;
    }
}
