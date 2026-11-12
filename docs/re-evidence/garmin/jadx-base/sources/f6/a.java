package f6;

import c53.c0;
import c53.j;

/* JADX INFO: loaded from: classes.dex */
public interface a<T> {
    j<T> a();

    default int getCount() {
        return c0.f(a());
    }
}
