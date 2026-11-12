package defpackage;

import android.content.Context;
import com.alipay.sdk.m.c.b;

/* JADX INFO: loaded from: classes4.dex */
public class kx implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39574b = false;

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f39574b) {
            mm.c(context);
            this.f39574b = true;
        }
        boolean zC = mm.c();
        ld.e("getOAID", "isSupported", Boolean.valueOf(zC));
        if (zC) {
            return mm.b(context);
        }
        return null;
    }
}
