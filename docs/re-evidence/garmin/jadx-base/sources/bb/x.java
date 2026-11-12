package bb;

/* JADX INFO: loaded from: classes.dex */
public class x implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f17272a;

    public x(g0 g0Var) {
        this.f17272a = g0Var;
    }

    @Override // bb.g0
    public long getDurationUs() {
        return this.f17272a.getDurationUs();
    }

    @Override // bb.g0
    public g0.a getSeekPoints(long j8) {
        return this.f17272a.getSeekPoints(j8);
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return this.f17272a.isSeekable();
    }
}
