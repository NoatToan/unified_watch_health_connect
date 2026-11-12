package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class nig extends e {
    public final Class<?> B;
    public final int C;

    public nig(Context context, Class<?> cls, int i) {
        super(context);
        this.B = cls;
        this.C = i;
    }

    @Override // androidx.appcompat.view.menu.e
    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.C) {
            h0();
            MenuItem menuItemA = super.a(i, i2, i3, charSequence);
            if (menuItemA instanceof g) {
                ((g) menuItemA).t(true);
            }
            g0();
            return menuItemA;
        }
        String simpleName = this.B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.B.getSimpleName() + " does not support submenus");
    }
}
