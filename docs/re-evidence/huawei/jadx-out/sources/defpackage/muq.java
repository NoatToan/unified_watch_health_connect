package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class muq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42446a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f42447c = null;

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.f42446a))).intValue();
    }

    public void c(int i) {
        this.f42446a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public byte[] a() {
        byte[] bArr = this.f42447c;
        return bArr != null ? (byte[]) lst.d((byte[]) bArr.clone()) : bArr;
    }

    public void e(byte[] bArr) {
        if (bArr != null) {
            this.f42447c = (byte[]) lst.d((byte[]) bArr.clone());
        }
    }
}
