package c8;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f25269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f25270b;

    public static class a extends androidx.emoji2.text.d.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f25271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference f25272b;

        public a(TextView textView, d dVar) {
            this.f25271a = new WeakReference(textView);
            this.f25272b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f25271a.get();
            InputFilter inputFilter = (InputFilter) this.f25272b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            dVarA.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceH = dVarA.h(0, length, 0, text);
                        if (text == charSequenceH) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceH);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceH);
                        textView.setText(charSequenceH);
                        if (charSequenceH instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceH;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public d(TextView textView) {
        this.f25269a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
        TextView textView = this.f25269a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iC = androidx.emoji2.text.d.a().c();
        if (iC != 0) {
            if (iC == 1) {
                if ((i17 == 0 && i16 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i14 != 0 || i15 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i14, i15);
                }
                return androidx.emoji2.text.d.a().h(0, charSequence.length(), 0, charSequence);
            }
            if (iC != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
        if (this.f25270b == null) {
            this.f25270b = new a(textView, this);
        }
        dVarA.i(this.f25270b);
        return charSequence;
    }
}
