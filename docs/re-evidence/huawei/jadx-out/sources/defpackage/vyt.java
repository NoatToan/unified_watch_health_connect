package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.main.stories.oa.goodthingsrecommended.api.GoodThingsRecommendedApi;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class vyt implements GoodThingsRecommendedApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f51708a = new Handler(Looper.getMainLooper());

    @Override // com.huawei.ui.main.stories.oa.goodthingsrecommended.api.GoodThingsRecommendedApi
    public void getShoppingInfoList(vyv vyvVar, final UiCallback<vyw> uiCallback) {
        LogUtil.a("GoodThingsRecommendedImpl", "getShoppingInfoList: Request Received, processing.....");
        vyq.a().e(vyvVar, new ResultCallback<vyw>() { // from class: vyt.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(vyw vywVar) {
                LogUtil.a("GoodThingsRecommendedImpl", "getShoppingInfoList: onSuccess . ", vywVar.getResultCode());
                uiCallback.onSuccess(vyt.this.f51708a, vywVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(-1, th.getMessage());
            }
        });
    }
}
