package org.apache.commons.text.translate;

import am.j;
import java.io.Writer;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class SinglePassTranslator extends CharSequenceTranslator {
    private String getClassName() {
        Class<?> cls = getClass();
        return cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName();
    }

    @Override // org.apache.commons.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i14, Writer writer) {
        if (i14 == 0) {
            translateWhole(charSequence, writer);
            return Character.codePointCount(charSequence, i14, charSequence.length());
        }
        h.s(j.o(getClassName(), ".translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index.", new StringBuilder()));
        return 0;
    }

    public abstract void translateWhole(CharSequence charSequence, Writer writer);
}
