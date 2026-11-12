package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "ConsoleKt")
public final class ConsoleKt {
    @InlineOnly
    private static final void print(Object obj) {
        System.out.print(obj);
    }

    @InlineOnly
    private static final void println(Object obj) {
        System.out.println(obj);
    }

    @Nullable
    public static final String readLine() {
        LineReader lineReader = LineReader.INSTANCE;
        InputStream in = System.in;
        Intrinsics.checkNotNullExpressionValue(in, "in");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        return lineReader.readLine(in, charsetDefaultCharset);
    }

    @SinceKotlin(version = "1.6")
    @NotNull
    public static final String readln() {
        String str = readlnOrNull();
        if (str != null) {
            return str;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @SinceKotlin(version = "1.6")
    @Nullable
    public static final String readlnOrNull() {
        return readLine();
    }

    @InlineOnly
    private static final void print(int i) {
        System.out.print(i);
    }

    @InlineOnly
    private static final void println(int i) {
        System.out.println(i);
    }

    @InlineOnly
    private static final void print(long j) {
        System.out.print(j);
    }

    @InlineOnly
    private static final void println(long j) {
        System.out.println(j);
    }

    @InlineOnly
    private static final void print(byte b2) {
        System.out.print(Byte.valueOf(b2));
    }

    @InlineOnly
    private static final void println(byte b2) {
        System.out.println(Byte.valueOf(b2));
    }

    @InlineOnly
    private static final void print(short s) {
        System.out.print(Short.valueOf(s));
    }

    @InlineOnly
    private static final void println(short s) {
        System.out.println(Short.valueOf(s));
    }

    @InlineOnly
    private static final void print(char c) {
        System.out.print(c);
    }

    @InlineOnly
    private static final void println(char c) {
        System.out.println(c);
    }

    @InlineOnly
    private static final void print(boolean z) {
        System.out.print(z);
    }

    @InlineOnly
    private static final void println(boolean z) {
        System.out.println(z);
    }

    @InlineOnly
    private static final void print(float f) {
        System.out.print(f);
    }

    @InlineOnly
    private static final void println(float f) {
        System.out.println(f);
    }

    @InlineOnly
    private static final void print(double d) {
        System.out.print(d);
    }

    @InlineOnly
    private static final void println(double d) {
        System.out.println(d);
    }

    @InlineOnly
    private static final void print(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.print(message);
    }

    @InlineOnly
    private static final void println(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.println(message);
    }

    @InlineOnly
    private static final void println() {
        System.out.println();
    }
}
