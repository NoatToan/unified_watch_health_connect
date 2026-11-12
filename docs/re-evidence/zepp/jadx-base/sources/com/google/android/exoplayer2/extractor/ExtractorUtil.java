package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtractorUtil {
    private ExtractorUtil() {
    }

    @Pure
    public static void checkContainerInput(boolean expression, @Nullable String message) throws ParserException {
        if (!expression) {
            throw ParserException.createForMalformedContainer(message, null);
        }
    }

    public static boolean peekFullyQuietly(ExtractorInput input, byte[] output, int offset, int length, boolean allowEndOfInput) throws IOException {
        try {
            return input.peekFully(output, offset, length, allowEndOfInput);
        } catch (EOFException e) {
            if (allowEndOfInput) {
                return false;
            }
            throw e;
        }
    }

    public static int peekToLength(ExtractorInput input, byte[] target, int offset, int length) throws IOException {
        int i = 0;
        while (i < length) {
            int iPeek = input.peek(target, offset + i, length - i);
            if (iPeek == -1) {
                break;
            }
            i += iPeek;
        }
        return i;
    }

    public static boolean readFullyQuietly(ExtractorInput input, byte[] output, int offset, int length) throws IOException {
        try {
            input.readFully(output, offset, length);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(ExtractorInput input, int length) throws IOException {
        try {
            input.skipFully(length);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
