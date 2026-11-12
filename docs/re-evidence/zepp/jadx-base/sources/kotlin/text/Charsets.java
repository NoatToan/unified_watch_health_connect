package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class Charsets {

    @Nullable
    private static Charset a;

    @Nullable
    private static Charset b;

    @Nullable
    private static Charset c;

    @NotNull
    public static final Charsets INSTANCE = new Charsets();

    @JvmField
    @NotNull
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    @JvmField
    @NotNull
    public static final Charset UTF_16 = Charset.forName("UTF-16");

    @JvmField
    @NotNull
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");

    @JvmField
    @NotNull
    public static final Charset UTF_16LE = Charset.forName("UTF-16LE");

    @JvmField
    @NotNull
    public static final Charset US_ASCII = Charset.forName("US-ASCII");

    @JvmField
    @NotNull
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    private Charsets() {
    }

    @JvmName(name = "UTF32")
    @NotNull
    public final Charset UTF32() {
        Charset charset = a;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        a = charsetForName;
        return charsetForName;
    }

    @JvmName(name = "UTF32_BE")
    @NotNull
    public final Charset UTF32_BE() {
        Charset charset = c;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        c = charsetForName;
        return charsetForName;
    }

    @JvmName(name = "UTF32_LE")
    @NotNull
    public final Charset UTF32_LE() {
        Charset charset = b;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        b = charsetForName;
        return charsetForName;
    }
}
