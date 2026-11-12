package q2;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq2/k;", "Landroid/view/ActionMode$Callback2;", "Landroid/view/ActionMode$Callback;", "Lq2/n;", "textActionModeCallback", "<init>", "(Lq2/n;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f142182a;

    public k(n nVar) {
        this.f142182a = nVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f142182a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f142182a.a(menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f142182a.d();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view2, Rect rect) {
        n4.d dVarB = this.f142182a.b();
        rect.set(Math.round(dVarB.f123547a), Math.round(dVarB.f123548b), Math.round(dVarB.f123549c), Math.round(dVarB.f123550d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f142182a.c(menu);
    }
}
