package org.apache.commons.text.io;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;
import org.apache.commons.text.TextStringBuilder;
import org.apache.commons.text.matcher.StringMatcher;
import org.apache.commons.text.matcher.StringMatcherFactory;

/* JADX INFO: loaded from: classes3.dex */
public class StringSubstitutorReader extends FilterReader {
    private static final int EOS = -1;
    private final TextStringBuilder buffer;
    private boolean eos;
    private final StringMatcher prefixEscapeMatcher;
    private final char[] read1CharBuffer;
    private final StringSubstitutor stringSubstitutor;
    private int toDrain;

    public StringSubstitutorReader(Reader reader, StringSubstitutor stringSubstitutor) {
        super(reader);
        this.buffer = new TextStringBuilder();
        this.read1CharBuffer = new char[]{0};
        Objects.requireNonNull(stringSubstitutor);
        this.stringSubstitutor = stringSubstitutor;
        this.prefixEscapeMatcher = StringMatcherFactory.INSTANCE.charMatcher(stringSubstitutor.getEscapeChar()).andThen(stringSubstitutor.getVariablePrefixMatcher());
    }

    private int buffer(int i14) throws IOException {
        int from = this.buffer.readFrom(((FilterReader) this).in, i14);
        this.eos = from == -1;
        return from;
    }

    private int bufferOrDrainOnEos(int i14, char[] cArr, int i15, int i16) {
        return drainOnEos(buffer(i14), cArr, i15, i16);
    }

    private int drain(char[] cArr, int i14, int i15) {
        int iDrainChars = this.buffer.drainChars(0, Math.min(this.buffer.length(), i15), cArr, i14);
        this.toDrain -= iDrainChars;
        if (!this.buffer.isEmpty() && this.toDrain != 0) {
            return iDrainChars;
        }
        this.toDrain = 0;
        return iDrainChars;
    }

    private int drainOnEos(int i14, char[] cArr, int i15, int i16) {
        if (i14 != -1) {
            return i14;
        }
        if (!this.buffer.isNotEmpty()) {
            return -1;
        }
        this.toDrain = this.buffer.size();
        return drain(cArr, i15, i16);
    }

    private boolean isBufferMatchAt(StringMatcher stringMatcher, int i14) {
        return stringMatcher.isMatch(this.buffer, i14) == stringMatcher.size();
    }

    private boolean isDraining() {
        return this.toDrain > 0;
    }

    private int readCount(int i14, int i15) {
        int size = this.buffer.size() - i15;
        if (size >= i14) {
            return 0;
        }
        return i14 - size;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i14, int i15) throws IOException {
        int i16;
        int i17;
        int size;
        int i18;
        int size2;
        if (this.eos && this.buffer.isEmpty()) {
            return -1;
        }
        if (i15 <= 0) {
            return 0;
        }
        if (isDraining()) {
            int iDrain = drain(cArr, i14, Math.min(this.toDrain, i15));
            if (iDrain != i15) {
                i16 = i14 + iDrain;
                i17 = i15 - iDrain;
            }
            return i15;
        }
        i16 = i14;
        i17 = i15;
        int size3 = this.prefixEscapeMatcher.size();
        buffer(readCount(size3, 0));
        if (this.buffer.length() < size3 && i17 < size3) {
            int iDrain2 = (i16 + drain(cArr, i16, i17)) - i14;
            if (!this.eos || iDrain2 > 0) {
                return iDrain2;
            }
            return -1;
        }
        boolean z14 = this.eos;
        StringSubstitutor stringSubstitutor = this.stringSubstitutor;
        if (z14) {
            stringSubstitutor.replaceIn(this.buffer);
            this.toDrain = this.buffer.size();
            int iDrain3 = (i16 + drain(cArr, i16, i17)) - i14;
            if (!this.eos || iDrain3 > 0) {
                return iDrain3;
            }
            return -1;
        }
        StringMatcher variablePrefixMatcher = stringSubstitutor.getVariablePrefixMatcher();
        while (true) {
            if (i17 <= 0) {
                size = 0;
                i18 = 0;
                break;
            }
            i18 = 1;
            if (isBufferMatchAt(variablePrefixMatcher, 0)) {
                size = variablePrefixMatcher.size();
                break;
            }
            if (isBufferMatchAt(this.prefixEscapeMatcher, 0)) {
                size = this.prefixEscapeMatcher.size();
                break;
            }
            int iDrain4 = drain(cArr, i16, 1);
            i16 += iDrain4;
            i17 -= iDrain4;
            if (this.buffer.size() < size3) {
                int iBufferOrDrainOnEos = bufferOrDrainOnEos(size3, cArr, i16, i17);
                if (this.eos || isDraining()) {
                    if (iBufferOrDrainOnEos != -1) {
                        i16 += iBufferOrDrainOnEos;
                    }
                    int i19 = i16 - i14;
                    if (i19 > 0) {
                        return i19;
                    }
                    return -1;
                }
            }
        }
        if (i17 > 0) {
            StringMatcher variableSuffixMatcher = this.stringSubstitutor.getVariableSuffixMatcher();
            int iMax = Math.max(size3, variableSuffixMatcher.size());
            buffer(readCount(iMax, size));
            if (this.eos) {
                this.stringSubstitutor.replaceIn(this.buffer);
                this.toDrain = this.buffer.size();
                return (i16 + drain(cArr, i16, i17)) - i14;
            }
            while (true) {
                if (isBufferMatchAt(variableSuffixMatcher, size)) {
                    i18--;
                    size++;
                    if (i18 != 0) {
                        break;
                    }
                    break;
                }
                if (isBufferMatchAt(variablePrefixMatcher, size)) {
                    i18++;
                    size2 = variablePrefixMatcher.size();
                } else if (isBufferMatchAt(this.prefixEscapeMatcher, size)) {
                    i18++;
                    size2 = this.prefixEscapeMatcher.size();
                } else {
                    size++;
                }
                size = size2 + size;
                if (buffer(readCount(iMax, size)) == -1 && size >= this.buffer.size()) {
                    break;
                }
            }
            int iMax2 = Math.max(0, this.buffer.size() - size);
            StringSubstitutor stringSubstitutor2 = this.stringSubstitutor;
            TextStringBuilder textStringBuilder = this.buffer;
            stringSubstitutor2.replaceIn(textStringBuilder, 0, Math.min(textStringBuilder.size(), size + 1));
            int size4 = this.buffer.size() - iMax2;
            int iMin = Math.min(i17, size4);
            this.toDrain = size4;
            drain(cArr, i16, iMin);
            return (i16 - i14) + iMin;
        }
        return i15;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i14;
        do {
            i14 = read(this.read1CharBuffer, 0, 1);
            if (i14 == -1) {
                return -1;
            }
        } while (i14 < 1);
        return this.read1CharBuffer[0];
    }
}
