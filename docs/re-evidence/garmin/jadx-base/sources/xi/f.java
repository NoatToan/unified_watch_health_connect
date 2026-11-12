package xi;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements a<byte[]> {
    @Override // xi.a
    public final int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // xi.a
    public final int b() {
        return 1;
    }

    @Override // xi.a
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // xi.a
    public final byte[] newArray(int i14) {
        return new byte[i14];
    }
}
