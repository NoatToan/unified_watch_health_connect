package x53;

import o53.z;
import p005kotlin.Metadata;
import u53.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx53/c;", "Lx53/f;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f189154b = new c();

    private c() {
        super(j.f189162c, j.f189163d, j.f189164e, j.f189160a);
    }

    @Override // x53.f, o53.c1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o53.z
    public final z limitedParallelism(int i14, String str) {
        oe2.f.i(i14);
        if (i14 >= j.f189162c) {
            return str != null ? new q(this, str) : this;
        }
        return super.limitedParallelism(i14, str);
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        return "Dispatchers.Default";
    }
}
