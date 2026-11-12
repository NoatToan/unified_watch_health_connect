package ed0;

import bz0.o;
import c83.b0;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import gg1.v0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Led0/l;", "Ldn2/d$d;", "Lim2/c$c;", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements dn2.d.InterfaceC1284d, im2.c.InterfaceC1797c {
    @Override // dn2.d.InterfaceC1284d, im2.c.InterfaceC1797c
    public final zi2.a a() {
        v0.T.getClass();
        return v0.a.b().f77335a;
    }

    @Override // dn2.d.InterfaceC1284d, im2.c.InterfaceC1797c
    public final b0 b(String str) {
        b0.b bVar = new b0.b();
        if (str == null) {
            zi2.a aVarA = a();
            str = aVarA != null ? aVarA.f204881b : null;
        }
        bVar.b("https://" + str);
        o.f22274a.getClass();
        bVar.d(o.b());
        GsonUtil.f47252a.getClass();
        bVar.a(e83.a.d(GsonUtil.f47253b));
        return bVar.c();
    }
}
