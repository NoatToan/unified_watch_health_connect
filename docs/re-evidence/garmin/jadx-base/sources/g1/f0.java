package g1;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public interface f0 {

    public interface a {
        f0 find(String str);
    }

    Range<Integer> a(int i14);

    default boolean b(int i14, int i15) {
        if (d(i14, i15)) {
            return true;
        }
        return h() && d(i15, i14);
    }

    Range<Integer> c();

    boolean d(int i14, int i15);

    Range<Integer> e(int i14);

    Range<Integer> f();

    Range<Integer> g();

    boolean h();

    int i();

    int j();
}
