package x53;

import o53.z;
import p005kotlin.Metadata;
import u53.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx53/k;", "Lo53/z;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f189166a = new k();

    private k() {
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        c.f189154b.f189156a.c(runnable, true, false);
    }

    @Override // o53.z
    public final void dispatchYield(t13.g gVar, Runnable runnable) {
        c.f189154b.f189156a.c(runnable, true, true);
    }

    @Override // o53.z
    public final z limitedParallelism(int i14, String str) {
        oe2.f.i(i14);
        if (i14 >= j.f189163d) {
            return str != null ? new q(this, str) : this;
        }
        return super.limitedParallelism(i14, str);
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        return "Dispatchers.IO";
    }
}
