package y90;

import java.util.List;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p13.h0;
import p13.k0;
import p13.u0;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly90/c;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f195277a;

    public c() {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f195277a = q2.a(k0Var);
    }

    public final List<z90.a> a() {
        return h0.b1(((Map) this.f195277a.getValue()).values());
    }

    public final z90.a b(long j8) {
        return (z90.a) ((Map) this.f195277a.getValue()).get(Long.valueOf(j8));
    }

    public final void c(long j8, z90.a aVar) {
        p2 p2Var = this.f195277a;
        p2Var.k(null, u0.i((Map) p2Var.getValue(), new p(Long.valueOf(j8), aVar)));
    }
}
