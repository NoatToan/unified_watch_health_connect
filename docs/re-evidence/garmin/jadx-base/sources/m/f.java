package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f115437b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f115438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f115439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<f> f115440c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k1<Menu, Menu> f115441d = new k1<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f115439b = context;
            this.f115438a = callback;
        }

        @Override // m.b.a
        public final void a(b bVar) {
            this.f115438a.onDestroyActionMode(e(bVar));
        }

        @Override // m.b.a
        public final boolean b(b bVar, Menu menu) {
            f fVarE = e(bVar);
            k1<Menu, Menu> k1Var = this.f115441d;
            Menu pVar = k1Var.get(menu);
            if (pVar == null) {
                pVar = new p(this.f115439b, (e7.a) menu);
                k1Var.put(menu, pVar);
            }
            return this.f115438a.onPrepareActionMode(fVarE, pVar);
        }

        @Override // m.b.a
        public final boolean c(b bVar, Menu menu) {
            f fVarE = e(bVar);
            k1<Menu, Menu> k1Var = this.f115441d;
            Menu pVar = k1Var.get(menu);
            if (pVar == null) {
                pVar = new p(this.f115439b, (e7.a) menu);
                k1Var.put(menu, pVar);
            }
            return this.f115438a.onCreateActionMode(fVarE, pVar);
        }

        @Override // m.b.a
        public final boolean d(b bVar, MenuItem menuItem) {
            return this.f115438a.onActionItemClicked(e(bVar), new k(this.f115439b, (e7.b) menuItem));
        }

        public final f e(b bVar) {
            ArrayList<f> arrayList = this.f115440c;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                f fVar = arrayList.get(i14);
                if (fVar != null && fVar.f115437b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f115439b, bVar);
            arrayList.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f115436a = context;
        this.f115437b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f115437b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f115437b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new p(this.f115436a, this.f115437b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f115437b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f115437b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f115437b.f115422a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f115437b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f115437b.f115423b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f115437b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f115437b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view2) {
        this.f115437b.i(view2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f115437b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f115437b.f115422a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f115437b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z14) {
        this.f115437b.n(z14);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i14) {
        this.f115437b.j(i14);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i14) {
        this.f115437b.l(i14);
    }
}
