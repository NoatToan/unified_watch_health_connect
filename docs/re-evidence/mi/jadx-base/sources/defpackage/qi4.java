package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.EventLog;
import android.view.ContextMenu;
import android.view.View;
import miuix.appcompat.internal.view.menu.d;
import miuix.appcompat.internal.view.menu.e;

/* JADX INFO: loaded from: classes3.dex */
public class qi4 extends d implements ContextMenu {
    public si4 z;

    public qi4(Context context) {
        super(context);
    }

    public boolean c0() {
        si4 si4Var = this.z;
        if (si4Var instanceof si4) {
            return si4Var.b().isShowing();
        }
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.d, android.view.Menu
    public void close() {
        super.close();
        si4 si4Var = this.z;
        if (si4Var != null) {
            si4Var.a();
            this.z = null;
        }
    }

    public void d0() {
        si4 si4Var = this.z;
        if (si4Var instanceof si4) {
            si4Var.c();
        }
    }

    public si4 e0(View view, IBinder iBinder, float f, float f2) {
        if (view != null) {
            view.createContextMenu(this);
        }
        if (C().size() <= 0) {
            return null;
        }
        EventLog.writeEvent(50001, 1);
        si4 si4Var = new si4(this);
        this.z = si4Var;
        si4Var.e(iBinder, view, f, f2);
        return this.z;
    }

    public e f0(View view, IBinder iBinder) {
        if (view != null) {
            view.createContextMenu(this);
        }
        if (C().size() <= 0) {
            return null;
        }
        EventLog.writeEvent(50001, 1);
        e eVar = new e(this);
        eVar.e(iBinder);
        return eVar;
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderIcon(Drawable drawable) {
        return (ContextMenu) super.S(drawable);
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderTitle(CharSequence charSequence) {
        return (ContextMenu) super.V(charSequence);
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderView(View view) {
        return (ContextMenu) super.W(view);
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderIcon(int i) {
        return (ContextMenu) super.R(i);
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderTitle(int i) {
        return (ContextMenu) super.U(i);
    }
}
