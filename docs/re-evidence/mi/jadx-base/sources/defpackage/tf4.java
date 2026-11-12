package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class tf4 {
    public static void a(Object obj) {
        Class<?> cls = obj.getClass();
        String strReplace = cls.getName().replace('.', '/');
        if (c(strReplace)) {
            return;
        }
        b(cls.getClassLoader().getResourceAsStream(strReplace + ".class"));
    }

    public static void b(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Bytecode not available, can't check class version");
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                dataInputStream.readInt();
                int unsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (unsignedShort != 65535) {
                    throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            throw new IllegalStateException("I/O error, can't check class version", e);
        }
    }

    public static boolean c(String str) {
        if (!str.startsWith("com/nimbusds/jose/shaded/ow2asm/")) {
            return false;
        }
        if (!str.contains("Test$")) {
            if (!Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", str)) {
                if (!Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?", str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
