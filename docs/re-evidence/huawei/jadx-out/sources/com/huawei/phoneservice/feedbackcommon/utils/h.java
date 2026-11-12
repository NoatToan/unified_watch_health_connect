package com.huawei.phoneservice.feedbackcommon.utils;

import android.app.Activity;
import android.content.Context;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<OnDeleteHistoryListener> f21936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21937b;
    private final Context e;

    public void e(OnDeleteHistoryListener onDeleteHistoryListener) {
        if (onDeleteHistoryListener != null) {
            this.f21936a = new WeakReference<>(onDeleteHistoryListener);
        }
        com.huawei.phoneservice.feedbackcommon.entity.e eVar = new com.huawei.phoneservice.feedbackcommon.entity.e();
        eVar.e(com.huawei.phoneservice.faq.base.util.i.d().getSdk("channel"));
        eVar.a(com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f21937b);
        eVar.c(arrayList);
        d(eVar);
    }

    private void c(com.huawei.phoneservice.feedbackcommon.entity.e eVar) {
        if (eVar == null) {
            return;
        }
        com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(new a(eVar));
        com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (c() != null) {
            c().deleteLocalData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.huawei.phoneservice.feedbackcommon.entity.e eVar) {
        Context context = this.e;
        if (context == null || eVar == null) {
            return;
        }
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.deleteHistory(context, eVar, new e(com.huawei.phoneservice.feedbackcommon.entity.b.class, (Activity) this.e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (c() != null) {
            c().showErrorToast();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Throwable th, com.huawei.phoneservice.feedbackcommon.entity.e eVar) {
        if ((th instanceof FaqWebServiceException) && ((FaqWebServiceException) th).errorCode == 401 && com.huawei.phoneservice.faq.base.util.i.a().haveSdkErr("accessToken")) {
            c(eVar);
        } else {
            b();
        }
    }

    class a extends BaseSdkUpdateRequest<com.huawei.phoneservice.feedbackcommon.entity.e> {
        @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCallback(String str, String str2, String str3, com.huawei.phoneservice.feedbackcommon.entity.e eVar) {
            if (!"accessToken".equals(str) || eVar == null) {
                return;
            }
            com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(this);
            eVar.a(str3);
            h.this.b(eVar);
        }

        a(com.huawei.phoneservice.feedbackcommon.entity.e eVar) {
            super(eVar);
        }
    }

    class c extends FaqCallback<com.huawei.phoneservice.feedbackcommon.entity.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.phoneservice.feedbackcommon.entity.e f21940b;

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedbackcommon.entity.b bVar) {
            if (th != null) {
                h.this.e(th, this.f21940b);
            } else {
                h.this.a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Class cls, Activity activity, com.huawei.phoneservice.feedbackcommon.entity.e eVar) {
            super(cls, activity);
            this.f21940b = eVar;
        }
    }

    class e extends FaqCallback<com.huawei.phoneservice.feedbackcommon.entity.b> {
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedbackcommon.entity.b bVar) {
            if (th != null) {
                h.this.b();
            } else {
                h.this.a();
            }
        }

        e(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    private void d(com.huawei.phoneservice.feedbackcommon.entity.e eVar) {
        Context context = this.e;
        if (context == null || eVar == null) {
            return;
        }
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.deleteHistory(context, eVar, new c(com.huawei.phoneservice.feedbackcommon.entity.b.class, (Activity) this.e, eVar));
    }

    private OnDeleteHistoryListener c() {
        WeakReference<OnDeleteHistoryListener> weakReference = this.f21936a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public h(Context context, String str) {
        this.e = context;
        this.f21937b = str;
    }
}
