package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.c;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class y88 implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f39924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39925b;

    public static class a {
        public boolean a(Editable editable, int i, KeyEvent keyEvent) {
            return c.f(editable, i, keyEvent);
        }
    }

    public y88(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f39924a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f39924a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f39925b.a(editable, i, keyEvent) || this.f39924a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f39924a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f39924a.onKeyUp(view, editable, i, keyEvent);
    }

    public y88(KeyListener keyListener, a aVar) {
        this.f39924a = keyListener;
        this.f39925b = aVar;
    }
}
