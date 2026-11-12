package z23;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends h implements o33.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enum<?> f202075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x33.f fVar, Enum<?> r14) {
        super(fVar, null);
        r14.getClass();
        this.f202075c = r14;
    }

    @Override // o33.l
    public final x33.b b() {
        Class<?> enclosingClass = this.f202075c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        enclosingClass.getClass();
        return f.a(enclosingClass);
    }

    @Override // o33.l
    public final x33.f c() {
        return x33.f.e(this.f202075c.name());
    }
}
