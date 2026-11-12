package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f.a;

/* JADX INFO: loaded from: classes.dex */
public class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f4770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.e f4771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f4772c;

    public i(h hVar) {
        this.f4770a = hVar;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final boolean a(h hVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        f fVar = this.f4772c;
        if (fVar.f4761h == null) {
            fVar.f4761h = fVar.new a();
        }
        this.f4770a.performItemAction((j) fVar.f4761h.getItem(i14), 0);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final void onCloseMenu(h hVar, boolean z14) {
        androidx.appcompat.app.e eVar;
        if ((z14 || hVar == this.f4770a) && (eVar = this.f4771b) != null) {
            eVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f4772c.onCloseMenu(this.f4770a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i14, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        h hVar = this.f4770a;
        if (i14 == 82 || i14 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4771b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4771b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                hVar.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return hVar.performShortcut(i14, keyEvent, 0);
    }
}
