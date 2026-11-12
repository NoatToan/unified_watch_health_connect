package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    public interface a {
        boolean a(h hVar);

        void onCloseMenu(h hVar, boolean z14);
    }

    boolean collapseItemActionView(h hVar, j jVar);

    boolean expandItemActionView(h hVar, j jVar);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, h hVar);

    void onCloseMenu(h hVar, boolean z14);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(s sVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z14);
}
