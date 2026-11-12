package i53;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface f<E> extends c<E>, b {

    public interface a<E> extends List<E>, Collection, f23.b, f23.c {
        f<E> build();
    }

    f Y1(j82.d dVar);

    @Override // java.util.List, java.util.Collection
    f<E> add(E e4);
}
