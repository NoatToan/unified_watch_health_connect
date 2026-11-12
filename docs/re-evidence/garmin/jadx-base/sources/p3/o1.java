package p3;

/* JADX INFO: loaded from: classes.dex */
public interface o1 extends p1<Long>, x3<Long> {
    default void d(long j8) {
        k(j8);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p3.x3
    default Long getValue() {
        return Long.valueOf(j());
    }

    long j();

    void k(long j8);

    @Override // p3.p1
    /* bridge */ /* synthetic */ default void setValue(Long l14) {
        d(l14.longValue());
    }
}
