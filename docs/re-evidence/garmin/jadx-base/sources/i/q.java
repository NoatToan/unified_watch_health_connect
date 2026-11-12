package i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.z0;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppStoreActivity;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class q extends i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f86645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f86646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f86647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<i.a.b> f86651g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f86652h = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q qVar = q.this;
            Window.Callback callback = qVar.f86646b;
            Menu menuG = qVar.G();
            androidx.appcompat.view.menu.h hVar = menuG instanceof androidx.appcompat.view.menu.h ? (androidx.appcompat.view.menu.h) menuG : null;
            if (hVar != null) {
                hVar.stopDispatchingItemsChanged();
            }
            try {
                menuG.clear();
                if (!callback.onCreatePanelMenu(0, menuG) || !callback.onPreparePanel(0, null, menuG)) {
                    menuG.clear();
                }
            } finally {
                if (hVar != null) {
                    hVar.startDispatchingItemsChanged();
                }
            }
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }
    }

    public final class c implements androidx.appcompat.view.menu.n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f86655a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final boolean a(androidx.appcompat.view.menu.h hVar) {
            q.this.f86646b.onMenuOpened(108, hVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z14) {
            if (this.f86655a) {
                return;
            }
            this.f86655a = true;
            q qVar = q.this;
            qVar.f86645a.l();
            qVar.f86646b.onPanelClosed(108, hVar);
            this.f86655a = false;
        }
    }

    public final class d implements androidx.appcompat.view.menu.h.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
            q qVar = q.this;
            boolean zIsOverflowMenuShowing = qVar.f86645a.f5291a.isOverflowMenuShowing();
            Window.Callback callback = qVar.f86646b;
            if (zIsOverflowMenuShowing) {
                callback.onPanelClosed(108, hVar);
            } else if (callback.onPreparePanel(0, null, hVar)) {
                callback.onMenuOpened(108, hVar);
            }
        }
    }

    public class e implements f.c {
        public e() {
        }
    }

    public q(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        z0 z0Var = new z0(toolbar, false);
        this.f86645a = z0Var;
        callback.getClass();
        this.f86646b = callback;
        z0Var.f5303m = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        z0Var.setWindowTitle(charSequence);
        this.f86647c = new e();
    }

    @Override // i.a
    public final void A(int i14) {
        z0 z0Var = this.f86645a;
        if (z0Var.f5306p == 1) {
            z0Var.x(i14);
        } else {
            vb.h.z("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    @Override // i.a
    public final void B(boolean z14) {
    }

    @Override // i.a
    public final void C(CharSequence charSequence) {
        this.f86645a.setTitle(charSequence);
    }

    @Override // i.a
    public final void D(CharSequence charSequence) {
        this.f86645a.setWindowTitle(charSequence);
    }

    @Override // i.a
    public final void E() {
        this.f86645a.v(0);
    }

    public final Menu G() {
        boolean z14 = this.f86649e;
        z0 z0Var = this.f86645a;
        if (!z14) {
            z0Var.f5291a.setMenuCallbacks(new c(), new d());
            this.f86649e = true;
        }
        return z0Var.f5291a.getMenu();
    }

    public final void H(int i14, int i15) {
        z0 z0Var = this.f86645a;
        z0Var.h((i14 & i15) | ((~i15) & z0Var.f5292b));
    }

    @Override // i.a
    public final boolean a() {
        return this.f86645a.f5291a.hideOverflowMenu();
    }

    @Override // i.a
    public final boolean b() {
        z0 z0Var = this.f86645a;
        if (!z0Var.f5291a.hasExpandedActionView()) {
            return false;
        }
        z0Var.collapseActionView();
        return true;
    }

    @Override // i.a
    public final void c(boolean z14) {
        if (z14 == this.f86650f) {
            return;
        }
        this.f86650f = z14;
        ArrayList<i.a.b> arrayList = this.f86651g;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.get(i14).a();
        }
    }

    @Override // i.a
    public final int d() {
        return this.f86645a.f5292b;
    }

    @Override // i.a
    public final Context e() {
        return this.f86645a.f5291a.getContext();
    }

    @Override // i.a
    public final CharSequence f() {
        return this.f86645a.f5291a.getTitle();
    }

    @Override // i.a
    public final void g() {
        this.f86645a.v(8);
    }

    @Override // i.a
    public final boolean h() {
        z0 z0Var = this.f86645a;
        Toolbar toolbar = z0Var.f5291a;
        a aVar = this.f86652h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = z0Var.f5291a;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // i.a
    public final boolean i() {
        return this.f86645a.f5291a.getVisibility() == 0;
    }

    @Override // i.a
    public final void j() {
    }

    @Override // i.a
    public final void k() {
        this.f86645a.f5291a.removeCallbacks(this.f86652h);
    }

    @Override // i.a
    public final boolean l(int i14, KeyEvent keyEvent) {
        Menu menuG = G();
        if (menuG == null) {
            return false;
        }
        menuG.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuG.performShortcut(i14, keyEvent, 0);
    }

    @Override // i.a
    public final boolean m(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            n();
        }
        return true;
    }

    @Override // i.a
    public final boolean n() {
        return this.f86645a.f5291a.showOverflowMenu();
    }

    @Override // i.a
    public final void o(ColorDrawable colorDrawable) {
        this.f86645a.f5291a.setBackground(colorDrawable);
    }

    @Override // i.a
    public final void p(boolean z14) {
    }

    @Override // i.a
    public final void q(boolean z14) {
        H(z14 ? 4 : 0, 4);
    }

    @Override // i.a
    @SuppressLint({"WrongConstant"})
    public final void r(int i14) {
        H(i14, -1);
    }

    @Override // i.a
    public final void s(boolean z14) {
        H(z14 ? 8 : 0, 8);
    }

    @Override // i.a
    public final void t() {
        this.f86645a.w(null);
    }

    @Override // i.a
    public final void u(int i14) {
        this.f86645a.j(i14);
    }

    @Override // i.a
    public final void v(int i14) {
        this.f86645a.s(i14);
    }

    @Override // i.a
    public final void w(Drawable drawable) {
        this.f86645a.p(drawable);
    }

    @Override // i.a
    public final void x(boolean z14) {
    }

    @Override // i.a
    public final void y(SpinnerAdapter spinnerAdapter, ConnectIQAppStoreActivity connectIQAppStoreActivity) {
        this.f86645a.m(spinnerAdapter, new p(connectIQAppStoreActivity));
    }

    @Override // i.a
    public final void z() {
        this.f86645a.o();
    }
}
