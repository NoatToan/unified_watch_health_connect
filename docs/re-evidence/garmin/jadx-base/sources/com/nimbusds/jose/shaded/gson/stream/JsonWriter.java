package com.nimbusds.jose.shaded.gson.stream;

import androidx.room.a0;
import c22.t;
import ch.qos.logback.core.CoreConstants;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.messaging.l;
import com.google.maps.android.BuildConfig;
import com.nimbusds.jose.shaded.gson.FormattingStyle;
import com.nimbusds.jose.shaded.gson.Strictness;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.apache.commons.lang3.BooleanUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private String deferredName;
    private String formattedColon;
    private String formattedComma;
    private FormattingStyle formattingStyle;
    private boolean htmlSafe;
    private final Writer out;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private Strictness strictness;
    private boolean usesEmptyNewlineAndIndent;
    private static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] REPLACEMENT_CHARS = new String[128];

    static {
        for (int i14 = 0; i14 <= 31; i14++) {
            REPLACEMENT_CHARS[i14] = String.format("\\u%04x", Integer.valueOf(i14));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.strictness = Strictness.LEGACY_STRICT;
        this.serializeNulls = true;
        Objects.requireNonNull(writer, "out == null");
        this.out = writer;
        setFormattingStyle(FormattingStyle.COMPACT);
    }

    private void beforeName() throws IOException {
        int iPeek = peek();
        if (iPeek == 5) {
            this.out.write(this.formattedComma);
        } else if (iPeek != 3) {
            h.z("Nesting problem.");
            return;
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws IOException {
        int iPeek = peek();
        if (iPeek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (iPeek == 2) {
            this.out.append((CharSequence) this.formattedComma);
            newline();
            return;
        }
        if (iPeek == 4) {
            this.out.append((CharSequence) this.formattedColon);
            replaceTop(5);
            return;
        }
        if (iPeek != 6) {
            if (iPeek != 7) {
                h.z("Nesting problem.");
                return;
            } else if (this.strictness != Strictness.LENIENT) {
                h.z("JSON must have only one top-level value.");
                return;
            }
        }
        replaceTop(7);
    }

    @CanIgnoreReturnValue
    private JsonWriter closeScope(int i14, int i15, char c14) throws IOException {
        int iPeek = peek();
        if (iPeek != i15 && iPeek != i14) {
            h.z("Nesting problem.");
            return null;
        }
        if (this.deferredName != null) {
            a0.s(this.deferredName, "Dangling name: ");
            return null;
        }
        this.stackSize--;
        if (iPeek == i15) {
            newline();
        }
        this.out.write(c14);
        return this;
    }

    private static boolean isTrustedNumberType(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void newline() throws IOException {
        if (this.usesEmptyNewlineAndIndent) {
            return;
        }
        this.out.write(this.formattingStyle.getNewline());
        int i14 = this.stackSize;
        for (int i15 = 1; i15 < i14; i15++) {
            this.out.write(this.formattingStyle.getIndent());
        }
    }

    @CanIgnoreReturnValue
    private JsonWriter openScope(int i14, char c14) throws IOException {
        beforeValue();
        push(i14);
        this.out.write(c14);
        return this;
    }

    private int peek() {
        int i14 = this.stackSize;
        if (i14 != 0) {
            return this.stack[i14 - 1];
        }
        h.z("JsonWriter is closed.");
        return 0;
    }

    private void push(int i14) {
        int i15 = this.stackSize;
        int[] iArr = this.stack;
        if (i15 == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i15 * 2);
        }
        int[] iArr2 = this.stack;
        int i16 = this.stackSize;
        this.stackSize = i16 + 1;
        iArr2[i16] = i14;
    }

    private void replaceTop(int i14) {
        this.stack[this.stackSize - 1] = i14;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void string(String str) throws IOException {
        String str2;
        String[] strArr = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.out.write(34);
        int length = str.length();
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i14 < i15) {
                        this.out.write(str, i14, i15 - i14);
                    }
                    this.out.write(str2);
                    i14 = i15 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i14 < i15) {
                    this.out.write(str, i14, i15 - i14);
                }
                this.out.write(str2);
                i14 = i15 + 1;
            }
        }
        if (i14 < length) {
            this.out.write(str, i14, length - i14);
        }
        this.out.write(34);
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    @CanIgnoreReturnValue
    public JsonWriter beginArray() {
        writeDeferredName();
        return openScope(1, '[');
    }

    @CanIgnoreReturnValue
    public JsonWriter beginObject() throws IOException {
        writeDeferredName();
        return openScope(3, CoreConstants.CURLY_LEFT);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
        int i14 = this.stackSize;
        if (i14 > 1 || (i14 == 1 && this.stack[i14 - 1] != 7)) {
            h.C("Incomplete document");
        } else {
            this.stackSize = 0;
        }
    }

    @CanIgnoreReturnValue
    public JsonWriter endArray() {
        return closeScope(1, 2, ']');
    }

    @CanIgnoreReturnValue
    public JsonWriter endObject() {
        return closeScope(3, 5, CoreConstants.CURLY_RIGHT);
    }

    public void flush() throws IOException {
        if (this.stackSize != 0) {
            this.out.flush();
        } else {
            h.z("JsonWriter is closed.");
        }
    }

    public final FormattingStyle getFormattingStyle() {
        return this.formattingStyle;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final Strictness getStrictness() {
        return this.strictness;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.strictness == Strictness.LENIENT;
    }

    @CanIgnoreReturnValue
    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.deferredName != null) {
            h.z("Already wrote a name, expecting a value.");
            return null;
        }
        int iPeek = peek();
        if (iPeek == 3 || iPeek == 5) {
            this.deferredName = str;
            return this;
        }
        h.z("Please begin an object before writing a name.");
        return null;
    }

    @CanIgnoreReturnValue
    public JsonWriter nullValue() {
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.out.write(BuildConfig.TRAVIS);
        return this;
    }

    public final void setFormattingStyle(FormattingStyle formattingStyle) {
        Objects.requireNonNull(formattingStyle);
        this.formattingStyle = formattingStyle;
        this.formattedComma = ",";
        if (formattingStyle.usesSpaceAfterSeparators()) {
            this.formattedColon = ": ";
            if (this.formattingStyle.getNewline().isEmpty()) {
                this.formattedComma = ", ";
            }
        } else {
            this.formattedColon = ":";
        }
        this.usesEmptyNewlineAndIndent = this.formattingStyle.getNewline().isEmpty() && this.formattingStyle.getIndent().isEmpty();
    }

    public final void setHtmlSafe(boolean z14) {
        this.htmlSafe = z14;
    }

    public final void setIndent(String str) {
        if (str.isEmpty()) {
            setFormattingStyle(FormattingStyle.COMPACT);
        } else {
            setFormattingStyle(FormattingStyle.PRETTY.withIndent(str));
        }
    }

    @Deprecated
    public final void setLenient(boolean z14) {
        setStrictness(z14 ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public final void setSerializeNulls(boolean z14) {
        this.serializeNulls = z14;
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.strictness = strictness;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!isTrustedNumberType(cls) && !VALID_JSON_NUMBER_PATTERN.matcher(string).matches()) {
                t.i("String created by ", cls, " is not a valid JSON number: ", string);
                return null;
            }
        } else if (this.strictness != Strictness.LENIENT) {
            h.s("Numeric values must be finite, but was ".concat(string));
            return null;
        }
        beforeValue();
        this.out.append((CharSequence) string);
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(boolean z14) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z14 ? BooleanUtils.TRUE : BooleanUtils.FALSE);
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? BooleanUtils.TRUE : BooleanUtils.FALSE);
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(float f14) throws IOException {
        writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Float.isNaN(f14) || Float.isInfinite(f14))) {
            l.d(f14, "Numeric values must be finite, but was ");
            return null;
        }
        beforeValue();
        this.out.append((CharSequence) Float.toString(f14));
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(double d14) {
        writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Double.isNaN(d14) || Double.isInfinite(d14))) {
            l.c(d14, "Numeric values must be finite, but was ");
            return null;
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d14));
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(long j8) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j8));
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }
}
