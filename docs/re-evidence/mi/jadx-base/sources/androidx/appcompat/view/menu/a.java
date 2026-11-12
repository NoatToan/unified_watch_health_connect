package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1485b;
    public e c;
    public LayoutInflater d;
    public LayoutInflater e;
    public i.a f;
    public int g;
    public int h;
    public MenuView i;
    public int j;

    public a(Context context, int i, int i2) {
        this.f1484a = context;
        this.d = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        i.a aVar = this.f;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(Context context, e eVar) {
        this.f1485b = context;
        this.e = LayoutInflater.from(context);
        this.c = eVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(i.a aVar) {
        this.f = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.i
    public boolean g(k kVar) {
        i.a aVar = this.f;
        e eVar = kVar;
        if (aVar == null) {
            return false;
        }
        if (kVar == null) {
            eVar = this.c;
        }
        return aVar.c(eVar);
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.j;
    }

    public void h(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    public abstract void i(g gVar, MenuView.ItemView itemView);

    public MenuView.ItemView j(ViewGroup viewGroup) {
        return (MenuView.ItemView) this.d.inflate(this.h, viewGroup, false);
    }

    public boolean k(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public i.a l() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View m(g gVar, View view, ViewGroup viewGroup) {
        MenuView.ItemView itemViewJ = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : j(viewGroup);
        i(gVar, itemViewJ);
        return (View) itemViewJ;
    }

    public MenuView n(ViewGroup viewGroup) {
        if (this.i == null) {
            MenuView menuView = (MenuView) this.d.inflate(this.g, viewGroup, false);
            this.i = menuView;
            menuView.b(this.c);
            updateMenuView(true);
        }
        return this.i;
    }

    public void o(int i) {
        this.j = i;
    }

    public abstract boolean p(int i, g gVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.c;
        int i = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList<g> arrayListG = this.c.G();
            int size = arrayListG.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = arrayListG.get(i3);
                if (p(i2, gVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    g itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                    View viewM = m(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewM.setPressed(false);
                        viewM.jumpDrawablesToCurrentState();
                    }
                    if (viewM != childAt) {
                        h(viewM, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!k(viewGroup, i)) {
                i++;
            }
        }
    }
}
