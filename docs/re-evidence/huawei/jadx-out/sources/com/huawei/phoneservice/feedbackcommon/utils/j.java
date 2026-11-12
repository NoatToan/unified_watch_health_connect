package com.huawei.phoneservice.feedbackcommon.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackResponse;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f21941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FeedBackRequest f21942c;
    private List<FeedBackResponse.ProblemEnity> d;
    private WeakReference<SdkFeedBackCallback> e;

    public void b(SdkFeedBackCallback sdkFeedBackCallback) {
        if (sdkFeedBackCallback != null) {
            this.e = new WeakReference<>(sdkFeedBackCallback);
        }
        FeedBackRequest feedBackRequest = new FeedBackRequest();
        this.f21942c = feedBackRequest;
        feedBackRequest.setAccessToken(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
        this.f21942c.setProblemSourceCode(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("channel"));
        this.f21942c.setPageSize(50);
        this.f21942c.setOrderType(2);
        this.f21942c.setStartWith("");
        this.d = new ArrayList();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!com.huawei.phoneservice.faq.base.util.i.a().hadAddress()) {
            b(new ConnectException("Unable to connect to server"));
            return;
        }
        Activity activityA = a();
        if (activityA != null) {
            com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getFeedBackList(activityA, this.f21942c, new a(FeedBackResponse.class, null));
        }
    }

    private SdkFeedBackCallback c() {
        WeakReference<SdkFeedBackCallback> weakReference = this.e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<FeedBackResponse.ProblemEnity> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            FeedBackResponse.ProblemEnity problemEnity = list.get(size);
            if (problemEnity == null || TextUtils.isEmpty(problemEnity.getSrno())) {
                list.remove(size);
            }
        }
        SdkFeedBackCallback sdkFeedBackCallbackC = c();
        Activity activityA = a();
        if (sdkFeedBackCallbackC == null || activityA == null) {
            return;
        }
        try {
            activityA.runOnUiThread(new b(sdkFeedBackCallbackC, list));
        } catch (Exception e2) {
            com.huawei.phoneservice.faq.base.util.g.c("GetSrCodeDataTask", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Throwable th) {
        if (!com.huawei.phoneservice.faq.base.util.d.c(this.d)) {
            e(this.d);
            return;
        }
        SdkFeedBackCallback sdkFeedBackCallbackC = c();
        Activity activityA = a();
        if (sdkFeedBackCallbackC == null || activityA == null) {
            return;
        }
        try {
            activityA.runOnUiThread(new e(sdkFeedBackCallbackC, th));
        } catch (Exception e2) {
            com.huawei.phoneservice.faq.base.util.g.c("GetSrCodeDataTask", e2.getMessage());
        }
    }

    class a extends FaqCallback<FeedBackResponse> {

        class e extends BaseSdkUpdateRequest<FeedBackRequest> {
            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, FeedBackRequest feedBackRequest) {
                if ("accessToken".equals(str)) {
                    com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(this);
                    j.this.f21942c.setAccessToken(str3);
                    Activity activityA = j.this.a();
                    if (activityA != null) {
                        j.this.c(activityA);
                    }
                }
            }

            e(FeedBackRequest feedBackRequest) {
                super(feedBackRequest);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FeedBackResponse feedBackResponse) {
            if (th != null || feedBackResponse == null) {
                if ((th instanceof FaqWebServiceException) && ((FaqWebServiceException) th).errorCode == 401 && com.huawei.phoneservice.faq.base.util.i.a().haveSdkErr("accessToken")) {
                    com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(new e(j.this.f21942c));
                    com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
                    return;
                } else {
                    j.this.b(th);
                    return;
                }
            }
            j.this.d.addAll(feedBackResponse.getDataList());
            if (!TextUtils.isEmpty(j.this.f21942c.getStartWith()) || j.this.d.size() != 50) {
                j jVar = j.this;
                jVar.e((List<FeedBackResponse.ProblemEnity>) jVar.d);
            } else {
                j.this.f21942c.setStartWith(((FeedBackResponse.ProblemEnity) j.this.d.get(j.this.d.size() - 1)).getUpdateTime());
                j.this.e();
            }
        }

        a(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getFeedBackList(activity, this.f21942c, new c(FeedBackResponse.class, null));
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SdkFeedBackCallback f21944a;
        private final List<FeedBackResponse.ProblemEnity> d;

        @Override // java.lang.Runnable
        public void run() {
            this.f21944a.setListView(this.d);
        }

        b(SdkFeedBackCallback sdkFeedBackCallback, List<FeedBackResponse.ProblemEnity> list) {
            this.f21944a = sdkFeedBackCallback;
            this.d = list;
        }
    }

    class c extends FaqCallback<FeedBackResponse> {
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FeedBackResponse feedBackResponse) {
            if (th != null || feedBackResponse == null) {
                j.this.b(th);
                return;
            }
            j.this.d.addAll(feedBackResponse.getDataList());
            if (!TextUtils.isEmpty(j.this.f21942c.getStartWith()) || j.this.d.size() != 50) {
                j jVar = j.this;
                jVar.e((List<FeedBackResponse.ProblemEnity>) jVar.d);
            } else {
                j.this.f21942c.setStartWith(((FeedBackResponse.ProblemEnity) j.this.d.get(j.this.d.size() - 1)).getUpdateTime());
                j.this.e();
            }
        }

        c(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    static class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SdkFeedBackCallback f21946b;
        private final Throwable d;

        @Override // java.lang.Runnable
        public void run() {
            this.f21946b.setThrowableView(this.d);
        }

        e(SdkFeedBackCallback sdkFeedBackCallback, Throwable th) {
            this.f21946b = sdkFeedBackCallback;
            this.d = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a() {
        WeakReference<Activity> weakReference = this.f21941b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public j(Activity activity) {
        if (activity != null) {
            this.f21941b = new WeakReference<>(activity);
        }
    }
}
