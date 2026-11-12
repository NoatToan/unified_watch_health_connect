package ns;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lns/c;", "Lns/x;", "Ll22/b;", "resourceResolver", "Lns/x$a;", "elevationChange", "<init>", "(Ll22/b;Lns/x$a;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l22.b f127625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x.a f127626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l22.b bVar, x.a aVar) {
        super(bVar, aVar, false, null, 12, null);
        bVar.getClass();
        aVar.getClass();
        this.f127625f = bVar;
        this.f127626g = aVar;
    }

    @Override // ns.x, u00.b
    public final String d(int i14) {
        return this.f127625f.a(this.f127626g.f127798a, super.d(i14));
    }

    @Override // ns.x, u00.b
    public final /* bridge */ /* synthetic */ String e(Double d14) {
        return i();
    }

    @Override // ns.x
    public final String i() {
        return this.f127625f.getString(this.f127626g.f127799b);
    }
}
