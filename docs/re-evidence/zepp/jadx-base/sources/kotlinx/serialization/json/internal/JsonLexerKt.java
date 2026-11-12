package kotlinx.serialization.json.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0004H\u0000\"\u0016\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0016\u0010\n\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0016\u0010\u000b\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0016\u0010\f\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0016\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0010\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0016\u0010\u0011\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0016\u0010\u0012\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\"\u0016\u0010\u0013\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0016\u0010\u0014\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f\"\u0016\u0010\u0015\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f\"\u0016\u0010\u0016\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f\"\u0016\u0010\u0017\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f\"\u0016\u0010\u0018\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f\"\u0016\u0010\u0019\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0016\u0010\u001b\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0016\u0010\u001c\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0016\u0010\u001d\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a\"\u0016\u0010\u001e\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0016\u0010\u001f\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a\"\u0016\u0010 \u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001a\"\u0016\u0010!\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u001a\"\u0016\u0010\"\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u001a\"\u0016\u0010#\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u001a\"\u0016\u0010$\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u001a\"\u0016\u0010%\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u001a\"\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'\"\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010'\"\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010'¨\u0006,"}, d2 = {"", "c", "", "charToTokenClass", "", "escapeToChar", "", "lenientHint", "Ljava/lang/String;", "coerceInputValuesHint", "specialFlowingValuesHint", "ignoreUnknownKeysHint", "allowStructuredMapKeysHint", "NULL", "COMMA", "C", "COLON", "BEGIN_OBJ", "END_OBJ", "BEGIN_LIST", "END_LIST", "STRING", "STRING_ESC", "INVALID", "UNICODE_ESC", "TC_OTHER", "B", "TC_STRING", "TC_STRING_ESC", "TC_WHITESPACE", "TC_COMMA", "TC_COLON", "TC_BEGIN_OBJ", "TC_END_OBJ", "TC_BEGIN_LIST", "TC_END_LIST", "TC_EOF", "TC_INVALID", "a", LogUtil.I, "CTC_MAX", "b", "ESC2C_MAX", "asciiCaseMask", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class JsonLexerKt {
    public static final char BEGIN_LIST = '[';
    public static final char BEGIN_OBJ = '{';
    public static final char COLON = ':';
    public static final char COMMA = ',';
    public static final char END_LIST = ']';
    public static final char END_OBJ = '}';
    public static final char INVALID = 0;

    @NotNull
    public static final String NULL = "null";
    public static final char STRING = '\"';
    public static final char STRING_ESC = '\\';
    public static final byte TC_BEGIN_LIST = 8;
    public static final byte TC_BEGIN_OBJ = 6;
    public static final byte TC_COLON = 5;
    public static final byte TC_COMMA = 4;
    public static final byte TC_END_LIST = 9;
    public static final byte TC_END_OBJ = 7;
    public static final byte TC_EOF = 10;
    public static final byte TC_INVALID = 127;
    public static final byte TC_OTHER = 0;
    public static final byte TC_STRING = 1;
    public static final byte TC_STRING_ESC = 2;
    public static final byte TC_WHITESPACE = 3;
    public static final char UNICODE_ESC = 'u';
    private static final int a = 126;

    @NotNull
    public static final String allowStructuredMapKeysHint = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
    private static final int b = 117;
    private static final int c = 32;

    @NotNull
    public static final String coerceInputValuesHint = "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.";

    @NotNull
    public static final String ignoreUnknownKeysHint = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.";

    @NotNull
    public static final String lenientHint = "Use 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.";

    @NotNull
    public static final String specialFlowingValuesHint = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";

    public static final byte charToTokenClass(char c2) {
        if (c2 < '~') {
            return CharMappings.CHAR_TO_TOKEN[c2];
        }
        return (byte) 0;
    }

    public static final char escapeToChar(int i) {
        if (i < 117) {
            return CharMappings.ESCAPE_2_CHAR[i];
        }
        return (char) 0;
    }
}
