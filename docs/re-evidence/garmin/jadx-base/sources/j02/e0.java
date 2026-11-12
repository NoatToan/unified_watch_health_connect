package j02;

import lc.u0;
import p005kotlin.Metadata;
import p008y1.b2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj02/e0;", "Lj02/g;", "Le2/n;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements g<e2.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2.n f96061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f96062b;

    public e0(e2.n nVar, b2 b2Var) {
        this.f96061a = nVar;
        this.f96062b = b2Var;
    }

    @Override // j02.g
    public final long a() {
        g6.m.a aVar = g6.m.f76012b;
        int size = this.f96061a.getSize();
        aVar.getClass();
        b2 b2Var = this.f96062b;
        b2Var.getClass();
        int i14 = p.a.f96121a[b2Var.ordinal()];
        if (i14 == 1) {
            return (((long) size) & 4294967295L) | (((long) 0) << 32);
        }
        if (i14 == 2) {
            return (((long) size) << 32) | (((long) 0) & 4294967295L);
        }
        u0.r();
        return 0L;
    }

    @Override // j02.g
    public final long d() {
        return p.b(g6.k.f76003b, this.f96062b, this.f96061a.getOffset());
    }

    @Override // j02.g
    /* JADX INFO: renamed from: getData, reason: from getter */
    public final e2.n getF96061a() {
        return this.f96061a;
    }

    @Override // j02.g
    public final int getIndex() {
        return this.f96061a.getIndex();
    }

    @Override // j02.g
    public final Object getKey() {
        return this.f96061a.getKey();
    }
}
