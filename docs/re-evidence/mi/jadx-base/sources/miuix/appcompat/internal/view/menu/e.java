package miuix.appcompat.internal.view.menu;

import android.R;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import defpackage.awi;

/* JADX INFO: loaded from: classes3.dex */
public class e implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f26542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public miuix.appcompat.app.c f26543b;
    public c c;
    public h.a d;

    public e(d dVar) {
        this.f26542a = dVar;
    }

    public void a() {
        miuix.appcompat.app.c cVar = this.f26543b;
        if (cVar != null) {
            cVar.dismiss();
            this.f26543b = null;
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h.a
    public void b(d dVar, boolean z) {
        if (z || dVar == this.f26542a) {
            a();
        }
        h.a aVar = this.d;
        if (aVar != null) {
            aVar.b(dVar, z);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h.a
    public boolean c(d dVar) {
        h.a aVar = this.d;
        return aVar != null && aVar.c(dVar);
    }

    public void d(h.a aVar) {
        this.d = aVar;
    }

    public void e(IBinder iBinder) {
        d dVar = this.f26542a;
        miuix.appcompat.app.c.a aVar = new miuix.appcompat.app.c.a(dVar.s());
        c cVar = new c(dVar.s(), awi.v);
        this.c = cVar;
        cVar.i(this);
        this.f26542a.c(this.c);
        aVar.c(this.c.e(), this);
        View viewW = dVar.w();
        if (viewW != null) {
            aVar.f(viewW);
        } else {
            aVar.j(dVar.u()).z(dVar.v());
        }
        aVar.o(R.string.cancel, null);
        aVar.t(this);
        miuix.appcompat.app.c cVarB = aVar.b();
        this.f26543b = cVarB;
        cVarB.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f26543b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f26543b.show();
        attributes.setTitle("");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f26542a.I((f) this.c.e().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.c.b(this.f26542a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                miuix.appcompat.app.c cVar = this.f26543b;
                if (cVar == null) {
                    return false;
                }
                Window window = cVar.getWindow();
                if (window != null && (decorView2 = window.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                miuix.appcompat.app.c cVar2 = this.f26543b;
                if (cVar2 == null) {
                    return false;
                }
                Window window2 = cVar2.getWindow();
                if (window2 != null && (decorView = window2.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                    this.f26542a.e(true);
                    dialogInterface.dismiss();
                    return true;
                }
            }
        }
        return this.f26542a.performShortcut(i, keyEvent, 0);
    }
}
