package org.apache.commons.io.input;

import java.io.Reader;

/* JADX INFO: loaded from: classes3.dex */
public class CharacterFilterReader extends AbstractCharacterFilterReader {
    private final int skip;

    public CharacterFilterReader(Reader reader, int i14) {
        super(reader);
        this.skip = i14;
    }

    @Override // org.apache.commons.io.input.AbstractCharacterFilterReader
    public boolean filter(int i14) {
        return i14 == this.skip;
    }
}
