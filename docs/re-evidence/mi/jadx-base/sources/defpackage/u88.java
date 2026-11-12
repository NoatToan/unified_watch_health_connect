package defpackage;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class u88 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f35515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35516b = Integer.MAX_VALUE;
    public int c = 0;

    @RequiresApi(19)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f35517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c98 f35518b;

        public a(EditText editText, boolean z) {
            this.f35517a = editText;
            c98 c98Var = new c98(editText, z);
            this.f35518b = c98Var;
            editText.addTextChangedListener(c98Var);
            editText.setEditableFactory(v88.getInstance());
        }

        @Override // u88.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof y88) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new y88(keyListener);
        }

        @Override // u88.b
        public boolean b() {
            return this.f35518b.b();
        }

        @Override // u88.b
        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof w88 ? inputConnection : new w88(this.f35517a, inputConnection, editorInfo);
        }

        @Override // u88.b
        public void d(boolean z) {
            this.f35518b.d(z);
        }
    }

    public static class b {
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        public void d(boolean z) {
            throw null;
        }
    }

    public u88(EditText editText, boolean z) {
        g6i.h(editText, "editText cannot be null");
        this.f35515a = new a(editText, z);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f35515a.a(keyListener);
    }

    public boolean b() {
        return this.f35515a.b();
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f35515a.c(inputConnection, editorInfo);
    }

    public void d(boolean z) {
        this.f35515a.d(z);
    }
}
