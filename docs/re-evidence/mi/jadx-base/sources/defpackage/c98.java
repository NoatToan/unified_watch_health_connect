package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class c98 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f5071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5072b;
    public c.e c;
    public int d = Integer.MAX_VALUE;
    public int e = 0;
    public boolean f = true;

    @RequiresApi(19)
    public static class a extends c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<EditText> f5073a;

        public a(EditText editText) {
            this.f5073a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.e
        public void b() {
            super.b();
            c98.c(this.f5073a.get(), 1);
        }
    }

    public c98(EditText editText, boolean z) {
        this.f5071a = editText;
        this.f5072b = z;
    }

    public static void c(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            c.b().o(editableText);
            x88.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final c.e a() {
        if (this.c == null) {
            this.c = new a(this.f5071a);
        }
        return this.c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    public boolean b() {
        return this.f;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void d(boolean z) {
        if (this.f != z) {
            if (this.c != null) {
                c.b().t(this.c);
            }
            this.f = z;
            if (z) {
                c(this.f5071a, c.b().d());
            }
        }
    }

    public final boolean e() {
        return (this.f && (this.f5072b || c.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f5071a.isInEditMode() || e() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iD = c.b().d();
        if (iD != 0) {
            if (iD == 1) {
                c.b().r((Spannable) charSequence, i, i + i3, this.d, this.e);
                return;
            } else if (iD != 3) {
                return;
            }
        }
        c.b().s(a());
    }
}
