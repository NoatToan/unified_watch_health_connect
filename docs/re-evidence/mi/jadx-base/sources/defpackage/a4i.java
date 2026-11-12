package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import miuix.appcompat.internal.view.menu.d;

/* JADX INFO: loaded from: classes3.dex */
public class a4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f607b;
    public final View c;
    public f4i d;
    public c e;

    public class a extends f4i {
        public a(Context context) {
            super(context);
        }

        @Override // defpackage.f4i
        public void o0() {
            a4i.b(a4i.this);
        }

        @Override // defpackage.f4i
        public void p0(MenuItem menuItem) {
            if (a4i.this.e != null) {
                a4i.this.e.onMenuItemClick(menuItem);
            }
        }
    }

    public interface b {
    }

    public interface c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public a4i(Context context, View view) {
        this(context, view, 0);
    }

    public static /* synthetic */ b b(a4i a4iVar) {
        a4iVar.getClass();
        return null;
    }

    public void c() {
        this.d.dismiss();
    }

    public Menu d() {
        return this.f607b;
    }

    public final MenuInflater e() {
        return new wpo(this.f606a);
    }

    public void f(int i) {
        e().inflate(i, this.f607b);
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
    public void g() {
        this.d.k(this.f607b);
        this.d.showAsDropDown(this.c);
    }

    public void setOnDismissListener(b bVar) {
    }

    public void setOnMenuItemClickListener(c cVar) {
        this.e = cVar;
    }

    public a4i(Context context, View view, int i) {
        if (i == 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, g5j.M3, zhi.K, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(g5j.N3, 0);
                typedArrayObtainStyledAttributes.recycle();
                i = resourceId;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        if (i != 0) {
            this.f606a = new ContextThemeWrapper(context, i);
        } else {
            this.f606a = context;
        }
        this.c = view;
        this.f607b = new d(this.f606a);
        this.d = new a(this.f606a);
    }
}
