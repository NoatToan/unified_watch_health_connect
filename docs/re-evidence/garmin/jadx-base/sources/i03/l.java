package i03;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.b f86954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f86955b;

    public l(k.b bVar, g gVar) {
        this.f86954a = bVar;
        this.f86955b = gVar;
    }

    @Override // i03.m
    public final n a() {
        r rVar = new r();
        n.a aVar = (n.a) this.f86954a;
        aVar.getClass();
        b bVar = new b();
        return new n(this.f86955b, rVar, new t(), Collections.unmodifiableMap(aVar.f86961a), bVar);
    }
}
