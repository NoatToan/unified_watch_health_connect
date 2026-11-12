package o53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo53/y0;", "Lo53/z;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class y0 extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f129422d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f129423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f129424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p13.k<p0<?>> f129425c;

    public final void H(boolean z14) {
        long j8 = this.f129423a - (z14 ? 4294967296L : 1L);
        this.f129423a = j8;
        if (j8 <= 0 && this.f129424b) {
            shutdown();
        }
    }

    public final void T(p0<?> p0Var) {
        p13.k<p0<?>> kVar = this.f129425c;
        if (kVar == null) {
            kVar = new p13.k<>();
            this.f129425c = kVar;
        }
        kVar.addLast(p0Var);
    }

    public final void U(boolean z14) {
        this.f129423a = (z14 ? 4294967296L : 1L) + this.f129423a;
        if (z14) {
            return;
        }
        this.f129424b = true;
    }

    public long V() {
        return !W() ? Long.MAX_VALUE : 0L;
    }

    public final boolean W() {
        p13.k<p0<?>> kVar = this.f129425c;
        if (kVar == null) {
            return false;
        }
        p0<?> p0VarRemoveFirst = kVar.isEmpty() ? null : kVar.removeFirst();
        if (p0VarRemoveFirst == null) {
            return false;
        }
        p0VarRemoveFirst.run();
        return true;
    }

    @Override // o53.z
    public final z limitedParallelism(int i14, String str) {
        oe2.f.i(i14);
        return str != null ? new u53.q(this, str) : this;
    }

    public void shutdown() {
    }
}
