package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import defpackage.hl1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f26498b;
    public d c;
    public LayoutInflater d;
    public LayoutInflater e;
    public h.a f;
    public int g;
    public int h;
    public i i;
    public int j;

    public a(Context context, int i, int i2) {
        this.f26497a = context;
        this.d = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    public static void g(d dVar, boolean z) {
        dVar.e(z);
    }

    public static f j(d dVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new f(dVar, i, i2, i3, i4, charSequence, i5);
    }

    public static boolean k(d dVar, d dVar2, MenuItem menuItem) {
        return dVar.g(dVar2, menuItem);
    }

    public static void n(d dVar, boolean z) {
        dVar.H(z);
    }

    public void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void b(d dVar, boolean z) {
        h.a aVar = this.f;
        if (aVar != null) {
            aVar.b(dVar, z);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void c(Context context, d dVar) {
        this.f26498b = context;
        this.e = LayoutInflater.from(context);
        this.c = dVar;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean d(d dVar, f fVar) {
        return false;
    }

    public abstract void e(f fVar, i.a aVar);

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean f(d dVar, f fVar) {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean h(j jVar) {
        h.a aVar = this.f;
        return aVar != null && aVar.c(jVar);
    }

    public i.a i(ViewGroup viewGroup) {
        return (i.a) hl1.a().c(Integer.valueOf(this.h), viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View l(f fVar, View view, ViewGroup viewGroup) {
        i.a aVarI = view instanceof i.a ? (i.a) view : i(viewGroup);
        e(fVar, aVarI);
        return (View) aVarI;
    }

    public i m(ViewGroup viewGroup) {
        if (this.i == null) {
            i iVar = (i) this.d.inflate(this.g, viewGroup, false);
            this.i = iVar;
            iVar.c(this.c);
            updateMenuView(true);
        }
        return this.i;
    }

    public void o(h.a aVar) {
        this.f = aVar;
    }

    public void p(int i) {
        this.j = i;
    }

    public abstract boolean q(int i, f fVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v2, types: [miuix.appcompat.internal.view.menu.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v0, types: [miuix.appcompat.internal.view.menu.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [miuix.appcompat.internal.view.menu.i] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
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
    @Override // miuix.appcompat.internal.view.menu.h
    public void updateMenuView(boolean z) {
        ?? r7 = this.i;
        ?? r0 = (ViewGroup) r7;
        if (r0 == 0) {
            return;
        }
        ?? D = r7.d();
        d dVar = this.c;
        if (dVar != null) {
            dVar.q();
            for (f fVar : this.c.C()) {
                if (q(D, fVar)) {
                    ?? childAt = r0.getChildAt(D);
                    f itemData = childAt instanceof i.a ? ((i.a) childAt).getItemData() : null;
                    View viewL = l(fVar, childAt, r0);
                    if (fVar != itemData) {
                        viewL.setPressed(false);
                    }
                    if (viewL != childAt) {
                        a(viewL, D);
                    }
                    if (fVar != null) {
                        fVar.A(viewL);
                        fVar.E();
                    }
                    D++;
                }
            }
        }
        while (D < r0.getChildCount()) {
            if (!this.i.b(D)) {
                D++;
            }
        }
    }
}
