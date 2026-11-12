package com.huawei.phoneservice.feedback.mvp.base;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.Callback;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.mvp.base.b;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackInfo;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackZipBean;
import com.huawei.phoneservice.feedbackcommon.utils.CancelInterface;
import com.huawei.phoneservice.feedbackcommon.utils.NotifyUploadFileListener;
import com.huawei.phoneservice.feedbackcommon.utils.NotifyUploadZipListener;
import com.huawei.phoneservice.feedbackcommon.utils.SubmitListener;
import com.huawei.phoneservice.feedbackcommon.utils.ZipCompressListener;
import com.huawei.phoneservice.feedbackcommon.utils.ZipUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c<V extends b> extends a implements ZipCompressListener, NotifyUploadZipListener, NotifyUploadFileListener, SubmitListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f21675c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public Handler i;
    public Context j;
    public Activity k;
    public volatile int l;
    public String m;
    protected List<FeedbackZipBean> n;
    public boolean o;
    protected V p;
    public CancelInterface q;

    protected abstract void a(boolean z);

    @Override // com.huawei.phoneservice.feedbackcommon.utils.ZipCompressListener
    public void zipCompressFinished(int i, String str, String str2) {
        this.d = i;
        this.p.b().setFlag(this.d);
        if (i != 2) {
            this.p.b().setLogsSize(0L);
            if (0 != this.f21675c) {
                a(false);
                return;
            } else {
                this.p.a(com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_FAILED);
                return;
            }
        }
        ZipUtil.setSize(0L);
        ZipUtil.getSize(new File(str).listFiles());
        this.p.b().setLogsSize(ZipUtil.getSize());
        this.p.b().setZipFileName(str2);
        if (0 == this.f21675c) {
            this.p.a(com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_SUCCESS);
            return;
        }
        Handler handler = this.i;
        if (handler != null) {
            handler.sendEmptyMessage(100);
        }
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.NotifyUploadFileListener
    public void uploadNotify(int i, int i2, String str) {
        String strA = a(i2, str);
        Handler handler = this.i;
        if (handler == null || strA == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(i, strA));
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.SubmitListener
    public void submitNotify(int i, int i2, String str) {
        String strA = a(i2, str);
        Handler handler = this.i;
        if (handler == null || strA == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(i, strA));
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.NotifyUploadZipListener
    public void notifyUploadAgain(long j) {
        com.huawei.phoneservice.feedbackcommon.utils.e.a().zipCompressAgain(this.j, j, this);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.NotifyUploadZipListener
    public void notifyUpload(List<FeedbackZipBean> list, boolean z) {
        this.n = list;
        a(z);
    }

    public void a(List<String> list) {
        FeedbackInfo feedbackInfoB;
        if (this.l != 0) {
            if (this.l == 1) {
                this.l = 2;
            }
        } else {
            if (this.f || (feedbackInfoB = this.p.b()) == null) {
                return;
            }
            this.q = com.huawei.phoneservice.feedbackcommon.utils.e.a().submitWithCancel(this.j, this.o, list, this.n, feedbackInfoB, this);
        }
    }

    public void a(String str, long j, String str2) {
        this.q = com.huawei.phoneservice.feedbackcommon.utils.e.a().uploadZipWithCancel(this.j, str, j, str2, this);
    }

    public void a(Context context, String str, Callback callback) {
        com.huawei.phoneservice.feedbackcommon.utils.c cVar = com.huawei.phoneservice.feedbackcommon.utils.c.f21899b;
        String sdk = i.d().getSdk("country");
        String sdk2 = i.d().getSdk("languageCode");
        String sdk3 = i.d().getSdk("language");
        if (TextUtils.isEmpty(str)) {
            str = i.d().getSdk("channel");
        }
        cVar.callService(context, sdk, sdk2, sdk3, str, callback);
    }

    private String a(int i, String str) {
        Context context;
        int i2;
        if (i == -1) {
            return str;
        }
        if (i == 401) {
            context = this.j;
            i2 = R.string.feedback_sdk_longtime;
        } else if (i == 405) {
            context = this.j;
            i2 = R.string.feedback_sdk_submit_repeated;
        } else if (i == 1) {
            context = this.j;
            i2 = R.string.feedback_sdk_common_server_disconnected_toast;
        } else if (i == 2) {
            context = this.j;
            i2 = R.string.feedback_sdk_image_type_error_tip;
        } else {
            if (i != 3) {
                return null;
            }
            context = this.j;
            i2 = R.string.feedback_sdk_feedback_failed;
        }
        return context.getString(i2);
    }

    public c(V v) {
        super(v);
        this.f21675c = 0L;
        this.e = false;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.l = 0;
        this.n = new ArrayList(20);
        this.o = false;
        this.p = v;
    }
}
