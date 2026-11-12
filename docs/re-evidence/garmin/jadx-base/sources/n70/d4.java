package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d4 implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o13.p<String, pb2.e.r> f124138a;

    public d4(o13.p<String, pb2.e.r> pVar) {
        this.f124138a = pVar;
    }

    @Override // e23.a
    public final Boolean invoke() {
        o13.p<String, pb2.e.r> pVar = this.f124138a;
        return Boolean.valueOf((pVar.f128594a == null && pVar.f128595b == null) ? false : true);
    }
}
