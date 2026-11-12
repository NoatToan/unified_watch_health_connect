package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface jl8 extends zm5 {
    int a(int i) throws IOException;

    boolean e(byte[] bArr, int i, int i2, boolean z) throws IOException;

    int g(byte[] bArr, int i, int i2) throws IOException;

    long getLength();

    long getPosition();

    void i(byte[] bArr, int i, int i2) throws IOException;

    boolean k(byte[] bArr, int i, int i2, boolean z) throws IOException;

    void l();

    long n();

    void o(int i) throws IOException;

    void p(int i) throws IOException;

    boolean q(int i, boolean z) throws IOException;

    @Override // defpackage.zm5
    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;
}
