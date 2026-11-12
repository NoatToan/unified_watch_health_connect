package com.fasterxml.jackson.core.format;

import com.huawei.operation.utils.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public interface InputAccessor {
    boolean hasMoreBytes() throws IOException;

    byte nextByte() throws IOException;

    void reset();

    public static class b implements InputAccessor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final int f4078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final InputStream f4079b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f4080c;
        protected int d;
        protected final byte[] e;

        public b(byte[] bArr, int i, int i2) {
            this.e = bArr;
            this.f4080c = i;
            this.f4078a = i;
            this.d = i + i2;
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public boolean hasMoreBytes() throws IOException {
            int i;
            int i2 = this.f4080c;
            if (i2 < this.d) {
                return true;
            }
            InputStream inputStream = this.f4079b;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.e;
            int length = bArr.length - i2;
            if (length < 1 || (i = inputStream.read(bArr, i2, length)) <= 0) {
                return false;
            }
            this.d += i;
            return true;
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public byte nextByte() throws IOException {
            if (this.f4080c >= this.d && !hasMoreBytes()) {
                throw new EOFException("Failed auto-detect: could not read more than " + this.f4080c + " bytes (max buffer size: " + this.e.length + Constants.RIGHT_BRACKET_ONLY);
            }
            byte[] bArr = this.e;
            int i = this.f4080c;
            this.f4080c = i + 1;
            return bArr[i];
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public void reset() {
            this.f4080c = this.f4078a;
        }
    }
}
