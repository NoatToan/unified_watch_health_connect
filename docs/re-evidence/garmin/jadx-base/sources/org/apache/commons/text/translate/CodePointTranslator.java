package org.apache.commons.text.translate;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodePointTranslator extends CharSequenceTranslator {
    @Override // org.apache.commons.text.translate.CharSequenceTranslator
    public final int translate(CharSequence charSequence, int i14, Writer writer) {
        return translate(Character.codePointAt(charSequence, i14), writer) ? 1 : 0;
    }

    public abstract boolean translate(int i14, Writer writer);
}
