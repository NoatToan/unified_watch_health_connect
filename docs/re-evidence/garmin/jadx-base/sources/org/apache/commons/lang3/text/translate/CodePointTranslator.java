package org.apache.commons.lang3.text.translate;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class CodePointTranslator extends CharSequenceTranslator {
    @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
    public final int translate(CharSequence charSequence, int i14, Writer writer) {
        return translate(Character.codePointAt(charSequence, i14), writer) ? 1 : 0;
    }

    public abstract boolean translate(int i14, Writer writer);
}
