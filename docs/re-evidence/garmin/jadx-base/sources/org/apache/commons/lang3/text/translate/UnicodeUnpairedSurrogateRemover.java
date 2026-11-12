package org.apache.commons.lang3.text.translate;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class UnicodeUnpairedSurrogateRemover extends CodePointTranslator {
    @Override // org.apache.commons.lang3.text.translate.CodePointTranslator
    public boolean translate(int i14, Writer writer) {
        return i14 >= 55296 && i14 <= 57343;
    }
}
