package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class d83 implements kqk<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15205a;

    public d83(byte[] bArr) {
        this.f15205a = (byte[]) a6i.d(bArr);
    }

    @Override // defpackage.kqk
    public Class<byte[]> a() {
        return byte[].class;
    }

    @Override // defpackage.kqk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f15205a;
    }

    @Override // defpackage.kqk
    public int getSize() {
        return this.f15205a.length;
    }

    @Override // defpackage.kqk
    public void recycle() {
    }
}
