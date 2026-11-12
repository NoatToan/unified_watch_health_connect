package dz2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldz2/e;", "Ldz2/a;", "<init>", "()V", "util-io_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteArrayOutputStream f61807b = new ByteArrayOutputStream();

    @Override // dz2.a
    public final void close() throws IOException {
        this.f61807b.close();
    }

    @Override // dz2.a
    public final long getSize() {
        return this.f61807b.size();
    }

    @Override // dz2.a
    public final void write(byte[] bArr) throws IOException {
        bArr.getClass();
        this.f61807b.write(bArr);
    }
}
