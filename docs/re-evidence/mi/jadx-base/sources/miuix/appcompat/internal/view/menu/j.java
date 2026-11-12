package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class j extends d implements SubMenu {
    public f A;
    public d z;

    public j(Context context, d dVar, f fVar) {
        super(context);
        this.z = dVar;
        this.A = fVar;
    }

    @Override // miuix.appcompat.internal.view.menu.d
    public d B() {
        return this.z;
    }

    @Override // miuix.appcompat.internal.view.menu.d
    public boolean D() {
        return this.z.D();
    }

    @Override // miuix.appcompat.internal.view.menu.d
    public boolean E() {
        return this.z.E();
    }

    @Override // miuix.appcompat.internal.view.menu.d
    public void N(d.b bVar) {
        this.z.N(bVar);
    }

    public Menu c0() {
        return this.z;
    }

    @Override // miuix.appcompat.internal.view.menu.d, android.view.SubMenu
    public void clearHeader() {
    }

    public void d0(d dVar) {
        this.z = dVar;
    }

    @Override // miuix.appcompat.internal.view.menu.d
    public boolean f(f fVar) {
        return this.z.f(fVar);
    }

    @Override // miuix.appcompat.internal.view.menu.d
    public boolean g(d dVar, MenuItem menuItem) {
        return super.g(dVar, menuItem) || this.z.g(dVar, menuItem);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.A;
    }

    @Override // miuix.appcompat.internal.view.menu.d
    public boolean j(f fVar) {
        return this.z.j(fVar);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.S(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.V(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.W(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // miuix.appcompat.internal.view.menu.d, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.S(s().getResources().getDrawable(i));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.V(s().getResources().getString(i));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
