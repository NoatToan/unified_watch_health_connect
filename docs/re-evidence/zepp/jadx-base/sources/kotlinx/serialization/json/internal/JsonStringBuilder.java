package kotlinx.serialization.json.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0006\u0010\u0014\u001a\u00020\u0007R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/serialization/json/internal/JsonStringBuilder;", "", "", "firstEscapedChar", "currentSize", "", "string", "", "a", "expected", "b", "newSize", "c", "", "value", "append", "", "ch", "appendQuoted", "toString", "release", "", "[C", "array", LogUtil.I, "size", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public final class JsonStringBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private char[] array = CharArrayPool.INSTANCE.take();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int size;

    private final void a(int firstEscapedChar, int currentSize, String string) {
        byte b;
        int length = string.length();
        if (firstEscapedChar < length) {
            while (true) {
                int i = firstEscapedChar + 1;
                int i2 = currentSize + 2;
                c(i2);
                char cCharAt = string.charAt(firstEscapedChar);
                if (cCharAt >= StringOpsKt.getESCAPE_MARKERS().length || (b = StringOpsKt.getESCAPE_MARKERS()[cCharAt]) == 0) {
                    int i3 = currentSize + 1;
                    this.array[currentSize] = cCharAt;
                    currentSize = i3;
                } else if (b == 1) {
                    String str = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                    c(str.length() + currentSize);
                    str.getChars(0, str.length(), this.array, currentSize);
                    currentSize += str.length();
                    this.size = currentSize;
                } else {
                    char[] cArr = this.array;
                    cArr[currentSize] = '\\';
                    cArr[currentSize + 1] = (char) b;
                    this.size = i2;
                    currentSize = i2;
                }
                if (i >= length) {
                    break;
                } else {
                    firstEscapedChar = i;
                }
            }
        }
        int i4 = currentSize + 1;
        c(i4);
        this.array[currentSize] = '\"';
        this.size = i4;
    }

    private final void b(int expected) {
        c(this.size + expected);
    }

    private final void c(int newSize) {
        char[] cArr = this.array;
        if (cArr.length <= newSize) {
            this.array = Arrays.copyOf(cArr, kotlin.ranges.e.coerceAtLeast(newSize, this.size * 2));
        }
    }

    public final void append(long value) {
        append(String.valueOf(value));
    }

    public final void appendQuoted(@NotNull String string) {
        b(string.length() + 2);
        char[] cArr = this.array;
        int i = this.size;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = string.length();
        string.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        if (i2 < i3) {
            int i4 = i2;
            while (true) {
                int i5 = i4 + 1;
                char c = cArr[i4];
                if (c < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                    a(i4 - i2, i4, string);
                    return;
                } else if (i5 < i3) {
                    i4 = i5;
                }
            }
        }
        cArr[i3] = '\"';
        this.size = i3 + 1;
    }

    public final void release() {
        CharArrayPool.INSTANCE.release(this.array);
    }

    @NotNull
    public String toString() {
        return new String(this.array, 0, this.size);
    }

    public final void append(char ch) {
        b(1);
        char[] cArr = this.array;
        int i = this.size;
        this.size = i + 1;
        cArr[i] = ch;
    }

    public final void append(@NotNull String string) {
        int length = string.length();
        b(length);
        string.getChars(0, string.length(), this.array, this.size);
        this.size += length;
    }
}
