package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f4710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f4711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f4712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n.a f4713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f4716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4717i;

    public b(Context context, int i14, int i15) {
        this.f4709a = context;
        this.f4712d = LayoutInflater.from(context);
        this.f4714f = i14;
        this.f4715g = i15;
    }

    public abstract void a(j jVar, o.a aVar);

    public boolean b(ViewGroup viewGroup, int i14) {
        viewGroup.removeViewAt(i14);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View c(j jVar, View view2, ViewGroup viewGroup) {
        o.a aVar;
        if (view2 instanceof o.a) {
            aVar = (o.a) view2;
        } else {
            aVar = (o.a) this.f4712d.inflate(this.f4715g, viewGroup, false);
        }
        a(jVar, aVar);
        return (View) aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean collapseItemActionView(h hVar, j jVar) {
        return false;
    }

    public boolean d(j jVar) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean expandItemActionView(h hVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final int getId() {
        return this.f4717i;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(Context context, h hVar) {
        this.f4710b = context;
        LayoutInflater.from(context);
        this.f4711c = hVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(h hVar, boolean z14) {
        n.a aVar = this.f4713e;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z14);
        }
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
    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        n.a aVar = this.f4713e;
        h hVar = sVar;
        if (aVar == null) {
            return false;
        }
        if (sVar == null) {
            hVar = this.f4711c;
        }
        return aVar.a(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z14) {
        ViewGroup viewGroup = (ViewGroup) this.f4716h;
        if (viewGroup == null) {
            return;
        }
        h hVar = this.f4711c;
        int i14 = 0;
        if (hVar != null) {
            hVar.flagActionItems();
            ArrayList<j> visibleItems = this.f4711c.getVisibleItems();
            int size = visibleItems.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size; i16++) {
                j jVar = visibleItems.get(i16);
                if (d(jVar)) {
                    View childAt = viewGroup.getChildAt(i15);
                    j itemData = childAt instanceof o.a ? ((o.a) childAt).getItemData() : null;
                    View viewC = c(jVar, childAt, viewGroup);
                    if (jVar != itemData) {
                        viewC.setPressed(false);
                        viewC.jumpDrawablesToCurrentState();
                    }
                    if (viewC != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewC.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewC);
                        }
                        ((ViewGroup) this.f4716h).addView(viewC, i15);
                    }
                    i15++;
                }
            }
            i14 = i15;
        }
        while (i14 < viewGroup.getChildCount()) {
            if (!b(viewGroup, i14)) {
                i14++;
            }
        }
    }
}
