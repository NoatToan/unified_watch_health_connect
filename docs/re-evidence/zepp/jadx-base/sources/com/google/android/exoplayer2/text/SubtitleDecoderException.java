package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: loaded from: classes3.dex */
public class SubtitleDecoderException extends DecoderException {
    public SubtitleDecoderException(String message) {
        super(message);
    }

    public SubtitleDecoderException(@Nullable Throwable cause) {
        super(cause);
    }

    public SubtitleDecoderException(String message, @Nullable Throwable cause) {
        super(message, cause);
    }
}
