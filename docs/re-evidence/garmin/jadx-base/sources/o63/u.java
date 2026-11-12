package o63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo63/u;", "Lo63/b;", "Ln63/b;", "json", "Ln63/c;", "value", "<init>", "(Ln63/b;Ln63/c;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n63.c f129888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f129889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f129890j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(n63.b bVar, n63.c cVar) {
        super(bVar, cVar, null, 4, null);
        bVar.getClass();
        cVar.getClass();
        this.f129888h = cVar;
        this.f129889i = cVar.f123896a.size();
        this.f129890j = -1;
    }

    @Override // m63.b1
    public final String U(k63.e eVar, int i14) {
        eVar.getClass();
        return String.valueOf(i14);
    }

    @Override // o63.b
    public final n63.i W(String str) {
        str.getClass();
        return this.f129888h.f123896a.get(Integer.parseInt(str));
    }

    @Override // o63.b
    /* JADX INFO: renamed from: Y */
    public final n63.i getF129830e() {
        return this.f129888h;
    }

    @Override // l63.c
    public final int e(k63.e eVar) {
        eVar.getClass();
        int i14 = this.f129890j;
        if (i14 >= this.f129889i - 1) {
            return -1;
        }
        int i15 = i14 + 1;
        this.f129890j = i15;
        return i15;
    }
}
