package kotlin.io;

import java.nio.charset.Charset;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@JvmName(name = "ConsoleKt")
public final class ConsoleKt {
    @InlineOnly
    private static final void a(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @InlineOnly
    private static final void b(char c) {
        System.out.print(c);
    }

    @InlineOnly
    private static final void c(double d) {
        System.out.print(d);
    }

    @InlineOnly
    private static final void d(float f) {
        System.out.print(f);
    }

    @InlineOnly
    private static final void e(int i) {
        System.out.print(i);
    }

    @InlineOnly
    private static final void f(long j) {
        System.out.print(j);
    }

    @InlineOnly
    private static final void g(Object obj) {
        System.out.print(obj);
    }

    @InlineOnly
    private static final void h(short s) {
        System.out.print(Short.valueOf(s));
    }

    @InlineOnly
    private static final void i(boolean z) {
        System.out.print(z);
    }

    @InlineOnly
    private static final void j(char[] cArr) {
        System.out.print(cArr);
    }

    @InlineOnly
    private static final void k() {
        System.out.println();
    }

    @InlineOnly
    private static final void l(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @InlineOnly
    private static final void m(char c) {
        System.out.println(c);
    }

    @InlineOnly
    private static final void n(double d) {
        System.out.println(d);
    }

    @InlineOnly
    private static final void o(float f) {
        System.out.println(f);
    }

    @InlineOnly
    private static final void p(int i) {
        System.out.println(i);
    }

    @InlineOnly
    private static final void q(long j) {
        System.out.println(j);
    }

    @InlineOnly
    private static final void r(Object obj) {
        System.out.println(obj);
    }

    @Nullable
    public static final String readLine() {
        return LineReader.INSTANCE.readLine(System.in, Charset.defaultCharset());
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
    private static final void s(short s) {
        System.out.println(Short.valueOf(s));
    }

    @InlineOnly
    private static final void t(boolean z) {
        System.out.println(z);
    }

    @InlineOnly
    private static final void u(char[] cArr) {
        System.out.println(cArr);
    }
}
