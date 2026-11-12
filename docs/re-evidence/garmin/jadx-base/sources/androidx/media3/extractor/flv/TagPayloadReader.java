package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import bb.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f9936a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(l0 l0Var) {
        this.f9936a = l0Var;
    }
}
