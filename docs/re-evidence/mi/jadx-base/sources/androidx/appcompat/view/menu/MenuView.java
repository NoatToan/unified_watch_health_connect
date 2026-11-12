package androidx.appcompat.view.menu;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface MenuView {

    public interface ItemView {
        boolean a();

        void e(g gVar, int i);

        g getItemData();
    }

    void b(e eVar);
}
