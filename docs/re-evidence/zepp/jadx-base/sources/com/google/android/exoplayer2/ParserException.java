package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(@Nullable String message, @Nullable Throwable cause, boolean contentIsMalformed, int dataType) {
        super(message, cause);
        this.contentIsMalformed = contentIsMalformed;
        this.dataType = dataType;
    }

    public static ParserException createForMalformedContainer(@Nullable String message, @Nullable Throwable cause) {
        return new ParserException(message, cause, true, 1);
    }

    public static ParserException createForMalformedDataOfUnknownType(@Nullable String message, @Nullable Throwable cause) {
        return new ParserException(message, cause, true, 0);
    }

    public static ParserException createForMalformedManifest(@Nullable String message, @Nullable Throwable cause) {
        return new ParserException(message, cause, true, 4);
    }

    public static ParserException createForManifestWithUnsupportedFeature(@Nullable String message, @Nullable Throwable cause) {
        return new ParserException(message, cause, false, 4);
    }

    public static ParserException createForUnsupportedContainerFeature(@Nullable String message) {
        return new ParserException(message, null, false, 1);
    }
}
