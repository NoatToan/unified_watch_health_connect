package kotlinx.serialization.json.internal;

import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\fH\u0002J\u0006\u0010#\u001a\u00020\u000eJ\u0018\u0010$\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016J\b\u0010&\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "reader", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "buffer", "", "(Lkotlinx/serialization/json/internal/InternalJsonReader;[C)V", "source", "Lkotlinx/serialization/json/internal/ArrayAsSequence;", "getSource", "()Lkotlinx/serialization/json/internal/ArrayAsSequence;", TSMAuthContants.PARAM_THRESHOLD, "", "appendRange", "", "fromIndex", "toIndex", "canConsumeValue", "", "consumeKeyString", "", "consumeNextToken", "", "ensureHaveChars", "indexOf", "char", "", "startPos", "peekLeadingMatchingValue", "keyToMatch", "isLenient", "prefetchOrEof", "position", "preload", "unprocessedCount", "release", "substring", "endPos", "tryConsumeComma", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReaderJsonLexer extends JsonReader {

    @NotNull
    private final char[] buffer;

    @NotNull
    private final InternalJsonReader reader;

    @NotNull
    private final ArrayAsSequence source;
    private int threshold;

    public /* synthetic */ ReaderJsonLexer(InternalJsonReader internalJsonReader, char[] cArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalJsonReader, (i & 2) != 0 ? CharArrayPoolBatchSize.INSTANCE.take() : cArr);
    }

    private final void preload(int unprocessedCount) {
        char[] buffer = getSource().getBuffer();
        if (unprocessedCount != 0) {
            int i = this.currentPosition;
            ArraysKt___ArraysJvmKt.copyInto(buffer, buffer, 0, i, i + unprocessedCount);
        }
        int length = getSource().length();
        while (unprocessedCount != length) {
            int i2 = this.reader.read(buffer, unprocessedCount, length - unprocessedCount);
            if (i2 == -1) {
                getSource().trim(unprocessedCount);
                this.threshold = -1;
                break;
            }
            unprocessedCount += i2;
        }
        this.currentPosition = 0;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public void appendRange(int fromIndex, int toIndex) {
        StringBuilder escapedString = getEscapedString();
        escapedString.append(getSource().getBuffer(), fromIndex, toIndex - fromIndex);
        Intrinsics.checkNotNullExpressionValue(escapedString, "append(...)");
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public boolean canConsumeValue() {
        ensureHaveChars();
        int i = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return false;
            }
            char cCharAt = getSource().charAt(iPrefetchOrEof);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = iPrefetchOrEof;
                return isValidValueStart(cCharAt);
            }
            i = iPrefetchOrEof + 1;
        }
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    @NotNull
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i = this.currentPosition;
        int iIndexOf = indexOf('\"', i);
        if (iIndexOf == -1) {
            int iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof != -1) {
                return consumeString(getSource(), this.currentPosition, iPrefetchOrEof);
            }
            JsonReader.fail$kotlinx_serialization_json$default(this, (byte) 1, false, 2, null);
            throw new KotlinNothingValueException();
        }
        for (int i2 = i; i2 < iIndexOf; i2++) {
            if (getSource().charAt(i2) == '\\') {
                return consumeString(getSource(), this.currentPosition, i2);
            }
        }
        this.currentPosition = iIndexOf + 1;
        return substring(i, iIndexOf);
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return (byte) 10;
            }
            int i2 = iPrefetchOrEof + 1;
            byte bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(source.charAt(iPrefetchOrEof));
            if (bCharToTokenClass != 3) {
                this.currentPosition = i2;
                return bCharToTokenClass;
            }
            i = i2;
        }
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public void ensureHaveChars() {
        int length = getSource().length() - this.currentPosition;
        if (length > this.threshold) {
            return;
        }
        preload(length);
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public int indexOf(char c, int startPos) {
        ArrayAsSequence source = getSource();
        int length = source.length();
        while (startPos < length) {
            if (source.charAt(startPos) == c) {
                return startPos;
            }
            startPos++;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    @Nullable
    public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean isLenient) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public int prefetchOrEof(int position) {
        if (position < getSource().length()) {
            return position;
        }
        this.currentPosition = position;
        ensureHaveChars();
        return (this.currentPosition != 0 || getSource().length() == 0) ? -1 : 0;
    }

    public final void release() {
        CharArrayPoolBatchSize.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    @NotNull
    public String substring(int startPos, int endPos) {
        return getSource().substring(startPos, endPos);
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public boolean tryConsumeComma() {
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1 || getSource().charAt(iSkipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    @NotNull
    public ArrayAsSequence getSource() {
        return this.source;
    }

    public ReaderJsonLexer(@NotNull InternalJsonReader reader, @NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.reader = reader;
        this.buffer = buffer;
        this.threshold = 128;
        this.source = new ArrayAsSequence(buffer);
        preload(0);
    }
}
