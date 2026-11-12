package defpackage;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface zj3 {
    void a(Surface surface, int i);

    default lhe<Void> b() {
        return oua.h(null);
    }

    void c(Size size);

    default void close() {
    }

    void d(o5d o5dVar);
}
