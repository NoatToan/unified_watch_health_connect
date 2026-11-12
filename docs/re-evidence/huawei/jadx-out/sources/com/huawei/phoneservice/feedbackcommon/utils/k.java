package com.huawei.phoneservice.feedbackcommon.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FeedBackResponse.ProblemEnity> f21949c = new ArrayList();
    private int d;
    private WeakReference<OnHistoryListener> e;
    private String h;
    private int j;

    public void d(OnHistoryListener onHistoryListener) {
        if (onHistoryListener != null) {
            this.e = new WeakReference<>(onHistoryListener);
        }
        FeedBackRequest feedBackRequest = new FeedBackRequest();
        feedBackRequest.setAccessToken(e.f().getSdk("accessToken"));
        feedBackRequest.setProblemId(this.h);
        feedBackRequest.setStartWith(this.f21948b);
        feedBackRequest.setPageSize(this.d);
        feedBackRequest.setProblemSourceCode(e.f().getSdk("channel"));
        feedBackRequest.setOrderType(this.j);
        d(feedBackRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<FeedBackResponse.ProblemEnity> list, List<FeedBackResponse.ProblemEnity> list2) {
        OnHistoryListener onHistoryListenerC = c();
        if (onHistoryListenerC != null) {
            onHistoryListenerC.showData(list, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Throwable th) {
        OnHistoryListener onHistoryListenerC = c();
        if (onHistoryListenerC != null) {
            onHistoryListenerC.setThrowableView(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[PHI: r4
      0x0065: PHI (r4v2 java.util.ArrayList) = (r4v1 java.util.ArrayList), (r4v5 java.util.ArrayList) binds: [B:22:0x0063, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    public void d(FeedBackResponse feedBackResponse, String str, FeedBackRequest feedBackRequest) {
        ArrayList arrayList;
        List<FeedBackResponse.ProblemEnity> listE = e(feedBackResponse.getDataList());
        if (com.huawei.phoneservice.faq.base.util.d.c(listE)) {
            if (!com.huawei.phoneservice.faq.base.util.d.c(listE) || TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f21948b)) {
                    e(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
                    return;
                } else {
                    feedBackRequest.setStartWith(this.f21948b);
                    d(feedBackRequest);
                    return;
                }
            }
            arrayList = new ArrayList();
            if (!com.huawei.phoneservice.faq.base.util.d.c(this.f21949c)) {
                arrayList.addAll(this.f21949c);
            }
        } else if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f21948b) && feedBackResponse.getDataList().size() == 50 && listE.size() < this.d) {
            this.f21949c.addAll(listE);
            feedBackRequest.setStartWith(this.f21948b);
            d(feedBackRequest);
            return;
        } else {
            arrayList = new ArrayList();
            if (!com.huawei.phoneservice.faq.base.util.d.c(this.f21949c)) {
                arrayList.addAll(this.f21949c);
            }
        }
        arrayList.addAll(listE);
        d(feedBackResponse.getDataList(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(FeedBackRequest feedBackRequest, String str) {
        c cVar = c.f21899b;
        Context context = this.f21947a;
        cVar.getFeedBackList((Activity) context, feedBackRequest, new d(FeedBackResponse.class, (Activity) context, str, feedBackRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FeedBackRequest feedBackRequest) {
        c.f21899b.getFeedBackList((Activity) this.f21947a, feedBackRequest, new b(FeedBackResponse.class, (Activity) this.f21947a, feedBackRequest.getStartWith(), feedBackRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(FaqConstants.FaqErrorCode faqErrorCode) {
        OnHistoryListener onHistoryListenerC = c();
        if (onHistoryListenerC != null) {
            onHistoryListenerC.setErrorView(faqErrorCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FeedBackResponse.ProblemEnity> e(List<FeedBackResponse.ProblemEnity> list) {
        ArrayList arrayList = new ArrayList();
        if (!com.huawei.phoneservice.faq.base.util.d.c(list)) {
            this.f21948b = list.get(list.size() - 1).getProblemId();
            for (FeedBackResponse.ProblemEnity problemEnity : list) {
                if (TextUtils.isEmpty(problemEnity.getSrno())) {
                    arrayList.add(problemEnity);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: loaded from: classes41.dex */
    class b extends FaqCallback<FeedBackResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FeedBackRequest f21950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21951b;

        class d extends BaseSdkUpdateRequest<FeedBackRequest> {
            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, FeedBackRequest feedBackRequest) {
                if ("accessToken".equals(str)) {
                    com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(this);
                    feedBackRequest.setAccessToken(str3);
                    b bVar = b.this;
                    k.this.b(feedBackRequest, bVar.f21951b);
                }
            }

            d(FeedBackRequest feedBackRequest) {
                super(feedBackRequest);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FeedBackResponse feedBackResponse) {
            if (th == null) {
                k.this.d(feedBackResponse, this.f21951b, this.f21950a);
            } else if ((th instanceof FaqWebServiceException) && ((FaqWebServiceException) th).errorCode == 401 && com.huawei.phoneservice.faq.base.util.i.a().haveSdkErr("accessToken")) {
                com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(new d(this.f21950a));
                com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", e.f().getSdk("accessToken"));
            } else {
                k.this.a(th);
            }
            if (!com.huawei.phoneservice.faq.base.util.d.c(k.this.f21949c) || TextUtils.isEmpty(this.f21951b)) {
                return;
            }
            k.this.f21949c.clear();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls, Activity activity, String str, FeedBackRequest feedBackRequest) {
            super(cls, activity);
            this.f21951b = str;
            this.f21950a = feedBackRequest;
        }
    }

    class d extends FaqCallback<FeedBackResponse> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedBackRequest f21953c;
        final /* synthetic */ String d;

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FeedBackResponse feedBackResponse) {
            if (th != null) {
                k.this.a(th);
                return;
            }
            List listE = k.this.e(feedBackResponse.getDataList());
            if (!com.huawei.phoneservice.faq.base.util.d.c(listE)) {
                k.this.d(feedBackResponse.getDataList(), (List<FeedBackResponse.ProblemEnity>) listE);
            } else if (TextUtils.isEmpty(this.d)) {
                this.f21953c.setStartWith(k.this.f21948b);
                k.this.d(this.f21953c);
            } else {
                k.this.e(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Class cls, Activity activity, String str, FeedBackRequest feedBackRequest) {
            super(cls, activity);
            this.d = str;
            this.f21953c = feedBackRequest;
        }
    }

    private OnHistoryListener c() {
        WeakReference<OnHistoryListener> weakReference = this.e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public k(Context context, String str, int i, String str2, int i2) {
        this.f21947a = context;
        this.d = i;
        this.f21948b = str2;
        this.h = str;
        this.j = i2;
    }
}
