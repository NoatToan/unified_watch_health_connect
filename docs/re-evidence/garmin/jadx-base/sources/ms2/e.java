package ms2;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface e extends Parcelable {
    qs2.e[] B();

    int L3();

    default boolean X2() {
        return false;
    }

    List<qs2.b> Z3();

    is2.b a();

    default String e() {
        return null;
    }

    String getDisplayName();

    a p();

    default boolean x3() {
        return false;
    }
}
