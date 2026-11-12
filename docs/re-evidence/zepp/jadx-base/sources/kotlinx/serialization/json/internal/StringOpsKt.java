package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\"*\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r8\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\"\u0010\u001a\u001a\u00020\u00148\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"", "i", "", "a", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "", "printQuoted", "", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "[Ljava/lang/String;", "getESCAPE_STRINGS", "()[Ljava/lang/String;", "getESCAPE_STRINGS$annotations", "()V", "ESCAPE_STRINGS", "", "b", "[B", "getESCAPE_MARKERS", "()[B", "getESCAPE_MARKERS$annotations", "ESCAPE_MARKERS", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class StringOpsKt {

    @NotNull
    private static final String[] a;

    @NotNull
    private static final byte[] b;

    static {
        String[] strArr = new String[93];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            strArr[i2] = "\\u" + a(i2 >> 12) + a(i2 >> 8) + a(i2 >> 4) + a(i2);
            if (i3 > 31) {
                break;
            } else {
                i2 = i3;
            }
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        a = strArr;
        byte[] bArr = new byte[93];
        while (true) {
            int i4 = i + 1;
            bArr[i] = 1;
            if (i4 > 31) {
                bArr[34] = (byte) 34;
                bArr[92] = (byte) 92;
                bArr[9] = (byte) 116;
                bArr[8] = (byte) 98;
                bArr[10] = (byte) 110;
                bArr[13] = (byte) 114;
                bArr[12] = (byte) 102;
                b = bArr;
                return;
            }
            i = i4;
        }
    }

    private static final char a(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }

    @NotNull
    public static final byte[] getESCAPE_MARKERS() {
        return b;
    }

    public static /* synthetic */ void getESCAPE_MARKERS$annotations() {
    }

    @NotNull
    public static final String[] getESCAPE_STRINGS() {
        return a;
    }

    public static /* synthetic */ void getESCAPE_STRINGS$annotations() {
    }

    public static final void printQuoted(@NotNull StringBuilder sb, @NotNull String str) {
        sb.append('\"');
        int length = str.length() - 1;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                char cCharAt = str.charAt(i);
                String[] strArr = a;
                if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                    sb.append((CharSequence) str, i2, i);
                    sb.append(strArr[cCharAt]);
                    i2 = i3;
                }
                if (i3 > length) {
                    break;
                } else {
                    i = i3;
                }
            }
            i = i2;
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    @Nullable
    public static final Boolean toBooleanStrictOrNull(@NotNull String str) {
        if (m.equals(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (m.equals(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }
}
