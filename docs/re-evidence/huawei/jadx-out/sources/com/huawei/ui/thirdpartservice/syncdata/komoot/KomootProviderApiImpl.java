package com.huawei.ui.thirdpartservice.syncdata.komoot;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.thirdpartservice.OauthStatusCallback;
import com.huawei.thirdpartservice.komootapi.KomootProviderApi;
import com.huawei.ui.thirdpartservice.activity.komoot.KomootConnectActivity;
import com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback;
import com.huawei.ui.thirdpartservice.syncdata.net.SyncDataToKomootApi;
import defpackage.oet;
import defpackage.xbp;
import defpackage.xbv;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = KomootProviderApi.class)
public class KomootProviderApiImpl implements KomootProviderApi {

    public interface DataTaskAction {
        void doAction(xbv xbvVar, xbp xbpVar, ResultCallback<String> resultCallback);
    }

    @Override // com.huawei.thirdpartservice.komootapi.KomootProviderApi
    public void performOauth(Context context) {
        context.startActivity(new Intent(context, (Class<?>) KomootConnectActivity.class));
    }

    @Override // com.huawei.thirdpartservice.komootapi.KomootProviderApi
    public void isOauth(final OauthStatusCallback oauthStatusCallback) {
        xbp.b().checkConnectStatus(new RefreshTokenCallback() { // from class: xbx
            @Override // com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback
            public final void refreshResult(boolean z, boolean z2) {
                oauthStatusCallback.onOauthStatusCallback(z && z2);
            }
        });
    }

    @Override // com.huawei.thirdpartservice.komootapi.KomootProviderApi
    public void getRoadList(final String str, final int i, ResultCallback<String> resultCallback) {
        b(resultCallback, new DataTaskAction() { // from class: xbr
            @Override // com.huawei.ui.thirdpartservice.syncdata.komoot.KomootProviderApiImpl.DataTaskAction
            public final void doAction(xbv xbvVar, xbp xbpVar, ResultCallback resultCallback2) {
                xbvVar.e(xbpVar.getOpenId(), str, i, resultCallback2);
            }
        });
    }

    private void b(final ResultCallback<String> resultCallback, DataTaskAction dataTaskAction) {
        final xbp xbpVarB = xbp.b();
        final d dVar = new d();
        ResultCallback<String> resultCallback2 = new ResultCallback<String>(this) { // from class: com.huawei.ui.thirdpartservice.syncdata.komoot.KomootProviderApiImpl.5
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(Response<String> response) {
                if (response.getCode() == 401) {
                    xbpVarB.refreshAccessToken(dVar);
                } else {
                    resultCallback.onResponse(response);
                }
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        };
        dVar.a(dataTaskAction);
        dVar.d(xbpVarB);
        dVar.a(resultCallback2);
        xbpVarB.checkConnectStatus(dVar);
    }

    @Override // com.huawei.thirdpartservice.komootapi.KomootProviderApi
    public void getRoad(final String str, ResultCallback<String> resultCallback) {
        b(resultCallback, new DataTaskAction() { // from class: xbt
            @Override // com.huawei.ui.thirdpartservice.syncdata.komoot.KomootProviderApiImpl.DataTaskAction
            public final void doAction(xbv xbvVar, xbp xbpVar, ResultCallback resultCallback2) {
                xbvVar.d(str, resultCallback2);
            }
        });
    }

    static class d implements RefreshTokenCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DataTaskAction f29171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private xbp f29172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private xbv f29173c = new xbv((SyncDataToKomootApi) oet.d().e(SyncDataToKomootApi.class));
        private ResultCallback<String> e;

        d() {
        }

        void a(DataTaskAction dataTaskAction) {
            this.f29171a = dataTaskAction;
        }

        void a(ResultCallback<String> resultCallback) {
            this.e = resultCallback;
        }

        void d(xbp xbpVar) {
            this.f29172b = xbpVar;
        }

        @Override // com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback
        public void refreshResult(boolean z, boolean z2) {
            if (z && z2) {
                if (TextUtils.isEmpty(this.f29172b.getAccessToken())) {
                    this.f29172b.refreshAccessToken(this);
                } else {
                    this.f29171a.doAction(this.f29173c, this.f29172b, this.e);
                }
            }
        }
    }
}
