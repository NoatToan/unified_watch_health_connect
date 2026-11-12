package kotlin.io;

import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class a extends ByteArrayOutputStream {
    public a(int i) {
        super(i);
    }

    @NotNull
    public final byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
