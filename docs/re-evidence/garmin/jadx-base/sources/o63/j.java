package o63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo63/j;", "Lo63/g;", "Lo63/l;", "writer", "Ln63/b;", "json", "<init>", "(Lo63/l;Ln63/b;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n63.b f129866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f129867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, n63.b bVar) {
        super(lVar);
        lVar.getClass();
        bVar.getClass();
        this.f129866c = bVar;
    }

    @Override // o63.g
    public final void a() {
        this.f129855b = true;
        this.f129867d++;
    }

    @Override // o63.g
    public final void b() {
        this.f129855b = false;
        l lVar = this.f129854a;
        lVar.c("\n");
        int i14 = this.f129867d;
        for (int i15 = 0; i15 < i14; i15++) {
            String str = this.f129866c.f123893a.f123925g;
            str.getClass();
            lVar.c(str);
        }
    }

    @Override // o63.g
    public final void c() {
        if (this.f129855b) {
            this.f129855b = false;
        } else {
            b();
        }
    }

    @Override // o63.g
    public final void j() {
        e(' ');
    }

    @Override // o63.g
    public final void k() {
        this.f129867d--;
    }
}
