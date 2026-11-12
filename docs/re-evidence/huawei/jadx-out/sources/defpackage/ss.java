package defpackage;

import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;
import javax.net.ssl.SSLException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ*\u0010\u0005\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ2\u0010\u0005\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/braintreepayments/api/BraintreeGraphQLClient;", "", "httpClient", "Lcom/braintreepayments/api/HttpClient;", "(Lcom/braintreepayments/api/HttpClient;)V", "post", "", "data", "", "configuration", "Lcom/braintreepayments/api/Configuration;", "authorization", "Lcom/braintreepayments/api/Authorization;", ParamConstants.Param.CALLBACK, "Lcom/braintreepayments/api/NetworkResponseCallback;", BleConstants.KEY_PATH, "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ss {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f48580c = new c(null);
    private final tp d;

    public ss(tp tpVar) {
        zcp.c(tpVar, "");
        this.d = tpVar;
    }

    public /* synthetic */ ss(tp tpVar, int i, zcm zcmVar) {
        this((i & 1) != 0 ? f48580c.d() : tpVar);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"Lcom/braintreepayments/api/BraintreeGraphQLClient$Companion;", "", "()V", "createDefaultHttpClient", "Lcom/braintreepayments/api/HttpClient;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final tp d() throws SSLException {
            return new tp(new ux(uu.f50569b.e()), new sr());
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ss() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
