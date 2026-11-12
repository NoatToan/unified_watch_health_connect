package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(String str, Throwable th3, boolean z14, int i14) {
        super(str, th3);
        this.contentIsMalformed = z14;
        this.dataType = i14;
    }

    public static ParserException createForMalformedContainer(String str, Throwable th3) {
        return new ParserException(str, th3, true, 1);
    }

    public static ParserException createForMalformedDataOfUnknownType(String str, Throwable th3) {
        return new ParserException(str, th3, true, 0);
    }

    public static ParserException createForMalformedManifest(String str, Throwable th3) {
        return new ParserException(str, th3, true, 4);
    }

    public static ParserException createForManifestWithUnsupportedFeature(String str, Throwable th3) {
        return new ParserException(str, th3, false, 4);
    }

    public static ParserException createForUnsupportedContainerFeature(String str) {
        return new ParserException(str, null, false, 1);
    }
}
