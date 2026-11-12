package com.huawei.phoneservice.feedbackcommon.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.ModuleConfigUtils;
import com.huawei.phoneservice.feedbackcommon.db.FeedbackProblemData;
import com.huawei.phoneservice.feedbackcommon.entity.ProblemEntity;
import com.huawei.phoneservice.feedbackcommon.entity.ab;
import com.huawei.phoneservice.feedbackcommon.entity.r;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<OnReadListener> f21932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f21933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<OnReadListener> f21934c;
    private boolean d;
    private String e;
    private LinkedList<ProblemEntity> g;

    public void a(OnReadListener onReadListener) {
        if (onReadListener != null) {
            this.f21934c = new WeakReference<>(onReadListener);
        }
        List<ProblemEntity> listB = null;
        if (!com.huawei.phoneservice.faq.base.util.i.a().hadAddress() || !ModuleConfigUtils.isNativeFeedback() || TextUtils.isEmpty(com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"))) {
            com.huawei.phoneservice.faq.base.util.g.c("GetUnreadTask", " ERROR");
            a((Throwable) null, 0);
            return;
        }
        if (TextUtils.isEmpty(this.e)) {
            try {
                listB = FeedbackProblemData.a(this.f21933b.get()).b();
            } catch (Exception e2) {
                com.huawei.phoneservice.faq.base.util.g.c("GetUnreadTask", e2.getMessage());
            }
            if (listB != null && !listB.isEmpty()) {
                this.g = new LinkedList<>(listB);
                a();
                return;
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        String strA = this.g.getLast().a();
        c.f21899b.setRead(this.f21933b.get(), com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"), strA, new a(ab.class, null, strA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        r rVar = new r(com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"), com.huawei.phoneservice.faq.base.util.i.d().getSdk("channel"), this.e);
        rVar.b(this.d ? 2 : 1);
        rVar.a(50);
        c.f21899b.getUnread(this.f21933b.get(), rVar, new e(com.huawei.phoneservice.feedbackcommon.entity.p.class, null));
    }

    private OnReadListener b() {
        WeakReference<OnReadListener> weakReference = this.f21932a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Throwable th, int i) {
        OnReadListener onReadListenerD = d();
        if (onReadListenerD == null && (onReadListenerD = b()) == null) {
            return;
        }
        onReadListenerD.unread(th, this.e, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        OnReadListener onReadListenerB = b();
        if (onReadListenerB != null) {
            onReadListenerB.read(null, str);
        }
    }

    class a extends FaqCallback<ab> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21935c;

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, ab abVar) {
            boolean z = th == null;
            boolean z2 = (th instanceof FaqWebServiceException) && ((FaqWebServiceException) th).errorCode == 400;
            if (z || z2) {
                try {
                    FeedbackProblemData.a((Context) f.this.f21933b.get()).d(this.f21935c);
                } catch (Exception e) {
                    com.huawei.phoneservice.faq.base.util.g.c("GetUnreadTask", e.getMessage());
                }
                f.this.a(this.f21935c);
                f.this.g.removeLast();
                if (!f.this.g.isEmpty()) {
                    f.this.a();
                    return;
                } else {
                    f.this.c();
                    return;
                }
            }
            f.this.a(th, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Activity activity, String str) {
            super(cls, activity);
            this.f21935c = str;
        }
    }

    class e extends FaqCallback<com.huawei.phoneservice.feedbackcommon.entity.p> {
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedbackcommon.entity.p pVar) {
            int i;
            if (pVar == null || pVar.a() == null) {
                i = 0;
            } else {
                i = 0;
                for (com.huawei.phoneservice.feedbackcommon.entity.p.e eVar : pVar.a()) {
                    if (eVar != null && !eVar.d() && f.this.d == eVar.a()) {
                        i++;
                    }
                }
            }
            f.this.a(th, i > 0 ? 1 : 0);
        }

        e(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    private OnReadListener d() {
        WeakReference<OnReadListener> weakReference = this.f21934c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public f(Context context, String str, boolean z, OnReadListener onReadListener) {
        this.e = str;
        this.d = z;
        this.f21933b = new WeakReference<>(context);
        if (onReadListener != null) {
            this.f21932a = new WeakReference<>(onReadListener);
        }
    }
}
