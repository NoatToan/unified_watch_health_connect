package defpackage;

import android.content.Context;
import com.alipay.sdk.m.c.b;

/* JADX INFO: loaded from: classes4.dex */
public class kv implements b {
    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zA = od.a(context);
        ld.e("getOAID", "isSupported", Boolean.valueOf(zA));
        if (zA) {
            return od.e(context);
        }
        return null;
    }
}
