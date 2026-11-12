package defpackage;

import android.content.Context;
import com.alipay.sdk.m.c.b;

/* JADX INFO: loaded from: classes4.dex */
public class ku implements b {
    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zD = na.d();
        ld.e("getOAID", "isSupported", Boolean.valueOf(zD));
        if (zD) {
            return na.a(context);
        }
        return null;
    }
}
