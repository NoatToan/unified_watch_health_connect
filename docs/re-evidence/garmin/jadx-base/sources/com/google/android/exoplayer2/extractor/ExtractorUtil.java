package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes13.dex */
public final class ExtractorUtil {
    private ExtractorUtil() {
    }

    public static void checkContainerInput(boolean z14, String str) throws ParserException {
        if (!z14) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    public static boolean peekFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i14, int i15, boolean z14) throws EOFException {
        try {
            return extractorInput.peekFully(bArr, i14, i15, z14);
        } catch (EOFException e4) {
            if (z14) {
                return false;
            }
            throw e4;
        }
    }

    public static int peekToLength(ExtractorInput extractorInput, byte[] bArr, int i14, int i15) {
        int i16 = 0;
        while (i16 < i15) {
            int iPeek = extractorInput.peek(bArr, i14 + i16, i15 - i16);
            if (iPeek == -1) {
                break;
            }
            i16 += iPeek;
        }
        return i16;
    }

    public static boolean readFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i14, int i15) {
        try {
            extractorInput.readFully(bArr, i14, i15);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(ExtractorInput extractorInput, int i14) {
        try {
            extractorInput.skipFully(i14);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
