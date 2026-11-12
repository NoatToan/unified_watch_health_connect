package vt2;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class g extends n<Double> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f180198b;

    public g(byte[] bArr) {
        super(bArr[0]);
        this.f180198b = ByteBuffer.wrap(bArr, 1, bArr.length - 1).getDouble();
    }

    @Override // vt2.n
    public final int c() {
        return 9;
    }

    @Override // vt2.n
    public final byte[] d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(9);
        byteBufferAllocate.put(Ascii.SI);
        byteBufferAllocate.putDouble(this.f180198b);
        return byteBufferAllocate.array();
    }

    @Override // vt2.n
    public final Double e() {
        return Double.valueOf(this.f180198b);
    }

    public g(double d14) {
        super(Ascii.SI);
        this.f180198b = d14;
    }
}
