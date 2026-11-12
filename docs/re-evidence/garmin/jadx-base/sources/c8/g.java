package c8;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f25280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f25282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25283d = true;

    public static class a extends androidx.emoji2.text.d.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f25284a;

        public a(EditText editText) {
            this.f25284a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            g.a((EditText) this.f25284a.get(), 1);
        }
    }

    public g(EditText editText, boolean z14) {
        this.f25280a = editText;
        this.f25281b = z14;
    }

    public static void a(EditText editText, int i14) {
        int length;
        if (i14 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
            if (editableText == null) {
                length = 0;
            } else {
                dVarA.getClass();
                length = editableText.length();
            }
            dVarA.h(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        EditText editText = this.f25280a;
        if (editText.isInEditMode() || !this.f25283d) {
            return;
        }
        if ((this.f25281b || androidx.emoji2.text.d.e()) && i15 <= i16 && (charSequence instanceof Spannable)) {
            int iC = androidx.emoji2.text.d.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    androidx.emoji2.text.d.a().h(i14, i16 + i14, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
            if (this.f25282c == null) {
                this.f25282c = new a(editText);
            }
            dVarA.i(this.f25282c);
        }
    }
}
