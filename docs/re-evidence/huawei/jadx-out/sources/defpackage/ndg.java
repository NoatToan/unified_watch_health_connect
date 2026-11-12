package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class ndg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42930a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ndg f42931b;
    private static int d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f42932c;
    private int e;
    private ndg h;

    public byte[] c() {
        return (byte[]) lst.d(this.f42932c);
    }

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void e(int i) {
        this.e = i;
    }

    public void e(byte[] bArr) {
        this.f42932c = bArr;
    }

    public static ndg a() {
        synchronized (f42930a) {
            ndg ndgVar = f42931b;
            if (ndgVar != null) {
                f42931b = ndgVar.h;
                ndgVar.h = null;
                d--;
                return ndgVar;
            }
            return new ndg();
        }
    }

    public void b() {
        this.e = 0;
        this.f42932c = null;
        synchronized (f42930a) {
            int i = d;
            if (i < 4) {
                this.h = f42931b;
                f42931b = this;
                d = i + 1;
            }
        }
    }
}
