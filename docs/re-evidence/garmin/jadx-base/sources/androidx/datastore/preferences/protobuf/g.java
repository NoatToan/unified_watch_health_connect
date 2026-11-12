package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class g extends h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6702a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f6704c;

    public g(h hVar) {
        this.f6704c = hVar;
        this.f6703b = hVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6702a < this.f6703b;
    }

    public final byte nextByte() {
        int i14 = this.f6702a;
        if (i14 < this.f6703b) {
            this.f6702a = i14 + 1;
            return this.f6704c.e(i14);
        }
        c22.t.g();
        return (byte) 0;
    }
}
