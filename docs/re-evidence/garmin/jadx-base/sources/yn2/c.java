package yn2;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public interface c {
    void U(Throwable th3);

    default void c0(int i14, Intent intent) {
        try {
            if (i14 == -1) {
                if (intent == null) {
                    throw new IllegalArgumentException("No intent is passed");
                }
                PaymentData fromIntent = PaymentData.getFromIntent(intent);
                if (fromIntent == null) {
                    throw new IllegalArgumentException("Cannot get payment data from intent");
                }
                g(new JSONObject(fromIntent.toJson()));
                return;
            }
            if (i14 == 0) {
                throw new IllegalArgumentException("User cancelled");
            }
            if (i14 != 1) {
                throw new IllegalArgumentException("Unknown result code: " + i14);
            }
            if (intent == null) {
                throw new IllegalArgumentException("No intent is passed");
            }
            Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
            if (statusFromIntent == null) {
                throw new IllegalArgumentException("Cannot get status from intent");
            }
            throw new IllegalArgumentException("GooglePay error with status: " + statusFromIntent.getStatusCode());
        } catch (Exception e4) {
            U(e4);
        }
    }

    vn2.c g(JSONObject jSONObject);
}
