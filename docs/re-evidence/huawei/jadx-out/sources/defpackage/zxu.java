package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.watchface.videoedit.param.CanvasConfig;
import java.net.InetSocketAddress;
import java.security.Principal;

/* JADX INFO: loaded from: classes20.dex */
public class zxu extends zya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zya.e f54752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zya.e f54753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zya.e f54754c;
    public static final zya.e d;
    public static final zya.e e;
    public static final zxs<Integer> f;
    public static final zxs<Boolean> j;
    public static final zxs<Boolean> k;
    public static final zxs<InetSocketAddress> l;
    public static final zxs<String> n;
    public static final zxs<Integer> o;
    public static final zxs<Boolean> p;
    public static final zxs<zzg> t = new zxs<>("DTLS_SESSION_ID", zzg.class, u);
    public static final zxs<Integer> i = new zxs<>("DTLS_EPOCH", Integer.class, u);
    public static final zxs<String> g = new zxs<>("DTLS_CIPHER", String.class, u);
    public static final zxs<Long> m = new zxs<>("DTLS_HANDSHAKE_TIMESTAMP", Long.class, u);
    public static final zxs<Long> h = new zxs<>("*DTLS_READ_SEQUENCE_NUMBER", Long.class, u);
    public static final zxs<zzg> q = new zxs<>("DTLS_READ_CONNECTION_ID", zzg.class, u);
    public static final zxs<zzg> r = new zxs<>("DTLS_WRITE_CONNECTION_ID", zzg.class, u);
    public static final zxs<String> s = new zxs<>("*DTLS_VIA_ROUTER", String.class, u);

    static {
        zxs<String> zxsVar = new zxs<>("*DTLS_HANDSHAKE_MODE", String.class, u);
        n = zxsVar;
        f = new zxs<>("*DTLS_AUTO_HANDSHAKE_TIMEOUT", Integer.class, u);
        o = new zxs<>("*DTLS_MESSAGE_SIZE_LIMIT", Integer.class, u);
        j = new zxs<>("*DTLS_EXTENDED_MASTER_SECRET", Boolean.class, u);
        k = new zxs<>("*DTLS_NEWEST_RECORD", Boolean.class, u);
        l = new zxs<>("*DTLS_PREVIOUS_ADDRESS", InetSocketAddress.class, u);
        p = new zxs<>("DTLS_SECURE_RENEGOTIATION", Boolean.class, u);
        f54752a = new zya.e().d(zxsVar, "none").c();
        f54754c = new zya.e().d(zxsVar, TtmlNode.TEXT_EMPHASIS_AUTO).c();
        d = new zya.e().d(zxsVar, "probe").c();
        e = new zya.e().d(zxsVar, "force").c();
        f54753b = new zya.e().d(zxsVar, CanvasConfig.FULL_CONFIG).c();
    }

    public zxu(InetSocketAddress inetSocketAddress, String str, Principal principal, zya.e eVar) {
        super(inetSocketAddress, str, principal, eVar);
    }

    public final zzg b() {
        return (zzg) get(t);
    }

    @Override // defpackage.zya, defpackage.zxr
    public String toString() {
        return String.format("DTLS(%s,ID:%s)", c(), zzp.d(b().a(), 10));
    }
}
