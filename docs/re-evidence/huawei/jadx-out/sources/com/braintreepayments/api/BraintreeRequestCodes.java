package com.braintreepayments.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/BraintreeRequestCodes;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface BraintreeRequestCodes {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.e;
    public static final int GOOGLE_PAY = 13593;
    public static final int LOCAL_PAYMENT = 13596;
    public static final int PAYPAL = 13591;
    public static final int SAMSUNG_PAY = 13595;
    public static final int SEPA_DEBIT = 13597;
    public static final int THREE_D_SECURE = 13487;
    public static final int VENMO = 13488;
    public static final int VISA_CHECKOUT = 13592;

    /* JADX INFO: renamed from: com.braintreepayments.api.BraintreeRequestCodes$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/braintreepayments/api/BraintreeRequestCodes$Companion;", "", "()V", "GOOGLE_PAY", "", "LOCAL_PAYMENT", "PAYPAL", "SAMSUNG_PAY", "SEPA_DEBIT", "THREE_D_SECURE", "VENMO", "VISA_CHECKOUT", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion e = new Companion();

        private Companion() {
        }
    }
}
