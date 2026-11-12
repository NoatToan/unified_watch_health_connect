package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import defpackage.coc;
import java.util.Map;
import miuix.appcompat.widget.HyperPopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public class b implements HyperPopupWindow.c, View.OnKeyListener, PopupWindow.OnDismissListener, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HyperPopupWindow f26531b;
    public d c;
    public View d;
    public View e;
    public boolean f;
    public coc g;
    public h.a h;
    public int i;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26532k = -1;
    public int l = 0;
    public Map<Integer, Boolean> m;
    public Map<Integer, Boolean[]> n;

    public b(Context context, d dVar, View view, View view2, boolean z) {
        this.f26530a = context;
        this.c = dVar;
        this.f = z;
        this.e = view;
        this.d = view2;
        dVar.c(this);
    }

    public void a(boolean z) {
        if (isShowing()) {
            this.f26531b.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: goc
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f19185a.j();
                }
            });
            this.f26531b.dismiss();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void b(d dVar, boolean z) {
        if (dVar != this.c) {
            return;
        }
        a(true);
        h.a aVar = this.h;
        if (aVar != null) {
            aVar.b(dVar, z);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void c(Context context, d dVar) {
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean d(d dVar, f fVar) {
        return false;
    }

    public boolean e() {
        HyperPopupWindow hyperPopupWindow = new HyperPopupWindow(this.f26530a, this.d);
        this.f26531b = hyperPopupWindow;
        hyperPopupWindow.n(8388693);
        this.f26531b.setOnDismissListener(this);
        this.f26531b.setOnMenuItemClickListener(this);
        coc cocVar = new coc(this.f26530a, null, this.f);
        this.g = cocVar;
        cocVar.g(this.c.y());
        Map<Integer, Boolean> map = this.m;
        if (map != null) {
            this.g.t(map);
        }
        Map<Integer, Boolean[]> map2 = this.n;
        if (map2 != null) {
            this.g.u(map2);
        }
        this.g.x(this.c);
        this.f26531b.j(this.g);
        this.f26531b.g(this.j);
        this.f26531b.b(this.i);
        int i = this.l;
        if (i > 0) {
            this.f26531b.Z(i);
        }
        if (!this.f26531b.R(this.e)) {
            return true;
        }
        this.f26531b.m(this.e, null);
        this.f26531b.K().setOnKeyListener(this);
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean f(d dVar, f fVar) {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean flagActionItems() {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean h(j jVar) {
        return true;
    }

    public boolean isShowing() {
        HyperPopupWindow hyperPopupWindow = this.f26531b;
        return hyperPopupWindow != null && hyperPopupWindow.isShowing();
    }

    public void k(Map<Integer, Boolean> map) {
        this.m = map;
    }

    public void l(Map<Integer, Boolean[]> map) {
        this.n = map;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void j() {
        coc cocVar = this.g;
        if (cocVar != null) {
            cocVar.o(this.m);
            this.g.p(this.n);
        }
    }

    public void n(int i) {
        this.f26532k = i;
    }

    public void o(h.a aVar) {
        this.h = aVar;
    }

    public void onDismiss() {
        j();
        this.f26531b = null;
        this.c.close();
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        a(false);
        return true;
    }

    @Override // miuix.appcompat.widget.HyperPopupWindow.c
    public void onMenuItemClick(MenuItem menuItem) {
        this.c.I(menuItem, 0);
    }

    public void p(int i) {
        this.l = i;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void updateMenuView(boolean z) {
        coc cocVar = this.g;
        if (cocVar != null) {
            cocVar.notifyDataSetChanged();
        }
    }
}
