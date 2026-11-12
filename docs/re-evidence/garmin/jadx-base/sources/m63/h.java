package m63;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm63/h;", "Lm63/n1;", "", "bufferWithData", "<init>", "([B)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends n1<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f116954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116955b;

    public h(byte[] bArr) {
        bArr.getClass();
        this.f116954a = bArr;
        this.f116955b = bArr.length;
        b(10);
    }

    @Override // m63.n1
    public final byte[] a() {
        return Arrays.copyOf(this.f116954a, this.f116955b);
    }

    @Override // m63.n1
    public final void b(int i14) {
        byte[] bArr = this.f116954a;
        if (bArr.length < i14) {
            int length = bArr.length * 2;
            if (i14 < length) {
                i14 = length;
            }
            this.f116954a = Arrays.copyOf(bArr, i14);
        }
    }

    @Override // m63.n1
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF116976b() {
        return this.f116955b;
    }
}
