package defpackage;

import android.content.Context;
import com.alipay.sdk.m.c.b;

/* JADX INFO: loaded from: classes4.dex */
public class kp implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.alipay.sdk.m.u0.b f39368a;
    public boolean e = false;
    public boolean d = false;

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.e) {
            com.alipay.sdk.m.u0.b bVar = new com.alipay.sdk.m.u0.b();
            this.f39368a = bVar;
            this.d = bVar.c(context, (com.alipay.sdk.m.u0.b.InterfaceC0022b<String>) null) == 1;
            this.e = true;
        }
        ld.e("getOAID", "isSupported", Boolean.valueOf(this.d));
        if (this.d && this.f39368a.e()) {
            return this.f39368a.a();
        }
        return null;
    }
}
