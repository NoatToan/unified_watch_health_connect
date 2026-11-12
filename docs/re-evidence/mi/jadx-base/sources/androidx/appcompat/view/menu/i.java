package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface i {

    public interface a {
        void b(e eVar, boolean z);

        boolean c(e eVar);
    }

    void b(e eVar, boolean z);

    boolean c(e eVar, g gVar);

    boolean d(e eVar, g gVar);

    void e(Context context, e eVar);

    void f(a aVar);

    boolean flagActionItems();

    boolean g(k kVar);

    int getId();

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    void updateMenuView(boolean z);
}
