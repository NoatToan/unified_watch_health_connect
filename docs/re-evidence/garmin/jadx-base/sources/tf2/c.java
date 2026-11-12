package tf2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ltf2/c;", "", "Ltf2/e;", "sessionHandler", "Ltf2/f;", "updateHandler", "Ltf2/b;", "cardHandler", "Ltf2/d;", "otherEventHandler", "<init>", "(Ltf2/e;Ltf2/f;Ltf2/b;Ltf2/d;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f164469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f164470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f164471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f164472d;

    public /* synthetic */ c(e eVar, f fVar, b bVar, d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? new e() : eVar, (i14 & 2) != 0 ? new f() : fVar, (i14 & 4) != 0 ? new b() : bVar, (i14 & 8) != 0 ? new d() : dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f164469a, cVar.f164469a) && s.g(this.f164470b, cVar.f164470b) && s.g(this.f164471c, cVar.f164471c) && s.g(this.f164472d, cVar.f164472d);
    }

    public final int hashCode() {
        return this.f164472d.hashCode() + ((this.f164471c.hashCode() + ((this.f164470b.hashCode() + (this.f164469a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LSVDataHandler(sessionHandler=" + this.f164469a + ", updateHandler=" + this.f164470b + ", cardHandler=" + this.f164471c + ", otherEventHandler=" + this.f164472d + ")";
    }

    public c(e eVar, f fVar, b bVar, d dVar) {
        eVar.getClass();
        fVar.getClass();
        bVar.getClass();
        dVar.getClass();
        this.f164469a = eVar;
        this.f164470b = fVar;
        this.f164471c = bVar;
        this.f164472d = dVar;
    }

    public c() {
        this(null, null, null, null, 15, null);
    }
}
