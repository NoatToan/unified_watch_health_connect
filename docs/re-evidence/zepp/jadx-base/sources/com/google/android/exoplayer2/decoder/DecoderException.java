package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class DecoderException extends Exception {
    public DecoderException(String message) {
        super(message);
    }

    public DecoderException(@Nullable Throwable cause) {
        super(cause);
    }

    public DecoderException(String message, @Nullable Throwable cause) {
        super(message, cause);
    }
}
