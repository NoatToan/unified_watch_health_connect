package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractCharacterFilterReader extends FilterReader {
    public AbstractCharacterFilterReader(Reader reader) {
        super(reader);
    }

    public abstract boolean filter(int i14);

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i14, int i15) throws IOException {
        int i16 = super.read(cArr, i14, i15);
        if (i16 == -1) {
            return -1;
        }
        int i17 = i14 - 1;
        for (int i18 = i14; i18 < i14 + i16; i18++) {
            if (!filter(cArr[i18]) && (i17 = i17 + 1) < i18) {
                cArr[i17] = cArr[i18];
            }
        }
        return (i17 - i14) + 1;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i14;
        do {
            i14 = ((FilterReader) this).in.read();
        } while (filter(i14));
        return i14;
    }
}
