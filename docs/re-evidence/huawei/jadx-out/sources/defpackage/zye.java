package defpackage;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes20.dex */
public class zye extends zya {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zxs<String> f54767b = new zxs<>("PLAIN", String.class, u);

    public zye(InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress, null, new zya.e().d(f54767b, ""));
    }

    @Override // defpackage.zya, defpackage.zxr
    public String toString() {
        return String.format("UDP(%s)", c());
    }
}
