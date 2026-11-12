package ld;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lld/c;", "Lvd/d$a;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends vd.d.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f112018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i14, int i15) {
        super(i15);
        this.f112018b = i14;
    }

    @Override // vd.d.a
    public final void c(wd.b bVar) {
    }

    @Override // vd.d.a
    public final void e(wd.b bVar) {
        int i14 = this.f112018b;
        if (i14 < 1) {
            bVar.f184326a.setVersion(i14);
        }
    }

    @Override // vd.d.a
    public final void f(wd.b bVar, int i14, int i15) {
    }
}
