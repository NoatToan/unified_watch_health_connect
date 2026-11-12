package de.greenrobot.event;

/* JADX INFO: loaded from: classes22.dex */
final class h {
    public final Object a;
    public final f b;
    public final int c;
    public volatile boolean d = true;

    public h(Object obj, f fVar, int i) {
        this.a = obj;
        this.b = fVar;
        this.c = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b.equals(hVar.b);
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.d.hashCode();
    }
}
