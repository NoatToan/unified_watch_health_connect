package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class x88 implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f38840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.e f38841b;

    @RequiresApi(19)
    public static class a extends c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<TextView> f38842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Reference<x88> f38843b;

        public a(TextView textView, x88 x88Var) {
            this.f38842a = new WeakReference(textView);
            this.f38843b = new WeakReference(x88Var);
        }

        @Override // androidx.emoji2.text.c.e
        public void b() {
            CharSequence text;
            CharSequence charSequenceO;
            super.b();
            TextView textView = this.f38842a.get();
            if (c(textView, this.f38843b.get()) && textView.isAttachedToWindow() && text != (charSequenceO = c.b().o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceO);
                int selectionEnd = Selection.getSelectionEnd(charSequenceO);
                textView.setText(charSequenceO);
                if (charSequenceO instanceof Spannable) {
                    x88.b((Spannable) charSequenceO, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public x88(TextView textView) {
        this.f38840a = textView;
    }

    public static void b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public final c.e a() {
        if (this.f38841b == null) {
            this.f38841b = new a(this.f38840a, this);
        }
        return this.f38841b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f38840a.isInEditMode()) {
            return charSequence;
        }
        int iD = c.b().d();
        if (iD != 0) {
            if (iD == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f38840a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return c.b().p(charSequence, 0, charSequence.length());
            }
            if (iD != 3) {
                return charSequence;
            }
        }
        c.b().s(a());
        return charSequence;
    }
}
