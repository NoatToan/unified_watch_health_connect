package defpackage;

import com.huawei.featureuserprofile.award.model.SaveInfoItem;
import com.huawei.featureuserprofile.award.presenter.WriteDeliveryInfoContract;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.networkclient.IRequest;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class cve implements WriteDeliveryInfoContract.Presenter {
    private WriteDeliveryInfoContract.View e;

    public cve(WriteDeliveryInfoContract.View view) {
        this.e = view;
    }

    @Override // com.huawei.featureuserprofile.award.presenter.WriteDeliveryInfoContract.Presenter
    public void saveInfo(int i, SaveInfoItem saveInfoItem, String str, int i2) {
        cvi.c cVar = new cvi.c();
        cVar.b(i);
        a(cVar, saveInfoItem, str);
        a(cVar, saveInfoItem, i);
        e(cVar.d());
    }

    /* JADX INFO: renamed from: cve$4, reason: invalid class name */
    class AnonymousClass4 implements ResultCallback<String> {
        AnonymousClass4() {
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final String str) {
            HandlerExecutor.c(new Runnable() { // from class: cvd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31400b.b(str);
                }
            });
        }

        /* synthetic */ void b(String str) {
            if (cve.this.e != null) {
                cve.this.e.onModifyDataSuccess(str);
            }
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(final Throwable th) {
            LogUtil.d("WriteDeliveryInfoPresenter", "ACHIEVEMENT HttpRequest onFailure() error: ", th.getMessage());
            HandlerExecutor.c(new Runnable() { // from class: cvf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31403a.a(th);
                }
            });
        }

        /* synthetic */ void a(Throwable th) {
            cve.this.e.onModifyDataFailed(th.getMessage());
        }
    }

    private void e(final cvi cviVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cvh
            @Override // java.lang.Runnable
            public final void run() {
                this.f31404a.b(cviVar);
            }
        });
    }

    /* synthetic */ void b(cvi cviVar) {
        a(cviVar, new AnonymousClass4());
    }

    private void a(cvi.c cVar, SaveInfoItem saveInfoItem, String str) {
        cVar.h(saveInfoItem.getName());
        cVar.i(saveInfoItem.getTelephone());
        cVar.f(saveInfoItem.getAddress());
        cVar.j(saveInfoItem.getRemark());
        cVar.g(str);
    }

    private void a(cvi.c cVar, SaveInfoItem saveInfoItem, int i) {
        if (i == 1 || i == 20001) {
            cVar.b(saveInfoItem.getActivityId()).c(saveInfoItem.getAwardRecordId());
        } else if (i == 20002) {
            cVar.a(saveInfoItem.getActivityId()).e(saveInfoItem.getAwardRecordId()).d("1");
        } else {
            LogUtil.e("WriteDeliveryInfoPresenter", "the source is error,current don't support");
        }
    }

    private void a(IRequest iRequest, final ResultCallback<String> resultCallback) {
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.b());
        oet.d().c(iRequest.getUrl(), activityInfoListFactory.getHeaders(), ofe.c(activityInfoListFactory.getBody(iRequest)), String.class, new ResultCallback<String>() { // from class: cve.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                if (str == null) {
                    resultCallback.onFailure(new NullPointerException("the NetWork response is null"));
                }
                resultCallback.onSuccess(str);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        });
    }
}
