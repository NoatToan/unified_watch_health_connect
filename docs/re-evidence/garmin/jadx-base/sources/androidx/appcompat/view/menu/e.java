package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.C0073d f4750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItem f4751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f4752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d.c f4753d;

    public e(d.c cVar, d.C0073d c0073d, MenuItem menuItem, h hVar) {
        this.f4753d = cVar;
        this.f4750a = c0073d;
        this.f4751b = menuItem;
        this.f4752c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.C0073d c0073d = this.f4750a;
        if (c0073d != null) {
            d.c cVar = this.f4753d;
            d.this.C = true;
            c0073d.f4748b.close(false);
            d.this.C = false;
        }
        MenuItem menuItem = this.f4751b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f4752c.performItemAction(menuItem, 4);
        }
    }
}
