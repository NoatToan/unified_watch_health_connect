package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes2.dex */
abstract class TagPayloadReader {
    public final TrackOutput a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String msg) {
            super(msg, null, false, 1);
        }
    }

    public TagPayloadReader(TrackOutput output) {
        this.a = output;
    }

    public final boolean a(ParsableByteArray data, long timeUs) throws ParserException {
        return b(data) && c(data, timeUs);
    }

    public abstract boolean b(ParsableByteArray data) throws ParserException;

    public abstract boolean c(ParsableByteArray data, long timeUs) throws ParserException;

    public abstract void d();
}
