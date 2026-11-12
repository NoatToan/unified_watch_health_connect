package w63;

import java.io.RandomAccessFile;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw63/t;", "Lw63/j;", "", "readWrite", "Ljava/io/RandomAccessFile;", "randomAccessFile", "<init>", "(ZLjava/io/RandomAccessFile;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f183402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z14, RandomAccessFile randomAccessFile) {
        super(z14);
        randomAccessFile.getClass();
        this.f183402d = randomAccessFile;
    }

    @Override // w63.j
    public final synchronized void a() {
        this.f183402d.close();
    }

    @Override // w63.j
    public final synchronized int c(int i14, int i15, long j8, byte[] bArr) {
        this.f183402d.seek(j8);
        int i16 = 0;
        while (i16 < i15) {
            int i17 = this.f183402d.read(bArr, i14, i15 - i16);
            if (i17 == -1) {
                if (i16 != 0) {
                    break;
                }
                return -1;
            }
            i16 += i17;
        }
        return i16;
    }

    @Override // w63.j
    public final synchronized long e() {
        return this.f183402d.length();
    }
}
