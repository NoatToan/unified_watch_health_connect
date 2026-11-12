package zl0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pb2.g;
import uh.b;
import vh.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzl0/a;", "Lgm0/a;", "Lpb2/g$c;", "Lam0/a;", "Luh/b;", "apolloClient", "Lf12/b;", "userAccount", "<init>", "(Luh/b;Lf12/b;)V", "a", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends gm0.a<g.c, am0.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f205185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f12.b f205186f;

    static {
        new C3833a(null);
    }

    public a(b bVar, f12.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.f205185e = bVar;
        this.f205186f = bVar2;
    }

    @Override // gm0.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getF33198e() {
        return this.f205185e;
    }

    @Override // gm0.a
    public final s0 d(hm0.a aVar) {
        am0.a aVar2 = (am0.a) aVar;
        return new g(aVar2.f4396a, aVar2.f4397b, aVar2.f4398c, aVar2.f4399d, this.f205186f.getUserDisplayName(), aVar2.f4400e, aVar2.f4401f, aVar2.f4403h, aVar2.f4402g, aVar2.f4404i, aVar2.f4405j);
    }

    @Override // gm0.a
    public final s0.a i(s0.a aVar, s0.a aVar2) {
        g.d dVar;
        List<g.b> list;
        g.c cVar = (g.c) aVar;
        g.c cVar2 = (g.c) aVar2;
        if (cVar2 == null || (dVar = cVar2.f137142b) == null) {
            dVar = cVar.f137142b;
        }
        if (cVar2 == null || (list = cVar2.f137141a) == null) {
            list = cVar.f137141a;
        }
        return new g.c(list, dVar);
    }

    /* JADX INFO: renamed from: zl0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzl0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3833a {
        public /* synthetic */ C3833a(j jVar) {
            this();
        }

        private C3833a() {
        }
    }
}
