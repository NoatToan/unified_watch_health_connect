package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k1<e7.b, MenuItem> f4719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k1<e7.c, SubMenu> f4720c;

    public c(Context context) {
        this.f4718a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof e7.b)) {
            return menuItem;
        }
        e7.b bVar = (e7.b) menuItem;
        if (this.f4719b == null) {
            this.f4719b = new k1<>();
        }
        MenuItem menuItem2 = this.f4719b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k kVar = new k(this.f4718a, bVar);
        this.f4719b.put(bVar, kVar);
        return kVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof e7.c)) {
            return subMenu;
        }
        e7.c cVar = (e7.c) subMenu;
        if (this.f4720c == null) {
            this.f4720c = new k1<>();
        }
        SubMenu subMenu2 = this.f4720c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        t tVar = new t(this.f4718a, cVar);
        this.f4720c.put(cVar, tVar);
        return tVar;
    }
}
