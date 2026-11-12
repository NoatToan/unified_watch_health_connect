package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.io.ElementTypesAreNonnullByDefault;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class apb extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    private CharSequence f646a;
    private int d;
    private int e;

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    public apb(CharSequence charSequence) {
        this.f646a = (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    private void e() throws IOException {
        if (this.f646a == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean d() {
        return b() > 0;
    }

    private int b() {
        Objects.requireNonNull(this.f646a);
        return this.f646a.length() - this.e;
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        synchronized (this) {
            Preconditions.checkNotNull(charBuffer);
            e();
            Objects.requireNonNull(this.f646a);
            if (!d()) {
                return -1;
            }
            int iMin = Math.min(charBuffer.remaining(), b());
            for (int i = 0; i < iMin; i++) {
                CharSequence charSequence = this.f646a;
                int i2 = this.e;
                this.e = i2 + 1;
                charBuffer.put(charSequence.charAt(i2));
            }
            return iMin;
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        int iCharAt;
        synchronized (this) {
            e();
            Objects.requireNonNull(this.f646a);
            if (d()) {
                CharSequence charSequence = this.f646a;
                int i = this.e;
                this.e = i + 1;
                iCharAt = charSequence.charAt(i);
            } else {
                iCharAt = -1;
            }
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        synchronized (this) {
            Preconditions.checkPositionIndexes(i, i + i2, cArr.length);
            e();
            Objects.requireNonNull(this.f646a);
            if (!d()) {
                return -1;
            }
            int iMin = Math.min(i2, b());
            for (int i3 = 0; i3 < iMin; i3++) {
                CharSequence charSequence = this.f646a;
                int i4 = this.e;
                this.e = i4 + 1;
                cArr[i + i3] = charSequence.charAt(i4);
            }
            return iMin;
        }
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        long j2;
        synchronized (this) {
            Preconditions.checkArgument(j >= 0, "n (%s) may not be negative", j);
            e();
            int iMin = (int) Math.min(b(), j);
            this.e += iMin;
            j2 = iMin;
        }
        return j2;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        synchronized (this) {
            e();
        }
        return true;
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        synchronized (this) {
            Preconditions.checkArgument(i >= 0, "readAheadLimit (%s) may not be negative", i);
            e();
            this.d = this.e;
        }
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        synchronized (this) {
            e();
            this.e = this.d;
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.f646a = null;
        }
    }
}
