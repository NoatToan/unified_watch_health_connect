package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class drd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32227b;
    private String d;
    private byte[] e;

    public drd(byte[] bArr, String str, String str2) {
        if (bArr == null) {
            this.e = null;
        } else {
            this.e = (byte[]) bArr.clone();
        }
        this.d = str;
        this.f32227b = str2;
    }

    public byte[] c() {
        byte[] bArr = this.e;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public String b() {
        return this.f32227b;
    }

    public String a() {
        return this.d;
    }
}
