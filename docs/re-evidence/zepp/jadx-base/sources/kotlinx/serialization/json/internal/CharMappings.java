package kotlinx.serialization.json.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/json/internal/CharMappings;", "", "", "f", "e", "", "c", "", "esc", "b", "a", "", "cl", GoogleApiAvailabilityLight.a, "", "ESCAPE_2_CHAR", "[C", "", "CHAR_TO_TOKEN", "[B", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public final class CharMappings {

    @JvmField
    @NotNull
    public static final byte[] CHAR_TO_TOKEN;

    @JvmField
    @NotNull
    public static final char[] ESCAPE_2_CHAR;

    @NotNull
    public static final CharMappings INSTANCE;

    static {
        CharMappings charMappings = new CharMappings();
        INSTANCE = charMappings;
        ESCAPE_2_CHAR = new char[117];
        CHAR_TO_TOKEN = new byte[126];
        charMappings.f();
        charMappings.e();
    }

    private CharMappings() {
    }

    private final void a(char c, char esc) {
        b(c, esc);
    }

    private final void b(int c, char esc) {
        if (esc != 'u') {
            ESCAPE_2_CHAR[esc] = (char) c;
        }
    }

    private final void c(char c, byte cl) {
        d(c, cl);
    }

    private final void d(int c, byte cl) {
        CHAR_TO_TOKEN[c] = cl;
    }

    private final void e() {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            d(i, (byte) 127);
            if (i2 > 32) {
                d(9, (byte) 3);
                d(10, (byte) 3);
                d(13, (byte) 3);
                d(32, (byte) 3);
                c(',', (byte) 4);
                c(JsonLexerKt.COLON, (byte) 5);
                c('{', (byte) 6);
                c('}', (byte) 7);
                c(JsonLexerKt.BEGIN_LIST, (byte) 8);
                c(JsonLexerKt.END_LIST, (byte) 9);
                c('\"', (byte) 1);
                c('\\', (byte) 2);
                return;
            }
            i = i2;
        }
    }

    private final void f() {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            b(i, JsonLexerKt.UNICODE_ESC);
            if (i2 > 31) {
                b(8, 'b');
                b(9, 't');
                b(10, 'n');
                b(12, 'f');
                b(13, 'r');
                a('/', '/');
                a('\"', '\"');
                a('\\', '\\');
                return;
            }
            i = i2;
        }
    }
}
