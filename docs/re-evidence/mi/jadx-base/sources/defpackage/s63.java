package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class s63 implements hj1<byte[]> {
    @Override // defpackage.hj1
    public int b() {
        return 1;
    }

    @Override // defpackage.hj1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // defpackage.hj1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i) {
        return new byte[i];
    }

    @Override // defpackage.hj1
    public String getTag() {
        return "ByteArrayPool";
    }
}
