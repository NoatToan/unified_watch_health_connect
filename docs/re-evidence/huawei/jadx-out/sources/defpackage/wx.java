package defpackage;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class wx extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final DataOutput f52569a;

    public wx(DataOutput dataOutput) {
        this.f52569a = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f52569a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f52569a.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f52569a.write(bArr, i, i2);
    }
}
