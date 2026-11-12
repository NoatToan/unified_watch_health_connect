package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class g2t extends ByteArrayOutputStream {
    public g2t(int i) {
        super(i);
    }

    public int a() {
        return ((ByteArrayOutputStream) this).count;
    }

    public byte[] b() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
