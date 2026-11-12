package p3;

/* JADX INFO: loaded from: classes.dex */
public interface n1 extends p1<Integer>, x3<Integer> {
    default void f(int i14) {
        t(i14);
    }

    int getIntValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p3.x3
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }

    @Override // p3.p1
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        f(num.intValue());
    }

    void t(int i14);
}
