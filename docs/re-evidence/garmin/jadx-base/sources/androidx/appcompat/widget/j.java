package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f5161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c8.a f5162b;

    public j(EditText editText) {
        this.f5161a = editText;
        this.f5162b = new c8.a(editText, false);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.f5162b.f25261a.getClass();
        if (keyListener instanceof c8.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new c8.e(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i14) {
        TypedArray typedArrayObtainStyledAttributes = this.f5161a.getContext().obtainStyledAttributes(attributeSet, h.a.f80429i, i14, 0);
        try {
            boolean z14 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z14);
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public final c8.c c(InputConnection inputConnection, EditorInfo editorInfo) {
        c8.a aVar = this.f5162b;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            c8.a.C0374a c0374a = aVar.f25261a;
            c0374a.getClass();
            if (!(inputConnection instanceof c8.c)) {
                inputConnection = new c8.c(c0374a.f25262a, inputConnection, editorInfo);
            }
        }
        return (c8.c) inputConnection;
    }

    public final void d(boolean z14) {
        c8.g gVar = this.f5162b.f25261a.f25263b;
        if (gVar.f25283d != z14) {
            if (gVar.f25282c != null) {
                androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
                c8.g.a aVar = gVar.f25282c;
                dVarA.getClass();
                k7.h.e(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = dVarA.f7032a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    dVarA.f7033b.remove(aVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th3) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th3;
                }
            }
            gVar.f25283d = z14;
            if (z14) {
                c8.g.a(gVar.f25280a, androidx.emoji2.text.d.a().c());
            }
        }
    }
}
