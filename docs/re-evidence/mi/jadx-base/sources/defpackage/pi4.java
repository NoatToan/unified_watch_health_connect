package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes3.dex */
public class pi4 extends b4i {
    public MenuItem d;

    public pi4(Context context, Menu menu) {
        super(context, menu);
    }

    @Override // defpackage.b4i
    public boolean b(MenuItem menuItem) {
        boolean zB = super.b(menuItem);
        if (!zB || menuItem.getOrder() != 131072) {
            return zB;
        }
        if (this.d != null) {
            throw new IllegalStateException("Only one menu item is allowed to have CATEGORY_SYSTEM order!");
        }
        this.d = menuItem;
        return false;
    }

    public MenuItem e() {
        return this.d;
    }
}
