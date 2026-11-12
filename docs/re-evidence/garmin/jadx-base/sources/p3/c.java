package p3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface c<N> {
    default void apply(e23.p<? super N, Object, Unit> pVar, Object obj) {
        pVar.invoke(getCurrent(), obj);
    }

    void clear();

    void down(N n14);

    N getCurrent();

    void insertBottomUp(int i14, N n14);

    void insertTopDown(int i14, N n14);

    void move(int i14, int i15, int i16);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int i14, int i15);

    default void reuse() {
        N current = getCurrent();
        i iVar = current instanceof i ? (i) current : null;
        if (iVar != null) {
            iVar.e();
        }
    }

    void up();
}
