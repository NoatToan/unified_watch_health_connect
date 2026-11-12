package defpackage;

import com.huawei.networkclient.ProgressListener;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes40.dex */
public class oex extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f44269a;
    private ProgressListener d;
    private InputStream e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f44271c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f44270b = 0;

    public oex(InputStream inputStream, long j, ProgressListener progressListener) {
        this.e = inputStream;
        this.d = progressListener;
        this.f44269a = j;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.e.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e.read(bArr, i, i2);
        long j = this.f44271c + (i3 != -1 ? i3 : 0L);
        this.f44271c = j;
        if (i3 == -1) {
            this.d.onProgress(j, this.f44269a, true);
            return i3;
        }
        long j2 = this.f44269a;
        if (j2 > 1048576 && j - this.f44270b < 1048576) {
            return i3;
        }
        this.d.onProgress(j, j2, false);
        this.f44270b = this.f44271c;
        return i3;
    }
}
