package j23;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes3.dex */
public interface g<T extends Comparable<? super T>> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(g<T> gVar, T t7) {
            t7.getClass();
            return t7.compareTo(gVar.getStart()) >= 0 && t7.compareTo(gVar.b()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(g<T> gVar) {
            return gVar.getStart().compareTo(gVar.b()) > 0;
        }
    }

    T b();

    boolean contains(T t7);

    T getStart();

    boolean isEmpty();
}
