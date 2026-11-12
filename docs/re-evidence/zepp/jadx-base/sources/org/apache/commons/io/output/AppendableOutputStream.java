package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.Appendable;

/* JADX INFO: loaded from: classes23.dex */
public class AppendableOutputStream<T extends Appendable> extends OutputStream {
    private final T a;

    public AppendableOutputStream(T t) {
        this.a = t;
    }

    public T getAppendable() {
        return this.a;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.a.append((char) i);
    }
}
