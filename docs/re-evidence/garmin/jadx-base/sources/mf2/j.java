package mf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmf2/j;", "Lfl/a;", "Lkc2/g;", "unitInfo", "Lkc2/b;", "errorInfo", "<init>", "(Lkc2/g;Lkc2/b;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends fl.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kc2.g f118355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kc2.b f118356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kc2.g gVar, kc2.b bVar) {
        super("ConnectMobileLiveActivity");
        gVar.getClass();
        bVar.getClass();
        this.f118355e = gVar;
        this.f118356f = bVar;
    }

    @Override // fl.a
    public final zk.a b(yt2.d dVar) {
        dVar.getClass();
        kc2.g gVar = this.f118355e;
        gVar.getClass();
        this.f71951c.put("UnitInfo", gVar);
        c(this.f118356f);
        return super.b(dVar);
    }
}
