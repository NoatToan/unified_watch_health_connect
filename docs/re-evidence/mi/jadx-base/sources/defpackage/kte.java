package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public interface kte extends Closeable {
    String F();

    String X();

    InputStream Y() throws IOException;

    boolean isSuccessful();
}
