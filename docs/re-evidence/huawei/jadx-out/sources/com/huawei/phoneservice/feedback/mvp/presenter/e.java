package com.huawei.phoneservice.feedback.mvp.presenter;

import android.content.Context;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackResponse;
import com.huawei.phoneservice.feedbackcommon.utils.OnDeleteHistoryListener;
import com.huawei.phoneservice.feedbackcommon.utils.OnHistoryListener;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e extends com.huawei.phoneservice.feedback.mvp.base.a<com.huawei.phoneservice.feedback.mvp.contract.e> implements com.huawei.phoneservice.feedback.mvp.contract.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnHistoryListener f21690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f21691c;
    private final OnDeleteHistoryListener e;

    @Override // com.huawei.phoneservice.feedback.mvp.base.f
    public void a() {
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.f
    public void b() {
    }

    public void e(String str) {
        com.huawei.phoneservice.feedbackcommon.utils.e.a().deleteHistory(this.f21691c, str, this.e);
    }

    public void c(FeedBackRequest feedBackRequest) {
        com.huawei.phoneservice.feedbackcommon.utils.e.a().getFeedBackList(this.f21691c, feedBackRequest.getProblemId(), feedBackRequest.getPageSize(), feedBackRequest.getStartWith(), feedBackRequest.getOrderType(), this.f21690b);
    }

    public void b(Context context) {
        this.f21691c = context;
    }

    class a implements OnHistoryListener {
        @Override // com.huawei.phoneservice.feedbackcommon.utils.OnHistoryListener
        public void showData(List<FeedBackResponse.ProblemEnity> list, List<FeedBackResponse.ProblemEnity> list2) {
            ((com.huawei.phoneservice.feedback.mvp.contract.e) e.this.f21673a).a(list, list2);
        }

        @Override // com.huawei.phoneservice.feedbackcommon.utils.OnHistoryListener
        public void setThrowableView(Throwable th) {
            ((com.huawei.phoneservice.feedback.mvp.contract.e) e.this.f21673a).setThrowableView(th);
        }

        @Override // com.huawei.phoneservice.feedbackcommon.utils.OnHistoryListener
        public void setErrorView(FaqConstants.FaqErrorCode faqErrorCode) {
            ((com.huawei.phoneservice.feedback.mvp.contract.e) e.this.f21673a).setErrorView(faqErrorCode);
        }

        a() {
        }
    }

    class b implements OnDeleteHistoryListener {
        @Override // com.huawei.phoneservice.feedbackcommon.utils.OnDeleteHistoryListener
        public void showErrorToast() {
            if (e.this.f21673a == null) {
                return;
            }
            ((com.huawei.phoneservice.feedback.mvp.contract.e) e.this.f21673a).showErrorToast();
        }

        @Override // com.huawei.phoneservice.feedbackcommon.utils.OnDeleteHistoryListener
        public void deleteLocalData() {
            if (e.this.f21673a == null) {
                return;
            }
            ((com.huawei.phoneservice.feedback.mvp.contract.e) e.this.f21673a).deleteLocalData();
        }

        b() {
        }
    }

    public e(com.huawei.phoneservice.feedback.mvp.contract.e eVar) {
        super(eVar);
        this.f21690b = new a();
        this.e = new b();
    }
}
