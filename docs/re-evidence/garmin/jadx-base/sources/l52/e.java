package l52;

import android.os.Parcelable;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public interface e<T extends Parcelable> extends i<T> {

    public interface a<T extends Parcelable> extends b<T> {
        void g(k kVar);

        void m(k kVar);
    }

    public interface b<T extends Parcelable> extends i.a<T> {
        void delete();

        void h(T t7);

        void i(e23.l<? super j<T>, Unit> lVar);

        void j(e23.l<? super j<T>, Unit> lVar);
    }

    b<T> d1();

    void j2(e23.l<? super j<T>, Unit> lVar);
}
