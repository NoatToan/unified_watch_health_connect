package com.huawei.phoneservice.feedback.mvp.presenter;

import android.app.Activity;
import android.content.Context;
import com.google.gson.Gson;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest;
import com.huawei.phoneservice.faq.base.util.VideoCallBack;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.k;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRateRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackResponse;

/* JADX INFO: loaded from: classes13.dex */
public class b extends com.huawei.phoneservice.feedback.mvp.base.a<com.huawei.phoneservice.feedback.mvp.contract.c> implements com.huawei.phoneservice.feedback.mvp.contract.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f21676c;
    protected Gson d;

    @Override // com.huawei.phoneservice.feedback.mvp.base.f
    public void a() {
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.f
    public void b() {
    }

    public void a(FeedBackRequest feedBackRequest) {
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getDataFromDetail(this.f21676c, feedBackRequest, new a(FeedBackResponse.ProblemEnity.class, (Activity) this.f21676c, feedBackRequest));
    }

    public void d(String str, VideoCallBack videoCallBack, String str2, String str3) {
        com.huawei.phoneservice.feedbackcommon.utils.e.a().downLoadFile((Activity) this.f21676c, str, videoCallBack, str2);
    }

    public void c(FeedBackRequest feedBackRequest) {
        com.huawei.phoneservice.feedbackcommon.utils.e.a().setRead(this.f21676c, feedBackRequest.getProblemId(), null);
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getFeedBackList(this.f21676c, feedBackRequest, new d(FeedBackResponse.class, (Activity) this.f21676c, feedBackRequest));
    }

    public void c(FeedBackRateRequest feedBackRateRequest, boolean z, com.huawei.phoneservice.feedback.entity.c cVar) {
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.postRate(this.f21676c, feedBackRateRequest, new e(com.huawei.phoneservice.feedback.entity.b.class, (Activity) this.f21676c, z, cVar, feedBackRateRequest));
    }

    public void d(Context context) {
        this.f21676c = context;
    }

    /* JADX INFO: loaded from: classes41.dex */
    class a extends FaqCallback<FeedBackResponse.ProblemEnity> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedBackRequest f21677c;

        class e extends BaseSdkUpdateRequest<FeedBackRequest> {

            /* JADX INFO: renamed from: com.huawei.phoneservice.feedback.mvp.presenter.b$a$e$e, reason: collision with other inner class name */
            class C0256e extends FaqCallback<FeedBackResponse.ProblemEnity> {
                @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onResult(Throwable th, FeedBackResponse.ProblemEnity problemEnity) {
                    if (th != null) {
                        ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).setThrowableView(th);
                        return;
                    }
                    b bVar = b.this;
                    if (problemEnity != null) {
                        ((com.huawei.phoneservice.feedback.mvp.contract.c) bVar.f21673a).a(problemEnity);
                    } else {
                        ((com.huawei.phoneservice.feedback.mvp.contract.c) bVar.f21673a).setErrorView(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
                    }
                }

                C0256e(Class cls, Activity activity) {
                    super(cls, activity);
                }
            }

            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, FeedBackRequest feedBackRequest) {
                if ("accessToken".equals(str)) {
                    i.a().unregisterUpdateListener(this);
                    feedBackRequest.setAccessToken(str3);
                    com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getDataFromDetail(b.this.f21676c, feedBackRequest, new C0256e(FeedBackResponse.ProblemEnity.class, (Activity) b.this.f21676c));
                }
            }

            e(FeedBackRequest feedBackRequest) {
                super(feedBackRequest);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FeedBackResponse.ProblemEnity problemEnity) {
            if (th == null) {
                if (problemEnity != null && !k.b(problemEnity.getProblemId())) {
                    ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).a(problemEnity);
                    return;
                } else {
                    ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).setErrorView(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
                    return;
                }
            }
            if (!(th instanceof FaqWebServiceException) || ((FaqWebServiceException) th).errorCode != 401 || !i.a().haveSdkErr("accessToken")) {
                ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).setThrowableView(th);
            } else {
                i.a().registerUpdateListener(new e(this.f21677c));
                i.a().onSdkErr("accessToken", com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Activity activity, FeedBackRequest feedBackRequest) {
            super(cls, activity);
            this.f21677c = feedBackRequest;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    class d extends FaqCallback<FeedBackResponse> {
        final /* synthetic */ FeedBackRequest d;

        class e extends BaseSdkUpdateRequest<FeedBackRequest> {

            /* JADX INFO: renamed from: com.huawei.phoneservice.feedback.mvp.presenter.b$d$e$b, reason: collision with other inner class name */
            class C0257b extends FaqCallback<FeedBackResponse> {
                @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onResult(Throwable th, FeedBackResponse feedBackResponse) {
                    if (th == null && feedBackResponse != null) {
                        ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).a(feedBackResponse.getDataList());
                    } else {
                        ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).d();
                    }
                }

                C0257b(Class cls, Activity activity) {
                    super(cls, activity);
                }
            }

            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, FeedBackRequest feedBackRequest) {
                if ("accessToken".equals(str)) {
                    i.a().unregisterUpdateListener(this);
                    feedBackRequest.setAccessToken(str3);
                    com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getFeedBackList(b.this.f21676c, feedBackRequest, new C0257b(FeedBackResponse.class, (Activity) b.this.f21676c));
                }
            }

            e(FeedBackRequest feedBackRequest) {
                super(feedBackRequest);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FeedBackResponse feedBackResponse) {
            if (th == null) {
                if (com.huawei.phoneservice.faq.base.util.d.c(feedBackResponse.getDataList())) {
                    ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).d();
                    return;
                } else {
                    ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).a(feedBackResponse.getDataList());
                    return;
                }
            }
            if (!(th instanceof FaqWebServiceException) || ((FaqWebServiceException) th).errorCode != 401 || !i.a().haveSdkErr("accessToken")) {
                ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).d();
            } else {
                i.a().registerUpdateListener(new e(this.d));
                i.a().onSdkErr("accessToken", com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Class cls, Activity activity, FeedBackRequest feedBackRequest) {
            super(cls, activity);
            this.d = feedBackRequest;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    class e extends FaqCallback<com.huawei.phoneservice.feedback.entity.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedBackRateRequest f21684c;
        final /* synthetic */ com.huawei.phoneservice.feedback.entity.c e;

        class a extends BaseSdkUpdateRequest<FeedBackRateRequest> {

            class d extends FaqCallback<com.huawei.phoneservice.feedback.entity.b> {
                @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResult(Throwable th, com.huawei.phoneservice.feedback.entity.b bVar) {
                    if (th != null) {
                        ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).c(e.this.e);
                        return;
                    }
                    com.huawei.phoneservice.feedback.mvp.contract.c cVar = (com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a;
                    e eVar = e.this;
                    cVar.a(eVar.f21683b, eVar.e);
                }

                d(Class cls, Activity activity) {
                    super(cls, activity);
                }
            }

            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, FeedBackRateRequest feedBackRateRequest) {
                if ("accessToken".equals(str)) {
                    i.a().unregisterUpdateListener(this);
                    feedBackRateRequest.setAccessToken(str3);
                    com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.postRate(b.this.f21676c, feedBackRateRequest, new d(com.huawei.phoneservice.feedback.entity.b.class, (Activity) b.this.f21676c));
                }
            }

            a(FeedBackRateRequest feedBackRateRequest) {
                super(feedBackRateRequest);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedback.entity.b bVar) {
            if (th == null) {
                ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).a(this.f21683b, this.e);
                return;
            }
            if (!(th instanceof FaqWebServiceException) || ((FaqWebServiceException) th).errorCode != 401 || !i.a().haveSdkErr("accessToken")) {
                ((com.huawei.phoneservice.feedback.mvp.contract.c) b.this.f21673a).c(this.e);
            } else {
                i.a().registerUpdateListener(new a(this.f21684c));
                i.a().onSdkErr("accessToken", com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Class cls, Activity activity, boolean z, com.huawei.phoneservice.feedback.entity.c cVar, FeedBackRateRequest feedBackRateRequest) {
            super(cls, activity);
            this.f21683b = z;
            this.e = cVar;
            this.f21684c = feedBackRateRequest;
        }
    }

    public b(com.huawei.phoneservice.feedback.mvp.contract.c cVar) {
        super(cVar);
        this.d = new Gson();
    }
}
