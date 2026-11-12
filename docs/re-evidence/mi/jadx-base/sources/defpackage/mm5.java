package defpackage;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class mm5 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataOutput f26995a;

    public mm5(DataOutput dataOutput) {
        this.f26995a = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f26995a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f26995a.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f26995a.write(bArr, i, i2);
    }
}
