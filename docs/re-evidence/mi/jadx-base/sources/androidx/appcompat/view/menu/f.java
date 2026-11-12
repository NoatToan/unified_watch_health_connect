package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import defpackage.mwi;

/* JADX INFO: loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.a f1507b;
    public c c;
    public i.a d;

    public f(e eVar) {
        this.f1506a = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.f1507b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void b(e eVar, boolean z) {
        if (z || eVar == this.f1506a) {
            a();
        }
        i.a aVar = this.d;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean c(e eVar) {
        i.a aVar = this.d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f1506a;
        androidx.appcompat.app.a.C0006a c0006a = new androidx.appcompat.app.a.C0006a(eVar.w());
        c cVar = new c(c0006a.getContext(), mwi.l);
        this.c = cVar;
        cVar.f(this);
        this.f1506a.b(this.c);
        c0006a.a(this.c.a(), this);
        View viewA = eVar.A();
        if (viewA != null) {
            c0006a.c(viewA);
        } else {
            c0006a.d(eVar.y()).setTitle(eVar.z());
        }
        c0006a.h(this);
        androidx.appcompat.app.a aVarCreate = c0006a.create();
        this.f1507b = aVarCreate;
        aVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1507b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1507b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1506a.N((g) this.c.a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.c.b(this.f1506a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1507b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1507b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1506a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1506a.performShortcut(i, keyEvent, 0);
    }
}
