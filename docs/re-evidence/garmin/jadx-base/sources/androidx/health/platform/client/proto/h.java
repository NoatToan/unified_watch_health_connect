package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public class h extends i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7652a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f7654c;

    public h(i iVar) {
        this.f7654c = iVar;
        this.f7653b = iVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7652a < this.f7653b;
    }

    public final byte nextByte() {
        int i14 = this.f7652a;
        if (i14 < this.f7653b) {
            this.f7652a = i14 + 1;
            return this.f7654c.d(i14);
        }
        c22.t.g();
        return (byte) 0;
    }
}
