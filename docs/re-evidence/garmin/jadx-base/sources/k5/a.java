package k5;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import n4.d;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk5/a;", "Landroid/view/ActionMode$Callback2;", "Lk5/c;", "callback", "<init>", "(Lk5/c;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f102898a;

    public a(c cVar) {
        this.f102898a = cVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        c cVar = this.f102898a;
        cVar.getClass();
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.f102905a) {
            e23.a<Unit> aVar = cVar.f102910c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == b.Paste.f102905a) {
            e23.a<Unit> aVar2 = cVar.f102911d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == b.Cut.f102905a) {
            e23.a<Unit> aVar3 = cVar.f102912e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == b.SelectAll.f102905a) {
            e23.a<Unit> aVar4 = cVar.f102913f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            if (itemId != b.Autofill.f102905a) {
                return false;
            }
            e23.a<Unit> aVar5 = cVar.f102914g;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        c cVar = this.f102898a;
        cVar.getClass();
        if (menu == null) {
            h.s("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            h.s("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (cVar.f102910c != null) {
            c.a(menu, b.Copy);
        }
        if (cVar.f102911d != null) {
            c.a(menu, b.Paste);
        }
        if (cVar.f102912e != null) {
            c.a(menu, b.Cut);
        }
        if (cVar.f102913f != null) {
            c.a(menu, b.SelectAll);
        }
        if (cVar.f102914g == null) {
            return true;
        }
        c.a(menu, b.Autofill);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        e23.a<Unit> aVar = this.f102898a.f102908a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view2, Rect rect) {
        d dVar = this.f102898a.f102909b;
        if (rect != null) {
            rect.set((int) dVar.f123547a, (int) dVar.f123548b, (int) dVar.f123549c, (int) dVar.f123550d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        c cVar = this.f102898a;
        cVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        c.b(menu, b.Copy, cVar.f102910c);
        c.b(menu, b.Paste, cVar.f102911d);
        c.b(menu, b.Cut, cVar.f102912e);
        c.b(menu, b.SelectAll, cVar.f102913f);
        c.b(menu, b.Autofill, cVar.f102914g);
        return true;
    }
}
