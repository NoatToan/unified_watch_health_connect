package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class lnq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40496b;
    private byte[] e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40497c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40495a = true;
    private boolean d = true;

    public boolean c() {
        return this.f40497c;
    }

    public void a(boolean z) {
        this.f40497c = z;
    }

    public int b() {
        return this.f40496b;
    }

    public void b(int i) {
        this.f40496b = i;
    }

    public byte[] d() {
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public void b(byte[] bArr) {
        this.e = bArr == null ? null : (byte[]) bArr.clone();
    }

    public boolean a() {
        return this.f40495a;
    }

    public void b(boolean z) {
        this.f40495a = z;
    }

    public boolean e() {
        return this.d;
    }

    public void d(boolean z) {
        this.d = z;
    }
}
