package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public interface MenuProvider {
    void a(Menu menu, MenuInflater menuInflater);

    default void b(Menu menu) {
    }

    default void c(Menu menu) {
    }

    boolean d(MenuItem menuItem);
}
