package com.huawei.phoneservice.feedbackcommon.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackInfo;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackZipBean;
import com.huawei.phoneservice.feedbackcommon.entity.ac;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class n extends com.huawei.phoneservice.feedbackcommon.utils.d {
    private FeedbackInfo h;
    private WeakReference<SubmitListener> i;
    private List<String> j;

    protected void e() {
        if (this.h == null) {
            return;
        }
        ac acVar = new ac();
        acVar.i(this.h.getProblemId());
        acVar.l(com.huawei.phoneservice.faq.base.util.i.d().getSdk("channel"));
        acVar.b(com.huawei.phoneservice.faq.base.util.i.d().getSdk("country"));
        acVar.j(com.huawei.phoneservice.faq.base.util.i.d().getSdk("languageCode"));
        acVar.d(com.huawei.phoneservice.faq.base.util.i.d().getSdk("language"));
        acVar.m(this.h.getProblemDesc());
        acVar.e(this.h.getContact());
        List<String> list = this.j;
        if (list != null) {
            acVar.e(list);
        }
        acVar.n(com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SHASN));
        acVar.f(com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_EMUIVERSION));
        acVar.a(com.huawei.phoneservice.faq.base.util.i.d().getSdk("appVersion"));
        acVar.g(com.huawei.phoneservice.faq.base.util.i.d().getSdk("model"));
        acVar.c(com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"));
        String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SOFT_VERSION);
        if (!TextUtils.isEmpty(sdk)) {
            acVar.o(sdk);
        }
        if (!TextUtils.isEmpty(this.h.getSrCode())) {
            acVar.p(this.h.getSrCode());
        }
        acVar.k(this.h.getProblemType());
        if (!TextUtils.isEmpty(String.valueOf(this.h.getAssociatedId()))) {
            acVar.b(Long.valueOf(this.h.getAssociatedId()));
            acVar.s(this.h.getUniqueCode());
        }
        if (this.d) {
            acVar.h(this.h.getZipFileName() + ".zip");
            acVar.d(this.f);
        }
        if ("Y".equals(com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_IS_DEEPLICK))) {
            b(acVar);
        } else {
            c(acVar);
        }
    }

    public void c(SubmitListener submitListener) {
        if (submitListener != null) {
            this.i = new WeakReference<>(submitListener);
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ac acVar) {
        b(com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.callFeedBackService(this.e, acVar, new c(com.huawei.phoneservice.feedbackcommon.entity.f.class, null)));
    }

    private void b(ac acVar) {
        Submit submitUpdateFeedBackInfo = com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.updateFeedBackInfo(this.e, acVar, new d(com.huawei.phoneservice.feedbackcommon.entity.f.class, null, acVar));
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21900a = new WeakReference<>(submitUpdateFeedBackInfo);
    }

    private void c(ac acVar) {
        Submit submitCallFeedBackService = com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.callFeedBackService(this.e, acVar, new e(com.huawei.phoneservice.feedbackcommon.entity.f.class, null, acVar));
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21900a = new WeakReference<>(submitCallFeedBackService);
    }

    private SubmitListener b() {
        WeakReference<SubmitListener> weakReference = this.i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ac acVar) {
        Submit submitCallFeedBackService = com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.callFeedBackService(this.e, acVar, new b(com.huawei.phoneservice.feedbackcommon.entity.f.class, null));
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21900a = new WeakReference<>(submitCallFeedBackService);
    }

    /* JADX INFO: loaded from: classes41.dex */
    class d extends FaqCallback<com.huawei.phoneservice.feedbackcommon.entity.f> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ac f21959b;

        class c extends BaseSdkUpdateRequest<ac> {
            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, ac acVar) {
                if ("accessToken".equals(str)) {
                    com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(this);
                    WeakReference<BaseSdkUpdateRequest> weakReference = n.this.f21902c;
                    if (weakReference != null) {
                        weakReference.clear();
                        n.this.f21902c = null;
                    }
                    acVar.c(str3);
                    n.this.d(acVar);
                }
            }

            c(ac acVar) {
                super(acVar);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedbackcommon.entity.f fVar) {
            if (th == null && fVar != null) {
                n.this.e(6, -1, fVar.e);
                return;
            }
            boolean z = th instanceof FaqWebServiceException;
            if (!z || ((FaqWebServiceException) th).errorCode != 401 || !com.huawei.phoneservice.faq.base.util.i.a().haveSdkErr("accessToken")) {
                if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException)) {
                    n.this.e(7, 1, null);
                    return;
                } else {
                    if (z) {
                        n.this.d((FaqWebServiceException) th);
                        return;
                    }
                    return;
                }
            }
            c cVar = new c(this.f21959b);
            WeakReference<BaseSdkUpdateRequest> weakReference = n.this.f21902c;
            if (weakReference != null) {
                weakReference.clear();
            }
            n.this.f21902c = new WeakReference<>(cVar);
            com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(cVar);
            com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Class cls, Activity activity, ac acVar) {
            super(cls, activity);
            this.f21959b = acVar;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    class e extends FaqCallback<com.huawei.phoneservice.feedbackcommon.entity.f> {
        final /* synthetic */ ac d;

        class c extends BaseSdkUpdateRequest<ac> {
            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, ac acVar) {
                if ("accessToken".equals(str)) {
                    com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(this);
                    WeakReference<BaseSdkUpdateRequest> weakReference = n.this.f21902c;
                    if (weakReference != null) {
                        weakReference.clear();
                        n.this.f21902c = null;
                    }
                    acVar.c(str3);
                    n.this.a(acVar);
                }
            }

            c(ac acVar) {
                super(acVar);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedbackcommon.entity.f fVar) {
            if (th == null && fVar != null) {
                ZipUtil.deleteFile(new File(FeedbackWebConstants.getZipFilePath(n.this.e)));
                n.this.e(6, -1, fVar.e);
                return;
            }
            boolean z = th instanceof FaqWebServiceException;
            if (z && ((FaqWebServiceException) th).errorCode == 401 && com.huawei.phoneservice.faq.base.util.i.a().haveSdkErr("accessToken")) {
                c cVar = new c(this.d);
                WeakReference<BaseSdkUpdateRequest> weakReference = n.this.f21902c;
                if (weakReference != null) {
                    weakReference.clear();
                }
                n.this.f21902c = new WeakReference<>(cVar);
                com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(cVar);
                com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"));
                return;
            }
            if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException)) {
                n.this.e(7, 1, null);
            } else if (z) {
                n.this.d((FaqWebServiceException) th);
            } else {
                n.this.d((FaqWebServiceException) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Class cls, Activity activity, ac acVar) {
            super(cls, activity);
            this.d = acVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FaqWebServiceException faqWebServiceException) {
        int i;
        if (faqWebServiceException == null || !"Y".equals(com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_IS_DEEPLICK)) || ((i = faqWebServiceException.errorCode) != 401 && i != 405)) {
            i = 3;
        }
        e(7, i, null);
    }

    class b extends FaqCallback<com.huawei.phoneservice.feedbackcommon.entity.f> {
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedbackcommon.entity.f fVar) {
            if (th == null && fVar != null) {
                n.this.e(6, -1, fVar.e);
                return;
            }
            if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException)) {
                n.this.e(7, 1, null);
            } else if (th instanceof FaqWebServiceException) {
                n.this.d((FaqWebServiceException) th);
            }
        }

        b(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    class c extends FaqCallback<com.huawei.phoneservice.feedbackcommon.entity.f> {
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedbackcommon.entity.f fVar) {
            if (th == null && fVar != null) {
                ZipUtil.deleteFile(new File(FeedbackWebConstants.getZipFilePath(n.this.e)));
                n.this.e(6, -1, fVar.e);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException)) {
                n.this.e(7, 1, null);
            } else if (th instanceof FaqWebServiceException) {
                n.this.d((FaqWebServiceException) th);
            }
        }

        c(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    private void b(Submit submit) {
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21900a = new WeakReference<>(submit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2, String str) {
        SubmitListener submitListenerB = b();
        if (submitListenerB != null) {
            submitListenerB.submitNotify(i, i2, str);
        }
    }

    public n(Context context, boolean z, List<String> list, List<FeedbackZipBean> list2, FeedbackInfo feedbackInfo) {
        this.e = context;
        this.j = list;
        this.h = feedbackInfo;
        this.d = z;
        this.f = list2;
    }
}
