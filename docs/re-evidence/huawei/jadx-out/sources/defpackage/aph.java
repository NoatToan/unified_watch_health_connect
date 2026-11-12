package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.io.CharSource;
import com.google.common.io.ElementTypesAreNonnullByDefault;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class aph extends Reader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private Reader f656c;
    private final Iterator<? extends CharSource> d;

    public aph(Iterator<? extends CharSource> it) throws IOException {
        this.d = it;
        e();
    }

    private void e() throws IOException {
        close();
        if (this.d.hasNext()) {
            this.f656c = this.d.next().openStream();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        Preconditions.checkNotNull(cArr);
        Reader reader = this.f656c;
        if (reader == null) {
            return -1;
        }
        int i3 = reader.read(cArr, i, i2);
        if (i3 != -1) {
            return i3;
        }
        e();
        return read(cArr, i, i2);
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        Preconditions.checkArgument(j >= 0, "n is negative");
        if (j > 0) {
            while (true) {
                Reader reader = this.f656c;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(j);
                if (jSkip > 0) {
                    return jSkip;
                }
                e();
            }
        }
        return 0L;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f656c;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f656c;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f656c = null;
            }
        }
    }
}
