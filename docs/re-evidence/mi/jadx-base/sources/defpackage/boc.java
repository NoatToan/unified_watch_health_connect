package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class boc {
    public static final Object e = new Object();
    public static boc f;
    public static int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4420b;
    public float c;
    public boc d;

    public static boc a() {
        synchronized (e) {
            try {
                boc bocVar = f;
                if (bocVar == null) {
                    return new boc();
                }
                f = bocVar.d;
                bocVar.d = null;
                g--;
                return bocVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (e) {
            try {
                int i = g;
                if (i < 10) {
                    this.d = f;
                    f = this;
                    g = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
