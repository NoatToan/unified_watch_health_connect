package kotlinx.serialization.json.internal;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonLexer, reason: from toString */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\bG\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0018\u0010\u0003\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\fH\u0002J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\fH\u0002J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010&\u001a\u00020\tJ\u0006\u0010%\u001a\u00020\tJ\u0006\u0010'\u001a\u00020\u0004J\u0010\u0010)\u001a\u0004\u0018\u00010\u00102\u0006\u0010(\u001a\u00020\u0004J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020\u0010J\u0006\u0010-\u001a\u00020\u0010J\u000e\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0004J\b\u00100\u001a\u00020\u0010H\u0016J\u000e\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0010J\u0018\u00106\u001a\u0002052\u0006\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\fJ3\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001008H\u0080\bø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0006\u0010=\u001a\u00020<J\u0006\u0010>\u001a\u00020\u0004J\u0006\u0010?\u001a\u00020\u0004R\u0016\u0010\u001b\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010@R\u0016\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010@R\u001a\u0010F\u001a\u00060Cj\u0002`D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010E\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006I"}, d2 = {"Lkotlinx/serialization/json/internal/JsonLexer;", "", "", "c", "", hl.k, "expected", "", GoogleApiAvailabilityLight.b, "", "expectedToken", "i", "", "l", "startPosition", "current", "", "g", "lastPosition", "b", "currentPosition", "h", "m", "fromIndex", "toIndex", GoogleApiAvailabilityLight.a, "a", "source", "startPos", z.j, "start", "e", "literalSuffix", "f", "expectEof", "tryConsumeComma", "canConsumeValue", "consumeNextToken", "peekNextToken", "tryConsumeNotNull", "isLenient", "peekString", "consumeKeyString", "consumeString", "consumeStringLenientNotNull", "consumeStringLenient", "allowLenientStrings", "skipElement", "toString", "key", "failOnUnknownKey", "message", "position", "", "fail", "condition", "Lkotlin/Function0;", "require$kotlinx_serialization_json", "(ZILkotlin/jvm/functions/Function0;)V", "require", "", "consumeNumericLiteral", "consumeBoolean", "consumeBooleanLenient", "Ljava/lang/String;", LogUtil.I, "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "escapedString", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public final class JsonReader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String peekedString;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private StringBuilder escapedString = new StringBuilder();

    @JvmField
    public int currentPosition;

    public JsonReader(@NotNull String str) {
        this.source = str;
    }

    private final int a(int startPosition) {
        int i = startPosition + 1;
        char cCharAt = this.source.charAt(startPosition);
        if (cCharAt == 'u') {
            return c(this.source, i);
        }
        char cEscapeToChar = JsonLexerKt.escapeToChar(cCharAt);
        if (cEscapeToChar != 0) {
            this.escapedString.append(cEscapeToChar);
            return i;
        }
        fail$default(this, "Invalid escaped char '" + cCharAt + '\'', 0, 2, null);
        throw new KotlinNothingValueException();
    }

    private final int b(int lastPosition, int current) {
        this.escapedString.append((CharSequence) this.source, lastPosition, current);
        return a(current + 1);
    }

    private final int c(String source, int startPos) {
        int i = startPos + 4;
        if (i < source.length()) {
            this.escapedString.append((char) ((j(source, startPos) << 12) + (j(source, startPos + 1) << 8) + (j(source, startPos + 2) << 4) + j(source, startPos + 3)));
            return i;
        }
        fail$default(this, "Unexpected EOF during unicode escape", 0, 2, null);
        throw new KotlinNothingValueException();
    }

    private final void d(int fromIndex, int toIndex) {
        this.escapedString.append((CharSequence) this.source, fromIndex, toIndex);
    }

    private final boolean e(int start) {
        if (start == this.source.length()) {
            fail$default(this, "EOF", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        int i = start + 1;
        int iCharAt = this.source.charAt(start) | StringUtil.SPACE;
        if (iCharAt == 116) {
            f("rue", i);
            return true;
        }
        if (iCharAt == 102) {
            f("alse", i);
            return false;
        }
        fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, 2, null);
        throw new KotlinNothingValueException();
    }

    private final void f(String literalSuffix, int current) {
        if (this.source.length() - current < literalSuffix.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        int length = literalSuffix.length() - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (literalSuffix.charAt(i) != (this.source.charAt(i + current) | StringUtil.SPACE)) {
                    fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, 2, null);
                    throw new KotlinNothingValueException();
                }
                if (i2 <= length) {
                    i = i2;
                }
            }
        }
        this.currentPosition = current + literalSuffix.length();
    }

    public static /* synthetic */ Void fail$default(JsonReader jsonReader, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = jsonReader.currentPosition;
        }
        return jsonReader.fail(str, i);
    }

    private final String g(int startPosition, int current) {
        String str = this.source;
        char cCharAt = str.charAt(current);
        int iB = startPosition;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iB = b(iB, current);
                current = iB;
            } else {
                current++;
                if (current >= str.length()) {
                    fail("EOF", current);
                    throw new KotlinNothingValueException();
                }
            }
            cCharAt = str.charAt(current);
        }
        String strSubstring = iB == startPosition ? str.substring(iB, current) : h(iB, current);
        this.currentPosition = current + 1;
        return strSubstring;
    }

    private final String h(int lastPosition, int currentPosition) {
        d(lastPosition, currentPosition);
        String string = this.escapedString.toString();
        this.escapedString.setLength(0);
        return string;
    }

    private final void i(byte expectedToken) {
        String str;
        int i;
        if (expectedToken == 1) {
            str = "quotation mark '\"'";
        } else if (expectedToken == 4) {
            str = "comma ','";
        } else if (expectedToken == 5) {
            str = "semicolon ':'";
        } else if (expectedToken == 6) {
            str = "start of the object '{'";
        } else if (expectedToken == 7) {
            str = "end of the object '}'";
        } else if (expectedToken == 8) {
            str = "start of the array '['";
        } else {
            str = expectedToken == 9 ? "end of the array ']'" : "valid token";
        }
        fail("Expected " + str + ", but had '" + ((this.currentPosition == this.source.length() || (i = this.currentPosition) <= 0) ? "EOF" : String.valueOf(this.source.charAt(i - 1))) + "' instead", this.currentPosition - 1);
        throw new KotlinNothingValueException();
    }

    private final int j(String source, int currentPosition) {
        char cCharAt = source.charAt(currentPosition);
        if ('0' <= cCharAt && cCharAt <= '9') {
            return cCharAt - '0';
        }
        char c = 'a';
        if (!('a' <= cCharAt && cCharAt <= 'f')) {
            c = 'A';
            if (!('A' <= cCharAt && cCharAt <= 'F')) {
                fail$default(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 2, null);
                throw new KotlinNothingValueException();
            }
        }
        return (cCharAt - c) + 10;
    }

    private final boolean k(char c) {
        return !(((c == '}' || c == ']') || c == ':') || c == ',');
    }

    private final int l() {
        char cCharAt;
        int i = this.currentPosition;
        while (i < this.source.length() && ((cCharAt = this.source.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.currentPosition = i;
        return i;
    }

    private final String m() {
        String str = this.peekedString;
        this.peekedString = null;
        return str;
    }

    private final void n(char expected) {
        this.currentPosition--;
        if (expected == '\"' && Intrinsics.areEqual(consumeStringLenient(), "null")) {
            fail("Expected string literal but 'null' literal was found.\nUse 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.", this.currentPosition - 4);
            throw new KotlinNothingValueException();
        }
        i(JsonLexerKt.charToTokenClass(expected));
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(JsonReader jsonReader, boolean z, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = jsonReader.currentPosition;
        }
        if (z) {
            return;
        }
        jsonReader.fail((String) function0.invoke(), i);
        throw new KotlinNothingValueException();
    }

    public final boolean canConsumeValue() {
        int i = this.currentPosition;
        while (i < this.source.length()) {
            char cCharAt = this.source.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i;
                return k(cCharAt);
            }
            i++;
        }
        this.currentPosition = i;
        return false;
    }

    public final boolean consumeBoolean() {
        return e(l());
    }

    public final boolean consumeBooleanLenient() {
        boolean z;
        int iL = l();
        if (iL == this.source.length()) {
            fail$default(this, "EOF", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        if (this.source.charAt(iL) == '\"') {
            iL++;
            z = true;
        } else {
            z = false;
        }
        boolean zE = e(iL);
        if (z) {
            if (this.currentPosition == this.source.length()) {
                fail$default(this, "EOF", 0, 2, null);
                throw new KotlinNothingValueException();
            }
            if (this.source.charAt(this.currentPosition) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, 2, null);
                throw new KotlinNothingValueException();
            }
            this.currentPosition++;
        }
        return zE;
    }

    @NotNull
    public final String consumeKeyString() {
        consumeNextToken('\"');
        int i = this.currentPosition;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.source, '\"', i, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            i((byte) 1);
        }
        if (i < iIndexOf$default) {
            int i2 = i;
            while (true) {
                int i3 = i2 + 1;
                if (this.source.charAt(i2) == '\\') {
                    return g(this.currentPosition, i2);
                }
                if (i3 < iIndexOf$default) {
                    i2 = i3;
                }
            }
        }
        this.currentPosition = iIndexOf$default + 1;
        String str = this.source;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.substring(i, iIndexOf$default);
    }

    public final byte consumeNextToken(byte expected) {
        byte bConsumeNextToken = consumeNextToken();
        if (bConsumeNextToken != expected) {
            i(expected);
        }
        return bConsumeNextToken;
    }

    public final long consumeNumericLiteral() {
        boolean z;
        int iL = l();
        Object obj = null;
        int i = 2;
        if (iL == this.source.length()) {
            fail$default(this, "EOF", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        if (this.source.charAt(iL) == '\"') {
            iL++;
            if (iL == this.source.length()) {
                fail$default(this, "EOF", 0, 2, null);
                throw new KotlinNothingValueException();
            }
            z = true;
        } else {
            z = false;
        }
        int i2 = iL;
        boolean z2 = true;
        boolean z3 = false;
        long j = 0;
        while (z2) {
            char cCharAt = this.source.charAt(i2);
            if (cCharAt == '-') {
                if (i2 != iL) {
                    fail$default(this, "Unexpected symbol '-' in numeric literal", 0, i, obj);
                    throw new KotlinNothingValueException();
                }
                i2++;
                z3 = true;
            } else {
                if (JsonLexerKt.charToTokenClass(cCharAt) != 0) {
                    break;
                }
                i2++;
                z2 = i2 != this.source.length();
                int i3 = cCharAt - '0';
                if (!(i3 >= 0 && i3 <= 9)) {
                    fail$default(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, 2, null);
                    throw new KotlinNothingValueException();
                }
                j = (j * ((long) 10)) - ((long) i3);
                if (j > 0) {
                    fail$default(this, "Numeric value overflow", 0, 2, null);
                    throw new KotlinNothingValueException();
                }
                obj = null;
                i = 2;
            }
        }
        if (iL == i2 || (z3 && iL == i2 - 1)) {
            fail$default(this, "Expected numeric literal", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        if (z) {
            if (!z2) {
                fail$default(this, "EOF", 0, 2, null);
                throw new KotlinNothingValueException();
            }
            if (this.source.charAt(i2) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, 2, null);
                throw new KotlinNothingValueException();
            }
            i2++;
        }
        this.currentPosition = i2;
        if (z3) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        fail$default(this, "Numeric value overflow", 0, 2, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final String consumeString() {
        return this.peekedString != null ? m() : consumeKeyString();
    }

    @NotNull
    public final String consumeStringLenient() {
        if (this.peekedString != null) {
            return m();
        }
        int iL = l();
        if (iL >= this.source.length()) {
            fail("EOF", iL);
            throw new KotlinNothingValueException();
        }
        byte bCharToTokenClass = JsonLexerKt.charToTokenClass(this.source.charAt(iL));
        if (bCharToTokenClass == 1) {
            return consumeString();
        }
        if (bCharToTokenClass != 0) {
            fail$default(this, Intrinsics.stringPlus("Expected beginning of the string, but got ", Character.valueOf(this.source.charAt(iL))), 0, 2, null);
            throw new KotlinNothingValueException();
        }
        while (iL < this.source.length() && JsonLexerKt.charToTokenClass(this.source.charAt(iL)) == 0) {
            iL++;
        }
        String str = this.source;
        int i = this.currentPosition;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, iL);
        this.currentPosition = iL;
        return strSubstring;
    }

    @NotNull
    public final String consumeStringLenientNotNull() {
        String strConsumeStringLenient = consumeStringLenient();
        if (!Intrinsics.areEqual(strConsumeStringLenient, "null")) {
            return strConsumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, 2, null);
        throw new KotlinNothingValueException();
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF, but had " + this.source.charAt(this.currentPosition - 1) + " instead", 0, 2, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Void fail(@NotNull String message, int position) {
        throw JsonExceptionsKt.JsonDecodingException(position, message, this.source);
    }

    public final void failOnUnknownKey(@NotNull String key) {
        String str = this.source;
        int i = this.currentPosition;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        fail("Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.", StringsKt__StringsKt.lastIndexOf$default((CharSequence) str.substring(0, i), key, 0, false, 6, (Object) null));
        throw new KotlinNothingValueException();
    }

    public final byte peekNextToken() {
        String str = this.source;
        while (this.currentPosition < str.length()) {
            char cCharAt = str.charAt(this.currentPosition);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                return JsonLexerKt.charToTokenClass(cCharAt);
            }
            this.currentPosition++;
        }
        return (byte) 10;
    }

    @Nullable
    public final String peekString(boolean isLenient) {
        String strConsumeString;
        byte bPeekNextToken = peekNextToken();
        if (isLenient) {
            if (bPeekNextToken != 1 && bPeekNextToken != 0) {
                return null;
            }
            strConsumeString = consumeStringLenient();
        } else {
            if (bPeekNextToken != 1) {
                return null;
            }
            strConsumeString = consumeString();
        }
        this.peekedString = strConsumeString;
        return strConsumeString;
    }

    public final void require$kotlinx_serialization_json(boolean condition, int position, @NotNull Function0<String> message) {
        if (condition) {
            return;
        }
        fail(message.invoke(), position);
        throw new KotlinNothingValueException();
    }

    public final void skipElement(boolean allowLenientStrings) {
        ArrayList arrayList = new ArrayList();
        byte bPeekNextToken = peekNextToken();
        if (bPeekNextToken != 8 && bPeekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte bPeekNextToken2 = peekNextToken();
            boolean z = true;
            if (bPeekNextToken2 != 1) {
                if (bPeekNextToken2 != 8 && bPeekNextToken2 != 6) {
                    z = false;
                }
                if (z) {
                    arrayList.add(Byte.valueOf(bPeekNextToken2));
                } else if (bPeekNextToken2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of }", this.source);
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bPeekNextToken2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ]", this.source);
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bPeekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 2, null);
                    throw new KotlinNothingValueException();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (allowLenientStrings) {
                consumeStringLenient();
            } else {
                consumeKeyString();
            }
        }
    }

    @NotNull
    public String toString() {
        return "JsonReader(source='" + this.source + "', currentPosition=" + this.currentPosition + ')';
    }

    public final boolean tryConsumeComma() {
        int iL = l();
        if (iL == this.source.length() || this.source.charAt(iL) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final boolean tryConsumeNotNull() {
        int iL = l();
        int length = this.source.length() - iL;
        if (length < 4) {
            return true;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if ("null".charAt(i) != this.source.charAt(i + iL)) {
                return true;
            }
            if (i2 > 3) {
                if (length > 4 && JsonLexerKt.charToTokenClass(this.source.charAt(iL + 4)) == 0) {
                    return true;
                }
                this.currentPosition = iL + 4;
                return false;
            }
            i = i2;
        }
    }

    public final void consumeNextToken(char expected) {
        String str = this.source;
        while (this.currentPosition < str.length()) {
            int i = this.currentPosition;
            this.currentPosition = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == expected) {
                    return;
                } else {
                    n(expected);
                }
            }
        }
        n(expected);
    }

    public final byte consumeNextToken() {
        String str = this.source;
        while (this.currentPosition < str.length()) {
            int i = this.currentPosition;
            this.currentPosition = i + 1;
            byte bCharToTokenClass = JsonLexerKt.charToTokenClass(str.charAt(i));
            if (bCharToTokenClass != 3) {
                return bCharToTokenClass;
            }
        }
        return (byte) 10;
    }
}
