package defpackage;

import com.braintreepayments.api.Authorization;
import com.braintreepayments.api.AuthorizationCallback;
import com.braintreepayments.api.ClientTokenCallback;
import com.braintreepayments.api.ClientTokenProvider;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.VastAttribute;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/braintreepayments/api/AuthorizationLoader;", "", "initialAuthString", "", "clientTokenProvider", "Lcom/braintreepayments/api/ClientTokenProvider;", "(Ljava/lang/String;Lcom/braintreepayments/api/ClientTokenProvider;)V", "authorizationFromCache", "Lcom/braintreepayments/api/Authorization;", "getAuthorizationFromCache", "()Lcom/braintreepayments/api/Authorization;", "setAuthorizationFromCache", "(Lcom/braintreepayments/api/Authorization;)V", "invalidateClientToken", "", "loadAuthorization", ParamConstants.Param.CALLBACK, "Lcom/braintreepayments/api/AuthorizationCallback;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class se {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Authorization f47973c;
    private final ClientTokenProvider e;

    public se(String str, ClientTokenProvider clientTokenProvider) {
        this.e = clientTokenProvider;
        this.f47973c = str != null ? Authorization.INSTANCE.d(str) : null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Authorization getF47973c() {
        return this.f47973c;
    }

    public final void a(Authorization authorization) {
        this.f47973c = authorization;
    }

    public final void b(AuthorizationCallback authorizationCallback) {
        zcp.c(authorizationCallback, "");
        Authorization authorization = this.f47973c;
        if (authorization != null) {
            authorizationCallback.onAuthorizationResult(authorization, null);
            return;
        }
        ClientTokenProvider clientTokenProvider = this.e;
        if (clientTokenProvider != null) {
            clientTokenProvider.getClientToken(new d(authorizationCallback));
        } else {
            authorizationCallback.onAuthorizationResult(null, new st("Authorization required. See https://developer.paypal.com/braintree/docs/guides/client-sdk/setup/android/v4#initialization for more info.", null, 2, null));
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/braintreepayments/api/AuthorizationLoader$loadAuthorization$1", "Lcom/braintreepayments/api/ClientTokenCallback;", "onFailure", "", VastAttribute.ERROR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "clientToken", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d implements ClientTokenCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AuthorizationCallback f47974a;

        d(AuthorizationCallback authorizationCallback) {
            this.f47974a = authorizationCallback;
        }

        @Override // com.braintreepayments.api.ClientTokenCallback
        public void onSuccess(String clientToken) {
            zcp.c(clientToken, "");
            se.this.a(Authorization.INSTANCE.d(clientToken));
            this.f47974a.onAuthorizationResult(se.this.getF47973c(), null);
        }

        @Override // com.braintreepayments.api.ClientTokenCallback
        public void onFailure(Exception error) {
            zcp.c(error, "");
            this.f47974a.onAuthorizationResult(null, error);
        }
    }
}
