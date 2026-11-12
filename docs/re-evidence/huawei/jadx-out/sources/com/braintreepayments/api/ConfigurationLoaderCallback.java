package com.braintreepayments.api;

import com.huawei.openalliance.ad.constant.VastAttribute;
import defpackage.tf;
import defpackage.tx;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, d2 = {"Lcom/braintreepayments/api/ConfigurationLoaderCallback;", "", "onResult", "", "result", "Lcom/braintreepayments/api/Configuration;", VastAttribute.ERROR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "timing", "Lcom/braintreepayments/api/HttpResponseTiming;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ConfigurationLoaderCallback {
    void onResult(tf tfVar, Exception exc, tx txVar);
}
