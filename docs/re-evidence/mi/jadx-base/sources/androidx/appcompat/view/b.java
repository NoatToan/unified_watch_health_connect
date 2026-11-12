package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import defpackage.nqf;
import defpackage.pqf;
import defpackage.vpo;
import defpackage.xpo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class b extends android.view.ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionMode f1473b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class a implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.ActionMode.Callback f1474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f1475b;
        public final ArrayList<b> c = new ArrayList<>();
        public final SimpleArrayMap<Menu, Menu> d = new SimpleArrayMap<>();

        public a(Context context, android.view.ActionMode.Callback callback) {
            this.f1475b = context;
            this.f1474a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean a(ActionMode actionMode, Menu menu) {
            return this.f1474a.onCreateActionMode(e(actionMode), f(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean b(ActionMode actionMode, MenuItem menuItem) {
            return this.f1474a.onActionItemClicked(e(actionMode), new nqf(this.f1475b, (xpo) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean c(ActionMode actionMode, Menu menu) {
            return this.f1474a.onPrepareActionMode(e(actionMode), f(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void d(ActionMode actionMode) {
            this.f1474a.onDestroyActionMode(e(actionMode));
        }

        public android.view.ActionMode e(ActionMode actionMode) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                b bVar = this.c.get(i);
                if (bVar != null && bVar.f1473b == actionMode) {
                    return bVar;
                }
            }
            b bVar2 = new b(this.f1475b, actionMode);
            this.c.add(bVar2);
            return bVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            pqf pqfVar = new pqf(this.f1475b, (vpo) menu);
            this.d.put(menu, pqfVar);
            return pqfVar;
        }
    }

    public b(Context context, ActionMode actionMode) {
        this.f1472a = context;
        this.f1473b = actionMode;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1473b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1473b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new pqf(this.f1472a, (vpo) this.f1473b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1473b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1473b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1473b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1473b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1473b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1473b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1473b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1473b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1473b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1473b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1473b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f1473b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f1473b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f1473b.q(i);
    }
}
