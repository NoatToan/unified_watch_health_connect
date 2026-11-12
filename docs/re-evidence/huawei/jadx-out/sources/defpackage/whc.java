package defpackage;

import android.text.TextUtils;
import com.braintreepayments.api.PayPalPaymentIntent;
import com.huawei.hihealthservice.hihealthkit.cpcheck.BaseRequest;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;

/* JADX INFO: loaded from: classes19.dex */
public class whc<T> extends BaseRequest<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52040a = lcy.f39930b + "/healthkit/v1/activityRecords";

    public whc(String str, String str2, String str3) {
        this.mUrl = f52040a;
        if (!TextUtils.isEmpty(str)) {
            this.mParams.put("cursor", str);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.mParams.put(SyncDataConstant.BI_KEY_ACTIVITY_TYPE, str3);
        }
        this.mParams.put("clientId", str2);
        this.mParams.put(PayPalPaymentIntent.ORDER, "endTimeDesc");
    }
}
