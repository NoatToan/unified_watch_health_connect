package po2;

import o53.c2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpo2/l0;", "Lpo2/v0;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c2 f139270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0<Object> f139271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0<Object>.b f139272c;

    public l0(k0<Object> k0Var, k0<Object>.b bVar) {
        this.f139271b = k0Var;
        this.f139272c = bVar;
    }

    @Override // po2.v0
    public final boolean a() {
        if (this.f139270a != null) {
            return false;
        }
        long j8 = this.f139272c.f139267a;
        k0.a aVar = k0.f139256j;
        k0<Object> k0Var = this.f139271b;
        this.f139270a = ge1.b.T(k0Var.e(), o53.s0.f129406a, null, new t0(j8, k0Var, null), 2);
        return true;
    }
}
