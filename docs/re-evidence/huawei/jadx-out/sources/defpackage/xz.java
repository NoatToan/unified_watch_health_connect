package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class xz extends DefaultPrettyPrinter.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xz f53316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53317c;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53318a;
    private final int d;
    private final char[] g;

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public boolean isInline() {
        return false;
    }

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        f53317c = property;
        f53316b = new xz("  ", property);
    }

    public xz() {
        this("  ", f53317c);
    }

    public xz(String str, String str2) {
        this.d = str.length();
        this.g = new char[str.length() * 16];
        int length = 0;
        for (int i = 0; i < 16; i++) {
            str.getChars(0, str.length(), this.g, length);
            length += str.length();
        }
        this.f53318a = str2;
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.writeRaw(this.f53318a);
        if (i <= 0) {
            return;
        }
        int length = i * this.d;
        while (true) {
            char[] cArr = this.g;
            if (length > cArr.length) {
                jsonGenerator.writeRaw(cArr, 0, cArr.length);
                length -= this.g.length;
            } else {
                jsonGenerator.writeRaw(cArr, 0, length);
                return;
            }
        }
    }
}
