package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import miuix.appcompat.internal.view.menu.d;

/* JADX INFO: loaded from: classes3.dex */
public class le0 extends ActionMode implements d.b, ke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f24957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<me0> f24958b;
    public ActionMode.Callback c;
    public d d;
    public a e;
    public boolean f = false;

    public interface a {
        void a(ActionMode actionMode);
    }

    public le0(Context context, ActionMode.Callback callback) {
        this.f24957a = context;
        this.c = callback;
        d dVarO = new d(context).O(1);
        this.d = dVarO;
        dVarO.N(this);
    }

    public boolean c() {
        this.d.a0();
        try {
            return this.c.onCreateActionMode(this, this.d);
        } finally {
            this.d.Z();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.d.b
    public boolean d(d dVar, MenuItem menuItem) {
        ActionMode.Callback callback = this.c;
        return callback != null && callback.onActionItemClicked(this, menuItem);
    }

    public void e(a aVar) {
        this.e = aVar;
    }

    public void f(me0 me0Var) {
        me0Var.c(this);
        this.f24958b = new WeakReference<>(me0Var);
    }

    @Override // android.view.ActionMode
    public void finish() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.f24958b.get().e();
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(this);
        }
        ActionMode.Callback callback = this.c;
        if (callback != null) {
            callback.onDestroyActionMode(this);
            this.c = null;
        }
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        throw new UnsupportedOperationException("getCustomView not supported");
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return this.d;
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return new MenuInflater(this.f24957a);
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        throw new UnsupportedOperationException("getSubtitle not supported");
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        throw new UnsupportedOperationException("getTitle not supported");
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.d.a0();
        try {
            this.c.onPrepareActionMode(this, this.d);
        } finally {
            this.d.Z();
        }
    }

    @Override // defpackage.ke0
    public void onStart(boolean z) {
    }

    @Override // defpackage.ke0
    public void onStop(boolean z) {
        ActionMode.Callback callback;
        if (z || (callback = this.c) == null) {
            return;
        }
        callback.onDestroyActionMode(this);
        this.c = null;
    }

    @Override // defpackage.ke0
    public void onUpdate(boolean z, float f) {
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        throw new UnsupportedOperationException("setCustomView not supported");
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        throw new UnsupportedOperationException("setSubTitle not supported");
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        throw new UnsupportedOperationException("setTitle not supported");
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        throw new UnsupportedOperationException("setSubTitle not supported");
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        throw new UnsupportedOperationException("setTitle not supported");
    }
}
