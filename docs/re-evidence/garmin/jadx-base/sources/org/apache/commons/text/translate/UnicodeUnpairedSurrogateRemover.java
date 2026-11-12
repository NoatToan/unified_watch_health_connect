package org.apache.commons.text.translate;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class UnicodeUnpairedSurrogateRemover extends CodePointTranslator {
    @Override // org.apache.commons.text.translate.CodePointTranslator
    public boolean translate(int i14, Writer writer) {
        return i14 >= 55296 && i14 <= 57343;
    }
}
