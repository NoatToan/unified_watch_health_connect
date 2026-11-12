package com.miui.tsmclient.util;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.widget.EditText;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Formatter {
    protected EditText mEditText;
    protected char SEPARATOR = ' ';
    private TextWatcher mFormattingTextWatcher = new FormattingTextWatcher();

    public class FormattingTextWatcher implements TextWatcher {
        private int mDeletedIndex;
        private boolean mDeletedIsSeparator;
        private boolean mStopFormatting = false;

        public FormattingTextWatcher() {
        }

        private boolean hasSeparator(CharSequence charSequence, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                if (Formatter.this.isSeparator(charSequence.charAt(i3))) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.mDeletedIsSeparator) {
                this.mDeletedIsSeparator = false;
                Formatter.this.mEditText.getEditableText().insert(this.mDeletedIndex, Character.toString(Formatter.this.getSeparator()));
                Formatter.this.mEditText.setSelection(this.mDeletedIndex);
            } else {
                if (this.mStopFormatting) {
                    return;
                }
                this.mStopFormatting = true;
                Formatter.this.format(editable);
                Formatter.this.afterFormat(editable);
                this.mStopFormatting = false;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.mStopFormatting && i2 > 0 && hasSeparator(charSequence, i, i2)) {
                this.mDeletedIsSeparator = true;
                this.mDeletedIndex = i;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afterFormat(Editable editable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable);
        clean(spannableStringBuilder);
        setContentDescription(spannableStringBuilder.toString());
    }

    public void bindFormattingTextWatcher(EditText editText) {
        this.mEditText = editText;
        editText.removeTextChangedListener(this.mFormattingTextWatcher);
        this.mEditText.addTextChangedListener(this.mFormattingTextWatcher);
    }

    public String clean(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        clean(spannableStringBuilder);
        return spannableStringBuilder.toString();
    }

    public String cover(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        cover(spannableStringBuilder);
        return spannableStringBuilder.toString();
    }

    public String format(String str) {
        if (str == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        format(spannableStringBuilder);
        return spannableStringBuilder.toString();
    }

    public abstract void format(Editable editable);

    public char getSeparator() {
        return this.SEPARATOR;
    }

    public boolean isSeparator(char c) {
        return this.SEPARATOR == c;
    }

    public abstract boolean isValid(String str);

    public boolean isValidCharacter(char c) {
        return Character.isDigit(c);
    }

    public void setContentDescription(String str) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setContentDescription(str);
        }
    }

    public void unbindFormattingTextWatcher() {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.removeTextChangedListener(this.mFormattingTextWatcher);
        }
        this.mEditText = null;
    }

    public void clean(Editable editable) {
        int i = 0;
        while (i < editable.length()) {
            if (isValidCharacter(editable.charAt(i))) {
                i++;
            } else {
                editable.delete(i, i + 1);
            }
        }
    }

    public void cover(Editable editable) {
        format(editable);
        int i = 0;
        for (int length = editable.length() - 1; length >= 0; length--) {
            if (!isSeparator(editable.charAt(length)) && (i = i + 1) > 4) {
                editable.replace(length, length + 1, Marker.ANY_MARKER);
            }
        }
    }
}
