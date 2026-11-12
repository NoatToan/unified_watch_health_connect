package c8;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f25273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f25274b;

    public static class a {
    }

    public e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view2, Editable editable, int i14) {
        this.f25273a.clearMetaKeyState(view2, editable, i14);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f25273a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view2, Editable editable, int i14, KeyEvent keyEvent) {
        boolean zA;
        boolean z14;
        this.f25274b.getClass();
        if (i14 != 67) {
            zA = i14 != 112 ? false : androidx.emoji2.text.f.a(editable, keyEvent, true);
        } else {
            zA = androidx.emoji2.text.f.a(editable, keyEvent, false);
        }
        if (zA) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z14 = true;
        } else {
            z14 = false;
        }
        return z14 || this.f25273a.onKeyDown(view2, editable, i14, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view2, Editable editable, KeyEvent keyEvent) {
        return this.f25273a.onKeyOther(view2, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view2, Editable editable, int i14, KeyEvent keyEvent) {
        return this.f25273a.onKeyUp(view2, editable, i14, keyEvent);
    }

    public e(KeyListener keyListener, a aVar) {
        this.f25273a = keyListener;
        this.f25274b = aVar;
    }
}
