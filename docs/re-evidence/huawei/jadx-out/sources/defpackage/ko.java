package defpackage;

import android.content.Context;
import com.alipay.sdk.m.c.b;

/* JADX INFO: loaded from: classes4.dex */
public class ko implements b {
    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zE = ms.e();
        ld.e("getOAID", "isSupported", Boolean.valueOf(zE));
        if (zE) {
            return ms.e(context);
        }
        return null;
    }
}
