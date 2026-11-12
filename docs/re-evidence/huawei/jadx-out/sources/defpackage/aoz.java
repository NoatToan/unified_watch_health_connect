package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.io.ElementTypesAreNonnullByDefault;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
class aoz extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Appendable f643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f644b;

    aoz(Appendable appendable) {
        this.f643a = (Appendable) Preconditions.checkNotNull(appendable);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        d();
        this.f643a.append(new String(cArr, i, i2));
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        d();
        this.f643a.append((char) i);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        Preconditions.checkNotNull(str);
        d();
        this.f643a.append(str);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        Preconditions.checkNotNull(str);
        d();
        this.f643a.append(str, i, i2 + i);
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        d();
        Appendable appendable = this.f643a;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f644b = true;
        Appendable appendable = this.f643a;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) throws IOException {
        d();
        this.f643a.append(c2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@CheckForNull CharSequence charSequence) throws IOException {
        d();
        this.f643a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@CheckForNull CharSequence charSequence, int i, int i2) throws IOException {
        d();
        this.f643a.append(charSequence, i, i2);
        return this;
    }

    private void d() throws IOException {
        if (this.f644b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }
}
