package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0096\u0002J\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bJ\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lkotlinx/serialization/json/internal/ArrayAsSequence;", "", "buffer", "", "([C)V", "getBuffer$kotlinx_serialization_json", "()[C", "length", "", "getLength", "()I", "setLength", "(I)V", "get", "", "index", "subSequence", "startIndex", "endIndex", "substring", "", "toString", "trim", "", "newSize", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArrayAsSequence implements CharSequence {

    @NotNull
    private final char[] buffer;
    private int length;

    public ArrayAsSequence(@NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        this.length = buffer.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public char get(int index) {
        return this.buffer[index];
    }

    @NotNull
    /* JADX INFO: renamed from: getBuffer$kotlinx_serialization_json, reason: from getter */
    public final char[] getBuffer() {
        return this.buffer;
    }

    public int getLength() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public void setLength(int i) {
        this.length = i;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int startIndex, int endIndex) {
        return StringsKt__StringsJVMKt.concatToString(this.buffer, startIndex, Math.min(endIndex, length()));
    }

    @NotNull
    public final String substring(int startIndex, int endIndex) {
        return StringsKt__StringsJVMKt.concatToString(this.buffer, startIndex, Math.min(endIndex, length()));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return substring(0, length());
    }

    public final void trim(int newSize) {
        setLength(Math.min(this.buffer.length, newSize));
    }
}
