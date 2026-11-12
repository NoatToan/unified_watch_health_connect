package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class p extends c implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e7.a f4824d;

    public p(Context context, e7.a aVar) {
        super(context);
        if (aVar != null) {
            this.f4824d = aVar;
        } else {
            vb.h.s("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f4824d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i14, int i15, int i16, ComponentName componentName, Intent[] intentArr, Intent intent, int i17, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f4824d.addIntentOptions(i14, i15, i16, componentName, intentArr, intent, i17, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i18 = 0; i18 < length; i18++) {
                menuItemArr[i18] = c(menuItemArr2[i18]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f4824d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        k1<e7.b, MenuItem> k1Var = this.f4719b;
        if (k1Var != null) {
            k1Var.clear();
        }
        k1<e7.c, SubMenu> k1Var2 = this.f4720c;
        if (k1Var2 != null) {
            k1Var2.clear();
        }
        this.f4824d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f4824d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i14) {
        return c(this.f4824d.findItem(i14));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i14) {
        return c(this.f4824d.getItem(i14));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f4824d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i14, KeyEvent keyEvent) {
        return this.f4824d.isShortcutKey(i14, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i14, int i15) {
        return this.f4824d.performIdentifierAction(i14, i15);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i14, KeyEvent keyEvent, int i15) {
        return this.f4824d.performShortcut(i14, keyEvent, i15);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i14) {
        if (this.f4719b != null) {
            int i15 = 0;
            while (true) {
                k1<e7.b, MenuItem> k1Var = this.f4719b;
                if (i15 >= k1Var.f134761c) {
                    break;
                }
                if (k1Var.g(i15).getGroupId() == i14) {
                    this.f4719b.i(i15);
                    i15--;
                }
                i15++;
            }
        }
        this.f4824d.removeGroup(i14);
    }

    @Override // android.view.Menu
    public final void removeItem(int i14) {
        if (this.f4719b != null) {
            int i15 = 0;
            while (true) {
                k1<e7.b, MenuItem> k1Var = this.f4719b;
                if (i15 >= k1Var.f134761c) {
                    break;
                }
                if (k1Var.g(i15).getItemId() == i14) {
                    this.f4719b.i(i15);
                    break;
                }
                i15++;
            }
        }
        this.f4824d.removeItem(i14);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i14, boolean z14, boolean z15) {
        this.f4824d.setGroupCheckable(i14, z14, z15);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i14, boolean z14) {
        this.f4824d.setGroupEnabled(i14, z14);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i14, boolean z14) {
        this.f4824d.setGroupVisible(i14, z14);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z14) {
        this.f4824d.setQwertyMode(z14);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4824d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i14) {
        return c(this.f4824d.add(i14));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i14) {
        return d(this.f4824d.addSubMenu(i14));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i14, int i15, int i16, CharSequence charSequence) {
        return c(this.f4824d.add(i14, i15, i16, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i14, int i15, int i16, CharSequence charSequence) {
        return d(this.f4824d.addSubMenu(i14, i15, i16, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i14, int i15, int i16, int i17) {
        return c(this.f4824d.add(i14, i15, i16, i17));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i14, int i15, int i16, int i17) {
        return d(this.f4824d.addSubMenu(i14, i15, i16, i17));
    }
}
