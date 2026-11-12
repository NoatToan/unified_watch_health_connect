package p63;

import e23.l;
import i63.i;
import java.util.List;
import p3.q1;

/* JADX INFO: loaded from: classes3.dex */
public interface g {
    default <T> void a(k23.d<T> dVar, i63.c<T> cVar) {
        cVar.getClass();
        c(dVar, new q1(cVar, 9));
    }

    <Base> void b(k23.d<Base> dVar, l<? super String, ? extends i63.b<? extends Base>> lVar);

    <T> void c(k23.d<T> dVar, l<? super List<? extends i63.c<?>>, ? extends i63.c<?>> lVar);

    <Base> void d(k23.d<Base> dVar, l<? super Base, ? extends i<? super Base>> lVar);

    <Base, Sub extends Base> void e(k23.d<Base> dVar, k23.d<Sub> dVar2, i63.c<Sub> cVar);
}
