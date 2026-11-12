package defpackage;

import android.text.TextUtils;
import com.braintreepayments.api.PayPalPaymentIntent;
import com.huawei.hihealthservice.hihealthkit.cpcheck.BaseRequest;

/* JADX INFO: loaded from: classes19.dex */
public class whi<T> extends BaseRequest<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52042c = lcy.f39930b + "/healthkit/v1/sampleSets";

    public whi(String str, String str2, String str3, String str4) {
        this.mUrl = f52042c;
        if (!TextUtils.isEmpty(str)) {
            this.mParams.put("cursor", str);
        }
        this.mParams.put("clientId", str2);
        this.mParams.put("dataType", str3);
        this.mParams.put("timeZone", str4);
        this.mParams.put(PayPalPaymentIntent.ORDER, "endTimeDesc");
    }
}
