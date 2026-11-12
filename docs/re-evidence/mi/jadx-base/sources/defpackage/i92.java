package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SimpleArrayMap<xpo, MenuItem> f20896b;
    public SimpleArrayMap<ypo, SubMenu> c;

    public i92(Context context) {
        this.f20895a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof xpo)) {
            return menuItem;
        }
        xpo xpoVar = (xpo) menuItem;
        if (this.f20896b == null) {
            this.f20896b = new SimpleArrayMap<>();
        }
        MenuItem menuItem2 = this.f20896b.get(xpoVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        nqf nqfVar = new nqf(this.f20895a, xpoVar);
        this.f20896b.put(xpoVar, nqfVar);
        return nqfVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof ypo)) {
            return subMenu;
        }
        ypo ypoVar = (ypo) subMenu;
        if (this.c == null) {
            this.c = new SimpleArrayMap<>();
        }
        SubMenu subMenu2 = this.c.get(ypoVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        mno mnoVar = new mno(this.f20895a, ypoVar);
        this.c.put(ypoVar, mnoVar);
        return mnoVar;
    }

    public final void e() {
        SimpleArrayMap<xpo, MenuItem> simpleArrayMap = this.f20896b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap<ypo, SubMenu> simpleArrayMap2 = this.c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    public final void f(int i) {
        if (this.f20896b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f20896b.getSize()) {
            if (this.f20896b.keyAt(i2).getGroupId() == i) {
                this.f20896b.removeAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void g(int i) {
        if (this.f20896b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f20896b.getSize(); i2++) {
            if (this.f20896b.keyAt(i2).getItemId() == i) {
                this.f20896b.removeAt(i2);
                return;
            }
        }
    }
}
