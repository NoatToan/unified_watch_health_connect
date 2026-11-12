package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import defpackage.u88;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEmojiEditTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f1572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u88 f1573b;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.f1572a = editText;
        this.f1573b = new u88(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f1573b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean c() {
        return this.f1573b.b();
    }

    public void d(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f1572a.getContext().obtainStyledAttributes(attributeSet, z5j.i0, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(z5j.w0) ? typedArrayObtainStyledAttributes.getBoolean(z5j.w0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            f(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1573b.c(inputConnection, editorInfo);
    }

    public void f(boolean z) {
        this.f1573b.d(z);
    }
}
