package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface rad {
    boolean a() throws IOException;

    byte nextByte() throws IOException;

    public static class a implements rad {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f32353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f32354b;
        public final int c;
        public int d;
        public int e;

        public a(InputStream inputStream, byte[] bArr) {
            this.f32353a = inputStream;
            this.f32354b = bArr;
            this.c = 0;
            this.e = 0;
            this.d = 0;
        }

        @Override // defpackage.rad
        public boolean a() throws IOException {
            int i;
            int i2 = this.e;
            if (i2 < this.d) {
                return true;
            }
            InputStream inputStream = this.f32353a;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.f32354b;
            int length = bArr.length - i2;
            if (length < 1 || (i = inputStream.read(bArr, i2, length)) <= 0) {
                return false;
            }
            this.d += i;
            return true;
        }

        public void b() {
            this.e = this.c;
        }

        @Override // defpackage.rad
        public byte nextByte() throws IOException {
            if (this.e < this.d || a()) {
                byte[] bArr = this.f32354b;
                int i = this.e;
                this.e = i + 1;
                return bArr[i];
            }
            throw new EOFException("Failed auto-detect: could not read more than " + this.e + " bytes (max buffer size: " + this.f32354b.length + ")");
        }

        public a(byte[] bArr, int i, int i2) {
            this.f32353a = null;
            this.f32354b = bArr;
            this.e = i;
            this.c = i;
            this.d = i + i2;
        }
    }
}
