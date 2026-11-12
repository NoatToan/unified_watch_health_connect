package defpackage;

import com.braintreepayments.api.PayPalCheckoutRequest;
import com.braintreepayments.api.PayPalRequest;
import com.braintreepayments.api.PayPalVaultRequest;

/* JADX INFO: loaded from: classes21.dex */
public class uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50214c;
    private String d;
    private final PayPalRequest e;

    uj(PayPalRequest payPalRequest) {
        this.e = payPalRequest;
    }

    String b() {
        return this.d;
    }

    uj a(String str) {
        this.d = str;
        return this;
    }

    String e() {
        return this.f50214c;
    }

    uj e(String str) {
        this.f50214c = str;
        return this;
    }

    String c() {
        PayPalRequest payPalRequest = this.e;
        if (payPalRequest instanceof PayPalCheckoutRequest) {
            return ((PayPalCheckoutRequest) payPalRequest).getIntent();
        }
        return null;
    }

    boolean f() {
        return this.e instanceof PayPalVaultRequest;
    }

    String a() {
        return this.e.getMerchantAccountId();
    }

    String d() {
        return this.f50212a;
    }

    uj c(String str) {
        this.f50212a = str;
        return this;
    }

    String j() {
        return this.f50213b;
    }

    uj b(String str) {
        this.f50213b = str;
        return this;
    }
}
