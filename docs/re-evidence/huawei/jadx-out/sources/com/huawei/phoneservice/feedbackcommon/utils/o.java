package com.huawei.phoneservice.feedbackcommon.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.feedbackcommon.db.FeedbackProblemData;
import com.huawei.phoneservice.feedbackcommon.entity.ProblemEntity;
import com.huawei.phoneservice.feedbackcommon.entity.ab;
import java.lang.ref.WeakReference;
import java.net.ConnectException;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<OnReadListener> f21963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f21964c;
    private String d;
    private WeakReference<OnReadListener> e;

    public void a(OnReadListener onReadListener) {
        if (onReadListener != null) {
            this.f21963b = new WeakReference<>(onReadListener);
        }
        if (TextUtils.isEmpty(this.d)) {
            c(new Throwable("problemId is Empty"));
        } else if (com.huawei.phoneservice.faq.base.util.i.a().hadAddress()) {
            d();
        } else {
            c(new ConnectException("Unable to connect to server"));
            FeedbackProblemData.a(this.f21964c.get()).c(new ProblemEntity(this.d));
        }
    }

    private void d() {
        c.f21899b.setRead(this.f21964c.get(), com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"), this.d, new a(ab.class, null));
    }

    private OnReadListener b() {
        WeakReference<OnReadListener> weakReference = this.e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Throwable th) {
        OnReadListener onReadListenerC = c();
        if (onReadListenerC == null && (onReadListenerC = b()) == null) {
            return;
        }
        onReadListenerC.read(th, this.d);
    }

    class a extends FaqCallback<ab> {
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, ab abVar) {
            boolean z = false;
            boolean z2 = th == null;
            if ((th instanceof FaqWebServiceException) && ((FaqWebServiceException) th).errorCode == 400) {
                z = true;
            }
            if (z2 || z) {
                FeedbackProblemData.a((Context) o.this.f21964c.get()).d(o.this.d);
                o.this.c((Throwable) null);
            } else {
                FeedbackProblemData.a((Context) o.this.f21964c.get()).c(new ProblemEntity(o.this.d));
                o.this.c(th);
            }
        }

        a(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    private OnReadListener c() {
        WeakReference<OnReadListener> weakReference = this.f21963b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public o(Context context, String str, OnReadListener onReadListener) {
        this.d = str;
        this.f21964c = new WeakReference<>(context);
        if (onReadListener != null) {
            this.e = new WeakReference<>(onReadListener);
        }
    }
}
